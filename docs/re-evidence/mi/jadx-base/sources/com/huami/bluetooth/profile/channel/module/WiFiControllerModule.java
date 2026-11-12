package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.ConnectStatus;
import defpackage.d4;
import defpackage.gj;
import defpackage.jh;
import defpackage.jx;
import defpackage.ks;
import defpackage.kx;
import defpackage.mx;
import defpackage.ql;
import defpackage.r3;
import defpackage.t5t;
import defpackage.uo;
import defpackage.x;
import defpackage.x8;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
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
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]B\u000f\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u001b\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ_\u0010#\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020%H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J-\u0010*\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020(H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-JO\u00106\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b8\u0010'J\u0013\u00109\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b9\u0010'J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0014J\u0010\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0016R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR)\u0010H\u001a\u0014\u0012\u0004\u0012\u00020F\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040G0E8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010A\u001a\u0004\bN\u0010OR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/WiFiControllerModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "", "byteArray", "", "handlePwdRequest", "handleAddWifiRequest", "handleApStatusChanged", "handleCancel", "", "key", "Lgj;", "callback", "setControllerCallback", "removeControllerCallback", "init", "data", "onReceive", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleConnectStatusNotify", "ssid", "pwd", "", "setPwd", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx;", "secType", "Lx8;", "eapType", "Luo;", "phase2Type", HTTP.IDENTITY_CODING, "anonymousID", "addWiFi", "(Ljava/lang/String;Ljava/lang/String;Lmx;Lx8;Luo;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh5;", "queryWiFiConnectStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld;", "reason", "startAp", "(Ljava/lang/String;Ljava/lang/String;Ld;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWiFi", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginToken", "accesToken", "", "region", "appPlatform", q.f13858b, "appVersion", "local", "sendToken", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopAp", BroadcastsKt.SILENT_PUSHING_CANCEL, "sendData", "Ljh;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkx;", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "Lks;", "innerInterceptor$delegate", "getInnerInterceptor", "()Lks;", "innerInterceptor", "Ljava/util/concurrent/ConcurrentHashMap;", "callbackQueue", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "api", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 3)
public final class WiFiControllerModule extends a implements CoroutineScope {

    @NotNull
    public static final String TAG = "WiFiModule";
    public static final long TIMEOUT = 10000;
    public static final int WIFI_MODULE = 3;

    @NotNull
    private final ConcurrentHashMap<String, gj> callbackQueue;

    @NotNull
    private final Map<kx, Channel<byte[]>> channels;

