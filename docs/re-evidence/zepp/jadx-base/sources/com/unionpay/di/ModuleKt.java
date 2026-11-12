package com.unionpay.di;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.applet.api.SeInfoApi;
import com.huami.nfc.watch.unionpay.api.WatchUnionpayWebApi;
import com.huami.nfc.watch.unionpay.di.KoinKt;
import com.huami.nfc.web.NfcDevice;
import com.huami.wallet.common.config.NavigationConfig;
import com.huami.wallet.common.config.WebConfig;
import com.unionpay.api.WatchUnionpayDeviceApi;
import com.unionpay.repo.WatchUnionpayRepo;
import com.unionpay.repo.WatchUnionpayRepoImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0004\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003\"\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", "getUserId", "a", "Ljava/lang/String;", "WALLET_SCOPE_USER", "b", "WALLET_SCOPE_USER_ID", "Lorg/koin/core/module/Module;", "c", "Lorg/koin/core/module/Module;", "getRepoModule", "()Lorg/koin/core/module/Module;", "repoModule", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getWatchUnionpayModules", "()Ljava/util/List;", "watchUnionpayModules", "watch-unionpay_release"}, k = 2, mv = {1, 5, 1})
public final class ModuleKt {

    @NotNull
    private static final String a = "WALLET_USER";

    @NotNull
    private static final String b = "WALLET_USER_ID";

    @NotNull
    private static final Module c;

    @NotNull
    private static final List<Module> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.unionpay.di.ModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/unionpay/repo/WatchUnionpayRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0763a extends Lambda implements Function2<Scope, ParametersHolder, WatchUnionpayRepo> {
            public static final C0763a a = new C0763a();

            public C0763a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WatchUnionpayRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new WatchUnionpayRepoImpl((WatchUnionpayWebApi) scope.get(Reflection.getOrCreateKotlinClass(WatchUnionpayWebApi.class), null, null), (WatchUnionpayDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(WatchUnionpayDeviceApi.class), null, null), (SeInfoApi) scope.get(Reflection.getOrCreateKotlinClass(SeInfoApi.class), null, null), (WebConfig) scope.get(Reflection.getOrCreateKotlinClass(WebConfig.class), null, null), (NfcDevice) scope.get(Reflection.getOrCreateKotlinClass(NfcDevice.class), null, null), (NavigationConfig) scope.get(Reflection.getOrCreateKotlinClass(NavigationConfig.class), null, null));
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
            C0763a c0763a = C0763a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(WatchUnionpayRepo.class), null, c0763a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
        }
    }

    static {
        Module moduleModule$default = org.koin.dsl.ModuleKt.module$default(false, a.a, 1, null);
        c = moduleModule$default;
        d = CollectionsKt__CollectionsKt.mutableListOf(KoinKt.getWatchUnionpayModule(), moduleModule$default);
    }

    @NotNull
    public static final Module getRepoModule() {
        return c;
    }

    @NotNull
    public static final String getUserId() {
        return (String) Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), "WALLET_USER", QualifierKt.named("WALLET_USER"), null, 4, null).get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named("WALLET_USER_ID"), null);
    }

    @NotNull
    public static final List<Module> getWatchUnionpayModules() {
        return d;
    }
}
