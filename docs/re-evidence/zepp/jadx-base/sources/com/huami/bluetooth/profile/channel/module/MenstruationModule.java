package com.huami.bluetooth.profile.channel.module;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualNotifiedData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstrualPeriodData;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationConfig;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecordKt;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B\u000f\u0012\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J!\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017J-\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\n*\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0002J\f\u0010\"\u001a\u00020!*\u00020 H\u0002J\f\u0010#\u001a\u00020\n*\u00020 H\u0002J\f\u0010%\u001a\u00020$*\u00020 H\u0002J\b\u0010'\u001a\u00020&H\u0016J\u001b\u0010(\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b(\u0010)J\u0014\u0010-\u001a\u00020&2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*J\u0015\u0010-\u001a\u0004\u0018\u00010+H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u000fJ\u001c\u0010/\u001a\u00020&2\u0006\u0010.\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140*J\u001b\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020+H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u00101\u001a\u0004\u0018\u00010\rJ\u000e\u00102\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u00103\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u00104\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u00105\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014R\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b8\u00109R(\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0<0;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010=R?\u0010H\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020&\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010O\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/MenstruationModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", Constant.h, "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualNotifiedData;", com.loc.z.j, "", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;", "periodData", "", "m", "([Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", com.google.android.exoplayer2.text.ttml.b.r, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "o", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.b, "", "days", hl.k, "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "", "flag", "c", "(BZLjava/lang/Integer;)[B", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "type", "i", "Ljava/nio/ByteBuffer;", "", "h", "e", "", "g", "", PointCategory.INIT, "setPeriodDataSync", "([Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstrualPeriodData;)Z", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "callback", "getMenstruationTotalRecord", "totalRecord", "setMenstruationTotalRecord", "(Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSettingDataSync", "switchSmartPredictSync", "switchMenstruationDeviceNotifySync", "setMenstruationNotifySync", "setMenstruationOvulationSync", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "f", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/Map;", "channels", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "notifiedData", "Lkotlin/jvm/functions/Function1;", "getMenstrualPeriodDataChangeListener", "()Lkotlin/jvm/functions/Function1;", "setMenstrualPeriodDataChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "menstrualPeriodDataChangeListener", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getDataChangeListener", "()Lkotlin/jvm/functions/Function0;", "setDataChangeListener", "(Lkotlin/jvm/functions/Function0;)V", "dataChangeListener", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationModule extends BaseModule implements CoroutineScope {
    public static final byte FLAG_DEVICE_NOTIFY = 2;
    public static final byte FLAG_MENSTRUATION = 4;
    public static final byte FLAG_OVULATION = 8;
    public static final byte FLAG_SMART_PREDICT = 1;
    public static final int MENSTRUATION_MODULE = 5;

    @NotNull
    public static final String TAG = "MenstruationModule";
    public static final long TIMEOUT = 15000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function1<? super MenstrualNotifiedData, Unit> menstrualPeriodDataChangeListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> dataChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$getMenstruationTotalRecord$1", f = "MenstruationModule.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<MenstruationTotalRecord> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMCallback<MenstruationTotalRecord> hMCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                this.a = 1;
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
            this.c.onFinish((MenstruationTotalRecord) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {133, 138}, m = "getMenstruationTotalRecord", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.getMenstruationTotalRecord(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$getMenstruationTotalRecord$response$1", f = "MenstruationModule.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(2));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$init$1$1", f = "MenstruationModule.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"type"}, s = {"B$0"})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public byte a;
            public int b;
            public final /* synthetic */ ChannelResponse c;
            public final /* synthetic */ MenstruationModule d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, MenstruationModule menstruationModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = channelResponse;
                this.d = menstruationModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:34:0x0081  */
            /* JADX WARN: Code duplicated, block: B:36:0x0084  */
            /* JADX WARN: Code duplicated, block: B:39:0x0094  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                byte bFirst;
                byte b;
                Function0<Unit> dataChangeListener;
                Function1<MenstrualNotifiedData, Unit> menstrualPeriodDataChangeListener;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.c.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    bFirst = ArraysKt___ArraysKt.first(this.c.getData());
                    Channel channel = (Channel) this.d.channels.get(Boxing.boxInt(bFirst));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.c;
                        this.a = bFirst;
                        this.b = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        b = bFirst;
                    }
                    if (bFirst != 15 && this.d.getMenstrualPeriodDataChangeListener() != null) {
                        MenstrualNotifiedData menstrualNotifiedDataJ = this.d.j(this.c.getData());
                        if (menstrualNotifiedDataJ != null && (menstrualPeriodDataChangeListener = this.d.getMenstrualPeriodDataChangeListener()) != null) {
                            menstrualPeriodDataChangeListener.invoke(menstrualNotifiedDataJ);
                        }
                    } else if (bFirst == -1) {
                        Debug.fi(MenstruationModule.TAG, "onDataChanged");
                        dataChangeListener = this.d.getDataChangeListener();
                        if (dataChangeListener != null) {
                            dataChangeListener.invoke();
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b = this.a;
                ResultKt.throwOnFailure(obj);
                bFirst = b;
                if (bFirst != 15) {
                    if (bFirst == -1) {
                        Debug.fi(MenstruationModule.TAG, "onDataChanged");
                        dataChangeListener = this.d.getDataChangeListener();
                        if (dataChangeListener != null) {
                            dataChangeListener.invoke();
                        }
                    }
                } else if (bFirst == -1) {
                    Debug.fi(MenstruationModule.TAG, "onDataChanged");
                    dataChangeListener = this.d.getDataChangeListener();
                    if (dataChangeListener != null) {
                        dataChangeListener.invoke();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            MenstruationModule menstruationModule = MenstruationModule.this;
            kotlinx.coroutines.e.f(menstruationModule, null, null, new a(channelResponse, menstruationModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Job> {
        public static final e a = new e();

        public e() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {276, 281}, m = "setMenstruationNotify", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.k(false, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationNotify$response$1", f = "MenstruationModule.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationNotifySync$1", f = "MenstruationModule.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ MenstruationModule d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, int i, MenstruationModule menstruationModule, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = i;
            this.d = menstruationModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Debug.fi(MenstruationModule.TAG, "setMenstruationNotify: " + this.b + ", days:" + this.c);
                MenstruationModule menstruationModule = this.d;
                boolean z = this.b;
                int i2 = this.c;
                this.a = 1;
                obj = menstruationModule.k(z, i2, this);
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
            Debug.fi(MenstruationModule.TAG, Intrinsics.stringPlus("setMenstruationNotifySync: ", Boxing.boxBoolean(zBooleanValue)));
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {305, 310}, m = "setMenstruationOvulation", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.l(false, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationOvulation$response$1", f = "MenstruationModule.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationOvulationSync$1", f = "MenstruationModule.kt", i = {}, l = {290}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ MenstruationModule d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z, int i, MenstruationModule menstruationModule, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = i;
            this.d = menstruationModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Debug.fi(MenstruationModule.TAG, "setMenstruationNotify: " + this.b + ", days:" + this.c);
                MenstruationModule menstruationModule = this.d;
                boolean z = this.b;
                int i2 = this.c;
                this.a = 1;
                obj = menstruationModule.l(z, i2, this);
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
            Debug.fi(MenstruationModule.TAG, Intrinsics.stringPlus("setMenstruationOvulationSync: ", Boxing.boxBoolean(zBooleanValue)));
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationTotalRecord$1", f = "MenstruationModule.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MenstruationTotalRecord c;
        public final /* synthetic */ HMCallback<Integer> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MenstruationTotalRecord menstruationTotalRecord, HMCallback<Integer> hMCallback, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = menstruationTotalRecord;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new l(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                MenstruationTotalRecord menstruationTotalRecord = this.c;
                this.a = 1;
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
            this.d.onFinish(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {162, 167}, m = "setMenstruationTotalRecord", n = {}, s = {})
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
            return MenstruationModule.this.setMenstruationTotalRecord((MenstruationTotalRecord) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setMenstruationTotalRecord$response$1", f = "MenstruationModule.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(4));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {104, 109}, m = "setPeriodData", n = {}, s = {})
    public static final class o extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.m(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setPeriodData$response$1", f = "MenstruationModule.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(10));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$setPeriodDataSync$1", f = "MenstruationModule.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ MenstrualPeriodData[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(MenstrualPeriodData[] menstrualPeriodDataArr, Continuation<? super q> continuation) {
            super(2, continuation);
            this.c = menstrualPeriodDataArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new q(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                MenstrualPeriodData[] menstrualPeriodDataArr = this.c;
                this.a = 1;
                obj = menstruationModule.m(menstrualPeriodDataArr, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {Mtu.ATT_MTU_MAX, 252}, m = "switchMenstruationDeviceNotify", n = {}, s = {})
    public static final class r extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.n(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchMenstruationDeviceNotify$response$1", f = "MenstruationModule.kt", i = {}, l = {PageType.PAGE_SHORTCUT}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchMenstruationDeviceNotifySync$1", f = "MenstruationModule.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ MenstruationModule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(boolean z, MenstruationModule menstruationModule, Continuation<? super t> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = menstruationModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new t(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Debug.fi(MenstruationModule.TAG, Intrinsics.stringPlus("switchMenstruationDeviceNotify: ", Boxing.boxBoolean(this.b)));
                MenstruationModule menstruationModule = this.c;
                boolean z = this.b;
                this.a = 1;
                obj = menstruationModule.n(z, this);
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
            Debug.fi(MenstruationModule.TAG, Intrinsics.stringPlus("switchMenstruationDeviceNotifySync: ", Boxing.boxBoolean(zBooleanValue)));
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {217, 222}, m = "switchSmartPredict", n = {}, s = {})
    public static final class u extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.o(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchSmartPredict$response$1", f = "MenstruationModule.kt", i = {}, l = {SelectAreaActivity.REQUEST_SELECT_AREA_ONLY}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(8));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$switchSmartPredictSync$1", f = "MenstruationModule.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ MenstruationModule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z, MenstruationModule menstruationModule, Continuation<? super w> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = menstruationModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new w(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Debug.fi(MenstruationModule.TAG, Intrinsics.stringPlus("switchSmartPredict: ", Boxing.boxBoolean(this.b)));
                MenstruationModule menstruationModule = this.c;
                boolean z = this.b;
                this.a = 1;
                obj = menstruationModule.o(z, this);
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
            Debug.fi(MenstruationModule.TAG, Intrinsics.stringPlus("switchSmartPredictSync: ", Boxing.boxBoolean(zBooleanValue)));
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule", f = "MenstruationModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DISCO, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER}, m = "syncSettingData", n = {}, s = {})
    public static final class x extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationModule.this.p(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$syncSettingData$response$1", f = "MenstruationModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public y(Continuation<? super y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new y(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) MenstruationModule.this.channels.get(Boxing.boxInt(6));
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
            return (ChannelResponse) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.MenstruationModule$syncSettingDataSync$1", f = "MenstruationModule.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MenstruationConfig>, Object> {
        public int a;

        public z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationModule.this.new z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super MenstruationConfig> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationModule menstruationModule = MenstruationModule.this;
                this.a = 1;
                obj = menstruationModule.p(this);
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

    public MenstruationModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(e.a);
        this.channels = new LinkedHashMap();
    }

    private final byte[] c(byte flag, boolean enable, Integer days) {
        if (days != null && days.intValue() > 5) {
            Debug.fi(TAG, "Ovulation days > 5");
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(7);
            byteArrayOutputStream.write(GattUtils.shortToBytes(flag));
            if (days != null) {
                byteArrayOutputStream.write((byte) ((enable ? (byte) -128 : (byte) 0) | ((byte) days.intValue())));
            } else {
                byteArrayOutputStream.write(enable ? (byte) 1 : (byte) 0);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e2) {
            Debug.fi(TAG, Intrinsics.stringPlus("assembleOvulationCmd: e: ", e2));
            return null;
        }
    }

    public static /* synthetic */ byte[] d(MenstruationModule menstruationModule, byte b2, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return menstruationModule.c(b2, z2, num);
    }

    private final boolean e(ByteBuffer byteBuffer) {
        return byteBuffer.get() == 1;
    }

    private final Job f() {
        return (Job) this.job.getValue();
    }

    private final long g(ByteBuffer byteBuffer) {
        return GattUtils.bytesToLong(new byte[]{byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get()}, 0, 4);
    }

    private final short h(ByteBuffer byteBuffer) {
        return (short) (byteBuffer.get() & 255);
    }

    private final boolean i(ChannelResponse channelResponse, byte b2) {
        return channelResponse != null && channelResponse.getData().length == 2 && channelResponse.getData()[0] == b2 && channelResponse.getData()[1] == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MenstrualNotifiedData j(byte[] cmd) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Debug.fi(TAG, Intrinsics.stringPlus("notifiedData: ", GattUtils.bytesToHexString(cmd)));
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(cmd);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            objM3845constructorimpl = Result.m3845constructorimpl(new MenstrualNotifiedData(h(byteBufferWrap), h(byteBufferWrap), e(byteBufferWrap), g(byteBufferWrap)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("parseNotifiedData: ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (MenstrualNotifiedData) objM3845constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object k(boolean z2, int i2, Continuation<? super Boolean> continuation) {
        f fVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i3 = fVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.d = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objSendDataWithResult$default = fVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = fVar2.d;
        if (i4 != 0) {
            if (i4 == 1) {
                menstruationModule = (MenstruationModule) fVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) fVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationNotify response: ", channelResponse));
            return Boxing.boxBoolean(menstruationModule.i(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrC = c((byte) 4, z2, Boxing.boxInt(i2));
        Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationNotify cmd: ", GattUtils.bytesToHexString(bArrC)));
        if (bArrC == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        fVar2.a = this;
        fVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArrC, 0, false, fVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationNotify ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        g gVar = menstruationModule.new g(null);
        fVar2.a = menstruationModule;
        fVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, gVar, fVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationNotify response: ", channelResponse2));
        return Boxing.boxBoolean(menstruationModule.i(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object l(boolean z2, int i2, Continuation<? super Boolean> continuation) {
        i iVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.d = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object objSendDataWithResult$default = iVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = iVar2.d;
        if (i4 != 0) {
            if (i4 == 1) {
                menstruationModule = (MenstruationModule) iVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) iVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationOvulation response: ", channelResponse));
            return Boxing.boxBoolean(menstruationModule.i(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrC = c((byte) 8, z2, Boxing.boxInt(i2));
        Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationOvulation cmd: ", GattUtils.bytesToHexString(bArrC)));
        if (bArrC == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        iVar2.a = this;
        iVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArrC, 0, false, iVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationOvulation ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        j jVar = menstruationModule.new j(null);
        iVar2.a = menstruationModule;
        iVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, jVar, iVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(TAG, Intrinsics.stringPlus("setMenstruationOvulation response: ", channelResponse2));
        return Boxing.boxBoolean(menstruationModule.i(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(MenstrualPeriodData[] menstrualPeriodDataArr, Continuation<? super Boolean> continuation) {
        o oVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.d = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        o oVar2 = oVar;
        Object objSendDataWithResult$default = oVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar2.d;
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) oVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                Debug.fi(TAG, "setPeriodData response null");
                return Boxing.boxBoolean(false);
            }
            data = channelResponse.getData();
            if (data.length == 2 && data[0] == 10 && data[1] == 1) {
                z2 = true;
            }
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] byteArray = MenstruationHelperKt.toByteArray(menstrualPeriodDataArr);
        Debug.fi(TAG, Intrinsics.stringPlus("setPeriodData: ", GattUtils.bytesToHexString(byteArray)));
        this.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, 1, null));
        oVar2.a = this;
        oVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, byteArray, 0, false, oVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("setPeriodData ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        p pVar = menstruationModule.new p(null);
        oVar2.a = null;
        oVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, pVar, oVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            Debug.fi(TAG, "setPeriodData response null");
            return Boxing.boxBoolean(false);
        }
        data = channelResponse.getData();
        if (data.length == 2) {
            z2 = true;
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(boolean z2, Continuation<? super Boolean> continuation) {
        r rVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i2 = rVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.d = i2 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        r rVar2 = rVar;
        Object objSendDataWithResult$default = rVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = rVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) rVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) rVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(TAG, Intrinsics.stringPlus("switchMenstruationDeviceNotify response: ", channelResponse));
            return Boxing.boxBoolean(menstruationModule.i(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrD = d(this, (byte) 2, z2, null, 4, null);
        Debug.fi(TAG, Intrinsics.stringPlus("switchMenstruationDeviceNotify cmd: ", GattUtils.bytesToHexString(bArrD)));
        if (bArrD == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        rVar2.a = this;
        rVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArrD, 0, false, rVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("switchMenstruationDeviceNotify ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        s sVar = menstruationModule.new s(null);
        rVar2.a = menstruationModule;
        rVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, sVar, rVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(TAG, Intrinsics.stringPlus("switchMenstruationDeviceNotify response: ", channelResponse2));
        return Boxing.boxBoolean(menstruationModule.i(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object o(boolean z2, Continuation<? super Boolean> continuation) {
        u uVar;
        MenstruationModule menstruationModule;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.d = i2 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        } else {
            uVar = new u(continuation);
        }
        u uVar2 = uVar;
        Object objSendDataWithResult$default = uVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = uVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) uVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                menstruationModule = (MenstruationModule) uVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(TAG, Intrinsics.stringPlus("switchSmartPredict response: ", channelResponse));
            return Boxing.boxBoolean(menstruationModule.i(channelResponse, (byte) 8));
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        byte[] bArrD = d(this, (byte) 1, z2, null, 4, null);
        Debug.fi(TAG, Intrinsics.stringPlus("switchSmartPredict cmd: ", GattUtils.bytesToHexString(bArrD)));
        if (bArrD == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        uVar2.a = this;
        uVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArrD, 0, false, uVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("switchSmartPredict ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        v vVar = menstruationModule.new v(null);
        uVar2.a = menstruationModule;
        uVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, vVar, uVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(TAG, Intrinsics.stringPlus("switchSmartPredict response: ", channelResponse2));
        return Boxing.boxBoolean(menstruationModule.i(channelResponse2, (byte) 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Continuation<? super MenstruationConfig> continuation) {
        x xVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i2 = xVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.d = i2 - Integer.MIN_VALUE;
            } else {
                xVar = new x(continuation);
            }
        } else {
            xVar = new x(continuation);
        }
        Object objSendDataWithResult$default = xVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = xVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) xVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return MenstruationHelperKt.parseMenstruationConfig(channelResponse.getData());
            }
            Debug.fi(TAG, "syncSettingData null");
            return null;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(TAG, "start sync setting data");
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        xVar.a = this;
        xVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{5}, 0, false, xVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("syncSettingData ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        y yVar = menstruationModule.new y(null);
        xVar.a = null;
        xVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, yVar, xVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return MenstruationHelperKt.parseMenstruationConfig(channelResponse.getData());
        }
        Debug.fi(TAG, "syncSettingData null");
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return f().plus(Dispatchers.getIO());
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
        kotlinx.coroutines.e.f(this, null, null, new a(callback, null), 3, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 5;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new d(), 2, null);
    }

    public final void setDataChangeListener(@Nullable Function0<Unit> function0) {
        this.dataChangeListener = function0;
    }

    public final void setMenstrualPeriodDataChangeListener(@Nullable Function1<? super MenstrualNotifiedData, Unit> function1) {
        this.menstrualPeriodDataChangeListener = function1;
    }

    public final boolean setMenstruationNotifySync(boolean enable, int days) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new h(enable, days, this, null), 1, null)).booleanValue();
    }

    public final boolean setMenstruationOvulationSync(boolean enable, int days) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new k(enable, days, this, null), 1, null)).booleanValue();
    }

    public final void setMenstruationTotalRecord(@NotNull MenstruationTotalRecord totalRecord, @NotNull HMCallback<Integer> callback) {
        kotlinx.coroutines.e.f(this, null, null, new l(totalRecord, callback, null), 3, null);
    }

    public final boolean setPeriodDataSync(@NotNull MenstrualPeriodData[] periodData) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new q(periodData, null), 1, null)).booleanValue();
    }

    public final boolean switchMenstruationDeviceNotifySync(boolean enable) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new t(enable, this, null), 1, null)).booleanValue();
    }

    public final boolean switchSmartPredictSync(boolean enable) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new w(enable, this, null), 1, null)).booleanValue();
    }

    @Nullable
    public final MenstruationConfig syncSettingDataSync() {
        return (MenstruationConfig) kotlinx.coroutines.d.b(null, new z(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:13:0x002b, B:34:0x009c, B:36:0x00a0, B:37:0x00a8, B:14:0x002f, B:15:0x0036, B:16:0x0037, B:22:0x006d, B:25:0x007a, B:30:0x008b, B:17:0x003f, B:8:0x0014), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:13:0x002b, B:34:0x009c, B:36:0x00a0, B:37:0x00a8, B:14:0x002f, B:15:0x0036, B:16:0x0037, B:22:0x006d, B:25:0x007a, B:30:0x008b, B:17:0x003f, B:8:0x0014), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0010, B:9:0x0019, B:13:0x002b, B:34:0x009c, B:36:0x00a0, B:37:0x00a8, B:14:0x002f, B:15:0x0036, B:16:0x0037, B:22:0x006d, B:25:0x007a, B:30:0x008b, B:17:0x003f, B:8:0x0014), top: B:43:0x0001 }] */
    @Nullable
    public final synchronized Object getMenstruationTotalRecord(@NotNull Continuation<? super MenstruationTotalRecord> continuation) {
        b bVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendDataWithResult$default = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.d;
        MenstruationTotalRecord response = null;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) bVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                Debug.fi(TAG, "get data null");
            } else {
                response = MenstruationHelperKt.parseResponse(channelResponse.getData());
            }
            return response;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(TAG, "start get menstruation data");
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        bVar.a = this;
        bVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{1}, 0, false, bVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("get ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        c cVar = menstruationModule.new c(null);
        bVar.a = null;
        bVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            Debug.fi(TAG, "get data null");
        } else {
            response = MenstruationHelperKt.parseResponse(channelResponse.getData());
        }
        return response;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x0013, B:10:0x001c, B:14:0x0030, B:42:0x00c1, B:44:0x00d0, B:47:0x00d6, B:54:0x00ef, B:50:0x00df, B:52:0x00e7, B:15:0x0035, B:16:0x003c, B:17:0x003d, B:28:0x008c, B:32:0x009b, B:34:0x00a8, B:38:0x00b0, B:18:0x0045, B:20:0x0068, B:23:0x0075, B:9:0x0017), top: B:60:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6 A[Catch: all -> 0x00f5, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x0013, B:10:0x001c, B:14:0x0030, B:42:0x00c1, B:44:0x00d0, B:47:0x00d6, B:54:0x00ef, B:50:0x00df, B:52:0x00e7, B:15:0x0035, B:16:0x003c, B:17:0x003d, B:28:0x008c, B:32:0x009b, B:34:0x00a8, B:38:0x00b0, B:18:0x0045, B:20:0x0068, B:23:0x0075, B:9:0x0017), top: B:60:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:4:0x0004, B:6:0x0008, B:8:0x0013, B:10:0x001c, B:14:0x0030, B:42:0x00c1, B:44:0x00d0, B:47:0x00d6, B:54:0x00ef, B:50:0x00df, B:52:0x00e7, B:15:0x0035, B:16:0x003c, B:17:0x003d, B:28:0x008c, B:32:0x009b, B:34:0x00a8, B:38:0x00b0, B:18:0x0045, B:20:0x0068, B:23:0x0075, B:9:0x0017), top: B:60:0x0004 }] */
    @Nullable
    public final synchronized Object setMenstruationTotalRecord(@NotNull MenstruationTotalRecord menstruationTotalRecord, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        MenstruationModule menstruationModule;
        ChannelResponse channelResponse;
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
        m mVar2 = mVar;
        Object objSendDataWithResult$default = mVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                menstruationModule = (MenstruationModule) mVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(TAG, Intrinsics.stringPlus("set response: ", channelResponse));
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData().length != 2 && channelResponse.getData()[0] == 4 && channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(TAG, Intrinsics.stringPlus("start set menstruation data: ", menstruationTotalRecord));
        this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        if (!MenstruationTotalRecordKt.valid(menstruationTotalRecord)) {
            Debug.fi(TAG, "set data not valid");
            return Boxing.boxBoolean(false);
        }
        byte[] menstruationTotalRecordData = MenstruationHelperKt.getMenstruationTotalRecordData(menstruationTotalRecord);
        mVar2.a = this;
        mVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, menstruationTotalRecordData, 0, false, mVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        menstruationModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(TAG, Intrinsics.stringPlus("set ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        n nVar = menstruationModule.new n(null);
        mVar2.a = null;
        mVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, nVar, mVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(TAG, Intrinsics.stringPlus("set response: ", channelResponse));
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(channelResponse.getData().length != 2 && channelResponse.getData()[0] == 4 && channelResponse.getData()[1] == 1);
    }
}
