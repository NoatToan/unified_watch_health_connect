package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class j04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22275a = "code_cache" + File.separator + "secondary-dexes";

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22277b;
        public final /* synthetic */ Set c;
        public final /* synthetic */ CountDownLatch d;

        public a(String str, String str2, Set set, CountDownLatch countDownLatch) {
            this.f22276a = str;
            this.f22277b = str2;
            this.c = set;
            this.d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            DexFile dexFile = null;
            try {
                if (this.f22276a.endsWith(".zip")) {
                    dexFile = DexFile.loadDex(this.f22276a, this.f22276a + ".tmp", 0);
                } else {
                    dexFile = new DexFile(this.f22276a);
                }
                Enumeration<String> enumerationEntries = dexFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    String strNextElement = enumerationEntries.nextElement();
                    if (strNextElement.startsWith(this.f22277b)) {
                        this.c.add(strNextElement);
                    }
                }
            } catch (Throwable unused) {
                if (dexFile != null) {
                }
                this.d.countDown();
            }
            try {
                dexFile.close();
            } catch (Throwable unused2) {
            }
            this.d.countDown();
        }
    }

    public static Set<String> a(Context context, String str) throws InterruptedException, PackageManager.NameNotFoundException, IOException {
        HashSet hashSet = new HashSet();
        List<String> listC = c(context);
        CountDownLatch countDownLatch = new CountDownLatch(listC.size());
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            nw5.a().execute(new a(it.next(), str, hashSet, countDownLatch));
        }
        countDownLatch.await();
        StringBuilder sb = new StringBuilder();
        sb.append("Filter ");
        sb.append(hashSet.size());
        sb.append(" classes by packageName <");
        sb.append(str);
        sb.append(">");
        return hashSet;
    }

    public static SharedPreferences b(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    public static List<String> c(Context context) throws PackageManager.NameNotFoundException, IOException {
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!d()) {
            int i = b(context).getInt("dex.number", 1);
            File file2 = new File(applicationInfo.dataDir, f22275a);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (!file3.isFile()) {
                    throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
                }
                arrayList.add(file3.getAbsolutePath());
            }
        }
        if (kb.b()) {
            arrayList.addAll(f(applicationInfo));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d A[PHI: r1
      0x001d: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:13:0x004a, B:15:0x004e, B:6:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean d() {
        boolean z = false;
        String str = null;
        try {
            if (e()) {
                str = "'YunOS'";
                if (Integer.valueOf(System.getProperty("ro.build.version.sdk")).intValue() >= 21) {
                    z = true;
                }
            } else {
                str = "'Android'";
                String property = System.getProperty("java.vm.version");
                if (property != null) {
                    Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                    if (matcher.matches()) {
                        int i = Integer.parseInt(matcher.group(1));
                        int i2 = Integer.parseInt(matcher.group(2));
                        if (i > 2 || (i == 2 && i2 >= 1)) {
                            z = true;
                        }
                    }
                }
            }
        } catch (NumberFormatException | Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with name ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        return z;
    }

    public static boolean e() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            return (property2 != null && property2.toLowerCase().contains("lemur")) || (property != null && property.trim().length() > 0);
        } catch (Exception unused) {
            return false;
        }
    }

    public static List<String> f(ApplicationInfo applicationInfo) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            arrayList.addAll(Arrays.asList(strArr));
        } else {
            try {
                File file = new File((String) Class.forName("com.android.tools.fd.runtime.Paths").getMethod("getDexFileDirectory", String.class).invoke(null, applicationInfo.packageName));
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        if (file2 != null && file2.exists() && file2.isFile() && file2.getName().endsWith(".dex")) {
                            arrayList.add(file2.getAbsolutePath());
                        }
                    }
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("InstantRun support error, ");
                sb.append(e.getMessage());
            }
        }
        return arrayList;
    }
}
