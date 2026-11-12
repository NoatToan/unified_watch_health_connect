package com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.sleepmodel.SetScheduleViewModel;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\tJ\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SetScheduleViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "sleepModelData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "status", "", "errorCode", "Landroidx/lifecycle/MutableLiveData;", "getErrorCode", "()Landroidx/lifecycle/MutableLiveData;", "errorCode$delegate", "Lkotlin/Lazy;", "loadSleepModelData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SetScheduleViewModel$LoadSleepModelData;", "getLoadSleepModelData", "loadSleepModelData$delegate", "", "loadFromMiui", "block", "Lkotlin/Function0;", "updateSleepModelData", TSMAuthContants.PARAM_RESOURCE, "attach", "savedInstanceState", "Landroid/os/Bundle;", "LoadSleepModelData", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetScheduleViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "SetScheduleViewModel";

    /* JADX INFO: renamed from: errorCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorCode = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pzl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SetScheduleViewModel.errorCode_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: loadSleepModelData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadSleepModelData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qzl
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SetScheduleViewModel.loadSleepModelData_delegate$lambda$1();
        }
    });

    @Nullable
    private SleepModelData sleepModelData;
    private int status;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SetScheduleViewModel$LoadSleepModelData;", "", "sleepModelData", "Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "status", "", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;I)V", "getSleepModelData", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/sleepmodel/SleepModelData;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadSleepModelData {

        @Nullable
        private final SleepModelData sleepModelData;
        private final int status;

        public LoadSleepModelData(@Nullable SleepModelData sleepModelData, int i) {
            this.sleepModelData = sleepModelData;
            this.status = i;
        }

        public static /* synthetic */ LoadSleepModelData copy$default(LoadSleepModelData loadSleepModelData, SleepModelData sleepModelData, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sleepModelData = loadSleepModelData.sleepModelData;
            }
            if ((i2 & 2) != 0) {
                i = loadSleepModelData.status;
            }
            return loadSleepModelData.copy(sleepModelData, i);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SleepModelData getSleepModelData() {
            return this.sleepModelData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        @NotNull
        public final LoadSleepModelData copy(@Nullable SleepModelData sleepModelData, int status) {
            return new LoadSleepModelData(sleepModelData, status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadSleepModelData)) {
                return false;
            }
            LoadSleepModelData loadSleepModelData = (LoadSleepModelData) other;
            return Intrinsics.areEqual(this.sleepModelData, loadSleepModelData.sleepModelData) && this.status == loadSleepModelData.status;
        }

        @Nullable
        public final SleepModelData getSleepModelData() {
            return this.sleepModelData;
        }

        public final int getStatus() {
            return this.status;
        }

        public int hashCode() {
            SleepModelData sleepModelData = this.sleepModelData;
            return ((sleepModelData == null ? 0 : sleepModelData.hashCode()) * 31) + Integer.hashCode(this.status);
        }

        @NotNull
        public String toString() {
            return "LoadSleepModelData(sleepModelData=" + this.sleepModelData + ", status=" + this.status + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData errorCode_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadSleepModelData$lambda$2(SetScheduleViewModel this$0, int i, q14 q14Var) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 0) {
            Logger.i(this$0.TAG, "loadSleepModelData fail: " + i);
            this$0.getErrorCode().postValue(Integer.valueOf(i));
            this$0.getLoadSleepModelData().postValue(new LoadSleepModelData(null, 3));
        } else if (q14Var != null) {
            Logger.i(this$0.TAG, "result.source = " + q14Var.c);
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
                this$0.getLoadSleepModelData().postValue(new LoadSleepModelData(this$0.sleepModelData, this$0.status));
            } else if (i2 == 1) {
                SleepModelManager sleepModelManager2 = SleepModelManager.INSTANCE;
                SleepModelData sleepModelDataByMIUI2 = sleepModelManager2.getSleepModelDataByMIUI();
                this$0.sleepModelData = sleepModelDataByMIUI2;
                this$0.status = sleepModelManager2.getScheduleStatus(sleepModelDataByMIUI2);
                this$0.getLoadSleepModelData().postValue(new LoadSleepModelData(this$0.sleepModelData, this$0.status));
            } else if (i2 == 2) {
                this$0.sleepModelData = SleepModelManager.INSTANCE.transferProtoToModel(q14Var);
                this$0.status = 3;
                this$0.getLoadSleepModelData().postValue(new LoadSleepModelData(this$0.sleepModelData, this$0.status));
            }
            Logger.i(this$0.TAG, "status: " + this$0.status);
            Logger.i(this$0.TAG, "get SleepModelData: " + this$0.sleepModelData);
        } else {
            Logger.i(this$0.TAG, "loadSleepModelData result == null");
            this$0.getErrorCode().postValue(Integer.valueOf(i));
            this$0.getLoadSleepModelData().postValue(new LoadSleepModelData(null, 3));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadSleepModelData_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSleepModelData$lambda$3(SetScheduleViewModel this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getErrorCode().postValue(num);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<Integer> getErrorCode() {
        return (MutableLiveData) this.errorCode.getValue();
    }

    @NotNull
    public final MutableLiveData<LoadSleepModelData> getLoadSleepModelData() {
        return (MutableLiveData) this.loadSleepModelData.getValue();
    }

    public final void loadFromMiui(@NotNull Function0<Unit> block) throws Throwable {
        Intrinsics.checkNotNullParameter(block, "block");
        SleepModelManager sleepModelManager = SleepModelManager.INSTANCE;
        SleepModelData sleepModelDataByMIUI = sleepModelManager.getSleepModelDataByMIUI();
        int scheduleStatus = sleepModelManager.getScheduleStatus(sleepModelDataByMIUI);
        DeviceSettingsExportPreference.INSTANCE.setKEY_IS_SYNC_SLEEP_MODEL(scheduleStatus == 1);
        getLoadSleepModelData().postValue(new LoadSleepModelData(sleepModelDataByMIUI, scheduleStatus));
        block.invoke();
    }

    public final void loadSleepModelData() {
        SleepModelManager.INSTANCE.loadSleepModelData(new Function2() { // from class: ozl
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SetScheduleViewModel.loadSleepModelData$lambda$2(this.f29847a, ((Integer) obj).intValue(), (q14) obj2);
            }
        });
    }

    public final void updateSleepModelData(@NotNull SleepModelData sleepModelData, int resource) {
        Intrinsics.checkNotNullParameter(sleepModelData, "sleepModelData");
        SleepModelManager.INSTANCE.updateSleepModelData(sleepModelData, resource, new Function1() { // from class: nzl
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SetScheduleViewModel.updateSleepModelData$lambda$3(this.f28591a, (Integer) obj);
            }
        });
    }
}
