package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i14) {
        byte[] bArr = new byte[i14];
        int i15 = 0;
        while (i15 < i14) {
            int i16 = dataSource.read(bArr, i15, i14 - i15);
            if (i16 == -1) {
                StringBuilder sb3 = new StringBuilder(56);
                sb3.append("Not enough data could be read: ");
                sb3.append(i15);
                sb3.append(" < ");
                sb3.append(i14);
                throw new IllegalStateException(sb3.toString());
            }
            i15 += i16;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) {
        byte[] bArrCopyOf = new byte[1024];
        int i14 = 0;
        int i15 = 0;
        while (i14 != -1) {
            if (i15 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i14 = dataSource.read(bArrCopyOf, i15, bArrCopyOf.length - i15);
            if (i14 != -1) {
                i15 += i14;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i15);
    }
}
