package com.xiaomi.fitness.research.device;

import android.os.IBinder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import com.xiaomi.fitness.research.device.DeviceInfoAccessorImpl;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import defpackage.y56;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/research/device/DeviceInfoAccessorImpl;", "Lcom/xiaomi/fitness/research/device/DeviceInfoAccessor;", "", "did", "", "isAvailable", "(Ljava/lang/String;)Z", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "getDeviceInfo", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getCurrentDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Ly56;", "<set-?>", "mDeviceInfoFetcher$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMDeviceInfoFetcher", "()Ly56;", "setMDeviceInfoFetcher", "(Ly56;)V", "mDeviceInfoFetcher", "isConnected", "()Z", "", "getDeviceStatus", "()I", "deviceStatus", "<init>", "()V", "Companion", "research-support_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceInfoAccessorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoAccessorImpl.kt\ncom/xiaomi/fitness/research/device/DeviceInfoAccessorImpl\n+ 2 GsonExt.kt\ncom/xiaomi/fitness/common/extensions/GsonExtKt\n*L\n1#1,60:1\n63#2:61\n53#2,7:62\n*S KotlinDebug\n*F\n+ 1 DeviceInfoAccessorImpl.kt\ncom/xiaomi/fitness/research/device/DeviceInfoAccessorImpl\n*L\n42#1:61\n42#1:62,7\n*E\n"})
public final class DeviceInfoAccessorImpl implements DeviceInfoAccessor {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DeviceInfoAccessorImpl.class, "mDeviceInfoFetcher", "getMDeviceInfoFetcher()Lcom/xiaomi/fitness/research/DeviceInfoFetcher;", 0))};
    public static final int DEVICE_FETCHER_BINDER_CODE = 501;

    /* JADX INFO: renamed from: mDeviceInfoFetcher$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mDeviceInfoFetcher = new BinderDelegate("DeviceInfoFetcher");

    public DeviceInfoAccessorImpl() {
        ServiceConnector.INSTANCE.getBinder(501, new Function1() { // from class: x56
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceInfoAccessorImpl._init_$lambda$0(this.f38714a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DeviceInfoAccessorImpl this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMDeviceInfoFetcher(y56.a.asInterface(iBinder));
        return Unit.INSTANCE;
    }

    private final y56 getMDeviceInfoFetcher() {
        return (y56) this.mDeviceInfoFetcher.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final boolean isAvailable(String did) {
        y56 mDeviceInfoFetcher = getMDeviceInfoFetcher();
        return (mDeviceInfoFetcher != null ? mDeviceInfoFetcher.getDeviceModel(did) : null) != null;
    }

    private final void setMDeviceInfoFetcher(y56 y56Var) {
        this.mDeviceInfoFetcher.setValue((Object) this, $$delegatedProperties[0], y56Var);
    }

    @Override // com.xiaomi.fitness.research.device.DeviceInfoAccessor
    @Nullable
    public WearableDeviceModel getCurrentDeviceModel() {
        DeviceModelRemote currentDeviceModel;
        y56 mDeviceInfoFetcher = getMDeviceInfoFetcher();
        if (mDeviceInfoFetcher == null || (currentDeviceModel = mDeviceInfoFetcher.getCurrentDeviceModel()) == null) {
            return null;
        }
        y56 mDeviceInfoFetcher2 = getMDeviceInfoFetcher();
        Intrinsics.checkNotNull(mDeviceInfoFetcher2);
        return new DeviceModelClient(mDeviceInfoFetcher2, currentDeviceModel.getDid());
    }

    @Override // com.xiaomi.fitness.research.device.DeviceInfoAccessor
    @Nullable
    public WearableDeviceInfo getDeviceInfo(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        y56 mDeviceInfoFetcher = getMDeviceInfoFetcher();
        String deviceInfo = mDeviceInfoFetcher != null ? mDeviceInfoFetcher.getDeviceInfo(did) : null;
        if (deviceInfo == null || deviceInfo.length() == 0) {
            return null;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(8, 128).enableComplexMapKeySerialization().serializeNulls().serializeSpecialFloatingPointValues().setLenient();
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "create(...)");
        return (WearableDeviceInfo) gsonCreate.fromJson(deviceInfo, new TypeToken<WearableDeviceInfo>() { // from class: com.xiaomi.fitness.research.device.DeviceInfoAccessorImpl$getDeviceInfo$$inlined$jsonToBean$1
        }.getType());
    }

    @Override // com.xiaomi.fitness.research.device.DeviceInfoAccessor
    @Nullable
    public WearableDeviceModel getDeviceModel(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        if (!isAvailable(did)) {
            return null;
        }
        y56 mDeviceInfoFetcher = getMDeviceInfoFetcher();
        Intrinsics.checkNotNull(mDeviceInfoFetcher);
        return new DeviceModelClient(mDeviceInfoFetcher, did);
    }

    @Override // com.xiaomi.fitness.research.device.DeviceInfoAccessor
    public int getDeviceStatus() {
        y56 mDeviceInfoFetcher = getMDeviceInfoFetcher();
        if (mDeviceInfoFetcher != null) {
            return mDeviceInfoFetcher.getCurrentStatus();
        }
        return -1;
    }

    @Override // com.xiaomi.fitness.research.device.DeviceInfoAccessor
    public boolean isConnected() {
        y56 mDeviceInfoFetcher = getMDeviceInfoFetcher();
        if (mDeviceInfoFetcher != null) {
            return mDeviceInfoFetcher.isCurrentConnected();
        }
        return false;
    }
}
