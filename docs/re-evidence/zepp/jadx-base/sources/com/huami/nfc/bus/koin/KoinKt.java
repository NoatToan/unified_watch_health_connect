package com.huami.nfc.bus.koin;

import com.huami.nfc.base.ApiWrapperKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.bus.HuamiWebApi;
import com.huami.nfc.bus.SnowballAppletWebApi;
import com.huami.nfc.bus.SnowballWebApi;
import com.huami.nfc.bus.XiaomiAppletWebApi;
import com.huami.nfc.bus.XiaomiWebApi;
import com.huami.nfc.bus.api.IHuamiWebApi;
import com.huami.nfc.bus.api.ISnowballWebApi;
import com.huami.nfc.bus.api.IXiaomiWebApi;
import com.huami.nfc.bus.service.HuamiService;
import com.huami.nfc.bus.service.SnowballService;
import com.huami.nfc.bus.service.XiaomiService;
import com.huami.nfc.web.InitRequestTask;
import com.huami.nfc.web.server.ProtocolServer;
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
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getBusModule", "()Lorg/koin/core/module/Module;", "busModule", "nfc-bus_release"}, k = 2, mv = {1, 5, 1})
public final class KoinKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.nfc.bus.koin.KoinKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/bus/service/HuamiService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0502a extends Lambda implements Function2<Scope, ParametersHolder, HuamiService> {
            public static final C0502a a = new C0502a();

            public C0502a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HuamiService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (HuamiService) ((Retrofit) scope.get(Reflection.getOrCreateKotlinClass(Retrofit.class), null, null)).create(HuamiService.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/bus/service/SnowballService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, SnowballService> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SnowballService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (SnowballService) ((Retrofit) scope.get(Reflection.getOrCreateKotlinClass(Retrofit.class), null, null)).create(SnowballService.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/bus/service/XiaomiService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, XiaomiService> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final XiaomiService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (XiaomiService) ((Retrofit) scope.get(Reflection.getOrCreateKotlinClass(Retrofit.class), null, null)).create(XiaomiService.class);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/bus/api/IHuamiWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, IHuamiWebApi> {
            public static final d a = new d();

            /* JADX INFO: renamed from: com.huami.nfc.bus.koin.KoinKt$a$d$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/bus/api/IHuamiWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0503a extends Lambda implements Function0<IHuamiWebApi> {
                public final /* synthetic */ IHuamiWebApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0503a(IHuamiWebApi iHuamiWebApi) {
                    super(0);
                    this.a = iHuamiWebApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IHuamiWebApi getA() {
                    return this.a;
                }
            }

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IHuamiWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (IHuamiWebApi) ApiWrapperKt.wrapperLogAndAnalysis$default(false, new C0503a(new HuamiWebApiWrapperWithLogcat(new HuamiWebApi((HuamiService) scope.get(Reflection.getOrCreateKotlinClass(HuamiService.class), null, null), (ProtocolServer) scope.get(Reflection.getOrCreateKotlinClass(ProtocolServer.class), null, null)))), 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/bus/api/IXiaomiWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, IXiaomiWebApi> {
            public static final e a = new e();

            /* JADX INFO: renamed from: com.huami.nfc.bus.koin.KoinKt$a$e$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/bus/api/IXiaomiWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0504a extends Lambda implements Function0<IXiaomiWebApi> {
                public final /* synthetic */ IXiaomiWebApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0504a(IXiaomiWebApi iXiaomiWebApi) {
                    super(0);
                    this.a = iXiaomiWebApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IXiaomiWebApi getA() {
                    return this.a;
                }
            }

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IXiaomiWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (IXiaomiWebApi) ApiWrapperKt.wrapperLogAndAnalysis$default(false, new C0504a(new XiaomiWebApiWrapperWithLogcat(new XiaomiWebApi((XiaomiService) scope.get(Reflection.getOrCreateKotlinClass(XiaomiService.class), null, null), (ProtocolServer) scope.get(Reflection.getOrCreateKotlinClass(ProtocolServer.class), null, null), new XiaomiAppletWebApi((InitRequestTask) scope.get(Reflection.getOrCreateKotlinClass(InitRequestTask.class), null, null)), (INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null)))), 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/bus/api/ISnowballWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, ISnowballWebApi> {
            public static final f a = new f();

            /* JADX INFO: renamed from: com.huami.nfc.bus.koin.KoinKt$a$f$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/bus/api/ISnowballWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0505a extends Lambda implements Function0<ISnowballWebApi> {
                public final /* synthetic */ ISnowballWebApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0505a(ISnowballWebApi iSnowballWebApi) {
                    super(0);
                    this.a = iSnowballWebApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ISnowballWebApi getA() {
                    return this.a;
                }
            }

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ISnowballWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (ISnowballWebApi) ApiWrapperKt.wrapperLogAndAnalysis$default(false, new C0505a(new SnowballWebApiWrapperWithLogcat(new SnowballWebApi((SnowballService) scope.get(Reflection.getOrCreateKotlinClass(SnowballService.class), null, null), new SnowballAppletWebApi((InitRequestTask) scope.get(Reflection.getOrCreateKotlinClass(InitRequestTask.class), null, null)), (INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null)))), 1, null);
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
            C0502a c0502a = C0502a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HuamiService.class), null, c0502a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(SnowballService.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(XiaomiService.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            d dVar = d.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IHuamiWebApi.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory4 = new SingleInstanceFactory<>(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, singleInstanceFactory4, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory4);
            }
            new Pair(module, singleInstanceFactory4);
            e eVar = e.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IXiaomiWebApi.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory5 = new SingleInstanceFactory<>(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, singleInstanceFactory5, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory5);
            }
            new Pair(module, singleInstanceFactory5);
            f fVar = f.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISnowballWebApi.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory6 = new SingleInstanceFactory<>(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, singleInstanceFactory6, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory6);
            }
            new Pair(module, singleInstanceFactory6);
        }
    }

    @NotNull
    public static final Module getBusModule() {
        return a;
    }
}
