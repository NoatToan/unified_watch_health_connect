package okio.internal;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.base.GeneratorBase;
import defpackage.yzc;
import defpackage.zcp;
import defpackage.zes;
import java.util.Arrays;
import kotlin.Metadata;
import okio.Utf8;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _Utf8Kt {
    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
    
        if ((r12[r2] & 192) == 128) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String commonToUtf8String(byte[] bArr, int i, int i2) {
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        zcp.c(bArr, "");
        if (i < 0 || i2 > bArr.length || i > i2) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i + " endIndex=" + i2);
        }
        char[] cArr = new char[i2 - i];
        int i7 = 0;
        while (i < i2) {
            byte b3 = bArr[i];
            if (b3 >= 0) {
                int i8 = i7 + 1;
                cArr[i7] = (char) b3;
                i++;
                while (true) {
                    i7 = i8;
                    if (i >= i2 || (b2 = bArr[i]) < 0) {
                        break;
                    }
                    i++;
                    i8 = i7 + 1;
                    cArr[i7] = (char) b2;
                }
            } else if ((b3 >> 5) == -2) {
                int i9 = i + 1;
                if (i2 <= i9) {
                    i3 = i7 + 1;
                    cArr[i7] = (char) 65533;
                } else {
                    byte b4 = bArr[i9];
                    if ((b4 & 192) == 128) {
                        int i10 = (b3 << 6) ^ (b4 ^ 3968);
                        if (i10 < 128) {
                            i3 = i7 + 1;
                            cArr[i7] = (char) 65533;
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = (char) i10;
                        }
                        yzc yzcVar = yzc.e;
                        i += i4;
                        i7 = i3;
                    } else {
                        i3 = i7 + 1;
                        cArr[i7] = (char) 65533;
                    }
                }
                yzc yzcVar2 = yzc.e;
                i += i4;
                i7 = i3;
            } else if ((b3 >> 4) == -2) {
                int i11 = i + 2;
                if (i2 <= i11) {
                    i3 = i7 + 1;
                    cArr[i7] = (char) 65533;
                    yzc yzcVar3 = yzc.e;
                    int i12 = i + 1;
                    i4 = (i2 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
                } else {
                    byte b5 = bArr[i + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i11];
                        if ((b6 & 192) == 128) {
                            int i13 = (b3 << 12) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                            if (i13 < 2048) {
                                i3 = i7 + 1;
                                cArr[i7] = (char) 65533;
                            } else if (55296 > i13 || i13 >= 57344) {
                                i3 = i7 + 1;
                                cArr[i7] = (char) i13;
                            } else {
                                i3 = i7 + 1;
                                cArr[i7] = (char) 65533;
                            }
                            yzc yzcVar4 = yzc.e;
                            i4 = 3;
                        } else {
                            i3 = i7 + 1;
                            cArr[i7] = (char) 65533;
                            yzc yzcVar5 = yzc.e;
                        }
                    } else {
                        i3 = i7 + 1;
                        cArr[i7] = (char) 65533;
                        yzc yzcVar6 = yzc.e;
                    }
                }
                i += i4;
                i7 = i3;
            } else if ((b3 >> 3) == -2) {
                int i14 = i + 3;
                if (i2 <= i14) {
                    i5 = i7 + 1;
                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                    yzc yzcVar7 = yzc.e;
                    int i15 = i + 1;
                    if (i2 > i15 && (bArr[i15] & 192) == 128) {
                        int i16 = i + 2;
                        if (i2 > i16) {
                        }
                        i3 = i5;
                    }
                    i3 = i5;
                } else {
                    byte b7 = bArr[i + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i14];
                            if ((b9 & 192) == 128) {
                                int i17 = (b3 << 18) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12));
                                if (i17 > 1114111) {
                                    i6 = i7 + 1;
                                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                } else if ((55296 > i17 || i17 >= 57344) && i17 >= 65536 && i17 != 65533) {
                                    cArr[i7] = (char) ((i17 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                    cArr[i7 + 1] = (char) ((i17 & 1023) + 56320);
                                    i6 = i7 + 2;
                                } else {
                                    i6 = i7 + 1;
                                    cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                }
                                yzc yzcVar8 = yzc.e;
                                i4 = 4;
                                i3 = i6;
                            } else {
                                i5 = i7 + 1;
                                cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                                yzc yzcVar9 = yzc.e;
                                i3 = i5;
                                i4 = 3;
                            }
                        } else {
                            i5 = i7 + 1;
                            cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                            yzc yzcVar10 = yzc.e;
                            i3 = i5;
                        }
                    } else {
                        i5 = i7 + 1;
                        cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                        yzc yzcVar11 = yzc.e;
                        i3 = i5;
                    }
                }
                i += i4;
                i7 = i3;
            } else {
                cArr[i7] = Utf8.REPLACEMENT_CHARACTER;
                i++;
                i7++;
            }
        }
        return zes.e(cArr, 0, i7);
    }

    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i;
        int i2;
        char cCharAt;
        zcp.c(str, "");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt2 = str.charAt(i3);
            if (zcp.d((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char cCharAt3 = str.charAt(i3);
                    if (zcp.d((int) cCharAt3, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) cCharAt3;
                        while (true) {
                            i3++;
                            i4 = i5;
                            if (i3 >= length2 || zcp.d((int) str.charAt(i3), 128) >= 0) {
                                break;
                            }
                            i5 = i4 + 1;
                            bArr[i4] = (byte) str.charAt(i3);
                        }
                    } else {
                        if (zcp.d((int) cCharAt3, 2048) < 0) {
                            bArr[i4] = (byte) ((cCharAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                            i = i4 + 2;
                            bArr[i4 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i4] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i4 + 1] = (byte) ((63 & (cCharAt3 >> 6)) | 128);
                            i = i4 + 3;
                            bArr[i4 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (zcp.d((int) cCharAt3, GeneratorBase.SURR1_LAST) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (cCharAt = str.charAt(i2)) || cCharAt >= 57344) {
                            bArr[i4] = Utf8.REPLACEMENT_BYTE;
                            i3++;
                            i4++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i2)) - 56613888;
                            bArr[i4] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i4 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i4 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            bArr[i4 + 3] = (byte) ((iCharAt & 63) | 128);
                            i3 += 2;
                            i4 += 4;
                        }
                        i4 = i;
                        i3++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i4);
                zcp.b((Object) bArrCopyOf, "");
                return bArrCopyOf;
            }
            bArr[i3] = (byte) cCharAt2;
            i3++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        zcp.b((Object) bArrCopyOf2, "");
        return bArrCopyOf2;
    }
}
