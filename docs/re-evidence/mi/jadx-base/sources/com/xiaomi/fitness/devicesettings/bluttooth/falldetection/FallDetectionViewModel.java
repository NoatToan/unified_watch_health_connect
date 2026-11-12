package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.emergencycontact.EmergencyContactHelper;
import com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionViewModel;
import com.xiaomi.onetrack.OneTrack;
import defpackage.dg4;
import defpackage.eg4;
import defpackage.fg4;
import defpackage.s7r;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0 J\u0011\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\"¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010'\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionModel;", "<init>", "()V", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "animationUrl", "Landroidx/lifecycle/MutableLiveData;", "", "getAnimationUrl", "()Landroidx/lifecycle/MutableLiveData;", "animationUrl$delegate", "loadAnimation", "", "loadData", "onSosContactChecked", "isChecked", "", "onSosContactSmsChecked", "onshareLocationChecked", "onFallDetectionChecked", "onCallMedicalSwitch", "setResult", "getSetResult", "setResult$delegate", "syncSosContactInfo", "getPermissions", "", "getDescriptions", "", "()[Ljava/lang/String;", "track", "btnName", "status", "TAG", "getTAG", "()Ljava/lang/String;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFallDetectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FallDetectionViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,183:1\n37#2:184\n36#2,3:185\n37#2:188\n36#2,3:189\n*S KotlinDebug\n*F\n+ 1 FallDetectionViewModel.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/falldetection/FallDetectionViewModel\n*L\n100#1:184\n100#1:185,3\n166#1:188\n166#1:189,3\n*E\n"})
public final class FallDetectionViewModel extends BaseViewModel<FallDetectionModel> {

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q99
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FallDetectionViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: animationUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animationUrl = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r99
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FallDetectionViewModel.animationUrl_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: setResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s99
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FallDetectionViewModel.setResult_delegate$lambda$4();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData animationUrl_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAnimation$lambda$2(FallDetectionViewModel this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && str.length() != 0) {
            this$0.getAnimationUrl().postValue(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setResult_delegate$lambda$4() {
        return new MutableLiveData();
    }

    private final void syncSosContactInfo() {
        dg4 dg4Var = new dg4();
        fg4 fg4Var = new fg4();
        fg4Var.c = getMModel().getSosContactSwitchOn().get();
        int i = 0;
        fg4Var.d = false;
        FallDetectionHelper fallDetectionHelper = FallDetectionHelper.INSTANCE;
        if (!fallDetectionHelper.getSLocalEmergencyContactList().isEmpty()) {
            fg4Var.e = fallDetectionHelper.getSLocalEmergencyContactList().get(0);
            if (fallDetectionHelper.getSLocalEmergencyContactList().size() > 1) {
                fg4Var.f = (eg4[]) fallDetectionHelper.getSLocalEmergencyContactList().subList(1, fallDetectionHelper.getSLocalEmergencyContactList().size()).toArray(new eg4[0]);
            }
        }
        fg4Var.h = getMModel().getFallDetectionSwitchOn().get() ? 1 : 2;
        fg4Var.g = getMModel().getSosContactSmsSwitchOn().get() ? 1 : 2;
        if (getMModel().getSupportShareLocation().get()) {
            i = getMModel().getShareLocationSwitchOn().get() ? 1 : 2;
        }
        fg4Var.j = i;
        fg4Var.i = getMModel().getCallMedicalSwitchOn().get();
        dg4Var.v(fg4Var);
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 1;
        s7rVar.Q(dg4Var);
        Logger.i(getTAG(), "syncSosContactInfo: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionViewModel.syncSosContactInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(FallDetectionViewModel.this.getTAG(), "set sos fail: " + code);
                FallDetectionViewModel.this.getSetResult().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result == null || !result.isSuccess()) {
                    onError(did, type, 255);
                } else {
                    Logger.i(FallDetectionViewModel.this.getTAG(), "set sos success");
                    FallDetectionViewModel.this.getSetResult().postValue(Boolean.TRUE);
                }
            }
        }, 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<String> getAnimationUrl() {
        return (MutableLiveData) this.animationUrl.getValue();
    }

    @NotNull
    public final String[] getDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ResourceExtKt.getString(wzi.m4));
        arrayList.add(ResourceExtKt.getString(wzi.p4));
        arrayList.add(ResourceExtKt.getString(wzi.p4));
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add(ResourceExtKt.getString(wzi.i4));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    @NotNull
    public final List<String> getPermissions() {
        List<String> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf("android.permission.ACCESS_FINE_LOCATION", "android.permission.SEND_SMS", "android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT >= 29) {
            listMutableListOf.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        return listMutableListOf;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSetResult() {
        return (MutableLiveData) this.setResult.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FallDetectionViewModel";
    }

    public final void loadAnimation() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        EmergencyContactHelper.INSTANCE.requestAnimationJson(wearableDeviceModel, new Function1() { // from class: t99
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FallDetectionViewModel.loadAnimation$lambda$2(this.f34474a, (String) obj);
            }
        });
    }

