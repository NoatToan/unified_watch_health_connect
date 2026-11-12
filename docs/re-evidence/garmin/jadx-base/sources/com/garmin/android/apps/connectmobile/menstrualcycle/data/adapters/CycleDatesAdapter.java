package com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/adapters/CycleDatesAdapter;", "Lcom/google/gson/TypeAdapter;", "", "Lorg/joda/time/LocalDate;", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CycleDatesAdapter extends TypeAdapter<List<? extends List<? extends LocalDate>>> {
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public final List<? extends List<? extends LocalDate>> read2(JsonReader jsonReader) {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LocalDateListAdapter localDateListAdapter = new LocalDateListAdapter();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            List<? extends LocalDate> list = localDateListAdapter.read2(jsonReader);
            if (list != null) {
                arrayList.add(list);
            }
        }
        jsonReader.endArray();
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, List<? extends List<? extends LocalDate>> list) {
        List<? extends List<? extends LocalDate>> list2 = list;
        jsonWriter.getClass();
        if (list2 == null) {
            jsonWriter.nullValue();
            return;
        }
        LocalDateListAdapter localDateListAdapter = new LocalDateListAdapter();
        jsonWriter.beginArray();
        Iterator<? extends List<? extends LocalDate>> it = list2.iterator();
        while (it.hasNext()) {
            localDateListAdapter.write2(jsonWriter, (List<LocalDate>) it.next());
        }
        jsonWriter.endArray();
    }
}
