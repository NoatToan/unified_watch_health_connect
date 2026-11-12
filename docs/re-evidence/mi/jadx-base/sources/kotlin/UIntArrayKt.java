package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UIntArrayKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final int[] UIntArray(int i, Function1<? super Integer, UInt> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = init.invoke2(Integer.valueOf(i2)).m1033unboximpl();
        }
        return UIntArray.m1036constructorimpl(iArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: uintArrayOf--ajY-9A, reason: not valid java name */
    private static final int[] m1052uintArrayOfajY9A(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
