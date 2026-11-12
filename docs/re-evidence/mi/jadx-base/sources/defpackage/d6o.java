package defpackage;

import android.os.RemoteException;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper;
import com.xiaomi.fitness.sport_eco_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.state.device.AppAndDeviceSportStateServer;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class d6o {
    public static final Map<String, d6o> e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SportRequestData f15148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15149b;
    public a c = new a();
    public Long d = 0L;

    public class a extends EcoDataHandlerWrapper {
        public a() {
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDataHandlerWrapper, com.xiaomi.fitness.eco.device.contact.export.EcoDataHandler
        public boolean handleEcoPacket(@NotNull String str, int i, @Nullable u7r u7rVar) throws RemoteException {
            d6o.this.c(i, u7rVar);
            return false;
        }
    }

    public d6o(String str) {
        this.f15149b = str;
    }

    public static d6o a(String str) {
        Map<String, d6o> map = e;
        d6o d6oVar = map.get(str);
        if (d6oVar == null) {
            synchronized (d6o.class) {
                try {
                    d6oVar = map.get(str);
                    FitnessLogUtils.i("SportWearReceiver_eco", "receiver : " + d6oVar + ",did : " + str + ", thread :" + Thread.currentThread().getName());
                    if (d6oVar == null) {
                        d6oVar = new d6o(str);
                        map.put(str, d6oVar);
                        FitnessLogUtils.i("SportWearReceiver_eco", "map size :" + map.size());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d6oVar;
    }

    public void b() {
        FitnessLogUtils.i("SportWearReceiver_eco", "init , this:" + this + ", did:" + this.f15149b);
        SportDeviceModel.INSTANCE.getDeviceSyncManager().addDataHandler(8, this.c);
    }

    public void c(int i, u7r u7rVar) throws RemoteException {
        FitnessLogUtils.w("SportWearReceiver_eco", "WearPacket is" + u7rVar);
        if (u7rVar == null || u7rVar.e != 8) {
            FitnessLogUtils.w("SportWearReceiver_eco", "not fitness type");
            return;
        }
        vr9 vr9VarR = u7rVar.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w("SportWearReceiver_eco", "fitnessProto is null");
        }
        FitnessLogUtils.d("SportWearReceiver_eco", "type : " + i + ",packet : " + u7rVar.f);
        int i2 = u7rVar.f;
        if (i2 == 26) {
            FitnessLogUtils.i("SportWearReceiver_eco", "onReceiveSportRequest()");
            k(vr9VarR.C());
            return;
        }
        if (i2 == 28) {
            l(vr9VarR.F());
            return;
        }
        if (i2 == 30) {
            FitnessLogUtils.i("SportWearReceiver_eco", "onReceiveSportPreRequest()");
            return;
        }
        if (i2 == 50) {
            m(vr9VarR.G());
            return;
        }
        if (i2 == 64) {
            j(vr9VarR.u());
            return;
        }
        if (i2 == 33) {
            FitnessLogUtils.i("SportWearReceiver_eco", "onReceiveEcgData()");
            return;
        }
        if (i2 == 34) {
            FitnessLogUtils.i("SportWearReceiver_eco", "onReceiveEcgStatus()");
            return;
        }
        if (i2 == 66) {
            i(vr9VarR.t());
            return;
        }
        if (i2 == 67) {
            g(vr9VarR.w().c);
            return;
        }
        switch (i2) {
            case 69:
                d(vr9VarR.s());
                break;
            case 70:
                e(vr9VarR.p());
                break;
            case 71:
                f(vr9VarR.r().c);
                break;
            case 72:
                h(vr9VarR.q());
                break;
        }
    }

    public final void d(yr9 yr9Var) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportWearReceiver_eco", "eventId : " + yr9Var.c);
        FitnessLogUtils.d("SportWearReceiver_eco", "eventValue : " + yr9Var.d);
        ene eneVarV = g2o.s().v(SportDeviceModel.INSTANCE.curGymDeviceModel());
        if (eneVarV != null && yr9Var.c == 0 && yr9Var.d == 1) {
            eneVarV.L();
        }
    }

    public final void e(ir9 ir9Var) throws RemoteException {
        g2o.s().v(g2o.s().p(g2o.s().t())).N0(ir9Var);
    }

    public final void f(tr9[] tr9VarArr) {
        for (tr9 tr9Var : tr9VarArr) {
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.d("SportWearReceiver_eco", "Eco state : " + tr9Var.c);
            FitnessLogUtils.d("SportWearReceiver_eco", "Eco targetRpm : " + tr9Var.g);
            FitnessLogUtils.d("SportWearReceiver_eco", "Eco resistanceLevel : " + tr9Var.e);
            FitnessLogUtils.d("SportWearReceiver_eco", "Eco targetPower : " + tr9Var.f);
            FitnessLogUtils.d("SportWearReceiver_eco", "Eco duration : " + tr9Var.d);
        }
        ene eneVarV = g2o.s().v(g2o.s().p(g2o.s().t()));
        if (eneVarV != null) {
            eneVarV.O0(tr9VarArr);
        }
    }

    public final void g(fs9[] fs9VarArr) throws RemoteException {
        g2o.s().v(g2o.s().p(g2o.s().t())).P0(fs9VarArr);
    }

    public final void h(sr9 sr9Var) throws RemoteException {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d("SportWearReceiver_eco", "ftpState.countdown : " + sr9Var.g);
        FitnessLogUtils.d("SportWearReceiver_eco", "ftpState.stage : " + sr9Var.d);
        FitnessLogUtils.d("SportWearReceiver_eco", "ftpState.lightOnNumber : " + sr9Var.f);
        FitnessLogUtils.d("SportWearReceiver_eco", "ftpState.retryCount : " + sr9Var.e);
        FitnessLogUtils.d("SportWearReceiver_eco", "ftpState.version : " + sr9Var.c);
        ene eneVarV = g2o.s().v(g2o.s().p(g2o.s().t()));
        if (eneVarV != null) {
            eneVarV.Q0(sr9Var);
        }
    }

    public final void i(as9 as9Var) {
        FitnessLogUtils.i("SportWearReceiver_eco", "GYMData , distance : " + as9Var.f);
        kdn.f().e().h(uv9.d(as9Var));
    }

    public final void j(cs9 cs9Var) {
        if (System.currentTimeMillis() - this.d.longValue() < 1000) {
            return;
        }
        this.d = Long.valueOf(System.currentTimeMillis());
        FitnessLogUtils.i("SportWearReceiver_eco", "gymRequest ： " + cs9Var);
        if (cs9Var == null) {
            FitnessLogUtils.i("SportWearReceiver_eco", "gymRequest == null");
            return;
        }
        ene eneVarV = g2o.s().v(SportDeviceModel.INSTANCE.curGymDeviceModel());
        SportRequestData sportRequestDataF = uv9.f(cs9Var);
        if (eneVarV != null) {
            eneVarV.f(sportRequestDataF);
        }
    }

    public final void k(gu9 gu9Var) {
        if (gu9Var == null) {
            FitnessLogUtils.w("SportWearReceiver_eco", "sportRequest is null");
            return;
        }
        this.f15148a = uv9.g(gu9Var);
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.i("SportWearReceiver_eco", "onReceiveSportRequest " + this.f15148a);
        g2o g2oVarS = g2o.s();
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        gv2 gv2VarO = g2oVarS.o(sportDeviceModel.getDeviceModelByDid(this.f15149b));
        AppAndDeviceSportStateServer.getInstance().notifyDeviceAloneSportStateChanged(this.f15148a);
        if (gv2VarO.d(this.f15148a) == 0) {
            gv2VarO.f(this.f15148a);
            SportRequestData sportRequestData = this.f15148a;
            int i = sportRequestData.supportVersions;
            if (sportRequestData.sportState == 4) {
                boolean z = g2o.s().A(sportDeviceModel.getDeviceModelByDid(this.f15149b)) instanceof gv2;
            }
        }
    }

    public final void l(fv9 fv9Var) {
        if (fv9Var == null) {
            FitnessLogUtils.w("SportWearReceiver_eco", "wearSportData is null");
        } else {
            kdn.f().e().onReceiveWearData(uv9.l(fv9Var));
        }
    }

    public final void m(hv9 hv9Var) {
        if (hv9Var == null) {
            FitnessLogUtils.w("SportWearReceiver_eco", "wearSportDataV2A is null");
        } else {
            kdn.f().e().onReceiveWearData(uv9.m(hv9Var));
        }
    }
}
