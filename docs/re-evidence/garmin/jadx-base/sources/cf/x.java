package cf;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26995c;

    public /* synthetic */ x(String str, long j8) {
        this.f26993a = 2;
        this.f26995c = str;
        this.f26994b = j8;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14 = this.f26993a;
        String str = this.f26995c;
        long j8 = this.f26994b;
        ud.a aVar = (ud.a) obj;
        switch (i14) {
            case 0:
                b0.c cVar = b0.f26898d;
                aVar.getClass();
                ud.c cVarM0 = aVar.M0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    cVarM0.h(1, j8);
                    cVarM0.q3(2, str);
                    cVarM0.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM0.close();
                }
            case 1:
                b0.c cVar2 = b0.f26898d;
                aVar.getClass();
                ud.c cVarM1 = aVar.M0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    cVarM1.h(1, j8);
                    cVarM1.q3(2, str);
                    cVarM1.J0();
                    return Integer.valueOf(g8.i.L(aVar));
                } finally {
                    cVarM1.close();
                }
            case 2:
                es2.f.b bVar = es2.f.f65227d;
                aVar.getClass();
                ud.c cVarM2 = aVar.M0("delete from wallet_items where item_id = ? and unit_id = ?");
                try {
                    cVarM2.q3(1, str);
                    cVarM2.h(2, j8);
                    cVarM2.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM2.close();
                }
            default:
                es2.f.b bVar2 = es2.f.f65227d;
                aVar.getClass();
                ud.c cVarM3 = aVar.M0("delete from wallet_items where unit_id = ? and provider_type = ?");
                try {
                    cVarM3.h(1, j8);
                    cVarM3.q3(2, str);
                    cVarM3.J0();
                    return Unit.INSTANCE;
                } finally {
                    cVarM3.close();
                }
        }
    }

    public /* synthetic */ x(long j8, String str, int i14) {
        this.f26993a = i14;
        this.f26994b = j8;
        this.f26995c = str;
    }
}
