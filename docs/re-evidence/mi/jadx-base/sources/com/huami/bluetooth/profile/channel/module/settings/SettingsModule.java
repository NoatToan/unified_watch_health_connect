package com.huami.bluetooth.profile.channel.module.settings;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.a;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.ad;
import defpackage.bs;
import defpackage.d4;
import defpackage.fs;
import defpackage.gs;
import defpackage.hs;
import defpackage.is;
import defpackage.j2;
import defpackage.n6;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.yi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB\u000f\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bW\u0010XJ?\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00122&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u0010H\u0002J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0016J.\u0010\u001a\u001a\u00020\u00042&\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u0010J8\u0010\u001e\u001a\u00020\u00122\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ7\u0010\u001e\u001a\u00020\u00042\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J3\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000b\u001a\u00020#\"\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010$J2\u0010%\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJE\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0004\b&\u0010'JS\u0010(\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060 2,\u0010\u001d\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00100\u001b¢\u0006\u0004\b(\u0010)J\u0006\u0010*\u001a\u00020\u0012J\u0015\u0010+\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b-\u0010.J\u0014\u0010+\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001bJ\u001d\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010/H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J=\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00102\b\u00100\u001a\u0004\u0018\u00010/H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u00102J\u0006\u00103\u001a\u00020\u0012J\u0010\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000104H\u0016J\u0006\u00106\u001a\u00020\tJ\u000f\u00107\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b7\u0010.J\u000e\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0006R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR&\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00140H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0017\u0010L\u001a\u00020K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "Lj2;", "", "needDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "queryFields", "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "settings", "", "updateGroupVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "init", "setting", "writeSettingSync", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callback", "writeSetting", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;[IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFieldsSync", "querySettingsSync", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Ljava/util/HashMap;", "querySetting", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "initDefaultSettings", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryVersionSync", "()Ljava/lang/Integer;", "", "cmd", "writeSettings", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetSettingsImpl", "", "getCurrentGroups", "getVersionOrDefault", "getVersion", "group", "supportGroup", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lm4;", Constants.KEY_RECHARGE_CHANNELS, "Ljava/util/Map;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "settingsChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lr3;", "channelController", "Lr3;", "getChannelController", "()Lr3;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 10)
public final class SettingsModule extends a implements CoroutineScope, j2 {
    public static final int DEFAULT_VERSION = 1;
    public static final byte GROUP_DISPLAY = 1;
    public static final byte GROUP_LANGUAGE = 7;
    public static final byte GROUP_NFC = 2;
    public static final byte GROUP_OFFLINE_VOICE = 6;
    public static final byte GROUP_SCREEN_UNLOCK_AND_PASSWORD = 4;
    public static final byte GROUP_SOUND_AND_VIBRATION = 3;
    public static final int GROUP_VERSION_CONNECTION = 1;
    public static final int GROUP_VERSION_DEVICE_INFORMATION = 1;
    public static final int GROUP_VERSION_DISPLAY = 2;
    public static final int GROUP_VERSION_GENERAL = 2;
    public static final int GROUP_VERSION_HEALTH = 2;
    public static final int GROUP_VERSION_LANGUAGE = 2;
    public static final int GROUP_VERSION_OFFLINE_VOICE = 2;
    public static final int GROUP_VERSION_SCREEN_UNLOCK_AND_PASSWORD = 1;
    public static final int GROUP_VERSION_SOUND_AND_VIBRATION = 2;
    public static final int GROUP_VERSION_SPORT = 1;
    public static final int GROUP_VERSION_WEARING = 2;
    public static final byte GROUP_WEARING = 5;
    public static final int PROTOCOL_VERSION_2 = 2;
    public static final int PROTOCOL_VERSION_3 = 3;
    public static final int SETTINGS_MODULE = 10;

