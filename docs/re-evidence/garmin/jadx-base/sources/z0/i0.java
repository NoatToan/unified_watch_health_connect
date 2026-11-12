package z0;

import android.os.SystemClock;
import androidx.camera.core.impl.l2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends androidx.camera.core.impl.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f200650a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f200651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f200652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2.b f200653d;

    public i0(h0 h0Var, AtomicBoolean atomicBoolean, androidx.concurrent.futures.b.a aVar, l2.b bVar) {
        this.f200651b = atomicBoolean;
        this.f200652c = aVar;
        this.f200653d = bVar;
    }

    @Override // androidx.camera.core.impl.s
    public final void b(int i14, androidx.camera.core.impl.c0 c0Var) {
        Object obj;
        if (this.f200650a) {
            this.f200650a = false;
            c0Var.getTimestamp();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
        }
        AtomicBoolean atomicBoolean = this.f200651b;
        if (atomicBoolean.get() || (obj = c0Var.a().f5841a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        androidx.concurrent.futures.b.a aVar = this.f200652c;
        if (iIntValue == aVar.hashCode() && aVar.b(null) && !atomicBoolean.getAndSet(true)) {
            k0.b.d().execute(new vg1.d(26, this, this.f200653d));
        }
    }
}
