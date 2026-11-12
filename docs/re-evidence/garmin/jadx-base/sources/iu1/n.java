package iu1;

import com.garmin.android.apps.connectmobile.courses.biz.gson.DoubleTypeAdapter;
import com.garmin.android.apps.connectmobile.util.gson.GCMEnumTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes10.dex */
public class n {
    private n() {
    }

    public static Gson a() {
        return new GsonBuilder().registerTypeAdapter(Double.class, new DoubleTypeAdapter()).registerTypeAdapterFactory(new GCMEnumTypeAdapterFactory()).setExclusionStrategies(new com.garmin.android.apps.connectmobile.util.gson.a()).create();
    }
}
