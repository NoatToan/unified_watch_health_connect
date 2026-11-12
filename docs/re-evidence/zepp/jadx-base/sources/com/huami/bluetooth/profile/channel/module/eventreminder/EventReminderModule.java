package com.huami.bluetooth.profile.channel.module.eventreminder;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.IDataInterceptor;
import com.huami.bluetooth.profile.channel.module.schedule.action.SimpleParseInterceptor;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.widget.wheelview.Constant;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xmlywind.sdk.common.mta.PointCategory;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.ByteArrayOutputStream;
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

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 56)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u000f\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ'\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0016J$\u0010\u001f\u001a\u00020\u00152\u001c\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f0\u001dJ\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\fJ/\u0010\"\u001a\u00020\u00152\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001d¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u00152\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001d¢\u0006\u0004\b&\u0010#J\u001c\u0010'\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u001c\u0010(\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u0015\u0010*\u001a\u0004\u0018\u00010)H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010+J\u001b\u0010-\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u0010.J\u001b\u00100\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b0\u0010.J\u000e\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201J\u000e\u00104\u001a\u00020\u00152\u0006\u00102\u001a\u000201R\u001d\u00109\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\b7\u00108R(\u0010?\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<0:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010CR\u0016\u0010H\u001a\u00020E8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020;8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/eventreminder/EventReminderModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "item", "", "h", "([Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "l", "hmReminderInfo", "i", "byteArray", "sendData", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "items", "", GoogleApiAvailabilityLight.a, "g", "c", "f", "e", hl.k, PointCategory.INIT, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "callback", "queryEventItemsAsync", "queryEventItemsSync", "Ljava/lang/Object;", "handleAmbiguousOperationsAsync", "([Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "handleAmbiguousOperationsSync", "([Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;)Z", "addEventAsync", "deleteEventAsync", "modifyEventAsync", "Lcom/huami/bluetooth/profile/channel/module/eventreminder/EventReminderVersion;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryEventItems", "addEvent", "(Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyEvent", "deleteEvent", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/IDataInterceptor;", "interceptor", "registerInterceptor", "unregisterInterceptor", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", z.j, "()Lkotlinx/coroutines/Job;", "job", "", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "Ljava/util/Map;", "channels", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/SimpleParseInterceptor;", "innerInterceptor", "Ljava/util/List;", "cacheEventItems", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EventReminderModule extends BaseModule implements CoroutineScope {
    public static final int EVENT_REMINDER = 56;
    public static final int TYPE_NOTIFY_EVENT_CHANGE = 11;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private static final int o = 5;
    private static final int p = 6;
    private static final int q = 7;
    private static final int r = 8;
    private static final int s = 9;
    private static final int t = 10;
    private static final int u = 1;

    @NotNull
    private static final String v = "EventReminderModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final SimpleParseInterceptor innerInterceptor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private List<HMReminderInfo> cacheEventItems;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {}, l = {204, 213}, m = "addEvent", n = {}, s = {})
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
            return EventReminderModule.this.addEvent(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$addEvent$response$1", f = "EventReminderModule.kt", i = {}, l = {FTPCodes.HELP_MESSAGE}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(6));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$addEventAsync$1", f = "EventReminderModule.kt", i = {0}, l = {130}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public int f;
        public int g;
        public final /* synthetic */ HMCallback<Object> h;
        public final /* synthetic */ HMReminderInfo[] i;
        public final /* synthetic */ EventReminderModule j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMCallback<Object> hMCallback, HMReminderInfo[] hMReminderInfoArr, EventReminderModule eventReminderModule, Continuation<? super c> continuation) {
            super(2, continuation);
            this.h = hMCallback;
            this.i = hMReminderInfoArr;
            this.j = eventReminderModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.h, this.i, this.j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004f  */
        /* JADX WARN: Code duplicated, block: B:12:0x0065 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:13:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:14:0x006f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.g
                r2 = 1
                if (r1 == 0) goto L32
                if (r1 != r2) goto L2a
                int r1 = r11.f
                int r3 = r11.e
                java.lang.Object r4 = r11.d
                kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref.BooleanRef) r4
                java.lang.Object r5 = r11.c
                com.xiaomi.hm.health.bt.model.HMReminderInfo[] r5 = (com.xiaomi.hm.health.bt.model.HMReminderInfo[]) r5
                java.lang.Object r6 = r11.b
                com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule r6 = (com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule) r6
                java.lang.Object r7 = r11.a
                kotlin.jvm.internal.Ref$BooleanRef r7 = (kotlin.jvm.internal.Ref.BooleanRef) r7
                kotlin.ResultKt.throwOnFailure(r12)
                r8 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L6f
            L2a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L32:
                kotlin.ResultKt.throwOnFailure(r12)
                com.xiaomi.hm.health.bt.device.HMCallback<java.lang.Object> r12 = r11.h
                r12.sendOnStartMessage()
                kotlin.jvm.internal.Ref$BooleanRef r12 = new kotlin.jvm.internal.Ref$BooleanRef
                r12.<init>()
                r12.element = r2
                com.xiaomi.hm.health.bt.model.HMReminderInfo[] r1 = r11.i
                com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule r3 = r11.j
                int r4 = r1.length
                r5 = 0
                r5 = r1
                r6 = r3
                r3 = r4
                r1 = 0
                r4 = r12
                r12 = r11
            L4d:
                if (r1 >= r3) goto L85
                r7 = r5[r1]
                r12.a = r4
                r12.b = r6
                r12.c = r5
                r12.d = r4
                r12.e = r3
                r12.f = r1
                r12.g = r2
                java.lang.Object r7 = r6.addEvent(r7, r12)
                if (r7 != r0) goto L66
                return r0
            L66:
                r8 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                r12 = r7
                r7 = r5
            L6f:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                boolean r9 = r7.element
                r12 = r12 & r9
                r5.element = r12
                int r12 = r3 + 1
                r3 = r4
                r5 = r6
                r4 = r7
                r6 = r8
                r10 = r1
                r1 = r12
                r12 = r0
                r0 = r10
                goto L4d
            L85:
                com.xiaomi.hm.health.bt.device.HMCallback<java.lang.Object> r12 = r12.h
                boolean r0 = r4.element
                r12.sendOnFinishMessage(r0)
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {}, l = {266, 275}, m = "deleteEvent", n = {}, s = {})
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
            return EventReminderModule.this.deleteEvent(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$deleteEvent$response$1", f = "EventReminderModule.kt", i = {}, l = {276}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new e(continuation);
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
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(10));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$deleteEventAsync$1", f = "EventReminderModule.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<Object> b;
        public final /* synthetic */ EventReminderModule c;
        public final /* synthetic */ HMReminderInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HMCallback<Object> hMCallback, EventReminderModule eventReminderModule, HMReminderInfo hMReminderInfo, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = eventReminderModule;
            this.d = hMReminderInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.c;
                HMReminderInfo hMReminderInfo = this.d;
                this.a = 1;
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
            this.b.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3}, l = {106, 111, 114, 117}, m = "dispatchAmbiguousOperation", n = {"this", "item", "result", "this", "result", "this", "result", "this", "result"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public int e;
        public /* synthetic */ Object f;
        public int h;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return EventReminderModule.this.h(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$handleAmbiguousOperationsAsync$1", f = "EventReminderModule.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<Object> b;
        public final /* synthetic */ EventReminderModule c;
        public final /* synthetic */ HMReminderInfo[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HMCallback<Object> hMCallback, EventReminderModule eventReminderModule, HMReminderInfo[] hMReminderInfoArr, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = eventReminderModule;
            this.d = hMReminderInfoArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, this.c, this.d, continuation);
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
                this.b.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.c;
                HMReminderInfo[] hMReminderInfoArr = this.d;
                HMReminderInfo[] hMReminderInfoArr2 = (HMReminderInfo[]) Arrays.copyOf(hMReminderInfoArr, hMReminderInfoArr.length);
                this.a = 1;
                obj = eventReminderModule.h(hMReminderInfoArr2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.b.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$handleAmbiguousOperationsSync$1", f = "EventReminderModule.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ HMReminderInfo[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HMReminderInfo[] hMReminderInfoArr, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = hMReminderInfoArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new i(this.c, continuation);
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
                EventReminderModule eventReminderModule = EventReminderModule.this;
                HMReminderInfo[] hMReminderInfoArr = this.c;
                HMReminderInfo[] hMReminderInfoArr2 = (HMReminderInfo[]) Arrays.copyOf(hMReminderInfoArr, hMReminderInfoArr.length);
                this.a = 1;
                obj = eventReminderModule.h(hMReminderInfoArr2, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$init$1$1", f = "EventReminderModule.kt", i = {}, l = {57, 65}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ ChannelResponse c;
            public final /* synthetic */ EventReminderModule d;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$j$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$init$1$1$2$1", f = "EventReminderModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0328a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ EventReminderModule b;
                public final /* synthetic */ ChannelResponse c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0328a(EventReminderModule eventReminderModule, ChannelResponse channelResponse, Continuation<? super C0328a> continuation) {
                    super(2, continuation);
                    this.b = eventReminderModule;
                    this.c = channelResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0328a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0328a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.b.innerInterceptor.onReceive(this.c.getData());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, EventReminderModule eventReminderModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = channelResponse;
                this.d = eventReminderModule;
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

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        byte[] data = this.c.getData();
                        if (!Boxing.boxBoolean(!(data.length == 0)).booleanValue()) {
                            data = null;
                        }
                        if (data != null) {
                            EventReminderModule eventReminderModule = this.d;
                            ChannelResponse channelResponse = this.c;
                            byte bFirst = ArraysKt___ArraysKt.first(data);
                            if (bFirst == 11) {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                C0328a c0328a = new C0328a(eventReminderModule, channelResponse, null);
                                this.a = data;
                                this.b = 1;
                                if (BuildersKt.withContext(main, c0328a, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                Channel channel = (Channel) eventReminderModule.channels.get(Boxing.boxInt(bFirst));
                                if (channel != null) {
                                    this.a = data;
                                    this.b = 2;
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
                    Debug.fi(EventReminderModule.v, Intrinsics.stringPlus("interceptor.onReceive error ", e.getMessage()));
                }
                return Unit.INSTANCE;
            }
        }

        public j() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            EventReminderModule eventReminderModule = EventReminderModule.this;
            kotlinx.coroutines.e.f(eventReminderModule, null, null, new a(channelResponse, eventReminderModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Job> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {}, l = {233, 242}, m = "modifyEvent", n = {}, s = {})
    public static final class l extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return EventReminderModule.this.modifyEvent(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$modifyEvent$response$1", f = "EventReminderModule.kt", i = {}, l = {Constant.HEIGHT_MAX}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(8));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$modifyEventAsync$1", f = "EventReminderModule.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<Object> b;
        public final /* synthetic */ EventReminderModule c;
        public final /* synthetic */ HMReminderInfo d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HMCallback<Object> hMCallback, EventReminderModule eventReminderModule, HMReminderInfo hMReminderInfo, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = eventReminderModule;
            this.d = hMReminderInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.b, this.c, this.d, continuation);
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
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.c;
                HMReminderInfo hMReminderInfo = this.d;
                this.a = 1;
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
            this.b.sendOnFinishMessage(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DOWNHILL, DataTypeSource.SPORT_TYPE_DISCO}, m = "queryEventItems", n = {}, s = {})
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
            return EventReminderModule.this.queryEventItems(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryEventItems$response$1", f = "EventReminderModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_TAP_DANCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new p(continuation);
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
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryEventItemsAsync$1", f = "EventReminderModule.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<ArrayList<HMReminderInfo>> b;
        public final /* synthetic */ EventReminderModule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(HMCallback<ArrayList<HMReminderInfo>> hMCallback, EventReminderModule eventReminderModule, Continuation<? super q> continuation) {
            super(2, continuation);
            this.b = hMCallback;
            this.c = eventReminderModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.sendOnStartMessage();
                EventReminderModule eventReminderModule = this.c;
                this.a = 1;
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
            this.b.sendOnDataMessage((ArrayList) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryEventItemsSync$1", f = "EventReminderModule.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<HMReminderInfo>>, Object> {
        public int a;

        public r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ArrayList<HMReminderInfo>> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventReminderModule eventReminderModule = EventReminderModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {}, l = {157, 162}, m = "queryVersion", n = {}, s = {})
    public static final class s extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return EventReminderModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule$queryVersion$response$1", f = "EventReminderModule.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventReminderModule.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) EventReminderModule.this.channels.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule", f = "EventReminderModule.kt", i = {0, 0}, l = {393}, m = "sendData", n = {"this", "byteArray"}, s = {"L$0", "L$1"})
    public static final class u extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return EventReminderModule.this.sendData((byte[]) null, this);
        }
    }

    public EventReminderModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(k.a);
        this.channels = new LinkedHashMap();
        this.innerInterceptor = new SimpleParseInterceptor(v, null, 2, null);
    }

    private final synchronized void c(HMReminderInfo item) {
        List<HMReminderInfo> list = this.cacheEventItems;
        if (list != null) {
            list.add(item);
        }
    }

    private final synchronized void d(List<HMReminderInfo> items) {
        if (items == null) {
            return;
        }
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
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0007  */
    private final synchronized boolean e(HMReminderInfo item) {
        Object next;
        HMReminderInfo hMReminderInfo;
        boolean z;
        List<HMReminderInfo> list = this.cacheEventItems;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                hMReminderInfo = (HMReminderInfo) next;
            } while (!(item.getId() == hMReminderInfo.getId() && item.getFrom() == hMReminderInfo.getFrom()));
            z = ((HMReminderInfo) next) != null;
        }
        return z;
    }

    private final synchronized void f(HMReminderInfo item) {
        List<HMReminderInfo> list = this.cacheEventItems;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                HMReminderInfo hMReminderInfo = (HMReminderInfo) obj2;
                if (hMReminderInfo.getId() == item.getId() && hMReminderInfo.getFrom() == item.getFrom()) {
                    obj = obj2;
                    break;
                }
            }
            obj = (HMReminderInfo) obj;
        }
        if (obj == null) {
            return;
        }
        List<HMReminderInfo> list2 = this.cacheEventItems;
        if (list2 != null) {
            list2.remove(obj);
        }
    }

    private final synchronized void g(HMReminderInfo item) {
        Integer numValueOf;
        List<HMReminderInfo> list = this.cacheEventItems;
        if (list == null) {
            numValueOf = null;
        } else {
            Iterator<HMReminderInfo> it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                HMReminderInfo next = it2.next();
                if (next.getId() == item.getId() && next.getFrom() == item.getFrom()) {
                    break;
                } else {
                    i2++;
                }
            }
            numValueOf = Integer.valueOf(i2);
        }
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        List<HMReminderInfo> list2 = this.cacheEventItems;
        if (list2 != null) {
            list2.set(iIntValue, item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:43:0x0101). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(com.xiaomi.hm.health.bt.model.HMReminderInfo[] r12, kotlin.coroutines.Continuation<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule.h(com.xiaomi.hm.health.bt.model.HMReminderInfo[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    private final byte[] i(HMReminderInfo hmReminderInfo) {
        boolean z;
        boolean z2;
        Calendar stopTime;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write((hmReminderInfo.getFrom() >> 6) | hmReminderInfo.getId());
        byteArrayOutputStream.write(GattUtils.intToBytes(hmReminderInfo.getFlag()));
        Calendar startTime = hmReminderInfo.getStartTime();
        if (startTime != null) {
            byteArrayOutputStream.write(GattUtils.numberToBytes(startTime.getTime().getTime() / ((long) 1000), 4));
        }
        HMReminderInfo hMReminderInfo = (hmReminderInfo.getFlag() & 4) != 0 ? hmReminderInfo : null;
        if (hMReminderInfo != null && (stopTime = hMReminderInfo.getStopTime()) != null) {
            byteArrayOutputStream.write(GattUtils.numberToBytes(stopTime.getTime().getTime() / ((long) 1000), 4));
        }
        HMReminderInfo hMReminderInfo2 = (hmReminderInfo.getFlag() & 16) != 0 ? hmReminderInfo : null;
        if (hMReminderInfo2 != null) {
            Integer numValueOf = Integer.valueOf(hMReminderInfo2.getIconId());
            if (!(numValueOf.intValue() >= 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                byteArrayOutputStream.write(numValueOf.intValue());
            }
        }
        boolean z3 = (hmReminderInfo.getFlag() & 8) != 0;
        String remindTitle = hmReminderInfo.getRemindTitle();
        if (z3) {
            if (remindTitle == null || kotlin.text.m.isBlank(remindTitle)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (!z) {
            remindTitle = null;
        }
        if (remindTitle != null) {
            byteArrayOutputStream.write(remindTitle.getBytes(Charsets.UTF_8));
        }
        byteArrayOutputStream.write(0);
        String remindBody = hmReminderInfo.getRemindBody();
        if (z3) {
            z2 = remindBody == null || kotlin.text.m.isBlank(remindBody) ? false : true;
        }
        String str = z2 ? remindBody : null;
        if (str != null) {
            byteArrayOutputStream.write(str.getBytes(Charsets.UTF_8));
        }
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }

    private final Job j() {
        return (Job) this.job.getValue();
    }

    private final boolean k(HMReminderInfo item) {
        boolean z = (item.getFlag() & 4064) == 0;
        Calendar startTime = item.getStartTime();
        return z && (startTime != null && Calendar.getInstance().after(startTime));
    }

    private final ArrayList<HMReminderInfo> l(byte[] data) {
        try {
            ArrayList<HMReminderInfo> arrayList = new ArrayList<>();
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(2);
            for (int iBytesToInt = GattUtils.bytesToInt(data, 0, 2); iBytesToInt > 0; iBytesToInt--) {
                HMReminderInfo hMReminderInfo = new HMReminderInfo();
                byte b2 = byteBufferOrder.get();
                hMReminderInfo.setId((byte) (b2 & HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY));
                hMReminderInfo.setFrom((b2 << 6) & 3);
                hMReminderInfo.setFlag(byteBufferOrder.getInt());
                boolean z = true;
                hMReminderInfo.setEnable((hMReminderInfo.getFlag() & 1) != 0);
                hMReminderInfo.setDelete(hMReminderInfo.getFlag() == 0);
                if ((hMReminderInfo.getFlag() & 2) == 0) {
                    z = false;
                }
                hMReminderInfo.setRepeat(z);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(((long) byteBufferOrder.getInt()) * 1000));
                Unit unit = Unit.INSTANCE;
                hMReminderInfo.setStartTime(calendar);
                if ((hMReminderInfo.getFlag() & 4) != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(new Date(((long) byteBufferOrder.getInt()) * 1000));
                    hMReminderInfo.setStopTime(calendar2);
                }
                if ((hMReminderInfo.getFlag() & 16) != 0) {
                    hMReminderInfo.setIconId((byte) (byteBufferOrder.get() & (-1)));
                }
                if ((hMReminderInfo.getFlag() & 8) != 0) {
                    hMReminderInfo.setRemindTitle(ByteBufferExtendsKt.getString(byteBufferOrder));
                    if (byteBufferOrder.position() < byteBufferOrder.limit()) {
                        hMReminderInfo.setRemindBody(ByteBufferExtendsKt.getString(byteBufferOrder));
                    }
                }
                arrayList.add(hMReminderInfo);
            }
            return arrayList;
        } catch (Exception e2) {
            Debug.fi(v, Intrinsics.stringPlus("parseEventItems error:", e2));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendData(byte[] bArr, Continuation<? super Boolean> continuation) {
        u uVar;
        EventReminderModule eventReminderModule;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i2 = uVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.e = i2 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        } else {
            uVar = new u(continuation);
        }
        u uVar2 = uVar;
        Object objSendDataWithResult$default = uVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = uVar2.e;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            try {
                this.innerInterceptor.onSend(bArr);
            } catch (Exception e2) {
                Debug.fi(v, Intrinsics.stringPlus("interceptor.onSend error ", e2.getMessage()));
            }
            uVar2.a = this;
            uVar2.b = bArr;
            uVar2.e = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, uVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            eventReminderModule = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) uVar2.b;
            eventReminderModule = (EventReminderModule) uVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        try {
            SimpleParseInterceptor simpleParseInterceptor = eventReminderModule.innerInterceptor;
            if (!zBooleanValue) {
                z = false;
            }
            simpleParseInterceptor.onFinishSend(bArr, z);
        } catch (Exception e3) {
            Debug.fi(v, Intrinsics.stringPlus("interceptor.onFinishSend error ", e3.getMessage()));
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object addEvent(@NotNull HMReminderInfo hMReminderInfo, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
        Boolean boolBoxBoolean;
        boolean zBooleanValue;
        Boolean boolBoxBoolean2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objSendData = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.e;
        boolean zBooleanValue2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                hMReminderInfo = (HMReminderInfo) aVar.b;
                eventReminderModule = (EventReminderModule) aVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMReminderInfo = (HMReminderInfo) aVar.b;
                eventReminderModule2 = (EventReminderModule) aVar.a;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(v, Intrinsics.stringPlus("add event response: ", channelResponse));
            if (channelResponse != null) {
                boolBoxBoolean = Boxing.boxBoolean(channelResponse.getData()[0] != 6 && channelResponse.getData()[1] == 1);
                if (boolBoxBoolean != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                    if (zBooleanValue) {
                        eventReminderModule2.c(hMReminderInfo);
                    }
                    boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                    if (boolBoxBoolean2 != null) {
                        zBooleanValue2 = boolBoxBoolean2.booleanValue();
                    }
                }
            }
            return Boxing.boxBoolean(zBooleanValue2);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(v, "start add event");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(6))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{5}, i(hMReminderInfo));
        aVar.a = this;
        aVar.b = hMReminderInfo;
        aVar.e = 1;
        objSendData = sendData(bArrPlus, aVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue3 = ((Boolean) objSendData).booleanValue();
        Debug.fi(v, Intrinsics.stringPlus("write add event cmd result: ", Boxing.boxBoolean(zBooleanValue3)));
        if (!zBooleanValue3) {
            return Boxing.boxBoolean(false);
        }
        b bVar = eventReminderModule.new b(null);
        aVar.a = eventReminderModule;
        aVar.b = hMReminderInfo;
        aVar.e = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, bVar, aVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(v, Intrinsics.stringPlus("add event response: ", channelResponse));
        if (channelResponse != null) {
            boolBoxBoolean = Boxing.boxBoolean(channelResponse.getData()[0] != 6 && channelResponse.getData()[1] == 1);
            if (boolBoxBoolean != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
                if (zBooleanValue) {
                    eventReminderModule2.c(hMReminderInfo);
                }
                boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                if (boolBoxBoolean2 != null) {
                    zBooleanValue2 = boolBoxBoolean2.booleanValue();
                }
            }
        }
        return Boxing.boxBoolean(zBooleanValue2);
    }

    public final void addEventAsync(@NotNull HMReminderInfo[] item, @NotNull HMCallback<Object> callback) {
        kotlinx.coroutines.e.f(this, null, null, new c(callback, item, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteEvent(@NotNull HMReminderInfo hMReminderInfo, @NotNull Continuation<? super Boolean> continuation) {
        d dVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
        Boolean boolBoxBoolean;
        boolean zBooleanValue;
        Boolean boolBoxBoolean2;
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
        Object objSendData = dVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.e;
        boolean zBooleanValue2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                hMReminderInfo = (HMReminderInfo) dVar.b;
                eventReminderModule = (EventReminderModule) dVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMReminderInfo = (HMReminderInfo) dVar.b;
                eventReminderModule2 = (EventReminderModule) dVar.a;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(v, Intrinsics.stringPlus("delete event response: ", channelResponse));
            if (channelResponse != null) {
                boolBoxBoolean = Boxing.boxBoolean(channelResponse.getData()[0] != 10 && channelResponse.getData()[1] == 1);
                if (boolBoxBoolean != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                    if (zBooleanValue) {
                        eventReminderModule2.f(hMReminderInfo);
                    }
                    boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                    if (boolBoxBoolean2 != null) {
                        zBooleanValue2 = boolBoxBoolean2.booleanValue();
                    }
                }
            }
            return Boxing.boxBoolean(zBooleanValue2);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(v, "start delete event");
        if (k(hMReminderInfo)) {
            Debug.fi(v, "once event expired");
            return Boxing.boxBoolean(true);
        }
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(10))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, 1, null));
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{9}, (byte) ((hMReminderInfo.getFrom() >> 6) | hMReminderInfo.getId()));
        dVar.a = this;
        dVar.b = hMReminderInfo;
        dVar.e = 1;
        objSendData = sendData(bArrPlus, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue3 = ((Boolean) objSendData).booleanValue();
        Debug.fi(v, Intrinsics.stringPlus("write delete event cmd result: ", Boxing.boxBoolean(zBooleanValue3)));
        if (!zBooleanValue3) {
            return Boxing.boxBoolean(false);
        }
        e eVar = eventReminderModule.new e(null);
        dVar.a = eventReminderModule;
        dVar.b = hMReminderInfo;
        dVar.e = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, eVar, dVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(v, Intrinsics.stringPlus("delete event response: ", channelResponse));
        if (channelResponse != null) {
            boolBoxBoolean = Boxing.boxBoolean(channelResponse.getData()[0] != 10 && channelResponse.getData()[1] == 1);
            if (boolBoxBoolean != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
                if (zBooleanValue) {
                    eventReminderModule2.f(hMReminderInfo);
                }
                boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                if (boolBoxBoolean2 != null) {
                    zBooleanValue2 = boolBoxBoolean2.booleanValue();
                }
            }
        }
        return Boxing.boxBoolean(zBooleanValue2);
    }

    public final void deleteEventAsync(@NotNull HMReminderInfo item, @NotNull HMCallback<Object> callback) {
        kotlinx.coroutines.e.f(this, null, null, new f(callback, this, item, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return j().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 56;
    }

    public final void handleAmbiguousOperationsAsync(@NotNull HMReminderInfo[] item, @NotNull HMCallback<Object> callback) {
        kotlinx.coroutines.e.f(this, null, null, new h(callback, this, item, null), 3, null);
    }

    public final boolean handleAmbiguousOperationsSync(@NotNull HMReminderInfo... item) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new i(item, null), 1, null)).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new j(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object modifyEvent(@NotNull HMReminderInfo hMReminderInfo, @NotNull Continuation<? super Boolean> continuation) {
        l lVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
        Boolean boolBoxBoolean;
        boolean zBooleanValue;
        Boolean boolBoxBoolean2;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.e = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objSendData = lVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar.e;
        boolean zBooleanValue2 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                hMReminderInfo = (HMReminderInfo) lVar.b;
                eventReminderModule = (EventReminderModule) lVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMReminderInfo = (HMReminderInfo) lVar.b;
                eventReminderModule2 = (EventReminderModule) lVar.a;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(v, Intrinsics.stringPlus("modify event response: ", channelResponse));
            if (channelResponse != null) {
                boolBoxBoolean = Boxing.boxBoolean(channelResponse.getData()[0] != 8 && channelResponse.getData()[1] == 1);
                if (boolBoxBoolean != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                    if (zBooleanValue) {
                        eventReminderModule2.g(hMReminderInfo);
                    }
                    boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                    if (boolBoxBoolean2 != null) {
                        zBooleanValue2 = boolBoxBoolean2.booleanValue();
                    }
                }
            }
            return Boxing.boxBoolean(zBooleanValue2);
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(v, "start modify event");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(8))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{7}, i(hMReminderInfo));
        lVar.a = this;
        lVar.b = hMReminderInfo;
        lVar.e = 1;
        objSendData = sendData(bArrPlus, lVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue3 = ((Boolean) objSendData).booleanValue();
        Debug.fi(v, Intrinsics.stringPlus("write modify event cmd result: ", Boxing.boxBoolean(zBooleanValue3)));
        if (!zBooleanValue3) {
            return Boxing.boxBoolean(false);
        }
        m mVar = eventReminderModule.new m(null);
        lVar.a = eventReminderModule;
        lVar.b = hMReminderInfo;
        lVar.e = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, mVar, lVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(v, Intrinsics.stringPlus("modify event response: ", channelResponse));
        if (channelResponse != null) {
            boolBoxBoolean = Boxing.boxBoolean(channelResponse.getData()[0] != 8 && channelResponse.getData()[1] == 1);
            if (boolBoxBoolean != null) {
                zBooleanValue = boolBoxBoolean.booleanValue();
                if (zBooleanValue) {
                    eventReminderModule2.g(hMReminderInfo);
                }
                boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                if (boolBoxBoolean2 != null) {
                    zBooleanValue2 = boolBoxBoolean2.booleanValue();
                }
            }
        }
        return Boxing.boxBoolean(zBooleanValue2);
    }

    public final void modifyEventAsync(@NotNull HMReminderInfo item, @NotNull HMCallback<Object> callback) {
        kotlinx.coroutines.e.f(this, null, null, new n(callback, this, item, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryEventItems(@NotNull Continuation<? super ArrayList<HMReminderInfo>> continuation) {
        o oVar;
        EventReminderModule eventReminderModule;
        EventReminderModule eventReminderModule2;
        ChannelResponse channelResponse;
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
        Object objSendData = oVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                eventReminderModule = (EventReminderModule) oVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventReminderModule2 = (EventReminderModule) oVar.a;
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(v, Intrinsics.stringPlus("query event items response: ", channelResponse));
            if (channelResponse == null) {
                return null;
            }
            if (!Boxing.boxBoolean(channelResponse.getData()[0] == 4).booleanValue()) {
                channelResponse = null;
            }
            if (channelResponse == null) {
                return null;
            }
            byte[] data = channelResponse.getData();
            ArrayList<HMReminderInfo> arrayListL = eventReminderModule2.l(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(data, new IntRange(1, data.length - 1))));
            eventReminderModule2.d(arrayListL != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) arrayListL) : null);
            return arrayListL;
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(v, "start query event items");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(4))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        }
        oVar.a = this;
        oVar.d = 1;
        objSendData = sendData(new byte[]{3}, oVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(v, Intrinsics.stringPlus("write query event items cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        p pVar = eventReminderModule.new p(null);
        oVar.a = eventReminderModule;
        oVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, pVar, oVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule2 = eventReminderModule;
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(v, Intrinsics.stringPlus("query event items response: ", channelResponse));
        if (channelResponse == null) {
            return null;
        }
        if (!Boxing.boxBoolean(channelResponse.getData()[0] == 4).booleanValue()) {
            channelResponse = null;
        }
        if (channelResponse == null) {
            return null;
        }
        byte[] data2 = channelResponse.getData();
        ArrayList<HMReminderInfo> arrayListL2 = eventReminderModule2.l(CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(data2, new IntRange(1, data2.length - 1))));
        eventReminderModule2.d(arrayListL2 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) arrayListL2) : null);
        return arrayListL2;
    }

    public final void queryEventItemsAsync(@NotNull HMCallback<ArrayList<HMReminderInfo>> callback) {
        kotlinx.coroutines.e.f(this, null, null, new q(callback, this, null), 3, null);
    }

    @Nullable
    public final ArrayList<HMReminderInfo> queryEventItemsSync() {
        return (ArrayList) kotlinx.coroutines.d.b(null, new r(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super EventReminderVersion> continuation) {
        s sVar;
        EventReminderModule eventReminderModule;
        ChannelResponse channelResponse;
        byte[] data;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.d = i2 - Integer.MIN_VALUE;
            } else {
                sVar = new s(continuation);
            }
        } else {
            sVar = new s(continuation);
        }
        Object objSendData = sVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = sVar.d;
        boolean z = false;
        if (i3 != 0) {
            if (i3 == 1) {
                eventReminderModule = (EventReminderModule) sVar.a;
                ResultKt.throwOnFailure(objSendData);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendData);
            }
            channelResponse = (ChannelResponse) objSendData;
            Debug.fi(v, Intrinsics.stringPlus("query version response: ", channelResponse));
            if (channelResponse == null) {
                return null;
            }
            data = channelResponse.getData();
            if (data[0] == 2 && data.length == 4) {
                z = true;
            }
            if (!Boxing.boxBoolean(z).booleanValue()) {
                data = null;
            }
            if (data == null) {
                return null;
            }
            return new EventReminderVersion((byte) (data[1] & (-1)), GattUtils.bytesToInt(data, 2, 2));
        }
        ResultKt.throwOnFailure(objSendData);
        Debug.fi(v, "start query version");
        Map<Integer, Channel<ChannelResponse>> map = this.channels;
        if (!Boxing.boxBoolean(!map.containsKey(Boxing.boxInt(2))).booleanValue()) {
            map = null;
        }
        if (map != null) {
            map.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        }
        sVar.a = this;
        sVar.d = 1;
        objSendData = sendData(new byte[]{1}, sVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        eventReminderModule = this;
        boolean zBooleanValue = ((Boolean) objSendData).booleanValue();
        Debug.fi(v, Intrinsics.stringPlus("write query version cmd result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        t tVar = eventReminderModule.new t(null);
        sVar.a = null;
        sVar.d = 2;
        objSendData = TimeoutKt.withTimeoutOrNull(15000L, tVar, sVar);
        if (objSendData == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendData;
        Debug.fi(v, Intrinsics.stringPlus("query version response: ", channelResponse));
        if (channelResponse == null) {
            return null;
        }
        data = channelResponse.getData();
        if (data[0] == 2) {
            z = true;
        }
        if (!Boxing.boxBoolean(z).booleanValue()) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return new EventReminderVersion((byte) (data[1] & (-1)), GattUtils.bytesToInt(data, 2, 2));
    }

    public final void registerInterceptor(@NotNull IDataInterceptor interceptor) {
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.registerInterceptor(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void unregisterInterceptor(@NotNull IDataInterceptor interceptor) {
        synchronized (this.innerInterceptor) {
            this.innerInterceptor.unregisterInterceptor(interceptor);
            Unit unit = Unit.INSTANCE;
        }
    }
}
