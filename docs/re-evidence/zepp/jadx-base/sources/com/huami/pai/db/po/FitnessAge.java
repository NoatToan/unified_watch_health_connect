package com.huami.pai.db.po;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.db.DayDateConverter;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@TypeConverters({DayDateConverter.class})
@Entity
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/huami/pai/db/po/FitnessAge;", "", "Ljava/util/Date;", "component1", "", "component2", "component3", "", "component4", "date", "age", "vo2max", "source", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "b", "F", "getAge", "()F", "c", "getVo2max", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "<init>", "(Ljava/util/Date;FFLjava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FitnessAge {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @NotNull
    private final Date date;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float age;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float vo2max;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String source;

    public FitnessAge(@NotNull Date date, float f, float f2, @NotNull String str) {
        this.date = date;
        this.age = f;
        this.vo2max = f2;
        this.source = str;
    }

    public static /* synthetic */ FitnessAge copy$default(FitnessAge fitnessAge, Date date, float f, float f2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            date = fitnessAge.date;
        }
        if ((i & 2) != 0) {
            f = fitnessAge.age;
        }
        if ((i & 4) != 0) {
            f2 = fitnessAge.vo2max;
        }
        if ((i & 8) != 0) {
            str = fitnessAge.source;
        }
        return fitnessAge.copy(date, f, f2, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getVo2max() {
        return this.vo2max;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final FitnessAge copy(@NotNull Date date, float age, float vo2max, @NotNull String source) {
        return new FitnessAge(date, age, vo2max, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessAge)) {
            return false;
        }
        FitnessAge fitnessAge = (FitnessAge) other;
        return Intrinsics.areEqual(this.date, fitnessAge.date) && Intrinsics.areEqual((Object) Float.valueOf(this.age), (Object) Float.valueOf(fitnessAge.age)) && Intrinsics.areEqual((Object) Float.valueOf(this.vo2max), (Object) Float.valueOf(fitnessAge.vo2max)) && Intrinsics.areEqual(this.source, fitnessAge.source);
    }

    public final float getAge() {
        return this.age;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final float getVo2max() {
        return this.vo2max;
    }

    public int hashCode() {
        return (((((this.date.hashCode() * 31) + Float.floatToIntBits(this.age)) * 31) + Float.floatToIntBits(this.vo2max)) * 31) + this.source.hashCode();
    }

    @NotNull
    public String toString() {
        return "FitnessAge(date=" + this.date + ", age=" + this.age + ", vo2max=" + this.vo2max + ", source=" + this.source + ")";
    }
}
