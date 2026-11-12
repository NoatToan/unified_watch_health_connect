package defpackage;

import com.huawei.ads.adsrec.ICABackFlowCallback;
import com.huawei.ads.adsrec.IDsRelationCallback;
import com.huawei.ads.adsrec.IEventReportCallback;
import com.huawei.ads.adsrec.IUtilCallback;

/* JADX INFO: loaded from: classes4.dex */
public class awz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile IDsRelationCallback f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ICABackFlowCallback f729b;
    private static volatile IUtilCallback d;
    private static volatile IEventReportCallback e;

    public static void d(IUtilCallback iUtilCallback) {
        d = iUtilCallback;
    }

    public static void e(IEventReportCallback iEventReportCallback) {
        e = iEventReportCallback;
    }

    public static IUtilCallback c() {
        return d;
    }

    public static ICABackFlowCallback b() {
        return f729b;
    }

    public static IEventReportCallback d() {
        return e;
    }

    public static IDsRelationCallback a() {
        return f728a;
    }
}
