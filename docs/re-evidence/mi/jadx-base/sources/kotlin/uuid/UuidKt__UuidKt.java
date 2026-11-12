package kotlin.uuid;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n1#2:453\n*E\n"})
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkHyphenAt$UuidKt__UuidKt(String str, int i) {
        if (str.charAt(i) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i + ", but was '" + str.charAt(i) + '\'').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void formatBytesInto$UuidKt__UuidKt(long j, byte[] bArr, int i, int i2) {
        int i3 = i + (i2 * 2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) (255 & j)];
            bArr[i3 - 1] = (byte) i5;
            i3 -= 2;
            bArr[i3] = (byte) (i5 >> 8);
            j >>= 8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toByteArray$UuidKt__UuidKt(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) (j >>> ((7 - i2) * 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toLong$UuidKt__UuidKt(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidFromRandomBytes(@NotNull byte[] randomBytes) {
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        byte b2 = (byte) (randomBytes[6] & 15);
        randomBytes[6] = b2;
        randomBytes[6] = (byte) (b2 | 64);
        byte b3 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b3;
        randomBytes[8] = (byte) (b3 | 128);
        return Uuid.Companion.fromByteArray(randomBytes);
    }
}
