package com.xiaomi.fitness.devicesettings.bluttooth.applayout;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.kwo;
import defpackage.s7r;
import defpackage.txo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u0016R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\b¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "status", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;", "getStatus", "()Landroidx/lifecycle/MutableLiveData;", "status$delegate", "Lkotlin/Lazy;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getAppLayout", "getWatchAppLayout", "getWatchShape", "", "getWatchAppLayoutSetting", "shape", "(Ljava/lang/Integer;)V", "setAppLayoutRet", "Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$SetAppLayoutRet;", "getSetAppLayoutRet", "setAppLayoutRet$delegate", "setAppLayout", "display", "position", "GetAppLayoutRet", "GetWatchAppLayoutRet", "SetAppLayoutRet", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppLayoutSettingViewModel extends AbsViewModel {

    /* JADX INFO: renamed from: status$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy status = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sg1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppLayoutSettingViewModel.status_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: setAppLayoutRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setAppLayoutRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tg1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppLayoutSettingViewModel.setAppLayoutRet_delegate$lambda$1();
        }
    });

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$SetAppLayoutRet;", "", "success", "", "code", "", "position", "<init>", "(ZII)V", "getSuccess", "()Z", "getCode", "()I", "getPosition", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetAppLayoutRet {
        private final int code;
        private final int position;
        private final boolean success;

        public SetAppLayoutRet(boolean z, int i, int i2) {
            this.success = z;
            this.code = i;
            this.position = i2;
        }

        public static /* synthetic */ SetAppLayoutRet copy$default(SetAppLayoutRet setAppLayoutRet, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = setAppLayoutRet.success;
            }
            if ((i3 & 2) != 0) {
                i = setAppLayoutRet.code;
            }
            if ((i3 & 4) != 0) {
                i2 = setAppLayoutRet.position;
            }
            return setAppLayoutRet.copy(z, i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        @NotNull
        public final SetAppLayoutRet copy(boolean success, int code, int position) {
            return new SetAppLayoutRet(success, code, position);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetAppLayoutRet)) {
                return false;
            }
            SetAppLayoutRet setAppLayoutRet = (SetAppLayoutRet) other;
            return this.success == setAppLayoutRet.success && this.code == setAppLayoutRet.code && this.position == setAppLayoutRet.position;
        }

        public final int getCode() {
            return this.code;
        }

        public final int getPosition() {
            return this.position;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.code)) * 31) + Integer.hashCode(this.position);
        }

        @NotNull
        public String toString() {
            return "SetAppLayoutRet(success=" + this.success + ", code=" + this.code + ", position=" + this.position + ")";
        }

        public /* synthetic */ SetAppLayoutRet(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, i, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    private final void getWatchAppLayoutSetting(final Integer shape) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 31;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel.getWatchAppLayoutSetting.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                AppLayoutSettingViewModel.this.getStatus().postValue(new GetAppLayoutRet(true, 255, shape, Boolean.FALSE));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                kwo kwoVarO;
                txo txoVarE2;
                kwo kwoVarO2;
                txo txoVarE3;
                kwo kwoVarO3;
                Intrinsics.checkNotNull(result);
                if (!SyncResultExitKt.isSuccess(result)) {
                    AppLayoutSettingViewModel.this.getStatus().postValue(new GetAppLayoutRet(true, 255, shape, Boolean.FALSE));
                    return;
                }
                s7r packet = result.getPacket();
                Integer numValueOf = null;
                Integer numValueOf2 = (packet == null || (txoVarE3 = packet.E()) == null || (kwoVarO3 = txoVarE3.o()) == null) ? null : Integer.valueOf(kwoVarO3.c);
                Intrinsics.checkNotNull(numValueOf2);
                int iIntValue = numValueOf2.intValue();
                s7r packet2 = result.getPacket();
                boolean z = !((packet2 == null || (txoVarE2 = packet2.E()) == null || (kwoVarO2 = txoVarE2.o()) == null || kwoVarO2.d != 0) ? false : true);
                s7r packet3 = result.getPacket();
                if (packet3 != null && (txoVarE = packet3.E()) != null && (kwoVarO = txoVarE.o()) != null) {
                    numValueOf = Integer.valueOf(kwoVarO.d);
                }
                Logger.i("getAppLayout result supportLayouts: " + numValueOf, new Object[0]);
                AppLayoutSettingViewModel.this.getStatus().postValue(new GetAppLayoutRet(true, iIntValue, shape, Boolean.valueOf(z)));
            }
        }, 0, 8, null);
    }

    private final int getWatchShape() {
        Product product;
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Product.Size size = (mDeviceModel == null || (product = mDeviceModel.getProduct()) == null) ? null : product.getSize();
        if (size == null) {
            return 1;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        int radius = size.getRadius();
        double d = width;
        if ((d * 1.0d) / ((double) height) >= 0.8d) {
            return width == radius * 2 ? 1 : 2;
        }
        return (((double) radius) * 1.0d) / d >= 0.5d ? 3 : 4;
    }

    public static /* synthetic */ void setAppLayout$default(AppLayoutSettingViewModel appLayoutSettingViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        appLayoutSettingViewModel.setAppLayout(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setAppLayoutRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData status_delegate$lambda$0() {
        return new MutableLiveData();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getAppLayout() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 31;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel.getAppLayout.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i("getAppLayout errorCode: " + code, new Object[0]);
                AppLayoutSettingViewModel.this.getStatus().postValue(new GetAppLayoutRet(false, code, null, null, 12, null));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                txo txoVarE;
                kwo kwoVarO;
                Intrinsics.checkNotNull(result);
                if (!SyncResultExitKt.isSuccess(result)) {
                    AppLayoutSettingViewModel.this.getStatus().postValue(new GetAppLayoutRet(false, 255, null, null, 12, null));
                    return;
                }
                s7r packet = result.getPacket();
                Integer numValueOf = (packet == null || (txoVarE = packet.E()) == null || (kwoVarO = txoVarE.o()) == null) ? null : Integer.valueOf(kwoVarO.c);
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue = numValueOf.intValue();
                Logger.i("getAppLayout result: " + iIntValue, new Object[0]);
                AppLayoutSettingViewModel.this.getStatus().postValue(new GetAppLayoutRet(true, iIntValue, null, null, 12, null));
            }
        }, 0, 8, null);
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @NotNull
    public final MutableLiveData<SetAppLayoutRet> getSetAppLayoutRet() {
        return (MutableLiveData) this.setAppLayoutRet.getValue();
    }

    @NotNull
    public final MutableLiveData<GetAppLayoutRet> getStatus() {
        return (MutableLiveData) this.status.getValue();
    }

    public final void getWatchAppLayout() {
        getWatchAppLayoutSetting(Integer.valueOf(getWatchShape()));
    }

    public final void setAppLayout(int display, final int position) {
        kwo kwoVar = new kwo();
        kwoVar.c = display;
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 41;
        txo txoVar = new txo();
        txoVar.U(kwoVar);
        s7rVar.c0(txoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.applayout.AppLayoutSettingViewModel.setAppLayout.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                AppLayoutSettingViewModel.this.getSetAppLayoutRet().postValue(new SetAppLayoutRet(false, code, position));
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Intrinsics.checkNotNull(result);
                if (SyncResultExitKt.isSuccess(result)) {
                    AppLayoutSettingViewModel.this.getSetAppLayoutRet().postValue(new SetAppLayoutRet(true, 0, position));
                } else {
                    AppLayoutSettingViewModel.this.getSetAppLayoutRet().postValue(new SetAppLayoutRet(false, result.getCode(), position));
                }
            }
        }, 0, 8, null);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J:\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;", "", "success", "", "status", "", "shape", "supportGridText", "<init>", "(ZILjava/lang/Integer;Ljava/lang/Boolean;)V", "getSuccess", "()Z", "getStatus", "()I", "getShape", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSupportGridText", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(ZILjava/lang/Integer;Ljava/lang/Boolean;)Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetAppLayoutRet;", "equals", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GetAppLayoutRet {

        @Nullable
        private final Integer shape;
        private final int status;
        private final boolean success;

        @Nullable
        private final Boolean supportGridText;

        public GetAppLayoutRet(boolean z, int i, @Nullable Integer num, @Nullable Boolean bool) {
            this.success = z;
            this.status = i;
            this.shape = num;
            this.supportGridText = bool;
        }

        public static /* synthetic */ GetAppLayoutRet copy$default(GetAppLayoutRet getAppLayoutRet, boolean z, int i, Integer num, Boolean bool, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = getAppLayoutRet.success;
            }
            if ((i2 & 2) != 0) {
                i = getAppLayoutRet.status;
            }
            if ((i2 & 4) != 0) {
                num = getAppLayoutRet.shape;
            }
            if ((i2 & 8) != 0) {
                bool = getAppLayoutRet.supportGridText;
            }
            return getAppLayoutRet.copy(z, i, num, bool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getShape() {
            return this.shape;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getSupportGridText() {
            return this.supportGridText;
        }

        @NotNull
        public final GetAppLayoutRet copy(boolean success, int status, @Nullable Integer shape, @Nullable Boolean supportGridText) {
            return new GetAppLayoutRet(success, status, shape, supportGridText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAppLayoutRet)) {
                return false;
            }
            GetAppLayoutRet getAppLayoutRet = (GetAppLayoutRet) other;
            return this.success == getAppLayoutRet.success && this.status == getAppLayoutRet.status && Intrinsics.areEqual(this.shape, getAppLayoutRet.shape) && Intrinsics.areEqual(this.supportGridText, getAppLayoutRet.supportGridText);
        }

        @Nullable
        public final Integer getShape() {
            return this.shape;
        }

        public final int getStatus() {
            return this.status;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        public final Boolean getSupportGridText() {
            return this.supportGridText;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.status)) * 31;
            Integer num = this.shape;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.supportGridText;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "GetAppLayoutRet(success=" + this.success + ", status=" + this.status + ", shape=" + this.shape + ", supportGridText=" + this.supportGridText + ")";
        }

        public /* synthetic */ GetAppLayoutRet(boolean z, int i, Integer num, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/applayout/AppLayoutSettingViewModel$GetWatchAppLayoutRet;", "", "status", "", "drawable", "name", "", "isSelect", "", "<init>", "(IILjava/lang/String;Z)V", "getStatus", "()I", "getDrawable", "getName", "()Ljava/lang/String;", "()Z", "setSelect", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GetWatchAppLayoutRet {
        private final int drawable;
        private boolean isSelect;

        @NotNull
        private final String name;
        private final int status;

        public GetWatchAppLayoutRet(int i, int i2, @NotNull String name, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.status = i;
            this.drawable = i2;
            this.name = name;
            this.isSelect = z;
        }

        public static /* synthetic */ GetWatchAppLayoutRet copy$default(GetWatchAppLayoutRet getWatchAppLayoutRet, int i, int i2, String str, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = getWatchAppLayoutRet.status;
            }
            if ((i3 & 2) != 0) {
                i2 = getWatchAppLayoutRet.drawable;
            }
            if ((i3 & 4) != 0) {
                str = getWatchAppLayoutRet.name;
            }
            if ((i3 & 8) != 0) {
                z = getWatchAppLayoutRet.isSelect;
            }
            return getWatchAppLayoutRet.copy(i, i2, str, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDrawable() {
            return this.drawable;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsSelect() {
            return this.isSelect;
        }

        @NotNull
        public final GetWatchAppLayoutRet copy(int status, int drawable, @NotNull String name, boolean isSelect) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new GetWatchAppLayoutRet(status, drawable, name, isSelect);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetWatchAppLayoutRet)) {
                return false;
            }
            GetWatchAppLayoutRet getWatchAppLayoutRet = (GetWatchAppLayoutRet) other;
            return this.status == getWatchAppLayoutRet.status && this.drawable == getWatchAppLayoutRet.drawable && Intrinsics.areEqual(this.name, getWatchAppLayoutRet.name) && this.isSelect == getWatchAppLayoutRet.isSelect;
        }

        public final int getDrawable() {
            return this.drawable;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.status) * 31) + Integer.hashCode(this.drawable)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSelect);
        }

        public final boolean isSelect() {
            return this.isSelect;
        }

        public final void setSelect(boolean z) {
            this.isSelect = z;
        }

        @NotNull
        public String toString() {
            return "GetWatchAppLayoutRet(status=" + this.status + ", drawable=" + this.drawable + ", name=" + this.name + ", isSelect=" + this.isSelect + ")";
        }

        public /* synthetic */ GetWatchAppLayoutRet(int i, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, str, (i3 & 8) != 0 ? false : z);
        }
    }
}
