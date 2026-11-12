package com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/adapters/LocalDateListAdapter;", "Lcom/google/gson/TypeAdapter;", "", "Lorg/joda/time/LocalDate;", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocalDateListAdapter extends TypeAdapter<List<? extends LocalDate>> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public final List<? extends LocalDate> read2(JsonReader jsonReader) {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        LocalDateAdapter localDateAdapter = new LocalDateAdapter();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            LocalDate localDate = localDateAdapter.read2(jsonReader);
            if (localDate != null) {
                arrayList.add(localDate);
            }
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public final void write2(JsonWriter jsonWriter, List<LocalDate> list) {
        jsonWriter.getClass();
        if (list == null || list.isEmpty()) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        new LocalDateAdapter();
        for (LocalDate localDate : list) {
            if (localDate == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(localDate.toString("yyyy-MM-dd"));
            }
        }
        jsonWriter.endArray();
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, List<? extends LocalDate> list) {
        write2(jsonWriter, (List<LocalDate>) list);
    }
}
