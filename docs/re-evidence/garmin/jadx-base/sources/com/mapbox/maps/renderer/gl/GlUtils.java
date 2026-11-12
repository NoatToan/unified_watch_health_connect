package com.mapbox.maps.renderer.gl;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.garmin.android.gncs.NotificationConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p005kotlin.Metadata;
import sn.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u0004*\u00020\u00112\n\u0010\u0012\u001a\u00020\u000b\"\u00020\u0013J\u0016\u0010\u0010\u001a\u00020\u0004*\u00020\u000b2\n\u0010\u0012\u001a\u00020\u000b\"\u00020\u0013J\n\u0010\u0014\u001a\u00020\u0011*\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/renderer/gl/GlUtils;", "", "()V", "checkCompileStatus", "", "shader", "", "checkError", "cmd", "", "getIdentityMatrix", "", "loadShader", NotificationConstants.KEY_DATA_MIME_TYPE, "shaderCode", "throwIfError", "put", "Ljava/nio/FloatBuffer;", "values", "", "toFloatBuffer", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GlUtils {
    public static final GlUtils INSTANCE = new GlUtils();

    private GlUtils() {
    }

    public static /* synthetic */ void checkError$default(GlUtils glUtils, String str, int i14, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIfError(String cmd) {
        Object objValueOf;
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            StringBuilder sbI = a.i(cmd, " - error in GL : ");
            switch (iGlGetError) {
                case 1280:
                    objValueOf = "GL_INVALID_ENUM";
                    break;
                case 1281:
                    objValueOf = "GL_INVALID_VALUE";
                    break;
                case 1282:
                    objValueOf = "GL_INVALID_OPERATION";
                    break;
                case 1283:
                case 1284:
                default:
                    objValueOf = Integer.valueOf(iGlGetError);
                    break;
                case 1285:
                    objValueOf = "GL_OUT_OF_MEMORY";
                    break;
                case 1286:
                    objValueOf = "GL_INVALID_FRAMEBUFFER_OPERATION";
                    break;
            }
            sbI.append(objValueOf);
            throw new RuntimeException(sbI.toString());
        }
    }

    public final void checkCompileStatus(int shader) {
    }

    public final void checkError(String cmd) {
    }

    public final float[] getIdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public final int loadShader(int type, String shaderCode) {
        shaderCode.getClass();
        int iGlCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(iGlCreateShader, shaderCode);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public final void put(FloatBuffer floatBuffer, float... fArr) {
        floatBuffer.getClass();
        fArr.getClass();
        floatBuffer.rewind();
        for (float f14 : fArr) {
            floatBuffer.put(f14);
        }
        floatBuffer.rewind();
    }

    public final FloatBuffer toFloatBuffer(float[] fArr) {
        fArr.getClass();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.rewind();
        return floatBufferAsFloatBuffer;
    }

    public final void put(float[] fArr, float... fArr2) {
        fArr.getClass();
        fArr2.getClass();
        int length = fArr2.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            fArr[i15] = fArr2[i14];
            i14++;
            i15++;
        }
    }
}
