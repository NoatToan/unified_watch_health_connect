package com.garmin.android.apps.connectmobile.incidentdetection.model;

import ds.e0;
import org.joda.time.Period;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/PeriodAdapter;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/BaseStringTypeAdapter;", "Lorg/joda/time/Period;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PeriodAdapter extends BaseStringTypeAdapter<Period> {
    @Override // jq0.f
    public final String a(Object obj) {
        String string = ((Period) obj).toString();
        string.getClass();
        return string;
    }

    @Override // jq0.f
    public final Object b(String str) {
        try {
            return Period.parse(str);
        } catch (Exception e4) {
            e0.v("Error parsing Period: ", e4.getMessage(), this.f36860a);
            return null;
        }
    }
}
