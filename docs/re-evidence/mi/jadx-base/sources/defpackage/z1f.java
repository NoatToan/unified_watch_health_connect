package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z1f implements jz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f40780a = new AtomicBoolean();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z1f.this.a();
        }
    }

    public abstract void a();

    @Override // defpackage.jz6
    public final void dispose() {
        if (this.f40780a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                ua1.c().c(new a());
            }
        }
    }

    @Override // defpackage.jz6
    public final boolean isDisposed() {
        return this.f40780a.get();
    }
}
