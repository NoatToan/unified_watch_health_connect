package defpackage;

import com.xiaomi.wearable.connection.ConnectSource;
import com.xiaomi.wearable.core.ConnectTrackerKt;
import com.xiaomi.wearable.core.CoreExtKt;

/* JADX INFO: loaded from: classes2.dex */
public class y6o extends w6r {
    public w6r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f39866k;

    public class a implements zd4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f39867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ me4 f39868b;

        public a(long j, me4 me4Var) {
            this.f39867a = j;
            this.f39868b = me4Var;
        }

        @Override // defpackage.zd4
        public void onConnectFailure(int i, String str) {
            ConnectTrackerKt.trackConnectTime("internalConnect", System.currentTimeMillis() - this.f39867a);
            CoreExtKt.logger.i("WearAuth", "onConnectFailure() called with: status = [" + i + "], cost = " + (System.currentTimeMillis() - this.f39867a));
            if (y6o.this.b()) {
                return;
            }
            this.f39868b.b(i, "connect failed: " + i);
        }

        @Override // defpackage.zd4
        public void onConnectSuccess() {
            ConnectTrackerKt.trackConnectTime("internalConnect", System.currentTimeMillis() - this.f39867a);
            CoreExtKt.logger.i("WearAuth", "onConnectSuccess called cost = " + ((System.currentTimeMillis() - this.f39867a) / 1000.0f));
            if (y6o.this.b()) {
                return;
            }
            this.f39868b.b(2001, "device connected");
            if (y6o.this.j != null) {
                y6o.this.j.a();
            }
            y6o y6oVar = y6o.this;
            new y6r(y6oVar.f37671a, y6oVar.f37672b, (x6o) y6oVar.c, y6oVar.e, y6oVar.f).c(this.f39868b);
        }
    }

    public y6o(String str, byte[] bArr, x6o x6oVar, int i, int i2, String str2) {
        super(str, bArr, true, x6oVar, i2, str2);
        this.f39866k = i;
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
        CoreExtKt.logger.i("WearAuth", "start auth connect , from = " + this.e);
        ((x6o) this.c).internalConnect(e(), new a(jCurrentTimeMillis, me4Var));
    }

    public final boolean e() {
        return this.e == 1 && ConnectSource.INSTANCE.getFromMainProcess();
    }
}