    @NotNull
    private static final String TAG = "SettingsModule";
    private static final long TIMEOUT = 15000;
    public static final byte TYPE_NOTIFY_SETTINGS = 4;
    public static final byte TYPE_QUERY_SETTINGS = 3;
    public static final byte TYPE_QUERY_VERSION = 1;
    public static final byte TYPE_RETURN_VERSION = 2;
    public static final byte TYPE_UPDATE_RESULT = 6;
    public static final byte TYPE_UPDATE_SETTINGS = 5;
    public static final byte VALUE_TYPE_BOOL = 11;
    public static final byte VALUE_TYPE_ENUM = 16;
    public static final byte VALUE_TYPE_ENUM_ARRAY = 17;
    public static final byte VALUE_TYPE_FLAG = 80;
    public static final byte VALUE_TYPE_INT = 1;
    public static final byte VALUE_TYPE_INT_32 = 3;
    public static final byte VALUE_TYPE_INT_ARRAY = 2;
    public static final byte VALUE_TYPE_STRING = 32;
    public static final byte VALUE_TYPE_STRING_ENUM = 33;
    public static final byte VALUE_TYPE_TIME = 48;
    public static final byte VALUE_TYPE_TIMESTAMP = 64;

    @NotNull
    private final r3 channelController;

    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    @NotNull
    private final Mutex mutex;

    @NotNull
    private final CopyOnWriteArrayList<ChangeListener> settingsChangeListeners;

    @Nullable
    private yi settingsImpl;

