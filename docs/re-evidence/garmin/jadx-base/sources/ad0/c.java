package ad0;

import b.u;
import lc.m0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f2726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f2727c;

    public /* synthetic */ c(m0 m0Var, u uVar, int i14) {
        this.f2725a = i14;
        this.f2726b = m0Var;
        this.f2727c = uVar;
    }

    @Override // e23.a
    public final Object invoke() {
        u uVar;
        u uVar2;
        u uVar3;
        switch (this.f2725a) {
            case 0:
                m0 m0Var = this.f2726b;
                if (m0Var.f() != null) {
                    m0Var.n();
                } else {
                    this.f2727c.d();
                }
                break;
            case 1:
                if (!this.f2726b.m() && (uVar = this.f2727c) != null) {
                    uVar.d();
                }
                break;
            case 2:
                if (!this.f2726b.m() && (uVar2 = this.f2727c) != null) {
                    uVar2.d();
                }
                break;
            default:
                if (!this.f2726b.m() && (uVar3 = this.f2727c) != null) {
                    uVar3.d();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
