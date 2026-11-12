package defpackage;

import android.util.Pair;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.network.FileExtension;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class vjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pte f36948a;

    public vjg(pte pteVar) {
        this.f36948a = pteVar;
    }

    public static String b(String str, FileExtension fileExtension, boolean z) {
        String strTempExtension = z ? fileExtension.tempExtension() : fileExtension.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strTempExtension;
    }

    public static String d(String str, int i) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(Coder.KEY_MD5).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }

    public Pair<FileExtension, InputStream> a(String str) {
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileC);
            FileExtension fileExtension = fileC.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : FileExtension.JSON;
            rpe.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final File c(String str) throws FileNotFoundException {
        File file = new File(e(), b(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final File e() {
        File fileA = this.f36948a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    public void f(String str, FileExtension fileExtension) {
        File file = new File(e(), b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        rpe.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        rpe.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    public File g(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(e(), b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
