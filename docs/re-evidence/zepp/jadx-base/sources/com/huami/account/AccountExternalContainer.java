package com.huami.account;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.proxy.KoinComponentAdapter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/account/AccountExternalContainer;", "Lcom/huami/account/service/proxy/KoinComponentAdapter;", "Landroid/content/Context;", "a", "Lkotlin/Lazy;", "getAppContext", "()Landroid/content/Context;", "appContext", "Lcom/huami/account/IAccountDelegate;", "b", "getAccountDelegate", "()Lcom/huami/account/IAccountDelegate;", "accountDelegate", "Lcom/huami/account/ICommonDelegate;", "c", "getCommonDelegate", "()Lcom/huami/account/ICommonDelegate;", "commonDelegate", "Lcom/huami/account/IConfigDelegate;", GoogleApiAvailabilityLight.a, "getConfigDelegate", "()Lcom/huami/account/IConfigDelegate;", "configDelegate", "Lcom/huami/account/IDeviceTokenConfig;", "e", "getDeviceTokenDelegate", "()Lcom/huami/account/IDeviceTokenConfig;", "deviceTokenDelegate", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AccountExternalContainer implements KoinComponentAdapter {

    @NotNull
    public static final AccountExternalContainer INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy appContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy accountDelegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy commonDelegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy configDelegate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceTokenDelegate;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final AccountExternalContainer accountExternalContainer = new AccountExternalContainer();
        INSTANCE = accountExternalContainer;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        appContext = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<Context>() { // from class: com.huami.account.AccountExternalContainer$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Context invoke() {
                KoinComponent koinComponent = accountExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Context.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        accountDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<IAccountDelegate>() { // from class: com.huami.account.AccountExternalContainer$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.IAccountDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IAccountDelegate invoke() {
                KoinComponent koinComponent = accountExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IAccountDelegate.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        commonDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<ICommonDelegate>() { // from class: com.huami.account.AccountExternalContainer$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.ICommonDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ICommonDelegate invoke() {
                KoinComponent koinComponent = accountExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(ICommonDelegate.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        configDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<IConfigDelegate>() { // from class: com.huami.account.AccountExternalContainer$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.IConfigDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IConfigDelegate invoke() {
                KoinComponent koinComponent = accountExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IConfigDelegate.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        deviceTokenDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<IDeviceTokenConfig>() { // from class: com.huami.account.AccountExternalContainer$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.IDeviceTokenConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDeviceTokenConfig invoke() {
                KoinComponent koinComponent = accountExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDeviceTokenConfig.class), objArr8, objArr9);
            }
        });
    }

    private AccountExternalContainer() {
    }

    @NotNull
    public final IAccountDelegate getAccountDelegate() {
        return (IAccountDelegate) accountDelegate.getValue();
    }

    @NotNull
    public final Context getAppContext() {
        return (Context) appContext.getValue();
    }

    @NotNull
    public final ICommonDelegate getCommonDelegate() {
        return (ICommonDelegate) commonDelegate.getValue();
    }

    @NotNull
    public final IConfigDelegate getConfigDelegate() {
        return (IConfigDelegate) configDelegate.getValue();
    }

    @NotNull
    public final IDeviceTokenConfig getDeviceTokenDelegate() {
        return (IDeviceTokenConfig) deviceTokenDelegate.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }
}
