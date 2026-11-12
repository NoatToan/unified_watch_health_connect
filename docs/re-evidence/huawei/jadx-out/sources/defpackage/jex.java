package defpackage;

import android.graphics.Color;
import com.huawei.healthcloud.plugintrack.trackanimation.dynamiccurve.auxiliary.CurveColorControl;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jex extends CurveColorControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f38514b = {Color.argb(76, 0, a.A, 38), Color.argb(255, 0, a.A, 38), Color.argb(255, 0, a.A, 38)};
    private static final int[] d = {Color.argb(51, 255, 255, 255), Color.argb(0, 255, 255, 255)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f38515c = {Color.argb(255, 0, a.A, 38), Color.argb(0, 0, a.A, 38)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f38513a = Color.argb(255, 0, a.A, 38);

    public jex() {
        this.mRunCurveColor = f38514b;
        this.mRunFillingColor = d;
        this.mRunLineColor = f38515c;
        this.mRunCircleColor = f38513a;
        LogUtil.a("Track_SpeedCurveColor", "init speed curve");
    }
}
