package com.laioffer.laiofferproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by effyfeng on 6/28/17.
 */

public class EventAdapter extends BaseAdapter {
        Context context;
        List<Event> eventData;

    public EventAdapter(Context context) {
            this.context = context;
            eventData = DataService.getEventData();
        }

        @Override
        public int getCount() {
            return eventData.size();
        }

        @Override
        public Event getItem(int position) {
            return eventData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.event_item, parent, false);
            }

            TextView eventTitle = (TextView) convertView.findViewById(
                    R.id.event_title);
            TextView eventAddress = (TextView) convertView.findViewById(
                    R.id.event_address);
            TextView eventType = (TextView) convertView.findViewById(
                    R.id.event_description);

            Event r = eventData.get(position);
            eventTitle.setText(r.getName());
            eventAddress.setText(r.getAddress());
            eventType.setText(r.getType());
            return convertView;
        }
}

