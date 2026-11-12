package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public final class xnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f53191a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f53192b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f53193c = 3;
    private static String d = null;
    private static int e = 204800;
    private static BufferedWriter g = null;
    private static boolean h = false;

    public static void a(int i, String str, int i2, boolean z) throws IOException {
        h = z;
        if (i > 0) {
            e = i;
        }
        if (i2 > 0) {
            if (i2 > 50) {
                i2 = 50;
            }
            f53193c = i2;
        }
        if (str != null) {
            d = str;
            f53192b = true;
        } else {
            f53192b = false;
        }
        Log.i("LogWrite", "fileLoggerEnable: " + f53192b);
        if (f53192b) {
            File file = new File(d);
            if (!file.exists() && !file.mkdirs()) {
                Log.e("LogWrite", "createFolder fail");
            } else {
                d(d, c());
            }
        }
    }

    private static void d(String str, String str2) throws IOException {
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e("LogWrite", "createNewLogFile Exception");
            return;
        }
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length >= f53193c) {
            try {
                Arrays.sort(fileArrListFiles, new a());
            } catch (IllegalArgumentException unused) {
                Log.e("LogWrite", "Arrays sort IllegalArgumentException");
            }
            d(fileArrListFiles);
        }
        synchronized (xnh.class) {
            BufferedWriter bufferedWriter = g;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException unused2) {
                    Log.e("LogWrite", "createNewLogFile close IOException");
                }
                try {
                    fileOutputStream = new FileOutputStream(new File(str, str2));
                    try {
                        outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                        try {
                            g = new BufferedWriter(outputStreamWriter);
                            f53191a = str2;
                            outputStreamWriter.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                outputStreamWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception unused3) {
                    Log.e("LogWrite", "createNewLogFile IOException");
                }
            } else {
                fileOutputStream = new FileOutputStream(new File(str, str2));
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                g = new BufferedWriter(outputStreamWriter);
                f53191a = str2;
                outputStreamWriter.close();
                fileOutputStream.close();
            }
            throw th;
        }
    }

    private static boolean d(File[] fileArr) {
        if (fileArr == null || fileArr.length <= 0) {
            return false;
        }
        return fileArr[0].delete();
    }

    private static void b(String str, String str2) throws IOException {
        FileOutputStream fileOutputStream;
        OutputStreamWriter outputStreamWriter;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e("LogWrite", "openLogFile Exception");
            return;
        }
        synchronized (xnh.class) {
            BufferedWriter bufferedWriter = g;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException unused) {
                    Log.e("LogWrite", "createNewLogFile close IOException");
                }
                try {
                    fileOutputStream = new FileOutputStream(new File(str, str2), true);
                    try {
                        outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                        try {
                            g = new BufferedWriter(outputStreamWriter);
                            f53191a = str2;
                            outputStreamWriter.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                outputStreamWriter.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Exception unused2) {
                    Log.e("LogWrite", "openLogFile  Exception");
                }
            } else {
                fileOutputStream = new FileOutputStream(new File(str, str2), true);
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                g = new BufferedWriter(outputStreamWriter);
                f53191a = str2;
                outputStreamWriter.close();
                fileOutputStream.close();
            }
            throw th;
        }
    }

    private static String c() {
        String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(Calendar.getInstance().getTime());
        return Process.myPid() + "_" + str + ".log";
    }

    public static void b() {
        synchronized (xnh.class) {
            BufferedWriter bufferedWriter = g;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException unused) {
                    Log.e("LogWrite", "shutdown IOException");
                }
                g = null;
            } else {
                g = null;
            }
            throw th;
        }
    }

    public static void a(String str, String str2, String str3, Throwable th) {
        synchronized (xnh.class) {
            try {
                try {
                    if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(f53191a)) {
                        if (new File(d, f53191a).length() > e) {
                            d(d, c());
                        } else if (g == null) {
                            b(d, f53191a);
                        }
                        g.append((CharSequence) String.format(Locale.ENGLISH, "%s: %s/%s: %s", d(), str, str2, str3 + '\n' + Log.getStackTraceString(th)));
                        g.flush();
                        return;
                    }
                    Log.e("LogWrite", "wtf Exception");
                } catch (IOException unused) {
                    Log.e("LogWrite", "wtf IOException");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static String d() {
        return new SimpleDateFormat("yy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    static class a implements Comparator<File>, Serializable {
        private static final long serialVersionUID = 1;

        private a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }
}
