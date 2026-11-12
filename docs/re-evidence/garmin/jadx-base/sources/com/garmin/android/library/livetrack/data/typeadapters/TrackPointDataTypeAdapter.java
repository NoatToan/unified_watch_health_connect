package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.o0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/TrackPointDataTypeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/o0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrackPointDataTypeAdapter extends BaseStringTypeAdapter<o0> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((o0) obj).f2970a;
    }

    @Override // ce2.a
    public final Object b(String str) {
        o0.f2969b.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == 80) {
            if (str.equals("P")) {
                return new o0.c();
            }
            return null;
        }
        if (iHashCode == 2091) {
            if (str.equals("AL")) {
                return new o0.a();
            }
            return null;
        }
        if (iHashCode == 2680 && str.equals("TL")) {
            return new o0.d();
        }
        return null;
    }
}
