package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class pos {
    public static String h = "/MiPushLog";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30594b;
    public String c;
    public boolean d;
    public int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SimpleDateFormat"})
    public final SimpleDateFormat f30593a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public int f = 2097152;
    public ArrayList<File> g = new ArrayList<>();

    public pos a(File file) {
        if (file.exists()) {
            this.g.add(file);
        }
        return this;
    }

    public pos b(Date date, Date date2) {
        if (date.after(date2)) {
            this.f30594b = this.f30593a.format(date2);
            this.c = this.f30593a.format(date);
        } else {
            this.f30594b = this.f30593a.format(date);
            this.c = this.f30593a.format(date2);
        }
        return this;
    }

    public File c(Context context, Date date, Date date2, File file) throws Throwable {
        File fileA;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            fileA = los.a(context);
            if (fileA == null) {
                return null;
            }
            a(new File(fileA, "xmsf.log.1"));
            a(new File(fileA, "xmsf.log"));
        } else {
            File file2 = new File(context.getFilesDir() + h);
            if (!egt.b(file2)) {
                return null;
            }
            a(new File(file2, "log0.txt"));
            a(new File(file2, "log1.txt"));
            fileA = file2;
        }
        if (!fileA.isDirectory()) {
            return null;
        }
        File file3 = new File(file, date.getTime() + "-" + date2.getTime() + ".zip");
        if (file3.exists()) {
            return null;
        }
        b(date, date2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file4 = new File(file, "log.txt");
        f(file4);
        x9s.B("LOG: filter cost = " + (System.currentTimeMillis() - jCurrentTimeMillis));
        if (file4.exists()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            mgt.c(file3, file4);
            x9s.B("LOG: zip cost = " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            file4.delete();
            if (file3.exists()) {
                return file3;
            }
        }
        return null;
    }

    public void d(int i) {
        if (i != 0) {
            this.f = i;
        }
    }

    public final void e(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) throws IOException {
        char[] cArr = new char[4096];
        int i = bufferedReader.read(cArr);
        boolean z = false;
        while (i != -1 && !z) {
            String str = new String(cArr, 0, i);
            Matcher matcher = pattern.matcher(str);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && matcher.find(i2)) {
                int iStart = matcher.start();
                String strSubstring = str.substring(iStart, this.f30594b.length() + iStart);
                if (this.d) {
                    if (strSubstring.compareTo(this.c) > 0) {
                        z = true;
                        i = iStart;
                        break;
                    }
                } else if (strSubstring.compareTo(this.f30594b) >= 0) {
                    this.d = true;
                    i3 = iStart;
                }
                int iIndexOf = str.indexOf(10, iStart);
                if (iIndexOf == -1) {
                    iIndexOf = this.f30594b.length();
                }
                i2 = iStart + iIndexOf;
            }
            if (this.d) {
                int i4 = i - i3;
                this.e += i4;
                if (z) {
                    bufferedWriter.write(cArr, i3, i4);
                    return;
                } else {
                    bufferedWriter.write(cArr, i3, i4);
                    if (this.e > this.f) {
                        return;
                    }
                }
            }
            i = bufferedReader.read(cArr);
        }
    }

    public final void f(File file) throws Throwable {
        BufferedReader bufferedReader;
        Pattern patternCompile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedWriter bufferedWriter = null;
        bufferedReader = null;
        bufferedReader = null;
        bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        bufferedWriter = null;
        bufferedWriter = null;
        bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + rds.g() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + "\n");
                    this.e = 0;
                    Iterator<File> it = this.g.iterator();
                    while (it.hasNext()) {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                        try {
                            e(bufferedReader, bufferedWriter2, patternCompile);
                            bufferedReader.close();
                            bufferedReader2 = bufferedReader;
                        } catch (FileNotFoundException e) {
                            e = e;
                            bufferedWriter = bufferedWriter2;
                            x9s.B("LOG: filter error = " + e.getMessage());
                            mgt.b(bufferedWriter);
                            mgt.b(bufferedReader);
                            return;
                        } catch (IOException e2) {
                            e = e2;
                            bufferedWriter = bufferedWriter2;
                            x9s.B("LOG: filter error = " + e.getMessage());
                            mgt.b(bufferedWriter);
                            mgt.b(bufferedReader);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            mgt.b(bufferedWriter);
                            mgt.b(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedWriter2.write(wjs.c().v());
                    mgt.b(bufferedWriter2);
                    mgt.b(bufferedReader2);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    bufferedReader = bufferedReader2;
                } catch (IOException e4) {
                    e = e4;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            bufferedReader = null;
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }
}
