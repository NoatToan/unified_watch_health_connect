package com.huami.bluetooth.profile.channel.module;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.BalanceMeasureTimeout;
import defpackage.ChannelResponse;
import defpackage.FamilyMemberVersionInfo;
import defpackage.ScaleBalanceData;
import defpackage.ScaleDataItem;
import defpackage.SettingResult;
import defpackage.a1;
import defpackage.a3;
import defpackage.c3;
import defpackage.dr;
import defpackage.er;
import defpackage.le;
import defpackage.r3;
import defpackage.r8;
import defpackage.t5t;
import defpackage.tet;
import defpackage.yhs;
import defpackage.yk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
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
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001B\u0011\u0012\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J-\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001fJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010 \u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u0011J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u0011J%\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u0004\u0018\u00010,H\u0086@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0086@ø\u0001\u0000¢\u0006\u0004\b2\u00103Je\u0010?\u001a\u00020!2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u00172\u0006\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\n2\b\b\u0002\u0010>\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J#\u0010A\u001a\u00020!2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u00020!2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020!2\u0006\u00104\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020!2\u0006\u00104\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bH\u0010GJ)\u0010I\u001a\u00020!2\u0006\u00104\u001a\u00020\u000e2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0/H\u0086@ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u0019\u0010L\u001a\b\u0012\u0004\u0012\u00020K0/H\u0086@ø\u0001\u0000¢\u0006\u0004\bL\u0010.J!\u0010M\u001a\u00020!2\f\u00101\u001a\b\u0012\u0004\u0012\u00020K0/H\u0086@ø\u0001\u0000¢\u0006\u0004\bM\u00103J!\u0010O\u001a\b\u0012\u0004\u0012\u00020%0\f2\u0006\u0010N\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\b\u0012\u0004\u0012\u00020%0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bQ\u0010.J)\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u00109\u001a\u00020R2\u0006\u0010S\u001a\u00020!H\u0086@ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ#\u0010Y\u001a\u00020!2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020VH\u0086@ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u00109\u001a\u00020RH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010[J;\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010S\u001a\u00020!2\u0018\u0010_\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0]\u0012\u0004\u0012\u00020\u00050\\H\u0086@ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ-\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010S\u001a\u00020!2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010bH\u0086@ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ\u0019\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00140\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bf\u0010.J+\u0010h\u001a\u00020!2\u0016\u0010g\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ)\u0010j\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bj\u0010.R\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR&\u0010s\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR&\u0010u\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010tR&\u0010v\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030r0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010tR\u0014\u0010z\u001a\u00020w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0084\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lm4;", com.xiaomi.onetrack.api.b.I, "", "handleSetModeCommand", "(Lm4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCommand", "handlePageCommand", "", "data", "Lyr;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "parseUsersBound", "([B)Lyr;", "Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$a$a;", "cmdModel", "Ldr;", "getModel", "(Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cmd", "setCmd", "op", "Ljava/io/ByteArrayOutputStream;", "applyByteStream", "(IILjava/lang/Integer;)Ljava/io/ByteArrayOutputStream;", "bytes", "(II[B)Ljava/io/ByteArrayOutputStream;", "bos", "", "sendDataWithResult", "(Ljava/io/ByteArrayOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sliceByteData", "Ler;", "parseUnit", "key", "parseMode", "([BI)Lyr;", "init", "()V", "Lw9;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lv9;", "list", "setFamilyInfos", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "memberId", "avatarId", "gender", "height", "measureMode", "birthDayYear", "birthDayMonth", "nickName", "", "weight", "addOrUpdateFamilyInfo", "(JJIIIIII[BFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMember", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mode", "setMeasureMode", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserID", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserID", "sendMemberIds", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbr;", "getDataItem", "setDataItem", "unit", "setUnit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnit", "Lyk;", "enable", "setModel", "(Lyk;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "businessHost", "accountHost", "setHost", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lyk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "La1;", "Lar;", "callback", "setBalanceMode", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyhs;", "guestData", "setGuestModel", "(ZLyhs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGuestModel", "userIds", "setUsersBound", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsersBound", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "sortModuleChannel", "settingChannel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ScaleSettingModule extends a implements CoroutineScope {
    private static final int ADD_OR_UPDATE_CMD = 3;
    private static final long BALANCE_TIMEOUT = 30000;
    private static final int COMMAND_COMMON = 1;
    private static final int DELETE_MEMBER = 4;
    private static final int DELETE_USER_ID = 7;
    private static final int FAMILY_MEMBER_MODULE = 32;
    private static final int GET_USERS_BOUND = 8;
    public static final int ID_LEN = 6;
    public static final int MEMBER_ID_LEN = 6;
    private static final int OPT_RESPONSE_TYPE = 16;
    private static final int PAGE_ORDER_CMD = 2;
    private static final int PAGE_ORDER_CMD_NOTIFY = 2;
    private static final int PAGE_ORDER_CMD_QUERY = 1;
    private static final int PAGE_ORDER_CMD_SET = 3;
    private static final int PAGE_ORDER_CMD_SET_NOTIFY = 4;
    private static final int SEND_MEMBER_IDS_MODULE = 6;
    private static final int SET_MEASURE_MODE = 5;
    private static final int SET_MODE_CMD = 3;
    private static final int SET_USERS_BOUND = 9;
    private static final int STATUS_OK = 1;

    @NotNull
    private static final String TAG = "FamilyMemberModule";
    private static final long TIME_OUT = 10000;
    private static final int VERSION_QUERY_CMD = 1;
    private static final int VERSION_RESPONSE_TYPE = 2;
    public static final int YEAR_LEN = 2;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> settingChannel;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> sortModuleChannel;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setBalanceMode$response$1", f = "ScaleSettingModule.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
    public static final class a0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Companion.EnumC0270a v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Companion.EnumC0270a enumC0270a, Continuation<? super a0> continuation) {
            super(2, continuation);
            this.v = enumC0270a;
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
            return ScaleSettingModule.this.new a0(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.v.getCmdQuery()));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {138, 139}, m = "addOrUpdateFamilyInfo", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.addOrUpdateFamilyInfo(0L, 0L, 0, 0, 0, 0, 0, 0, null, 0.0f, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {281, 282}, m = "setDataItem", n = {"this"}, s = {"L$0"})
    public static final class b0 extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public b0(Continuation<? super b0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setDataItem(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$addOrUpdateFamilyInfo$response$1", f = "ScaleSettingModule.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
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
            return ScaleSettingModule.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(3));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setDataItem$response$1", f = "ScaleSettingModule.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    public static final class c0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public c0(Continuation<? super c0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new c0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.sortModuleChannel.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {157, 158}, m = "deleteMember", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.deleteMember(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 1, 1, 1}, l = {103, 110}, m = "setFamilyInfos", n = {"this", "list", "this", "result", "it"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3"})
    public static final class d0 extends ContinuationImpl {
        public int A;
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public Object x;
        public /* synthetic */ Object y;

        public d0(Continuation<? super d0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.y = obj;
            this.A |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setFamilyInfos(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$deleteMember$response$1", f = "ScaleSettingModule.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 1, 1}, l = {443, 445}, m = "setGuestModel", n = {"this", "cmdModel", "this", "cmdModel"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e0 extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public e0(Continuation<? super e0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setGuestModel(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {203, 204}, m = "deleteUserID", n = {"this"}, s = {"L$0"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.deleteUserID(0L, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setGuestModel$response$1", f = "ScaleSettingModule.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    public static final class f0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Companion.EnumC0270a v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(Companion.EnumC0270a enumC0270a, Continuation<? super f0> continuation) {
            super(2, continuation);
            this.v = enumC0270a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new f0(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.v.getCmdQuery()));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$deleteUserID$response$1", f = "ScaleSettingModule.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
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
            return ScaleSettingModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(7));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 1}, l = {364, 366}, m = "setHost", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class g0 extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public g0(Continuation<? super g0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setHost(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {249, 250}, m = "getDataItem", n = {"this"}, s = {"L$0"})
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
            return ScaleSettingModule.this.getDataItem(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setHost$response$1", f = "ScaleSettingModule.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
    public static final class h0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public h0(Continuation<? super h0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((h0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new h0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(Companion.EnumC0270a.F.getCmdQuery()));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getDataItem$response$1", f = "ScaleSettingModule.kt", i = {}, l = {VibrateModeSetViewModel.DEFAULT_BBJI}, m = "invokeSuspend", n = {}, s = {})
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
            return ScaleSettingModule.this.new i(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.sortModuleChannel.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {173, 174}, m = "setMeasureMode", n = {"this"}, s = {"L$0"})
    public static final class i0 extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public i0(Continuation<? super i0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setMeasureMode(0L, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 1, 1}, l = {536, 538}, m = "getModel", n = {"this", "cmdModel", "this", "cmdModel"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class j extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.getModel((Companion.EnumC0270a) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setMeasureMode$response$1", f = "ScaleSettingModule.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class j0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public j0(Continuation<? super j0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((j0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new j0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(5));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getModel$response$1", f = "ScaleSettingModule.kt", i = {}, l = {539}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Companion.EnumC0270a v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Companion.EnumC0270a enumC0270a, Continuation<? super k> continuation) {
            super(2, continuation);
            this.v = enumC0270a;
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
            return ScaleSettingModule.this.new k(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.v.getCmdQuery()));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 1, 1}, l = {343, 345}, m = "setModel", n = {"this", "cmdModel", "this", "cmdModel"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class k0 extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public k0(Continuation<? super k0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setModel(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 1}, l = {318, 320}, m = "getUnit", n = {"this", "setUnitCmd", "this"}, s = {"L$0", "L$1", "L$0"})
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
            return ScaleSettingModule.this.getUnit(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setModel$response$1", f = "ScaleSettingModule.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
    public static final class l0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Companion.EnumC0270a v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(Companion.EnumC0270a enumC0270a, Continuation<? super l0> continuation) {
            super(2, continuation);
            this.v = enumC0270a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new l0(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.v.getCmdQuery()));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getUnit$response$1", f = "ScaleSettingModule.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Ref.ObjectRef<Companion.EnumC0270a> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Ref.ObjectRef<Companion.EnumC0270a> objectRef, Continuation<? super m> continuation) {
            super(2, continuation);
            this.v = objectRef;
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
            return ScaleSettingModule.this.new m(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.v.element.getCmdQuery()));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 1}, l = {299, 301}, m = "setUnit", n = {"this", "setUnitCmd", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class m0 extends ContinuationImpl {
        public Object t;
        public Object u;
        public /* synthetic */ Object v;
        public int x;

        public m0(Continuation<? super m0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v = obj;
            this.x |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setUnit(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 1}, l = {494, 496}, m = "getUsersBound", n = {"this", "this"}, s = {"L$0", "L$0"})
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
            return ScaleSettingModule.this.getUsersBound(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setUnit$response$1", f = "ScaleSettingModule.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    public static final class n0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;
        public final /* synthetic */ Ref.ObjectRef<Companion.EnumC0270a> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(Ref.ObjectRef<Companion.EnumC0270a> objectRef, Continuation<? super n0> continuation) {
            super(2, continuation);
            this.v = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((n0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new n0(this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.v.element.getCmdQuery()));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getUsersBound$response$1", f = "ScaleSettingModule.kt", i = {}, l = {497}, m = "invokeSuspend", n = {}, s = {})
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
            return ScaleSettingModule.this.new o(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(8));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {SportReportBaseParser.ReportType.avgDescentRate, SportReportBaseParser.ReportType.descentCount}, m = "setUserID", n = {"this"}, s = {"L$0"})
    public static final class o0 extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public o0(Continuation<? super o0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setUserID(0L, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class p extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$init$1$1", f = "ScaleSettingModule.kt", i = {}, l = {48, 49, 50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ ScaleSettingModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, ScaleSettingModule scaleSettingModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = scaleSettingModule;
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
                    if (this.u.getData().length != 0 && this.u.getData().length > 1) {
                        t5t.d(ScaleSettingModule.TAG, "Response:" + tet.x(this.u.getData()));
                        byte bFirst = ArraysKt___ArraysKt.first(this.u.getData());
                        if (bFirst == 1) {
                            ScaleSettingModule scaleSettingModule = this.v;
                            ChannelResponse channelResponse = this.u;
                            this.t = 1;
                            if (scaleSettingModule.handleCommand(channelResponse, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (bFirst == 2) {
                            ScaleSettingModule scaleSettingModule2 = this.v;
                            ChannelResponse channelResponse2 = this.u;
                            this.t = 2;
                            if (scaleSettingModule2.handlePageCommand(channelResponse2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (bFirst == 3) {
                            ScaleSettingModule scaleSettingModule3 = this.v;
                            ChannelResponse channelResponse3 = this.u;
                            this.t = 3;
                            if (scaleSettingModule3.handleSetModeCommand(channelResponse3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        public p() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ScaleSettingModule scaleSettingModule = ScaleSettingModule.this;
            BuildersKt__Builders_commonKt.launch$default(scaleSettingModule, null, null, new a(it, scaleSettingModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setUserID$response$1", f = "ScaleSettingModule.kt", i = {}, l = {SportReportBaseParser.ReportType.maxWaterTemperature}, m = "invokeSuspend", n = {}, s = {})
    public static final class p0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public p0(Continuation<? super p0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((p0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new p0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(6));
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

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class q extends Lambda implements Function0<CompletableJob> {
        public static final q t = new q();

        public q() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {477, 478}, m = "setUsersBound", n = {"this"}, s = {"L$0"})
    public static final class q0 extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public q0(Continuation<? super q0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setUsersBound(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(byte[] bArr) {
            super(0);
            this.t = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "parseUsersBound usefulData: " + tet.x(this.t);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class r0 extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(byte[] bArr) {
            super(0);
            this.t = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "setUserId: " + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] t;
        public final /* synthetic */ long u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(byte[] bArr, long j) {
            super(0);
            this.t = bArr;
            this.u = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "userIdArr: " + this.t + " userId: " + this.u;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setUsersBound$response$1", f = "ScaleSettingModule.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, s = {})
    public static final class s0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int t;

        public s0(Continuation<? super s0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((s0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new s0(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(9));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {84, 88}, m = "queryVersion", n = {"this"}, s = {"L$0"})
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
            return ScaleSettingModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$queryVersion$response$1", f = "ScaleSettingModule.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
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
            return ScaleSettingModule.this.new u(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {567}, m = "sendDataWithResult", n = {"byteArray"}, s = {"L$0"})
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
            return ScaleSettingModule.this.sendDataWithResult(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {222, SportReportBaseParser.ReportType.targetValueNumber}, m = "sendMemberIds", n = {"this"}, s = {"L$0"})
    public static final class w extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.sendMemberIds(0L, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$sendMemberIds$response$1", f = "ScaleSettingModule.kt", i = {}, l = {SportReportBaseParser.ReportType.avgFreq}, m = "invokeSuspend", n = {}, s = {})
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
            return ScaleSettingModule.this.new x(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(6));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {393, 395}, m = "setBalanceMode", n = {"this", "callback", "cmdModel", "enable", "this", "callback", "cmdModel", "enable"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class y extends ContinuationImpl {
        public Object t;
        public Object u;
        public Object v;
        public Object w;
        public /* synthetic */ Object x;
        public int z;

        public y(Continuation<? super y> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.x = obj;
            this.z |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setBalanceMode(false, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setBalanceMode$2", f = "ScaleSettingModule.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ Function1<a1<ScaleBalanceData>, Unit> u;
        public final /* synthetic */ ScaleSettingModule v;
        public final /* synthetic */ Companion.EnumC0270a w;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setBalanceMode$2$response$1", f = "ScaleSettingModule.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
            public int t;
            public final /* synthetic */ ScaleSettingModule u;
            public final /* synthetic */ Companion.EnumC0270a v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ScaleSettingModule scaleSettingModule, Companion.EnumC0270a enumC0270a, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = scaleSettingModule;
                this.v = enumC0270a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
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
                    Channel channel = (Channel) this.u.settingChannel.get(Boxing.boxInt(this.v.getCmdQuery()));
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
        /* JADX WARN: Multi-variable type inference failed */
        public z(Function1<? super a1<ScaleBalanceData>, Unit> function1, ScaleSettingModule scaleSettingModule, Companion.EnumC0270a enumC0270a, Continuation<? super z> continuation) {
            super(2, continuation);
            this.u = function1;
            this.v = scaleSettingModule;
            this.w = enumC0270a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new z(this.u, this.v, this.w, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if (((defpackage.ScaleBalanceData) ((defpackage.y0) r7).a()).getStatus() == defpackage.ScaleBalanceData.b.STATUS_MEASURE_FINISH) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.t
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 != r3) goto L10
                kotlin.ResultKt.throwOnFailure(r7)
                goto L2f
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                kotlin.ResultKt.throwOnFailure(r7)
            L1b:
                com.huami.bluetooth.profile.channel.module.ScaleSettingModule$z$a r7 = new com.huami.bluetooth.profile.channel.module.ScaleSettingModule$z$a
                com.huami.bluetooth.profile.channel.module.ScaleSettingModule r1 = r6.v
                com.huami.bluetooth.profile.channel.module.ScaleSettingModule$a$a r4 = r6.w
                r7.<init>(r1, r4, r2)
                r6.t = r3
                r4 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r4, r7, r6)
                if (r7 != r0) goto L2f
                return r0
            L2f:
                m4 r7 = (defpackage.ChannelResponse) r7
                if (r7 != 0) goto L3e
                kotlin.jvm.functions.Function1<a1<ar>, kotlin.Unit> r7 = r6.u
                z0 r0 = new z0
                r0.<init>(r2, r3, r2)
                r7.invoke2(r0)
                goto L62
            L3e:
                ar$a r1 = defpackage.ScaleBalanceData.f
                byte[] r7 = r7.getData()
                a1 r7 = r1.a(r7)
                kotlin.jvm.functions.Function1<a1<ar>, kotlin.Unit> r1 = r6.u
                r1.invoke2(r7)
                boolean r1 = r7 instanceof defpackage.y0
                if (r1 != 0) goto L52
                goto L62
            L52:
                y0 r7 = (defpackage.y0) r7
                java.lang.Object r7 = r7.a()
                ar r7 = (defpackage.ScaleBalanceData) r7
                ar$b r7 = r7.getStatus()
                ar$b r1 = defpackage.ScaleBalanceData.b.STATUS_MEASURE_FINISH
                if (r7 != r1) goto L1b
            L62:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.ScaleSettingModule.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleSettingModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.job = LazyKt__LazyJVMKt.lazy(q.t);
        this.channels = new LinkedHashMap();
        this.sortModuleChannel = new LinkedHashMap();
        this.settingChannel = new LinkedHashMap();
    }

    private final ByteArrayOutputStream applyByteStream(int cmd, int setCmd, Integer op) {
        return op == null ? applyByteStream(cmd, setCmd, new byte[0]) : applyByteStream(cmd, setCmd, new byte[]{(byte) op.intValue()});
    }

    public static /* synthetic */ ByteArrayOutputStream applyByteStream$default(ScaleSettingModule scaleSettingModule, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return scaleSettingModule.applyByteStream(i2, i3, num);
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleCommand(ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        Channel<ChannelResponse> channel;
        byte b2 = channelResponse.getData()[1];
        if (b2 == 2) {
            Channel<ChannelResponse> channel2 = this.channels.get(Boxing.boxInt(b2));
            if (channel2 != null) {
                Object objSend = channel2.send(channelResponse, continuation);
                return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }
        } else if (b2 == 16 && (channel = this.channels.get(Boxing.boxInt(channelResponse.getData()[2]))) != null) {
            Object objSend2 = channel.send(channelResponse, continuation);
            return objSend2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend2 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handlePageCommand(ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        Object objSend;
        Channel<ChannelResponse> channel = this.sortModuleChannel.get(Boxing.boxInt(channelResponse.getData()[1]));
        return (channel == null || (objSend = channel.send(channelResponse, continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objSend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSetModeCommand(ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        Object objSend;
        if (channelResponse.getData().length < 2) {
            t5t.d(TAG, "set mode response is ERROR!!!");
            return Unit.INSTANCE;
        }
        Channel<ChannelResponse> channel = this.settingChannel.get(Boxing.boxInt(channelResponse.getData()[1]));
        return (channel == null || (objSend = channel.send(channelResponse, continuation)) != IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objSend;
    }

    private final SettingResult<dr> parseMode(byte[] data, int key) {
        SettingResult<byte[]> settingResultSliceByteData = sliceByteData(data);
        boolean success = settingResultSliceByteData.getSuccess();
        byte[] bArrB = settingResultSliceByteData.b();
        t5t.d(TAG, "cmd:" + key + ":parseMode sliceByteData:" + success + " :" + tet.x(bArrB));
        dr drVarA = null;
        if (success && bArrB != null) {
            int length = bArrB.length;
            byte bFirst = ArraysKt___ArraysKt.first(bArrB);
            int i2 = 1;
            success &= 1 < length;
            if (success) {
                i2 = 2;
                success = bArrB[1] == 1;
            }
            if (bFirst == 0 && success && i2 < length) {
                drVarA = dr.u.a(bArrB[i2]);
            }
        }
        t5t.d(TAG, "parseMode result: " + success + ": " + drVarA);
        this.settingChannel.remove(Integer.valueOf(key));
        return new SettingResult<>(success, drVarA);
    }

    private final SettingResult<er> parseUnit(byte[] data) {
        SettingResult<byte[]> settingResultSliceByteData = sliceByteData(data);
        boolean success = settingResultSliceByteData.getSuccess();
        byte[] bArrB = settingResultSliceByteData.b();
        t5t.d(TAG, "parseUnit sliceByteData:" + success + " :" + tet.x(bArrB));
        er erVarA = null;
        if (success && bArrB != null) {
            int length = bArrB.length;
            byte bFirst = ArraysKt___ArraysKt.first(bArrB);
            int i2 = 1;
            success &= 1 < length;
            if (success) {
                i2 = 2;
                success = bArrB[1] == 1;
            }
            if (bFirst == 0 && success && i2 < length) {
                erVarA = er.u.a(bArrB[i2]);
            }
        }
        t5t.d(TAG, "parseUnit result: " + success + ": " + erVarA);
        this.settingChannel.remove(Integer.valueOf(Companion.EnumC0270a.x.getCmdQuery()));
        return new SettingResult<>(success, erVarA);
    }

    private final SettingResult<ArrayList<Long>> parseUsersBound(byte[] data) {
        if (data.length < 3) {
            return new SettingResult<>(false, null, 2, null);
        }
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(data, new IntRange(3, data.length - 1));
        le.c(TAG, new r(bArrSliceArray));
        ArrayList arrayList = new ArrayList();
        byte bFirst = ArraysKt___ArraysKt.first(bArrSliceArray);
        byte[] bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(bArrSliceArray, new IntRange(1, bArrSliceArray.length - 1));
        int i2 = 0;
        while (i2 < bFirst) {
            int i3 = i2 * 6;
            i2++;
            byte[] bArrSliceArray3 = ArraysKt___ArraysKt.sliceArray(bArrSliceArray2, new IntRange(i3, (i2 * 6) - 1));
            long jB = c3.b(bArrSliceArray3, 0, 0, 3, null);
            le.c(TAG, new s(bArrSliceArray3, jB));
            arrayList.add(Long.valueOf(jB));
        }
        return new SettingResult<>(true, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendDataWithResult(ByteArrayOutputStream byteArrayOutputStream, Continuation<? super SettingResult<Boolean>> continuation) {
        v vVar;
        byte[] byteArray;
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
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
            vVar2.t = byteArray;
            vVar2.w = 1;
            objSendDataWithResult$default = a.sendDataWithResult$default(this, byteArray, 0, false, vVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteArray = (byte[]) vVar2.t;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "send data :" + tet.x(byteArray) + ": result:" + zBooleanValue);
        return new SettingResult(zBooleanValue, null, 2, null);
    }

    public static /* synthetic */ Object setGuestModel$default(ScaleSettingModule scaleSettingModule, boolean z2, yhs yhsVar, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            yhsVar = null;
        }
        return scaleSettingModule.setGuestModel(z2, yhsVar, continuation);
    }

    private final SettingResult<byte[]> sliceByteData(byte[] data) {
        return data.length < 2 ? new SettingResult<>(false, null, 2, null) : new SettingResult<>(true, ArraysKt___ArraysKt.sliceArray(data, new IntRange(2, data.length - 1)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object addOrUpdateFamilyInfo(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull byte[] bArr, float f2, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        b bVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i8 = bVar.w;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.w = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objWithTimeoutOrNull = bVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = bVar.w;
        if (i9 != 0) {
            if (i9 == 1) {
                scaleSettingModule = (ScaleSettingModule) bVar.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(3), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(tet.r(j2, 6));
        byteArrayOutputStream.write(tet.r(j3, 6));
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        byteArrayOutputStream.write(i4);
        byteArrayOutputStream.write(tet.s((short) (100 * f2)));
        byteArrayOutputStream.write(i5);
        byteArrayOutputStream.write(tet.s((short) i6));
        byteArrayOutputStream.write(i7);
        byteArrayOutputStream.write(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        bVar.t = this;
        bVar.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, bVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        c cVar = scaleSettingModule.new c(null);
        bVar.t = null;
        bVar.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, cVar, bVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object deleteMember(long j2, long j3, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        d dVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.w = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object objWithTimeoutOrNull = dVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) dVar2.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(tet.r(j2, 6));
        byteArrayOutputStream.write(tet.r(j3, 6));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        dVar2.t = this;
        dVar2.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, dVar2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        e eVar = scaleSettingModule.new e(null);
        dVar2.t = null;
        dVar2.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, eVar, dVar2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object deleteUserID(long j2, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        f fVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.w = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objWithTimeoutOrNull = fVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) fVar2.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(7), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(7);
        byteArrayOutputStream.write(tet.r(j2, 6));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        fVar2.t = this;
        fVar2.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, fVar2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        g gVar = scaleSettingModule.new g(null);
        fVar2.t = null;
        fVar2.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, gVar, fVar2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[LOOP:0: B:32:0x00bb->B:33:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDataItem(@NotNull Continuation<? super List<ScaleDataItem>> continuation) {
        h hVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        byte[] bArrSliceArray;
        int iFirst;
        ArrayList arrayList;
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
        Object objWithTimeoutOrNull = hVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = hVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) hVar.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null && channelResponse.getData().length >= 3) {
                bArrSliceArray = ArraysKt___ArraysKt.sliceArray(channelResponse.getData(), new IntRange(2, channelResponse.getData().length - 1));
                iFirst = ArraysKt___ArraysKt.first(bArrSliceArray) & 255;
                arrayList = new ArrayList();
                for (int i4 = 0; i4 < iFirst; i4++) {
                    int i5 = i4 * 2;
                    int i6 = bArrSliceArray[1 + i5] & 255;
                    arrayList.add(new ScaleDataItem(r8.u.a(i6), bArrSliceArray[i5 + 2] & 255));
                }
                return arrayList;
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.sortModuleChannel.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(1);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        hVar.t = this;
        hVar.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, hVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        i iVar = scaleSettingModule.new i(null);
        hVar.t = null;
        hVar.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, iVar, hVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        bArrSliceArray = ArraysKt___ArraysKt.sliceArray(channelResponse.getData(), new IntRange(2, channelResponse.getData().length - 1));
        iFirst = ArraysKt___ArraysKt.first(bArrSliceArray) & 255;
        arrayList = new ArrayList();
        while (i4 < iFirst) {
            int i7 = i4 * 2;
            int i8 = bArrSliceArray[1 + i7] & 255;
            arrayList.add(new ScaleDataItem(r8.u.a(i8), bArrSliceArray[i7 + 2] & 255));
        }
        return arrayList;
    }

    @Nullable
    public final Object getGuestModel(@NotNull Continuation<? super SettingResult<dr>> continuation) {
        return getModel(Companion.EnumC0270a.C, continuation);
    }

    @Nullable
    public final Object getModel(@NotNull yk ykVar, @NotNull Continuation<? super SettingResult<dr>> continuation) {
        return getModel(ykVar.getT(), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 32;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.huami.bluetooth.profile.channel.module.ScaleSettingModule$a$a] */
    @Nullable
    public final Object getUnit(@NotNull Continuation<? super SettingResult<er>> continuation) {
        l lVar;
        Ref.ObjectRef objectRef;
        ScaleSettingModule scaleSettingModule;
        ScaleSettingModule scaleSettingModule2;
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
        Object objSendDataWithResult = lVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = lVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                objectRef = (Ref.ObjectRef) lVar.u;
                scaleSettingModule = (ScaleSettingModule) lVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule2 = (ScaleSettingModule) lVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.parseUnit(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objSendDataWithResult);
        objectRef = new Ref.ObjectRef();
        ?? r10 = Companion.EnumC0270a.x;
        objectRef.element = r10;
        this.settingChannel.put(Boxing.boxInt(r10.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream = applyByteStream(((Companion.EnumC0270a) objectRef.element).getCmd(), ((Companion.EnumC0270a) objectRef.element).getSetCmd(), Boxing.boxInt(0));
        lVar.t = this;
        lVar.u = objectRef;
        lVar.x = 1;
        objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream, lVar);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objSendDataWithResult).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        m mVar = scaleSettingModule.new m(objectRef, null);
        lVar.t = scaleSettingModule;
        lVar.u = null;
        lVar.x = 2;
        objSendDataWithResult = TimeoutKt.withTimeoutOrNull(10000L, mVar, lVar);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUsersBound(@NotNull Continuation<? super SettingResult<ArrayList<Long>>> continuation) {
        n nVar;
        ScaleSettingModule scaleSettingModule;
        ScaleSettingModule scaleSettingModule2;
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
        Object objSendDataWithResult = nVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) nVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule2 = (ScaleSettingModule) nVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.parseUsersBound(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objSendDataWithResult);
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(8);
        nVar.t = this;
        nVar.w = 1;
        objSendDataWithResult = sendDataWithResult(byteArrayOutputStream, nVar);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objSendDataWithResult).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        o oVar = scaleSettingModule.new o(null);
        nVar.t = scaleSettingModule;
        nVar.w = 2;
        objSendDataWithResult = TimeoutKt.withTimeoutOrNull(10000L, oVar, nVar);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult;
        if (channelResponse2 == null) {
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getChannelModule(), false, new p(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super FamilyMemberVersionInfo> continuation) {
        t tVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
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
        Object objSendDataWithResult$default = tVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = tVar.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) tVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                return null;
            }
            a3 a3Var = new a3(channelResponse.getData());
            a3Var.a();
            a3Var.a();
            return new FamilyMemberVersionInfo(a3Var.a(), a3Var.a());
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        tVar.t = this;
        tVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{1, 1}, 0, false, tVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            return null;
        }
        u uVar = scaleSettingModule.new u(null);
        tVar.t = null;
        tVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(10000L, uVar, tVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return null;
        }
        a3 a3Var2 = new a3(channelResponse.getData());
        a3Var2.a();
        a3Var2.a();
        return new FamilyMemberVersionInfo(a3Var2.a(), a3Var2.a());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object sendMemberIds(long j2, @NotNull List<Long> list, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        w wVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof w) {
            wVar = (w) continuation;
            int i2 = wVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.w = i2 - Integer.MIN_VALUE;
            } else {
                wVar = new w(continuation);
            }
        } else {
            wVar = new w(continuation);
        }
        w wVar2 = wVar;
        Object objWithTimeoutOrNull = wVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) wVar2.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(tet.r(j2, 6));
        byteArrayOutputStream.write(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(tet.r(((Number) it.next()).longValue(), 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        wVar2.t = this;
        wVar2.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, wVar2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        x xVar = scaleSettingModule.new x(null);
        wVar2.t = null;
        wVar2.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, xVar, wVar2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    public final Object setBalanceMode(boolean z2, @NotNull Function1<? super a1<ScaleBalanceData>, Unit> function1, @NotNull Continuation<? super a1<ScaleBalanceData>> continuation) {
        y yVar;
        dr drVar;
        Function1<? super a1<ScaleBalanceData>, Unit> function2;
        ScaleSettingModule scaleSettingModule;
        Companion.EnumC0270a enumC0270a;
        Function1<? super a1<ScaleBalanceData>, Unit> function3;
        ScaleSettingModule scaleSettingModule2;
        dr drVar2;
        ChannelResponse channelResponse;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i2 = yVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.z = i2 - Integer.MIN_VALUE;
            } else {
                yVar = new y(continuation);
            }
        } else {
            yVar = new y(continuation);
        }
        y yVar2 = yVar;
        Object objSendDataWithResult = yVar2.x;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = yVar2.z;
        if (i3 != 0) {
            if (i3 == 1) {
                dr drVar3 = (dr) yVar2.w;
                enumC0270a = (Companion.EnumC0270a) yVar2.v;
                Function1<? super a1<ScaleBalanceData>, Unit> function4 = (Function1) yVar2.u;
                scaleSettingModule = (ScaleSettingModule) yVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
                drVar = drVar3;
                function2 = function4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                drVar2 = (dr) yVar2.w;
                enumC0270a = (Companion.EnumC0270a) yVar2.v;
                function3 = (Function1) yVar2.u;
                ScaleSettingModule scaleSettingModule3 = (ScaleSettingModule) yVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
                scaleSettingModule2 = scaleSettingModule3;
            }
            channelResponse = (ChannelResponse) objSendDataWithResult;
            if (channelResponse == null) {
                return new BalanceMeasureTimeout(null, 1, null);
            }
            if (drVar2 == dr.EnterMode) {
                BuildersKt__Builders_commonKt.launch$default(scaleSettingModule2, null, null, new z(function3, scaleSettingModule2, enumC0270a, null), 3, null);
            }
            return ScaleBalanceData.f.a(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objSendDataWithResult);
        Companion.EnumC0270a enumC0270a2 = Companion.EnumC0270a.z;
        this.settingChannel.put(Boxing.boxInt(enumC0270a2.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        drVar = z2 ? dr.EnterMode : dr.ExitMode;
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream$default = applyByteStream$default(this, enumC0270a2.getCmd(), enumC0270a2.getSetCmd(), null, 4, null);
        byteArrayOutputStreamApplyByteStream$default.write(drVar.getT());
        yVar2.t = this;
        function2 = function1;
        yVar2.u = function2;
        yVar2.v = enumC0270a2;
        yVar2.w = drVar;
        yVar2.z = 1;
        objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream$default, yVar2);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        enumC0270a = enumC0270a2;
        if (!((SettingResult) objSendDataWithResult).getSuccess()) {
            return a1.a.a(a1.f504a, "Send balance command failed", 0, 2, null);
        }
        a0 a0Var = scaleSettingModule.new a0(enumC0270a, null);
        yVar2.t = scaleSettingModule;
        yVar2.u = function2;
        yVar2.v = enumC0270a;
        yVar2.w = drVar;
        yVar2.z = 2;
        objSendDataWithResult = TimeoutKt.withTimeoutOrNull(10000L, a0Var, yVar2);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        function3 = function2;
        scaleSettingModule2 = scaleSettingModule;
        drVar2 = drVar;
        channelResponse = (ChannelResponse) objSendDataWithResult;
        if (channelResponse == null) {
            return new BalanceMeasureTimeout(null, 1, null);
        }
        if (drVar2 == dr.EnterMode) {
            BuildersKt__Builders_commonKt.launch$default(scaleSettingModule2, null, null, new z(function3, scaleSettingModule2, enumC0270a, null), 3, null);
        }
        return ScaleBalanceData.f.a(channelResponse.getData());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object setDataItem(@NotNull List<ScaleDataItem> list, @NotNull Continuation<? super Boolean> continuation) {
        b0 b0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof b0) {
            b0Var = (b0) continuation;
            int i2 = b0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.w = i2 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(continuation);
            }
        } else {
            b0Var = new b0(continuation);
        }
        b0 b0Var2 = b0Var;
        Object objWithTimeoutOrNull = b0Var2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = b0Var2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) b0Var2.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null && channelResponse.getData().length >= 3) {
                return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
            }
            return Boxing.boxBoolean(false);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.sortModuleChannel.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(list.size());
        for (ScaleDataItem scaleDataItem : list) {
            byteArrayOutputStream.write(scaleDataItem.getType().getT());
            byteArrayOutputStream.write(scaleDataItem.getStatus());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        b0Var2.t = this;
        b0Var2.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, b0Var2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        c0 c0Var = scaleSettingModule.new c0(null);
        b0Var2.t = null;
        b0Var2.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, c0Var, b0Var2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x013d  */
    /* JADX WARN: Code duplicated, block: B:43:0x014e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0151  */
    /* JADX WARN: Code duplicated, block: B:45:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013d -> B:41:0x0146). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setFamilyInfos(@org.jetbrains.annotations.NotNull java.util.List<defpackage.FamilyMemberInfo> r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.ScaleSettingModule.setFamilyInfos(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setGuestModel(boolean z2, @Nullable yhs yhsVar, @NotNull Continuation<? super SettingResult<dr>> continuation) {
        e0 e0Var;
        ScaleSettingModule scaleSettingModule;
        Companion.EnumC0270a enumC0270a;
        ScaleSettingModule scaleSettingModule2;
        if (continuation instanceof e0) {
            e0Var = (e0) continuation;
            int i2 = e0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.x = i2 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(continuation);
            }
        } else {
            e0Var = new e0(continuation);
        }
        Object objWithTimeoutOrNull = e0Var.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = e0Var.x;
        if (i3 != 0) {
            if (i3 == 1) {
                enumC0270a = (Companion.EnumC0270a) e0Var.u;
                scaleSettingModule = (ScaleSettingModule) e0Var.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC0270a = (Companion.EnumC0270a) e0Var.u;
                scaleSettingModule2 = (ScaleSettingModule) e0Var.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            ChannelResponse channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.parseMode(channelResponse.getData(), enumC0270a.getCmdQuery());
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Companion.EnumC0270a enumC0270a2 = Companion.EnumC0270a.C;
        this.settingChannel.put(Boxing.boxInt(enumC0270a2.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        dr drVar = z2 ? dr.EnterMode : dr.ExitMode;
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream = applyByteStream(enumC0270a2.getCmd(), enumC0270a2.getSetCmd(), Boxing.boxInt(1));
        byteArrayOutputStreamApplyByteStream.write(drVar.getT());
        e0Var.t = this;
        e0Var.u = enumC0270a2;
        e0Var.x = 1;
        Object objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream, e0Var);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        objWithTimeoutOrNull = objSendDataWithResult;
        enumC0270a = enumC0270a2;
        if (!((SettingResult) objWithTimeoutOrNull).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        f0 f0Var = scaleSettingModule.new f0(enumC0270a, null);
        e0Var.t = scaleSettingModule;
        e0Var.u = enumC0270a;
        e0Var.x = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, f0Var, e0Var);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object setHost(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        g0 g0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        byte[] bArrB;
        if (continuation instanceof g0) {
            g0Var = (g0) continuation;
            int i2 = g0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.w = i2 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(continuation);
            }
        } else {
            g0Var = new g0(continuation);
        }
        g0 g0Var2 = g0Var;
        Object objSendDataWithResult = g0Var2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = g0Var2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) g0Var2.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule = (ScaleSettingModule) g0Var2.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            SettingResult<byte[]> settingResultSliceByteData = scaleSettingModule.sliceByteData(channelResponse.getData());
            return Boxing.boxBoolean((settingResultSliceByteData.getSuccess() || (bArrB = settingResultSliceByteData.b()) == null || ArraysKt___ArraysKt.first(bArrB) != 1) ? false : true);
        }
        ResultKt.throwOnFailure(objSendDataWithResult);
        Map<Integer, Channel<ChannelResponse>> map = this.settingChannel;
        Companion.EnumC0270a enumC0270a = Companion.EnumC0270a.F;
        map.put(Boxing.boxInt(enumC0270a.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream$default = applyByteStream$default(this, enumC0270a.getCmd(), enumC0270a.getSetCmd(), null, 4, null);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStreamApplyByteStream$default.write(bytes);
        byteArrayOutputStreamApplyByteStream$default.write(0);
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byteArrayOutputStreamApplyByteStream$default.write(bytes2);
        byteArrayOutputStreamApplyByteStream$default.write(0);
        g0Var2.t = this;
        g0Var2.w = 1;
        objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream$default, g0Var2);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objSendDataWithResult).getSuccess()) {
            return Boxing.boxBoolean(false);
        }
        h0 h0Var = scaleSettingModule.new h0(null);
        g0Var2.t = scaleSettingModule;
        g0Var2.w = 2;
        objSendDataWithResult = TimeoutKt.withTimeoutOrNull(10000L, h0Var, g0Var2);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        SettingResult<byte[]> settingResultSliceByteData2 = scaleSettingModule.sliceByteData(channelResponse.getData());
        return Boxing.boxBoolean((settingResultSliceByteData2.getSuccess() || (bArrB = settingResultSliceByteData2.b()) == null || ArraysKt___ArraysKt.first(bArrB) != 1) ? false : true);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object setMeasureMode(long j2, int i2, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        i0 i0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof i0) {
            i0Var = (i0) continuation;
            int i3 = i0Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i0Var.w = i3 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(continuation);
            }
        } else {
            i0Var = new i0(continuation);
        }
        i0 i0Var2 = i0Var;
        Object objWithTimeoutOrNull = i0Var2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = i0Var2.w;
        if (i4 != 0) {
            if (i4 == 1) {
                scaleSettingModule = (ScaleSettingModule) i0Var2.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(5), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(tet.r(j2, 6));
        byteArrayOutputStream.write(i2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        i0Var2.t = this;
        i0Var2.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, i0Var2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        j0 j0Var = scaleSettingModule.new j0(null);
        i0Var2.t = null;
        i0Var2.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, j0Var, i0Var2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setModel(@NotNull yk ykVar, boolean z2, @NotNull Continuation<? super SettingResult<dr>> continuation) {
        k0 k0Var;
        Companion.EnumC0270a t2;
        ScaleSettingModule scaleSettingModule;
        if (continuation instanceof k0) {
            k0Var = (k0) continuation;
            int i2 = k0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.x = i2 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(continuation);
            }
        } else {
            k0Var = new k0(continuation);
        }
        Object objSendDataWithResult = k0Var.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = k0Var.x;
        if (i3 != 0) {
            if (i3 == 1) {
                t2 = (Companion.EnumC0270a) k0Var.u;
                scaleSettingModule = (ScaleSettingModule) k0Var.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t2 = (Companion.EnumC0270a) k0Var.u;
                scaleSettingModule = (ScaleSettingModule) k0Var.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule.parseMode(channelResponse.getData(), t2.getCmdQuery());
        }
        ResultKt.throwOnFailure(objSendDataWithResult);
        t2 = ykVar.getT();
        this.settingChannel.put(Boxing.boxInt(t2.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        dr drVar = z2 ? dr.EnterMode : dr.ExitMode;
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream = applyByteStream(t2.getCmd(), t2.getSetCmd(), Boxing.boxInt(1));
        byteArrayOutputStreamApplyByteStream.write(drVar.getT());
        k0Var.t = this;
        k0Var.u = t2;
        k0Var.x = 1;
        objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream, k0Var);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objSendDataWithResult).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        l0 l0Var = scaleSettingModule.new l0(t2, null);
        k0Var.t = scaleSettingModule;
        k0Var.u = t2;
        k0Var.x = 2;
        objSendDataWithResult = TimeoutKt.withTimeoutOrNull(10000L, l0Var, k0Var);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.huami.bluetooth.profile.channel.module.ScaleSettingModule$a$a] */
    @Nullable
    public final Object setUnit(int i2, @NotNull Continuation<? super SettingResult<er>> continuation) {
        m0 m0Var;
        Ref.ObjectRef objectRef;
        Object obj;
        ScaleSettingModule scaleSettingModule;
        if (continuation instanceof m0) {
            m0Var = (m0) continuation;
            int i3 = m0Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m0Var.x = i3 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(continuation);
            }
        } else {
            m0Var = new m0(continuation);
        }
        Object objWithTimeoutOrNull = m0Var.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = m0Var.x;
        if (i4 != 0) {
            if (i4 == 1) {
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) m0Var.u;
                ScaleSettingModule scaleSettingModule2 = (ScaleSettingModule) m0Var.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                objectRef = objectRef2;
                scaleSettingModule = scaleSettingModule2;
                obj = objWithTimeoutOrNull;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule = (ScaleSettingModule) m0Var.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            ChannelResponse channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule.parseUnit(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        objectRef = new Ref.ObjectRef();
        ?? r2 = Companion.EnumC0270a.x;
        objectRef.element = r2;
        this.settingChannel.put(Boxing.boxInt(r2.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        er erVarA = er.u.a(i2);
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream = applyByteStream(((Companion.EnumC0270a) objectRef.element).getCmd(), ((Companion.EnumC0270a) objectRef.element).getSetCmd(), Boxing.boxInt(1));
        byteArrayOutputStreamApplyByteStream.write(erVarA.getT());
        m0Var.t = this;
        m0Var.u = objectRef;
        m0Var.x = 1;
        Object objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream, m0Var);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objSendDataWithResult;
        scaleSettingModule = this;
        if (!((SettingResult) obj).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        n0 n0Var = scaleSettingModule.new n0(objectRef, null);
        m0Var.t = scaleSettingModule;
        m0Var.u = null;
        m0Var.x = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, n0Var, m0Var);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Nullable
    public final Object setUserID(long j2, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        o0 o0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof o0) {
            o0Var = (o0) continuation;
            int i2 = o0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0Var.w = i2 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(continuation);
            }
        } else {
            o0Var = new o0(continuation);
        }
        o0 o0Var2 = o0Var;
        Object objWithTimeoutOrNull = o0Var2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o0Var2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) o0Var2.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(tet.r(j2, 6));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        o0Var2.t = this;
        o0Var2.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, o0Var2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        p0 p0Var = scaleSettingModule.new p0(null);
        o0Var2.t = null;
        o0Var2.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, p0Var, o0Var2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setUsersBound(@NotNull ArrayList<Long> arrayList, @NotNull Continuation<? super Boolean> continuation) throws IOException {
        q0 q0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof q0) {
            q0Var = (q0) continuation;
            int i2 = q0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.w = i2 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(continuation);
            }
        } else {
            q0Var = new q0(continuation);
        }
        Object objWithTimeoutOrNull = q0Var.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = q0Var.w;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) q0Var.t;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.channels.put(Boxing.boxInt(9), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(9);
        byteArrayOutputStream.write(arrayList.size());
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArrR = tet.r(((Number) it.next()).longValue(), 6);
            le.c(TAG, new r0(bArrR));
            byteArrayOutputStream.write(bArrR);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        q0Var.t = this;
        q0Var.w = 1;
        if (a.sendDataWithResult$default(this, byteArray, 0, false, q0Var, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        s0 s0Var = scaleSettingModule.new s0(null);
        q0Var.t = null;
        q0Var.w = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, s0Var, q0Var);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getModel(Companion.EnumC0270a enumC0270a, Continuation<? super SettingResult<dr>> continuation) {
        j jVar;
        ScaleSettingModule scaleSettingModule;
        ScaleSettingModule scaleSettingModule2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.x = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objSendDataWithResult = jVar.v;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.x;
        if (i3 != 0) {
            if (i3 == 1) {
                enumC0270a = (Companion.EnumC0270a) jVar.u;
                scaleSettingModule = (ScaleSettingModule) jVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enumC0270a = (Companion.EnumC0270a) jVar.u;
                scaleSettingModule2 = (ScaleSettingModule) jVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult);
            }
            ChannelResponse channelResponse = (ChannelResponse) objSendDataWithResult;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.parseMode(channelResponse.getData(), enumC0270a.getCmdQuery());
        }
        ResultKt.throwOnFailure(objSendDataWithResult);
        this.settingChannel.put(Boxing.boxInt(enumC0270a.getCmdQuery()), ChannelKt.Channel$default(0, null, null, 7, null));
        ByteArrayOutputStream byteArrayOutputStreamApplyByteStream = applyByteStream(enumC0270a.getCmd(), enumC0270a.getSetCmd(), Boxing.boxInt(0));
        jVar.t = this;
        jVar.u = enumC0270a;
        jVar.x = 1;
        objSendDataWithResult = sendDataWithResult(byteArrayOutputStreamApplyByteStream, jVar);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objSendDataWithResult).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        k kVar = scaleSettingModule.new k(enumC0270a, null);
        jVar.t = scaleSettingModule;
        jVar.u = enumC0270a;
        jVar.x = 2;
        objSendDataWithResult = TimeoutKt.withTimeoutOrNull(10000L, kVar, jVar);
        if (objSendDataWithResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objSendDataWithResult;
        if (channelResponse2 == null) {
        }
    }

    private final ByteArrayOutputStream applyByteStream(int cmd, int setCmd, byte[] bytes) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(cmd);
        byteArrayOutputStream.write(setCmd);
        byteArrayOutputStream.write(bytes);
        return byteArrayOutputStream;
    }
}
