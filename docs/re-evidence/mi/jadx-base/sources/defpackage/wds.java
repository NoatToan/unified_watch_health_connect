package defpackage;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f37877a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37879a = false;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f37881b;
        public ids c;
        public b d = new b();
        public String e;

        public c(lds ldsVar, ids idsVar) {
            this.c = null;
            this.f37880a = ldsVar.i();
            this.f37881b = ldsVar.j();
            this.c = idsVar;
        }

        public final String a() {
            return this.f37880a;
        }

        public final void b(String str) {
            if (str.length() > 1) {
                this.e = str;
            }
        }

        public final String c() {
            return this.f37881b;
        }

        public final String d() {
            return this.e;
        }

        public final ids e() {
            return this.c;
        }

        public final b f() {
            return this.d;
        }

        public final void g() {
            this.d.f37879a = true;
        }
    }

    public interface d {
        void a();

        void a(long j);
    }

    public wds(lds ldsVar, ids idsVar) {
        this.f37877a = new c(ldsVar, idsVar);
    }

    public static int a(File file, ZipInputStream zipInputStream, long j, long j2, d dVar, b bVar) throws Exception {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[1024];
        int i = 0;
        while (true) {
            int i2 = zipInputStream.read(bArr, 0, 1024);
            if (i2 == -1) {
                bufferedOutputStream.close();
                return i;
            }
            if (bVar != null && bVar.f37879a) {
                bufferedOutputStream.close();
                return i;
            }
            bufferedOutputStream.write(bArr, 0, i2);
            i += i2;
            if (j2 > 0 && dVar != null) {
                long j3 = ((((long) i) + j) * 100) / j2;
                if (bVar == null || !bVar.f37879a) {
                    dVar.a(j3);
                }
            }
        }
    }

    public static void c(c cVar) {
        if (cVar == null) {
            return;
        }
        ids idsVarE = cVar.e();
        if (idsVarE != null) {
            idsVarE.d();
        }
        String strA = cVar.a();
        String strC = cVar.c();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strC)) {
            if (cVar.f().f37879a) {
                if (idsVarE != null) {
                    idsVarE.f();
                    return;
                }
                return;
            } else {
                if (idsVarE != null) {
                    idsVarE.e();
                    return;
                }
                return;
            }
        }
        File file = new File(strA);
        if (!file.exists()) {
            if (cVar.f().f37879a) {
                if (idsVarE != null) {
                    idsVarE.f();
                    return;
                }
                return;
            } else {
                if (idsVarE != null) {
                    idsVarE.e();
                    return;
                }
                return;
            }
        }
        File file2 = new File(strC);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        a aVar = new a(idsVarE);
        try {
            if (cVar.f().f37879a && idsVarE != null) {
                idsVarE.f();
            }
            e(file, file2, aVar, cVar);
            if (cVar.f().f37879a) {
                if (idsVarE != null) {
                    idsVarE.f();
                }
            } else if (idsVarE != null) {
                idsVarE.b(cVar.d());
            }
        } catch (Throwable unused) {
            if (cVar.f().f37879a) {
                if (idsVarE != null) {
                    idsVarE.f();
                }
            } else if (idsVarE != null) {
                idsVarE.e();
            }
        }
    }

    public static void d(File file) {
        File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        d(parentFile);
        parentFile.mkdir();
    }

    public static void e(File file, File file2, d dVar, c cVar) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        b bVarF = cVar.f();
        long size = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            CheckedInputStream checkedInputStream = new CheckedInputStream(fileInputStream, new CRC32());
            ZipInputStream zipInputStream = new ZipInputStream(checkedInputStream);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (bVarF != null && bVarF.f37879a) {
                        zipInputStream.closeEntry();
                        zipInputStream.close();
                        checkedInputStream.close();
                        fileInputStream.close();
                        break;
                    }
                    if (!nextEntry.isDirectory()) {
                        if (!g(nextEntry.getName())) {
                            dVar.a();
                            break;
                        } else {
                            stringBuffer.append(nextEntry.getName());
                            stringBuffer.append(";");
                        }
                    }
                    size += nextEntry.getSize();
                    zipInputStream.closeEntry();
                } else {
                    break;
                }
            }
            cVar.b(stringBuffer.toString());
            zipInputStream.close();
            checkedInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long j = size;
        FileInputStream fileInputStream2 = new FileInputStream(file);
        CheckedInputStream checkedInputStream2 = new CheckedInputStream(fileInputStream2, new CRC32());
        ZipInputStream zipInputStream2 = new ZipInputStream(checkedInputStream2);
        f(file2, zipInputStream2, j, dVar, bVarF);
        zipInputStream2.close();
        checkedInputStream2.close();
        fileInputStream2.close();
    }

    public static void f(File file, ZipInputStream zipInputStream, long j, d dVar, b bVar) throws Exception {
        int iA = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                return;
            }
            if (bVar != null && bVar.f37879a) {
                zipInputStream.closeEntry();
                return;
            }
            String str = file.getPath() + File.separator + nextEntry.getName();
            if (!g(nextEntry.getName())) {
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            } else {
                File file2 = new File(str);
                d(file2);
                if (nextEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    iA += a(file2, zipInputStream, iA, j, dVar, bVar);
                }
                zipInputStream.closeEntry();
            }
        }
    }

    public static boolean g(String str) {
        return (str.contains("..") || str.contains("/") || str.contains("\\") || str.contains("%")) ? false : true;
    }

    public final void b() {
        c cVar = this.f37877a;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h() {
        c cVar = this.f37877a;
        if (cVar != null) {
            c(cVar);
        }
    }

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ids f37878a;

        public a(ids idsVar) {
            this.f37878a = idsVar;
        }

        @Override // wds.d
        public final void a(long j) {
            try {
                ids idsVar = this.f37878a;
                if (idsVar != null) {
                    idsVar.a(j);
                }
            } catch (Exception unused) {
            }
        }

        @Override // wds.d
        public final void a() {
            ids idsVar = this.f37878a;
            if (idsVar != null) {
                idsVar.e();
            }
        }
    }
}
