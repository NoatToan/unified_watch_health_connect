package u;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.h;
import androidx.camera.camera2.internal.compat.q;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.l2;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import v.v0;
import w.d;
import w0.e;
import w0.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lu/c;", "Le0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "cameraId", "Landroidx/camera/camera2/internal/compat/q;", "cameraManagerCompat", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/camera/camera2/internal/compat/q;)V", "a", "c", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements e0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f167310k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f167311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f167312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f167313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f167314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f167315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f167316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f167317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f167318j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"u/c$b", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.getClass();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.getClass();
        }
    }

    static {
        new C3145c(null);
        f167310k = new b();
    }

    public c(Context context, String str, q qVar) {
        context.getClass();
        str.getClass();
        qVar.getClass();
        this.f167311c = context;
        this.f167312d = str;
        this.f167313e = qVar;
        final int i14 = 3;
        this.f167314f = m.b(new e23.a(this) { // from class: u.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f167309b;

            {
                this.f167309b = this;
            }

            @Override // e23.a
            public final Object invoke() throws CameraUnavailableException {
                int i15 = i14;
                Boolean bool = null;
                c cVar = this.f167309b;
                switch (i15) {
                    case 0:
                        c.b bVar = c.f167310k;
                        try {
                            return cVar.f167313e.b(cVar.f167312d);
                        } catch (CameraAccessExceptionCompat e4) {
                            throw v0.a(e4);
                        }
                    case 1:
                        d dVarA = d.a((h) cVar.f167316h.getValue());
                        dVarA.getClass();
                        k7.h.f(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
                        return dVarA.f180963a.c();
                    case 2:
                        Context context2 = cVar.f167311c;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                p005kotlin.jvm.internal.b bVar2 = new p005kotlin.jvm.internal.b(serviceInfoArr);
                                while (bVar2.hasNext()) {
                                    Bundle bundle = ((ServiceInfo) bVar2.next()).metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(s.g(bool, Boolean.FALSE));
                    case 3:
                        e eVar = new e(cVar.f167311c);
                        String str2 = cVar.f167312d;
                        ArrayList arrayList = new ArrayList();
                        f fVar = eVar.f180994a;
                        if (fVar != null) {
                            arrayList.add(fVar.a(str2));
                        }
                        w0.c cVar2 = eVar.f180995b;
                        if (cVar2 != null) {
                            try {
                                arrayList.add(cVar2.a(str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    default:
                        q qVar2 = cVar.f167313e;
                        CameraManager cameraManager = ((u) qVar2.f5368a).f5409a;
                        String str3 = cVar.f167312d;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((u) qVar2.f5368a).f5409a.getCameraDeviceSetup(str3);
                        }
                        return null;
                }
            }
        });
        final int i15 = 4;
        this.f167315g = m.b(new e23.a(this) { // from class: u.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f167309b;

            {
                this.f167309b = this;
            }

            @Override // e23.a
            public final Object invoke() throws CameraUnavailableException {
                int i16 = i15;
                Boolean bool = null;
                c cVar = this.f167309b;
                switch (i16) {
                    case 0:
                        c.b bVar = c.f167310k;
                        try {
                            return cVar.f167313e.b(cVar.f167312d);
                        } catch (CameraAccessExceptionCompat e4) {
                            throw v0.a(e4);
                        }
                    case 1:
                        d dVarA = d.a((h) cVar.f167316h.getValue());
                        dVarA.getClass();
                        k7.h.f(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
                        return dVarA.f180963a.c();
                    case 2:
                        Context context2 = cVar.f167311c;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                p005kotlin.jvm.internal.b bVar2 = new p005kotlin.jvm.internal.b(serviceInfoArr);
                                while (bVar2.hasNext()) {
                                    Bundle bundle = ((ServiceInfo) bVar2.next()).metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(s.g(bool, Boolean.FALSE));
                    case 3:
                        e eVar = new e(cVar.f167311c);
                        String str2 = cVar.f167312d;
                        ArrayList arrayList = new ArrayList();
                        f fVar = eVar.f180994a;
                        if (fVar != null) {
                            arrayList.add(fVar.a(str2));
                        }
                        w0.c cVar2 = eVar.f180995b;
                        if (cVar2 != null) {
                            try {
                                arrayList.add(cVar2.a(str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    default:
                        q qVar2 = cVar.f167313e;
                        CameraManager cameraManager = ((u) qVar2.f5368a).f5409a;
                        String str3 = cVar.f167312d;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((u) qVar2.f5368a).f5409a.getCameraDeviceSetup(str3);
                        }
                        return null;
                }
            }
        });
        final int i16 = 0;
        this.f167316h = m.b(new e23.a(this) { // from class: u.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f167309b;

            {
                this.f167309b = this;
            }

            @Override // e23.a
            public final Object invoke() throws CameraUnavailableException {
                int i17 = i16;
                Boolean bool = null;
                c cVar = this.f167309b;
                switch (i17) {
                    case 0:
                        c.b bVar = c.f167310k;
                        try {
                            return cVar.f167313e.b(cVar.f167312d);
                        } catch (CameraAccessExceptionCompat e4) {
                            throw v0.a(e4);
                        }
                    case 1:
                        d dVarA = d.a((h) cVar.f167316h.getValue());
                        dVarA.getClass();
                        k7.h.f(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
                        return dVarA.f180963a.c();
                    case 2:
                        Context context2 = cVar.f167311c;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                p005kotlin.jvm.internal.b bVar2 = new p005kotlin.jvm.internal.b(serviceInfoArr);
                                while (bVar2.hasNext()) {
                                    Bundle bundle = ((ServiceInfo) bVar2.next()).metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(s.g(bool, Boolean.FALSE));
                    case 3:
                        e eVar = new e(cVar.f167311c);
                        String str2 = cVar.f167312d;
                        ArrayList arrayList = new ArrayList();
                        f fVar = eVar.f180994a;
                        if (fVar != null) {
                            arrayList.add(fVar.a(str2));
                        }
                        w0.c cVar2 = eVar.f180995b;
                        if (cVar2 != null) {
                            try {
                                arrayList.add(cVar2.a(str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    default:
                        q qVar2 = cVar.f167313e;
                        CameraManager cameraManager = ((u) qVar2.f5368a).f5409a;
                        String str3 = cVar.f167312d;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((u) qVar2.f5368a).f5409a.getCameraDeviceSetup(str3);
                        }
                        return null;
                }
            }
        });
        final int i17 = 1;
        this.f167317i = m.b(new e23.a(this) { // from class: u.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f167309b;

            {
                this.f167309b = this;
            }

            @Override // e23.a
            public final Object invoke() throws CameraUnavailableException {
                int i18 = i17;
                Boolean bool = null;
                c cVar = this.f167309b;
                switch (i18) {
                    case 0:
                        c.b bVar = c.f167310k;
                        try {
                            return cVar.f167313e.b(cVar.f167312d);
                        } catch (CameraAccessExceptionCompat e4) {
                            throw v0.a(e4);
                        }
                    case 1:
                        d dVarA = d.a((h) cVar.f167316h.getValue());
                        dVarA.getClass();
                        k7.h.f(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
                        return dVarA.f180963a.c();
                    case 2:
                        Context context2 = cVar.f167311c;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                p005kotlin.jvm.internal.b bVar2 = new p005kotlin.jvm.internal.b(serviceInfoArr);
                                while (bVar2.hasNext()) {
                                    Bundle bundle = ((ServiceInfo) bVar2.next()).metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(s.g(bool, Boolean.FALSE));
                    case 3:
                        e eVar = new e(cVar.f167311c);
                        String str2 = cVar.f167312d;
                        ArrayList arrayList = new ArrayList();
                        f fVar = eVar.f180994a;
                        if (fVar != null) {
                            arrayList.add(fVar.a(str2));
                        }
                        w0.c cVar2 = eVar.f180995b;
                        if (cVar2 != null) {
                            try {
                                arrayList.add(cVar2.a(str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    default:
                        q qVar2 = cVar.f167313e;
                        CameraManager cameraManager = ((u) qVar2.f5368a).f5409a;
                        String str3 = cVar.f167312d;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((u) qVar2.f5368a).f5409a.getCameraDeviceSetup(str3);
                        }
                        return null;
                }
            }
        });
        final int i18 = 2;
        this.f167318j = m.b(new e23.a(this) { // from class: u.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f167309b;

            {
                this.f167309b = this;
            }

            @Override // e23.a
            public final Object invoke() throws CameraUnavailableException {
                int i19 = i18;
                Boolean bool = null;
                c cVar = this.f167309b;
                switch (i19) {
                    case 0:
                        c.b bVar = c.f167310k;
                        try {
                            return cVar.f167313e.b(cVar.f167312d);
                        } catch (CameraAccessExceptionCompat e4) {
                            throw v0.a(e4);
                        }
                    case 1:
                        d dVarA = d.a((h) cVar.f167316h.getValue());
                        dVarA.getClass();
                        k7.h.f(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
                        return dVarA.f180963a.c();
                    case 2:
                        Context context2 = cVar.f167311c;
                        try {
                            ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                            if (serviceInfoArr == null) {
                                bool = Boolean.FALSE;
                            } else {
                                p005kotlin.jvm.internal.b bVar2 = new p005kotlin.jvm.internal.b(serviceInfoArr);
                                while (bVar2.hasNext()) {
                                    Bundle bundle = ((ServiceInfo) bVar2.next()).metaData;
                                    if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        return Boolean.valueOf(s.g(bool, Boolean.FALSE));
                    case 3:
                        e eVar = new e(cVar.f167311c);
                        String str2 = cVar.f167312d;
                        ArrayList arrayList = new ArrayList();
                        f fVar = eVar.f180994a;
                        if (fVar != null) {
                            arrayList.add(fVar.a(str2));
                        }
                        w0.c cVar2 = eVar.f180995b;
                        if (cVar2 != null) {
                            try {
                                arrayList.add(cVar2.a(str2));
                                break;
                            } catch (UnsupportedOperationException unused2) {
                            }
                        }
                        return new w0.a(arrayList);
                    default:
                        q qVar2 = cVar.f167313e;
                        CameraManager cameraManager = ((u) qVar2.f5368a).f5409a;
                        String str3 = cVar.f167312d;
                        if (cameraManager.isCameraDeviceSetupSupported(str3)) {
                            return ((u) qVar2.f5368a).f5409a.getCameraDeviceSetup(str3);
                        }
                        return null;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e0.a
    public final boolean a(l2 l2Var) throws Exception {
        boolean zIsTerminated;
        long j8;
        a aVar;
        DynamicRangeProfiles dynamicRangeProfilesA;
        OutputConfiguration outputConfigurationG;
        androidx.camera.core.impl.v0 v0Var = l2Var.f5608g;
        List<l2.f> list = l2Var.f5602a;
        list.getClass();
        ArrayList<AutoCloseable> arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            int i14 = 2;
            ImageReader imageReader = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((a) it3.next()).f167319a);
                }
                SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList2, k0.b.a(), f167310k);
                CameraDevice.CameraDeviceSetup cameraDeviceSetupD = androidx.camera.camera2.internal.compat.f.d(this.f167315g.getValue());
                if (cameraDeviceSetupD == null) {
                    sessionConfiguration = null;
                } else {
                    CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetupD.createCaptureRequest(v0Var.f5815c);
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, v0Var.a());
                    if (v0Var.c() == 2) {
                        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
                    }
                    sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
                }
                if (sessionConfiguration == null) {
                    return false;
                }
                int i15 = ((w0.d) this.f167314f.getValue()).a(sessionConfiguration).f180993a;
                new StringBuilder("fpsRange=").append(v0Var.a());
                new StringBuilder(", previewStabilizationMode=").append(v0Var.c());
                int i16 = 0;
                for (Object obj : list) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        x.q();
                        throw null;
                    }
                    l2.f fVar = (l2.f) obj;
                    StringBuilder sb3 = new StringBuilder("{format=");
                    sb3.append(fVar.f().f5475i);
                    sb3.append(", size=");
                    sb3.append(fVar.f().f5474h);
                    sb3.append(", dynamicRange=");
                    sb3.append(fVar.b());
                    sb3.append(", class=");
                    sb3.append(fVar.f().f5476j);
                    sb3.append(CoreConstants.CURLY_RIGHT);
                    i16 = i17;
                }
                boolean z14 = i15 == 1;
                for (AutoCloseable autoCloseable : arrayList) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            Object[] objArr = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (objArr == false) {
                                        executorService.shutdownNow();
                                        objArr = true;
                                    }
                                }
                            }
                            if (objArr != false) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else {
                        if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                            vb.h.w();
                            return false;
                        }
                        ((MediaMetadataRetriever) autoCloseable).release();
                    }
                }
                return z14;
            }
            l2.f fVar2 = (l2.f) it.next();
            if (((Boolean) this.f167318j.getValue()).booleanValue()) {
                fVar2.getClass();
                Class<?> cls = fVar2.f().f5476j;
                Objects.toString(fVar2.f().f5476j);
                if (cls != null) {
                    Size size = fVar2.f().f5474h;
                    if (size == null) {
                        vb.h.s("Required value was null.");
                        return false;
                    }
                    outputConfigurationG = new OutputConfiguration(size, cls);
                } else {
                    outputConfigurationG = androidx.camera.camera2.internal.compat.f.g(fVar2.f().f5474h, fVar2.f().f5475i);
                }
                aVar = new a(outputConfigurationG, imageReader, i14, null == true ? 1 : 0);
            } else {
                fVar2.getClass();
                Class<?> cls2 = fVar2.f().f5476j;
                if (s.g(cls2, MediaCodec.class)) {
                    j8 = PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                } else if (s.g(cls2, SurfaceHolder.class)) {
                    j8 = 2048;
                } else {
                    j8 = s.g(cls2, SurfaceTexture.class) ? 256L : 0L;
                }
                Objects.toString(fVar2.f().f5476j);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar2.f().f5474h.getWidth(), fVar2.f().f5474h.getHeight(), fVar2.f().f5475i, 1, j8);
                imageReaderNewInstance.getClass();
                aVar = new a(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
            }
            if (fVar2.f().f5476j != null && (dynamicRangeProfilesA = tr2.a.a(this.f167317i.getValue())) != null) {
                Long lA = w.c.a(fVar2.b(), dynamicRangeProfilesA);
                if (lA == null) {
                    vb.h.s("Required value was null.");
                    return false;
                }
                aVar.f167319a.setDynamicRangeProfile(lA.longValue());
            }
            arrayList.add(aVar);
        }
    }

    /* JADX INFO: renamed from: u.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lu/c$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "u/c$b", "NO_OP_CALLBACK", "Lu/c$b;", "FCQ_PLAY_SERVICES_IMPL_KEY", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C3145c {
        public /* synthetic */ C3145c(j jVar) {
            this();
        }

        private C3145c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu/c$a;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroid/hardware/camera2/params/OutputConfiguration;", "value", "Landroid/media/ImageReader;", "backingImageReader", "<init>", "(Landroid/hardware/camera2/params/OutputConfiguration;Landroid/media/ImageReader;)V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f167319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageReader f167320b;

        public a(OutputConfiguration outputConfiguration, ImageReader imageReader) {
            outputConfiguration.getClass();
            this.f167319a = outputConfiguration;
            this.f167320b = imageReader;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            ImageReader imageReader = this.f167320b;
            if (imageReader != null) {
                imageReader.close();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f167319a, aVar.f167319a) && s.g(this.f167320b, aVar.f167320b);
        }

        public final int hashCode() {
            int iHashCode = this.f167319a.hashCode() * 31;
            ImageReader imageReader = this.f167320b;
            return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
        }

        public final String toString() {
            return "CloseableOutputConfiguration(value=" + this.f167319a + ", backingImageReader=" + this.f167320b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(OutputConfiguration outputConfiguration, ImageReader imageReader, int i14, j jVar) {
            this(outputConfiguration, (i14 & 2) != 0 ? null : imageReader);
        }
    }
}
