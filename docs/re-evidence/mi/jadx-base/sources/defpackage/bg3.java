package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.WindowManager;
import com.amap.api.maps.utils.SpatialRelationUtil;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f4173b;
    public Point c;

    public bg3(Context context) {
        this.f4172a = context;
    }

    public static Point a(List<Camera.Size> list, Point point) {
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (Camera.Size size : list) {
            int i4 = size.width;
            int i5 = size.height;
            int iAbs = Math.abs(i4 - point.x) + Math.abs(i5 - point.y);
            if (iAbs == 0) {
                i3 = i5;
                i = i4;
                break;
            }
            if (iAbs < i2) {
                i3 = i5;
                i = i4;
                i2 = iAbs;
            }
        }
        if (i <= 0 || i3 <= 0) {
            return null;
        }
        return new Point(i, i3);
    }

    public static Point d(Camera.Parameters parameters, Point point) {
        Point pointA = a(parameters.getSupportedPreviewSizes(), point);
        return pointA == null ? new Point((point.x >> 3) << 3, (point.y >> 3) << 3) : pointA;
    }

    public Point b() {
        return this.f4173b;
    }

    public final int c() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i = 0;
        Camera.getCameraInfo(0, cameraInfo);
        WindowManager windowManager = (WindowManager) this.f4172a.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        return cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i) % SpatialRelationUtil.A_CIRCLE_DEGREE)) % SpatialRelationUtil.A_CIRCLE_DEGREE : ((cameraInfo.orientation - i) + SpatialRelationUtil.A_CIRCLE_DEGREE) % SpatialRelationUtil.A_CIRCLE_DEGREE;
    }

    public void e(Camera camera) {
        Point pointJ = ou1.j(this.f4172a);
        Point point = new Point();
        point.x = pointJ.x;
        point.y = pointJ.y;
        if (ou1.m(this.f4172a)) {
            point.x = pointJ.y;
            point.y = pointJ.x;
        }
        this.c = d(camera.getParameters(), point);
        if (!ou1.m(this.f4172a)) {
            this.f4173b = this.c;
        } else {
            Point point2 = this.c;
            this.f4173b = new Point(point2.y, point2.x);
        }
    }

    public final int[] f(Camera camera, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Integer.MAX_VALUE;
        for (int[] iArr2 : camera.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs = Math.abs(i - iArr2[0]) + Math.abs(i - iArr2[1]);
            if (iAbs < i2) {
                iArr = iArr2;
                i2 = iAbs;
            }
        }
        return iArr;
    }

    public void g(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Point point = this.c;
        parameters.setPreviewSize(point.x, point.y);
        int[] iArrF = f(camera, 60.0f);
        if (iArrF != null) {
            parameters.setPreviewFpsRange(iArrF[0], iArrF[1]);
        }
        camera.setDisplayOrientation(c());
        camera.setParameters(parameters);
    }
}
