package com.xiaomi.hm.health.watermarkcamera.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.google.common.util.concurrent.ListenableFuture;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.watermarkcamera.R;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes22.dex */
@SuppressLint({"NewApi"})
public class WatermarkCameraFragment extends Fragment {
    private static final String i = "WatermarkCameraFragment";
    private static final int j = 270;
    private static final int k = 90;
    private Context a;
    private PreviewView b;
    private Preview c;
    public ImageCapture d;
    private boolean e = false;
    private ExecutorService f = null;
    private Camera g = null;
    private ProcessCameraProvider h = null;

    public interface PictureListener {
        void saveImage(Bitmap bitmap);
    }

    public class a extends ImageCapture.OnImageCapturedCallback {
        public final /* synthetic */ PictureListener a;

        public a(PictureListener pictureListener) {
            this.a = pictureListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (WatermarkCameraFragment.this.a != null) {
                IconToast.showError(WatermarkCameraFragment.this.a, WatermarkCameraFragment.this.a.getString(R.string.share_fail));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (WatermarkCameraFragment.this.a != null) {
                IconToast.showError(WatermarkCameraFragment.this.a, WatermarkCameraFragment.this.a.getString(R.string.share_fail));
            }
        }

        @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
        public void onCaptureSuccess(@NonNull ImageProxy imageProxy) {
            if (imageProxy.getPlanes().length <= 0 || imageProxy.getPlanes()[0] == null) {
                if (WatermarkCameraFragment.this.getActivity() != null) {
                    WatermarkCameraFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.watermarkcamera.ui.fragment.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c();
                        }
                    });
                }
                HMLog.i(WatermarkCameraFragment.i, "onCapture No image", new Object[0]);
            } else {
                ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                int iCapacity = buffer.capacity();
                byte[] bArr = new byte[iCapacity];
                buffer.get(bArr);
                this.a.saveImage(WatermarkCameraFragment.this.j(BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null), imageProxy.getImageInfo().getRotationDegrees()));
            }
            imageProxy.close();
            HMLog.i(WatermarkCameraFragment.i, "onCaptureSuccess", new Object[0]);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
        public void onError(@NonNull ImageCaptureException imageCaptureException) {
            super.onError(imageCaptureException);
            HMLog.i(WatermarkCameraFragment.i, "onCaptureError:" + imageCaptureException.getMessage(), new Object[0]);
            if (WatermarkCameraFragment.this.getActivity() != null) {
                WatermarkCameraFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.watermarkcamera.ui.fragment.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            }
        }
    }

    private void e(@NonNull ProcessCameraProvider processCameraProvider, PreviewView previewView) {
        CameraSelector cameraSelector = this.e ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA;
        processCameraProvider.unbindAll();
        this.g = processCameraProvider.bindToLifecycle(this, cameraSelector, this.c, this.d);
        this.c.setSurfaceProvider(previewView.getSurfaceProvider());
    }

    private void f(PreviewView previewView) {
        this.d = new ImageCapture.Builder().setTargetRotation(previewView.getDisplay().getRotation()).setTargetResolution(new Size(this.b.getWidth(), this.b.getHeight())).setCaptureMode(0).build();
    }

    private void g(PreviewView previewView) {
        this.c = new Preview.Builder().setTargetResolution(new Size(this.b.getWidth(), this.b.getHeight())).setTargetRotation(previewView.getDisplay().getRotation()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        k(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void i(ListenableFuture listenableFuture, PreviewView previewView) {
        try {
            this.h = (ProcessCameraProvider) listenableFuture.get();
            g(previewView);
            f(previewView);
            e(this.h, previewView);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap j(Bitmap bitmap, int i2) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        if (this.e) {
            matrix.setScale(-1.0f, 1.0f);
            if (i2 == 270) {
                i2 = 90;
            }
        }
        matrix.postRotate(i2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private void k(final PreviewView previewView) {
        final ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(this.a);
        processCameraProvider.addListener(new Runnable() { // from class: bm8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(processCameraProvider, previewView);
            }
        }, ContextCompat.getMainExecutor(this.a));
    }

    public static WatermarkCameraFragment newInstance() {
        return new WatermarkCameraFragment();
    }

    public void changeCameraMode(boolean z) {
        this.e = z;
        ProcessCameraProvider processCameraProvider = this.h;
        if (processCameraProvider != null) {
            e(processCameraProvider, this.b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f = Executors.newSingleThreadExecutor();
        this.b.post(new Runnable() { // from class: am8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_watermark_camera, viewGroup, false);
        this.b = (PreviewView) viewInflate.findViewById(R.id.profile_view);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ProcessCameraProvider processCameraProvider = this.h;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        ExecutorService executorService = this.f;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public void setFlashMode(boolean z) {
        if (z) {
            this.d.setFlashMode(1);
        } else {
            this.d.setFlashMode(2);
        }
    }

    public void takePicture(PictureListener pictureListener) {
        ImageCapture imageCapture = this.d;
        if (imageCapture != null) {
            imageCapture.lambda$takePicture$4(this.f, new a(pictureListener));
        }
    }
}
