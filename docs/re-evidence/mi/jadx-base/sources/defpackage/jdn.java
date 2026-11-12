package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_manager.sensor.SportFuncRequest;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportSensorDataChangedListener;
import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jdn implements crc, uyc {
    public static volatile jdn m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PhoneSportData f22681b;
    public k0o c;
    public b36 d;
    public oth e;
    public yth f;
    public tm5 g;
    public jxc l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22680a = "SportDataCenter";
    public Handler h = new Handler(Looper.getMainLooper());
    public Map<Class, ISportDataChangedListener> i = new ConcurrentHashMap();
    public Map<String, ISportSensorDataChangedListener> j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22682k = 0;

    public jdn() {
        FitnessLogUtils.i(this.f22680a, "SportDataCenter");
        tm5 tm5Var = new tm5(this);
        this.g = tm5Var;
        this.e = new oth(this, tm5Var);
        this.f = new yth(this, this.g);
        this.d = new b36(this, this.g);
        this.c = new k0o(1000L, this.e, this.f);
        f2o.x().h(this.g.getClass(), this.g);
        f2o.x().h(this.d.getClass(), this.d);
    }

    public static jdn h() {
        if (m == null) {
            synchronized (jdn.class) {
                try {
                    if (m == null) {
                        m = new jdn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    @Override // defpackage.crc
    public void a(PhoneSportData phoneSportData) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f22682k;
        if (jCurrentTimeMillis > 800 || jCurrentTimeMillis < 0) {
            n(phoneSportData);
            this.f22682k = System.currentTimeMillis();
        }
    }

    @Override // defpackage.crc
    public void b(SportLocationResult sportLocationResult) {
        m(sportLocationResult);
    }

    @Override // defpackage.crc
    public void c(final x7r x7rVar) {
        if (f2o.x().W()) {
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.d(this.f22680a, "notifyWearDataChanged: " + x7rVar);
            this.h.post(new Runnable() { // from class: hdn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19959a.l(x7rVar);
                }
            });
        }
    }

    public void e(Class cls, ISportDataChangedListener iSportDataChangedListener) {
        Iterator<ISportDataChangedListener> it = this.i.values().iterator();
        while (it.hasNext()) {
            if (iSportDataChangedListener == it.next()) {
                return;
            }
        }
        if (iSportDataChangedListener != null) {
            this.i.put(cls, iSportDataChangedListener);
            FitnessLogUtils.i(this.f22680a, "addSportDataChangedListener , listener:" + iSportDataChangedListener);
        }
    }

    public void f(String str, ISportSensorDataChangedListener iSportSensorDataChangedListener) {
        if (iSportSensorDataChangedListener != null) {
            this.j.put(str, iSportSensorDataChangedListener);
            FitnessLogUtils.i(this.f22680a, "addSportSensorDataChangedListener , key:" + str);
        }
    }

    public b36 g() {
        return this.d;
    }

    public PhoneSportData i() {
        if (this.f22681b == null) {
            this.f22681b = new PhoneSportData();
        }
        return this.f22681b;
    }

    public jxc j() {
        return this.l;
    }

    public boolean k(ISportDataChangedListener iSportDataChangedListener) {
        Iterator<ISportDataChangedListener> it = this.i.values().iterator();
        while (it.hasNext()) {
            if (it.next() == iSportDataChangedListener) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void l(x7r x7rVar) {
        for (ISportDataChangedListener iSportDataChangedListener : this.i.values()) {
            if (iSportDataChangedListener != null) {
                iSportDataChangedListener.onReceiveWearData(x7rVar);
            }
        }
    }

    public final void m(SportLocationResult sportLocationResult) {
        FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
        FitnessLogUtils.d(this.f22680a, "notifyLocationChanged" + sportLocationResult);
        for (ISportDataChangedListener iSportDataChangedListener : this.i.values()) {
            if (iSportDataChangedListener != null) {
                iSportDataChangedListener.onLocationChanged(sportLocationResult);
            }
        }
    }

    public void n(PhoneSportData phoneSportData) {
        long J = phoneSportData.deviceDuration;
        if (J == 0) {
            J = f2o.x().J();
        }
        phoneSportData.duration = (int) J;
        phoneSportData.sportType = f2o.x().T();
        SportData sportDataE = f2o.x().E();
        FitnessLogUtils.d(this.f22680a, "phoneSportData:" + phoneSportData.toString());
        if (sportDataE != null) {
            phoneSportData.calorie += sportDataE.cal * 1000;
            phoneSportData.distance += sportDataE.distance;
        }
        this.f22681b = phoneSportData;
        FitnessLogUtils.i(this.f22680a, "notifyPhoneDataChanged: " + phoneSportData);
        for (ISportDataChangedListener iSportDataChangedListener : this.i.values()) {
            if (iSportDataChangedListener != null) {
                iSportDataChangedListener.onPhoneDataChanged(phoneSportData);
            }
        }
    }

    public void o() {
        this.d.d();
        this.f.d();
        this.e.d();
    }

    public void p(int i, int i2) {
        SportFuncRequest sportFuncRequest = new SportFuncRequest();
        if (i == 0) {
            sportFuncRequest.c(true);
            sportFuncRequest.d(true);
            sportFuncRequest.a(true);
        }
        if (i == 1) {
            sportFuncRequest.c(true);
            if (f2o.x().H() != null) {
                f2o.x().h(f2o.x().H().getClass(), f2o.x().H());
                h().e(f2o.x().H().getClass(), f2o.x().H());
            }
        }
        this.c.a(sportFuncRequest);
        f2o.x().h(this.c.getClass(), this.c);
    }

    public void q(WearSensorData wearSensorData) {
        for (ISportSensorDataChangedListener iSportSensorDataChangedListener : this.j.values()) {
            if (iSportSensorDataChangedListener != null) {
                iSportSensorDataChangedListener.onReceiveWearSensorData(wearSensorData);
            }
        }
    }

    public void r(Class cls, ISportDataChangedListener iSportDataChangedListener) {
        if (iSportDataChangedListener != null) {
            this.i.remove(cls);
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i(this.f22680a, "removeSportDataChangedListener ：" + iSportDataChangedListener);
        }
    }

    public void s(String str, ISportSensorDataChangedListener iSportSensorDataChangedListener) {
        if (iSportSensorDataChangedListener != null) {
            this.j.remove(str);
            FitnessLogUtils.i(this.f22680a, "removeSportSensorDataChangedListener , key :" + str);
        }
    }

    public void t(jxc jxcVar) {
        this.l = jxcVar;
    }
}
