package defpackage;

import com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.generator.WatchFaceClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdv implements ClockColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule
    public WatchFaceClock process(WatchFaceClock watchFaceClock, ColorResult colorResult, List<Integer> list) {
        int iA;
        int iA2;
        bdu bduVarC = c(colorResult);
        if (bduVarC.c() <= 0.35f) {
            iA = new bdu(bduVarC.d(), bduVarC.e(), bduVarC.c() + 0.4f, bduVarC.b()).a();
            iA2 = -1;
        } else if (bduVarC.c() <= 0.7f) {
            iA2 = bduVarC.a();
            iA = bduVarC.a();
        } else {
            iA = -16777216;
            iA2 = -16777216;
        }
        watchFaceClock.setColorList(Arrays.asList(Integer.valueOf(iA2), Integer.valueOf(iA), Integer.valueOf(iA2)));
        return watchFaceClock;
    }

    private bdu c(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }
}
