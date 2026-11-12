package defpackage;

import com.xiaomi.eco.api.c;
import com.xiaomi.eco.api.i;
import com.xiaomi.eco.api.k;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class eu7 extends qd7 {
    public boolean h;
    public qd7 i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17070k;

    public class a implements nj7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f17071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qj7 f17072b;

        public a(long j, qj7 qj7Var) {
            this.f17071a = j;
            this.f17072b = qj7Var;
        }

        @Override // defpackage.nj7
        public void onConnectFailure(int i) {
            Logger.i("EcoLocalAuthWrapper", "onConnectFailure() called with: status = [" + i + "], cost = " + (System.currentTimeMillis() - this.f17071a));
            if (eu7.this.c()) {
                return;
            }
            this.f17072b.b(2002, "connect failed: " + i);
        }

        @Override // defpackage.nj7
        public void onConnectSuccess() {
            Logger.i("EcoLocalAuthWrapper", "onConnectSuccess called cost = " + ((System.currentTimeMillis() - this.f17071a) / 1000.0f));
            if (eu7.this.c()) {
                return;
            }
            this.f17072b.b(2001, "device connected");
            if (eu7.this.i != null) {
                eu7.this.i.a();
            }
            int version = ((i) eu7.this.c).getVersion();
            if (!eu7.this.o()) {
                Logger.i("EcoLocalAuthWrapper", "onConnectSuccess: recreate auth");
                if (version == 0) {
                    eu7 eu7Var = eu7.this;
                    eu7Var.i = new c(eu7Var.f31404a, eu7Var.f31405b, (i) eu7Var.c);
                } else {
                    eu7 eu7Var2 = eu7.this;
                    String str = eu7Var2.f31404a;
                    boolean z = eu7Var2.h;
                    eu7 eu7Var3 = eu7.this;
                    eu7Var2.i = new k(str, z, eu7Var3.f31405b, eu7Var3.j, eu7.this.f17070k, (i) eu7.this.c);
                }
            } else if (eu7.this.p() && eu7.this.q()) {
                eu7 eu7Var4 = eu7.this;
                eu7Var4.d = 2;
                eu7Var4.e.b(2004, "device ready");
                return;
            } else {
                if (eu7.this.n()) {
                    Logger.i("EcoLocalAuthWrapper", "onConnectSuccess: auth error reconnect");
                    ((i) eu7.this.c).b6(null);
                    eu7.this.c.getConnection().disconnect();
                    eu7.this.c.getConnection().connect(true, false, 5);
                    return;
                }
                Logger.i("EcoLocalAuthWrapper", "onConnectSuccess: recreate auth");
                if (version == 0) {
                    eu7 eu7Var5 = eu7.this;
                    eu7Var5.i = new c(eu7Var5.f31404a, eu7Var5.f31405b, (i) eu7Var5.c);
                } else {
                    eu7 eu7Var6 = eu7.this;
                    String str2 = eu7Var6.f31404a;
                    boolean z2 = eu7Var6.h;
                    eu7 eu7Var7 = eu7.this;
                    eu7Var6.i = new k(str2, z2, eu7Var7.f31405b, eu7Var7.j, eu7.this.f17070k, (i) eu7.this.c);
                }
            }
            eu7 eu7Var8 = eu7.this;
            eu7Var8.d = 1;
            eu7Var8.i.d(this.f17072b);
        }
    }

    public eu7(String str, byte[] bArr, boolean z, String str2, String str3, i iVar, int i) {
        super(str, bArr, iVar);
        this.j = str2;
        this.f17070k = str3;
        this.h = z;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        lem lemVarL5 = ((i) this.c).L5();
        boolean z = (lemVarL5 == null || lemVarL5.i == null) ? false : true;
        Logger.i("EcoLocalAuthWrapper", "hasReadableData: result = " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        return this.d == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        long lastConnectTime = ((i) this.c).getLastConnectTime();
        long jB = rd7.b();
        Logger.i("EcoLocalAuthWrapper", "isValidAuth: last = " + lastConnectTime + ", auth = " + jB);
        return lastConnectTime != 0 && lastConnectTime == jB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        if (((i) this.c).getVersion() == 0) {
            return true;
        }
        try {
            Logger.d("EcoLocalAuthWrapper", "restoreKeys: ---------------------");
            rd7.c((i) this.c);
            return true;
        } catch (Exception e) {
            Logger.i("EcoLocalAuthWrapper", "restoreAuthKey: ");
            e.printStackTrace();
            return false;
        }
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
        Logger.i("EcoLocalAuthWrapper", "start auth connect");
        ((i) this.c).O5(new a(jCurrentTimeMillis, qj7Var));
    }
}
