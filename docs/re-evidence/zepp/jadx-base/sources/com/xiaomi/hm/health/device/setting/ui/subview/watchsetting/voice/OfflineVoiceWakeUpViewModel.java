package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v1.OfflineVoiceV1;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v2.OfflineVoiceV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.IOfflineVoiceRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.OfflineVoiceRepoV1;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.OfflineVoiceRepoV2;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u00010\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001dB\u0007¢\u0006\u0004\bb\u0010cJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002JT\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r*\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J8\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062&\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\rJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\bJG\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001cJ\u0010\u0010'\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u0006J\b\u0010(\u001a\u00020\bH\u0014J,\u0010*\u001a\u00020\b2\"\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0016R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u000104038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001d\u0010;\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b5\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010CR\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u0006038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00106R6\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u0006038\u0006@\u0006¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bO\u0010PR\u001f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u0006038\u0006@\u0006¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u0010PR\u001f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u0006038\u0006@\u0006¢\u0006\f\n\u0004\bU\u00106\u001a\u0004\bV\u0010PR\u0018\u0010Z\u001a\u0004\u0018\u00010X8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010YR\u0019\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060[8F@\u0006¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001b\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060[8F@\u0006¢\u0006\u0006\u001a\u0004\b^\u0010]R\u001b\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040[8F@\u0006¢\u0006\u0006\u001a\u0004\b`\u0010]¨\u0006e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/repo/IOfflineVoiceRepo;", "f", "", "h", "", "b", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "", "msg", "a", "needLoadVisibility", "watchSettings", "setSettings", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "mDeviceType", "initJob", "removeListener", "needRefreshObserver", "activeWithIn5SByTurningWristSwitch", "activeWithIn5SWhenScreenOnSwitch", "activeDuringScreenOnSwitch", "", UserLegalInfoManager.KEY_LANGUAGE, "updateOfflineVoiceWakeUp", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "isChecked", "setResponseAfterTurningWrist", "setResponseAfterBrightScreen", "setResponseDuringBrightScreen", "value", "setLanguage", "needDesc", "querySettings", "onCleared", "settings", "onChange", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "Lkotlin/Lazy;", "g", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "watchSettingsRepo", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel$changeListener$1", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel$changeListener$1;", "changeListener", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "c", "Landroidx/lifecycle/MutableLiveData;", "_offlineVoice", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "e", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/repo/IOfflineVoiceRepo;", CommonLanguageSettingFragment.KEY_REPO, "_writingResult", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isSetting", z.j, "_isShowLoading", hl.k, "Ljava/util/HashMap;", "l", "getOffLineVoiceWakeUpVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "offLineVoiceWakeUpVisibleLiveData", "m", "getOffLineVoiceWakeUpWordsVisibleLiveData", "offLineVoiceWakeUpWordsVisibleLiveData", GoogleApiAvailabilityLight.b, "getOffLineVoiceVoiceLanguageLiveData", "offLineVoiceVoiceLanguageLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v2/OfflineVoiceV2;", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v2/OfflineVoiceV2;", "offlineVoiceV2", "Landroidx/lifecycle/LiveData;", "isShowLoading", "()Landroidx/lifecycle/LiveData;", "getWritingResult", "writingResult", "getOfflineVoice", "offlineVoice", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceWakeUpViewModel extends ViewModel implements KoinComponent, ChangeListener {

    @NotNull
    private static final String o = "OfflineVoiceWakeUpViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchSettingsRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OfflineVoiceWakeUpViewModel$changeListener$1 changeListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<OfflineVoice> _offlineVoice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice hmMiLiProDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private IOfflineVoiceRepo repo;

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
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> offLineVoiceWakeUpVisibleLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> offLineVoiceWakeUpWordsVisibleLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> offLineVoiceVoiceLanguageLiveData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<Integer> p = CollectionsKt__CollectionsKt.arrayListOf(0, 2, 7, 3);

    @NotNull
    private static final ArrayList<HMDeviceSource> q = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_MADRID, HMDeviceSource.MILI_MADRID_HML, HMDeviceSource.MILI_ANDES, HMDeviceSource.MILI_VERONA, HMDeviceSource.MILI_ZURICH, HMDeviceSource.MILI_BLED, HMDeviceSource.MILI_BLED_PRO, HMDeviceSource.MILI_PROVENCE, HMDeviceSource.MILI_CANNES);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR&\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\tj\b\u0012\u0004\u0012\u00020\u000e`\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceWakeUpViewModel$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "", "a", "", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lkotlin/collections/ArrayList;", "domesticSources", "Ljava/util/ArrayList;", "", "hasOfflineVoiceDefaultLanguage", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a(HMBaseDevice bleDevice) {
            DeviceInfo deviceInfo;
            HMOtherVersion otherVersion;
            if (!OfflineVoiceWakeUpViewModel.q.contains(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI))) {
                if (!((bleDevice == null || (deviceInfo = bleDevice.getDeviceInfo()) == null || (otherVersion = deviceInfo.getOtherVersion()) == null) ? false : Intrinsics.areEqual(otherVersion.isDomesticProduct(), Boolean.TRUE))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " dto null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "监听V1";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$querySettings$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {SportDeviceUtils.SOURCE_VERONA}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OfflineVoiceWakeUpViewModel.this.new c(this.c, continuation);
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
                IWatchSettingRepo iWatchSettingRepoG = OfflineVoiceWakeUpViewModel.this.g();
                boolean z = this.c;
                this.a = 1;
                obj = iWatchSettingRepoG.queryOfflineVoiceV1(z, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OfflineVoice offlineVoice = (OfflineVoice) obj;
            if (offlineVoice != null) {
                OfflineVoiceWakeUpViewModel.this._offlineVoice.postValue(offlineVoice);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setLanguage$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {1}, l = {303, 307}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> d;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setLanguage$1$1$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ OfflineVoiceV2 b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OfflineVoiceV2 offlineVoiceV2, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = offlineVoiceV2;
                this.c = i;
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
                EnumData language = this.b.getLanguage();
                if (language != null) {
                    language.setValue(this.c);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(1);
                this.a = i;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
                if (offlineVoice == null) {
                    return;
                }
                offlineVoice.setOfflineVoiceLanguage(Integer.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HashMap<SettingsGroupType, Settings> map, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = map;
            this.e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OfflineVoiceWakeUpViewModel.this.new d(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060  */
        /* JADX WARN: Code duplicated, block: B:26:0x0075 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        /* JADX WARN: Code duplicated, block: B:32:0x008e  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v18 */
        /* JADX WARN: Type inference failed for: r15v19 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? r15;
            OfflineVoiceV2 offlineVoiceV2E;
            MainCoroutineDispatcher main;
            a aVar;
            int i;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.a;
                    ResultKt.throwOnFailure(obj);
                }
                r15 = i;
                r15 = zBooleanValue;
                r15 = r15;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                r15 = zBooleanValue;
                OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r15 != 0));
                OfflineVoiceWakeUpViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = OfflineVoiceWakeUpViewModel.this.settingsModule;
            if (settingsModule == null) {
                r15 = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.d;
                this.b = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r15 != 0) {
                OfflineVoiceWakeUpViewModel.updateOfflineVoiceWakeUp$default(OfflineVoiceWakeUpViewModel.this, false, null, null, null, Boxing.boxInt(this.e), 15, null);
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    int i3 = this.e;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, i3, null);
                    this.a = r15 == true ? 1 : 0;
                    this.b = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        r15 = zBooleanValue;
                        r15 = r15;
                        return coroutine_suspended;
                    }
                    r15 = zBooleanValue;
                    r15 = r15;
                    i = r15 == true ? 1 : 0;
                    r15 = i;
                }
                r15 = zBooleanValue;
                r15 = r15;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            }
            r15 = zBooleanValue;
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r15 != 0));
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                r15 = 0;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (r15 != 0) {
                OfflineVoiceWakeUpViewModel.updateOfflineVoiceWakeUp$default(OfflineVoiceWakeUpViewModel.this, false, null, null, null, Boxing.boxInt(this.e), 15, null);
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    int i4 = this.e;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, i4, null);
                    this.a = r15 == true ? 1 : 0;
                    this.b = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        r15 = zBooleanValue;
                        r15 = r15;
                        return coroutine_suspended;
                    }
                    r15 = zBooleanValue;
                    r15 = r15;
                    i = r15 == true ? 1 : 0;
                    r15 = i;
                }
                r15 = zBooleanValue;
                r15 = r15;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            }
            r15 = zBooleanValue;
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r15 != 0));
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setResponseAfterBrightScreen$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {1}, l = {256, 259}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> d;
        public final /* synthetic */ boolean e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setResponseAfterBrightScreen$1$1$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ OfflineVoiceV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OfflineVoiceV2 offlineVoiceV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = offlineVoiceV2;
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
                this.b.setActiveWithIn5SWhenScreenOnSwitch(Boxing.boxBoolean(this.c));
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
                com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
                if (offlineVoice == null) {
                    return;
                }
                offlineVoice.setActiveWithInFiveSecondsWhenScreenOnSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = map;
            this.e = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OfflineVoiceWakeUpViewModel.this.new e(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:24:0x004e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        /* JADX WARN: Code duplicated, block: B:32:0x007c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? r10;
            OfflineVoiceV2 offlineVoiceV2E;
            MainCoroutineDispatcher main;
            a aVar;
            int i;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.a;
                    ResultKt.throwOnFailure(obj);
                }
                r10 = i;
                r10 = zBooleanValue;
                r10 = r10;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                r10 = zBooleanValue;
                OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r10 != 0));
                OfflineVoiceWakeUpViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = OfflineVoiceWakeUpViewModel.this.settingsModule;
            if (settingsModule == null) {
                r10 = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.d;
                this.b = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r10 != 0) {
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    boolean z = this.e;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, z, null);
                    this.a = r10 == true ? 1 : 0;
                    this.b = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        r10 = zBooleanValue;
                        r10 = r10;
                        return coroutine_suspended;
                    }
                    r10 = zBooleanValue;
                    r10 = r10;
                    i = r10 == true ? 1 : 0;
                    r10 = i;
                }
                r10 = zBooleanValue;
                r10 = r10;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            }
            r10 = zBooleanValue;
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r10 != 0));
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                r10 = 0;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (r10 != 0) {
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    boolean z2 = this.e;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, z2, null);
                    this.a = r10 == true ? 1 : 0;
                    this.b = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        r10 = zBooleanValue;
                        r10 = r10;
                        return coroutine_suspended;
                    }
                    r10 = zBooleanValue;
                    r10 = r10;
                    i = r10 == true ? 1 : 0;
                    r10 = i;
                }
                r10 = zBooleanValue;
                r10 = r10;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            }
            r10 = zBooleanValue;
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r10 != 0));
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setResponseAfterTurningWrist$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {FTPCodes.USER_LOGGED_IN, EcgConst.ECG_FULL_MEASURE_SECOND_TIME}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ boolean d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setResponseAfterTurningWrist$1$1$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ OfflineVoiceV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OfflineVoiceV2 offlineVoiceV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = offlineVoiceV2;
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
                this.b.setActiveWithIn5SByTurningWristSwitch(Boxing.boxBoolean(this.c));
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
                com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
                if (offlineVoice == null) {
                    return;
                }
                offlineVoice.setActiveWithInFiveSecondsByTurningWristSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OfflineVoiceWakeUpViewModel.this.new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:22:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            OfflineVoiceV2 offlineVoiceV2E;
            MainCoroutineDispatcher main;
            a aVar;
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
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                OfflineVoiceWakeUpViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = OfflineVoiceWakeUpViewModel.this.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    boolean z = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, z, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(zBooleanValue));
            if (zBooleanValue) {
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    boolean z2 = this.d;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, z2, null);
                    this.a = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            }
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setResponseDuringBrightScreen$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {1}, l = {280, 283}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> d;
        public final /* synthetic */ boolean e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setResponseDuringBrightScreen$1$1$1$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ OfflineVoiceV2 b;
            public final /* synthetic */ boolean c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OfflineVoiceV2 offlineVoiceV2, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = offlineVoiceV2;
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
                this.b.setActiveDuringScreenOnSwitch(Boxing.boxBoolean(this.c));
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
                com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice offlineVoice = watchSettings.getOfflineVoice();
                if (offlineVoice == null) {
                    return;
                }
                offlineVoice.setActiveDuringScreenOnSwitch(Boolean.valueOf(this.a));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HashMap<SettingsGroupType, Settings> map, boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.d = map;
            this.e = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OfflineVoiceWakeUpViewModel.this.new g(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0045  */
        /* JADX WARN: Code duplicated, block: B:24:0x004e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0064  */
        /* JADX WARN: Code duplicated, block: B:32:0x007c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? r10;
            OfflineVoiceV2 offlineVoiceV2E;
            MainCoroutineDispatcher main;
            a aVar;
            int i;
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.a;
                    ResultKt.throwOnFailure(obj);
                }
                r10 = i;
                r10 = zBooleanValue;
                r10 = r10;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
                r10 = zBooleanValue;
                OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r10 != 0));
                OfflineVoiceWakeUpViewModel.this.b();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = OfflineVoiceWakeUpViewModel.this.settingsModule;
            if (settingsModule == null) {
                r10 = 0;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.d;
                this.b = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (r10 != 0) {
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    boolean z = this.e;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, z, null);
                    this.a = r10 == true ? 1 : 0;
                    this.b = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        r10 = zBooleanValue;
                        r10 = r10;
                        return coroutine_suspended;
                    }
                    r10 = zBooleanValue;
                    r10 = r10;
                    i = r10 == true ? 1 : 0;
                    r10 = i;
                }
                r10 = zBooleanValue;
                r10 = r10;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            }
            r10 = zBooleanValue;
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r10 != 0));
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                r10 = 0;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (r10 != 0) {
                offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
                if (offlineVoiceV2E != null) {
                    boolean z2 = this.e;
                    main = Dispatchers.getMain();
                    aVar = new a(offlineVoiceV2E, z2, null);
                    this.a = r10 == true ? 1 : 0;
                    this.b = 2;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        r10 = zBooleanValue;
                        r10 = r10;
                        return coroutine_suspended;
                    }
                    r10 = zBooleanValue;
                    r10 = r10;
                    i = r10 == true ? 1 : 0;
                    r10 = i;
                }
                r10 = zBooleanValue;
                r10 = r10;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.e), 1, null);
            }
            r10 = zBooleanValue;
            OfflineVoiceWakeUpViewModel.this._writingResult.postValue(Boxing.boxBoolean(r10 != 0));
            OfflineVoiceWakeUpViewModel.this.b();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$setSettings$1", f = "OfflineVoiceWakeUpViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HashMap<SettingsGroupType, Settings> map, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OfflineVoiceWakeUpViewModel.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EnumData language;
            Integer numBoxInt;
            EnumData language2;
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Companion companion = OfflineVoiceWakeUpViewModel.INSTANCE;
            if (companion.a(OfflineVoiceWakeUpViewModel.this.c().getMiliDevice())) {
                numBoxInt = Boxing.boxInt(0);
            } else {
                HashMap<SettingsGroupType, Settings> map = this.c;
                Settings settings = map == null ? null : map.get(SettingsGroupType.LANGUAGE);
                SettingsLanguageV2 settingsLanguageV2 = settings instanceof SettingsLanguageV2 ? (SettingsLanguageV2) settings : null;
                numBoxInt = (settingsLanguageV2 == null || (language = settingsLanguageV2.getLanguage()) == null) ? null : Boxing.boxInt(language.getValue());
            }
            boolean z2 = numBoxInt != null && OfflineVoiceWakeUpViewModel.p.contains(numBoxInt);
            OfflineVoiceV2 offlineVoiceV2E = OfflineVoiceWakeUpViewModel.this.e();
            Integer numBoxInt2 = (offlineVoiceV2E == null || (language2 = offlineVoiceV2E.getLanguage()) == null) ? null : Boxing.boxInt(language2.getValue());
            if (numBoxInt2 == null) {
                z = false;
            } else if (numBoxInt2.intValue() != OfflineVoiceLanguage.UN_SET.getIndex()) {
                z = true;
            } else {
                z = false;
            }
            OfflineVoiceWakeUpViewModel.this.getOffLineVoiceWakeUpVisibleLiveData().postValue(Boxing.boxBoolean(z2 || z));
            OfflineVoiceWakeUpViewModel.this.getOffLineVoiceWakeUpWordsVisibleLiveData().postValue(Boxing.boxBoolean(companion.a(OfflineVoiceWakeUpViewModel.this.c().getMiliDevice()) || z2 || z));
            MutableLiveData<Boolean> offLineVoiceVoiceLanguageLiveData = OfflineVoiceWakeUpViewModel.this.getOffLineVoiceVoiceLanguageLiveData();
            OfflineVoiceV2 offlineVoiceV2E2 = OfflineVoiceWakeUpViewModel.this.e();
            offLineVoiceVoiceLanguageLiveData.postValue(Boxing.boxBoolean((offlineVoiceV2E2 != null ? offlineVoiceV2E2.getLanguage() : null) != null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$changeListener$1] */
    public OfflineVoiceWakeUpViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.watchSettingsRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IWatchSettingRepo>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$special$$inlined$inject$default$1
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
        this.changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$changeListener$1
            @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
            public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
                MutableLiveData mutableLiveData = this.a._offlineVoice;
                Settings settings2 = settings.get(SettingsGroupType.OFFLINE_VOICE);
                mutableLiveData.setValue(settings2 instanceof OfflineVoice ? (OfflineVoice) settings2 : null);
            }
        };
        MutableLiveData<OfflineVoice> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._offlineVoice = mutableLiveData;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel$special$$inlined$inject$default$2
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
        this.offLineVoiceWakeUpVisibleLiveData = new MutableLiveData<>();
        this.offLineVoiceWakeUpWordsVisibleLiveData = new MutableLiveData<>();
        this.offLineVoiceVoiceLanguageLiveData = new MutableLiveData<>();
    }

    private final HashMap<SettingsGroupType, Settings> a(HashMap<SettingsGroupType, Settings> map, String str) {
        if (map == null) {
            HMLog.info(o, new a(str));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this._isSetting.set(false);
        this._isShowLoading.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OfflineVoiceV2 e() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.OFFLINE_VOICE);
        if (settings instanceof OfflineVoiceV2) {
            return (OfflineVoiceV2) settings;
        }
        return null;
    }

    private final IOfflineVoiceRepo f() {
        IOfflineVoiceRepo offlineVoiceRepoV2;
        IOfflineVoiceRepo iOfflineVoiceRepo = this.repo;
        if (iOfflineVoiceRepo != null) {
            return iOfflineVoiceRepo;
        }
        OfflineVoice value = this._offlineVoice.getValue();
        if (value instanceof OfflineVoiceV1) {
            offlineVoiceRepoV2 = new OfflineVoiceRepoV1();
        } else {
            offlineVoiceRepoV2 = value instanceof OfflineVoiceV2 ? new OfflineVoiceRepoV2() : null;
        }
        this.repo = offlineVoiceRepoV2;
        return offlineVoiceRepoV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWatchSettingRepo g() {
        return (IWatchSettingRepo) this.watchSettingsRepo.getValue();
    }

    private final boolean h() {
        if (this._isSetting.get()) {
            return false;
        }
        this._isSetting.set(true);
        this._isShowLoading.setValue(Boolean.TRUE);
        return true;
    }

    public static /* synthetic */ void querySettings$default(OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        offlineVoiceWakeUpViewModel.querySettings(z);
    }

    public static /* synthetic */ void setSettings$default(OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel, boolean z, HashMap map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        offlineVoiceWakeUpViewModel.setSettings(z, map);
    }

    public static /* synthetic */ void updateOfflineVoiceWakeUp$default(OfflineVoiceWakeUpViewModel offlineVoiceWakeUpViewModel, boolean z, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        offlineVoiceWakeUpViewModel.updateOfflineVoiceWakeUp(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) == 0 ? num : null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Boolean> getOffLineVoiceVoiceLanguageLiveData() {
        return this.offLineVoiceVoiceLanguageLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getOffLineVoiceWakeUpVisibleLiveData() {
        return this.offLineVoiceWakeUpVisibleLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getOffLineVoiceWakeUpWordsVisibleLiveData() {
        return this.offLineVoiceWakeUpWordsVisibleLiveData;
    }

    @NotNull
    public final LiveData<OfflineVoice> getOfflineVoice() {
        return this._offlineVoice;
    }

    @NotNull
    public final LiveData<Boolean> getWritingResult() {
        return this._writingResult;
    }

    public final void initJob(@NotNull HMDeviceType mDeviceType) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) c().getDevice(mDeviceType);
        this.hmMiLiProDevice = hMMiLiProDevice;
        this.settingsModule = hMMiLiProDevice == null ? null : (SettingsModule) hMMiLiProDevice.getChannelModule(SettingsModule.class);
        if (e() == null) {
            HMLog.info(o, b.a);
            SettingsModule settingsModule = this.settingsModule;
            if (settingsModule == null) {
                return;
            }
            settingsModule.addListener(this.changeListener);
        }
    }

    @NotNull
    public final LiveData<Boolean> isShowLoading() {
        return this._isShowLoading;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
    public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
        this._offlineVoice.postValue(e());
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    public final void querySettings(boolean needDesc) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new OfflineVoiceWakeUpViewModel$querySettings$$inlined$safeLaunch$1(null, this, needDesc), 2, null);
    }

    public final void removeListener() {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(this.changeListener);
    }

    public final void setLanguage(int value) {
        if (h()) {
            EnumData enumData = new EnumData(value);
            IOfflineVoiceRepo iOfflineVoiceRepoF = f();
            HashMap<SettingsGroupType, Settings> mapA = a(iOfflineVoiceRepoF == null ? null : iOfflineVoiceRepoF.mo3446getDtoWithLanguage(enumData), "setLanguage");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new OfflineVoiceWakeUpViewModel$setLanguage$$inlined$safeLaunch$1(null, this, mapA, value), 2, null);
        }
    }

    public final void setResponseAfterBrightScreen(boolean isChecked) {
        if (h()) {
            IOfflineVoiceRepo iOfflineVoiceRepoF = f();
            HashMap<SettingsGroupType, Settings> mapA = a(iOfflineVoiceRepoF == null ? null : iOfflineVoiceRepoF.getDtoWithActiveWithIn5SWhenScreenOnSwitch(isChecked), "setResponseAfterBrightScreen");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new OfflineVoiceWakeUpViewModel$setResponseAfterBrightScreen$$inlined$safeLaunch$1(null, this, mapA, isChecked), 2, null);
        }
    }

    public final void setResponseAfterTurningWrist(boolean isChecked) {
        if (h()) {
            IOfflineVoiceRepo iOfflineVoiceRepoF = f();
            HashMap<SettingsGroupType, Settings> mapA = a(iOfflineVoiceRepoF == null ? null : iOfflineVoiceRepoF.getDtoWithActiveWithIn5SByTurningWristSwitch(isChecked), "setResponseAfterTurningWrist");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new OfflineVoiceWakeUpViewModel$setResponseAfterTurningWrist$$inlined$safeLaunch$1(null, this, mapA, isChecked), 2, null);
        }
    }

    public final void setResponseDuringBrightScreen(boolean isChecked) {
        if (h()) {
            IOfflineVoiceRepo iOfflineVoiceRepoF = f();
            HashMap<SettingsGroupType, Settings> mapA = a(iOfflineVoiceRepoF == null ? null : iOfflineVoiceRepoF.getDtoWithActiveDuringScreenOnSwitch(isChecked), "setResponseDuringBrightScreen");
            if (mapA == null) {
                return;
            }
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new OfflineVoiceWakeUpViewModel$setResponseDuringBrightScreen$$inlined$safeLaunch$1(null, this, mapA, isChecked), 2, null);
        }
    }

    public final void setSettings(boolean needLoadVisibility, @Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
        MutableLiveData<OfflineVoice> mutableLiveData = this._offlineVoice;
        Settings settings = watchSettings == null ? null : watchSettings.get(SettingsGroupType.OFFLINE_VOICE);
        mutableLiveData.setValue(settings instanceof OfflineVoice ? (OfflineVoice) settings : null);
        if (e() == null || !needLoadVisibility) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(watchSettings, null), 2, null);
    }

    public final void updateOfflineVoiceWakeUp(boolean needRefreshObserver, @Nullable Boolean activeWithIn5SByTurningWristSwitch, @Nullable Boolean activeWithIn5SWhenScreenOnSwitch, @Nullable Boolean activeDuringScreenOnSwitch, @Nullable Integer language) {
        OfflineVoice value = needRefreshObserver ? this._offlineVoice.getValue() : this._offlineVoice.getValue();
        IOfflineVoiceRepo iOfflineVoiceRepoF = f();
        OfflineVoice offlineVoiceUpdateOfflineVoiceWakeUp = iOfflineVoiceRepoF == null ? null : iOfflineVoiceRepoF.updateOfflineVoiceWakeUp(value, activeWithIn5SByTurningWristSwitch, activeWithIn5SWhenScreenOnSwitch, activeDuringScreenOnSwitch, language);
        if (needRefreshObserver) {
            this._offlineVoice.setValue(offlineVoiceUpdateOfflineVoiceWakeUp);
        }
    }
}
