package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes10.dex */
public class pne extends fco {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30558b;
    public den c;
    public azc d;

    public class a implements InvocationHandler {
        public a() {
        }

        public final /* synthetic */ void b(int i, SportResponseData sportResponseData) {
            if (sportResponseData.isRequestSuccess()) {
                if (pne.this.c != null) {
                    pne.this.c.onSportRestarted();
                }
            } else if (g2o.s().D() != null) {
                g2o.s().U(g2o.s().D(), g2o.s().r(), null);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr == null) {
                return null;
            }
            SportRequestData sportRequestData = (SportRequestData) objArr[0];
            FitnessLogUtils.i(pne.this.f30558b, "wear proxy notifySportRequest " + sportRequestData);
            int i = sportRequestData.sportState;
            if (i == 1) {
                pne.this.c = g2o.s().C();
                if (pne.this.c != null) {
                    kdn.f().d(pne.this.c.getClass(), pne.this.c);
                    g2o.s().e(pne.this.c.getClass(), pne.this.c);
                    pne.this.c.onSportStarted(sportRequestData.timeStamp, sportRequestData.timeZone, g2o.s().r(), sportRequestData.sportLaunchType);
                }
            } else if (i == 2) {
                pne.super.b(sportRequestData.sportType, null, null);
                if (pne.this.c != null) {
                    pne.this.c.onSportPaused();
                }
            } else if (i == 3) {
                pne.super.e(sportRequestData.sportType, null, new SportRequestCallback() { // from class: one
                    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
                    public final void call(int i2, SportResponseData sportResponseData) {
                        this.f29318a.b(i2, sportResponseData);
                    }
                });
            } else if (i == 4) {
                pne.super.h(sportRequestData.sportType, null, null);
                if (pne.this.c != null) {
                    pne.this.c.onSportFinished(true, null);
                }
            }
            return null;
        }
    }

    public pne(lzc lzcVar) {
        super(lzcVar);
        this.f30558b = "LocalSportStateDecorator";
        this.c = null;
        this.d = (azc) Proxy.newProxyInstance(azc.class.getClassLoader(), new Class[]{azc.class}, new a());
    }

    public static /* synthetic */ void p(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (g2o.s().q() == null || g2o.s().q().y() != 4 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (g2o.s().D() != null) {
            g2o.s().m(g2o.s().D(), g2o.s().r(), null);
        }
    }

    public static /* synthetic */ void q(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (g2o.s().q().y() != 2 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (g2o.s().D() != null) {
            g2o.s().U(g2o.s().D(), g2o.s().r(), null);
        }
    }

    public static /* synthetic */ void r(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (g2o.s().q().y() != 3 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (g2o.s().D() != null) {
            g2o.s().Y(g2o.s().D(), g2o.s().r(), null);
        }
    }

    @Override // defpackage.fco, defpackage.lzc
    @SuppressLint({"WrongConstant"})
    public void b(int i, EcoDeviceModel ecoDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.b(i, ecoDeviceModel, new SportRequestCallback() { // from class: gne
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
            public final void call(int i2, SportResponseData sportResponseData) {
                pne.q(sportRequestCallback, i2, sportResponseData);
            }
        });
    }

    @Override // defpackage.fco, defpackage.lzc
    public void e(int i, EcoDeviceModel ecoDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.e(i, ecoDeviceModel, new SportRequestCallback() { // from class: ine
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
            public final void call(int i2, SportResponseData sportResponseData) {
                pne.r(sportRequestCallback, i2, sportResponseData);
            }
        });
    }

    @Override // defpackage.fco, defpackage.lzc
    @SuppressLint({"WrongConstant"})
    public void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.g(sportRequestData, ecoDeviceModel, new SportRequestCallback() { // from class: mne
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
            public final void call(int i, SportResponseData sportResponseData) {
                this.f27026a.s(sportRequestCallback, i, sportResponseData);
            }
        });
    }

    @Override // defpackage.fco, defpackage.lzc
    public void h(int i, EcoDeviceModel ecoDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.h(i, ecoDeviceModel, new SportRequestCallback() { // from class: kne
            @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback
            public final void call(int i2, SportResponseData sportResponseData) {
                pne.p(sportRequestCallback, i2, sportResponseData);
            }
        });
    }

    public final /* synthetic */ void s(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        FitnessLogUtils.i(this.f30558b, "sportState : " + i + ", sportResponseData:" + sportResponseData.isRequestSuccess());
        if (g2o.s().q() == null || g2o.s().q().y() != 1 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (g2o.s().D() == null || !g2o.s().D().getIsDeviceConnected()) {
            return;
        }
        g2o.s().i0(g2o.s().D(), new SportRequestData.a().s(g2o.s().r()).p(i).j(), this.d, null);
    }
}
