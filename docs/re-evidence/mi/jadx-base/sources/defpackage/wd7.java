package defpackage;

import com.xiaomi.eco.api.c;
import com.xiaomi.eco.api.d;
import com.xiaomi.eco.api.i;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class wd7 extends qd7 {
    public boolean h;
    public qd7 i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f37866k;

    public class a implements nj7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f37867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qj7 f37868b;

        public a(long j, qj7 qj7Var) {
            this.f37867a = j;
            this.f37868b = qj7Var;
        }

        @Override // defpackage.nj7
        public void onConnectFailure(int i) {
            Logger.i("EcoAuthWrapper", "onConnectFailure() called with: status = [" + i + "], cost = " + (System.currentTimeMillis() - this.f37867a));
            if (wd7.this.c()) {
                return;
            }
            this.f37868b.b(2002, "connect failed: " + i);
        }

        @Override // defpackage.nj7
        public void onConnectSuccess() {
            Logger.i("EcoAuthWrapper", "onConnectSuccess called cost = " + ((System.currentTimeMillis() - this.f37867a) / 1000.0f));
            if (wd7.this.c()) {
                return;
            }
            this.f37868b.b(2001, "device connected");
            if (wd7.this.i != null) {
                wd7.this.i.a();
            }
            int version = ((i) wd7.this.c).getVersion();
            if (!wd7.this.o()) {
                Logger.i("EcoAuthWrapper", "onConnectSuccess: recreate auth");
                if (version == 0) {
                    wd7 wd7Var = wd7.this;
                    wd7Var.i = new c(wd7Var.f31404a, wd7Var.f31405b, (i) wd7Var.c);
                } else {
                    wd7 wd7Var2 = wd7.this;
                    String str = wd7Var2.f31404a;
                    boolean z = wd7Var2.h;
                    wd7 wd7Var3 = wd7.this;
                    wd7Var2.i = new d(str, z, wd7Var3.f31405b, wd7Var3.j, wd7.this.f37866k, (i) wd7.this.c);
                }
            } else if (wd7.this.p() && wd7.this.q()) {
                wd7 wd7Var4 = wd7.this;
                wd7Var4.d = 2;
                wd7Var4.e.b(2004, "device ready");
                return;
            } else {
                if (wd7.this.n()) {
                    Logger.i("EcoAuthWrapper", "onConnectSuccess: auth error reconnect");
                    ((i) wd7.this.c).b6(null);
                    wd7.this.c.getConnection().disconnect();
                    wd7.this.c.getConnection().connect(true, false, 5);
                    return;
                }
                Logger.i("EcoAuthWrapper", "onConnectSuccess: recreate auth");
                if (version == 0) {
                    wd7 wd7Var5 = wd7.this;
                    wd7Var5.i = new c(wd7Var5.f31404a, wd7Var5.f31405b, (i) wd7Var5.c);
                } else {
                    wd7 wd7Var6 = wd7.this;
                    String str2 = wd7Var6.f31404a;
                    boolean z2 = wd7Var6.h;
                    wd7 wd7Var7 = wd7.this;
                    wd7Var6.i = new d(str2, z2, wd7Var7.f31405b, wd7Var7.j, wd7.this.f37866k, (i) wd7.this.c);
                }
            }
            wd7 wd7Var8 = wd7.this;
            wd7Var8.d = 1;
            wd7Var8.i.d(this.f37868b);
        }
    }

    public wd7(String str, byte[] bArr, boolean z, String str2, String str3, i iVar, int i) {
        super(str, bArr, iVar);
        this.j = str2;
        this.f37866k = str3;
        this.h = z;
        this.d = i;
    }

    @Override // defpackage.qd7
    public final void a() {
        super.a();
        qd7 qd7Var = this.i;
        if (qd7Var != null) {
            qd7Var.a();
            this.i = null;
        }
    }

    @Override // defpackage.qd7
    public final void d(qj7 qj7Var) {
        super.d(qj7Var);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.i("EcoAuthWrapper", "start auth connect");
        ((i) this.c).O5(new a(jCurrentTimeMillis, qj7Var));
    }

    public final boolean n() {
        lem lemVarL5 = ((i) this.c).L5();
        boolean z = (lemVarL5 == null || lemVarL5.i == null) ? false : true;
        Logger.i("EcoAuthWrapper", "hasReadableData: result = " + z);
        return z;
    }

    public final boolean o() {
        return this.d == 2;
    }

    public final boolean p() {
        long lastConnectTime = ((i) this.c).getLastConnectTime();
        long jB = rd7.b();
        Logger.i("EcoAuthWrapper", "isValidAuth: last = " + lastConnectTime + ", auth = " + jB);
        return lastConnectTime != 0 && lastConnectTime == jB;
    }

    public final boolean q() {
        if (((i) this.c).getVersion() == 0) {
            return true;
        }
        try {
            Logger.d("EcoAuthWrapper", "restoreKeys: ---------------------");
            rd7.c((i) this.c);
            return true;
        } catch (Exception e) {
            Logger.i("EcoAuthWrapper", "restoreAuthKey: ");
            e.printStackTrace();
            return false;
        }
    }
}
