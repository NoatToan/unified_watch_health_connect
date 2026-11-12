package com.amap.api.trace;

import android.content.Context;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.y0;
import defpackage.a0t;
import defpackage.zns;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LBSTraceClient {
    public static final String LOCATE_TIMEOUT_ERROR = "定位超时";
    public static final String MIN_GRASP_POINT_ERROR = "轨迹点太少或距离太近,轨迹纠偏失败";
    public static final String TRACE_SUCCESS = "纠偏成功";
    public static final int TYPE_AMAP = 1;
    public static final int TYPE_BAIDU = 3;
    public static final int TYPE_GPS = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LBSTraceBase f6814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile LBSTraceClient f6815b;

    public LBSTraceClient(Context context) throws Exception {
        a(context);
    }

    private static void a(Context context) throws Exception {
        y0 y0VarA = iu.a(context, zns.t());
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            throw new Exception(y0VarA.f6353b);
        }
        if (context != null) {
            f6814a = new a0t(context.getApplicationContext());
        }
    }

    public static LBSTraceClient getInstance(Context context) throws Exception {
        if (f6815b == null) {
            synchronized (LBSTraceClient.class) {
                try {
                    if (f6815b == null) {
                        a(context);
                        f6815b = new LBSTraceClient();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6815b;
    }

    public void destroy() {
        LBSTraceBase lBSTraceBase = f6814a;
        if (lBSTraceBase != null) {
            lBSTraceBase.destroy();
            a();
        }
    }

    public void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        LBSTraceBase lBSTraceBase = f6814a;
        if (lBSTraceBase != null) {
            lBSTraceBase.queryProcessedTrace(i, list, i2, traceListener);
        }
    }

    public void startTrace(TraceStatusListener traceStatusListener) {
        LBSTraceBase lBSTraceBase = f6814a;
        if (lBSTraceBase != null) {
            lBSTraceBase.startTrace(traceStatusListener);
        }
    }

    public void stopTrace() {
        LBSTraceBase lBSTraceBase = f6814a;
        if (lBSTraceBase != null) {
            lBSTraceBase.stopTrace();
        }
    }

    private LBSTraceClient() {
    }

    private static void a() {
        f6814a = null;
        f6815b = null;
    }
}
