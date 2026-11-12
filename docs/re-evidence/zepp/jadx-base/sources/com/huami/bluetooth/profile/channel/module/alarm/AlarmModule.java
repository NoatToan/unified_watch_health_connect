package com.huami.bluetooth.profile.channel.module.alarm;

import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.applet.AppletConfig;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor;
import com.huami.bluetooth.profile.channel.module.schedule.action.SimpleParseInterceptor;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xmlywind.sdk.common.mta.PointCategory;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.ByteArrayOutputStream;
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
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 15)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u000f\u0012\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002J\u001b\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00172\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 J\u001c\u0010$\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0014\u0010&\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016J\u001c\u0010'\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 J\u001c\u0010(\u001a\u00020\u00172\u0014\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00160 J\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016J\u001c\u0010*\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 J\u001b\u0010+\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010,J!\u00100\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010.J\u0006\u00101\u001a\u00020\u0005J\u0013\u00102\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u0010,J!\u00105\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010.J\u001b\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b6\u00103J\u0015\u00107\u001a\u0004\u0018\u00010!H\u0086@ø\u0001\u0000¢\u0006\u0004\b7\u00103J\u0015\u00108\u001a\u0004\u0018\u00010!H\u0086@ø\u0001\u0000¢\u0006\u0004\b8\u00103R\u001d\u0010=\u001a\u0002098B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<R(\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0?0>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00118V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "alarm", "", "isSupportTitle", "supportChinaCalendar", "", "c", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "g", "Ljava/nio/ByteBuffer;", "byteBuffer", "alarms", "", "f", "byteArray", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "h", "repeatForCalendar", GoogleApiAvailabilityLight.a, PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "callback", "getAlarmVersionInfoAsync", "addAlarmAsync", "addAlarmSync", "addAlarmsSync", "deleteAlarmAsync", "inquireAlarmAsync", "inquireAlarmSync", "modifyAlarmAsync", "addAlarm", "(Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addAlarms", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAlarm", "deleteAlarms", "clearAlarmSync", "clearAlarm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyAlarm", "modifyAlarms", "inquireAlarm", "getAlarmVersionInfo", "queryVersion", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "e", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/Map;", "channels", "i", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "alarmVersionInfo", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", com.loc.z.j, "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "innerInterceptor", "Lcom/huami/bluetooth/profile/channel/module/alarm/IAlarmChangedListener;", hl.k, "Lcom/huami/bluetooth/profile/channel/module/alarm/IAlarmChangedListener;", "getAlarmChangeListener", "()Lcom/huami/bluetooth/profile/channel/module/alarm/IAlarmChangedListener;", "setAlarmChangeListener", "(Lcom/huami/bluetooth/profile/channel/module/alarm/IAlarmChangedListener;)V", "alarmChangeListener", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AlarmModule extends BaseModule implements CoroutineScope {
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
    private static final String l = "AlarmModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private volatile AlarmVersionInfo alarmVersionInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final SimpleParseInterceptor innerInterceptor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private IAlarmChangedListener alarmChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AlarmClockExt c;
        public final /* synthetic */ HMCallback<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AlarmClockExt alarmClockExt, HMCallback<Boolean> hMCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = alarmClockExt;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new a(this.c, this.d, continuation);
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
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.c;
                this.a = 1;
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
            this.d.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$queryVersion$response$1", f = "AlarmModule.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public a0(Continuation<? super a0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new a0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarmSync$1", f = "AlarmModule.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ AlarmClockExt c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AlarmClockExt alarmClockExt, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = alarmClockExt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.c;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0}, l = {509}, m = "sendData", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class b0 extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b0(Continuation<? super b0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlarmModule.this.sendData((byte[]) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0}, l = {160, DataTypeSource.SPORT_TYPE_DOWNHILL, 192}, m = "addAlarms", n = {"this", "alarms"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlarmModule.this.addAlarms(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ignore add alarms as no visible alarm";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarms$response$1", f = "AlarmModule.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$addAlarmsSync$1", f = "AlarmModule.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ List<AlarmClockExt> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends AlarmClockExt> list, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                List<AlarmClockExt> list = this.c;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0}, l = {249, 255, 261}, m = "clearAlarm", n = {"this"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AlarmModule.this.clearAlarm(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$clearAlarm$response$1", f = "AlarmModule.kt", i = {}, l = {WeightingState.state_weight_overload}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(12));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$clearAlarmSync$1", f = "AlarmModule.kt", i = {}, l = {Constant.PLAIN_TEXT_MAX_LENGTH}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$deleteAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AlarmClockExt c;
        public final /* synthetic */ HMCallback<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AlarmClockExt alarmClockExt, HMCallback<Boolean> hMCallback, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = alarmClockExt;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new j(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.c;
                this.a = 1;
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
            this.d.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0}, l = {FTPCodes.NAME_SYSTEM_TIME, 222, AppletConfig.DEFAULT_DEVICE_SOURCE}, m = "deleteAlarms", n = {"this", "alarms"}, s = {"L$0", "L$1"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlarmModule.this.deleteAlarms(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$deleteAlarms$response$1", f = "AlarmModule.kt", i = {}, l = {AppletConfig.DEFAULT_DEVICE_SOURCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(6));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0}, l = {366}, m = "getAlarmVersionInfo", n = {"this"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlarmModule.this.getAlarmVersionInfo(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$getAlarmVersionInfoAsync$1", f = "AlarmModule.kt", i = {}, l = {97, 98}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<AlarmVersionInfo> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$getAlarmVersionInfoAsync$1$1", f = "AlarmModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HMCallback<AlarmVersionInfo> b;
            public final /* synthetic */ AlarmVersionInfo c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<AlarmVersionInfo> hMCallback, AlarmVersionInfo alarmVersionInfo, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hMCallback;
                this.c = alarmVersionInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.onFinish(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMCallback<AlarmVersionInfo> hMCallback, Continuation<? super n> continuation) {
            super(2, continuation);
            this.c = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new n(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
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
            this.a = 1;
            obj = alarmModule.getAlarmVersionInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.c, (AlarmVersionInfo) obj, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$init$1$1", f = "AlarmModule.kt", i = {}, l = {68, 73}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AlarmModule b;
            public final /* synthetic */ ChannelResponse c;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$o$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$init$1$1$1", f = "AlarmModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0318a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ AlarmModule b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0318a(AlarmModule alarmModule, Continuation<? super C0318a> continuation) {
                    super(2, continuation);
                    this.b = alarmModule;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0318a(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0318a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    IAlarmChangedListener alarmChangeListener = this.b.getAlarmChangeListener();
                    if (alarmChangeListener == null) {
                        return null;
                    }
                    alarmChangeListener.onChanged();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AlarmModule alarmModule, ChannelResponse channelResponse, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = alarmModule;
                this.c = channelResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                    try {
                        this.b.innerInterceptor.onReceive(this.c.getData());
                    } catch (Exception e) {
                        Debug.fi(AlarmModule.l, Intrinsics.stringPlus("interceptor.onReceive error ", e.getMessage()));
                    }
                    if (this.c.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.c.getData());
                    if (bFirst == 15) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        C0318a c0318a = new C0318a(this.b, null);
                        this.a = 1;
                        if (BuildersKt.withContext(main, c0318a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        Channel channel = (Channel) this.b.channels.get(Boxing.boxInt(bFirst));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.c;
                            this.a = 2;
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

        public o() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            AlarmModule alarmModule = AlarmModule.this;
            kotlinx.coroutines.e.f(alarmModule, null, null, new a(alarmModule, channelResponse, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0}, l = {338, 344, 351}, m = "inquireAlarm", n = {"this"}, s = {"L$0"})
    public static final class p extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AlarmModule.this.inquireAlarm(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$inquireAlarm$response$1", f = "AlarmModule.kt", i = {}, l = {351}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(10));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$inquireAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<List<AlarmClockExt>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(HMCallback<List<AlarmClockExt>> hMCallback, Continuation<? super r> continuation) {
            super(2, continuation);
            this.c = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new r(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                this.a = 1;
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
            this.c.sendOnFinishMessage((List<AlarmClockExt>) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$inquireAlarmSync$1", f = "AlarmModule.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<AlarmClockExt>>, Object> {
        public int a;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new s(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AlarmClockExt>> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<Job> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$modifyAlarmAsync$1", f = "AlarmModule.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AlarmClockExt c;
        public final /* synthetic */ HMCallback<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(AlarmClockExt alarmClockExt, HMCallback<Boolean> hMCallback, Continuation<? super u> continuation) {
            super(2, continuation);
            this.c = alarmClockExt;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new u(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AlarmModule alarmModule = AlarmModule.this;
                AlarmClockExt alarmClockExt = this.c;
                this.a = 1;
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
            this.d.sendFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {0, 0}, l = {286, 308, 319}, m = "modifyAlarms", n = {"this", "alarms"}, s = {"L$0", "L$1"})
    public static final class v extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AlarmModule.this.modifyAlarms(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ignore add alarms as no visible alarm";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule$modifyAlarms$response$1", f = "AlarmModule.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return AlarmModule.this.new x(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) AlarmModule.this.channels.get(Boxing.boxInt(8));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ JSONArray a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(JSONArray jSONArray) {
            super(0);
            this.a = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.alarm.AlarmModule", f = "AlarmModule.kt", i = {}, l = {376, 383}, m = "queryVersion", n = {}, s = {})
    public static final class z extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AlarmModule.this.queryVersion(this);
        }
    }

    public AlarmModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(t.a);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = new SimpleParseInterceptor(l, null, 2, null);
    }

    private final byte[] c(AlarmClockExt alarm, boolean isSupportTitle, boolean supportChinaCalendar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList arrayList = new ArrayList();
        String title = alarm.getTitle();
        if (isSupportTitle) {
            arrayList.addAll(ArraysKt___ArraysKt.toList(title.getBytes(Charset.defaultCharset())));
            arrayList.add((byte) 0);
        }
        arrayList.add(Byte.valueOf((byte) ((alarm.isSmart() ? 1 : 0) | 0 | (alarm.isLazy() ? 2 : 0) | (alarm.isEnable() ? 4 : 0))));
        arrayList.add(Byte.valueOf((byte) alarm.getIndex()));
        arrayList.add(Byte.valueOf(alarm.getHour()));
        arrayList.add(Byte.valueOf(alarm.getMinutes()));
        if (!supportChinaCalendar) {
            alarm.setRepeat(d(alarm.getRepeat()));
        }
        if (alarm.getRepeat() == 0 || alarm.getRepeat() == -128) {
            alarm.setRepeat(0);
        }
        kotlin.collections.h.addAll(arrayList, ArraysKt___ArraysKt.asIterable(GattUtils.intToBytes(alarm.getRepeat())));
        arrayList.add(Byte.valueOf(alarm.getSource()));
        arrayList.add((byte) 0);
        byteArrayOutputStream.write(CollectionsKt___CollectionsKt.toByteArray(arrayList));
        return byteArrayOutputStream.toByteArray();
    }

    private final int d(int repeatForCalendar) {
        if (repeatForCalendar == 128) {
            return 31;
        }
        return repeatForCalendar;
    }

    private final Job e() {
        return (Job) this.job.getValue();
    }

    private final int f(boolean isSupportTitle, ByteBuffer byteBuffer, List<AlarmClockExt> alarms) {
        AlarmClockExt alarmClockExt = new AlarmClockExt();
        if (isSupportTitle) {
            BufByteDecoder bufByteDecoder = new BufByteDecoder(null, 0, 3, null);
            bufByteDecoder.append(byteBuffer.array());
            String string = bufByteDecoder.readString();
            alarmClockExt.setTitle(string);
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
            byteBuffer.position(string.getBytes(charset).length + 1);
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
        alarmClockExt.setRepeat(GattUtils.bytesToInt(bArr, 0));
        alarmClockExt.setSource(byteBuffer.get());
        alarmClockExt.setSmartWakeupTime(byteBuffer.get());
        alarms.add(alarmClockExt);
        return byteBuffer.position();
    }

    private final List<AlarmClockExt> g(ChannelResponse response) {
        ArrayList arrayList = new ArrayList();
        try {
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(response.getData(), 2, response.getData().length);
            byte b2 = response.getData()[1];
            if (b2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrCopyOfRange);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    AlarmVersionInfo alarmVersionInfo = this.alarmVersionInfo;
                    int iF = f(alarmVersionInfo == null ? false : alarmVersionInfo.isSupportTitle(), byteBufferWrap, arrayList);
                    if (i2 < b2 - 1) {
                        bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrCopyOfRange, iF, bArrCopyOfRange.length);
                    }
                    if (i3 >= b2) {
                        break;
                    }
                    i2 = i3;
                }
            }
        } catch (Exception e2) {
            Debug.fi(l, e2.getMessage());
        }
        return arrayList;
    }

    private final void h(List<? extends AlarmClockExt> alarms) {
        HMLog.info(l, new y(new JSONArray((Collection) alarms)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendData(byte[] bArr, Continuation<? super Boolean> continuation) {
        b0 b0Var;
        AlarmModule alarmModule;
        if (continuation instanceof b0) {
            b0Var = (b0) continuation;
            int i2 = b0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(continuation);
            }
        } else {
            b0Var = new b0(continuation);
        }
        b0 b0Var2 = b0Var;
        Object objSendDataWithResult$default = b0Var2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = b0Var2.e;
        boolean z2 = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            try {
                this.innerInterceptor.onSend(bArr);
            } catch (Exception e2) {
                Debug.fi(l, Intrinsics.stringPlus("interceptor.onSend error ", e2.getMessage()));
            }
            b0Var2.a = this;
            b0Var2.b = bArr;
            b0Var2.e = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, b0Var2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            alarmModule = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) b0Var2.b;
            alarmModule = (AlarmModule) b0Var2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        try {
            SimpleParseInterceptor simpleParseInterceptor = alarmModule.innerInterceptor;
            if (!zBooleanValue) {
                z2 = false;
            }
            simpleParseInterceptor.onFinishSend(bArr, z2);
        } catch (Exception e3) {
            Debug.fi(l, Intrinsics.stringPlus("interceptor.onFinishSend error ", e3.getMessage()));
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    @Nullable
    public final Object addAlarm(@NotNull AlarmClockExt alarmClockExt, @NotNull Continuation<? super Boolean> continuation) {
        return addAlarms(kotlin.collections.e.listOf(alarmClockExt), continuation);
    }

    public final void addAlarmAsync(@NotNull AlarmClockExt alarm, @NotNull HMCallback<Boolean> callback) {
        kotlinx.coroutines.e.f(this, null, null, new a(alarm, callback, null), 3, null);
    }

    public final boolean addAlarmSync(@NotNull AlarmClockExt alarm) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new b(alarm, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object addAlarms(@NotNull List<? extends AlarmClockExt> list, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        List<? extends AlarmClockExt> list2;
        Object alarmVersionInfo;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        Boolean boolBoxBoolean;
        Boolean boolBoxBoolean2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objSendData = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                List<? extends AlarmClockExt> list3 = (List) cVar.b;
                alarmModule = (AlarmModule) cVar.a;
                ResultKt.throwOnFailure(objSendData);
                alarmVersionInfo = objSendData;
                list2 = list3;
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) cVar.a;
                ResultKt.throwOnFailure(objSendData);
                zBooleanValue = ((Boolean) objSendData).booleanValue();
                Debug.fi(l, Intrinsics.stringPlus("addAlarm write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                e eVar = alarmModule2.new e(null);
                cVar.a = null;
                cVar.e = 3;
                objSendData = TimeoutKt.withTimeoutOrNull(15000L, eVar, cVar);
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
            Debug.fi(l, Intrinsics.stringPlus("addAlarm response: ", channelResponse != null ? channelResponse.toHexString() : null));
            if (channelResponse == null) {
                Debug.fi(l, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 4 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(objSendData);
        cVar.a = this;
        list2 = list;
        cVar.b = list2;
        cVar.e = 1;
        alarmVersionInfo = getAlarmVersionInfo(cVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            Debug.fi(l, "query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        ArrayList<AlarmClockExt> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (Boxing.boxBoolean(((AlarmClockExt) obj).isVisible()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            HMLog.info(l, d.a);
            alarmModule.h(list2);
            return Boxing.boxBoolean(true);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (AlarmClockExt alarmClockExt : arrayList) {
            AlarmVersionInfo alarmVersionInfo2 = alarmModule.alarmVersionInfo;
            boolean zBooleanValue2 = (alarmVersionInfo2 == null || (boolBoxBoolean = Boxing.boxBoolean(alarmVersionInfo2.isSupportTitle())) == null) ? false : boolBoxBoolean.booleanValue();
            AlarmVersionInfo alarmVersionInfo3 = alarmModule.alarmVersionInfo;
            arrayList2.add(alarmModule.c(alarmClockExt, zBooleanValue2, (alarmVersionInfo3 == null || (boolBoxBoolean2 = Boxing.boxBoolean(alarmVersionInfo3.isSupportCalendarWorkday())) == null) ? false : boolBoxBoolean2.booleanValue()));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(arrayList3, ArraysKt___ArraysJvmKt.asList((byte[]) it2.next()));
        }
        alarmModule.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Boxing.boxByte((byte) 3));
        arrayList4.add(Boxing.boxByte((byte) arrayList.size()));
        arrayList4.addAll(arrayList3);
        Unit unit = Unit.INSTANCE;
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList4);
        cVar.a = alarmModule;
        cVar.b = null;
        cVar.e = 2;
        objSendData = alarmModule.sendData(byteArray, cVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(l, Intrinsics.stringPlus("addAlarm write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        e eVar2 = alarmModule2.new e(null);
        cVar.a = null;
        cVar.e = 3;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, eVar2, cVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(l, Intrinsics.stringPlus("addAlarm response: ", channelResponse != null ? channelResponse.toHexString() : null));
        if (channelResponse == null) {
            Debug.fi(l, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 4) {
        }
        return Boxing.boxBoolean(false);
    }

    public final boolean addAlarmsSync(@NotNull List<? extends AlarmClockExt> alarms) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new f(alarms, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object clearAlarm(@NotNull Continuation<? super Boolean> continuation) {
        g gVar;
        AlarmModule alarmModule;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.d = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object alarmVersionInfo = gVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                alarmModule = (AlarmModule) gVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
            } else if (i3 == 2) {
                alarmModule = (AlarmModule) gVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
                zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
                Debug.fi(l, Intrinsics.stringPlus("clear alarm cmd result: ", Boxing.boxBoolean(zBooleanValue)));
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                h hVar = alarmModule.new h(null);
                gVar.a = null;
                gVar.d = 3;
                alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, hVar, gVar);
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
            Debug.fi(l, Intrinsics.stringPlus("clear response: ", channelResponse != null ? channelResponse.toHexString() : null));
            if (channelResponse == null) {
                Debug.fi(l, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 12 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(alarmVersionInfo);
        gVar.a = this;
        gVar.d = 1;
        alarmVersionInfo = getAlarmVersionInfo(gVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            Debug.fi(l, "clearAlarm, query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        alarmModule.channels.put(Boxing.boxInt(12), ChannelKt.Channel$default(0, 1, null));
        gVar.a = alarmModule;
        gVar.d = 2;
        alarmVersionInfo = alarmModule.sendData(new byte[]{11}, gVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
        Debug.fi(l, Intrinsics.stringPlus("clear alarm cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        h hVar2 = alarmModule.new h(null);
        gVar.a = null;
        gVar.d = 3;
        alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, hVar2, gVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) alarmVersionInfo;
        Debug.fi(l, Intrinsics.stringPlus("clear response: ", channelResponse != null ? channelResponse.toHexString() : null));
        if (channelResponse == null) {
            Debug.fi(l, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 12) {
        }
        return Boxing.boxBoolean(false);
    }

    public final boolean clearAlarmSync() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new i(null), 1, null)).booleanValue();
    }

    @Nullable
    public final Object deleteAlarm(@NotNull AlarmClockExt alarmClockExt, @NotNull Continuation<? super Boolean> continuation) {
        return deleteAlarms(kotlin.collections.e.listOf(alarmClockExt), continuation);
    }

    public final void deleteAlarmAsync(@NotNull AlarmClockExt alarm, @NotNull HMCallback<Boolean> callback) {
        kotlinx.coroutines.e.f(this, null, null, new j(alarm, callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteAlarms(@NotNull List<? extends AlarmClockExt> list, @NotNull Continuation<? super Boolean> continuation) {
        k kVar;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.e = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object alarmVersionInfo = kVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                list = (List) kVar.b;
                alarmModule = (AlarmModule) kVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) kVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
                zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
                Debug.fi(l, Intrinsics.stringPlus("delete write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                l lVar = alarmModule2.new l(null);
                kVar.a = null;
                kVar.e = 3;
                alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, lVar, kVar);
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
            Debug.fi(l, Intrinsics.stringPlus("delete response: ", channelResponse != null ? channelResponse.toHexString() : null));
            if (channelResponse == null) {
                Debug.fi(l, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 6 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(alarmVersionInfo);
        kVar.a = this;
        kVar.b = list;
        kVar.e = 1;
        alarmVersionInfo = getAlarmVersionInfo(kVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            Debug.fi(l, "query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boxing.boxByte((byte) ((AlarmClockExt) it2.next()).getIndex()));
        }
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList);
        alarmModule.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        ByteSpreadBuilder byteSpreadBuilder = new ByteSpreadBuilder(3);
        byteSpreadBuilder.add((byte) 5);
        byteSpreadBuilder.add((byte) byteArray.length);
        byteSpreadBuilder.addSpread(byteArray);
        byte[] array = byteSpreadBuilder.toArray();
        kVar.a = alarmModule;
        kVar.b = null;
        kVar.e = 2;
        alarmVersionInfo = alarmModule.sendData(array, kVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
        Debug.fi(l, Intrinsics.stringPlus("delete write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        l lVar2 = alarmModule2.new l(null);
        kVar.a = null;
        kVar.e = 3;
        alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, lVar2, kVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) alarmVersionInfo;
        Debug.fi(l, Intrinsics.stringPlus("delete response: ", channelResponse != null ? channelResponse.toHexString() : null));
        if (channelResponse == null) {
            Debug.fi(l, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 6) {
        }
        return Boxing.boxBoolean(false);
    }

    @Nullable
    public final IAlarmChangedListener getAlarmChangeListener() {
        return this.alarmChangeListener;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAlarmVersionInfo(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        m mVar;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.e = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objQueryVersion = mVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objQueryVersion);
            if (this.alarmVersionInfo == null) {
                mVar.a = this;
                mVar.b = this;
                mVar.e = 1;
                objQueryVersion = queryVersion(mVar);
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
        alarmModule2 = (AlarmModule) mVar.b;
        alarmModule = (AlarmModule) mVar.a;
        ResultKt.throwOnFailure(objQueryVersion);
        alarmModule2.alarmVersionInfo = (AlarmVersionInfo) objQueryVersion;
        return alarmModule.alarmVersionInfo;
    }

    public final void getAlarmVersionInfoAsync(@NotNull HMCallback<AlarmVersionInfo> callback) {
        kotlinx.coroutines.e.f(this, null, null, new n(callback, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return e().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 15;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new o(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object inquireAlarm(@NotNull Continuation<? super List<AlarmClockExt>> continuation) {
        p pVar;
        AlarmModule alarmModule;
        boolean zBooleanValue;
        AlarmModule alarmModule2;
        ChannelResponse channelResponse;
        String hexString;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object alarmVersionInfo = pVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = pVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                alarmModule = (AlarmModule) pVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
            } else if (i3 == 2) {
                alarmModule = (AlarmModule) pVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
                zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
                Debug.fi(l, Intrinsics.stringPlus("inquireAlarm write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
                if (!zBooleanValue) {
                    return null;
                }
                q qVar = alarmModule.new q(null);
                pVar.a = alarmModule;
                pVar.d = 3;
                alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, qVar, pVar);
                if (alarmVersionInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                alarmModule2 = alarmModule;
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                alarmModule2 = (AlarmModule) pVar.a;
                ResultKt.throwOnFailure(alarmVersionInfo);
            }
            channelResponse = (ChannelResponse) alarmVersionInfo;
            if (channelResponse == null) {
                hexString = null;
            } else {
                hexString = channelResponse.toHexString();
            }
            Debug.fi(l, Intrinsics.stringPlus("inquireAlarm response: ", hexString));
            if (channelResponse == null) {
                Debug.fi(l, "response data null");
                return null;
            }
            if (channelResponse.getData()[0] != 10) {
                return null;
            }
            return alarmModule2.g(channelResponse);
        }
        ResultKt.throwOnFailure(alarmVersionInfo);
        pVar.a = this;
        pVar.d = 1;
        alarmVersionInfo = getAlarmVersionInfo(pVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            Debug.fi(l, "query alarm version info: null");
            return null;
        }
        alarmModule.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, 1, null));
        pVar.a = alarmModule;
        pVar.d = 2;
        alarmVersionInfo = alarmModule.sendData(new byte[]{9}, pVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        zBooleanValue = ((Boolean) alarmVersionInfo).booleanValue();
        Debug.fi(l, Intrinsics.stringPlus("inquireAlarm write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        q qVar2 = alarmModule.new q(null);
        pVar.a = alarmModule;
        pVar.d = 3;
        alarmVersionInfo = TimeoutKt.withTimeoutOrNull(15000L, qVar2, pVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        channelResponse = (ChannelResponse) alarmVersionInfo;
        if (channelResponse == null) {
            hexString = null;
        } else {
            hexString = channelResponse.toHexString();
        }
        Debug.fi(l, Intrinsics.stringPlus("inquireAlarm response: ", hexString));
        if (channelResponse == null) {
            Debug.fi(l, "response data null");
            return null;
        }
        if (channelResponse.getData()[0] != 10) {
            return null;
        }
        return alarmModule2.g(channelResponse);
    }

    public final void inquireAlarmAsync(@NotNull HMCallback<List<AlarmClockExt>> callback) {
        kotlinx.coroutines.e.f(this, null, null, new r(callback, null), 3, null);
    }

    @Nullable
    public final List<AlarmClockExt> inquireAlarmSync() {
        return (List) kotlinx.coroutines.d.b(null, new s(null), 1, null);
    }

    @Nullable
    public final Object modifyAlarm(@NotNull AlarmClockExt alarmClockExt, @NotNull Continuation<? super Boolean> continuation) {
        return modifyAlarms(kotlin.collections.e.listOf(alarmClockExt), continuation);
    }

    public final void modifyAlarmAsync(@NotNull AlarmClockExt alarm, @NotNull HMCallback<Boolean> callback) {
        kotlinx.coroutines.e.f(this, null, null, new u(alarm, callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:67:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object modifyAlarms(@NotNull List<? extends AlarmClockExt> list, @NotNull Continuation<? super Boolean> continuation) {
        v vVar;
        List<? extends AlarmClockExt> list2;
        Object alarmVersionInfo;
        AlarmModule alarmModule;
        AlarmModule alarmModule2;
        Boolean boolBoxBoolean;
        Boolean boolBoxBoolean2;
        boolean zBooleanValue;
        ChannelResponse channelResponse;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i2 = vVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.e = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        Object objSendData = vVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = vVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                List<? extends AlarmClockExt> list3 = (List) vVar.b;
                alarmModule = (AlarmModule) vVar.a;
                ResultKt.throwOnFailure(objSendData);
                alarmVersionInfo = objSendData;
                list2 = list3;
            } else if (i3 == 2) {
                alarmModule2 = (AlarmModule) vVar.a;
                ResultKt.throwOnFailure(objSendData);
                zBooleanValue = ((Boolean) objSendData).booleanValue();
                Debug.fi(l, Intrinsics.stringPlus("modifyAlarm write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
                if (!zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                x xVar = alarmModule2.new x(null);
                vVar.a = null;
                vVar.e = 3;
                objSendData = TimeoutKt.withTimeoutOrNull(15000L, xVar, vVar);
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
            Debug.fi(l, Intrinsics.stringPlus("modifyAlarm response: ", channelResponse != null ? channelResponse.toHexString() : null));
            if (channelResponse == null) {
                Debug.fi(l, "response data null");
                return Boxing.boxBoolean(false);
            }
            if (channelResponse.getData()[0] == 8 || channelResponse.getData().length != 2) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(channelResponse.getData()[1] == 1);
        }
        ResultKt.throwOnFailure(objSendData);
        vVar.a = this;
        list2 = list;
        vVar.b = list2;
        vVar.e = 1;
        alarmVersionInfo = getAlarmVersionInfo(vVar);
        if (alarmVersionInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        if (alarmVersionInfo == null) {
            Debug.fi(l, "query alarm version info: null");
            return Boxing.boxBoolean(false);
        }
        alarmModule.h(list2);
        ArrayList<AlarmClockExt> arrayList = new ArrayList();
        for (Object obj : list2) {
            if (Boxing.boxBoolean(((AlarmClockExt) obj).isVisible()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            HMLog.info(l, w.a);
            return Boxing.boxBoolean(true);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (AlarmClockExt alarmClockExt : arrayList) {
            AlarmVersionInfo alarmVersionInfo2 = alarmModule.alarmVersionInfo;
            boolean zBooleanValue2 = (alarmVersionInfo2 == null || (boolBoxBoolean = Boxing.boxBoolean(alarmVersionInfo2.isSupportTitle())) == null) ? false : boolBoxBoolean.booleanValue();
            AlarmVersionInfo alarmVersionInfo3 = alarmModule.alarmVersionInfo;
            arrayList2.add(alarmModule.c(alarmClockExt, zBooleanValue2, (alarmVersionInfo3 == null || (boolBoxBoolean2 = Boxing.boxBoolean(alarmVersionInfo3.isSupportCalendarWorkday())) == null) ? false : boolBoxBoolean2.booleanValue()));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            kotlin.collections.h.addAll(arrayList3, ArraysKt___ArraysJvmKt.asList((byte[]) it2.next()));
        }
        alarmModule.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Boxing.boxByte((byte) 7));
        arrayList4.add(Boxing.boxByte((byte) arrayList.size()));
        arrayList4.addAll(arrayList3);
        Unit unit = Unit.INSTANCE;
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(arrayList4);
        vVar.a = alarmModule;
        vVar.b = null;
        vVar.e = 2;
        objSendData = alarmModule.sendData(byteArray, vVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule2 = alarmModule;
        zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(l, Intrinsics.stringPlus("modifyAlarm write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        x xVar2 = alarmModule2.new x(null);
        vVar.a = null;
        vVar.e = 3;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, xVar2, vVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(l, Intrinsics.stringPlus("modifyAlarm response: ", channelResponse != null ? channelResponse.toHexString() : null));
        if (channelResponse == null) {
            Debug.fi(l, "response data null");
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData()[0] == 8) {
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        z zVar;
        AlarmModule alarmModule;
        ChannelResponse channelResponse;
        String hexString;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i2 = zVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zVar.d = i2 - Integer.MIN_VALUE;
            } else {
                zVar = new z(continuation);
            }
        } else {
            zVar = new z(continuation);
        }
        Object objSendData = zVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = zVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                alarmModule = (AlarmModule) zVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            if (channelResponse == null) {
                hexString = null;
            } else {
                hexString = channelResponse.toHexString();
            }
            Debug.fi(l, Intrinsics.stringPlus("queryVersion response: ", hexString));
            if (channelResponse != null) {
                Debug.fi(l, "get data null");
                return null;
            }
            if (channelResponse.getData()[0] != 2 && channelResponse.getData().length >= 4) {
                short s2 = channelResponse.getData()[1];
                return new AlarmVersionInfo(s2, channelResponse.getData()[2], channelResponse.getData()[3], s2 >= 2 ? channelResponse.getData()[4] : (byte) 0);
            }
        }
        ResultKt.throwOnFailure(objSendData);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        zVar.a = this;
        zVar.d = 1;
        objSendData = sendData(new byte[]{1}, zVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        alarmModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(l, Intrinsics.stringPlus("queryVersion write cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        a0 a0Var = alarmModule.new a0(null);
        zVar.a = null;
        zVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, a0Var, zVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        if (channelResponse == null) {
            hexString = null;
        } else {
            hexString = channelResponse.toHexString();
        }
        Debug.fi(l, Intrinsics.stringPlus("queryVersion response: ", hexString));
        if (channelResponse != null) {
            return channelResponse.getData()[0] != 2 ? null : null;
        }
        Debug.fi(l, "get data null");
        return null;
    }

    public final void registerInterceptor(@NotNull IDataInterceptor interceptor) {
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.registerInterceptor(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setAlarmChangeListener(@Nullable IAlarmChangedListener iAlarmChangedListener) {
        this.alarmChangeListener = iAlarmChangedListener;
    }

    public final void unregisterInterceptor(@NotNull IDataInterceptor interceptor) {
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.unregisterInterceptor(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }
}
