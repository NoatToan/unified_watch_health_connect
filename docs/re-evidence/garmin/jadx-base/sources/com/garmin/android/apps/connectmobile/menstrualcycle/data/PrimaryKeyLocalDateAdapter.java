package com.garmin.android.apps.connectmobile.menstrualcycle.data;

import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/PrimaryKeyLocalDateAdapter;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/data/adapters/LocalDateAdapter;", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PrimaryKeyLocalDateAdapter extends LocalDateAdapter {
    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter, com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: c */
    public final LocalDate read2(JsonReader jsonReader) throws IOException {
        jsonReader.getClass();
        LocalDate localDate = super.read2(jsonReader);
        if (localDate != null) {
            return localDate;
        }
        throw new JsonParseException("Expected date but found null");
    }
}
