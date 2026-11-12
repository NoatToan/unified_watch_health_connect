package com.xiaomi.wearable;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.BinderDelegate;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.HuamiApiClientImpl;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.hm.m;
import com.xiaomi.wearable.wear.api.IDeviceApiCall;
import defpackage.dtc;
import defpackage.etc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b \u0010!J%\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R/\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/wearable/HuamiApiClientImpl;", "Lcom/xiaomi/wearable/HuamiApiClient;", "", "mac", "did", "Lcom/xiaomi/wearable/hm/m;", "getRemoteHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/wearable/hm/m;", "Lcom/xiaomi/wearable/HuamiApiChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addHuamiApiChangeListener", "(Ljava/lang/String;Lcom/xiaomi/wearable/HuamiApiChangeListener;)V", "removeRemoteHuamiApi", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "getHuamiDeviceCall", "(Lcom/xiaomi/wearable/core/DeviceInfo;)Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", Home.JSON_KEY_ADDRESS, "removeHuamiDeviceCall", "(Ljava/lang/String;)V", "Letc;", "<set-?>", "mHuamiApiService$delegate", "Lcom/xiaomi/fitness/service/BinderDelegate;", "getMHuamiApiService", "()Letc;", "setMHuamiApiService", "(Letc;)V", "mHuamiApiService", "<init>", "()V", "Companion", "huami_release"}, k = 1, mv = {2, 0, 0})
public final class HuamiApiClientImpl implements HuamiApiClient {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HuamiApiClientImpl.class, "mHuamiApiService", "getMHuamiApiService()Lcom/xiaomi/wearable/common/connect/IHuamiApiService;", 0))};

    @NotNull
    private static final String TAG = "HuamiApiManagerImpl";

    /* JADX INFO: renamed from: mHuamiApiService$delegate, reason: from kotlin metadata */
    @NotNull
    private final BinderDelegate mHuamiApiService = new BinderDelegate("IHuamiApiService");

    public HuamiApiClientImpl() {
        ServiceConnector.INSTANCE.getBinder(1, new Function1() { // from class: kjc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiApiClientImpl._init_$lambda$0(this.f23915a, (IBinder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(HuamiApiClientImpl this$0, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setMHuamiApiService(etc.a.asInterface(iBinder));
        return Unit.INSTANCE;
    }

    private final etc getMHuamiApiService() {
        return (etc) this.mHuamiApiService.getValue((Object) this, $$delegatedProperties[0]);
    }

    private final void setMHuamiApiService(etc etcVar) {
        this.mHuamiApiService.setValue((Object) this, $$delegatedProperties[0], etcVar);
    }

    @Override // com.xiaomi.wearable.HuamiApiClient
    public void addHuamiApiChangeListener(@NotNull String mac, @NotNull final HuamiApiChangeListener listener) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logger.i(TAG, "addHuamiApiChangeListener() called with: mac = " + mac + ", listener = " + listener);
        try {
            etc mHuamiApiService = getMHuamiApiService();
            if (mHuamiApiService != null) {
                mHuamiApiService.addHuamiApiChanageListener(mac, new dtc.a() { // from class: com.xiaomi.wearable.HuamiApiClientImpl.addHuamiApiChangeListener.1
                    @Override // defpackage.dtc
                    public void onHuamiApiChange(m huamiApi) {
                        Intrinsics.checkNotNullParameter(huamiApi, "huamiApi");
                        listener.onHuamiApiChange(huamiApi);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "addHuamiApiChangeListener: error " + e.getMessage());
        }
    }

    @Override // com.xiaomi.wearable.HuamiApiClient
    @NotNull
    public IDeviceApiCall getHuamiDeviceCall(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return HuamiApiFactory.INSTANCE.get().newHuamiApiCall(deviceInfo);
    }

    @Override // com.xiaomi.wearable.HuamiApiClient
    @Nullable
    public m getRemoteHuamiApi(@Nullable String mac, @Nullable String did) throws RemoteException {
        etc mHuamiApiService = getMHuamiApiService();
        if (mHuamiApiService != null) {
            return mHuamiApiService.getHuamiApi(mac, did);
        }
        return null;
    }

    @Override // com.xiaomi.wearable.HuamiApiClient
    public void removeHuamiDeviceCall(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        HuamiApiFactory.INSTANCE.get().removeHuamiApiCall(address);
    }

    @Override // com.xiaomi.wearable.HuamiApiClient
    public void removeRemoteHuamiApi(@Nullable String mac, @Nullable String did) throws RemoteException {
        Logger.i(TAG, "removeRemoteHuamiApi() called with: mac = " + mac + ", did = " + did);
        etc mHuamiApiService = getMHuamiApiService();
        if (mHuamiApiService != null) {
            mHuamiApiService.removeHuamiApi(mac, did);
        }
    }
}
