package com.huami.sleep.ext;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.chart.util.Index;
import com.huami.sky.service.RelaxDataService;
import com.huami.sky.service.SkyCardService;
import com.huami.sky.service.SkyNavigation;
import com.huami.sleep.api.SleepDataWebApi;
import com.huami.sleep.api.SleepWebApiImpl;
import com.huami.sleep.data.local.RoomDaoHelper;
import com.huami.sleep.data.remote.tonality.ApiTonalityRatingImpl;
import com.huami.sleep.data.remote.tonality.IApiTonalityRating;
import com.huami.sleep.datasource.IBreathQualityDataSource;
import com.huami.sleep.datasource.IManualDataSource;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.sleep.datasource.ISleepStatisticDataSource;
import com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo;
import com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo;
import com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo;
import com.huami.sleep.daysleep.daydetail.repo.IRespRateRepo;
import com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepDetailViewModel;
import com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel;
import com.huami.sleep.daysleep.sleepstagechart.repo.DaySleepStageRepo;
import com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo;
import com.huami.sleep.daysleep.sleepstagechart.repo.SleepTagRepo;
import com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel;
import com.huami.sleep.daysleep.tonality.ITonalityDataInterface;
import com.huami.sleep.daysleep.tonality.ITonalityRepos;
import com.huami.sleep.daysleep.tonality.SleepTonalityViewModel;
import com.huami.sleep.daysleep.tonality.TonalityRepos;
import com.huami.sleep.daysleep.tonality.tonalityService.RealTonalityDataImpl;
import com.huami.sleep.koin.IAppCacheData;
import com.huami.sleep.koin.IAppFunctions;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.koin.IHMKeeper;
import com.huami.sleep.koin.IPageNavigate;
import com.huami.sleep.koin.ISleepDataManager;
import com.huami.sleep.koin.ISleepDayPageSelectListener;
import com.huami.sleep.koin.ISleepPostEvent;
import com.huami.sleep.koin.ScopesKt;
import com.huami.sleep.koin.SleepDataScopeNames;
import com.huami.sleep.model.AccountInfo;
import com.huami.sleep.napsleep.repo.NapSleepRepo;
import com.huami.sleep.napsleep.viewmodel.NapSleepDayViewModel;
import com.huami.sleep.repo.BreathQualityRepo;
import com.huami.sleep.repo.BreathQualitySelectHistoryRepo;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.repo.IBreathQualitySelectHistoryRepo;
import com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel;
import com.huami.sleep.service.BreathQualityService;
import com.huami.sleep.service.BreathQualityServiceImpl;
import com.huami.sleep.service.ISleepServiceDataSource;
import com.huami.sleep.service.SleepService;
import com.huami.sleep.service.SleepServiceDataSourceImpl;
import com.huami.sleep.service.SleepServiceImpl;
import com.huami.sleep.sleepedit.repo.ISleepEditRepo;
import com.huami.sleep.sleepedit.viewmodel.SleepEditViewModel;
import com.huami.sleep.sleephome.repo.ISleepHomeRepo;
import com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel;
import com.huami.sleep.sleepintrodetail.viewmodel.SleepBreathQualityIntroViewModel;
import com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailViewModel;
import com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo;
import com.huami.sleep.sleepstatefeel.repo.SleepStateFeelRepo;
import com.huami.sleep.sleepstatefeel.viewmodel.MonthStateFeelViewModel;
import com.huami.sleep.sleepstatefeel.viewmodel.SleepStateFeelViewModel;
import com.huami.sleep.sleepstatefeel.viewmodel.WeekSleepStateFeelViewModel;
import com.huami.sleep.statistic.repo.ISleepStatisticRepo;
import com.huami.sleep.statistic.repo.SleepAnalysisRepo;
import com.huami.sleep.statistic.repo.SleepStatisticRepo;
import com.huami.sleep.statistic.repo.StageChartRepo;
import com.huami.sleep.statistic.sleepanalysis.repo.ISleepAnalysisRepo;
import com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel;
import com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel;
import com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel;
import com.huami.sleep.viewmodel.breathquality.BreathQualityDayScoreViewModel;
import com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel;
import com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel;
import com.huami.web.service.WebViewService;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0001\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u0006\u0010\n\u001a\u00020\t\u001a\u0006\u0010\f\u001a\u00020\u000b\u001a\u0006\u0010\u000e\u001a\u00020\r\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0006\u0010\u0012\u001a\u00020\u0011\u001a\u0006\u0010\u0014\u001a\u00020\u0013\u001a\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0006\u0010\u0018\u001a\u00020\u0017\u001a\u0006\u0010\u001a\u001a\u00020\u0019\u001a\u0006\u0010\u001c\u001a\u00020\u001b\u001a\u0006\u0010\u001e\u001a\u00020\u001d\u001a\u0006\u0010 \u001a\u00020\u001f\u001a\u0006\u0010\"\u001a\u00020!\u001a\u0006\u0010$\u001a\u00020#\u001a(\u0010(\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0082\b¢\u0006\u0004\b(\u0010)\u001a\u001c\u0010+\u001a\u00028\u0000\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020*H\u0082\b¢\u0006\u0004\b+\u0010\u0002\"\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010-\"\u0019\u00103\u001a\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102\"\u0019\u00106\u001a\u00020/8\u0006@\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102¨\u00067"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "withKoinGet", "()Ljava/lang/Object;", "Landroid/content/Context;", "getAppContext", "Lcom/huami/sleep/model/AccountInfo;", Constant.FUNCTION_GET_ACCOUNT_INFO, "Lcom/huami/sleep/koin/IAppFunctions;", "getAppFunctions", "Lcom/huami/sleep/koin/IAppCacheData;", "getAppCacheSlpData", "Lcom/huami/sleep/koin/IPageNavigate;", "getPageNavigate", "Lcom/huami/sleep/koin/ISleepDataManager;", "getSleepDataManager", "Lcom/huami/sleep/koin/ISleepPostEvent;", "sleepPostEvent", "Lcom/huami/sleep/koin/IDeviceManager;", "getDeviceManager", "Lcom/huami/sleep/koin/IHMKeeper;", "getHMKeeper", "Lcom/huami/sleep/koin/ISleepDayPageSelectListener;", "getSleepDayPageChangeListener", "Lcom/huami/sleep/service/SleepService;", "getSleepService", "Lcom/huami/sleep/service/BreathQualityService;", "getBreathQualityService", "Lcom/huami/web/service/WebViewService;", "getWebService", "Lcom/huami/sky/service/SkyNavigation;", "getSkyNavigator", "Lcom/huami/sleep/data/local/RoomDaoHelper;", "getSleepRoomDaoHelper", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "getSleepSource", "Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "getSleepSkySource", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "b", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "", "a", "", "Z", "MOCK_TONALITY", "Lorg/koin/core/module/Module;", "Lorg/koin/core/module/Module;", "getSleepInternalDataModule", "()Lorg/koin/core/module/Module;", "sleepInternalDataModule", "c", "getSleepViewModel", "sleepViewModel", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {
    private static final boolean a = false;

    @NotNull
    private static final Module b = ModuleKt.module$default(false, a.a, 1, null);

    @NotNull
    private static final Module c = ModuleKt.module$default(false, b.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0578a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0578a a = new C0578a();

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/service/ISleepServiceDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0579a extends Lambda implements Function2<Scope, ParametersHolder, ISleepServiceDataSource> {
                public static final C0579a a = new C0579a();

                public C0579a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISleepServiceDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SleepServiceDataSourceImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/data/local/RoomDaoHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, RoomDaoHelper> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RoomDaoHelper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return RoomDaoHelper.INSTANCE.buildDatabase();
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/tonality/ITonalityRepos;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, ITonalityRepos> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ITonalityRepos invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new TonalityRepos();
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/data/remote/tonality/IApiTonalityRating;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, IApiTonalityRating> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IApiTonalityRating invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new ApiTonalityRatingImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/api/SleepDataWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SleepDataWebApi> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SleepDataWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SleepWebApiImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$f */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/daydetail/repo/IDaySleepRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, IDaySleepRepo> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IDaySleepRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DaySleepRepo((ISleepDayDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepDayDataSource.class), null, null), (IBreathQualityRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, null), (ITonalityDataInterface) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ITonalityDataInterface.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$g */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/statistic/repo/StageChartRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function2<Scope, ParametersHolder, StageChartRepo> {
                public static final g a = new g();

                public g() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final StageChartRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new StageChartRepo();
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$h */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/SleepTagRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class h extends Lambda implements Function2<Scope, ParametersHolder, SleepTagRepo> {
                public static final h a = new h();

                public h() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SleepTagRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SleepTagRepo((SleepDataWebApi) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(SleepDataWebApi.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$i */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class i extends Lambda implements Function2<Scope, ParametersHolder, IDaySleepStageRepo> {
                public static final i a = new i();

                public i() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IDaySleepStageRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new DaySleepStageRepo((ISleepDayDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepDayDataSource.class), null, null), (IHeartRateRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IHeartRateRepo.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$j */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/statistic/sleepanalysis/repo/ISleepAnalysisRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class j extends Lambda implements Function2<Scope, ParametersHolder, ISleepAnalysisRepo> {
                public static final j a = new j();

                public j() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISleepAnalysisRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SleepAnalysisRepo((ISleepStatisticDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStatisticDataSource.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$k */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class k extends Lambda implements Function2<Scope, ParametersHolder, ISleepStatisticRepo> {
                public static final k a = new k();

                public k() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISleepStatisticRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SleepStatisticRepo((ISleepStatisticDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStatisticDataSource.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$l */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/napsleep/repo/NapSleepRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class l extends Lambda implements Function2<Scope, ParametersHolder, NapSleepRepo> {
                public static final l a = new l();

                public l() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NapSleepRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new NapSleepRepo((ISleepDayDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepDayDataSource.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$a$a$m */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class m extends Lambda implements Function2<Scope, ParametersHolder, IBreathQualityRepo> {
                public static final m a = new m();

                public m() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IBreathQualityRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new BreathQualityRepo((IBreathQualityDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityDataSource.class), null, null), (ISleepDayDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepDayDataSource.class), null, null));
                }
            }

            public C0578a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                e eVar = e.a;
                Module module = scopeDSL.getModule();
                Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
                Kind kind = Kind.Factory;
                BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(SleepDataWebApi.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeQualifier);
                FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
                new Pair(module, factoryInstanceFactory);
                f fVar = f.a;
                Module module2 = scopeDSL.getModule();
                Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(IDaySleepRepo.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeQualifier2);
                FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
                Module.saveMapping$default(module2, strIndexKey2, factoryInstanceFactory2, false, 4, null);
                new Pair(module2, factoryInstanceFactory2);
                g gVar = g.a;
                Module module3 = scopeDSL.getModule();
                Qualifier scopeQualifier3 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeQualifier3, Reflection.getOrCreateKotlinClass(StageChartRepo.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeQualifier3);
                FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
                Module.saveMapping$default(module3, strIndexKey3, factoryInstanceFactory3, false, 4, null);
                new Pair(module3, factoryInstanceFactory3);
                h hVar = h.a;
                Module module4 = scopeDSL.getModule();
                Qualifier scopeQualifier4 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeQualifier4, Reflection.getOrCreateKotlinClass(SleepTagRepo.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeQualifier4);
                FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
                Module.saveMapping$default(module4, strIndexKey4, factoryInstanceFactory4, false, 4, null);
                new Pair(module4, factoryInstanceFactory4);
                i iVar = i.a;
                Module module5 = scopeDSL.getModule();
                Qualifier scopeQualifier5 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeQualifier5, Reflection.getOrCreateKotlinClass(IDaySleepStageRepo.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeQualifier5);
                FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
                Module.saveMapping$default(module5, strIndexKey5, factoryInstanceFactory5, false, 4, null);
                new Pair(module5, factoryInstanceFactory5);
                j jVar = j.a;
                Module module6 = scopeDSL.getModule();
                Qualifier scopeQualifier6 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeQualifier6, Reflection.getOrCreateKotlinClass(ISleepAnalysisRepo.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeQualifier6);
                FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
                Module.saveMapping$default(module6, strIndexKey6, factoryInstanceFactory6, false, 4, null);
                new Pair(module6, factoryInstanceFactory6);
                k kVar = k.a;
                Module module7 = scopeDSL.getModule();
                Qualifier scopeQualifier7 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition7 = new BeanDefinition(scopeQualifier7, Reflection.getOrCreateKotlinClass(ISleepStatisticRepo.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeQualifier7);
                FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
                Module.saveMapping$default(module7, strIndexKey7, factoryInstanceFactory7, false, 4, null);
                new Pair(module7, factoryInstanceFactory7);
                l lVar = l.a;
                Module module8 = scopeDSL.getModule();
                Qualifier scopeQualifier8 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition8 = new BeanDefinition(scopeQualifier8, Reflection.getOrCreateKotlinClass(NapSleepRepo.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeQualifier8);
                FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
                Module.saveMapping$default(module8, strIndexKey8, factoryInstanceFactory8, false, 4, null);
                new Pair(module8, factoryInstanceFactory8);
                m mVar = m.a;
                Module module9 = scopeDSL.getModule();
                Qualifier scopeQualifier9 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition9 = new BeanDefinition(scopeQualifier9, Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeQualifier9);
                FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
                Module.saveMapping$default(module9, strIndexKey9, factoryInstanceFactory9, false, 4, null);
                new Pair(module9, factoryInstanceFactory9);
                C0579a c0579a = C0579a.a;
                Module module10 = scopeDSL.getModule();
                Qualifier scopeQualifier10 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition10 = new BeanDefinition(scopeQualifier10, Reflection.getOrCreateKotlinClass(ISleepServiceDataSource.class), null, c0579a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeQualifier10);
                FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition10);
                Module.saveMapping$default(module10, strIndexKey10, factoryInstanceFactory10, false, 4, null);
                new Pair(module10, factoryInstanceFactory10);
                b bVar = b.a;
                Kind kind2 = Kind.Scoped;
                BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(RoomDaoHelper.class), null, bVar, kind2, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition11);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                c cVar = c.a;
                Module module11 = scopeDSL.getModule();
                Qualifier scopeQualifier11 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition12 = new BeanDefinition(scopeQualifier11, Reflection.getOrCreateKotlinClass(ITonalityRepos.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeQualifier11);
                FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition12);
                Module.saveMapping$default(module11, strIndexKey12, factoryInstanceFactory11, false, 4, null);
                new Pair(module11, factoryInstanceFactory11);
                d dVar = d.a;
                Module module12 = scopeDSL.getModule();
                Qualifier scopeQualifier12 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition13 = new BeanDefinition(scopeQualifier12, Reflection.getOrCreateKotlinClass(IApiTonalityRating.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeQualifier12);
                FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition13);
                Module.saveMapping$default(module12, strIndexKey13, factoryInstanceFactory12, false, 4, null);
                new Pair(module12, factoryInstanceFactory12);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, ISleepStateFeelRepo> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ISleepStateFeelRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepStateFeelRepo((IManualDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IManualDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/service/SleepService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, SleepService> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepServiceImpl(KoinExtKt.getAccountInfo().getUserId(), (ISleepStatisticRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStatisticRepo.class), null, null), (IDaySleepStageRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IDaySleepStageRepo.class), null, null), (ISleepDataManager) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepDataManager.class), null, null), (ISleepServiceDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepServiceDataSource.class), null, null), (RelaxDataService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(RelaxDataService.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/service/BreathQualityService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, BreathQualityService> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BreathQualityService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BreathQualityServiceImpl(KoinExtKt.getAccountInfo().getUserId(), (IBreathQualityRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, null), (ISleepDataManager) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepDataManager.class), null, null), (IBreathQualityDataSource) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "Lcom/huami/chart/util/Index;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, IBreathQualitySelectHistoryRepo<Index>> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IBreathQualitySelectHistoryRepo<Index> invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BreathQualitySelectHistoryRepo();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, ITonalityDataInterface> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ITonalityDataInterface invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RealTonalityDataImpl((RelaxDataService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(RelaxDataService.class), null, null));
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
            module.scope(QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), C0578a.a);
            b bVar = b.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISleepStateFeelRepo.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            c cVar = c.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SleepService.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            d dVar = d.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(BreathQualityService.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            e eVar = e.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IBreathQualitySelectHistoryRepo.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            f fVar = f.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ITonalityDataInterface.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepstatefeel/viewmodel/MonthStateFeelViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, MonthStateFeelViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MonthStateFeelViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new MonthStateFeelViewModel((ISleepStateFeelRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStateFeelRepo.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.sleep.ext.KoinExtKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/napsleep/viewmodel/NapSleepDayViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0580b extends Lambda implements Function2<Scope, ParametersHolder, NapSleepDayViewModel> {
            public static final C0580b a = new C0580b();

            public C0580b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NapSleepDayViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new NapSleepDayViewModel((NapSleepRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(NapSleepRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, DaySleepDetailViewModel> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DaySleepDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DaySleepDetailViewModel();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepedit/viewmodel/SleepEditViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, SleepEditViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepEditViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepEditViewModel((ISleepEditRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepEditRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/statistic/sleepanalysis/viewmodel/SleepAnalysisViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SleepAnalysisViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepAnalysisViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepAnalysisViewModel((ISleepAnalysisRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepAnalysisRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayScoreViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, BreathQualityDayScoreViewModel> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BreathQualityDayScoreViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BreathQualityDayScoreViewModel((IBreathQualityRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityWMScoreViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, BreathQualityWMScoreViewModel> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BreathQualityWMScoreViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BreathQualityWMScoreViewModel((IBreathQualityRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityYearScoreViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, BreathQualityYearScoreViewModel> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BreathQualityYearScoreViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BreathQualityYearScoreViewModel((IBreathQualityRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayOdViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, BreathQualityDayOdViewModel> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BreathQualityDayOdViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BreathQualityDayOdViewModel((IBreathQualityRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IBreathQualityRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/tonality/SleepTonalityViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, SleepTonalityViewModel> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepTonalityViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepTonalityViewModel(KoinExtKt.getAccountInfo().getUserId(), (ITonalityRepos) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ITonalityRepos.class), null, null), (IApiTonalityRating) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IApiTonalityRating.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, SleepIntroDetailViewModel> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepIntroDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepIntroDetailViewModel((SkyCardService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SkyCardService.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/statistic/viewmodel/SleepStatisticsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, SleepStatisticsViewModel> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepStatisticsViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepStatisticsViewModel((ISleepStatisticRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStatisticRepo.class), null, null), (StageChartRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(StageChartRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepBreathQualityIntroViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, SleepBreathQualityIntroViewModel> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepBreathQualityIntroViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepBreathQualityIntroViewModel();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, DaySleepViewModel> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DaySleepViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DaySleepViewModel((IDaySleepRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IDaySleepRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/daysleep/sleepstagechart/viewmodel/SleepStageChartViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, SleepStageChartViewModel> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepStageChartViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepStageChartViewModel((IDaySleepStageRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IDaySleepStageRepo.class), null, null), (IRespRateRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, null), (SleepTagRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(SleepTagRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleephome/viewmodel/SleepHomeViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, SleepHomeViewModel> {
            public static final p a = new p();

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepHomeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepHomeViewModel((ISleepHomeRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepHomeRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/selectmainsource/viewmodel/SleepMainSourceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, SleepMainSourceViewModel> {
            public static final q a = new q();

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepMainSourceViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepMainSourceViewModel();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepstatefeel/viewmodel/SleepStateFeelViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, SleepStateFeelViewModel> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SleepStateFeelViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SleepStateFeelViewModel((ISleepStateFeelRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStateFeelRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleep/sleepstatefeel/viewmodel/WeekSleepStateFeelViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, WeekSleepStateFeelViewModel> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WeekSleepStateFeelViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WeekSleepStateFeelViewModel((ISleepStateFeelRepo) Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(ISleepStateFeelRepo.class), null, null));
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
            k kVar = k.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SleepIntroDetailViewModel.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            l lVar = l.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SleepStatisticsViewModel.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            m mVar = m.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(SleepBreathQualityIntroViewModel.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            n nVar = n.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(DaySleepViewModel.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            o oVar = o.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(SleepStageChartViewModel.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            p pVar = p.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(SleepHomeViewModel.class), null, pVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            q qVar = q.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(SleepMainSourceViewModel.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            r rVar = r.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(SleepStateFeelViewModel.class), null, rVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            s sVar = s.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(WeekSleepStateFeelViewModel.class), null, sVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
            a aVar = a.a;
            StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(MonthStateFeelViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier10);
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory10, false, 4, null);
            new Pair(module, factoryInstanceFactory10);
            C0580b c0580b = C0580b.a;
            StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(NapSleepDayViewModel.class), null, c0580b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier11);
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory11, false, 4, null);
            new Pair(module, factoryInstanceFactory11);
            c cVar = c.a;
            StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition12 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(DaySleepDetailViewModel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, rootScopeQualifier12);
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, factoryInstanceFactory12, false, 4, null);
            new Pair(module, factoryInstanceFactory12);
            d dVar = d.a;
            StringQualifier rootScopeQualifier13 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition13 = new BeanDefinition(rootScopeQualifier13, Reflection.getOrCreateKotlinClass(SleepEditViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, rootScopeQualifier13);
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, factoryInstanceFactory13, false, 4, null);
            new Pair(module, factoryInstanceFactory13);
            e eVar = e.a;
            StringQualifier rootScopeQualifier14 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition14 = new BeanDefinition(rootScopeQualifier14, Reflection.getOrCreateKotlinClass(SleepAnalysisViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, rootScopeQualifier14);
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, factoryInstanceFactory14, false, 4, null);
            new Pair(module, factoryInstanceFactory14);
            f fVar = f.a;
            StringQualifier rootScopeQualifier15 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition15 = new BeanDefinition(rootScopeQualifier15, Reflection.getOrCreateKotlinClass(BreathQualityDayScoreViewModel.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, rootScopeQualifier15);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, factoryInstanceFactory15, false, 4, null);
            new Pair(module, factoryInstanceFactory15);
            g gVar = g.a;
            StringQualifier rootScopeQualifier16 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition16 = new BeanDefinition(rootScopeQualifier16, Reflection.getOrCreateKotlinClass(BreathQualityWMScoreViewModel.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, rootScopeQualifier16);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, factoryInstanceFactory16, false, 4, null);
            new Pair(module, factoryInstanceFactory16);
            h hVar = h.a;
            StringQualifier rootScopeQualifier17 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition17 = new BeanDefinition(rootScopeQualifier17, Reflection.getOrCreateKotlinClass(BreathQualityYearScoreViewModel.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, rootScopeQualifier17);
            FactoryInstanceFactory factoryInstanceFactory17 = new FactoryInstanceFactory(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, factoryInstanceFactory17, false, 4, null);
            new Pair(module, factoryInstanceFactory17);
            i iVar = i.a;
            StringQualifier rootScopeQualifier18 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition18 = new BeanDefinition(rootScopeQualifier18, Reflection.getOrCreateKotlinClass(BreathQualityDayOdViewModel.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, rootScopeQualifier18);
            FactoryInstanceFactory factoryInstanceFactory18 = new FactoryInstanceFactory(beanDefinition18);
            Module.saveMapping$default(module, strIndexKey18, factoryInstanceFactory18, false, 4, null);
            new Pair(module, factoryInstanceFactory18);
            j jVar = j.a;
            StringQualifier rootScopeQualifier19 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition19 = new BeanDefinition(rootScopeQualifier19, Reflection.getOrCreateKotlinClass(SleepTonalityViewModel.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, rootScopeQualifier19);
            FactoryInstanceFactory factoryInstanceFactory19 = new FactoryInstanceFactory(beanDefinition19);
            Module.saveMapping$default(module, strIndexKey19, factoryInstanceFactory19, false, 4, null);
            new Pair(module, factoryInstanceFactory19);
        }
    }

    private static final /* synthetic */ <T> T a() {
        Scope rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }

    private static final /* synthetic */ <T> T b(Scope scope, Qualifier qualifier) {
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object c(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final AccountInfo getAccountInfo() {
        return (AccountInfo) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(AccountInfo.class), null, null);
    }

    @NotNull
    public static final IAppCacheData getAppCacheSlpData() {
        return (IAppCacheData) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IAppCacheData.class), null, null);
    }

    @NotNull
    public static final Context getAppContext() {
        return (Context) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    @NotNull
    public static final IAppFunctions getAppFunctions() {
        return (IAppFunctions) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IAppFunctions.class), null, null);
    }

    @NotNull
    public static final BreathQualityService getBreathQualityService() {
        return (BreathQualityService) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(BreathQualityService.class), null, null);
    }

    @NotNull
    public static final IDeviceManager getDeviceManager() {
        return (IDeviceManager) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IDeviceManager.class), null, null);
    }

    @NotNull
    public static final IHMKeeper getHMKeeper() {
        return (IHMKeeper) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IHMKeeper.class), null, null);
    }

    @NotNull
    public static final IPageNavigate getPageNavigate() {
        return (IPageNavigate) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IPageNavigate.class), null, null);
    }

    @NotNull
    public static final SkyNavigation getSkyNavigator() {
        return (SkyNavigation) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SkyNavigation.class), null, null);
    }

    @NotNull
    public static final ISleepDataManager getSleepDataManager() {
        return (ISleepDataManager) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(ISleepDataManager.class), null, null);
    }

    @NotNull
    public static final ISleepDayPageSelectListener getSleepDayPageChangeListener() {
        return (ISleepDayPageSelectListener) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(ISleepDayPageSelectListener.class), null, null);
    }

    @NotNull
    public static final Module getSleepInternalDataModule() {
        return b;
    }

    @NotNull
    public static final RoomDaoHelper getSleepRoomDaoHelper() {
        return (RoomDaoHelper) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(RoomDaoHelper.class), null, null);
    }

    @NotNull
    public static final SleepService getSleepService() {
        return (SleepService) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(SleepService.class), null, null);
    }

    @NotNull
    public static final ITonalityDataInterface getSleepSkySource() {
        return (ITonalityDataInterface) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ITonalityDataInterface.class), null, null);
    }

    @NotNull
    public static final ISleepDayDataSource getSleepSource() {
        return (ISleepDayDataSource) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(ISleepDayDataSource.class), null, null);
    }

    @NotNull
    public static final Module getSleepViewModel() {
        return c;
    }

    @NotNull
    public static final WebViewService getWebService() {
        return (WebViewService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WebViewService.class), null, null);
    }

    @NotNull
    public static final ISleepPostEvent sleepPostEvent() {
        return (ISleepPostEvent) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(ISleepPostEvent.class), null, null);
    }

    public static final /* synthetic */ <T> T withKoinGet() {
        Scope scopeSleepDataScope = ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeSleepDataScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null);
    }
}
