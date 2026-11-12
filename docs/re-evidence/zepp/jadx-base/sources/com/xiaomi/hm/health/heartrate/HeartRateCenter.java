package com.xiaomi.hm.health.heartrate;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.RealtimeHeartRateDevice;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateProfile;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.setting.realtime.RealTimeTransmissionEntry;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001(\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0006\u0010\u001b\u001a\u00020\u0003R\u0016\u0010\u001d\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010.\u001a\u00020\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010-R\u0016\u00102\u001a\u00020/8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/heartrate/HeartRateCenter;", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateProfile$IHeartRateChangedCallback;", "Lkotlinx/coroutines/CoroutineScope;", "", "e", "", "enable", GoogleApiAvailabilityLight.a, "", "key", "Lcom/xiaomi/hm/health/bt/profile/hr/HMHeartRateController$IHeartRateCallback;", "callback", "f", "g", "functionName", "a", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceBindEvent;", "startRealtimeHrForSpecialModule", "stopRealtimeHrForSpecialModule", "openRealtimeHr", "closeRealtimeHr", "", Constants.DATA_KEY_HR, "onHeartRateChanged", "clear", "Ljava/lang/String;", "TAG", "b", "MODULE_LONG_TERM", "Lkotlinx/coroutines/Job;", "c", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/Job;", "job", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "specialModuleMap", "com/xiaomi/hm/health/heartrate/HeartRateCenter$longTermListener$1", "Lcom/xiaomi/hm/health/heartrate/HeartRateCenter$longTermListener$1;", "longTermListener", "Z", "isRealTimeOn", "()Z", "isRealTimeSwitchOn", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HeartRateCenter implements HMHeartRateProfile.IHeartRateChangedCallback, CoroutineScope {

    @NotNull
    public static final HeartRateCenter INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HeartRateCenter";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String MODULE_LONG_TERM = "long_term";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy job;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<String, HMHeartRateController.IHeartRateCallback> specialModuleMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static HeartRateCenter$longTermListener$1 longTermListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static volatile boolean isRealTimeOn;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ HMDeviceSource b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HMDeviceSource hMDeviceSource) {
            super(0);
            this.a = str;
            this.b = hMDeviceSource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a + " fail because " + this.b + " not support realtime HR";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateCenter$clear$1", f = "HeartRateCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            synchronized (((CoroutineScope) this.b)) {
                HeartRateCenter heartRateCenter = HeartRateCenter.INSTANCE;
                HeartRateCenter.isRealTimeOn = false;
                HeartRateCenter.specialModuleMap.clear();
                unit = Unit.INSTANCE;
            }
            return unit;
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
            return "already close";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CompletableJob> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob getA() {
            return JobKt__JobKt.d(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "open TPRH when connected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateCenter$onEventMainThread$1", f = "HeartRateCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceConnectionEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMDeviceConnectionEvent hMDeviceConnectionEvent, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = hMDeviceConnectionEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeartRateCenter.INSTANCE.d(this.b.isConnected());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateCenter$onEventMainThread$2", f = "HeartRateCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceBindEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMDeviceBindEvent hMDeviceBindEvent, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = hMDeviceBindEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, continuation);
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
            HeartRateCenter.INSTANCE.d(this.b.isBound());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onHeartRateChanged: " + this.a + ", listener size: " + HeartRateCenter.specialModuleMap.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "switch off!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateCenter$openRealtimeHr$2", f = "HeartRateCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeartRateCenter.INSTANCE.f(HeartRateCenter.MODULE_LONG_TERM, HeartRateCenter.longTermListener);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateCenter$startRealtimeHrForSpecialModule$1", f = "HeartRateCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ HMHeartRateController.IHeartRateCallback c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, HMHeartRateController.IHeartRateCallback iHeartRateCallback, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = iHeartRateCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeartRateCenter.INSTANCE.f(this.b, this.c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "key: " + this.a + ", longTerm: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "already on, key: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "start, key: " + this.a + ", ret: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.heartrate.HeartRateCenter$stopRealtimeHrForSpecialModule$1", f = "HeartRateCenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.b = str;
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
            HeartRateCenter.INSTANCE.g(this.b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.xiaomi.hm.health.heartrate.HeartRateCenter$longTermListener$1] */
    static {
        HeartRateCenter heartRateCenter = new HeartRateCenter();
        INSTANCE = heartRateCenter;
        job = LazyKt__LazyJVMKt.lazy(d.a);
        specialModuleMap = new ConcurrentHashMap<>();
        longTermListener = new HMHeartRateController.IHeartRateCallback() { // from class: com.xiaomi.hm.health.heartrate.HeartRateCenter$longTermListener$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "longTermListener, hr: " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "longTermListener onOpen: " + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
            public void onHeartRateChanged(int hr) {
                HMLog.info("HeartRateCenter", new a(hr));
                RealTimeTransmissionEntry.INSTANCE.notifyHeartRateReceived(hr);
            }

            @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
            public void onOpen(boolean result) {
                HMLog.info("HeartRateCenter", new b(result));
            }
        };
        EventBus.getDefault().register(heartRateCenter);
    }

    private HeartRateCenter() {
    }

    private final boolean a(String functionName) {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        if (ConfigHelperKt.hasFeature(boundDeviceSource, Feature.HR_REALTIME_SOURCE_S)) {
            return false;
        }
        HMLog.info(TAG, new a(functionName, boundDeviceSource));
        return true;
    }

    private final Job b() {
        return (Job) job.getValue();
    }

    private final boolean c() {
        return RealTimeTransmissionEntry.isOpen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d(boolean enable) {
        try {
            if (!enable) {
                isRealTimeOn = false;
                e();
                return;
            }
            if (c()) {
                HMLog.info(TAG, e.a);
                openRealtimeHr();
            }
            ConcurrentHashMap<String, HMHeartRateController.IHeartRateCallback> concurrentHashMap = specialModuleMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, HMHeartRateController.IHeartRateCallback> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue() instanceof LongTermCallback) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                INSTANCE.f((String) entry2.getKey(), (HMHeartRateController.IHeartRateCallback) entry2.getValue());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void e() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, HMHeartRateController.IHeartRateCallback> entry : specialModuleMap.entrySet()) {
            if (!(entry.getValue() instanceof LongTermCallback)) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            specialModuleMap.remove((String) it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void f(String key, HMHeartRateController.IHeartRateCallback callback) {
        boolean z = callback instanceof LongTermCallback;
        HMLog.info(TAG, new l(key, z));
        if (z) {
            specialModuleMap.put(key, callback);
        }
        if (a("startRealtimeHr")) {
            return;
        }
        if (isRealTimeOn) {
            HMLog.info(TAG, new m(key));
            specialModuleMap.put(key, callback);
            callback.onOpen(true);
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiDevice");
        }
        boolean zStartRealtimeMeasureHrSync = ((HMMiLiDevice) device).startRealtimeMeasureHrSync(this);
        HMLog.info(TAG, new n(key, zStartRealtimeMeasureHrSync));
        callback.onOpen(zStartRealtimeMeasureHrSync);
        if (zStartRealtimeMeasureHrSync) {
            specialModuleMap.put(key, callback);
            isRealTimeOn = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void g(String key) {
        ConcurrentHashMap<String, HMHeartRateController.IHeartRateCallback> concurrentHashMap = specialModuleMap;
        if (concurrentHashMap.containsKey(key)) {
            concurrentHashMap.remove(key);
            if (concurrentHashMap.isEmpty()) {
                HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
                HMMiLiDevice hMMiLiDevice = device instanceof HMMiLiDevice ? (HMMiLiDevice) device : null;
                if (hMMiLiDevice != null) {
                    hMMiLiDevice.stopRealtimeMeasureHr();
                }
                isRealTimeOn = false;
            }
        }
    }

    public final void clear() {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new b(null), 2, null);
    }

    public final synchronized void closeRealtimeHr() {
        if (!isRealTimeOn) {
            HMLog.info(TAG, c.a);
            return;
        }
        IHMAuthCallback device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.huami.bluetooth.device.RealtimeHeartRateDevice");
        }
        ConcurrentHashMap<String, HMHeartRateController.IHeartRateCallback> concurrentHashMap = specialModuleMap;
        concurrentHashMap.remove(MODULE_LONG_TERM);
        if (concurrentHashMap.isEmpty()) {
            ((RealtimeHeartRateDevice) device).stopRealtimeMeasureHr();
            isRealTimeOn = false;
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return b().plus(Dispatchers.getIO());
    }

    public final void onEventMainThread(@NotNull HMDeviceConnectionEvent event) {
        if (event.getDeviceType() == HMDeviceType.MILI && !a("connectionEvent")) {
            kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new f(event, null), 2, null);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateProfile.IHeartRateChangedCallback
    public void onHeartRateChanged(int hr) {
        HMLog.info(TAG, new h(hr));
        Iterator<T> it2 = specialModuleMap.values().iterator();
        while (it2.hasNext()) {
            ((HMHeartRateController.IHeartRateCallback) it2.next()).onHeartRateChanged(hr);
        }
    }

    public final void openRealtimeHr() {
        if (c()) {
            kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new j(null), 2, null);
        } else {
            HMLog.info(TAG, i.a);
        }
    }

    public final void startRealtimeHrForSpecialModule(@NotNull String key, @NotNull HMHeartRateController.IHeartRateCallback callback) {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new k(key, callback, null), 2, null);
    }

    public final void stopRealtimeHrForSpecialModule(@NotNull String key) {
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new o(key, null), 2, null);
    }

    public final void onEventMainThread(@NotNull HMDeviceBindEvent event) {
        if (event.getDeviceType() != HMDeviceType.MILI) {
            return;
        }
        kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new g(event, null), 2, null);
    }
}
