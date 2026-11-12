package com.huami.bluetooth.profile.channel.module;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureTimeout;
import com.huami.bluetooth.profile.channel.module.scale.BalanceResult;
import com.huami.bluetooth.utils.ByteDecoder;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
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
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0001\u007fB\u000f\u0012\u0006\u0010|\u001a\u00020{¢\u0006\u0004\b}\u0010~J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J&\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\nH\u0002J!\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0006\u0010\u001f\u001a\u00020\u001aH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0005H\u0016J\u0015\u0010*\u001a\u0004\u0018\u00010)H\u0086@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0086@ø\u0001\u0000¢\u0006\u0004\b/\u00100Je\u0010<\u001a\u00020 2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u00020:H\u0086@ø\u0001\u0000¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020 2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u00020 2\u0006\u00101\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\u00020 2\u0006\u00101\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001b\u0010E\u001a\u00020 2\u0006\u00101\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bE\u0010DJ)\u0010F\u001a\u00020 2\u0006\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0086@ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\b\u0012\u0004\u0012\u00020H0,H\u0086@ø\u0001\u0000¢\u0006\u0004\bI\u0010+J!\u0010J\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020H0,H\u0086@ø\u0001\u0000¢\u0006\u0004\bJ\u00100J!\u0010L\u001a\b\u0012\u0004\u0012\u00020$0\f2\u0006\u0010K\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\b\u0012\u0004\u0012\u00020$0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bN\u0010+J)\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u00106\u001a\u00020O2\u0006\u0010P\u001a\u00020 H\u0086@ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ#\u0010V\u001a\u00020 2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020SH\u0086@ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u00106\u001a\u00020OH\u0086@ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ;\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010P\u001a\u00020 2\u0018\u0010]\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[\u0012\u0004\u0012\u00020\u00050ZH\u0086@ø\u0001\u0000¢\u0006\u0004\b^\u0010_J-\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010P\u001a\u00020 2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010`H\u0086@ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ\u0019\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00130\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bd\u0010+J+\u0010f\u001a\u00020 2\u0016\u0010e\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ)\u0010h\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bh\u0010+R\u001d\u0010m\u001a\u00020i8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010j\u001a\u0004\bk\u0010lR(\u0010q\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030o0n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010pR(\u0010r\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030o0n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010pR(\u0010s\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030o0n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010pR\u0016\u0010w\u001a\u00020t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010z\u001a\u00020\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0080\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", com.loc.z.j, "(Lcom/huami/bluetooth/profile/channel/ChannelResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "i", "", "data", "Lcom/huami/bluetooth/profile/channel/module/SettingResult;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "m", "Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$Companion$SettingCmd;", "cmdModel", "Lcom/huami/bluetooth/profile/channel/module/ScaleMode;", "g", "(Lcom/huami/bluetooth/profile/channel/module/ScaleSettingModule$Companion$SettingCmd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", Constant.h, "setCmd", AdRemindParserKt.KEY_OP, "Ljava/io/ByteArrayOutputStream;", "c", "(IILjava/lang/Integer;)Ljava/io/ByteArrayOutputStream;", HTTP.CONTENT_RANGE_BYTES, GoogleApiAvailabilityLight.a, "bos", "", GoogleApiAvailabilityLight.b, "(Ljava/io/ByteArrayOutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "Lcom/huami/bluetooth/profile/channel/module/ScaleUnit;", "l", "key", hl.k, PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/FamilyMemberVersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/FamilyMemberInfo;", "list", "setFamilyInfos", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", ParamKey.memberId, "avatarId", "gender", "height", "measureMode", "birthDayYear", "birthDayMonth", "nickName", "", "weight", "addOrUpdateFamilyInfo", "(JJIIIIII[BFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMember", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mode", "setMeasureMode", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserID", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserID", "sendMemberIds", "(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/ScaleDataItem;", "getDataItem", "setDataItem", "unit", "setUnit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnit", "Lcom/huami/bluetooth/profile/channel/module/MeasureMode;", "enable", "setModel", "(Lcom/huami/bluetooth/profile/channel/module/MeasureMode;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "businessHost", "accountHost", "setHost", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getModel", "(Lcom/huami/bluetooth/profile/channel/module/MeasureMode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/scale/BalanceResult;", "Lcom/huami/bluetooth/profile/channel/module/ScaleBalanceData;", "callback", "setBalanceMode", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/ScaleGuestData;", "guestData", "setGuestModel", "(ZLcom/huami/bluetooth/profile/channel/module/ScaleGuestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGuestModel", "userIds", "setUsersBound", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsersBound", "Lkotlinx/coroutines/Job;", "Lkotlin/Lazy;", "f", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Ljava/util/Map;", "channels", "sortModuleChannel", "settingChannel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ScaleSettingModule extends BaseModule implements CoroutineScope {
    private static final int A = 16;
    private static final int B = 1;

    @NotNull
    private static final String C = "FamilyMemberModule";
    private static final int D = 32;
    private static final long E = 10000;
    private static final long F = 30000;
    public static final int ID_LEN = 6;
    public static final int MEMBER_ID_LEN = 6;
    public static final int YEAR_LEN = 2;
    private static final int k = 1;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;
    private static final int q = 6;
    private static final int r = 7;
    private static final int s = 8;
    private static final int t = 9;
    private static final int u = 2;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;
    private static final int y = 4;
    private static final int z = 3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> sortModuleChannel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> settingChannel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {138, 139}, m = "addOrUpdateFamilyInfo", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.addOrUpdateFamilyInfo(0L, 0L, 0, 0, 0, 0, 0, 0, null, 0.0f, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {281, 282}, m = "setDataItem", n = {}, s = {})
    public static final class a0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a0(Continuation<? super a0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setDataItem(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$addOrUpdateFamilyInfo$response$1", f = "ScaleSettingModule.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new b(continuation);
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
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(3));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setDataItem$response$1", f = "ScaleSettingModule.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
    public static final class b0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public b0(Continuation<? super b0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new b0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.sortModuleChannel.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {157, 158}, m = "deleteMember", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.deleteMember(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {1, 1}, l = {103, 110}, m = "setFamilyInfos", n = {"result", "it"}, s = {"L$1", "L$3"})
    public static final class c0 extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public c0(Continuation<? super c0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setFamilyInfos(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$deleteMember$response$1", f = "ScaleSettingModule.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(4));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {443, 445}, m = "setGuestModel", n = {}, s = {})
    public static final class d0 extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d0(Continuation<? super d0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setGuestModel(false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {203, 204}, m = "deleteUserID", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.deleteUserID(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setGuestModel$response$1", f = "ScaleSettingModule.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    public static final class e0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Companion.SettingCmd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Companion.SettingCmd settingCmd, Continuation<? super e0> continuation) {
            super(2, continuation);
            this.c = settingCmd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new e0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.c.getCmdQuery()));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$deleteUserID$response$1", f = "ScaleSettingModule.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(7));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {364, 366}, m = "setHost", n = {}, s = {})
    public static final class f0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public f0(Continuation<? super f0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setHost(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {249, 250}, m = "getDataItem", n = {}, s = {})
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
            return ScaleSettingModule.this.getDataItem(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setHost$response$1", f = "ScaleSettingModule.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
    public static final class g0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public g0(Continuation<? super g0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new g0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(Companion.SettingCmd.SET_HOST.getCmdQuery()));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getDataItem$response$1", f = "ScaleSettingModule.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new h(continuation);
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
                Channel channel = (Channel) ScaleSettingModule.this.sortModuleChannel.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHESS, DataTypeSource.SPORT_TYPE_CHECKERS}, m = "setMeasureMode", n = {}, s = {})
    public static final class h0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setMeasureMode(0L, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {536, 538}, m = "getModel", n = {}, s = {})
    public static final class i extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.g(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setMeasureMode$response$1", f = "ScaleSettingModule.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    public static final class i0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public i0(Continuation<? super i0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new i0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(5));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getModel$response$1", f = "ScaleSettingModule.kt", i = {}, l = {539}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Companion.SettingCmd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Companion.SettingCmd settingCmd, Continuation<? super j> continuation) {
            super(2, continuation);
            this.c = settingCmd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new j(this.c, continuation);
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
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.c.getCmdQuery()));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {PnP.ID_HUAMI, 345}, m = "setModel", n = {}, s = {})
    public static final class j0 extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public j0(Continuation<? super j0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setModel(null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH}, m = "getUnit", n = {}, s = {})
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
            return ScaleSettingModule.this.getUnit(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setModel$response$1", f = "ScaleSettingModule.kt", i = {}, l = {SportDeviceUtils.SOURCE_PROVENCE}, m = "invokeSuspend", n = {}, s = {})
    public static final class k0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Companion.SettingCmd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(Companion.SettingCmd settingCmd, Continuation<? super k0> continuation) {
            super(2, continuation);
            this.c = settingCmd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new k0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((k0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.c.getCmdQuery()));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getUnit$response$1", f = "ScaleSettingModule.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Ref.ObjectRef<Companion.SettingCmd> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Ref.ObjectRef<Companion.SettingCmd> objectRef, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new l(this.c, continuation);
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
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.c.element.getCmdQuery()));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {299, 301}, m = "setUnit", n = {}, s = {})
    public static final class l0 extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public l0(Continuation<? super l0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setUnit(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {494, 496}, m = "getUsersBound", n = {}, s = {})
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
            return ScaleSettingModule.this.getUsersBound(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setUnit$response$1", f = "ScaleSettingModule.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    public static final class m0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Ref.ObjectRef<Companion.SettingCmd> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(Ref.ObjectRef<Companion.SettingCmd> objectRef, Continuation<? super m0> continuation) {
            super(2, continuation);
            this.c = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new m0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((m0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.c.element.getCmdQuery()));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$getUsersBound$response$1", f = "ScaleSettingModule.kt", i = {}, l = {497}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new n(continuation);
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
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(8));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {188, 189}, m = "setUserID", n = {}, s = {})
    public static final class n0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public n0(Continuation<? super n0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setUserID(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$init$1$1", f = "ScaleSettingModule.kt", i = {}, l = {48, 49, 50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ ScaleSettingModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, ScaleSettingModule scaleSettingModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = scaleSettingModule;
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
                    if (this.b.getData().length == 0) {
                        return Unit.INSTANCE;
                    }
                    if (this.b.getData().length <= 1) {
                        return Unit.INSTANCE;
                    }
                    Debug.fi(ScaleSettingModule.C, Intrinsics.stringPlus("Response:", GattUtils.bytesToHexString(this.b.getData())));
                    byte bFirst = ArraysKt___ArraysKt.first(this.b.getData());
                    if (bFirst == 1) {
                        ScaleSettingModule scaleSettingModule = this.c;
                        ChannelResponse channelResponse = this.b;
                        this.a = 1;
                        if (scaleSettingModule.h(channelResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (bFirst == 2) {
                        ScaleSettingModule scaleSettingModule2 = this.c;
                        ChannelResponse channelResponse2 = this.b;
                        this.a = 2;
                        if (scaleSettingModule2.i(channelResponse2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (bFirst == 3) {
                        ScaleSettingModule scaleSettingModule3 = this.c;
                        ChannelResponse channelResponse3 = this.b;
                        this.a = 3;
                        if (scaleSettingModule3.j(channelResponse3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
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
            ScaleSettingModule scaleSettingModule = ScaleSettingModule.this;
            kotlinx.coroutines.e.f(scaleSettingModule, null, null, new a(channelResponse, scaleSettingModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setUserID$response$1", f = "ScaleSettingModule.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public o0(Continuation<? super o0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new o0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(6));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Job> {
        public static final p a = new p();

        public p() {
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {477, 478}, m = "setUsersBound", n = {}, s = {})
    public static final class p0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public p0(Continuation<? super p0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setUsersBound(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parseUsersBound usefulData: ", GattUtils.bytesToHexString(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q0 extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("setUserId: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(byte[] bArr, long j) {
            super(0);
            this.a = bArr;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userIdArr: " + this.a + " userId: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setUsersBound$response$1", f = "ScaleSettingModule.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, s = {})
    public static final class r0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public r0(Continuation<? super r0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new r0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((r0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(9));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {84, 88}, m = "queryVersion", n = {}, s = {})
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
            return ScaleSettingModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$queryVersion$response$1", f = "ScaleSettingModule.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new t(continuation);
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
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(2));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0}, l = {567}, m = "sendDataWithResult", n = {"byteArray"}, s = {"L$0"})
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
            return ScaleSettingModule.this.n(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {}, l = {222, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY}, m = "sendMemberIds", n = {}, s = {})
    public static final class v extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.sendMemberIds(0L, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$sendMemberIds$response$1", f = "ScaleSettingModule.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.channels.get(Boxing.boxInt(6));
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule", f = "ScaleSettingModule.kt", i = {0, 1}, l = {393, 395}, m = "setBalanceMode", n = {"enable", "enable"}, s = {"L$3", "L$3"})
    public static final class x extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return ScaleSettingModule.this.setBalanceMode(false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setBalanceMode$2", f = "ScaleSettingModule.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function1<BalanceResult<ScaleBalanceData>, Unit> b;
        public final /* synthetic */ ScaleSettingModule c;
        public final /* synthetic */ Companion.SettingCmd d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setBalanceMode$2$response$1", f = "ScaleSettingModule.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
            public int a;
            public final /* synthetic */ ScaleSettingModule b;
            public final /* synthetic */ Companion.SettingCmd c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ScaleSettingModule scaleSettingModule, Companion.SettingCmd settingCmd, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = scaleSettingModule;
                this.c = settingCmd;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.b.settingChannel.get(Boxing.boxInt(this.c.getCmdQuery()));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(Function1<? super BalanceResult<ScaleBalanceData>, Unit> function1, ScaleSettingModule scaleSettingModule, Companion.SettingCmd settingCmd, Continuation<? super y> continuation) {
            super(2, continuation);
            this.b = function1;
            this.c = scaleSettingModule;
            this.d = settingCmd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new y(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0032  */
        /* JADX WARN: Code duplicated, block: B:15:0x003a  */
        /* JADX WARN: Code duplicated, block: B:16:0x0045  */
        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:13:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.throwOnFailure(r10)
                r1 = r0
                r0 = r9
                goto L36
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = r9
            L1e:
                r4 = 30000(0x7530, double:1.4822E-319)
                com.huami.bluetooth.profile.channel.module.ScaleSettingModule$y$a r1 = new com.huami.bluetooth.profile.channel.module.ScaleSettingModule$y$a
                com.huami.bluetooth.profile.channel.module.ScaleSettingModule r6 = r10.c
                com.huami.bluetooth.profile.channel.module.ScaleSettingModule$Companion$SettingCmd r7 = r10.d
                r1.<init>(r6, r7, r2)
                r10.a = r3
                java.lang.Object r1 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r4, r1, r10)
                if (r1 != r0) goto L32
                return r0
            L32:
                r8 = r0
                r0 = r10
                r10 = r1
                r1 = r8
            L36:
                com.huami.bluetooth.profile.channel.ChannelResponse r10 = (com.huami.bluetooth.profile.channel.ChannelResponse) r10
                if (r10 != 0) goto L45
                kotlin.jvm.functions.Function1<com.huami.bluetooth.profile.channel.module.scale.BalanceResult<com.huami.bluetooth.profile.channel.module.ScaleBalanceData>, kotlin.Unit> r10 = r0.b
                com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureTimeout r0 = new com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureTimeout
                r0.<init>(r2, r3, r2)
                r10.invoke(r0)
                goto L69
            L45:
                com.huami.bluetooth.profile.channel.module.ScaleBalanceData$Companion r4 = com.huami.bluetooth.profile.channel.module.ScaleBalanceData.INSTANCE
                byte[] r10 = r10.getData()
                com.huami.bluetooth.profile.channel.module.scale.BalanceResult r10 = r4.parse(r10)
                kotlin.jvm.functions.Function1<com.huami.bluetooth.profile.channel.module.scale.BalanceResult<com.huami.bluetooth.profile.channel.module.ScaleBalanceData>, kotlin.Unit> r4 = r0.b
                r4.invoke(r10)
                boolean r4 = r10 instanceof com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureSuccess
                if (r4 != 0) goto L59
                goto L69
            L59:
                com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureSuccess r10 = (com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureSuccess) r10
                java.lang.Object r10 = r10.getData()
                com.huami.bluetooth.profile.channel.module.ScaleBalanceData r10 = (com.huami.bluetooth.profile.channel.module.ScaleBalanceData) r10
                com.huami.bluetooth.profile.channel.module.ScaleBalanceData$MeasureStatus r10 = r10.getStatus()
                com.huami.bluetooth.profile.channel.module.ScaleBalanceData$MeasureStatus r4 = com.huami.bluetooth.profile.channel.module.ScaleBalanceData.MeasureStatus.STATUS_MEASURE_FINISH
                if (r10 != r4) goto L6c
            L69:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            L6c:
                r10 = r0
                r0 = r1
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.ScaleSettingModule.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.ScaleSettingModule$setBalanceMode$response$1", f = "ScaleSettingModule.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;
        public final /* synthetic */ Companion.SettingCmd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Companion.SettingCmd settingCmd, Continuation<? super z> continuation) {
            super(2, continuation);
            this.c = settingCmd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScaleSettingModule.this.new z(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ChannelResponse> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) ScaleSettingModule.this.settingChannel.get(Boxing.boxInt(this.c.getCmdQuery()));
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

    public ScaleSettingModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(p.a);
        this.channels = new LinkedHashMap();
        this.sortModuleChannel = new LinkedHashMap();
        this.settingChannel = new LinkedHashMap();
    }

    private final ByteArrayOutputStream c(int cmd, int setCmd, Integer op) {
        return op == null ? d(cmd, setCmd, new byte[0]) : d(cmd, setCmd, new byte[]{(byte) op.intValue()});
    }

    private final ByteArrayOutputStream d(int cmd, int setCmd, byte[] bytes) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(cmd);
        byteArrayOutputStream.write(setCmd);
        byteArrayOutputStream.write(bytes);
        return byteArrayOutputStream;
    }

    public static /* synthetic */ ByteArrayOutputStream e(ScaleSettingModule scaleSettingModule, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        return scaleSettingModule.c(i2, i3, num);
    }

    private final Job f() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Companion.SettingCmd settingCmd, Continuation<? super SettingResult<ScaleMode>> continuation) {
        i iVar;
        ScaleSettingModule scaleSettingModule;
        ScaleSettingModule scaleSettingModule2;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objN = iVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                settingCmd = (Companion.SettingCmd) iVar.b;
                scaleSettingModule = (ScaleSettingModule) iVar.a;
                ResultKt.throwOnFailure(objN);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingCmd = (Companion.SettingCmd) iVar.b;
                scaleSettingModule2 = (ScaleSettingModule) iVar.a;
                ResultKt.throwOnFailure(objN);
            }
            ChannelResponse channelResponse = (ChannelResponse) objN;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.k(channelResponse.getData(), settingCmd.getCmdQuery());
        }
        ResultKt.throwOnFailure(objN);
        this.settingChannel.put(Boxing.boxInt(settingCmd.getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStreamC = c(settingCmd.getCmd(), settingCmd.getSetCmd(), Boxing.boxInt(0));
        iVar.a = this;
        iVar.b = settingCmd;
        iVar.e = 1;
        objN = n(byteArrayOutputStreamC, iVar);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objN).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        j jVar = scaleSettingModule.new j(settingCmd, null);
        iVar.a = scaleSettingModule;
        iVar.b = settingCmd;
        iVar.e = 2;
        objN = TimeoutKt.withTimeoutOrNull(10000L, jVar, iVar);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objN;
        if (channelResponse2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        Channel<ChannelResponse> channel;
        byte b2 = channelResponse.getData()[1];
        if (b2 == 2) {
            Channel<ChannelResponse> channel2 = this.channels.get(Boxing.boxInt(b2));
            if (channel2 != null) {
                Object objSend = channel2.send(channelResponse, continuation);
                return objSend == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
            }
        } else if (b2 == 16 && (channel = this.channels.get(Boxing.boxInt(channelResponse.getData()[2]))) != null) {
            Object objSend2 = channel.send(channelResponse, continuation);
            return objSend2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSend2 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        Channel<ChannelResponse> channel = this.sortModuleChannel.get(Boxing.boxInt(channelResponse.getData()[1]));
        if (channel != null) {
            Object objSend = channel.send(channelResponse, continuation);
            return objSend == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(ChannelResponse channelResponse, Continuation<? super Unit> continuation) {
        if (channelResponse.getData().length < 2) {
            Debug.fi(C, "set mode response is ERROR!!!");
            return Unit.INSTANCE;
        }
        Channel<ChannelResponse> channel = this.settingChannel.get(Boxing.boxInt(channelResponse.getData()[1]));
        if (channel != null) {
            Object objSend = channel.send(channelResponse, continuation);
            return objSend == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
        if (kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() == null) {
            return null;
        }
        return Unit.INSTANCE;
    }

    private final SettingResult<ScaleMode> k(byte[] data, int key) {
        SettingResult<byte[]> settingResultO = o(data);
        boolean success = settingResultO.getSuccess();
        byte[] t2 = settingResultO.getT();
        Debug.fi(C, "cmd:" + key + ":parseMode sliceByteData:" + success + HTTP.HEADER_LINE_DELIM + ((Object) GattUtils.bytesToHexString(t2)));
        ScaleMode scaleModeFromValue = null;
        if (success && t2 != null) {
            int length = t2.length;
            byte bFirst = ArraysKt___ArraysKt.first(t2);
            int i2 = 1;
            success &= 1 < length;
            if (success) {
                i2 = 2;
                success = t2[1] == 1;
            }
            if (bFirst == 0 && success && i2 < length) {
                scaleModeFromValue = ScaleMode.INSTANCE.fromValue(t2[i2]);
            }
        }
        Debug.fi(C, "parseMode result: " + success + ": " + scaleModeFromValue);
        this.settingChannel.remove(Integer.valueOf(key));
        return new SettingResult<>(success, scaleModeFromValue);
    }

    private final SettingResult<ScaleUnit> l(byte[] data) {
        SettingResult<byte[]> settingResultO = o(data);
        boolean success = settingResultO.getSuccess();
        byte[] t2 = settingResultO.getT();
        Debug.fi(C, "parseUnit sliceByteData:" + success + HTTP.HEADER_LINE_DELIM + ((Object) GattUtils.bytesToHexString(t2)));
        ScaleUnit scaleUnitFromValue = null;
        if (success && t2 != null) {
            int length = t2.length;
            byte bFirst = ArraysKt___ArraysKt.first(t2);
            int i2 = 1;
            success &= 1 < length;
            if (success) {
                i2 = 2;
                success = t2[1] == 1;
            }
            if (bFirst == 0 && success && i2 < length) {
                scaleUnitFromValue = ScaleUnit.INSTANCE.fromValue(t2[i2]);
            }
        }
        Debug.fi(C, "parseUnit result: " + success + ": " + scaleUnitFromValue);
        this.settingChannel.remove(Integer.valueOf(Companion.SettingCmd.SET_UNIT.getCmdQuery()));
        return new SettingResult<>(success, scaleUnitFromValue);
    }

    private final SettingResult<ArrayList<Long>> m(byte[] data) {
        if (data.length < 3) {
            return new SettingResult<>(false, null, 2, null);
        }
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(data, new IntRange(3, data.length - 1));
        HMLog.info(C, new q(bArrSliceArray));
        ArrayList arrayList = new ArrayList();
        byte bFirst = ArraysKt___ArraysKt.first(bArrSliceArray);
        byte[] bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(bArrSliceArray, new IntRange(1, bArrSliceArray.length - 1));
        if (bFirst > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                byte[] bArrSliceArray3 = ArraysKt___ArraysKt.sliceArray(bArrSliceArray2, new IntRange(i2 * 6, (i3 * 6) - 1));
                long long$default = ByteUtilsKt.toLong$default(bArrSliceArray3, 0, 0, 3, null);
                HMLog.info(C, new r(bArrSliceArray3, long$default));
                arrayList.add(Long.valueOf(long$default));
                if (i3 >= bFirst) {
                    break;
                }
                i2 = i3;
            }
        }
        return new SettingResult<>(true, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(ByteArrayOutputStream byteArrayOutputStream, Continuation<? super SettingResult<Boolean>> continuation) {
        u uVar;
        byte[] byteArray;
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
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSendDataWithResult$default);
            byteArray = byteArrayOutputStream.toByteArray();
            uVar2.a = byteArray;
            uVar2.d = 1;
            objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, byteArray, 0, false, uVar2, 6, null);
            if (objSendDataWithResult$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteArray = (byte[]) uVar2.a;
            ResultKt.throwOnFailure(objSendDataWithResult$default);
        }
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(C, "send data :" + ((Object) GattUtils.bytesToHexString(byteArray)) + ": result:" + zBooleanValue);
        return new SettingResult(zBooleanValue, null, 2, null);
    }

    private final SettingResult<byte[]> o(byte[] data) {
        return data.length < 2 ? new SettingResult<>(false, null, 2, null) : new SettingResult<>(true, ArraysKt___ArraysKt.sliceArray(data, new IntRange(2, data.length - 1)));
    }

    public static /* synthetic */ Object setGuestModel$default(ScaleSettingModule scaleSettingModule, boolean z2, ScaleGuestData scaleGuestData, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            scaleGuestData = null;
        }
        return scaleSettingModule.setGuestModel(z2, scaleGuestData, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00db  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object addOrUpdateFamilyInfo(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, @NotNull byte[] bArr, float f2, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i8 = aVar.d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithTimeoutOrNull = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i9 = aVar.d;
        if (i9 != 0) {
            if (i9 == 1) {
                scaleSettingModule = (ScaleSettingModule) aVar.a;
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
        this.channels.put(Boxing.boxInt(3), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(GattUtils.numberToBytes(j2, 6));
        byteArrayOutputStream.write(GattUtils.numberToBytes(j3, 6));
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        byteArrayOutputStream.write(i4);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) (100 * f2)));
        byteArrayOutputStream.write(i5);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) i6));
        byteArrayOutputStream.write(i7);
        byteArrayOutputStream.write(bArr);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        aVar.a = this;
        aVar.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, aVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        b bVar = scaleSettingModule.new b(null);
        aVar.a = null;
        aVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, bVar, aVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object deleteMember(long j2, long j3, @NotNull Continuation<? super Boolean> continuation) {
        c cVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.d = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object objWithTimeoutOrNull = cVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) cVar2.a;
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
        this.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(4);
        byteArrayOutputStream.write(GattUtils.numberToBytes(j2, 6));
        byteArrayOutputStream.write(GattUtils.numberToBytes(j3, 6));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar2.a = this;
        cVar2.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, cVar2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        d dVar = scaleSettingModule.new d(null);
        cVar2.a = null;
        cVar2.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, dVar, cVar2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object deleteUserID(long j2, @NotNull Continuation<? super Boolean> continuation) {
        e eVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objWithTimeoutOrNull = eVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) eVar2.a;
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
        this.channels.put(Boxing.boxInt(7), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(7);
        byteArrayOutputStream.write(GattUtils.numberToBytes(j2, 6));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        eVar2.a = this;
        eVar2.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, eVar2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        f fVar = scaleSettingModule.new f(null);
        eVar2.a = null;
        eVar2.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, fVar, eVar2);
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
        return f().plus(Dispatchers.getIO());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[LOOP:0: B:33:0x00b7->B:36:0x00d6, LOOP_START, PHI: r9
      0x00b7: PHI (r9v1 int) = (r9v0 int), (r9v5 int) binds: [B:32:0x00b5, B:36:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6 A[LOOP:0: B:33:0x00b7->B:36:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[EDGE_INSN: B:38:0x00d8->B:37:0x00d8 BREAK  A[LOOP:0: B:33:0x00b7->B:36:0x00d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDataItem(@NotNull Continuation<? super List<ScaleDataItem>> continuation) {
        g gVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        byte[] bArrSliceArray;
        int iFirst;
        ArrayList arrayList;
        int i2;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i3 = gVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.d = i3 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithTimeoutOrNull = gVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = gVar.d;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                scaleSettingModule = (ScaleSettingModule) gVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (channelResponse.getData().length < 3) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            bArrSliceArray = ArraysKt___ArraysKt.sliceArray(channelResponse.getData(), new IntRange(2, channelResponse.getData().length - 1));
            iFirst = ArraysKt___ArraysKt.first(bArrSliceArray) & 255;
            arrayList = new ArrayList();
            if (iFirst > 0) {
                while (true) {
                    i2 = i5 + 1;
                    int i6 = (i5 * 2) + 1;
                    int i7 = bArrSliceArray[i6] & 255;
                    arrayList.add(new ScaleDataItem(DisplayType.INSTANCE.fromValue(i7), bArrSliceArray[i6 + 1] & 255));
                    if (i2 >= iFirst) {
                        break;
                    }
                    i5 = i2;
                }
            }
            return arrayList;
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.sortModuleChannel.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(1);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        gVar.a = this;
        gVar.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, gVar, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        h hVar = scaleSettingModule.new h(null);
        gVar.a = null;
        gVar.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, hVar, gVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (channelResponse.getData().length < 3) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        bArrSliceArray = ArraysKt___ArraysKt.sliceArray(channelResponse.getData(), new IntRange(2, channelResponse.getData().length - 1));
        iFirst = ArraysKt___ArraysKt.first(bArrSliceArray) & 255;
        arrayList = new ArrayList();
        if (iFirst > 0) {
            while (true) {
                i2 = i5 + 1;
                int i8 = (i5 * 2) + 1;
                int i9 = bArrSliceArray[i8] & 255;
                arrayList.add(new ScaleDataItem(DisplayType.INSTANCE.fromValue(i9), bArrSliceArray[i8 + 1] & 255));
                if (i2 >= iFirst) {
                    break;
                    break;
                }
                i5 = i2;
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object getGuestModel(@NotNull Continuation<? super SettingResult<ScaleMode>> continuation) {
        return g(Companion.SettingCmd.SET_GUEST_MODE, continuation);
    }

    @Nullable
    public final Object getModel(@NotNull MeasureMode measureMode, @NotNull Continuation<? super SettingResult<ScaleMode>> continuation) {
        return g(measureMode.getCmd(), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 32;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, com.huami.bluetooth.profile.channel.module.ScaleSettingModule$Companion$SettingCmd] */
    @Nullable
    public final Object getUnit(@NotNull Continuation<? super SettingResult<ScaleUnit>> continuation) {
        k kVar;
        Ref.ObjectRef objectRef;
        ScaleSettingModule scaleSettingModule;
        ScaleSettingModule scaleSettingModule2;
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
        Object objN = kVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                objectRef = (Ref.ObjectRef) kVar.b;
                scaleSettingModule = (ScaleSettingModule) kVar.a;
                ResultKt.throwOnFailure(objN);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule2 = (ScaleSettingModule) kVar.a;
                ResultKt.throwOnFailure(objN);
            }
            ChannelResponse channelResponse = (ChannelResponse) objN;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.l(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objN);
        objectRef = new Ref.ObjectRef();
        ?? r11 = Companion.SettingCmd.SET_UNIT;
        objectRef.element = r11;
        this.settingChannel.put(Boxing.boxInt(((Companion.SettingCmd) r11).getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStreamC = c(((Companion.SettingCmd) objectRef.element).getCmd(), ((Companion.SettingCmd) objectRef.element).getSetCmd(), Boxing.boxInt(0));
        kVar.a = this;
        kVar.b = objectRef;
        kVar.e = 1;
        objN = n(byteArrayOutputStreamC, kVar);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objN).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        l lVar = scaleSettingModule.new l(objectRef, null);
        kVar.a = scaleSettingModule;
        kVar.b = null;
        kVar.e = 2;
        objN = TimeoutKt.withTimeoutOrNull(10000L, lVar, kVar);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objN;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUsersBound(@NotNull Continuation<? super SettingResult<ArrayList<Long>>> continuation) {
        m mVar;
        ScaleSettingModule scaleSettingModule;
        ScaleSettingModule scaleSettingModule2;
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
        Object objN = mVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) mVar.a;
                ResultKt.throwOnFailure(objN);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule2 = (ScaleSettingModule) mVar.a;
                ResultKt.throwOnFailure(objN);
            }
            ChannelResponse channelResponse = (ChannelResponse) objN;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule2.m(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objN);
        this.channels.put(Boxing.boxInt(8), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(8);
        mVar.a = this;
        mVar.d = 1;
        objN = n(byteArrayOutputStream, mVar);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objN).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        n nVar = scaleSettingModule.new n(null);
        mVar.a = scaleSettingModule;
        mVar.d = 2;
        objN = TimeoutKt.withTimeoutOrNull(10000L, nVar, mVar);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        ChannelResponse channelResponse2 = (ChannelResponse) objN;
        if (channelResponse2 == null) {
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getChannelModule(), false, new o(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super FamilyMemberVersionInfo> continuation) {
        s sVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
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
        Object objSendDataWithResult$default = sVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = sVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) sVar.a;
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
            ByteDecoder byteDecoder = new ByteDecoder(channelResponse.getData());
            byteDecoder.readByte();
            byteDecoder.readByte();
            return new FamilyMemberVersionInfo(byteDecoder.readByte(), byteDecoder.readByte());
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        sVar.a = this;
        sVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{1, 1}, 0, false, sVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((Boolean) objSendDataWithResult$default).booleanValue()) {
            return null;
        }
        t tVar = scaleSettingModule.new t(null);
        sVar.a = null;
        sVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(10000L, tVar, sVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            return null;
        }
        ByteDecoder byteDecoder2 = new ByteDecoder(channelResponse.getData());
        byteDecoder2.readByte();
        byteDecoder2.readByte();
        return new FamilyMemberVersionInfo(byteDecoder2.readByte(), byteDecoder2.readByte());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object sendMemberIds(long j2, @NotNull List<Long> list, @NotNull Continuation<? super Boolean> continuation) {
        v vVar;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof v) {
            vVar = (v) continuation;
            int i2 = vVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.d = i2 - Integer.MIN_VALUE;
            } else {
                vVar = new v(continuation);
            }
        } else {
            vVar = new v(continuation);
        }
        v vVar2 = vVar;
        Object objWithTimeoutOrNull = vVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = vVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) vVar2.a;
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
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(GattUtils.numberToBytes(j2, 6));
        byteArrayOutputStream.write(list.size());
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(GattUtils.numberToBytes(((Number) it2.next()).longValue(), 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        vVar2.a = this;
        vVar2.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, vVar2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        w wVar = scaleSettingModule.new w(null);
        vVar2.a = null;
        vVar2.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, wVar, vVar2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object setBalanceMode(boolean z2, @NotNull Function1<? super BalanceResult<ScaleBalanceData>, Unit> function1, @NotNull Continuation<? super BalanceResult<ScaleBalanceData>> continuation) {
        x xVar;
        ScaleMode scaleMode;
        Function1<? super BalanceResult<ScaleBalanceData>, Unit> function2;
        ScaleSettingModule scaleSettingModule;
        Companion.SettingCmd settingCmd;
        Object objWithTimeoutOrNull;
        ScaleSettingModule scaleSettingModule2;
        Function1<? super BalanceResult<ScaleBalanceData>, Unit> function3;
        ScaleMode scaleMode2;
        ChannelResponse channelResponse;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i2 = xVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.g = i2 - Integer.MIN_VALUE;
            } else {
                xVar = new x(continuation);
            }
        } else {
            xVar = new x(continuation);
        }
        x xVar2 = xVar;
        Object objN = xVar2.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = xVar2.g;
        if (i3 != 0) {
            if (i3 == 1) {
                ScaleMode scaleMode3 = (ScaleMode) xVar2.d;
                settingCmd = (Companion.SettingCmd) xVar2.c;
                Function1<? super BalanceResult<ScaleBalanceData>, Unit> function4 = (Function1) xVar2.b;
                scaleSettingModule = (ScaleSettingModule) xVar2.a;
                ResultKt.throwOnFailure(objN);
                scaleMode = scaleMode3;
                function2 = function4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleMode2 = (ScaleMode) xVar2.d;
                settingCmd = (Companion.SettingCmd) xVar2.c;
                Function1<? super BalanceResult<ScaleBalanceData>, Unit> function5 = (Function1) xVar2.b;
                ScaleSettingModule scaleSettingModule3 = (ScaleSettingModule) xVar2.a;
                ResultKt.throwOnFailure(objN);
                scaleSettingModule2 = scaleSettingModule3;
                function3 = function5;
                objWithTimeoutOrNull = objN;
            }
            channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            if (channelResponse == null) {
                return new BalanceMeasureTimeout(null, 1, null);
            }
            if (scaleMode2 == ScaleMode.EnterMode) {
                kotlinx.coroutines.e.f(scaleSettingModule2, null, null, new y(function3, scaleSettingModule2, settingCmd, null), 3, null);
            }
            return ScaleBalanceData.INSTANCE.parse(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objN);
        Companion.SettingCmd settingCmd2 = Companion.SettingCmd.SET_BALANCE;
        this.settingChannel.put(Boxing.boxInt(settingCmd2.getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        scaleMode = z2 ? ScaleMode.EnterMode : ScaleMode.ExitMode;
        ByteArrayOutputStream byteArrayOutputStreamE = e(this, settingCmd2.getCmd(), settingCmd2.getSetCmd(), null, 4, null);
        byteArrayOutputStreamE.write(scaleMode.getValue());
        xVar2.a = this;
        function2 = function1;
        xVar2.b = function2;
        xVar2.c = settingCmd2;
        xVar2.d = scaleMode;
        xVar2.g = 1;
        objN = n(byteArrayOutputStreamE, xVar2);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        settingCmd = settingCmd2;
        if (!((SettingResult) objN).getSuccess()) {
            return BalanceResult.Companion.fail$default(BalanceResult.INSTANCE, "Send balance command failed", 0, 2, null);
        }
        z zVar = scaleSettingModule.new z(settingCmd, null);
        xVar2.a = scaleSettingModule;
        xVar2.b = function2;
        xVar2.c = settingCmd;
        xVar2.d = scaleMode;
        xVar2.g = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, zVar, xVar2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule2 = scaleSettingModule;
        function3 = function2;
        scaleMode2 = scaleMode;
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return new BalanceMeasureTimeout(null, 1, null);
        }
        if (scaleMode2 == ScaleMode.EnterMode) {
            kotlinx.coroutines.e.f(scaleSettingModule2, null, null, new y(function3, scaleSettingModule2, settingCmd, null), 3, null);
        }
        return ScaleBalanceData.INSTANCE.parse(channelResponse.getData());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object setDataItem(@NotNull List<ScaleDataItem> list, @NotNull Continuation<? super Boolean> continuation) {
        a0 a0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof a0) {
            a0Var = (a0) continuation;
            int i2 = a0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(continuation);
            }
        } else {
            a0Var = new a0(continuation);
        }
        a0 a0Var2 = a0Var;
        Object objWithTimeoutOrNull = a0Var2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = a0Var2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) a0Var2.a;
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
            if (channelResponse.getData().length < 3) {
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        this.sortModuleChannel.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(2);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(list.size());
        for (ScaleDataItem scaleDataItem : list) {
            byteArrayOutputStream.write(scaleDataItem.getType().getValue());
            byteArrayOutputStream.write(scaleDataItem.getStatus());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        a0Var2.a = this;
        a0Var2.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, a0Var2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        b0 b0Var = scaleSettingModule.new b0(null);
        a0Var2.a = null;
        a0Var2.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, b0Var, a0Var2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        if (channelResponse.getData().length < 3) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:44:0x014a  */
    /* JADX WARN: Code duplicated, block: B:45:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0136 -> B:41:0x013f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object setFamilyInfos(@org.jetbrains.annotations.NotNull java.util.List<com.huami.bluetooth.profile.channel.module.FamilyMemberInfo> r27, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.module.ScaleSettingModule.setFamilyInfos(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setGuestModel(boolean z2, @Nullable ScaleGuestData scaleGuestData, @NotNull Continuation<? super SettingResult<ScaleMode>> continuation) {
        d0 d0Var;
        ScaleSettingModule scaleSettingModule;
        Companion.SettingCmd settingCmd;
        if (continuation instanceof d0) {
            d0Var = (d0) continuation;
            int i2 = d0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(continuation);
            }
        } else {
            d0Var = new d0(continuation);
        }
        Object objWithTimeoutOrNull = d0Var.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = d0Var.e;
        if (i3 != 0) {
            if (i3 == 1) {
                settingCmd = (Companion.SettingCmd) d0Var.b;
                scaleSettingModule = (ScaleSettingModule) d0Var.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingCmd = (Companion.SettingCmd) d0Var.b;
                scaleSettingModule = (ScaleSettingModule) d0Var.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            ChannelResponse channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule.k(channelResponse.getData(), settingCmd.getCmdQuery());
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        Companion.SettingCmd settingCmd2 = Companion.SettingCmd.SET_GUEST_MODE;
        this.settingChannel.put(Boxing.boxInt(settingCmd2.getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        ScaleMode scaleMode = z2 ? ScaleMode.EnterMode : ScaleMode.ExitMode;
        ByteArrayOutputStream byteArrayOutputStreamC = c(settingCmd2.getCmd(), settingCmd2.getSetCmd(), Boxing.boxInt(1));
        byteArrayOutputStreamC.write(scaleMode.getValue());
        if (scaleGuestData != null) {
            byteArrayOutputStreamC.write(scaleGuestData.getGender().getValue());
            byteArrayOutputStreamC.write(scaleGuestData.getHeight());
            byteArrayOutputStreamC.write(GattUtils.numberToBytes(scaleGuestData.getBirthDayYear(), 2));
            byteArrayOutputStreamC.write(scaleGuestData.getBirthDayMonth());
            byteArrayOutputStreamC.write(scaleGuestData.getModel().getValue());
        }
        d0Var.a = this;
        d0Var.b = settingCmd2;
        d0Var.e = 1;
        Object objN = n(byteArrayOutputStreamC, d0Var);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        objWithTimeoutOrNull = objN;
        settingCmd = settingCmd2;
        if (!((SettingResult) objWithTimeoutOrNull).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        e0 e0Var = scaleSettingModule.new e0(settingCmd, null);
        d0Var.a = scaleSettingModule;
        d0Var.b = settingCmd;
        d0Var.e = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, e0Var, d0Var);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object setHost(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        f0 f0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        SettingResult<byte[]> settingResultO;
        boolean z2;
        byte[] t2;
        boolean zAreEqual;
        if (continuation instanceof f0) {
            f0Var = (f0) continuation;
            int i2 = f0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(continuation);
            }
        } else {
            f0Var = new f0(continuation);
        }
        f0 f0Var2 = f0Var;
        Object objN = f0Var2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = f0Var2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) f0Var2.a;
                ResultKt.throwOnFailure(objN);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule = (ScaleSettingModule) f0Var2.a;
                ResultKt.throwOnFailure(objN);
            }
            channelResponse = (ChannelResponse) objN;
            if (channelResponse == null) {
                return Boxing.boxBoolean(false);
            }
            settingResultO = scaleSettingModule.o(channelResponse.getData());
            if (!settingResultO.getSuccess()) {
                t2 = settingResultO.getT();
                if (t2 == null) {
                    zAreEqual = false;
                } else {
                    zAreEqual = Intrinsics.areEqual(Boxing.boxByte(ArraysKt___ArraysKt.first(t2)), Boxing.boxInt(1));
                }
                z2 = zAreEqual;
            }
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(objN);
        Map<Integer, Channel<ChannelResponse>> map = this.settingChannel;
        Companion.SettingCmd settingCmd = Companion.SettingCmd.SET_HOST;
        map.put(Boxing.boxInt(settingCmd.getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStreamE = e(this, settingCmd.getCmd(), settingCmd.getSetCmd(), null, 4, null);
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStreamE.write(str.getBytes(charset));
        byteArrayOutputStreamE.write(0);
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStreamE.write(str2.getBytes(charset));
        byteArrayOutputStreamE.write(0);
        f0Var2.a = this;
        f0Var2.d = 1;
        objN = n(byteArrayOutputStreamE, f0Var2);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objN).getSuccess()) {
            return Boxing.boxBoolean(false);
        }
        g0 g0Var = scaleSettingModule.new g0(null);
        f0Var2.a = scaleSettingModule;
        f0Var2.d = 2;
        objN = TimeoutKt.withTimeoutOrNull(10000L, g0Var, f0Var2);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objN;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        settingResultO = scaleSettingModule.o(channelResponse.getData());
        if (!settingResultO.getSuccess()) {
            t2 = settingResultO.getT();
            if (t2 == null) {
                zAreEqual = false;
            } else {
                zAreEqual = Intrinsics.areEqual(Boxing.boxByte(ArraysKt___ArraysKt.first(t2)), Boxing.boxInt(1));
            }
            if (zAreEqual) {
            }
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object setMeasureMode(long j2, int i2, @NotNull Continuation<? super Boolean> continuation) {
        h0 h0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i3 = h0Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.d = i3 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(continuation);
            }
        } else {
            h0Var = new h0(continuation);
        }
        h0 h0Var2 = h0Var;
        Object objWithTimeoutOrNull = h0Var2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = h0Var2.d;
        if (i4 != 0) {
            if (i4 == 1) {
                scaleSettingModule = (ScaleSettingModule) h0Var2.a;
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
        this.channels.put(Boxing.boxInt(5), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(GattUtils.numberToBytes(j2, 6));
        byteArrayOutputStream.write(i2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        h0Var2.a = this;
        h0Var2.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, h0Var2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        i0 i0Var = scaleSettingModule.new i0(null);
        h0Var2.a = null;
        h0Var2.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, i0Var, h0Var2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setModel(@NotNull MeasureMode measureMode, boolean z2, @NotNull Continuation<? super SettingResult<ScaleMode>> continuation) {
        j0 j0Var;
        Companion.SettingCmd cmd;
        ScaleSettingModule scaleSettingModule;
        if (continuation instanceof j0) {
            j0Var = (j0) continuation;
            int i2 = j0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(continuation);
            }
        } else {
            j0Var = new j0(continuation);
        }
        Object objN = j0Var.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = j0Var.e;
        if (i3 != 0) {
            if (i3 == 1) {
                cmd = (Companion.SettingCmd) j0Var.b;
                scaleSettingModule = (ScaleSettingModule) j0Var.a;
                ResultKt.throwOnFailure(objN);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cmd = (Companion.SettingCmd) j0Var.b;
                scaleSettingModule = (ScaleSettingModule) j0Var.a;
                ResultKt.throwOnFailure(objN);
            }
            ChannelResponse channelResponse = (ChannelResponse) objN;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule.k(channelResponse.getData(), cmd.getCmdQuery());
        }
        ResultKt.throwOnFailure(objN);
        cmd = measureMode.getCmd();
        this.settingChannel.put(Boxing.boxInt(cmd.getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        ScaleMode scaleMode = z2 ? ScaleMode.EnterMode : ScaleMode.ExitMode;
        ByteArrayOutputStream byteArrayOutputStreamC = c(cmd.getCmd(), cmd.getSetCmd(), Boxing.boxInt(1));
        byteArrayOutputStreamC.write(scaleMode.getValue());
        j0Var.a = this;
        j0Var.b = cmd;
        j0Var.e = 1;
        objN = n(byteArrayOutputStreamC, j0Var);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        if (!((SettingResult) objN).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        k0 k0Var = scaleSettingModule.new k0(cmd, null);
        j0Var.a = scaleSettingModule;
        j0Var.b = cmd;
        j0Var.e = 2;
        objN = TimeoutKt.withTimeoutOrNull(10000L, k0Var, j0Var);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objN;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.huami.bluetooth.profile.channel.module.ScaleSettingModule$Companion$SettingCmd] */
    @Nullable
    public final Object setUnit(int i2, @NotNull Continuation<? super SettingResult<ScaleUnit>> continuation) {
        l0 l0Var;
        Ref.ObjectRef objectRef;
        Object obj;
        ScaleSettingModule scaleSettingModule;
        if (continuation instanceof l0) {
            l0Var = (l0) continuation;
            int i3 = l0Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l0Var.e = i3 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(continuation);
            }
        } else {
            l0Var = new l0(continuation);
        }
        Object objWithTimeoutOrNull = l0Var.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = l0Var.e;
        if (i4 != 0) {
            if (i4 == 1) {
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) l0Var.b;
                ScaleSettingModule scaleSettingModule2 = (ScaleSettingModule) l0Var.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                objectRef = objectRef2;
                scaleSettingModule = scaleSettingModule2;
                obj = objWithTimeoutOrNull;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scaleSettingModule = (ScaleSettingModule) l0Var.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            ChannelResponse channelResponse = (ChannelResponse) objWithTimeoutOrNull;
            return channelResponse == null ? new SettingResult(false, null, 2, null) : scaleSettingModule.l(channelResponse.getData());
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        objectRef = new Ref.ObjectRef();
        ?? r2 = Companion.SettingCmd.SET_UNIT;
        objectRef.element = r2;
        this.settingChannel.put(Boxing.boxInt(((Companion.SettingCmd) r2).getCmdQuery()), ChannelKt.Channel$default(0, 1, null));
        ScaleUnit scaleUnitFromValue = ScaleUnit.INSTANCE.fromValue(i2);
        ByteArrayOutputStream byteArrayOutputStreamC = c(((Companion.SettingCmd) objectRef.element).getCmd(), ((Companion.SettingCmd) objectRef.element).getSetCmd(), Boxing.boxInt(1));
        byteArrayOutputStreamC.write(scaleUnitFromValue.getValue());
        l0Var.a = this;
        l0Var.b = objectRef;
        l0Var.e = 1;
        Object objN = n(byteArrayOutputStreamC, l0Var);
        if (objN == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objN;
        scaleSettingModule = this;
        if (!((SettingResult) obj).getSuccess()) {
            return new SettingResult(false, null, 2, null);
        }
        m0 m0Var = scaleSettingModule.new m0(objectRef, null);
        l0Var.a = scaleSettingModule;
        l0Var.b = null;
        l0Var.e = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, m0Var, l0Var);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelResponse channelResponse2 = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse2 == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object setUserID(long j2, @NotNull Continuation<? super Boolean> continuation) {
        n0 n0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof n0) {
            n0Var = (n0) continuation;
            int i2 = n0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(continuation);
            }
        } else {
            n0Var = new n0(continuation);
        }
        n0 n0Var2 = n0Var;
        Object objWithTimeoutOrNull = n0Var2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = n0Var2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) n0Var2.a;
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
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(GattUtils.numberToBytes(j2, 6));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        n0Var2.a = this;
        n0Var2.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, n0Var2, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        o0 o0Var = scaleSettingModule.new o0(null);
        n0Var2.a = null;
        n0Var2.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, o0Var, n0Var2);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setUsersBound(@NotNull ArrayList<Long> arrayList, @NotNull Continuation<? super Boolean> continuation) {
        p0 p0Var;
        ScaleSettingModule scaleSettingModule;
        ChannelResponse channelResponse;
        if (continuation instanceof p0) {
            p0Var = (p0) continuation;
            int i2 = p0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(continuation);
            }
        } else {
            p0Var = new p0(continuation);
        }
        Object objWithTimeoutOrNull = p0Var.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = p0Var.d;
        if (i3 != 0) {
            if (i3 == 1) {
                scaleSettingModule = (ScaleSettingModule) p0Var.a;
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
        this.channels.put(Boxing.boxInt(9), ChannelKt.Channel$default(0, 1, null));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(9);
        byteArrayOutputStream.write(arrayList.size());
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byte[] bArrNumberToBytes = GattUtils.numberToBytes(((Number) it2.next()).longValue(), 6);
            HMLog.info(C, new q0(bArrNumberToBytes));
            byteArrayOutputStream.write(bArrNumberToBytes);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        p0Var.a = this;
        p0Var.d = 1;
        if (BaseModule.sendDataWithResult$default(this, byteArray, 0, false, p0Var, 6, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        scaleSettingModule = this;
        r0 r0Var = scaleSettingModule.new r0(null);
        p0Var.a = null;
        p0Var.d = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(10000L, r0Var, p0Var);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
        if (channelResponse == null) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(ArraysKt___ArraysKt.last(channelResponse.getData()) == 1);
    }
}
