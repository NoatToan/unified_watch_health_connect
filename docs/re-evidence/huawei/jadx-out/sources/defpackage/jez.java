package defpackage;

import android.graphics.Color;
import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.healthcloud.plugintrack.trackanimation.dynamiccurve.auxiliary.CurveColorControl;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jez extends CurveColorControl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f38518b = {Color.argb(76, 255, PsExtractor.PRIVATE_STREAM_1, 0), Color.argb(255, 255, PsExtractor.PRIVATE_STREAM_1, 0), Color.argb(255, 255, PsExtractor.PRIVATE_STREAM_1, 0)};
    private static final int[] d = {Color.argb(51, 255, 255, 255), Color.argb(0, 255, 255, 255)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f38517a = {Color.argb(255, 255, PsExtractor.PRIVATE_STREAM_1, 0), Color.argb(0, 255, PsExtractor.PRIVATE_STREAM_1, 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f38519c = Color.argb(255, 255, PsExtractor.PRIVATE_STREAM_1, 0);

    public jez() {
        this.mRunCurveColor = f38518b;
        this.mRunFillingColor = d;
        this.mRunLineColor = f38517a;
        this.mRunCircleColor = f38519c;
        LogUtil.a("Track_StepRateCurveColor", "init step rate curve");
    }
}
