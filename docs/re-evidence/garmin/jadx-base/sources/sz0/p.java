package sz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.g3;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f161476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uz0.m f161477c;

    public /* synthetic */ p(u uVar, uz0.m mVar, int i14) {
        this.f161475a = i14;
        this.f161476b = uVar;
        this.f161477c = mVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f161475a;
        uz0.m mVar = this.f161477c;
        u uVar = this.f161476b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = u.E;
                int i16 = u.b.f161516a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.f(uVar);
                    g22.e.a(uVar, null);
                } else if (i16 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    if (uVar.isAdded()) {
                        i0 i0VarD7 = uVar.d7();
                        Context contextRequireContext = uVar.requireContext();
                        contextRequireContext.getClass();
                        i0VarD7.C4(contextRequireContext, mVar, false);
                    }
                }
                return Unit.INSTANCE;
            default:
                int i17 = u.E;
                int i18 = u.b.f161516a[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    g22.e.f(uVar);
                    Context contextRequireContext2 = uVar.requireContext();
                    contextRequireContext2.getClass();
                    ei0.q0.b(contextRequireContext2);
                } else if (i18 == 2) {
                    g22.e.l(uVar);
                } else {
                    if (i18 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(uVar);
                    if (uVar.isAdded()) {
                        i0 i0VarD8 = uVar.d7();
                        Context contextRequireContext3 = uVar.requireContext();
                        contextRequireContext3.getClass();
                        i0VarD8.C4(contextRequireContext3, mVar, true);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
