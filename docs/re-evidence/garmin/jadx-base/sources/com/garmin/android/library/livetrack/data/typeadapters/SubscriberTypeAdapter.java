package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.n0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/SubscriberTypeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/n0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SubscriberTypeAdapter extends BaseStringTypeAdapter<n0.a> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((n0.a) obj).f2941a;
    }

    @Override // ce2.a
    public final Object b(String str) {
        n0.a.f2940b.getClass();
        if ("ANONYMOUS".equalsIgnoreCase(str)) {
            return n0.a.C0045a.f2942c;
        }
        if ("EMAIL".equalsIgnoreCase(str)) {
            return n0.a.d.f2944c;
        }
        if ("STRAVA".equalsIgnoreCase(str)) {
            return n0.a.f.f2946c;
        }
        if ("CONNECTION".equalsIgnoreCase(str)) {
            return n0.a.c.f2943c;
        }
        if ("SMS_SUBSCRIBER".equalsIgnoreCase(str)) {
            return n0.a.e.f2945c;
        }
        if ("SUBSCRIPTION_SUBSCRIBER".equalsIgnoreCase(str)) {
            return n0.a.g.f2947c;
        }
        return null;
    }
}
