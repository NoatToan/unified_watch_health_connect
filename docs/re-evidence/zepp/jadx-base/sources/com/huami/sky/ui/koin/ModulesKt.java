package com.huami.sky.ui.koin;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.lib.repo.DeviceDataRepository;
import com.huami.sky.lib.repo.SkyPromotionRepo;
import com.huami.sky.lib.repo.SkyRepository;
import com.huami.sky.lib.repo.intro.IQuestionnaireRepo;
import com.huami.sky.lib.repo.reminder.ISleepReminderRepo;
import com.huami.sky.lib.repo.settings.IPlaySettingRepo;
import com.huami.sky.lib.repo.weekplan.IWeekPlanHintRepo;
import com.huami.sky.lib.repo.weekplan.IWeekPlanRepo;
import com.huami.sky.lib.room.MusicInfoDao;
import com.huami.sky.lib.usecase.GetMusicPreferenceInfoUseCase;
import com.huami.sky.lib.usecase.GetReminderDetailUseCase;
import com.huami.sky.lib.usecase.RecommendMusicUseCase;
import com.huami.sky.lib.usecase.SetReminderOpenUseCase;
import com.huami.sky.service.SkyNavigation;
import com.huami.sky.service.SkyNotificationService;
import com.huami.sky.service.SkyPromotionService;
import com.huami.sky.service.SkyService;
import com.huami.sky.service.SkySurveyService;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceViewModel;
import com.huami.sky.ui.navigation.SkyNavigationImpl;
import com.huami.sky.ui.play.SkyPlayContinuousManager;
import com.huami.sky.ui.play.SkyPlayRecordManager;
import com.huami.sky.ui.play.SkyPlayServiceHelper;
import com.huami.sky.ui.play.SkyPlayViewModel;
import com.huami.sky.ui.play.control.ExoPlayback;
import com.huami.sky.ui.play.control.IPlayback;
import com.huami.sky.ui.realtime.SkyMusicListViewModel;
import com.huami.sky.ui.realtime.SkyRealTimeViewModel;
import com.huami.sky.ui.realtime.recommendelement.RecommendElementViewModel;
import com.huami.sky.ui.realtime.recommendelement.RecommendServiceUsecase;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanDataSource;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel;
import com.huami.sky.ui.service.SkyNotificationServiceImpl;
import com.huami.sky.ui.service.SkyPromotionServiceImpl;
import com.huami.sky.ui.service.SkyServiceImpl;
import com.huami.sky.ui.service.SkySurveyServiceImpl;
import com.huami.sky.ui.setting.SkyPlaySettingViewModel;
import com.huami.sky.ui.setting.SkySettingViewModel;
import com.huami.sky.ui.sleepreminder.SkySleepReminderViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0012\"\u001c\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001c\u0010\u000b\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001c\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001c\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSkyServiceModule", "()Lorg/koin/core/module/Module;", "skyServiceModule", "b", "getSkyRealTimeModule", "skyRealTimeModule", "c", "getSkySleepReminderModule", "skySleepReminderModule", GoogleApiAvailabilityLight.a, "getSkyIntroModule", "skyIntroModule", "e", "getSkyPlaySettingModule", "skyPlaySettingModule", "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class ModulesKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, d.a, 1, null);

    @NotNull
    private static final Module b = ModuleKt.module$default(false, c.a, 1, null);

    @NotNull
    private static final Module c = ModuleKt.module$default(false, e.a, 1, null);

    @NotNull
    private static final Module d = ModuleKt.module$default(false, a.a, 1, null);

    @NotNull
    private static final Module e = ModuleKt.module$default(false, b.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.sky.ui.koin.ModulesKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "<name for destructuring parameter 0>", "Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0560a extends Lambda implements Function2<Scope, ParametersHolder, SkyMusicPreferenceViewModel> {
            public static final C0560a a = new C0560a();

            /* JADX INFO: renamed from: com.huami.sky.ui.koin.ModulesKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0561a extends Lambda implements Function0<ParametersHolder> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0561a(boolean z) {
                    super(0);
                    this.a = z;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ParametersHolder invoke() {
                    return ParametersHolderKt.parametersOf(Boolean.valueOf(this.a));
                }
            }

            public C0560a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyMusicPreferenceViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyMusicPreferenceViewModel((IQuestionnaireRepo) scope.get(Reflection.getOrCreateKotlinClass(IQuestionnaireRepo.class), null, new C0561a(((Boolean) parametersHolder.elementAt(0, Reflection.getOrCreateKotlinClass(Boolean.class))).booleanValue())));
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
            C0560a c0560a = C0560a.a;
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SkyMusicPreferenceViewModel.class), null, c0560a, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/setting/SkyPlaySettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, SkyPlaySettingViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyPlaySettingViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyPlaySettingViewModel((IPlaySettingRepo) scope.get(Reflection.getOrCreateKotlinClass(IPlaySettingRepo.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.koin.ModulesKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/setting/SkySettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0562b extends Lambda implements Function2<Scope, ParametersHolder, SkySettingViewModel> {
            public static final C0562b a = new C0562b();

            public C0562b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkySettingViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkySettingViewModel((GetMusicPreferenceInfoUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetMusicPreferenceInfoUseCase.class), null, null), (GetReminderDetailUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetReminderDetailUseCase.class), null, null), (SetReminderOpenUseCase) scope.get(Reflection.getOrCreateKotlinClass(SetReminderOpenUseCase.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SkyPlaySettingViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            C0562b c0562b = C0562b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SkySettingViewModel.class), null, c0562b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/realtime/SkyRealTimeViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, SkyRealTimeViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyRealTimeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyRealTimeViewModel((DeviceDataApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, null), (SkyRepository) scope.get(Reflection.getOrCreateKotlinClass(SkyRepository.class), null, null), (SkyPlayServiceHelper) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, null), (SkyPlayRecordManager) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayRecordManager.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendElementViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, RecommendElementViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RecommendElementViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RecommendElementViewModel((RecommendServiceUsecase) scope.get(Reflection.getOrCreateKotlinClass(RecommendServiceUsecase.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.koin.ModulesKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0563c extends Lambda implements Function2<Scope, ParametersHolder, WeekPlanProgressViewModel> {
            public static final C0563c a = new C0563c();

            public C0563c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeekPlanProgressViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeekPlanProgressViewModel((WeekPlanDataSource) scope.get(Reflection.getOrCreateKotlinClass(WeekPlanDataSource.class), null, null), (RecommendServiceUsecase) scope.get(Reflection.getOrCreateKotlinClass(RecommendServiceUsecase.class), null, null), (IWeekPlanHintRepo) scope.get(Reflection.getOrCreateKotlinClass(IWeekPlanHintRepo.class), null, null));
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
            a aVar = a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SkyRealTimeViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(RecommendElementViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            C0563c c0563c = C0563c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(WeekPlanProgressViewModel.class), null, c0563c, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Module, Unit> {
        public static final d a = new d();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/realtime/recommendelement/RecommendServiceUsecase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, RecommendServiceUsecase> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RecommendServiceUsecase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return RecommendServiceUsecase.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, WeekPlanDataSource> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeekPlanDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeekPlanDataSource((IWeekPlanRepo) scope.get(Reflection.getOrCreateKotlinClass(IWeekPlanRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/SkyService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SkyService> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyServiceImpl(ModuleExtKt.androidContext(scope));
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.koin.ModulesKt$d$d, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/play/control/IPlayback;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0564d extends Lambda implements Function2<Scope, ParametersHolder, IPlayback> {
            public static final C0564d a = new C0564d();

            public C0564d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IPlayback invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ExoPlayback(ModuleExtKt.androidContext(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/play/SkyPlayViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SkyPlayViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyPlayViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyPlayViewModel((DeviceDataApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, null), (ISkyDeviceStatusAssistant) scope.get(Reflection.getOrCreateKotlinClass(ISkyDeviceStatusAssistant.class), null, null), (SkyPlayServiceHelper) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, null), (SkyPromotionRepo) scope.get(Reflection.getOrCreateKotlinClass(SkyPromotionRepo.class), null, null), (WeekPlanDataSource) scope.get(Reflection.getOrCreateKotlinClass(WeekPlanDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/SkyNavigation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, SkyNavigation> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyNavigation invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyNavigationImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final g a = new g();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/play/SkyPlayServiceHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function2<Scope, ParametersHolder, SkyPlayServiceHelper> {
                public static final a a = new a();

                public a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SkyPlayServiceHelper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SkyPlayServiceHelper((DeviceDataRepository) scope.get(Reflection.getOrCreateKotlinClass(DeviceDataRepository.class), null, null), (IPlaySettingRepo) scope.get(Reflection.getOrCreateKotlinClass(IPlaySettingRepo.class), null, null), (RecommendMusicUseCase) scope.get(Reflection.getOrCreateKotlinClass(RecommendMusicUseCase.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/play/SkyPlayRecordManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, SkyPlayRecordManager> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SkyPlayRecordManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SkyPlayRecordManager((ISkyDeviceStatusAssistant) scope.get(Reflection.getOrCreateKotlinClass(ISkyDeviceStatusAssistant.class), null, null), (SkyPlayServiceHelper) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/play/SkyPlayContinuousManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SkyPlayContinuousManager> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SkyPlayContinuousManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SkyPlayContinuousManager((DeviceDataApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, null), (ISkyDeviceStatusAssistant) scope.get(Reflection.getOrCreateKotlinClass(ISkyDeviceStatusAssistant.class), null, null), (WeekPlanDataSource) scope.get(Reflection.getOrCreateKotlinClass(WeekPlanDataSource.class), null, null), (SkyPlayServiceHelper) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, null));
                }
            }

            public g() {
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
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyPlayRecordManager.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyPlayContinuousManager.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/SkyNotificationService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, SkyNotificationService> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyNotificationService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyNotificationServiceImpl(ModuleExtKt.androidContext(scope), (ISleepReminderRepo) scope.get(Reflection.getOrCreateKotlinClass(ISleepReminderRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/SkyPromotionService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, SkyPromotionService> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyPromotionService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyPromotionServiceImpl((SkyPromotionRepo) scope.get(Reflection.getOrCreateKotlinClass(SkyPromotionRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/realtime/SkyMusicListViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, SkyMusicListViewModel> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkyMusicListViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyMusicListViewModel((MusicInfoDao) scope.get(Reflection.getOrCreateKotlinClass(MusicInfoDao.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/service/SkySurveyService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, SkySurveyService> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkySurveyService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkySurveyServiceImpl();
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
            c cVar = c.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyService.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0564d c0564d = C0564d.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(IPlayback.class), null, c0564d, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            e eVar = e.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SkyPlayViewModel.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            f fVar = f.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyNavigation.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            SkyServiceKoinScopeKt.skyServiceScope(module, g.a);
            h hVar = h.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyNotificationService.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            i iVar = i.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkyPromotionService.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            j jVar = j.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(SkyMusicListViewModel.class), null, jVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            k kVar = k.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SkySurveyService.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            a aVar = a.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(RecommendServiceUsecase.class), null, aVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            b bVar = b.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WeekPlanDataSource.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Module, Unit> {
        public static final e a = new e();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/sleepreminder/SkySleepReminderViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, SkySleepReminderViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SkySleepReminderViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkySleepReminderViewModel((ISleepReminderRepo) scope.get(Reflection.getOrCreateKotlinClass(ISleepReminderRepo.class), null, null));
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
            StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SkySleepReminderViewModel.class), null, aVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @NotNull
    public static final Module getSkyIntroModule() {
        return d;
    }

    @NotNull
    public static final Module getSkyPlaySettingModule() {
        return e;
    }

    @NotNull
    public static final Module getSkyRealTimeModule() {
        return b;
    }

    @NotNull
    public static final Module getSkyServiceModule() {
        return a;
    }

    @NotNull
    public static final Module getSkySleepReminderModule() {
        return c;
    }
}
