package com.huami.bluetooth.profile.channel.module.eventreminder;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.EventReminderVersion;
import defpackage.d4;
import defpackage.jh;
import defpackage.ks;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.z2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001OB\u000f\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0016J$\u0010\u001f\u001a\u00020\u00152\u001c\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f0\u001dJ\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\fJ/\u0010\"\u001a\u00020\u00152\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001d¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u00152\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001d¢\u0006\u0004\b&\u0010#J\u001c\u0010'\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u001c\u0010(\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u0015\u0010*\u001a\u0004\u0018\u00010)H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010+J\u001b\u0010-\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010.J\u001b\u00100\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010.J\u000e\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201J\u000e\u00104\u001a\u00020\u00152\u0006\u00102\u001a\u000201R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R&\u0010?\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/eventreminder/EventReminderModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "item", "", "dispatchAmbiguousOperation", "([Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parseEventItems", "hmReminderInfo", "eventToBytes", "byteArray", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "items", "", "cacheEventAddALL", "cacheEventSet", "cacheEventAdd", "cacheEventRemove", "cacheEventIsContain", "isOnceEnded", "init", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "queryEventItemsAsync", "queryEventItemsSync", "Ljava/lang/Object;", "handleAmbiguousOperationsAsync", "([Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "handleAmbiguousOperationsSync", "([Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;)Z", "addEventAsync", "deleteEventAsync", "modifyEventAsync", "Lo9;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryEventItems", "addEvent", "(Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyEvent", "deleteEvent", "Ljh;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "cacheEventItems", "Ljava/util/List;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 56)
public final class EventReminderModule extends a implements CoroutineScope {
    public static final int EVENT_REMINDER = 56;
    private static final int RESULT_OK = 1;

    @NotNull
    private static final String TAG = "EventReminderModule";
    public static final int TYPE_NOTIFY_EVENT_CHANGE = 11;
    private static final int TYPE_REQUEST_EVENT_ADD = 5;
    private static final int TYPE_REQUEST_EVENT_DELETE = 9;
    private static final int TYPE_REQUEST_EVENT_ITEMS = 3;
    private static final int TYPE_REQUEST_EVENT_MODIFY = 7;
    private static final int TYPE_REQUEST_EVENT_VERSION = 1;
    private static final int TYPE_RESPONSE_EVENT_ADD = 6;
    private static final int TYPE_RESPONSE_EVENT_DELETE = 10;
    private static final int TYPE_RESPONSE_EVENT_ITEMS = 4;
    private static final int TYPE_RESPONSE_EVENT_MODIFY = 8;
    private static final int TYPE_RESPONSE_EVENT_VERSION = 2;

    @Nullable
    private List<HMReminderInfo> cacheEventItems;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    @NotNull
    private final ks innerInterceptor;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0, 1, 1}, l = {204, 213}, m = "addEvent", n = {"this", "hmReminderInfo", "this", "hmReminderInfo"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return EventReminderModule.this.addEvent(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$addEvent$response$1", f = "EventReminderModule.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(6));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$addEventAsync$1", f = "EventReminderModule.kt", i = {0, 0}, l = {130}, m = "invokeSuspend", n = {"result", "$this$forEach$iv"}, s = {"L$0", "L$1"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ HMCallback<Object> A;
        public final /* synthetic */ HMReminderInfo[] B;
        public final /* synthetic */ EventReminderModule C;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public int x;
        public int y;
        public int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMCallback<Object> hMCallback, HMReminderInfo[] hMReminderInfoArr, EventReminderModule eventReminderModule, Continuation<? super d> continuation) {
            super(2, continuation);
            this.A = hMCallback;
            this.B = hMReminderInfoArr;
            this.C = eventReminderModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.A, this.B, this.C, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0048  */
        /* JADX WARN: Code duplicated, block: B:12:0x005e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:13:0x005f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:14:0x0060). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.z
                r2 = 1
                if (r1 == 0) goto L2b
                if (r1 != r2) goto L23
                int r1 = r10.y
                int r3 = r10.x
                java.lang.Object r4 = r10.w
                kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref.BooleanRef) r4
                java.lang.Object r5 = r10.v
                com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule r5 = (com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule) r5
                java.lang.Object r6 = r10.u
                com.xiaomi.hm.health.bt.model.HMReminderInfo[] r6 = (com.xiaomi.hm.health.bt.model.HMReminderInfo[]) r6
                java.lang.Object r7 = r10.t
                kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
                kotlin.ResultKt.throwOnFailure(r11)
                goto L60
            L23:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2b:
                kotlin.ResultKt.throwOnFailure(r11)
                com.xiaomi.hm.health.bt.device.HMCallback<java.lang.Object> r11 = r10.A
                r11.sendOnStartMessage()
                kotlin.jvm.internal.Ref$BooleanRef r11 = new kotlin.jvm.internal.Ref$BooleanRef
                r11.<init>()
                r11.element = r2
                com.xiaomi.hm.health.bt.model.HMReminderInfo[] r1 = r10.B
                com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule r3 = r10.C
                int r4 = r1.length
                r5 = 0
                r6 = r1
                r1 = r4
                r4 = r11
                r9 = r5
                r5 = r3
                r3 = r9
            L46:
                if (r3 >= r1) goto L6e
                r11 = r6[r3]
                r10.t = r4
                r10.u = r6
                r10.v = r5
                r10.w = r4
                r10.x = r3
                r10.y = r1
                r10.z = r2
                java.lang.Object r11 = r5.addEvent(r11, r10)
                if (r11 != r0) goto L5f
                return r0
            L5f:
                r7 = r4
            L60:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                boolean r8 = r7.element
                r11 = r11 & r8
                r4.element = r11
                int r3 = r3 + r2
                r4 = r7
                goto L46
            L6e:
                com.xiaomi.hm.health.bt.device.HMCallback<java.lang.Object> r11 = r10.A
                boolean r0 = r4.element
                r11.sendOnFinishMessage(r0)
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0, 1, 1}, l = {266, 275}, m = "deleteEvent", n = {"this", "hmReminderInfo", "this", "hmReminderInfo"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return EventReminderModule.this.deleteEvent(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$deleteEvent$response$1", f = "EventReminderModule.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
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
            return EventReminderModule.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(10));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$deleteEventAsync$1", f = "EventReminderModule.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<Object> u;
        public final /* synthetic */ EventReminderModule v;
        public final /* synthetic */ HMReminderInfo w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HMCallback<Object> hMCallback, EventReminderModule eventReminderModule, HMReminderInfo hMReminderInfo, Continuation<? super g> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = eventReminderModule;
            this.w = hMReminderInfo;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.u.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.v;
                HMReminderInfo hMReminderInfo = this.w;
                this.t = 1;
                obj = eventReminderModule.deleteEvent(hMReminderInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {106, 111, 114, 117}, m = "dispatchAmbiguousOperation", n = {"this", "item", "result", "this", "result", "$this$forEach$iv", "this", "result", "$this$forEach$iv", "this", "result", "$this$forEach$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class h extends ContinuationImpl {
        public int A;
        public Object t;
        public Object u;
        public Object v;
        public int w;
        public int x;
        public /* synthetic */ Object y;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            return EventReminderModule.this.dispatchAmbiguousOperation(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$handleAmbiguousOperationsAsync$1", f = "EventReminderModule.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<Object> u;
        public final /* synthetic */ EventReminderModule v;
        public final /* synthetic */ HMReminderInfo[] w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMCallback<Object> hMCallback, EventReminderModule eventReminderModule, HMReminderInfo[] hMReminderInfoArr, Continuation<? super i> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = eventReminderModule;
            this.w = hMReminderInfoArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
                this.u.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.v;
                HMReminderInfo[] hMReminderInfoArr = this.w;
                HMReminderInfo[] hMReminderInfoArr2 = (HMReminderInfo[]) Arrays.copyOf(hMReminderInfoArr, hMReminderInfoArr.length);
                this.t = 1;
                obj = eventReminderModule.dispatchAmbiguousOperation(hMReminderInfoArr2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$handleAmbiguousOperationsSync$1", f = "EventReminderModule.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ HMReminderInfo[] v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HMReminderInfo[] hMReminderInfoArr, Continuation<? super j> continuation) {
            super(2, continuation);
            this.v = hMReminderInfoArr;
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
            return EventReminderModule.this.new j(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventReminderModule eventReminderModule = EventReminderModule.this;
                HMReminderInfo[] hMReminderInfoArr = this.v;
                HMReminderInfo[] hMReminderInfoArr2 = (HMReminderInfo[]) Arrays.copyOf(hMReminderInfoArr, hMReminderInfoArr.length);
                this.t = 1;
                obj = eventReminderModule.dispatchAmbiguousOperation(hMReminderInfoArr2, this);
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class k extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$init$1$1", f = "EventReminderModule.kt", i = {}, l = {57, 65}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object t;
            public int u;
            public final /* synthetic */ ChannelResponse v;
            public final /* synthetic */ EventReminderModule w;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$k$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$init$1$1$2$1", f = "EventReminderModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0280a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ EventReminderModule u;
                public final /* synthetic */ ChannelResponse v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0280a(EventReminderModule eventReminderModule, ChannelResponse channelResponse, Continuation<? super C0280a> continuation) {
                    super(2, continuation);
                    this.u = eventReminderModule;
                    this.v = channelResponse;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0280a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0280a(this.u, this.v, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.u.innerInterceptor.a(this.v.getData());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, EventReminderModule eventReminderModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.v = channelResponse;
                this.w = eventReminderModule;
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
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.u;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        byte[] data = this.v.getData();
                        if (!(!(data.length == 0))) {
                            data = null;
                        }
                        if (data != null) {
                            EventReminderModule eventReminderModule = this.w;
                            ChannelResponse channelResponse = this.v;
                            byte bFirst = ArraysKt___ArraysKt.first(data);
                            if (bFirst == 11) {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                C0280a c0280a = new C0280a(eventReminderModule, channelResponse, null);
                                this.t = data;
                                this.u = 1;
                                if (BuildersKt.withContext(main, c0280a, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                Channel channel = (Channel) eventReminderModule.channels.get(Boxing.boxInt(bFirst));
                                if (channel != null) {
                                    this.t = data;
                                    this.u = 2;
                                    if (channel.send(channelResponse, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        }
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Exception e) {
                    t5t.d(EventReminderModule.TAG, "interceptor.onReceive error " + e.getMessage());
                }
                return Unit.INSTANCE;
            }
        }

        public k() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            EventReminderModule eventReminderModule = EventReminderModule.this;
            BuildersKt__Builders_commonKt.launch$default(eventReminderModule, null, null, new a(it, eventReminderModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class l extends Lambda implements Function0<CompletableJob> {
        public static final l t = new l();

        public l() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0, 1, 1}, l = {233, 242}, m = "modifyEvent", n = {"this", "hmReminderInfo", "this", "hmReminderInfo"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class m extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return EventReminderModule.this.modifyEvent(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$modifyEvent$response$1", f = "EventReminderModule.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(8));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$modifyEventAsync$1", f = "EventReminderModule.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<Object> u;
        public final /* synthetic */ EventReminderModule v;
        public final /* synthetic */ HMReminderInfo w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HMCallback<Object> hMCallback, EventReminderModule eventReminderModule, HMReminderInfo hMReminderInfo, Continuation<? super o> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = eventReminderModule;
            this.w = hMReminderInfo;
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
            return new o(this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.u.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.v;
                HMReminderInfo hMReminderInfo = this.w;
                this.t = 1;
                obj = eventReminderModule.modifyEvent(hMReminderInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 1}, l = {181, SportReportBaseParser.ReportType.avgDivingDepth}, m = "queryEventItems", n = {"this", "this"}, s = {"L$0", "L$0"})
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
            return EventReminderModule.this.queryEventItems(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryEventItems$response$1", f = "EventReminderModule.kt", i = {}, l = {SportReportBaseParser.ReportType.avgAscentRate}, m = "invokeSuspend", n = {}, s = {})
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
            return EventReminderModule.this.new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryEventItemsAsync$1", f = "EventReminderModule.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<ArrayList<HMReminderInfo>> u;
        public final /* synthetic */ EventReminderModule v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(HMCallback<ArrayList<HMReminderInfo>> hMCallback, EventReminderModule eventReminderModule, Continuation<? super r> continuation) {
            super(2, continuation);
            this.u = hMCallback;
            this.v = eventReminderModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new r(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.u.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.v;
                this.t = 1;
                obj = eventReminderModule.queryEventItems(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.u.sendOnDataMessage((ArrayList) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryEventItemsSync$1", f = "EventReminderModule.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<HMReminderInfo>>, Object> {
        public int t;

        public s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ArrayList<HMReminderInfo>> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new s(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventReminderModule eventReminderModule = EventReminderModule.this;
                this.t = 1;
                obj = eventReminderModule.queryEventItems(this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0}, l = {157, 162}, m = "queryVersion", n = {"this"}, s = {"L$0"})
    public static final class t extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return EventReminderModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryVersion$response$1", f = "EventReminderModule.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new u(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0}, l = {393}, m = "sendData", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class v extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return EventReminderModule.this.sendData((byte[]) null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventReminderModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(l.t);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = new ks(TAG, null, 2, null);
    }

    private final synchronized void cacheEventAdd(HMReminderInfo item) {
        List<HMReminderInfo> list = this.cacheEventItems;
        if (list != null) {
            list.add(item);
        }
    }

    private final synchronized void cacheEventAddALL(List<HMReminderInfo> items) {
        if (items == null) {
            return;
        }
        try {
            if (this.cacheEventItems == null) {
                this.cacheEventItems = new ArrayList();
            }
            List<HMReminderInfo> list = this.cacheEventItems;
            if (list != null) {
                list.clear();
            }
            List<HMReminderInfo> list2 = this.cacheEventItems;
            if (list2 != null) {
                list2.addAll(items);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    private final synchronized boolean cacheEventIsContain(HMReminderInfo item) {
        boolean z;
        Object next;
        try {
            List<HMReminderInfo> list = this.cacheEventItems;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    HMReminderInfo hMReminderInfo = (HMReminderInfo) next;
                    if (item.getId() == hMReminderInfo.getId() && item.getFrom() == hMReminderInfo.getFrom()) {
                        break;
                    }
                }
                if (((HMReminderInfo) next) != null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    private final synchronized void cacheEventRemove(HMReminderInfo item) {
        Object next;
        try {
            List<HMReminderInfo> list = this.cacheEventItems;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    HMReminderInfo hMReminderInfo = (HMReminderInfo) next;
                    if (hMReminderInfo.getId() == item.getId() && hMReminderInfo.getFrom() == item.getFrom()) {
                        break;
                    }
                }
                HMReminderInfo hMReminderInfo2 = (HMReminderInfo) next;
                if (hMReminderInfo2 != null) {
                    List<HMReminderInfo> list2 = this.cacheEventItems;
                    if (list2 != null) {
                        list2.remove(hMReminderInfo2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void cacheEventSet(HMReminderInfo item) {
        try {
            List<HMReminderInfo> list = this.cacheEventItems;
            if (list != null) {
                Iterator<HMReminderInfo> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    HMReminderInfo next = it.next();
                    if (next.getId() == item.getId() && next.getFrom() == item.getFrom()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                List<HMReminderInfo> list2 = this.cacheEventItems;
                if (list2 != null) {
                    list2.set(i2, item);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ff -> B:43:0x0102). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object dispatchAmbiguousOperation(com.xiaomi.hm.health.bt.model.HMReminderInfo[] r12, kotlin.coroutines.Continuation<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule.dispatchAmbiguousOperation(com.xiaomi.hm.health.bt.model.HMReminderInfo[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final byte[] eventToBytes(HMReminderInfo hmReminderInfo) throws IOException {
        Calendar stopTime;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write((hmReminderInfo.getFrom() >> 6) | hmReminderInfo.getId());
        byteArrayOutputStream.write(tet.p(hmReminderInfo.getFlag()));
        Calendar startTime = hmReminderInfo.getStartTime();
        if (startTime != null) {
            byteArrayOutputStream.write(tet.r(startTime.getTime().getTime() / ((long) 1000), 4));
        }
        String str = null;
        HMReminderInfo hMReminderInfo = (hmReminderInfo.getFlag() & 4) != 0 ? hmReminderInfo : null;
        if (hMReminderInfo != null && (stopTime = hMReminderInfo.getStopTime()) != null) {
            byteArrayOutputStream.write(tet.r(stopTime.getTime().getTime() / ((long) 1000), 4));
        }
        HMReminderInfo hMReminderInfo2 = (hmReminderInfo.getFlag() & 16) != 0 ? hmReminderInfo : null;
        if (hMReminderInfo2 != null) {
            int iconId = hMReminderInfo2.getIconId();
            Integer numValueOf = Integer.valueOf(iconId);
            if (iconId < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                byteArrayOutputStream.write(numValueOf.intValue());
            }
        }
        boolean z = (hmReminderInfo.getFlag() & 8) != 0;
        String remindTitle = hmReminderInfo.getRemindTitle();
        if (!z || remindTitle == null || StringsKt__StringsKt.isBlank(remindTitle)) {
            remindTitle = null;
        }
        if (remindTitle != null) {
            byte[] bytes = remindTitle.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes);
        }
        byteArrayOutputStream.write(0);
        String remindBody = hmReminderInfo.getRemindBody();
        if (z && remindBody != null && !StringsKt__StringsKt.isBlank(remindBody)) {
            str = remindBody;
        }
        if (str != null) {
            byte[] bytes2 = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(bytes2);
        }
        byteArrayOutputStream.write(0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        return byteArray;
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final boolean isOnceEnded(HMReminderInfo item) {
        boolean z = (item.getFlag() & 4064) == 0;
        Calendar startTime = item.getStartTime();
        return z && (startTime != null && Calendar.getInstance().after(startTime));
    }

    private final ArrayList<HMReminderInfo> parseEventItems(byte[] data) {
        try {
            ArrayList<HMReminderInfo> arrayList = new ArrayList<>();
            ByteBuffer buffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
            buffer.position(2);
            for (int iD = tet.d(data, 0, 2); iD > 0; iD--) {
                HMReminderInfo hMReminderInfo = new HMReminderInfo();
                byte b2 = buffer.get();
                hMReminderInfo.setId((byte) (b2 & 63));
                hMReminderInfo.setFrom((b2 << 6) & 3);
                hMReminderInfo.setFlag(buffer.getInt());
                boolean z = true;
                hMReminderInfo.setEnable((hMReminderInfo.getFlag() & 1) != 0);
                hMReminderInfo.setDelete(hMReminderInfo.getFlag() == 0);
                if ((hMReminderInfo.getFlag() & 2) == 0) {
                    z = false;
                }
                hMReminderInfo.setRepeat(z);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(((long) buffer.getInt()) * 1000));
                hMReminderInfo.setStartTime(calendar);
                if ((hMReminderInfo.getFlag() & 4) != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(new Date(((long) buffer.getInt()) * 1000));
                    hMReminderInfo.setStopTime(calendar2);
                }
                if ((hMReminderInfo.getFlag() & 16) != 0) {
                    hMReminderInfo.setIconId(buffer.get());
                }
                if ((hMReminderInfo.getFlag() & 8) != 0) {
                    Intrinsics.checkNotNullExpressionValue(buffer, "buffer");
                    hMReminderInfo.setRemindTitle(z2.q(buffer));
                    if (buffer.position() < buffer.limit()) {
                        hMReminderInfo.setRemindBody(z2.q(buffer));
                    }
                }
                arrayList.add(hMReminderInfo);
            }
            return arrayList;
        } catch (Exception e2) {
            t5t.d(TAG, "parseEventItems error:" + e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendData(byte[] bArr, Continuation<? super Boolean> continuation) {
        v vVar;
        EventReminderModule eventReminderModule;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i2 = vVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.x = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        v vVar2 = vVar;
        Object objSendDataWithResult$default = vVar2.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = vVar2.x;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            try {
                this.innerInterceptor.b(bArr);
            } catch (Exception e2) {
                t5t.d(TAG, "interceptor.onSend error " + e2.getMessage());
            }
            vVar2.t = this;
            vVar2.u = bArr;
            vVar2.x = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, bArr, 0, false, vVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            eventReminderModule = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) vVar2.u;
            eventReminderModule = (EventReminderModule) vVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        try {
            eventReminderModule.innerInterceptor.a(bArr, zBooleanValue);
        } catch (Exception e3) {
            t5t.d(TAG, "interceptor.onFinishSend error " + e3.getMessage());
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object addEvent(@NotNull HMReminderInfo hMReminderInfo, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
        boolean z;
        boolean z2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.x = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objSendData = bVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = bVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                hMReminderInfo = (HMReminderInfo) bVar.u;
                eventReminderModule = (EventReminderModule) bVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMReminderInfo = (HMReminderInfo) bVar.u;
                eventReminderModule2 = (EventReminderModule) bVar.t;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "add event response: " + channelResponse);
            if (channelResponse == null) {
                if (channelResponse.getData()[0] == 6 || channelResponse.getData()[1] != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    eventReminderModule2.cacheEventAdd(hMReminderInfo);
                }
                z = z2;
            }
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "start add event");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(6)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{5}, eventToBytes(hMReminderInfo));
        bVar.t = this;
        bVar.u = hMReminderInfo;
        bVar.x = 1;
        objSendData = sendData(bArrPlus, bVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write add event cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        c cVar = eventReminderModule.new c(null);
        bVar.t = eventReminderModule;
        bVar.u = hMReminderInfo;
        bVar.x = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, cVar, bVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "add event response: " + channelResponse);
        if (channelResponse == null) {
            if (channelResponse.getData()[0] == 6) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                eventReminderModule2.cacheEventAdd(hMReminderInfo);
            }
            if (z2) {
            }
        }
        return Boxing.boxBoolean(z);
    }

    public final void addEventAsync(@NotNull HMReminderInfo[] item, @NotNull HMCallback<Object> callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(callback, item, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object deleteEvent(@NotNull HMReminderInfo hMReminderInfo, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
        boolean z;
        boolean z2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.x = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objSendData = eVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = eVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                hMReminderInfo = (HMReminderInfo) eVar.u;
                eventReminderModule = (EventReminderModule) eVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMReminderInfo = (HMReminderInfo) eVar.u;
                eventReminderModule2 = (EventReminderModule) eVar.t;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "delete event response: " + channelResponse);
            if (channelResponse == null) {
                if (channelResponse.getData()[0] == 10 || channelResponse.getData()[1] != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    eventReminderModule2.cacheEventRemove(hMReminderInfo);
                }
                z = z2;
            }
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "start delete event");
        if (isOnceEnded(hMReminderInfo)) {
            t5t.d(TAG, "once event expired");
            return Boxing.boxBoolean(true);
        }
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(10)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{9}, (byte) ((hMReminderInfo.getFrom() >> 6) | hMReminderInfo.getId()));
        eVar.t = this;
        eVar.u = hMReminderInfo;
        eVar.x = 1;
        objSendData = sendData(bArrPlus, eVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write delete event cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        f fVar = eventReminderModule.new f(null);
        eVar.t = eventReminderModule;
        eVar.u = hMReminderInfo;
        eVar.x = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, fVar, eVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "delete event response: " + channelResponse);
        if (channelResponse == null) {
            if (channelResponse.getData()[0] == 10) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                eventReminderModule2.cacheEventRemove(hMReminderInfo);
            }
            if (z2) {
            }
        }
        return Boxing.boxBoolean(z);
    }

    public final void deleteEventAsync(@NotNull HMReminderInfo item, @NotNull HMCallback<Object> callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new g(callback, this, item, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 56;
    }

    public final void handleAmbiguousOperationsAsync(@NotNull HMReminderInfo[] item, @NotNull HMCallback<Object> callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new i(callback, this, item, null), 3, null);
    }

    public final boolean handleAmbiguousOperationsSync(@NotNull HMReminderInfo... item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new j(item, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new k(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object modifyEvent(@NotNull HMReminderInfo hMReminderInfo, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
        boolean z;
        boolean z2;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.x = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objSendData = mVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = mVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                hMReminderInfo = (HMReminderInfo) mVar.u;
                eventReminderModule = (EventReminderModule) mVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMReminderInfo = (HMReminderInfo) mVar.u;
                eventReminderModule2 = (EventReminderModule) mVar.t;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "modify event response: " + channelResponse);
            if (channelResponse == null) {
                if (channelResponse.getData()[0] == 8 || channelResponse.getData()[1] != 1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    eventReminderModule2.cacheEventSet(hMReminderInfo);
                }
                z = z2;
            }
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "start modify event");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(8)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{7}, eventToBytes(hMReminderInfo));
        mVar.t = this;
        mVar.u = hMReminderInfo;
        mVar.x = 1;
        objSendData = sendData(bArrPlus, mVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write modify event cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        n nVar = eventReminderModule.new n(null);
        mVar.t = eventReminderModule;
        mVar.u = hMReminderInfo;
        mVar.x = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, nVar, mVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "modify event response: " + channelResponse);
        if (channelResponse == null) {
            if (channelResponse.getData()[0] == 8) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                eventReminderModule2.cacheEventSet(hMReminderInfo);
            }
            if (z2) {
            }
        }
        return Boxing.boxBoolean(z);
    }

    public final void modifyEventAsync(@NotNull HMReminderInfo item, @NotNull HMCallback<Object> callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new o(callback, this, item, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object queryEventItems(@NotNull Continuation<? super ArrayList<HMReminderInfo>> continuation) {
        p pVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
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
        Object objSendData = pVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                eventReminderModule = (EventReminderModule) pVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventReminderModule2 = (EventReminderModule) pVar.t;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "query event items response: " + channelResponse);
            if (channelResponse != null) {
                return null;
            }
            if (channelResponse.getData()[0] != 4) {
                channelResponse = null;
            }
            if (channelResponse != null) {
                return null;
            }
            byte[] data = channelResponse.getData();
            ArrayList<HMReminderInfo> eventItems = eventReminderModule2.parseEventItems(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(data, new IntRange(1, data.length - 1))));
            eventReminderModule2.cacheEventAddALL(eventItems != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) eventItems) : null);
            return eventItems;
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "start query event items");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(4)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        pVar.t = this;
        pVar.w = 1;
        objSendData = sendData(new byte[]{3}, pVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write query event items cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        q qVar = eventReminderModule.new q(null);
        pVar.t = eventReminderModule;
        pVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, qVar, pVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "query event items response: " + channelResponse);
        if (channelResponse != null) {
            return null;
        }
        if (channelResponse.getData()[0] != 4) {
            channelResponse = null;
        }
        if (channelResponse != null) {
            return null;
        }
        byte[] data2 = channelResponse.getData();
        ArrayList<HMReminderInfo> eventItems2 = eventReminderModule2.parseEventItems(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(data2, new IntRange(1, data2.length - 1))));
        eventReminderModule2.cacheEventAddALL(eventItems2 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) eventItems2) : null);
        return eventItems2;
    }

    public final void queryEventItemsAsync(@NotNull HMCallback<ArrayList<HMReminderInfo>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new r(callback, this, null), 3, null);
    }

    @Nullable
    public final ArrayList<HMReminderInfo> queryEventItemsSync() {
        return (ArrayList) BuildersKt__BuildersKt.runBlocking$default(null, new s(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super EventReminderVersion> continuation) {
        t tVar;
        EventReminderModule eventReminderModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i2 = tVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.w = i2 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object objSendData = tVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = tVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                eventReminderModule = (EventReminderModule) tVar.t;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            t5t.d(TAG, "query version response: " + channelResponse);
            if (channelResponse == null) {
                return null;
            }
            data = channelResponse.getData();
            if (data[0] == 2 || data.length != 4) {
                data = null;
            }
            if (data != null) {
                return new EventReminderVersion(data[1], tet.d(data, 2, 2));
            }
            return null;
        }
        ResultKt.throwOnFailure(objSendData);
        t5t.d(TAG, "start query version");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!(!map.containsKey(Boxing.boxInt(2)))) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        }
        tVar.t = this;
        tVar.w = 1;
        objSendData = sendData(new byte[]{1}, tVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        t5t.d(TAG, "write query version cmd result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        u uVar = eventReminderModule.new u(null);
        tVar.t = null;
        tVar.w = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, uVar, tVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        t5t.d(TAG, "query version response: " + channelResponse);
        if (channelResponse == null) {
            return null;
        }
        data = channelResponse.getData();
        if (data[0] == 2) {
            data = null;
        } else {
            data = null;
        }
        if (data != null) {
            return new EventReminderVersion(data[1], tet.d(data, 2, 2));
        }
        return null;
    }

    public final void registerInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.a(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unregisterInterceptor(@NotNull jh interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.b(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }
}
