package defpackage;

import android.content.Context;
import com.huawei.wearengine.client.ServiceConnectionListener;

/* JADX INFO: loaded from: classes20.dex */
public final class yhw {
    public static yje c(Context context) {
        yir.d(context, "Context must not be null!");
        ylx.d(context);
        return yje.d();
    }

    public static ykb d(Context context) {
        yir.d(context, "Context must not be null!");
        ylx.d(context);
        return ykb.d();
    }

    public static yhy b(Context context) {
        yir.d(context, "Context must not be null!");
        ylx.d(context);
        return yhy.c();
    }

    public static yjj e(Context context) {
        yir.d(context, "Context must not be null!");
        ylx.d(context);
        return yjj.d();
    }

    public static yjw a(Context context) {
        yir.d(context, "Context must not be null!");
        ylx.d(context);
        return yjw.d();
    }

    public static yim c(Context context, ServiceConnectionListener serviceConnectionListener) {
        yir.d(context, "Context must not be null!");
        yir.d(serviceConnectionListener, "Listener must not be null!");
        ylx.d(context);
        return yim.c(serviceConnectionListener);
    }
}
