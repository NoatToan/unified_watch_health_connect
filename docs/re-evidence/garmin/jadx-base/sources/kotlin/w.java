package kotlin;

import e23.a;
import h5.e0;
import l7.f;
import p1.h0;
import p5.a0;
import p5.n;
import p5.y;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class w extends p005kotlin.jvm.internal.w implements a<p005kotlin.Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i3 f91608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f91609b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i3 i3Var, u uVar) {
        super(0);
        this.f91608a = i3Var;
        this.f91609b = uVar;
    }

    @Override // e23.a
    public final p005kotlin.Unit invoke() {
        y yVar;
        e0 e0Var;
        i3 i3Var = this.f91608a;
        n nVar = i3Var.f91212e;
        n nVar2 = i3Var.f91213f;
        Float f14 = i3Var.f91210c;
        Float f15 = i3Var.f91211d;
        float fFloatValue = (nVar == null || f14 == null) ? 0.0f : nVar.f136046a.invoke().floatValue() - f14.floatValue();
        float fFloatValue2 = (nVar2 == null || f15 == null) ? 0.0f : nVar2.f136046a.invoke().floatValue() - f15.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int i14 = i3Var.f91208a;
            h0 h0Var = u.H0;
            u uVar = this.f91609b;
            int iR = uVar.r(i14);
            a0 a0VarB = uVar.i().b(uVar.f91550i);
            if (a0VarB != null) {
                try {
                    f fVar = uVar.f91552k;
                    if (fVar != null) {
                        fVar.f110563a.setBoundsInScreen(uVar.b(a0VarB));
                        p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                    }
                } catch (IllegalStateException unused) {
                    p005kotlin.Unit unit2 = p005kotlin.Unit.INSTANCE;
                }
            }
            a0 a0VarB2 = uVar.i().b(uVar.f91551j);
            if (a0VarB2 != null) {
                try {
                    f fVar2 = uVar.f91554l;
                    if (fVar2 != null) {
                        fVar2.f110563a.setBoundsInScreen(uVar.b(a0VarB2));
                        p005kotlin.Unit unit3 = p005kotlin.Unit.INSTANCE;
                    }
                } catch (IllegalStateException unused2) {
                    p005kotlin.Unit unit4 = p005kotlin.Unit.INSTANCE;
                }
            }
            uVar.f91542a.invalidate();
            a0 a0VarB3 = uVar.i().b(iR);
            if (a0VarB3 != null && (yVar = a0VarB3.f135947a) != null && (e0Var = yVar.f136097c) != null) {
                if (nVar != null) {
                    uVar.f91556n.i(iR, nVar);
                }
                if (nVar2 != null) {
                    uVar.f91557o.i(iR, nVar2);
                }
                uVar.n(e0Var);
            }
        }
        if (nVar != null) {
            i3Var.f91210c = nVar.f136046a.invoke();
        }
        if (nVar2 != null) {
            i3Var.f91211d = nVar2.f136046a.invoke();
        }
        return p005kotlin.Unit.INSTANCE;
    }
}
