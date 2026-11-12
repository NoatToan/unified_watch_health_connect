package com.huami.watch.companion.arch;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import com.huami.watch.companion.arch.HeartRateSettingViewModel;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.util.Rx;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateSettingViewModel extends AndroidViewModel {
    private static final String a = "HealthData-HeartRateSetting";
    public final MediatorLiveData<String> disturbData;
    public final MutableLiveData<Boolean> isAfData;
    public final MediatorLiveData<Boolean> isAllDayHrData;
    public final MutableLiveData<Boolean> isAllDayStressData;
    public final MutableLiveData<Result> statusData;

    public HeartRateSettingViewModel(@NonNull Application application) {
        super(application);
        MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        this.isAllDayHrData = mediatorLiveData;
        this.isAllDayStressData = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.isAfData = mutableLiveData;
        this.disturbData = new MediatorLiveData<>();
        this.statusData = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        mediatorLiveData.setValue(bool);
        mutableLiveData.setValue(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.isAllDayHrData.postValue(Boolean.valueOf(HealthData.isAllDayHR(getApplication())));
        this.isAllDayStressData.postValue(Boolean.valueOf(HealthData.isAllDayStress(getApplication())));
        if (DeviceManager.getManager(getApplication()).isCurrentDeviceBLE()) {
            SyncBleUtil.syncUserHeartRateAllDayFromWatch(new Consumer() { // from class: yz3
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.a.B(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Object obj) {
        if (obj != null) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Application application = getApplication();
            String healthSettingHRAllDay = HealthData.getHealthSettingHRAllDay(application, zBooleanValue);
            HealthData.saveHealthSetting(application, healthSettingHRAllDay);
            HealthData.updateUserIsAllDayHR(healthSettingHRAllDay);
            this.isAllDayHrData.setValue(Boolean.valueOf(zBooleanValue));
            P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(Object obj) {
        if (obj != null) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Application application = getApplication();
            String healthSettingAllDayStress = HealthData.getHealthSettingAllDayStress(application, zBooleanValue);
            HealthData.saveHealthSetting(application, healthSettingAllDayStress);
            HealthData.updateIsAllDayStress(healthSettingAllDayStress);
            this.isAllDayStressData.setValue(Boolean.valueOf(zBooleanValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        SyncUtil.syncUserHeartRateAllDayToWatch(getApplication(), true, new Consumer() { // from class: e04
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                HeartRateSettingViewModel.D((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(String str, Boolean bool) {
        if (!bool.booleanValue()) {
            this.statusData.postValue(Result.error());
        } else {
            this.disturbData.postValue(str);
            this.statusData.postValue(Result.success(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(final String str) {
        this.statusData.postValue(Result.loading());
        SyncUtil.syncAfDisturbTimeToWatch(getApplication(), str, new Consumer() { // from class: zz3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.F(str, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(boolean z, Boolean bool) {
        if (bool.booleanValue()) {
            this.isAfData.postValue(Boolean.valueOf(z));
            this.statusData.postValue(Result.success(Boolean.valueOf(z)));
        } else {
            this.isAfData.postValue(Boolean.valueOf(!z));
            this.statusData.postValue(Result.error());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(final boolean z) {
        this.statusData.postValue(Result.loading());
        SyncUtil.syncAtrialFibrillationToWatch(getApplication(), z, new Consumer() { // from class: b04
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.H(z, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(boolean z, Boolean bool) {
        if (!bool.booleanValue()) {
            this.statusData.postValue(Result.error());
        } else {
            this.isAllDayHrData.postValue(Boolean.valueOf(z));
            this.statusData.postValue(Result.success(Boolean.valueOf(z)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(final boolean z) {
        this.statusData.postValue(Result.loading());
        SyncUtil.syncUserHeartRateAllDayToWatch(getApplication(), z, new Consumer() { // from class: c04
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.J(z, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z, boolean z2, Boolean bool) {
        if (!bool.booleanValue()) {
            this.statusData.postValue(Result.error());
            return;
        }
        this.isAllDayHrData.postValue(Boolean.valueOf(z));
        this.statusData.postValue(Result.success(Boolean.valueOf(z)));
        R(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(final boolean z, final boolean z2) {
        this.statusData.postValue(Result.loading());
        SyncUtil.syncUserHeartRateAllDayToWatch(getApplication(), z, new Consumer() { // from class: d04
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.L(z, z2, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(boolean z, Boolean bool) {
        if (!bool.booleanValue()) {
            this.statusData.postValue(Result.error());
        } else {
            this.isAllDayStressData.postValue(Boolean.valueOf(z));
            this.statusData.postValue(Result.success(Boolean.valueOf(z)));
        }
    }

    private void O() {
        Rx.io(new Runnable() { // from class: pz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z();
            }
        }).safeSubscribe();
    }

    private void P() {
        SyncBleUtil.requestIsAllDayStress(new Consumer() { // from class: xz3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.C(obj);
            }
        });
    }

    private void Q() {
        if (this.isAllDayHrData.getValue() == null || !this.isAllDayHrData.getValue().booleanValue()) {
            this.isAllDayHrData.postValue(Boolean.TRUE);
            Rx.io(new Runnable() { // from class: qz3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.E();
                }
            }).safeSubscribe();
        }
    }

    private void R(final boolean z) {
        SyncUtil.sendAllDayStress(getApplication(), z, new Consumer() { // from class: a04
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.a.N(z, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(Object obj) {
        if (obj != null) {
            this.isAllDayHrData.setValue((Boolean) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.isAllDayHrData.postValue(Boolean.valueOf(HealthData.isAllDayHR(getApplication())));
        if (DeviceManager.getManager(getApplication()).isCurrentDeviceBLE()) {
            SyncBleUtil.syncUserHeartRateAllDayFromWatch(new Consumer() { // from class: nz3
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.a.v(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        boolean zIsAtrialFibrillation = HealthData.isAtrialFibrillation(getApplication());
        boolean zIsAllDayHR = HealthData.isAllDayHR(getApplication());
        if (zIsAtrialFibrillation && !zIsAllDayHR) {
            SyncUtil.syncAtrialFibrillationToWatch(getApplication(), false, new Consumer() { // from class: f04
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    HeartRateSettingViewModel.y((Boolean) obj);
                }
            });
            zIsAtrialFibrillation = false;
        }
        this.isAfData.postValue(Boolean.valueOf(zIsAtrialFibrillation));
        this.disturbData.postValue(HealthData.getAfDisturbTime(getApplication()));
    }

    public void init() {
        Rx.io(new Runnable() { // from class: sz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w();
            }
        }).safeSubscribe();
    }

    public void initAf() {
        this.isAllDayHrData.addSource(this.isAfData, new Observer() { // from class: oz3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.x((Boolean) obj);
            }
        });
        O();
    }

    public void loadIsAllDayHeartRateAndStress() {
        Rx.io(new Runnable() { // from class: rz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A();
            }
        }).safeSubscribe();
    }

    public void updateDisturbTime(@NonNull final String str) {
        Rx.io(new Runnable() { // from class: tz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G(str);
            }
        }).safeSubscribe();
    }

    public void updateIsAf(final boolean z) {
        Rx.io(new Runnable() { // from class: vz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I(z);
            }
        }).safeSubscribe();
    }

    public void updateIsAllDay(final boolean z) {
        Rx.io(new Runnable() { // from class: uz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K(z);
            }
        }).safeSubscribe();
    }

    public void updateIsAllDayHeartRateAndStress(final boolean z, final boolean z2) {
        Rx.io(new Runnable() { // from class: wz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M(z, z2);
            }
        }).safeSubscribe();
    }
}
