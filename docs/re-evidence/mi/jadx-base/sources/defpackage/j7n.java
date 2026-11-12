package defpackage;

import android.graphics.Point;
import com.miui.tsmclient.service.DKFRequestService;

/* JADX INFO: loaded from: classes3.dex */
public class j7n {
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public static void a(rkr rkrVar, Point point) {
        float f;
        float f2;
        int i;
        if (!c(point)) {
            Point point2 = rkrVar.c;
            float f3 = point2.x / (point.x + 0.0f);
            if (f3 >= 0.95f) {
                f2 = point2.y;
                i = point.y;
            } else {
                f = f3;
            }
            if (b(f, 0.0f, 0.4f)) {
                rkrVar.g = DKFRequestService.s0;
                return;
            }
            if (b(f, 0.4f, 0.6f)) {
                rkrVar.g = DKFRequestService.t0;
            } else if (b(f, 0.6f, 0.8f)) {
                rkrVar.g = DKFRequestService.u0;
            } else {
                rkrVar.g = 0;
            }
        }
        f2 = rkrVar.c.x;
        i = point.x;
        f = f2 / (i + 0.0f);
        if (b(f, 0.0f, 0.4f)) {
            rkrVar.g = DKFRequestService.s0;
            return;
        }
        if (b(f, 0.4f, 0.6f)) {
            rkrVar.g = DKFRequestService.t0;
        } else if (b(f, 0.6f, 0.8f)) {
            rkrVar.g = DKFRequestService.u0;
        } else {
            rkrVar.g = 0;
        }
    }

    public static boolean b(float f, float f2, float f3) {
        return f >= f2 && f < f3;
    }

    public static boolean c(Point point) {
        return point.x > point.y;
    }
}
