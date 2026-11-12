package org.opencv.android;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes23.dex */
@TargetApi(15)
public abstract class CameraGLRendererBase implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {
    private final float[] d;
    private final float[] e;
    private final float[] f;
    private int m;
    public SurfaceTexture mSTexture;
    public CameraGLSurfaceView mView;
    private int n;
    private int o;
    private int p;
    private FloatBuffer q;
    private FloatBuffer r;
    private FloatBuffer s;
    public final String LOGTAG = "CameraGLRendererBase";
    private final String a = "attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4 ( vPosition.x, vPosition.y, 0.0, 1.0 );\n}";
    private final String b = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture,texCoord);\n}";
    private final String c = "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture,texCoord);\n}";
    private int[] g = {0};
    private int[] h = {0};
    private int[] i = {0};
    private int[] j = {0};
    private int k = -1;
    private int l = -1;
    public int mCameraWidth = -1;
    public int mCameraHeight = -1;
    public int mFBOWidth = -1;
    public int mFBOHeight = -1;
    public int mMaxCameraWidth = -1;
    public int mMaxCameraHeight = -1;
    public int mCameraIndex = -1;
    public boolean mHaveSurface = false;
    public boolean mHaveFBO = false;
    public boolean mUpdateST = false;
    public boolean mEnabled = true;
    public boolean mIsStarted = false;

    public CameraGLRendererBase(CameraGLSurfaceView cameraGLSurfaceView) {
        float[] fArr = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
        this.d = fArr;
        float[] fArr2 = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        this.e = fArr2;
        float[] fArr3 = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f = fArr3;
        this.mView = cameraGLSurfaceView;
        int length = (fArr.length * 32) / 8;
        this.q = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.r = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.s = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.q.put(fArr).position(0);
        this.r.put(fArr2).position(0);
        this.s.put(fArr3).position(0);
    }

    private void a() {
        Log.d("CameraGLRendererBase", "deleteFBO(" + this.mFBOWidth + "x" + this.mFBOHeight + ")");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, this.j, 0);
        c(this.h);
        c(this.i);
        this.mFBOHeight = 0;
        this.mFBOWidth = 0;
    }

    private void b() {
        Log.d("CameraGLRendererBase", "deleteSurfaceTexture");
        SurfaceTexture surfaceTexture = this.mSTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSTexture = null;
            c(this.g);
        }
    }

    private static void c(int[] iArr) {
        if (iArr.length == 1) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
    }

    private void d(int i, boolean z, int i2) {
        GLES20.glBindFramebuffer(36160, i2);
        if (i2 == 0) {
            GLES20.glViewport(0, 0, this.mView.getWidth(), this.mView.getHeight());
        } else {
            GLES20.glViewport(0, 0, this.mFBOWidth, this.mFBOHeight);
        }
        GLES20.glClear(16384);
        if (z) {
            GLES20.glUseProgram(this.k);
            GLES20.glVertexAttribPointer(this.m, 2, 5126, false, 8, (Buffer) this.q);
            GLES20.glVertexAttribPointer(this.n, 2, 5126, false, 8, (Buffer) this.r);
        } else {
            GLES20.glUseProgram(this.l);
            GLES20.glVertexAttribPointer(this.o, 2, 5126, false, 8, (Buffer) this.q);
            GLES20.glVertexAttribPointer(this.p, 2, 5126, false, 8, (Buffer) this.s);
        }
        GLES20.glActiveTexture(33984);
        if (z) {
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.k, "sTexture"), 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(this.l, "sTexture"), 0);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glFlush();
    }

    private void e(int i, int i2) {
        Log.d("CameraGLRendererBase", "initFBO(" + i + "x" + i2 + ")");
        a();
        GLES20.glGenTextures(1, this.i, 0);
        GLES20.glBindTexture(3553, this.i[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glGenTextures(1, this.h, 0);
        GLES20.glBindTexture(3553, this.h[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glGenFramebuffers(1, this.j, 0);
        GLES20.glBindFramebuffer(36160, this.j[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.h[0], 0);
        Log.d("CameraGLRendererBase", "initFBO error status: " + GLES20.glGetError());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            Log.e("CameraGLRendererBase", "initFBO failed, status: " + iGlCheckFramebufferStatus);
        }
        this.mFBOWidth = i;
        this.mFBOHeight = i2;
    }

    private void f() {
        String strGlGetString = GLES20.glGetString(7938);
        if (strGlGetString != null) {
            Log.i("CameraGLRendererBase", "OpenGL ES version: " + strGlGetString);
        }
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        int i = i("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4 ( vPosition.x, vPosition.y, 0.0, 1.0 );\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture,texCoord);\n}");
        this.k = i;
        this.m = GLES20.glGetAttribLocation(i, "vPosition");
        this.n = GLES20.glGetAttribLocation(this.k, "vTexCoord");
        GLES20.glEnableVertexAttribArray(this.m);
        GLES20.glEnableVertexAttribArray(this.n);
        int i2 = i("attribute vec2 vPosition;\nattribute vec2 vTexCoord;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = vTexCoord;\n  gl_Position = vec4 ( vPosition.x, vPosition.y, 0.0, 1.0 );\n}", "precision mediump float;\nuniform sampler2D sTexture;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(sTexture,texCoord);\n}");
        this.l = i2;
        this.o = GLES20.glGetAttribLocation(i2, "vPosition");
        this.p = GLES20.glGetAttribLocation(this.l, "vTexCoord");
        GLES20.glEnableVertexAttribArray(this.o);
        GLES20.glEnableVertexAttribArray(this.p);
    }

    private void g() {
        Log.d("CameraGLRendererBase", "initSurfaceTexture");
        b();
        h(this.g);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.g[0]);
        this.mSTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    private void h(int[] iArr) {
        if (iArr.length == 1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
        }
    }

    private static int i(String str, String str2) {
        Log.d("CameraGLRendererBase", "loadShader");
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("CameraGLRendererBase", "Could not compile vertex shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
            GLES20.glDeleteShader(iGlCreateShader);
            return 0;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("CameraGLRendererBase", "Could not compile fragment shader:" + GLES20.glGetShaderInfoLog(iGlCreateShader2));
            GLES20.glDeleteShader(iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader2);
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glDeleteShader(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader2);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("CameraGLRendererBase", "Could not link shader program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
            return 0;
        }
        GLES20.glValidateProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35715, iArr, 0);
        if (iArr[0] != 0) {
            Log.d("CameraGLRendererBase", "Shader program is built OK");
            return iGlCreateProgram;
        }
        Log.e("CameraGLRendererBase", "Shader program validation error: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public abstract void closeCamera();

    public synchronized void disableView() {
        Log.d("CameraGLRendererBase", "disableView");
        this.mEnabled = false;
        updateState();
    }

    public synchronized void doStart() {
        int i;
        Log.d("CameraGLRendererBase", "doStart");
        g();
        openCamera(this.mCameraIndex);
        this.mIsStarted = true;
        int i2 = this.mCameraWidth;
        if (i2 > 0 && (i = this.mCameraHeight) > 0) {
            setPreviewSize(i2, i);
        }
    }

    public void doStop() {
        Log.d("CameraGLRendererBase", "doStop");
        synchronized (this) {
            this.mUpdateST = false;
            this.mIsStarted = false;
            this.mHaveFBO = false;
            closeCamera();
            b();
        }
        CameraGLSurfaceView.CameraTextureListener cameraTextureListener = this.mView.getCameraTextureListener();
        if (cameraTextureListener != null) {
            cameraTextureListener.onCameraViewStopped();
        }
    }

    public synchronized void enableView() {
        Log.d("CameraGLRendererBase", "enableView");
        this.mEnabled = true;
        updateState();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.mHaveFBO) {
            synchronized (this) {
                if (this.mUpdateST) {
                    this.mSTexture.updateTexImage();
                    this.mUpdateST = false;
                }
                GLES20.glClear(16384);
                CameraGLSurfaceView.CameraTextureListener cameraTextureListener = this.mView.getCameraTextureListener();
                if (cameraTextureListener != null) {
                    d(this.g[0], true, this.j[0]);
                    if (cameraTextureListener.onCameraTexture(this.h[0], this.i[0], this.mCameraWidth, this.mCameraHeight)) {
                        d(this.i[0], false, 0);
                    } else {
                        d(this.h[0], false, 0);
                    }
                } else {
                    Log.d("CameraGLRendererBase", "texCamera(OES) -> screen");
                    d(this.g[0], true, 0);
                }
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.mUpdateST = true;
        this.mView.requestRender();
    }

    public void onPause() {
        Log.i("CameraGLRendererBase", "onPause");
        this.mHaveSurface = false;
        updateState();
        this.mCameraHeight = -1;
        this.mCameraWidth = -1;
    }

    public void onResume() {
        Log.i("CameraGLRendererBase", "onResume");
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Log.i("CameraGLRendererBase", "onSurfaceChanged(" + i + "x" + i2 + ")");
        this.mHaveSurface = true;
        updateState();
        setPreviewSize(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.i("CameraGLRendererBase", "onSurfaceCreated");
        f();
    }

    public abstract void openCamera(int i);

    public void setCameraIndex(int i) {
        disableView();
        this.mCameraIndex = i;
        enableView();
    }

    public abstract void setCameraPreviewSize(int i, int i2);

    public void setMaxCameraPreviewSize(int i, int i2) {
        disableView();
        this.mMaxCameraWidth = i;
        this.mMaxCameraHeight = i2;
        enableView();
    }

    public void setPreviewSize(int i, int i2) {
        synchronized (this) {
            this.mHaveFBO = false;
            this.mCameraWidth = i;
            this.mCameraHeight = i2;
            setCameraPreviewSize(i, i2);
            e(this.mCameraWidth, this.mCameraHeight);
            this.mHaveFBO = true;
        }
        CameraGLSurfaceView.CameraTextureListener cameraTextureListener = this.mView.getCameraTextureListener();
        if (cameraTextureListener != null) {
            cameraTextureListener.onCameraViewStarted(this.mCameraWidth, this.mCameraHeight);
        }
    }

    public void updateState() {
        Log.d("CameraGLRendererBase", "updateState");
        Log.d("CameraGLRendererBase", "mEnabled=" + this.mEnabled + ", mHaveSurface=" + this.mHaveSurface);
        boolean z = this.mEnabled && this.mHaveSurface && this.mView.getVisibility() == 0;
        if (z == this.mIsStarted) {
            Log.d("CameraGLRendererBase", "keeping State unchanged");
        } else if (z) {
            doStart();
        } else {
            doStop();
        }
        Log.d("CameraGLRendererBase", "updateState end");
    }
}
