package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import com.miui.tsmclient.service.DKFRequestService;

/* JADX INFO: loaded from: classes3.dex */
public class ssk {
    public static rsk a(Context context, rkr rkrVar) {
        return tsk.a().b(context, f(context, rkrVar));
    }

    public static rsk b(Context context, rkr rkrVar, Configuration configuration) {
        return tsk.a().b(context, g(configuration, rkrVar));
    }

    public static int c(int i, int i2) {
        if (i <= 640) {
            return 1;
        }
        if (i >= 960) {
            return 3;
        }
        return i2 > 550 ? 2 : 1;
    }

    public static int d(int i) {
        if (i == 0) {
            return DKFRequestService.x0;
        }
        switch (i) {
            case DKFRequestService.s0 /* 4097 */:
                return DKFRequestService.s0;
            case DKFRequestService.t0 /* 4098 */:
                return DKFRequestService.t0;
            case DKFRequestService.u0 /* 4099 */:
                return 4100;
            default:
                switch (i) {
                    case 8192:
                        return 8192;
                    case 8193:
                        return 8193;
                    case 8194:
                        return 8194;
                    case 8195:
                        return 8195;
                    case 8196:
                        return 8196;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown window mode for : ");
                        sb.append(Integer.toHexString(i));
                        return DKFRequestService.x0;
                }
        }
    }

    public static rsk.a e(rkr rkrVar, float f) {
        rsk.a aVar = new rsk.a();
        Point point = rkrVar.c;
        aVar.c = point.x;
        aVar.d = point.y;
        Point point2 = rkrVar.d;
        aVar.e = point2.x;
        aVar.f = point2.y;
        aVar.f32865a = rkrVar.f;
        aVar.f32866b = d(rkrVar.g);
        aVar.g = rkrVar.e;
        return aVar;
    }

    public static rsk.a f(Context context, rkr rkrVar) {
        return e(rkrVar, context.getResources().getDisplayMetrics().density);
    }

    public static rsk.a g(Configuration configuration, rkr rkrVar) {
        return e(rkrVar, configuration.densityDpi / 160.0f);
    }
}
