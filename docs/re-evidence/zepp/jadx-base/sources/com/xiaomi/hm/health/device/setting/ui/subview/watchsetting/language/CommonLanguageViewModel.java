package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.DeviceLanguageRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\b*\u00018\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b<\u0010=J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J>\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2&\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0014J\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\rR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R(\u0010,\u001a\b\u0012\u0004\u0012\u00020'0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!\"\u0004\b*\u0010+R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b$\u0010/R\u001d\u00104\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b\u001e\u00103R\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", UserLegalInfoManager.KEY_LANGUAGE, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "lastLanguageConfig", "", "a", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;)Ljava/lang/Integer;", "lang", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "e", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/repo/ICommonLanguageRepo;", "repoClazz", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lkotlin/collections/HashMap;", "watchSettings", PointCategory.INIT, "queryLanguageConfig", "languageConfig", "setLanguageConfig", "releaseOperation", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/repo/ICommonLanguageRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getLanguageConfigLiveData", "()Landroidx/lifecycle/MutableLiveData;", "languageConfigLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "c", "getLoadingLiveData", "loadingLiveData", "", GoogleApiAvailabilityLight.a, "getResultLiveData", "setResultLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "resultLiveData", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApiLazy", "Lcom/huami/devicex/manager/DeviceManagerApi;", "f", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "g", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageViewModel$changeListener$1", "h", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/CommonLanguageViewModel$changeListener$1;", "changeListener", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CommonLanguageViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String i = "CommonLanguageViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ICommonLanguageRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<CommonLanguageConfig> languageConfigLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> resultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApiLazy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CommonLanguageViewModel$changeListener$1 changeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMDeviceSource> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            HMBaseDevice device = CommonLanguageViewModel.this.b().getDevice(HMDeviceType.MILI);
            if (device == null) {
                return null;
            }
            return device.getDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "init exception: " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageViewModel$changeListener$1] */
    public CommonLanguageViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageViewModel$special$$inlined$inject$default$2
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
        this.deviceSource = LazyKt__LazyJVMKt.lazy(new a());
        this.changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageViewModel$changeListener$1
            @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
            public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
                Settings settings2;
                Integer numA;
                SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
                if (!settings.containsKey(settingsGroupType) || (settings2 = settings.get(settingsGroupType)) == null) {
                    return;
                }
                CommonLanguageViewModel commonLanguageViewModel = this.a;
                CommonLanguageConfig value = commonLanguageViewModel.getLanguageConfigLiveData().getValue();
                CommonLanguageConfig commonLanguageConfigCopy$default = value == null ? null : CommonLanguageConfig.copy$default(value, null, 0, null, 7, null);
                if (commonLanguageConfigCopy$default == null || (numA = commonLanguageViewModel.a(settings2, commonLanguageConfigCopy$default)) == null) {
                    return;
                }
                commonLanguageConfigCopy$default.setCurrIndex(numA.intValue());
                commonLanguageViewModel.getLanguageConfigLiveData().postValue(commonLanguageConfigCopy$default);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer a(Settings language, CommonLanguageConfig lastLanguageConfig) {
        Integer numValueOf = null;
        if (!(language instanceof SettingsLanguageV2)) {
            return null;
        }
        List<Integer> languageKeys = lastLanguageConfig.getLanguageKeys();
        SettingsLanguageV2 settingsLanguageV2 = (SettingsLanguageV2) language;
        if (Intrinsics.areEqual(settingsLanguageV2.getLanguageFollowMobilePhoneSwitch(), Boolean.TRUE)) {
            numValueOf = -1;
        } else {
            EnumData language2 = settingsLanguageV2.getLanguage();
            if (language2 != null) {
                numValueOf = Integer.valueOf(language2.getValue());
            }
        }
        return Integer.valueOf(CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) ((List) languageKeys), (Object) numValueOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi c() {
        return (DeviceUtilsApi) this.deviceUtilsApiLazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int lang, HMDeviceSource deviceSource) {
        c().saveDeviceLanguageProperty(new HMLanguage(lang), deviceSource);
        LocWeatherManager.getInstance().requestLocation();
        c().updateAboutLanguageConfig(deviceSource);
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(deviceSource.getType())) {
            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
            HMFwOnlineManager.getInstance().checkFw(deviceSource.getType(), true);
        }
    }

    @Nullable
    public final HMDeviceSource getDeviceSource() {
        return (HMDeviceSource) this.deviceSource.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<CommonLanguageConfig> getLanguageConfigLiveData() {
        return this.languageConfigLiveData;
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getResultLiveData() {
        return this.resultLiveData;
    }

    public final void init(@NotNull Class<? extends ICommonLanguageRepo> repoClazz, @Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            ICommonLanguageRepo iCommonLanguageRepoNewInstance = repoClazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            this.repo = iCommonLanguageRepoNewInstance;
            Unit unit = null;
            DeviceLanguageRepo deviceLanguageRepo = iCommonLanguageRepoNewInstance instanceof DeviceLanguageRepo ? (DeviceLanguageRepo) iCommonLanguageRepoNewInstance : null;
            if (deviceLanguageRepo != null) {
                deviceLanguageRepo.setSettings(watchSettings);
            }
            ICommonLanguageRepo iCommonLanguageRepo = this.repo;
            if (iCommonLanguageRepo != null) {
                iCommonLanguageRepo.addListener(this.changeListener);
                unit = Unit.INSTANCE;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(i, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
        }
    }

    public final void queryLanguageConfig() {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CommonLanguageViewModel$queryLanguageConfig$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void releaseOperation() {
        ICommonLanguageRepo iCommonLanguageRepo = this.repo;
        if (iCommonLanguageRepo == null) {
            return;
        }
        iCommonLanguageRepo.removeListener(this.changeListener);
    }

    public final void setLanguageConfig(@NotNull CommonLanguageConfig languageConfig) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new CommonLanguageViewModel$setLanguageConfig$$inlined$safeLaunch$1(null, this, languageConfig), 2, null);
    }

    public final void setResultLiveData(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.resultLiveData = mutableLiveData;
    }
}
