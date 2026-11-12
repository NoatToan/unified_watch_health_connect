package defpackage;

import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.receiver.PacketReceiver;
import com.xiaomi.fitness.sport_manager.state.device.AppAndDeviceSportStateServer;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class c6o implements PacketReceiver {
    public static final Map<String, c6o> f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SportRequestData f4989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4990b;
    public eoe d;
    public d c = new d();
    public Long e = 0L;

    public class a implements yyc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fu9 f4992b;
        public final /* synthetic */ s7r c;

        public a(int i, fu9 fu9Var, s7r s7rVar) {
            this.f4991a = i;
            this.f4992b = fu9Var;
            this.c = s7rVar;
        }

        @Override // defpackage.yyc
        public void onLocationChanged(SportLocationResult sportLocationResult) {
            hu9 hu9VarW = tv9.w(this.f4991a, this.f4992b, sportLocationResult.getGpsAccuracyStatus());
            ur9 ur9Var = new ur9();
            ur9Var.O0(hu9VarW);
            this.c.S(ur9Var);
            FitnessLogUtils.i("SportWearReceiver", "sendToSportRequestResponse code:" + this.f4991a + ",gpsAccuracy:" + sportLocationResult.getGpsAccuracyStatus());
            c6o.this.d(this.c, false, null);
        }
    }

    public class b implements OnSyncCallback {
        public b() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearReceiver", "sendSportPreResponse ,responseCode == 0, error , did:" + str + ",type : " + i + ",code :" + i2);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            FitnessLogUtils.i("SportWearReceiver", "sendSportPreResponse ,responseCode == 0, success , did:" + str + ",type : " + i);
        }
    }

    public class c implements OnSyncCallback {
        public c() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onError(String str, int i, int i2) {
            FitnessLogUtils.i("SportWearReceiver", "sendSportPreResponse , responseCode != 0 , error , did:" + str + ",type : " + i + ",code :" + i2);
        }

        @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
        public void onSuccess(String str, int i, SyncResult syncResult) {
            FitnessLogUtils.i("SportWearReceiver", "sendSportPreResponse ,responseCode != 0,success , did:" + str + ",type : " + i);
        }
    }

    public class d extends DataHandlerWrapper {
        public d() {
        }

        @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
        public boolean handlePacket(@NotNull String str, int i, @Nullable s7r s7rVar) throws RemoteException {
            if (!str.equals(c6o.this.f4990b)) {
                return false;
            }
            c6o.this.onReceive(i, s7rVar);
            return false;
        }
    }

    public c6o(String str) {
        this.f4990b = str;
    }

    public static c6o e(String str) {
        Map<String, c6o> map = f;
        c6o c6oVar = map.get(str);
        if (c6oVar == null) {
            synchronized (c6o.class) {
                try {
                    c6oVar = map.get(str);
                    FitnessLogUtils.i("SportWearReceiver", "receiver : " + c6oVar + ",did : " + str + ", thread :" + Thread.currentThread().getName());
                    if (c6oVar == null) {
                        c6oVar = new c6o(str);
                        map.put(str, c6oVar);
                        FitnessLogUtils.i("SportWearReceiver", "map size :" + map.size());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c6oVar;
    }

    private void l(kr9 kr9Var) {
        if (kr9Var == null) {
            FitnessLogUtils.w("SportWearReceiver", "ecgData is null");
        }
        ed2 ed2VarF = f2o.x().F(SportDeviceModel.INSTANCE.getDeviceModelByDid(this.f4990b));
        if (ed2VarF instanceof fv2) {
            ((fv2) ed2VarF).B0(kr9Var);
        }
    }

    private void m(qr9 qr9Var) {
        if (qr9Var == null) {
            FitnessLogUtils.w("SportWearReceiver", "ecgStatus is null");
        }
        ed2 ed2VarF = f2o.x().F(SportDeviceModel.INSTANCE.getDeviceModelByDid(this.f4990b));
        if (ed2VarF instanceof fv2) {
            ((fv2) ed2VarF).C0(qr9Var);
        }
    }

    private void p(gs9[] gs9VarArr) throws RemoteException {
        for (gs9 gs9Var : gs9VarArr) {
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.d("SportWearReceiver", "key : " + gs9Var.c);
            FitnessLogUtils.d("SportWearReceiver", "value : " + gs9Var.d);
        }
        dne dneVarA = f2o.x().A(f2o.x().v(f2o.x().y()));
        if (dneVarA != null) {
            dneVarA.V0(gs9VarArr);
        }
    }

    public final void d(s7r s7rVar, boolean z, OnSyncCallback onSyncCallback) {
        SportDeviceModel.INSTANCE.getDeviceSyncManager().call(s7rVar, z, onSyncCallback, 8000);
    }

    public final s7r f(int i, int i2, int i3) {
        FitnessLogUtils.i("SportWearReceiver", "responseCode:" + i + ", sportVersion:" + i2 + ", gpsAccuracy:" + i3);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 30;
        du9 du9VarZ = tv9.z(i, i2);
        du9VarZ.e = tv9.p(i3);
        ur9 ur9Var = new ur9();
        ur9Var.M0(du9VarZ);
        s7rVar.S(ur9Var);
        return s7rVar;
    }

    public final void g(final int i, final int i2) {
        if (i != 0) {
            d(f(i, i2, 10), true, new c());
            return;
        }
        if (this.d == null) {
            this.d = new eoe(AppUtil.getApp(), TimeUnit.SECONDS.toMillis(1L), new yyc() { // from class: b6o
                @Override // defpackage.yyc
                public final void onLocationChanged(SportLocationResult sportLocationResult) {
                    this.f3867a.k(i, i2, sportLocationResult);
                }
            });
        }
        this.d.j();
    }

    public final void h(int i, fu9 fu9Var) {
        FitnessLogUtils.i("SportWearReceiver", "handleSportResponse , responseCode:" + i);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 26;
        new eoe(AppUtil.getApp(), 1000L, new a(i, fu9Var, s7rVar), 5000).j();
    }

    public final void i(int i, fu9 fu9Var) {
        FitnessLogUtils.i("SportWearReceiver", "handleSportResponseByErrorInfo , responseCode:" + i);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 26;
        hu9 hu9VarW = tv9.w(i, fu9Var, 0);
        ur9 ur9Var = new ur9();
        ur9Var.O0(hu9VarW);
        s7rVar.S(ur9Var);
        d(s7rVar, false, null);
    }

    public void j() {
        FitnessLogUtils.i("SportWearReceiver", "init , this:" + this + ", did:" + this.f4990b);
        SportDeviceModel.INSTANCE.getDeviceSyncManager().addDataHandler(8, this.c);
    }

    public final /* synthetic */ void k(int i, int i2, SportLocationResult sportLocationResult) {
        d(f(i, i2, sportLocationResult.accuracyStatus), true, new b());
    }

    public final void n(zr9 zr9Var) {
        FitnessLogUtils.i("SportWearReceiver", "GYMData , distance : " + zr9Var.f);
        jdn.h().g().o(tv9.d(zr9Var));
    }

    public final void o(bs9 bs9Var) {
        if (System.currentTimeMillis() - this.e.longValue() < 1000) {
            return;
        }
        this.e = Long.valueOf(System.currentTimeMillis());
        FitnessLogUtils.i("SportWearReceiver", "gymRequest ： " + bs9Var);
        if (bs9Var == null) {
            FitnessLogUtils.i("SportWearReceiver", "gymRequest == null");
            return;
        }
        dne dneVarA = f2o.x().A(SportDeviceModel.INSTANCE.curGymDeviceModel());
        SportRequestData sportRequestDataG = tv9.g(bs9Var);
        if (dneVarA != null) {
            dneVarA.g(sportRequestDataG);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager.receiver.PacketReceiver
    public void onReceive(int i, s7r s7rVar) throws RemoteException {
        if (s7rVar == null || s7rVar.e != 8) {
            FitnessLogUtils.w("SportWearReceiver", "not fitness type");
            return;
        }
        ur9 ur9VarU = s7rVar.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w("SportWearReceiver", "fitnessProto is null");
            return;
        }
        FitnessLogUtils.d("SportWearReceiver", "type : " + i + ",packet : " + s7rVar.f);
        int i2 = s7rVar.f;
        if (i2 == 26) {
            FitnessLogUtils.i("SportWearReceiver", "onReceiveSportRequest()");
            eoe eoeVar = this.d;
            if (eoeVar != null) {
                eoeVar.k();
            }
            r(ur9VarU.T());
            return;
        }
        if (i2 == 28) {
            t(ur9VarU.b0());
            return;
        }
        if (i2 == 30) {
            FitnessLogUtils.i("SportWearReceiver", "onReceiveSportPreRequest()");
            q(ur9VarU.R());
            return;
        }
        if (i2 == 50) {
            u(ur9VarU.c0());
            return;
        }
        if (i2 == 53) {
            s(ur9VarU.a0());
            return;
        }
        if (i2 == 64) {
            FitnessLogUtils.i("SportWearReceiver", "GYM_REQUEST , did:" + this.f4990b);
            o(ur9VarU.w());
            return;
        }
        if (i2 == 33) {
            l(ur9VarU.s());
            return;
        }
        if (i2 == 34) {
            m(ur9VarU.t());
        } else if (i2 == 66) {
            n(ur9VarU.v());
        } else {
            if (i2 != 67) {
                return;
            }
            p(ur9VarU.y().c);
        }
    }

    public final void q(bu9 bu9Var) {
        if (bu9Var == null) {
            FitnessLogUtils.w("SportWearReceiver", "sportPreRequest is null");
            return;
        }
        wsn wsnVarF = tv9.f(bu9Var);
        FitnessLogUtils.i("SportWearReceiver", "onReceiveSportPreRequest:" + wsnVarF);
        int iB = f2o.x().u(SportDeviceModel.INSTANCE.getDeviceModelByDid(this.f4990b)).b(wsnVarF);
        FitnessLogUtils.i("SportWearReceiver", "onReceiveSportPreRequest , code:" + iB);
        g(iB, 2);
    }

    public final void r(fu9 fu9Var) {
        if (fu9Var == null) {
            FitnessLogUtils.w("SportWearReceiver", "sportRequest is null");
            return;
        }
        this.f4989a = tv9.h(fu9Var);
        FitnessLogUtils.i("SportWearReceiver", "onReceiveSportRequest " + this.f4989a);
        f2o f2oVarX = f2o.x();
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        fv2 fv2VarU = f2oVarX.u(sportDeviceModel.getDeviceModelByDid(this.f4990b));
        AppAndDeviceSportStateServer.getInstance().notifyDeviceAloneSportStateChanged(this.f4989a);
        int i = fv2VarU.i(this.f4989a);
        if (i == 5) {
            f2o.x().d0();
            h(5, fu9Var);
        } else {
            if (i != 0) {
                i(i, fu9Var);
                return;
            }
            if (this.f4989a.sportState == 1) {
                f2o.x().X(sportDeviceModel.curDeviceModel());
            }
            fv2VarU.g(this.f4989a);
            h(i, fu9Var);
        }
    }

    public final void s(dv9 dv9Var) {
        jdn.h().g().q(dv9Var);
    }

    public final void t(ev9 ev9Var) {
        if (ev9Var == null) {
            FitnessLogUtils.w("SportWearReceiver", "wearSportData is null");
        } else {
            jdn.h().g().a(tv9.m(ev9Var));
        }
    }

    public final void u(gv9 gv9Var) {
        if (gv9Var == null) {
            FitnessLogUtils.w("SportWearReceiver", "wearSportDataV2A is null");
            return;
        }
        x7r x7rVarN = tv9.n(gv9Var);
        b36 b36VarG = jdn.h().g();
        if (SportDeviceModel.INSTANCE.isAccessoryDevice(this.f4990b)) {
            b36VarG.c(x7rVarN);
        } else {
            b36VarG.a(x7rVarN);
        }
    }
}
