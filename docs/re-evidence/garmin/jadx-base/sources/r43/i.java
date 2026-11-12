package r43;

import java.util.Arrays;
import java.util.List;
import p005kotlin.jvm.internal.x0;
import p13.j0;
import p43.f2;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.t1;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f150354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i43.l f150355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f150356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<t1> f150357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f150358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f150359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f150360h;

    /* JADX WARN: Multi-variable type inference failed */
    public i(m1 m1Var, i43.l lVar, k kVar, List<? extends t1> list, boolean z14, String... strArr) {
        m1Var.getClass();
        lVar.getClass();
        kVar.getClass();
        list.getClass();
        strArr.getClass();
        this.f150354b = m1Var;
        this.f150355c = lVar;
        this.f150356d = kVar;
        this.f150357e = list;
        this.f150358f = z14;
        this.f150359g = strArr;
        x0 x0Var = x0.f105818a;
        String str = kVar.f150386a;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f150360h = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return this.f150357e;
    }

    @Override // p43.n0
    public final k1 E0() {
        k1.f135863b.getClass();
        return k1.f135864c;
    }

    @Override // p43.n0
    public final m1 F0() {
        return this.f150354b;
    }

    @Override // p43.n0
    public final boolean G0() {
        return this.f150358f;
    }

    @Override // p43.n0
    /* JADX INFO: renamed from: H0 */
    public final n0 K0(q43.f fVar) {
        fVar.getClass();
        return this;
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: K0 */
    public final f2 H0(q43.f fVar) {
        fVar.getClass();
        return this;
    }

    @Override // p43.v0, p43.f2
    public final f2 L0(k1 k1Var) {
        k1Var.getClass();
        return this;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        String[] strArr = this.f150359g;
        return new i(this.f150354b, this.f150355c, this.f150356d, this.f150357e, z14, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return this;
    }

    @Override // p43.n0
    public final i43.l i() {
        return this.f150355c;
    }

    public i(m1 m1Var, i43.l lVar, k kVar, List list, boolean z14, String[] strArr, int i14, p005kotlin.jvm.internal.j jVar) {
        this(m1Var, lVar, kVar, (i14 & 8) != 0 ? j0.f134944a : list, (i14 & 16) != 0 ? false : z14, strArr);
    }
}
