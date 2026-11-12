package defpackage;

import com.xiaomi.wearable.core.ConnectTrackerKt;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.wear.api.WearAuthV1;

/* JADX INFO: loaded from: classes2.dex */
public class z6r extends w6r {
    public w6r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f40958k;
    public String l;

    public class a implements zd4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f40959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ me4 f40960b;

        public a(long j, me4 me4Var) {
            this.f40959a = j;
            this.f40960b = me4Var;
        }

        @Override // defpackage.zd4
        public void onConnectFailure(int i, String str) {
            CoreExtKt.logger.i("WearAuthWrapper", "onConnectFailure() called with: status = [" + i + "], cost = " + (System.currentTimeMillis() - this.f40959a));
            ConnectTrackerKt.trackConnectTime("internalConnect", System.currentTimeMillis() - this.f40959a);
            if (z6r.this.b()) {
                return;
            }
            this.f40960b.b(2002, "connect failed: " + i);
        }

        @Override // defpackage.zd4
        public void onConnectSuccess() {
            CoreExtKt.logger.i("WearAuthWrapper", "onConnectSuccess called cost = " + ((System.currentTimeMillis() - this.f40959a) / 1000.0f));
            if (z6r.this.b()) {
                return;
            }
            ConnectTrackerKt.trackConnectTime("internalConnect", System.currentTimeMillis() - this.f40959a);
            this.f40960b.b(2001, "device connected");
            if (z6r.this.j != null) {
                z6r.this.j.a();
            }
            int version = z6r.this.c.getVersion();
            CoreExtKt.logger.i("WearAuthWrapper", "onConnectSuccess: version = " + version);
            if (version == 0) {
                z6r z6rVar = z6r.this;
                z6rVar.j = new WearAuthV1(z6rVar.f37671a, z6rVar.f37672b, (lq2) z6rVar.c, z6rVar.e);
            } else {
                z6r z6rVar2 = z6r.this;
                String str = z6rVar2.f37671a;
                byte[] bArr = z6rVar2.f37672b;
                String str2 = z6rVar2.f40958k;
                String str3 = z6r.this.l;
                z6r z6rVar3 = z6r.this;
                z6rVar2.j = new x6r(str, bArr, str2, str3, z6rVar3.d, (lq2) z6rVar3.c, z6rVar3.e);
            }
            z6r.this.j.c(this.f40960b);
        }
    }

    public z6r(String str, byte[] bArr, String str2, String str3, boolean z, lq2 lq2Var, int i) {
        super(str, bArr, z, lq2Var, i, str2);
        this.f40958k = str2;
        this.l = str3;
    }

    @Override // defpackage.w6r
    public final void a() {
        super.a();
        w6r w6rVar = this.j;
        if (w6rVar != null) {
            w6rVar.a();
            this.j = null;
        }
    }

    @Override // defpackage.w6r
    public final void c(me4 me4Var) {
        super.c(me4Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        CoreExtKt.logger.i("WearAuthWrapper", "start auth connect");
        ((lq2) this.c).internalConnect(this.e == 1, new a(jCurrentTimeMillis, me4Var));
    }
}
