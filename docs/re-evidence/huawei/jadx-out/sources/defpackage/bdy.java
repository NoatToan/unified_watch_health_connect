package defpackage;

import androidx.core.graphics.ColorUtils;
import com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.generator.WatchFaceClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdy implements ClockColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule
    public WatchFaceClock process(WatchFaceClock watchFaceClock, ColorResult colorResult, List<Integer> list) {
        double[] dArr = new double[3];
        ColorUtils.colorToLAB(colorResult.getMainColors().get(0).a(), dArr);
        double d = dArr[0];
        if (d < 50.0d) {
            int iLABToColor = ColorUtils.LABToColor(d > 40.0d ? d - 40.0d : 0.0d, dArr[1], dArr[2]);
            watchFaceClock.setColor(iLABToColor, -1);
            watchFaceClock.setColorList(Arrays.asList(Integer.valueOf(iLABToColor), -1));
            return watchFaceClock;
        }
        int iLABToColor2 = ColorUtils.LABToColor(d > 60.0d ? 100.0d : d + 40.0d, dArr[1], dArr[2]);
        watchFaceClock.setColor(iLABToColor2, -16777216);
        watchFaceClock.setColorList(Arrays.asList(Integer.valueOf(iLABToColor2), -16777216));
        return watchFaceClock;
    }
}
