package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/PointStatusAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/f$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PointStatusAdapter extends BaseStringTypeAdapter<f.b> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((f.b) obj).f2860a;
    }

    @Override // ce2.a
    public final Object b(String str) {
        f.b.f2859b.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode == -2014929842) {
            if (str.equals("MOVING")) {
                return new f.b.c();
            }
            return null;
        }
        if (iHashCode == 386623668) {
            if (str.equals("STATIONARY")) {
                return new f.b.d();
            }
            return null;
        }
        if (iHashCode == 935892539 && str.equals("DISCONNECTED")) {
            return new f.b.C0044b();
        }
        return null;
    }
}
