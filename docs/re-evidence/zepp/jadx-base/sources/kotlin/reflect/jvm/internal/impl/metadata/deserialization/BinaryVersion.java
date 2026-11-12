package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final int[] a;
    private final int b;
    private final int c;
    private final int d;

    @NotNull
    private final List<Integer> e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BinaryVersion(@NotNull int... iArr) {
        this.a = iArr;
        Integer orNull = ArraysKt___ArraysKt.getOrNull(iArr, 0);
        this.b = orNull == null ? -1 : orNull.intValue();
        Integer orNull2 = ArraysKt___ArraysKt.getOrNull(iArr, 1);
        this.c = orNull2 == null ? -1 : orNull2.intValue();
        Integer orNull3 = ArraysKt___ArraysKt.getOrNull(iArr, 2);
        this.d = orNull3 != null ? orNull3.intValue() : -1;
        this.e = iArr.length > 3 ? CollectionsKt___CollectionsKt.toList(ArraysKt___ArraysJvmKt.asList(iArr).subList(3, iArr.length)) : CollectionsKt__CollectionsKt.emptyList();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && Intrinsics.areEqual(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.b == binaryVersion.b && this.c == binaryVersion.c && this.d == binaryVersion.d && Intrinsics.areEqual(this.e, binaryVersion.e)) {
                return true;
            }
        }
        return false;
    }

    public final int getMajor() {
        return this.b;
    }

    public final int getMinor() {
        return this.c;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = i + (i * 31) + this.c;
        int i3 = i2 + (i2 * 31) + this.d;
        return i3 + (i3 * 31) + this.e.hashCode();
    }

    public final boolean isAtLeast(@NotNull BinaryVersion binaryVersion) {
        return isAtLeast(binaryVersion.b, binaryVersion.c, binaryVersion.d);
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.c;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.d <= i3;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion binaryVersion) {
        int i = this.b;
        if (i == 0) {
            if (binaryVersion.b == 0 && this.c == binaryVersion.c) {
                return true;
            }
        } else if (i == binaryVersion.b && this.c <= binaryVersion.c) {
            return true;
        }
        return false;
    }

    @NotNull
    public final int[] toArray() {
        return this.a;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int i2 = array[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt___CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }
}
