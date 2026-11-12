package com.huami.snore.ui.koin;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.core.cloud.api.RemoteVoiceDataApi;
import com.huami.snore.core.cloud.api.RemoteVoiceDataImpl;
import com.huami.snore.core.cloud.api.VoiceWebApi;
import com.huami.snore.core.cloud.api.VoiceWebApiImpl;
import com.huami.snore.core.db.VoiceRecorderDB;
import com.huami.snore.core.repo.IVoiceRecorderRepo;
import com.huami.snore.core.repo.LocalVoiceDataApi;
import com.huami.snore.core.repo.LocalVoiceDataImpl;
import com.huami.snore.core.repo.VoiceRecorderRepoImpl;
import com.huami.snore.ui.viewmodel.SnoreListViewModel;
import com.huami.snore.ui.viewmodel.SnoreMonitorViewModel;
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
import org.koin.android.ext.koin.ModuleExtKt;
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
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\"\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007\"\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "Lorg/koin/core/module/Module;", "Lorg/koin/core/module/Module;", "viewModelModule", "b", "repoModule", "c", "roomModule", "", GoogleApiAvailabilityLight.a, "[Lorg/koin/core/module/Module;", "getSnoreModules", "()[Lorg/koin/core/module/Module;", "snoreModules", "snore_release"}, k = 2, mv = {1, 5, 1})
public final class MoudlesKt {

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module b;

    @NotNull
    private static final Module c;

    @NotNull
    private static final Module[] d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.snore.ui.koin.MoudlesKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0602a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0602a a = new C0602a();

            /* JADX INFO: renamed from: com.huami.snore.ui.koin.MoudlesKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/core/cloud/api/VoiceWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0603a extends Lambda implements Function2<Scope, ParametersHolder, VoiceWebApi> {
                public static final C0603a a = new C0603a();

                public C0603a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final VoiceWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new VoiceWebApiImpl();
                }
            }

            /* JADX INFO: renamed from: com.huami.snore.ui.koin.MoudlesKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/core/repo/LocalVoiceDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, LocalVoiceDataApi> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LocalVoiceDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new LocalVoiceDataImpl((VoiceRecorderDB) scope.get(Reflection.getOrCreateKotlinClass(VoiceRecorderDB.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.snore.ui.koin.MoudlesKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/core/cloud/api/RemoteVoiceDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, RemoteVoiceDataApi> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final RemoteVoiceDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RemoteVoiceDataImpl((VoiceWebApi) scope.get(Reflection.getOrCreateKotlinClass(VoiceWebApi.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.huami.snore.ui.koin.MoudlesKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, IVoiceRecorderRepo> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IVoiceRecorderRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new VoiceRecorderRepoImpl((LocalVoiceDataApi) scope.get(Reflection.getOrCreateKotlinClass(LocalVoiceDataApi.class), null, null), (RemoteVoiceDataApi) scope.get(Reflection.getOrCreateKotlinClass(RemoteVoiceDataApi.class), null, null));
                }
            }

            public C0602a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0603a c0603a = C0603a.a;
                Module module = scopeDSL.getModule();
                Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
                Kind kind = Kind.Factory;
                BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(VoiceWebApi.class), null, c0603a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeQualifier);
                FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
                new Pair(module, factoryInstanceFactory);
                b bVar = b.a;
                Module module2 = scopeDSL.getModule();
                Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(LocalVoiceDataApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeQualifier2);
                FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
                Module.saveMapping$default(module2, strIndexKey2, factoryInstanceFactory2, false, 4, null);
                new Pair(module2, factoryInstanceFactory2);
                c cVar = c.a;
                Module module3 = scopeDSL.getModule();
                Qualifier scopeQualifier3 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeQualifier3, Reflection.getOrCreateKotlinClass(RemoteVoiceDataApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeQualifier3);
                FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
                Module.saveMapping$default(module3, strIndexKey3, factoryInstanceFactory3, false, 4, null);
                new Pair(module3, factoryInstanceFactory3);
                d dVar = d.a;
                Module module4 = scopeDSL.getModule();
                Qualifier scopeQualifier4 = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeQualifier4, Reflection.getOrCreateKotlinClass(IVoiceRecorderRepo.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeQualifier4);
                FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
                Module.saveMapping$default(module4, strIndexKey4, factoryInstanceFactory4, false, 4, null);
                new Pair(module4, factoryInstanceFactory4);
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
            module.scope(QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), C0602a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/core/db/VoiceRecorderDB;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, VoiceRecorderDB> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final VoiceRecorderDB invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return VoiceRecorderDB.INSTANCE.init(ModuleExtKt.androidApplication(scope));
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(VoiceRecorderDB.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
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
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/ui/viewmodel/SnoreMonitorViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, SnoreMonitorViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnoreMonitorViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SnoreMonitorViewModel((IVoiceRecorderRepo) Koin.getOrCreateScope$default(scope.getKoin(), SnoreDataScopeNames.SNORE_DATA, QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IVoiceRecorderRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, SnoreListViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnoreListViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SnoreListViewModel((IVoiceRecorderRepo) Koin.getOrCreateScope$default(scope.getKoin(), SnoreDataScopeNames.SNORE_DATA, QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), null, 4, null).get(Reflection.getOrCreateKotlinClass(IVoiceRecorderRepo.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(SnoreMonitorViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SnoreListViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, c.a, 1, null);
        a = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, a.a, 1, null);
        b = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, b.a, 1, null);
        c = moduleModule$default3;
        d = new Module[]{moduleModule$default, moduleModule$default2, moduleModule$default3};
    }

    private static final /* synthetic */ <T> T a(Scope scope, Qualifier qualifier) {
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), SnoreDataScopeNames.SNORE_DATA, QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object b(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), SnoreDataScopeNames.SNORE_DATA, QualifierKt.named(SnoreDataScopeNames.SNORE_DATA), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Module[] getSnoreModules() {
        return d;
    }
}
