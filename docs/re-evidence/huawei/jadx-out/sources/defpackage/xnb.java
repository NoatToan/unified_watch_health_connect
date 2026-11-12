package defpackage;

import android.os.Process;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes20.dex */
public class xnb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f53184c = 2;

    public static boolean c(int i) {
        return i >= f53184c;
    }

    public static void d(String str, String str2) {
        if (c(4)) {
            xmz.b().b(new xna(ExifInterface.LONGITUDE_EAST, str + Constants.LEFT_BRACKET_ONLY + Process.myTid() + Constants.RIGHT_BRACKET_ONLY, str2));
        }
    }
}
