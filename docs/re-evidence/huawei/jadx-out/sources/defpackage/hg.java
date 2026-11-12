package defpackage;

import android.util.Pair;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LottieNetworkCacheProvider f36717a;

    public hg(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.f36717a = lottieNetworkCacheProvider;
    }

    public void e() {
        File fileB = b();
        if (fileB.exists()) {
            File[] fileArrListFiles = fileB.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            fileB.delete();
        }
    }

    Pair<FileExtension, InputStream> c(String str) {
        FileExtension fileExtension;
        try {
            File fileA = a(str);
            if (fileA == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileA);
            if (fileA.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else if (fileA.getAbsolutePath().endsWith(".gz")) {
                fileExtension = FileExtension.GZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            iy.b("Cache hit for " + str + " at " + fileA.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File c(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(b(), a(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
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

    void a(String str, FileExtension fileExtension) {
        File file = new File(b(), a(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        iy.b("Copying temp file to real file (" + file2 + Constants.RIGHT_BRACKET_ONLY);
        if (zRenameTo) {
            return;
        }
        iy.d("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    private File a(String str) throws FileNotFoundException {
        File file = new File(b(), a(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(b(), a(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(b(), a(str, FileExtension.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private File b() {
        File cacheDir = this.f36717a.getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    private static String a(String str, FileExtension fileExtension, boolean z) {
        String strTempExtension = z ? fileExtension.tempExtension() : fileExtension.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = a(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strTempExtension;
    }

    private static String a(String str, int i) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i);
        }
    }
}
