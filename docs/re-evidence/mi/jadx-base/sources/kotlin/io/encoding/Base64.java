package kotlin.io.encoding;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalEncodingApi
@SinceKotlin(version = "1.8")
public class Base64 {

    @NotNull
    private static final Base64 Mime;

    @NotNull
    private static final Base64 UrlSafe;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;

    @NotNull
    private final PaddingOption paddingOption;

    @NotNull
    public static final Default Default = new Default(null);

    @NotNull
    private static final byte[] mimeLineSeparatorSymbols = {HMProSyncDataBaseProfile.DATA_TYPE_PAI, 10};

    public static final class Default extends Base64 {
        public /* synthetic */ Default(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Base64 getMime() {
            return Base64.Mime;
        }

        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        @NotNull
        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Default() {
            boolean z = false;
            super(z, z, PaddingOption.PRESENT, null);
        }
    }

    @SinceKotlin(version = "2.0")
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        UrlSafe = new Base64(true, false, paddingOption);
        Mime = new Base64(false, true, paddingOption);
    }

    public /* synthetic */ Base64(boolean z, boolean z2, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, paddingOption);
    }

    private final void checkDestinationBounds(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException("destination offset: " + i2 + ", destination size: " + i);
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i2 + ", destination size: " + i + ", capacity needed: " + i3);
        }
    }

    private final void checkPaddingIsAllowed(int i) {
        if (this.paddingOption != PaddingOption.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.decode(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0082 A[SYNTHETIC] */
    private final int decodeImpl(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.isUrlSafe ? Base64Kt.base64UrlDecodeMap : Base64Kt.base64DecodeMap;
        int i7 = -8;
        int i8 = i;
        int iHandlePaddingSymbol = i2;
        int i9 = -8;
        int i10 = 0;
        while (true) {
            if (iHandlePaddingSymbol >= i3) {
                z = false;
                break;
            }
            if (i9 != i7 || iHandlePaddingSymbol + 3 >= i3) {
                i4 = bArr[iHandlePaddingSymbol] & 255;
                i5 = iArr[i4];
                if (i5 < 0) {
                    iHandlePaddingSymbol++;
                    i10 = (i10 << 6) | i5;
                    i6 = i9 + 6;
                    if (i6 >= 0) {
                        bArr2[i8] = (byte) (i10 >>> i6);
                        i10 &= (1 << i6) - 1;
                        i9 -= 2;
                        i8++;
                    } else {
                        i9 = i6;
                    }
                } else {
                    if (i5 == -2) {
                        iHandlePaddingSymbol = handlePaddingSymbol(bArr, iHandlePaddingSymbol, i3, i9);
                        z = true;
                        break;
                    }
                    if (this.isMimeScheme) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid symbol '");
                        sb.append((char) i4);
                        sb.append("'(");
                        String string = Integer.toString(i4, CharsKt__CharJVMKt.checkRadix(8));
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        sb.append(string);
                        sb.append(") at index ");
                        sb.append(iHandlePaddingSymbol);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    iHandlePaddingSymbol++;
                }
            } else {
                int i11 = iHandlePaddingSymbol + 4;
                int i12 = (iArr[bArr[iHandlePaddingSymbol + 1] & 255] << 12) | (iArr[bArr[iHandlePaddingSymbol] & 255] << 18) | (iArr[bArr[iHandlePaddingSymbol + 2] & 255] << 6) | iArr[bArr[iHandlePaddingSymbol + 3] & 255];
                if (i12 >= 0) {
                    bArr2[i8] = (byte) (i12 >> 16);
                    int i13 = i8 + 2;
                    bArr2[i8 + 1] = (byte) (i12 >> 8);
                    i8 += 3;
                    bArr2[i13] = (byte) i12;
                    iHandlePaddingSymbol = i11;
                } else {
                    i4 = bArr[iHandlePaddingSymbol] & 255;
                    i5 = iArr[i4];
                    if (i5 < 0) {
                        iHandlePaddingSymbol++;
                        i10 = (i10 << 6) | i5;
                        i6 = i9 + 6;
                        if (i6 >= 0) {
                            bArr2[i8] = (byte) (i10 >>> i6);
                            i10 &= (1 << i6) - 1;
                            i9 -= 2;
                            i8++;
                        } else {
                            i9 = i6;
                        }
                    } else {
                        if (i5 == -2) {
                            iHandlePaddingSymbol = handlePaddingSymbol(bArr, iHandlePaddingSymbol, i3, i9);
                            z = true;
                            break;
                        }
                        if (this.isMimeScheme) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid symbol '");
                            sb2.append((char) i4);
                            sb2.append("'(");
                            String string2 = Integer.toString(i4, CharsKt__CharJVMKt.checkRadix(8));
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            sb2.append(string2);
                            sb2.append(") at index ");
                            sb2.append(iHandlePaddingSymbol);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        iHandlePaddingSymbol++;
                    }
                }
            }
            i7 = -8;
        }
        if (i9 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i9 != -8 && !z && this.paddingOption == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i10 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(bArr, iHandlePaddingSymbol, i3);
        if (iSkipIllegalSymbolsIfMime >= i3) {
            return i8 - i;
        }
        int i14 = bArr[iSkipIllegalSymbolsIfMime] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i14);
        sb3.append("'(");
        String string3 = Integer.toString(i14, CharsKt__CharJVMKt.checkRadix(8));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb3.append(string3);
        sb3.append(") at index ");
        sb3.append(iSkipIllegalSymbolsIfMime - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encode(bArr, i, i2);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i, i2);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i, i2);
    }

    private final int handlePaddingSymbol(byte[] bArr, int i, int i2, int i3) {
        if (i3 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i);
        }
        if (i3 == -6) {
            checkPaddingIsAllowed(i);
        } else if (i3 == -4) {
            checkPaddingIsAllowed(i);
            i = skipIllegalSymbolsIfMime(bArr, i + 1, i2);
            if (i == i2 || bArr[i] != 61) {
                throw new IllegalArgumentException("Missing one pad character at index " + i);
            }
        } else if (i3 != -2) {
            throw new IllegalStateException("Unreachable".toString());
        }
        return i + 1;
    }

    private final boolean shouldPadOnEncode() {
        PaddingOption paddingOption = this.paddingOption;
        return paddingOption == PaddingOption.PRESENT || paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    private final int skipIllegalSymbolsIfMime(byte[] bArr, int i, int i2) {
        if (!this.isMimeScheme) {
            return i;
        }
        while (i < i2) {
            if (Base64Kt.base64DecodeMap[bArr[i] & 255] != -1) {
                return i;
            }
            i++;
        }
        return i;
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b2 : source) {
            sb.append((char) b2);
        }
        return sb.toString();
    }

    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), i, i2);
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            char cCharAt = source.charAt(i);
            if (cCharAt <= 255) {
                bArr[i3] = (byte) cCharAt;
                i3++;
            } else {
                bArr[i3] = 63;
                i3++;
            }
            i++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int i, int i2, int i3) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, i);
    }

    @NotNull
    public final byte[] decode(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, i, i2);
        int iDecodeSize$kotlin_stdlib = decodeSize$kotlin_stdlib(source, i, i2);
        byte[] bArr = new byte[iDecodeSize$kotlin_stdlib];
        if (decodeImpl(source, bArr, 0, i, i2) == iDecodeSize$kotlin_stdlib) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i2, i3);
        checkDestinationBounds(destination.length, i, decodeSize$kotlin_stdlib(source, i2, i3));
        return decodeImpl(source, destination, i, i2, i3);
    }

    public final int decodeSize$kotlin_stdlib(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i + ", endIndex: " + i2);
        }
        if (this.isMimeScheme) {
            while (i < i2) {
                int i4 = Base64Kt.base64DecodeMap[source[i] & 255];
                if (i4 < 0) {
                    if (i4 == -2) {
                        i3 -= i2 - i;
                        break;
                    }
                    i3--;
                }
                i++;
            }
        } else if (source[i2 - 1] == 61) {
            i3 = source[i2 + (-2)] == 61 ? i3 - 2 : i3 - 1;
        }
        return (int) ((((long) i3) * ((long) 6)) / ((long) 8));
    }

    @NotNull
    public final String encode(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, i, i2), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, i, i2, i3);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int i, int i2, int i3) {
        int i4 = i2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i4, i3);
        checkDestinationBounds(destination.length, i, encodeSize$kotlin_stdlib(i3 - i4));
        byte[] bArr = this.isUrlSafe ? Base64Kt.base64UrlEncodeMap : Base64Kt.base64EncodeMap;
        int i5 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i6 = i;
        while (i4 + 2 < i3) {
            int iMin = Math.min((i3 - i4) / 3, i5);
            for (int i7 = 0; i7 < iMin; i7++) {
                int i8 = source[i4] & 255;
                int i9 = i4 + 2;
                int i10 = source[i4 + 1] & 255;
                i4 += 3;
                int i11 = (i10 << 8) | (i8 << 16) | (source[i9] & 255);
                destination[i6] = bArr[i11 >>> 18];
                destination[i6 + 1] = bArr[(i11 >>> 12) & 63];
                int i12 = i6 + 3;
                destination[i6 + 2] = bArr[(i11 >>> 6) & 63];
                i6 += 4;
                destination[i12] = bArr[i11 & 63];
            }
            if (iMin == i5 && i4 != i3) {
                int i13 = i6 + 1;
                byte[] bArr2 = mimeLineSeparatorSymbols;
                destination[i6] = bArr2[0];
                i6 += 2;
                destination[i13] = bArr2[1];
            }
        }
        int i14 = i3 - i4;
        if (i14 == 1) {
            int i15 = i4 + 1;
            int i16 = (source[i4] & 255) << 4;
            destination[i6] = bArr[i16 >>> 6];
            int i17 = i6 + 2;
            destination[i6 + 1] = bArr[i16 & 63];
            if (shouldPadOnEncode()) {
                int i18 = i6 + 3;
                destination[i17] = padSymbol;
                i6 += 4;
                destination[i18] = padSymbol;
                i4 = i15;
            } else {
                i4 = i15;
                i6 = i17;
            }
        } else if (i14 == 2) {
            int i19 = i4 + 1;
            int i20 = source[i4] & 255;
            i4 += 2;
            int i21 = ((source[i19] & 255) << 2) | (i20 << 10);
            destination[i6] = bArr[i21 >>> 12];
            destination[i6 + 1] = bArr[(i21 >>> 6) & 63];
            int i22 = i6 + 3;
            destination[i6 + 2] = bArr[i21 & 63];
            if (shouldPadOnEncode()) {
                i6 += 4;
                destination[i22] = padSymbol;
            } else {
                i6 = i22;
            }
        }
        if (i4 == i3) {
            return i6 - i;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int encodeSize$kotlin_stdlib(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = i2 * 4;
        if (i3 != 0) {
            i4 += shouldPadOnEncode() ? 4 : i3 + 1;
        }
        if (this.isMimeScheme) {
            i4 += ((i4 - 1) / 76) * 2;
        }
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @NotNull
    public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, i, i2), Charsets.ISO_8859_1));
        return destination;
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, i, i2);
    }

    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, i, i2);
        byte[] bArr = new byte[encodeSize$kotlin_stdlib(i2 - i)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, i, i2);
        return bArr;
    }

    @NotNull
    public final PaddingOption getPaddingOption$kotlin_stdlib() {
        return this.paddingOption;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.isMimeScheme;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.isUrlSafe;
    }

    @SinceKotlin(version = "2.0")
    @NotNull
    public final Base64 withPadding(@NotNull PaddingOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        return this.paddingOption == option ? this : new Base64(this.isUrlSafe, this.isMimeScheme, option);
    }

    private Base64(boolean z, boolean z2, PaddingOption paddingOption) {
        this.isUrlSafe = z;
        this.isMimeScheme = z2;
        this.paddingOption = paddingOption;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return base64.decode(charSequence, i, i2);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i5, i6, i3);
    }

    public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int i, int i2, int i3) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            String str = (String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), i2, i3);
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, i2, i3);
        }
        return decodeIntoByteArray$default(this, bArrCharsToBytesImpl$kotlin_stdlib, destination, i, 0, 0, 24, (Object) null);
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence source, int i, int i2) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), i, i2);
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, i, i2);
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
