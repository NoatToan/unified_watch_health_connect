package okio;

import androidx.media3.extractor.ts.PsExtractor;
import com.fasterxml.jackson.core.base.GeneratorBase;
import defpackage.yzc;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i < 0 || i >= 32) {
            return 127 <= i && i < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b2) {
        return (b2 & 192) == 128;
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    public static final long size(String str, int i, int i2) {
        int i3;
        zcp.c(str, "");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i3 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char cCharAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += (long) 4;
                        i += 2;
                    }
                }
                j += (long) i3;
            }
            i++;
        }
        return j;
    }

    public static final void processUtf8Bytes(String str, int i, int i2, Function1<? super Byte, yzc> function1) {
        int i3;
        char cCharAt;
        zcp.c(str, "");
        zcp.c(function1, "");
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (zcp.d((int) cCharAt2, 128) < 0) {
                function1.invoke(Byte.valueOf((byte) cCharAt2));
                while (true) {
                    i++;
                    if (i >= i2 || zcp.d((int) str.charAt(i), 128) >= 0) {
                        break;
                    } else {
                        function1.invoke(Byte.valueOf((byte) str.charAt(i)));
                    }
                }
            } else {
                if (zcp.d((int) cCharAt2, 2048) < 0) {
                    function1.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM)));
                    function1.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    function1.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    function1.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    function1.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (zcp.d((int) cCharAt2, GeneratorBase.SURR1_LAST) > 0 || i2 <= (i3 = i + 1) || 56320 > (cCharAt = str.charAt(i3)) || cCharAt >= 57344) {
                    function1.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i3)) - 56613888;
                    function1.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    function1.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    function1.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    function1.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x014f  */
    public static final void processUtf8CodePoints(byte[] bArr, int i, int i2, Function1<? super Integer, yzc> function1) {
        int i3;
        zcp.c(bArr, "");
        zcp.c(function1, "");
        while (i < i2) {
            byte b2 = bArr[i];
            if (b2 >= 0) {
                function1.invoke(Integer.valueOf(b2));
                i++;
                while (i < i2) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    function1.invoke(Integer.valueOf(b3));
                }
            } else if ((b2 >> 5) == -2) {
                int i4 = i + 1;
                if (i2 > i4) {
                    byte b4 = bArr[i4];
                    if ((b4 & 192) == 128) {
                        int i5 = (b2 << 6) ^ (b4 ^ 3968);
                        function1.invoke(i5 < 128 ? 65533 : Integer.valueOf(i5));
                        yzc yzcVar = yzc.e;
                        i3 = 2;
                        i += i3;
                    }
                }
                function1.invoke(65533);
                yzc yzcVar2 = yzc.e;
                i3 = 1;
                i += i3;
            } else if ((b2 >> 4) == -2) {
                int i6 = i + 2;
                if (i2 <= i6) {
                    function1.invoke(65533);
                    yzc yzcVar3 = yzc.e;
                    int i7 = i + 1;
                    if (i2 <= i7 || (bArr[i7] & 192) != 128) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                } else {
                    byte b5 = bArr[i + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i6];
                        if ((b6 & 192) == 128) {
                            int i8 = (b2 << 12) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                            function1.invoke((i8 >= 2048 && (55296 > i8 || i8 >= 57344)) ? Integer.valueOf(i8) : 65533);
                            yzc yzcVar4 = yzc.e;
                            i3 = 3;
                        } else {
                            function1.invoke(65533);
                            yzc yzcVar5 = yzc.e;
                            i3 = 2;
                        }
                    } else {
                        function1.invoke(65533);
                        yzc yzcVar6 = yzc.e;
                        i3 = 1;
                    }
                }
                i += i3;
            } else if ((b2 >> 3) == -2) {
                int i9 = i + 3;
                if (i2 <= i9) {
                    function1.invoke(65533);
                    yzc yzcVar7 = yzc.e;
                    int i10 = i + 1;
                    if (i2 <= i10 || (bArr[i10] & 192) != 128) {
                        i3 = 1;
                    } else {
                        int i11 = i + 2;
                        if (i2 <= i11 || (bArr[i11] & 192) != 128) {
                            i3 = 2;
                        } else {
                            i3 = 3;
                        }
                    }
                } else {
                    byte b7 = bArr[i + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i9];
                            if ((b9 & 192) == 128) {
                                int i12 = (b2 << 18) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12));
                                function1.invoke((i12 <= 1114111 && (55296 > i12 || i12 >= 57344) && i12 >= 65536) ? Integer.valueOf(i12) : 65533);
                                yzc yzcVar8 = yzc.e;
                                i3 = 4;
                            } else {
                                function1.invoke(65533);
                                yzc yzcVar9 = yzc.e;
                                i3 = 3;
                            }
                        } else {
                            function1.invoke(65533);
                            yzc yzcVar10 = yzc.e;
                            i3 = 2;
                        }
                    } else {
                        function1.invoke(65533);
                        yzc yzcVar11 = yzc.e;
                        i3 = 1;
                    }
                }
                i += i3;
            } else {
                function1.invoke(65533);
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    public static final void processUtf16Chars(byte[] bArr, int i, int i2, Function1<? super Character, yzc> function1) {
        int i3;
        zcp.c(bArr, "");
        zcp.c(function1, "");
        while (i < i2) {
            byte b2 = bArr[i];
            if (b2 >= 0) {
                function1.invoke(Character.valueOf((char) b2));
                i++;
                while (i < i2) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    function1.invoke(Character.valueOf((char) b3));
                }
            } else if ((b2 >> 5) == -2) {
                int i4 = i + 1;
                if (i2 > i4) {
                    byte b4 = bArr[i4];
                    if ((b4 & 192) == 128) {
                        int i5 = (b2 << 6) ^ (b4 ^ 3968);
                        function1.invoke(Character.valueOf(i5 < 128 ? (char) 65533 : (char) i5));
                        yzc yzcVar = yzc.e;
                        i3 = 2;
                        i += i3;
                    }
                }
                function1.invoke(Character.valueOf((char) 65533));
                yzc yzcVar2 = yzc.e;
                i3 = 1;
                i += i3;
            } else if ((b2 >> 4) == -2) {
                int i6 = i + 2;
                if (i2 <= i6) {
                    function1.invoke(Character.valueOf((char) 65533));
                    yzc yzcVar3 = yzc.e;
                    int i7 = i + 1;
                    if (i2 <= i7 || (bArr[i7] & 192) != 128) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                } else {
                    byte b5 = bArr[i + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i6];
                        if ((b6 & 192) == 128) {
                            int i8 = (b2 << 12) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                            function1.invoke(Character.valueOf((i8 >= 2048 && (55296 > i8 || i8 >= 57344)) ? (char) i8 : (char) 65533));
                            yzc yzcVar4 = yzc.e;
                            i3 = 3;
                        } else {
                            function1.invoke(Character.valueOf((char) 65533));
                            yzc yzcVar5 = yzc.e;
                            i3 = 2;
                        }
                    } else {
                        function1.invoke(Character.valueOf((char) 65533));
                        yzc yzcVar6 = yzc.e;
                        i3 = 1;
                    }
                }
                i += i3;
            } else if ((b2 >> 3) == -2) {
                int i9 = i + 3;
                if (i2 <= i9) {
                    function1.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    yzc yzcVar7 = yzc.e;
                    int i10 = i + 1;
                    if (i2 <= i10 || (bArr[i10] & 192) != 128) {
                        i3 = 1;
                    } else {
                        int i11 = i + 2;
                        if (i2 <= i11 || (bArr[i11] & 192) != 128) {
                            i3 = 2;
                        } else {
                            i3 = 3;
                        }
                    }
                } else {
                    byte b7 = bArr[i + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i9];
                            if ((b9 & 192) == 128) {
                                int i12 = (b2 << 18) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12));
                                if (i12 <= 1114111 && ((55296 > i12 || i12 >= 57344) && i12 >= 65536 && i12 != 65533)) {
                                    function1.invoke(Character.valueOf((char) ((i12 >>> 10) + HIGH_SURROGATE_HEADER)));
                                    function1.invoke(Character.valueOf((char) ((i12 & 1023) + 56320)));
                                } else {
                                    function1.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                }
                                yzc yzcVar8 = yzc.e;
                                i3 = 4;
                            } else {
                                function1.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                yzc yzcVar9 = yzc.e;
                                i3 = 3;
                            }
                        } else {
                            function1.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            yzc yzcVar10 = yzc.e;
                            i3 = 2;
                        }
                    } else {
                        function1.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        yzc yzcVar11 = yzc.e;
                        i3 = 1;
                    }
                }
                i += i3;
            } else {
                function1.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                i++;
            }
        }
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, yzc> function1) {
        zcp.c(bArr, "");
        zcp.c(function1, "");
        int i3 = i + 1;
        if (i2 <= i3) {
            function1.invoke(65533);
            return 1;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i3];
        if ((b3 & 192) != 128) {
            function1.invoke(65533);
            return 1;
        }
        int i4 = (b3 ^ 3968) ^ (b2 << 6);
        if (i4 < 128) {
            function1.invoke(65533);
            return 2;
        }
        function1.invoke(Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, yzc> function1) {
        zcp.c(bArr, "");
        zcp.c(function1, "");
        int i3 = i + 2;
        if (i2 <= i3) {
            function1.invoke(65533);
            int i4 = i + 1;
            return (i2 <= i4 || (bArr[i4] & 192) != 128) ? 1 : 2;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if ((b3 & 192) != 128) {
            function1.invoke(65533);
            return 1;
        }
        byte b4 = bArr[i3];
        if ((b4 & 192) != 128) {
            function1.invoke(65533);
            return 2;
        }
        int i5 = ((b4 ^ (-123008)) ^ (b3 << 6)) ^ (b2 << 12);
        if (i5 < 2048) {
            function1.invoke(65533);
            return 3;
        }
        if (55296 <= i5 && i5 < 57344) {
            function1.invoke(65533);
            return 3;
        }
        function1.invoke(Integer.valueOf(i5));
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, Function1<? super Integer, yzc> function1) {
        zcp.c(bArr, "");
        zcp.c(function1, "");
        int i3 = i + 3;
        if (i2 <= i3) {
            function1.invoke(65533);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & 192) != 128) {
                return 1;
            }
            int i5 = i + 2;
            return (i2 <= i5 || (bArr[i5] & 192) != 128) ? 2 : 3;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if ((b3 & 192) != 128) {
            function1.invoke(65533);
            return 1;
        }
        byte b4 = bArr[i + 2];
        if ((b4 & 192) != 128) {
            function1.invoke(65533);
            return 2;
        }
        byte b5 = bArr[i3];
        if ((b5 & 192) != 128) {
            function1.invoke(65533);
            return 3;
        }
        int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
        if (i6 > 1114111) {
            function1.invoke(65533);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            function1.invoke(65533);
            return 4;
        }
        if (i6 < 65536) {
            function1.invoke(65533);
            return 4;
        }
        function1.invoke(Integer.valueOf(i6));
        return 4;
    }

    public static final long size(String str, int i) {
        zcp.c(str, "");
        return size$default(str, i, 0, 2, null);
    }

    public static final long size(String str) {
        zcp.c(str, "");
        return size$default(str, 0, 0, 3, null);
    }
}
