package com.xiaomi.onetrack;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.api.h;
import com.xiaomi.onetrack.d.d;
import com.xiaomi.onetrack.f.a;
import com.xiaomi.onetrack.util.aa;
import com.xiaomi.onetrack.util.ac;
import com.xiaomi.onetrack.util.b;
import com.xiaomi.onetrack.util.i;
import com.xiaomi.onetrack.util.k;
import com.xiaomi.onetrack.util.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import xcrash.XCrash;

/* JADX INFO: loaded from: classes11.dex */
public class CrashAnalysis {
    public static final String ANR_CRASH = "anr";
    public static final String JAVA_CRASH = "java";
    public static final String NATIVE_CRASH = "native";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13662a = "CrashAnalysis";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13663b = "com.xiaomi.digest.DigestUtil";
    private static final String c = "calcuateJavaDigest";
    private static final String d = "/sdcard/tombstone";
    private static final String e = "backtrace feature id:\n\t";
    private static final String f = "error reason:\n\t";
    private static final String g = "Crash time: '";
    private static final String h = ".xcrash";
    private static final int i = 604800000;
    private static final int j = 102400;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f13664k = 10;
    private static final int l = 20;
    private static final String m = "@[0-9a-fA-F]{1,10}";
    private static final String n = "\\$[0-9a-fA-F]{1,10}@[0-9a-fA-F]{1,10}";
    private static final String o = "0x[0-9a-fA-F]{1,10}";
    private static final String p = "\\d+[B,KB,MB]*";
    private static final String q = "((java:)|(length=)|(index=)|(Index:)|(Size:))\\d+";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f13665r = 20;
    private static final boolean s = false;
    private static final AtomicBoolean t = new AtomicBoolean(false);
    private final FileProcessor[] u;
    private final h v;

