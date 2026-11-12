package com.huami.sleepassistant.lib.service;

import com.huami.sleepassistant.servicelib.service.SleepAidService;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/service/SleepService;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "a", "Lkotlin/Lazy;", "getSLEEP_AID_SERVICE", "()Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "SLEEP_AID_SERVICE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepService implements KoinComponent {

    @NotNull
    public static final SleepService INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy SLEEP_AID_SERVICE;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final SleepService sleepService = new SleepService();
        INSTANCE = sleepService;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        SLEEP_AID_SERVICE = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SleepAidService>() { // from class: com.huami.sleepassistant.lib.service.SleepService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.sleepassistant.servicelib.service.SleepAidService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepAidService invoke() {
                KoinComponent koinComponent = sleepService;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SleepAidService.class), qualifier, objArr);
            }
        });
    }

    private SleepService() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final SleepAidService getSLEEP_AID_SERVICE() {
        return (SleepAidService) SLEEP_AID_SERVICE.getValue();
    }
}
