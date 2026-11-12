package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/LtEventTypeListAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringListTypeAdapter;", "Lae2/t;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LtEventTypeListAdapter extends BaseStringListTypeAdapter<t> {
    @Override // ce2.a
    public final String a(Object obj) {
        t tVar = (t) obj;
        tVar.getClass();
        return tVar.f2994a;
    }

    @Override // ce2.a
    public final Object b(String str) {
        t.f2993b.getClass();
        if ("BEGIN".equalsIgnoreCase(str)) {
            return new t.a();
        }
        if ("END".equalsIgnoreCase(str)) {
            return new t.c();
        }
        if ("PAUSE".equalsIgnoreCase(str)) {
            return new t.e();
        }
        if ("RESUME".equalsIgnoreCase(str)) {
            return new t.f();
        }
        if ("LAP".equalsIgnoreCase(str)) {
            return new t.d();
        }
        return null;
    }
}
