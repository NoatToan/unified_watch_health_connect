package ug2;

import java.util.ArrayList;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f170791b;

    public /* synthetic */ i(r0 r0Var, int i14) {
        this.f170790a = i14;
        this.f170791b = r0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        switch (this.f170790a) {
            case 0:
                p2 p2Var = this.f170791b.B4().f71495s;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, null));
                break;
            case 1:
                mf2.h hVarE = this.f170791b.B4().e();
                if (hVarE != null) {
                    ArrayList arrayList = hVarE.f118314i;
                    ArrayList arrayList2 = hVarE.f118313h;
                    if (!arrayList2.isEmpty() && (p13.h0.m0(arrayList2) instanceof mf2.h.c.b)) {
                        zg2.c.f204692a.getClass();
                        zg2.c.d("Analytics", "Hide paused overlay");
                        arrayList2.add(mf2.h.c.a.f118323a);
                    }
                    if (!(p13.h0.n0(arrayList) instanceof mf2.h.c.b)) {
                        zg2.c.f204692a.getClass();
                        zg2.c.d("Analytics", "Disconnected overlay is now visible");
                        arrayList.add(new mf2.h.c.b(mf2.h.b.DISCONNECTED));
                    }
                }
                break;
            case 2:
                this.f170791b.C4();
                break;
            case 3:
                this.f170791b.C4();
                break;
            case 4:
                r0 r0Var = this.f170791b;
                mf2.h hVarE2 = r0Var.B4().e();
                if (hVarE2 != null) {
                    hVarE2.c(mf2.h.d.EXERCISE_INFO);
                }
                r0Var.f170944w = null;
                break;
            case 5:
                r0 r0Var2 = this.f170791b;
                mf2.h hVarE3 = r0Var2.B4().e();
                if (hVarE3 != null) {
                    hVarE3.c(mf2.h.d.STEP);
                }
                r0Var2.f170944w = null;
                break;
            case 6:
                mf2.h hVarE4 = this.f170791b.B4().e();
                if (hVarE4 != null) {
                    hVarE4.c(mf2.h.d.BREATHWORK);
                }
                break;
            case 7:
                r0 r0Var3 = this.f170791b;
                mf2.h hVarE5 = r0Var3.B4().e();
                if (hVarE5 != null) {
                    hVarE5.c(mf2.h.d.WORKOUT);
                }
                r0Var3.f170944w = null;
                break;
            default:
                r0 r0Var4 = this.f170791b;
                mf2.h hVarE6 = r0Var4.B4().e();
                if (hVarE6 != null) {
                    hVarE6.c(mf2.h.d.STEP);
                }
                r0Var4.f170944w = null;
                break;
        }
        return Unit.INSTANCE;
    }
}
