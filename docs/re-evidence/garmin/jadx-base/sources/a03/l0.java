package a03;

import ch.qos.logback.core.CoreConstants;
import f5.a1;
import f5.b1;
import f5.m1;
import f5.v1;
import f5.y0;
import kotlin.m2;
import kotlin.n2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"La03/l0;", "Lf5/o0;", "Lf5/m1;", "Li5/n2;", "Lkotlin/Function1;", "Lg6/c;", "", "onDensityChanged", "Lg6/m;", "onSizeChanged", "Li5/m2;", "inspectorInfo", "<init>", "(Le23/l;Le23/l;Le23/l;)V", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l0 extends n2 implements f5.o0, m1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f122f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<g6.c, Unit> f123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<g6.m, Unit> f124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(e23.l<? super g6.c, Unit> lVar, e23.l<? super g6.m, Unit> lVar2, e23.l<? super m2, Unit> lVar3) {
        super(lVar3);
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        this.f123b = lVar;
        this.f124c = lVar2;
        this.f125d = -1.0f;
        this.f126e = -1.0f;
    }

    @Override // f5.m1
    public final void e(long j8) {
        this.f124c.invoke(g6.m.a(j8));
    }

    @Override // f5.o0
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final a1 mo0measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        y0Var.getClass();
        if (b1Var.getF75991a() != this.f125d || b1Var.getF75992b() != this.f126e) {
            this.f123b.invoke(new g6.d(b1Var.getF75991a(), b1Var.getF75992b()));
            this.f125d = b1Var.getF75991a();
            this.f126e = b1Var.getF75992b();
        }
        v1 v1VarQ = y0Var.Q(j8);
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new k0(v1VarQ, 0));
    }

    public final String toString() {
        return "SwipeAnchorsModifierImpl(updateDensity=" + this.f123b + ", onSizeChanged=" + this.f124c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
