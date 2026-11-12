package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class d52 implements b14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zw3 f15094b;
    public AtomicBoolean c = new AtomicBoolean(false);

    @Override // defpackage.b14
    public boolean d() {
        return this.c.get();
    }

    @Override // defpackage.b14
    public void g(Context context, zw3 zw3Var, String str) {
        this.f15093a = context;
        this.f15094b = zw3Var;
    }

    public void h(boolean z) {
        this.c.set(z);
    }
}
