package com.xiaomi.hm.health.relation;

import com.huami.account.service.AccountService;
import com.huami.relatives.FriendsAndFamilyInject;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\b8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/relation/RelationExternalContainer;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/relatives/FriendsAndFamilyInject;", "a", "Lkotlin/Lazy;", "getFRIENDS_AND_FAMILY_INJECT", "()Lcom/huami/relatives/FriendsAndFamilyInject;", "FRIENDS_AND_FAMILY_INJECT", "Lcom/huami/account/service/AccountService;", "b", "getACCOUNT_SERVICE", "()Lcom/huami/account/service/AccountService;", "ACCOUNT_SERVICE", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class RelationExternalContainer implements KoinComponent {

    @NotNull
    public static final RelationExternalContainer INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy FRIENDS_AND_FAMILY_INJECT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy ACCOUNT_SERVICE;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final RelationExternalContainer relationExternalContainer = new RelationExternalContainer();
        INSTANCE = relationExternalContainer;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        FRIENDS_AND_FAMILY_INJECT = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FriendsAndFamilyInject>() { // from class: com.xiaomi.hm.health.relation.RelationExternalContainer$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.relatives.FriendsAndFamilyInject, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FriendsAndFamilyInject invoke() {
                KoinComponent koinComponent = relationExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FriendsAndFamilyInject.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        ACCOUNT_SERVICE = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AccountService>() { // from class: com.xiaomi.hm.health.relation.RelationExternalContainer$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.account.service.AccountService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AccountService invoke() {
                KoinComponent koinComponent = relationExternalContainer;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AccountService.class), objArr2, objArr3);
            }
        });
    }

    private RelationExternalContainer() {
    }

    @NotNull
    public final AccountService getACCOUNT_SERVICE() {
        return (AccountService) ACCOUNT_SERVICE.getValue();
    }

    @NotNull
    public final FriendsAndFamilyInject getFRIENDS_AND_FAMILY_INJECT() {
        return (FriendsAndFamilyInject) FRIENDS_AND_FAMILY_INJECT.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
