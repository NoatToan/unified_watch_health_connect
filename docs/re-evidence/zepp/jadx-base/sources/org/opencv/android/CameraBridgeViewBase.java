package org.opencv.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.List;
import org.opencv.R;
import org.opencv.core.Mat;
import org.opencv.core.Size;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CameraBridgeViewBase extends SurfaceView implements SurfaceHolder.Callback {
    public static final int CAMERA_ID_ANY = -1;
    public static final int CAMERA_ID_BACK = 99;
    public static final int CAMERA_ID_FRONT = 98;
    public static final int GRAY = 2;
    public static final int MAX_UNSPECIFIED = -1;
    public static final int RGBA = 1;
    private static final String f = "CameraBridge";
    private static final int g = 0;
    private static final int h = 1;
    private int a;
    private Bitmap b;
    private CvCameraViewListener2 c;
    private boolean d;
    private final Object e;
    public int mCameraIndex;
    public boolean mCameraPermissionGranted;
    public boolean mEnabled;
    public FpsMeter mFpsMeter;
    public int mFrameHeight;
    public int mFrameWidth;
    public int mMaxHeight;
    public int mMaxWidth;
    public int mPreviewFormat;
    public float mScale;

    public interface CvCameraViewFrame {
        Mat gray();

        Mat rgba();
    }

    public interface CvCameraViewListener {
        Mat onCameraFrame(Mat mat);

        void onCameraViewStarted(int i, int i2);

        void onCameraViewStopped();
    }

    public interface CvCameraViewListener2 {
        Mat onCameraFrame(CvCameraViewFrame cvCameraViewFrame);

        void onCameraViewStarted(int i, int i2);

        void onCameraViewStopped();
    }

    public class CvCameraViewListenerAdapter implements CvCameraViewListener2 {
        private int a = 1;
        private CvCameraViewListener b;

        public CvCameraViewListenerAdapter(CvCameraViewListener cvCameraViewListener) {
            this.b = cvCameraViewListener;
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2
        public Mat onCameraFrame(CvCameraViewFrame cvCameraViewFrame) {
            int i = this.a;
            if (i == 1) {
                return this.b.onCameraFrame(cvCameraViewFrame.rgba());
            }
            if (i == 2) {
                return this.b.onCameraFrame(cvCameraViewFrame.gray());
            }
            Log.e(CameraBridgeViewBase.f, "Invalid frame format! Only RGBA and Gray Scale are supported!");
            return null;
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2
        public void onCameraViewStarted(int i, int i2) {
            this.b.onCameraViewStarted(i, i2);
        }

        @Override // org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2
        public void onCameraViewStopped() {
            this.b.onCameraViewStopped();
        }

        public void setFrameFormat(int i) {
            this.a = i;
        }
    }

    public interface ListItemAccessor {
        int getHeight(Object obj);

        int getWidth(Object obj);
    }

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((Activity) CameraBridgeViewBase.this.getContext()).finish();
        }
    }

    public CameraBridgeViewBase(Context context, int i) {
        super(context);
        this.a = 0;
        this.e = new Object();
        this.mScale = 0.0f;
        this.mPreviewFormat = 1;
        this.mCameraIndex = -1;
        this.mCameraPermissionGranted = false;
        this.mFpsMeter = null;
        this.mCameraIndex = i;
        getHolder().addCallback(this);
        this.mMaxWidth = -1;
        this.mMaxHeight = -1;
    }

    private void a() {
        Log.d(f, "call checkCurrentState");
        int i = (this.mEnabled && this.mCameraPermissionGranted && this.d && getVisibility() == 0) ? 1 : 0;
        int i2 = this.a;
        if (i != i2) {
            g(i2);
            this.a = i;
            f(i);
        }
    }

    private void b() {
        Log.d(f, "call onEnterStartedState");
        if (connectCamera(getWidth(), getHeight())) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).create();
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.setMessage("It seems that you device does not support camera (or it is locked). Application will be closed.");
        alertDialogCreate.setButton(-3, "OK", new a());
        alertDialogCreate.show();
    }

    private void c() {
    }

    private void d() {
        disconnectCamera();
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    private void e() {
    }

    private void f(int i) {
        Log.d(f, "call processEnterState: " + i);
        if (i == 0) {
            c();
            CvCameraViewListener2 cvCameraViewListener2 = this.c;
            if (cvCameraViewListener2 != null) {
                cvCameraViewListener2.onCameraViewStopped();
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        b();
        CvCameraViewListener2 cvCameraViewListener3 = this.c;
        if (cvCameraViewListener3 != null) {
            cvCameraViewListener3.onCameraViewStarted(this.mFrameWidth, this.mFrameHeight);
        }
    }

    private void g(int i) {
        Log.d(f, "call processExitState: " + i);
        if (i == 0) {
            e();
        } else {
            if (i != 1) {
                return;
            }
            d();
        }
    }

    public void AllocateCache() {
        this.b = Bitmap.createBitmap(this.mFrameWidth, this.mFrameHeight, Bitmap.Config.ARGB_8888);
    }

    public void SetCaptureFormat(int i) {
        this.mPreviewFormat = i;
        CvCameraViewListener2 cvCameraViewListener2 = this.c;
        if (cvCameraViewListener2 instanceof CvCameraViewListenerAdapter) {
            ((CvCameraViewListenerAdapter) cvCameraViewListener2).setFrameFormat(i);
        }
    }

    public Size calculateCameraFrameSize(List<?> list, ListItemAccessor listItemAccessor, int i, int i2) {
        int i3 = this.mMaxWidth;
        if (i3 != -1 && i3 < i) {
            i = i3;
        }
        int i4 = this.mMaxHeight;
        if (i4 != -1 && i4 < i2) {
            i2 = i4;
        }
        int width = 0;
        int height = 0;
        for (Object obj : list) {
            int width2 = listItemAccessor.getWidth(obj);
            int height2 = listItemAccessor.getHeight(obj);
            Log.d(f, "trying size: " + width2 + "x" + height2);
            if (width2 <= i && height2 <= i2 && width2 >= width && height2 >= height) {
                height = height2;
                width = width2;
            }
        }
        if ((width == 0 || height == 0) && list.size() > 0) {
            Log.i(f, "fallback to the first frame size");
            Object obj2 = list.get(0);
            width = listItemAccessor.getWidth(obj2);
            height = listItemAccessor.getHeight(obj2);
        }
        return new Size(width, height);
    }

    public abstract boolean connectCamera(int i, int i2);

    public void deliverAndDrawFrame(CvCameraViewFrame cvCameraViewFrame) {
        Canvas canvasLockCanvas;
        CvCameraViewListener2 cvCameraViewListener2 = this.c;
        Mat matOnCameraFrame = cvCameraViewListener2 != null ? cvCameraViewListener2.onCameraFrame(cvCameraViewFrame) : cvCameraViewFrame.rgba();
        boolean z = true;
        if (matOnCameraFrame != null) {
            try {
                Utils.matToBitmap(matOnCameraFrame, this.b);
            } catch (Exception e) {
                Log.e(f, "Mat type: " + matOnCameraFrame);
                Log.e(f, "Bitmap type: " + this.b.getWidth() + "*" + this.b.getHeight());
                StringBuilder sb = new StringBuilder();
                sb.append("Utils.matToBitmap() throws an exception: ");
                sb.append(e.getMessage());
                Log.e(f, sb.toString());
                z = false;
            }
        }
        if (!z || this.b == null || (canvasLockCanvas = getHolder().lockCanvas()) == null) {
            return;
        }
        canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Log.d(f, "mStretch value: " + this.mScale);
        if (this.mScale != 0.0f) {
            canvasLockCanvas.drawBitmap(this.b, new Rect(0, 0, this.b.getWidth(), this.b.getHeight()), new Rect((int) ((canvasLockCanvas.getWidth() - (this.mScale * this.b.getWidth())) / 2.0f), (int) ((canvasLockCanvas.getHeight() - (this.mScale * this.b.getHeight())) / 2.0f), (int) (((canvasLockCanvas.getWidth() - (this.mScale * this.b.getWidth())) / 2.0f) + (this.mScale * this.b.getWidth())), (int) (((canvasLockCanvas.getHeight() - (this.mScale * this.b.getHeight())) / 2.0f) + (this.mScale * this.b.getHeight()))), (Paint) null);
        } else {
            canvasLockCanvas.drawBitmap(this.b, new Rect(0, 0, this.b.getWidth(), this.b.getHeight()), new Rect((canvasLockCanvas.getWidth() - this.b.getWidth()) / 2, (canvasLockCanvas.getHeight() - this.b.getHeight()) / 2, ((canvasLockCanvas.getWidth() - this.b.getWidth()) / 2) + this.b.getWidth(), ((canvasLockCanvas.getHeight() - this.b.getHeight()) / 2) + this.b.getHeight()), (Paint) null);
        }
        FpsMeter fpsMeter = this.mFpsMeter;
        if (fpsMeter != null) {
            fpsMeter.measure();
            this.mFpsMeter.draw(canvasLockCanvas, 20.0f, 30.0f);
        }
        getHolder().unlockCanvasAndPost(canvasLockCanvas);
    }

    public void disableFpsMeter() {
        this.mFpsMeter = null;
    }

    public void disableView() {
        synchronized (this.e) {
            this.mEnabled = false;
            a();
        }
    }

    public abstract void disconnectCamera();

    public void enableFpsMeter() {
        if (this.mFpsMeter == null) {
            FpsMeter fpsMeter = new FpsMeter();
            this.mFpsMeter = fpsMeter;
            fpsMeter.setResolution(this.mFrameWidth, this.mFrameHeight);
        }
    }

    public void enableView() {
        synchronized (this.e) {
            this.mEnabled = true;
            a();
        }
    }

    public void setCameraIndex(int i) {
        this.mCameraIndex = i;
    }

    public void setCameraPermissionGranted() {
        synchronized (this.e) {
            this.mCameraPermissionGranted = true;
            a();
        }
    }

    public void setCvCameraViewListener(CvCameraViewListener2 cvCameraViewListener2) {
        this.c = cvCameraViewListener2;
    }

    public void setMaxFrameSize(int i, int i2) {
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.d(f, "call surfaceChanged event");
        synchronized (this.e) {
            if (this.d) {
                this.d = false;
                a();
                this.d = true;
                a();
            } else {
                this.d = true;
                a();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this.e) {
            this.d = false;
            a();
        }
    }

    public void setCvCameraViewListener(CvCameraViewListener cvCameraViewListener) {
        CvCameraViewListenerAdapter cvCameraViewListenerAdapter = new CvCameraViewListenerAdapter(cvCameraViewListener);
        cvCameraViewListenerAdapter.setFrameFormat(this.mPreviewFormat);
        this.c = cvCameraViewListenerAdapter;
    }

    public CameraBridgeViewBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.e = new Object();
        this.mScale = 0.0f;
        this.mPreviewFormat = 1;
        this.mCameraIndex = -1;
        this.mCameraPermissionGranted = false;
        this.mFpsMeter = null;
        Log.d(f, "Attr count: " + Integer.valueOf(attributeSet.getAttributeCount()));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.CameraBridgeViewBase);
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.CameraBridgeViewBase_show_fps, false)) {
            enableFpsMeter();
        }
        this.mCameraIndex = typedArrayObtainStyledAttributes.getInt(R.styleable.CameraBridgeViewBase_camera_id, -1);
        getHolder().addCallback(this);
        this.mMaxWidth = -1;
        this.mMaxHeight = -1;
        typedArrayObtainStyledAttributes.recycle();
    }
}
