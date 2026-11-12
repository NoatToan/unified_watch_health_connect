package pi1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import i3.e5;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.HashSet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpi1/a;", "Ljava/io/Closeable;", "Ljava/io/File;", "logsDir", "<init>", "(Ljava/io/File;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f137852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<String> f137853b;

    public a(File file) {
        file.getClass();
        this.f137852a = file;
        this.f137853b = new HashSet<>();
    }

    public static void c(a aVar, File file, String str) throws IOException {
        if (file.isDirectory()) {
            aVar.e(file, str);
        } else {
            aVar.f(file, str);
        }
    }

    public final void a(String str, byte[] bArr) throws IOException {
        File fileJ = j(str);
        if (fileJ != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(fileJ);
            try {
                fileOutputStream.write(bArr);
                Unit unit = Unit.INSTANCE;
                fileOutputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(fileOutputStream, th3);
                    throw th4;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f137853b.clear();
    }

    public final void e(File file, String str) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                String strG = e5.g(str, "/", file2.getName());
                if (file2.isDirectory()) {
                    e(file2, strG);
                } else if (file2.isFile()) {
                    f(file2, strG);
                }
            }
        }
    }

    public final void f(File file, String str) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 2048);
        try {
            File fileJ = j(str);
            if (fileJ != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(fileJ);
                try {
                    dh.b.p(bufferedInputStream, fileOutputStream, 2048);
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(fileOutputStream, th3);
                        throw th4;
                    }
                }
            }
            bufferedInputStream.close();
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                jg.b.l(bufferedInputStream, th5);
                throw th6;
            }
        }
    }

    public final File j(String str) {
        String strH = str.length() == 0 ? "untitled" : str;
        HashSet<String> hashSet = this.f137853b;
        if (hashSet.add(strH)) {
            break;
        }
        String strH0 = w.h0(str, '.');
        String strD0 = w.d0('.', str, "");
        for (int i14 = 1; i14 < Integer.MAX_VALUE; i14++) {
            strH = strD0.length() > 0 ? strH0 + "-" + i14 + "." + strD0 : vb.h.h(i14, strH0, "-");
            if (hashSet.add(strH)) {
                break;
            }
        }
        try {
            Path path = Paths.get((this.f137852a.getAbsolutePath() + "/") + h0.m0(w.W(strH, new String[]{"/"})), new String[0]);
            if (Files.notExists(path, new LinkOption[0])) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "LogDirBuilder", "File \"" + path + "\" will be created.");
                return Files.createFile(path, new FileAttribute[0]).toFile();
            }
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "LogDirBuilder", "File \"" + path + "\" will be retrieved.");
            return path.toFile();
        } catch (Exception e4) {
            String strN = fb1.c.n("An error occurred while creating the file: ", e4.getMessage());
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var3, "LogDirBuilder", strN);
            return null;
        }
    }
}
