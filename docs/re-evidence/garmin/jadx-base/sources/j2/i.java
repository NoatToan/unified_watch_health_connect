package j2;

import android.view.autofill.AutofillValue;
import e23.l;
import i3.f2;
import i4.r;
import i4.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import u1.f1;
import u1.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lj2/i;", "Lu1/y;", "", "value", "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "useLocalIndication", "enabled", "Lp5/l;", "role", "Lkotlin/Function1;", "", "onValueChange", "<init>", "(ZLa2/j;Lu1/f1;ZZLp5/l;Le23/l;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends y {
    public static final /* synthetic */ int F = 0;
    public boolean C;
    public l<? super Boolean, Unit> D;
    public final f2 E;

    private i(boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, p5.l lVar, l<? super Boolean, Unit> lVar2) {
        super(jVar, f1Var, z15, z16, null, lVar, new ad0.e(lVar2, z14, 8), null);
        this.C = z14;
        this.D = lVar2;
        this.E = new f2(this, 15);
    }

    @Override // u1.b
    public final void X1(k0 k0Var) {
        h0.C(k0Var, this.C ? r5.a.On : r5.a.Off);
        r.f90875a.getClass();
        h0.m(k0Var, r.a.f90878c);
        int i14 = t.f90884a;
        h0.q(k0Var, new i4.h(AutofillValue.forToggle(this.C)));
        h0.j(k0Var, new h(k0Var, 0));
    }

    public /* synthetic */ i(boolean z14, a2.j jVar, f1 f1Var, boolean z15, boolean z16, p5.l lVar, l lVar2, p005kotlin.jvm.internal.j jVar2) {
        this(z14, jVar, f1Var, z15, z16, lVar, lVar2);
    }
}
