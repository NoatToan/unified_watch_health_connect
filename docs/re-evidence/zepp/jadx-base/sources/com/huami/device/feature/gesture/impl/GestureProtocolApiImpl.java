package com.huami.device.feature.gesture.impl;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.device.feature.gesture.api.GestureProtocolApi;
import com.huami.device.feature.gesture.api.GestureTypeFactory;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 61)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0016J#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJ\u001b\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tR\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/huami/device/feature/gesture/impl/GestureProtocolApiImpl;", "Lcom/huami/device/feature/gesture/api/GestureProtocolApi;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "byteArray", "", "c", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "gestureType", "Lcom/huami/device/feature/gesture/api/GestureTypeFactory$GestureState;", "queryStatus", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Channel;", "listenResult", "state", "updateTrainStatus", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "disableGesture", "", "queryAllGestureState", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "g", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "deviceRequestHandler", "h", "Lkotlinx/coroutines/channels/Channel;", "channel", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class GestureProtocolApiImpl extends BaseModule implements GestureProtocolApi {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DeviceRequestHandler deviceRequestHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Channel<GestureTypeFactory.GestureState> channel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public a(Object obj) {
            super(1, obj, GestureProtocolApiImpl.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) throws InterruptedException {
            ((GestureProtocolApiImpl) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) throws InterruptedException {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.gesture.impl.GestureProtocolApiImpl$onNotify$1", f = "GestureProtocolApiImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ byte[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GestureProtocolApiImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = GestureProtocolApiImpl.this.channel;
                GestureTypeFactory.GestureState gestureStateDecode = new GestureStateCodec().decode(this.c);
                this.a = 1;
                if (channel.send(gestureStateDecode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("查询手势列表异常:", this.a);
        }
    }

    public GestureProtocolApiImpl(@NotNull ChannelApi channelApi) {
        super(channelApi);
        DeviceRequestHandler deviceRequestHandler = new DeviceRequestHandler(new a(this), new RequestPredict() { // from class: com.huami.device.feature.gesture.impl.GestureProtocolApiImpl$deviceRequestHandler$2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray)) == GestureCommand.NotifyStateCommand.INSTANCE.getCmd();
            }
        });
        this.deviceRequestHandler = deviceRequestHandler;
        registerDeviceRequestHandler(deviceRequestHandler);
        this.channel = ChannelKt.Channel(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] byteArray) throws InterruptedException {
        if (AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(byteArray)) == GestureCommand.NotifyStateCommand.INSTANCE.getCmd()) {
            d.b(null, new b(byteArray, null), 1, null);
        }
    }

    @Override // com.huami.device.feature.gesture.api.GestureProtocolApi
    @Nullable
    public Object disableGesture(int i, @NotNull Continuation<? super Boolean> continuation) {
        Integer num = (Integer) ModuleResultKt.peel(new DisableCodec().decode(sendRequest(new ModuleRequest(GestureCommand.DisableGestureCommand.INSTANCE.withByte(i), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        return Boxing.boxBoolean(num != null && num.intValue() == 0);
    }

    @Override // com.huami.device.feature.gesture.api.GestureProtocolApi
    @NotNull
    public Channel<GestureTypeFactory.GestureState> listenResult() {
        return this.channel;
    }

    @Override // com.huami.device.feature.gesture.api.GestureProtocolApi
    @Nullable
    public Object queryAllGestureState(@NotNull Continuation<? super List<GestureTypeFactory.GestureState>> continuation) {
        Object objM3845constructorimpl;
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(GestureCommand.QueryAllGestureStateCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(new AllGestureStateCodec().decode(moduleResultSendRequest));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(null, null, null, new c(thM3848exceptionOrNullimpl), 7, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        ModuleResult moduleResult = (ModuleResult) objM3845constructorimpl;
        if (moduleResult == null) {
            return null;
        }
        return (List) ModuleResultKt.peel(moduleResult);
    }

    @Override // com.huami.device.feature.gesture.api.GestureProtocolApi
    @Nullable
    public Object queryStatus(int i, @NotNull Continuation<? super GestureTypeFactory.GestureState> continuation) {
        return ModuleResultKt.peel(new GestureStateCodec().decode(sendRequest(new ModuleRequest(GestureCommand.QueryGestureStateCommand.INSTANCE.withByte(i), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
    }

    @Override // com.huami.device.feature.gesture.api.GestureProtocolApi
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        Integer num = (Integer) ModuleResultKt.peel(new VersionCodec().decode(sendRequest(new ModuleRequest(GestureCommand.QueryVersionCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        return Boxing.boxInt(num == null ? -1 : num.intValue());
    }

    @Override // com.huami.device.feature.gesture.api.GestureProtocolApi
    @Nullable
    public Object updateTrainStatus(int i, int i2, @NotNull Continuation<? super Integer> continuation) {
        Integer num = (Integer) ModuleResultKt.peel(new SetGestureStateCodec().decode(sendRequest(new ModuleRequest(GestureCommand.SetGestureStateCommand.INSTANCE.withByte(i).withByte(i2), IncreasePredict.INSTANCE, 0L, null, false, 28, null))));
        return Boxing.boxInt(num == null ? -1 : num.intValue());
    }
}
