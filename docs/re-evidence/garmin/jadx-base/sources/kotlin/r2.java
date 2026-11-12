package kotlin;

import androidx.lifecycle.u1;
import b4.d;
import p1.i0;
import p1.o;
import p1.q0;
import p3.e;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Li5/r2;", "Landroidx/lifecycle/u1;", "<init>", "()V", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r2 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0<q0<b>> f91425a = o.a();

    public interface a {
        e a(s2 s2Var);
    }

    @p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/r2$b;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q2 f91426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q2 f91427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f91428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e f91429d;

        public b() {
            q2 q2Var = new q2(null, 1, null);
            this.f91426a = q2Var;
            this.f91427b = q2Var;
        }
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        i0<q0<b>> i0Var = this.f91425a;
        int[] iArr = i0Var.f134773b;
        Object[] objArr = i0Var.f134774c;
        long[] jArr = i0Var.f134772a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j8) < 128) {
                        int i18 = (i14 << 3) + i17;
                        int i19 = iArr[i18];
                        q0 q0Var = (q0) objArr[i18];
                        Object[] objArr2 = q0Var.f134667a;
                        int i24 = q0Var.f134668b;
                        int i25 = 0;
                        while (i25 < i24) {
                            b bVar = (b) objArr2[i25];
                            int i26 = i15;
                            e eVar = bVar.f91429d;
                            if (eVar != null) {
                                eVar.cancel();
                            }
                            bVar.f91429d = null;
                            d dVar = bVar.f91426a.f91399a;
                            dVar.f15692b = true;
                            dVar.f15691a = false;
                            dVar.a();
                            i25++;
                            i15 = i26;
                        }
                    }
                    int i27 = i15;
                    j8 >>= i27;
                    i17++;
                    i15 = i27;
                }
                if (i16 != i15) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }
}
