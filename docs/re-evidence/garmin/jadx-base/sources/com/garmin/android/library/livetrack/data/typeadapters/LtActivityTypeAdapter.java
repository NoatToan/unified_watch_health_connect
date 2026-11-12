package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/LtActivityTypeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/r;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LtActivityTypeAdapter extends BaseStringTypeAdapter<r> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((r) obj).f2990a;
    }

    @Override // ce2.a
    public final Object b(String str) {
        r.f2989b.getClass();
        return r.a.a(str);
    }
}
