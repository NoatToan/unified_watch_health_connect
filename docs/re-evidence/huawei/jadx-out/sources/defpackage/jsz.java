package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import androidx.work.Data;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import health.compact.a.LogAnonymous;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes10.dex */
public class jsz {
    public static String d(Context context, int i) {
        if (context == null) {
            return "";
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, StandardCharsets.UTF_8));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuffer.append(line).append(System.lineSeparator());
                } catch (IOException e) {
                    LogUtil.a("Track_OpenGlUtils", "readTemporaryMotionPath ", LogAnonymous.b(e));
                }
            } catch (Throwable th) {
                IoUtils.c(inputStreamOpenRawResource);
                IoUtils.c(bufferedReader);
                throw th;
            }
        }
        IoUtils.c(inputStreamOpenRawResource);
        IoUtils.c(bufferedReader);
        return stringBuffer.toString();
    }

    public static int b(String str, String str2) {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            throw new IllegalStateException("load vertex raw error :" + GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader2, 36346, iArr, 0);
        if (iArr[0] != 1) {
            throw new IllegalStateException("load fragment raw error :" + GLES20.glGetShaderInfoLog(iGlCreateShader2));
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            throw new IllegalStateException("link program:" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        GLES20.glDeleteShader(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader2);
        return iGlCreateProgram;
    }

    public static void a(int[] iArr) {
        if (iArr == null) {
            return;
        }
        GLES20.glGenTextures(iArr.length, iArr, 0);
        for (int i : iArr) {
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9728);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10242, 10497);
            GLES20.glTexParameteri(3553, 10243, 10497);
            GLES20.glBindTexture(3553, 0);
        }
    }
}
