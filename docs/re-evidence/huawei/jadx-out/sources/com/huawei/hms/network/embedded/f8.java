package com.huawei.hms.network.embedded;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes34.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f14776a;
    public static final w7 d;
    public static final u7 e;
    public static final Method k;
    public static final Pattern l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f14777b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j7 f14778c = j7.a(new String[0]);
    public static final pb f = pb.a(eb.b("efbbbf"), eb.b("feff"), eb.b("fffe"), eb.b("0000ffff"), eb.b("ffff0000"));
    public static final Charset g = Charset.forName("UTF-32BE");
    public static final Charset h = Charset.forName("UTF-32LE");
    public static final TimeZone i = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> j = new Comparator() { // from class: com.huawei.hms.network.embedded.f8$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static boolean e(String str) {
        return l.matcher(str).matches();
    }

    public static boolean d(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static String d(String str, int i2, int i3) {
        int iB = b(str, i2, i3);
        return str.substring(iB, c(str, iB, i3));
    }

    public static int c(String str, int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return i2;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
    }

    public static int c(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(zb zbVar, int i2, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jC = zbVar.timeout().d() ? zbVar.timeout().c() - jNanoTime : Long.MAX_VALUE;
        zbVar.timeout().deadlineNanoTime(Math.min(jC, timeUnit.toNanos(i2)) + jNanoTime);
        try {
            bb bbVar = new bb();
            while (zbVar.read(bbVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                bbVar.s();
            }
            ac acVarTimeout = zbVar.timeout();
            if (jC == Long.MAX_VALUE) {
                acVarTimeout.a();
                return true;
            }
            acVarTimeout.deadlineNanoTime(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            ac acVarTimeout2 = zbVar.timeout();
            if (jC == Long.MAX_VALUE) {
                acVarTimeout2.a();
                return false;
            }
            acVarTimeout2.deadlineNanoTime(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            ac acVarTimeout3 = zbVar.timeout();
            if (jC == Long.MAX_VALUE) {
                acVarTimeout3.a();
            } else {
                acVarTimeout3.deadlineNanoTime(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static j7 b(List<s9> list) {
        j7.a aVar = new j7.a();
        for (s9 s9Var : list) {
            c8.f14676a.a(aVar, s9Var.f15352a.n(), s9Var.f15353b.n());
        }
        return aVar.a();
    }

    public static int b(String str, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String[] a(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean a(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(zb zbVar, int i2, TimeUnit timeUnit) {
        try {
            return b(zbVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(m7 m7Var, m7 m7Var2) {
        return m7Var.h().equals(m7Var2.h()) && m7Var.n() == m7Var2.n() && m7Var.s().equals(m7Var2.s());
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                if (!"bio == null".equals(e3.getMessage())) {
                    throw e3;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (AssertionError e2) {
                e = e2;
                ma.f().a(5, e.getMessage(), e);
            } catch (RuntimeException e3) {
                e = e3;
                ma.f().a(5, e.getMessage(), e);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public static ThreadFactory a(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.huawei.hms.network.embedded.f8$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return f8.a(str, z, runnable);
            }
        };
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        return map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List<s9> a(j7 j7Var) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < j7Var.d(); i2++) {
            arrayList.add(new s9(j7Var.a(i2), j7Var.b(i2)));
        }
        return arrayList;
    }

    public static Charset a(db dbVar, Charset charset) throws IOException {
        int iA = dbVar.a(f);
        if (iA == -1) {
            return charset;
        }
        if (iA == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iA == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iA == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iA == 3) {
            return g;
        }
        if (iA == 4) {
            return h;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[LOOP:1: B:30:0x004d->B:34:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EDGE_INSN: B:59:0x0060->B:35:0x0060 BREAK  A[LOOP:1: B:30:0x004d->B:34:0x005a], SYNTHETIC] */
    @Nullable
    public static InetAddress a(String str, int i2, int i3) {
        int i4;
        int i5;
        int iA;
        byte[] bArr = new byte[16];
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i2 < i3) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i2 + 2;
            if (i9 <= i3 && str.regionMatches(i2, "::", 0, 2)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                i4 = 0;
                i2 = i8;
                while (i2 < i3) {
                    iA = a(str.charAt(i2));
                    if (iA == -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iA;
                    i2++;
                }
                i5 = i2 - i8;
                if (i5 != 0) {
                }
                return null;
            }
            if (i6 != 0) {
                if (!str.regionMatches(i2, ":", 0, 1)) {
                    if (!str.regionMatches(i2, ".", 0, 1) || !a(str, i8, i3, bArr, i6 - 2)) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i2++;
            }
            i8 = i2;
            i4 = 0;
            i2 = i8;
            while (i2 < i3) {
                iA = a(str.charAt(i2));
                if (iA == -1) {
                    break;
                }
                i4 = (i4 << 4) + iA;
                i2++;
            }
            i5 = i2 - i8;
            if (i5 != 0 || i5 > 4) {
                return null;
            }
            bArr[i6] = (byte) ((i4 >>> 8) & 255);
            bArr[i6 + 1] = (byte) (i4 & 255);
            i6 += 2;
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i10 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static String a(byte[] bArr) {
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        bb bbVar = new bb();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                bbVar.writeByte(58);
                i3 += i5;
                if (i3 == 16) {
                    bbVar.writeByte(58);
                }
            } else {
                if (i3 > 0) {
                    bbVar.writeByte(58);
                }
                bbVar.c(((bArr[i3] & 255) << 8) | (bArr[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return bbVar.o();
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String a(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
        }
    }

    public static String a(String str) {
        int length;
        int i2;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty() || b(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (str.startsWith("[") && str.endsWith("]")) {
            length = str.length() - 1;
            i2 = 1;
        } else {
            length = str.length();
            i2 = 0;
        }
        InetAddress inetAddressA = a(str, i2, length);
        if (inetAddressA == null) {
            return null;
        }
        byte[] address = inetAddressA.getAddress();
        if (address.length == 16) {
            return a(address);
        }
        if (address.length == 4) {
            return inetAddressA.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    public static String a(m7 m7Var, boolean z) {
        String strH;
        if (m7Var.h().contains(":")) {
            strH = "[" + m7Var.h() + "]";
        } else {
            strH = m7Var.h();
        }
        if (!z && m7Var.n() == m7.e(m7Var.s())) {
            return strH;
        }
        return strH + ":" + m7Var.n();
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int a(String str, long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str + " too small.");
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    static {
        byte[] bArr = new byte[0];
        f14776a = bArr;
        Method declaredMethod = null;
        d = w7.a((o7) null, bArr);
        e = u7.create((o7) null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        k = declaredMethod;
        l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }
}
