package com.garmin.android.apps.connectmobile.incidentdetection.model;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/PublisherTypeAdapter;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/BaseStringTypeAdapter;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PublisherTypeAdapter extends BaseStringTypeAdapter<a> {
    @Override // jq0.f
    public final String a(Object obj) {
        return ((a) obj).f36865a;
    }

    @Override // jq0.f
    public final Object b(String str) {
        a.f36864b.getClass();
        if ("FITNESSAPP".equalsIgnoreCase(str)) {
            return new a.b();
        }
        if ("WEARABLE".equalsIgnoreCase(str)) {
            return new a.c();
        }
        return null;
    }
}
