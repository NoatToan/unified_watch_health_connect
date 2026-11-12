package com.huami.xiaopeng.repo.di;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.nfc.ble.IDeviceApi;
import com.huami.nfc.ble.NfcBleApi;
import com.huami.nfc.car.api.CarApi;
import com.huami.nfc.web.NfcDevice;
import com.huami.xiaopeng.repo.device.XpDeviceSyncApi;
import com.huami.xiaopeng.repo.device.XpDeviceSyncImpl;
import com.huami.xiaopeng.repo.event.XpEvent;
import com.huami.xiaopeng.repo.event.XpEventApi;
import com.huami.xiaopeng.repo.exception.XpExceptionHandler;
import com.huami.xiaopeng.repo.exception.XpExceptionHandlerApi;
import com.huami.xiaopeng.repo.log.XpLogKt;
import com.huami.xiaopeng.repo.repo.XiaopengCardCheckRepo;
import com.huami.xiaopeng.repo.repo.XiaopengCardCheckRepoImpl;
import com.huami.xiaopeng.repo.repo.XiaopengCardRepo;
import com.huami.xiaopeng.repo.repo.XiaopengCardRepoImpl;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarCheckViewModel;
import com.huami.xiaopeng.repo.viewmodel.XiaopengCarViewModel;
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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0019\u0010\u000b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\"\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007\")\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"", XiaopengModuleKt.XP_DEVICE_PROVIDER, "Ljava/lang/String;", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getXiaopengViewModelModule", "()Lorg/koin/core/module/Module;", "xiaopengViewModelModule", "b", "getXiaopengRepoModule", "xiaopengRepoModule", "c", "getXiaopengCommonModule", "xiaopengCommonModule", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "getXiaopengModules", "()Ljava/util/ArrayList;", "xiaopengModules", "xiaopeng-repo_release"}, k = 2, mv = {1, 5, 1})
public final class XiaopengModuleKt {

    @NotNull
    public static final String XP_DEVICE_PROVIDER = "XP_DEVICE_PROVIDER";

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

        /* JADX INFO: renamed from: com.huami.xiaopeng.repo.di.XiaopengModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/exception/XpExceptionHandlerApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0715a extends Lambda implements Function2<Scope, ParametersHolder, XpExceptionHandlerApi> {
            public static final C0715a a = new C0715a();

            public C0715a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XpExceptionHandlerApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XpExceptionHandler();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/event/XpEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, XpEventApi> {
            public static final b a = new b();

            /* JADX INFO: renamed from: com.huami.xiaopeng.repo.di.XiaopengModuleKt$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/xiaopeng/repo/event/XpEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0716a extends Lambda implements Function0<XpEventApi> {
                public final /* synthetic */ XpEventApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0716a(XpEventApi xpEventApi) {
                    super(0);
                    this.a = xpEventApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final XpEventApi getA() {
                    return this.a;
                }
            }

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XpEventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (XpEventApi) XpLogKt.xpLogAndAnalysis("XpEventApi", new C0716a(new XpEvent((NfcDevice) scope.get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null))));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/device/XpDeviceSyncApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, XpDeviceSyncApi> {
            public static final c a = new c();

            /* JADX INFO: renamed from: com.huami.xiaopeng.repo.di.XiaopengModuleKt$a$c$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/xiaopeng/repo/device/XpDeviceSyncApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0717a extends Lambda implements Function0<XpDeviceSyncApi> {
                public final /* synthetic */ XpDeviceSyncApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0717a(XpDeviceSyncApi xpDeviceSyncApi) {
                    super(0);
                    this.a = xpDeviceSyncApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final XpDeviceSyncApi getA() {
                    return this.a;
                }
            }

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XpDeviceSyncApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (XpDeviceSyncApi) XpLogKt.xpLogAndAnalysis("XpDeviceSyncApi", new C0717a(new XpDeviceSyncImpl((IDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(IDeviceApi.class), null, null), (SeAppletApi) scope.get(Reflection.getOrCreateKotlinClass(SeAppletApi.class), null, null), (NfcDevice) scope.get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null), (NfcBleApi) scope.get(Reflection.getOrCreateKotlinClass(NfcBleApi.class), null, null))));
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
            C0715a c0715a = C0715a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XpExceptionHandlerApi.class), null, c0715a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XpEventApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XpDeviceSyncApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/repo/XiaopengCardRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, XiaopengCardRepo> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaopengCardRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaopengCardRepoImpl((CarApi) scope.get(Reflection.getOrCreateKotlinClass(CarApi.class), null, null), (XpEventApi) scope.get(Reflection.getOrCreateKotlinClass(XpEventApi.class), null, null), (XpDeviceSyncApi) scope.get(Reflection.getOrCreateKotlinClass(XpDeviceSyncApi.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.xiaopeng.repo.di.XiaopengModuleKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/repo/XiaopengCardCheckRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0718b extends Lambda implements Function2<Scope, ParametersHolder, XiaopengCardCheckRepo> {
            public static final C0718b a = new C0718b();

            public C0718b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaopengCardCheckRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaopengCardCheckRepoImpl();
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
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XiaopengCardRepo.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            C0718b c0718b = C0718b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XiaopengCardCheckRepo.class), null, c0718b, kind, CollectionsKt__CollectionsKt.emptyList());
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, XiaopengCarViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaopengCarViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaopengCarViewModel((XiaopengCardRepo) scope.get(Reflection.getOrCreateKotlinClass(XiaopengCardRepo.class), null, null), (XpExceptionHandlerApi) scope.get(Reflection.getOrCreateKotlinClass(XpExceptionHandlerApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/xiaopeng/repo/viewmodel/XiaopengCarCheckViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, XiaopengCarCheckViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaopengCarCheckViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new XiaopengCarCheckViewModel((XiaopengCardCheckRepo) scope.get(Reflection.getOrCreateKotlinClass(XiaopengCardCheckRepo.class), null, null), (XpExceptionHandlerApi) scope.get(Reflection.getOrCreateKotlinClass(XpExceptionHandlerApi.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(XiaopengCarViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(XiaopengCarCheckViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
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
    public static final Module getXiaopengCommonModule() {
        return c;
    }

    @NotNull
    public static final ArrayList<Module> getXiaopengModules() {
        return d;
    }

    @NotNull
    public static final Module getXiaopengRepoModule() {
        return b;
    }

    @NotNull
    public static final Module getXiaopengViewModelModule() {
        return a;
    }
}
