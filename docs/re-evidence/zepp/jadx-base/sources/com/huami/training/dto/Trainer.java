package com.huami.training.dto;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/training/dto/Trainer;", "", "", "component1", "Lkotlin/Function0;", "", "component2", "userId", "isMale", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Trainer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Boolean> isMale;

    public Trainer(@NotNull String str, @NotNull Function0<Boolean> function0) {
        this.userId = str;
        this.isMale = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Trainer copy$default(Trainer trainer, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trainer.userId;
        }
        if ((i & 2) != 0) {
            function0 = trainer.isMale;
        }
        return trainer.copy(str, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final Function0<Boolean> component2() {
        return this.isMale;
    }

    @NotNull
    public final Trainer copy(@NotNull String userId, @NotNull Function0<Boolean> isMale) {
        return new Trainer(userId, isMale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trainer)) {
            return false;
        }
        Trainer trainer = (Trainer) other;
        return Intrinsics.areEqual(this.userId, trainer.userId) && Intrinsics.areEqual(this.isMale, trainer.isMale);
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.isMale.hashCode();
    }

    @NotNull
    public final Function0<Boolean> isMale() {
        return this.isMale;
    }

    @NotNull
    public String toString() {
        return "Trainer(userId=" + this.userId + ", isMale=" + this.isMale + ')';
    }
}
