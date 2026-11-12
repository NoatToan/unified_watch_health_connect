package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T a;
    private final T b;

    @NotNull
    private final String c;

    @NotNull
    private final ClassId d;

    public IncompatibleVersionErrorData(T t, T t2, @NotNull String str, @NotNull ClassId classId) {
        this.a = t;
        this.b = t2;
        this.c = str;
        this.d = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.a, incompatibleVersionErrorData.a) && Intrinsics.areEqual(this.b, incompatibleVersionErrorData.b) && Intrinsics.areEqual(this.c, incompatibleVersionErrorData.c) && Intrinsics.areEqual(this.d, incompatibleVersionErrorData.d);
    }

    public int hashCode() {
        T t = this.a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.b;
        return ((((iHashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", expectedVersion=" + this.b + ", filePath=" + this.c + ", classId=" + this.d + ')';
    }
}
