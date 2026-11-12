package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.p0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/TrackPointFixTypeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/p0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrackPointFixTypeAdapter extends BaseStringTypeAdapter<p0> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((p0) obj).f2978a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ce2.a
    public final Object b(String str) {
        p0.f2977b.getClass();
        switch (str.hashCode()) {
            case -1986035593:
                if (str.equals("NO_FIX")) {
                    return new p0.f();
                }
                return null;
            case -806678009:
                if (str.equals("SIMULATION")) {
                    return new p0.g();
                }
                return null;
            case 70794:
                if (str.equals("GPS")) {
                    return new p0.d();
                }
                return null;
            case 293432739:
                if (str.equals("NAV_QUALITY")) {
                    return new p0.e();
                }
                return null;
            case 398377420:
                if (str.equals("CELL_TOWER")) {
                    return new p0.a();
                }
                return null;
            case 1252864621:
                if (str.equals("DEAD_RECKONING")) {
                    return new p0.c();
                }
                return null;
            default:
                return null;
        }
    }
}
