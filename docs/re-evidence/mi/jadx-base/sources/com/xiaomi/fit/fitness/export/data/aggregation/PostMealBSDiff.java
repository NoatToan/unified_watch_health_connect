package com.xiaomi.fit.fitness.export.data.aggregation;

import androidx.health.connect.client.records.MealType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;", "", MealType.BREAKFAST, "", MealType.LUNCH, MealType.DINNER, "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getBreakfast", "()Ljava/lang/Float;", "setBreakfast", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getLunch", "setLunch", "getDinner", "setDinner", "isEmpty", "", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;", "equals", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostMealBSDiff {

    @Nullable
    private Float breakfast;

    @Nullable
    private Float dinner;

    @Nullable
    private Float lunch;

    public PostMealBSDiff() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PostMealBSDiff copy$default(PostMealBSDiff postMealBSDiff, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = postMealBSDiff.breakfast;
        }
        if ((i & 2) != 0) {
            f2 = postMealBSDiff.lunch;
        }
        if ((i & 4) != 0) {
            f3 = postMealBSDiff.dinner;
        }
        return postMealBSDiff.copy(f, f2, f3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getBreakfast() {
        return this.breakfast;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getLunch() {
        return this.lunch;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getDinner() {
        return this.dinner;
    }

    @NotNull
    public final PostMealBSDiff copy(@Nullable Float breakfast, @Nullable Float lunch, @Nullable Float dinner) {
        return new PostMealBSDiff(breakfast, lunch, dinner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostMealBSDiff)) {
            return false;
        }
        PostMealBSDiff postMealBSDiff = (PostMealBSDiff) other;
        return Intrinsics.areEqual((Object) this.breakfast, (Object) postMealBSDiff.breakfast) && Intrinsics.areEqual((Object) this.lunch, (Object) postMealBSDiff.lunch) && Intrinsics.areEqual((Object) this.dinner, (Object) postMealBSDiff.dinner);
    }

    @Nullable
    public final Float getBreakfast() {
        return this.breakfast;
    }

    @Nullable
    public final Float getDinner() {
        return this.dinner;
    }

    @Nullable
    public final Float getLunch() {
        return this.lunch;
    }

    public int hashCode() {
        Float f = this.breakfast;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.lunch;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.dinner;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.breakfast == null && this.lunch == null && this.dinner == null;
    }

    public final void setBreakfast(@Nullable Float f) {
        this.breakfast = f;
    }

    public final void setDinner(@Nullable Float f) {
        this.dinner = f;
    }

    public final void setLunch(@Nullable Float f) {
        this.lunch = f;
    }

    @NotNull
    public String toString() {
        return "PostMealBSDiff(breakfast=" + this.breakfast + ", lunch=" + this.lunch + ", dinner=" + this.dinner + ")";
    }

    public PostMealBSDiff(@Nullable Float f, @Nullable Float f2, @Nullable Float f3) {
        this.breakfast = f;
        this.lunch = f2;
        this.dinner = f3;
    }

    public /* synthetic */ PostMealBSDiff(Float f, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3);
    }
}
