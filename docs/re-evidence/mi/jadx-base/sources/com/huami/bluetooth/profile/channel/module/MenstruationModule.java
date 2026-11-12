package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.model.ErrorCode;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualNotifiedData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.jl;
import defpackage.kl;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
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
@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001]B\u000f\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J!\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J-\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\n*\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0002J\f\u0010\"\u001a\u00020!*\u00020 H\u0002J\f\u0010#\u001a\u00020\n*\u00020 H\u0002J\f\u0010%\u001a\u00020$*\u00020 H\u0002J\b\u0010'\u001a\u00020&H\u0016J\u001b\u0010(\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b(\u0010)J\u0014\u0010-\u001a\u00020&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*J\u0015\u0010-\u001a\u0004\u0018\u00010+H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u000fJ\u001c\u0010/\u001a\u00020&2\u0006\u0010.\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140*J\u001b\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020+H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u0004\u0018\u00010\rJ\u000e\u00102\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u00103\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u00104\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u00105\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R&\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R?\u0010D\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020&\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010K\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010W\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/MenstruationModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "cmd", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualNotifiedData;", "parseNotifiedData", "", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;", "periodData", "", "setPeriodData", "([Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "syncSettingData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "switchSmartPredict", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchMenstruationDeviceNotify", "", "days", "setMenstruationNotify", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMenstruationOvulation", "", "flag", "assembleCmd", "(BZLjava/lang/Integer;)[B", "Lm4;", "type", "isSuccess", "Ljava/nio/ByteBuffer;", "", "getUInt8", "getBoolean", "", "getUInt32", "", "init", "setPeriodDataSync", "([Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;)Z", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "callback", "getMenstruationTotalRecord", "totalRecord", "setMenstruationTotalRecord", "(Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSettingDataSync", "switchSmartPredictSync", "switchMenstruationDeviceNotifySync", "setMenstruationNotifySync", "setMenstruationOvulationSync", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "notifiedData", "menstrualPeriodDataChangeListener", "Lkotlin/jvm/functions/Function1;", "getMenstrualPeriodDataChangeListener", "()Lkotlin/jvm/functions/Function1;", "setMenstrualPeriodDataChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "dataChangeListener", "Lkotlin/jvm/functions/Function0;", "getDataChangeListener", "()Lkotlin/jvm/functions/Function0;", "setDataChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class MenstruationModule extends a implements CoroutineScope {
    public static final byte FLAG_DEVICE_NOTIFY = 2;
    public static final byte FLAG_MENSTRUATION = 4;
    public static final byte FLAG_OVULATION = 8;
    public static final byte FLAG_SMART_PREDICT = 1;
    public static final int MENSTRUATION_MODULE = 5;

    @NotNull
    public static final String TAG = "MenstruationModule";
    public static final long TIMEOUT = 15000;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    @Nullable
    private Function0<Unit> dataChangeListener;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private Function1<? super MenstrualNotifiedData, Unit> menstrualPeriodDataChangeListener;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$syncSettingDataSync$1", f = "MenstruationModule.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MenstruationConfig>, Object> {
        public int t;

        public a0(Continuation<? super a0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super MenstruationConfig> continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new a0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                this.t = 1;
                obj = menstruationModule.syncSettingData(this);
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$getMenstruationTotalRecord$1", f = "MenstruationModule.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<MenstruationTotalRecord> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMCallback<MenstruationTotalRecord> hMCallback, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new b(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                this.t = 1;
                obj = menstruationModule.getMenstruationTotalRecord(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.v.onFinish((MenstruationTotalRecord) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0}, l = {133, 138}, m = "getMenstruationTotalRecord", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.getMenstruationTotalRecord(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$getMenstruationTotalRecord$response$1", f = "MenstruationModule.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(2));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$init$1$1", f = "MenstruationModule.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"type"}, s = {"B$0"})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public byte t;
            public int u;
            public final /* synthetic */ ChannelResponse v;
            public final /* synthetic */ MenstruationModule w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, MenstruationModule menstruationModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.v = channelResponse;
                this.w = menstruationModule;
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
                return new a(this.v, this.w, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                byte b2;
                Function1<MenstrualNotifiedData, Unit> menstrualPeriodDataChangeListener;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.u;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.v.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.v.getData());
                    Channel channel = (Channel) this.w.channels.get(Boxing.boxInt(bFirst));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.v;
                        this.t = bFirst;
                        this.u = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    b2 = bFirst;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b2 = this.t;
                    ResultKt.throwOnFailure(obj);
                }
                if (b2 == 15 && this.w.getMenstrualPeriodDataChangeListener() != null) {
                    MenstrualNotifiedData notifiedData = this.w.parseNotifiedData(this.v.getData());
                    if (notifiedData != null && (menstrualPeriodDataChangeListener = this.w.getMenstrualPeriodDataChangeListener()) != null) {
                        menstrualPeriodDataChangeListener.invoke2(notifiedData);
                    }
                } else if (b2 == -1) {
                    t5t.d(MenstruationModule.TAG, "onDataChanged");
                    Function0<Unit> dataChangeListener = this.w.getDataChangeListener();
                    if (dataChangeListener != null) {
                        dataChangeListener.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MenstruationModule menstruationModule = MenstruationModule.this;
            BuildersKt__Builders_commonKt.launch$default(menstruationModule, null, null, new a(it, menstruationModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<CompletableJob> {
        public static final f t = new f();

        public f() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0, 1}, l = {276, 281}, m = "setMenstruationNotify", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class g extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.setMenstruationNotify(false, 0, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationNotify$response$1", f = "MenstruationModule.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationNotifySync$1", f = "MenstruationModule.kt", i = {}, l = {SportSummary.VERSION_105}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ int v;
        public final /* synthetic */ MenstruationModule w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z, int i, MenstruationModule menstruationModule, Continuation<? super i> continuation) {
            super(2, continuation);
            this.u = z;
            this.v = i;
            this.w = menstruationModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t5t.d(MenstruationModule.TAG, "setMenstruationNotify: " + this.u + ", days:" + this.v);
                MenstruationModule menstruationModule = this.w;
                boolean z = this.u;
                int i2 = this.v;
                this.t = 1;
                obj = menstruationModule.setMenstruationNotify(z, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t5t.d(MenstruationModule.TAG, "setMenstruationNotifySync: " + zBooleanValue);
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0, 1}, l = {305, 310}, m = "setMenstruationOvulation", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class j extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.setMenstruationOvulation(false, 0, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationOvulation$response$1", f = "MenstruationModule.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationOvulationSync$1", f = "MenstruationModule.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ int v;
        public final /* synthetic */ MenstruationModule w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z, int i, MenstruationModule menstruationModule, Continuation<? super l> continuation) {
            super(2, continuation);
            this.u = z;
            this.v = i;
            this.w = menstruationModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t5t.d(MenstruationModule.TAG, "setMenstruationNotify: " + this.u + ", days:" + this.v);
                MenstruationModule menstruationModule = this.w;
                boolean z = this.u;
                int i2 = this.v;
                this.t = 1;
                obj = menstruationModule.setMenstruationOvulation(z, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t5t.d(MenstruationModule.TAG, "setMenstruationOvulationSync: " + zBooleanValue);
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationTotalRecord$1", f = "MenstruationModule.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ MenstruationTotalRecord v;
        public final /* synthetic */ HMCallback<Integer> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MenstruationTotalRecord menstruationTotalRecord, HMCallback<Integer> hMCallback, Continuation<? super m> continuation) {
            super(2, continuation);
            this.v = menstruationTotalRecord;
            this.w = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new m(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                MenstruationTotalRecord menstruationTotalRecord = this.v;
                this.t = 1;
                obj = menstruationModule.setMenstruationTotalRecord(menstruationTotalRecord, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.w.onFinish(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0}, l = {162, 167}, m = "setMenstruationTotalRecord", n = {"this"}, s = {"L$0"})
    public static final class n extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.setMenstruationTotalRecord((MenstruationTotalRecord) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationTotalRecord$response$1", f = "MenstruationModule.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(4));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0}, l = {104, 109}, m = "setPeriodData", n = {"this"}, s = {"L$0"})
    public static final class p extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.setPeriodData(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setPeriodData$response$1", f = "MenstruationModule.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(10));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setPeriodDataSync$1", f = "MenstruationModule.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ MenstrualPeriodData[] v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(MenstrualPeriodData[] menstrualPeriodDataArr, Continuation<? super r> continuation) {
            super(2, continuation);
            this.v = menstrualPeriodDataArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new r(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                MenstrualPeriodData[] menstrualPeriodDataArr = this.v;
                this.t = 1;
                obj = menstruationModule.setPeriodData(menstrualPeriodDataArr, this);
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0, 1}, l = {247, 252}, m = "switchMenstruationDeviceNotify", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class s extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.switchMenstruationDeviceNotify(false, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchMenstruationDeviceNotify$response$1", f = "MenstruationModule.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new t(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchMenstruationDeviceNotifySync$1", f = "MenstruationModule.kt", i = {}, l = {ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ MenstruationModule v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z, MenstruationModule menstruationModule, Continuation<? super u> continuation) {
            super(2, continuation);
            this.u = z;
            this.v = menstruationModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new u(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t5t.d(MenstruationModule.TAG, "switchMenstruationDeviceNotify: " + this.u);
                MenstruationModule menstruationModule = this.v;
                boolean z = this.u;
                this.t = 1;
                obj = menstruationModule.switchMenstruationDeviceNotify(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t5t.d(MenstruationModule.TAG, "switchMenstruationDeviceNotifySync: " + zBooleanValue);
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0, 1}, l = {217, 222}, m = "switchSmartPredict", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class v extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.switchSmartPredict(false, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchSmartPredict$response$1", f = "MenstruationModule.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new w(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchSmartPredictSync$1", f = "MenstruationModule.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ boolean u;
        public final /* synthetic */ MenstruationModule v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(boolean z, MenstruationModule menstruationModule, Continuation<? super x> continuation) {
            super(2, continuation);
            this.u = z;
            this.v = menstruationModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new x(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                t5t.d(MenstruationModule.TAG, "switchSmartPredict: " + this.u);
                MenstruationModule menstruationModule = this.v;
                boolean z = this.u;
                this.t = 1;
                obj = menstruationModule.switchSmartPredict(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            t5t.d(MenstruationModule.TAG, "switchSmartPredictSync: " + zBooleanValue);
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {0}, l = {SportReportBaseParser.ReportType.avgDivingDepth, SportReportBaseParser.ReportType.minWaterTemperature}, m = "syncSettingData", n = {"this"}, s = {"L$0"})
    public static final class y extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public y(Continuation<? super y> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return MenstruationModule.this.syncSettingData(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$syncSettingData$response$1", f = "MenstruationModule.kt", i = {}, l = {SportReportBaseParser.ReportType.minWaterTemperature}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new z(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(6));
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
            return (ChannelResponse) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenstruationModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(f.t);
        this.channels = new LinkedHashMap();
    }

    private final byte[] assembleCmd(byte flag, boolean enable, Integer days) {
        if (days != null && days.intValue() > 5) {
            t5t.d(TAG, "Ovulation days > 5");
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(7);
            byteArrayOutputStream.write(tet.s(flag));
            if (days != null) {
                byteArrayOutputStream.write((byte) (((byte) days.intValue()) | (enable ? (byte) -128 : (byte) 0)));
            } else {
                byteArrayOutputStream.write(enable ? 1 : 0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            t5t.d(TAG, "assembleOvulationCmd: e: " + e2);
            return null;
        }
    }

    public static /* synthetic */ byte[] assembleCmd$default(MenstruationModule menstruationModule, byte b2, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return menstruationModule.assembleCmd(b2, z2, num);
    }

    private final boolean getBoolean(ByteBuffer byteBuffer) {
        return byteBuffer.get() == 1;
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final long getUInt32(ByteBuffer byteBuffer) {
        return tet.v(new byte[]{byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get()}, 0, 4);
    }

    private final short getUInt8(ByteBuffer byteBuffer) {
        return (short) (byteBuffer.get() & 255);
    }

    private final boolean isSuccess(ChannelResponse channelResponse, byte b2) {
        return channelResponse != null && channelResponse.getData().length == 2 && channelResponse.getData()[0] == b2 && channelResponse.getData()[1] == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenstrualNotifiedData parseNotifiedData(byte[] cmd) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            t5t.d(TAG, "notifiedData: " + tet.x(cmd));
            ByteBuffer byteBuffer = ByteBuffer.wrap(cmd);
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            objM886constructorimpl = Result.m886constructorimpl(new MenstrualNotifiedData(getUInt8(byteBuffer), getUInt8(byteBuffer), getBoolean(byteBuffer), getUInt32(byteBuffer)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "parseNotifiedData: " + thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        return (MenstrualNotifiedData) objM886constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object setMenstruationNotify(boolean z2, int i2, Continuation<? super Boolean> continuation) {
        g gVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.w = i3 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        g gVar2 = gVar;
        Object objSendDataWithResult$default = gVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = gVar2.w;
        if (i4 != 0) {
            if (i4 == 1) {
                menstruationModule = (MenstruationModule) gVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) gVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "setMenstruationNotify response: " + channelResponse);
            return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrAssembleCmd = assembleCmd((byte) 4, z2, Boxing.boxInt(i2));
        t5t.d(TAG, "setMenstruationNotify cmd: " + tet.x(bArrAssembleCmd));
        if (bArrAssembleCmd == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        gVar2.t = this;
        gVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrAssembleCmd, 0, false, gVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "setMenstruationNotify ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        h hVar = menstruationModule.new h(null);
        gVar2.t = menstruationModule;
        gVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, hVar, gVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "setMenstruationNotify response: " + channelResponse2);
        return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object setMenstruationOvulation(boolean z2, int i2, Continuation<? super Boolean> continuation) {
        j jVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.w = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        j jVar2 = jVar;
        Object objSendDataWithResult$default = jVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = jVar2.w;
        if (i4 != 0) {
            if (i4 == 1) {
                menstruationModule = (MenstruationModule) jVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) jVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "setMenstruationOvulation response: " + channelResponse);
            return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrAssembleCmd = assembleCmd((byte) 8, z2, Boxing.boxInt(i2));
        t5t.d(TAG, "setMenstruationOvulation cmd: " + tet.x(bArrAssembleCmd));
        if (bArrAssembleCmd == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        jVar2.t = this;
        jVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrAssembleCmd, 0, false, jVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "setMenstruationOvulation ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        k kVar = menstruationModule.new k(null);
        jVar2.t = menstruationModule;
        jVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, kVar, jVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "setMenstruationOvulation response: " + channelResponse2);
        return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object setPeriodData(MenstrualPeriodData[] menstrualPeriodDataArr, Continuation<? super Boolean> continuation) throws IOException {
        p pVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.w = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        p pVar2 = pVar;
        Object objSendDataWithResult$default = pVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pVar2.w;
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) pVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                t5t.d(TAG, "setPeriodData response null");
                return Boxing.boxBoolean(false);
            }
            data = channelResponse.getData();
            if (data.length == 2 && data[0] == 10 && data[1] == 1) {
                z2 = true;
            }
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrA = jl.a(menstrualPeriodDataArr);
        t5t.d(TAG, "setPeriodData: " + tet.x(bArrA));
        this.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, null, null, 7, null));
        pVar2.t = this;
        pVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrA, 0, false, pVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "setPeriodData ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        q qVar = menstruationModule.new q(null);
        pVar2.t = null;
        pVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, qVar, pVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            t5t.d(TAG, "setPeriodData response null");
            return Boxing.boxBoolean(false);
        }
        data = channelResponse.getData();
        if (data.length == 2) {
            z2 = true;
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object switchMenstruationDeviceNotify(boolean z2, Continuation<? super Boolean> continuation) {
        s sVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.w = i2 - Integer.MIN_VALUE;
            } else {
                sVar = new s(continuation);
            }
        } else {
            sVar = new s(continuation);
        }
        s sVar2 = sVar;
        Object objSendDataWithResult$default = sVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = sVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) sVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) sVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "switchMenstruationDeviceNotify response: " + channelResponse);
            return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrAssembleCmd$default = assembleCmd$default(this, (byte) 2, z2, null, 4, null);
        t5t.d(TAG, "switchMenstruationDeviceNotify cmd: " + tet.x(bArrAssembleCmd$default));
        if (bArrAssembleCmd$default == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        sVar2.t = this;
        sVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrAssembleCmd$default, 0, false, sVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "switchMenstruationDeviceNotify ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        t tVar = menstruationModule.new t(null);
        sVar2.t = menstruationModule;
        sVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, tVar, sVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "switchMenstruationDeviceNotify response: " + channelResponse2);
        return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object switchSmartPredict(boolean z2, Continuation<? super Boolean> continuation) {
        v vVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i2 = vVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.w = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        v vVar2 = vVar;
        Object objSendDataWithResult$default = vVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = vVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) vVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) vVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "switchSmartPredict response: " + channelResponse);
            return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrAssembleCmd$default = assembleCmd$default(this, (byte) 1, z2, null, 4, null);
        t5t.d(TAG, "switchSmartPredict cmd: " + tet.x(bArrAssembleCmd$default));
        if (bArrAssembleCmd$default == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        vVar2.t = this;
        vVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrAssembleCmd$default, 0, false, vVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "switchSmartPredict ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        w wVar = menstruationModule.new w(null);
        vVar2.t = menstruationModule;
        vVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, wVar, vVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        t5t.d(TAG, "switchSmartPredict response: " + channelResponse2);
        return Boxing.boxBoolean(menstruationModule.isSuccess(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object syncSettingData(Continuation<? super MenstruationConfig> continuation) {
        y yVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i2 = yVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.w = i2 - Integer.MIN_VALUE;
            } else {
                yVar = new y(continuation);
            }
        } else {
            yVar = new y(continuation);
        }
        Object objSendDataWithResult$default = yVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = yVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) yVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return jl.a(channelResponse.getData());
            }
            t5t.d(TAG, "syncSettingData null");
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        t5t.d(TAG, "start sync setting data");
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        yVar.t = this;
        yVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{5}, 0, false, yVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "syncSettingData ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        z zVar = menstruationModule.new z(null);
        yVar.t = null;
        yVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, zVar, yVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return jl.a(channelResponse.getData());
        }
        t5t.d(TAG, "syncSettingData null");
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Nullable
    public final Function0<Unit> getDataChangeListener() {
        return this.dataChangeListener;
    }

    @Nullable
    public final Function1<MenstrualNotifiedData, Unit> getMenstrualPeriodDataChangeListener() {
        return this.menstrualPeriodDataChangeListener;
    }

    public final void getMenstruationTotalRecord(@NotNull HMCallback<MenstruationTotalRecord> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(callback, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 5;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new e(), 2, null);
    }

    public final void setDataChangeListener(@Nullable Function0<Unit> function0) {
        this.dataChangeListener = function0;
    }

    public final void setMenstrualPeriodDataChangeListener(@Nullable Function1<? super MenstrualNotifiedData, Unit> function1) {
        this.menstrualPeriodDataChangeListener = function1;
    }

    public final boolean setMenstruationNotifySync(boolean enable, int days) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new i(enable, days, this, null), 1, null)).booleanValue();
    }

    public final boolean setMenstruationOvulationSync(boolean enable, int days) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new l(enable, days, this, null), 1, null)).booleanValue();
    }

    public final void setMenstruationTotalRecord(@NotNull MenstruationTotalRecord totalRecord, @NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(totalRecord, "totalRecord");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new m(totalRecord, callback, null), 3, null);
    }

    public final boolean setPeriodDataSync(@NotNull MenstrualPeriodData[] periodData) {
        Intrinsics.checkNotNullParameter(periodData, "periodData");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new r(periodData, null), 1, null)).booleanValue();
    }

    public final boolean switchMenstruationDeviceNotifySync(boolean enable) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new u(enable, this, null), 1, null)).booleanValue();
    }

    public final boolean switchSmartPredictSync(boolean enable) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new x(enable, this, null), 1, null)).booleanValue();
    }

    @Nullable
    public final MenstruationConfig syncSettingDataSync() {
        return (MenstruationConfig) BuildersKt__BuildersKt.runBlocking$default(null, new a0(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:12:0x001e, B:16:0x002e, B:33:0x00a5, B:35:0x00a9, B:36:0x00b1, B:17:0x0033, B:18:0x003a, B:19:0x003b, B:25:0x0072, B:29:0x0092, B:20:0x0043, B:11:0x0019), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:12:0x001e, B:16:0x002e, B:33:0x00a5, B:35:0x00a9, B:36:0x00b1, B:17:0x0033, B:18:0x003a, B:19:0x003b, B:25:0x0072, B:29:0x0092, B:20:0x0043, B:11:0x0019), top: B:41:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0012, B:12:0x001e, B:16:0x002e, B:33:0x00a5, B:35:0x00a9, B:36:0x00b1, B:17:0x0033, B:18:0x003a, B:19:0x003b, B:25:0x0072, B:29:0x0092, B:20:0x0043, B:11:0x0019), top: B:41:0x0003 }] */
    @Nullable
    public final synchronized Object getMenstruationTotalRecord(@NotNull Continuation<? super MenstruationTotalRecord> continuation) {
        c cVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i2 = cVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.w = i2 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(continuation);
                }
            } else {
                cVar = new c(continuation);
            }
            Object objSendDataWithResult$default = cVar.u;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = cVar.w;
            MenstruationTotalRecord menstruationTotalRecordB = null;
            if (i3 != 0) {
                if (i3 == 1) {
                    menstruationModule = (MenstruationModule) cVar.t;
                    ResultKt.throwOnFailure(objSendDataWithResult$default);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendDataWithResult$default);
                }
                channelResponse = (ChannelResponse) objSendDataWithResult$default;
                if (channelResponse == null) {
                    t5t.d(TAG, "get data null");
                } else {
                    menstruationTotalRecordB = jl.b(channelResponse.getData());
                }
                return menstruationTotalRecordB;
            }
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            t5t.d(TAG, "start get menstruation data");
            this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
            cVar.t = this;
            cVar.w = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{1}, 0, false, cVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            menstruationModule = this;
            boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
            t5t.d(TAG, "get ret: " + zBooleanValue);
            if (!zBooleanValue) {
                return null;
            }
            d dVar = menstruationModule.new d(null);
            cVar.t = null;
            cVar.w = 2;
            objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, dVar, cVar);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                t5t.d(TAG, "get data null");
            } else {
                menstruationTotalRecordB = jl.b(channelResponse.getData());
            }
            return menstruationTotalRecordB;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x0013, B:13:0x0021, B:17:0x0034, B:40:0x00d3, B:42:0x00ed, B:45:0x00f3, B:54:0x010d, B:48:0x00fb, B:50:0x0103, B:18:0x0039, B:19:0x0040, B:20:0x0041, B:31:0x009c, B:33:0x00ba, B:36:0x00c0, B:21:0x0049, B:23:0x0078, B:26:0x0085, B:12:0x001b), top: B:59:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x0013, B:13:0x0021, B:17:0x0034, B:40:0x00d3, B:42:0x00ed, B:45:0x00f3, B:54:0x010d, B:48:0x00fb, B:50:0x0103, B:18:0x0039, B:19:0x0040, B:20:0x0041, B:31:0x009c, B:33:0x00ba, B:36:0x00c0, B:21:0x0049, B:23:0x0078, B:26:0x0085, B:12:0x001b), top: B:59:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x0013, B:13:0x0021, B:17:0x0034, B:40:0x00d3, B:42:0x00ed, B:45:0x00f3, B:54:0x010d, B:48:0x00fb, B:50:0x0103, B:18:0x0039, B:19:0x0040, B:20:0x0041, B:31:0x009c, B:33:0x00ba, B:36:0x00c0, B:21:0x0049, B:23:0x0078, B:26:0x0085, B:12:0x001b), top: B:59:0x0004 }] */
    @Nullable
    public final synchronized Object setMenstruationTotalRecord(@NotNull MenstruationTotalRecord menstruationTotalRecord, @NotNull Continuation<? super Boolean> continuation) {
        n nVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        try {
            if (continuation instanceof n) {
                nVar = (n) continuation;
                int i2 = nVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nVar.w = i2 - Integer.MIN_VALUE;
                } else {
                    nVar = new n(continuation);
                }
            } else {
                nVar = new n(continuation);
            }
            n nVar2 = nVar;
            Object objSendDataWithResult$default = nVar2.u;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = nVar2.w;
            boolean z2 = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    menstruationModule = (MenstruationModule) nVar2.t;
                    ResultKt.throwOnFailure(objSendDataWithResult$default);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendDataWithResult$default);
                }
                channelResponse = (ChannelResponse) objSendDataWithResult$default;
                t5t.d(TAG, "set response: " + channelResponse);
                if (channelResponse == null) {
                    return Boxing.boxBoolean(false);
                }
                if (channelResponse.getData().length != 2 || channelResponse.getData()[0] != 4 || channelResponse.getData()[1] != 1) {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            t5t.d(TAG, "start set menstruation data: " + menstruationTotalRecord);
            this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
            if (!kl.b(menstruationTotalRecord)) {
                t5t.d(TAG, "set data not valid");
                return Boxing.boxBoolean(false);
            }
            byte[] bArrA = jl.a(menstruationTotalRecord);
            nVar2.t = this;
            nVar2.w = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArrA, 0, false, nVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            menstruationModule = this;
            boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
            t5t.d(TAG, "set ret: " + zBooleanValue);
            if (!zBooleanValue) {
                return Boxing.boxBoolean(false);
            }
            o oVar = menstruationModule.new o(null);
            nVar2.t = null;
            nVar2.w = 2;
            objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, oVar, nVar2);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            t5t.d(TAG, "set response: " + channelResponse);
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(z2);
            }
            z2 = false;
            return Boxing.boxBoolean(z2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