    /* JADX INFO: renamed from: innerInterceptor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy innerInterceptor;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9858a;

        static {
            int[] iArr = new int[kx.values().length];
            try {
                iArr[kx.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kx.DEVICE_REQUEST_WIFI_PWD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kx.DEVICE_RQUEST_ADD_WIFI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kx.BIDIRECTION_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kx.DEVICE_NOTIFY_CONNECT_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kx.DEVICE_NOTIFY_AP_STATUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f9858a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule", f = "WiFiControllerModule.kt", i = {0, 0}, l = {104}, m = "handleConnectStatusNotify", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return WiFiControllerModule.this.handleConnectStatusNotify(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lks;", PluginDeviceInfo.FMODEL, "()Lks;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<ks> {
        public static final d t = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ks invoke() {
            return new ks(WiFiControllerModule.TAG, null, 2, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<CompletableJob> {
        public static final e t = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule", f = "WiFiControllerModule.kt", i = {0, 1}, l = {160, 164}, m = "queryWiFiConnectStatus", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return WiFiControllerModule.this.queryWiFiConnectStatus(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule$queryWiFiConnectStatus$response$1", f = "WiFiControllerModule.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int t;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WiFiControllerModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel<byte[]> channel = WiFiControllerModule.this.getChannels().get(kx.DEVICE_NOTIFY_CONNECT_STATUS);
                if (channel == null) {
                    return null;
                }
                this.t = 1;
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.WiFiControllerModule", f = "WiFiControllerModule.kt", i = {0, 0}, l = {237}, m = "sendData", n = {"this", "data"}, s = {"L$0", "L$1"})
    public static final class h extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return WiFiControllerModule.this.sendData((byte[]) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiFiControllerModule(@NotNull r3 api) {
        super(api);
        Intrinsics.checkNotNullParameter(api, "api");
        this.job = LazyKt__LazyJVMKt.lazy(e.t);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = LazyKt__LazyJVMKt.lazy(d.t);
        this.callbackQueue = new ConcurrentHashMap<>();
    }

    private final ks getInnerInterceptor() {
        return (ks) this.innerInterceptor.getValue();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final void handleAddWifiRequest(byte[] byteArray) {
        String strA = ql.a(byteArray, 0, 1, null);
        t5t.d(TAG, "Add Wi-Fi request:" + strA);
        Collection<gj> collectionValues = this.callbackQueue.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "callbackQueue.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((gj) it.next()).b(strA);
        }
    }

    private final void handleApStatusChanged(byte[] byteArray) {
        x xVarA = x.u.a(ArraysKt___ArraysKt.first(byteArray));
        t5t.d(TAG, "Ap state changed:" + xVarA);
        Collection<gj> collectionValues = this.callbackQueue.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "callbackQueue.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((gj) it.next()).a(xVarA);
        }
    }

    private final void handleCancel() {
        Collection<gj> collectionValues = this.callbackQueue.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "callbackQueue.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((gj) it.next()).onCancel();
        }
    }

    private final void handlePwdRequest(byte[] byteArray) {
        String strA = ql.a(byteArray, 0, 1, null);
        if (strA == null) {
            return;
        }
        t5t.d(TAG, "Request Wi-Fi " + strA + " password");
        Collection<gj> collectionValues = this.callbackQueue.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "callbackQueue.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((gj) it.next()).a(strA);
        }
    }

    public static /* synthetic */ Object startAp$default(WiFiControllerModule wiFiControllerModule, String str, String str2, defpackage.d dVar, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            dVar = defpackage.d.Music;
        }
        return wiFiControllerModule.startAp(str, str2, dVar, continuation);
    }

    @Nullable
    public final Object addWiFi(@NotNull String str, @Nullable String str2, @NotNull mx mxVar, @Nullable x8 x8Var, @Nullable uo uoVar, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(kx.APP_ADD_WIFI.getT());
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(mxVar.getT());
        if (x8Var != null) {
            byteArrayOutputStream.write(x8Var.getT());
        }
        if (uoVar != null) {
            byteArrayOutputStream.write(uoVar.getT());
        }
        if (str3 != null) {
            byte[] bytes3 = str3.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes3);
            byteArrayOutputStream.write(0);
        }
        if (str4 != null) {
            byte[] bytes4 = str4.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes4);
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return sendData(byteArray, continuation);
    }

    @Nullable
    public final Object cancel(@NotNull Continuation<? super Boolean> continuation) {
        return sendData(new byte[]{(byte) kx.BIDIRECTION_CANCEL.getT()}, continuation);
    }

    @Nullable
    public final Object deleteWiFi(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(kx.DELETE_WIFI.getT());
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] bytes2 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(bytes2, "bytes");
        return sendData(bytes2, continuation);
    }

    @NotNull
    public final Map<kx, Channel<byte[]>> getChannels() {
        return this.channels;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object handleConnectStatusNotify(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        c cVar;
        WiFiControllerModule wiFiControllerModule;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.x = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cVar.x;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<byte[]> channel = this.channels.get(kx.DEVICE_NOTIFY_CONNECT_STATUS);
            if (channel != null) {
                cVar.t = this;
                cVar.u = bArr;
                cVar.x = 1;
                if (channel.send(bArr, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            wiFiControllerModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) cVar.u;
            wiFiControllerModule = (WiFiControllerModule) cVar.t;
            ResultKt.throwOnFailure(obj);
        }
        ConnectStatus connectStatusA = ConnectStatus.g.a(bArr);
        t5t.d(TAG, "Notify wifi state:" + connectStatusA);
        Collection<gj> collectionValues = wiFiControllerModule.callbackQueue.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "callbackQueue.values");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((gj) it.next()).a(connectStatusA);
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        t5t.d(TAG, "Start wifi module");
        super.init();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    @Nullable
    public Object onReceive(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation) {
        getInnerInterceptor().a(bArr);
        kx kxVarA = kx.u.a(ArraysKt___ArraysKt.first(bArr));
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, new IntRange(1, bArr.length - 1));
        switch (b.f9858a[kxVarA.ordinal()]) {
            case 1:
                t5t.d(TAG, "Unsupport type");
                break;
            case 2:
                handlePwdRequest(bArrSliceArray);
                break;
            case 3:
                handleAddWifiRequest(bArrSliceArray);
                break;
            case 4:
                handleCancel();
                break;
            case 5:
                Object objHandleConnectStatusNotify = handleConnectStatusNotify(bArrSliceArray, continuation);
                return objHandleConnectStatusNotify == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleConnectStatusNotify : Unit.INSTANCE;
            case 6:
                handleApStatusChanged(bArrSliceArray);
                break;
            default:
                t5t.d(TAG, "Unsupport type");
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:16:0x0031, B:35:0x00a0, B:37:0x00a4, B:40:0x00b6, B:17:0x0039, B:18:0x0040, B:19:0x0041, B:25:0x0071, B:27:0x0079, B:30:0x008c, B:20:0x0049, B:11:0x001b), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:16:0x0031, B:35:0x00a0, B:37:0x00a4, B:40:0x00b6, B:17:0x0039, B:18:0x0040, B:19:0x0041, B:25:0x0071, B:27:0x0079, B:30:0x008c, B:20:0x0049, B:11:0x001b), top: B:45:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:12:0x0020, B:16:0x0031, B:35:0x00a0, B:37:0x00a4, B:40:0x00b6, B:17:0x0039, B:18:0x0040, B:19:0x0041, B:25:0x0071, B:27:0x0079, B:30:0x008c, B:20:0x0049, B:11:0x001b), top: B:45:0x0005 }] */
    @Nullable
    public final synchronized Object queryWiFiConnectStatus(@NotNull Continuation<? super ConnectStatus> continuation) {
        f fVar;
        WiFiControllerModule wiFiControllerModule;
        WiFiControllerModule wiFiControllerModule2;
        byte[] bArr;
        try {
            if (continuation instanceof f) {
                fVar = (f) continuation;
                int i = fVar.w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    fVar.w = i - Integer.MIN_VALUE;
                } else {
                    fVar = new f(continuation);
                }
            } else {
                fVar = new f(continuation);
            }
            Object objSendData = fVar.u;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = fVar.w;
            if (i2 != 0) {
                if (i2 == 1) {
                    wiFiControllerModule = (WiFiControllerModule) fVar.t;
                    ResultKt.throwOnFailure(objSendData);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wiFiControllerModule2 = (WiFiControllerModule) fVar.t;
                    ResultKt.throwOnFailure(objSendData);
                }
                bArr = (byte[]) objSendData;
                if (bArr == null) {
                    return new ConnectStatus(jx.NONE, null, null, null, null, null, 62, null);
                }
                wiFiControllerModule2.channels.remove(kx.DEVICE_NOTIFY_CONNECT_STATUS);
                return ConnectStatus.g.a(bArr);
            }
            ResultKt.throwOnFailure(objSendData);
            this.channels.put(kx.DEVICE_NOTIFY_CONNECT_STATUS, ChannelKt.Channel$default(0, null, null, 7, null));
            byte[] bArr2 = {(byte) kx.APP_QUERY_CONNECT_STATUS.getT()};
            fVar.t = this;
            fVar.w = 1;
            objSendData = sendData(bArr2, fVar);
            if (objSendData == coroutine_suspended) {
                return coroutine_suspended;
            }
            wiFiControllerModule = this;
            if (!((Boolean) objSendData).booleanValue()) {
                return new ConnectStatus(jx.NONE, null, null, null, null, null, 62, null);
            }
            g gVar = wiFiControllerModule.new g(null);
            fVar.t = wiFiControllerModule;
            fVar.w = 2;
            objSendData = TimeoutKt.withTimeoutOrNull(10000L, gVar, fVar);
            if (objSendData == coroutine_suspended) {
                return coroutine_suspended;
            }
            wiFiControllerModule2 = wiFiControllerModule;
            bArr = (byte[]) objSendData;
            if (bArr == null) {
                return new ConnectStatus(jx.NONE, null, null, null, null, null, 62, null);
            }
            wiFiControllerModule2.channels.remove(kx.DEVICE_NOTIFY_CONNECT_STATUS);
            return ConnectStatus.g.a(bArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void registerInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        getInnerInterceptor().a(interceptor);
    }

    public final void removeControllerCallback(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.callbackQueue.remove(key);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object sendData(@NotNull byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        h hVar;
        WiFiControllerModule wiFiControllerModule;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i = hVar.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.x = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        h hVar2 = hVar;
        Object objSendDataWithResult$default = hVar2.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = hVar2.x;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            getInnerInterceptor().b(bArr);
            hVar2.t = this;
            hVar2.u = bArr;
            hVar2.x = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArr, 0, false, hVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            wiFiControllerModule = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) hVar2.u;
            wiFiControllerModule = (WiFiControllerModule) hVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        wiFiControllerModule.getInnerInterceptor().a(bArr, zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Nullable
    public final Object sendToken(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(kx.APP_SET_TOKEN.getT());
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes2);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(i2);
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes3);
        byteArrayOutputStream.write(0);
        byte[] bytes4 = str4.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes4);
        byteArrayOutputStream.write(0);
        if (str5 != null) {
            byte[] bytes5 = str5.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes5);
            byteArrayOutputStream.write(0);
        }
        byte[] bytes6 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(bytes6, "bytes");
        return sendData(bytes6, continuation);
    }

    public final void setControllerCallback(@NotNull String key, @Nullable gj callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (callback != null) {
            this.callbackQueue.put(key, callback);
        }
    }

    @Nullable
    public final Object setPwd(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        byte[] bArr = {(byte) kx.APP_SET_PWD.getT()};
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArr, bytes), new byte[]{0});
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        return sendData(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus, bytes2), new byte[]{0}), continuation);
    }

    @Nullable
    public final Object startAp(@NotNull String str, @NotNull String str2, @NotNull defpackage.d dVar, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(kx.APP_START_AP.getT());
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes);
        byteArrayOutputStream.write(0);
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes2);
        byteArrayOutputStream.write(0);
        byte[] bytes3 = dVar.getT().getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStream.write(bytes3);
        byteArrayOutputStream.write(0);
        byte[] bytes4 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(bytes4, "bytes");
        return sendData(bytes4, continuation);
    }

    @Nullable
    public final Object stopAp(@NotNull Continuation<? super Boolean> continuation) {
        return sendData(new byte[]{(byte) kx.APP_STOP_AP.getT()}, continuation);
    }

    public void unregisterInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        getInnerInterceptor().b(interceptor);
    }
}
