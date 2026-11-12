package com.xiaomi.hm.health.step;

import android.content.Context;
import android.text.TextUtils;
import androidx.p008lifecycle.LiveData;
import com.huami.account.api.model.HMWebAccess;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.step.koin.IRunDataAnalysisJob;
import com.huami.step.koin.IStepGameNavigator;
import com.huami.step.koin.IStepGoalData;
import com.huami.step.koin.IStepGoalNavigator;
import com.huami.step.koin.IStepOriginData;
import com.huami.step.koin.IStepRank;
import com.huami.step.koin.IStepShare;
import com.huami.step.koin.IUnitManager;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.model.StepGameResponse;
import com.huami.step.model.StepGoalInfo;
import com.huami.step.model.StepInfo;
import com.huami.step.model.StepOriginData;
import com.huami.step.model.UiConfig;
import com.huami.step.model.UserOfStep;
import com.huami.step.ui.IStepGame;
import com.huami.step.utils.StepGameConstKt;
import com.huami.watch.companion.config.Config;
import com.huami.web.service.WebItem;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.DateData;
import com.xiaomi.hm.health.databases.model.DateDataDao;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.healthdata.api.WebUtils;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.share.HMShareActivity;
import com.xiaomi.hm.health.share.ShareAdapter;
import com.xiaomi.hm.health.share.ShareStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getStepModules", "()Lorg/koin/core/module/Module;", "stepModules", "", "b", "[Lorg/koin/core/module/Module;", "getStepModuleArray", "()[Lorg/koin/core/module/Module;", "stepModuleArray", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class StepModulesKt {

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module[] b;

    static {
        Module moduleModule$default = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/model/UserOfStep;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function2<Scope, ParametersHolder, UserOfStep> {
                public static final a a = new a();

                public a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UserOfStep invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new UserOfStep(AccountModuleKt.getAccountService().getRegisterDate() / 1000, Config.isUserOversea(ModuleExtKt.androidContext(scope)));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/model/UiConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, UiConfig> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UiConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new UiConfig.Builder().setShadow(false).build();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, Boolean> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                public final boolean a(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return (!Config.isLocaleOversea(ModuleExtKt.androidContext(scope))) & (!Config.isUserOversea(ModuleExtKt.androidContext(scope)));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Scope scope, ParametersHolder parametersHolder) {
                    return Boolean.valueOf(a(scope, parametersHolder));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Module module) {
                invoke2(module);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Module module) {
                AnonymousClass1 anonymousClass1 = new Function2<Scope, ParametersHolder, IStepOriginData>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.1
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepOriginData invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IStepOriginData() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.1.1

                            /* JADX INFO: renamed from: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1$1$1$a */
                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/step/model/StepOriginData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            public static final class a extends Lambda implements Function0<List<? extends StepOriginData>> {
                                public final /* synthetic */ String a;
                                public final /* synthetic */ String b;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public a(String str, String str2) {
                                    super(0);
                                    this.a = str;
                                    this.b = str2;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @Nullable
                                public final List<? extends StepOriginData> invoke() {
                                    QueryBuilder<DateData> queryBuilder = HMDaoManager.getInstance().getDateDataDao().queryBuilder();
                                    Property property = DateDataDao.Properties.Date;
                                    List<DateData> list = queryBuilder.where(property.ge(this.a), property.le(this.b)).build().list();
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    for (DateData dateData : list) {
                                        String date = dateData.getDate();
                                        String summary = dateData.getSummary();
                                        String stageStepsSummary = dateData.getStageStepsSummary();
                                        if (stageStepsSummary == null) {
                                            stageStepsSummary = "";
                                        }
                                        arrayList.add(new StepOriginData(date, summary, stageStepsSummary));
                                    }
                                    return arrayList;
                                }
                            }

                            @Override // com.huami.step.koin.IStepOriginData
                            @NotNull
                            public LiveData<List<StepOriginData>> getStepOriginData(@NotNull String userId, @NotNull String startDate, @NotNull String endDate) {
                                return LiveDataSupportKt.queryByLiveData(new String[]{"DATE_DATA"}, new a(startDate, endDate));
                            }
                        };
                    }
                };
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(IStepOriginData.class), null, anonymousClass1, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
                FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
                new Pair(module, factoryInstanceFactory);
                a aVar = a.a;
                StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(UserOfStep.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
                FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
                Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
                new Pair(module, factoryInstanceFactory2);
                b bVar = b.a;
                StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(UiConfig.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
                FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
                Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
                new Pair(module, factoryInstanceFactory3);
                AnonymousClass4 anonymousClass4 = new Function2<Scope, ParametersHolder, IUnitManager>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.4
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IUnitManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IUnitManager() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.4.1
                            @Override // com.huami.step.koin.IUnitManager
                            @NotNull
                            public String formatCalFat(int cal) {
                                UnitManager unitManager = UnitManager.getInstance();
                                String fatValue = unitManager.formatFatValue(cal);
                                return unitManager.convertKGByUnit(fatValue) + unitManager.convertUnitByKg(fatValue);
                            }

                            @Override // com.huami.step.koin.IUnitManager
                            @NotNull
                            public String formatDistance(int distance) {
                                return UnitManager.getInstance().formatValue(distance);
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(IUnitManager.class), null, anonymousClass4, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
                FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
                Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
                new Pair(module, factoryInstanceFactory4);
                AnonymousClass5 anonymousClass5 = new Function2<Scope, ParametersHolder, IRunDataAnalysisJob>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.5
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IRunDataAnalysisJob invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IRunDataAnalysisJob() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.5.1
                            @Override // com.huami.step.koin.IRunDataAnalysisJob
                            public void runJob(@NotNull String userId, @NotNull String date) {
                                HMDataCacheCenter.getInstance().getmBandUint().checkDateDataDownloadStatus(SportDay.fromString(date));
                                new HMDataAnalisisJob(date, 0, HMDeviceType.MILI.getValue(), 0).start();
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(IRunDataAnalysisJob.class), null, anonymousClass5, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
                FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
                Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
                new Pair(module, factoryInstanceFactory5);
                AnonymousClass6 anonymousClass6 = new Function2<Scope, ParametersHolder, IStepRank>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.6
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepRank invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IStepRank() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.6.1
                            @Override // com.huami.step.koin.IStepRank
                            public void calculateStepRank(int step) {
                                SportDataManager sportDataManager = SportDataManager.getInstance();
                                synchronized (sportDataManager) {
                                    sportDataManager.initDetailPage();
                                    sportDataManager.getStepCompareRate(step, true);
                                    sportDataManager.deinitDetailPage();
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(IStepRank.class), null, anonymousClass6, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier6);
                FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
                Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory6, false, 4, null);
                new Pair(module, factoryInstanceFactory6);
                AnonymousClass7 anonymousClass7 = new Function2<Scope, ParametersHolder, IStepShare>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.7
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepShare invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IStepShare() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.7.1
                            @Override // com.huami.step.koin.IStepShare
                            public void shareStep(@NotNull Context context, @NotNull StepInfo stepInfo, int timeType) {
                                ShareStep shareStep = ShareAdapter.newInstance().parse2Step(stepInfo, timeType);
                                switch (timeType) {
                                    case 16:
                                        HMShareActivity.launch(context, 4, 1, shareStep);
                                        break;
                                    case 17:
                                        HMShareActivity.launch(context, 6, 1, shareStep);
                                        break;
                                    case 18:
                                    case 19:
                                        HMShareActivity.launch(context, 7, 1, shareStep);
                                        break;
                                }
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(IStepShare.class), null, anonymousClass7, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier7);
                FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
                Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory7, false, 4, null);
                new Pair(module, factoryInstanceFactory7);
                StringQualifier stringQualifierNamed = QualifierKt.named(StepGameConstKt.getSTEP_GAME_ENABLE());
                c cVar = c.a;
                StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(Boolean.class), stringQualifierNamed, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), stringQualifierNamed, rootScopeQualifier8);
                FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
                Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory8, false, 4, null);
                new Pair(module, factoryInstanceFactory8);
                AnonymousClass9 anonymousClass9 = new Function2<Scope, ParametersHolder, IStepGame>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.9

                    /* JADX INFO: renamed from: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1$9$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/xiaomi/hm/health/step/StepModulesKt$stepModules$1$9$1", "Lcom/huami/step/ui/IStepGame;", "Lcom/huami/step/model/StepGameResponse;", "a", "Lkotlinx/coroutines/flow/Flow;", "getStepGameStatus", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
                    public static final class AnonymousClass1 implements IStepGame {

                        /* JADX INFO: renamed from: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1$9$1$a */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/step/model/StepGameResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "com.xiaomi.hm.health.step.StepModulesKt$stepModules$1$9$1$getStepGameStatus$1", f = "StepModules.kt", i = {0}, l = {164, 167}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
                        public static final class a extends SuspendLambda implements Function2<FlowCollector<? super StepGameResponse>, Continuation<? super Unit>, Object> {
                            public int a;
                            private /* synthetic */ Object b;

                            /* JADX INFO: renamed from: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1$9$1$a$a, reason: collision with other inner class name */
                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/step/model/StepGameResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            @DebugMetadata(c = "com.xiaomi.hm.health.step.StepModulesKt$stepModules$1$9$1$getStepGameStatus$1$result$1", f = "StepModules.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C1010a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super StepGameResponse>, Object> {
                                public int a;
                                public final /* synthetic */ AnonymousClass1 b;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C1010a(AnonymousClass1 anonymousClass1, Continuation<? super C1010a> continuation) {
                                    super(2, continuation);
                                    this.b = anonymousClass1;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new C1010a(this.b, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super StepGameResponse> continuation) {
                                    return ((C1010a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                    if (this.a != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return this.b.a();
                                }
                            }

                            public a(Continuation<? super a> continuation) {
                                super(2, continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                a aVar = AnonymousClass1.this.new a(continuation);
                                aVar.b = obj;
                                return aVar;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull FlowCollector<? super StepGameResponse> flowCollector, @Nullable Continuation<? super Unit> continuation) {
                                return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                FlowCollector flowCollector;
                                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                                int i = this.a;
                                if (i != 0) {
                                    if (i == 1) {
                                        flowCollector = (FlowCollector) this.b;
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
                                flowCollector = (FlowCollector) this.b;
                                CoroutineDispatcher io2 = Dispatchers.getIO();
                                C1010a c1010a = new C1010a(AnonymousClass1.this, null);
                                this.b = flowCollector;
                                this.a = 1;
                                obj = BuildersKt.withContext(io2, c1010a, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.b = null;
                                this.a = 2;
                                if (flowCollector.emit((StepGameResponse) obj, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final StepGameResponse a() {
                            HMHttpResponseData hMHttpResponseData = WebUtils.INSTANCE.get((StringsKt__StringsKt.contains$default((CharSequence) HMServerDef.getHost(), (CharSequence) "staging", false, 2, (Object) null) ? "https://api-aos.test-cn.huami.com" : "https://api-mifit-cn2.huami.com") + "/wechapplets/5d0ed09a9b/entrance", r.hashMapOf(TuplesKt.to("appname", HMAppConfig.getPackageName()), TuplesKt.to("userid", HMPersonInfo.getInstance().getUserInfo().getUserid()), TuplesKt.to("apptoken", HMWebAccess.getToken())));
                            return new StepGameResponse(hMHttpResponseData.getStatusCode(), hMHttpResponseData.getResponseString(), hMHttpResponseData.getError());
                        }

                        @Override // com.huami.step.ui.IStepGame
                        @NotNull
                        public Flow<StepGameResponse> getStepGameStatus() {
                            return FlowKt.flow(new a(null));
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepGame invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new AnonymousClass1();
                    }
                };
                StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(IStepGame.class), null, anonymousClass9, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier9);
                FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
                Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory9, false, 4, null);
                new Pair(module, factoryInstanceFactory9);
                AnonymousClass10 anonymousClass10 = new Function2<Scope, ParametersHolder, IStepGameNavigator>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.10
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepGameNavigator invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IStepGameNavigator() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.10.1
                            @Override // com.huami.step.koin.IStepGameNavigator
                            public void navigatorUrl(@NotNull Context context, @NotNull String url) {
                                if (TextUtils.isEmpty(url)) {
                                    return;
                                }
                                WebItem webItem = new WebItem(url);
                                webItem.titleBarStyle = 3;
                                WebHelper.launch(webItem);
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(IStepGameNavigator.class), null, anonymousClass10, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier10);
                FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition10);
                Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory10, false, 4, null);
                new Pair(module, factoryInstanceFactory10);
                AnonymousClass11 anonymousClass11 = new Function2<Scope, ParametersHolder, IStepGoalData>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.11
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepGoalData invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IStepGoalData() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.11.1
                            /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r1
                              0x0033: PHI (r1v3 int) = (r1v2 int), (r1v4 int) binds: [B:3:0x0018, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // com.huami.step.koin.IStepGoalData
                            @NotNull
                            public StepGoalInfo getGoalInfo() {
                                StepGoalInfo stepGoalInfo = new StepGoalInfo();
                                int i = 0;
                                stepGoalInfo.setMaxReachGoal(HMKeeper.getSharedPref().getInt(HMKeeperConstant.TOTAL_ANALYSIS_REACH_GOALS, 0));
                                int recentReachGoals = HMKeeper.getRecentReachGoals();
                                if (recentReachGoals < 1) {
                                    recentReachGoals = HMKeeper.getBeforeRecentReachGoals();
                                    String beforeRecentReachGoalsEndDate = HMKeeper.getBeforeRecentReachGoalsEndDate();
                                    if (!TextUtils.isEmpty(beforeRecentReachGoalsEndDate) && SportDay.fromString(beforeRecentReachGoalsEndDate).isYesterday()) {
                                        i = recentReachGoals;
                                    }
                                } else {
                                    i = recentReachGoals;
                                }
                                stepGoalInfo.setCurReachGoal(i);
                                return stepGoalInfo;
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(IStepGoalData.class), null, anonymousClass11, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier11);
                FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition11);
                Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory11, false, 4, null);
                new Pair(module, factoryInstanceFactory11);
                AnonymousClass12 anonymousClass12 = new Function2<Scope, ParametersHolder, IStepGoalNavigator>() { // from class: com.xiaomi.hm.health.step.StepModulesKt$stepModules$1.12
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final IStepGoalNavigator invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new IStepGoalNavigator() { // from class: com.xiaomi.hm.health.step.StepModulesKt.stepModules.1.12.1
                            @Override // com.huami.step.koin.IStepGoalNavigator
                            public void navigatorShare(@NotNull Context context) {
                                HMShareActivity.launch(context, 9, 2, ShareAdapter.newInstance().getShareContinue());
                            }
                        };
                    }
                };
                StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
                BeanDefinition beanDefinition12 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(IStepGoalNavigator.class), null, anonymousClass12, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, rootScopeQualifier12);
                FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition12);
                Module.saveMapping$default(module, strIndexKey12, factoryInstanceFactory12, false, 4, null);
                new Pair(module, factoryInstanceFactory12);
            }
        }, 1, null);
        a = moduleModule$default;
        b = new Module[]{moduleModule$default, KoinExtKt.getStepInternalModule()};
    }

    @NotNull
    public static final Module[] getStepModuleArray() {
        return b;
    }

    @NotNull
    public static final Module getStepModules() {
        return a;
    }
}
