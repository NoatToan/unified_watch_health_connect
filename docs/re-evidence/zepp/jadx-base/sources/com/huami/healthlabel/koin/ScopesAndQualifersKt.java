package com.huami.healthlabel.koin;

import com.huami.healthlabel.db.LabelDb;
import com.huami.healthlabel.entry.MasterData;
import com.huami.healthlabel.web.HttpInteraction;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0006\u0010\t\u001a\u00020\u0000¨\u0006\n"}, d2 = {"Lorg/koin/core/Koin;", "Lorg/koin/core/scope/Scope;", "labelScope", "Lcom/huami/healthlabel/entry/MasterData;", "masterData", "Lcom/huami/healthlabel/web/HttpInteraction;", "httpInteraction", "Lcom/huami/healthlabel/db/LabelDb;", "labelDb", "getKoin", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class ScopesAndQualifersKt {
    @NotNull
    public static final Koin getKoin() {
        return GlobalContext.INSTANCE.get();
    }

    @NotNull
    public static final HttpInteraction httpInteraction(@NotNull Scope scope) {
        return (HttpInteraction) labelScope(scope).get(Reflection.getOrCreateKotlinClass(HttpInteraction.class), null, null);
    }

    @NotNull
    public static final LabelDb labelDb(@NotNull Scope scope) {
        return (LabelDb) labelScope(scope).get(Reflection.getOrCreateKotlinClass(LabelDb.class), null, null);
    }

    @NotNull
    public static final Scope labelScope(@NotNull Koin koin) {
        return Koin.getOrCreateScope$default(koin, LabelScopeNames.HEALTH_LABEL, QualifierKt.named(LabelScopeNames.HEALTH_LABEL), null, 4, null);
    }

    @NotNull
    public static final MasterData masterData(@NotNull Scope scope) {
        return (MasterData) labelScope(scope).get(Reflection.getOrCreateKotlinClass(MasterData.class), null, null);
    }

    @NotNull
    public static final LabelDb labelDb(@NotNull Koin koin) {
        return (LabelDb) labelScope(koin).get(Reflection.getOrCreateKotlinClass(LabelDb.class), null, null);
    }

    @NotNull
    public static final Scope labelScope(@NotNull Scope scope) {
        return labelScope(scope.getKoin());
    }

    @NotNull
    public static final MasterData masterData(@NotNull Koin koin) {
        return (MasterData) labelScope(koin).get(Reflection.getOrCreateKotlinClass(MasterData.class), null, null);
    }
}
