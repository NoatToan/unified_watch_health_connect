package com.huami.bluetooth.profile.channel.module;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ChannelResponse;
import defpackage.ql;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001)B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J.\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0005R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ProxyModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "requestFromDevice", "", "handleRequest", "", "sessionId", "errorCode", Constants.PARAM_STATUS_CODE, "", "responseData", "wrapperResponse", "dataBytes", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "parseRequest", StatConstants.PARAM_START, "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "requestClient", "setHttpRequestClient", BroadcastsKt.SILENT_PUSHING_STOP, "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "Lcom/huami/bluetooth/profile/channel/module/IHttpRequest;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ProxyModule extends a implements CoroutineScope {
    public static final int BODY_DATA_SIZE_BYTES = 4;
    public static final int PROXY_MODULE = 1;
    public static final int REQUEST_TYPE = 1;
    public static final int RESPONSE_TYPE = 2;

    @NotNull
    public static final String TAG = "ProxyModule";
    public static final long TIMEOUT = 15000;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private IHttpRequest requestClient;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<CompletableJob> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ProxyModule$start$1$1", f = "ProxyModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ ProxyModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, ProxyModule proxyModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = proxyModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws IOException {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                t5t.d(ProxyModule.TAG, "Receive request:" + tet.x(this.u.getData()));
                this.v.handleRequest(this.u);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getData().length == 0) {
                return;
            }
            ProxyModule proxyModule = ProxyModule.this;
            BuildersKt__Builders_commonKt.launch$default(proxyModule, null, null, new a(it, proxyModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.job = LazyKt__LazyJVMKt.lazy(b.t);
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleRequest(ChannelResponse requestFromDevice) throws IOException {
        Object objM886constructorimpl;
        byte[] data = requestFromDevice.getData();
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(parseRequest(data));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "解析设备网络请求异常: " + thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        DeviceHttpRequest deviceHttpRequest = (DeviceHttpRequest) objM886constructorimpl;
        if (deviceHttpRequest == null) {
            return;
        }
        IHttpRequest iHttpRequest = this.requestClient;
        DeviceHttpResponse deviceHttpResponseRequest = iHttpRequest != null ? iHttpRequest.request(deviceHttpRequest) : null;
        t5t.d(TAG, deviceHttpRequest.toString());
        int sessionId = deviceHttpRequest.getSessionId();
        t5t.d(TAG, "Response: " + deviceHttpResponseRequest);
        if (deviceHttpResponseRequest == null) {
            a.sendData$default(this, wrapperResponse$default(this, sessionId, 2, 0, null, 12, null), 0, 2, null);
            return;
        }
        if (deviceHttpResponseRequest.getErrorCode() != 1) {
            a.sendData$default(this, wrapperResponse$default(this, sessionId, deviceHttpResponseRequest.getErrorCode(), 0, null, 12, null), 0, 2, null);
            return;
        }
        byte[] bArrWrapperResponse = wrapperResponse(sessionId, deviceHttpResponseRequest.getErrorCode(), deviceHttpResponseRequest.getStatusCode(), deviceHttpResponseRequest.getDataBytes());
        t5t.d(TAG, "Send response: " + tet.x(bArrWrapperResponse));
        a.sendData$default(this, bArrWrapperResponse, 0, 2, null);
    }

    private final DeviceHttpRequest parseRequest(byte[] dataBytes) {
        byte bFirst = ArraysKt___ArraysKt.first(dataBytes);
        byte b2 = dataBytes[1];
        if (bFirst != 1) {
            t5t.d(TAG, "Wrong type:" + tet.x(dataBytes));
            return new DeviceHttpRequest(b2, null, null, null, null, 30, null);
        }
        int iA = ql.a(dataBytes, 2);
        String strA = ql.a(dataBytes, 2, iA - 2);
        int i = iA + 1;
        int iA2 = ql.a(dataBytes, i);
        String strA2 = ql.a(dataBytes, i, (iA2 - iA) - 1);
        byte b3 = dataBytes[iA2 + 1];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = iA2 + 2;
        int i3 = 0;
        while (i3 < b3) {
            int iA3 = ql.a(dataBytes, i2);
            String strA3 = ql.a(dataBytes, i2, iA3 - i2);
            int i4 = iA3 + 1;
            int iA4 = ql.a(dataBytes, i4);
            String strA4 = ql.a(dataBytes, i4, iA4 - i4);
            int i5 = iA4 + 1;
            if (strA3 == null || strA4 == null) {
                t5t.d(TAG, "No key or value while parse request");
            } else {
                linkedHashMap.put(strA3, strA4);
            }
            i3++;
            i2 = i5;
        }
        return new DeviceHttpRequest(b2, strA2, strA, linkedHashMap, tet.d(dataBytes, i2, 4) > 0 ? CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(dataBytes, new IntRange(i2 + 4, dataBytes.length - 1))) : null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    private final byte[] wrapperResponse(int sessionId, int errorCode, int statusCode, byte[] responseData) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(sessionId);
        byteArrayOutputStream.write(errorCode);
        if (statusCode >= 0) {
            byteArrayOutputStream.write(statusCode);
        }
        if (responseData == null) {
            byteArrayOutputStream.write(tet.p(0));
        } else {
            if (!(responseData.length == 0)) {
                byteArrayOutputStream.write(tet.p(responseData.length));
                byteArrayOutputStream.write(responseData);
            } else {
                byteArrayOutputStream.write(tet.p(0));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "byteBuffer.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] wrapperResponse$default(ProxyModule proxyModule, int i, int i2, int i3, byte[] bArr, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        if ((i4 & 8) != 0) {
            bArr = null;
        }
        return proxyModule.wrapperResponse(i, i2, i3, bArr);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 1;
    }

    public final void setHttpRequestClient(@NotNull IHttpRequest requestClient) {
        Intrinsics.checkNotNullParameter(requestClient, "requestClient");
        this.requestClient = requestClient;
    }

    public final void start() {
        t5t.d(TAG, "Start proxy");
        a.registerCallback$default(this, 1, false, new c(), 2, null);
    }

    public final void stop() {
        t5t.d(TAG, "Stop proxy");
        unregisterCallback(1);
    }
}
