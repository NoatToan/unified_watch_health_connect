package com.xiaomi.hm.health.starsky.api.channel;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.starsky.IStarSkyDeviceDataReceiver;
import com.huami.bluetooth.profile.channel.module.starsky.StarSkyChannelApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyActivity;
import com.xiaomi.hm.health.bt.model.starsky.StarSkyRrInterval;
import com.xiaomi.hm.health.bt.model.starsky.StarSkySleep;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataExtend;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.health.rrpeak.RRPackageDataAnalysisUtils;
import com.xiaomi.hm.health.device.health.rrpeak.RRSingleDataNew;
import com.xiaomi.hm.health.starsky.StartSkyDataCallback;
import com.xiaomi.hm.health.starsky.api.StarSkyApi;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/starsky/api/channel/ChannelStarSkyApiImpl;", "Lcom/xiaomi/hm/health/starsky/api/StarSkyApi;", "Lkotlinx/coroutines/CoroutineScope;", "", "data", "", "b", "c", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "callback", "registerDataCallback", "Lcom/xiaomi/hm/health/device/event/HMDeviceConnectionEvent;", "event", "onEvent", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyChannelApi;", "a", "Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyChannelApi;", "mChannelApi", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/Job;", "job", "", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkyActivity;", "Ljava/util/List;", "mActivityList", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkySleep;", "mSleepList", "Lcom/xiaomi/hm/health/bt/model/starsky/StarSkyRrInterval;", "e", "mRrList", "f", "Lcom/xiaomi/hm/health/starsky/StartSkyDataCallback;", "mCallback", "", "g", "J", "mDisconnectTimeStamp", "h", "mLastDataTime", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyChannelApi;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ChannelStarSkyApiImpl implements StarSkyApi, CoroutineScope {

    @NotNull
    private static final String i = "ChannelStarSkyApiImpl";
    private static final int j = 1;
    private static final int k = 2;
    private static final long l = 120000;
    private static final long m = 60000;
    private static final int n = 5;
    private static final int o = 255;
    private static final int p = 63;
    private static final int q = 127;
    private static final int r = 100;

    @NotNull
    private static final String s = "AIMUSIC_BLE_DISCONNECT";

    @NotNull
    private static final String t = "AIMUSIC_BLE_DATA_TIMEOUT";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final StarSkyChannelApi mChannelApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<StarSkyActivity> mActivityList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<StarSkySleep> mSleepList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final List<StarSkyRrInterval> mRrList = new ArrayList();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private StartSkyDataCallback mCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long mDisconnectTimeStamp;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long mLastDataTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CompletableJob> {
        public static final a a = new a();

        public a() {
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
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "last disconnect time:" + ChannelStarSkyApiImpl.this.mDisconnectTimeStamp;
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
            return "device disconnect, record disconnect time";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "data is timeout by currentTime:" + this.a + ", lastTime:mLastDataTime";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ StarSkyActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(StarSkyActivity starSkyActivity) {
            super(0);
            this.a = starSkyActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "star sky activity:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ StarSkySleep a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StarSkySleep starSkySleep) {
            super(0);
            this.a = starSkySleep;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "star sky sleep:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ StarSkyRrInterval a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(StarSkyRrInterval starSkyRrInterval) {
            super(0);
            this.a = starSkyRrInterval;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "rrinterval:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl$unregister$1", f = "ChannelStarSkyApiImpl.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChannelStarSkyApiImpl.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StarSkyChannelApi starSkyChannelApi = ChannelStarSkyApiImpl.this.mChannelApi;
                this.a = 1;
                if (starSkyChannelApi.disableRelaxMusic(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl$registerDataCallback$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl$registerDataCallback$1", f = "ChannelStarSkyApiImpl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl$registerDataCallback$1$a */
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
                return "enable star sky result:" + this.a;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ChannelStarSkyApiImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StarSkyChannelApi starSkyChannelApi = ChannelStarSkyApiImpl.this.mChannelApi;
                final ChannelStarSkyApiImpl channelStarSkyApiImpl = ChannelStarSkyApiImpl.this;
                IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver = new IStarSkyDeviceDataReceiver() { // from class: com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl$registerDataCallback$1$result$1
                    @Override // com.huami.bluetooth.profile.channel.module.starsky.IStarSkyDeviceDataReceiver
                    public void onReceiveData(int type, @NotNull byte[] data) {
                        if (type == 1) {
                            channelStarSkyApiImpl.b(data);
                        } else if (type == 2) {
                            channelStarSkyApiImpl.c(data);
                        }
                        channelStarSkyApiImpl.d();
                    }
                };
                this.a = 1;
                obj = starSkyChannelApi.enableRelaxMusic(iStarSkyDeviceDataReceiver, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HMLog.info(ChannelStarSkyApiImpl.i, new a(((Boolean) obj).booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public ChannelStarSkyApiImpl(@NotNull StarSkyChannelApi starSkyChannelApi) {
        this.mChannelApi = starSkyChannelApi;
    }

    private final Job a() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(byte[] data) {
        if (data.length == 13) {
            long jBytesToLong = GattUtils.bytesToLong(data, 1, 4) * ((long) 1000);
            long j2 = this.mLastDataTime;
            if (j2 != 0) {
                if ((jBytesToLong / 60000) - (j2 / 60000) > 1) {
                    HMLog.info(i, new d(jBytesToLong));
                    Analytics.recordEvent(new CountEventBuilder(t));
                }
            }
            this.mLastDataTime = jBytesToLong;
            ActivityDataExtend activityDataExtend = new ActivityDataExtend(ArraysKt___ArraysKt.sliceArray(data, new IntRange(5, data.length - 1)));
            List<StarSkyActivity> list = this.mActivityList;
            StarSkyActivity starSkyActivity = new StarSkyActivity(jBytesToLong, activityDataExtend.intensity & 255);
            HMLog.info(i, new e(starSkyActivity));
            Unit unit = Unit.INSTANCE;
            list.add(starSkyActivity);
            int sleepProbabilityAndPosture = activityDataExtend.getSleepProbabilityAndPosture() & 63;
            float f2 = 100;
            float sleepProbabilityDeep = ((activityDataExtend.getSleepProbabilityDeep() & 127) / 127.0f) * f2;
            float sleepProbabilityRem = ((activityDataExtend.getSleepProbabilityRem() & 127) / 127.0f) * f2;
            List<StarSkySleep> list2 = this.mSleepList;
            StarSkySleep starSkySleep = new StarSkySleep(jBytesToLong, sleepProbabilityAndPosture, sleepProbabilityDeep, sleepProbabilityRem);
            HMLog.info(i, new f(starSkySleep));
            list2.add(starSkySleep);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] data) {
        List<Integer> listReversed;
        for (RRSingleDataNew rRSingleDataNew : RRPackageDataAnalysisUtils.analysisForRRPkgDataNew(data)) {
            long jLongValue = rRSingleDataNew.getTimestamp().longValue() * ((long) 1000);
            List<Integer> intervalData = rRSingleDataNew.getIntervalData();
            if (intervalData != null && (listReversed = CollectionsKt___CollectionsKt.reversed(intervalData)) != null) {
                for (Integer num : listReversed) {
                    List<StarSkyRrInterval> list = this.mRrList;
                    StarSkyRrInterval starSkyRrInterval = new StarSkyRrInterval(jLongValue, num.intValue());
                    HMLog.info(i, new g(starSkyRrInterval));
                    Unit unit = Unit.INSTANCE;
                    list.add(starSkyRrInterval);
                    jLongValue -= (long) Math.abs(num.intValue());
                }
            }
        }
        List<StarSkyRrInterval> list2 = this.mRrList;
        if (list2.size() > 1) {
            kotlin.collections.g.sortWith(list2, new Comparator() { // from class: com.xiaomi.hm.health.starsky.api.channel.ChannelStarSkyApiImpl$parseRrData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StarSkyRrInterval) t2).getTimestamp()), Long.valueOf(((StarSkyRrInterval) t3).getTimestamp()));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        if (this.mCallback != null && (!this.mActivityList.isEmpty()) && (!this.mSleepList.isEmpty()) && (!this.mRrList.isEmpty())) {
            StartSkyDataCallback startSkyDataCallback = this.mCallback;
            if (startSkyDataCallback != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mActivityList);
                Unit unit = Unit.INSTANCE;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mSleepList);
                List<StarSkyRrInterval> list = this.mRrList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((StarSkyRrInterval) it2.next()).getTimestamp()));
                }
                List<StarSkyRrInterval> list2 = this.mRrList;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Integer.valueOf(((StarSkyRrInterval) it3.next()).getRrInterval()));
                }
                startSkyDataCallback.onData(arrayList, arrayList2, arrayList3, arrayList4);
            }
            this.mActivityList.clear();
            this.mSleepList.clear();
            this.mRrList.clear();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return a().plus(Dispatchers.getIO());
    }

    public final void onEvent(@NotNull HMDeviceConnectionEvent event) {
        if (event.getDeviceType() != HMDeviceType.MILI) {
            return;
        }
        if (!event.isConnected()) {
            if (event.isDisconnected()) {
                HMLog.info(i, c.a);
                this.mDisconnectTimeStamp = System.currentTimeMillis();
                Analytics.recordEvent(new CountEventBuilder(s));
                return;
            }
            return;
        }
        HMLog.info(i, new b());
        if (this.mDisconnectTimeStamp <= 0 || System.currentTimeMillis() - this.mDisconnectTimeStamp < 120000) {
            return;
        }
        this.mDisconnectTimeStamp = 0L;
        StartSkyDataCallback startSkyDataCallback = this.mCallback;
        if (startSkyDataCallback == null) {
            return;
        }
        registerDataCallback(startSkyDataCallback);
    }

    @Override // com.xiaomi.hm.health.starsky.api.StarSkyApi
    public void registerDataCallback(@NotNull StartSkyDataCallback callback) {
        this.mCallback = callback;
        this.mActivityList.clear();
        this.mSleepList.clear();
        this.mRrList.clear();
        this.mLastDataTime = 0L;
        kotlinx.coroutines.e.f(this, null, null, new AnonymousClass1(null), 3, null);
        EventBus.getDefault().register(this);
    }

    @Override // com.xiaomi.hm.health.starsky.api.StarSkyApi
    public void unregister() {
        this.mCallback = null;
        kotlinx.coroutines.e.f(this, null, null, new h(null), 3, null);
        EventBus.getDefault().unregister(this);
    }
}
