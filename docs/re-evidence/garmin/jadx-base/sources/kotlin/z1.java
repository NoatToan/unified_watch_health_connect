package kotlin;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import f4.q;
import java.io.Serializable;
import o13.h;
import p3.a4;
import p3.p3;
import p3.t1;
import p3.x2;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<? extends Object>[] f91668a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r0 == r2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            p3 p3VarB = qVar.b();
            t1 t1Var = t1.f135313a;
            t1Var.getClass();
            if (p3VarB != t1Var) {
                p3 p3VarB2 = qVar.b();
                a4 a4Var = a4.f135041a;
                a4Var.getClass();
                if (p3VarB2 != a4Var) {
                    p3 p3VarB3 = qVar.b();
                    x2 x2Var = x2.f135386a;
                    x2Var.getClass();
                }
            }
            T f182175a = qVar.getF182175a();
            if (f182175a == 0) {
                return true;
            }
            return a(f182175a);
        }
        if ((obj instanceof h) && (obj instanceof Serializable)) {
            return false;
        }
        for (int i14 = 0; i14 < 7; i14++) {
            if (f91668a[i14].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
