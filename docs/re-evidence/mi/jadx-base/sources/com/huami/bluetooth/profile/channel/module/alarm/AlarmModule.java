package com.huami.bluetooth.profile.channel.module.alarm;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.AlarmVersionInfo;
import defpackage.ChannelResponse;
import defpackage.d4;
import defpackage.dh;
import defpackage.jh;
import defpackage.ks;
import defpackage.le;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.w2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import kotlin.jvm.internal.ByteSpreadBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001VB\u000f\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002J\u001b\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00172\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 J\u001c\u0010$\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0014\u0010&\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016J\u001c\u0010'\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 J\u001c\u0010(\u001a\u00020\u00172\u0014\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00160 J\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016J\u001c\u0010*\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 J\u001b\u0010+\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010,J!\u00100\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010.J\u0006\u00101\u001a\u00020\u0005J\u0013\u00102\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u0010,J!\u00105\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010.J\u001b\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00103J\u0015\u00107\u001a\u0004\u0018\u00010!H\u0086@ø\u0001\u0000¢\u0006\u0004\b7\u00103J\u0015\u00108\u001a\u0004\u0018\u00010!H\u0086@ø\u0001\u0000¢\u0006\u0004\b8\u00103R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", DialWidgetType.ALARM, "", "isSupportTitle", "supportChinaCalendar", "", "assembleAlarmCmd", "Lm4;", com.xiaomi.onetrack.api.b.I, "", "parseAlarms", "Ljava/nio/ByteBuffer;", "byteBuffer", "alarms", "", "parseAlarmRawData", "byteArray", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "printAlarms", "repeatForCalendar", "getCompactRepeatForNonCalendar", "init", "Ljh;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ls;", "callback", "getAlarmVersionInfoAsync", "addAlarmAsync", "addAlarmSync", "addAlarmsSync", "deleteAlarmAsync", "inquireAlarmAsync", "inquireAlarmSync", "modifyAlarmAsync", "addAlarm", "(Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addAlarms", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlarm", "deleteAlarms", "clearAlarmSync", "clearAlarm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyAlarm", "modifyAlarms", "inquireAlarm", "getAlarmVersionInfo", "queryVersion", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Ldh;", "alarmChangeListener", "Ldh;", "getAlarmChangeListener", "()Ldh;", "setAlarmChangeListener", "(Ldh;)V", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 15)
public final class AlarmModule extends a implements CoroutineScope {
    public static final int ALARM = 15;
    public static final byte CMD_ADD_ALARM = 3;
    public static final byte CMD_CLEAR_ALARM = 11;
    public static final byte CMD_DELETE_ALARM = 5;
    public static final byte CMD_QUERY_ALARMS_DATA = 9;
    public static final byte CMD_QUERY_ALARM_VERSION = 1;
    public static final byte CMD_RETURN_ADD_ALARM_RESULT = 4;
    public static final byte CMD_RETURN_ALARM_VERSION = 2;
    public static final byte CMD_RETURN_CLEAR_ALARM_RESULT = 12;
    public static final byte CMD_RETURN_DELETE_ALARM_RESULT = 6;
    public static final byte CMD_RETURN_QUERY_ALARMS_DATA = 10;
    public static final byte CMD_RETURN_UPDATE_ALARM_RESULT = 8;
    public static final byte CMD_UPDATE_ALARM = 7;
    public static final int CODE_EXCEED_LIMIT_COUNT = 2;
    public static final int CODE_FAILED = 0;
    public static final int CODE_INVALID_PARAMETER = 3;
    public static final int CODE_NOT_FOUND_ALARM = 4;
    public static final byte CODE_SUCCESS = 1;

    @NotNull
    private static final String TAG = "AlarmModule";

    @Nullable
    private dh alarmChangeListener;

