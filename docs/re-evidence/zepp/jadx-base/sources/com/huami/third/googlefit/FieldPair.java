package com.huami.third.googlefit;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.fitness.data.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/huami/third/googlefit/FieldPair;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "Lcom/google/android/gms/fitness/data/Field;", "component1", "component2", "()Ljava/lang/Object;", "filed", "value", "copy", "(Lcom/google/android/gms/fitness/data/Field;Ljava/lang/Object;)Lcom/huami/third/googlefit/FieldPair;", "", "hashCode", "other", "", "equals", "a", "Lcom/google/android/gms/fitness/data/Field;", "getFiled", "()Lcom/google/android/gms/fitness/data/Field;", "b", "Ljava/lang/Object;", "getValue", "<init>", "(Lcom/google/android/gms/fitness/data/Field;Ljava/lang/Object;)V", "googlefit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class FieldPair<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Field filed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final T value;

    public FieldPair(@NotNull Field field, T t) {
        this.filed = field;
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldPair copy$default(FieldPair fieldPair, Field field, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            field = fieldPair.filed;
        }
        if ((i & 2) != 0) {
            obj = fieldPair.value;
        }
        return fieldPair.copy(field, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Field getFiled() {
        return this.filed;
    }

    public final T component2() {
        return this.value;
    }

    @NotNull
    public final FieldPair<T> copy(@NotNull Field filed, T value) {
        return new FieldPair<>(filed, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldPair)) {
            return false;
        }
        FieldPair fieldPair = (FieldPair) other;
        return Intrinsics.areEqual(this.filed, fieldPair.filed) && Intrinsics.areEqual(this.value, fieldPair.value);
    }

    @NotNull
    public final Field getFiled() {
        return this.filed;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        Field field = this.filed;
        int iHashCode = (field != null ? field.hashCode() : 0) * 31;
        T t = this.value;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FieldPair(filed=" + this.filed + ", value=" + this.value + ')';
    }
}
