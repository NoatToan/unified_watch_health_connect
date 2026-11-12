package defpackage;

import com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.generator.WatchFaceClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdt implements ClockColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule
    public WatchFaceClock process(WatchFaceClock watchFaceClock, ColorResult colorResult, List<Integer> list) {
        int iA;
        bdu bduVarE = e(colorResult);
        int i = -1;
        if (bduVarE.c() <= 0.35f) {
            iA = new bdu(bduVarE.d(), bduVarE.e(), bduVarE.c() + 0.4f, bduVarE.b()).a();
        } else if (bduVarE.c() <= 0.7f) {
            iA = bduVarE.a();
        } else {
            iA = new bdu(bduVarE.d(), bduVarE.e(), bduVarE.c() - 0.15f, bduVarE.b()).a();
            i = -16777216;
        }
        watchFaceClock.setColorList(Arrays.asList(Integer.valueOf(iA), Integer.valueOf(i)));
        return watchFaceClock;
    }

    private bdu e(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }
}
