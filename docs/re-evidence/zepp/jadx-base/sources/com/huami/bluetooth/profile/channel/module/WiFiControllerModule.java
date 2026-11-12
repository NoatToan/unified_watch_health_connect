package com.huami.bluetooth.profile.channel.module;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor;
import com.huami.bluetooth.profile.channel.module.schedule.action.SimpleParseInterceptor;
import com.loc.z;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 3)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\\B\u000f\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u001b\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ_\u0010#\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020(H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-JO\u00106\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b8\u0010'J\u0013\u00109\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b9\u0010'J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0014J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016R\u001d\u0010C\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010BR+\u0010J\u001a\u0014\u0012\u0004\u0012\u00020E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040F0D8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010O\u001a\u00020K8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\bM\u0010NR\"\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0P8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010W\u001a\u00020T8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataCreator;", "", "byteArray", "", "h", "e", "f", "g", "", "key", "Lcom/huami/bluetooth/profile/channel/module/IWiFiControllerCallback;", "callback", "setControllerCallback", "removeControllerCallback", PointCategory.INIT, "data", "onReceive", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleConnectStatusNotify", "ssid", "pwd", "", "setPwd", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/WiFiSecurityType;", "secType", "Lcom/huami/bluetooth/profile/channel/module/EapType;", "eapType", "Lcom/huami/bluetooth/profile/channel/module/Phase2Type;", "phase2Type", LoseWeightPropertyKey.IDENTITY, "anonymousID", "addWiFi", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/WiFiSecurityType;Lcom/huami/bluetooth/profile/channel/module/EapType;Lcom/huami/bluetooth/profile/channel/module/Phase2Type;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/ConnectStatus;", "queryWiFiConnectStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/APReason;", "reason", "startAp", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/APReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWiFi", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LoginViewOptions.EXTRA_LOGIN_TOKEN, "accesToken", "", "region", "appPlatform", "appId", "appVersion", "local", "sendToken", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopAp", g.g, "sendData", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lkotlinx/coroutines/Job;", "job", "", "Lcom/huami/bluetooth/profile/channel/module/WiFiControllerType;", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "channels", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "i", "c", "()Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "innerInterceptor", "Ljava/util/concurrent/ConcurrentHashMap;", z.j, "Ljava/util/concurrent/ConcurrentHashMap;", "callbackQueue", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WiFiControllerModule extends BaseModule implements CoroutineScope, IDataCreator {

    @NotNull
    public static final String TAG = "WiFiModule";
    public static final long TIMEOUT = 10000;
    public static final int WIFI_MODULE = 3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<WiFiControllerType, Channel<byte[]>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy innerInterceptor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, IWiFiControllerCallback> callbackQueue;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WiFiControllerType.values().length];
            iArr[WiFiControllerType.UNKNOWN.ordinal()] = 1;
            iArr[WiFiControllerType.DEVICE_REQUEST_WIFI_PWD.ordinal()] = 2;
            iArr[WiFiControllerType.DEVICE_RQUEST_ADD_WIFI.ordinal()] = 3;
            iArr[WiFiControllerType.BIDIRECTION_CANCEL.ordinal()] = 4;
            iArr[WiFiControllerType.DEVICE_NOTIFY_CONNECT_STATUS.ordinal()] = 5;
            iArr[WiFiControllerType.DEVICE_NOTIFY_AP_STATUS.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule", f = "WiFiControllerModule.kt", i = {0, 0}, l = {104}, m = "handleConnectStatusNotify", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WiFiControllerModule.this.handleConnectStatusNotify(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SimpleParseInterceptor> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleParseInterceptor invoke() {
            return new SimpleParseInterceptor(WiFiControllerModule.TAG, null, 2, 0 == true ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Job> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule", f = "WiFiControllerModule.kt", i = {}, l = {160, 164}, m = "queryWiFiConnectStatus", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return WiFiControllerModule.this.queryWiFiConnectStatus(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule$queryWiFiConnectStatus$response$1", f = "WiFiControllerModule.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WiFiControllerModule.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = WiFiControllerModule.this.getChannels().get(WiFiControllerType.DEVICE_NOTIFY_CONNECT_STATUS);
                if (channel == null) {
                    return null;
                }
                this.a = 1;
                obj = channel.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (byte[]) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule", f = "WiFiControllerModule.kt", i = {0, 0}, l = {237}, m = "sendData", n = {"this", "data"}, s = {"L$0", "L$1"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return WiFiControllerModule.this.sendData((byte[]) null, this);
        }
    }

    public WiFiControllerModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(c.a);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = LazyKt__LazyJVMKt.lazy(b.a);
        this.callbackQueue = new ConcurrentHashMap<>();
    }

    private final SimpleParseInterceptor c() {
        return (SimpleParseInterceptor) this.innerInterceptor.getValue();
    }

    private final Job d() {
        return (Job) this.job.getValue();
    }

    private final void e(byte[] byteArray) {
        String strSliceString$default = ModuleUtilsKt.sliceString$default(byteArray, 0, 1, null);
        Debug.fi(TAG, Intrinsics.stringPlus("Add Wi-Fi request:", strSliceString$default));
        for (IWiFiControllerCallback iWiFiControllerCallback : this.callbackQueue.values()) {
            if (iWiFiControllerCallback != null) {
                iWiFiControllerCallback.onAddWifiRequest(strSliceString$default);
            }
        }
    }

    private final void f(byte[] byteArray) {
        ApStatus apStatusFromValue = ApStatus.INSTANCE.fromValue(ArraysKt___ArraysKt.first(byteArray));
        Debug.fi(TAG, Intrinsics.stringPlus("Ap state changed:", apStatusFromValue));
        for (IWiFiControllerCallback iWiFiControllerCallback : this.callbackQueue.values()) {
            if (iWiFiControllerCallback != null) {
                iWiFiControllerCallback.onApStateChanged(apStatusFromValue);
            }
        }
    }

    private final void g() {
        for (IWiFiControllerCallback iWiFiControllerCallback : this.callbackQueue.values()) {
            if (iWiFiControllerCallback != null) {
                iWiFiControllerCallback.onCancel();
            }
        }
    }

    private final void h(byte[] byteArray) {
        String strSliceString$default = ModuleUtilsKt.sliceString$default(byteArray, 0, 1, null);
        if (strSliceString$default == null) {
            return;
        }
        Debug.fi(TAG, "Request Wi-Fi " + strSliceString$default + " password");
        for (IWiFiControllerCallback iWiFiControllerCallback : this.callbackQueue.values()) {
            if (iWiFiControllerCallback != null) {
                iWiFiControllerCallback.onPwdRequest(strSliceString$default);
            }
        }
    }

    public static /* synthetic */ Object startAp$default(WiFiControllerModule wiFiControllerModule, String str, String str2, APReason aPReason, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            aPReason = APReason.Music;
        }
        return wiFiControllerModule.startAp(str, str2, aPReason, continuation);
    }

    @Nullable
    public final Object addWiFi(@NotNull String str, @Nullable String str2, @NotNull WiFiSecurityType wiFiSecurityType, @Nullable EapType eapType, @Nullable Phase2Type phase2Type, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super Boolean> continuation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(WiFiControllerType.APP_ADD_WIFI.getValue());
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        if (str2 != null) {
            byteArrayOutputStream.write(str2.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(wiFiSecurityType.getValue());
        if (eapType != null) {
            byteArrayOutputStream.write(eapType.getValue());
        }
        if (phase2Type != null) {
            byteArrayOutputStream.write(phase2Type.getValue());
        }
        if (str3 != null) {
            byteArrayOutputStream.write(str3.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        if (str4 != null) {
            byteArrayOutputStream.write(str4.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        return sendData(byteArrayOutputStream.toByteArray(), continuation);
    }

    @Nullable
    public final Object cancel(@NotNull Continuation<? super Boolean> continuation) {
        return sendData(new byte[]{(byte) WiFiControllerType.BIDIRECTION_CANCEL.getValue()}, continuation);
    }

    @Nullable
    public final Object deleteWiFi(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(WiFiControllerType.DELETE_WIFI.getValue());
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        return sendData(byteArrayOutputStream.toByteArray(), continuation);
    }

    @NotNull
    public final Map<WiFiControllerType, Channel<byte[]>> getChannels() {
        return this.channels;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return d().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object handleConnectStatusNotify(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        WiFiControllerModule wiFiControllerModule;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<byte[]> channel = getChannels().get(WiFiControllerType.DEVICE_NOTIFY_CONNECT_STATUS);
            if (channel != null) {
                aVar.a = this;
                aVar.b = bArr;
                aVar.e = 1;
                if (channel.send(bArr, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            wiFiControllerModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) aVar.b;
            wiFiControllerModule = (WiFiControllerModule) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        ConnectStatus connectStatus = ConnectStatus.INSTANCE.parse(bArr);
        Debug.fi(TAG, Intrinsics.stringPlus("Notify wifi state:", connectStatus));
        for (IWiFiControllerCallback iWiFiControllerCallback : wiFiControllerModule.callbackQueue.values()) {
            if (iWiFiControllerCallback != null) {
                iWiFiControllerCallback.onWiFiStateChanged(connectStatus);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        Debug.fi(TAG, "Start wifi module");
        super.init();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    @Nullable
    public Object onReceive(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        c().onReceive(bArr);
        WiFiControllerType wiFiControllerTypeFromValue = WiFiControllerType.INSTANCE.fromValue(ArraysKt___ArraysKt.first(bArr));
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr.length - 1));
        switch (WhenMappings.$EnumSwitchMapping$0[wiFiControllerTypeFromValue.ordinal()]) {
            case 1:
                Debug.fi(TAG, "Unsupport type");
                break;
            case 2:
                h(bArrSliceArray);
                break;
            case 3:
                e(bArrSliceArray);
                break;
            case 4:
                g();
                break;
            case 5:
                Object objHandleConnectStatusNotify = handleConnectStatusNotify(bArrSliceArray, continuation);
                return objHandleConnectStatusNotify == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objHandleConnectStatusNotify : Unit.INSTANCE;
            case 6:
                f(bArrSliceArray);
                break;
            default:
                Debug.fi(TAG, "Unsupport type");
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:13:0x002a, B:33:0x0099, B:35:0x009d, B:38:0x00af, B:14:0x0032, B:15:0x0039, B:16:0x003a, B:22:0x006b, B:24:0x0073, B:28:0x0087, B:17:0x0042, B:8:0x0014), top: B:44:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:13:0x002a, B:33:0x0099, B:35:0x009d, B:38:0x00af, B:14:0x0032, B:15:0x0039, B:16:0x003a, B:22:0x006b, B:24:0x0073, B:28:0x0087, B:17:0x0042, B:8:0x0014), top: B:44:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:13:0x002a, B:33:0x0099, B:35:0x009d, B:38:0x00af, B:14:0x0032, B:15:0x0039, B:16:0x003a, B:22:0x006b, B:24:0x0073, B:28:0x0087, B:17:0x0042, B:8:0x0014), top: B:44:0x0001 }] */
    @Nullable
    public final synchronized Object queryWiFiConnectStatus(@NotNull Continuation<? super ConnectStatus> continuation) {
        d dVar;
        WiFiControllerModule wiFiControllerModule;
        WiFiControllerModule wiFiControllerModule2;
        byte[] bArr;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objSendData = dVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                wiFiControllerModule = (WiFiControllerModule) dVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wiFiControllerModule2 = (WiFiControllerModule) dVar.a;
                ResultKt.throwOnFailure(objSendData);
            }
            bArr = (byte[]) objSendData;
            if (bArr == null) {
                return new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
            }
            wiFiControllerModule2.getChannels().remove(WiFiControllerType.DEVICE_NOTIFY_CONNECT_STATUS);
            return ConnectStatus.INSTANCE.parse(bArr);
        }
        ResultKt.throwOnFailure(objSendData);
        getChannels().put(WiFiControllerType.DEVICE_NOTIFY_CONNECT_STATUS, ChannelKt.Channel$default(0, 1, null));
        byte[] bArr2 = {(byte) WiFiControllerType.APP_QUERY_CONNECT_STATUS.getValue()};
        dVar.a = this;
        dVar.d = 1;
        objSendData = sendData(bArr2, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        wiFiControllerModule = this;
        if (!((Boolean) objSendData).booleanValue()) {
            return new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
        }
        e eVar = wiFiControllerModule.new e(null);
        dVar.a = wiFiControllerModule;
        dVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(10000L, eVar, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        wiFiControllerModule2 = wiFiControllerModule;
        bArr = (byte[]) objSendData;
        if (bArr == null) {
            return new ConnectStatus(WiFiConnectStatus.NONE, null, null, null, null, null, 62, null);
        }
        wiFiControllerModule2.getChannels().remove(WiFiControllerType.DEVICE_NOTIFY_CONNECT_STATUS);
        return ConnectStatus.INSTANCE.parse(bArr);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator
    public void registerInterceptor(@NotNull IDataInterceptor interceptor) {
        c().registerInterceptor(interceptor);
    }

    public final void removeControllerCallback(@NotNull String key) {
        this.callbackQueue.remove(key);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object sendData(@NotNull byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        f fVar;
        WiFiControllerModule wiFiControllerModule;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i = fVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.e = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objSendDataWithResult$default = fVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = fVar2.e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            c().onSend(bArr);
            fVar2.a = this;
            fVar2.b = bArr;
            fVar2.e = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, fVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            wiFiControllerModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) fVar2.b;
            wiFiControllerModule = (WiFiControllerModule) fVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        wiFiControllerModule.c().onFinishSend(bArr, zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Nullable
    public final Object sendToken(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull Continuation<? super Boolean> continuation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(WiFiControllerType.APP_SET_TOKEN.getValue());
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str2.getBytes(charset));
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str3.getBytes(charset));
        byteArrayOutputStream.write(0);
        Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str4.getBytes(charset));
        byteArrayOutputStream.write(0);
        if (str5 != null) {
            byteArrayOutputStream.write(str5.getBytes(charset));
            byteArrayOutputStream.write(0);
        }
        return sendData(byteArrayOutputStream.toByteArray(), continuation);
    }

    public final void setControllerCallback(@NotNull String key, @Nullable IWiFiControllerCallback callback) {
        if (callback == null) {
            return;
        }
        this.callbackQueue.put(key, callback);
    }

    @Nullable
    public final Object setPwd(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        byte[] bArr = {(byte) WiFiControllerType.APP_SET_PWD.getValue()};
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArr, str.getBytes(charset)), new byte[]{0});
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        return sendData(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus, str2.getBytes(charset)), new byte[]{0}), continuation);
    }

    @Nullable
    public final Object startAp(@NotNull String str, @NotNull String str2, @NotNull APReason aPReason, @NotNull Continuation<? super Boolean> continuation) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(WiFiControllerType.APP_START_AP.getValue());
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str2.getBytes(charset));
        byteArrayOutputStream.write(0);
        String value = aPReason.getValue();
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(value.getBytes(charset));
        byteArrayOutputStream.write(0);
        return sendData(byteArrayOutputStream.toByteArray(), continuation);
    }

    @Nullable
    public final Object stopAp(@NotNull Continuation<? super Boolean> continuation) {
        return sendData(new byte[]{(byte) WiFiControllerType.APP_STOP_AP.getValue()}, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.action.IDataCreator
    public void unregisterInterceptor(@NotNull IDataInterceptor interceptor) {
        c().unregisterInterceptor(interceptor);
    }
}
