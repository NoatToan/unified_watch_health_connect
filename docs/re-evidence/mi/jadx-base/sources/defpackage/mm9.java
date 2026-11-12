package defpackage;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class mm9 {
    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("closeQuietly InputStream error ");
                sb.append(e);
            }
        }
    }

    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("closeQuietly OutputStream error ");
                sb.append(e);
            }
            try {
                outputStream.close();
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("closeQuietly OutputStream error ");
                sb2.append(e2);
            }
        }
    }

    public static void c(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("closeQuietly Writer error ");
                sb.append(e);
            }
        }
    }

    public static boolean d(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("privacypolicy");
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        File file = new File(sb.toString());
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static String e(Context context, String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str3 = File.separator;
        sb.append(str3);
        sb.append("privacypolicy");
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(str);
        String string = sb.toString();
        if (!new File(string).exists()) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        strF = null;
        String strF = null;
        try {
            fileInputStream = new FileInputStream(string);
            try {
                strF = f(fileInputStream);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                a(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        a(fileInputStream);
        return strF;
    }

    public static String f(FileInputStream fileInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = fileInputStream.read(bArr, 0, 1024);
                if (i <= 0) {
                    String string = byteArrayOutputStream.toString();
                    b(byteArrayOutputStream);
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Exception unused) {
                b(byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                b(byteArrayOutputStream);
                throw th;
            }
        }
    }

    public static void g(String str, Context context, String str2, String str3) throws Throwable {
        FileOutputStream fileOutputStream;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str4 = File.separator;
        sb.append(str4);
        sb.append("privacypolicy");
        sb.append(str4);
        sb.append(str3);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            fileOutputStream = new FileOutputStream(new File(file, str2));
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                try {
                    bufferedWriter2.write(str);
                    c(bufferedWriter2);
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    c(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    c(bufferedWriter);
                    b(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        b(fileOutputStream);
    }
}
