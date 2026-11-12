package m10;

import am.c2;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.x1;
import fo1.h0;
import fo1.k0;
import fo1.l0;
import fo1.o0;
import fo1.s1;
import fw.p;
import o53.f0;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2201b f115761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f115762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f115763c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115764a;

        static {
            int[] iArr = new int[p.values().length];
            f115764a = iArr;
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115764a[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115764a[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: m10.b$b, reason: collision with other inner class name */
    public interface InterfaceC2201b {
        void E5(int i14, String str, long j8);

        void o(int i14);
    }

    public b(n0 n0Var, ViewModelStoreOwner viewModelStoreOwner, InterfaceC2201b interfaceC2201b) {
        this.f115763c = n0Var;
        this.f115761a = interfaceC2201b;
        this.f115762b = (o0) new x1(viewModelStoreOwner, new s1()).a(o0.class);
    }

    public final void a(String str, c2 c2Var) {
        o0 o0Var = this.f115762b;
        o0Var.getClass();
        c2Var.getClass();
        str.getClass();
        l0 l0Var = o0Var.f72654a;
        l0Var.getClass();
        dh.b.L(f0.N(new h0(l0Var, c2Var, str, null)), this.f115763c, new m10.a(this, str, 0));
    }

    public final void b(long j8, String str) {
        String strValueOf = String.valueOf(j8);
        o0 o0Var = this.f115762b;
        o0Var.getClass();
        str.getClass();
        strValueOf.getClass();
        l0 l0Var = o0Var.f72654a;
        l0Var.getClass();
        dh.b.L(f0.N(new k0(l0Var, str, strValueOf, null)), this.f115763c, new m10.a(this, str, 1));
    }

    public b(n0 n0Var, ViewModelStoreOwner viewModelStoreOwner) {
        this.f115763c = n0Var;
        this.f115762b = (o0) new x1(viewModelStoreOwner, new s1()).a(o0.class);
    }
}
