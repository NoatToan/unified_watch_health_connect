package cf;

import p005kotlin.Unit;
import s5.w0;
import v2.r0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26925c;

    public /* synthetic */ k(int i14, String str) {
        this.f26923a = 2;
        this.f26925c = i14;
        this.f26924b = str;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        i iVar;
        int i14 = this.f26923a;
        int i15 = this.f26925c;
        String str = this.f26924b;
        switch (i14) {
            case 0:
                ud.a aVar = (ud.a) obj;
                l.b bVar = l.f26926c;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    cVarM0.q3(1, str);
                    cVarM0.h(2, i15);
                    int iB = ge1.b.B(cVarM0, "work_spec_id");
                    int iB2 = ge1.b.B(cVarM0, "generation");
                    int iB3 = ge1.b.B(cVarM0, "system_id");
                    if (cVarM0.J0()) {
                        iVar = new i(cVarM0.M1(iB), (int) cVarM0.getLong(iB2), (int) cVarM0.getLong(iB3));
                        break;
                    } else {
                        iVar = null;
                    }
                    return iVar;
                } finally {
                    cVarM0.close();
                }
            case 1:
                ud.a aVar2 = (ud.a) obj;
                b0.c cVar = b0.f26898d;
                aVar2.getClass();
                ud.c cVarM1 = aVar2.M0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    cVarM1.q3(1, str);
                    cVarM1.h(2, i15);
                    cVarM1.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM1.close();
                }
            case 2:
                ud.a aVar3 = (ud.a) obj;
                b0.c cVar2 = b0.f26898d;
                aVar3.getClass();
                ud.c cVarM2 = aVar3.M0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    cVarM2.h(1, i15);
                    cVarM2.q3(2, str);
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            default:
                u2.d dVar = (u2.d) obj;
                w0 w0Var = dVar.f167834e;
                if (w0Var != null) {
                    long j8 = w0Var.f157317a;
                    r0.b(dVar, (int) (j8 >> 32), (int) (4294967295L & j8), str);
                } else {
                    long j14 = dVar.f167833d;
                    w0.a aVar4 = w0.f157315b;
                    r0.b(dVar, (int) (j14 >> 32), (int) (4294967295L & j14), str);
                }
                long j15 = dVar.f167833d;
                w0.a aVar5 = w0.f157315b;
                int i16 = (int) (j15 >> 32);
                int iE = j23.t.e(i15 > 0 ? (i16 + i15) - 1 : (i16 + i15) - str.length(), 0, dVar.f167831b.length());
                dVar.f(og.a.l(iE, iE));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(String str, int i14, int i15) {
        this.f26923a = i15;
        this.f26924b = str;
        this.f26925c = i14;
    }
}
