package com.huawei.watchface.videoedit.gles;

import android.opengl.GLES20;
import com.huawei.watchface.videoedit.utils.Utils;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractDraw {
    public static final String TAG = "AbstractDraw";
    public int mFragmentPosition;
    public int mInputTextureLocation;
    public int mMvpLocation;
    public int mProcessBarLocation;
    public int mProgramId;
    public ShaderManager mShaderManager;
    public int[] mVbo;
    public int mVertexPosition;
    public float[] mVertex = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    public float[] mMvpMatrix = new float[16];
    protected float[] mVpMatrix = new float[16];

    public AbstractDraw(int i) {
        int[] iArr = new int[1];
        this.mVbo = iArr;
        this.mProgramId = i;
        GLES20.glGenBuffers(1, iArr, 0);
        init();
    }

    private void setCoordinateXy(float[] fArr, float f, float f2, float f3, float f4) {
        fArr[9] = f;
        fArr[13] = f;
        fArr[1] = f2;
        fArr[5] = f2;
        fArr[0] = f3;
        fArr[8] = f3;
        fArr[4] = f4;
        fArr[12] = f4;
    }

    public void clean() {
        GLES20.glDeleteBuffers(1, this.mVbo, 0);
    }

    public void draw(int i) {
    }

    public void draw(int i, float[] fArr) {
    }

    public void init() {
        this.mVertexPosition = GLES20.glGetAttribLocation(this.mProgramId, "vPosition");
        this.mFragmentPosition = GLES20.glGetAttribLocation(this.mProgramId, "fPosition");
        this.mMvpLocation = GLES20.glGetUniformLocation(this.mProgramId, "vMVPMatrix");
        this.mProcessBarLocation = GLES20.glGetUniformLocation(this.mProgramId, "processBar");
        this.mInputTextureLocation = GLES20.glGetUniformLocation(this.mProgramId, "inputTexture");
    }

    public void updateVertex(float f, float f2) {
        setCoordinateXy(this.mVertex, f2, -f2, -f, f);
        Utils.vboBindData(this.mVbo[0], this.mVertex);
    }

    public void updateVertex(float[] fArr, float f, float f2) {
        setCoordinateXy(fArr, f2, -f2, -f, f);
        Utils.vboBindData(this.mVbo[0], fArr);
    }
}