    @Nullable
    private is settingsVersion;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", "it", "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$init$1$1", f = "SettingsModule.kt", i = {}, l = {62, 69}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ SettingsModule v;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.SettingsModule$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$init$1$1$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0283a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int t;
                public final /* synthetic */ SettingsModule u;
                public final /* synthetic */ HashMap<SettingsGroupType, Settings> v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0283a(SettingsModule settingsModule, HashMap<SettingsGroupType, Settings> map, Continuation<? super C0283a> continuation) {
                    super(2, continuation);
                    this.u = settingsModule;
                    this.v = map;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0283a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0283a(this.u, this.v, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CopyOnWriteArrayList copyOnWriteArrayList = this.u.settingsChangeListeners;
                    HashMap<SettingsGroupType, Settings> map = this.v;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((ChangeListener) it.next()).onChange(map);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, SettingsModule settingsModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = settingsModule;
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
                    Channel channel = (Channel) this.v.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.u.getData())));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.u;
                        this.t = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        yi yiVar = this.v.settingsImpl;
                        HashMap<SettingsGroupType, Settings> mapA = yiVar != null ? yiVar.a(this.u.getData()) : null;
                        this.v.updateGroupVersion(mapA);
                        t5t.d(SettingsModule.TAG, "settings change: " + mapA + ", listener size: " + this.v.settingsChangeListeners.size());
                        if (mapA != null) {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            C0283a c0283a = new C0283a(this.v, mapA, null);
                            this.t = 2;
                            if (BuildersKt.withContext(main, c0283a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            t5t.d(SettingsModule.TAG, "settings null");
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

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            SettingsModule settingsModule = SettingsModule.this;
            BuildersKt__Builders_commonKt.launch$default(settingsModule, null, null, new a(it, settingsModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<CompletableJob> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryFieldsSync$1", f = "SettingsModule.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        public int t;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ SettingsGroupType w;
        public final /* synthetic */ ArrayList<Integer> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, SettingsGroupType settingsGroupType, ArrayList<Integer> arrayList, Continuation<? super d> continuation) {
            super(2, continuation);
            this.v = z;
            this.w = settingsGroupType;
            this.x = arrayList;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Settings> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new d(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = SettingsModule.this;
                boolean z = this.v;
                SettingsGroupType settingsGroupType = this.w;
                ArrayList<Integer> arrayList = this.x;
                this.t = 1;
                obj = settingsModule.queryFields(z, settingsGroupType, arrayList, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySetting$1", f = "SettingsModule.kt", i = {}, l = {139, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ SettingsGroupType[] w;
        public final /* synthetic */ HMCallback<HashMap<SettingsGroupType, Settings>> x;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySetting$1$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ HMCallback<HashMap<SettingsGroupType, Settings>> u;
            public final /* synthetic */ HashMap<SettingsGroupType, Settings> v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<HashMap<SettingsGroupType, Settings>> hMCallback, HashMap<SettingsGroupType, Settings> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = hMCallback;
                this.v = map;
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
        public e(boolean z, SettingsGroupType[] settingsGroupTypeArr, HMCallback<HashMap<SettingsGroupType, Settings>> hMCallback, Continuation<? super e> continuation) {
            super(2, continuation);
            this.v = z;
            this.w = settingsGroupTypeArr;
            this.x = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new e(this.v, this.w, this.x, continuation);
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
            SettingsModule settingsModule = SettingsModule.this;
            boolean z = this.v;
            SettingsGroupType[] settingsGroupTypeArr = this.w;
            this.t = 1;
            obj = settingsModule.querySettings(z, settingsGroupTypeArr, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.x, (HashMap) obj, null);
            this.t = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {357, 305, 310}, m = "querySettings", n = {"this", "cmd", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    public static final class f extends ContinuationImpl {
        public Object t;
        public Object u;
        public Object v;
        public /* synthetic */ Object w;
        public int y;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.w = obj;
            this.y |= Integer.MIN_VALUE;
            return SettingsModule.this.querySettings(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySettings$3$response$1", f = "SettingsModule.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
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
            return SettingsModule.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) SettingsModule.this.channels.get(Boxing.boxInt(4));
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

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySettingsSync$1", f = "SettingsModule.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HashMap<SettingsGroupType, Settings>>, Object> {
        public int t;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ SettingsGroupType[] w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, SettingsGroupType[] settingsGroupTypeArr, Continuation<? super h> continuation) {
            super(2, continuation);
            this.v = z;
            this.w = settingsGroupTypeArr;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new h(this.v, this.w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = SettingsModule.this;
                boolean z = this.v;
                SettingsGroupType[] settingsGroupTypeArr = this.w;
                this.t = 1;
                obj = settingsModule.querySettings(z, settingsGroupTypeArr, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {0, 1}, l = {156, 162}, m = "queryVersion", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class i extends ContinuationImpl {
        public Object t;
        public /* synthetic */ Object u;
        public int w;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.u = obj;
            this.w |= Integer.MIN_VALUE;
            return SettingsModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersion$3", f = "SettingsModule.kt", i = {}, l = {SportReportBaseParser.ReportType.minWaterTemperature, 192}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HMCallback<Integer> v;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersion$3$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ HMCallback<Integer> u;
            public final /* synthetic */ Integer v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<Integer> hMCallback, Integer num, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = hMCallback;
                this.v = num;
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
        public j(HMCallback<Integer> hMCallback, Continuation<? super j> continuation) {
            super(2, continuation);
            this.v = hMCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new j(this.v, continuation);
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
            SettingsModule settingsModule = SettingsModule.this;
            this.t = 1;
            obj = settingsModule.queryVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.v, (Integer) obj, null);
            this.t = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersion$response$1", f = "SettingsModule.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
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
            return SettingsModule.this.new k(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) SettingsModule.this.channels.get(Boxing.boxInt(2));
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

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersionSync$1", f = "SettingsModule.kt", i = {}, l = {SportReportBaseParser.ReportType.avgDivingDepth}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int t;

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = SettingsModule.this;
                this.t = 1;
                obj = settingsModule.queryVersion(this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSetting$1", f = "SettingsModule.kt", i = {}, l = {89, 90}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int t;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> v;
        public final /* synthetic */ HMCallback<Object> w;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSetting$1$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ HMCallback<Object> u;
            public final /* synthetic */ boolean v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<Object> hMCallback, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = hMCallback;
                this.v = z;
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
        public m(HashMap<SettingsGroupType, Settings> map, HMCallback<Object> hMCallback, Continuation<? super m> continuation) {
            super(2, continuation);
            this.v = map;
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
            return SettingsModule.this.new m(this.v, this.w, continuation);
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
            SettingsModule settingsModule = SettingsModule.this;
            HashMap<SettingsGroupType, Settings> map = this.v;
            this.t = 1;
            obj = settingsModule.writeSetting(map, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.w, zBooleanValue, null);
            this.t = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {}, l = {97}, m = "writeSetting", n = {}, s = {})
    public static final class n extends ContinuationImpl {
        public /* synthetic */ Object t;
        public int v;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.t = obj;
            this.v |= Integer.MIN_VALUE;
            return SettingsModule.this.writeSetting((HashMap<SettingsGroupType, Settings>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSettingSync$1", f = "SettingsModule.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int t;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> u;
        public final /* synthetic */ SettingsModule v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HashMap<SettingsGroupType, Settings> map, SettingsModule settingsModule, Continuation<? super o> continuation) {
            super(2, continuation);
            this.u = map;
            this.v = settingsModule;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o(this.u, this.v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap<SettingsGroupType, Settings> map = this.u;
                if (map == null) {
                    return Boxing.boxBoolean(false);
                }
                SettingsModule settingsModule = this.v;
                this.t = 1;
                obj = settingsModule.writeSetting(map, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {0}, l = {285, 291}, m = "writeSettings", n = {"this"}, s = {"L$0"})
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
            return SettingsModule.this.writeSettings(null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lm4;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSettings$response$1", f = "SettingsModule.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
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
            return SettingsModule.this.new q(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = (Channel) SettingsModule.this.channels.get(Boxing.boxInt(6));
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
    public SettingsModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.channelController = channelController;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.job = LazyKt__LazyJVMKt.lazy(c.t);
        this.channels = new LinkedHashMap();
        this.settingsChangeListeners = new CopyOnWriteArrayList<>();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryFields(boolean z, SettingsGroupType settingsGroupType, ArrayList<Integer> arrayList, Continuation<? super Settings> continuation) {
        yi yiVar = this.settingsImpl;
        if (yiVar != null) {
            return yiVar.a(z, settingsGroupType, arrayList, continuation);
        }
        return null;
    }

    public static /* synthetic */ Object queryFields$default(SettingsModule settingsModule, boolean z, SettingsGroupType settingsGroupType, ArrayList arrayList, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return settingsModule.queryFields(z, settingsGroupType, (ArrayList<Integer>) arrayList, (Continuation<? super Settings>) continuation);
    }

    public static /* synthetic */ Settings queryFieldsSync$default(SettingsModule settingsModule, boolean z, SettingsGroupType settingsGroupType, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return settingsModule.queryFieldsSync(z, settingsGroupType, arrayList);
    }

    public static /* synthetic */ void querySetting$default(SettingsModule settingsModule, boolean z, SettingsGroupType[] settingsGroupTypeArr, HMCallback hMCallback, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        settingsModule.querySetting(z, settingsGroupTypeArr, hMCallback);
    }

    public static /* synthetic */ Object querySettings$default(SettingsModule settingsModule, boolean z, SettingsGroupType[] settingsGroupTypeArr, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return settingsModule.querySettings(z, settingsGroupTypeArr, continuation);
    }

    public static /* synthetic */ HashMap querySettingsSync$default(SettingsModule settingsModule, boolean z, SettingsGroupType[] settingsGroupTypeArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return settingsModule.querySettingsSync(z, settingsGroupTypeArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateGroupVersion(HashMap<SettingsGroupType, Settings> settings) {
        if (settings != null) {
            for (Map.Entry<SettingsGroupType, Settings> entry : settings.entrySet()) {
                ad.f888a.a(this, entry.getKey(), entry.getValue().getGroupVersion());
            }
        }
    }

    public final void addListener(@NotNull ChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.settingsChangeListeners.add(listener);
    }

    @NotNull
    public final r3 getChannelController() {
        return this.channelController;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Nullable
    public List<SettingsGroupType> getCurrentGroups() {
        is isVar = this.settingsVersion;
        if (isVar != null) {
            return isVar.a();
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    /* JADX INFO: renamed from: getModule */
    public int getChannelModule() {
        return 10;
    }

    @Nullable
    public final Integer getVersion() {
        is isVar = this.settingsVersion;
        if (isVar != null) {
            return Integer.valueOf(isVar.getF22030a());
        }
        return null;
    }

    public final int getVersionOrDefault() {
        is isVar = this.settingsVersion;
        if (isVar != null) {
            return isVar.getF22030a();
        }
        return 1;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getChannelModule(), false, new b(), 2, null);
    }

    public final void initDefaultSettings() {
        this.settingsVersion = new is(1, null, null, 6, null);
        this.settingsImpl = new gs(this);
    }

    @Nullable
    public final Settings queryFieldsSync(boolean needDesc, @NotNull SettingsGroupType groupType, @NotNull ArrayList<Integer> fieldList) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(fieldList, "fieldList");
        return (Settings) BuildersKt__BuildersKt.runBlocking$default(null, new d(needDesc, groupType, fieldList, null), 1, null);
    }

    public final void querySetting(boolean needDesc, @NotNull SettingsGroupType[] groupType, @NotNull HMCallback<HashMap<SettingsGroupType, Settings>> callback) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(needDesc, groupType, callback, null), 3, null);
    }

    @Nullable
    public final Object querySettings(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
        yi yiVar = this.settingsImpl;
        if (yiVar != null) {
            return yiVar.a(z, settingsGroupTypeArr, continuation);
        }
        return null;
    }

    @Nullable
    public final HashMap<SettingsGroupType, Settings> querySettingsSync(boolean needDesc, @NotNull SettingsGroupType[] groupType) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        return (HashMap) BuildersKt__BuildersKt.runBlocking$default(null, new h(needDesc, groupType, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00c0, please report this as an issue */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        i iVar;
        SettingsModule settingsModule;
        ChannelResponse channelResponse;
        String strD;
        is isVar;
        yi gsVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.w = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object objSendDataWithResult$default = iVar.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = iVar.w;
        Integer numBoxInt = null;
        if (i3 != 0) {
            if (i3 == 1) {
                settingsModule = (SettingsModule) iVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsModule = (SettingsModule) iVar.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            StringBuilder sb = new StringBuilder();
            sb.append("queryVersion: ");
            if (channelResponse != null) {
                strD = channelResponse.d();
            } else {
                strD = null;
            }
            sb.append(strD);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null) {
                t5t.d(TAG, "get data null");
            } else {
                settingsModule.settingsVersion = fs.a(channelResponse.getData());
                t5t.d(TAG, "settingsVersion: " + settingsModule.settingsVersion);
                isVar = settingsModule.settingsVersion;
                if (isVar != null) {
                    numBoxInt = Boxing.boxInt(isVar.getF22030a());
                }
            }
            if (settingsModule.settingsImpl == null) {
                if (numBoxInt != null || numBoxInt.intValue() == 1) {
                    gsVar = new gs(settingsModule);
                } else {
                    hs hsVar = new hs(settingsModule);
                    hsVar.a(new n6());
                    gsVar = hsVar;
                }
                settingsModule.settingsImpl = gsVar;
            }
            return numBoxInt;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, null, null, 7, null));
        iVar.t = this;
        iVar.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, new byte[]{1}, 0, false, iVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        settingsModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "queryVersion result: " + zBooleanValue);
        if (!zBooleanValue) {
            return null;
        }
        k kVar = settingsModule.new k(null);
        iVar.t = settingsModule;
        iVar.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, kVar, iVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("queryVersion: ");
        if (channelResponse != null) {
            strD = channelResponse.d();
        } else {
            strD = null;
        }
        sb2.append(strD);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
            t5t.d(TAG, "get data null");
        } else {
            settingsModule.settingsVersion = fs.a(channelResponse.getData());
            t5t.d(TAG, "settingsVersion: " + settingsModule.settingsVersion);
            isVar = settingsModule.settingsVersion;
            if (isVar != null) {
                numBoxInt = Boxing.boxInt(isVar.getF22030a());
            }
        }
        if (settingsModule.settingsImpl == null) {
            if (numBoxInt != null) {
                gsVar = new gs(settingsModule);
            } else {
                gsVar = new gs(settingsModule);
            }
            settingsModule.settingsImpl = gsVar;
        }
        return numBoxInt;
    }

    @Nullable
    public final Integer queryVersionSync() {
        return (Integer) BuildersKt__BuildersKt.runBlocking$default(null, new l(null), 1, null);
    }

    public final void removeListener(@NotNull ChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.settingsChangeListeners.remove(listener);
    }

    public final void resetSettingsImpl() {
        this.settingsImpl = null;
    }

    public final boolean supportGroup(@NotNull SettingsGroupType group) {
        List<SettingsGroupType> listA;
        Intrinsics.checkNotNullParameter(group, "group");
        is isVar = this.settingsVersion;
        if (isVar == null || (listA = isVar.a()) == null) {
            return false;
        }
        return listA.contains(group);
    }

    public final void writeSetting(@NotNull HashMap<SettingsGroupType, Settings> setting, @NotNull HMCallback<Object> callback) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new m(setting, callback, null), 3, null);
    }

    public final boolean writeSettingSync(@Nullable HashMap<SettingsGroupType, Settings> setting) {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new o(setting, this, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // defpackage.j2
    @Nullable
    public Object writeSettings(@Nullable byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        p pVar;
        SettingsModule settingsModule;
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
        p pVar2 = pVar;
        Object objSendDataWithResult$default = pVar2.u;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pVar2.w;
        if (i3 != 0) {
            if (i3 == 1) {
                settingsModule = (SettingsModule) pVar2.t;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            StringBuilder sb = new StringBuilder();
            sb.append("writeSetting: ");
            sb.append(channelResponse != null ? channelResponse.d() : null);
            t5t.d(TAG, sb.toString());
            if (channelResponse == null && channelResponse.getData().length == 2) {
                return Boxing.boxBoolean(channelResponse.getData()[0] == 6 && channelResponse.getData()[1] == bs.SUCCESS.getT());
            }
            return Boxing.boxBoolean(false);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        t5t.d(TAG, "writeSettings cmd: " + tet.x(bArr));
        if (bArr == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, null, null, 7, null));
        pVar2.t = this;
        pVar2.w = 1;
        objSendDataWithResult$default = a.sendDataWithResult$default(this, bArr, 0, false, pVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        settingsModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        t5t.d(TAG, "writeSetting ret: " + zBooleanValue);
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        q qVar = settingsModule.new q(null);
        pVar2.t = null;
        pVar2.w = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, qVar, pVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("writeSetting: ");
        sb2.append(channelResponse != null ? channelResponse.d() : null);
        t5t.d(TAG, sb2.toString());
        if (channelResponse == null) {
        }
        return Boxing.boxBoolean(false);
    }

    public static /* synthetic */ Object queryFields$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, int[] iArr, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return settingsModule.queryFields(settingsGroupType, iArr, z, (Continuation<? super Settings>) continuation);
    }

    @Nullable
    public final Object queryFields(@NotNull SettingsGroupType settingsGroupType, @NotNull int[] iArr, boolean z, @NotNull Continuation<? super Settings> continuation) {
        return queryFields(z, settingsGroupType, new ArrayList<>(ArraysKt___ArraysKt.toList(iArr)), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ea A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:42:0x00ff, B:44:0x0116, B:46:0x011c, B:49:0x0129, B:51:0x012d, B:55:0x0139, B:57:0x013e, B:21:0x0053, B:35:0x00cc, B:38:0x00ea), top: B:65:0x002b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x003b, B:42:0x00ff, B:44:0x0116, B:46:0x011c, B:49:0x0129, B:51:0x012d, B:55:0x0139, B:57:0x013e, B:21:0x0053, B:35:0x00cc, B:38:0x00ea), top: B:65:0x002b, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d A[Catch: all -> 0x0040, Exception -> 0x0136, TryCatch #2 {Exception -> 0x0136, blocks: (B:49:0x0129, B:51:0x012d, B:55:0x0139), top: B:68:0x0129, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    @Override // defpackage.j2
    @Nullable
    public Object querySettings(@Nullable byte[] bArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) throws Throwable {
        f fVar;
        ?? r15;
        byte[] bArr2;
        SettingsModule settingsModule;
        SettingsModule settingsModule2;
        ?? r3;
        boolean zBooleanValue;
        SettingsModule settingsModule3;
        ?? r16;
        HashMap<SettingsGroupType, Settings> mapA;
        ?? r17;
        ?? r4;
        ChannelResponse channelResponse;
        String strD;
        yi yiVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.y = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objWithTimeoutOrNull = fVar.w;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r5 = fVar.y;
        try {
            try {
                if (r5 != 0) {
                    if (r5 == 1) {
                        Mutex mutex = (Mutex) fVar.v;
                        byte[] bArr3 = (byte[]) fVar.u;
                        SettingsModule settingsModule4 = (SettingsModule) fVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        r15 = mutex;
                        bArr2 = bArr3;
                        settingsModule = settingsModule4;
                    } else {
                        if (r5 == 2) {
                            Mutex mutex2 = (Mutex) fVar.u;
                            settingsModule2 = (SettingsModule) fVar.t;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            r3 = mutex2;
                            zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                            t5t.d(TAG, "querySettings ret: " + zBooleanValue);
                            r4 = r3;
                            if (zBooleanValue) {
                                g gVar = settingsModule2.new g(null);
                                fVar.t = settingsModule2;
                                fVar.u = r3;
                                fVar.y = 3;
                                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, gVar, fVar);
                                if (objWithTimeoutOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                settingsModule3 = settingsModule2;
                                r5 = r3;
                            }
                            r17 = r4;
                            mapA = null;
                            r16 = r17;
                            r16.unlock(null);
                            return mapA;
                        }
                        if (r5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex3 = (Mutex) fVar.u;
                        settingsModule3 = (SettingsModule) fVar.t;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        r5 = mutex3;
                    }
                    channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                    settingsModule3.channels.remove(Boxing.boxInt(4));
                    StringBuilder sb = new StringBuilder();
                    sb.append("querySettings: ");
                    if (channelResponse != null) {
                        strD = channelResponse.d();
                    } else {
                        strD = null;
                    }
                    sb.append(strD);
                    t5t.d(TAG, sb.toString());
                    r4 = r5;
                    if (channelResponse != null) {
                        try {
                            yiVar = settingsModule3.settingsImpl;
                            if (yiVar != null) {
                                mapA = yiVar.a(channelResponse.getData());
                            } else {
                                mapA = null;
                            }
                            settingsModule3.updateGroupVersion(mapA);
                            r16 = r5;
                        } catch (Exception e2) {
                            t5t.d(TAG, "e: " + e2);
                            r4 = r5;
                            r17 = r4;
                            mapA = null;
                            r16 = r17;
                        }
                        r16.unlock(null);
                        return mapA;
                    }
                    r17 = r4;
                    mapA = null;
                    r16 = r17;
                    r16.unlock(null);
                    return mapA;
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                Mutex mutex4 = this.mutex;
                fVar.t = this;
                bArr2 = bArr;
                fVar.u = bArr2;
                fVar.v = mutex4;
                fVar.y = 1;
                if (mutex4.lock(null, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingsModule = this;
                r15 = mutex4;
                t5t.d(TAG, "querySettings cmd: " + tet.x(bArr2));
                r17 = r15;
                if (bArr2 == null) {
                    mapA = null;
                    r16 = r17;
                } else {
                    settingsModule.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, null, null, 7, null));
                    fVar.t = settingsModule;
                    fVar.u = r15;
                    fVar.v = null;
                    fVar.y = 2;
                    SettingsModule settingsModule5 = settingsModule;
                    Object objSendDataWithResult$default = a.sendDataWithResult$default(settingsModule, bArr2, 0, false, fVar, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsModule2 = settingsModule5;
                    objWithTimeoutOrNull = objSendDataWithResult$default;
                    r3 = r15;
                    zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                    t5t.d(TAG, "querySettings ret: " + zBooleanValue);
                    r4 = r3;
                    if (zBooleanValue) {
                        g gVar2 = settingsModule2.new g(null);
                        fVar.t = settingsModule2;
                        fVar.u = r3;
                        fVar.y = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, gVar2, fVar);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        settingsModule3 = settingsModule2;
                        r5 = r3;
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        settingsModule3.channels.remove(Boxing.boxInt(4));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("querySettings: ");
                        if (channelResponse != null) {
                            strD = channelResponse.d();
                        } else {
                            strD = null;
                        }
                        sb2.append(strD);
                        t5t.d(TAG, sb2.toString());
                        r4 = r5;
                        if (channelResponse != null) {
                            yiVar = settingsModule3.settingsImpl;
                            if (yiVar != null) {
                                mapA = yiVar.a(channelResponse.getData());
                            } else {
                                mapA = null;
                            }
                            settingsModule3.updateGroupVersion(mapA);
                            r16 = r5;
                        }
                    }
                    r17 = r4;
                    mapA = null;
                    r16 = r17;
                }
                r16.unlock(null);
                return mapA;
            } catch (Throwable th) {
                th = th;
                r15.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r15 = r5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object writeSetting(@NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation) {
        n nVar;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.v = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        } else {
            nVar = new n(continuation);
        }
        Object objA = nVar.t;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.v;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objA);
            yi yiVar = this.settingsImpl;
            if (yiVar != null) {
                nVar.v = 1;
                objA = yiVar.a(map, nVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objA);
        boolean z = ((Boolean) objA).booleanValue();
        return Boxing.boxBoolean(z);
    }

    public final void queryVersion(@NotNull HMCallback<Integer> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new j(callback, null), 3, null);
    }
}
