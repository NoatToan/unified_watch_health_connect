package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class mcr {
    public static boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int b(InputStream inputStream) throws IOException {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    public static byte c(InputStream inputStream) throws IOException {
        return (byte) (inputStream.read() & 255);
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append((char) b2);
        }
        return sb.toString();
    }

    public static int e(InputStream inputStream) throws IOException {
        byte b2 = (byte) inputStream.read();
        byte b3 = (byte) inputStream.read();
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << 16) & 16711680) | ((b3 << 8) & 65280) | (b2 & 255);
    }

    public static short f(InputStream inputStream) throws IOException {
        return (short) (inputStream.read() & 255);
    }

    public static Pair<Integer, Integer> g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                    if (!a(bArr, "RIFF")) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                    e(inputStream);
                    inputStream.read(bArr);
                    if (!a(bArr, "WEBP")) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return null;
                    }
                    inputStream.read(bArr);
                    String strD = d(bArr);
                    if ("VP8 ".equals(strD)) {
                        Pair<Integer, Integer> pairH = h(inputStream);
                        try {
                            inputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return pairH;
                    }
                    if ("VP8L".equals(strD)) {
                        Pair<Integer, Integer> pairI = i(inputStream);
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        return pairI;
                    }
                    if (!"VP8X".equals(strD)) {
                        inputStream.close();
                        return null;
                    }
                    Pair<Integer, Integer> pairJ = j(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return pairJ;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
                return null;
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static Pair<Integer, Integer> h(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        short sF = f(inputStream);
        short sF2 = f(inputStream);
        short sF3 = f(inputStream);
        if (sF == 157 && sF2 == 1 && sF3 == 42) {
            return new Pair<>(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    public static Pair<Integer, Integer> i(InputStream inputStream) throws IOException {
        e(inputStream);
        if (c(inputStream) != 47) {
            return null;
        }
        int i = ((byte) inputStream.read()) & 255;
        byte b2 = (byte) inputStream.read();
        return new Pair<>(Integer.valueOf((i | ((b2 & 63) << 8)) + 1), Integer.valueOf((((((byte) inputStream.read()) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((b2 & 192) >> 6)) + 1));
    }

    public static Pair<Integer, Integer> j(InputStream inputStream) throws IOException {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(k(inputStream) + 1), Integer.valueOf(k(inputStream) + 1));
    }

    public static int k(InputStream inputStream) throws IOException {
        byte bC = c(inputStream);
        return ((c(inputStream) << 16) & 16711680) | ((c(inputStream) << 8) & 65280) | (bC & 255);
    }
}
