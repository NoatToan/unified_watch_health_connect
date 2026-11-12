package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.huawei.hihealth.HiDataFilter;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes15.dex */
public class pyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45996a = "code_cache" + File.separator + "secondary-dexes";

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static Set<String> a(Context context, final String str) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        final HashSet hashSet = new HashSet();
        List<String> listB = b(context);
        final CountDownLatch countDownLatch = new CountDownLatch(listB.size());
        for (final String str2 : listB) {
            pyn.c().execute(new Runnable() { // from class: pyv.5
                /* JADX WARN: Code duplicated, block: B:31:0x0066 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0
                  0x0066: PHI (r0v3 dalvik.system.DexFile) = (r0v1 dalvik.system.DexFile), (r0v6 dalvik.system.DexFile) binds: [B:18:0x0064, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
                @Override // java.lang.Runnable
                public void run() {
                    DexFile dexFile = null;
                    try {
                        if (str2.endsWith(".zip")) {
                            dexFile = DexFile.loadDex(str2, str2 + ".tmp", 0);
                        } else {
                            dexFile = new DexFile(str2);
                        }
                        Enumeration<String> enumerationEntries = dexFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            String strNextElement = enumerationEntries.nextElement();
                            if (strNextElement.startsWith(str)) {
                                hashSet.add(strNextElement);
                            }
                        }
                        if (dexFile != null) {
                        }
                    } catch (Throwable th) {
                        try {
                            pyx.b("Scan map file in dex files made error." + th);
                        } finally {
                            if (dexFile != null) {
                                try {
                                    dexFile.close();
                                } catch (Throwable unused) {
                                }
                            }
                            countDownLatch.countDown();
                        }
                    }
                }
            });
        }
        countDownLatch.await();
        pyx.e("Filter " + hashSet.size() + " classes by packageName <" + str + HiDataFilter.DataFilterExpression.BIGGER_THAN);
        return hashSet;
    }

    public static List<String> b(Context context) throws PackageManager.NameNotFoundException, IOException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!a()) {
            int i = a(context).getInt("dex.number", 1);
            File file2 = new File(applicationInfo.dataDir, f45996a);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (!file3.isFile()) {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
                arrayList.add(file3.getAbsolutePath());
            }
        }
        if (pyl.b()) {
            arrayList.addAll(b(applicationInfo));
        }
        return arrayList;
    }

    private static List<String> b(ApplicationInfo applicationInfo) {
        ArrayList arrayList = new ArrayList();
        if (applicationInfo.splitSourceDirs != null) {
            arrayList.addAll(Arrays.asList(applicationInfo.splitSourceDirs));
            pyx.e("Found InstantRun support");
            return arrayList;
        }
        try {
            File file = new File((String) Class.forName("com.android.tools.fd.runtime.Paths").getMethod("getDexFileDirectory", String.class).invoke(null, applicationInfo.packageName));
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null && file2.exists() && file2.isFile() && file2.getName().endsWith(".dex")) {
                        arrayList.add(file2.getAbsolutePath());
                    }
                }
                pyx.e("Found InstantRun support");
                return arrayList;
            }
        } catch (Exception e) {
            pyx.b("InstantRun support error, " + e.getMessage());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e A[PHI: r1
      0x004e: PHI (r1v10 java.lang.String) = (r1v12 java.lang.String), (r1v13 java.lang.String), (r1v14 java.lang.String) binds: [B:17:0x0048, B:19:0x004c, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean a() {
        String strC;
        String str;
        String str2;
        boolean z = false;
        try {
            strC = c();
            try {
                if (strC != 0) {
                    String str3 = "'YunOS'";
                    str2 = str3;
                    strC = str3;
                    if (Integer.valueOf(System.getProperty("ro.build.version.sdk")).intValue() >= 21) {
                        strC = str;
                        str2 = str;
                        str2 = str;
                        strC = str;
                        strC = str;
                        z = true;
                        strC = str2;
                    }
                } else {
                    str = "'Android'";
                    String property = System.getProperty("java.vm.version");
                    strC = str;
                    if (property != null) {
                        Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                        if (matcher.matches()) {
                            int i = Integer.parseInt(matcher.group(1));
                            int i2 = Integer.parseInt(matcher.group(2));
                            if (i > 2 || (i == 2 && i2 >= 1)) {
                                strC = str;
                                str2 = str;
                                str2 = str;
                                strC = str;
                                strC = str;
                                z = true;
                                strC = str2;
                            }
                        }
                    }
                }
                strC = str;
            } catch (NumberFormatException | Exception unused) {
            }
        } catch (Exception unused2) {
            strC = 0;
        }
        StringBuilder sb = new StringBuilder("VM with name ");
        sb.append(strC);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        pyx.a(sb.toString());
        return z;
    }

    private static boolean c() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            return (property2 != null && property2.toLowerCase().contains("lemur")) || (property != null && property.trim().length() > 0);
        } catch (Exception unused) {
        }
    }
}
