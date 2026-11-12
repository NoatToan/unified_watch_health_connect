package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.ChannelResponse;
import defpackage.DialVersion;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.w2;
import defpackage.y2;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0005QRSTUB\u000f\u0012\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0016J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\fJ\u001f\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0017J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010#\u001a\u00020\u000fJ!\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010#\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0019\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0017J$\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u001cJ1\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012J'\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00103\u001a\u00020\u000fJ!\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u00103\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b5\u0010&R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006V"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "byteArray", "Lf8;", "parseDialVersion", "data", "", "handleDiaChange", "Lm4;", com.xiaomi.onetrack.api.b.I, "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "parseOpDialResult", "", "parseOpDialIntResult", "parseGetDial", "", "parseDialList", "init", "queryVersionSync", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$d;", "callback", "setDialChangeCallBack", "dialId", "", "imageSize", "checkDeviceSpaceSync", "checkDeviceSpace", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDialIdListSync", "getDialIdList", "diaId", "setDialIdSync", "setDialId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDialIdSync", "getDialId", "srcId", "dest", MediaStoreUtil.MediaInfo.SIZE, "replaceDialIdSync", "replaceDialId", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dialIds", "deleteDialSync", "deleteDial", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "colorId", "setDialDefaultColorSync", "setDialDefaultColor", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "mCallback", "Lcom/huami/bluetooth/profile/channel/module/DialModule$d;", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class DialModule extends a implements CoroutineScope {
    public static final int DELETE_DIAL = 13;
    public static final int DIAL_DEFAULT_COLOR = 15;
    public static final int DIAL_MODULE = 35;
    public static final int GET_DIAL = 9;
    public static final int NOTIFY_DIAL_CHANGE = 255;
    public static final int QUERY_DIAL_LIST = 5;
    public static final int QUERY_DIAL_VERSION = 1;
    public static final int QUERY_SPACE_STATUS = 3;
    public static final int REPLACE_DIAL = 11;
    public static final int RESPONSE_DELETE_DIAL = 14;
    public static final int RESPONSE_DIAL_DEFAULT_COLOR = 16;
    public static final int RESPONSE_DIAL_VERSION = 2;
    public static final int RESPONSE_GET_DIAL = 10;
    public static final int RESPONSE_QUERY_DIAL_LIST = 6;
    public static final int RESPONSE_QUERY_SPACE_STATUS = 4;
    public static final int RESPONSE_REPLACE_DIAL = 12;
    public static final int RESPONSE_SET_DIAL = 8;
    public static final int SET_DIAL = 7;

    @NotNull
    public static final String TAG = "DialModule";

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @Nullable
    private d mCallback;

    @NotNull
    private final Mutex mutex;

    @Nullable
    private DialVersion version;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialDefaultColor$2$response$1", f = "DialModule.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public a0(Continuation<? super a0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new a0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(16));
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$b;", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "I", PluginDeviceInfo.FDESC, "()I", "value", "<init>", "(Ljava/lang/String;II)V", "u", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public enum b {
        FAILED(0),
        UNKNOWN(7),
        SUCCESS(1),
        NO_SPACE(2),
        NOT_FOUND(3),
        NOT_SUPPORT_OP(4),
        INVALID_PARAMETER(5),
        NO_DIAL_IDS(6),
        TIME_OUT(-1);


        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.DialModule$b$a, reason: from kotlin metadata */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$b$a;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/DialModule$b;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final b a(int value) {
                for (b bVar : b.values()) {
                    if (bVar.getValue() == value) {
                        if (bVar == null) {
                            return b.UNKNOWN;
                        }
                        return bVar;
                    }
                }
                bVar = null;
                if (bVar == null) {
                    return b.UNKNOWN;
                }
                return bVar;
            }
        }

        b(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialDefaultColorSync$1", f = "DialModule.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class b0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(int i, Continuation<? super b0> continuation) {
            super(2, continuation);
            this.v = i;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new b0(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.v;
                this.t = 1;
                obj = dialModule.setDialDefaultColor(i2, this);
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

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.DialModule$c, reason: from toString */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "T", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/huami/bluetooth/profile/channel/module/DialModule$b;", PluginDeviceInfo.FMODEL, "Lcom/huami/bluetooth/profile/channel/module/DialModule$b;", PluginDeviceInfo.FDESC, "()Lcom/huami/bluetooth/profile/channel/module/DialModule$b;", "resultCode", "Ljava/lang/Object;", "()Ljava/lang/Object;", "data", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/DialModule$b;Ljava/lang/Object;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class DialData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final b resultCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        public final T data;

        public DialData(@NotNull b resultCode, T t) {
            Intrinsics.checkNotNullParameter(resultCode, "resultCode");
            this.resultCode = resultCode;
            this.data = t;
        }

        public final T a() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getResultCode() {
            return this.resultCode;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialData)) {
                return false;
            }
            DialData dialData = (DialData) other;
            return this.resultCode == dialData.resultCode && Intrinsics.areEqual(this.data, dialData.data);
        }

        public int hashCode() {
            int iHashCode = this.resultCode.hashCode() * 31;
            T t = this.data;
            return iHashCode + (t == null ? 0 : t.hashCode());
        }

        @NotNull
        public String toString() {
            return "DialData(resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {389, 160, 166}, m = "setDialId", n = {"this", "$this$withLock_u24default$iv", "diaId", "this", "$this$withLock_u24default$iv", "diaId", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1"})
    public static final class c0 extends ContinuationImpl {
        public Object t;
        public Object u;
        public int v;
        public /* synthetic */ Object w;
        public int y;

        public c0(Continuation<? super c0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return DialModule.this.setDialId(0, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$d;", "", "Lcom/huami/bluetooth/profile/channel/module/DialModule$e;", "op", "", "dialId", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public interface d {
        void a(@NotNull e op, int dialId);
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialId$2$response$1", f = "DialModule.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
    public static final class d0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public d0(Continuation<? super d0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((d0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new d0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(8));
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$e;", "", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "I", PluginDeviceInfo.FDESC, "()I", "value", "<init>", "(Ljava/lang/String;II)V", "u", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public enum e {
        OP_UNKNOWN(0),
        OP_CHANGE(1),
        OP_EDIT(2),
        OP_DELETE(3),
        OP_REPLACE(4);


        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        public final int value;

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.DialModule$e$a, reason: from kotlin metadata */
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/DialModule$e$a;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/DialModule$e;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
            @NotNull
            public final e a(int value) {
                for (e eVar : e.values()) {
                    if (eVar.getValue() == value) {
                        if (eVar == null) {
                            return e.OP_UNKNOWN;
                        }
                        return eVar;
                    }
                }
                eVar = null;
                if (eVar == null) {
                    return e.OP_UNKNOWN;
                }
                return eVar;
            }
        }

        e(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$setDialIdSync$1", f = "DialModule.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ int v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(int i, Continuation<? super e0> continuation) {
            super(2, continuation);
            this.v = i;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new e0(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.v;
                this.t = 1;
                obj = dialModule.setDialId(i2, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {389, 122, 128}, m = "checkDeviceSpace", n = {"this", "$this$withLock_u24default$iv", "dialId", "imageSize", "this", "$this$withLock_u24default$iv", "dialId", "imageSize", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0", "L$0", "L$1"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public Object u;
        public int v;
        public long w;
        public /* synthetic */ Object x;
        public int z;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.x = obj;
            this.z |= Integer.MIN_VALUE;
            return DialModule.this.checkDeviceSpace(0, 0L, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$checkDeviceSpace$2$response$1", f = "DialModule.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(4));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$checkDeviceSpaceSync$1", f = "DialModule.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ long w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, long j, Continuation<? super h> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new h(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.v;
                long j = this.w;
                this.t = 1;
                obj = dialModule.checkDeviceSpace(i2, j, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {389, 229, 235}, m = "deleteDial", n = {"this", "dialIds", "$this$withLock_u24default$iv", "this", "dialIds", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class i extends ContinuationImpl {
        public Object t;
        public Object u;
        public Object v;
        public /* synthetic */ Object w;
        public int y;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return DialModule.this.deleteDial(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$deleteDial$2$response$1", f = "DialModule.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(14));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$deleteDialSync$1", f = "DialModule.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Boolean>>, Object> {
        public int t;
        public final /* synthetic */ List<Integer> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List<Integer> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.v = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Boolean>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new k(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                List<Integer> list = this.v;
                this.t = 1;
                obj = dialModule.deleteDial(list, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 1, 1, 2, 2}, l = {389, 177, SportReportBaseParser.ReportType.exitTime}, m = "getDialId", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
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
            return DialModule.this.getDialId(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialId$2$response$1", f = "DialModule.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
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
            return DialModule.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(10));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 1, 1, 2, 2}, l = {389, 140, 146}, m = "getDialIdList", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
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
            return DialModule.this.getDialIdList(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialIdList$2$response$1", f = "DialModule.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
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
            return DialModule.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(6));
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

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialIdListSync$1", f = "DialModule.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<List<? extends Integer>>>, Object> {
        public int t;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<List<Integer>>> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new p(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                this.t = 1;
                obj = dialModule.getDialIdList(this);
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$getDialIdSync$1", f = "DialModule.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Integer>>, Object> {
        public int t;

        public q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Integer>> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                this.t = 1;
                obj = dialModule.getDialId(this);
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
    public static final class r extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$init$1$1", f = "DialModule.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ DialModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, DialModule dialModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = dialModule;
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
                    if (this.u.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    t5t.d(DialModule.TAG, "Receive Dial Request:" + tet.x(this.u.getData()));
                    if (this.u.getData().length < 2) {
                        t5t.d(DialModule.TAG, "size too short");
                        return Unit.INSTANCE;
                    }
                    byte bFirst = ArraysKt___ArraysKt.first(this.u.getData());
                    if (bFirst == 255) {
                        this.v.handleDiaChange(y2.a(this.u.getData()));
                    } else {
                        Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(bFirst));
                        if (channel != null) {
                            ChannelResponse channelResponse = this.u;
                            this.t = 1;
                            if (channel.send(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
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

        public r() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DialModule dialModule = DialModule.this;
            BuildersKt__Builders_commonKt.launch$default(dialModule, null, null, new a(it, dialModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class s extends Lambda implements Function0<CompletableJob> {
        public static final s t = new s();

        public s() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {389, 67, 78}, m = "queryVersion", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "dataWhenFailed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class t extends ContinuationImpl {
        public Object t;
        public Object u;
        public Object v;
        public /* synthetic */ Object w;
        public int y;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return DialModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$queryVersion$2$response$1", f = "DialModule.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
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
            return DialModule.this.new u(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(2));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "Lf8;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$queryVersionSync$1", f = "DialModule.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<DialVersion>>, Object> {
        public int t;

        public v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<DialVersion>> continuation) {
            return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new v(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                this.t = 1;
                obj = dialModule.queryVersion(this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {389, 201, 207}, m = "replaceDialId", n = {"this", "$this$withLock_u24default$iv", "srcId", "dest", MediaStoreUtil.MediaInfo.SIZE, "this", "$this$withLock_u24default$iv", "srcId", "dest", MediaStoreUtil.MediaInfo.SIZE, "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "L$0", "L$1", "I$0", "I$1", "J$0", "L$0", "L$1"})
    public static final class w extends ContinuationImpl {
        public int A;
        public Object t;
        public Object u;
        public int v;
        public int w;
        public long x;
        public /* synthetic */ Object y;

        public w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            return DialModule.this.replaceDialId(0, 0, 0L, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$replaceDialId$2$response$1", f = "DialModule.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new x(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) DialModule.this.channels.get(Boxing.boxInt(12));
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

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/DialModule$c;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule$replaceDialIdSync$1", f = "DialModule.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DialData<Integer>>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;
        public final /* synthetic */ long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(int i, int i2, long j, Continuation<? super y> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = i2;
            this.x = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super DialData<Integer>> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DialModule.this.new y(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                DialModule dialModule = DialModule.this;
                int i2 = this.v;
                int i3 = this.w;
                long j = this.x;
                this.t = 1;
                obj = dialModule.replaceDialId(i2, i3, j, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.DialModule", f = "DialModule.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {389, 256, SportSummary.VERSION_105}, m = "setDialDefaultColor", n = {"this", "$this$withLock_u24default$iv", "colorId", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class z extends ContinuationImpl {
        public Object t;
        public Object u;
        public int v;
        public /* synthetic */ Object w;
        public int y;

        public z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return DialModule.this.setDialDefaultColor(0, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.job = LazyKt__LazyJVMKt.lazy(s.t);
        this.channels = new LinkedHashMap();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDiaChange(byte[] data) {
        w2 w2Var = new w2(data, 0, 2, null);
        int iC = w2Var.c(1);
        int iB = w2.b(w2Var, 0, 1, null);
        d dVar = this.mCallback;
        if (dVar != null) {
            dVar.a(e.INSTANCE.a(iC), iB);
        }
    }

    private final DialData<List<Integer>> parseDialList(ChannelResponse response) {
        t5t.m(TAG, "queryDialList:response:" + response);
        w2 w2Var = new w2(y2.a(response.getData()), 0, 2, null);
        b bVarA = b.INSTANCE.a(w2Var.c(1));
        ArrayList arrayList = new ArrayList();
        int iC = bVarA == b.SUCCESS ? w2Var.c(1) : 0;
        if (iC > 0) {
            for (int i2 = 0; i2 < iC; i2++) {
                arrayList.add(Integer.valueOf(w2.b(w2Var, 0, 1, null)));
            }
        }
        return new DialData<>(bVarA, arrayList);
    }

    private final DialVersion parseDialVersion(byte[] byteArray) {
        boolean z2 = false;
        w2 w2Var = new w2(byteArray, 0, 2, null);
        w2Var.c();
        int iC = w2Var.c();
        int iC2 = iC >= 2 ? w2Var.c() : 0;
        if (iC >= 2 && w2Var.c() == 1) {
            z2 = true;
        }
        return new DialVersion(iC, iC2, z2);
    }

    private final DialData<Integer> parseGetDial(ChannelResponse response) {
        t5t.m(TAG, "getDialId:response:" + response);
        return new DialData<>(b.SUCCESS, Integer.valueOf(w2.b(new w2(y2.a(response.getData()), 0, 2, null), 0, 1, null)));
    }

    private final DialData<Integer> parseOpDialIntResult(ChannelResponse response) {
        t5t.m(TAG, "parseOpDialIntResult:response:" + response);
        b bVarA = b.INSTANCE.a(new w2(y2.a(response.getData()), 0, 2, null).c(1));
        return new DialData<>(bVarA, Integer.valueOf(bVarA.getValue()));
    }

    private final DialData<Boolean> parseOpDialResult(ChannelResponse response) {
        t5t.m(TAG, "parseOpDialResult:response:" + response);
        b bVarA = b.INSTANCE.a(new w2(y2.a(response.getData()), 0, 2, null).c(1));
        return new DialData<>(bVarA, Boolean.valueOf(bVarA == b.SUCCESS));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0117 A[Catch: all -> 0x0123, TryCatch #0 {all -> 0x0123, blocks: (B:34:0x00e9, B:36:0x0117, B:39:0x0126, B:30:0x0090), top: B:53:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0126 A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #0 {all -> 0x0123, blocks: (B:34:0x00e9, B:36:0x0117, B:39:0x0126, B:30:0x0090), top: B:53:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x013a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:43:0x013c, B:45:0x0140, B:47:0x014d), top: B:56:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x014d A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:43:0x013c, B:45:0x0140, B:47:0x014d), top: B:56:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object checkDeviceSpace(int i2, long j2, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        f fVar;
        int i3;
        long j3;
        Mutex mutex;
        DialModule dialModule;
        Mutex mutex2;
        int i4;
        DialModule dialModule2;
        long j4;
        boolean zBooleanValue;
        DialModule dialModule3;
        DialData<Boolean> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i5 = fVar.z;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fVar.z = i5 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objWithTimeoutOrNull = fVar.x;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = fVar.z;
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex3 = this.mutex;
                fVar.t = this;
                fVar.u = mutex3;
                i3 = i2;
                fVar.v = i3;
                j3 = j2;
                fVar.w = j3;
                fVar.z = 1;
                if (mutex3.lock(null, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex3;
                dialModule = this;
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        j4 = fVar.w;
                        i4 = fVar.v;
                        Mutex mutex4 = (Mutex) fVar.u;
                        dialModule2 = (DialModule) fVar.t;
                        try {
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex = mutex4;
                            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                            t5t.d(TAG, "checkDeviceSpace:" + i4 + AbstractJsonLexerKt.COLON + j4 + ":result:" + zBooleanValue);
                            if (zBooleanValue) {
                                g gVar = dialModule2.new g(null);
                                fVar.t = dialModule2;
                                fVar.u = mutex;
                                fVar.z = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, gVar, fVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dialModule3 = dialModule2;
                                mutex2 = mutex;
                                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                if (channelResponse == null) {
                                    dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                                } else {
                                    dialModule3.channels.remove(Boxing.boxInt(4));
                                    dialData = dialModule3.parseOpDialResult(channelResponse);
                                }
                                mutex = mutex2;
                            } else {
                                dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                            }
                            mutex.unlock(null);
                            return dialData;
                        } catch (Throwable th) {
                            th = th;
                            mutex2 = mutex4;
                        }
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) fVar.u;
                        dialModule3 = (DialModule) fVar.t;
                        try {
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                            if (channelResponse == null) {
                                dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                            } else {
                                dialModule3.channels.remove(Boxing.boxInt(4));
                                dialData = dialModule3.parseOpDialResult(channelResponse);
                            }
                            mutex = mutex2;
                            mutex.unlock(null);
                            return dialData;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    mutex2.unlock(null);
                    throw th;
                }
                long j5 = fVar.w;
                int i7 = fVar.v;
                Mutex mutex5 = (Mutex) fVar.u;
                DialModule dialModule4 = (DialModule) fVar.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                i3 = i7;
                mutex = mutex5;
                dialModule = dialModule4;
                j3 = j5;
            }
            dialModule.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(tet.p(i3));
            byteArrayOutputStream.write(tet.r(j3, 4));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
            fVar.t = dialModule;
            fVar.u = mutex;
            fVar.v = i3;
            fVar.w = j3;
            fVar.z = 2;
            DialModule dialModule5 = dialModule;
            long j6 = j3;
            Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, byteArray, 0, false, fVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            i4 = i3;
            objWithTimeoutOrNull = objSendDataWithResult$default;
            dialModule2 = dialModule5;
            j4 = j6;
            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
            t5t.d(TAG, "checkDeviceSpace:" + i4 + AbstractJsonLexerKt.COLON + j4 + ":result:" + zBooleanValue);
            if (zBooleanValue) {
                dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
            } else {
                g gVar2 = dialModule2.new g(null);
                fVar.t = dialModule2;
                fVar.u = mutex;
                fVar.z = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, gVar2, fVar);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule3 = dialModule2;
                mutex2 = mutex;
                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                if (channelResponse == null) {
                    dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                } else {
                    dialModule3.channels.remove(Boxing.boxInt(4));
                    dialData = dialModule3.parseOpDialResult(channelResponse);
                }
                mutex = mutex2;
            }
            mutex.unlock(null);
            return dialData;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
        }
    }

    @NotNull
    public final DialData<Boolean> checkDeviceSpaceSync(int dialId, long imageSize) {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new h(dialId, imageSize, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0125 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:49:0x0149, B:51:0x014d, B:52:0x0159, B:21:0x0057, B:41:0x00ff, B:43:0x0125, B:45:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0132 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:49:0x0149, B:51:0x014d, B:52:0x0159, B:21:0x0057, B:41:0x00ff, B:43:0x0125, B:45:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:49:0x0149, B:51:0x014d, B:52:0x0159, B:21:0x0057, B:41:0x00ff, B:43:0x0125, B:45:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0159 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:49:0x0149, B:51:0x014d, B:52:0x0159, B:21:0x0057, B:41:0x00ff, B:43:0x0125, B:45:0x0132), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    @Nullable
    public final Object deleteDial(@NotNull List<Integer> list, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        i iVar;
        ?? r15;
        List<Integer> list2;
        DialModule dialModule;
        Mutex mutex;
        List<Integer> list3;
        Mutex mutex2;
        DialModule dialModule2;
        DialData<Boolean> dialData;
        boolean zBooleanValue;
        DialModule dialModule3;
        Mutex mutex3;
        Mutex mutex4;
        Mutex mutex5;
        ChannelResponse channelResponse;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.y = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objWithTimeoutOrNull = iVar.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = iVar.y;
        try {
            try {
                if (r3 != 0) {
                    if (r3 == 1) {
                        Mutex mutex6 = (Mutex) iVar.v;
                        List<Integer> list4 = (List) iVar.u;
                        DialModule dialModule4 = (DialModule) iVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        mutex = mutex6;
                        list2 = list4;
                        dialModule = dialModule4;
                    } else {
                        if (r3 == 2) {
                            Mutex mutex7 = (Mutex) iVar.v;
                            list3 = (List) iVar.u;
                            dialModule2 = (DialModule) iVar.t;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex2 = mutex7;
                            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                            t5t.d(TAG, "deleteDial:" + list3 + ":result:" + zBooleanValue);
                            if (zBooleanValue) {
                                j jVar = dialModule2.new j(null);
                                iVar.t = dialModule2;
                                iVar.u = mutex2;
                                iVar.v = null;
                                iVar.y = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, jVar, iVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dialModule3 = dialModule2;
                                mutex5 = mutex2;
                            } else {
                                dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                                mutex4 = mutex2;
                            }
                            mutex3 = mutex4;
                            mutex3.unlock(null);
                            return dialData;
                        }
                        if (r3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex8 = (Mutex) iVar.u;
                        dialModule3 = (DialModule) iVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        mutex5 = mutex8;
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                        mutex4 = mutex5;
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(14));
                        dialData = dialModule3.parseOpDialResult(channelResponse);
                        mutex4 = mutex5;
                    }
                    mutex3 = mutex4;
                    mutex3.unlock(null);
                    return dialData;
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex9 = this.mutex;
                iVar.t = this;
                list2 = list;
                iVar.u = list2;
                iVar.v = mutex9;
                iVar.y = 1;
                if (mutex9.lock(null, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule = this;
                mutex = mutex9;
                dialModule.channels.put(Boxing.boxInt(14), ChannelKt.Channel$default(0, null, null, 7, null));
                int size = list2.size();
                if (size == 0) {
                    dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                    mutex3 = mutex;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(size);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        byteArrayOutputStream.write(tet.p(((Number) it.next()).intValue()));
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
                    iVar.t = dialModule;
                    iVar.u = list2;
                    iVar.v = mutex;
                    iVar.y = 2;
                    DialModule dialModule5 = dialModule;
                    Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, byteArray, 0, false, iVar, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3 = list2;
                    objWithTimeoutOrNull = objSendDataWithResult$default;
                    mutex2 = mutex;
                    dialModule2 = dialModule5;
                    zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                    t5t.d(TAG, "deleteDial:" + list3 + ":result:" + zBooleanValue);
                    if (zBooleanValue) {
                        dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                        mutex4 = mutex2;
                    } else {
                        j jVar2 = dialModule2.new j(null);
                        iVar.t = dialModule2;
                        iVar.u = mutex2;
                        iVar.v = null;
                        iVar.y = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, jVar2, iVar);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dialModule3 = dialModule2;
                        mutex5 = mutex2;
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                            mutex4 = mutex5;
                        } else {
                            dialModule3.channels.remove(Boxing.boxInt(14));
                            dialData = dialModule3.parseOpDialResult(channelResponse);
                            mutex4 = mutex5;
                        }
                    }
                    mutex3 = mutex4;
                }
                mutex3.unlock(null);
                return dialData;
            } catch (Throwable th) {
                th = th;
                r15 = mutex;
                r15.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r15 = r3;
        }
    }

    @NotNull
    public final DialData<Boolean> deleteDialSync(@NotNull List<Integer> dialIds) {
        Intrinsics.checkNotNullParameter(dialIds, "dialIds");
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new k(dialIds, null), 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:43:0x00f4, B:45:0x00f8, B:46:0x0104, B:35:0x00b4, B:37:0x00d2, B:40:0x00e0, B:31:0x00a8), top: B:57:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:43:0x00f4, B:45:0x00f8, B:46:0x0104, B:35:0x00b4, B:37:0x00d2, B:40:0x00e0, B:31:0x00a8), top: B:57:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8 A[Catch: all -> 0x00de, TryCatch #2 {all -> 0x00de, blocks: (B:43:0x00f4, B:45:0x00f8, B:46:0x0104, B:35:0x00b4, B:37:0x00d2, B:40:0x00e0, B:31:0x00a8), top: B:57:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0104 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:43:0x00f4, B:45:0x00f8, B:46:0x0104, B:35:0x00b4, B:37:0x00d2, B:40:0x00e0, B:31:0x00a8), top: B:57:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object getDialId(@NotNull Continuation<? super DialData<Integer>> continuation) throws Throwable {
        l lVar;
        DialModule dialModule;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Continuation continuation2;
        DialModule dialModule2;
        ChannelResponse channelResponse;
        DialData<Integer> getDial;
        boolean zBooleanValue;
        byte[] bArr;
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
        Object objWithTimeoutOrNull = lVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.x;
        try {
            try {
                if (i3 != 0) {
                    if (i3 != 1) {
                        try {
                            if (i3 == 2) {
                                Mutex mutex3 = (Mutex) lVar.u;
                                DialModule dialModule3 = (DialModule) lVar.t;
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                dialModule2 = dialModule3;
                                mutex2 = mutex3;
                                continuation2 = null;
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                t5t.d(TAG, "getDialId:result:" + zBooleanValue);
                                if (zBooleanValue) {
                                    m mVar = dialModule2.new m(continuation2);
                                    lVar.t = dialModule2;
                                    lVar.u = mutex2;
                                    lVar.x = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, mVar, lVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    getDial = new DialData<>(b.FAILED, Boxing.boxInt(Integer.MIN_VALUE));
                                }
                                mutex2.unlock(continuation2);
                                return getDial;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Mutex mutex4 = (Mutex) lVar.u;
                            DialModule dialModule4 = (DialModule) lVar.t;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            dialModule2 = dialModule4;
                            mutex2 = mutex4;
                            continuation2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = null;
                            continuation2 = null;
                            mutex2.unlock(continuation2);
                            throw th;
                        }
                    } else {
                        Mutex mutex5 = (Mutex) lVar.u;
                        DialModule dialModule5 = (DialModule) lVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        mutex = mutex5;
                        dialModule = dialModule5;
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        getDial = new DialData<>(b.TIME_OUT, Boxing.boxInt(Integer.MIN_VALUE));
                    } else {
                        dialModule2.channels.remove(Boxing.boxInt(10));
                        getDial = dialModule2.parseGetDial(channelResponse);
                    }
                    mutex2.unlock(continuation2);
                    return getDial;
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex6 = this.mutex;
                lVar.t = this;
                lVar.u = mutex6;
                lVar.x = 1;
                if (mutex6.lock(null, lVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule = this;
                mutex = mutex6;
                Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, bArr, 0, false, lVar, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule2 = dialModule;
                objWithTimeoutOrNull = objSendDataWithResult$default;
                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                t5t.d(TAG, "getDialId:result:" + zBooleanValue);
                if (zBooleanValue) {
                    getDial = new DialData<>(b.FAILED, Boxing.boxInt(Integer.MIN_VALUE));
                } else {
                    m mVar2 = dialModule2.new m(continuation2);
                    lVar.t = dialModule2;
                    lVar.u = mutex2;
                    lVar.x = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, mVar2, lVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        getDial = new DialData<>(b.TIME_OUT, Boxing.boxInt(Integer.MIN_VALUE));
                    } else {
                        dialModule2.channels.remove(Boxing.boxInt(10));
                        getDial = dialModule2.parseGetDial(channelResponse);
                    }
                }
                mutex2.unlock(continuation2);
                return getDial;
            } catch (Throwable th3) {
                th = th3;
                mutex2.unlock(continuation2);
                throw th;
            }
            dialModule.channels.put(Boxing.boxInt(10), ChannelKt.Channel$default(0, null, null, 7, null));
            bArr = new byte[]{9};
            lVar.t = dialModule;
            lVar.u = mutex;
            lVar.x = 2;
            mutex2 = mutex;
            continuation2 = null;
        } catch (Throwable th4) {
            th = th4;
            mutex2 = mutex;
            continuation2 = null;
            mutex2.unlock(continuation2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c5 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:40:0x00e5, B:42:0x00e9, B:43:0x00f5, B:21:0x0052, B:34:0x00a7, B:36:0x00c5, B:37:0x00d1), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:40:0x00e5, B:42:0x00e9, B:43:0x00f5, B:21:0x0052, B:34:0x00a7, B:36:0x00c5, B:37:0x00d1), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:40:0x00e5, B:42:0x00e9, B:43:0x00f5, B:21:0x0052, B:34:0x00a7, B:36:0x00c5, B:37:0x00d1), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:40:0x00e5, B:42:0x00e9, B:43:0x00f5, B:21:0x0052, B:34:0x00a7, B:36:0x00c5, B:37:0x00d1), top: B:58:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object getDialIdList(@NotNull Continuation<? super DialData<List<Integer>>> continuation) throws Throwable {
        n nVar;
        Mutex mutex;
        DialModule dialModule;
        Mutex mutex2;
        Mutex mutex3;
        byte[] bArr;
        DialModule dialModule2;
        Mutex mutex4;
        boolean zBooleanValue;
        DialData<List<Integer>> dialData;
        ChannelResponse channelResponse;
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
        Object objWithTimeoutOrNull = nVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.x;
        try {
            try {
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            Mutex mutex5 = (Mutex) nVar.u;
                            DialModule dialModule3 = (DialModule) nVar.t;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex2 = mutex5;
                            dialModule = dialModule3;
                        } else {
                            if (i3 == 2) {
                                mutex4 = (Mutex) nVar.u;
                                dialModule2 = (DialModule) nVar.t;
                                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                t5t.d(TAG, "getDialIdList" + zBooleanValue);
                                if (zBooleanValue) {
                                    o oVar = dialModule2.new o(null);
                                    nVar.t = dialModule2;
                                    nVar.u = mutex4;
                                    nVar.x = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, oVar, nVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    dialData = new DialData<>(b.FAILED, CollectionsKt__CollectionsKt.emptyList());
                                }
                                mutex4.unlock(null);
                                return dialData;
                            }
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex4 = (Mutex) nVar.u;
                            dialModule2 = (DialModule) nVar.t;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        }
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(b.TIME_OUT, CollectionsKt__CollectionsKt.emptyList());
                        } else {
                            dialModule2.channels.remove(Boxing.boxInt(6));
                            dialData = dialModule2.parseDialList(channelResponse);
                        }
                        mutex4.unlock(null);
                        return dialData;
                    }
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    Mutex mutex6 = this.mutex;
                    nVar.t = this;
                    nVar.u = mutex6;
                    nVar.x = 1;
                    if (mutex6.lock(null, nVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule = this;
                    mutex2 = mutex6;
                    Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, bArr, 0, false, nVar, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule2 = dialModule;
                    objWithTimeoutOrNull = objSendDataWithResult$default;
                    mutex4 = mutex3;
                    zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                    t5t.d(TAG, "getDialIdList" + zBooleanValue);
                    if (zBooleanValue) {
                        dialData = new DialData<>(b.FAILED, CollectionsKt__CollectionsKt.emptyList());
                    } else {
                        o oVar2 = dialModule2.new o(null);
                        nVar.t = dialModule2;
                        nVar.u = mutex4;
                        nVar.x = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, oVar2, nVar);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        if (channelResponse == null) {
                            dialData = new DialData<>(b.TIME_OUT, CollectionsKt__CollectionsKt.emptyList());
                        } else {
                            dialModule2.channels.remove(Boxing.boxInt(6));
                            dialData = dialModule2.parseDialList(channelResponse);
                        }
                    }
                    mutex4.unlock(null);
                    return dialData;
                } catch (Throwable th) {
                    th = th;
                    mutex = mutex3;
                    mutex.unlock(null);
                    throw th;
                }
                dialModule.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
                bArr = new byte[]{5};
                nVar.t = dialModule;
                nVar.u = mutex2;
                nVar.x = 2;
                mutex3 = mutex2;
            } catch (Throwable th2) {
                th = th2;
                mutex3 = mutex2;
            }
        } catch (Throwable th3) {
            th = th3;
            mutex = null;
        }
    }

    @NotNull
    public final DialData<List<Integer>> getDialIdListSync() {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new p(null), 1, null);
    }

    @NotNull
    public final DialData<Integer> getDialIdSync() {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new q(null), 1, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 35;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new r(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #1 {all -> 0x0119, blocks: (B:34:0x00b4, B:37:0x00df, B:30:0x0080), top: B:54:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:41:0x00f7, B:44:0x00fc), top: B:52:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super DialData<DialVersion>> continuation) throws Throwable {
        t tVar;
        Mutex mutex;
        DialModule dialModule;
        DialModule dialModule2;
        Mutex mutex2;
        boolean zBooleanValue;
        DialData dialData;
        DialModule dialModule3;
        ChannelResponse channelResponse;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i2 = tVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.y = i2 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object objWithTimeoutOrNull = tVar.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = tVar.y;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex3 = this.mutex;
                tVar.t = this;
                tVar.u = mutex3;
                tVar.y = 1;
                if (mutex3.lock(null, tVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex3;
                dialModule = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dialData = (DialData) tVar.v;
                        mutex2 = (Mutex) tVar.u;
                        dialModule3 = (DialModule) tVar.t;
                        try {
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                            if (channelResponse != null) {
                                dialModule3.channels.remove(Boxing.boxInt(2));
                                dialData = new DialData(b.SUCCESS, dialModule3.parseDialVersion(channelResponse.getData()));
                            }
                            mutex = mutex2;
                            mutex.unlock(null);
                            return dialData;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex4 = (Mutex) tVar.u;
                    dialModule2 = (DialModule) tVar.t;
                    try {
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        mutex = mutex4;
                        zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                        t5t.d(TAG, "query version: " + zBooleanValue);
                        dialData = new DialData(b.FAILED, new DialVersion(0, 0, false));
                        if (!zBooleanValue) {
                            u uVar = dialModule2.new u(null);
                            tVar.t = dialModule2;
                            tVar.u = mutex;
                            tVar.v = dialData;
                            tVar.y = 3;
                            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, uVar, tVar);
                            if (objWithTimeoutOrNull == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            dialModule3 = dialModule2;
                            mutex2 = mutex;
                            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                            if (channelResponse != null) {
                                dialModule3.channels.remove(Boxing.boxInt(2));
                                dialData = new DialData(b.SUCCESS, dialModule3.parseDialVersion(channelResponse.getData()));
                            }
                            mutex = mutex2;
                        }
                        mutex.unlock(null);
                        return dialData;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex5 = (Mutex) tVar.u;
                DialModule dialModule4 = (DialModule) tVar.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                mutex = mutex5;
                dialModule = dialModule4;
            }
            dialModule.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
            tVar.t = dialModule;
            tVar.u = mutex;
            tVar.y = 2;
            Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, byteArray, 0, false, tVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            dialModule2 = dialModule;
            objWithTimeoutOrNull = objSendDataWithResult$default;
            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
            t5t.d(TAG, "query version: " + zBooleanValue);
            dialData = new DialData(b.FAILED, new DialVersion(0, 0, false));
            if (!zBooleanValue) {
                u uVar2 = dialModule2.new u(null);
                tVar.t = dialModule2;
                tVar.u = mutex;
                tVar.v = dialData;
                tVar.y = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, uVar2, tVar);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule3 = dialModule2;
                mutex2 = mutex;
                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                if (channelResponse != null) {
                    dialModule3.channels.remove(Boxing.boxInt(2));
                    dialData = new DialData(b.SUCCESS, dialModule3.parseDialVersion(channelResponse.getData()));
                }
                mutex = mutex2;
            }
            mutex.unlock(null);
            return dialData;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    @NotNull
    public final DialData<DialVersion> queryVersionSync() {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new v(null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0133 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:34:0x00ff, B:36:0x0133, B:39:0x0145, B:30:0x009d), top: B:54:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0145 A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #0 {all -> 0x0143, blocks: (B:34:0x00ff, B:36:0x0133, B:39:0x0145, B:30:0x009d), top: B:54:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0159  */
    /* JADX WARN: Code duplicated, block: B:45:0x015f A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:43:0x015b, B:45:0x015f, B:47:0x0172), top: B:57:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0172 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x003a, B:43:0x015b, B:45:0x015f, B:47:0x0172), top: B:57:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object replaceDialId(int i2, int i3, long j2, @NotNull Continuation<? super DialData<Integer>> continuation) throws Throwable {
        w wVar;
        Mutex mutex;
        int i4;
        int i5;
        long j3;
        DialModule dialModule;
        Mutex mutex2;
        DialModule dialModule2;
        int i6;
        int i7;
        long j4;
        boolean zBooleanValue;
        DialModule dialModule3;
        DialData<Integer> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i8 = wVar.A;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                wVar.A = i8 - Integer.MIN_VALUE;
            } else {
                wVar = new w(continuation);
            }
        } else {
            wVar = new w(continuation);
        }
        Object objWithTimeoutOrNull = wVar.y;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = wVar.A;
        try {
            if (i9 == 0) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex3 = this.mutex;
                wVar.t = this;
                wVar.u = mutex3;
                wVar.v = i2;
                wVar.w = i3;
                wVar.x = j2;
                wVar.A = 1;
                if (mutex3.lock(null, wVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex3;
                i4 = i2;
                i5 = i3;
                j3 = j2;
                dialModule = this;
            } else {
                if (i9 != 1) {
                    if (i9 == 2) {
                        j4 = wVar.x;
                        i7 = wVar.w;
                        i6 = wVar.v;
                        Mutex mutex4 = (Mutex) wVar.u;
                        DialModule dialModule4 = (DialModule) wVar.t;
                        try {
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex = mutex4;
                            dialModule2 = dialModule4;
                            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                            t5t.d(TAG, "replaceDialId:" + i6 + AbstractJsonLexerKt.COLON + i7 + AbstractJsonLexerKt.COLON + j4 + ":result:" + zBooleanValue);
                            if (zBooleanValue) {
                                x xVar = dialModule2.new x(null);
                                wVar.t = dialModule2;
                                wVar.u = mutex;
                                wVar.A = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, xVar, wVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dialModule3 = dialModule2;
                                mutex2 = mutex;
                                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                                if (channelResponse == null) {
                                    dialData = new DialData<>(b.TIME_OUT, Boxing.boxInt(b.FAILED.getValue()));
                                } else {
                                    dialModule3.channels.remove(Boxing.boxInt(12));
                                    dialData = dialModule3.parseOpDialIntResult(channelResponse);
                                }
                                mutex = mutex2;
                            } else {
                                b bVar = b.FAILED;
                                dialData = new DialData<>(bVar, Boxing.boxInt(bVar.getValue()));
                            }
                            mutex.unlock(null);
                            return dialData;
                        } catch (Throwable th) {
                            th = th;
                            mutex2 = mutex4;
                        }
                    } else {
                        if (i9 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) wVar.u;
                        dialModule3 = (DialModule) wVar.t;
                        try {
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                            if (channelResponse == null) {
                                dialData = new DialData<>(b.TIME_OUT, Boxing.boxInt(b.FAILED.getValue()));
                            } else {
                                dialModule3.channels.remove(Boxing.boxInt(12));
                                dialData = dialModule3.parseOpDialIntResult(channelResponse);
                            }
                            mutex = mutex2;
                            mutex.unlock(null);
                            return dialData;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    mutex2.unlock(null);
                    throw th;
                }
                long j5 = wVar.x;
                int i10 = wVar.w;
                int i11 = wVar.v;
                Mutex mutex5 = (Mutex) wVar.u;
                DialModule dialModule5 = (DialModule) wVar.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                i5 = i10;
                i4 = i11;
                mutex = mutex5;
                dialModule = dialModule5;
                j3 = j5;
            }
            dialModule.channels.put(Boxing.boxInt(12), ChannelKt.Channel$default(0, null, null, 7, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(11);
            byteArrayOutputStream.write(tet.p(i4));
            byteArrayOutputStream.write(tet.p(i5));
            byteArrayOutputStream.write(tet.r(j3, 4));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
            wVar.t = dialModule;
            wVar.u = mutex;
            wVar.v = i4;
            wVar.w = i5;
            wVar.x = j3;
            wVar.A = 2;
            dialModule2 = dialModule;
            long j6 = j3;
            Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, byteArray, 0, false, wVar, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            i6 = i4;
            objWithTimeoutOrNull = objSendDataWithResult$default;
            i7 = i5;
            j4 = j6;
            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
            t5t.d(TAG, "replaceDialId:" + i6 + AbstractJsonLexerKt.COLON + i7 + AbstractJsonLexerKt.COLON + j4 + ":result:" + zBooleanValue);
            if (zBooleanValue) {
                b bVar2 = b.FAILED;
                dialData = new DialData<>(bVar2, Boxing.boxInt(bVar2.getValue()));
            } else {
                x xVar2 = dialModule2.new x(null);
                wVar.t = dialModule2;
                wVar.u = mutex;
                wVar.A = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, xVar2, wVar);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule3 = dialModule2;
                mutex2 = mutex;
                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                if (channelResponse == null) {
                    dialData = new DialData<>(b.TIME_OUT, Boxing.boxInt(b.FAILED.getValue()));
                } else {
                    dialModule3.channels.remove(Boxing.boxInt(12));
                    dialData = dialModule3.parseOpDialIntResult(channelResponse);
                }
                mutex = mutex2;
            }
            mutex.unlock(null);
            return dialData;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
        }
    }

    @NotNull
    public final DialData<Integer> replaceDialIdSync(int srcId, int dest, long size) {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new y(srcId, dest, size, null), 1, null);
    }

    public final void setDialChangeCallBack(@NotNull d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mCallback = callback;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00ea, B:41:0x00ee, B:42:0x00fa, B:21:0x0053, B:32:0x00c1, B:34:0x00c9, B:35:0x00d5), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00ea, B:41:0x00ee, B:42:0x00fa, B:21:0x0053, B:32:0x00c1, B:34:0x00c9, B:35:0x00d5), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00ea, B:41:0x00ee, B:42:0x00fa, B:21:0x0053, B:32:0x00c1, B:34:0x00c9, B:35:0x00d5), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:39:0x00ea, B:41:0x00ee, B:42:0x00fa, B:21:0x0053, B:32:0x00c1, B:34:0x00c9, B:35:0x00d5), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlinx.coroutines.sync.Mutex] */
    @Nullable
    public final Object setDialDefaultColor(int i2, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        z zVar;
        ?? r15;
        int i3;
        DialModule dialModule;
        DialModule dialModule2;
        ?? r3;
        DialModule dialModule3;
        DialData<Boolean> dialData;
        ?? r4;
        ?? r5;
        ChannelResponse channelResponse;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i4 = zVar.y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zVar.y = i4 - Integer.MIN_VALUE;
            } else {
                zVar = new z(continuation);
            }
        } else {
            zVar = new z(continuation);
        }
        Object objWithTimeoutOrNull = zVar.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r6 = zVar.y;
        try {
            try {
                if (r6 != 0) {
                    if (r6 == 1) {
                        i3 = zVar.v;
                        Mutex mutex = (Mutex) zVar.u;
                        DialModule dialModule4 = (DialModule) zVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        r15 = mutex;
                        dialModule = dialModule4;
                    } else {
                        if (r6 == 2) {
                            Mutex mutex2 = (Mutex) zVar.u;
                            dialModule2 = (DialModule) zVar.t;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            r3 = mutex2;
                            if (((Boolean) objWithTimeoutOrNull).booleanValue()) {
                                a0 a0Var = dialModule2.new a0(null);
                                zVar.t = dialModule2;
                                zVar.u = r3;
                                zVar.y = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, a0Var, zVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                dialModule3 = dialModule2;
                                r5 = r3;
                            } else {
                                dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                                r4 = r3;
                            }
                            r4.unlock(null);
                            return dialData;
                        }
                        if (r6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex3 = (Mutex) zVar.u;
                        dialModule3 = (DialModule) zVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        r5 = mutex3;
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                        r4 = r5;
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(16));
                        dialData = dialModule3.parseOpDialResult(channelResponse);
                        r4 = r5;
                    }
                    r4.unlock(null);
                    return dialData;
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex4 = this.mutex;
                zVar.t = this;
                zVar.u = mutex4;
                i3 = i2;
                zVar.v = i3;
                zVar.y = 1;
                if (mutex4.lock(null, zVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r15 = mutex4;
                dialModule = this;
                dialModule.channels.put(Boxing.boxInt(16), ChannelKt.Channel$default(0, null, null, 7, null));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(15);
                byteArrayOutputStream.write(tet.p(i3));
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
                zVar.t = dialModule;
                zVar.u = r15;
                zVar.y = 2;
                Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, byteArray, 0, false, zVar, 6, null);
                if (objSendDataWithResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule2 = dialModule;
                objWithTimeoutOrNull = objSendDataWithResult$default;
                r3 = r15;
                if (((Boolean) objWithTimeoutOrNull).booleanValue()) {
                    dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                    r4 = r3;
                } else {
                    a0 a0Var2 = dialModule2.new a0(null);
                    zVar.t = dialModule2;
                    zVar.u = r3;
                    zVar.y = 3;
                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, a0Var2, zVar);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dialModule3 = dialModule2;
                    r5 = r3;
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                        r4 = r5;
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(16));
                        dialData = dialModule3.parseOpDialResult(channelResponse);
                        r4 = r5;
                    }
                }
                r4.unlock(null);
                return dialData;
            } catch (Throwable th) {
                th = th;
                r15.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r15 = r6;
        }
    }

    @NotNull
    public final DialData<Boolean> setDialDefaultColorSync(int colorId) {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new b0(colorId, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[Catch: all -> 0x0104, TryCatch #2 {all -> 0x0104, blocks: (B:34:0x00d2, B:36:0x00f8, B:39:0x0107), top: B:58:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0107 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:34:0x00d2, B:36:0x00f8, B:39:0x0107), top: B:58:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:43:0x011d, B:45:0x0121, B:46:0x012d), top: B:55:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x012d A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:43:0x011d, B:45:0x0121, B:46:0x012d), top: B:55:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object setDialId(int i2, @NotNull Continuation<? super DialData<Boolean>> continuation) throws Throwable {
        c0 c0Var;
        Mutex mutex;
        DialModule dialModule;
        int i3;
        DialModule dialModule2;
        int i4;
        boolean zBooleanValue;
        DialModule dialModule3;
        Mutex mutex2;
        DialData<Boolean> dialData;
        ChannelResponse channelResponse;
        if (continuation instanceof c0) {
            c0Var = (c0) continuation;
            int i5 = c0Var.y;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0Var.y = i5 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(continuation);
            }
        } else {
            c0Var = new c0(continuation);
        }
        Object objWithTimeoutOrNull = c0Var.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = c0Var.y;
        try {
            if (i6 == 0) {
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex3 = this.mutex;
                c0Var.t = this;
                c0Var.u = mutex3;
                c0Var.v = i2;
                c0Var.y = 1;
                if (mutex3.lock(null, c0Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex3;
                dialModule = this;
                i3 = i2;
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        i4 = c0Var.v;
                        Mutex mutex4 = (Mutex) c0Var.u;
                        dialModule2 = (DialModule) c0Var.t;
                        try {
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            mutex = mutex4;
                            try {
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                t5t.d(TAG, "setDialId:" + i4 + ":result:" + zBooleanValue);
                                if (zBooleanValue) {
                                    d0 d0Var = dialModule2.new d0(null);
                                    c0Var.t = dialModule2;
                                    c0Var.u = mutex;
                                    c0Var.y = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, d0Var, c0Var);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    dialModule3 = dialModule2;
                                    mutex2 = mutex;
                                } else {
                                    dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
                                }
                                mutex.unlock(null);
                                return dialData;
                            } catch (Throwable th) {
                                th = th;
                                mutex4 = mutex;
                                mutex = mutex4;
                                mutex.unlock(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mutex = mutex4;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) c0Var.u;
                    dialModule3 = (DialModule) c0Var.t;
                    try {
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    } catch (Throwable th3) {
                        th = th3;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    if (channelResponse == null) {
                        dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                    } else {
                        dialModule3.channels.remove(Boxing.boxInt(8));
                        dialData = dialModule3.parseOpDialResult(channelResponse);
                    }
                    mutex = mutex2;
                    mutex.unlock(null);
                    return dialData;
                }
                int i7 = c0Var.v;
                Mutex mutex5 = (Mutex) c0Var.u;
                DialModule dialModule4 = (DialModule) c0Var.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                i3 = i7;
                mutex = mutex5;
                dialModule = dialModule4;
            }
            dialModule.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(7);
            byteArrayOutputStream.write(tet.p(i3));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
            c0Var.t = dialModule;
            c0Var.u = mutex;
            c0Var.v = i3;
            c0Var.y = 2;
            DialModule dialModule5 = dialModule;
            Object objSendDataWithResult$default = a.sendDataWithResult$default(dialModule, byteArray, 0, false, c0Var, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            dialModule2 = dialModule5;
            i4 = i3;
            objWithTimeoutOrNull = objSendDataWithResult$default;
            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
            t5t.d(TAG, "setDialId:" + i4 + ":result:" + zBooleanValue);
            if (zBooleanValue) {
                dialData = new DialData<>(b.FAILED, Boxing.boxBoolean(false));
            } else {
                d0 d0Var2 = dialModule2.new d0(null);
                c0Var.t = dialModule2;
                c0Var.u = mutex;
                c0Var.y = 3;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, d0Var2, c0Var);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dialModule3 = dialModule2;
                mutex2 = mutex;
                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                if (channelResponse == null) {
                    dialData = new DialData<>(b.TIME_OUT, Boxing.boxBoolean(false));
                } else {
                    dialModule3.channels.remove(Boxing.boxInt(8));
                    dialData = dialModule3.parseOpDialResult(channelResponse);
                }
                mutex = mutex2;
            }
            mutex.unlock(null);
            return dialData;
        } catch (Throwable th4) {
            th = th4;
            mutex.unlock(null);
            throw th;
        }
    }

    @NotNull
    public final DialData<Boolean> setDialIdSync(int diaId) {
        return (DialData) BuildersKt__BuildersKt.runBlocking$default(null, new e0(diaId, null), 1, null);
    }
}
