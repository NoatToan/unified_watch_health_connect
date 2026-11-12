package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.sport_eco_manager.sensor.SportFuncRequest;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class kdn implements drc, vyc {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile kdn f23756k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PhoneSportData f23758b;
    public j0o c;
    public c36 d;
    public zth e;
    public um5 f;
    public fsc j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23757a = "SportDataCenter";
    public Handler g = new Handler(Looper.getMainLooper());
    public Map<Class, ISportDataChangedListener> h = new ConcurrentHashMap();
    public long i = 0;

    public kdn() {
        FitnessLogUtils.i(this.f23757a, "SportDataCenter");
        um5 um5Var = new um5(this);
        this.f = um5Var;
        this.e = new zth(this, um5Var);
        this.d = new c36(this, this.f);
        this.c = new j0o(1000L, this.e);
        g2o.s().e(this.f.getClass(), this.f);
    }

    public static kdn f() {
        if (f23756k == null) {
            synchronized (kdn.class) {
                try {
                    if (f23756k == null) {
                        f23756k = new kdn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23756k;
    }

    @Override // defpackage.drc
    public void a(final y7r y7rVar) {
        if (g2o.s().O()) {
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.d(this.f23757a, "notifyWearDataChanged: " + y7rVar);
            this.g.post(new Runnable() { // from class: idn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21032a.j(y7rVar);
                }
            });
        }
    }

    @Override // defpackage.drc
    public void b(PhoneSportData phoneSportData) {
        if (g2o.s().L() == 14) {
            if (System.currentTimeMillis() - this.i > 100) {
                this.f23758b = phoneSportData;
                l(phoneSportData);
                this.i = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (System.currentTimeMillis() - this.i > 800) {
            this.f23758b = phoneSportData;
            k(phoneSportData);
            this.i = System.currentTimeMillis();
        }
    }

    public void d(Class cls, ISportDataChangedListener iSportDataChangedListener) {
        Iterator<ISportDataChangedListener> it = this.h.values().iterator();
        while (it.hasNext()) {
            if (iSportDataChangedListener == it.next()) {
                return;
            }
        }
        if (iSportDataChangedListener != null) {
            this.h.put(cls, iSportDataChangedListener);
            FitnessLogUtils.i(this.f23757a, "addSportDataChangedListener , listener:" + iSportDataChangedListener);
        }
    }

    public c36 e() {
        return this.d;
    }

    public PhoneSportData g() {
        if (this.f23758b == null) {
            this.f23758b = new PhoneSportData();
        }
        return this.f23758b;
    }

    public fsc h() {
        return this.j;
    }

    public boolean i(ISportDataChangedListener iSportDataChangedListener) {
        Iterator<ISportDataChangedListener> it = this.h.values().iterator();
        while (it.hasNext()) {
            if (it.next() == iSportDataChangedListener) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void j(y7r y7rVar) {
        for (ISportDataChangedListener iSportDataChangedListener : this.h.values()) {
            if (iSportDataChangedListener != null) {
                iSportDataChangedListener.onReceiveWearData(y7rVar);
            }
        }
    }

    public void k(PhoneSportData phoneSportData) {
        long jE = phoneSportData.deviceDuration;
        if (jE == 0) {
            jE = g2o.s().E();
        }
        phoneSportData.duration = (int) jE;
        phoneSportData.sportType = g2o.s().L();
        SportData sportDataZ = g2o.s().z();
        if (sportDataZ != null) {
            phoneSportData.calorie += sportDataZ.cal * 1000;
            phoneSportData.distance += sportDataZ.distance;
        }
        FitnessLogUtils.i(this.f23757a, "notifyPhoneDataChanged: " + phoneSportData);
        for (ISportDataChangedListener iSportDataChangedListener : this.h.values()) {
            if (iSportDataChangedListener != null) {
                iSportDataChangedListener.onPhoneDataChanged(phoneSportData);
            }
        }
    }

    public void l(PhoneSportData phoneSportData) {
        if (!g2o.s().j()) {
            FitnessLogUtils.i(this.f23757a, "checkSportRopeSkipping : false");
            return;
        }
        long jE = phoneSportData.deviceDuration;
        if (jE == 0) {
            jE = g2o.s().E();
        }
        phoneSportData.duration = (int) jE;
        phoneSportData.sportType = g2o.s().L();
        FitnessLogUtils.i(this.f23757a, "notifyRopeSkippingDataChanged: " + phoneSportData);
        for (ISportDataChangedListener iSportDataChangedListener : this.h.values()) {
            FitnessLogUtils.i(this.f23757a, "notifyRopeSkippingDataChanged: " + iSportDataChangedListener.getClass().getSimpleName());
            iSportDataChangedListener.onPhoneDataChanged(phoneSportData);
        }
    }

    public void m() {
        this.d.b();
        this.e.b();
    }

    public void n(int i, int i2) {
        SportFuncRequest sportFuncRequest = new SportFuncRequest();
        if (i == 0) {
            sportFuncRequest.c(true);
            sportFuncRequest.d(true);
            sportFuncRequest.a(true);
        }
        if (i == 1) {
            sportFuncRequest.c(true);
            if (g2o.s().C() != null) {
                g2o.s().e(g2o.s().C().getClass(), g2o.s().C());
                f().d(g2o.s().C().getClass(), g2o.s().C());
            }
        }
        this.c.a(sportFuncRequest);
        g2o.s().e(this.c.getClass(), this.c);
    }

    public void o(Class cls, ISportDataChangedListener iSportDataChangedListener) {
        if (iSportDataChangedListener != null) {
            this.h.remove(cls);
            FitnessLogUtils fitnessLogUtils = FitnessLogUtils.INSTANCE;
            FitnessLogUtils.i(this.f23757a, "removeSportDataChangedListener ：" + iSportDataChangedListener);
        }
    }

    public void p(fsc fscVar) {
        this.j = fscVar;
    }
}
