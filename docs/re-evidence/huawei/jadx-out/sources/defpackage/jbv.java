package defpackage;

import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class jbv implements Serializable {
    private static final long serialVersionUID = 6734716191747388003L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MotionPathSimplify f38361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38362c;
    private RelativeSportData d;

    public RelativeSportData e() {
        return this.d;
    }

    public void d(RelativeSportData relativeSportData) {
        this.d = relativeSportData;
    }

    public String d() {
        return this.f38362c;
    }

    public void e(String str) {
        this.f38362c = str;
    }

    public MotionPathSimplify b() {
        return this.f38361b;
    }

    public void a(MotionPathSimplify motionPathSimplify) {
        this.f38361b = motionPathSimplify;
    }
}
