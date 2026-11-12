package com.huami.bluetooth.profile.channel.module;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J.\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0005R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00078V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ProxyModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "requestFromDevice", "", GoogleApiAvailabilityLight.a, "", "sessionId", "errorCode", "statusCode", "", "responseData", "f", "dataBytes", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "e", "start", "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "requestClient", "setHttpRequestClient", Command.STOP, "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "h", "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ProxyModule extends BaseModule implements CoroutineScope {
    public static final int BODY_DATA_SIZE_BYTES = 4;
    public static final int PROXY_MODULE = 1;
    public static final int REQUEST_TYPE = 1;
    public static final int RESPONSE_TYPE = 2;

    @NotNull
    public static final String TAG = "ProxyModule";
    public static final long TIMEOUT = 15000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private IHttpRequest requestClient;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Job> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ProxyModule$start$1$1", f = "ProxyModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ ProxyModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, ProxyModule proxyModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = proxyModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Debug.fi(ProxyModule.TAG, Intrinsics.stringPlus("Receive request:", GattUtils.bytesToHexString(this.b.getData())));
                this.c.d(this.b);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            if (channelResponse.getData().length == 0) {
                return;
            }
            ProxyModule proxyModule = ProxyModule.this;
            e.f(proxyModule, null, null, new a(channelResponse, proxyModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    public ProxyModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(ChannelResponse requestFromDevice) {
        Object objM3845constructorimpl;
        byte[] data = requestFromDevice.getData();
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(e(data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("解析设备网络请求异常: ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        DeviceHttpRequest deviceHttpRequest = (DeviceHttpRequest) objM3845constructorimpl;
        if (deviceHttpRequest == null) {
            return;
        }
        IHttpRequest iHttpRequest = this.requestClient;
        DeviceHttpResponse deviceHttpResponseRequest = iHttpRequest == null ? null : iHttpRequest.request(deviceHttpRequest);
        Debug.fi(TAG, deviceHttpRequest.toString());
        int sessionId = deviceHttpRequest.getSessionId();
        Debug.fi(TAG, Intrinsics.stringPlus("Response: ", deviceHttpResponseRequest));
        if (deviceHttpResponseRequest == null) {
            BaseModule.sendData$default(this, g(this, sessionId, 2, 0, null, 12, null), 0, 2, null);
        } else {
            if (deviceHttpResponseRequest.getErrorCode() != 1) {
                BaseModule.sendData$default(this, g(this, sessionId, deviceHttpResponseRequest.getErrorCode(), 0, null, 12, null), 0, 2, null);
                return;
            }
            byte[] bArrF = f(sessionId, deviceHttpResponseRequest.getErrorCode(), deviceHttpResponseRequest.getStatusCode(), deviceHttpResponseRequest.getDataBytes());
            Debug.fi(TAG, Intrinsics.stringPlus("Send response: ", GattUtils.bytesToHexString(bArrF)));
            BaseModule.sendData$default(this, bArrF, 0, 2, null);
        }
    }

    private final DeviceHttpRequest e(byte[] dataBytes) {
        byte bFirst = ArraysKt___ArraysKt.first(dataBytes);
        byte b2 = dataBytes[1];
        if (bFirst != 1) {
            Debug.fi(TAG, Intrinsics.stringPlus("Wrong type:", GattUtils.bytesToHexString(dataBytes)));
            return new DeviceHttpRequest(b2, null, null, null, null, 30, null);
        }
        int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(dataBytes, 2);
        String strSliceString = ModuleUtilsKt.sliceString(dataBytes, 2, iFindStringEndFlag - 2);
        int i = iFindStringEndFlag + 1;
        int iFindStringEndFlag2 = ModuleUtilsKt.findStringEndFlag(dataBytes, i);
        String strSliceString2 = ModuleUtilsKt.sliceString(dataBytes, i, (iFindStringEndFlag2 - iFindStringEndFlag) - 1);
        byte b3 = dataBytes[iFindStringEndFlag2 + 1];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = iFindStringEndFlag2 + 2;
        int i3 = 0;
        if (b3 > 0) {
            do {
                i3++;
                int iFindStringEndFlag3 = ModuleUtilsKt.findStringEndFlag(dataBytes, i2);
                String strSliceString3 = ModuleUtilsKt.sliceString(dataBytes, i2, iFindStringEndFlag3 - i2);
                int i4 = iFindStringEndFlag3 + 1;
                int iFindStringEndFlag4 = ModuleUtilsKt.findStringEndFlag(dataBytes, i4);
                String strSliceString4 = ModuleUtilsKt.sliceString(dataBytes, i4, iFindStringEndFlag4 - i4);
                int i5 = iFindStringEndFlag4 + 1;
                if (strSliceString3 == null || strSliceString4 == null) {
                    Debug.fi(TAG, "No key or value while parse request");
                } else {
                    linkedHashMap.put(strSliceString3, strSliceString4);
                }
                i2 = i5;
            } while (i3 < b3);
        }
        return new DeviceHttpRequest(b2, strSliceString2, strSliceString, linkedHashMap, GattUtils.bytesToInt(dataBytes, i2, 4) > 0 ? CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(dataBytes, new IntRange(i2 + 4, dataBytes.length - 1))) : null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    private final byte[] f(int sessionId, int errorCode, int statusCode, byte[] responseData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(sessionId);
        byteArrayOutputStream.write(errorCode);
        if (statusCode >= 0) {
            byteArrayOutputStream.write(statusCode);
        }
        if (responseData == null) {
            byteArrayOutputStream.write(GattUtils.intToBytes(0));
        } else {
            if (!(responseData.length == 0)) {
                byteArrayOutputStream.write(GattUtils.intToBytes(responseData.length));
                byteArrayOutputStream.write(responseData);
            } else {
                byteArrayOutputStream.write(GattUtils.intToBytes(0));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static /* synthetic */ byte[] g(ProxyModule proxyModule, int i, int i2, int i3, byte[] bArr, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        if ((i4 & 8) != 0) {
            bArr = null;
        }
        return proxyModule.f(i, i2, i3, bArr);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 1;
    }

    public final void setHttpRequestClient(@NotNull IHttpRequest requestClient) {
        this.requestClient = requestClient;
    }

    public final void start() {
        Debug.fi(TAG, "Start proxy");
        BaseModule.registerCallback$default(this, 1, false, new b(), 2, null);
    }

    public final void stop() {
        Debug.fi(TAG, "Stop proxy");
        unregisterCallback(1);
    }
}
