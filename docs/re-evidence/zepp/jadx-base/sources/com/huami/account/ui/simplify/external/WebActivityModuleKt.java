package com.huami.account.ui.simplify.external;

import com.huami.web.container.IWeb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWebModule", "()Lorg/koin/core/module/Module;", "webModule", "", "b", "[Lorg/koin/core/module/Module;", "getWebModules", "()[Lorg/koin/core/module/Module;", "webModules", "accountui-simplify_release"}, k = 2, mv = {1, 4, 1})
public final class WebActivityModuleKt {

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module[] b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/koin/core/module/Module;", "", "invoke", "(Lorg/koin/core/module/Module;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.account.ui.simplify.external.WebActivityModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/web/container/IWeb;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/web/container/IWeb;"}, k = 3, mv = {1, 4, 1})
        public static final class C0270a extends Lambda implements Function2<Scope, DefinitionParameters, IWeb> {
            public static final C0270a a = new C0270a();

            public C0270a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IWeb invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return new WebImpl();
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
            C0270a c0270a = C0270a.a;
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            BeanDefinition beanDefinition = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(IWeb.class));
            beanDefinition.setDefinition(c0270a);
            beanDefinition.setKind(kind);
            module.declareDefinition(beanDefinition, new Options(false, false));
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, false, a.a, 3, null);
        a = moduleModule$default;
        b = new Module[]{com.huami.web.container.di.WebActivityModuleKt.getWebViewServiceModule(), moduleModule$default};
    }

    @NotNull
    public static final Module getWebModule() {
        return a;
    }

    @NotNull
    public static final Module[] getWebModules() {
        return b;
    }
}
