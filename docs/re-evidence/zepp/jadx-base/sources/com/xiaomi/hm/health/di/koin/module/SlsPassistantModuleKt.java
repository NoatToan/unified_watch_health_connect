package com.xiaomi.hm.health.di.koin.module;

import com.huami.sleepassistant.apilib.bean.Myself;
import com.huami.sleepassistant.apilib.koin.SleepAssistantQualifierNames;
import com.huami.sleepassistant.apilib.koin.SleepAssistantScopeNames;
import com.huami.sleepassistant.lib.navigation.ExternalNavigator;
import com.xiaomi.hm.health.di.koin.scope.ScopesKt;
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
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSlsPassistantExternalModule", "()Lorg/koin/core/module/Module;", "slsPassistantExternalModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SlsPassistantModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.SlsPassistantModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0924a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0924a a = new C0924a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.SlsPassistantModuleKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleepassistant/apilib/bean/Myself;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0925a extends Lambda implements Function2<Scope, ParametersHolder, Myself> {
                public static final C0925a a = new C0925a();

                public C0925a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Myself invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    Scope scopeUserScope = ScopesKt.userScope(scope.getKoin());
                    String str = (String) scopeUserScope.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("UserId"), null);
                    Function0 function0 = (Function0) scopeUserScope.get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Nickname"), null);
                    Function0 function1 = (Function0) scopeUserScope.get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Avatar"), null);
                    Function0 function2 = (Function0) scopeUserScope.get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Gender"), null);
                    Function0 function3 = (Function0) scopeUserScope.get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Location"), null);
                    return new Myself(str, function0, function1, (Function0) scopeUserScope.get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named(MiFitQualifiers.SUMMARY), null), function2, function3, (Function0) scopeUserScope.get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Type"), null));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.SlsPassistantModuleKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, String> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return (String) ScopesKt.userScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("Host"), null);
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.module.SlsPassistantModuleKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sleepassistant/lib/navigation/ExternalNavigator;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, ExternalNavigator> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ExternalNavigator invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SleepServiceNavigator();
                }
            }

            public C0924a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0925a c0925a = C0925a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(Myself.class), null, c0925a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                StringQualifier stringQualifierNamed = QualifierKt.named(SleepAssistantQualifierNames.HOST);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(String.class), stringQualifierNamed, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), stringQualifierNamed, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ExternalNavigator.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
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
            module.scope(QualifierKt.named(SleepAssistantScopeNames.SLEEP_ASSISTANT), C0924a.a);
        }
    }

    @NotNull
    public static final Module getSlsPassistantExternalModule() {
        return a;
    }
}
