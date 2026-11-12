package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public final class njt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f27997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fkt f27998b;
    public final /* synthetic */ ZipFile c;

    public njt(sjt sjtVar, Set set, fkt fktVar, ZipFile zipFile) {
        this.f27997a = set;
        this.f27998b = fktVar;
        this.c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.pjt
    public final void a(qjt qjtVar, File file, boolean z) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f27997a.add(file);
        if (z) {
            return;
        }
        String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", this.f27998b.b(), qjtVar.f31582a, this.f27998b.a().getAbsolutePath(), qjtVar.f31583b.getName(), file.getAbsolutePath());
        ZipFile zipFile = this.c;
        ZipEntry zipEntry = qjtVar.f31583b;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bjt.m(file);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th4;
        }
    }
}
