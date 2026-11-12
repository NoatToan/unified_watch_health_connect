package com.huami.bluetooth.profile.channel.module.connect;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.connect.codec.ConnectionParamCodec;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.ILFEventListener;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 21)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0016\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/connect/ConnectModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "byteArray", "", "f", GoogleApiAvailabilityLight.a, "data", "g", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/connect/IConnectParamListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerConnectParamListener", "unregisterConnectParamListener", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "Lcom/huami/bluetooth/profile/channel/module/connect/ConnectParam;", "queryConnectParam", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/bt/profile/slre/ILFEventListener;", "registerEventListener", "", "Ljava/util/List;", "connectParamListener", "Lcom/huami/bluetooth/profile/channel/module/connect/a;", "h", "Lcom/huami/bluetooth/profile/channel/module/connect/a;", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "i", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "handler", "", z.j, "Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ConnectModule extends BaseModule {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<IConnectParamListener> connectParamListener;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private com.huami.bluetooth.profile.channel.module.connect.a listener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final DeviceRequestHandler handler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Connect param is null from raw data(" + ByteArrayKt.toHexString(this.a) + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<byte[], Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
            ConnectModule.this.f(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    public ConnectModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.connectParamListener = new ArrayList();
        this.listener = new com.huami.bluetooth.profile.channel.module.connect.a(HMDeviceType.VDevice, new WeakReference(new ILFEventListener() { // from class: dz0
            @Override // com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
            public final void onLFEvent(HMLFEvent hMLFEvent) {
                ConnectModule.e(hMLFEvent);
            }
        }));
        this.handler = new DeviceRequestHandler(new b(), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.connect.ConnectModule$handler$2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(ConnectParamCommand.NotifyCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String()) || ArraysKt___ArraysKt.first(byteArray) == ArraysKt___ArraysKt.first(ConnectParamCommand.PingCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
            }
        });
        this.tag = "ConnectModule";
    }

    private final void d(byte[] byteArray) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new ConnectionParamCodec().decode(byteArray));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        ConnectParam connectParam = (ConnectParam) objM3845constructorimpl;
        if (connectParam == null) {
            HMLog.info(this.tag, new a(byteArray));
            return;
        }
        Iterator<T> it2 = this.connectParamListener.iterator();
        while (it2.hasNext()) {
            ((IConnectParamListener) it2.next()).onConnectParamChanged(connectParam);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(HMLFEvent hMLFEvent) {
        Debug.fi(BaseModule.TAG, "Not register listener");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(byte[] byteArray) {
        byte bFirst = ArraysKt___ArraysKt.first(byteArray);
        if (bFirst == ArraysKt___ArraysKt.first(ConnectParamCommand.NotifyCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) {
            d(byteArray);
        } else if (bFirst == ArraysKt___ArraysKt.first(ConnectParamCommand.PingCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) {
            g(byteArray);
        } else {
            Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("Could not handle message:", ByteArrayKt.toHexString(byteArray)));
        }
    }

    private final void g(byte[] data) {
        Debug.fi(BaseModule.TAG, "Handle ping event");
        this.listener.c();
        Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("Send pong result:", Boolean.valueOf(BaseModule.syncSendData$default(this, ConnectParamCommand.PongCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), 0, 2, null))));
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        super.init();
        unregisterDeviceRequestHandler(this.handler);
        registerDeviceRequestHandler(this.handler);
    }

    @NotNull
    public final ModuleResult<ConnectParam> queryConnectParam() {
        return new ConnectionParamCodec().decode(sendRequest(new ModuleRequest(ConnectParamCommand.QueryCommand.INSTANCE, new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.connect.ConnectModule$queryConnectParam$request$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return ArraysKt___ArraysKt.first(response) == ArraysKt___ArraysKt.first(ConnectParamCommand.NotifyCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
            }
        }, 0L, null, false, 28, null)));
    }

    public final void registerConnectParamListener(@NotNull IConnectParamListener listener) {
        this.connectParamListener.add(listener);
    }

    public final void registerEventListener(@NotNull HMDeviceType type, @NotNull ILFEventListener listener) {
        this.listener = new com.huami.bluetooth.profile.channel.module.connect.a(type, new WeakReference(listener));
    }

    public final void unregisterConnectParamListener(@NotNull IConnectParamListener listener) {
        this.connectParamListener.remove(listener);
    }
}
