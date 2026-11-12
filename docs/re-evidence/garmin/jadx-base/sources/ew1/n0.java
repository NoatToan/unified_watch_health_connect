package ew1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f66621b;

    public /* synthetic */ n0(q0 q0Var, int i14) {
        this.f66620a = i14;
        this.f66621b = q0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66620a;
        q0 q0Var = this.f66621b;
        switch (i14) {
            case 0:
                q0.a aVar = q0.f66666g;
                Context contextRequireContext = q0Var.requireContext();
                contextRequireContext.getClass();
                return new l22.a(contextRequireContext);
            case 1:
                q0.a aVar2 = q0.f66666g;
                return q0Var.w6().D5();
            default:
                q0.a aVar3 = q0.f66666g;
                q0Var.f66670e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
