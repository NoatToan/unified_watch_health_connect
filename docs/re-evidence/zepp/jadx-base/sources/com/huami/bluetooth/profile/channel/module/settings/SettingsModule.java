package com.huami.bluetooth.profile.channel.module.settings;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.SettingsVersion;
import com.huami.bluetooth.profile.channel.module.settings.interfaces.BleProvider;
import com.huami.bluetooth.profile.channel.module.settings.interfaces.ISettings;
import com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV1;
import com.huami.bluetooth.profile.channel.module.settings.interfaces.SettingsV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
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

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 10)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001fB\u000f\u0012\u0006\u0010@\u001a\u00020;¢\u0006\u0004\bd\u0010eJ?\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00122&\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u0010H\u0002J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0016J.\u0010\u001a\u001a\u00020\u00042&\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u0010J8\u0010\u001e\u001a\u00020\u00122\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ7\u0010\u001e\u001a\u00020\u00042\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f`\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J3\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000b\u001a\u00020#\"\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J2\u0010&\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nJE\u0010'\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0004\b'\u0010(JS\u0010)\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060 2,\u0010\u001d\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00100\u001b¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020\u0012J\u0015\u0010,\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b.\u0010/J\u0014\u0010,\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001bJ\u001d\u00102\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000100H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J=\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001`\u00102\b\u00101\u001a\u0004\u0018\u000100H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u00103J\u0006\u00104\u001a\u00020\u0012J\u0010\u00106\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u000105H\u0016J\u0006\u00107\u001a\u00020\tJ\u000f\u00108\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b8\u0010/J\u000e\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0006R\u0019\u0010@\u001a\u00020;8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010J\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR(\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00140Y8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0016\u0010c\u001a\u00020\t8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006g"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/BleProvider;", "", "needDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "fieldList", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", GoogleApiAvailabilityLight.a, "(ZLcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "settings", "", "f", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", PointCategory.INIT, "setting", "writeSettingSync", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callback", "writeSetting", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryFields", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;[IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFieldsSync", "querySettingsSync", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;)Ljava/util/HashMap;", "querySetting", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "initDefaultSettings", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryVersionSync", "()Ljava/lang/Integer;", "", Constant.h, "writeSettings", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetSettingsImpl", "", "getCurrentGroups", "getVersionOrDefault", "getVersion", "group", "supportGroup", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "g", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "getChannelController", "()Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "Lkotlinx/coroutines/sync/Mutex;", "h", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/Job;", "i", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", z.j, "Ljava/util/Map;", "channels", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/SettingsVersion;", hl.k, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/SettingsVersion;", "settingsVersion", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/ISettings;", "l", "Lcom/huami/bluetooth/profile/channel/module/settings/interfaces/ISettings;", "settingsImpl", "Ljava/util/concurrent/CopyOnWriteArrayList;", "m", "Ljava/util/concurrent/CopyOnWriteArrayList;", "settingsChangeListeners", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getModule", "()I", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsModule extends BaseModule implements CoroutineScope, BleProvider {
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
    private static final String n = "SettingsModule";
    private static final long o = 15000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ChannelApi channelController;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Mutex mutex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Channel<ChannelResponse>> channels;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private SettingsVersion settingsVersion;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private ISettings settingsImpl;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<ChangeListener> settingsChangeListeners;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.SettingsModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$init$1$1", f = "SettingsModule.kt", i = {}, l = {62, 69}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0332a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ SettingsModule c;

            /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.settings.SettingsModule$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$init$1$1$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0333a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ SettingsModule b;
                public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0333a(SettingsModule settingsModule, HashMap<SettingsGroupType, Settings> map, Continuation<? super C0333a> continuation) {
                    super(2, continuation);
                    this.b = settingsModule;
                    this.c = map;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0333a(this.b, this.c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((C0333a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b.settingsChangeListeners;
                    HashMap<SettingsGroupType, Settings> map = this.c;
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        ((ChangeListener) it2.next()).onChange(map);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0332a(ChannelResponse channelResponse, SettingsModule settingsModule, Continuation<? super C0332a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = settingsModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0332a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0332a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    Channel channel = (Channel) this.c.channels.get(Boxing.boxInt(ArraysKt___ArraysKt.first(this.b.getData())));
                    if (channel != null) {
                        ChannelResponse channelResponse = this.b;
                        this.a = 1;
                        if (channel.send(channelResponse, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        ISettings iSettings = this.c.settingsImpl;
                        HashMap<SettingsGroupType, Settings> settings = iSettings == null ? null : iSettings.parseSettings(this.b.getData());
                        this.c.f(settings);
                        Debug.fi(SettingsModule.n, "settings change: " + settings + ", listener size: " + this.c.settingsChangeListeners.size());
                        if (settings != null) {
                            MainCoroutineDispatcher main = Dispatchers.getMain();
                            C0333a c0333a = new C0333a(this.c, settings, null);
                            this.a = 2;
                            if (BuildersKt.withContext(main, c0333a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            Debug.fi(SettingsModule.n, "settings null");
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            SettingsModule settingsModule = SettingsModule.this;
            kotlinx.coroutines.e.f(settingsModule, null, null, new C0332a(channelResponse, settingsModule, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Job> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryFieldsSync$1", f = "SettingsModule.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SettingsGroupType d;
        public final /* synthetic */ ArrayList<Integer> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, SettingsGroupType settingsGroupType, ArrayList<Integer> arrayList, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = settingsGroupType;
            this.e = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Settings> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = SettingsModule.this;
                boolean z = this.c;
                SettingsGroupType settingsGroupType = this.d;
                ArrayList<Integer> arrayList = this.e;
                this.a = 1;
                obj = settingsModule.d(z, settingsGroupType, arrayList, this);
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
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySetting$1", f = "SettingsModule.kt", i = {}, l = {139, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SettingsGroupType[] d;
        public final /* synthetic */ HMCallback<HashMap<SettingsGroupType, Settings>> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySetting$1$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HMCallback<HashMap<SettingsGroupType, Settings>> b;
            public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<HashMap<SettingsGroupType, Settings>> hMCallback, HashMap<SettingsGroupType, Settings> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hMCallback;
                this.c = map;
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
        public d(boolean z, SettingsGroupType[] settingsGroupTypeArr, HMCallback<HashMap<SettingsGroupType, Settings>> hMCallback, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = settingsGroupTypeArr;
            this.e = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new d(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            SettingsModule settingsModule = SettingsModule.this;
            boolean z = this.c;
            SettingsGroupType[] settingsGroupTypeArr = this.d;
            this.a = 1;
            obj = settingsModule.querySettings(z, settingsGroupTypeArr, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.e, (HashMap) obj, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {0, 0, 0}, l = {353, 305, 310}, m = "querySettings", n = {"this", Constant.h, "$receiver$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class e extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return SettingsModule.this.querySettings(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySettings$3$response$1", f = "SettingsModule.kt", i = {}, l = {310}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new f(continuation);
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
                Channel channel = (Channel) SettingsModule.this.channels.get(Boxing.boxInt(4));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$querySettingsSync$1", f = "SettingsModule.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HashMap<SettingsGroupType, Settings>>, Object> {
        public int a;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ SettingsGroupType[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, SettingsGroupType[] settingsGroupTypeArr, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = z;
            this.d = settingsGroupTypeArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new g(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = SettingsModule.this;
                boolean z = this.c;
                SettingsGroupType[] settingsGroupTypeArr = this.d;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {}, l = {156, 162}, m = "queryVersion", n = {}, s = {})
    public static final class h extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SettingsModule.this.queryVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersion$3", f = "SettingsModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 192}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMCallback<Integer> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersion$3$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HMCallback<Integer> b;
            public final /* synthetic */ Integer c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<Integer> hMCallback, Integer num, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hMCallback;
                this.c = num;
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
        public i(HMCallback<Integer> hMCallback, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new i(this.c, continuation);
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
            this.a = 1;
            obj = settingsModule.queryVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.c, (Integer) obj, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersion$response$1", f = "SettingsModule.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new j(continuation);
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
                Channel channel = (Channel) SettingsModule.this.channels.get(Boxing.boxInt(2));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$queryVersionSync$1", f = "SettingsModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DISCO}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = SettingsModule.this;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSetting$1", f = "SettingsModule.kt", i = {}, l = {89, 90}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ HMCallback<Object> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSetting$1$1", f = "SettingsModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HMCallback<Object> b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMCallback<Object> hMCallback, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hMCallback;
                this.c = z;
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
        public l(HashMap<SettingsGroupType, Settings> map, HMCallback<Object> hMCallback, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new l(this.c, this.d, continuation);
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
            HashMap<SettingsGroupType, Settings> map = this.c;
            this.a = 1;
            obj = settingsModule.writeSetting(map, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(this.d, zBooleanValue, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {}, l = {97}, m = "writeSetting", n = {}, s = {})
    public static final class m extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return SettingsModule.this.writeSetting((HashMap<SettingsGroupType, Settings>) null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSettingSync$1", f = "SettingsModule.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> b;
        public final /* synthetic */ SettingsModule c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HashMap<SettingsGroupType, Settings> map, SettingsModule settingsModule, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = map;
            this.c = settingsModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap<SettingsGroupType, Settings> map = this.b;
                if (map == null) {
                    return Boxing.boxBoolean(false);
                }
                SettingsModule settingsModule = this.c;
                this.a = 1;
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule", f = "SettingsModule.kt", i = {}, l = {285, 291}, m = "writeSettings", n = {}, s = {})
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
            return SettingsModule.this.writeSettings(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.settings.SettingsModule$writeSettings$response$1", f = "SettingsModule.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResponse>, Object> {
        public int a;

        public p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsModule.this.new p(continuation);
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
                Channel channel = (Channel) SettingsModule.this.channels.get(Boxing.boxInt(6));
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

    public SettingsModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.channelController = channelApi;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.job = LazyKt__LazyJVMKt.lazy(b.a);
        this.channels = new LinkedHashMap();
        this.settingsChangeListeners = new CopyOnWriteArrayList<>();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(boolean z, SettingsGroupType settingsGroupType, ArrayList<Integer> arrayList, Continuation<? super Settings> continuation) {
        ISettings iSettings = this.settingsImpl;
        if (iSettings == null) {
            return null;
        }
        return iSettings.queryField(z, settingsGroupType, arrayList, continuation);
    }

    public static /* synthetic */ Object e(SettingsModule settingsModule, boolean z, SettingsGroupType settingsGroupType, ArrayList arrayList, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return settingsModule.d(z, settingsGroupType, arrayList, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(HashMap<SettingsGroupType, Settings> settings) {
        if (settings == null) {
            return;
        }
        for (Map.Entry<SettingsGroupType, Settings> entry : settings.entrySet()) {
            GroupVersionCache.INSTANCE.setGroupVersion(this, entry.getKey(), entry.getValue().getGroupVersion());
        }
    }

    public static /* synthetic */ Object queryFields$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, int[] iArr, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return settingsModule.queryFields(settingsGroupType, iArr, z, continuation);
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

    public final void addListener(@NotNull ChangeListener listener) {
        this.settingsChangeListeners.add(listener);
    }

    @NotNull
    public final ChannelApi getChannelController() {
        return this.channelController;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.BleProvider
    @Nullable
    public List<SettingsGroupType> getCurrentGroups() {
        SettingsVersion settingsVersion = this.settingsVersion;
        if (settingsVersion == null) {
            return null;
        }
        return settingsVersion.getGroupList();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 10;
    }

    @Nullable
    public final Integer getVersion() {
        SettingsVersion settingsVersion = this.settingsVersion;
        if (settingsVersion == null) {
            return null;
        }
        return Integer.valueOf(settingsVersion.getProtocolVersion());
    }

    public final int getVersionOrDefault() {
        SettingsVersion settingsVersion = this.settingsVersion;
        if (settingsVersion == null) {
            return 1;
        }
        return settingsVersion.getProtocolVersion();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    public final void initDefaultSettings() {
        this.settingsVersion = new SettingsVersion(1, null, null, 6, null);
        this.settingsImpl = new SettingsV1(this);
    }

    @Nullable
    public final Object queryFields(@NotNull SettingsGroupType settingsGroupType, @NotNull int[] iArr, boolean z, @NotNull Continuation<? super Settings> continuation) {
        return d(z, settingsGroupType, new ArrayList<>(ArraysKt___ArraysKt.toList(iArr)), continuation);
    }

    @Nullable
    public final Settings queryFieldsSync(boolean needDesc, @NotNull SettingsGroupType groupType, @NotNull ArrayList<Integer> fieldList) {
        return (Settings) kotlinx.coroutines.d.b(null, new c(needDesc, groupType, fieldList, null), 1, null);
    }

    public final void querySetting(boolean needDesc, @NotNull SettingsGroupType[] groupType, @NotNull HMCallback<HashMap<SettingsGroupType, Settings>> callback) {
        kotlinx.coroutines.e.f(this, null, null, new d(needDesc, groupType, callback, null), 3, null);
    }

    @Nullable
    public final Object querySettings(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
        ISettings iSettings = this.settingsImpl;
        if (iSettings == null) {
            return null;
        }
        return iSettings.querySettings(z, settingsGroupTypeArr, continuation);
    }

    @Nullable
    public final HashMap<SettingsGroupType, Settings> querySettingsSync(boolean needDesc, @NotNull SettingsGroupType[] groupType) {
        return (HashMap) kotlinx.coroutines.d.b(null, new g(needDesc, groupType, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object queryVersion(@NotNull Continuation<? super Integer> continuation) {
        h hVar;
        SettingsModule settingsModule;
        SettingsModule settingsModule2;
        ChannelResponse channelResponse;
        String hexString;
        SettingsVersion settingsVersion;
        ISettings settingsV1;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.d = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objSendDataWithResult$default = hVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.d;
        Integer numBoxInt = null;
        if (i3 != 0) {
            if (i3 == 1) {
                settingsModule = (SettingsModule) hVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsModule2 = (SettingsModule) hVar.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            if (channelResponse == null) {
                hexString = null;
            } else {
                hexString = channelResponse.toHexString();
            }
            Debug.fi(n, Intrinsics.stringPlus("queryVersion: ", hexString));
            if (channelResponse == null) {
                Debug.fi(n, "get data null");
            } else {
                SettingsVersion version = SettingsParserKt.parseVersion(channelResponse.getData());
                settingsModule2.settingsVersion = version;
                Debug.fi(n, Intrinsics.stringPlus("settingsVersion: ", version));
                settingsVersion = settingsModule2.settingsVersion;
                if (settingsVersion != null) {
                    numBoxInt = Boxing.boxInt(settingsVersion.getProtocolVersion());
                }
            }
            if (settingsModule2.settingsImpl == null) {
                if (numBoxInt != null || numBoxInt.intValue() == 1) {
                    settingsV1 = new SettingsV1(settingsModule2);
                } else {
                    SettingsV2 settingsV2 = new SettingsV2(settingsModule2);
                    settingsV2.setInterceptor(new DefaultInterceptor());
                    Unit unit = Unit.INSTANCE;
                    settingsV1 = settingsV2;
                }
                settingsModule2.settingsImpl = settingsV1;
            }
            return numBoxInt;
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        this.channels.put(Boxing.boxInt(2), ChannelKt.Channel$default(0, 1, null));
        hVar.a = this;
        hVar.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, new byte[]{1}, 0, false, hVar, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        settingsModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(n, Intrinsics.stringPlus("queryVersion result: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return null;
        }
        j jVar = settingsModule.new j(null);
        hVar.a = settingsModule;
        hVar.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, jVar, hVar);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        settingsModule2 = settingsModule;
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        if (channelResponse == null) {
            hexString = null;
        } else {
            hexString = channelResponse.toHexString();
        }
        Debug.fi(n, Intrinsics.stringPlus("queryVersion: ", hexString));
        if (channelResponse == null) {
            Debug.fi(n, "get data null");
        } else {
            SettingsVersion version2 = SettingsParserKt.parseVersion(channelResponse.getData());
            settingsModule2.settingsVersion = version2;
            Debug.fi(n, Intrinsics.stringPlus("settingsVersion: ", version2));
            settingsVersion = settingsModule2.settingsVersion;
            if (settingsVersion != null) {
                numBoxInt = Boxing.boxInt(settingsVersion.getProtocolVersion());
            }
        }
        if (settingsModule2.settingsImpl == null) {
            if (numBoxInt != null) {
                settingsV1 = new SettingsV1(settingsModule2);
            } else {
                settingsV1 = new SettingsV1(settingsModule2);
            }
            settingsModule2.settingsImpl = settingsV1;
        }
        return numBoxInt;
    }

    @Nullable
    public final Integer queryVersionSync() {
        return (Integer) kotlinx.coroutines.d.b(null, new k(null), 1, null);
    }

    public final void removeListener(@NotNull ChangeListener listener) {
        this.settingsChangeListeners.remove(listener);
    }

    public final void resetSettingsImpl() {
        this.settingsImpl = null;
    }

    public final boolean supportGroup(@NotNull SettingsGroupType group) {
        List<SettingsGroupType> groupList;
        SettingsVersion settingsVersion = this.settingsVersion;
        if (settingsVersion == null || (groupList = settingsVersion.getGroupList()) == null) {
            return false;
        }
        return groupList.contains(group);
    }

    public final void writeSetting(@NotNull HashMap<SettingsGroupType, Settings> setting, @NotNull HMCallback<Object> callback) {
        kotlinx.coroutines.e.f(this, null, null, new l(setting, callback, null), 3, null);
    }

    public final boolean writeSettingSync(@Nullable HashMap<SettingsGroupType, Settings> setting) {
        return ((Boolean) kotlinx.coroutines.d.b(null, new n(setting, this, null), 1, null)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.BleProvider
    @Nullable
    public Object writeSettings(@Nullable byte[] bArr, @NotNull Continuation<? super Boolean> continuation) {
        o oVar;
        SettingsModule settingsModule;
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
        o oVar2 = oVar;
        Object objSendDataWithResult$default = oVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar2.d;
        if (i3 != 0) {
            if (i3 == 1) {
                settingsModule = (SettingsModule) oVar2.a;
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendDataWithResult$default);
            }
            channelResponse = (ChannelResponse) objSendDataWithResult$default;
            Debug.fi(n, Intrinsics.stringPlus("writeSetting: ", channelResponse != null ? channelResponse.toHexString() : null));
            if (channelResponse == null && channelResponse.getData().length == 2) {
                return Boxing.boxBoolean(channelResponse.getData()[0] == 6 && channelResponse.getData()[1] == SettingsError.SUCCESS.getErrorCode());
            }
            return Boxing.boxBoolean(false);
        }
        ResultKt.throwOnFailure(objSendDataWithResult$default);
        Debug.fi(n, Intrinsics.stringPlus("writeSettings cmd: ", GattUtils.bytesToHexString(bArr)));
        if (bArr == null) {
            return Boxing.boxBoolean(false);
        }
        this.channels.put(Boxing.boxInt(6), ChannelKt.Channel$default(0, 1, null));
        oVar2.a = this;
        oVar2.d = 1;
        objSendDataWithResult$default = BaseModule.sendDataWithResult$default(this, bArr, 0, false, oVar2, 6, null);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        settingsModule = this;
        boolean zBooleanValue = ((Boolean) objSendDataWithResult$default).booleanValue();
        Debug.fi(n, Intrinsics.stringPlus("writeSetting ret: ", Boxing.boxBoolean(zBooleanValue)));
        if (!zBooleanValue) {
            return Boxing.boxBoolean(false);
        }
        p pVar = settingsModule.new p(null);
        oVar2.a = null;
        oVar2.d = 2;
        objSendDataWithResult$default = TimeoutKt.withTimeoutOrNull(15000L, pVar, oVar2);
        if (objSendDataWithResult$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        channelResponse = (ChannelResponse) objSendDataWithResult$default;
        Debug.fi(n, Intrinsics.stringPlus("writeSetting: ", channelResponse != null ? channelResponse.toHexString() : null));
        if (channelResponse == null) {
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[PHI: r3 r11
      0x00e4: PHI (r3v5 ??) = (r3v23 ??), (r3v24 ??), (r3v25 ??) binds: [B:53:0x0118, B:62:0x0130, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r11v4 kotlin.coroutines.Continuation) = (r11v3 kotlin.coroutines.Continuation), (r11v3 kotlin.coroutines.Continuation), (r11v5 kotlin.coroutines.Continuation) binds: [B:53:0x0118, B:62:0x0130, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7 A[Catch: all -> 0x013e, TryCatch #4 {all -> 0x013e, blocks: (B:48:0x00fc, B:52:0x0111, B:55:0x011b, B:59:0x012a, B:58:0x0121, B:62:0x0130, B:51:0x010d, B:37:0x00cb, B:41:0x00d7, B:44:0x00e7), top: B:82:0x00cb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d A[Catch: all -> 0x013e, TryCatch #4 {all -> 0x013e, blocks: (B:48:0x00fc, B:52:0x0111, B:55:0x011b, B:59:0x012a, B:58:0x0121, B:62:0x0130, B:51:0x010d, B:37:0x00cb, B:41:0x00d7, B:44:0x00e7), top: B:82:0x00cb, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121 A[Catch: Exception -> 0x012f, all -> 0x013e, TryCatch #1 {Exception -> 0x012f, blocks: (B:55:0x011b, B:59:0x012a, B:58:0x0121), top: B:77:0x011b, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.huami.bluetooth.profile.channel.module.settings.SettingsModule] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.huami.bluetooth.profile.channel.module.settings.interfaces.BleProvider
    @Nullable
    public Object querySettings(@Nullable byte[] bArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) throws Throwable {
        e eVar;
        Mutex mutex;
        SettingsModule settingsModule;
        byte[] bArr2;
        Continuation continuation2;
        Throwable th;
        ?? r2;
        ChannelResponse channelResponse;
        Object hexString;
        ISettings iSettings;
        ?? settings;
        ?? r8;
        ?? r3;
        SettingsModule settingsModule2;
        boolean zBooleanValue;
        Mutex mutex2;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.f = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objWithTimeoutOrNull = eVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        ?? r4 = eVar.f;
        boolean z = true;
        ?? r9 = 0;
        try {
            if (r4 != 0) {
                if (r4 != 1) {
                    try {
                        if (r4 == 2) {
                            Mutex mutex3 = (Mutex) eVar.b;
                            settingsModule2 = (SettingsModule) eVar.a;
                            ResultKt.throwOnFailure(objWithTimeoutOrNull);
                            continuation2 = null;
                            r4 = mutex3;
                            try {
                                zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                                if (zBooleanValue) {
                                    z = false;
                                }
                                Debug.fi(n, Intrinsics.stringPlus("querySettings ret: ", Boxing.boxBoolean(z)));
                                r3 = r4;
                                if (zBooleanValue) {
                                    f fVar = settingsModule2.new f(continuation2);
                                    eVar.a = settingsModule2;
                                    eVar.b = r4;
                                    eVar.f = 3;
                                    objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, fVar, eVar);
                                    if (objWithTimeoutOrNull == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    r2 = settingsModule2;
                                    r4 = r4;
                                } else {
                                    r8 = r3;
                                    r9 = continuation2;
                                }
                                r8.unlock(continuation2);
                                return r9;
                            } catch (Throwable th2) {
                                th = th2;
                                r4.unlock(continuation2);
                                throw th;
                            }
                        }
                        if (r4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex4 = (Mutex) eVar.b;
                        SettingsModule settingsModule3 = (SettingsModule) eVar.a;
                        ResultKt.throwOnFailure(objWithTimeoutOrNull);
                        continuation2 = null;
                        r2 = settingsModule3;
                        r4 = mutex4;
                    } catch (Throwable th3) {
                        th = th3;
                        continuation2 = null;
                        r4.unlock(continuation2);
                        throw th;
                    }
                } else {
                    Mutex mutex5 = (Mutex) eVar.c;
                    bArr2 = (byte[]) eVar.b;
                    SettingsModule settingsModule4 = (SettingsModule) eVar.a;
                    ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    mutex = mutex5;
                    settingsModule = settingsModule4;
                }
                channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                r2.channels.remove(Boxing.boxInt(4));
                if (channelResponse == null) {
                    hexString = continuation2;
                } else {
                    hexString = channelResponse.toHexString();
                }
                Debug.fi(n, Intrinsics.stringPlus("querySettings: ", hexString));
                r3 = r4;
                if (channelResponse == null) {
                    r8 = r3;
                    r9 = continuation2;
                } else {
                    try {
                        iSettings = r2.settingsImpl;
                        if (iSettings == null) {
                            settings = continuation2;
                        } else {
                            settings = iSettings.parseSettings(channelResponse.getData());
                        }
                        r2.f(settings);
                        r8 = r4;
                        r9 = settings;
                    } catch (Exception e2) {
                        Debug.fi(n, Intrinsics.stringPlus("e: ", e2));
                        r3 = r4;
                        r8 = r3;
                        r9 = continuation2;
                        r8.unlock(continuation2);
                        return r9;
                    }
                }
                r8.unlock(continuation2);
                return r9;
            }
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            Mutex mutex6 = this.mutex;
            eVar.a = this;
            eVar.b = bArr;
            eVar.c = mutex6;
            eVar.f = 1;
            if (mutex6.lock(null, eVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex6;
            settingsModule = this;
            bArr2 = bArr;
            Debug.fi(n, Intrinsics.stringPlus("querySettings cmd: ", GattUtils.bytesToHexString(bArr2)));
            if (bArr2 == null) {
                continuation2 = null;
                r8 = mutex;
            } else {
                settingsModule.channels.put(Boxing.boxInt(4), ChannelKt.Channel$default(0, 1, null));
                eVar.a = settingsModule;
                eVar.b = mutex;
                eVar.c = null;
                eVar.f = 2;
                mutex2 = mutex;
                continuation2 = null;
                try {
                    Object objSendDataWithResult$default = BaseModule.sendDataWithResult$default(settingsModule, bArr2, 0, false, eVar, 6, null);
                    if (objSendDataWithResult$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsModule2 = settingsModule;
                    objWithTimeoutOrNull = objSendDataWithResult$default;
                    r4 = mutex2;
                    zBooleanValue = ((Boolean) objWithTimeoutOrNull).booleanValue();
                    if (zBooleanValue) {
                        z = false;
                    }
                    Debug.fi(n, Intrinsics.stringPlus("querySettings ret: ", Boxing.boxBoolean(z)));
                    r3 = r4;
                    if (zBooleanValue) {
                        r8 = r3;
                        r9 = continuation2;
                    } else {
                        f fVar2 = settingsModule2.new f(continuation2);
                        eVar.a = settingsModule2;
                        eVar.b = r4;
                        eVar.f = 3;
                        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, fVar2, eVar);
                        if (objWithTimeoutOrNull == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r2 = settingsModule2;
                        r4 = r4;
                        channelResponse = (ChannelResponse) objWithTimeoutOrNull;
                        r2.channels.remove(Boxing.boxInt(4));
                        if (channelResponse == null) {
                            hexString = continuation2;
                        } else {
                            hexString = channelResponse.toHexString();
                        }
                        Debug.fi(n, Intrinsics.stringPlus("querySettings: ", hexString));
                        r3 = r4;
                        if (channelResponse == null) {
                            r8 = r3;
                            r9 = continuation2;
                        } else {
                            iSettings = r2.settingsImpl;
                            if (iSettings == null) {
                                settings = continuation2;
                            } else {
                                settings = iSettings.parseSettings(channelResponse.getData());
                            }
                            r2.f(settings);
                            r8 = r4;
                            r9 = settings;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r4 = mutex2;
                    r4.unlock(continuation2);
                    throw th;
                }
            }
            r8.unlock(continuation2);
            return r9;
        } catch (Throwable th5) {
            th = th5;
            mutex2 = mutex;
            continuation2 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object writeSetting(@NotNull HashMap<SettingsGroupType, Settings> map, @NotNull Continuation<? super Boolean> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.c = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objWriteSetting = mVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.c;
        boolean zBooleanValue = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWriteSetting);
            ISettings iSettings = this.settingsImpl;
            if (iSettings != null) {
                mVar.c = 1;
                objWriteSetting = iSettings.writeSetting(map, mVar);
                if (objWriteSetting == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objWriteSetting);
        Boolean bool = (Boolean) objWriteSetting;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final void queryVersion(@NotNull HMCallback<Integer> callback) {
        kotlinx.coroutines.e.f(this, null, null, new i(callback, null), 3, null);
    }
}