    public final void loadData() {
        s7r s7rVar = new s7r();
        s7rVar.e = 21;
        s7rVar.f = 0;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.falldetection.FallDetectionViewModel.loadData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FallDetectionViewModel.this.getMModel().getSosContactLoaded().set(true);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                dg4 dg4VarR;
                dg4 dg4VarR2;
                if (result != null) {
                    String tag = FallDetectionViewModel.this.getTAG();
                    s7r packet = result.getPacket();
                    fg4 fg4VarP = null;
                    Logger.i(tag, "loadData: " + ((packet == null || (dg4VarR2 = packet.r()) == null) ? null : dg4VarR2.p()));
                    FallDetectionModel mModel = FallDetectionViewModel.this.getMModel();
                    s7r packet2 = result.getPacket();
                    if (packet2 != null && (dg4VarR = packet2.r()) != null) {
                        fg4VarP = dg4VarR.p();
                    }
                    mModel.setEmergencyContact(fg4VarP);
                }
                FallDetectionViewModel.this.getMModel().getSosContactLoaded().set(true);
            }
        }, 0, 8, null);
    }

    public final void onCallMedicalSwitch(boolean isChecked) {
        getMModel().getCallMedicalSwitchOn().set(isChecked);
        syncSosContactInfo();
        track("call_120", isChecked);
    }

    public final void onFallDetectionChecked(boolean isChecked) {
        getMModel().getFallDetectionSwitchOn().set(isChecked);
        syncSosContactInfo();
        track("fall_detection", isChecked);
    }

    public final void onSosContactChecked(boolean isChecked) {
        getMModel().getSosContactSwitchOn().set(isChecked);
        syncSosContactInfo();
        track("emergency_sos", isChecked);
    }

    public final void onSosContactSmsChecked(boolean isChecked) {
        getMModel().getSosContactSmsSwitchOn().set(isChecked);
        syncSosContactInfo();
        track(OneTrack.Event.SEND_MESSAGE, isChecked);
    }

    public final void onshareLocationChecked(boolean isChecked) {
        getMModel().getShareLocationSwitchOn().set(isChecked);
        syncSosContactInfo();
        track("share_location", isChecked);
    }

    public final void track(@NotNull String btnName, boolean status) {
        Intrinsics.checkNotNullParameter(btnName, "btnName");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("tip", "56.33.1.1.40649");
        pairArr[1] = TuplesKt.to("name", "sos_btn_name");
        pairArr[2] = TuplesKt.to("btn_name", btnName);
        pairArr[3] = TuplesKt.to("status", status ? "1" : "0");
        oneTrackExtKt.reportData("click_v3", MapsKt__MapsKt.mapOf(pairArr));
    }
}
