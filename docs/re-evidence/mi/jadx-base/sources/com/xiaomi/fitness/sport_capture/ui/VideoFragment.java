package com.xiaomi.fitness.sport_capture.ui;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_capture.SportProjectionHandler;
import com.xiaomi.fitness.sport_capture.app_lifecycle.SportCapturePreference;
import com.xiaomi.fitness.sport_capture.ui.VideoFragment;
import com.xiaomi.fitness.sport_capture.utils.CameraUtils;
import com.xiaomi.fitness.sport_capture.utils.DevicePreviewNotifyUtils;
import com.xiaomi.fitness.sport_capture.utils.DeviceUtils;
import com.xiaomi.fitness.sport_capture.utils.SportStatusUtils;
import com.xiaomi.fitness.sport_capture.utils.VideoFileUtils;
import com.xiaomi.fitness.sport_capture.widgets.AutoFitTextureView;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.passport.ui.page.UserAvatarUpdateActivity;
import defpackage.aje;
import defpackage.av6;
import defpackage.d1j;
import defpackage.evi;
import defpackage.nva;
import defpackage.wwi;
import defpackage.yri;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import miuix.animation.internal.ThreadPoolUtil;

/* JADX INFO: loaded from: classes10.dex */
public class VideoFragment extends Fragment implements DeviceAndSportStatusListener.IStopCallback {
    public static final SparseIntArray M;
    public static final SparseIntArray N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AutoFitTextureView f13023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f13024b;
    public ImageView c;
    public String d;
    public CameraDevice e;
    public CameraCaptureSession f;
    public SurfaceTexture g;
    public Size h;
    public Size i;
    public MediaRecorder j;
    public boolean n;
    public HandlerThread o;
    public Handler p;
    public Handler q;
    public Integer s;
    public String t;
    public String u;
    public CaptureRequest.Builder v;
    public ImageReader w;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f13025k = new AtomicBoolean(false);
    public final int l = 1000;
    public long m = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Semaphore f13026r = new Semaphore(1);
    public final nva x = new nva();
    public SurfaceTexture y = null;
    public final float[] z = new float[16];
    public EGLSurface A = null;
    public boolean B = false;
    public boolean C = false;
    public AtomicBoolean D = new AtomicBoolean(false);
    public final AtomicBoolean E = new AtomicBoolean(false);
    public final DeviceAndSportStatusListener F = new DeviceAndSportStatusListener(this);
    public final BroadcastReceiver G = new a();
    public final IntentFilter H = new IntentFilter();
    public boolean I = false;
    public final CameraCaptureSession.CaptureCallback J = new b();
    public final TextureView.SurfaceTextureListener K = new c();
    public CameraDevice.StateCallback L = new d();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), SportProjectionHandler.STOP_PROJECTION_COMMAND) || TextUtils.equals(intent.getAction(), BaseVideoActivity.BACKGROUND_ACTION)) {
                VideoFragment.this.i0();
            }
        }
    }

    public class b extends CameraCaptureSession.CaptureCallback {
        public b() {
        }

        public final /* synthetic */ void b(long j) {
            if (!VideoFragment.this.n || VideoFragment.this.m <= 0 || j - VideoFragment.this.m <= 3600000) {
                return;
            }
            VideoFragment.this.I0();
            VideoFragment.this.B0();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (VideoFragment.this.y != null) {
                VideoFragment.this.y.updateTexImage();
                VideoFragment.this.y.getTransformMatrix(VideoFragment.this.z);
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            VideoFragment.this.x.m(VideoFragment.this.f13023a.getWidth(), VideoFragment.this.f13023a.getHeight());
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            VideoFragment.this.x.l(VideoFragment.this.z, VideoFragment.this.x.f(), VideoFragment.this.f13023a.getWidth(), VideoFragment.this.f13023a.getHeight(), true, VideoFragment.this.B);
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            if (VideoFragment.this.A != null) {
                VideoFragment.this.x.m(VideoFragment.this.h.getWidth(), VideoFragment.this.h.getHeight());
                VideoFragment.this.x.l(VideoFragment.this.z, VideoFragment.this.A, VideoFragment.this.h.getWidth(), VideoFragment.this.h.getHeight(), false, VideoFragment.this.B);
            }
            final long jCurrentTimeMillis6 = System.currentTimeMillis();
            VideoFragment.this.q.post(new Runnable() { // from class: yqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40438a.b(jCurrentTimeMillis6);
                }
            });
            Logger.d("VideoFragment", "render-duration update(" + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + ") resize(" + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + ") renderScreen(" + (jCurrentTimeMillis5 - jCurrentTimeMillis4) + ") renderRecord(" + (jCurrentTimeMillis6 - jCurrentTimeMillis5) + ")total(" + (jCurrentTimeMillis6 - jCurrentTimeMillis) + ")");
        }
    }

    public class c implements TextureView.SurfaceTextureListener {
        public c() {
        }

        public final /* synthetic */ void b() {
            VideoFragment videoFragment = VideoFragment.this;
            videoFragment.o0(videoFragment.g, VideoFragment.this.h.getWidth(), VideoFragment.this.h.getHeight());
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VideoFragment.this.E.get()) {
                Logger.i("VideoFragment", "opps!! onSurfaceTextureAvailable after preview stopped!");
                return;
            }
            VideoFragment.this.g = surfaceTexture;
            VideoFragment.this.p.post(new Runnable() { // from class: zqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41584a.b();
                }
            });
            VideoFragment.this.z0();
            SportStatusUtils.startHandle(VideoFragment.this.getActivity(), VideoFragment.this.f13023a.getWidth(), VideoFragment.this.f13023a.getHeight());
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Logger.d("VideoFragment", "onSurfaceTextureDestroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (VideoFragment.this.E.get()) {
                Logger.i("VideoFragment", "opps!! onSurfaceTextureSizeChanged after preview stopped!");
            } else {
                VideoFragment.this.h0(i, i2);
                Logger.d("VideoFragment", "onSurfaceTextureSizeChanged");
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class d extends CameraDevice.StateCallback {
        public d() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            VideoFragment.this.f13026r.release();
            cameraDevice.close();
            VideoFragment.this.e = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            VideoFragment.this.f13026r.release();
            cameraDevice.close();
            VideoFragment.this.e = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            VideoFragment.this.e = cameraDevice;
            if (VideoFragment.this.y != null) {
                VideoFragment.this.y.setDefaultBufferSize(VideoFragment.this.h.getWidth(), VideoFragment.this.h.getHeight());
            }
            VideoFragment.this.D0();
            VideoFragment.this.f13026r.release();
            if (VideoFragment.this.f13023a != null) {
                VideoFragment videoFragment = VideoFragment.this;
                videoFragment.h0(videoFragment.f13023a.getWidth(), VideoFragment.this.f13023a.getHeight());
            }
        }
    }

    public class e extends av6 {
        public e() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            super.onDialogClick(str, dialogInterface, i);
            if (i != -2) {
                if (i != -1) {
                    return;
                } else {
                    VideoFragment.this.H0();
                }
            }
            dialogInterface.dismiss();
        }
    }

    public class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (VideoFragment.this.f13023a.getWidth() <= VideoFragment.this.f13023a.getHeight() || VideoFragment.this.C) {
                return;
            }
            DevicePreviewNotifyUtils.notifySuccess();
            VideoFragment.this.C = true;
            aje.b(VideoFragment.this.getContext()).d(new Intent(BaseVideoActivity.PREVIEW_SUCCESS_ACTION));
        }
    }

    public class g extends av6 {
        public g() {
        }

        @Override // defpackage.av6
        public void onDialogClick(String str, DialogInterface dialogInterface, int i) {
            super.onDialogClick(str, dialogInterface, i);
            if (i != -2) {
                if (i != -1) {
                    return;
                } else {
                    dialogInterface.dismiss();
                }
            }
            dialogInterface.dismiss();
        }
    }

    public class h extends CameraCaptureSession.StateCallback {
        public h() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            FragmentActivity activity = VideoFragment.this.getActivity();
            if (activity != null) {
                Toast.makeText(activity, "Failed", 0).show();
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            VideoFragment.this.f = cameraCaptureSession;
            VideoFragment.this.M0();
        }
    }

    public enum i {
        BACK,
        FRONT
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        N = sparseIntArray2;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, 180);
        sparseIntArray2.append(0, 270);
        sparseIntArray2.append(1, 180);
        sparseIntArray2.append(2, 90);
        sparseIntArray2.append(3, 0);
    }

    private void d0() {
        Logger.d("VideoFragment", "closeCamera: E");
        try {
            try {
                this.f13026r.acquire();
                f0();
                CameraDevice cameraDevice = this.e;
                if (cameraDevice != null) {
                    cameraDevice.close();
                    this.e = null;
                }
                MediaRecorder mediaRecorder = this.j;
                if (mediaRecorder != null) {
                    mediaRecorder.release();
                    this.j = null;
                }
                this.f13026r.release();
                Logger.d("VideoFragment", "closeCamera: X");
            } catch (InterruptedException unused) {
                throw new RuntimeException("Interrupted while trying to lock camera closing.");
            }
        } catch (Throwable th) {
            this.f13026r.release();
            throw th;
        }
    }

    private void j0() {
        try {
            this.E.set(true);
            Logger.d("VideoFragment", "finishActivity");
            getActivity().finish();
        } catch (Exception e2) {
            Logger.e("VideoFragment", "finish activity exception:" + e2.getMessage());
        }
    }

    public static /* synthetic */ void p0() {
        ToastUtil.showLongToast(d1j.y);
    }

    public static /* synthetic */ void s0(ImageReader imageReader) {
    }

    public static VideoFragment x0() {
        return new VideoFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        CameraManager cameraManager = (CameraManager) activity.getSystemService(UserAvatarUpdateActivity.CAMERA);
        try {
            Logger.d("VideoFragment", "tryAcquire");
            if (!this.f13026r.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Time out waiting to lock camera opening.");
            }
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(this.d);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            this.s = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            if (streamConfigurationMap == null) {
                throw new RuntimeException("Cannot get available preview/video sizes");
            }
            Logger.d("VideoFragment", "openCamera: " + this.d + "- SensorOrientation:" + this.s);
            SurfaceTexture surfaceTexture = this.y;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(this.h.getWidth(), this.h.getHeight());
            }
            cameraManager.openCamera(this.d, this.L, this.p);
        } catch (Exception e2) {
            Logger.e("VideoFragment", "openCamera exception:" + e2.getMessage(), e2);
        }
    }

    public final void A0() {
        try {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            }
            MediaRecorder mediaRecorder = this.j;
            if (mediaRecorder != null) {
                mediaRecorder.release();
                this.j = null;
            }
            MediaRecorder mediaRecorder2 = new MediaRecorder();
            this.j = mediaRecorder2;
            mediaRecorder2.setAudioSource(1);
            this.j.setVideoSource(2);
            this.j.setOutputFormat(2);
            String str = this.t;
            if (str == null || str.isEmpty()) {
                this.t = l0();
            }
            this.j.setOutputFile(this.u);
            this.j.setVideoEncodingBitRate(10000000);
            this.j.setVideoFrameRate(30);
            this.j.setVideoSize(this.h.getWidth(), this.h.getHeight());
            this.j.setVideoEncoder(2);
            this.j.setAudioEncoder(3);
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int iIntValue = this.s.intValue();
            if (iIntValue == 90) {
                this.j.setOrientationHint(M.get(rotation));
            } else if (iIntValue == 270) {
                this.j.setOrientationHint(N.get(rotation));
            }
            SportStatusUtils.updateRotationDegree(this.s.intValue());
            this.j.prepare();
            ImageReader imageReaderNewInstance = ImageReader.newInstance(this.i.getWidth(), this.i.getHeight(), 256, 2);
            this.w = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: uqq
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    VideoFragment.s0(imageReader);
                }
            }, this.p);
            this.f13025k.set(true);
        } catch (Exception e2) {
            Logger.e("VideoFragment", "setUpMediaRecorderAndImageReader exception", e2);
        }
    }

    public final void B0() {
        CommonDialog.c cVar = new CommonDialog.c("video_auto_close");
        cVar.setDialogTitle(d1j.h);
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(d1j.i, new Object[0]));
        cVar.setPositiveText(d1j.common_known);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new g());
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    public final void C0() {
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.o = handlerThread;
        handlerThread.start();
        this.p = new Handler(this.o.getLooper());
    }

    public final void D0() {
        if (this.e == null || !this.f13023a.isAvailable() || this.h == null) {
            return;
        }
        try {
            f0();
            this.v = this.e.createCaptureRequest(1);
            ArrayList arrayList = new ArrayList();
            Surface surface = new Surface(this.y);
            arrayList.add(surface);
            this.v.addTarget(surface);
            A0();
            this.e.createCaptureSession(arrayList, new h(), this.p);
        } catch (Exception e2) {
            Logger.e("VideoFragment", "startPreview exception:" + e2.getMessage(), e2);
        }
    }

    public final void E0() {
        if (this.e == null || !this.f13023a.isAvailable() || this.h == null || this.j == null) {
            return;
        }
        this.t = l0();
        this.c.setVisibility(4);
        getActivity().runOnUiThread(new Runnable() { // from class: vqq
            @Override // java.lang.Runnable
            public final void run() {
                this.f37143a.t0();
            }
        });
        getActivity().getWindow().addFlags(128);
    }

    public final void F0() {
        SportStatusUtils.stopHandle();
        if (!this.I) {
            DevicePreviewNotifyUtils.reqFinished();
        }
        this.I = true;
    }

    public final void G0() {
        HandlerThread handlerThread = this.o;
        if (handlerThread == null) {
            return;
        }
        handlerThread.quitSafely();
        try {
            this.o.join();
            this.o = null;
            this.p = null;
        } catch (Exception e2) {
            Logger.e("VideoFragment", "stopBackgroundThread exception", e2);
        }
    }

    public final void H0() {
        if (this.n) {
            J0(true);
        } else {
            e0();
            j0();
        }
    }

    public final void I0() {
        SportStatusUtils.hideRecordDuration();
        this.f13024b.setImageResource(wwi.f38440b);
        J0(false);
        this.f13024b.setContentDescription(getString(d1j.f14963r));
    }

    public final void J0(final boolean z) {
        Logger.i("VideoFragment", "stopRecordingVideo:" + z);
        this.n = false;
        this.A = null;
        this.m = -1L;
        this.f13025k.set(false);
        if (getActivity() != null && getActivity().getWindow() != null) {
            getActivity().getWindow().clearFlags(128);
        }
        ThreadPoolUtil.post(new Runnable() { // from class: pqq
            @Override // java.lang.Runnable
            public final void run() {
                this.f30655a.v0(z);
            }
        });
    }

    public void K0() {
        if (this.f13026r.tryAcquire()) {
            String strK0 = k0(i.BACK);
            String strK1 = k0(i.FRONT);
            Logger.d("VideoFragment", "switchCamera: CAMERA_ID_REAR_MAIN = " + strK0 + ", CAMERA_ID_FRONT = " + strK1);
            if (TextUtils.equals(this.d, strK0)) {
                this.d = strK1;
                Logger.i("VideoFragment", "switchCamera: opening front camera!");
            } else if (TextUtils.equals(this.d, strK1)) {
                this.d = strK0;
                Logger.i("VideoFragment", "switchCamera: opening rear main camera!");
            }
            L0();
            this.f13023a.post(new Runnable() { // from class: wqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38264a.w0();
                }
            });
            this.f13026r.release();
        }
    }

    public final void L0() {
        try {
            Size[] outputSizes = ((StreamConfigurationMap) ((CameraManager) getContext().getSystemService(UserAvatarUpdateActivity.CAMERA)).getCameraCharacteristics(this.d).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(MediaRecorder.class);
            this.h = CameraUtils.chooseOptimalSize(outputSizes, new Point(16, 9), new Size(1920, Constants.FHD_WIDTH));
            this.i = CameraUtils.chooseOptimalSize(outputSizes, new Point(16, 9), new Size(1920, Constants.FHD_WIDTH));
            Logger.i("VideoFragment", "openCamera: mVideoSize > " + this.i + " | mPreviewSize > " + this.h);
            if (getResources().getConfiguration().orientation == 2 || DeviceUtils.isMixUnFolded()) {
                this.f13023a.a(this.h.getWidth(), this.h.getHeight());
            } else {
                this.f13023a.a(this.h.getHeight(), this.h.getWidth());
            }
        } catch (Exception e2) {
            Logger.e("VideoFragment", "updateCameraSize exception", e2);
        }
    }

    public final void M0() {
        if (this.e == null) {
            return;
        }
        try {
            this.v.set(CaptureRequest.CONTROL_MODE, 1);
            g0();
            this.f.setRepeatingRequest(this.v.build(), this.J, this.p);
        } catch (CameraAccessException e2) {
            Logger.e("VideoFragment", "updatePreview excption", e2);
        }
    }

    public final void e0() {
        d0();
        G0();
    }

    public final void f0() {
        CameraCaptureSession cameraCaptureSession = this.f;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f = null;
        }
    }

    public final void g0() {
        try {
            Logger.d("VideoFragment", "updatePreview: set fps > 30");
            this.v.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(30, 30));
            CameraCharacteristics cameraCharacteristics = ((CameraManager) getContext().getSystemService(UserAvatarUpdateActivity.CAMERA)).getCameraCharacteristics(this.d);
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 1) {
                        this.v.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            Logger.e("VideoFragment", "configPreviewRequest exception", e2);
        }
    }

    public final void h0(int i2, int i3) {
        FragmentActivity activity = getActivity();
        if (this.f13023a == null || this.h == null || activity == null) {
            return;
        }
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        Matrix matrix = new Matrix();
        float f2 = i2;
        float f3 = i3;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        RectF rectF2 = new RectF(0.0f, 0.0f, this.h.getHeight(), this.h.getWidth());
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        if (1 == rotation || 3 == rotation) {
            rectF2.offset(fCenterX - rectF2.centerX(), fCenterY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float fMax = Math.max(f3 / this.h.getHeight(), f2 / this.h.getWidth());
            matrix.postScale(fMax, fMax, fCenterX, fCenterY);
            matrix.postRotate((rotation - 2) * 90, fCenterX, fCenterY);
        }
        this.f13023a.setTransform(matrix);
    }

    public final void i0() {
        try {
            aje.b(AppUtil.getApp()).e(this.G);
        } catch (Exception e2) {
            Logger.e("VideoFragment", "unregister receiver excelption:" + e2.getMessage(), e2);
        }
        if (!this.I) {
            DevicePreviewNotifyUtils.respFinished();
        }
        this.I = true;
        H0();
    }

    public final String k0(i iVar) {
        int i2;
        try {
            CameraManager cameraManager = (CameraManager) getContext().getSystemService(UserAvatarUpdateActivity.CAMERA);
            String[] cameraIdList = cameraManager.getCameraIdList();
            int length = cameraIdList.length;
            while (i2 < length) {
                String str = cameraIdList[i2];
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                i2 = ((iVar == i.BACK && num != null && num.intValue() == 1) || (iVar == i.FRONT && num != null && num.intValue() == 0)) ? 0 : i2 + 1;
                return str;
            }
            return "0";
        } catch (Exception e2) {
            Logger.e("VideoFragment", "chooseCameraByType exception", e2);
            return "0";
        }
    }

    public final String l0() {
        String str;
        File outputDirectory = ((BaseVideoActivity) getActivity()).getOutputDirectory();
        StringBuilder sb = new StringBuilder();
        if (outputDirectory == null) {
            str = "";
        } else {
            str = outputDirectory.getAbsolutePath() + "/";
        }
        sb.append(str);
        sb.append(System.currentTimeMillis());
        sb.append(".mp4");
        return sb.toString();
    }

    public final /* synthetic */ void lambda$onViewCreated$0(View view) {
        y0();
    }

    public final int m0() {
        return DeviceUtils.isMixUnFolded() ? evi.d : evi.f17107b;
    }

    public final void n0() {
        this.D.set(true);
        File file = new File(this.t);
        File file2 = new File(this.u);
        if (file2.exists()) {
            if (file2.renameTo(file)) {
                VideoFileUtils.saveFile(file);
                this.q.post(new Runnable() { // from class: xqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoFragment.p0();
                    }
                });
            } else {
                Logger.e("VideoFragment", "rename video file error!!");
            }
        }
        this.D.set(false);
    }

    public final void o0(SurfaceTexture surfaceTexture, int i2, int i3) {
        this.x.h(getContext(), surfaceTexture, this.f13023a.getWidth(), this.f13023a.getHeight());
        surfaceTexture.setDefaultBufferSize(this.f13023a.getWidth(), this.f13023a.getHeight());
        this.y = new SurfaceTexture(this.x.g());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.F);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).addAppAndDeviceSportStateListener(getClass(), this.F);
        this.H.addAction(SportProjectionHandler.STOP_PROJECTION_COMMAND);
        this.H.addAction(BaseVideoActivity.BACKGROUND_ACTION);
        aje.b(getContext()).c(this.G, this.H);
        this.q = new Handler(Looper.getMainLooper());
        this.B = DeviceUtils.isFlipFolded();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(m0(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Logger.d("VideoFragment", LifecycleConstantKt.ON_DESTROY);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.F);
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).removeAppAndDeviceSportStateListener(getClass(), this.F);
        if (!DeviceUtils.isMixFoldDevice() || this.C) {
            F0();
        } else {
            Logger.i("VideoFragment", "auto set orientation, ignore stop!!");
        }
        super.onDestroy();
    }

    @Override // com.xiaomi.fitness.sport_capture.ui.DeviceAndSportStatusListener.IStopCallback
    public void onDisconnect() {
        H0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Logger.i("VideoFragment", "onPause isRecording:" + this.n);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.E.set(false);
        Logger.d("VideoFragment", "onResume: ");
        C0();
        if (this.d == null) {
            String strK0 = k0(i.BACK);
            this.d = strK0;
            if (strK0 == null) {
                this.d = "0";
            }
        }
        L0();
        if (this.f13023a.isAvailable()) {
            z0();
        } else {
            this.f13023a.setSurfaceTextureListener(this.K);
        }
    }

    @Override // com.xiaomi.fitness.sport_capture.ui.DeviceAndSportStatusListener.IStopCallback
    public void onSportFinished() {
        H0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Logger.i("VideoFragment", "onStop isRecording:" + this.n);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingPermission"})
    public void onViewCreated(View view, Bundle bundle) {
        Logger.i("VideoFragment", "onViewCreated");
        SportCapturePreference.setAppProjection(true);
        this.f13023a = (AutoFitTextureView) view.findViewById(yri.t);
        this.f13024b = (ImageView) view.findViewById(yri.o);
        this.c = (ImageView) view.findViewById(yri.s);
        this.f13024b.setContentDescription(getString(d1j.f14963r));
        this.f13024b.setOnClickListener(new View.OnClickListener() { // from class: qqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f31754a.lambda$onViewCreated$0(view2);
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: rqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f32808a.q0(view2);
            }
        });
        view.findViewById(yri.f40461a).setOnClickListener(new View.OnClickListener() { // from class: sqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f33895a.r0(view2);
            }
        });
        this.u = ((BaseVideoActivity) getActivity()).getOutputDirectory().getPath() + File.separator + ".tmp.mp4";
        if (DeviceUtils.isMixFoldDevice()) {
            this.f13023a.getViewTreeObserver().addOnGlobalLayoutListener(new f());
        } else {
            DevicePreviewNotifyUtils.notifySuccess();
            aje.b(getContext()).d(new Intent(BaseVideoActivity.PREVIEW_SUCCESS_ACTION));
        }
    }

    public final /* synthetic */ void q0(View view) {
        K0();
    }

    public final /* synthetic */ void r0(View view) {
        if (this.D.get()) {
            ToastUtil.showToast(getString(d1j.q));
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        CommonDialog.c cVar = new CommonDialog.c("video_close");
        cVar.setDialogTitle(d1j.n);
        int i2 = d1j.m;
        if (wearableDeviceModel != null && wearableDeviceModel.getDeviceInfo().isBandType()) {
            i2 = d1j.l;
        }
        cVar.setDialogDescriptionString(new DialogParams.DialogDescriptionString(i2, new Object[0]));
        cVar.setNegativeText(d1j.f14960a);
        cVar.setPositiveText(d1j.t);
        CommonDialog commonDialogCreate = cVar.create();
        commonDialogCreate.addDialogCallback(new e());
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    public final /* synthetic */ void t0() {
        Logger.i("VideoFragment", "startRecordingVideo: start record");
        this.j.start();
        this.m = System.currentTimeMillis();
        this.n = true;
        this.A = this.x.d(this.j.getSurface());
    }

    public final /* synthetic */ void u0(boolean z) {
        this.c.setVisibility(0);
        if (z) {
            e0();
            j0();
        }
    }

    public final /* synthetic */ void v0(final boolean z) {
        Handler handler;
        Runnable runnable;
        try {
            try {
                this.j.stop();
                this.j.release();
                this.j = null;
                n0();
                if (!z) {
                    A0();
                }
                handler = this.q;
                runnable = new Runnable() { // from class: tqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34948a.u0(z);
                    }
                };
            } catch (IllegalStateException e2) {
                Logger.e("VideoFragment", "stopRecordingVideo IllegalStateException:" + e2.getMessage(), e2);
                if (!z && !this.f13025k.get()) {
                    A0();
                }
                handler = this.q;
                runnable = new Runnable() { // from class: tqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34948a.u0(z);
                    }
                };
            } catch (Exception e3) {
                Logger.e("VideoFragment", "stopRecordingVideo exception:" + e3.getMessage(), e3);
                handler = this.q;
                runnable = new Runnable() { // from class: tqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34948a.u0(z);
                    }
                };
            }
            handler.post(runnable);
        } catch (Throwable th) {
            this.q.post(new Runnable() { // from class: tqq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34948a.u0(z);
                }
            });
            throw th;
        }
    }

    public final /* synthetic */ void w0() {
        d0();
        z0();
    }

    public void y0() {
        if (this.n) {
            if (System.currentTimeMillis() - this.m >= 1000) {
                I0();
                return;
            } else {
                Logger.i("VideoFragment", "video too short!!");
                return;
            }
        }
        if (!this.f13025k.get()) {
            Logger.i("VideoFragment", "recorder has not setup, waiting");
            return;
        }
        SportStatusUtils.showRecordDuration();
        this.f13024b.setImageResource(wwi.c);
        E0();
        this.f13024b.setContentDescription(getString(d1j.u));
    }
}
