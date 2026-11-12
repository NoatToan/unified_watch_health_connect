package zd2;

import e23.l;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f204228b;

    public /* synthetic */ b(long j8, int i14) {
        this.f204227a = i14;
        this.f204228b = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        be2.e eVar;
        int i14 = this.f204227a;
        long j8 = this.f204228b;
        ud.a aVar = (ud.a) obj;
        switch (i14) {
            case 0:
                c.b bVar = c.f204229c;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("DELETE FROM livetrack_publishers where device_unit_id = ?");
                try {
                    cVarM0.h(1, j8);
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 1:
                c.b bVar2 = c.f204229c;
                aVar.getClass();
                ud.c cVarM1 = aVar.M0("SELECT * FROM livetrack_publishers where device_unit_id = ?");
                try {
                    cVarM1.h(1, j8);
                    int iB = ge1.b.B(cVarM1, "device_unit_id");
                    int iB2 = ge1.b.B(cVarM1, "publisher_id");
                    int iB3 = ge1.b.B(cVarM1, "publisher_type");
                    if (cVarM1.J0()) {
                        eVar = new be2.e(cVarM1.getLong(iB), cVarM1.M1(iB2), cVarM1.M1(iB3));
                        break;
                    } else {
                        eVar = null;
                    }
                    return eVar;
                } finally {
                    cVarM1.close();
                }
            default:
                h.c cVar = h.f204240e;
                aVar.getClass();
                ud.c cVarM2 = aVar.M0("DELETE FROM session_info where device_unit_id = ?");
                try {
                    cVarM2.h(1, j8);
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
        }
    }
}
