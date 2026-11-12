package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv1.t f66565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f66566c;

    public /* synthetic */ l1(jv1.t tVar, q1 q1Var, int i14) {
        this.f66564a = i14;
        this.f66565b = tVar;
        this.f66566c = q1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f66564a;
        q1 q1Var = this.f66566c;
        jv1.t tVar = this.f66565b;
        switch (i14) {
            case 0:
                q1.a aVar = q1.f66677f;
                String str = tVar.f101155h;
                if (str != null) {
                    q1Var.J6().s6().j(str);
                }
                String str2 = tVar.f101156i;
                if (str2 != null) {
                    aw1.h hVarJ6 = q1Var.J6();
                    androidx.fragment.app.m mVarRequireActivity = q1Var.requireActivity();
                    int i15 = aw1.h.S1;
                    hVarJ6.e5(str2, mVarRequireActivity, null);
                }
                break;
            case 1:
                q1.a aVar2 = q1.f66677f;
                String str3 = tVar.f101155h;
                if (str3 != null) {
                    q1Var.J6().s6().j(str3);
                }
                String str4 = tVar.f101156i;
                if (str4 != null) {
                    aw1.h hVarJ7 = q1Var.J6();
                    androidx.fragment.app.m mVarRequireActivity2 = q1Var.requireActivity();
                    int i16 = aw1.h.S1;
                    hVarJ7.e5(str4, mVarRequireActivity2, null);
                }
                break;
            default:
                q1.a aVar3 = q1.f66677f;
                String str5 = tVar.f101155h;
                if (str5 != null) {
                    q1Var.J6().s6().j(str5);
                }
                String str6 = tVar.f101156i;
                if (str6 != null) {
                    q1Var.J6().e5(str6, tVar.f101157j, q1Var.requireActivity());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
