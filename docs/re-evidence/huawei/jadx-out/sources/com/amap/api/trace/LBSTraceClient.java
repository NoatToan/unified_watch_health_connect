package com.amap.api.trace;

import android.content.Context;
import com.amap.api.col.p0003sl.eb;
import com.amap.api.col.p0003sl.ih;
import com.amap.api.col.p0003sl.iu;
import com.amap.api.col.p0003sl.iv;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LBSTraceClient {
    public static final String LOCATE_TIMEOUT_ERROR = "定位超时";
    public static final String MIN_GRASP_POINT_ERROR = "轨迹点太少或距离太近,轨迹纠偏失败";
    public static final String TRACE_SUCCESS = "纠偏成功";
    public static final int TYPE_AMAP = 1;
    public static final int TYPE_BAIDU = 3;
    public static final int TYPE_GPS = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LBSTraceBase f3895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile LBSTraceClient f3896b;

    public LBSTraceClient(Context context) throws Exception {
        a(context);
    }

    private LBSTraceClient() {
    }

    public static LBSTraceClient getInstance(Context context) throws Exception {
        if (f3896b == null) {
            synchronized (LBSTraceClient.class) {
                if (f3896b == null) {
                    a(context);
                    f3896b = new LBSTraceClient();
                }
            }
        }
        return f3896b;
    }

    private static void a(Context context) throws Exception {
        iv ivVarA = iu.a(context, eb.a());
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new Exception(ivVarA.f2836b);
        }
        if (context != null) {
            f3895a = new ih(context.getApplicationContext());
        }
    }

    public void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        LBSTraceBase lBSTraceBase = f3895a;
        if (lBSTraceBase != null) {
            lBSTraceBase.queryProcessedTrace(i, list, i2, traceListener);
        }
    }

    public void startTrace(TraceStatusListener traceStatusListener) {
        LBSTraceBase lBSTraceBase = f3895a;
        if (lBSTraceBase != null) {
            lBSTraceBase.startTrace(traceStatusListener);
        }
    }

    public void stopTrace() {
        LBSTraceBase lBSTraceBase = f3895a;
        if (lBSTraceBase != null) {
            lBSTraceBase.stopTrace();
        }
    }

    public void destroy() {
        LBSTraceBase lBSTraceBase = f3895a;
        if (lBSTraceBase != null) {
            lBSTraceBase.destroy();
            a();
        }
    }

    private static void a() {
        f3895a = null;
        f3896b = null;
    }
}
