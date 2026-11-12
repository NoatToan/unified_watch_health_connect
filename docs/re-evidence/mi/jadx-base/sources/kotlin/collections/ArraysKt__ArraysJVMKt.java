package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class ArraysKt__ArraysJVMKt {
    @NotNull
    public static final <T> T[] arrayOfNulls(@NotNull T[] reference, int i) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i);
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @JvmName(name = "contentDeepHashCode")
    public static <T> int contentDeepHashCode(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @SinceKotlin(version = "1.3")
    public static final void copyOfRangeToIndexCheck(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        Intrinsics.reifiedOperationMarker(0, "T");
        return (T[]) new Object[0];
    }

    @InlineOnly
    private static final String toString(byte[] bArr, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] toTypedArray(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
