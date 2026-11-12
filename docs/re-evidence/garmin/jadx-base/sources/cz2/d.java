package cz2;

import android.os.SystemClock;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcz2/d;", "Lcz2/a;", "<init>", "()V", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class d implements a {
    @Override // cz2.a
    public final long millis() {
        return SystemClock.elapsedRealtime();
    }
}
