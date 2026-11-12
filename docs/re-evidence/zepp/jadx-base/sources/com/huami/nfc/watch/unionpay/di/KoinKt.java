package com.huami.nfc.watch.unionpay.di;

import com.huami.nfc.base.ApiWrapperKt;
import com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi;
import com.huami.nfc.watch.unionpay.api.impl.WatchUnionpayWebApiImpl;
import com.huami.nfc.watch.unionpay.api.impl.WatchUnionpayWebApiWithLog;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getWatchUnionpayModule", "()Lorg/koin/core/module/Module;", "watchUnionpayModule", "nfc-watch-unionpay_release"}, k = 2, mv = {1, 5, 1})
public final class KoinKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.nfc.watch.unionpay.di.KoinKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0515a extends Lambda implements Function2<Scope, ParametersHolder, WatchUnionpayWebApi> {
            public static final C0515a a = new C0515a();

            /* JADX INFO: renamed from: com.huami.nfc.watch.unionpay.di.KoinKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/nfc/watch/unionpay/api/WatchUnionpayWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0516a extends Lambda implements Function0<WatchUnionpayWebApi> {
                public final /* synthetic */ WatchUnionpayWebApi a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0516a(WatchUnionpayWebApi watchUnionpayWebApi) {
                    super(0);
                    this.a = watchUnionpayWebApi;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final WatchUnionpayWebApi invoke() {
                    return this.a;
                }
            }

            public C0515a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WatchUnionpayWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return (WatchUnionpayWebApi) ApiWrapperKt.wrapperLogAndAnalysis$default(false, new C0516a(new WatchUnionpayWebApiWithLog(new WatchUnionpayWebApiImpl())), 1, null);
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
            C0515a c0515a = C0515a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WatchUnionpayWebApi.class), null, c0515a, kind, CollectionsKt__CollectionsKt.emptyList());
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
    public static final Module getWatchUnionpayModule() {
        return a;
    }
}
