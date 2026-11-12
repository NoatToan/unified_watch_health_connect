package com.huawei.watchface.videoedit.gles.glutils;

import android.content.Context;
import android.opengl.GLES20;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class ShaderUtils {
    private static final String TAG = "ShaderUtil";

    public static int createProgram(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            HwLog.d(TAG, "create program error!");
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, i);
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        HwLog.d(TAG, "link program error");
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static int loadShader(Context context, int i, String str) {
        String fromAssets = readFromAssets(context, str);
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            HwLog.d(TAG, "create shader failed! type: " + i);
            return iGlCreateShader;
        }
        GLES20.glShaderSource(iGlCreateShader, fromAssets);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        HwLog.d(TAG, "shader compile error! type: " + i);
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static String readFromAssets(Context context, String str) {
        if (context == null) {
            HwLog.e(TAG, "context is null");
            return "";
        }
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return readFromInputStream(inputStreamOpen);
        } catch (IOException unused) {
            HwLog.e(TAG, "read from assets failed!");
            return "";
        } finally {
            Utils.closeSilently(inputStreamOpen);
        }
    }

    private static String readFromInputStream(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder sb = new StringBuilder("");
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Utils.closeSilently(bufferedReader);
                Utils.closeSilently(inputStreamReader);
                Utils.closeSilently(inputStream);
                return sb.toString();
            }
            sb.append(line);
            sb.append(System.lineSeparator());
        }
    }
}
