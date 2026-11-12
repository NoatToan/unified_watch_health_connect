package aj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class v implements ui.d<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.b f3404a;

    public v(xi.b bVar) {
        this.f3404a = bVar;
    }

    @Override // ui.d
    public final boolean b(InputStream inputStream, File file, ui.h hVar) throws Throwable {
        InputStream inputStream2 = inputStream;
        xi.b bVar = this.f3404a;
        byte[] bArr = (byte[]) bVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i14 = inputStream2.read(bArr);
                    if (i14 == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i14);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    bVar.put(bArr);
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    bVar.put(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            bVar.put(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
