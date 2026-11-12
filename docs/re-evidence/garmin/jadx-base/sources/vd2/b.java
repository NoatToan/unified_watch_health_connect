package vd2;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.handalignment.AutoFitTextureView;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u;
import p13.x;
import vc0.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvd2/b;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "b", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f177472p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f177473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Size f177474r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Size f177475t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f177476a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AutoFitTextureView f177480e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f177482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CameraDevice f177483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CameraCaptureSession f177484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Size f177485j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HandlerThread f177487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f177488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageReader f177489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f177490o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC3317b f177477b = EnumC3317b.CENTER_CROP;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Size f177478c = f177474r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f177479d = f177475t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f177481f = m.b(new v(this, 4));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f177486k = 1.0f;

    /* JADX INFO: renamed from: vd2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvd2/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC3317b {
        FIT_XY,
        FIT_CENTER,
        CENTER,
        CENTER_CROP
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177496a;

        static {
            int[] iArr = new int[EnumC3317b.values().length];
            try {
                iArr[EnumC3317b.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3317b.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3317b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3317b.CENTER_CROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f177496a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f177497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f177498b;

        public d(int i14, int i15) {
            this.f177497a = i14;
            this.f177498b = i15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            Size size = (Size) t7;
            int width = size.getWidth();
            int i14 = this.f177497a;
            double d14 = i14 - width;
            int height = size.getHeight();
            int i15 = this.f177498b;
            Size size2 = (Size) t14;
            return r13.a.b(Double.valueOf(Math.abs(Math.hypot(d14, i15 - height))), Double.valueOf(Math.abs(Math.hypot(i14 - size2.getWidth(), i15 - size2.getHeight()))));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vd2/b$e", "Landroid/view/TextureView$SurfaceTextureListener;", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements TextureView.SurfaceTextureListener {
        public e() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i14, int i15) {
            surfaceTexture.getClass();
            a aVar = b.f177472p;
            b.this.w6(i14, i15);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            surfaceTexture.getClass();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i14, int i15) {
            surfaceTexture.getClass();
            a aVar = b.f177472p;
            b.this.u6(i14, i15);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            surfaceTexture.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vd2/b$f", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends CameraDevice.StateCallback {
        public f() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            cameraDevice.getClass();
            cameraDevice.close();
            b.this.f177483h = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i14) {
            String str;
            cameraDevice.getClass();
            if (i14 == 1) {
                str = "Camera in use";
            } else if (i14 == 2) {
                str = "Max cameras in use";
            } else if (i14 == 3) {
                str = "Camera disabled";
            } else if (i14 != 4) {
                str = i14 != 5 ? "Unknown" : "System error";
            } else {
                str = "Camera error";
            }
            Throwable th3 = new Throwable("Failed to open camera: ".concat(str));
            cameraDevice.close();
            b bVar = b.this;
            bVar.f177483h = null;
            g gVar = bVar.f177476a;
            if (gVar != null) {
                gVar.a(th3);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            cameraDevice.getClass();
            final b bVar = b.this;
            bVar.f177483h = cameraDevice;
            try {
                AutoFitTextureView autoFitTextureView = bVar.f177480e;
                if (autoFitTextureView == null) {
                    s.m("textureView");
                    throw null;
                }
                SurfaceTexture surfaceTexture = autoFitTextureView.getSurfaceTexture();
                surfaceTexture.getClass();
                CameraDevice cameraDevice2 = bVar.f177483h;
                cameraDevice2.getClass();
                Size size = bVar.f177485j;
                size.getClass();
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice2.createCaptureRequest(1);
                builderCreateCaptureRequest.getClass();
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                builderCreateCaptureRequest.addTarget(surface);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, 2);
                bVar.f177489n = imageReaderNewInstance;
                imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: vd2.a
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        g gVar = bVar.f177476a;
                        if (gVar != null) {
                            imageReader.getClass();
                            gVar.onImageAvailable(imageReader);
                        }
                    }
                }, bVar.f177476a);
                builderCreateCaptureRequest.addTarget(imageReaderNewInstance.getSurface());
                cameraDevice2.createCaptureSession(x.k(surface, imageReaderNewInstance.getSurface()), new vd2.c(bVar, builderCreateCaptureRequest), null);
            } catch (CameraAccessException e4) {
                b.f177473q.error("Failed to create camera preview session: " + e4);
            }
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f177473q = gt2.b.f79005a.i("HandAlignment");
        f177474r = new Size(-1, -1);
        f177475t = new Size(Integer.MAX_VALUE, 1080);
    }

    public b() {
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.f177487l = handlerThread;
        this.f177488m = new Handler(handlerThread.getLooper());
        this.f177490o = new e();
    }

    public static Size v6(Size[] sizeArr, int i14, int i15, Size size, Size size2) {
        Object next;
        List listY = u.Y(sizeArr, new d(Math.max(i14, i15), Math.min(i14, i15)));
        Iterator it = listY.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Size size3 = (Size) next;
            if (size.getWidth() <= size3.getWidth() && size3.getWidth() <= size2.getWidth() && size.getHeight() <= size3.getHeight() && size3.getHeight() <= size2.getHeight()) {
                break;
            }
        }
        Size size4 = (Size) next;
        if (size4 == null) {
            size4 = (Size) listY.get(0);
        }
        f177473q.debug("getOptimalPreviewSize: " + size4.getWidth() + " x " + size4.getHeight());
        return size4;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.camera_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f177487l.quitSafely();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AutoFitTextureView autoFitTextureView = this.f177480e;
        if (autoFitTextureView == null) {
            s.m("textureView");
            throw null;
        }
        if (autoFitTextureView.isAvailable()) {
            AutoFitTextureView autoFitTextureView2 = this.f177480e;
            if (autoFitTextureView2 == null) {
                s.m("textureView");
                throw null;
            }
            int width = autoFitTextureView2.getWidth();
            AutoFitTextureView autoFitTextureView3 = this.f177480e;
            if (autoFitTextureView3 != null) {
                w6(width, autoFitTextureView3.getHeight());
            } else {
                s.m("textureView");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        CameraCaptureSession cameraCaptureSession = this.f177484i;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            Unit unit = Unit.INSTANCE;
        }
        this.f177484i = null;
        CameraDevice cameraDevice = this.f177483h;
        if (cameraDevice != null) {
            cameraDevice.close();
            Unit unit2 = Unit.INSTANCE;
        }
        this.f177483h = null;
        ImageReader imageReader = this.f177489n;
        if (imageReader != null) {
            imageReader.close();
            Unit unit3 = Unit.INSTANCE;
        }
        this.f177489n = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        AutoFitTextureView autoFitTextureView = (AutoFitTextureView) view2.findViewById(R.id.texture);
        this.f177480e = autoFitTextureView;
        if (autoFitTextureView != null) {
            autoFitTextureView.setSurfaceTextureListener(this.f177490o);
        } else {
            s.m("textureView");
            throw null;
        }
    }

    public final void u6(int i14, int i15) {
        androidx.fragment.app.m activity = getActivity();
        Size size = this.f177485j;
        if (activity == null || size == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float height = size.getHeight();
        float width = size.getWidth();
        float f14 = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, height, width);
        float f15 = i14;
        float f16 = i15;
        RectF rectF2 = new RectF(0.0f, 0.0f, f15, f16);
        float fCenterX = rectF2.centerX();
        float fCenterY = rectF2.centerY();
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 1) {
            f14 = -90.0f;
        } else if (rotation == 2) {
            f14 = 180.0f;
        } else if (rotation == 3) {
            f14 = 90.0f;
        }
        int i16 = c.f177496a[this.f177477b.ordinal()];
        Logger logger = f177473q;
        if (i16 == 1) {
            this.f177486k = -1.0f;
            matrix.postRotate(f14, fCenterX, fCenterY);
            logger.debug("cameraRect = " + rectF + ", viewRect = " + rectF2 + ", rotation = " + f14);
        } else if (i16 == 2) {
            this.f177486k = Math.min(f15 / height, f16 / width);
            matrix.postScale(height / f15, width / f16, fCenterX, fCenterY);
            float f17 = this.f177486k;
            matrix.postScale(f17, f17, fCenterX, fCenterY);
            matrix.postRotate(f14, fCenterX, fCenterY);
            logger.debug("cameraRect = " + rectF + ", viewRect = " + rectF2 + ", rotation = " + f14 + ", scale = " + this.f177486k);
        } else if (i16 == 3) {
            this.f177486k = 1.0f;
            matrix.postScale(height / f15, width / f16, fCenterX, fCenterY);
            matrix.postRotate(f14, fCenterX, fCenterY);
            logger.debug("cameraRect = " + rectF + ", viewRect = " + rectF2 + ", rotation = " + f14 + ", scale = 1");
        } else {
            if (i16 != 4) {
                u0.r();
                return;
            }
            this.f177486k = Math.max(f15 / height, f16 / width);
            matrix.postScale(height / f15, width / f16, fCenterX, fCenterY);
            float f18 = this.f177486k;
            matrix.postScale(f18, f18, fCenterX, fCenterY);
            matrix.postRotate(f14, fCenterX, fCenterY);
            logger.debug("cameraRect = " + rectF + ", viewRect = " + rectF2 + ", rotation = " + f14 + ", scale = " + this.f177486k);
        }
        AutoFitTextureView autoFitTextureView = this.f177480e;
        if (autoFitTextureView != null) {
            autoFitTextureView.setTransform(matrix);
        } else {
            s.m("textureView");
            throw null;
        }
    }

    public final void w6(int i14, int i15) {
        g gVar;
        String str;
        t tVar = this.f177481f;
        int iCheckSelfPermission = a7.b.checkSelfPermission(requireContext(), "android.permission.CAMERA");
        Logger logger = f177473q;
        if (iCheckSelfPermission != 0) {
            logger.warn("Camera permission was not granted.");
            return;
        }
        if (this.f177483h != null) {
            logger.warn("Camera has been opened.");
            return;
        }
        try {
            String[] cameraIdList = ((CameraManager) tVar.getValue()).getCameraIdList();
            int length = cameraIdList.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    str = null;
                    break;
                }
                str = cameraIdList[i16];
                CameraCharacteristics cameraCharacteristics = ((CameraManager) tVar.getValue()).getCameraCharacteristics(str);
                cameraCharacteristics.getClass();
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null && num.intValue() == 1) {
                    break;
                }
                i16++;
            }
            if (str != null) {
                CameraCharacteristics cameraCharacteristics2 = ((CameraManager) tVar.getValue()).getCameraCharacteristics(str);
                cameraCharacteristics2.getClass();
                Object obj = cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                obj.getClass();
                Size[] outputSizes = ((StreamConfigurationMap) obj).getOutputSizes(SurfaceTexture.class);
                outputSizes.getClass();
                this.f177485j = v6(outputSizes, i14, i15, this.f177478c, this.f177479d);
                this.f177482g = str;
            }
        } catch (Throwable th3) {
            logger.error("Failed to set up camera output: " + th3);
        }
        u6(i14, i15);
        Size size = this.f177485j;
        if (size != null && (gVar = this.f177476a) != null) {
            float f14 = this.f177486k;
            gVar.f177510c = size;
            h hVar = gVar.f177512e.get();
            if (hVar != null) {
                hVar.W4(size, f14);
            }
        }
        String str2 = this.f177482g;
        str2.getClass();
        try {
            ((CameraManager) tVar.getValue()).openCamera(str2, new f(), this.f177488m);
        } catch (CameraAccessException e4) {
            g gVar2 = this.f177476a;
            if (gVar2 != null) {
                gVar2.a(e4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lvd2/b$a;", "", "<init>", "()V", "Lch/qos/logback/classic/Logger;", "logger", "Lch/qos/logback/classic/Logger;", "Landroid/util/Size;", "DEFAULT_MIN_CAMERA_RESOLUTION", "Landroid/util/Size;", "DEFAULT_MAX_CAMERA_RESOLUTION", "watch-hand-detecor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(a aVar, g gVar) {
            aVar.getClass();
            gVar.getClass();
            b bVar = new b();
            bVar.f177476a = gVar;
            bVar.f177478c = vd2.f.a(gVar.f177511d);
            return bVar;
        }

        private a() {
        }
    }
}
