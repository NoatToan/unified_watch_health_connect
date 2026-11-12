package com.xiaomi.hm.health.device.service;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceApi;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceApiFactory;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.receiver.HMPhoneUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J-\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\fJ/\u0010\u000e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0007J\u001d\u0010\u000f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010(\u001a\u00020#8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/service/FindPhoneWrapper;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "", "isIncall", "startFindPhone", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "(Landroid/content/Context;ZLcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromDevice", "stopFindPhone", "onDeviceDisconnect", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/lang/String;", "TAG", "", "b", "J", "DISCONNECT_DELAY", "c", "Z", "sFind", GoogleApiAvailabilityLight.a, "BRIGHT_SCREEN_WAKE_TIMEOUT", "e", "FIND_PHONE_DURATION", "Lkotlinx/coroutines/CompletableJob;", "f", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "g", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FindPhoneWrapper implements FindPhoneApi, CoroutineScope {

    @NotNull
    public static final FindPhoneWrapper INSTANCE = new FindPhoneWrapper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "FindPhoneWrapper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long DISCONNECT_DELAY = 10000;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean sFind = false;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final long BRIGHT_SCREEN_WAKE_TIMEOUT = 200;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final long FIND_PHONE_DURATION = 60000;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final CompletableJob job;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final CoroutineContext coroutineContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "pm null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "wl null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "release wl";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper", f = "FindPhoneWrapper.kt", i = {0, 0}, l = {155}, m = "onDeviceDisconnect", n = {"this", DbUtils.Const.Table.CONTEXT}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return FindPhoneWrapper.this.onDeviceDisconnect(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper$startFindPhone$1", f = "FindPhoneWrapper.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ HMBaseDevice d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, boolean z, HMBaseDevice hMBaseDevice, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = z;
            this.d = hMBaseDevice;
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
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneWrapper findPhoneWrapper = FindPhoneWrapper.INSTANCE;
                Context context = this.b;
                boolean z = this.c;
                HMBaseDevice hMBaseDevice = this.d;
                this.a = 1;
                if (findPhoneWrapper.startFindPhone(context, z, hMBaseDevice, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper", f = "FindPhoneWrapper.kt", i = {}, l = {53, 82}, m = "startFindPhone", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return FindPhoneWrapper.this.startFindPhone(null, false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "start find phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper$startFindPhone$5", f = "FindPhoneWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppNotification.showFindPhoneNotification(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI));
            FindPhoneWrapper.INSTANCE.a(this.b);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device is not connect " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "No find device api while start find phone: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "post stop find: " + FindPhoneWrapper.sFind + ", find result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper$startFindPhone$result$1", f = "FindPhoneWrapper.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(CompletableDeferred<Boolean> completableDeferred, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<Boolean> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper", f = "FindPhoneWrapper.kt", i = {}, l = {118}, m = "stopFindPhone", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return FindPhoneWrapper.this.stopFindPhone(null, false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "stopFindPhone: " + FindPhoneWrapper.sFind;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper$stopFindPhone$4", f = "FindPhoneWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context, Continuation<? super o> continuation) {
            super(2, continuation);
            this.b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HMPhoneUtil.stopRing(this.b);
            AppNotification.cancelFindPhoneNotification();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "giving up sending stop cmd to device as device not connected: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "No find device api: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "stop find phone";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneWrapper$stopFindPhone$9", f = "FindPhoneWrapper.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Context context, boolean z, Continuation<? super s> continuation) {
            super(2, continuation);
            this.b = context;
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new s(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
                FindPhoneWrapper findPhoneWrapper = FindPhoneWrapper.INSTANCE;
                Context context = this.b;
                boolean z = this.c;
                this.a = 1;
                if (findPhoneWrapper.stopFindPhone(context, z, device, this) == coroutine_suspended) {
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

    static {
        CompletableJob completableJobD = JobKt__JobKt.d(null, 1, null);
        job = completableJobD;
        coroutineContext = completableJobD.plus(Dispatchers.getIO());
    }

    private FindPhoneWrapper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            HMLog.info(TAG, a.a);
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(268435466, DeviceXFunctionsKt.getBuildConfigApi().getApplicationId() + ":bright");
        if (wakeLockNewWakeLock == null) {
            HMLog.info(TAG, b.a);
            return;
        }
        wakeLockNewWakeLock.acquire(200L);
        wakeLockNewWakeLock.release();
        HMLog.info(TAG, c.a);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object enableRing(@Nullable Context context, @Nullable HMBaseDevice hMBaseDevice, boolean z, boolean z2, @NotNull Continuation<? super Unit> continuation) {
        return FindPhoneApi.DefaultImpls.enableRing(this, context, hMBaseDevice, z, z2, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object onDeviceDisconnect(@Nullable Context context, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        FindPhoneWrapper findPhoneWrapper;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            dVar.a = this;
            dVar.b = context;
            dVar.e = 1;
            if (DelayKt.delay(10000L, dVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            findPhoneWrapper = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) dVar.b;
            findPhoneWrapper = (FindPhoneWrapper) dVar.a;
            ResultKt.throwOnFailure(obj);
        }
        findPhoneWrapper.stopFindPhone(context, true);
        return Unit.INSTANCE;
    }

    public final void startFindPhone(@NotNull Context context, boolean isIncall) {
        kotlinx.coroutines.e.f(this, null, null, new e(context, isIncall, HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI), null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object stopFindPhone(@Nullable Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object obj = mVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info(TAG, n.a);
            synchronized (this) {
                if (!sFind) {
                    return Unit.INSTANCE;
                }
                sFind = false;
                Unit unit = Unit.INSTANCE;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                o oVar = new o(context, null);
                mVar.a = hMBaseDevice;
                mVar.d = 1;
                if (BuildersKt.withContext(main, oVar, mVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMBaseDevice = (HMBaseDevice) mVar.a;
            ResultKt.throwOnFailure(obj);
        }
        if (hMBaseDevice == null || !hMBaseDevice.isConnected()) {
            HMLog.info(TAG, new p(hMBaseDevice));
            return Unit.INSTANCE;
        }
        FindDeviceApi findDeviceApiCreate = FindDeviceApiFactory.INSTANCE.create(hMBaseDevice);
        if (findDeviceApiCreate == null) {
            HMLog.info(TAG, new q(hMBaseDevice));
            return Unit.INSTANCE;
        }
        findDeviceApiCreate.stopFindPhone(new HMCallback<Integer>() { // from class: com.xiaomi.hm.health.device.service.FindPhoneWrapper.stopFindPhone.7

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.service.FindPhoneWrapper$stopFindPhone$7$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "findPhoneStop: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                HMLog.info(FindPhoneWrapper.TAG, new a(result));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object startFindPhone(@NotNull Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        f fVar;
        FindPhoneWrapper findPhoneWrapper;
        FindPhoneWrapper findPhoneWrapper2;
        Context context2;
        Channel channel;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objWithTimeoutOrNull = fVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            synchronized (this) {
                if (sFind) {
                    return Unit.INSTANCE;
                }
                sFind = true;
                Unit unit = Unit.INSTANCE;
                HMLog.info(TAG, g.a);
                HMPhoneUtil.startRing(context, z);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                h hVar = new h(context, null);
                fVar.a = this;
                fVar.b = context;
                fVar.c = hMBaseDevice;
                fVar.f = 1;
                if (BuildersKt.withContext(main, hVar, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                findPhoneWrapper = this;
            }
        } else {
            if (i3 == 1) {
                hMBaseDevice = (HMBaseDevice) fVar.c;
                context = (Context) fVar.b;
                findPhoneWrapper = (FindPhoneWrapper) fVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channel = (Channel) fVar.c;
                context2 = (Context) fVar.b;
                findPhoneWrapper2 = (FindPhoneWrapper) fVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            HMLog.info(TAG, new k((Boolean) objWithTimeoutOrNull));
            findPhoneWrapper2.stopFindPhone(context2, false);
            return Unit.INSTANCE;
        }
        if (hMBaseDevice != null && hMBaseDevice.isConnected() && (hMBaseDevice instanceof HMMiLiProDevice)) {
            FindDeviceApi findDeviceApiCreate = FindDeviceApiFactory.INSTANCE.create(hMBaseDevice);
            Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
            if (findDeviceApiCreate == null) {
                HMLog.info(TAG, new j(hMBaseDevice));
                return Unit.INSTANCE;
            }
            final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            findDeviceApiCreate.confirmFindPhone(new HMCallback<Integer>() { // from class: com.xiaomi.hm.health.device.service.FindPhoneWrapper.startFindPhone.8

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.service.FindPhoneWrapper$startFindPhone$8$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "findPhoneConfirm:" + this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(boolean result) {
                    HMLog.info(FindPhoneWrapper.TAG, new a(result));
                    if (result) {
                        return;
                    }
                    completableDeferredCompletableDeferred$default.complete(Boolean.valueOf(result));
                }
            });
            l lVar = new l(completableDeferredCompletableDeferred$default, null);
            fVar.a = findPhoneWrapper;
            fVar.b = context;
            fVar.c = channelChannel$default;
            fVar.f = 2;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(60000L, lVar, fVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            findPhoneWrapper2 = findPhoneWrapper;
            context2 = context;
            channel = channelChannel$default;
            SendChannel.DefaultImpls.close$default(channel, null, 1, null);
            HMLog.info(TAG, new k((Boolean) objWithTimeoutOrNull));
            findPhoneWrapper2.stopFindPhone(context2, false);
            return Unit.INSTANCE;
        }
        HMLog.info(TAG, new i(hMBaseDevice));
        return Unit.INSTANCE;
    }

    public final void stopFindPhone(@Nullable Context context, boolean fromDevice) {
        HMLog.info(TAG, r.a);
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new s(context, fromDevice, null), 2, null);
    }
}
