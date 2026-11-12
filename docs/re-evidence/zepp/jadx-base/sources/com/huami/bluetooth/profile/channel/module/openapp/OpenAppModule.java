package com.huami.bluetooth.profile.channel.module.openapp;

import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.huami.bluetooth.profile.channel.module.base.DefaultPredict;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.CalorieData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.FatBurningData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.SitWalkRun;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StandData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StepsData;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activitytoday.ActivityTodayDataParser;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 29)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u001aJ(\u0010\u001f\u001a\u00020\u00062 \u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001d\u0018\u00010\u001aJ\u001a\u0010!\u001a\u00020\u00062\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00060\u001aJ\u000e\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"J2\u0010)\u001a\u00020\u00062\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u001aR\u001c\u0010-\u001a\u00020\r8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R0\u0010/\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001d\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010.R*\u00102\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00101R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010.R$\u00108\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.¨\u0006>"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/OpenAppModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "isSuccess", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", DTransferConstants.PAGE, "", hl.k, "", "byteArray", "h", "data", "i", "", z.j, "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StepsData;", "g", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/CalorieData;", "c", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/FatBurningData;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/SitWalkRun;", "e", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/StandData;", "f", PointCategory.INIT, "Lkotlin/Function1;", "onResult", "queryVersion", "Lkotlin/Pair;", "callback", "listenOpenAppPage", "Lcom/huami/bluetooth/profile/channel/module/openapp/SleepState;", "registerSleepStateListener", "Lcom/huami/bluetooth/profile/channel/module/openapp/RealtimeHrState;", "state", "sendRealtimeHrState", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/openapp/entities/ActivityData;", "Lkotlin/collections/ArrayList;", "activityData", "writeActivityData", LogUtil.I, "getModule", "()I", "module", "Lkotlin/jvm/functions/Function1;", "openAppCallback", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "sleepStateCallback", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "rtHrChannel", "writeActivityDataResult", "l", "queryVersionResult", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class OpenAppModule extends BaseModule {
    public static final int OPEN_APP_MODULE = 29;
    public static final int VERSION_1 = 1;
    private static final int m = 0;
    private static final int n = 2;
    private static final int o = 0;
    private static final int p = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function1<? super AppPageType, ? extends Pair<Boolean, ? extends AppPageType>> openAppCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private WeakReference<Function1<SleepState, Unit>> sleepStateCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Channel<Boolean> rtHrChannel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> writeActivityDataResult;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> queryVersionResult;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$init$1$1", f = "OpenAppModule.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0330a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ OpenAppModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0330a(ChannelResponse channelResponse, OpenAppModule openAppModule, Continuation<? super C0330a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = openAppModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0330a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0330a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Integer numBoxInt;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = false;
                    if (this.b.getData().length == 0) {
                        Debug.fi(BaseModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("open app module response:", this.b.toHexString()));
                    int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(this.b.getData()));
                    if (unSignInt == OpenAppCommand.DeviceOpenAppCommand.INSTANCE.getCmd()) {
                        this.c.i(ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()));
                    } else if (unSignInt == OpenAppCommand.DeviceSleepStateCommand.INSTANCE.getCmd()) {
                        this.c.h(ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()));
                    } else if (unSignInt == OpenAppCommand.DeviceRealtimeHrResult.INSTANCE.getCmd()) {
                        Channel channel = this.c.rtHrChannel;
                        if (channel != null) {
                            Byte bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(ByteArrayKt.subArrayWithoutFirstElement(this.b.getData()));
                            if (bFirstOrNull != null && (numBoxInt = Boxing.boxInt(bFirstOrNull.byteValue())) != null && (numBoxInt.intValue() & 255) == 0) {
                                z = true;
                            }
                            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                            this.a = 1;
                            if (channel.send(boolBoxBoolean, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (unSignInt == OpenAppCommand.ActivityDataWriteResponseCommand.INSTANCE.getCmd()) {
                        BufByteDecoder bufByteDecoder = new BufByteDecoder(this.b.getData(), 0, 2, null);
                        bufByteDecoder.readByte();
                        int i2 = bufByteDecoder.readByte();
                        Function1 function1 = this.c.writeActivityDataResult;
                        if (function1 != null) {
                            function1.invoke(Boxing.boxInt(i2));
                        }
                    } else if (unSignInt == OpenAppCommand.ReplyVersionCommand.INSTANCE.getCmd()) {
                        BufByteDecoder bufByteDecoder2 = new BufByteDecoder(this.b.getData(), 0, 2, null);
                        bufByteDecoder2.readByte();
                        int i3 = bufByteDecoder2.readByte() == 0 ? bufByteDecoder2.readByte() : -1;
                        Function1 function2 = this.c.queryVersionResult;
                        if (function2 != null) {
                            function2.invoke(Boxing.boxInt(i3));
                        }
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            kotlinx.coroutines.d.b(null, new C0330a(channelResponse, OpenAppModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$openAppPage$1$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppPageType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AppPageType appPageType, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = appPageType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenAppModule.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Pair pair;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = OpenAppModule.this.openAppCallback;
            if (function1 != null && (pair = (Pair) function1.invoke(this.c)) != null) {
                OpenAppModule.this.k(((Boolean) pair.getFirst()).booleanValue(), (AppPageType) pair.getSecond());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Debug.fi(BaseModule.TAG, "parse page type fail");
            OpenAppModule.l(OpenAppModule.this, false, null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$queryVersion$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Integer, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Integer, Unit> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenAppModule.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OpenAppModule.this.queryVersionResult = this.c;
            OpenAppModule.this.sendRequest(new ModuleRequest(OpenAppCommand.QueryVersionCommand.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$sendOpenPageResult$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ AppPageType c;
        public final /* synthetic */ OpenAppModule d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {
            public final /* synthetic */ AppPageType a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AppPageType appPageType) {
                super(1);
                this.a = appPageType;
            }

            public final void a(@NotNull ChannelResponse channelResponse) {
                String desc;
                StringBuilder sb = new StringBuilder();
                sb.append("send open page:");
                AppPageType appPageType = this.a;
                String str = "unkownpage";
                if (appPageType != null && (desc = appPageType.getDesc()) != null) {
                    str = desc;
                }
                sb.append(str);
                sb.append("  result:");
                sb.append(channelResponse);
                Debug.fi(BaseModule.TAG, sb.toString());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
                a(channelResponse);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, AppPageType appPageType, OpenAppModule openAppModule, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = appPageType;
            this.d = openAppModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Boxing.boxByte(this.b ? (byte) 0 : (byte) 2));
            AppPageType appPageType = this.c;
            if (appPageType != null) {
                Boxing.boxBoolean(arrayList.add(Boxing.boxByte((byte) appPageType.getType())));
            }
            this.d.sendWithoutDataResponse(new ModuleRequest(OpenAppCommand.DeviceOpenAppResult.INSTANCE.withBytes(CollectionsKt___CollectionsKt.toByteArray(arrayList)), DefaultPredict.INSTANCE, 0L, null, false, 28, null).getBytes(), new a(this.c));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$sendRealtimeHrState$1", f = "OpenAppModule.kt", i = {}, l = {153, 154}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ RealtimeHrState b;
        public final /* synthetic */ OpenAppModule c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$sendRealtimeHrState$1$1", f = "OpenAppModule.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ OpenAppModule b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OpenAppModule openAppModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = openAppModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = this.b.rtHrChannel;
                    if (channel == null) {
                        return null;
                    }
                    this.a = 1;
                    obj = channel.receiveOrNull(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    return null;
                }
                Debug.fi("realtime hr", Intrinsics.stringPlus("send realtime state to device, result:", Boxing.boxBoolean(bool.booleanValue())));
                return bool;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RealtimeHrState realtimeHrState, OpenAppModule openAppModule, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = realtimeHrState;
            this.c = openAppModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0086  */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean bool;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                if (zBooleanValue) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
            ResultKt.throwOnFailure(obj);
            Debug.fi("realtime hr", Intrinsics.stringPlus("send realtime state to device, state:", Boxing.boxInt(this.b.getState())));
            byte[] bArr = {(byte) OpenAppCommand.DeviceRealtimeHrCommand.INSTANCE.getCmd(), (byte) this.b.getState()};
            this.c.rtHrChannel = ChannelKt.Channel(Integer.MAX_VALUE);
            OpenAppModule openAppModule = this.c;
            this.a = 1;
            obj = BaseModule.sendDataWithResult$default(openAppModule, bArr, 0, false, this, 6, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                a aVar = new a(this.c, null);
                this.a = 2;
                obj = TimeoutKt.withTimeoutOrNull(15000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = (Boolean) obj;
                if (bool == null) {
                    zBooleanValue = false;
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                if (zBooleanValue) {
                    z = true;
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.openapp.OpenAppModule$writeActivityData$1", f = "OpenAppModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<Integer, Unit> c;
        public final /* synthetic */ ArrayList<ActivityData> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, ArrayList<ActivityData> arrayList, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = function1;
            this.d = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OpenAppModule.this.new g(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OpenAppModule.this.writeActivityDataResult = this.c;
            Debug.fi(ActivityTodayDataParser.TAG, Intrinsics.stringPlus("write activity data: ", this.d));
            Request.Command commandWithByte = OpenAppCommand.ActivityDataWriteBackCommand.INSTANCE.withByte(this.d.size());
            ArrayList<ActivityData> arrayList = this.d;
            OpenAppModule openAppModule = OpenAppModule.this;
            Request.Command commandWithShort = commandWithByte;
            for (ActivityData activityData : arrayList) {
                Request.Command commandWithInt = commandWithShort.withInt(activityData.getTime());
                StepsData dataSteps = activityData.getDataSteps();
                if (dataSteps == null) {
                    dataSteps = openAppModule.g();
                }
                Request.Command commandWithInt2 = commandWithInt.withInt(dataSteps.getTotal());
                Iterator<T> it2 = dataSteps.getStepsHalfHour().iterator();
                while (it2.hasNext()) {
                    commandWithInt2 = commandWithInt2.withShort(((Number) it2.next()).intValue());
                }
                Request.Command commandWithInt3 = commandWithInt2.withInt(dataSteps.getGoal()).withInt(dataSteps.getLastTotal());
                CalorieData dataCalorie = activityData.getDataCalorie();
                if (dataCalorie == null) {
                    dataCalorie = openAppModule.c();
                }
                Request.Command commandWithShort2 = commandWithInt3.withShort(dataCalorie.getTotal());
                Iterator<T> it3 = dataCalorie.getCaloriesPerHalfHour().iterator();
                while (it3.hasNext()) {
                    commandWithShort2 = commandWithShort2.withShort(((Number) it3.next()).intValue());
                }
                Request.Command commandWithShort3 = commandWithShort2.withShort(dataCalorie.getGoal()).withShort(dataCalorie.getLastTotal()).withShort(dataCalorie.getBasicCalorie());
                FatBurningData dataFatBurning = activityData.getDataFatBurning();
                if (dataFatBurning == null) {
                    dataFatBurning = openAppModule.d();
                }
                Request.Command commandWithShort4 = commandWithShort3.withShort(dataFatBurning.getTotal());
                Iterator<T> it4 = dataFatBurning.getBurningPerHalfHour().iterator();
                while (it4.hasNext()) {
                    commandWithShort4 = commandWithShort4.withByte(((Number) it4.next()).intValue());
                }
                Request.Command commandWithShort5 = commandWithShort4.withShort(dataFatBurning.getGoal()).withShort(dataFatBurning.getLastTotal());
                SitWalkRun dataSitWalkRun = activityData.getDataSitWalkRun();
                if (dataSitWalkRun == null) {
                    dataSitWalkRun = openAppModule.e();
                }
                Request.Command commandWithInt4 = commandWithShort5.withInt(dataSitWalkRun.getTimeRun()).withInt(dataSitWalkRun.getTimeFastWalk()).withInt(dataSitWalkRun.getTimeSit());
                StandData dataStand = activityData.getDataStand();
                if (dataStand == null) {
                    dataStand = openAppModule.f();
                }
                Request.Command commandWithByte2 = commandWithInt4.withByte(dataStand.getTotal());
                Iterator<T> it5 = dataStand.getStandPerHour().iterator();
                while (it5.hasNext()) {
                    commandWithByte2 = commandWithByte2.withByte(((Number) it5.next()).intValue());
                }
                commandWithShort = commandWithByte2.withByte(dataStand.getGoal()).withInt(dataStand.getTimeSit()).withInt(dataStand.getTimeStand()).withBytes(GattUtils.numberToBytes((long) activityData.getDistance(), 4)).withShort(activityData.getFloor()).withByte(activityData.getGoalType()).withShort(activityData.getStandOrBurn());
            }
            OpenAppModule.this.sendRequest(new ModuleRequest(commandWithShort, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
            return Unit.INSTANCE;
        }
    }

    public OpenAppModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.module = 29;
        this.sleepStateCallback = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CalorieData c() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            i++;
            arrayList.add(0);
        } while (i <= 47);
        return new CalorieData(0, arrayList, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FatBurningData d() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            i++;
            arrayList.add(0);
        } while (i <= 47);
        return new FatBurningData(0, arrayList, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SitWalkRun e() {
        return new SitWalkRun(0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StandData f() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            i++;
            arrayList.add(0);
        } while (i <= 23);
        return new StandData(0, arrayList, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StepsData g() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            i++;
            arrayList.add(0);
        } while (i <= 47);
        return new StepsData(0, arrayList, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(byte[] byteArray) {
        if (byteArray.length == 0) {
            Debug.fi(BaseModule.TAG, "Sleep state changed but no state");
        }
        byte bFirst = ArraysKt___ArraysKt.first(byteArray);
        SleepState sleepState = SleepState.Waking.INSTANCE;
        if (bFirst != sleepState.getType()) {
            sleepState = SleepState.Sleeping.INSTANCE;
            if (bFirst != sleepState.getType()) {
                sleepState = null;
            }
        }
        if (sleepState == null) {
            Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("Unrecognized sleep code：", Integer.valueOf(bFirst)));
            return;
        }
        Function1<SleepState, Unit> function1 = this.sleepStateCallback.get();
        if (function1 == null) {
            return;
        }
        function1.invoke(sleepState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(byte[] data) {
        Job jobF = null;
        if (!(!(data.length == 0))) {
            data = null;
        }
        AppPageType appPageTypeJ = data == null ? null : j(data[0] & 255);
        if (appPageTypeJ != null) {
            Debug.fi(BaseModule.TAG, Intrinsics.stringPlus("open app page type:", appPageTypeJ.getDesc()));
            jobF = kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new b(appPageTypeJ, null), 2, null);
        }
        if (jobF == null) {
            new c().invoke();
        }
    }

    private final AppPageType j(int i) {
        AppPageType.Hr hr = AppPageType.Hr.INSTANCE;
        if (i == hr.getType()) {
            return hr;
        }
        AppPageType.Spo2 spo2 = AppPageType.Spo2.INSTANCE;
        if (i == spo2.getType()) {
            return spo2;
        }
        AppPageType.Pressure pressure = AppPageType.Pressure.INSTANCE;
        if (i == pressure.getType()) {
            return pressure;
        }
        AppPageType.Temperature temperature = AppPageType.Temperature.INSTANCE;
        if (i == temperature.getType()) {
            return temperature;
        }
        AppPageType.Sleep sleep = AppPageType.Sleep.INSTANCE;
        if (i == sleep.getType()) {
            return sleep;
        }
        AppPageType.PAI pai = AppPageType.PAI.INSTANCE;
        if (i == pai.getType()) {
            return pai;
        }
        AppPageType.Menstruation menstruation = AppPageType.Menstruation.INSTANCE;
        if (i == menstruation.getType()) {
            return menstruation;
        }
        AppPageType.Activity activity = AppPageType.Activity.INSTANCE;
        if (i == activity.getType()) {
            return activity;
        }
        AppPageType.ECG ecg = AppPageType.ECG.INSTANCE;
        if (i == ecg.getType()) {
            return ecg;
        }
        AppPageType.BloodPressure bloodPressure = AppPageType.BloodPressure.INSTANCE;
        if (i == bloodPressure.getType()) {
            return bloodPressure;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean isSuccess, AppPageType page) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new e(isSuccess, page, this, null), 2, null);
    }

    public static /* synthetic */ void l(OpenAppModule openAppModule, boolean z, AppPageType appPageType, int i, Object obj) {
        if ((i & 2) != 0) {
            appPageType = null;
        }
        openAppModule.k(z, appPageType);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    public final void listenOpenAppPage(@Nullable Function1<? super AppPageType, ? extends Pair<Boolean, ? extends AppPageType>> callback) {
        this.openAppCallback = callback;
    }

    public final void queryVersion(@NotNull Function1<? super Integer, Unit> onResult) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new d(onResult, null), 3, null);
    }

    public final void registerSleepStateListener(@NotNull Function1<? super SleepState, Unit> callback) {
        this.sleepStateCallback = new WeakReference<>(callback);
    }

    public final boolean sendRealtimeHrState(@NotNull RealtimeHrState state) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new f(state, this, null), 1, null)).booleanValue();
    }

    public final void writeActivityData(@NotNull ArrayList<ActivityData> activityData, @NotNull Function1<? super Integer, Unit> onResult) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new g(onResult, activityData, null), 3, null);
    }
}
