package com.huami.training.dto;

import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.hm.health.HMIntentHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u0006\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/huami/training/dto/GenderPair;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "component2", "male", HMIntentHandler.NAME_FEMALE, "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/huami/training/dto/GenderPair;", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getMale", "b", "getFemale", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GenderPair<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final T male;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final T female;

    public GenderPair(T t, T t2) {
        this.male = t;
        this.female = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenderPair copy$default(GenderPair genderPair, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = genderPair.male;
        }
        if ((i & 2) != 0) {
            obj2 = genderPair.female;
        }
        return genderPair.copy(obj, obj2);
    }

    public final T component1() {
        return this.male;
    }

    public final T component2() {
        return this.female;
    }

    @NotNull
    public final GenderPair<T> copy(T male, T female) {
        return new GenderPair<>(male, female);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenderPair)) {
            return false;
        }
        GenderPair genderPair = (GenderPair) other;
        return Intrinsics.areEqual(this.male, genderPair.male) && Intrinsics.areEqual(this.female, genderPair.female);
    }

    public final T getFemale() {
        return this.female;
    }

    public final T getMale() {
        return this.male;
    }

    public int hashCode() {
        T t = this.male;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.female;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GenderPair(male=" + this.male + ", female=" + this.female + ')';
    }
}
