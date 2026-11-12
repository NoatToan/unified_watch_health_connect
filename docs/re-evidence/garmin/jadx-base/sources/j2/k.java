package j2;

import android.view.autofill.AutofillValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i4.r;
import i4.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p5.h0;
import p5.k0;
import p5.l;
import u1.f1;
import u1.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lj2/k;", "Lu1/y;", "Lr5/a;", RemoteConfigConstants.ResponseFieldKey.STATE, "La2/j;", "interactionSource", "Lu1/f1;", "indicationNodeFactory", "", "useLocalIndication", "enabled", "Lp5/l;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lr5/a;La2/j;Lu1/f1;ZZLp5/l;Le23/a;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends y {
    public static final /* synthetic */ int D = 0;
    public r5.a C;

    private k(r5.a aVar, a2.j jVar, f1 f1Var, boolean z14, boolean z15, l lVar, e23.a<Unit> aVar2) {
        super(jVar, f1Var, z14, z15, null, lVar, aVar2, null);
        this.C = aVar;
    }

    @Override // u1.b
    public final void X1(k0 k0Var) {
        h0.C(k0Var, this.C);
        r.f90875a.getClass();
        h0.m(k0Var, r.a.f90878c);
        int i14 = t.f90884a;
        h0.q(k0Var, new i4.h(AutofillValue.forToggle(this.C != r5.a.Indeterminate)));
        h0.j(k0Var, new h(k0Var, 1));
    }

    public /* synthetic */ k(r5.a aVar, a2.j jVar, f1 f1Var, boolean z14, boolean z15, l lVar, e23.a aVar2, p005kotlin.jvm.internal.j jVar2) {
        this(aVar, jVar, f1Var, z14, z15, lVar, aVar2);
    }
}
