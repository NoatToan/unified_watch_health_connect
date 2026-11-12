package com.huami.pai.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003JC\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\f\u0010\u001aR\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/pai/dto/Myself;", "", "", "component1", "Lkotlin/Function0;", "", "component2", "", "component3", "", "component4", "userId", "isMale", "getAge", "getBmi", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "c", "getGetAge", GoogleApiAvailabilityLight.a, "getGetBmi", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Myself {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Boolean> isMale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Integer> getAge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final Function0<Float> getBmi;

    public Myself(@NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function0<Integer> function1, @NotNull Function0<Float> function2) {
        this.userId = str;
        this.isMale = function0;
        this.getAge = function1;
        this.getBmi = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Myself copy$default(Myself myself, String str, Function0 function0, Function0 function1, Function0 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = myself.userId;
        }
        if ((i & 2) != 0) {
            function0 = myself.isMale;
        }
        if ((i & 4) != 0) {
            function1 = myself.getAge;
        }
        if ((i & 8) != 0) {
            function2 = myself.getBmi;
        }
        return myself.copy(str, function0, function1, function2);
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
    public final Function0<Integer> component3() {
        return this.getAge;
    }

    @NotNull
    public final Function0<Float> component4() {
        return this.getBmi;
    }

    @NotNull
    public final Myself copy(@NotNull String userId, @NotNull Function0<Boolean> isMale, @NotNull Function0<Integer> getAge, @NotNull Function0<Float> getBmi) {
        return new Myself(userId, isMale, getAge, getBmi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Myself)) {
            return false;
        }
        Myself myself = (Myself) other;
        return Intrinsics.areEqual(this.userId, myself.userId) && Intrinsics.areEqual(this.isMale, myself.isMale) && Intrinsics.areEqual(this.getAge, myself.getAge) && Intrinsics.areEqual(this.getBmi, myself.getBmi);
    }

    @NotNull
    public final Function0<Integer> getGetAge() {
        return this.getAge;
    }

    @NotNull
    public final Function0<Float> getGetBmi() {
        return this.getBmi;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.isMale.hashCode()) * 31) + this.getAge.hashCode()) * 31) + this.getBmi.hashCode();
    }

    @NotNull
    public final Function0<Boolean> isMale() {
        return this.isMale;
    }

    @NotNull
    public String toString() {
        return "Myself(userId=" + this.userId + ", isMale=" + this.isMale + ", getAge=" + this.getAge + ", getBmi=" + this.getBmi + ")";
    }
}
