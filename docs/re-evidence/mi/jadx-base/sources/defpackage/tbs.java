package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class tbs {
    public static final pbt c = new pbt("AssetPackStorage");
    public static final long d;
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dos f34555b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        d = timeUnit.toMillis(14L);
        e = timeUnit.toMillis(28L);
    }

    public tbs(Context context, dos dosVar) {
        this.f34554a = context;
        this.f34555b = dosVar;
    }

    public static long g(File file, boolean z) {
        if (!file.exists()) {
            return -1L;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            c.e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e2) {
            c.c(e2, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1L;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static boolean n(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zN = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zN &= n(file2);
            }
        }
        if (file.delete()) {
            return zN;
        }
        return false;
    }

    public final File A(String str, int i, long j, String str2) {
        return new File(x(str, i, j), str2);
    }

    public final File B(String str, int i, long j, String str2) {
        return new File(new File(new File(j(str, i, j), "_slices"), "_unverified"), str2);
    }

    public final File C(String str, int i, long j, String str2) {
        return new File(new File(new File(j(str, i, j), "_slices"), "_verified"), str2);
    }

    public final String D(String str) throws IOException {
        int length;
        File file = new File(k(), str);
        if (!file.exists()) {
            c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f34555b.a()));
        if (!file2.exists()) {
            c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f34555b.a()));
            return null;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
            c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f34555b.a()));
            return null;
        }
        if (length <= 1) {
            return fileArrListFiles[0].getCanonicalPath();
        }
        c.b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f34555b.a()));
        return null;
    }

    public final Map E() {
        HashMap map = new HashMap();
        Iterator it = m().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int iG = (int) g(h(name), true);
            long jG = g(s(name, iG), true);
            if (t(name, iG, jG).exists()) {
                map.put(name, Long.valueOf(jG));
            }
        }
        return map;
    }

    public final Map F() {
        HashMap map = new HashMap();
        for (String str : G().keySet()) {
            map.put(str, Long.valueOf(q(str)));
        }
        return map;
    }

    public final Map G() {
        HashMap map = new HashMap();
        try {
            for (File file : m()) {
                uk1 uk1VarR = r(file.getName());
                if (uk1VarR != null) {
                    map.put(file.getName(), uk1VarR);
                }
            }
        } catch (IOException e2) {
            c.b("Could not process directory while scanning installed packs: %s", e2);
        }
        return map;
    }

    public final void H() {
        n(k());
    }

    public final void a(String str, int i, long j, int i2) throws IOException {
        File fileI = i(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        fileI.getParentFile().mkdirs();
        fileI.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileI);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void b(String str, int i, long j) {
        File fileH = h(str);
        if (fileH.exists()) {
            for (File file : fileH.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    n(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            n(file2);
                        }
                    }
                }
            }
        }
    }

    public final void c(List list) {
        int iA = this.f34555b.a();
        for (File file : m()) {
            if (!list.contains(file.getName()) && g(file, true) != iA) {
                n(file);
            }
        }
    }

    public final boolean d(String str, int i, long j) {
        if (j(str, i, j).exists()) {
            return n(j(str, i, j));
        }
        return true;
    }

    public final boolean e(String str, int i, long j) {
        if (t(str, i, j).exists()) {
            return n(t(str, i, j));
        }
        return true;
    }

    public final boolean f(String str) {
        try {
            return D(str) != null;
        } catch (IOException unused) {
        }
    }

    public final File h(String str) {
        return new File(k(), str);
    }

    public final File i(String str, int i, long j) {
        return new File(v(str, i, j), "merge.tmp");
    }

    public final File j(String str, int i, long j) {
        return new File(new File(new File(l(), str), String.valueOf(i)), String.valueOf(j));
    }

    public final File k() {
        return new File(this.f34554a.getFilesDir(), "assetpacks");
    }

    public final File l() {
        return new File(k(), "_tmp");
    }

    public final List m() {
        ArrayList arrayList = new ArrayList();
        try {
            if (k().exists() && k().listFiles() != null) {
                for (File file : k().listFiles()) {
                    if (!file.getCanonicalPath().equals(l().getCanonicalPath())) {
                        arrayList.add(file);
                    }
                }
            }
        } catch (IOException e2) {
            c.b("Could not process directory while scanning installed packs. %s", e2);
        }
        return arrayList;
    }

    public final int o(String str) {
        return (int) g(h(str), true);
    }

    public final int p(String str, int i, long j) throws IOException {
        File fileI = i(str, i, j);
        if (!fileI.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(fileI);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") == null) {
                throw new ugs("Merge checkpoint file corrupt.");
            }
            try {
                return Integer.parseInt(properties.getProperty("numberOfMerges"));
            } catch (NumberFormatException e2) {
                throw new ugs("Merge checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long q(String str) {
        return g(s(str, (int) g(h(str), true)), true);
    }

    public final uk1 r(String str) throws IOException {
        String strD = D(str);
        if (strD == null) {
            return null;
        }
        File file = new File(strD, "assets");
        if (file.isDirectory()) {
            return new hcs(0, strD, file.getCanonicalPath());
        }
        c.b("Failed to find assets directory: %s", file);
        return null;
    }

    public final File s(String str, int i) {
        return new File(h(str), String.valueOf(i));
    }

    public final File t(String str, int i, long j) {
        return new File(s(str, i), String.valueOf(j));
    }

    public final File u(String str, int i, long j) {
        return new File(t(str, i, j), "_metadata");
    }

    public final File v(String str, int i, long j) {
        return new File(j(str, i, j), "_packs");
    }

    public final File w(String str, int i, long j) {
        return new File(u(str, i, j), "properties.dat");
    }

    public final File x(String str, int i, long j) {
        return new File(new File(j(str, i, j), "_slices"), "_metadata");
    }

    public final File y(String str, int i, long j, String str2) {
        return new File(A(str, i, j, str2), "checkpoint_ext.dat");
    }

    public final File z(String str, int i, long j, String str2) {
        return new File(A(str, i, j, str2), "checkpoint.dat");
    }
}
