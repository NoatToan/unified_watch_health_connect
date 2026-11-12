package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.MotionPath;

/* JADX INFO: loaded from: classes33.dex */
public class jqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static jqc f38819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f38820b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionPath f38821c;

    public static jqc b() {
        if (f38819a == null) {
            synchronized (f38820b) {
                if (f38819a == null) {
                    f38819a = new jqc();
                }
            }
        }
        return f38819a;
    }

    public void e() {
        this.f38821c = null;
    }
}
