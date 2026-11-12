package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class tg3 implements lg3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice f34666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34667b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f34668a;

        public a(Handler handler) {
            this.f34668a = handler;
        }
    }

    public tg3(CameraDevice cameraDevice, Object obj) {
        this.f34666a = (CameraDevice) g6i.g(cameraDevice);
        this.f34667b = obj;
    }

    public static void b(CameraDevice cameraDevice, List<jeh> list) {
        String id = cameraDevice.getId();
        Iterator<jeh> it = list.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (strA != null && !strA.isEmpty()) {
                zpe.k("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + strA + ". Ignoring.");
            }
        }
    }

    public static void c(CameraDevice cameraDevice, pyl pylVar) {
        g6i.g(cameraDevice);
        g6i.g(pylVar);
        g6i.g(pylVar.e());
        List<jeh> listC = pylVar.c();
        if (listC == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (pylVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        b(cameraDevice, listC);
    }

    public static List<Surface> d(List<jeh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<jeh> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        return arrayList;
    }
}
