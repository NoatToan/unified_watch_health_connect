package defpackage;

import android.graphics.Color;
import com.huawei.healthcloud.plugintrack.trackanimation.dynamiccurve.auxiliary.CurveColorControl;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jeu extends CurveColorControl {
    private static final int[] e = {Color.argb(76, 120, 226, 228), Color.argb(255, 120, 226, 228), Color.argb(255, 120, 226, 228)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f38506a = {Color.argb(51, 255, 255, 255), Color.argb(0, 255, 255, 255)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f38507c = {Color.argb(255, 120, 226, 228), Color.argb(0, 120, 226, 228)};
    private static final int d = Color.argb(255, 120, 226, 228);

    public jeu() {
        this.mRunCurveColor = e;
        this.mRunFillingColor = f38506a;
        this.mRunLineColor = f38507c;
        this.mRunCircleColor = d;
        LogUtil.a("Track_AltitudeCurveColor", "init altitude curve");
    }
}
