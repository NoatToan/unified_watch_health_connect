package defpackage;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f40476a = "";
    public static String d = "";
    public static String e = "";

    public static String e(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void c(List<String> list) {
        synchronized (ln.class) {
            if (!kj.c(f40476a) && !kj.c(d)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(d);
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(", " + it.next());
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(e);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(e, f40476a);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void c(Throwable th) {
        synchronized (ln.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(e(th));
            c(arrayList);
        }
    }

    public static void c(String str, String str2, String str3) {
        synchronized (ln.class) {
            e = str;
            f40476a = str2;
            d = str3;
        }
    }

    public static void c(String str) {
        synchronized (ln.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            c(arrayList);
        }
    }
}
