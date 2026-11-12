package org.apache.commons.lang3;

import am.j;
import java.util.Random;
import org.apache.commons.text.RandomStringGenerator;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class RandomStringUtils {
    private static final Random RANDOM = new Random();

    /* JADX WARN: Multi-variable type inference failed */
    public static String random(int i14, int i15, int i16, boolean z14, boolean z15, char[] cArr, Random random) {
        char cNextInt;
        if (i14 == 0) {
            return "";
        }
        if (i14 < 0) {
            h.s(e0.f(i14, "Requested random string length ", " is less than 0."));
            return null;
        }
        if (cArr != 0 && cArr.length == 0) {
            h.s("The chars array must not be empty");
            return null;
        }
        if (i15 == 0 && i16 == 0) {
            if (cArr != 0) {
                i16 = cArr.length;
            } else if (z14 || z15) {
                i16 = 123;
                i15 = 32;
            } else {
                i16 = RandomStringGenerator.Builder.DEFAULT_MAXIMUM_CODE_POINT;
            }
        } else if (i16 <= i15) {
            h.s(j.g(i16, i15, "Parameter end (", ") must be greater than start (", ")"));
            return null;
        }
        if (cArr == 0 && ((z15 && i16 <= 48) || (z14 && i16 <= 65))) {
            h.s(e0.f(i16, "Parameter end (", ") must be greater then (48) for generating digits or greater then (65) for generating letters."));
            return null;
        }
        StringBuilder sb3 = new StringBuilder(i14);
        int i17 = i16 - i15;
        while (true) {
            int i18 = i14 - 1;
            if (i14 == 0) {
                return sb3.toString();
            }
            if (cArr == 0) {
                cNextInt = random.nextInt(i17) + i15;
                int type = Character.getType(cNextInt);
                if (type == 0 || type == 18 || type == 19) {
                }
            } else {
                cNextInt = cArr[random.nextInt(i17) + i15];
            }
            int iCharCount = Character.charCount(cNextInt);
            if (i18 != 0 || iCharCount <= 1) {
                if ((z14 && Character.isLetter(cNextInt)) || ((z15 && Character.isDigit(cNextInt)) || (!z14 && !z15))) {
                    sb3.appendCodePoint(cNextInt);
                    i14 = iCharCount == 2 ? i14 - 2 : i18;
                }
            }
        }
    }

    public static String randomAlphabetic(int i14, int i15) {
        return randomAlphabetic(RandomUtils.nextInt(i14, i15));
    }

    public static String randomAlphanumeric(int i14, int i15) {
        return randomAlphanumeric(RandomUtils.nextInt(i14, i15));
    }

    public static String randomAscii(int i14) {
        return random(i14, 32, 127, false, false);
    }

    public static String randomGraph(int i14) {
        return random(i14, 33, 126, false, false);
    }

    public static String randomNumeric(int i14, int i15) {
        return randomNumeric(RandomUtils.nextInt(i14, i15));
    }

    public static String randomPrint(int i14) {
        return random(i14, 32, 126, false, false);
    }

    public static String randomAlphabetic(int i14) {
        return random(i14, true, false);
    }

    public static String randomAlphanumeric(int i14) {
        return random(i14, true, true);
    }

    public static String randomNumeric(int i14) {
        return random(i14, false, true);
    }

    public static String randomAscii(int i14, int i15) {
        return randomAscii(RandomUtils.nextInt(i14, i15));
    }

    public static String randomGraph(int i14, int i15) {
        return randomGraph(RandomUtils.nextInt(i14, i15));
    }

    public static String randomPrint(int i14, int i15) {
        return randomPrint(RandomUtils.nextInt(i14, i15));
    }

    public static String random(int i14, boolean z14, boolean z15) {
        return random(i14, 0, 0, z14, z15);
    }

    public static String random(int i14, int i15, int i16, boolean z14, boolean z15) {
        return random(i14, i15, i16, z14, z15, null, RANDOM);
    }

    public static String random(int i14, int i15, int i16, boolean z14, boolean z15, char... cArr) {
        return random(i14, i15, i16, z14, z15, cArr, RANDOM);
    }

    public static String random(int i14) {
        return random(i14, false, false);
    }

    public static String random(int i14, String str) {
        if (str == null) {
            return random(i14, 0, 0, false, false, null, RANDOM);
        }
        return random(i14, str.toCharArray());
    }

    public static String random(int i14, char... cArr) {
        if (cArr == null) {
            return random(i14, 0, 0, false, false, null, RANDOM);
        }
        return random(i14, 0, cArr.length, false, false, cArr, RANDOM);
    }
}
