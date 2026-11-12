package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.enums.BuzzerScenes;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.enums.BuzzerVibrateStrength;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.Constant;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.Sound;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.SoundVibrationRepoV1;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.SoundVibrationRepoV2;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import com.xiaomi.hm.health.utils.ex.CheckExtKt;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001D\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001mB\u0007¢\u0006\u0004\bk\u0010lJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JT\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r*\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011J.\u0010\u0015\u001a\u00020\b2&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\rJ_\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001bJ\u000e\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0018J\u000e\u0010'\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0005J\u000e\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.J\u000e\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201J\u000e\u00104\u001a\u00020\b2\u0006\u00102\u001a\u000201J\u001e\u00109\u001a\u00020\b2\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020605j\b\u0012\u0004\u0012\u000206`7J\u0010\u0010;\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u0005J\b\u0010<\u001a\u00020\bH\u0014J\u0006\u0010=\u001a\u00020\bR\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010AR6\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010CR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001d\u0010V\u001a\u00020T8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\bE\u0010UR\u001e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010KR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00050H8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010KR\u0018\u0010`\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010bR\u0019\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00050d8F@\u0006¢\u0006\u0006\u001a\u0004\be\u0010fR\u001b\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050d8F@\u0006¢\u0006\u0006\u001a\u0004\bg\u0010fR\u001b\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0d8F@\u0006¢\u0006\u0006\u001a\u0004\bi\u0010f¨\u0006n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/repo/ISoundVibrationRepo;", "e", "", "h", "result", "", "b", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "", "msg", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "mDeviceType", "initJob", "watchSettings", "setSettings", "needRefreshObserver", "muteSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "volume", "notificationVibrationSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "notificationVibrationStrength", "systemVibrationSwitch", "crownVibrationSwitch", "updateSoundVibrationCache", "(ZLjava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "isChecked", "setNotificationVibrationState", "soundStrength", "setSoundStrength", "value", "setVolume", "setRemindState", "setSystemVibration", "setCrownVibration", "enable", "setCoverScreenMutingSwitch", "setVibrationFeedbackSwitch", "setVoiceBroadcast", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/enums/BuzzerVibrateStrength;", "strength", "setBuzzerVibrateStrength", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/enums/BuzzerScenes;", "scene", "addBuzzerScene", "removeBuzzerScene", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "scenes", "setBuzzerScene", "needDesc", "querySettings", "onCleared", "removeListener", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "Lkotlin/Lazy;", "g", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "watchSettingRepo", "Ljava/util/HashMap;", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel$changeListener$1", "c", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/SoundVibrationViewModel$changeListener$1;", "changeListener", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "_soundAndVibrate", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "f", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/huami/devicex/manager/DeviceManagerApi;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "_writingResult", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isSetting", z.j, "_isShowLoading", hl.k, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/repo/ISoundVibrationRepo;", "soundVibrationRepo", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "soundVibrateV2", "Landroidx/lifecycle/LiveData;", "isShowLoading", "()Landroidx/lifecycle/LiveData;", "getWritingResult", "writingResult", "getSoundAndVibrate", "soundAndVibrate", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SoundVibrationViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String l = "SoundVibrationViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchSettingRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final SoundVibrationViewModel$changeListener$1 changeListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SoundAndVibrate> _soundAndVibrate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice hmMiLiProDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _writingResult;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean _isSetting;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _isShowLoading;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ISoundVibrationRepo soundVibrationRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BuzzerScenes a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0860a extends Lambda implements Function0<String> {
            public final /* synthetic */ BuzzerScenes a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0860a(BuzzerScenes buzzerScenes) {
                super(0);
                this.a = buzzerScenes;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "cannot add scene " + this.a + " as already contain";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BuzzerScenes buzzerScenes) {
            super(0);
            this.a = buzzerScenes;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info$default(null, new C0860a(this.a), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "cannot add scene as soundv2 buzzerscenes is null";
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info$default(null, a.a, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BuzzerScenes a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ BuzzerScenes a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BuzzerScenes buzzerScenes) {
                super(0);
                this.a = buzzerScenes;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "cannot remove scene " + this.a + " as already not contain";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BuzzerScenes buzzerScenes) {
            super(0);
            this.a = buzzerScenes;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info$default(null, new a(this.a), 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public static final e a = new e();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "cannot remove scene as soundv2 buzzerscenes is null";
            }
        }

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMLog.info$default(null, a.a, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ ArrayList<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ArrayList<Integer> arrayList) {
            super(1);
            this.a = arrayList;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            Sound sound = watchSettings.getSound();
            if (sound == null) {
                return;
            }
            sound.setBuzzerScenes(CollectionsKt___CollectionsKt.joinToString$default(this.a, ",", null, null, 0, null, null, 62, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ BuzzerVibrateStrength a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BuzzerVibrateStrength buzzerVibrateStrength) {
            super(1);
            this.a = buzzerVibrateStrength;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            Sound sound = watchSettings.getSound();
            if (sound == null) {
                return;
            }
            sound.setBuzzerVibrateStrength(Integer.valueOf(this.a.getValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setCoverScreenMutingSwitch$1$1", f = "SoundVibrationViewModel.kt", i = {1}, l = {WeightingState.state_weight_overload, WeightingState.state_bodyfat_detail}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public boolean b;
        public int c;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> e;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setCoverScreenMutingSwitch$1$1$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SoundAndVibrateV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SoundAndVibrateV2 soundAndVibrateV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = soundAndVibrateV2;
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
                this.b.setCoverScreenMutingSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Sound sound = watchSettings.getSound();
                if (sound == null) {
                    return;
                }
                sound.setCoverScreenMutingSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super h> continuation) {
            super(2, continuation);
            this.e = map;
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new h(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:31:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? BooleanValue;
            SoundAndVibrateV2 soundAndVibrateV2F;
            boolean z;
            MainCoroutineDispatcher main;
            a aVar;
            boolean z2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.b;
                    int i2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    BooleanValue = i2;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
                SoundVibrationViewModel.this.b(BooleanValue != 0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = SoundVibrationViewModel.this.settingsModule;
            if (settingsModule == null) {
                BooleanValue = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.e;
                this.c = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (BooleanValue != 0 && (soundAndVibrateV2F = SoundVibrationViewModel.this.f()) != null) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                BooleanValue = bool.booleanValue();
            }
            if (BooleanValue != 0) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setCrownVibration$1$1", f = "SoundVibrationViewModel.kt", i = {1}, l = {Constant.HEIGHT_MAX, 246}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public boolean b;
        public int c;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> e;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setCrownVibration$1$1$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SoundAndVibrateV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SoundAndVibrateV2 soundAndVibrateV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = soundAndVibrateV2;
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
                this.b.setCrownVibrationSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Sound sound = watchSettings.getSound();
                if (sound == null) {
                    return;
                }
                sound.setCrownVibrationSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super i> continuation) {
            super(2, continuation);
            this.e = map;
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new i(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:31:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? BooleanValue;
            SoundAndVibrateV2 soundAndVibrateV2F;
            boolean z;
            MainCoroutineDispatcher main;
            a aVar;
            boolean z2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.b;
                    int i2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    BooleanValue = i2;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
                SoundVibrationViewModel.this.b(BooleanValue != 0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = SoundVibrationViewModel.this.settingsModule;
            if (settingsModule == null) {
                BooleanValue = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.e;
                this.c = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (BooleanValue != 0 && (soundAndVibrateV2F = SoundVibrationViewModel.this.f()) != null) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                BooleanValue = bool.booleanValue();
            }
            if (BooleanValue != 0) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setNotificationVibrationState$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HashMap<SettingsGroupType, Settings> map, Continuation<? super j> continuation) {
            super(2, continuation);
            this.d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new j(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SoundVibrationViewModel soundVibrationViewModel;
            SoundVibrationViewModel soundVibrationViewModel2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                soundVibrationViewModel = SoundVibrationViewModel.this;
                SettingsModule settingsModule = soundVibrationViewModel.settingsModule;
                if (settingsModule != null) {
                    HashMap<SettingsGroupType, Settings> map = this.d;
                    this.a = soundVibrationViewModel;
                    this.b = 1;
                    Object objWriteSetting = settingsModule.writeSetting(map, this);
                    if (objWriteSetting == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    soundVibrationViewModel2 = soundVibrationViewModel;
                    obj = objWriteSetting;
                }
                soundVibrationViewModel.b(zBooleanValue);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            soundVibrationViewModel2 = (SoundVibrationViewModel) this.a;
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            soundVibrationViewModel = soundVibrationViewModel2;
            soundVibrationViewModel.b(zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setRemindState$1$1", f = "SoundVibrationViewModel.kt", i = {1}, l = {206, com.baseflow.permissionhandler.m.c}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public boolean b;
        public int c;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> e;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setRemindState$1$1$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SoundAndVibrateV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SoundAndVibrateV2 soundAndVibrateV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = soundAndVibrateV2;
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
                this.b.setRemindSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Sound sound = watchSettings.getSound();
                if (sound == null) {
                    return;
                }
                sound.setBellRemindSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super k> continuation) {
            super(2, continuation);
            this.e = map;
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new k(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:31:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? BooleanValue;
            SoundAndVibrateV2 soundAndVibrateV2F;
            boolean z;
            MainCoroutineDispatcher main;
            a aVar;
            boolean z2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.b;
                    int i2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    BooleanValue = i2;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
                SoundVibrationViewModel.this.b(BooleanValue != 0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = SoundVibrationViewModel.this.settingsModule;
            if (settingsModule == null) {
                BooleanValue = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.e;
                this.c = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (BooleanValue != 0 && (soundAndVibrateV2F = SoundVibrationViewModel.this.f()) != null) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                BooleanValue = bool.booleanValue();
            }
            if (BooleanValue != 0) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setSoundStrength$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(HashMap<SettingsGroupType, Settings> map, Continuation<? super l> continuation) {
            super(2, continuation);
            this.d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new l(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SoundVibrationViewModel soundVibrationViewModel;
            SoundVibrationViewModel soundVibrationViewModel2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                soundVibrationViewModel = SoundVibrationViewModel.this;
                SettingsModule settingsModule = soundVibrationViewModel.settingsModule;
                if (settingsModule != null) {
                    HashMap<SettingsGroupType, Settings> map = this.d;
                    this.a = soundVibrationViewModel;
                    this.b = 1;
                    Object objWriteSetting = settingsModule.writeSetting(map, this);
                    if (objWriteSetting == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    soundVibrationViewModel2 = soundVibrationViewModel;
                    obj = objWriteSetting;
                }
                soundVibrationViewModel.b(zBooleanValue);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            soundVibrationViewModel2 = (SoundVibrationViewModel) this.a;
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            soundVibrationViewModel = soundVibrationViewModel2;
            soundVibrationViewModel.b(zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setSystemVibration$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {FTPCodes.DATA_CONNECTION_CLOSING}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(HashMap<SettingsGroupType, Settings> map, Continuation<? super m> continuation) {
            super(2, continuation);
            this.d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new m(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SoundVibrationViewModel soundVibrationViewModel;
            SoundVibrationViewModel soundVibrationViewModel2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                soundVibrationViewModel = SoundVibrationViewModel.this;
                SettingsModule settingsModule = soundVibrationViewModel.settingsModule;
                if (settingsModule != null) {
                    HashMap<SettingsGroupType, Settings> map = this.d;
                    this.a = soundVibrationViewModel;
                    this.b = 1;
                    Object objWriteSetting = settingsModule.writeSetting(map, this);
                    if (objWriteSetting == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    soundVibrationViewModel2 = soundVibrationViewModel;
                    obj = objWriteSetting;
                }
                soundVibrationViewModel.b(zBooleanValue);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            soundVibrationViewModel2 = (SoundVibrationViewModel) this.a;
            ResultKt.throwOnFailure(obj);
            Boolean bool = (Boolean) obj;
            zBooleanValue = bool != null ? bool.booleanValue() : false;
            soundVibrationViewModel = soundVibrationViewModel2;
            soundVibrationViewModel.b(zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setVibrationFeedbackSwitch$1$1", f = "SoundVibrationViewModel.kt", i = {1}, l = {281, 284}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public boolean b;
        public int c;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> e;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setVibrationFeedbackSwitch$1$1$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SoundAndVibrateV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SoundAndVibrateV2 soundAndVibrateV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = soundAndVibrateV2;
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
                this.b.setVibrationFeedbackSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Sound sound = watchSettings.getSound();
                if (sound == null) {
                    return;
                }
                sound.setVibrationFeedbackSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super n> continuation) {
            super(2, continuation);
            this.e = map;
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new n(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:31:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? BooleanValue;
            SoundAndVibrateV2 soundAndVibrateV2F;
            boolean z;
            MainCoroutineDispatcher main;
            a aVar;
            boolean z2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.b;
                    int i2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    BooleanValue = i2;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
                SoundVibrationViewModel.this.b(BooleanValue != 0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = SoundVibrationViewModel.this.settingsModule;
            if (settingsModule == null) {
                BooleanValue = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.e;
                this.c = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (BooleanValue != 0 && (soundAndVibrateV2F = SoundVibrationViewModel.this.f()) != null) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                BooleanValue = bool.booleanValue();
            }
            if (BooleanValue != 0) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setVoiceBroadcast$1$1", f = "SoundVibrationViewModel.kt", i = {1}, l = {300, 303}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public boolean b;
        public int c;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> e;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setVoiceBroadcast$1$1$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SoundAndVibrateV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SoundAndVibrateV2 soundAndVibrateV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = soundAndVibrateV2;
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
                this.b.setSportVoiceReportSwitch(Boxing.boxBoolean(this.c));
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z) {
                super(1);
                this.a = z;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Sound sound = watchSettings.getSound();
                if (sound == null) {
                    return;
                }
                sound.setSportVoiceReportSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super o> continuation) {
            super(2, continuation);
            this.e = map;
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new o(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0069  */
        /* JADX WARN: Code duplicated, block: B:31:0x007a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? BooleanValue;
            SoundAndVibrateV2 soundAndVibrateV2F;
            boolean z;
            MainCoroutineDispatcher main;
            a aVar;
            boolean z2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.b;
                    int i2 = this.a;
                    ResultKt.throwOnFailure(obj);
                    BooleanValue = i2;
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
                SoundVibrationViewModel.this.b(BooleanValue != 0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = SoundVibrationViewModel.this.settingsModule;
            if (settingsModule == null) {
                BooleanValue = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.e;
                this.c = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (BooleanValue != 0 && (soundAndVibrateV2F = SoundVibrationViewModel.this.f()) != null) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                BooleanValue = bool.booleanValue();
            }
            if (BooleanValue != 0) {
                z = this.f;
                main = Dispatchers.getMain();
                aVar = new a(soundAndVibrateV2F, z, null);
                this.a = BooleanValue;
                this.b = z;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z;
                BooleanValue = BooleanValue;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(z2), 1, null);
            }
            SoundVibrationViewModel.this.b(BooleanValue != 0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setVolume$1$1", f = "SoundVibrationViewModel.kt", i = {1}, l = {DataTypeSource.SPORT_TYPE_MODERN_DANCE, 188}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public Object b;
        public int c;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> e;
        public final /* synthetic */ IntData f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setVolume$1$1$1$1", f = "SoundVibrationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ IntData b;
            public final /* synthetic */ IntData c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IntData intData, IntData intData2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = intData;
                this.c = intData2;
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
                this.b.setValue(this.c.getValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ IntData a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(IntData intData) {
                super(1);
                this.a = intData;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                Sound sound = watchSettings.getSound();
                if (sound == null) {
                    return;
                }
                sound.setVolume(Integer.valueOf(this.a.getValue()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(HashMap<SettingsGroupType, Settings> map, IntData intData, Continuation<? super p> continuation) {
            super(2, continuation);
            this.e = map;
            this.f = intData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SoundVibrationViewModel.this.new p(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0031  */
        /* JADX WARN: Code duplicated, block: B:29:0x0070 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x0071  */
        /* JADX WARN: Code duplicated, block: B:34:0x0084  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? r10;
            SoundAndVibrateV2 soundAndVibrateV2F;
            IntData volume;
            IntData intData;
            MainCoroutineDispatcher main;
            a aVar;
            int i;
            IntData intData2;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.c;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.a;
                    intData2 = (IntData) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(intData2), 1, null);
                r10 = i;
                r10 = zBooleanValue;
                r10 = zBooleanValue;
                r10 = zBooleanValue;
                SoundVibrationViewModel.this.b(r10 != 0);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = SoundVibrationViewModel.this.settingsModule;
            if (settingsModule == null) {
                r10 = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.e;
                this.c = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r10 != 0 && (soundAndVibrateV2F = SoundVibrationViewModel.this.f()) != null && (volume = soundAndVibrateV2F.getVolume()) != null) {
                intData = this.f;
                main = Dispatchers.getMain();
                aVar = new a(volume, intData, null);
                this.b = intData;
                this.a = r10 == true ? 1 : 0;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    r10 = zBooleanValue;
                    return coroutine_suspended;
                }
                r10 = zBooleanValue;
                i = r10 == true ? 1 : 0;
                intData2 = intData;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(intData2), 1, null);
                r10 = i;
            }
            r10 = zBooleanValue;
            r10 = zBooleanValue;
            r10 = zBooleanValue;
            SoundVibrationViewModel.this.b(r10 != 0);
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                r10 = 0;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (r10 != 0) {
                intData = this.f;
                main = Dispatchers.getMain();
                aVar = new a(volume, intData, null);
                this.b = intData;
                this.a = r10 == true ? 1 : 0;
                this.c = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    r10 = zBooleanValue;
                    return coroutine_suspended;
                }
                r10 = zBooleanValue;
                i = r10 == true ? 1 : 0;
                intData2 = intData;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(intData2), 1, null);
                r10 = i;
            }
            r10 = zBooleanValue;
            r10 = zBooleanValue;
            r10 = zBooleanValue;
            SoundVibrationViewModel.this.b(r10 != 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$changeListener$1] */
    public SoundVibrationViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.watchSettingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IWatchSettingRepo>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IWatchSettingRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IWatchSettingRepo.class), qualifier, objArr);
            }
        });
        this.changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$changeListener$1
            @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
            public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
                MutableLiveData mutableLiveData = this.a._soundAndVibrate;
                Settings settings2 = settings.get(SettingsGroupType.SOUND_AND_VIBRATION);
                mutableLiveData.setValue(settings2 instanceof SoundAndVibrate ? (SoundAndVibrate) settings2 : null);
            }
        };
        MutableLiveData<SoundAndVibrate> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._soundAndVibrate = mutableLiveData;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(null);
        this._writingResult = mutableLiveData2;
        this._isSetting = new AtomicBoolean(false);
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(Boolean.FALSE);
        this._isShowLoading = mutableLiveData3;
    }

    private final HashMap<SettingsGroupType, Settings> a(HashMap<SettingsGroupType, Settings> map, String str) {
        if (map == null) {
            HMLog.info(l, new c(str));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean result) {
        this._isSetting.set(false);
        this._writingResult.postValue(Boolean.valueOf(result));
        this._isShowLoading.postValue(Boolean.FALSE);
    }

    private final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final ISoundVibrationRepo e() {
        ISoundVibrationRepo soundVibrationRepoV2;
        ISoundVibrationRepo iSoundVibrationRepo = this.soundVibrationRepo;
        if (iSoundVibrationRepo != null) {
            return iSoundVibrationRepo;
        }
        SoundAndVibrate value = this._soundAndVibrate.getValue();
        if (value instanceof SoundAndVibrateV1) {
            soundVibrationRepoV2 = new SoundVibrationRepoV1();
        } else {
            soundVibrationRepoV2 = value instanceof SoundAndVibrateV2 ? new SoundVibrationRepoV2() : null;
        }
        this.soundVibrationRepo = soundVibrationRepoV2;
        return soundVibrationRepoV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoundAndVibrateV2 f() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.SOUND_AND_VIBRATION);
        if (settings instanceof SoundAndVibrateV2) {
            return (SoundAndVibrateV2) settings;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWatchSettingRepo g() {
        return (IWatchSettingRepo) this.watchSettingRepo.getValue();
    }

    private final boolean h() {
        if (this._isSetting.get()) {
            return false;
        }
        this._isSetting.set(true);
        this._writingResult.setValue(null);
        this._isShowLoading.setValue(Boolean.TRUE);
        return true;
    }

    public static /* synthetic */ void querySettings$default(SoundVibrationViewModel soundVibrationViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        soundVibrationViewModel.querySettings(z);
    }

    public static /* synthetic */ void updateSoundVibrationCache$default(SoundVibrationViewModel soundVibrationViewModel, boolean z, Boolean bool, IntData intData, Boolean bool2, EnumData enumData, Boolean bool3, Boolean bool4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        soundVibrationViewModel.updateSoundVibrationCache(z, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : intData, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : enumData, (i2 & 32) != 0 ? null : bool3, (i2 & 64) == 0 ? bool4 : null);
    }

    public final void addBuzzerScene(@NotNull BuzzerScenes scene) {
        SoundAndVibrateV2 soundAndVibrateV2F = f();
        EnumArray enumArray = (EnumArray) CheckExtKt.ifNull(soundAndVibrateV2F == null ? null : soundAndVibrateV2F.getBuzzerScenes(), b.a);
        if (enumArray == null) {
            return;
        }
        ArrayList<Integer> values = enumArray.getValues();
        Boolean boolIfTrue = CheckExtKt.ifTrue(Boolean.valueOf(values.contains(Integer.valueOf(scene.getValue()))), new a(scene));
        if (boolIfTrue == null) {
            return;
        }
        boolIfTrue.booleanValue();
        values.add(Integer.valueOf(scene.getValue()));
        setBuzzerScene(values);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<SoundAndVibrate> getSoundAndVibrate() {
        return this._soundAndVibrate;
    }

    @NotNull
    public final LiveData<Boolean> getWritingResult() {
        return this._writingResult;
    }

    public final void initJob(@NotNull HMDeviceType mDeviceType) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) c().getDevice(mDeviceType);
        this.hmMiLiProDevice = hMMiLiProDevice;
        SettingsModule settingsModule = hMMiLiProDevice == null ? null : (SettingsModule) hMMiLiProDevice.getChannelModule(SettingsModule.class);
        this.settingsModule = settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.addListener(this.changeListener);
    }

    @NotNull
    public final LiveData<Boolean> isShowLoading() {
        return this._isShowLoading;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    public final void querySettings(boolean needDesc) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SoundVibrationViewModel$querySettings$$inlined$safeLaunch$1(null, this, needDesc), 2, null);
    }

    public final void removeBuzzerScene(@NotNull BuzzerScenes scene) {
        SoundAndVibrateV2 soundAndVibrateV2F = f();
        EnumArray enumArray = (EnumArray) CheckExtKt.ifNull(soundAndVibrateV2F == null ? null : soundAndVibrateV2F.getBuzzerScenes(), e.a);
        if (enumArray == null) {
            return;
        }
        ArrayList<Integer> values = enumArray.getValues();
        Boolean boolIfFalse = CheckExtKt.ifFalse(Boolean.valueOf(values.contains(Integer.valueOf(scene.getValue()))), new d(scene));
        if (boolIfFalse == null) {
            return;
        }
        boolIfFalse.booleanValue();
        values.remove(Integer.valueOf(scene.getValue()));
        setBuzzerScene(values);
    }

    public final void removeListener() {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(this.changeListener);
    }

    public final void setBuzzerScene(@NotNull ArrayList<Integer> scenes) {
        if (h()) {
            EnumArray enumArray = new EnumArray(scenes, null, false, 6, null);
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getBuzzerScenes(enumArray), "setBuzzerScene");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1(null, this, mapA, enumArray, scenes), 2, null);
        }
    }

    public final void setBuzzerVibrateStrength(@NotNull BuzzerVibrateStrength strength) {
        if (h()) {
            EnumData enumData = new EnumData(strength.getValue());
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getBuzzerVibrateStrength(enumData), "setBuzzerVibrateStrength");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SoundVibrationViewModel$setBuzzerVibrateStrength$$inlined$safeLaunch$1(null, this, mapA, enumData, strength), 2, null);
        }
    }

    public final void setCoverScreenMutingSwitch(boolean enable) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.mo3444getDtoWithCoverScreenMutingSwitch(enable), "setCoverScreenMutingSwitch");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setCoverScreenMutingSwitch$$inlined$safeLaunch$1(null, this, mapA, enable), 2, null);
        }
    }

    public final void setCrownVibration(boolean isChecked) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithCrownVibrationSwitch(isChecked), "setCrownVibration");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setCrownVibration$$inlined$safeLaunch$1(null, this, mapA, isChecked), 2, null);
        }
    }

    public final void setNotificationVibrationState(boolean isChecked) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithNotificationVibrationSwitch(isChecked), "setNotificationVibrationState");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setNotificationVibrationState$$inlined$safeLaunch$1(null, this, mapA), 2, null);
        }
    }

    public final void setRemindState(boolean isChecked) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithRemindSwitch(isChecked), "setRemindState");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setRemindState$$inlined$safeLaunch$1(null, this, mapA, isChecked), 2, null);
        }
    }

    public final void setSettings(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
        MutableLiveData<SoundAndVibrate> mutableLiveData = this._soundAndVibrate;
        Settings settings = watchSettings == null ? null : watchSettings.get(SettingsGroupType.SOUND_AND_VIBRATION);
        mutableLiveData.setValue(settings instanceof SoundAndVibrate ? (SoundAndVibrate) settings : null);
    }

    public final void setSoundStrength(@NotNull EnumData soundStrength) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithNotificationVibrationStrength(soundStrength), "setSoundStrength");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setSoundStrength$$inlined$safeLaunch$1(null, this, mapA), 2, null);
        }
    }

    public final void setSystemVibration(boolean isChecked) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithSystemVibrationSwitch(isChecked), "setSystemVibration");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setSystemVibration$$inlined$safeLaunch$1(null, this, mapA), 2, null);
        }
    }

    public final void setVibrationFeedbackSwitch(boolean enable) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.mo3445getDtoWithVibrationFeedbackSwitch(enable), "setVibrationFeedbackSwitch");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setVibrationFeedbackSwitch$$inlined$safeLaunch$1(null, this, mapA, enable), 2, null);
        }
    }

    public final void setVoiceBroadcast(boolean enable) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithVoiceBroadcast(enable), "setVoiceBroadcast");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setVoiceBroadcast$$inlined$safeLaunch$1(null, this, mapA, enable), 2, null);
        }
    }

    public final void setVolume(@NotNull IntData value) {
        if (h()) {
            ISoundVibrationRepo iSoundVibrationRepoE = e();
            HashMap<SettingsGroupType, Settings> mapA = a(iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.getDtoWithVolume(value), "setVolume");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new SoundVibrationViewModel$setVolume$$inlined$safeLaunch$1(null, this, mapA, value), 2, null);
        }
    }

    public final void updateSoundVibrationCache(boolean needRefreshObserver, @Nullable Boolean muteSwitch, @Nullable IntData volume, @Nullable Boolean notificationVibrationSwitch, @Nullable EnumData notificationVibrationStrength, @Nullable Boolean systemVibrationSwitch, @Nullable Boolean crownVibrationSwitch) {
        SoundAndVibrate value = needRefreshObserver ? this._soundAndVibrate.getValue() : this._soundAndVibrate.getValue();
        ISoundVibrationRepo iSoundVibrationRepoE = e();
        SoundAndVibrate soundAndVibrateUpdateSoundVibrationCache = iSoundVibrationRepoE == null ? null : iSoundVibrationRepoE.updateSoundVibrationCache(value, muteSwitch, volume, notificationVibrationSwitch, notificationVibrationStrength, systemVibrationSwitch, crownVibrationSwitch);
        if (needRefreshObserver) {
            this._soundAndVibrate.setValue(soundAndVibrateUpdateSoundVibrationCache);
        }
    }
}
