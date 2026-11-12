package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.work.Data;

/* JADX INFO: loaded from: classes10.dex */
public class v8p {
    public static int a(Bitmap bitmap, boolean z) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        if (i == 0) {
            return 0;
        }
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        if (z) {
            bitmap.recycle();
        }
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }
}
