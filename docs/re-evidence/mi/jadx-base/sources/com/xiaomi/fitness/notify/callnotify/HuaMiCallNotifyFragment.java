package com.xiaomi.fitness.notify.callnotify;

import android.os.Bundle;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.HuaMiNotifySettingImpl;
import com.xiaomi.fitness.notify.callnotify.HuaMiCallNotifyFragment;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.InCall;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.bg4;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.q0j;
import defpackage.vc0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0004R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/HuaMiCallNotifyFragment;", "Lcom/xiaomi/fitness/notify/callnotify/BaseCallNotifyFragment;", "", "doUploadConfig", "()V", "initInCall", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "loadInCallConfig", "updateInCallConfig", "", "getDid", "()Ljava/lang/String;", "onVisible", "onInvisible", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Ljz6;", "disposable", "Ljz6;", "getDisposable", "()Ljz6;", "setDisposable", "(Ljz6;)V", "", "mHuaMiCallNotifyFragmentVisibleTime", "J", "<init>", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HuaMiCallNotifyFragment extends BaseCallNotifyFragment {

    @Nullable
    private WearableDeviceModel deviceModel;

    @Nullable
    private jz6 disposable;
    private long mHuaMiCallNotifyFragmentVisibleTime;

    private final void doUploadConfig() {
        Logger.d(BaseCallNotifyFragment.TAG, "updateInCallConfig configStr=" + getInCall());
        InCall inCall = getInCall();
        if (inCall != null) {
            DeviceSettingManager.INSTANCE.getInstance().sendSettingItem(getDid(), DeviceSettingConfigKey.KEY_INCALL, inCall);
            HuaMiNotifySettingImpl.INSTANCE.getInstance().setInCall(getDid(), inCall);
        }
    }

    private final void initInCall() {
        setInCall(new InCall());
        InCall inCall = getInCall();
        Intrinsics.checkNotNull(inCall);
        inCall.setIncallNotifyEnabled(false);
        InCall inCall2 = getInCall();
        Intrinsics.checkNotNull(inCall2);
        inCall2.setIncallContactNotifyEnabled(false);
        InCall inCall3 = getInCall();
        Intrinsics.checkNotNull(inCall3);
        inCall3.setIncallNameDisplayEnabled(false);
        InCall inCall4 = getInCall();
        Intrinsics.checkNotNull(inCall4);
        inCall4.setIncomingCallReply(false);
        InCall inCall5 = getInCall();
        Intrinsics.checkNotNull(inCall5);
        inCall5.setInComingCallNotifyTime(SportSummary.VERSION_103);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateInCallConfig$lambda$0(HuaMiCallNotifyFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.doUploadConfig();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateInCallConfig$lambda$2(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateInCallConfig$lambda$4() {
    }

    @Nullable
    public final WearableDeviceModel getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment
    @NotNull
    public String getDid() {
        String did;
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        return (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) ? "" : did;
    }

    @Nullable
    public final jz6 getDisposable() {
        return this.disposable;
    }

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment
    public void loadInCallConfig() {
        if (this.deviceModel == null) {
            return;
        }
        DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        Intrinsics.checkNotNull(wearableDeviceModel);
        SettingItemEntity settingItem = companion.readSettingItem(wearableDeviceModel.getDid(), DeviceSettingConfigKey.KEY_INCALL);
        if (settingItem.getValue() != null) {
            Object objValueToObject = settingItem.valueToObject(InCall.class);
            Intrinsics.checkNotNull(objValueToObject, "null cannot be cast to non-null type com.xiaomi.fitness.settingitem.settingitem.InCall");
            setInCall((InCall) objValueToObject);
        } else {
            initInCall();
        }
        onGetInCallConfig();
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        this.deviceModel = wearableDeviceModel;
        if (wearableDeviceModel == null) {
            finish();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            this.mHuaMiCallNotifyFragmentVisibleTime = 0L;
        } else {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.51.1.1.21561"), "name", "call_reminder_detail_page", "title", getString(q0j.l), "duration_sec", Long.valueOf((System.currentTimeMillis() - this.mHuaMiCallNotifyFragmentVisibleTime) / ((long) 1000)), "device_model", DeviceModelExtKt.getModel(wearableDeviceModel));
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mHuaMiCallNotifyFragmentVisibleTime = System.currentTimeMillis();
    }

    public final void setDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.deviceModel = wearableDeviceModel;
    }

    public final void setDisposable(@Nullable jz6 jz6Var) {
        this.disposable = jz6Var;
    }

    @Override // com.xiaomi.fitness.notify.callnotify.BaseCallNotifyFragment
    public void updateInCallConfig() {
        jz6 jz6Var = this.disposable;
        if (jz6Var == null || jz6Var == null || jz6Var.isDisposed()) {
            o4h o4hVarG = o4h.E("").g(500L, TimeUnit.MILLISECONDS);
            final Function1 function1 = new Function1() { // from class: yhc
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HuaMiCallNotifyFragment.updateInCallConfig$lambda$0(this.f40177a, (String) obj);
                }
            };
            bg4 bg4Var = new bg4() { // from class: zhc
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    HuaMiCallNotifyFragment.updateInCallConfig$lambda$1(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: aic
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HuaMiCallNotifyFragment.updateInCallConfig$lambda$2((Throwable) obj);
                }
            };
            this.disposable = o4hVarG.P(bg4Var, new bg4() { // from class: bic
                @Override // defpackage.bg4
                public final void accept(Object obj) {
                    HuaMiCallNotifyFragment.updateInCallConfig$lambda$3(function2, obj);
                }
            }, new vc0() { // from class: cic
                @Override // defpackage.vc0
                public final void run() {
                    HuaMiCallNotifyFragment.updateInCallConfig$lambda$4();
                }
            });
        }
    }
}
