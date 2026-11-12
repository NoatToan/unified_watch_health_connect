package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public class po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f45736a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f45737b = true;

    public static class e {
        public static void e(String str, String str2) {
            Log.w(str, str2);
        }

        public static void b(String str, String str2) {
            Log.i(str, str2);
        }

        public static void a(String str, String str2) {
            Log.e(str, str2);
        }

        public static void d(String str, String str2) {
            if (po.f45737b) {
                Log.d(str, str2);
            }
        }
    }

    public static boolean b() {
        return f45737b;
    }

    public static void a(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e2;
        if (!f45737b) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    Context context = f45736a;
                    if (context != null && context.getCacheDir() != null) {
                        File file = new File(f45736a.getCacheDir().getAbsolutePath() + "/" + str);
                        StringBuilder sb = new StringBuilder("writeFile file path:");
                        sb.append(file.getAbsolutePath());
                        e.d("Util", sb.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(str2.getBytes());
                            fileOutputStream2 = fileOutputStream;
                        } catch (Exception e3) {
                            e2 = e3;
                            fileOutputStream2 = fileOutputStream;
                            e.a("Util", e2.toString());
                            fileOutputStream2.close();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                } catch (Exception e5) {
                    e2 = e5;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static String e(File file) throws Throwable {
        BufferedReader bufferedReader;
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (Exception e2) {
                            e = e2;
                            bufferedReader2 = bufferedReader;
                            e.printStackTrace();
                            bufferedReader2.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                bufferedReader.close();
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return sb.toString();
    }
}
