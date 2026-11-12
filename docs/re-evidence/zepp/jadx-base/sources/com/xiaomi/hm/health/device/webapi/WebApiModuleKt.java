package com.xiaomi.hm.health.device.webapi;

import com.xiaomi.hm.health.device.webapi.userevent.UserEventApiImpl;
import com.xiaomi.hm.health.device.webapi.userevent.UserEventApiUrlProvider;
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

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/WebApiDelegate;", "apiDelegate", "Lorg/koin/core/module/Module;", "getWebApiModule", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class WebApiModuleKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ WebApiDelegate a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WebApiModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/webapi/UserEventApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0888a extends Lambda implements Function2<Scope, ParametersHolder, UserEventApi> {
            public final /* synthetic */ Function0<String> a;
            public final /* synthetic */ Function0<String> b;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WebApiModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0889a extends Lambda implements Function0<String> {
                public final /* synthetic */ Function0<String> a;
                public final /* synthetic */ Function0<String> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0889a(Function0<String> function0, Function0<String> function1) {
                    super(0);
                    this.a = function0;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return ((Object) this.a.invoke()) + "users/" + ((Object) this.b.invoke()) + "/events";
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.webapi.WebApiModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "eventType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<String, String> {
                public final /* synthetic */ Function0<String> a;
                public final /* synthetic */ Function0<String> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Function0<String> function0, Function0<String> function1) {
                    super(1);
                    this.a = function0;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull String str) {
                    return ((Object) this.a.invoke()) + "users/" + ((Object) this.b.invoke()) + "/event/" + str;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0888a(Function0<String> function0, Function0<String> function1) {
                super(2);
                this.a = function0;
                this.b = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserEventApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserEventApiImpl(new UserEventApiUrlProvider(new C0889a(this.a, this.b), new b(this.a, this.b)));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ WebApiDelegate a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WebApiDelegate webApiDelegate) {
                super(0);
                this.a = webApiDelegate;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.a.host();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ WebApiDelegate a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WebApiDelegate webApiDelegate) {
                super(0);
                this.a = webApiDelegate;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return this.a.userId();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebApiDelegate webApiDelegate) {
            super(1);
            this.a = webApiDelegate;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0888a c0888a = new C0888a(new b(this.a), new c(this.a));
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(UserEventApi.class), null, c0888a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
        }
    }

    @NotNull
    public static final Module getWebApiModule(@NotNull WebApiDelegate webApiDelegate) {
        return ModuleKt.module$default(false, new a(webApiDelegate), 1, null);
    }
}
