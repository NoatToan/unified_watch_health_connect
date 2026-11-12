package org.apache.commons.codec.digest;

import com.google.android.flexbox.FlexItem;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
final class B64 {
    static final String B64T_STRING = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final char[] B64T_ARRAY = B64T_STRING.toCharArray();

    public static void b64from24bit(byte b14, byte b15, byte b16, int i14, StringBuilder sb3) {
        int i15 = ((b14 << Ascii.DLE) & FlexItem.MAX_SIZE) | ((b15 << 8) & 65535) | (b16 & UnsignedBytes.MAX_VALUE);
        while (true) {
            int i16 = i14 - 1;
            if (i14 <= 0) {
                return;
            }
            sb3.append(B64T_ARRAY[i15 & 63]);
            i15 >>= 6;
            i14 = i16;
        }
    }

    public static String getRandomSalt(int i14, Random random) {
        StringBuilder sb3 = new StringBuilder(i14);
        for (int i15 = 1; i15 <= i14; i15++) {
            sb3.append(B64T_STRING.charAt(random.nextInt(64)));
        }
        return sb3.toString();
    }

    public static String getRandomSalt(int i14) {
        return getRandomSalt(i14, new SecureRandom());
    }
}
