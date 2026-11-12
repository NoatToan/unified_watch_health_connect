package com.facebook.soloader;

import com.xiaomi.smarthome.CpuConstant;
import defpackage.w68;
import defpackage.x68;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;
import kotlin.UShort;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class MinElf {

    public enum ISA {
        NOT_SO("not_so"),
        X86("x86"),
        ARM(CpuConstant.CPU_ARMEABIV7),
        X86_64("x86_64"),
        AARCH64(CpuConstant.CPU_ARMEABI_V8A),
        OTHERS("others");

        private final String value;

        ISA(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static String[] a(w68 w68Var) throws IOException {
        return w68Var instanceof x68 ? c((x68) w68Var) : b(w68Var);
    }

    public static String[] b(w68 w68Var) throws IOException {
        long jD;
        long jG;
        String str;
        long j;
        long jG2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jG3 = g(w68Var, byteBufferAllocate, 0L);
        if (jG3 != 1179403647) {
            throw new a("file is not ELF: 0x" + Long.toHexString(jG3));
        }
        boolean z = h(w68Var, byteBufferAllocate, 4L) == 1;
        if (h(w68Var, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jG4 = z ? g(w68Var, byteBufferAllocate, 28L) : d(w68Var, byteBufferAllocate, 32L);
        long jF = z ? f(w68Var, byteBufferAllocate, 44L) : f(w68Var, byteBufferAllocate, 56L);
        int iF = f(w68Var, byteBufferAllocate, z ? 42L : 54L);
        if (jF == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            long jG5 = z ? g(w68Var, byteBufferAllocate, 32L) : d(w68Var, byteBufferAllocate, 40L);
            jF = z ? g(w68Var, byteBufferAllocate, jG5 + 28) : g(w68Var, byteBufferAllocate, jG5 + 44);
        }
        long j2 = jG4;
        long j3 = 0;
        while (true) {
            if (j3 >= jF) {
                jD = 0;
                break;
            }
            if ((z ? g(w68Var, byteBufferAllocate, j2) : g(w68Var, byteBufferAllocate, j2)) == 2) {
                if (!z) {
                    jD = d(w68Var, byteBufferAllocate, j2 + 8);
                    break;
                }
                jD = g(w68Var, byteBufferAllocate, j2 + 4);
                break;
            }
            j2 += (long) iF;
            j3++;
        }
        if (jD == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j4 = jD;
        int i = 0;
        long jG6 = 0;
        do {
            jG = z ? g(w68Var, byteBufferAllocate, j4) : d(w68Var, byteBufferAllocate, j4);
            str = "malformed DT_NEEDED section";
            if (jG == 1) {
                if (i == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i++;
            } else if (jG == 5) {
                jG6 = z ? g(w68Var, byteBufferAllocate, j4 + 4) : d(w68Var, byteBufferAllocate, j4 + 8);
            }
            j4 += z ? 8L : 16L;
        } while (jG != 0);
        if (jG6 == 0) {
            throw new a("Dynamic section string-table not found");
        }
        long j5 = jG4;
        int i2 = 0;
        while (true) {
            if (i2 >= jF) {
                jD = jD;
                j = 0;
                jG2 = 0;
                break;
            }
            if ((z ? g(w68Var, byteBufferAllocate, j5) : g(w68Var, byteBufferAllocate, j5)) == 1) {
                long jG7 = z ? g(w68Var, byteBufferAllocate, j5 + 8) : d(w68Var, byteBufferAllocate, j5 + 16);
                long jG8 = z ? g(w68Var, byteBufferAllocate, j5 + 20) : d(w68Var, byteBufferAllocate, j5 + 40);
                if (jG7 <= jG6 && jG6 < jG8 + jG7) {
                    jG2 = (z ? g(w68Var, byteBufferAllocate, j5 + 4) : d(w68Var, byteBufferAllocate, j5 + 8)) + (jG6 - jG7);
                    j = 0;
                    break;
                }
            } else {
                jF = jF;
                jD = jD;
            }
            j5 += (long) iF;
            i2++;
            jF = jF;
            jD = jD;
        }
        if (jG2 == j) {
            throw new a("did not find file offset of DT_STRTAB table");
        }
        String[] strArr = new String[i];
        long j6 = jD;
        int i3 = 0;
        while (true) {
            long jG9 = z ? g(w68Var, byteBufferAllocate, j6) : d(w68Var, byteBufferAllocate, j6);
            if (jG9 == 1) {
                strArr[i3] = e(w68Var, byteBufferAllocate, (z ? g(w68Var, byteBufferAllocate, j6 + 4) : d(w68Var, byteBufferAllocate, j6 + 8)) + jG2);
                if (i3 == Integer.MAX_VALUE) {
                    throw new a(str);
                }
                i3++;
            }
            j6 += z ? 8L : 16L;
            if (jG9 == 0) {
                if (i3 == i) {
                    return strArr;
                }
                throw new a(str);
            }
            str = str;
        }
    }

    public static String[] c(x68 x68Var) throws IOException {
        int i = 0;
        while (true) {
            try {
                return b(x68Var);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                x68Var.a();
            }
        }
    }

    public static long d(w68 w68Var, ByteBuffer byteBuffer, long j) throws IOException {
        i(w68Var, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }

    public static String e(w68 w68Var, ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short sH = h(w68Var, byteBuffer, j);
            if (sH == 0) {
                return sb.toString();
            }
            sb.append((char) sH);
            j = j2;
        }
    }

    public static int f(w68 w68Var, ByteBuffer byteBuffer, long j) throws IOException {
        i(w68Var, byteBuffer, 2, j);
        return byteBuffer.getShort() & UShort.MAX_VALUE;
    }

    public static long g(w68 w68Var, ByteBuffer byteBuffer, long j) throws IOException {
        i(w68Var, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static short h(w68 w68Var, ByteBuffer byteBuffer, long j) throws IOException {
        i(w68Var, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    public static void i(w68 w68Var, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int iQ;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iQ = w68Var.q(byteBuffer, j)) != -1) {
            j += (long) iQ;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
