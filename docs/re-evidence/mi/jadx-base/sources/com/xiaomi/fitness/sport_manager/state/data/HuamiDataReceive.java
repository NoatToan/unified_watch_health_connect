package com.xiaomi.fitness.sport_manager.state.data;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.hm.health.bt.sdk.ISportHrCallback;
import defpackage.ed2;
import defpackage.f2o;
import defpackage.jdn;
import defpackage.rmc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/data/HuamiDataReceive;", "Lcom/xiaomi/fitness/device/manager/export/LFEventCallbackWrapper;", "Lcom/xiaomi/hm/health/bt/sdk/ISportHrCallback;", "<init>", "()V", "onSportStart", "", "isNeedGps", "", "onSportStop", "phoneMuteState", "onHeartRateChanged", "hr", "", "onOpen", "p0", "Companion", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiDataReceive extends LFEventCallbackWrapper implements ISportHrCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HuamiDataCallback";

    @Nullable
    private static HuamiDataReceive instance;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/data/HuamiDataReceive$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lcom/xiaomi/fitness/sport_manager/state/data/HuamiDataReceive;", "getInstance", "()Lcom/xiaomi/fitness/sport_manager/state/data/HuamiDataReceive;", "get", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HuamiDataReceive getInstance() {
            if (HuamiDataReceive.instance == null) {
                HuamiDataReceive.instance = new HuamiDataReceive(null);
            }
            return HuamiDataReceive.instance;
        }

        @NotNull
        public final synchronized HuamiDataReceive get() {
            HuamiDataReceive companion;
            companion = getInstance();
            Intrinsics.checkNotNull(companion);
            return companion;
        }
    }

    public /* synthetic */ HuamiDataReceive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ISportHrCallback
    public void onHeartRateChanged(int hr) {
        FitnessLogUtils.d("HuamiDataCallback", "huami hr :" + hr);
        jdn.h().g().n(hr);
    }

    @Override // com.xiaomi.hm.health.bt.sdk.ISportHrCallback
    public void onOpen(boolean p0) {
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void onSportStart(boolean isNeedGps) {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        Boolean boolValueOf = wearableDeviceModelCurDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(wearableDeviceModelCurDeviceModel)) : null;
        FitnessLogUtils.i("HuamiDataCallback", "huami device send start command to app , isNeedGps:" + isNeedGps + " , isHuami :" + boolValueOf);
        f2o.x().X(sportDeviceModel.curDeviceModel());
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            ed2 ed2VarF = f2o.x().F(sportDeviceModel.curDeviceModel());
            Intrinsics.checkNotNull(ed2VarF, "null cannot be cast to non-null type com.xiaomi.fitness.sport_manager.state.HuamiSportState");
            rmc rmcVar = (rmc) ed2VarF;
            if (isNeedGps) {
                rmcVar.o0();
            } else {
                rmcVar.n0();
            }
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void onSportStop() {
        SportDeviceModel sportDeviceModel = SportDeviceModel.INSTANCE;
        WearableDeviceModel wearableDeviceModelCurDeviceModel = sportDeviceModel.curDeviceModel();
        Boolean boolValueOf = wearableDeviceModelCurDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isHuaMi(wearableDeviceModelCurDeviceModel)) : null;
        FitnessLogUtils.i("HuamiDataCallback", "huami device send stop command to app , isHuami :" + boolValueOf);
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            ed2 ed2VarF = f2o.x().F(sportDeviceModel.curDeviceModel());
            Intrinsics.checkNotNull(ed2VarF, "null cannot be cast to non-null type com.xiaomi.fitness.sport_manager.state.HuamiSportState");
            ((rmc) ed2VarF).p0();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.LFEventCallbackWrapper, com.xiaomi.wearable.hm.s
    public void phoneMuteState() {
    }

    private HuamiDataReceive() {
        FitnessLogUtils.i("HuamiDataCallback", "HuamiDataCallback is init");
    }
}
