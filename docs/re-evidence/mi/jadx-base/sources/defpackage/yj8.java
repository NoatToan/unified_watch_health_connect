package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class yj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40236a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf3 f40237b;

    @GuardedBy("mLock")
    public int c;

    public yj8(vf3 vf3Var, int i) {
        this.f40237b = vf3Var;
        this.c = i;
    }

    public int a() {
        int i;
        synchronized (this.f40236a) {
            i = this.c;
        }
        return i;
    }

    public void b(int i) {
        synchronized (this.f40236a) {
            this.c = i;
        }
    }
}
