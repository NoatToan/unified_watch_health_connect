package com.xiaomi.hm.health.devicex.manage.koin;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.device.core.sync.impl.job.hub.SensorHub;
import com.huami.devicerecorder.IContentProvider;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.AppNotificationApi;
import com.huami.devicex.injection.AppStateApi;
import com.huami.devicex.injection.AvatarManagerApi;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.SensorHubControllerApi;
import com.huami.devicex.injection.action.ToolUtilApi;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.CaptureQRApi;
import com.huami.devicex.injection.basic.DeviceTokenApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.GoalFunctionsApi;
import com.huami.devicex.injection.basic.HRDataManagerApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.injection.basic.SyncEventApi;
import com.huami.devicex.injection.data.AtrialManagerApi;
import com.huami.devicex.injection.data.DateFormatApi;
import com.huami.devicex.injection.data.HealthDataApi;
import com.huami.devicex.injection.data.HistoryRecordManagerApi;
import com.huami.devicex.injection.data.OriginSportDataApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.injection.other.AppUtilApi;
import com.huami.devicex.injection.other.QQLoginApi;
import com.huami.devicex.injection.other.SmartExecutorApi;
import com.huami.devicex.injection.webapi.FaqWebApi;
import com.huami.devicex.manager.DataCacheApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.devicex.manager.DeviceRepositoryWrapper;
import com.huami.phn.coach.usecase.SwitchDeviceAlertUseCase;
import com.huami.phone_call.sms.DeviceStatus;
import com.huami.phone_call.sms.PhoneCallReplyAnalytics;
import com.huami.phone_call.sms.PhoneCallSmsReplyFeature;
import com.huami.watch.companion.sync.PBSyncApi;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.bind.SupportNameImpl;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.agps.LowBatteryApi;
import com.xiaomi.hm.health.device.agps.SmartWatchUpgradeAgpsApi;
import com.xiaomi.hm.health.device.amazfit_watch.SmartWatchUpgradeAgpsImpl;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.SupportNameApi;
import com.xiaomi.hm.health.device.bind.enable.ISwitchDeviceCallback;
import com.xiaomi.hm.health.device.database.DeviceDataDb;
import com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolve;
import com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.firmware.LowBatteryHelperImpl;
import com.xiaomi.hm.health.device.realtimedata.IRealtimeData;
import com.xiaomi.hm.health.device.recorder.RecorderContentProvider;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.appsort.AppSortConditionProvider;
import com.xiaomi.hm.health.device.setting.appsort.AppSortHelperApi;
import com.xiaomi.hm.health.device.setting.appsort.AppSortViewModel;
import com.xiaomi.hm.health.device.setting.appsort.condition.DeviceAppSortConditionProvider;
import com.xiaomi.hm.health.device.setting.dial.DefaultDialKeeper;
import com.xiaomi.hm.health.device.setting.dial.DialFetchApi;
import com.xiaomi.hm.health.device.setting.dial.IDialConfig;
import com.xiaomi.hm.health.device.setting.dial.IDialKeeper;
import com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl;
import com.xiaomi.hm.health.device.setting.dial.UnusedDialImpl;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.parse.IParser;
import com.xiaomi.hm.health.device.setting.network.parse.Parser;
import com.xiaomi.hm.health.device.setting.network.repo.DefaultRepo;
import com.xiaomi.hm.health.device.setting.network.repo.IDefaultRepo;
import com.xiaomi.hm.health.device.setting.network.repo.IPropertyUtil;
import com.xiaomi.hm.health.device.setting.network.repo.IRepo;
import com.xiaomi.hm.health.device.setting.network.repo.Repo;
import com.xiaomi.hm.health.device.setting.realtime.RealtimeDataImp;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.LocalSportTypeDescImpl;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeDescApi;
import com.xiaomi.hm.health.device.settings.alert.AlertItemFactory;
import com.xiaomi.hm.health.device.settings.alert.factory.AmazfitAlertConfigProvider;
import com.xiaomi.hm.health.device.settings.alert.factory.AmazfitAlertItemFactory;
import com.xiaomi.hm.health.devicex.factory.AppSortHelperImpl;
import com.xiaomi.hm.health.devicex.factory.QQLoginImpl;
import com.xiaomi.hm.health.devicex.inject.PBSyncApiImpl;
import com.xiaomi.hm.health.devicex.manage.api.config.NightModeConfigApi;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.UserInfoProvider;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.devicex.manage.impl.core.feature.HmDeviceSnService;
import com.xiaomi.hm.health.devicex.manage.impl.core.manager.HMDeviceConnectManager;
import com.xiaomi.hm.health.devicex.manage.impl.core.manager.HMUserInfoProvider;
import com.xiaomi.hm.health.devicex.manage.impl.repository.DeviceRepositoryImpl;
import com.xiaomi.hm.health.devicex.navigation.DeviceXNavigatorImpl;
import com.xiaomi.hm.health.devicex.proxy.AppStateProxy;
import com.xiaomi.hm.health.devicex.proxy.BuildConfigProxy;
import com.xiaomi.hm.health.devicex.proxy.DataCacheProxy;
import com.xiaomi.hm.health.devicex.proxy.DialConfigProxy;
import com.xiaomi.hm.health.devicex.proxy.account.DeviceTokenImpl;
import com.xiaomi.hm.health.devicex.proxy.basic.AccountWebExtImpl;
import com.xiaomi.hm.health.devicex.proxy.basic.CaptureQRImpl;
import com.xiaomi.hm.health.devicex.proxy.basic.GoalFunctionsImpl;
import com.xiaomi.hm.health.devicex.proxy.basic.MiuiFnImpl;
import com.xiaomi.hm.health.devicex.proxy.basic.SensorHubControllerImpl;
import com.xiaomi.hm.health.devicex.proxy.data.AgpsTimeStoreImpl;
import com.xiaomi.hm.health.devicex.proxy.data.AtrialManagerImpl;
import com.xiaomi.hm.health.devicex.proxy.data.AvatarManagerImpl;
import com.xiaomi.hm.health.devicex.proxy.data.DateFormatImpl;
import com.xiaomi.hm.health.devicex.proxy.data.HRDataManagerImpl;
import com.xiaomi.hm.health.devicex.proxy.data.HealthDataImpl;
import com.xiaomi.hm.health.devicex.proxy.data.HistoryRecordManagerImpl;
import com.xiaomi.hm.health.devicex.proxy.data.KeeperProxyImpl;
import com.xiaomi.hm.health.devicex.proxy.data.OriginSportDataImpl;
import com.xiaomi.hm.health.devicex.proxy.data.PropertyStoreImpl;
import com.xiaomi.hm.health.devicex.proxy.fw.FirmwareManagerImpl;
import com.xiaomi.hm.health.devicex.proxy.fw.FirmwareOnlineManagerImpl;
import com.xiaomi.hm.health.devicex.proxy.other.AppNotificationImpl;
import com.xiaomi.hm.health.devicex.proxy.other.AppUtilApiProxy;
import com.xiaomi.hm.health.devicex.proxy.other.DeviceUtilsImpl;
import com.xiaomi.hm.health.devicex.proxy.other.SmartExecutorImpl;
import com.xiaomi.hm.health.devicex.proxy.other.SyncEventImp;
import com.xiaomi.hm.health.devicex.proxy.webapi.FaqWebApiImpl;
import com.xiaomi.hm.health.devicex.service.bind.BindServiceImpl;
import com.xiaomi.hm.health.di.koin.imp.AmazfitAlertConfigProviderImp;
import com.xiaomi.hm.health.di.koin.module.MiFitScopeNames;
import com.xiaomi.hm.health.di.koin.module.device.settings.DeviceCenterImp;
import com.xiaomi.hm.health.di.koin.module.device.settings.IncomingCallReplyFeatureImp;
import com.xiaomi.hm.health.di.koin.module.device.settings.PhoneCallReplyAnalyticsImp;
import com.xiaomi.hm.health.di.koin.module.device.settings.PhoneCallReplyDeviceCenter;
import com.xiaomi.hm.health.di.koin.module.device.settings.PhoneCallReplyDeviceStatus;
import com.xiaomi.hm.health.di.koin.scope.ScopesKt;
import com.xiaomi.hm.health.firstbeat.SportEffectApi;
import com.xiaomi.hm.health.firstbeat.SportEffectApiImpl;
import com.xiaomi.hm.health.model.account.HMNightModeConfig;
import com.xiaomi.hm.health.sensorhub.SensorHubController;
import com.xiaomi.hm.health.smalltool.util.ToolUtilImpl;
import com.xiaomi.hm.health.utils.ConcoAnalyticsApi;
import com.xiaomi.hm.health.utils.ConcoAnalyticsImpl;
import defpackage.i81;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/koin/DeviceManageModules;", "", "Ljava/util/ArrayList;", "Lorg/koin/core/module/Module;", "Lkotlin/collections/ArrayList;", "getModules", "", "reloadModules", "closeWatchSettingsScope", "closeDeviceDataScope", "a", "Lorg/koin/core/module/Module;", "modules", "b", "alertSettingsModule", "", "c", "[Lorg/koin/core/module/Module;", "phoneCallReplyModules", GoogleApiAvailabilityLight.a, "appSortModule", "e", "deviceDialModule", "f", "dataModule", "g", "deviceSettingModules", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceManageModules {

    @NotNull
    public static final DeviceManageModules INSTANCE = new DeviceManageModules();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Module modules = ModuleKt.module(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$modules$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, IDialKeeper> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IDialKeeper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DefaultDialKeeper();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a0 extends Lambda implements Function2<Scope, ParametersHolder, FirmwareOnlineManagerApi> {
            public static final a0 a = new a0();

            public a0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FirmwareOnlineManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FirmwareOnlineManagerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a1 extends Lambda implements Function2<Scope, ParametersHolder, DeviceRepositoryApi> {
            public static final a1 a = new a1();

            public a1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceRepositoryApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (DeviceRepositoryApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceRepositoryImpl.class), null, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/manager/DeviceManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DeviceManagerApi> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                HMDeviceManager.init(ModuleExtKt.androidContext(scope));
                return HMDeviceManager.getInstance();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/api/config/NightModeConfigApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b0 extends Lambda implements Function2<Scope, ParametersHolder, NightModeConfigApi> {
            public static final b0 a = new b0();

            public b0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NightModeConfigApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HMNightModeConfig();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/manager/DeviceRepositoryWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b1 extends Lambda implements Function2<Scope, ParametersHolder, DeviceRepositoryWrapper> {
            public static final b1 a = new b1();

            public b1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceRepositoryWrapper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceRepositoryWrapper();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, DeviceTimeStoreApi> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceTimeStoreApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return HMDeviceManager.getInstance();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/AppNotificationApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c0 extends Lambda implements Function2<Scope, ParametersHolder, AppNotificationApi> {
            public static final c0 a = new c0();

            public c0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppNotificationApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AppNotificationImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c1 extends Lambda implements Function2<Scope, ParametersHolder, DeviceSnService> {
            public static final c1 a = new c1();

            public c1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceSnService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HmDeviceSnService();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/agps/LowBatteryApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, LowBatteryApi> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LowBatteryApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LowBatteryHelperImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/AvatarManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d0 extends Lambda implements Function2<Scope, ParametersHolder, AvatarManagerApi> {
            public static final d0 a = new d0();

            public d0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AvatarManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AvatarManagerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d1 extends Lambda implements Function2<Scope, ParametersHolder, DeviceXNavigator> {
            public static final d1 a = new d1();

            public d1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceXNavigator invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceXNavigatorImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/agps/SmartWatchUpgradeAgpsApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SmartWatchUpgradeAgpsApi> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SmartWatchUpgradeAgpsApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SmartWatchUpgradeAgpsImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/GoalFunctionsApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e0 extends Lambda implements Function2<Scope, ParametersHolder, GoalFunctionsApi> {
            public static final e0 a = new e0();

            public e0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GoalFunctionsApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GoalFunctionsImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/realtimedata/IRealtimeData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e1 extends Lambda implements Function2<Scope, ParametersHolder, IRealtimeData> {
            public static final e1 a = new e1();

            public e1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IRealtimeData invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RealtimeDataImp();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, FirmwareManagerApi> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FirmwareManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FirmwareManagerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/core/sync/impl/job/hub/SensorHub;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f0 extends Lambda implements Function2<Scope, ParametersHolder, SensorHub> {
            public static final f0 a = new f0();

            public f0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SensorHub invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return SensorHubController.getInstance();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/other/QQLoginApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, QQLoginApi> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final QQLoginApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new QQLoginImpl(ModuleExtKt.androidContext(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/DeviceConnectManger;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g0 extends Lambda implements Function2<Scope, ParametersHolder, DeviceConnectManger> {
            public static final g0 a = new g0();

            public g0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceConnectManger invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HMDeviceConnectManager(DeviceXFunctionsKt.getContext(), new HMUserInfoProvider(), (IHMConnectionCallback) scope.get(Reflection.getOrCreateKotlinClass(HMDeviceManager.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortHelperApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, AppSortHelperApi> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppSortHelperApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AppSortHelperImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/data/HealthDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h0 extends Lambda implements Function2<Scope, ParametersHolder, HealthDataApi> {
            public static final h0 a = new h0();

            public h0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthDataImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, BindServiceApi> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BindServiceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BindServiceImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/DeviceTokenApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i0 extends Lambda implements Function2<Scope, ParametersHolder, DeviceTokenApi> {
            public static final i0 a = new i0();

            public i0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceTokenApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceTokenImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/other/AppUtilApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, AppUtilApi> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppUtilApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AppUtilApiProxy();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/webapi/FaqWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j0 extends Lambda implements Function2<Scope, ParametersHolder, FaqWebApi> {
            public static final j0 a = new j0();

            public j0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FaqWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FaqWebApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/HMDeviceManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, HMDeviceManager> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HMDeviceManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return HMDeviceManager.getInstance();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/utils/ConcoAnalyticsApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k0 extends Lambda implements Function2<Scope, ParametersHolder, ConcoAnalyticsApi> {
            public static final k0 a = new k0();

            public k0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ConcoAnalyticsApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ConcoAnalyticsImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, PropertyStoreApi> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PropertyStoreApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PropertyStoreImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/action/ToolUtilApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l0 extends Lambda implements Function2<Scope, ParametersHolder, ToolUtilApi> {
            public static final l0 a = new l0();

            public l0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ToolUtilApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ToolUtilImpl.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/manager/DataCacheApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, DataCacheApi> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DataCacheApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DataCacheProxy();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/AppStateApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m0 extends Lambda implements Function2<Scope, ParametersHolder, AppStateApi> {
            public static final m0 a = new m0();

            public m0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppStateApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AppStateProxy();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/data/HistoryRecordManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, HistoryRecordManagerApi> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HistoryRecordManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HistoryRecordManagerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/SensorHubControllerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n0 extends Lambda implements Function2<Scope, ParametersHolder, SensorHubControllerApi> {
            public static final n0 a = new n0();

            public n0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SensorHubControllerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SensorHubControllerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/data/DateFormatApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, DateFormatApi> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DateFormatApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DateFormatImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/data/AtrialManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o0 extends Lambda implements Function2<Scope, ParametersHolder, AtrialManagerApi> {
            public static final o0 a = new o0();

            public o0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AtrialManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AtrialManagerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/data/OriginSportDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, OriginSportDataApi> {
            public static final p a = new p();

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OriginSportDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new OriginSportDataImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/UserInfoProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p0 extends Lambda implements Function2<Scope, ParametersHolder, UserInfoProvider> {
            public static final p0 a = new p0();

            public p0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserInfoProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HMUserInfoProvider();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/HRDataManagerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, HRDataManagerApi> {
            public static final q a = new q();

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HRDataManagerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HRDataManagerImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/dial/IDialConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q0 extends Lambda implements Function2<Scope, ParametersHolder, IDialConfig> {
            public static final q0 a = new q0();

            public q0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IDialConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DialConfigProxy();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, DeviceUtilsApi> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceUtilsApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceUtilsImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceMigrationApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r0 extends Lambda implements Function2<Scope, ParametersHolder, DeviceMigrationApi> {
            public static final r0 a = new r0();

            public r0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceMigrationApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (DeviceMigrationApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceRepositoryImpl.class), null, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/AccountWebExtApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, AccountWebExtApi> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccountWebExtApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AccountWebExtImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeDescApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s0 extends Lambda implements Function2<Scope, ParametersHolder, SportTypeDescApi> {
            public static final s0 a = new s0();

            public s0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportTypeDescApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LocalSportTypeDescImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/MiuiFnApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t extends Lambda implements Function2<Scope, ParametersHolder, MiuiFnApi> {
            public static final t a = new t();

            public t() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MiuiFnApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MiuiFnImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/watch/companion/sync/PBSyncApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class t0 extends Lambda implements Function2<Scope, ParametersHolder, PBSyncApi> {
            public static final t0 a = new t0();

            public t0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PBSyncApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PBSyncApiImpl(ModuleExtKt.androidContext(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class u extends Lambda implements Function2<Scope, ParametersHolder, AgpsTimeStore> {
            public static final u a = new u();

            public u() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AgpsTimeStore invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AgpsTimeStoreImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicerecorder/IContentProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class u0 extends Lambda implements Function2<Scope, ParametersHolder, IContentProvider> {
            public static final u0 a = new u0();

            public u0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IContentProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RecorderContentProvider(ModuleExtKt.androidContext(scope), HMDeviceManager.getInstance().getMiliDevice());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/devicex/manage/impl/repository/DeviceRepositoryImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class v extends Lambda implements Function2<Scope, ParametersHolder, DeviceRepositoryImpl> {
            public static final v a = new v();

            public v() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceRepositoryImpl invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceRepositoryImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/SyncEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class v0 extends Lambda implements Function2<Scope, ParametersHolder, SyncEventApi> {
            public static final v0 a = new v0();

            public v0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncEventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncEventImp();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/basic/CaptureQRApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class w extends Lambda implements Function2<Scope, ParametersHolder, CaptureQRApi> {
            public static final w a = new w();

            public w() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CaptureQRApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new CaptureQRImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class w0 extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final w0 a = new w0();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/network/parse/IParser;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function2<Scope, ParametersHolder, IParser> {
                public static final a a = new a();

                public a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IParser invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new Parser();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/network/repo/IRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, IRepo> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new Repo((IParser) scope.get(Reflection.getOrCreateKotlinClass(IParser.class), null, null), (IPropertyUtil) scope.get(Reflection.getOrCreateKotlinClass(IPropertyUtil.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/network/repo/IDefaultRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, IDefaultRepo> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IDefaultRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DefaultRepo();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/network/WatchSettingsManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, WatchSettingsManager> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final WatchSettingsManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new WatchSettingsManager((IRepo) scope.get(Reflection.getOrCreateKotlinClass(IRepo.class), null, null), (IDefaultRepo) scope.get(Reflection.getOrCreateKotlinClass(IDefaultRepo.class), null, null));
                }
            }

            public w0() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                a aVar = a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IParser.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IRepo.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IDefaultRepo.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                d dVar = d.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(WatchSettingsManager.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class x extends Lambda implements Function2<Scope, ParametersHolder, KeeperProxyApi> {
            public static final x a = new x();

            public x() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final KeeperProxyApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new KeeperProxyImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/firstbeat/SportEffectApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class x0 extends Lambda implements Function2<Scope, ParametersHolder, SportEffectApi> {
            public static final x0 a = new x0();

            public x0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SportEffectApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SportEffectApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/other/SmartExecutorApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class y extends Lambda implements Function2<Scope, ParametersHolder, SmartExecutorApi> {
            public static final y a = new y();

            public y() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SmartExecutorApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SmartExecutorImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/feature/sync/earbud/EarbudClashResolve;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class y0 extends Lambda implements Function2<Scope, ParametersHolder, EarbudClashResolve> {
            public static final y0 a = new y0();

            public y0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EarbudClashResolve invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EarbudClashResolveImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/devicex/injection/BuildConfigApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class z extends Lambda implements Function2<Scope, ParametersHolder, BuildConfigApi> {
            public static final z a = new z();

            public z() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BuildConfigApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BuildConfigProxy();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/bind/SupportNameApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class z0 extends Lambda implements Function2<Scope, ParametersHolder, SupportNameApi> {
            public static final z0 a = new z0();

            public z0() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SupportNameApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SupportNameImpl();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            k kVar = k.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HMDeviceManager.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            v vVar = v.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceRepositoryImpl.class), null, vVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            g0 g0Var = g0.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceConnectManger.class), null, g0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            r0 r0Var = r0.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(DeviceMigrationApi.class), null, r0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            a1 a1Var = a1.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), null, a1Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            b1 b1Var = b1.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(DeviceRepositoryWrapper.class), null, b1Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            c1 c1Var = c1.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(DeviceSnService.class), null, c1Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            d1 d1Var = d1.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), null, d1Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            e1 e1Var = e1.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IRealtimeData.class), null, e1Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            a aVar = a.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(IDialKeeper.class), null, aVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            b bVar = b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            c cVar = c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
            d dVar = d.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition13 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(LowBatteryApi.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            e eVar = e.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition14 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(SmartWatchUpgradeAgpsApi.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            f fVar = f.a;
            BeanDefinition beanDefinition15 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FirmwareManagerApi.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, singleInstanceFactory7, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory7);
            }
            new Pair(module, singleInstanceFactory7);
            g gVar = g.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition16 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(QQLoginApi.class), null, gVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
            h hVar = h.a;
            BeanDefinition beanDefinition17 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppSortHelperApi.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory8 = new SingleInstanceFactory<>(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, singleInstanceFactory8, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory8);
            }
            new Pair(module, singleInstanceFactory8);
            i iVar = i.a;
            StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition18 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(BindServiceApi.class), null, iVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, rootScopeQualifier10);
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition18);
            Module.saveMapping$default(module, strIndexKey18, factoryInstanceFactory10, false, 4, null);
            new Pair(module, factoryInstanceFactory10);
            j jVar = j.a;
            BeanDefinition beanDefinition19 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppUtilApi.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory9 = new SingleInstanceFactory<>(beanDefinition19);
            Module.saveMapping$default(module, strIndexKey19, singleInstanceFactory9, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory9);
            }
            new Pair(module, singleInstanceFactory9);
            l lVar = l.a;
            BeanDefinition beanDefinition20 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey20 = BeanDefinitionKt.indexKey(beanDefinition20.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory10 = new SingleInstanceFactory<>(beanDefinition20);
            Module.saveMapping$default(module, strIndexKey20, singleInstanceFactory10, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory10);
            }
            new Pair(module, singleInstanceFactory10);
            m mVar = m.a;
            BeanDefinition beanDefinition21 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DataCacheApi.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey21 = BeanDefinitionKt.indexKey(beanDefinition21.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory11 = new SingleInstanceFactory<>(beanDefinition21);
            Module.saveMapping$default(module, strIndexKey21, singleInstanceFactory11, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory11);
            }
            new Pair(module, singleInstanceFactory11);
            n nVar = n.a;
            BeanDefinition beanDefinition22 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HistoryRecordManagerApi.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey22 = BeanDefinitionKt.indexKey(beanDefinition22.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory12 = new SingleInstanceFactory<>(beanDefinition22);
            Module.saveMapping$default(module, strIndexKey22, singleInstanceFactory12, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory12);
            }
            new Pair(module, singleInstanceFactory12);
            o oVar = o.a;
            StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition23 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(DateFormatApi.class), null, oVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey23 = BeanDefinitionKt.indexKey(beanDefinition23.getPrimaryType(), null, rootScopeQualifier11);
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition23);
            Module.saveMapping$default(module, strIndexKey23, factoryInstanceFactory11, false, 4, null);
            new Pair(module, factoryInstanceFactory11);
            p pVar = p.a;
            StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition24 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(OriginSportDataApi.class), null, pVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey24 = BeanDefinitionKt.indexKey(beanDefinition24.getPrimaryType(), null, rootScopeQualifier12);
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition24);
            Module.saveMapping$default(module, strIndexKey24, factoryInstanceFactory12, false, 4, null);
            new Pair(module, factoryInstanceFactory12);
            q qVar = q.a;
            StringQualifier rootScopeQualifier13 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition25 = new BeanDefinition(rootScopeQualifier13, Reflection.getOrCreateKotlinClass(HRDataManagerApi.class), null, qVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey25 = BeanDefinitionKt.indexKey(beanDefinition25.getPrimaryType(), null, rootScopeQualifier13);
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(beanDefinition25);
            Module.saveMapping$default(module, strIndexKey25, factoryInstanceFactory13, false, 4, null);
            new Pair(module, factoryInstanceFactory13);
            r rVar = r.a;
            StringQualifier rootScopeQualifier14 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition26 = new BeanDefinition(rootScopeQualifier14, Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), null, rVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey26 = BeanDefinitionKt.indexKey(beanDefinition26.getPrimaryType(), null, rootScopeQualifier14);
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(beanDefinition26);
            Module.saveMapping$default(module, strIndexKey26, factoryInstanceFactory14, false, 4, null);
            new Pair(module, factoryInstanceFactory14);
            s sVar = s.a;
            StringQualifier rootScopeQualifier15 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition27 = new BeanDefinition(rootScopeQualifier15, Reflection.getOrCreateKotlinClass(AccountWebExtApi.class), null, sVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey27 = BeanDefinitionKt.indexKey(beanDefinition27.getPrimaryType(), null, rootScopeQualifier15);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(beanDefinition27);
            Module.saveMapping$default(module, strIndexKey27, factoryInstanceFactory15, false, 4, null);
            new Pair(module, factoryInstanceFactory15);
            t tVar = t.a;
            StringQualifier rootScopeQualifier16 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition28 = new BeanDefinition(rootScopeQualifier16, Reflection.getOrCreateKotlinClass(MiuiFnApi.class), null, tVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey28 = BeanDefinitionKt.indexKey(beanDefinition28.getPrimaryType(), null, rootScopeQualifier16);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(beanDefinition28);
            Module.saveMapping$default(module, strIndexKey28, factoryInstanceFactory16, false, 4, null);
            new Pair(module, factoryInstanceFactory16);
            u uVar = u.a;
            StringQualifier rootScopeQualifier17 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition29 = new BeanDefinition(rootScopeQualifier17, Reflection.getOrCreateKotlinClass(AgpsTimeStore.class), null, uVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey29 = BeanDefinitionKt.indexKey(beanDefinition29.getPrimaryType(), null, rootScopeQualifier17);
            FactoryInstanceFactory factoryInstanceFactory17 = new FactoryInstanceFactory(beanDefinition29);
            Module.saveMapping$default(module, strIndexKey29, factoryInstanceFactory17, false, 4, null);
            new Pair(module, factoryInstanceFactory17);
            w wVar = w.a;
            StringQualifier rootScopeQualifier18 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition30 = new BeanDefinition(rootScopeQualifier18, Reflection.getOrCreateKotlinClass(CaptureQRApi.class), null, wVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey30 = BeanDefinitionKt.indexKey(beanDefinition30.getPrimaryType(), null, rootScopeQualifier18);
            FactoryInstanceFactory factoryInstanceFactory18 = new FactoryInstanceFactory(beanDefinition30);
            Module.saveMapping$default(module, strIndexKey30, factoryInstanceFactory18, false, 4, null);
            new Pair(module, factoryInstanceFactory18);
            x xVar = x.a;
            StringQualifier rootScopeQualifier19 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition31 = new BeanDefinition(rootScopeQualifier19, Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), null, xVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey31 = BeanDefinitionKt.indexKey(beanDefinition31.getPrimaryType(), null, rootScopeQualifier19);
            FactoryInstanceFactory factoryInstanceFactory19 = new FactoryInstanceFactory(beanDefinition31);
            Module.saveMapping$default(module, strIndexKey31, factoryInstanceFactory19, false, 4, null);
            new Pair(module, factoryInstanceFactory19);
            y yVar = y.a;
            StringQualifier rootScopeQualifier20 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition32 = new BeanDefinition(rootScopeQualifier20, Reflection.getOrCreateKotlinClass(SmartExecutorApi.class), null, yVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey32 = BeanDefinitionKt.indexKey(beanDefinition32.getPrimaryType(), null, rootScopeQualifier20);
            FactoryInstanceFactory factoryInstanceFactory20 = new FactoryInstanceFactory(beanDefinition32);
            Module.saveMapping$default(module, strIndexKey32, factoryInstanceFactory20, false, 4, null);
            new Pair(module, factoryInstanceFactory20);
            z zVar = z.a;
            StringQualifier rootScopeQualifier21 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition33 = new BeanDefinition(rootScopeQualifier21, Reflection.getOrCreateKotlinClass(BuildConfigApi.class), null, zVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey33 = BeanDefinitionKt.indexKey(beanDefinition33.getPrimaryType(), null, rootScopeQualifier21);
            FactoryInstanceFactory factoryInstanceFactory21 = new FactoryInstanceFactory(beanDefinition33);
            Module.saveMapping$default(module, strIndexKey33, factoryInstanceFactory21, false, 4, null);
            new Pair(module, factoryInstanceFactory21);
            a0 a0Var = a0.a;
            StringQualifier rootScopeQualifier22 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition34 = new BeanDefinition(rootScopeQualifier22, Reflection.getOrCreateKotlinClass(FirmwareOnlineManagerApi.class), null, a0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey34 = BeanDefinitionKt.indexKey(beanDefinition34.getPrimaryType(), null, rootScopeQualifier22);
            FactoryInstanceFactory factoryInstanceFactory22 = new FactoryInstanceFactory(beanDefinition34);
            Module.saveMapping$default(module, strIndexKey34, factoryInstanceFactory22, false, 4, null);
            new Pair(module, factoryInstanceFactory22);
            b0 b0Var = b0.a;
            StringQualifier rootScopeQualifier23 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition35 = new BeanDefinition(rootScopeQualifier23, Reflection.getOrCreateKotlinClass(NightModeConfigApi.class), null, b0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey35 = BeanDefinitionKt.indexKey(beanDefinition35.getPrimaryType(), null, rootScopeQualifier23);
            FactoryInstanceFactory factoryInstanceFactory23 = new FactoryInstanceFactory(beanDefinition35);
            Module.saveMapping$default(module, strIndexKey35, factoryInstanceFactory23, false, 4, null);
            new Pair(module, factoryInstanceFactory23);
            c0 c0Var = c0.a;
            StringQualifier rootScopeQualifier24 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition36 = new BeanDefinition(rootScopeQualifier24, Reflection.getOrCreateKotlinClass(AppNotificationApi.class), null, c0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey36 = BeanDefinitionKt.indexKey(beanDefinition36.getPrimaryType(), null, rootScopeQualifier24);
            FactoryInstanceFactory factoryInstanceFactory24 = new FactoryInstanceFactory(beanDefinition36);
            Module.saveMapping$default(module, strIndexKey36, factoryInstanceFactory24, false, 4, null);
            new Pair(module, factoryInstanceFactory24);
            d0 d0Var = d0.a;
            StringQualifier rootScopeQualifier25 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition37 = new BeanDefinition(rootScopeQualifier25, Reflection.getOrCreateKotlinClass(AvatarManagerApi.class), null, d0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey37 = BeanDefinitionKt.indexKey(beanDefinition37.getPrimaryType(), null, rootScopeQualifier25);
            FactoryInstanceFactory factoryInstanceFactory25 = new FactoryInstanceFactory(beanDefinition37);
            Module.saveMapping$default(module, strIndexKey37, factoryInstanceFactory25, false, 4, null);
            new Pair(module, factoryInstanceFactory25);
            e0 e0Var = e0.a;
            StringQualifier rootScopeQualifier26 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition38 = new BeanDefinition(rootScopeQualifier26, Reflection.getOrCreateKotlinClass(GoalFunctionsApi.class), null, e0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey38 = BeanDefinitionKt.indexKey(beanDefinition38.getPrimaryType(), null, rootScopeQualifier26);
            FactoryInstanceFactory factoryInstanceFactory26 = new FactoryInstanceFactory(beanDefinition38);
            Module.saveMapping$default(module, strIndexKey38, factoryInstanceFactory26, false, 4, null);
            new Pair(module, factoryInstanceFactory26);
            f0 f0Var = f0.a;
            StringQualifier rootScopeQualifier27 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition39 = new BeanDefinition(rootScopeQualifier27, Reflection.getOrCreateKotlinClass(SensorHub.class), null, f0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey39 = BeanDefinitionKt.indexKey(beanDefinition39.getPrimaryType(), null, rootScopeQualifier27);
            FactoryInstanceFactory factoryInstanceFactory27 = new FactoryInstanceFactory(beanDefinition39);
            Module.saveMapping$default(module, strIndexKey39, factoryInstanceFactory27, false, 4, null);
            new Pair(module, factoryInstanceFactory27);
            h0 h0Var = h0.a;
            StringQualifier rootScopeQualifier28 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition40 = new BeanDefinition(rootScopeQualifier28, Reflection.getOrCreateKotlinClass(HealthDataApi.class), null, h0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey40 = BeanDefinitionKt.indexKey(beanDefinition40.getPrimaryType(), null, rootScopeQualifier28);
            FactoryInstanceFactory factoryInstanceFactory28 = new FactoryInstanceFactory(beanDefinition40);
            Module.saveMapping$default(module, strIndexKey40, factoryInstanceFactory28, false, 4, null);
            new Pair(module, factoryInstanceFactory28);
            i0 i0Var = i0.a;
            StringQualifier rootScopeQualifier29 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition41 = new BeanDefinition(rootScopeQualifier29, Reflection.getOrCreateKotlinClass(DeviceTokenApi.class), null, i0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey41 = BeanDefinitionKt.indexKey(beanDefinition41.getPrimaryType(), null, rootScopeQualifier29);
            FactoryInstanceFactory factoryInstanceFactory29 = new FactoryInstanceFactory(beanDefinition41);
            Module.saveMapping$default(module, strIndexKey41, factoryInstanceFactory29, false, 4, null);
            new Pair(module, factoryInstanceFactory29);
            j0 j0Var = j0.a;
            StringQualifier rootScopeQualifier30 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition42 = new BeanDefinition(rootScopeQualifier30, Reflection.getOrCreateKotlinClass(FaqWebApi.class), null, j0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey42 = BeanDefinitionKt.indexKey(beanDefinition42.getPrimaryType(), null, rootScopeQualifier30);
            FactoryInstanceFactory factoryInstanceFactory30 = new FactoryInstanceFactory(beanDefinition42);
            Module.saveMapping$default(module, strIndexKey42, factoryInstanceFactory30, false, 4, null);
            new Pair(module, factoryInstanceFactory30);
            k0 k0Var = k0.a;
            StringQualifier rootScopeQualifier31 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition43 = new BeanDefinition(rootScopeQualifier31, Reflection.getOrCreateKotlinClass(ConcoAnalyticsApi.class), null, k0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey43 = BeanDefinitionKt.indexKey(beanDefinition43.getPrimaryType(), null, rootScopeQualifier31);
            FactoryInstanceFactory factoryInstanceFactory31 = new FactoryInstanceFactory(beanDefinition43);
            Module.saveMapping$default(module, strIndexKey43, factoryInstanceFactory31, false, 4, null);
            new Pair(module, factoryInstanceFactory31);
            l0 l0Var = l0.a;
            BeanDefinition beanDefinition44 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ToolUtilApi.class), null, l0Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey44 = BeanDefinitionKt.indexKey(beanDefinition44.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory13 = new SingleInstanceFactory<>(beanDefinition44);
            Module.saveMapping$default(module, strIndexKey44, singleInstanceFactory13, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory13);
            }
            new Pair(module, singleInstanceFactory13);
            m0 m0Var = m0.a;
            BeanDefinition beanDefinition45 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppStateApi.class), null, m0Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey45 = BeanDefinitionKt.indexKey(beanDefinition45.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory14 = new SingleInstanceFactory<>(beanDefinition45);
            Module.saveMapping$default(module, strIndexKey45, singleInstanceFactory14, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory14);
            }
            new Pair(module, singleInstanceFactory14);
            n0 n0Var = n0.a;
            StringQualifier rootScopeQualifier32 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition46 = new BeanDefinition(rootScopeQualifier32, Reflection.getOrCreateKotlinClass(SensorHubControllerApi.class), null, n0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey46 = BeanDefinitionKt.indexKey(beanDefinition46.getPrimaryType(), null, rootScopeQualifier32);
            FactoryInstanceFactory factoryInstanceFactory32 = new FactoryInstanceFactory(beanDefinition46);
            Module.saveMapping$default(module, strIndexKey46, factoryInstanceFactory32, false, 4, null);
            new Pair(module, factoryInstanceFactory32);
            o0 o0Var = o0.a;
            StringQualifier rootScopeQualifier33 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition47 = new BeanDefinition(rootScopeQualifier33, Reflection.getOrCreateKotlinClass(AtrialManagerApi.class), null, o0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey47 = BeanDefinitionKt.indexKey(beanDefinition47.getPrimaryType(), null, rootScopeQualifier33);
            FactoryInstanceFactory factoryInstanceFactory33 = new FactoryInstanceFactory(beanDefinition47);
            Module.saveMapping$default(module, strIndexKey47, factoryInstanceFactory33, false, 4, null);
            new Pair(module, factoryInstanceFactory33);
            p0 p0Var = p0.a;
            StringQualifier rootScopeQualifier34 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition48 = new BeanDefinition(rootScopeQualifier34, Reflection.getOrCreateKotlinClass(UserInfoProvider.class), null, p0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey48 = BeanDefinitionKt.indexKey(beanDefinition48.getPrimaryType(), null, rootScopeQualifier34);
            FactoryInstanceFactory factoryInstanceFactory34 = new FactoryInstanceFactory(beanDefinition48);
            Module.saveMapping$default(module, strIndexKey48, factoryInstanceFactory34, false, 4, null);
            new Pair(module, factoryInstanceFactory34);
            q0 q0Var = q0.a;
            BeanDefinition beanDefinition49 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IDialConfig.class), null, q0Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey49 = BeanDefinitionKt.indexKey(beanDefinition49.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory15 = new SingleInstanceFactory<>(beanDefinition49);
            Module.saveMapping$default(module, strIndexKey49, singleInstanceFactory15, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory15);
            }
            new Pair(module, singleInstanceFactory15);
            s0 s0Var = s0.a;
            StringQualifier rootScopeQualifier35 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition50 = new BeanDefinition(rootScopeQualifier35, Reflection.getOrCreateKotlinClass(SportTypeDescApi.class), null, s0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey50 = BeanDefinitionKt.indexKey(beanDefinition50.getPrimaryType(), null, rootScopeQualifier35);
            FactoryInstanceFactory factoryInstanceFactory35 = new FactoryInstanceFactory(beanDefinition50);
            Module.saveMapping$default(module, strIndexKey50, factoryInstanceFactory35, false, 4, null);
            new Pair(module, factoryInstanceFactory35);
            t0 t0Var = t0.a;
            StringQualifier rootScopeQualifier36 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition51 = new BeanDefinition(rootScopeQualifier36, Reflection.getOrCreateKotlinClass(PBSyncApi.class), null, t0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey51 = BeanDefinitionKt.indexKey(beanDefinition51.getPrimaryType(), null, rootScopeQualifier36);
            FactoryInstanceFactory factoryInstanceFactory36 = new FactoryInstanceFactory(beanDefinition51);
            Module.saveMapping$default(module, strIndexKey51, factoryInstanceFactory36, false, 4, null);
            new Pair(module, factoryInstanceFactory36);
            u0 u0Var = u0.a;
            StringQualifier rootScopeQualifier37 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition52 = new BeanDefinition(rootScopeQualifier37, Reflection.getOrCreateKotlinClass(IContentProvider.class), null, u0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey52 = BeanDefinitionKt.indexKey(beanDefinition52.getPrimaryType(), null, rootScopeQualifier37);
            FactoryInstanceFactory factoryInstanceFactory37 = new FactoryInstanceFactory(beanDefinition52);
            Module.saveMapping$default(module, strIndexKey52, factoryInstanceFactory37, false, 4, null);
            new Pair(module, factoryInstanceFactory37);
            v0 v0Var = v0.a;
            StringQualifier rootScopeQualifier38 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition53 = new BeanDefinition(rootScopeQualifier38, Reflection.getOrCreateKotlinClass(SyncEventApi.class), null, v0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey53 = BeanDefinitionKt.indexKey(beanDefinition53.getPrimaryType(), null, rootScopeQualifier38);
            FactoryInstanceFactory factoryInstanceFactory38 = new FactoryInstanceFactory(beanDefinition53);
            Module.saveMapping$default(module, strIndexKey53, factoryInstanceFactory38, false, 4, null);
            new Pair(module, factoryInstanceFactory38);
            module.scope(QualifierKt.named(KoinExtKt.SCOPE_WATCH_SETTINGS), w0.a);
            x0 x0Var = x0.a;
            StringQualifier rootScopeQualifier39 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition54 = new BeanDefinition(rootScopeQualifier39, Reflection.getOrCreateKotlinClass(SportEffectApi.class), null, x0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey54 = BeanDefinitionKt.indexKey(beanDefinition54.getPrimaryType(), null, rootScopeQualifier39);
            FactoryInstanceFactory factoryInstanceFactory39 = new FactoryInstanceFactory(beanDefinition54);
            Module.saveMapping$default(module, strIndexKey54, factoryInstanceFactory39, false, 4, null);
            new Pair(module, factoryInstanceFactory39);
            y0 y0Var = y0.a;
            StringQualifier rootScopeQualifier40 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition55 = new BeanDefinition(rootScopeQualifier40, Reflection.getOrCreateKotlinClass(EarbudClashResolve.class), null, y0Var, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey55 = BeanDefinitionKt.indexKey(beanDefinition55.getPrimaryType(), null, rootScopeQualifier40);
            FactoryInstanceFactory factoryInstanceFactory40 = new FactoryInstanceFactory(beanDefinition55);
            Module.saveMapping$default(module, strIndexKey55, factoryInstanceFactory40, false, 4, null);
            new Pair(module, factoryInstanceFactory40);
            z0 z0Var = z0.a;
            BeanDefinition beanDefinition56 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SupportNameApi.class), null, z0Var, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey56 = BeanDefinitionKt.indexKey(beanDefinition56.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory16 = new SingleInstanceFactory<>(beanDefinition56);
            Module.saveMapping$default(module, strIndexKey56, singleInstanceFactory16, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory16);
            }
            new Pair(module, singleInstanceFactory16);
            AnonymousClass58 anonymousClass58 = new Function2<Scope, ParametersHolder, ISwitchDeviceCallback>() { // from class: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$modules$1.58

                /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$modules$1$58$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/hm/health/devicex/manage/koin/DeviceManageModules$modules$1$58$1", "Lcom/xiaomi/hm/health/device/bind/enable/ISwitchDeviceCallback;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onEnableStart", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass1 implements ISwitchDeviceCallback {
                    public final /* synthetic */ Scope a;

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$modules$1$58$1$a */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<ParametersHolder> {
                        public final /* synthetic */ HMBaseDevice a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(HMBaseDevice hMBaseDevice) {
                            super(0);
                            this.a = hMBaseDevice;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final ParametersHolder getA() {
                            return ParametersHolderKt.parametersOf(this.a);
                        }
                    }

                    public AnonymousClass1(Scope scope) {
                        this.a = scope;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void b(DialogInterface dialogInterface, int i) {
                    }

                    @Override // com.xiaomi.hm.health.device.bind.enable.ISwitchDeviceCallback
                    public void onEnableStart(@NotNull AppCompatActivity activity, @NotNull HMBaseDevice device) {
                        String alert = ((SwitchDeviceAlertUseCase) this.a.get(Reflection.getOrCreateKotlinClass(SwitchDeviceAlertUseCase.class), null, new a(device))).getAlert();
                        if (alert == null) {
                            return;
                        }
                        new AlertDialogFragment.Builder(activity).setMessage(alert).setNeutralButton(R.string.confirm, i81.a).create().show(activity.getSupportFragmentManager());
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISwitchDeviceCallback invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new AnonymousClass1(scope);
                }
            };
            BeanDefinition beanDefinition57 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISwitchDeviceCallback.class), null, anonymousClass58, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey57 = BeanDefinitionKt.indexKey(beanDefinition57.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory17 = new SingleInstanceFactory<>(beanDefinition57);
            Module.saveMapping$default(module, strIndexKey57, singleInstanceFactory17, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory17);
            }
            new Pair(module, singleInstanceFactory17);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Module alertSettingsModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Module[] phoneCallReplyModules;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Module appSortModule;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Module deviceDialModule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Module dataModule;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Module[] deviceSettingModules;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0893a extends Lambda implements Function2<Scope, ParametersHolder, DeviceCenter> {
            public static final C0893a a = new C0893a();

            public C0893a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceCenter invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceCenterImp();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, AlertItemFactory> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AlertItemFactory invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AmazfitAlertItemFactory((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/settings/alert/factory/AmazfitAlertConfigProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, AmazfitAlertConfigProvider> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AmazfitAlertConfigProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AmazfitAlertConfigProviderImp();
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0893a c0893a = C0893a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceCenter.class), null, c0893a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AlertItemFactory.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AmazfitAlertConfigProvider.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortConditionProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, AppSortConditionProvider> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppSortConditionProvider invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceAppSortConditionProvider((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/setting/appsort/AppSortViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0894b extends Lambda implements Function2<Scope, ParametersHolder, AppSortViewModel> {
            public static final C0894b a = new C0894b();

            public C0894b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AppSortViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AppSortViewModel((DeviceCenter) scope.get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), null, null));
            }
        }

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AppSortConditionProvider.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0894b c0894b = C0894b.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(AppSortViewModel.class), null, c0894b, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/database/DeviceDataDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0895a extends Lambda implements Function2<Scope, ParametersHolder, DeviceDataDb> {
                public static final C0895a a = new C0895a();

                public C0895a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DeviceDataDb invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return DeviceDataDb.INSTANCE.init(ModuleExtKt.androidContext(scope));
                }
            }

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0895a c0895a = C0895a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceDataDb.class), null, c0895a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            module.scope(QualifierKt.named(MiFitScopeNames.DEVICE_DATA), a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Module, Unit> {
        public static final d a = new d();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, DialFetchApi> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DialFetchApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((Boolean) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Boolean.class))).booleanValue() ? new ShowCurrentDialImpl() : new UnusedDialImpl();
            }
        }

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DialFetchApi.class), null, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Module, Unit> {
        public static final e a = new e();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, PhoneCallSmsReplyFeature> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PhoneCallSmsReplyFeature invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new IncomingCallReplyFeatureImp();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phone_call/sms/PhoneCallReplyAnalytics;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, PhoneCallReplyAnalytics> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PhoneCallReplyAnalytics invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PhoneCallReplyAnalyticsImp();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phone_call/sms/DeviceCenter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, com.huami.phone_call.sms.DeviceCenter> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.huami.phone_call.sms.DeviceCenter invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PhoneCallReplyDeviceCenter((DeviceManagerApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/phone_call/sms/DeviceStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, DeviceStatus> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceStatus invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PhoneCallReplyDeviceStatus();
            }
        }

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PhoneCallSmsReplyFeature.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(PhoneCallReplyAnalytics.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(com.huami.phone_call.sms.DeviceCenter.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceStatus.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, a.a, 1, null);
        alertSettingsModule = moduleModule$default;
        phoneCallReplyModules = new Module[]{ModuleKt.module$default(false, e.a, 1, null), com.huami.phone_call.sms.koin.ModuleKt.getPhoneCallSmsViewModelModule()};
        Module moduleModule$default2 = ModuleKt.module$default(false, b.a, 1, null);
        appSortModule = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, d.a, 1, null);
        deviceDialModule = moduleModule$default3;
        Module moduleModule$default4 = ModuleKt.module$default(false, c.a, 1, null);
        dataModule = moduleModule$default4;
        deviceSettingModules = new Module[]{moduleModule$default, moduleModule$default2, moduleModule$default3, moduleModule$default4};
    }

    private DeviceManageModules() {
    }

    public final void closeDeviceDataScope() {
        ScopesKt.deviceDataScope(KoinJavaComponent.getKoin()).close();
    }

    public final void closeWatchSettingsScope() {
        KoinExtKt.getWatchSettingsScope().close();
    }

    @NotNull
    public final ArrayList<Module> getModules() {
        ArrayList<Module> arrayList = new ArrayList<>();
        arrayList.add(modules);
        h.addAll(arrayList, deviceSettingModules);
        h.addAll(arrayList, phoneCallReplyModules);
        return arrayList;
    }

    public final synchronized void reloadModules() {
        DefaultContextExtKt.unloadKoinModules(getModules());
        DefaultContextExtKt.loadKoinModules(getModules());
    }
}
