package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class va1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<va1> f36650b = new AtomicReference<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifl f36651a;

    public va1() {
        ifl iflVarB = i5l.a().b().b();
        if (iflVarB != null) {
            this.f36651a = iflVarB;
        } else {
            this.f36651a = new fse(Looper.getMainLooper());
        }
    }

    public static va1 a() {
        AtomicReference<va1> atomicReference;
        va1 va1Var;
        do {
            atomicReference = f36650b;
            va1 va1Var2 = atomicReference.get();
            if (va1Var2 != null) {
                return va1Var2;
            }
            va1Var = new va1();
        } while (!d8i.a(atomicReference, null, va1Var));
        return va1Var;
    }

    public static ifl b() {
        return a().f36651a;
    }
}
