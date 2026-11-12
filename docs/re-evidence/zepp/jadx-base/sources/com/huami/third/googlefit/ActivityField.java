package com.huami.third.googlefit;

import com.google.android.gms.fitness.data.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/third/googlefit/ActivityField;", "", "", "toString", "Lcom/google/android/gms/fitness/data/Field;", "component1", "component2", "filed", "fitnessActivities", "copy", "", "hashCode", "other", "", "equals", "a", "Lcom/google/android/gms/fitness/data/Field;", "getFiled", "()Lcom/google/android/gms/fitness/data/Field;", "b", "Ljava/lang/String;", "getFitnessActivities", "()Ljava/lang/String;", "<init>", "(Lcom/google/android/gms/fitness/data/Field;Ljava/lang/String;)V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class ActivityField {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Field filed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fitnessActivities;

    public ActivityField(@NotNull Field field, @NotNull String str) {
        this.filed = field;
        this.fitnessActivities = str;
    }

    public static /* synthetic */ ActivityField copy$default(ActivityField activityField, Field field, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            field = activityField.filed;
        }
        if ((i & 2) != 0) {
            str = activityField.fitnessActivities;
        }
        return activityField.copy(field, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Field getFiled() {
        return this.filed;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFitnessActivities() {
        return this.fitnessActivities;
    }

    @NotNull
    public final ActivityField copy(@NotNull Field filed, @NotNull String fitnessActivities) {
        return new ActivityField(filed, fitnessActivities);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityField)) {
            return false;
        }
        ActivityField activityField = (ActivityField) other;
        return Intrinsics.areEqual(this.filed, activityField.filed) && Intrinsics.areEqual(this.fitnessActivities, activityField.fitnessActivities);
    }

    @NotNull
    public final Field getFiled() {
        return this.filed;
    }

    @NotNull
    public final String getFitnessActivities() {
        return this.fitnessActivities;
    }

    public int hashCode() {
        Field field = this.filed;
        int iHashCode = (field != null ? field.hashCode() : 0) * 31;
        String str = this.fitnessActivities;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActivityField(filed=" + this.filed + ", fitnessActivities='" + this.fitnessActivities + "')";
    }
}