    @Nullable
    private volatile AlarmVersionInfo alarmVersionInfo;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    @NotNull
    private final ks innerInterceptor;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0}, l = {376, 383}, m = "queryVersion", n = {"this"}, s = {"L$0"})
    public static final class a0 extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public a0(Continuation<? super a0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return AlarmModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ AlarmClockExt v;
        public final /* synthetic */ HMCallback<Boolean> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AlarmClockExt alarmClockExt, HMCallback<Boolean> hMCallback, Continuation<? super b> continuation) {
            super(2, continuation);
            this.v = alarmClockExt;
            this.w = hMCallback;
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
            return AlarmModule.this.new b(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.v;
                this.t = 1;
                obj = alarmModule.addAlarm(alarmClockExt, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.w.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$queryVersion$response$1", f = "AlarmModule.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
    public static final class b0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public b0(Continuation<? super b0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new b0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarmSync$1", f = "AlarmModule.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ AlarmClockExt v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AlarmClockExt alarmClockExt, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = alarmClockExt;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new c(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.v;
                this.t = 1;
                obj = alarmModule.addAlarm(alarmClockExt, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0}, l = {509}, m = "sendData", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class c0 extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public c0(Continuation<? super c0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return AlarmModule.this.sendData((byte[]) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0, 1}, l = {160, 181, 192}, m = "addAlarms", n = {"this", "alarms", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class d extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return AlarmModule.this.addAlarms(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e t = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ignore add alarms as no visible alarm";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarms$response$1", f = "AlarmModule.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarmsSync$1", f = "AlarmModule.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ List<AlarmClockExt> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends AlarmClockExt> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new g(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                List<AlarmClockExt> list = this.v;
                this.t = 1;
                obj = alarmModule.addAlarms(list, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 1}, l = {249, 255, SportSummary.VERSION_105}, m = "clearAlarm", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class h extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return AlarmModule.this.clearAlarm(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$clearAlarm$response$1", f = "AlarmModule.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(12));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$clearAlarmSync$1", f = "AlarmModule.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                this.t = 1;
                obj = alarmModule.clearAlarm(this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$deleteAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ AlarmClockExt v;
        public final /* synthetic */ HMCallback<Boolean> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AlarmClockExt alarmClockExt, HMCallback<Boolean> hMCallback, Continuation<? super k> continuation) {
            super(2, continuation);
            this.v = alarmClockExt;
            this.w = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new k(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.v;
                this.t = 1;
                obj = alarmModule.deleteAlarm(alarmClockExt, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.w.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0, 1}, l = {215, 222, 229}, m = "deleteAlarms", n = {"this", "alarms", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class l extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return AlarmModule.this.deleteAlarms(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$deleteAlarms$response$1", f = "AlarmModule.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(6));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0}, l = {366}, m = "getAlarmVersionInfo", n = {"this"}, s = {"L$0"})
    public static final class n extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return AlarmModule.this.getAlarmVersionInfo(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$getAlarmVersionInfoAsync$1", f = "AlarmModule.kt", i = {}, l = {97, 98}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<AlarmVersionInfo> v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$getAlarmVersionInfoAsync$1$1", f = "AlarmModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ HMCallback<AlarmVersionInfo> u;
            public final /* synthetic */ AlarmVersionInfo v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<AlarmVersionInfo> hMCallback, AlarmVersionInfo alarmVersionInfo, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = hMCallback;
                this.v = alarmVersionInfo;
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
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.u.onFinish(this.v);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HMCallback<AlarmVersionInfo> hMCallback, Continuation<? super o> continuation) {
            super(2, continuation);
            this.v = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new o(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AlarmModule alarmModule = AlarmModule.this;
            this.t = 1;
            obj = alarmModule.getAlarmVersionInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.v, (AlarmVersionInfo) obj, null);
            this.t = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class p extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$init$1$1", f = "AlarmModule.kt", i = {}, l = {68, 73}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ AlarmModule u;
            public final /* synthetic */ ChannelResponse v;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$p$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$init$1$1$1", f = "AlarmModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0277a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ AlarmModule u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0277a(AlarmModule alarmModule, Continuation<? super C0277a> continuation) {
                    super(2, continuation);
                    this.u = alarmModule;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0277a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0277a(this.u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    dh alarmChangeListener = this.u.getAlarmChangeListener();
                    if (alarmChangeListener == null) {
                        return null;
                    }
                    alarmChangeListener.a();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AlarmModule alarmModule, ChannelResponse channelResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = alarmModule;
                this.v = channelResponse;
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
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        this.u.innerInterceptor.a(this.v.getData());
                    } catch (Exception e) {
                        t5t.d(AlarmModule.TAG, "interceptor.onReceive error " + e.getMessage());
                    }
                    if (this.v.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.v.getData());
                    if (bFirst == 15) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0277a c0277a = new C0277a(this.u, null);
                        this.t = 1;
                        if (BuildersKt.withContext(main, c0277a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        Channel channel = (Channel) this.u.channels.get(Boxing.boxInt(bFirst));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.v;
                            this.t = 2;
                            if (channel.send(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public p() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AlarmModule alarmModule = AlarmModule.this;
            BuildersKt__Builders_commonKt.launch$default(alarmModule, null, null, new a(alarmModule, it, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 1, 2}, l = {338, 344, 351}, m = "inquireAlarm", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    public static final class q extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return AlarmModule.this.inquireAlarm(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$inquireAlarm$response$1", f = "AlarmModule.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new r(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(10));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$inquireAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<List<AlarmClockExt>> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(HMCallback<List<AlarmClockExt>> hMCallback, Continuation<? super s> continuation) {
            super(2, continuation);
            this.v = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new s(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                this.t = 1;
                obj = alarmModule.inquireAlarm(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.v.sendOnFinishMessage((List<AlarmClockExt>) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$inquireAlarmSync$1", f = "AlarmModule.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<AlarmClockExt>>, Object> {
        public int t;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AlarmClockExt>> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new t(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                this.t = 1;
                obj = alarmModule.inquireAlarm(this);
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class u extends Lambda implements Function0<CompletableJob> {
        public static final u t = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$modifyAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ AlarmClockExt v;
        public final /* synthetic */ HMCallback<Boolean> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(AlarmClockExt alarmClockExt, HMCallback<Boolean> hMCallback, Continuation<? super v> continuation) {
            super(2, continuation);
            this.v = alarmClockExt;
            this.w = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new v(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.v;
                this.t = 1;
                obj = alarmModule.modifyAlarm(alarmClockExt, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.w.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0, 1}, l = {286, 308, 319}, m = "modifyAlarms", n = {"this", "alarms", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class w extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return AlarmModule.this.modifyAlarms(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x t = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "ignore add alarms as no visible alarm";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$modifyAlarms$response$1", f = "AlarmModule.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public y(Continuation<? super y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new y(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(8));
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONArray t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(JSONArray jSONArray) {
            super(0);
            this.t = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.t.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlarmModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(u.t);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = new ks(TAG, null, 2, null);
    }

    private final byte[] assembleAlarmCmd(AlarmClockExt alarm, boolean isSupportTitle, boolean supportChinaCalendar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList arrayList = new ArrayList();
        String title = alarm.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "alarm.title");
        if (isSupportTitle) {
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
            byte[] bytes = title.getBytes(charsetDefaultCharset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList.addAll(ArraysKt___ArraysKt.toList(bytes));
            arrayList.add((byte) 0);
        }
        arrayList.add(Byte.valueOf((byte) ((alarm.isSmart() ? 1 : 0) | (alarm.isLazy() ? 2 : 0) | (alarm.isEnable() ? 4 : 0))));
        arrayList.add(Byte.valueOf((byte) alarm.getIndex()));
        arrayList.add(Byte.valueOf(alarm.getHour()));
        arrayList.add(Byte.valueOf(alarm.getMinutes()));
        if (!supportChinaCalendar) {
            alarm.setRepeat(getCompactRepeatForNonCalendar(alarm.getRepeat()));
        }
        if (alarm.getRepeat() == 0 || alarm.getRepeat() == -128) {
            alarm.setRepeat(0);
        }
        byte[] repeat = tet.p(alarm.getRepeat());
        Intrinsics.checkNotNullExpressionValue(repeat, "repeat");
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, ArraysKt___ArraysKt.asIterable(repeat));
        arrayList.add(Byte.valueOf(alarm.getSource()));
        arrayList.add((byte) 0);
        byteArrayOutputStream.write(CollectionsKt___CollectionsKt.toByteArray(arrayList));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    private final int getCompactRepeatForNonCalendar(int repeatForCalendar) {
        if (repeatForCalendar == 128) {
            return 31;
        }
        return repeatForCalendar;
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final int parseAlarmRawData(boolean isSupportTitle, ByteBuffer byteBuffer, List<AlarmClockExt> alarms) {
        AlarmClockExt alarmClockExt = new AlarmClockExt();
        if (isSupportTitle) {
            w2 w2Var = new w2(null, 0, 3, null);
            byte[] bArrArray = byteBuffer.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "byteBuffer.array()");
            w2Var.a(bArrArray);
            String strF = w2Var.f();
            alarmClockExt.setTitle(strF);
            byte[] bytes = strF.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteBuffer.position(bytes.length + 1);
        }
        byte b2 = byteBuffer.get();
        alarmClockExt.setSmart(BitSet.valueOf(new byte[]{b2}).get(0));
        alarmClockExt.enableLazyMode(BitSet.valueOf(new byte[]{b2}).get(1));
        alarmClockExt.setEnable(BitSet.valueOf(new byte[]{b2}).get(2));
        alarmClockExt.setIndex(byteBuffer.get());
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(11, byteBuffer.get());
        calendar.set(12, byteBuffer.get());
        alarmClockExt.setCalendar(calendar);
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr, 0, 4);
        alarmClockExt.setRepeat(tet.c(bArr, 0));
        alarmClockExt.setSource(byteBuffer.get());
        alarmClockExt.setSmartWakeupTime(byteBuffer.get());
        alarms.add(alarmClockExt);
        return byteBuffer.position();
    }

    private final List<AlarmClockExt> parseAlarms(ChannelResponse response) {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(response.getData(), 2, response.getData().length);
            byte b2 = response.getData()[1];
            for (int i2 = 0; i2 < b2; i2++) {
                ByteBuffer byteBuffer = ByteBuffer.wrap(bArrCopyOfRange);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                AlarmVersionInfo alarmVersionInfo = this.alarmVersionInfo;
                boolean zB = alarmVersionInfo != null ? alarmVersionInfo.b() : false;
                Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                int alarmRawData = parseAlarmRawData(zB, byteBuffer, arrayList);
                if (i2 < b2 - 1) {
                    bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrCopyOfRange, alarmRawData, bArrCopyOfRange.length);
                }
            }
        } catch (Exception e2) {
            t5t.d(TAG, e2.getMessage());
        }
        return arrayList;
    }

    private final void printAlarms(List<? extends AlarmClockExt> alarms) {
        le.c(TAG, new z(new JSONArray((Collection) alarms)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendData(byte[] bArr, Continuation<? super Boolean> continuation) {
        c0 c0Var;
        AlarmModule alarmModule;
        if (continuation instanceof c0) {
            c0Var = (c0) continuation;
            int i2 = c0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0Var.x = i2 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(continuation);
            }
        } else {
            c0Var = new c0(continuation);
        }
        c0 c0Var2 = c0Var;
        Object objSendDataWithResult$default = c0Var2.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0Var2.x;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            try {
                this.innerInterceptor.b(bArr);
            } catch (Exception e2) {
                t5t.d(TAG, "interceptor.onSend error " + e2.getMessage());
            }
            c0Var2.t = this;
            c0Var2.u = bArr;
            c0Var2.x = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArr, 0, false, c0Var2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            alarmModule = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) c0Var2.u;
            alarmModule = (AlarmModule) c0Var2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        try {
            alarmModule.innerInterceptor.a(bArr, zBooleanValue);
        } catch (Exception e3) {
            t5t.d(TAG, "interceptor.onFinishSend error " + e3.getMessage());
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Nullable
    public final Object addAlarm(@NotNull AlarmClockExt alarmClockExt, @NotNull Continuation<? super Boolean> continuation) {
        return addAlarms(CollectionsKt__CollectionsJVMKt.listOf(alarmClockExt), continuation);
    }

    public final void addAlarmAsync(@NotNull AlarmClockExt alarm, @NotNull HMCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(alarm, "alarm");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(alarm, callback, null), 3, null);
    }

    public final boolean addAlarmSync(@NotNull AlarmClockExt alarm) {
        Intrinsics.checkNotNullParameter(alarm, "alarm");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new c(alarm, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x016f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object addAlarms(@NotNull List<? extends AlarmClockExt> list, @NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        List<? extends AlarmClockExt> list2;
        Object alarmVersionInfo;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.x = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objSendData = dVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                List<? extends AlarmClockExt> list3 = (List) dVar.u;
                alarmModule = (AlarmModule) dVar.t;
                ResultKt.throwOnFailure(objSendData);
                alarmVersionInfo = objSendData;
                list2 = list3;
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) dVar.t;
                ResultKt.throwOnFailure(objSendData);
                zBooleanValue = ((Boolean) objSendData).booleanValue();
                t5t.d(TAG, "addAlarm write cmd result: " + zBooleanValue);
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                f fVar = alarmModule2.new f(null);
                dVar.t = null;
                dVar.x = 3;
                objSendData = TimeoutKt.withTimeoutOrNull(15000L, fVar, dVar);
                if (objSendData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            StringBuilder sb = new StringBuilder();
            sb.append("addAlarm response: ");
            sb.append(channelResponse != null ? channelResponse.d() : null);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                t5t.d(TAG, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 4 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(objSendData);
        dVar.t = this;
        list2 = list;
        dVar.u = list2;
        dVar.x = 1;
        alarmVersionInfo = getAlarmVersionInfo(dVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            t5t.d(TAG, "query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        ArrayList<AlarmClockExt> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((AlarmClockExt) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            le.c(TAG, e.t);
            alarmModule.printAlarms(list2);
            return Boxing.boxBoolean(true);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (AlarmClockExt alarmClockExt : arrayList) {
            AlarmVersionInfo alarmVersionInfo2 = alarmModule.alarmVersionInfo;
            boolean zB = alarmVersionInfo2 != null ? alarmVersionInfo2.b() : false;
            AlarmVersionInfo alarmVersionInfo3 = alarmModule.alarmVersionInfo;
            arrayList2.add(alarmModule.assembleAlarmCmd(alarmClockExt, zB, alarmVersionInfo3 != null ? alarmVersionInfo3.a() : false));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, ArraysKt___ArraysJvmKt.asList((byte[]) it.next()));
        }
        alarmModule.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Boxing.boxByte((byte) 3));
        arrayList4.add(Boxing.boxByte((byte) arrayList.size()));
        arrayList4.addAll(arrayList3);
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList4);
        dVar.t = alarmModule;
        dVar.u = null;
        dVar.x = 2;
        objSendData = alarmModule.sendData(byteArray, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "addAlarm write cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        f fVar2 = alarmModule2.new f(null);
        dVar.t = null;
        dVar.x = 3;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, fVar2, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addAlarm response: ");
        sb2.append(channelResponse != null ? channelResponse.d() : null);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            t5t.d(TAG, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 4) {
        }
        return Boxing.boxBoolean(false);
    }

    public final boolean addAlarmsSync(@NotNull List<? extends AlarmClockExt> alarms) {
        Intrinsics.checkNotNullParameter(alarms, "alarms");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new g(alarms, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object clearAlarm(@NotNull Continuation<? super Boolean> continuation) {
        h hVar;
        AlarmModule alarmModule;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.w = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object alarmVersionInfo = hVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = hVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                alarmModule = (AlarmModule) hVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
            } else if (i3 == 2) {
                alarmModule = (AlarmModule) hVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
                zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
                t5t.d(TAG, "clear alarm cmd result: " + zBooleanValue);
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                i iVar = alarmModule.new i(null);
                hVar.t = null;
                hVar.w = 3;
                alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, iVar, hVar);
                if (alarmVersionInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(alarmVersionInfo);
            }
            channelResponse = (ChannelResponse) alarmVersionInfo;
            StringBuilder sb = new StringBuilder();
            sb.append("clear response: ");
            sb.append(channelResponse != null ? channelResponse.d() : null);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                t5t.d(TAG, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 12 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(alarmVersionInfo);
        hVar.t = this;
        hVar.w = 1;
        alarmVersionInfo = getAlarmVersionInfo(hVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            t5t.d(TAG, "clearAlarm, query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        alarmModule.channels.put(Boxing.boxInt(12), ChannelKt.Channel$default(0, null, null, 7, null));
        hVar.t = alarmModule;
        hVar.w = 2;
        alarmVersionInfo = alarmModule.sendData(new byte[]{11}, hVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
        t5t.d(TAG, "clear alarm cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        i iVar2 = alarmModule.new i(null);
        hVar.t = null;
        hVar.w = 3;
        alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, iVar2, hVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) alarmVersionInfo;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("clear response: ");
        sb2.append(channelResponse != null ? channelResponse.d() : null);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            t5t.d(TAG, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 12) {
        }
        return Boxing.boxBoolean(false);
    }

    public final boolean clearAlarmSync() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new j(null), 1, null)).booleanValue();
    }

    @Nullable
    public final Object deleteAlarm(@NotNull AlarmClockExt alarmClockExt, @NotNull Continuation<? super Boolean> continuation) {
        return deleteAlarms(CollectionsKt__CollectionsJVMKt.listOf(alarmClockExt), continuation);
    }

    public final void deleteAlarmAsync(@NotNull AlarmClockExt alarm, @NotNull HMCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(alarm, "alarm");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new k(alarm, callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:45:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteAlarms(@NotNull List<? extends AlarmClockExt> list, @NotNull Continuation<? super Boolean> continuation) {
        l lVar;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.x = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object alarmVersionInfo = lVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                list = (List) lVar.u;
                alarmModule = (AlarmModule) lVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) lVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
                zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
                t5t.d(TAG, "delete write cmd result: " + zBooleanValue);
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                m mVar = alarmModule2.new m(null);
                lVar.t = null;
                lVar.x = 3;
                alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, mVar, lVar);
                if (alarmVersionInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(alarmVersionInfo);
            }
            channelResponse = (ChannelResponse) alarmVersionInfo;
            StringBuilder sb = new StringBuilder();
            sb.append("delete response: ");
            sb.append(channelResponse != null ? channelResponse.d() : null);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                t5t.d(TAG, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 6 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(alarmVersionInfo);
        lVar.t = this;
        lVar.u = list;
        lVar.x = 1;
        alarmVersionInfo = getAlarmVersionInfo(lVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            t5t.d(TAG, "query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boxing.boxByte((byte) ((AlarmClockExt) it.next()).getIndex()));
        }
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        alarmModule.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(3);
        byteSpreadBuilder.add((byte) 5);
        byteSpreadBuilder.add((byte) byteArray.length);
        byteSpreadBuilder.addSpread(byteArray);
        byte[] array = byteSpreadBuilder.toArray();
        lVar.t = alarmModule;
        lVar.u = null;
        lVar.x = 2;
        alarmVersionInfo = alarmModule.sendData(array, lVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
        t5t.d(TAG, "delete write cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        m mVar2 = alarmModule2.new m(null);
        lVar.t = null;
        lVar.x = 3;
        alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, mVar2, lVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) alarmVersionInfo;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("delete response: ");
        sb2.append(channelResponse != null ? channelResponse.d() : null);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            t5t.d(TAG, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 6) {
        }
        return Boxing.boxBoolean(false);
    }

    @Nullable
    public final dh getAlarmChangeListener() {
        return this.alarmChangeListener;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAlarmVersionInfo(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        n nVar;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.x = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object objQueryVersion = nVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.x;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryVersion);
            if (this.alarmVersionInfo == null) {
                nVar.t = this;
                nVar.u = this;
                nVar.x = 1;
                objQueryVersion = queryVersion(nVar);
                if (objQueryVersion == coroutine_suspended) {
                    return coroutine_suspended;
                }
                alarmModule = this;
                alarmModule2 = alarmModule;
            } else {
                alarmModule = this;
            }
            return alarmModule.alarmVersionInfo;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        alarmModule2 = (AlarmModule) nVar.u;
        alarmModule = (AlarmModule) nVar.t;
        ResultKt.throwOnFailure(objQueryVersion);
        alarmModule2.alarmVersionInfo = (AlarmVersionInfo) objQueryVersion;
        return alarmModule.alarmVersionInfo;
    }

    public final void getAlarmVersionInfoAsync(@NotNull HMCallback<AlarmVersionInfo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new o(callback, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 15;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new p(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object inquireAlarm(@NotNull Continuation<? super List<AlarmClockExt>> continuation) {
        q qVar;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        String strD;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i2 = qVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.w = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object alarmVersionInfo = qVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                alarmModule = (AlarmModule) qVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) qVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
                zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
                t5t.d(TAG, "inquireAlarm write cmd result: " + zBooleanValue);
                if (!zBooleanValue) {
                    return null;
                }
                r rVar = alarmModule2.new r(null);
                qVar.t = alarmModule2;
                qVar.w = 3;
                alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, rVar, qVar);
                if (alarmVersionInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                alarmModule2 = (AlarmModule) qVar.t;
                ResultKt.throwOnFailure(alarmVersionInfo);
            }
            channelResponse = (ChannelResponse) alarmVersionInfo;
            StringBuilder sb = new StringBuilder();
            sb.append("inquireAlarm response: ");
            if (channelResponse != null) {
                strD = channelResponse.d();
            } else {
                strD = null;
            }
            sb.append(strD);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                t5t.d(TAG, "response data null");
                return null;
            }
            if (channelResponse.getData()[0] != 10) {
                return null;
            }
            return alarmModule2.parseAlarms(channelResponse);
        }
        ResultKt.throwOnFailure(alarmVersionInfo);
        qVar.t = this;
        qVar.w = 1;
        alarmVersionInfo = getAlarmVersionInfo(qVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            t5t.d(TAG, "query alarm version info: null");
            return null;
        }
        alarmModule.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, null, null, 7, null));
        qVar.t = alarmModule;
        qVar.w = 2;
        alarmVersionInfo = alarmModule.sendData(new byte[]{9}, qVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
        t5t.d(TAG, "inquireAlarm write cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        r rVar2 = alarmModule2.new r(null);
        qVar.t = alarmModule2;
        qVar.w = 3;
        alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, rVar2, qVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) alarmVersionInfo;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("inquireAlarm response: ");
        if (channelResponse != null) {
            strD = channelResponse.d();
        } else {
            strD = null;
        }
        sb2.append(strD);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            t5t.d(TAG, "response data null");
            return null;
        }
        if (channelResponse.getData()[0] != 10) {
            return null;
        }
        return alarmModule2.parseAlarms(channelResponse);
    }

    public final void inquireAlarmAsync(@NotNull HMCallback<List<AlarmClockExt>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new s(callback, null), 3, null);
    }

    @Nullable
    public final List<AlarmClockExt> inquireAlarmSync() {
        return (List) BuildersKt__BuildersKt.runBlocking$default(null, new t(null), 1, null);
    }

    @Nullable
    public final Object modifyAlarm(@NotNull AlarmClockExt alarmClockExt, @NotNull Continuation<? super Boolean> continuation) {
        return modifyAlarms(CollectionsKt__CollectionsJVMKt.listOf(alarmClockExt), continuation);
    }

    public final void modifyAlarmAsync(@NotNull AlarmClockExt alarm, @NotNull HMCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(alarm, "alarm");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new v(alarm, callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object modifyAlarms(@NotNull List<? extends AlarmClockExt> list, @NotNull Continuation<? super Boolean> continuation) {
        w wVar;
        List<? extends AlarmClockExt> list2;
        Object alarmVersionInfo;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i2 = wVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.x = i2 - Integer.MIN_VALUE;
            } else {
                wVar = new w(continuation);
            }
        } else {
            wVar = new w(continuation);
        }
        Object objSendData = wVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                List<? extends AlarmClockExt> list3 = (List) wVar.u;
                alarmModule = (AlarmModule) wVar.t;
                ResultKt.throwOnFailure(objSendData);
                alarmVersionInfo = objSendData;
                list2 = list3;
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) wVar.t;
                ResultKt.throwOnFailure(objSendData);
                zBooleanValue = ((Boolean) objSendData).booleanValue();
                t5t.d(TAG, "modifyAlarm write cmd result: " + zBooleanValue);
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                y yVar = alarmModule2.new y(null);
                wVar.t = null;
                wVar.x = 3;
                objSendData = TimeoutKt.withTimeoutOrNull(15000L, yVar, wVar);
                if (objSendData == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            StringBuilder sb = new StringBuilder();
            sb.append("modifyAlarm response: ");
            sb.append(channelResponse != null ? channelResponse.d() : null);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                t5t.d(TAG, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 8 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(objSendData);
        wVar.t = this;
        list2 = list;
        wVar.u = list2;
        wVar.x = 1;
        alarmVersionInfo = getAlarmVersionInfo(wVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            t5t.d(TAG, "query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        alarmModule.printAlarms(list2);
        ArrayList<AlarmClockExt> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((AlarmClockExt) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            le.c(TAG, x.t);
            return Boxing.boxBoolean(true);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (AlarmClockExt alarmClockExt : arrayList) {
            AlarmVersionInfo alarmVersionInfo2 = alarmModule.alarmVersionInfo;
            boolean zB = alarmVersionInfo2 != null ? alarmVersionInfo2.b() : false;
            AlarmVersionInfo alarmVersionInfo3 = alarmModule.alarmVersionInfo;
            arrayList2.add(alarmModule.assembleAlarmCmd(alarmClockExt, zB, alarmVersionInfo3 != null ? alarmVersionInfo3.a() : false));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, ArraysKt___ArraysJvmKt.asList((byte[]) it.next()));
        }
        alarmModule.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Boxing.boxByte((byte) 7));
        arrayList4.add(Boxing.boxByte((byte) arrayList.size()));
        arrayList4.addAll(arrayList3);
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList4);
        wVar.t = alarmModule;
        wVar.u = null;
        wVar.x = 2;
        objSendData = alarmModule.sendData(byteArray, wVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "modifyAlarm write cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        y yVar2 = alarmModule2.new y(null);
        wVar.t = null;
        wVar.x = 3;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, yVar2, wVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("modifyAlarm response: ");
        sb2.append(channelResponse != null ? channelResponse.d() : null);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            t5t.d(TAG, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 8) {
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        a0 a0Var;
        AlarmModule alarmModule;
        ChannelResponse channelResponse;
        String strD;
        if (continuation instanceof a0) {
            a0Var = (a0) continuation;
            int i2 = a0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.w = i2 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(continuation);
            }
        } else {
            a0Var = new a0(continuation);
        }
        Object objSendData = a0Var.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = a0Var.w;
        if (i3 != 0) {
            if (i3 == 1) {
                alarmModule = (AlarmModule) a0Var.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            StringBuilder sb = new StringBuilder();
            sb.append("queryVersion response: ");
            if (channelResponse != null) {
                strD = channelResponse.d();
            } else {
                strD = null;
            }
            sb.append(strD);
            t5t.d(TAG, sb.toString());
            if (channelResponse != null) {
                t5t.d(TAG, "get data null");
                return null;
            }
            if (channelResponse.getData()[0] != 2 && channelResponse.getData().length >= 4) {
                short s2 = channelResponse.getData()[1];
                return new AlarmVersionInfo(s2, channelResponse.getData()[2], channelResponse.getData()[3], s2 >= 2 ? channelResponse.getData()[4] : (byte) 0);
            }
        }
        ResultKt.throwOnFailure(objSendData);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        a0Var.t = this;
        a0Var.w = 1;
        objSendData = sendData(new byte[]{1}, a0Var);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "queryVersion write cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        b0 b0Var = alarmModule.new b0(null);
        a0Var.t = null;
        a0Var.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, b0Var, a0Var);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("queryVersion response: ");
        if (channelResponse != null) {
            strD = channelResponse.d();
        } else {
            strD = null;
        }
        sb2.append(strD);
        t5t.d(TAG, sb2.toString());
        if (channelResponse != null) {
            return channelResponse.getData()[0] != 2 ? null : null;
        }
        t5t.d(TAG, "get data null");
        return null;
    }

    public final void registerInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.a(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setAlarmChangeListener(@Nullable dh dhVar) {
        this.alarmChangeListener = dhVar;
    }

    public final void unregisterInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.b(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }
}
