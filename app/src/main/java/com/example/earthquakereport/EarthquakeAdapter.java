package com.example.earthquakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Creates a new {@link EarthquakeAdapter}
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0,earthquakes);
    }

    /**
     * returns a list item view that displays information about earthquake at the given position
     * in the list of earthquake
     *
     * @param position the position in the list of data that should be displayed in the
     *  list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return the View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused,
        // otherwise if convertView is null than inflate a new list item view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        // Find the earthquake at the given position in the list of earthquake
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with the view ID magnitude
        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // Find the TextView with the view ID location
        TextView locationView = listItemView.findViewById(R.id.location);
        // Display the location of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getLocation());

        // Find the TextView with the view ID date
        TextView dateView = listItemView.findViewById(R.id.date);
        // Display the date of the current earthquake in that TextView
        dateView.setText(currentEarthquake.getDate());

        // Return the list item view that is not showing the appropriate data
        return listItemView;
    }
}
