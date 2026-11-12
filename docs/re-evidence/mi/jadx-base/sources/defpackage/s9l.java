package defpackage;

import com.xiaomi.fitness.common.utils.AppUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class s9l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f33432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33433b;
    public String c;

    public s9l(String str, String str2, byte[] bArr) {
        this.f33432a = bArr;
        this.f33433b = str;
        this.c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // java.lang.Runnable
    public void run() throws Throwable {
        FileOutputStream fileOutputStream;
        IOException e;
        FileNotFoundException e2;
        File externalFilesDir = AppUtil.getApp().getExternalFilesDir("com.xiaomi.aivs-audio." + this.c);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        ?? r2 = this.f33433b;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(new File(externalFilesDir, (String) r2), true);
                    try {
                        fileOutputStream.write(this.f33432a);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        r2 = fileOutputStream;
                    } catch (FileNotFoundException e3) {
                        e2 = e3;
                        e2.printStackTrace();
                        fileOutputStream.close();
                        r2 = fileOutputStream;
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        fileOutputStream.close();
                        r2 = fileOutputStream;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } catch (FileNotFoundException e6) {
                fileOutputStream = null;
                e2 = e6;
            } catch (IOException e7) {
                fileOutputStream = null;
                e = e7;
            } catch (Throwable th) {
                r2 = 0;
                th = th;
                try {
                    r2.close();
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
