package com.garmin.android.apps.connectmobile.courses.biz.gson;

import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class DoubleTypeAdapter extends TypeAdapter<Double> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final Double read2(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            Double dValueOf = Double.valueOf(jsonReader.nextString());
            if (dValueOf.doubleValue() == Double.POSITIVE_INFINITY || dValueOf.doubleValue() == Double.NEGATIVE_INFINITY) {
                return null;
            }
            return dValueOf;
        } catch (NumberFormatException e4) {
            i2.i("DoubleTypeAdapter", "NumberFormatException: " + e4.getMessage());
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Double d14) throws IOException {
        Double d15 = d14;
        if (d15 == null) {
            jsonWriter.nullValue();
        } else if (d15.isNaN() || d15.isInfinite()) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(d15);
        }
    }
}
