package com.xiaomi.hm.health.nfc;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.service.AccountService;
import com.huami.bodymeasurements.temperature.model.koin.TemperatureModuleKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.eid.ui.di.ModuleKt;
import com.huami.feature.config.FeatureSwitch;
import com.huami.feedback.api.FeedbackConfig;
import com.huami.feedback.inject.FileProviderAuth;
import com.huami.feedback.sync.api.device.DeviceLogSyncApi;
import com.huami.feedback.sync.api.device.DevicesDataSource;
import com.huami.flutter.appletcompanionplugin.AppletPluginServiceKt;
import com.huami.jac.repo.config.JacConfig;
import com.huami.jac.repo.di.JacModuleKt;
import com.huami.jac.ui.amazfit.di.JacUiModuleKt;
import com.huami.moving.service.SportServiceImplKt;
import com.huami.moving.sport.ui.common.HrZoneShowRuleConfig;
import com.huami.moving.sport.ui.koin.MovingUIModuleKt;
import com.huami.moving.sport.ui.usecase.GetDeviceNameUserCase;
import com.huami.moving.sport.ui.usecase.GetHrZoneShowRuleUseCase;
import com.huami.moving.sport.ui.usecase.SportDeviceSourceConverter;
import com.huami.moving.sport.ui.webapi.WebProvider;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.nfc.applet.di.KoinKt;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.koin.PhnDeviceNameDelegate;
import com.huami.respiratoryrate.bluetooth.koin.RespRateBleModuleKt;
import com.huami.respiratoryrate.core.koin.RespRateModuleKt;
import com.huami.third.wechat.api.DataSourceApi;
import com.huami.third.wechat.impl.ZEPPDataSourceApiImpl;
import com.huami.third.wechat.ui.WeChatParams;
import com.huami.third.wechat.ui.bind.bind.IDeviceHelper;
import com.huami.third.wechat.ui.entry.WeChatEntryViewModel;
import com.huami.tools.log.HMLog;
import com.huami.training.di.koin.ModulesKt;
import com.huami.wallet.accessdoor.koinmodule.DoorModulesKt;
import com.huami.wallet.ui.di.module.KoinModuleKt;
import com.huami.watch.companion.BuildConfig;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watchfacesstore.di.MoudlesKt;
import com.huami.web.service.WebViewService;
import com.huami.xiaopeng.repo.config.XpConfig;
import com.huami.xiaopeng.repo.di.XiaopengModuleKt;
import com.huami.xiaopeng.ui.amazfit.di.XpUiModuleKt;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.atrialfibrillation.AfPpgExternalModuleKt;
import com.xiaomi.hm.health.bodyfat.koin.BodyFatModuleKt;
import com.xiaomi.hm.health.bodyfat.module.ScaleModulesKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.manage.koin.DeviceManageMainModules;
import com.xiaomi.hm.health.device.settings.todo.TodoModuleKt;
import com.xiaomi.hm.health.device.webapi.WebApiDelegate;
import com.xiaomi.hm.health.device.webapi.WebApiModuleKt;
import com.xiaomi.hm.health.devicex.manage.koin.DeviceManageModules;
import com.xiaomi.hm.health.di.koin.module.AccountTokenModuleKt;
import com.xiaomi.hm.health.di.koin.module.BloodPressureModuleKt;
import com.xiaomi.hm.health.di.koin.module.CashierModuleKt;
import com.xiaomi.hm.health.di.koin.module.DoorModuleKt;
import com.xiaomi.hm.health.di.koin.module.FhExternalModuleKt;
import com.xiaomi.hm.health.di.koin.module.HuamipayModuleKt;
import com.xiaomi.hm.health.di.koin.module.MemberCardExtModuleKt;
import com.xiaomi.hm.health.di.koin.module.MessageModuleKt;
import com.xiaomi.hm.health.di.koin.module.PaiModulesKt;
import com.xiaomi.hm.health.di.koin.module.RelationModuleKt;
import com.xiaomi.hm.health.di.koin.module.SlsPassistantModuleKt;
import com.xiaomi.hm.health.di.koin.module.SportEndPageModuleKt;
import com.xiaomi.hm.health.di.koin.module.TrainingModuleKt;
import com.xiaomi.hm.health.di.koin.module.UserModuleKt;
import com.xiaomi.hm.health.di.koin.module.WalletModuleKt;
import com.xiaomi.hm.health.di.koin.module.WebActivityModuleKt;
import com.xiaomi.hm.health.di.koin.module.WorldClockExtMoudleKt;
import com.xiaomi.hm.health.di.koin.spo2.Spo2ModuleKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.feedback.DeviceDataSourceImpl;
import com.xiaomi.hm.health.feedback.DeviceLogSyncApiImpl;
import com.xiaomi.hm.health.feedback.FeedbackConfigImpl;
import com.xiaomi.hm.health.feedback.FileProviderAuthImpl;
import com.xiaomi.hm.health.firstbeat.SportStateServiceModulesKt;
import com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt;
import com.xiaomi.hm.health.heartrate.HeartRateModulesKt;
import com.xiaomi.hm.health.homepage.koin.HomePageModulesKt;
import com.xiaomi.hm.health.homepage.status.healthlabel.HealthLabelModulesKt;
import com.xiaomi.hm.health.jscompanion.AppletCompanionModuleKt;
import com.xiaomi.hm.health.lightappstore.LightAppStoreModuleKt;
import com.xiaomi.hm.health.mine.MineViewModelKt;
import com.xiaomi.hm.health.nfc.KoinHelperKt;
import com.xiaomi.hm.health.nfc.jac.JacUtils;
import com.xiaomi.hm.health.nfc.xiaopeng.XiaoPengUtils;
import com.xiaomi.hm.health.nps.NpsModuleKt;
import com.xiaomi.hm.health.play.di.PlayKoinModuleKt;
import com.xiaomi.hm.health.restheart.RestHeartKoinKt;
import com.xiaomi.hm.health.running.calori.CalorieModuleKt;
import com.xiaomi.hm.health.sky.SkyModulesKt;
import com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt;
import com.xiaomi.hm.health.speech.speech.koin.alexa.AlexaKoinModulesKt;
import com.xiaomi.hm.health.step.ActivityStageModulesKt;
import com.xiaomi.hm.health.step.StepModulesKt;
import com.xiaomi.hm.health.stress.koin.StressModulesKt;
import com.xiaomi.hm.health.temperature.api.TempExternalApiImpl;
import com.xiaomi.hm.health.thirdbind.wechat.DeviceHelperImpl;
import com.xiaomi.hm.health.thirdbind.wechat.WeChatParamsImpl;
import com.xiaomi.hm.health.ui.sportfitness.manager.SportDeviceManager;
import com.xiaomi.hm.health.utils.FeatureSwitchImpl;
import com.xiaomi.hm.health.watchfacestore.SetDialDefaultColor;
import com.xiaomi.hm.health.watchfacestore.WatchFaceStoreModuleKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.Koin;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0002\u001a\u0006\u0010\u0005\u001a\u00020\u0002\u001a\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u0006\u0010\b\u001a\u00020\u0002\"\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroid/content/Context;", MimeTypes.BASE_TYPE_APPLICATION, "", "startMiFitKoin", "initXiaoPengConfig", "initJacConfig", "onDeviceDestroy", "onUserDestroy", "reloadModulesOfNfc", "", "Lorg/koin/core/module/Module;", "a", "Ljava/util/List;", "huamipayModules", "b", "xpModules", "c", "jacCarModules", GoogleApiAvailabilityLight.a, "Lorg/koin/core/module/Module;", "feedbackModule", "e", "wechatModule", "f", "featureSwitchModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class KoinHelperKt {

    @NotNull
    private static final List<Module> a;

    @NotNull
    private static final List<Module> b;

    @NotNull
    private static final List<Module> c;

    @NotNull
    private static final Module d;

    @NotNull
    private static final Module e;

    @NotNull
    private static final Module f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.nfc.KoinHelperKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feature/config/FeatureSwitch;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0978a extends Lambda implements Function2<Scope, ParametersHolder, FeatureSwitch> {
            public static final C0978a a = new C0978a();

            public C0978a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FeatureSwitch invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FeatureSwitchImpl();
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
            C0978a c0978a = C0978a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, c0978a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/sync/api/device/DeviceLogSyncApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, DeviceLogSyncApi> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceLogSyncApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceLogSyncApiImpl(ModuleExtKt.androidContext(scope));
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.nfc.KoinHelperKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0979b extends Lambda implements Function2<Scope, ParametersHolder, DevicesDataSource> {
            public static final C0979b a = new C0979b();

            public C0979b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DevicesDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceDataSourceImpl(ModuleExtKt.androidContext(scope), (DeviceLogSyncApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceLogSyncApi.class), null, null), (DeviceManagerApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, null), null, 8, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/inject/FileProviderAuth;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, FileProviderAuth> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FileProviderAuth invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FileProviderAuthImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/feedback/api/FeedbackConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, FeedbackConfig> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FeedbackConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FeedbackConfigImpl();
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
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceLogSyncApi.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            C0979b c0979b = C0979b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(DevicesDataSource.class), null, c0979b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(FileProviderAuth.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            d dVar = d.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(FeedbackConfig.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/content/Context;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Context> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Context getA() {
            return BraceletApp.getContext();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HMServerDef.getHost();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "url", "Landroid/os/Bundle;", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function3<Context, String, Bundle, Unit> {
        public static final e a = new e();

        public e() {
            super(3);
        }

        public final void a(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
            WebHelper.launch(str);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Context context, String str, Bundle bundle) {
            a(context, str, bundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Boolean> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return HMLoginManager.isExistingUser();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Boolean> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return HMDeviceManager.getInstance().isConnected(HMDeviceManager.getInstance().getMajorDeviceType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Boolean> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return JacUtils.INSTANCE.isSupportJac();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Boolean> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
            return majorDeviceType == HMDeviceType.WATCH || majorDeviceType == HMDeviceType.MILI;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/content/Context;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<Context> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Context getA() {
            return BraceletApp.getContext();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HMServerDef.getHost();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"Landroid/content/Context;", "<anonymous parameter 0>", "", "url", "Landroid/os/Bundle;", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function3<Context, String, Bundle, Unit> {
        public static final m a = new m();

        public m() {
            super(3);
        }

        public final void a(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle) {
            WebHelper.launch(str);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Context context, String str, Bundle bundle) {
            a(context, str, bundle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<Boolean> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<Boolean> {
        public static final o a = new o();

        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return HMLoginManager.isOldUser();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<Boolean> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return HMDeviceManager.getInstance().isConnected(HMDeviceManager.getInstance().getMajorDeviceType());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<Boolean> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return XiaoPengUtils.INSTANCE.isSupportXiaoPeng(BraceletApp.getContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<Boolean> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            HMDeviceType majorDeviceType = HMDeviceManager.getInstance().getMajorDeviceType();
            return majorDeviceType == HMDeviceType.WATCH || majorDeviceType == HMDeviceType.MILI;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "------------onDeviceDestroy-------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<Unit> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            KoinHelperKt.reloadModulesOfNfc();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "------------onUserDestroy-------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<Unit> {
        public static final v a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            KoinHelperKt.reloadModulesOfNfc();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HMLoginManager.getHuamiId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String huamiId = HMLoginManager.getHuamiId();
            return huamiId == null ? "" : huamiId;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final y a = new y();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bodymeasurements/temperature/model/koin/api/TempExternalApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, TempExternalApi> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TempExternalApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TempExternalApiImpl();
            }
        }

        public y() {
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
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(TempExternalApi.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function1<Module, Unit> {
        public static final z a = new z();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/third/wechat/ui/WeChatParams;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, WeChatParams> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeChatParams invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeChatParamsImpl(ModuleExtKt.androidContext(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/third/wechat/ui/bind/bind/IDeviceHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, IDeviceHelper> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IDeviceHelper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceHelperImpl((DeviceManagerApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/third/wechat/api/DataSourceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, DataSourceApi> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DataSourceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ZEPPDataSourceApiImpl(BuildConfig.WX_NAME, CompanionApplication.get().getBrandNameService().getPrimaryDeviceBrand().getDesc());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/third/wechat/ui/entry/WeChatEntryViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, WeChatEntryViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeChatEntryViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeChatEntryViewModel((DataSourceApi) scope.get(Reflection.getOrCreateKotlinClass(DataSourceApi.class), null, null), (IDeviceHelper) scope.get(Reflection.getOrCreateKotlinClass(IDeviceHelper.class), null, null), (AccountService) scope.get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null), (WebViewService) scope.get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null));
            }
        }

        public z() {
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
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(WeChatParams.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(IDeviceHelper.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(DataSourceApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            d dVar = d.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(WeChatEntryViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
        }
    }

    static {
        List<Module> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(KoinKt.getAppletModule(), HuamipayModuleKt.nfcChannelModule);
        listMutableListOf.add(com.huami.nfc.door.di.KoinKt.getDoorModule());
        listMutableListOf.add(com.huami.nfc.web.koin.KoinKt.getWebModule());
        listMutableListOf.add(com.huami.nfc.bus.koin.KoinKt.getBusModule());
        listMutableListOf.add(HuamipayModuleKt.huamipayDeps);
        listMutableListOf.add(com.huami.wallet.common.koin.KoinKt.getCommonModule());
        listMutableListOf.addAll(ModuleKt.getEidModules());
        listMutableListOf.add(com.huami.nfc.car.di.KoinKt.getCarModule());
        a = listMutableListOf;
        List<Module> listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(XpUiModuleKt.getXpUiModule());
        listMutableListOf2.addAll(XiaopengModuleKt.getXiaopengModules());
        b = listMutableListOf2;
        List<Module> listMutableListOf3 = CollectionsKt__CollectionsKt.mutableListOf(JacUiModuleKt.getJacUiModule());
        listMutableListOf3.addAll(JacModuleKt.getJacModules());
        c = listMutableListOf3;
        d = org.koin.dsl.ModuleKt.module$default(false, b.a, 1, null);
        e = org.koin.dsl.ModuleKt.module$default(false, z.a, 1, null);
        f = org.koin.dsl.ModuleKt.module$default(false, a.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(int i2) {
        return HMDeviceUtils.getDeviceDescription(BraceletApp.getContext(), HMDeviceSource.fromValue(i2), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g() {
        return HMServerDef.getHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer h(int i2) {
        return Integer.valueOf(SportDeviceManager.convertSportSource2DeviceValue(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HrZoneShowRuleConfig i() {
        return SportDeviceManager.getInstance(BraceletApp.getContext()).getHrZoneRuleConfigByActiveDevice();
    }

    public static final void initJacConfig() {
        JacConfig jacConfig = JacConfig.INSTANCE;
        jacConfig.setApplication(c.a);
        jacConfig.setHost(d.a);
        jacConfig.setGoToWeb(e.a);
        jacConfig.setShowErrorDetail(f.a);
        jacConfig.setLogin(g.a);
        jacConfig.setBtConnected(h.a);
        jacConfig.setDeviceSupport(i.a);
        jacConfig.setHasBondingDevice(j.a);
    }

    public static final void initXiaoPengConfig() {
        XpConfig xpConfig = XpConfig.INSTANCE;
        xpConfig.setApplication(k.a);
        xpConfig.setHost(l.a);
        xpConfig.setGoToWeb(m.a);
        xpConfig.setShowErrorDetail(n.a);
        xpConfig.setLogin(o.a);
        xpConfig.setBtConnected(p.a);
        xpConfig.setDeviceSupport(q.a);
        xpConfig.setHasBondingDevice(r.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(HMDeviceSource hMDeviceSource) {
        return HMDeviceUtils.getDeviceDescription(BraceletApp.getContext(), hMDeviceSource, (String) null);
    }

    public static final void onDeviceDestroy() {
        HMLog.info("onDeviceDestroy", s.a);
        WalletModuleKt.walletDeviceScopeDestroy();
        HuamipayModuleKt.huamipayNFCChannelScopeDestroy();
        DoorModuleKt.doorDeviceScopeDestroy();
        ThreadsKt.thread((21 & 1) != 0, (21 & 2) != 0 ? false : false, (21 & 4) != 0 ? null : null, (21 & 8) != 0 ? null : null, (21 & 16) != 0 ? -1 : 0, t.a);
    }

    public static final void onUserDestroy() {
        HMLog.info("onUserDestroy", u.a);
        WalletModuleKt.walletDeviceScopeDestroy();
        WalletModuleKt.walletUserScopeDestroy();
        HuamipayModuleKt.huamipayNFCChannelScopeDestroy();
        DoorModuleKt.doorDeviceScopeDestroy();
        TodoModuleKt.destroyTodoUserScope();
        PHNProjectModuleKt.destroyPHNUserScope();
        ThreadsKt.thread((21 & 1) != 0, (21 & 2) != 0 ? false : false, (21 & 4) != 0 ? null : null, (21 & 8) != 0 ? null : null, (21 & 16) != 0 ? -1 : 0, v.a);
        DeviceManageModules.INSTANCE.closeWatchSettingsScope();
    }

    public static final synchronized void reloadModulesOfNfc() {
        GlobalContext globalContext = GlobalContext.INSTANCE;
        Koin koin = globalContext.get();
        List<Module> list = a;
        koin.unloadModules(list);
        globalContext.get().unloadModules(kotlin.collections.e.listOf(KoinModuleKt.getWalletRepoModule()));
        globalContext.get().unloadModules(kotlin.collections.e.listOf(KoinModuleKt.getWalletViewModelModule()));
        globalContext.get().unloadModules(DoorModuleKt.getDoorWalletModules());
        globalContext.get().unloadModules(DoorModulesKt.getDoorModules());
        Koin koin2 = globalContext.get();
        List<Module> list2 = b;
        koin2.unloadModules(list2);
        globalContext.get().unloadModules(com.unionpay.di.ModuleKt.getWatchUnionpayModules());
        Koin koin3 = globalContext.get();
        List<Module> list3 = c;
        koin3.unloadModules(list3);
        Koin.loadModules$default(globalContext.get(), list, false, 2, null);
        Koin.loadModules$default(globalContext.get(), kotlin.collections.e.listOf(KoinModuleKt.getWalletRepoModule()), false, 2, null);
        Koin.loadModules$default(globalContext.get(), kotlin.collections.e.listOf(KoinModuleKt.getWalletViewModelModule()), false, 2, null);
        Koin.loadModules$default(globalContext.get(), DoorModuleKt.getDoorWalletModules(), false, 2, null);
        Koin.loadModules$default(globalContext.get(), DoorModulesKt.getDoorModules(), false, 2, null);
        Koin.loadModules$default(globalContext.get(), list2, false, 2, null);
        Koin.loadModules$default(globalContext.get(), com.unionpay.di.ModuleKt.getWatchUnionpayModules(), false, 2, null);
        Koin.loadModules$default(globalContext.get(), list3, false, 2, null);
    }

    public static final void startMiFitKoin(@NotNull Context context) {
        initXiaoPengConfig();
        initJacConfig();
        TodoModuleKt.setTodoUserId(w.a);
        PHNProjectModuleKt.setPhnUserId(x.a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(UserModuleKt.getUserModule());
        arrayList.add(SportEndPageModuleKt.sportEndPageModule);
        kotlin.collections.h.addAll(arrayList, ModulesKt.getTrainingInternalModules());
        arrayList.add(TrainingModuleKt.getTrainingExternalModule());
        arrayList.add(WalletModuleKt.getWalletAppModule());
        arrayList.addAll(a);
        arrayList.add(WalletModuleKt.getWalletUserDeviceModule());
        arrayList.add(KoinModuleKt.getWalletViewModelModule());
        arrayList.add(KoinModuleKt.getWalletRepoModule());
        arrayList.addAll(DoorModuleKt.getDoorWalletModules());
        arrayList.addAll(DoorModulesKt.getDoorModules());
        arrayList.addAll(b);
        arrayList.addAll(c);
        arrayList.addAll(com.unionpay.di.ModuleKt.getWatchUnionpayModules());
        kotlin.collections.h.addAll(arrayList, HealthDataModulesKt.getHealthDataModules());
        kotlin.collections.h.addAll(arrayList, com.huami.sleepassistant.lib.koin.ModulesKt.getSlsPassistantInternalModules());
        arrayList.add(SlsPassistantModuleKt.getSlsPassistantExternalModule());
        arrayList.add(NpsModuleKt.getNpsModule());
        kotlin.collections.h.addAll(arrayList, com.huami.femalehealth.uilib.koin.ModulesKt.getFhInternalModule());
        arrayList.add(FhExternalModuleKt.getFhExternalModule());
        kotlin.collections.h.addAll(arrayList, com.huami.message.di.koin.ModulesKt.getMessageInternalModules());
        arrayList.add(MessageModuleKt.getMessageExternalModule());
        arrayList.add(AccountTokenModuleKt.getDeviceTokenModule());
        arrayList.add(Spo2ModuleKt.getSpo2Module());
        arrayList.add(StressModulesKt.getStressModule());
        arrayList.add(ScaleModulesKt.getScaleModule());
        arrayList.add(WatchFaceStoreModuleKt.getWfDeviceModule());
        kotlin.collections.h.addAll(arrayList, MoudlesKt.getWatchFaceStoreModules());
        kotlin.collections.h.addAll(arrayList, SleepDataModuleKt.getSleepDataModules());
        arrayList.add(PaiModulesKt.getPaiExternalModule());
        arrayList.add(com.huami.nps.di.NpsModuleKt.getNpsModuleInterval());
        kotlin.collections.h.addAll(arrayList, com.huami.pai.koin.ModulesKt.getPaiInternalModules());
        arrayList.addAll(com.huami.worldclock.koin.ModulesKt.getWcInternalModule());
        arrayList.add(WorldClockExtMoudleKt.getWcExternalModule());
        arrayList.add(MemberCardExtModuleKt.getMemberCardExternalModule());
        kotlin.collections.h.addAll(arrayList, com.huami.snore.ui.koin.MoudlesKt.getSnoreModules());
        arrayList.add(WebActivityModuleKt.getWebModule());
        arrayList.add(RelationModuleKt.getRelationModule());
        arrayList.add(HealthLabelModulesKt.getHealthLabelExternalModule());
        kotlin.collections.h.addAll(arrayList, com.huami.healthlabel.koin.ModulesKt.getHealthLabelInternalModules());
        arrayList.addAll(DeviceManageModules.INSTANCE.getModules());
        arrayList.add(DeviceManageMainModules.INSTANCE.getModules());
        kotlin.collections.h.addAll(arrayList, StepModulesKt.getStepModuleArray());
        arrayList.add(d);
        arrayList.add(AlexaKoinModulesKt.getAlexaLanguageModule());
        arrayList.add(AlexaKoinModulesKt.getSpeechComoImplModule());
        arrayList.add(BodyFatModuleKt.getBodyFatModule());
        arrayList.add(PlayKoinModuleKt.getPlayModule());
        arrayList.add(HomePageModulesKt.getHomePageExternalModule());
        kotlin.collections.h.addAll(arrayList, com.huami.module.homepage.koin.ModulesKt.getHomePageInternalModules());
        arrayList.add(CashierModuleKt.getCashierModule());
        arrayList.add(MineViewModelKt.getMineModule());
        kotlin.collections.h.addAll(arrayList, HeartRateModulesKt.getHeartRateModules());
        arrayList.add(AfPpgExternalModuleKt.getAfPpgModule());
        arrayList.add(LightAppStoreModuleKt.getLightAppStoreModule());
        arrayList.add(CalorieModuleKt.getCalorieModule());
        arrayList.add(SportStateServiceModulesKt.getSportStateServiceModules());
        arrayList.add(SportServiceImplKt.getSportServiceModule());
        arrayList.add(f);
        arrayList.add(ActivityStageModulesKt.getStageModules());
        arrayList.add(AppletPluginServiceKt.getAppletPluginModule());
        arrayList.add(WebApiModuleKt.getWebApiModule(new WebApiDelegate() { // from class: com.xiaomi.hm.health.nfc.KoinHelperKt$startMiFitKoin$3$1
            @Override // com.xiaomi.hm.health.device.webapi.WebApiDelegate
            @NotNull
            public String host() {
                return HMServerDef.getHost();
            }

            @Override // com.xiaomi.hm.health.device.webapi.WebApiDelegate
            @NotNull
            public String userId() {
                return HMLoginManager.getHuamiId();
            }
        }));
        arrayList.add(MovingUIModuleKt.getMovingUIModule(new GetDeviceNameUserCase() { // from class: fl4
            @Override // com.huami.moving.sport.ui.usecase.GetDeviceNameUserCase
            public final String getBySource(int i2) {
                return KoinHelperKt.f(i2);
            }
        }, new WebProvider() { // from class: il4
            @Override // com.huami.moving.sport.ui.webapi.WebProvider
            public final String host() {
                return KoinHelperKt.g();
            }
        }, new SportDeviceSourceConverter() { // from class: hl4
            @Override // com.huami.moving.sport.ui.usecase.SportDeviceSourceConverter
            public final Integer toDeviceSource(int i2) {
                return KoinHelperKt.h(i2);
            }
        }, new GetHrZoneShowRuleUseCase() { // from class: gl4
            @Override // com.huami.moving.sport.ui.usecase.GetHrZoneShowRuleUseCase
            public final HrZoneShowRuleConfig getHrZoneShowRuleConfig() {
                return KoinHelperKt.i();
            }
        }));
        arrayList.add(RespRateBleModuleKt.getRespRateBleModule());
        arrayList.add(RespRateModuleKt.getRespRateCoreModule());
        arrayList.add(com.xiaomi.hm.health.resprate.RespRateModuleKt.getRespRateZeppModule());
        arrayList.addAll(BloodPressureModuleKt.getBloodPressureModules());
        arrayList.add(SkyModulesKt.getSkyExternalModule());
        arrayList.addAll(BloodPressureModuleKt.getRawDataBPModules());
        arrayList.add(AppletCompanionModuleKt.getAppletCompanionModule());
        arrayList.add(RestHeartKoinKt.getRestHeartKoinModule());
        arrayList.add(e);
        arrayList.add(PHNProjectModuleKt.getPHNProjectModule(new PHNDeviceManager(), new PhnDeviceNameDelegate() { // from class: jl4
            @Override // com.huami.phn.coach.koin.PhnDeviceNameDelegate
            public final String nameForSource(HMDeviceSource hMDeviceSource) {
                return KoinHelperKt.j(hMDeviceSource);
            }
        }));
        arrayList.add(SetDialDefaultColor.INSTANCE.getDialDefaultColorModule());
        DefaultContextExtKt.loadKoinModules(arrayList);
        TemperatureModuleKt.loadTemperatureModule(y.a);
    }
}
