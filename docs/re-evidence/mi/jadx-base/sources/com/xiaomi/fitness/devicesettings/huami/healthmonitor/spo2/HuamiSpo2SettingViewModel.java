package com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HRDetectExtKt;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingViewModel;
import com.xiaomi.fitness.settingitem.settingitem.HRDetect;
import defpackage.qyi;
import defpackage.wzi;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0006J\f\u0010\u001a\u001a\u00020\u0006*\u00020\u001bH\u0002J\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\nH\u0002¢\u0006\u0002\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/HuamiSpo2SettingViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/BaseHuamiHealthMonitorViewModel;", "Lcom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/Spo2Model;", "<init>", "()V", "curLowSpo2IntervalIndex", "", "getCurLowSpo2IntervalIndex", "()I", "lowSpo2WarningIntervals", "", "lowSpo2WarningIntervalStrs", "", "", "getLowSpo2WarningIntervalStrs", "()[Ljava/lang/String;", "lowSpo2WarningIntervalStrs$delegate", "Lkotlin/Lazy;", "isSupportEndurance", "", "()Z", "enableSpo2", "", "switchOn", "setLowSpo2", "intervalIndex", "getCurLowSpo2WarningInterval", "Lcom/xiaomi/fitness/settingitem/settingitem/HRDetect;", "trans2Spo2IntervalStrs", "([I)[Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHuamiSpo2SettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuamiSpo2SettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/HuamiSpo2SettingViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,65:1\n11188#2:66\n11523#2,3:67\n37#3:70\n36#3,3:71\n*S KotlinDebug\n*F\n+ 1 HuamiSpo2SettingViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/healthmonitor/spo2/HuamiSpo2SettingViewModel\n*L\n58#1:66\n58#1:67,3\n64#1:70\n64#1:71,3\n*E\n"})
public final class HuamiSpo2SettingViewModel extends BaseHuamiHealthMonitorViewModel<Spo2Model> {

    /* JADX INFO: renamed from: lowSpo2WarningIntervalStrs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy lowSpo2WarningIntervalStrs;

    @NotNull
    private final int[] lowSpo2WarningIntervals;

    public HuamiSpo2SettingViewModel() {
        getType().postValue(2);
        this.lowSpo2WarningIntervals = new int[]{80, 85, 90, 0};
        this.lowSpo2WarningIntervalStrs = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: imc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiSpo2SettingViewModel.lowSpo2WarningIntervalStrs_delegate$lambda$0(this.f21292a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enableSpo2$lambda$2(HuamiSpo2SettingViewModel this$0, boolean z) {
        HuamiApiCaller huamiDevice;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel deviceModel = this$0.getDeviceModel();
        boolean zEnableSpo2 = (deviceModel == null || (huamiDevice = DeviceModelExtKt.getHuamiDevice(deviceModel)) == null) ? false : huamiDevice.enableSpo2(z);
        if (zEnableSpo2) {
            this$0.getMConfig().setSpo2Enable(z);
        }
        Logger.i(this$0.getTAG(), "setSpo2AllDayDetectionSwitch(" + z + ") result:" + zEnableSpo2);
        return zEnableSpo2;
    }

    private final int getCurLowSpo2WarningInterval(HRDetect hRDetect) {
        if (hRDetect.isLowSpo2WarningEnable()) {
            return hRDetect.getLowSpo2WarningValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] lowSpo2WarningIntervalStrs_delegate$lambda$0(HuamiSpo2SettingViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.trans2Spo2IntervalStrs(this$0.lowSpo2WarningIntervals);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setLowSpo2$lambda$4(HuamiSpo2SettingViewModel this$0, int i) {
        HuamiApiCaller huamiDevice;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceModel deviceModel = this$0.getDeviceModel();
        boolean lowSpo2 = (deviceModel == null || (huamiDevice = DeviceModelExtKt.getHuamiDevice(deviceModel)) == null) ? false : huamiDevice.setLowSpo2(i);
        if (lowSpo2) {
            HRDetectExtKt.setLowSpo2WarningThreshold(this$0.getMConfig(), i);
        }
        Logger.i(this$0.getTAG(), "setHypoxemiaReminderInterval(" + i + ") result:" + lowSpo2);
        return lowSpo2;
    }

    private final String[] trans2Spo2IntervalStrs(int[] iArr) {
        String string;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i > 0) {
                string = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qyi.m, i, Integer.valueOf(i));
            } else {
                string = ApplicationExtKt.getApplication().getString(wzi.q3);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            arrayList.add(string);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void enableSpo2(final boolean switchOn) {
        syncModelConfig(new Function0() { // from class: hmc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HuamiSpo2SettingViewModel.enableSpo2$lambda$2(this.f20233a, switchOn));
            }
        });
    }

    public final int getCurLowSpo2IntervalIndex() {
        return ArraysKt___ArraysKt.indexOf(this.lowSpo2WarningIntervals, getCurLowSpo2WarningInterval(getMConfig()));
    }

    @NotNull
    public final String[] getLowSpo2WarningIntervalStrs() {
        return (String[]) this.lowSpo2WarningIntervalStrs.getValue();
    }

    @Override // com.xiaomi.fitness.devicesettings.huami.healthmonitor.BaseHuamiHealthMonitorViewModel
    public boolean isSupportEndurance() {
        return false;
    }

    public final void setLowSpo2(int intervalIndex) {
        final int i = this.lowSpo2WarningIntervals[intervalIndex];
        syncModelConfig(new Function0() { // from class: jmc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(HuamiSpo2SettingViewModel.setLowSpo2$lambda$4(this.f22923a, i));
            }
        });
    }
}
