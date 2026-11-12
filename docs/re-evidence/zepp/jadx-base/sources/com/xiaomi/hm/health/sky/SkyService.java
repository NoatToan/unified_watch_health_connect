package com.xiaomi.hm.health.sky;

import com.huami.sky.service.SkyNavigation;
import com.huami.sky.service.SkyNotificationService;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/sky/SkyService;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/sky/service/SkyNavigation;", "a", "Lkotlin/Lazy;", "getSKY_NAVIGATION", "()Lcom/huami/sky/service/SkyNavigation;", "SKY_NAVIGATION", "Lcom/huami/sky/service/SkyNotificationService;", "b", "getSKY_NOTIFICATION", "()Lcom/huami/sky/service/SkyNotificationService;", "SKY_NOTIFICATION", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SkyService implements KoinComponent {

    @NotNull
    public static final SkyService INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy SKY_NAVIGATION;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy SKY_NOTIFICATION;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final SkyService skyService = new SkyService();
        INSTANCE = skyService;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        SKY_NAVIGATION = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SkyNavigation>() { // from class: com.xiaomi.hm.health.sky.SkyService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.service.SkyNavigation, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyNavigation invoke() {
                KoinComponent koinComponent = skyService;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SkyNavigation.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        SKY_NOTIFICATION = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<SkyNotificationService>() { // from class: com.xiaomi.hm.health.sky.SkyService$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sky.service.SkyNotificationService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyNotificationService invoke() {
                KoinComponent koinComponent = skyService;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SkyNotificationService.class), objArr2, objArr3);
            }
        });
    }

    private SkyService() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final SkyNavigation getSKY_NAVIGATION() {
        return (SkyNavigation) SKY_NAVIGATION.getValue();
    }

    @NotNull
    public final SkyNotificationService getSKY_NOTIFICATION() {
        return (SkyNotificationService) SKY_NOTIFICATION.getValue();
    }
}
