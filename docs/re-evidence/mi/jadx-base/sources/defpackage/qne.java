package defpackage;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportResponseData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes10.dex */
public class qne extends eco {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31676b;
    public cen c;
    public zyc d;

    public class a implements InvocationHandler {
        public a() {
        }

        public final /* synthetic */ void b(int i, SportResponseData sportResponseData) {
            if (sportResponseData.isRequestSuccess()) {
                if (qne.this.c != null) {
                    qne.this.c.onSportRestarted();
                }
            } else if (f2o.x().I() != null) {
                f2o.x().h0(f2o.x().I(), 3, null);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr == null) {
                return null;
            }
            SportRequestData sportRequestData = (SportRequestData) objArr[0];
            FitnessLogUtils.i(qne.this.f31676b, "wear proxy notifySportRequest " + sportRequestData);
            int i = sportRequestData.sportState;
            if (i == 1) {
                qne.this.c = f2o.x().H();
                if (qne.this.c != null) {
                    jdn.h().e(qne.this.c.getClass(), qne.this.c);
                    f2o.x().h(qne.this.c.getClass(), qne.this.c);
                    qne.this.c.onSportStarted(sportRequestData.code, sportRequestData.timeStamp, sportRequestData.timeZone, 3, sportRequestData.sportLaunchType);
                }
            } else if (i == 2) {
                qne.super.f(sportRequestData.sportType, null, null);
                if (qne.this.c != null) {
                    qne.this.c.onSportPaused();
                }
            } else if (i == 3) {
                qne.super.a(sportRequestData.sportType, null, new SportRequestCallback() { // from class: nne
                    @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
                    public final void call(int i2, SportResponseData sportResponseData) {
                        this.f28088a.b(i2, sportResponseData);
                    }
                });
            } else if (i == 4) {
                qne.super.d(sportRequestData.sportType, null, null);
                if (qne.this.c != null) {
                    qne.this.c.onSportFinished(true, null, null);
                }
            }
            return null;
        }
    }

    public qne(kzc kzcVar) {
        super(kzcVar);
        this.f31676b = "LocalSportStateDecorator";
        this.c = null;
        this.d = (zyc) Proxy.newProxyInstance(zyc.class.getClassLoader(), new Class[]{zyc.class}, new a());
    }

    public static /* synthetic */ void q(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (f2o.x().w() == null || f2o.x().w().B() != 4 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (f2o.x().I() != null) {
            f2o.x().p(f2o.x().I(), 3, null);
        }
    }

    public static /* synthetic */ void r(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (f2o.x().w().B() != 2 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (f2o.x().I() != null) {
            f2o.x().h0(f2o.x().I(), 3, null);
        }
    }

    public static /* synthetic */ void s(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        if (f2o.x().w().B() != 3 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (f2o.x().I() != null) {
            f2o.x().m0(f2o.x().I(), 3, null);
        }
    }

    @Override // defpackage.eco, defpackage.kzc
    public void a(int i, WearableDeviceModel wearableDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.a(i, wearableDeviceModel, new SportRequestCallback() { // from class: fne
            @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
            public final void call(int i2, SportResponseData sportResponseData) {
                qne.s(sportRequestCallback, i2, sportResponseData);
            }
        });
    }

    @Override // defpackage.eco, defpackage.kzc
    public void d(int i, WearableDeviceModel wearableDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.d(i, wearableDeviceModel, new SportRequestCallback() { // from class: jne
            @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
            public final void call(int i2, SportResponseData sportResponseData) {
                qne.q(sportRequestCallback, i2, sportResponseData);
            }
        });
    }

    @Override // defpackage.eco, defpackage.kzc
    @SuppressLint({"WrongConstant"})
    public void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.e(sportRequestData, wearableDeviceModel, new SportRequestCallback() { // from class: lne
            @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
            public final void call(int i, SportResponseData sportResponseData) {
                this.f25241a.t(sportRequestCallback, i, sportResponseData);
            }
        });
    }

    @Override // defpackage.eco, defpackage.kzc
    @SuppressLint({"WrongConstant"})
    public void f(int i, WearableDeviceModel wearableDeviceModel, final SportRequestCallback sportRequestCallback) {
        super.f(i, wearableDeviceModel, new SportRequestCallback() { // from class: hne
            @Override // com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback
            public final void call(int i2, SportResponseData sportResponseData) {
                qne.r(sportRequestCallback, i2, sportResponseData);
            }
        });
    }

    public final /* synthetic */ void t(SportRequestCallback sportRequestCallback, int i, SportResponseData sportResponseData) {
        FitnessLogUtils.i(this.f31676b, "sportState : " + i + ", sportResponseData:" + sportResponseData.isRequestSuccess());
        if (f2o.x().w() == null || f2o.x().w().B() != 1 || !sportResponseData.isRequestSuccess() || sportResponseData.isNotSport) {
            sportRequestCallback.call(i, sportResponseData);
            return;
        }
        sportRequestCallback.call(i, sportResponseData);
        if (f2o.x().I() == null || !f2o.x().I().getIsDeviceConnected()) {
            return;
        }
        f2o.x().w0(f2o.x().I(), new SportRequestData.a().z(3).x(i).o(), this.d, null);
    }
}
