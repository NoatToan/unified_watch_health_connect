package com.huami.nfc.car.di;

import com.huami.nfc.base.ApiWrapperKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.car.CarApiImpl;
import com.huami.nfc.car.CarApiImplWithLogcat;
import com.huami.nfc.car.CarAppletApiImpl;
import com.huami.nfc.car.CarInitRequestImpl;
import com.huami.nfc.car.DefaultCarApiImplWithLogcat;
import com.huami.nfc.car.api.CarApi;
import com.huami.nfc.car.api.DefaultCarApi;
import com.huami.nfc.web.DefaultApduScriptImpl;
import com.huami.nfc.web.InitRequestTaskImpl;
import com.huami.nfc.web.XiaoPengApduScriptImpl;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getCarModule", "()Lorg/koin/core/module/Module;", "carModule", "nfc-car_release"}, k = 2, mv = {1, 5, 1})
public final class KoinKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.nfc.car.di.KoinKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/car/api/CarApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0507a extends Lambda implements Function2<Scope, ParametersHolder, CarApi> {
            public static final C0507a a = new C0507a();

            /* JADX INFO: renamed from: com.huami.nfc.car.di.KoinKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/car/api/CarApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0508a extends Lambda implements Function0<CarApi> {
                public final /* synthetic */ CarApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0508a(CarApi carApi) {
                    super(0);
                    this.a = carApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final CarApi getA() {
                    return this.a;
                }
            }

            public C0507a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CarApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (CarApi) ApiWrapperKt.wrapperLogAndAnalysis$default(false, new C0508a(new CarApiImplWithLogcat(new CarApiImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null), new CarAppletApiImpl(new InitRequestTaskImpl(new CarInitRequestImpl(), new XiaoPengApduScriptImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null))))))), 1, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/car/api/DefaultCarApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DefaultCarApi> {
            public static final b a = new b();

            /* JADX INFO: renamed from: com.huami.nfc.car.di.KoinKt$a$b$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/car/api/DefaultCarApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0509a extends Lambda implements Function0<DefaultCarApi> {
                public final /* synthetic */ DefaultCarApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0509a(DefaultCarApi defaultCarApi) {
                    super(0);
                    this.a = defaultCarApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final DefaultCarApi getA() {
                    return this.a;
                }
            }

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DefaultCarApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (DefaultCarApi) ApiWrapperKt.wrapperLogAndAnalysis$default(false, new C0509a(new DefaultCarApiImplWithLogcat(new CarApiImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null), new CarAppletApiImpl(new InitRequestTaskImpl(new CarInitRequestImpl(), new DefaultApduScriptImpl((INfcChannel) scope.get(Reflection.getOrCreateKotlinClass(INfcChannel.class), null, null))))))), 1, null);
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
            C0507a c0507a = C0507a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(CarApi.class), null, c0507a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DefaultCarApi.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
        }
    }

    @NotNull
    public static final Module getCarModule() {
        return a;
    }
}
