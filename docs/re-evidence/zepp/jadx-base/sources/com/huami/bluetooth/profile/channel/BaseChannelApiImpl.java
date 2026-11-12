package com.huami.bluetooth.profile.channel;

import androidx.core.app.NotificationCompat;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.model.ChannelDataBuf;
import com.huami.bluetooth.profile.channel.model.ChannelDataPacket;
import com.huami.bluetooth.profile.channel.model.ChannelPacketType;
import com.huami.bluetooth.profile.channel.model.ChannelRequest;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import com.huami.bluetooth.profile.channel.model.FirstPacket;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.mipush.sdk.MiPushClient;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0002cbB\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010?\u001a\u00020\u0005¢\u0006\u0004\b`\u0010aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J,\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0017J\u001b\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J8\u0010+\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\nH&J\u0010\u0010,\u001a\u00020$2\u0006\u0010\u000b\u001a\u00020\nH&J0\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0005H\u0016J\u001e\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\nJ(\u00102\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H&J\b\u00103\u001a\u00020\u0005H&J\b\u00104\u001a\u00020\u0005H&R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010?\u001a\u00020\u00058\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010C\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\b8\u0010BR\u001d\u0010F\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\b;\u0010ER\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\n0G8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR%\u0010O\u001a\n M*\u0004\u0018\u00010L0L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\b5\u0010NR\"\u0010W\u001a\u00020P8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/BaseChannelApiImpl;", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "Lkotlinx/coroutines/CoroutineScope;", "", "h", "", "packetCount", "freq", "", "f", "", "byteArray", "g", "e", GoogleApiAvailabilityLight.a, "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAddress", "Lcom/huami/bluetooth/profile/channel/Channel;", "channel", "setChannel", Constant.FUNCTION_CLOSE_CHANNEL, "moduleId", "isOneTime", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "callback", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;", "request", "sendData", NotificationCompat.CATEGORY_TRANSPORT, "(Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "packetRawData", "flag", "packetIndex", "totalSize", "module", "data", "createPacket", "parseDataPacket", SDKConstants.PARAM_SESSION_ID, "onPacketReceiveFinish", "deliverPacket", "code", "index", "packetReply", "firstPacketSize", "subsequentHeadSize", "a", "Lcom/huami/bluetooth/profile/channel/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "b", "Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "channelCallbackHolder", "c", LogUtil.I, "getAppId", "()I", "appId", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "()Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/sync/Mutex;", "()Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/BaseChannelApiImpl$ChannelPacketResponse;", "Lkotlinx/coroutines/channels/Channel;", "dataChannel", "dataPacketChannel", "Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "()Lio/netty/buffer/ByteBuf;", "buf", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataBuf;", "i", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataBuf;", "getBuffer", "()Lcom/huami/bluetooth/profile/channel/model/ChannelDataBuf;", "setBuffer", "(Lcom/huami/bluetooth/profile/channel/model/ChannelDataBuf;)V", "buffer", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lcom/huami/bluetooth/profile/channel/Channel;Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;I)V", "Companion", "ChannelPacketResponse", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseChannelApiImpl implements ChannelApi, CoroutineScope {
    public static final int FIRST_PACKET_HEADER_SIZE = 10;
    public static final int NEED_REPLY_PACKET_COUNT = 4;
    public static final int PACKET_INDEX_COUNT = 256;
    public static final long REPLY_TIMEOUT = 5000;
    public static final int SUBSEQUENT_PACKET_HEADER_SIZE = 4;
    public static final int VERSION = 1;

    @NotNull
    private static final String j = "ChannelApi";
    private static final int k = 1024;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Channel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ChannelCallbackHolder channelCallbackHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int appId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy job = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mutex = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final kotlinx.coroutines.channels.Channel<ChannelPacketResponse> dataChannel = ChannelKt.Channel(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final kotlinx.coroutines.channels.Channel<byte[]> dataPacketChannel = ChannelKt.Channel(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy buf = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private ChannelDataBuf buffer;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.BaseChannelApiImpl$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$2", f = "BaseChannelApiImpl.kt", i = {0, 1, 2}, l = {74, 74, 80}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        private /* synthetic */ Object c;

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.BaseChannelApiImpl$2$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChannelPacketType.values().length];
                iArr[ChannelPacketType.VERSION_QUIEY.ordinal()] = 1;
                iArr[ChannelPacketType.DATA.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = BaseChannelApiImpl.this.new AnonymousClass2(continuation);
            anonymousClass2.c = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        /* JADX WARN: Code duplicated, block: B:23:0x0081  */
        /* JADX WARN: Code duplicated, block: B:25:0x008d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b6 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:35:0x00cc, B:27:0x0092, B:30:0x00b6, B:31:0x00bc, B:34:0x00c9), top: B:45:0x00cc }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00bc A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:35:0x00cc, B:27:0x0092, B:30:0x00b6, B:31:0x00bc, B:34:0x00c9), top: B:45:0x00cc }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00c8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:35:0x00cc, B:27:0x0092, B:30:0x00b6, B:31:0x00bc, B:34:0x00c9), top: B:45:0x00cc }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b6 -> B:45:0x00cc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c6 -> B:45:0x00cc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c9 -> B:45:0x00cc). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.BaseChannelApiImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/BaseChannelApiImpl$ChannelPacketResponse;", "", "", "component1", "component2", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "component3", "module", SDKConstants.PARAM_SESSION_ID, AbstractJSONTokenResponse.RESPONSE, "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getModule", "()I", "b", "getSessionID", "c", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "getResponse", "()Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<init>", "(IILcom/huami/bluetooth/profile/channel/ChannelResponse;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class ChannelPacketResponse {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int module;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int sessionID;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        private final ChannelResponse response;

        public ChannelPacketResponse(int i, int i2, @NotNull ChannelResponse channelResponse) {
            this.module = i;
            this.sessionID = i2;
            this.response = channelResponse;
        }

        public static /* synthetic */ ChannelPacketResponse copy$default(ChannelPacketResponse channelPacketResponse, int i, int i2, ChannelResponse channelResponse, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = channelPacketResponse.module;
            }
            if ((i3 & 2) != 0) {
                i2 = channelPacketResponse.sessionID;
            }
            if ((i3 & 4) != 0) {
                channelResponse = channelPacketResponse.response;
            }
            return channelPacketResponse.copy(i, i2, channelResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getModule() {
            return this.module;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSessionID() {
            return this.sessionID;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ChannelResponse getResponse() {
            return this.response;
        }

        @NotNull
        public final ChannelPacketResponse copy(int module, int sessionID, @NotNull ChannelResponse response) {
            return new ChannelPacketResponse(module, sessionID, response);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChannelPacketResponse)) {
                return false;
            }
            ChannelPacketResponse channelPacketResponse = (ChannelPacketResponse) other;
            return this.module == channelPacketResponse.module && this.sessionID == channelPacketResponse.sessionID && Intrinsics.areEqual(this.response, channelPacketResponse.response);
        }

        public final int getModule() {
            return this.module;
        }

        @NotNull
        public final ChannelResponse getResponse() {
            return this.response;
        }

        public final int getSessionID() {
            return this.sessionID;
        }

        public int hashCode() {
            return (((this.module * 31) + this.sessionID) * 31) + this.response.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChannelPacketResponse(module=" + this.module + ", sessionID=" + this.sessionID + ", response=" + this.response + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$1", f = "BaseChannelApiImpl.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseChannelApiImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0042 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0043  */
        /* JADX WARN: Code duplicated, block: B:17:0x004f  */
        /* JADX WARN: Code duplicated, block: B:19:0x0059 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:20:0x005a). Please report as a decompilation issue!!! */
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
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.BaseChannelApiImpl.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lio/netty/buffer/ByteBuf;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ByteBuf> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteBuf getA() {
            return Unpooled.buffer(1024);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$deliverPacket$1", f = "BaseChannelApiImpl.kt", i = {}, l = {314}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ byte[] e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2, byte[] bArr, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseChannelApiImpl.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.Channel channel = BaseChannelApiImpl.this.dataChannel;
                ChannelPacketResponse channelPacketResponse = new ChannelPacketResponse(this.c, this.d, new ChannelResponse(0, null, this.e, 2, null));
                this.a = 1;
                if (channel.send(channelPacketResponse, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$handleDatePacket$2", f = "BaseChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseChannelApiImpl.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BaseChannelApiImpl.this.channelCallbackHolder.dispatch(BaseChannelApiImpl.this.getBuffer().getModule(), new ChannelResponse(4, "append data failed", null, 4, null));
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
        public final Job getA() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/sync/Mutex;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Mutex> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mutex getA() {
            return MutexKt.Mutex$default(false, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$onChannelPacket$1", f = "BaseChannelApiImpl.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ byte[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(byte[] bArr, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseChannelApiImpl.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.Channel channel = BaseChannelApiImpl.this.dataPacketChannel;
                byte[] bArr = this.c;
                this.a = 1;
                if (channel.send(bArr, this) == coroutine_suspended) {
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
    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public h(BaseChannelApiImpl baseChannelApiImpl) {
            super(1, baseChannelApiImpl, BaseChannelApiImpl.class, "onChannelPacket", "onChannelPacket([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) throws InterruptedException {
            ((BaseChannelApiImpl) this.receiver).g(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) throws InterruptedException {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$sendData$1", f = "BaseChannelApiImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ChannelRequest c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ChannelRequest channelRequest, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = channelRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseChannelApiImpl.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseChannelApiImpl baseChannelApiImpl = BaseChannelApiImpl.this;
                ChannelRequest channelRequest = this.c;
                this.a = 1;
                if (baseChannelApiImpl.transport(channelRequest, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BaseChannelApiImpl$transport$2", f = "BaseChannelApiImpl.kt", i = {0, 1, 1, 1, 1}, l = {354, 136}, m = "invokeSuspend", n = {"$receiver$iv", "$receiver$iv", "packet", "sessionId", "result"}, s = {"L$0", "L$0", "L$4", "I$0", "I$1"})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public int g;
        public int h;
        public final /* synthetic */ ChannelRequest j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ChannelRequest channelRequest, Continuation<? super j> continuation) {
            super(2, continuation);
            this.j = channelRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BaseChannelApiImpl.this.new j(this.j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0087 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00e0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00f2 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00f9 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00ff A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x0105 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x011e A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x0136 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:7:0x002d, B:28:0x00e3, B:30:0x00eb, B:49:0x0147, B:53:0x015e, B:57:0x0172, B:32:0x00f2, B:22:0x0081, B:24:0x0087, B:35:0x00f9, B:37:0x00ff, B:38:0x0105, B:40:0x0118, B:41:0x011e, B:43:0x0124, B:44:0x0136, B:21:0x0070), top: B:66:0x000f, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x013c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e1 -> B:28:0x00e3). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.BaseChannelApiImpl.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public BaseChannelApiImpl(@NotNull Channel channel, @NotNull ChannelCallbackHolder channelCallbackHolder, int i2) {
        this.channel = channel;
        this.channelCallbackHolder = channelCallbackHolder;
        this.appId = i2;
        kotlinx.coroutines.e.f(this, null, null, new a(null), 3, null);
        kotlinx.coroutines.e.f(this, null, null, new AnonymousClass2(null), 3, null);
        h();
        this.buffer = new ChannelDataBuf(-1, -1, -1, a());
    }

    private final ByteBuf a() {
        return (ByteBuf) this.buf.getValue();
    }

    private final Job b() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Mutex c() {
        return (Mutex) this.mutex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(byte[] bArr, Continuation<? super Unit> continuation) throws InterruptedException {
        ChannelDataPacket dataPacket = parseDataPacket(bArr);
        if (dataPacket instanceof FirstPacket) {
            FirstPacket firstPacket = (FirstPacket) dataPacket;
            if (!this.channelCallbackHolder.hasModule(firstPacket.getModule())) {
                this.channel.sendReply(packetReply(4, dataPacket.getSessionId(), 5, dataPacket.getIndex()));
                return Unit.INSTANCE;
            }
            setBuffer(new ChannelDataBuf(firstPacket.getModule(), dataPacket.getSessionId(), ((FirstPacket) dataPacket).getTotalSize(), a()));
        }
        int iAppend = getBuffer().append(dataPacket);
        if (iAppend != 1) {
            kotlinx.coroutines.d.b(null, new d(null), 1, null);
            this.channel.sendReply(packetReply(4, dataPacket.getSessionId(), iAppend, dataPacket.getIndex()));
            return Unit.INSTANCE;
        }
        if (dataPacket.isNeedReply()) {
            this.channel.sendReply(packetReply(4, dataPacket.getSessionId(), 1, dataPacket.getIndex()));
        }
        if (getBuffer().getIsComplete()) {
            Debug.fi(j, "Put packet to channel...");
            onPacketReceiveFinish(getBuffer().getSessionId(), getBuffer().getFlag(), getBuffer().getModule(), getBuffer().getData(), getBuffer().getTotalSize());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(byte[] byteArray) {
        Debug.fi(j, Intrinsics.stringPlus("Version query command: ", GattUtils.bytesToHexString(byteArray)));
        this.channel.sendReply(new byte[]{2, 1});
    }

    private final boolean f(int packetCount, int freq) {
        return packetCount % freq == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(byte[] byteArray) throws InterruptedException {
        if (byteArray.length == 0) {
            return;
        }
        kotlinx.coroutines.d.b(null, new g(byteArray, null), 1, null);
    }

    private final void h() {
        this.channel.dataCallback(new h(this));
    }

    public static /* synthetic */ Object i(BaseChannelApiImpl baseChannelApiImpl, ChannelRequest channelRequest, Continuation continuation) {
        if (JobKt.isActive(baseChannelApiImpl.getCoroutineContext())) {
            return BuildersKt.withContext(baseChannelApiImpl.getCoroutineContext(), baseChannelApiImpl.new j(channelRequest, null), continuation);
        }
        Debug.fi(j, "Error:协程已经被取消了，不能再执行发送数据任务了，请检查是不是使用的已销毁设备的API");
        return Boxing.boxBoolean(false);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void closeChannel() {
        Debug.fi(j, "Cancel channel coroutine");
        Job job = (Job) getCoroutineContext().get(Job.INSTANCE);
        if (job != null) {
            job.cancel();
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + this).toString());
    }

    @NotNull
    public abstract ChannelDataPacket createPacket(int flag, int sessionId, int packetIndex, int totalSize, int module, @NotNull byte[] data);

    public final void deliverPacket(int sessionID, int module, @NotNull byte[] data) throws InterruptedException {
        kotlinx.coroutines.d.b(null, new c(module, sessionID, data, null), 1, null);
    }

    public abstract int firstPacketSize();

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @NotNull
    public String getAddress() {
        return this.channel.getAddress();
    }

    public final int getAppId() {
        return this.appId;
    }

    @NotNull
    public final ChannelDataBuf getBuffer() {
        return this.buffer;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return b().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @NotNull
    public ChannelVersion getVersion() {
        return this.channel.version();
    }

    public void onPacketReceiveFinish(int sessionID, int flag, int module, @NotNull byte[] data, int totalSize) throws InterruptedException {
        deliverPacket(sessionID, module, data);
    }

    @NotNull
    public List<ChannelDataPacket> packetRawData(int sessionId, @NotNull ChannelRequest request) {
        Mtu mtu = this.channel.getChannelOptions().getMtu();
        int module = request.getModule();
        int length = request.getData().length;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        while (i2 < request.getData().length) {
            int iFirstPacketSize = z ? firstPacketSize() : subsequentHeadSize();
            int i5 = request.getEncrypt() ? 8 : 0;
            int size = i2 + ((mtu.size() - iFirstPacketSize) + i2 < length ? mtu.size() - iFirstPacketSize : length - i2);
            byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(request.getData(), new IntRange(i2, size - 1));
            if (size >= request.getData().length) {
                i5 = i5 | 2 | ((request.getNeedTailReply() ? 4 : 0) & 4);
            }
            if (z) {
                i5 |= 1;
            }
            int i6 = i3 + 1;
            arrayList.add(createPacket(f(i6, request.getReplyFreq()) ? i5 | 4 : i5, sessionId, i4, request.getDataSize(), module, bArrSliceArray));
            i4 = (i4 + 1) % 256;
            i2 = size;
            i3 = i6;
            z = false;
        }
        return arrayList;
    }

    @NotNull
    public abstract byte[] packetReply(int module, int sessionID, int code, int index);

    @NotNull
    public abstract ChannelDataPacket parseDataPacket(@NotNull byte[] byteArray);

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void register(int moduleId, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback) {
        this.channelCallbackHolder.register(moduleId, isOneTime, callback);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @Deprecated(message = "Not recommend", replaceWith = @ReplaceWith(expression = "transport()", imports = {}))
    public void sendData(@NotNull ChannelRequest request) {
        kotlinx.coroutines.e.f(this, null, null, new i(request, null), 3, null);
    }

    public final void setBuffer(@NotNull ChannelDataBuf channelDataBuf) {
        this.buffer = channelDataBuf;
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void setChannel(@NotNull Channel channel) {
        this.channel = channel;
        h();
    }

    public abstract int subsequentHeadSize();

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    @Nullable
    public Object transport(@NotNull ChannelRequest channelRequest, @NotNull Continuation<? super Boolean> continuation) {
        return i(this, channelRequest, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.ChannelApi
    public void unregister(int moduleId) {
        this.channelCallbackHolder.unregister(moduleId);
    }
}
