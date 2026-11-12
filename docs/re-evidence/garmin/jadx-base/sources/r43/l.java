package r43;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p13.a1;
import p13.j0;
import p43.m1;
import t23.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f150388a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f150389b = e.f150340a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f150390c = new a(x33.f.g(String.format(b.ERROR_CLASS.f150337a, Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f150391d = c(k.f150369h, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f150392e = c(k.f150382w, new String[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<r0> f150393f = a1.b(new f());

    private l() {
    }

    public static final g a(h hVar, boolean z14, String... strArr) {
        hVar.getClass();
        return z14 ? new m(hVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final g b(h hVar, String... strArr) {
        hVar.getClass();
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kVar, String... strArr) {
        kVar.getClass();
        j0 j0Var = j0.f134944a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        f150388a.getClass();
        j0Var.getClass();
        return e(kVar, j0Var, d(kVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static j d(k kVar, String... strArr) {
        kVar.getClass();
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static i e(k kVar, List list, m1 m1Var, String... strArr) {
        kVar.getClass();
        list.getClass();
        return new i(m1Var, b(h.ERROR_TYPE_SCOPE, m1Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(t23.l lVar) {
        if (lVar == null) {
            return false;
        }
        f150388a.getClass();
        return (lVar instanceof a) || (lVar.d() instanceof a) || lVar == f150389b;
    }
}
