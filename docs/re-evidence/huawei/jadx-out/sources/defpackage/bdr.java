package defpackage;

import com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.generator.WatchFaceClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bdr implements ClockColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.clock.ClockColorRule
    public WatchFaceClock process(WatchFaceClock watchFaceClock, ColorResult colorResult, List<Integer> list) {
        int iA;
        int iA2;
        bdu bduVarA = a(colorResult);
        if (bduVarA.c() <= 0.35f) {
            iA = new bdu(bduVarA.d(), bduVarA.e(), bduVarA.c() + 0.4f, bduVarA.b()).a();
            iA2 = -1;
        } else if (bduVarA.c() <= 0.7f) {
            iA2 = bduVarA.a();
            iA = bduVarA.a();
        } else {
            iA = -16777216;
            iA2 = -16777216;
        }
        watchFaceClock.setColorList(Arrays.asList(Integer.valueOf(iA2), Integer.valueOf(iA)));
        return watchFaceClock;
    }

    private bdu a(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }
}
