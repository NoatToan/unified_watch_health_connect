package com.huawei.profile.utils;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.huawei.profile.utils.logger.DsLog;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class ProfileTypeAdapter extends TypeAdapter<Object> {
    private static final String DOT = ".";
    private static final String TAG = "ProfileTypeAdapter";
    private final Gson gson;

    ProfileTypeAdapter(Gson gson) {
        this.gson = gson;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public Object read2(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(read2(jsonReader));
            }
            jsonReader.endArray();
            return arrayList;
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                linkedTreeMap.put(jsonReader.nextName(), read2(jsonReader));
            }
            jsonReader.endObject();
            return linkedTreeMap;
        }
        if (jsonTokenPeek == JsonToken.STRING) {
            return jsonReader.nextString();
        }
        if (jsonTokenPeek == JsonToken.NUMBER) {
            String strNextString = jsonReader.nextString();
            if (strNextString.contains(".")) {
                Double d = NumberUtil.parseDouble(strNextString);
                if (d != null) {
                    return d;
                }
                DsLog.et(TAG, "cant get double from string,error: NumberFormatException", new Object[0]);
                return null;
            }
            Long l = NumberUtil.parseLong(strNextString);
            if (l == null) {
                DsLog.et(TAG, "cant get long from string,error: NumberFormatException", new Object[0]);
                return null;
            }
            long jLongValue = l.longValue();
            return (jLongValue < -2147483648L || jLongValue > 2147483647L) ? l : Integer.valueOf((int) jLongValue);
        }
        if (jsonTokenPeek == JsonToken.BOOLEAN) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Class cls = (Class) ClassUtil.cast(obj.getClass());
        if (cls != null) {
            TypeAdapter adapter = this.gson.getAdapter(cls);
            if (adapter instanceof ProfileTypeAdapter) {
                jsonWriter.beginObject();
                jsonWriter.endObject();
                return;
            } else {
                adapter.write(jsonWriter, obj);
                return;
            }
        }
        DsLog.et(TAG, "the clazz is null", new Object[0]);
    }
}
