package com.xiaomi.hm.health.sleep.koin;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sleep.datasource.IBreathQualityDataSource;
import com.huami.sleep.datasource.IManualDataSource;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.sleep.datasource.ISleepStatisticDataSource;
import com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo;
import com.huami.sleep.daysleep.daydetail.repo.IRespRateRepo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IAppCacheData;
import com.huami.sleep.koin.IAppFunctions;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.koin.IHMKeeper;
import com.huami.sleep.koin.IPageNavigate;
import com.huami.sleep.koin.ISleepDataManager;
import com.huami.sleep.koin.ISleepDayPageSelectListener;
import com.huami.sleep.koin.ISleepPostEvent;
import com.huami.sleep.koin.SleepDataScopeNames;
import com.huami.sleep.model.AccountInfo;
import com.huami.sleep.sleepedit.repo.ISleepEditRepo;
import com.huami.sleep.sleephome.repo.ISleepHomeRepo;
import com.huami.snore.core.ext.IAppResource;
import com.huami.snore.core.ext.IPageJumpManager;
import com.huami.snore.core.ext.IPageStatusAnalyticsManager;
import com.huami.snore.core.ext.UserInfo;
import com.huami.snore.ui.koin.SnoreDataScopeNames;
import com.huami.watch.companion.config.Config;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.notification.AppNotification;
import com.xiaomi.hm.health.sleep.eventbus.SleepPostEventImpl;
import com.xiaomi.hm.health.sleep.koin.impl.AppCacheDataAmpl;
import com.xiaomi.hm.health.sleep.koin.impl.AppFunctionImpl;
import com.xiaomi.hm.health.sleep.koin.impl.AppResourceImpl;
import com.xiaomi.hm.health.sleep.koin.impl.DeviceManager;
import com.xiaomi.hm.health.sleep.koin.impl.PageNavigateImpl;
import com.xiaomi.hm.health.sleep.koin.impl.SleepDataManager;
import com.xiaomi.hm.health.sleep.koin.impl.SleepRespRateRepoImpl;
import com.xiaomi.hm.health.sleep.koin.impl.SleepUseHmKeeper;
import com.xiaomi.hm.health.sleep.koin.impl.SnorePageJumpManagerImpl;
import com.xiaomi.hm.health.sleep.koin.impl.SnorePageStatusAnalyticsManagerIImpl;
import com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource;
import com.xiaomi.hm.health.sleep.repository.HeartRateRepo;
import com.xiaomi.hm.health.sleep.repository.SleepDayDataSource;
import com.xiaomi.hm.health.sleep.repository.SleepEditRepo;
import com.xiaomi.hm.health.sleep.repository.SleepHomeRepo;
import com.xiaomi.hm.health.sleep.repository.SleepManualDataSource;
import com.xiaomi.hm.health.sleep.repository.SleepStatisticDataSourceImpl;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\"\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "getInUserData", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "Lorg/koin/core/module/Module;", "sleepDataModule", "Lorg/koin/core/module/Module;", "getSleepDataModule", "()Lorg/koin/core/module/Module;", "snoreDataModule", "getSnoreDataModule", "", "sleepDataModules", "[Lorg/koin/core/module/Module;", "getSleepDataModules", "()[Lorg/koin/core/module/Module;", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SleepDataModuleKt {

    @NotNull
    private static final Module sleepDataModule;

    @NotNull
    private static final Module[] sleepDataModules;

    @NotNull
    private static final Module snoreDataModule;

    static {
        Module moduleModule$default = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Module module) {
                invoke2(module);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Module module) {
                module.scope(QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), new Function1<ScopeDSL, Unit>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                        invoke2(scopeDSL);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                        C09991 c09991 = new Function2<Scope, ParametersHolder, ISleepHomeRepo>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ISleepHomeRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new SleepHomeRepo();
                            }
                        };
                        Module module2 = scopeDSL.getModule();
                        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
                        Kind kind = Kind.Factory;
                        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(ISleepHomeRepo.class), null, c09991, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeQualifier);
                        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                        Module.saveMapping$default(module2, strIndexKey, factoryInstanceFactory, false, 4, null);
                        new Pair(module2, factoryInstanceFactory);
                        AnonymousClass2 anonymousClass2 = new Function2<Scope, ParametersHolder, AccountInfo>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.2
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final AccountInfo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new AccountInfo((Config.isUserOversea(BraceletApp.getContext()) || Config.isLocaleOversea(BraceletApp.getContext())) ? false : true, Config.isUserOversea(BraceletApp.getContext()), HMPersonInfo.getInstance().getUserInfo().getGender(), AccountModuleKt.getAccountService().getRegisterDate() / 1000, HMPersonInfo.getInstance().getUserInfo().getUserid());
                            }
                        };
                        Module module3 = scopeDSL.getModule();
                        Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition2 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(AccountInfo.class), null, anonymousClass2, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeQualifier2);
                        FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
                        Module.saveMapping$default(module3, strIndexKey2, factoryInstanceFactory2, false, 4, null);
                        new Pair(module3, factoryInstanceFactory2);
                        AnonymousClass3 anonymousClass3 = new Function2<Scope, ParametersHolder, IHeartRateRepo>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.3
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final IHeartRateRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new HeartRateRepo();
                            }
                        };
                        Module module4 = scopeDSL.getModule();
                        Qualifier scopeQualifier3 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition3 = new BeanDefinition(scopeQualifier3, Reflection.getOrCreateKotlinClass(IHeartRateRepo.class), null, anonymousClass3, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeQualifier3);
                        FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
                        Module.saveMapping$default(module4, strIndexKey3, factoryInstanceFactory3, false, 4, null);
                        new Pair(module4, factoryInstanceFactory3);
                        AnonymousClass4 anonymousClass4 = new Function2<Scope, ParametersHolder, ISleepDataManager>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.4
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ISleepDataManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new SleepDataManager();
                            }
                        };
                        Module module5 = scopeDSL.getModule();
                        Qualifier scopeQualifier4 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition4 = new BeanDefinition(scopeQualifier4, Reflection.getOrCreateKotlinClass(ISleepDataManager.class), null, anonymousClass4, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeQualifier4);
                        FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
                        Module.saveMapping$default(module5, strIndexKey4, factoryInstanceFactory4, false, 4, null);
                        new Pair(module5, factoryInstanceFactory4);
                        AnonymousClass5 anonymousClass5 = new Function2<Scope, ParametersHolder, IPageNavigate>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.5
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final IPageNavigate invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new PageNavigateImpl();
                            }
                        };
                        Module module6 = scopeDSL.getModule();
                        Qualifier scopeQualifier5 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition5 = new BeanDefinition(scopeQualifier5, Reflection.getOrCreateKotlinClass(IPageNavigate.class), null, anonymousClass5, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeQualifier5);
                        FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
                        Module.saveMapping$default(module6, strIndexKey5, factoryInstanceFactory5, false, 4, null);
                        new Pair(module6, factoryInstanceFactory5);
                        AnonymousClass6 anonymousClass6 = new Function2<Scope, ParametersHolder, ISleepPostEvent>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.6
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ISleepPostEvent invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new SleepPostEventImpl();
                            }
                        };
                        Module module7 = scopeDSL.getModule();
                        Qualifier scopeQualifier6 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition6 = new BeanDefinition(scopeQualifier6, Reflection.getOrCreateKotlinClass(ISleepPostEvent.class), null, anonymousClass6, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeQualifier6);
                        FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
                        Module.saveMapping$default(module7, strIndexKey6, factoryInstanceFactory6, false, 4, null);
                        new Pair(module7, factoryInstanceFactory6);
                        AnonymousClass7 anonymousClass7 = new Function2<Scope, ParametersHolder, ISleepEditRepo>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.7
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final ISleepEditRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new SleepEditRepo();
                            }
                        };
                        Module module8 = scopeDSL.getModule();
                        Qualifier scopeQualifier7 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition7 = new BeanDefinition(scopeQualifier7, Reflection.getOrCreateKotlinClass(ISleepEditRepo.class), null, anonymousClass7, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeQualifier7);
                        FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
                        Module.saveMapping$default(module8, strIndexKey7, factoryInstanceFactory7, false, 4, null);
                        new Pair(module8, factoryInstanceFactory7);
                        AnonymousClass8 anonymousClass8 = new Function2<Scope, ParametersHolder, IBreathQualityDataSource>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.8
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final IBreathQualityDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new BreathQualityDataSource();
                            }
                        };
                        Module module9 = scopeDSL.getModule();
                        Qualifier scopeQualifier8 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition8 = new BeanDefinition(scopeQualifier8, Reflection.getOrCreateKotlinClass(IBreathQualityDataSource.class), null, anonymousClass8, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeQualifier8);
                        FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
                        Module.saveMapping$default(module9, strIndexKey8, factoryInstanceFactory8, false, 4, null);
                        new Pair(module9, factoryInstanceFactory8);
                        AnonymousClass9 anonymousClass9 = new Function2<Scope, ParametersHolder, IHMKeeper>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.9
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final IHMKeeper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new SleepUseHmKeeper();
                            }
                        };
                        Module module10 = scopeDSL.getModule();
                        Qualifier scopeQualifier9 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition9 = new BeanDefinition(scopeQualifier9, Reflection.getOrCreateKotlinClass(IHMKeeper.class), null, anonymousClass9, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeQualifier9);
                        FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
                        Module.saveMapping$default(module10, strIndexKey9, factoryInstanceFactory9, false, 4, null);
                        new Pair(module10, factoryInstanceFactory9);
                        AnonymousClass10 anonymousClass10 = new Function2<Scope, ParametersHolder, IRespRateRepo>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.1.10
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final IRespRateRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new SleepRespRateRepoImpl();
                            }
                        };
                        Module module11 = scopeDSL.getModule();
                        Qualifier scopeQualifier10 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition10 = new BeanDefinition(scopeQualifier10, Reflection.getOrCreateKotlinClass(IRespRateRepo.class), null, anonymousClass10, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeQualifier10);
                        FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition10);
                        Module.saveMapping$default(module11, strIndexKey10, factoryInstanceFactory10, false, 4, null);
                        new Pair(module11, factoryInstanceFactory10);
                    }
                });
                AnonymousClass2 anonymousClass2 = new Function2<Scope, ParametersHolder, IDeviceManager>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.2
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final IDeviceManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new DeviceManager();
                    }
                };
                Kind kind = Kind.Singleton;
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IDeviceManager.class), null, anonymousClass2, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory);
                }
                new Pair(module, singleInstanceFactory);
                AnonymousClass3 anonymousClass3 = new Function2<Scope, ParametersHolder, ISleepDayDataSource>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.3
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final ISleepDayDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new SleepDayDataSource();
                    }
                };
                BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISleepDayDataSource.class), null, anonymousClass3, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
                Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory2);
                }
                new Pair(module, singleInstanceFactory2);
                AnonymousClass4 anonymousClass4 = new Function2<Scope, ParametersHolder, ISleepStatisticDataSource>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.4
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final ISleepStatisticDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new SleepStatisticDataSourceImpl();
                    }
                };
                BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISleepStatisticDataSource.class), null, anonymousClass4, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
                Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory3);
                }
                new Pair(module, singleInstanceFactory3);
                AnonymousClass5 anonymousClass5 = new Function2<Scope, ParametersHolder, IAppFunctions>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.5
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final IAppFunctions invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new AppFunctionImpl();
                    }
                };
                BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IAppFunctions.class), null, anonymousClass5, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
                Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory4);
                }
                new Pair(module, singleInstanceFactory4);
                AnonymousClass6 anonymousClass6 = new Function2<Scope, ParametersHolder, IAppCacheData>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.6
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final IAppCacheData invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new AppCacheDataAmpl();
                    }
                };
                BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IAppCacheData.class), null, anonymousClass6, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
                Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory5);
                }
                new Pair(module, singleInstanceFactory5);
                AnonymousClass7 anonymousClass7 = new Function2<Scope, ParametersHolder, IManualDataSource>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.7
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final IManualDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new SleepManualDataSource();
                    }
                };
                BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IManualDataSource.class), null, anonymousClass7, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
                Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory6);
                }
                new Pair(module, singleInstanceFactory6);
                AnonymousClass8 anonymousClass8 = new Function2<Scope, ParametersHolder, ISleepDayPageSelectListener>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$sleepDataModule$1.8
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final ISleepDayPageSelectListener invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new ISleepDayPageSelectListener() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.sleepDataModule.1.8.1
                            @Override // com.huami.sleep.koin.ISleepDayPageSelectListener
                            public void onMainSelected(@NotNull String date) {
                                AppNotification.cancelSleepNotification(date);
                            }

                            @Override // com.huami.sleep.koin.ISleepDayPageSelectListener
                            public void onNapSelected(@NotNull String date) {
                                AppNotification.cancelNapNotification(date);
                            }
                        };
                    }
                };
                BeanDefinition beanDefinition7 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISleepDayPageSelectListener.class), null, anonymousClass8, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory7 = new SingleInstanceFactory<>(beanDefinition7);
                Module.saveMapping$default(module, strIndexKey7, singleInstanceFactory7, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory7);
                }
                new Pair(module, singleInstanceFactory7);
            }
        }, 1, null);
        sleepDataModule = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$snoreDataModule$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Module module) {
                invoke2(module);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Module module) {
                module.scope(QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), new Function1<ScopeDSL, Unit>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$snoreDataModule$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                        invoke2(scopeDSL);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                        C10001 c10001 = new Function2<Scope, ParametersHolder, UserInfo>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.snoreDataModule.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final UserInfo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new UserInfo(HMPersonInfo.getInstance().getUserInfo().getUserid());
                            }
                        };
                        Module module2 = scopeDSL.getModule();
                        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
                        Kind kind = Kind.Factory;
                        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(UserInfo.class), null, c10001, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeQualifier);
                        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                        Module.saveMapping$default(module2, strIndexKey, factoryInstanceFactory, false, 4, null);
                        new Pair(module2, factoryInstanceFactory);
                        AnonymousClass2 anonymousClass2 = new Function2<Scope, ParametersHolder, IAppResource>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt.snoreDataModule.1.1.2
                            @Override // kotlin.jvm.functions.Function2
                            @NotNull
                            public final IAppResource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                                return new AppResourceImpl();
                            }
                        };
                        Module module3 = scopeDSL.getModule();
                        Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
                        BeanDefinition beanDefinition2 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(IAppResource.class), null, anonymousClass2, kind, CollectionsKt__CollectionsKt.emptyList());
                        String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeQualifier2);
                        FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
                        Module.saveMapping$default(module3, strIndexKey2, factoryInstanceFactory2, false, 4, null);
                        new Pair(module3, factoryInstanceFactory2);
                    }
                });
                AnonymousClass2 anonymousClass2 = new Function2<Scope, ParametersHolder, IPageJumpManager>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$snoreDataModule$1.2
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final IPageJumpManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new SnorePageJumpManagerImpl();
                    }
                };
                Kind kind = Kind.Singleton;
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IPageJumpManager.class), null, anonymousClass2, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory);
                }
                new Pair(module, singleInstanceFactory);
                AnonymousClass3 anonymousClass3 = new Function2<Scope, ParametersHolder, IPageStatusAnalyticsManager>() { // from class: com.xiaomi.hm.health.sleep.koin.SleepDataModuleKt$snoreDataModule$1.3
                    @Override // kotlin.jvm.functions.Function2
                    @NotNull
                    public final IPageStatusAnalyticsManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                        return new SnorePageStatusAnalyticsManagerIImpl();
                    }
                };
                BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IPageStatusAnalyticsManager.class), null, anonymousClass3, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
                SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
                Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
                if (module.getCreatedAtStart()) {
                    module.getEagerInstances().add(singleInstanceFactory2);
                }
                new Pair(module, singleInstanceFactory2);
            }
        }, 1, null);
        snoreDataModule = moduleModule$default2;
        sleepDataModules = new Module[]{moduleModule$default, moduleModule$default2, KoinExtKt.getSleepInternalDataModule(), KoinExtKt.getSleepViewModel()};
    }

    private static final /* synthetic */ <T> T getInUserData(Scope scope, Qualifier qualifier) {
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object getInUserData$default(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), SleepDataScopeNames.SLEEP_DATA, QualifierKt.named(SleepDataScopeNames.SLEEP_DATA), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Module getSleepDataModule() {
        return sleepDataModule;
    }

    @NotNull
    public static final Module[] getSleepDataModules() {
        return sleepDataModules;
    }

    @NotNull
    public static final Module getSnoreDataModule() {
        return snoreDataModule;
    }
}
