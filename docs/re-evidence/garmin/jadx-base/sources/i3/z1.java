package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class z1 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xb f90509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f90510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f90511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f90513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f90517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c2.h2 f90518j;

    /* JADX WARN: Multi-variable type inference failed */
    public z1(xb xbVar, boolean z14, boolean z15, e23.p<? super p3.m, ? super Integer, Unit> pVar, s5.x0 x0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar4, float f14, c2.h2 h2Var) {
        this.f90509a = xbVar;
        this.f90510b = z14;
        this.f90511c = z15;
        this.f90512d = pVar;
        this.f90513e = x0Var;
        this.f90514f = pVar2;
        this.f90515g = pVar3;
        this.f90516h = pVar4;
        this.f90517i = f14;
        this.f90518j = h2Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        long j8;
        long j14;
        long j15;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            xb xbVar = this.f90509a;
            boolean z14 = this.f90510b;
            boolean z15 = this.f90511c;
            if (z14) {
                j8 = !z15 ? xbVar.f90307b : xbVar.f90316k;
            } else {
                j8 = xbVar.f90311f;
            }
            if (z14) {
                j14 = !z15 ? xbVar.f90308c : xbVar.f90317l;
            } else {
                j14 = xbVar.f90312g;
            }
            long j16 = j14;
            if (z14) {
                j15 = !z15 ? xbVar.f90309d : xbVar.f90318m;
            } else {
                j15 = xbVar.f90313h;
            }
            y1.a(this.f90512d, this.f90513e, j8, this.f90514f, this.f90515g, this.f90516h, j16, j15, this.f90517i, this.f90518j, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
