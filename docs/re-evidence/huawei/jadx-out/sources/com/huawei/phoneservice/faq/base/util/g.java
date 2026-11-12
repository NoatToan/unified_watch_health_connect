package com.huawei.phoneservice.faq.base.util;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21586c = false;
    private static Context d;

    public static void d(String str, String str2) {
        c(5, str, str2);
    }

    public static void a(String str, String str2) {
        c(8, str, str2);
    }

    public static void b(String str, String str2) {
        c(4, str, str2);
    }

    public static void b(String str, Throwable th) {
        d(5, str, th);
    }

    public static void a(String str, String str2, Object... objArr) {
        a(5, str, null, str2, objArr);
    }

    public static void c(String str, String str2) {
        c(5, str, str2);
    }

    public static void c(String str, String str2, Object... objArr) {
        a(3, str, null, str2, objArr);
    }

    public static void e(String str, String str2) {
        c(3, str, str2);
    }

    private static String e() {
        return d.getFilesDir().getAbsolutePath() + File.separator + "feedbackLog";
    }

    public static void c(boolean z, Application application) {
        f21586c = z;
        d = application;
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        a(5, str, th, str2, objArr);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    private static void f(String str, String str2) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        FileWriter fileWriter2;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        String str3 = simpleDateFormat.format(date);
        String str4 = simpleDateFormat2.format(date) + " " + str + " " + str2;
        File file = new File(e());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file.toString(), str3);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException unused) {
                Log.e("FaqLogger", "  createNewFile Exception  ");
            }
        }
        BufferedWriter bufferedWriter2 = null;
        bufferedWriter2 = null;
        FileWriter fileWriter3 = null;
        try {
            fileWriter2 = new FileWriter(file2, true);
            try {
                bufferedWriter = new BufferedWriter(fileWriter2);
                try {
                    bufferedWriter.write(str4);
                    bufferedWriter.newLine();
                    try {
                        bufferedWriter.close();
                    } catch (IOException unused2) {
                        Log.e("FaqLogger", "  bufferedWriter Exception  ");
                    }
                } catch (IOException unused3) {
                    fileWriter3 = fileWriter2;
                    try {
                        Log.e("FaqLogger", "  IOException ");
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException unused4) {
                                Log.e("FaqLogger", "  bufferedWriter Exception  ");
                            }
                        }
                        if (fileWriter3 == null) {
                            return;
                        } else {
                            fileWriter2 = fileWriter3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        BufferedWriter bufferedWriter3 = bufferedWriter;
                        fileWriter = fileWriter3;
                        bufferedWriter2 = bufferedWriter3;
                        fileWriter2 = fileWriter;
                        if (bufferedWriter2 != null) {
                            try {
                                bufferedWriter2.close();
                            } catch (IOException unused5) {
                                Log.e("FaqLogger", "  bufferedWriter Exception  ");
                            }
                        }
                        if (fileWriter2 == null) {
                            throw th;
                        }
                        try {
                            fileWriter2.close();
                            throw th;
                        } catch (IOException unused6) {
                            Log.e("FaqLogger", "  fileWriter Exception  ");
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                    if (bufferedWriter2 != null) {
                        bufferedWriter2.close();
                    }
                    if (fileWriter2 == null) {
                        throw th;
                    }
                    fileWriter2.close();
                    throw th;
                }
            } catch (IOException unused7) {
                bufferedWriter = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused8) {
            bufferedWriter = null;
        } catch (Throwable th4) {
            th = th4;
            fileWriter = null;
            fileWriter2 = fileWriter;
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
            if (fileWriter2 == null) {
                throw th;
            }
            fileWriter2.close();
            throw th;
        }
        try {
            fileWriter2.close();
        } catch (IOException unused9) {
            Log.e("FaqLogger", "  fileWriter Exception  ");
        }
    }

    private static void e(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void e(Context context) {
        d = context.getApplicationContext();
        String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(b());
        File file = new File(e());
        try {
            if (file.exists()) {
                String[] list = file.list();
                long jB = m.b(str);
                if (list != null) {
                    for (String str2 : list) {
                        if (jB >= m.b(str2)) {
                            e(new File(e() + File.separator + str2));
                        }
                    }
                }
            }
        } catch (ParseException unused) {
            Log.e("FaqLogger", "  ParseException ");
        }
    }

    private static void a(int i, String str, Throwable th, String str2, Object... objArr) {
        String strA = a(str2, objArr);
        if (th != null) {
            strA = strA + " : " + c(th);
        }
        if (TextUtils.isEmpty(str2)) {
            strA = "Empty/NULL log message";
        }
        c(i, str, strA);
    }

    private static void d(int i, String str, Throwable th) {
        c(i, str, c(th));
    }

    private static void c(int i, String str, String str2) {
        if (8 == i) {
            try {
                f(str, str2);
            } catch (Exception unused) {
                Log.e("FaqLogger", "  writeLogToFile Exception  ");
            }
        }
        if (!f21586c || TextUtils.isEmpty(str2)) {
            return;
        }
        if (i == 3) {
            Log.d(str, str2);
            return;
        }
        if (i == 4) {
            Log.i(str, str2);
            return;
        }
        if (i == 5) {
            Log.w(str, str2);
        } else if (i != 6) {
            Log.v(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    private static Date b() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.get(5) - 1);
        return calendar.getTime();
    }

    private static String c(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        printWriter.close();
        return stringWriter.toString();
    }

    private static String a(String str, Object... objArr) {
        if (objArr == null) {
            return str;
        }
        try {
            return objArr.length == 0 ? str : String.format(str, objArr);
        } catch (FormatterClosedException | IllegalFormatException unused) {
            return str;
        }
    }
}
