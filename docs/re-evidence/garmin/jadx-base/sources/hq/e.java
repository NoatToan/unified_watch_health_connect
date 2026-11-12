package hq;

import androidx.lifecycle.u1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xd1.b f85003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xd1.b f85004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.y0<xd1.b> f85005c = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y0<Integer> f85006d = new androidx.lifecycle.y0<>(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.y0<xd1.e> f85007e = new androidx.lifecycle.y0<>(xd1.e.GROUP_BY_EXERCISE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.y0<o13.p<List<String>, List<String>>> f85008f = new androidx.lifecycle.y0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.y0<Integer> f85009g = new androidx.lifecycle.y0<>(-1);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85010a;

        static {
            int[] iArr = new int[xd1.e.values().length];
            try {
                iArr[xd1.e.GROUP_BY_EXERCISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xd1.e.GROUP_BY_PRIMARY_MUSCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85010a = iArr;
        }
    }

    public final void x4(int i14) {
        xd1.e eVar;
        xd1.b bVar;
        if (i14 != 0) {
            eVar = i14 != 1 ? null : xd1.e.GROUP_BY_PRIMARY_MUSCLE;
        } else {
            eVar = xd1.e.GROUP_BY_EXERCISE;
        }
        if (eVar != null) {
            this.f85006d.m(Integer.valueOf(i14));
            this.f85007e.m(eVar);
            int i15 = a.f85010a[eVar.ordinal()];
            if (i15 == 1) {
                bVar = this.f85003a;
            } else {
                if (i15 != 2) {
                    lc.u0.r();
                    return;
                }
                bVar = this.f85004b;
            }
            if (bVar != null) {
                this.f85005c.m(bVar);
                y4(-1);
            }
        }
    }

    public final void y4(int i14) {
        Object obj;
        Object obj2;
        List<xd1.d> list;
        Object obj3;
        androidx.lifecycle.y0<Integer> y0Var = this.f85009g;
        Integer numD = y0Var.d();
        androidx.lifecycle.y0<xd1.b> y0Var2 = this.f85005c;
        if ((numD != null && numD.intValue() == i14) || i14 == -1) {
            xd1.b bVarD = y0Var2.d();
            if (bVarD == null || (obj3 = bVarD.f190010c) == null) {
                obj3 = p13.j0.f134944a;
            }
            xd1.b bVarD2 = y0Var2.d();
            if (bVarD2 == null || (obj2 = bVarD2.f190011d) == null) {
                obj2 = p13.j0.f134944a;
            }
            obj = obj3;
            i14 = -1;
        } else {
            xd1.b bVarD3 = y0Var2.d();
            xd1.d dVar = (bVarD3 == null || (list = bVarD3.f190009b) == null) ? null : (xd1.d) p13.h0.e0(i14, list);
            if (dVar == null || (obj = dVar.f190025h) == null) {
                obj = p13.j0.f134944a;
            }
            if (dVar == null || (obj2 = dVar.f190026i) == null) {
                obj2 = p13.j0.f134944a;
            }
        }
        y0Var.m(Integer.valueOf(i14));
        this.f85008f.m(new o13.p<>(obj, obj2));
    }
}
