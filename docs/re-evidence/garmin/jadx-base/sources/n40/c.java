package n40;

import p005kotlin.Unit;
import p13.h0;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123567a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f123569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1 f123570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f123571e;

    public /* synthetic */ c(int i14, e23.l lVar, n1 n1Var, p1 p1Var) {
        this.f123568b = i14;
        this.f123569c = lVar;
        this.f123570d = n1Var;
        this.f123571e = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f123567a) {
            case 0:
                n1 n1Var = this.f123570d;
                int intValue = n1Var.getIntValue();
                int i14 = this.f123568b;
                if (intValue != i14) {
                    n1Var.t(i14);
                    com.garmin.android.apps.connectmobile.courses.model.c cVar = (com.garmin.android.apps.connectmobile.courses.model.c) h0.e0(i14, com.garmin.android.apps.connectmobile.courses.model.c.f32836h);
                    if (cVar != null) {
                        this.f123569c.invoke(cVar);
                    }
                }
                this.f123571e.setValue(Boolean.FALSE);
                break;
            default:
                n1 n1Var2 = this.f123570d;
                int intValue2 = n1Var2.getIntValue();
                int i15 = this.f123568b;
                if (intValue2 != i15) {
                    n1Var2.t(i15);
                    this.f123569c.invoke(Integer.valueOf(i15));
                }
                this.f123571e.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(int i14, n1 n1Var, e23.l lVar, p1 p1Var) {
        this.f123568b = i14;
        this.f123570d = n1Var;
        this.f123569c = lVar;
        this.f123571e = p1Var;
    }
}
