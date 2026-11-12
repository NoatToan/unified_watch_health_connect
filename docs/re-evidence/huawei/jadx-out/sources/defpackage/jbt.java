package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.MotionPath;

/* JADX INFO: loaded from: classes10.dex */
public class jbt extends jbv {
    private static final long serialVersionUID = 4241032565572435995L;
    private MotionPath e;

    public jbt(jbv jbvVar, MotionPath motionPath) {
        if (jbvVar != null) {
            e(jbvVar.d());
            a(jbvVar.b());
            d(jbvVar.e());
            e(motionPath);
        }
    }

    public MotionPath c() {
        return this.e;
    }

    private void e(MotionPath motionPath) {
        this.e = motionPath;
    }
}
