package com.bjtu.redis;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Counter {
    private String counterName;
    private String counterIndex;
    private String type;
    private String keyFields;
    private int valueFields;
//    private String FREQ;

    public Counter(String string) throws JSONException {
        JSONObject object = new JSONObject(string);
        JSONArray array = object.getJSONArray("Counter");
        JSONObject obj = array.getJSONObject(0);
        counterName = obj.getString("counterName");
        counterIndex = obj.getString("counterIndex");
        type = obj.getString("type");
        keyFields = obj.getString("keyFields");
        valueFields = obj.getInt("valueFields");
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counterName='" + counterName + '\'' +
                "counterIndex='" + counterIndex + '\'' +
                ", type='" + type + '\'' +
                ", keyFields='" + keyFields + '\'' +
                ", valueFields=" + valueFields + '\'' +
//                ", FREQ='" + FREQ + '\'' +
                '}';
    }
}