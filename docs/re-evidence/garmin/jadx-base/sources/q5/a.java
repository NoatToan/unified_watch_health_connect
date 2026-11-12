package q5;

import android.os.Handler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq5/a;", "Lq5/b;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f142824a = new a();

    private a() {
    }

    @Override // q5.b
    public final void g(Object obj) {
        Handler handler = h4.b.f81521a;
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        h4.b.f81521a.removeCallbacks((Runnable) obj);
    }

    @Override // q5.b
    public final Object x(long j8, e.a aVar) {
        com.garmin.android.music.c cVar = new com.garmin.android.music.c(aVar, 1);
        h4.b.f81521a.postDelayed(cVar, j8);
        return cVar;
    }
}
