package ew1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1 f66383b;

    public /* synthetic */ d1(e1 e1Var, int i14) {
        this.f66382a = i14;
        this.f66383b = e1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66382a;
        e1 e1Var = this.f66383b;
        switch (i14) {
            case 0:
                e1.a aVar = e1.f66409d;
                Context contextRequireContext = e1Var.requireContext();
                contextRequireContext.getClass();
                return new l22.a(contextRequireContext);
            default:
                e1.a aVar2 = e1.f66409d;
                e1Var.getParentFragmentManager().Z();
                return Unit.INSTANCE;
        }
    }
}
