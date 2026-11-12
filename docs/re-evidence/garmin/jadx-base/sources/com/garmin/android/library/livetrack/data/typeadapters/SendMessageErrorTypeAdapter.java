package com.garmin.android.library.livetrack.data.typeadapters;

import ae2.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/livetrack/data/typeadapters/SendMessageErrorTypeAdapter;", "Lcom/garmin/android/library/livetrack/data/typeadapters/BaseStringTypeAdapter;", "Lae2/g0;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SendMessageErrorTypeAdapter extends BaseStringTypeAdapter<g0> {
    @Override // ce2.a
    public final String a(Object obj) {
        return ((g0) obj).f2877a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ce2.a
    public final Object b(String str) {
        g0.f2876b.getClass();
        switch (str.hashCode()) {
            case -1894374712:
                if (str.equals("RECIPIENT_SESSION_INVALID")) {
                    return new g0.c();
                }
                break;
            case -991447292:
                if (str.equals("SENDER_SESSION_INVALID")) {
                    return new g0.e();
                }
                break;
            case 996373255:
                if (str.equals("SENDER_SESSION_ENDED")) {
                    return new g0.d();
                }
                break;
            case 1929510859:
                if (str.equals("RECIPIENT_SESSION_ENDED")) {
                    return new g0.b();
                }
                break;
        }
        return new g0.f();
    }
}
