package com.xiaomi.onetrack.c;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13844a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f13845b = 1;
    public static final long c = 2;
    public static final String d = "eventName";
    public static final String e = "data";
    private static final String f = "NetworkAccessManager";
    private static final String g = "networkAccess";
    private static String h = "onetrack_netaccess_%s";
    private static SimpleDateFormat i = new SimpleDateFormat("yyyyMMdd");
    private static boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile boolean f13846k = true;
    private static volatile boolean l = false;

    public static boolean a() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(String str, String str2) {
        FileWriter fileWriter;
        File file = new File(e(), String.format(h, i.format(new Date())));
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                if (file.getParentFile().exists()) {
                    file.createNewFile();
                } else {
                    new File(file.getParentFile().getAbsolutePath()).mkdirs();
                    file.createNewFile();
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d, str);
            jSONObject.put("data", str2);
            byte[] bArrA = c.a(jSONObject.toString());
            fileWriter = new FileWriter(file, true);
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.write(com.xiaomi.onetrack.d.c.a(bArrA));
                        bufferedWriter2.newLine();
                        f13846k = true;
                        com.xiaomi.onetrack.util.m.a(bufferedWriter2);
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter = bufferedWriter2;
                        com.xiaomi.onetrack.util.p.b(f, "cta doSaveData error: " + e.toString());
                        e.printStackTrace();
                        com.xiaomi.onetrack.util.m.a(bufferedWriter);
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        com.xiaomi.onetrack.util.m.a(bufferedWriter);
                        com.xiaomi.onetrack.util.m.a(fileWriter);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
            fileWriter = null;
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
        com.xiaomi.onetrack.util.m.a(fileWriter);
    }

    private static String e() {
        return com.xiaomi.onetrack.f.a.a().getFilesDir().getAbsolutePath() + File.separator + g;
    }

    public static void a(boolean z) {
        j = z;
    }

    public static boolean b() {
        return !new File(com.xiaomi.onetrack.f.a.a().getFilesDir(), ".ot_net_disallowed").exists();
    }

    public static boolean d() {
        return !l && f13846k;
    }

    public static void a(String str, String str2) {
        com.xiaomi.onetrack.util.i.a(new j(str, str2));
    }

    public static synchronized void a(com.xiaomi.onetrack.api.e eVar) {
        if (d()) {
            if (eVar != null && b()) {
                l = true;
                com.xiaomi.onetrack.util.i.a(new k(eVar));
            }
        }
    }

    public static void b(boolean z) {
        File file = new File(com.xiaomi.onetrack.f.a.a().getFilesDir(), ".ot_net_allowed");
        File file2 = new File(com.xiaomi.onetrack.f.a.a().getFilesDir(), ".ot_net_disallowed");
        try {
            if (z) {
                file.createNewFile();
                if (file2.exists()) {
                    file2.delete();
                }
            } else {
                file2.createNewFile();
                if (file.exists()) {
                    file.delete();
                }
            }
        } catch (IOException e2) {
            com.xiaomi.onetrack.util.p.b(f, "setNetworkAccessStateEnabled: " + z + "failed ", e2);
        }
    }

    public static synchronized void c(boolean z) {
        try {
            try {
                File file = new File(e());
                if (file.exists() && file.isDirectory()) {
                    String str = String.format(h, i.format(new Date()));
                    File[] fileArrListFiles = file.listFiles();
                    for (int i2 = 0; i2 < fileArrListFiles.length; i2++) {
                        if (fileArrListFiles[i2].isFile() && (z || !fileArrListFiles[i2].getName().equalsIgnoreCase(str))) {
                            fileArrListFiles[i2].delete();
                        }
                    }
                    if (file.listFiles().length == 0) {
                        f13846k = false;
                    }
                    return;
                }
                f13846k = false;
            } catch (Exception e2) {
                com.xiaomi.onetrack.util.p.b(f, "cta removeObsoleteEvent error: " + e2.toString());
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    public static synchronized List<JSONObject> c() {
        FileReader fileReader;
        Exception e2;
        BufferedReader bufferedReader;
        File file = new File(e(), String.format(h, i.format(new Date())));
        ?? r3 = 0;
        r3 = 0;
        if (!file.exists()) {
            return null;
        }
        try {
            List<JSONObject> arrayList = new ArrayList<>();
            try {
                fileReader = new FileReader(file);
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            arrayList.add(new JSONObject(c.a(com.xiaomi.onetrack.d.c.a(line))));
                        } catch (Exception e3) {
                            e2 = e3;
                            com.xiaomi.onetrack.util.p.b(f, "cta getCacheData error: " + e2.toString());
                            e2.printStackTrace();
                            com.xiaomi.onetrack.util.m.a(bufferedReader);
                        }
                    }
                    com.xiaomi.onetrack.util.m.a(bufferedReader);
                } catch (Exception e4) {
                    e2 = e4;
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    com.xiaomi.onetrack.util.m.a((Closeable) r3);
                    com.xiaomi.onetrack.util.m.a(fileReader);
                    throw th;
                }
            } catch (Exception e5) {
                fileReader = null;
                e2 = e5;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                fileReader = null;
            }
            com.xiaomi.onetrack.util.m.a(fileReader);
            if (arrayList.size() > 100) {
                arrayList = arrayList.subList(arrayList.size() - 100, arrayList.size());
            }
            if (arrayList.size() > 0) {
                f13846k = true;
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            r3 = file;
        }
    }
}
