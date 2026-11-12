package defpackage;

import android.content.Context;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class vq9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f37129a = TimeUnit.MINUTES.toMillis(15);

    public static File a(Context context, String str, FitnessDataId fitnessDataId) {
        String strA = up9.a(fitnessDataId);
        return new File(new File(context.getCacheDir(), b(str) + "/" + strA + "/" + fitnessDataId.getSportType()), up9.c(fitnessDataId));
    }

    public static String b(String str) {
        return "fitness//d" + str;
    }

    public static File c(Context context, String str, FitnessDataId fitnessDataId) {
        String strA = up9.a(fitnessDataId);
        return new File(new File(context.getExternalCacheDir(), b(str) + "/" + strA), up9.c(fitnessDataId));
    }

    public static byte[] d(File file) {
        if (file == null || !file.exists()) {
            FitnessLogUtils.w("FitnessFileUtils", "file not exist");
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                byte[] bArr = new byte[(int) randomAccessFile.length()];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            FitnessLogUtils.e("FitnessFileUtils", "readFitnessFile", e);
            return null;
        }
    }
}
