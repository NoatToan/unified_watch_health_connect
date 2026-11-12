package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p6.b;
import sn.a;

/* JADX INFO: loaded from: classes14.dex */
final class zzj implements zzl {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzt zzb;
    final /* synthetic */ ZipFile zzc;

    public zzj(zzn zznVar, Set set, zzt zztVar, ZipFile zipFile) {
        this.zza = set;
        this.zzb = zztVar;
        this.zzc = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(zzm zzmVar, File file, boolean z14) throws IllegalAccessException, IOException, InvocationTargetException {
        this.zza.add(file);
        if (z14) {
            return;
        }
        String strZzb = this.zzb.zzb();
        String str = zzmVar.zza;
        String absolutePath = this.zzb.zza().getAbsolutePath();
        String name = zzmVar.zzb.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder sbI = b.i("NativeLibraryExtractor: split '", strZzb, "' has native library '", str, "' that does not exist; extracting from '");
        a.t(sbI, absolutePath, "!", name, "' to '");
        sbI.append(absolutePath2);
        sbI.append("'");
        ZipFile zipFile = this.zzc;
        ZipEntry zipEntry = zzmVar.zzb;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                zze.zzm(file);
                while (true) {
                    int i14 = inputStream.read(bArr);
                    if (i14 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i14);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th6;
        }
    }
}
