package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import android.os.Process;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public class AsCache {
    public static final String FEED_BACK_CACHE_FILE_NAME = "feedback";
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    private static final char SEPARATOR = ' ';
    private static final String TAG = "AsCache";
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static Map<String, AsCache> mInstanceMap = new HashMap();
    private c mCache;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f21891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicLong f21892c;
        private final int d;
        private final Map<File, Long> e;
        private ThreadPoolExecutor g;
        private File i;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(String str) {
            return c(str).delete();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(File file) {
            int iAddAndGet = this.f21891b.get();
            while (iAddAndGet + 1 > this.d) {
                this.f21892c.addAndGet(-c());
                iAddAndGet = this.f21891b.addAndGet(-1);
            }
            this.f21891b.addAndGet(1);
            long jB = b(file);
            long jAddAndGet = this.f21892c.get();
            while (jAddAndGet + jB > this.f21890a) {
                jAddAndGet = this.f21892c.addAndGet(-c());
            }
            this.f21892c.addAndGet(jB);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            lValueOf.getClass();
            file.setLastModified(jCurrentTimeMillis);
            this.e.put(file, lValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File d(String str) {
            return new File(this.i, str.hashCode() + "");
        }

        private long c() {
            File key;
            if (this.e.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.e.entrySet();
            synchronized (this.e) {
                key = null;
                Long value = null;
                for (Map.Entry<File, Long> entry : setEntrySet) {
                    if (key == null) {
                        key = entry.getKey();
                        value = entry.getValue();
                    } else {
                        Long value2 = entry.getValue();
                        if (value2.longValue() < value.longValue()) {
                            key = entry.getKey();
                            value = value2;
                        }
                    }
                }
            }
            long jB = b(key);
            if (key != null && key.delete()) {
                this.e.remove(key);
            }
            return jB;
        }

        private void d() {
            this.g.execute(new RunnableC0260c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File c(String str) {
            File fileD = d(str);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            lValueOf.getClass();
            fileD.setLastModified(jCurrentTimeMillis);
            this.e.put(fileD, lValueOf);
            return fileD;
        }

        class b implements ThreadFactory {
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(AsCache.TAG);
            }

            b() {
            }
        }

        /* JADX INFO: renamed from: com.huawei.phoneservice.feedbackcommon.utils.AsCache$c$c, reason: collision with other inner class name */
        class RunnableC0260c implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                File[] fileArrListFiles = c.this.i.listFiles();
                if (fileArrListFiles != null) {
                    int iB = 0;
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        iB = (int) (((long) iB) + c.this.b(file));
                        i++;
                        c.this.e.put(file, Long.valueOf(file.lastModified()));
                    }
                    c.this.f21892c.set(iB);
                    c.this.f21891b.set(i);
                }
            }

            RunnableC0260c() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b(File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        private c(File file, long j, int i) {
            this.e = Collections.synchronizedMap(new HashMap());
            this.i = file;
            this.f21890a = j;
            this.d = i;
            this.f21892c = new AtomicLong();
            this.f21891b = new AtomicInteger();
            this.g = new ThreadPoolExecutor(2, 4, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(2), new b());
            d();
        }
    }

    static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean a(String str) {
            return b(c(str));
        }

        private static byte[] c(String str) {
            try {
                return str.getBytes("utf-8");
            } catch (UnsupportedEncodingException e) {
                com.huawei.phoneservice.faq.base.util.g.c(AsCache.TAG, "UnsupportedEncodingException " + e.getMessage());
                return new byte[0];
            }
        }

        private static boolean b(byte[] bArr) {
            String[] strArrA = a(bArr);
            if (strArrA != null && strArrA.length == 2) {
                String strSubstring = strArrA[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1);
                }
                if (System.currentTimeMillis() > Long.parseLong(strSubstring) + (Long.parseLong(strArrA[1]) * 1000)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String b(String str) {
            return (str == null || !d(c(str))) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        private static boolean d(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && d(bArr, AsCache.SEPARATOR) > 14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String c(int i, String str) {
            return b(i) + str;
        }

        private static String[] a(byte[] bArr) {
            return d(bArr) ? new String[]{new String(b(bArr, 0, 13)), new String(b(bArr, 14, d(bArr, AsCache.SEPARATOR)))} : new String[0];
        }

        private static byte[] b(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 >= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
                return bArr2;
            }
            throw new IllegalArgumentException(i + " > " + i2);
        }

        private static String b(int i) {
            String str = System.currentTimeMillis() + "";
            while (str.length() < 13) {
                str = "0" + str;
            }
            return str + Constants.LINK + i + AsCache.SEPARATOR;
        }

        private static int d(byte[] bArr, char c2) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] == c2) {
                    return i;
                }
            }
            return -1;
        }
    }

    public boolean remove(String str) {
        return this.mCache.a(str);
    }

    public void put(String str, String str2, int i) throws Throwable {
        put(str, b.c(i, str2));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void put(String str, String str2) throws Throwable {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        File fileD = this.mCache.d(str);
        BufferedWriter bufferedWriter2 = null;
        bufferedWriter2 = null;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(fileD);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter, 1024);
                    try {
                        bufferedWriter.write(str2);
                        bufferedWriter.flush();
                        fileWriter.flush();
                        try {
                            bufferedWriter.close();
                        } catch (IOException e) {
                            com.huawei.phoneservice.faq.base.util.g.c(TAG, e.getMessage());
                        }
                    } catch (IOException e2) {
                        e = e2;
                        fileWriter2 = fileWriter;
                        try {
                            com.huawei.phoneservice.faq.base.util.g.c(TAG, "put failed " + e.getMessage());
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e3) {
                                    com.huawei.phoneservice.faq.base.util.g.c(TAG, e3.getMessage());
                                }
                            }
                            if (fileWriter2 != null) {
                                fileWriter = fileWriter2;
                            }
                            this.mCache.e(fileD);
                        } catch (Throwable th) {
                            th = th;
                            fileWriter = fileWriter2;
                            bufferedWriter2 = bufferedWriter;
                            if (bufferedWriter2 != null) {
                                try {
                                    bufferedWriter2.close();
                                } catch (IOException e4) {
                                    com.huawei.phoneservice.faq.base.util.g.c(TAG, e4.getMessage());
                                }
                            }
                            if (fileWriter != null) {
                                try {
                                    fileWriter.close();
                                } catch (IOException e5) {
                                    com.huawei.phoneservice.faq.base.util.g.c(TAG, e5.getMessage());
                                }
                            }
                            this.mCache.e(fileD);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter2 = bufferedWriter;
                        if (bufferedWriter2 != null) {
                            bufferedWriter2.close();
                        }
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        this.mCache.e(fileD);
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    bufferedWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    this.mCache.e(fileD);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                bufferedWriter = null;
            } catch (Throwable th4) {
                th = th4;
                fileWriter = null;
            }
            fileWriter.close();
        } catch (IOException e8) {
            com.huawei.phoneservice.faq.base.util.g.c(TAG, e8.getMessage());
        }
        this.mCache.e(fileD);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void put(Context context, String str, String str2) throws Throwable {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        Throwable th;
        Throwable th2;
        File file = new File(context.getCacheDir(), "feedback");
        if (!file.exists()) {
            file.mkdirs();
        }
        File fileD = this.mCache.d(str);
        BufferedWriter bufferedWriter2 = null;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(fileD);
            try {
                bufferedWriter = new BufferedWriter(fileWriter, 1024);
                try {
                    bufferedWriter.write(str2);
                    bufferedWriter.flush();
                    fileWriter.flush();
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        com.huawei.phoneservice.faq.base.util.g.c(TAG, e.getMessage());
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileWriter2 = fileWriter;
                    try {
                        com.huawei.phoneservice.faq.base.util.g.c(TAG, "put failed " + e.getMessage());
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e3) {
                                com.huawei.phoneservice.faq.base.util.g.c(TAG, e3.getMessage());
                            }
                        }
                        if (fileWriter2 != null) {
                            fileWriter = fileWriter2;
                        }
                        this.mCache.e(fileD);
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileWriter = fileWriter2;
                        th = th2;
                        th = th;
                        bufferedWriter2 = bufferedWriter;
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException e4) {
                                com.huawei.phoneservice.faq.base.util.g.c(TAG, e4.getMessage());
                            }
                        }
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e5) {
                                com.huawei.phoneservice.faq.base.util.g.c(TAG, e5.getMessage());
                            }
                        }
                        this.mCache.e(fileD);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                    this.mCache.e(fileD);
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                bufferedWriter = null;
            } catch (Throwable th5) {
                th2 = th5;
                bufferedWriter = null;
                th = th2;
                th = th;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    bufferedWriter2.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
                this.mCache.e(fileD);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            bufferedWriter = null;
        } catch (Throwable th6) {
            th = th6;
            fileWriter = null;
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
            this.mCache.e(fileD);
            throw th;
        }
        try {
            fileWriter.close();
        } catch (IOException e8) {
            com.huawei.phoneservice.faq.base.util.g.c(TAG, e8.getMessage());
        }
        this.mCache.e(fileD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.BufferedReader] */
    public String getAsString(String str) throws Throwable {
        BufferedReader bufferedReader;
        File fileC = this.mCache.c(str);
        ?? Exists = fileC.exists();
        ?? r4 = 0;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(fileC));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    String string = sb.toString();
                    if (!b.a(string)) {
                        String strB = b.b(string);
                        try {
                            bufferedReader.close();
                            return strB;
                        } catch (IOException e) {
                            com.huawei.phoneservice.faq.base.util.g.c(TAG, "getAsString failed " + e.getMessage());
                            return strB;
                        }
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        com.huawei.phoneservice.faq.base.util.g.c(TAG, "getAsString failed " + e2.getMessage());
                    }
                    remove(str);
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    com.huawei.phoneservice.faq.base.util.g.c(TAG, "getAsString failed " + e.getMessage());
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            com.huawei.phoneservice.faq.base.util.g.c(TAG, "getAsString failed " + e4.getMessage());
                        }
                    }
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (r4 != 0) {
                    try {
                        r4.close();
                    } catch (IOException e6) {
                        com.huawei.phoneservice.faq.base.util.g.c(TAG, "getAsString failed " + e6.getMessage());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r4 = Exists;
        }
    }

    private static String myPid() {
        return "_" + Process.myPid();
    }

    public static AsCache get(File file, long j, int i) throws IOException, RuntimeException {
        AsCache asCache = mInstanceMap.get(file.getAbsoluteFile() + myPid());
        if (asCache != null) {
            return asCache;
        }
        AsCache asCache2 = new AsCache(file, j, i);
        mInstanceMap.put(file.getCanonicalPath() + myPid(), asCache2);
        return asCache2;
    }

    public static AsCache get(Context context, String str) throws IOException, RuntimeException {
        return get(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    private AsCache(File file, long j, int i) throws IOException {
        if (file.exists() || file.mkdirs()) {
            this.mCache = new c(file, j, i);
        } else {
            throw new IOException("can't make dirs in " + file.getCanonicalPath());
        }
    }
}
