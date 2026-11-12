package com.huami.account.di;

import com.huami.account.HMLoginManager;
import com.huami.account.lifecycle.AccountLifecycleDispatcher;
import com.huami.account.lifecycle.AccountLifecycleRegistry;
import com.huami.account.service.lifecycle.AccountLifecycle;
import com.huami.account.service.lifecycle.AccountLifecycleOwner;
import com.huami.account.service.lifecycle.LoginStateType;
import com.huami.account.service.lifecycle.LogoutStateType;
import com.huami.account.service.proxy.KoinProxyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0016\u0010\u000b\u001a\u00020\b8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "dispatchAccountStateOnBoot", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getLifecycleModule", "()Lorg/koin/core/module/Module;", "lifecycleModule", "Lcom/huami/account/lifecycle/AccountLifecycleDispatcher;", "getAccountLifecycleDispatcher", "()Lcom/huami/account/lifecycle/AccountLifecycleDispatcher;", "accountLifecycleDispatcher", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class LifecycleModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.huami.account.di.LifecycleModuleKt$lifecycleModule$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/account/lifecycle/AccountLifecycleDispatcher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, AccountLifecycleDispatcher> {
            public final /* synthetic */ AccountLifecycleRegistry a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AccountLifecycleRegistry accountLifecycleRegistry) {
                super(2);
                this.a = accountLifecycleRegistry;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AccountLifecycleDispatcher invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            final AccountLifecycleRegistry accountLifecycleRegistry = new AccountLifecycleRegistry();
            a aVar = new a(accountLifecycleRegistry);
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AccountLifecycleDispatcher.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            Function2<Scope, ParametersHolder, AccountLifecycleOwner> function2 = new Function2<Scope, ParametersHolder, AccountLifecycleOwner>() { // from class: com.huami.account.di.LifecycleModuleKt$lifecycleModule$1.2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AccountLifecycleOwner invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    final AccountLifecycleRegistry accountLifecycleRegistry2 = accountLifecycleRegistry;
                    return new AccountLifecycleOwner() { // from class: com.huami.account.di.LifecycleModuleKt.lifecycleModule.1.2.1
                        @Override // com.huami.account.service.lifecycle.AccountLifecycleOwner
                        @NotNull
                        public AccountLifecycle getLifecycle() {
                            return accountLifecycleRegistry2;
                        }
                    };
                }
            };
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AccountLifecycleOwner.class), null, function2, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
        }
    }, 1, null);

    public static final void dispatchAccountStateOnBoot() {
        if (HMLoginManager.isUnInit()) {
            getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.Logout(LogoutStateType.BOOT));
        } else if (HMLoginManager.isNewUser()) {
            getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.NewUser(true));
        } else if (HMLoginManager.isExistingUser()) {
            getAccountLifecycleDispatcher().dispatch(new AccountLifecycle.State.LoggedIn(LoginStateType.BOOT));
        }
    }

    @NotNull
    public static final AccountLifecycleDispatcher getAccountLifecycleDispatcher() {
        return (AccountLifecycleDispatcher) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountLifecycleDispatcher.class), null, null);
    }

    @NotNull
    public static final Module getLifecycleModule() {
        return a;
    }
}
