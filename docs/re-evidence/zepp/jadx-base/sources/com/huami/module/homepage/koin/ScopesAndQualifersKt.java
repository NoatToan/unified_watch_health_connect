package com.huami.module.homepage.koin;

import com.huami.module.homepage.cards.sort.repo.HomeCardRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\b\u0010\u0007\u001a\u00020\u0000H\u0000¨\u0006\b"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "homePageScope", "", "userId", "Lcom/huami/module/homepage/cards/sort/repo/HomeCardRepo;", "homeCardRepo", "getKoin", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {
    @NotNull
    public static final Koin getKoin() {
        return GlobalContext.INSTANCE.get();
    }

    @NotNull
    public static final HomeCardRepo homeCardRepo(@NotNull Koin koin) {
        return (HomeCardRepo) homePageScope(koin).get(Reflection.getOrCreateKotlinClass(HomeCardRepo.class), null, null);
    }

    @NotNull
    public static final Scope homePageScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, "HomePage", QualifierKt.named("HomePage"), null, 4, null);
    }

    @NotNull
    public static final String userId(@NotNull Koin koin) {
        return (String) homePageScope(koin).get(Reflection.getOrCreateKotlinClass(String.class), null, null);
    }

    @NotNull
    public static final Scope homePageScope(@NotNull Scope scope) {
        return homePageScope(scope.getKoin());
    }

    @NotNull
    public static final String userId(@NotNull Scope scope) {
        return (String) homePageScope(scope).get(Reflection.getOrCreateKotlinClass(String.class), null, null);
    }
}
