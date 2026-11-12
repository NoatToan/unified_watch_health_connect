package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/PublisherTypeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/e0$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PublisherTypeAdapter extends BaseStringTypeAdapter<e0.a> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((e0.a) obj).f2837a;
    }

    @Override // ce2.a
    public final Object b(String str) {
        e0.a.f2836b.getClass();
        return e0.a.C0042a.a(str);
    }
}
