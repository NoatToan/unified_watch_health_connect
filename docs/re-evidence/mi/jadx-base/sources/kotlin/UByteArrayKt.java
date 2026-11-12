package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UByteArrayKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final byte[] UByteArray(int i, Function1<? super Integer, UByte> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = init.invoke2(Integer.valueOf(i2)).m954unboximpl();
        }
        return UByteArray.m957constructorimpl(bArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* JADX INFO: renamed from: ubyteArrayOf-GBYM_sE, reason: not valid java name */
    private static final byte[] m973ubyteArrayOfGBYM_sE(byte... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