    public static String calculateJavaDigest(String str) {
        String[] strArrSplit = str.replaceAll("\\t", "").split("\\n");
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(strArrSplit.length, 20);
        for (int i2 = 0; i2 < iMin; i2++) {
            strArrSplit[i2] = strArrSplit[i2].replaceAll(q, "$1XX").replaceAll("\\$[0-9a-fA-F]{1,10}@[0-9a-fA-F]{1,10}|@[0-9a-fA-F]{1,10}|0x[0-9a-fA-F]{1,10}", "XX").replaceAll(p, "");
        }
        for (int i3 = 0; i3 < iMin && (!strArrSplit[i3].contains("...") || !strArrSplit[i3].contains("more")); i3++) {
            sb.append(strArrSplit[i3]);
            sb.append('\n');
        }
        return d.h(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, String str2) {
        int i2;
        int iIndexOf;
        int iIndexOf2;
        String strSubstring = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str2.equals(ANR_CRASH)) {
                    int iIndexOf3 = str.indexOf(" tid=1 ");
                    if (iIndexOf3 != -1 && (iIndexOf2 = str.indexOf("\n\n", iIndexOf3)) != -1) {
                        strSubstring = calculateJavaDigest(str.substring(iIndexOf3, iIndexOf2));
                    }
                } else {
                    int iIndexOf4 = str.indexOf(e);
                    if (iIndexOf4 != -1 && (iIndexOf = str.indexOf("\n\n", (i2 = iIndexOf4 + 23))) != -1) {
                        strSubstring = str.substring(i2, iIndexOf);
                    }
                }
            } catch (Exception e2) {
                p.b(f13662a, "calculateFeatureId error: " + e2.toString());
            }
        }
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws Throwable {
        for (FileProcessor fileProcessor : this.u) {
            fileProcessor.a();
        }
    }

    public static boolean isSupport() {
        try {
            boolean z = XCrash.f38990a;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void start(final Context context, final h hVar) {
        if (t.compareAndSet(false, true)) {
            i.a(new Runnable() { // from class: com.xiaomi.onetrack.CrashAnalysis.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        CrashAnalysis crashAnalysis = new CrashAnalysis(context, hVar);
                        if (crashAnalysis.d()) {
                            crashAnalysis.e();
                        } else {
                            p.a(CrashAnalysis.f13662a, "no crash file found");
                        }
                    } catch (Throwable th) {
                        p.b(CrashAnalysis.f13662a, "processCrash error: " + th.toString());
                    }
                }
            });
        } else {
            p.b(f13662a, "run method has been invoked more than once");
        }
    }

    public class FileProcessor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<File> f13669a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f13670b;
        final String c;

        public FileProcessor(String str) {
            this.c = str;
            this.f13670b = str + CrashAnalysis.h;
        }

        public boolean a(File file) {
            if (!file.getName().contains(this.f13670b)) {
                return false;
            }
            this.f13669a.add(file);
            return true;
        }

        private String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] strArrSplit = str.split("__");
            if (strArrSplit.length != 2) {
                return null;
            }
            String[] strArrSplit2 = strArrSplit[0].split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            if (strArrSplit2.length == 3) {
                return strArrSplit2[2];
            }
            return null;
        }

        public void a() throws Throwable {
            for (int i = 0; i < this.f13669a.size(); i++) {
                String absolutePath = this.f13669a.get(i).getAbsoluteFile().getAbsolutePath();
                String strA = a(absolutePath);
                String strA2 = k.a(absolutePath, CrashAnalysis.j);
                if (!TextUtils.isEmpty(strA2) && CrashAnalysis.this.v != null) {
                    String strD = CrashAnalysis.d(strA2, this.c);
                    String strC = CrashAnalysis.c(strA2, this.c);
                    long jB = CrashAnalysis.b(strA2);
                    p.a(CrashAnalysis.f13662a, "fileName: " + absolutePath);
                    p.a(CrashAnalysis.f13662a, "feature id: " + strD);
                    p.a(CrashAnalysis.f13662a, "error: " + strC);
                    p.a(CrashAnalysis.f13662a, "crashTimeStamp: " + jB);
                    CrashAnalysis.this.v.a(strA2, strC, this.c, strA, strD, jB);
                    k.a(new File(absolutePath));
                    p.a(CrashAnalysis.f13662a, "remove reported crash file");
                }
            }
        }
    }

    private CrashAnalysis(Context context, h hVar) {
        try {
            Object objNewInstance = XCrash.InitParameters.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            Boolean bool = Boolean.FALSE;
            a(objNewInstance, "setNativeDumpAllThreads", bool);
            a(objNewInstance, "setLogDir", a());
            a(objNewInstance, "setNativeDumpMap", bool);
            a(objNewInstance, "setNativeDumpFds", bool);
            a(objNewInstance, "setJavaDumpAllThreads", bool);
            a(objNewInstance, "setAnrRethrow", bool);
            boolean z = XCrash.f38990a;
            XCrash.class.getDeclaredMethod("init", Context.class, objNewInstance.getClass()).invoke(null, context.getApplicationContext(), objNewInstance);
            p.a(f13662a, "XCrash init success");
        } catch (Throwable th) {
            p.a(f13662a, "XCrash init failed: " + th.toString());
        }
        this.v = hVar;
        this.u = new FileProcessor[]{new FileProcessor("java"), new FileProcessor(ANR_CRASH), new FileProcessor("native")};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, String str2) {
        int i2;
        int iIndexOf;
        int iIndexOf2;
        int iIndexOf3;
        String strSubstring = "uncategoried";
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str2.equals(ANR_CRASH)) {
                    int iIndexOf4 = str.indexOf(" tid=1 ");
                    if (iIndexOf4 != -1 && (iIndexOf2 = str.indexOf("\n  at ", iIndexOf4)) != -1 && (iIndexOf3 = str.indexOf(10, iIndexOf2 + 6)) != -1) {
                        strSubstring = str.substring(iIndexOf2 + 2, iIndexOf3);
                    }
                } else {
                    int iIndexOf5 = str.indexOf(f);
                    if (iIndexOf5 != -1 && (iIndexOf = str.indexOf("\n\n", (i2 = iIndexOf5 + 15))) != -1) {
                        strSubstring = str.substring(i2, iIndexOf);
                    }
                }
            } catch (Exception e2) {
                p.b(f13662a, "getErrorReasonString error: " + e2.toString());
            }
        }
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long b(String str) {
        int i2;
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            int iIndexOf2 = str.indexOf(g);
            if (iIndexOf2 == -1 || (iIndexOf = str.indexOf("'\n", (i2 = iIndexOf2 + 13))) == -1) {
                return 0L;
            }
            return b.a(str.substring(i2, iIndexOf));
        } catch (Exception e2) {
            p.b(f13662a, "getCrashTimeStamp error: " + e2.toString());
            return 0L;
        }
    }

    public static void a(Context context) {
        try {
            a.a(context.getApplicationContext());
            boolean z = XCrash.f38990a;
            XCrash.class.getDeclaredMethod("initHooker", Context.class, String.class).invoke(null, context.getApplicationContext(), a());
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("registerHook failed: ");
            sb.append(th.toString());
        }
    }

    private long b() {
        long jC = aa.c();
        if (jC == 0) {
            p.a(f13662a, "no ticket data found, return max count");
            return 10L;
        }
        long jB = ac.b();
        if (jC / 100 != jB) {
            p.a(f13662a, "no today's ticket, return max count");
            return 10L;
        }
        long j2 = jC - (jB * 100);
        p.a(f13662a, "today's remain ticket is " + j2);
        return j2;
    }

    private void a(Object obj, String str, Object obj2) throws Exception {
        obj.getClass().getDeclaredMethod(str, obj2.getClass() == Boolean.class ? Boolean.TYPE : obj2.getClass()).invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        boolean z;
        Iterator<File> it;
        List<File> listC = c();
        long jB = b();
        if (listC == null || listC.size() <= 0) {
            z = false;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jB2 = aa.b();
            long j2 = 604800000;
            if (jB2 > jCurrentTimeMillis) {
                jB2 = jCurrentTimeMillis - 604800000;
            }
            Iterator<File> it2 = listC.iterator();
            long j3 = 0;
            long j4 = 0;
            boolean z2 = false;
            while (it2.hasNext()) {
                File next = it2.next();
                long jLastModified = next.lastModified();
                if (jLastModified < jCurrentTimeMillis - j2 || jLastModified > jCurrentTimeMillis) {
                    it = it2;
                    p.a(f13662a, "remove obsolete crash files: " + next.getName());
                    k.a(next);
                } else {
                    if (jLastModified <= jB2) {
                        p.a(f13662a, "found already reported crash file, ignore");
                    } else if (jB > j3) {
                        FileProcessor[] fileProcessorArr = this.u;
                        int length = fileProcessorArr.length;
                        int i2 = 0;
                        while (i2 < length) {
                            Iterator<File> it3 = it2;
                            if (fileProcessorArr[i2].a(next)) {
                                p.a(f13662a, "find crash file:" + next.getName());
                                jB--;
                                z2 = true;
                                if (j4 < jLastModified) {
                                    j4 = jLastModified;
                                }
                            }
                            i2++;
                            it2 = it3;
                        }
                    }
                    it = it2;
                }
                it2 = it;
                j2 = 604800000;
                j3 = 0;
            }
            if (j4 > j3) {
                aa.c(j4);
            }
            z = z2;
        }
        if (z) {
            a(jB);
        }
        return z;
    }

    private static String a() {
        return k.a();
    }

    private List<File> c() {
        File[] fileArrListFiles = new File(a()).listFiles();
        if (fileArrListFiles == null) {
            p.a(f13662a, "this path does not denote a directory, or if an I/O error occurs.");
            return null;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new Comparator<File>() { // from class: com.xiaomi.onetrack.CrashAnalysis.2
            @Override // java.util.Comparator
            public int compare(File file, File file2) {
                return (int) (file.lastModified() - file2.lastModified());
            }
        });
        int size = listAsList.size();
        if (size <= 20) {
            return listAsList;
        }
        int i2 = size - 20;
        for (int i3 = 0; i3 < i2; i3++) {
            k.a(listAsList.get(i3));
        }
        return listAsList.subList(i2, size);
    }

    private void a(long j2) {
        aa.d((ac.b() * 100) + j2);
    }
}
