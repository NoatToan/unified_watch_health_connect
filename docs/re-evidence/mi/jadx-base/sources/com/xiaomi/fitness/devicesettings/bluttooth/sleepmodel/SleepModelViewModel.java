package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SleepModelViewModel;
import com.xiaomi.fitness.devicesettings.export.DeviceSettingsExportPreference;
import defpackage.q14;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "sleepModelData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "status", "", "loadCode", "Landroidx/lifecycle/MutableLiveData;", "getLoadCode", "()Landroidx/lifecycle/MutableLiveData;", "loadCode$delegate", "Lkotlin/Lazy;", "setCode", "getSetCode", "setCode$delegate", "loadSleepModelData", "", "onSyncSystemScheduleCheck", "isChecked", "", "onCustomizeScheduleViewCheck", "onSetAlarmViewCheck", "updateSleepModel", TSMAuthContants.PARAM_RESOURCE, "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepModelViewModel extends BaseViewModel<SleepModelModel> {

    @NotNull
    private final String TAG = "SleepModelViewModel";

    /* JADX INFO: renamed from: loadCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadCode = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nqm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepModelViewModel.loadCode_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setCode = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oqm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepModelViewModel.setCode_delegate$lambda$1();
        }
    });

    @Nullable
    private SleepModelData sleepModelData;
    private int status;

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadCode_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSleepModelData$lambda$2(SleepModelViewModel this$0, int i, q14 q14Var) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 0) {
            Logger.i(this$0.getTAG(), "loadSleepModelData fail: " + i);
            this$0.getLoadCode().postValue(Integer.valueOf(i));
        } else if (q14Var != null) {
            Logger.i(this$0.getTAG(), "result.source = " + q14Var.c);
            int i2 = q14Var.c;
            if (i2 == 0) {
                SleepModelManager sleepModelManager = SleepModelManager.INSTANCE;
                SleepModelData sleepModelDataByMIUI = sleepModelManager.getSleepModelDataByMIUI();
                this$0.sleepModelData = sleepModelDataByMIUI;
                int scheduleStatus = sleepModelManager.getScheduleStatus(sleepModelDataByMIUI);
                this$0.status = scheduleStatus;
                if (scheduleStatus == 3) {
                    this$0.sleepModelData = sleepModelManager.initWhileFirst();
                }
            } else if (i2 == 1) {
                SleepModelManager sleepModelManager2 = SleepModelManager.INSTANCE;
                SleepModelData sleepModelDataByMIUI2 = sleepModelManager2.getSleepModelDataByMIUI();
                this$0.sleepModelData = sleepModelDataByMIUI2;
                this$0.status = sleepModelManager2.getScheduleStatus(sleepModelDataByMIUI2);
            } else if (i2 == 2) {
                this$0.sleepModelData = SleepModelManager.INSTANCE.transferProtoToModel(q14Var);
                this$0.status = 3;
            }
            Logger.i(this$0.getTAG(), "status: " + this$0.status);
            Logger.i(this$0.getTAG(), "get SleepModelData: " + this$0.sleepModelData);
            SleepModelData sleepModelData = this$0.sleepModelData;
            if (sleepModelData != null) {
                if (sleepModelData != null) {
                    sleepModelData.setGetupClock(q14Var.e);
                }
                this$0.getMModel().setStatus(this$0.status);
                SleepModelModel mModel = this$0.getMModel();
                SleepModelData sleepModelData2 = this$0.sleepModelData;
                Intrinsics.checkNotNull(sleepModelData2);
                mModel.setSleepModelData(sleepModelData2);
                this$0.getLoadCode().postValue(0);
            } else {
                this$0.getLoadCode().postValue(255);
            }
        } else {
            Logger.i(this$0.getTAG(), "loadSleepModelData result == null");
            this$0.getLoadCode().postValue(Integer.valueOf(i));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setCode_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepModel$lambda$3(SleepModelViewModel this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getSetCode().postValue(num);
        return Unit.INSTANCE;
    }

    @NotNull
    public final MutableLiveData<Integer> getLoadCode() {
        return (MutableLiveData) this.loadCode.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> getSetCode() {
        return (MutableLiveData) this.setCode.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    public final void loadSleepModelData() {
        SleepModelManager.INSTANCE.loadSleepModelData(new Function2() { // from class: mqm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SleepModelViewModel.loadSleepModelData$lambda$2(this.f27106a, ((Integer) obj).intValue(), (q14) obj2);
            }
        });
    }

    public final void onCustomizeScheduleViewCheck(boolean isChecked) {
        getMModel().getSwitchOn().postValue(Boolean.valueOf(isChecked));
        DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(isChecked);
        updateSleepModel(isChecked ? 2 : 0);
    }

    public final void onSetAlarmViewCheck(boolean isChecked) {
        getMModel().getSetAlarmSwitch().set(isChecked);
        getMModel().getSleepModelData().setGetupClock(isChecked ? 1 : 2);
        updateSleepModel(2);
    }

    public final void onSyncSystemScheduleCheck(boolean isChecked) {
        getMModel().getSwitchOn().postValue(Boolean.valueOf(isChecked));
        DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(isChecked);
        updateSleepModel(isChecked ? 1 : 0);
    }

    public final void updateSleepModel(int resource) {
        SleepModelManager.INSTANCE.updateSleepModelData(getMModel().getSleepModelData(), resource, new Function1() { // from class: lqm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepModelViewModel.updateSleepModel$lambda$3(this.f25358a, (Integer) obj);
            }
        });
    }
}
