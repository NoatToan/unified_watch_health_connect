package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.a4n;
import defpackage.b4n;
import defpackage.bbq;
import defpackage.ce1;
import defpackage.ri8;
import defpackage.shg;
import defpackage.uhg;
import defpackage.uqf;
import defpackage.w68;
import defpackage.wi1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a4n f7603b;
    public static bbq[] f;
    public static wi1 g;
    public static int l;
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static volatile b4n[] d = null;
    public static final AtomicInteger e = new AtomicInteger(0);
    public static final HashSet<String> h = new HashSet<>();
    public static final Map<String, Object> i = new HashMap();
    public static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f7604k = {System.mapLibraryName("breakpad")};
    public static int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7602a = true;

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        public WrongAbiError(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.j()) + " error: " + str);
            initCause(th);
        }
    }

    public class a implements a4n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7606b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Runtime d;
        public final /* synthetic */ Method e;

        public a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f7605a = z;
            this.f7606b = str;
            this.c = str2;
            this.d = runtime;
            this.e = method;
        }

        @Override // defpackage.a4n
        public void a(String str, w68 w68Var, int i) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0092  */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            r0 = new java.lang.StringBuilder();
            r0.append("Error when loading lib: ");
            r0.append(r2);
            r0.append(" lib hash: ");
            r0.append(c(r9));
            r0.append(" search path is ");
            r0.append(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        
            return;
         */
        @Override // defpackage.a4n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(java.lang.String r9, int r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r8.f7605a
                if (r0 == 0) goto Lb4
                r0 = 4
                r10 = r10 & r0
                if (r10 != r0) goto Lb
                java.lang.String r10 = r8.f7606b
                goto Ld
            Lb:
                java.lang.String r10 = r8.c
            Ld:
                r0 = 0
                java.lang.Runtime r1 = r8.d     // Catch: java.lang.Throwable -> L6b java.lang.reflect.InvocationTargetException -> L6f java.lang.IllegalArgumentException -> L73 java.lang.IllegalAccessException -> L75
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L6b java.lang.reflect.InvocationTargetException -> L6f java.lang.IllegalArgumentException -> L73 java.lang.IllegalAccessException -> L75
                java.lang.reflect.Method r2 = r8.e     // Catch: java.lang.Throwable -> L5d
                java.lang.Runtime r3 = r8.d     // Catch: java.lang.Throwable -> L5d
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L5d
                r5 = 0
                r4[r5] = r9     // Catch: java.lang.Throwable -> L5d
                java.lang.Class<com.facebook.soloader.SoLoader> r5 = com.facebook.soloader.SoLoader.class
                java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L5d
                r6 = 1
                r4[r6] = r5     // Catch: java.lang.Throwable -> L5d
                r5 = 2
                r4[r5] = r10     // Catch: java.lang.Throwable -> L5d
                java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L5d
                if (r2 != 0) goto L57
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
                if (r2 == 0) goto Lb7
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Error when loading lib: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = " lib hash: "
                r0.append(r1)
                java.lang.String r9 = r8.c(r9)
                r0.append(r9)
                java.lang.String r9 = " search path is "
                r0.append(r9)
                r0.append(r10)
                goto Lb7
            L55:
                r0 = move-exception
                goto L61
            L57:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch: java.lang.Throwable -> L55
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L55
                throw r0     // Catch: java.lang.Throwable -> L55
            L5d:
                r2 = move-exception
                r7 = r2
                r2 = r0
                r0 = r7
            L61:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
                throw r0     // Catch: java.lang.Throwable -> L63 java.lang.reflect.InvocationTargetException -> L65 java.lang.IllegalArgumentException -> L67 java.lang.IllegalAccessException -> L69
            L63:
                r0 = move-exception
                goto L90
            L65:
                r0 = move-exception
                goto L77
            L67:
                r0 = move-exception
                goto L77
            L69:
                r0 = move-exception
                goto L77
            L6b:
                r1 = move-exception
                r2 = r0
                r0 = r1
                goto L90
            L6f:
                r1 = move-exception
            L70:
                r2 = r0
                r0 = r1
                goto L77
            L73:
                r1 = move-exception
                goto L70
            L75:
                r1 = move-exception
                goto L70
            L77:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
                r1.<init>()     // Catch: java.lang.Throwable -> L63
                java.lang.String r3 = "Error: Cannot load "
                r1.append(r3)     // Catch: java.lang.Throwable -> L63
                r1.append(r9)     // Catch: java.lang.Throwable -> L63
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L63
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L8e
                r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L8e
                throw r2     // Catch: java.lang.Throwable -> L8e
            L8e:
                r0 = move-exception
                r2 = r1
            L90:
                if (r2 == 0) goto Lb3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Error when loading lib: "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r2 = " lib hash: "
                r1.append(r2)
                java.lang.String r9 = r8.c(r9)
                r1.append(r9)
                java.lang.String r9 = " search path is "
                r1.append(r9)
                r1.append(r10)
            Lb3:
                throw r0
            Lb4:
                java.lang.System.load(r9)
            Lb7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.a.b(java.lang.String, int):void");
        }

        public final String c(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return str2;
                        }
                        messageDigest.update(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
                return e.toString();
            }
        }
    }

    public static void a(Context context, ArrayList<b4n> arrayList, int i2) throws IOException {
        if ((l & 8) != 0) {
            f = null;
            File fileS = bbq.s(context, "lib-main");
            try {
                SysUtil.c(fileS);
                return;
            } catch (IOException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to delete ");
                sb.append(fileS.getCanonicalPath());
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        ce1 ce1Var = new ce1(context, file, "lib-main", i2);
        arrayList2.add(ce1Var);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adding backup source from : ");
            sb2.append(ce1Var.toString());
        }
        d(context, i2, arrayList2);
        f = (bbq[]) arrayList2.toArray(new bbq[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    public static void b(ArrayList<b4n> arrayList, String[] strArr) {
        String str = SysUtil.k() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str + ":" + str2;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            if (Log.isLoggable("SoLoader", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("adding system library source: ");
                sb.append(str3);
            }
            arrayList.add(new b(new File(str3), 2, strArr));
        }
    }

    public static void c(Context context, ArrayList<b4n> arrayList, int i2) {
        g = new wi1(context, i2);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("adding application source: ");
            sb.append(g.toString());
        }
        arrayList.add(0, g);
    }

    public static void d(Context context, int i2, ArrayList<bbq> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            Log.isLoggable("SoLoader", 3);
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                File file = new File(strArr[i3]);
                StringBuilder sb = new StringBuilder();
                sb.append("lib-");
                int i5 = i4 + 1;
                sb.append(i4);
                ce1 ce1Var = new ce1(context, file, sb.toString(), i2);
                if (Log.isLoggable("SoLoader", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("adding backup source: ");
                    sb2.append(ce1Var.toString());
                }
                arrayList.add(ce1Var);
                i3++;
                i4 = i5;
            }
        }
    }

    public static void e(Context context, ArrayList<b4n> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            Log.isLoggable("SoLoader", 3);
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                com.facebook.soloader.a aVar = new com.facebook.soloader.a(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("adding directApk source: ");
                    sb.append(aVar.toString());
                }
                arrayList.add(0, aVar);
            }
        }
        com.facebook.soloader.a aVar2 = new com.facebook.soloader.a(context);
        if (Log.isLoggable("SoLoader", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adding directApk source: ");
            sb2.append(aVar2.toString());
        }
        arrayList.add(0, aVar2);
    }

    public static void f() {
        if (!p()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0089 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) throws java.lang.UnsatisfiedLinkError {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.g(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    public static int h(Context context, int i2) {
        int i3 = m;
        if (i3 != 0) {
            return i3;
        }
        int i4 = 1;
        if ((i2 & 32) == 0 && context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i5 = applicationInfo.flags;
            if ((i5 & 1) != 0) {
                i4 = (i5 & 128) != 0 ? 3 : 2;
            }
            if (Log.isLoggable("SoLoader", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ApplicationInfo.flags is: ");
                sb.append(applicationInfo.flags);
                sb.append(" appType is: ");
                sb.append(i4);
            }
        }
        return i4;
    }

    public static int i() {
        int i2 = m;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static Method j() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    public static void k(Context context, int i2) throws IOException {
        l(context, i2, null, f7604k);
    }

    public static void l(Context context, int i2, a4n a4nVar, String[] strArr) throws IOException {
        if (p()) {
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            int iH = h(context, i2);
            m = iH;
            if ((i2 & 128) == 0 && SysUtil.l(context, iH)) {
                i2 |= 72;
            }
            n(a4nVar);
            o(context, i2, strArr);
            shg.b(new uhg());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void m(Context context, boolean z) {
        try {
            l(context, z ? 1 : 0, null, f7604k);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized void n(a4n a4nVar) {
        if (a4nVar == null) {
            if (f7603b != null) {
                return;
            }
        }
        if (a4nVar != null) {
            f7603b = a4nVar;
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        Method methodJ = j();
        boolean z = methodJ != null;
        String strA = z ? SysUtil.Api14Utils.a() : null;
        f7603b = new a(z, strA, w(strA), runtime, methodJ);
    }

    public static void o(Context context, int i2, String[] strArr) throws IOException {
        if (d != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        if (d != null) {
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        try {
            l = i2;
            ArrayList arrayList = new ArrayList();
            b(arrayList, strArr);
            if (context != null) {
                if ((i2 & 1) != 0) {
                    f = null;
                    Log.isLoggable("SoLoader", 3);
                    arrayList.add(0, new ri8(context, "lib-main"));
                } else {
                    if ((i2 & 64) != 0) {
                        e(context, arrayList);
                    }
                    c(context, arrayList, i());
                    a(context, arrayList, 1);
                }
            }
            b4n[] b4nVarArr = (b4n[]) arrayList.toArray(new b4n[arrayList.size()]);
            int iX = x();
            int length = b4nVarArr.length;
            while (true) {
                int i3 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (Log.isLoggable("SoLoader", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Preparing SO source: ");
                    sb.append(b4nVarArr[i3]);
                }
                boolean z = f7602a;
                if (z) {
                    Api18TraceUtils.a("SoLoader", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, b4nVarArr[i3].getClass().getSimpleName());
                }
                b4nVarArr[i3].b(iX);
                if (z) {
                    Api18TraceUtils.b();
                }
                length = i3;
            }
            d = b4nVarArr;
            e.getAndIncrement();
            if (Log.isLoggable("SoLoader", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("init finish: ");
                sb2.append(d.length);
                sb2.append(" SO sources prepared");
            }
        } finally {
            c.writeLock().unlock();
        }
    }

    public static boolean p() {
        if (d != null) {
            return true;
        }
        c.readLock().lock();
        try {
            return d != null;
        } finally {
            c.readLock().unlock();
        }
    }

    public static boolean q(String str) {
        return r(str, 0);
    }

    public static boolean r(String str, int i2) throws UnsatisfiedLinkError {
        Boolean boolV = v(str);
        if (boolV != null) {
            return boolV.booleanValue();
        }
        if (m != 2) {
        }
        String strB = uqf.b(str);
        return t(System.mapLibraryName(strB != null ? strB : str), str, strB, i2, null);
    }

    public static void s(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        u(str, null, null, i2, threadPolicy);
    }

    public static boolean t(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean zU = false;
        do {
            try {
                zU = u(str, str2, str3, i2, threadPolicy);
                z = false;
            } catch (UnsatisfiedLinkError e2) {
                int i3 = e.get();
                c.writeLock().lock();
                try {
                    try {
                        if (g == null || !g.d()) {
                            z = false;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("sApplicationSoSource updated during load: ");
                            sb.append(str);
                            sb.append(", attempting load again.");
                            e.getAndIncrement();
                            z = true;
                        }
                        c.writeLock().unlock();
                        if (e.get() == i3) {
                            throw e2;
                        }
                    } catch (IOException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (Throwable th) {
                    c.writeLock().unlock();
                    throw th;
                }
            }
        } while (z);
        return zU;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00c4 A[Catch: all -> 0x005f, PHI: r3
      0x00c4: PHI (r3v3 boolean) = (r3v2 boolean), (r3v4 boolean), (r3v4 boolean) binds: [B:26:0x0048, B:42:0x0066, B:56:0x009f] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {, blocks: (B:28:0x004c, B:33:0x0056, B:43:0x0068, B:45:0x0070, B:48:0x0080, B:49:0x0083, B:51:0x008b, B:53:0x009a, B:59:0x00a2, B:60:0x00a3, B:62:0x00a9, B:64:0x00b1, B:65:0x00c0, B:66:0x00c1, B:68:0x00c3, B:69:0x00c4, B:71:0x00c8, B:73:0x00ce, B:78:0x00db, B:80:0x00df, B:90:0x0112, B:94:0x013a, B:96:0x013e, B:97:0x0141, B:98:0x0142, B:54:0x009b, B:55:0x009e, B:29:0x004d, B:32:0x0055, B:41:0x0065, B:81:0x00e6, B:83:0x00ee, B:88:0x0108, B:92:0x0116, B:93:0x0139), top: B:117:0x004c, outer: #7, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[Catch: all -> 0x005f, TryCatch #6 {, blocks: (B:28:0x004c, B:33:0x0056, B:43:0x0068, B:45:0x0070, B:48:0x0080, B:49:0x0083, B:51:0x008b, B:53:0x009a, B:59:0x00a2, B:60:0x00a3, B:62:0x00a9, B:64:0x00b1, B:65:0x00c0, B:66:0x00c1, B:68:0x00c3, B:69:0x00c4, B:71:0x00c8, B:73:0x00ce, B:78:0x00db, B:80:0x00df, B:90:0x0112, B:94:0x013a, B:96:0x013e, B:97:0x0141, B:98:0x0142, B:54:0x009b, B:55:0x009e, B:29:0x004d, B:32:0x0055, B:41:0x0065, B:81:0x00e6, B:83:0x00ee, B:88:0x0108, B:92:0x0116, B:93:0x0139), top: B:117:0x004c, outer: #7, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce A[Catch: all -> 0x005f, TryCatch #6 {, blocks: (B:28:0x004c, B:33:0x0056, B:43:0x0068, B:45:0x0070, B:48:0x0080, B:49:0x0083, B:51:0x008b, B:53:0x009a, B:59:0x00a2, B:60:0x00a3, B:62:0x00a9, B:64:0x00b1, B:65:0x00c0, B:66:0x00c1, B:68:0x00c3, B:69:0x00c4, B:71:0x00c8, B:73:0x00ce, B:78:0x00db, B:80:0x00df, B:90:0x0112, B:94:0x013a, B:96:0x013e, B:97:0x0141, B:98:0x0142, B:54:0x009b, B:55:0x009e, B:29:0x004d, B:32:0x0055, B:41:0x0065, B:81:0x00e6, B:83:0x00ee, B:88:0x0108, B:92:0x0116, B:93:0x0139), top: B:117:0x004c, outer: #7, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00df A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #6 {, blocks: (B:28:0x004c, B:33:0x0056, B:43:0x0068, B:45:0x0070, B:48:0x0080, B:49:0x0083, B:51:0x008b, B:53:0x009a, B:59:0x00a2, B:60:0x00a3, B:62:0x00a9, B:64:0x00b1, B:65:0x00c0, B:66:0x00c1, B:68:0x00c3, B:69:0x00c4, B:71:0x00c8, B:73:0x00ce, B:78:0x00db, B:80:0x00df, B:90:0x0112, B:94:0x013a, B:96:0x013e, B:97:0x0141, B:98:0x0142, B:54:0x009b, B:55:0x009e, B:29:0x004d, B:32:0x0055, B:41:0x0065, B:81:0x00e6, B:83:0x00ee, B:88:0x0108, B:92:0x0116, B:93:0x0139), top: B:117:0x004c, outer: #7, inners: #0, #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee A[Catch: all -> 0x0104, UnsatisfiedLinkError -> 0x0106, TryCatch #3 {UnsatisfiedLinkError -> 0x0106, blocks: (B:81:0x00e6, B:83:0x00ee, B:88:0x0108), top: B:112:0x00e6, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0112 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:28:0x004c, B:33:0x0056, B:43:0x0068, B:45:0x0070, B:48:0x0080, B:49:0x0083, B:51:0x008b, B:53:0x009a, B:59:0x00a2, B:60:0x00a3, B:62:0x00a9, B:64:0x00b1, B:65:0x00c0, B:66:0x00c1, B:68:0x00c3, B:69:0x00c4, B:71:0x00c8, B:73:0x00ce, B:78:0x00db, B:80:0x00df, B:90:0x0112, B:94:0x013a, B:96:0x013e, B:97:0x0141, B:98:0x0142, B:54:0x009b, B:55:0x009e, B:29:0x004d, B:32:0x0055, B:41:0x0065, B:81:0x00e6, B:83:0x00ee, B:88:0x0108, B:92:0x0116, B:93:0x0139), top: B:117:0x004c, outer: #7, inners: #0, #2, #4, #5 }] */
    public static boolean u(String str, String str2, String str3, int i2, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3 = false;
        if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            try {
                HashSet<String> hashSet = h;
                if (!hashSet.contains(str)) {
                    z = false;
                } else {
                    if (str3 == null) {
                        return false;
                    }
                    z = true;
                }
                Map<String, Object> map = i;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                ReentrantReadWriteLock reentrantReadWriteLock = c;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        if (z) {
                            if ((i2 & 16) == 0) {
                                if (!TextUtils.isEmpty(str2)) {
                                    z3 = true;
                                }
                                if (str3 != null) {
                                    z2 = f7602a;
                                    if (z2) {
                                        Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                    }
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("About to merge: ");
                                        sb.append(str2);
                                        sb.append(" / ");
                                        sb.append(str);
                                    }
                                    uqf.a(str2);
                                    j.add(str2);
                                    if (z2) {
                                        Api18TraceUtils.b();
                                    }
                                }
                            }
                            reentrantReadWriteLock.readLock().unlock();
                            return !z;
                        }
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z = true;
                            }
                            if (z) {
                                if ((i2 & 16) == 0) {
                                    if (!TextUtils.isEmpty(str2)) {
                                        z3 = true;
                                    }
                                    if (str3 != null) {
                                        z2 = f7602a;
                                        if (z2) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        if (Log.isLoggable("SoLoader", 3)) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("About to merge: ");
                                            sb2.append(str2);
                                            sb2.append(" / ");
                                            sb2.append(str);
                                        }
                                        uqf.a(str2);
                                        j.add(str2);
                                        if (z2) {
                                            Api18TraceUtils.b();
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return !z;
                            }
                            try {
                                if (Log.isLoggable("SoLoader", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("About to load: ");
                                    sb3.append(str);
                                }
                                g(str, i2, threadPolicy);
                                if (Log.isLoggable("SoLoader", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Loaded: ");
                                    sb4.append(str);
                                }
                                synchronized (SoLoader.class) {
                                    hashSet.add(str);
                                }
                                if ((i2 & 16) == 0) {
                                    if (!TextUtils.isEmpty(str2) && j.contains(str2)) {
                                        z3 = true;
                                    }
                                    if (str3 != null && !z3) {
                                        z2 = f7602a;
                                        if (z2) {
                                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                        }
                                        try {
                                            try {
                                                if (Log.isLoggable("SoLoader", 3)) {
                                                    StringBuilder sb5 = new StringBuilder();
                                                    sb5.append("About to merge: ");
                                                    sb5.append(str2);
                                                    sb5.append(" / ");
                                                    sb5.append(str);
                                                }
                                                uqf.a(str2);
                                                j.add(str2);
                                                if (z2) {
                                                    Api18TraceUtils.b();
                                                }
                                            } catch (UnsatisfiedLinkError e2) {
                                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e2);
                                            }
                                        } catch (Throwable th) {
                                            if (f7602a) {
                                                Api18TraceUtils.b();
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return !z;
                            } catch (UnsatisfiedLinkError e3) {
                                String message = e3.getMessage();
                                if (message == null || !message.contains("unexpected e_machine:")) {
                                    throw e3;
                                }
                                throw new WrongAbiError(e3, message.substring(message.lastIndexOf("unexpected e_machine:")));
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    c.readLock().unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static Boolean v(String str) {
        Boolean boolValueOf;
        if (d != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (d == null) {
                if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    synchronized (SoLoader.class) {
                        try {
                            boolean z = !h.contains(str);
                            if (z) {
                                System.loadLibrary(str);
                            }
                            boolValueOf = Boolean.valueOf(z);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return boolValueOf;
                }
                f();
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            c.readLock().unlock();
            throw th2;
        }
    }

    public static String w(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    public static int x() {
        c.writeLock().lock();
        try {
            return (l & 2) != 0 ? 1 : 0;
        } finally {
            c.writeLock().unlock();
        }
    }

    public static File y(String str) throws UnsatisfiedLinkError {
        f();
        try {
            return z(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static File z(String str) throws IOException {
        c.readLock().lock();
        try {
            for (b4n b4nVar : d) {
                File fileC = b4nVar.c(str);
                if (fileC != null) {
                    return fileC;
                }
            }
            throw new FileNotFoundException(str);
        } finally {
            c.readLock().unlock();
        }
    }
}
