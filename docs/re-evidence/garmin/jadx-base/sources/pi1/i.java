package pi1;

import d53.w;
import i3.e5;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import o13.m;
import o13.t;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpi1/i;", "Ljava/io/Closeable;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f137866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZipOutputStream f137867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<String> f137868c;

    public i(File file) throws IOException {
        file.getClass();
        this.f137866a = m.b(new p40.f(this));
        this.f137868c = new HashSet<>();
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        this.f137867b = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
    }

    public static void a(i iVar, File file, String str) {
        if (file.isDirectory()) {
            iVar.e(file, str);
        } else {
            iVar.f(file, str);
        }
    }

    public static void c(i iVar, byte[] bArr, String str) throws IOException {
        ZipOutputStream zipOutputStream = iVar.f137867b;
        zipOutputStream.putNextEntry(iVar.j(str));
        zipOutputStream.write(bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f137868c.clear();
        Util.closeQuietly(this.f137867b);
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
        t tVar = this.f137866a;
        ZipEntry zipEntryJ = j(str);
        zipEntryJ.setTime(file.lastModified());
        ZipOutputStream zipOutputStream = this.f137867b;
        zipOutputStream.putNextEntry(zipEntryJ);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 2048);
        while (true) {
            try {
                int i14 = bufferedInputStream.read((byte[]) tVar.getValue());
                if (i14 == -1) {
                    Unit unit = Unit.INSTANCE;
                    bufferedInputStream.close();
                    return;
                }
                zipOutputStream.write((byte[]) tVar.getValue(), 0, i14);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(bufferedInputStream, th3);
                    throw th4;
                }
            }
        }
    }

    public final ZipEntry j(String str) {
        String strH = str.length() > 0 ? str : "untitled";
        HashSet<String> hashSet = this.f137868c;
        if (!hashSet.add(strH)) {
            String strH0 = w.h0(str, '.');
            String strD0 = w.d0('.', str, "");
            for (int i14 = 1; i14 < Integer.MAX_VALUE; i14++) {
                strH = strD0.length() > 0 ? strH0 + "-" + i14 + "." + strD0 : vb.h.h(i14, strH0, "-");
                if (hashSet.add(strH)) {
                    break;
                }
            }
        }
        return new ZipEntry(strH);
    }
}
