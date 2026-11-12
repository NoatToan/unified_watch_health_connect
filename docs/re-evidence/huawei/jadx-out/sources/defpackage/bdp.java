package defpackage;

import com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.generator.WatchFaceClock;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdp implements ClockColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule
    public WatchFaceClock process(WatchFaceClock watchFaceClock, ColorResult colorResult, List<Integer> list) {
        if (d(colorResult).c() <= 0.7f) {
            watchFaceClock.setColorList(Collections.singletonList(-1));
            return watchFaceClock;
        }
        watchFaceClock.setColorList(Collections.singletonList(-16777216));
        return watchFaceClock;
    }

    private bdu d(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }
}
