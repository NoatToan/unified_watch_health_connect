package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.work.Data;
import com.huawei.ucd.medal.MedalViewCallback;

/* JADX INFO: loaded from: classes43.dex */
public class qin {
    private static final String e = "TextureHelper";

    public static int b(Bitmap bitmap, qio qioVar, boolean z) {
        qid.e(e, "initTextureID(Bitmap bitmap, TextureOptions options, boolean recycleBmp)");
        if (qioVar == null) {
            qioVar = qio.c();
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10241, qioVar.f46276c);
        GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, qioVar.e);
        GLES20.glTexParameterf(3553, 10242, qioVar.d);
        GLES20.glTexParameterf(3553, 10243, qioVar.f46275b);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        if (qioVar.f46274a) {
            GLES20.glGenerateMipmap(3553);
        }
        if (z) {
            bitmap.recycle();
        }
        return i;
    }

    public static void a(Bitmap bitmap) {
        GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
    }

    public static int b(Bitmap bitmap, qio qioVar, boolean z, MedalViewCallback medalViewCallback) {
        String str = e;
        qid.e(str, "initTextureID(Bitmap bitmap, TextureOptions options, boolean recycleBmp)");
        if (qioVar == null) {
            qioVar = qio.c();
        }
        int[] iArr = new int[1];
        int i = 0;
        try {
            GLES20.glGenTextures(1, iArr, 0);
            int i2 = iArr[0];
            try {
                GLES20.glBindTexture(3553, i2);
                GLES20.glTexParameterf(3553, 10241, qioVar.f46276c);
                GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, qioVar.e);
                GLES20.glTexParameterf(3553, 10242, qioVar.d);
                GLES20.glTexParameterf(3553, 10243, qioVar.f46275b);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                boolean z2 = qioVar.f46274a;
                qid.e(str, "initTextureID useMipmap=" + z2);
                if (z2) {
                    GLES20.glGenerateMipmap(3553);
                }
                if (z) {
                    bitmap.recycle();
                }
                GLES20.glFinish();
                medalViewCallback.onResponse(200, "initTextureID texImage2D success.");
                return i2;
            } catch (Exception e2) {
                e = e2;
                i = i2;
                qid.e(e, "initTextureID Exception error.");
                medalViewCallback.onResponse(-1, e.getMessage());
                return i;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static void a(Bitmap bitmap, MedalViewCallback medalViewCallback) {
        qid.e(e, "changeTextureImage");
        try {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            GLES20.glFinish();
            medalViewCallback.onResponse(200, "changeTextureImage texImage2D success.");
        } catch (Exception e2) {
            qid.e(e, "changeTextureImage Exception error.");
            medalViewCallback.onResponse(-1, e2.getMessage());
        }
    }
}
