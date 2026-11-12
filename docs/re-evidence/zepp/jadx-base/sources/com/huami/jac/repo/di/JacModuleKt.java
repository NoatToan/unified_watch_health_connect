package com.huami.jac.repo.di;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.jac.repo.device.JacDeviceSyncApi;
import com.huami.jac.repo.device.JacDeviceSyncImpl;
import com.huami.jac.repo.event.JacEvent;
import com.huami.jac.repo.event.JacEventApi;
import com.huami.jac.repo.exception.JacExceptionHandler;
import com.huami.jac.repo.exception.JacExceptionHandlerApi;
import com.huami.jac.repo.log.JacLogKt;
import com.huami.jac.repo.repo.JacCardCheckRepo;
import com.huami.jac.repo.repo.JacCardCheckRepoImpl;
import com.huami.jac.repo.repo.JacCardRepo;
import com.huami.jac.repo.repo.JacCardRepoImpl;
import com.huami.jac.repo.viewmodel.JacCarCheckViewModel;
import com.huami.jac.repo.viewmodel.JacCarViewModel;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.car.api.DefaultCarApi;
import com.huami.nfc.web.NfcDevice;
import java.util.ArrayList;
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
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0019\u0010\u000b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\")\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", JacModuleKt.JAC_DEVICE_PROVIDER, "Ljava/lang/String;", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getJacViewModelModule", "()Lorg/koin/core/module/Module;", "jacViewModelModule", "b", "getJacRepoModule", "jacRepoModule", "c", "getJacCommonModule", "jacCommonModule", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "getJacModules", "()Ljava/util/ArrayList;", "jacModules", "jac-repo_release"}, k = 2, mv = {1, 5, 1})
public final class JacModuleKt {

    @NotNull
    public static final String JAC_DEVICE_PROVIDER = "JAC_DEVICE_PROVIDER";

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module b;

    @NotNull
    private static final Module c;

    @NotNull
    private static final ArrayList<Module> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.jac.repo.di.JacModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/exception/JacExceptionHandlerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0451a extends Lambda implements Function2<Scope, ParametersHolder, JacExceptionHandlerApi> {
            public static final C0451a a = new C0451a();

            public C0451a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacExceptionHandlerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JacExceptionHandler();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/event/JacEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, JacEventApi> {
            public static final b a = new b();

            /* JADX INFO: renamed from: com.huami.jac.repo.di.JacModuleKt$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/repo/event/JacEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0452a extends Lambda implements Function0<JacEventApi> {
                public final /* synthetic */ JacEventApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0452a(JacEventApi jacEventApi) {
                    super(0);
                    this.a = jacEventApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JacEventApi getA() {
                    return this.a;
                }
            }

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacEventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (JacEventApi) JacLogKt.jacLogAndAnalysis("JacEventApi", new C0452a(new JacEvent((NfcDevice) scope.get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null))));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/device/JacDeviceSyncApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, JacDeviceSyncApi> {
            public static final c a = new c();

            /* JADX INFO: renamed from: com.huami.jac.repo.di.JacModuleKt$a$c$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/jac/repo/device/JacDeviceSyncApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0453a extends Lambda implements Function0<JacDeviceSyncApi> {
                public final /* synthetic */ JacDeviceSyncApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0453a(JacDeviceSyncApi jacDeviceSyncApi) {
                    super(0);
                    this.a = jacDeviceSyncApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final JacDeviceSyncApi getA() {
                    return this.a;
                }
            }

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacDeviceSyncApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (JacDeviceSyncApi) JacLogKt.jacLogAndAnalysis("JacDeviceSyncApi", new C0453a(new JacDeviceSyncImpl((IDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(IDeviceApi.class), null, null), (SeAppletApi) scope.get(Reflection.getOrCreateKotlinClass(SeAppletApi.class), null, null), (NfcDevice) scope.get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null), (NfcBleApi) scope.get(Reflection.getOrCreateKotlinClass(NfcBleApi.class), null, null))));
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
            C0451a c0451a = C0451a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JacExceptionHandlerApi.class), null, c0451a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JacEventApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JacDeviceSyncApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/repo/JacCardRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, JacCardRepo> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacCardRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JacCardRepoImpl((NfcDevice) scope.get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null), (SeInfoApi) scope.get(Reflection.getOrCreateKotlinClass(SeInfoApi.class), null, null), (DefaultCarApi) scope.get(Reflection.getOrCreateKotlinClass(DefaultCarApi.class), null, null), (JacEventApi) scope.get(Reflection.getOrCreateKotlinClass(JacEventApi.class), null, null), (JacDeviceSyncApi) scope.get(Reflection.getOrCreateKotlinClass(JacDeviceSyncApi.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.jac.repo.di.JacModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/repo/JacCardCheckRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0454b extends Lambda implements Function2<Scope, ParametersHolder, JacCardCheckRepo> {
            public static final C0454b a = new C0454b();

            public C0454b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacCardCheckRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JacCardCheckRepoImpl();
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JacCardRepo.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0454b c0454b = C0454b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(JacCardCheckRepo.class), null, c0454b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/viewmodel/JacCarViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, JacCarViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacCarViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JacCarViewModel((JacCardRepo) scope.get(Reflection.getOrCreateKotlinClass(JacCardRepo.class), null, null), (JacExceptionHandlerApi) scope.get(Reflection.getOrCreateKotlinClass(JacExceptionHandlerApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/jac/repo/viewmodel/JacCarCheckViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, JacCarCheckViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JacCarCheckViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JacCarCheckViewModel((JacCardCheckRepo) scope.get(Reflection.getOrCreateKotlinClass(JacCardCheckRepo.class), null, null), (JacExceptionHandlerApi) scope.get(Reflection.getOrCreateKotlinClass(JacExceptionHandlerApi.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(JacCarViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(JacCarCheckViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, c.a, 1, null);
        a = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, b.a, 1, null);
        b = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, a.a, 1, null);
        c = moduleModule$default3;
        d = CollectionsKt__CollectionsKt.arrayListOf(moduleModule$default, moduleModule$default2, moduleModule$default3);
    }

    @NotNull
    public static final Module getJacCommonModule() {
        return c;
    }

    @NotNull
    public static final ArrayList<Module> getJacModules() {
        return d;
    }

    @NotNull
    public static final Module getJacRepoModule() {
        return b;
    }

    @NotNull
    public static final Module getJacViewModelModule() {
        return a;
    }
}
