package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.WindowManager;
import com.huawei.haf.application.BaseApplication;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.CameraGlView;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.filter.CameraFilter;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.filter.ScreenFilter;
import com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes10.dex */
public class jsy implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener, Camera2Helper.OnPreviewSizeListener, Camera2Helper.OnPreviewListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraGlView f38992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CameraFilter f38993c;
    private Camera2Helper e;
    private int f;
    private Context g;
    private int h;
    private ScreenFilter k;
    private Camera2Helper.OnPreviewListener l;
    private SurfaceTexture m;
    private int p;
    private int[] q;
    private int t;
    private float[] o = new float[16];
    private float[] j = new float[16];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38991a = false;
    private boolean d = true;
    private float n = 1.0f;
    private boolean i = false;

    public jsy(CameraGlView cameraGlView) {
        this.f38992b = cameraGlView;
        this.g = cameraGlView.getContext();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Context context = this.g;
        if (context instanceof Activity) {
            this.e = new Camera2Helper((Activity) context);
        } else {
            this.e = new Camera2Helper(BaseApplication.j());
        }
        int[] iArr = new int[1];
        this.q = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.q[0]);
        this.m = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f38993c = new CameraFilter(this.f38992b.getContext());
        this.k = new ScreenFilter(this.f38992b.getContext());
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.e.a(this);
        this.e.d(this);
        this.e.b(this.n);
        this.e.c(this.i);
        this.e.e(i, i2, this.m, this.f38991a, this.d);
        this.t = i2;
        this.p = i;
        c();
        this.f38993c.b(this.j);
        this.f38993c.e(i, i2, 0, 0);
        this.k.e(i, i2, 0, 0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.m.updateTexImage();
        this.m.getTransformMatrix(this.o);
        this.f38993c.c(this.o);
        this.k.c(this.f38993c.c(this.q[0]));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f38992b.requestRender();
    }

    public void d() {
        Camera2Helper camera2Helper = this.e;
        if (camera2Helper != null) {
            camera2Helper.b();
            this.e.a((Camera2Helper.OnPreviewSizeListener) null);
        }
        CameraFilter cameraFilter = this.f38993c;
        if (cameraFilter != null) {
            cameraFilter.a();
        }
        ScreenFilter screenFilter = this.k;
        if (screenFilter != null) {
            screenFilter.a();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.OnPreviewSizeListener
    public void onSize(int i, int i2) {
        LogUtil.j("Track_GlRenderWrapper", "camera preview size. with:", Integer.valueOf(i), " height:", Integer.valueOf(i2));
        this.h = i;
        this.f = i2;
    }

    private void c() {
        float fMin;
        float fMax;
        Matrix.setIdentityM(this.j, 0);
        double dMin = (Math.min(this.f, this.h) * 1.0f) / Math.max(this.f, this.h);
        double dMin2 = (Math.min(this.p, this.t) * 1.0f) / Math.max(this.p, this.t);
        if (dMin < dMin2) {
            fMax = (float) (((double) (Math.max(this.f, this.h) * 1.0f)) / (((double) Math.min(this.f, this.h)) / dMin2));
            fMin = 1.0f;
        } else {
            fMin = (float) (((double) (Math.min(this.f, this.h) * 1.0f)) / (((double) Math.max(this.f, this.h)) * dMin2));
            fMax = 1.0f;
        }
        Matrix.scaleM(this.j, 0, fMin, fMax, 1.0f);
        int rotation = ((WindowManager) this.f38992b.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            Matrix.rotateM(this.j, 0, -90.0f, 0.0f, 0.0f, 1.0f);
        } else if (rotation == 2) {
            Matrix.rotateM(this.j, 0, -180.0f, 0.0f, 0.0f, 1.0f);
        } else {
            if (rotation != 3) {
                return;
            }
            Matrix.rotateM(this.j, 0, 90.0f, 0.0f, 0.0f, 1.0f);
        }
    }

    public void e(Camera2Helper.OnPreviewListener onPreviewListener) {
        this.l = onPreviewListener;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.view.glrender.util.Camera2Helper.OnPreviewListener
    public void onPreviewFrame(Image image, int i, int i2) {
        Camera2Helper.OnPreviewListener onPreviewListener = this.l;
        if (onPreviewListener != null) {
            onPreviewListener.onPreviewFrame(image, this.p, this.t);
        }
    }

    public void d(boolean z) {
        if (z == this.f38991a) {
            LogUtil.j("Track_GlRenderWrapper", "same camera direction, return");
            return;
        }
        this.f38991a = z;
        Camera2Helper camera2Helper = this.e;
        if (camera2Helper != null) {
            camera2Helper.b();
            this.e.e(this.p, this.t, this.m, this.f38991a, this.d);
        }
    }

    public boolean e() {
        return this.f38991a;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void e(float f) {
        this.n = f;
    }
}
