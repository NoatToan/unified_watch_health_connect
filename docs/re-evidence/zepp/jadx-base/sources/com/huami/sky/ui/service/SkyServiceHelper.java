package com.huami.sky.ui.service;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.service.SkyNotificationService;
import com.huami.sky.service.SkyService;
import com.huami.sky.ui.navigation.HMAdNavigation;
import com.huami.sky.ui.navigation.HMUpdateManager;
import com.huami.web.service.WebViewService;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/service/SkyServiceHelper;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/sky/service/SkyService;", "a", "Lkotlin/Lazy;", "getSKY_SERVICE", "()Lcom/huami/sky/service/SkyService;", "SKY_SERVICE", "Lcom/huami/web/service/WebViewService;", "b", "getWEB_VIEW_SERVICE", "()Lcom/huami/web/service/WebViewService;", "WEB_VIEW_SERVICE", "Lcom/huami/sky/service/SkyNotificationService;", "c", "getSKY_NOTIFICATION_SERVICE", "()Lcom/huami/sky/service/SkyNotificationService;", "SKY_NOTIFICATION_SERVICE", "Lcom/huami/sky/ui/navigation/HMAdNavigation;", GoogleApiAvailabilityLight.a, "getHM_AD_NAVIGATION", "()Lcom/huami/sky/ui/navigation/HMAdNavigation;", "HM_AD_NAVIGATION", "Lcom/huami/sky/ui/navigation/HMUpdateManager;", "e", "getHM_UPDATE_MANAGER", "()Lcom/huami/sky/ui/navigation/HMUpdateManager;", "HM_UPDATE_MANAGER", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyServiceHelper implements KoinComponent {

    @NotNull
    public static final SkyServiceHelper INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy SKY_SERVICE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy WEB_VIEW_SERVICE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy SKY_NOTIFICATION_SERVICE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy HM_AD_NAVIGATION;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy HM_UPDATE_MANAGER;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final SkyServiceHelper skyServiceHelper = new SkyServiceHelper();
        INSTANCE = skyServiceHelper;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        SKY_SERVICE = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SkyService>() { // from class: com.huami.sky.ui.service.SkyServiceHelper$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.service.SkyService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyService invoke() {
                KoinComponent koinComponent = skyServiceHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SkyService.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        WEB_VIEW_SERVICE = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<WebViewService>() { // from class: com.huami.sky.ui.service.SkyServiceHelper$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.web.service.WebViewService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewService invoke() {
                KoinComponent koinComponent = skyServiceHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WebViewService.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        SKY_NOTIFICATION_SERVICE = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<SkyNotificationService>() { // from class: com.huami.sky.ui.service.SkyServiceHelper$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.service.SkyNotificationService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyNotificationService invoke() {
                KoinComponent koinComponent = skyServiceHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SkyNotificationService.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        HM_AD_NAVIGATION = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<HMAdNavigation>() { // from class: com.huami.sky.ui.service.SkyServiceHelper$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.ui.navigation.HMAdNavigation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HMAdNavigation invoke() {
                KoinComponent koinComponent = skyServiceHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HMAdNavigation.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        HM_UPDATE_MANAGER = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<HMUpdateManager>() { // from class: com.huami.sky.ui.service.SkyServiceHelper$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.ui.navigation.HMUpdateManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HMUpdateManager invoke() {
                KoinComponent koinComponent = skyServiceHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HMUpdateManager.class), objArr8, objArr9);
            }
        });
    }

    private SkyServiceHelper() {
    }

    @NotNull
    public final HMAdNavigation getHM_AD_NAVIGATION() {
        return (HMAdNavigation) HM_AD_NAVIGATION.getValue();
    }

    @NotNull
    public final HMUpdateManager getHM_UPDATE_MANAGER() {
        return (HMUpdateManager) HM_UPDATE_MANAGER.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final SkyNotificationService getSKY_NOTIFICATION_SERVICE() {
        return (SkyNotificationService) SKY_NOTIFICATION_SERVICE.getValue();
    }

    @NotNull
    public final SkyService getSKY_SERVICE() {
        return (SkyService) SKY_SERVICE.getValue();
    }

    @NotNull
    public final WebViewService getWEB_VIEW_SERVICE() {
        return (WebViewService) WEB_VIEW_SERVICE.getValue();
    }
}
