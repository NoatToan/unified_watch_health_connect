package ug2;

import l72.i3;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class z implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yg2.h f171095b;

    public /* synthetic */ z(yg2.h hVar, int i14) {
        this.f171094a = i14;
        this.f171095b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        String strValueOf;
        switch (this.f171094a) {
            case 0:
                vf2.e eVar = (vf2.e) obj;
                eVar.getClass();
                this.f171095b.f196996d.k(null, eVar);
                break;
            case 1:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                boolean zA = g0Var.a();
                yg2.h hVar = this.f171095b;
                if (!zA) {
                    hVar.f197011t = false;
                } else if (hVar.f197010r) {
                    zg2.c.f204692a.getClass();
                    zg2.c.a("ExerciseEditViewModel", "Ignore focus on reps field.");
                    hVar.f197010r = false;
                } else if (!hVar.f197011t) {
                    hVar.f197006n.k(null, Boolean.TRUE);
                    hVar.f197011t = true;
                }
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                yg2.h hVar2 = this.f171095b;
                hVar2.B4(str);
                hVar2.A4();
                break;
            case 3:
                ((i3) obj).getClass();
                this.f171095b.z4();
                break;
            case 4:
                yg2.h hVar3 = this.f171095b;
                p2 p2Var = hVar3.f197005m;
                m4.g0 g0Var2 = (m4.g0) obj;
                g0Var2.getClass();
                boolean zA2 = g0Var2.a();
                boolean z14 = hVar3.f197012v;
                if (zA2) {
                    if (!z14) {
                        hVar3.f197006n.k(null, Boolean.TRUE);
                        hVar3.f197012v = true;
                    }
                } else if (z14) {
                    zg2.c.f204692a.getClass();
                    zg2.c.a("ExerciseEditViewModel", "Weight field went from focused to unfocused.");
                    Float fG = d53.s.g((String) p2Var.getValue());
                    if (fG == null || (strValueOf = String.valueOf(((double) Math.round(fG.floatValue() * 2)) / 2.0d)) == null) {
                        strValueOf = "";
                    }
                    p2Var.k(null, strValueOf);
                    Float fG2 = d53.s.g(strValueOf);
                    if (fG2 != null) {
                        hVar3.f197015y = fG2.floatValue();
                    }
                    hVar3.f197012v = false;
                }
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                yg2.h hVar4 = this.f171095b;
                hVar4.f197005m.k(null, str2);
                Float fG3 = d53.s.g(str2);
                if (fG3 != null) {
                    hVar4.f197015y = fG3.floatValue();
                }
                hVar4.A4();
                break;
        }
        return Unit.INSTANCE;
    }
}
