package defpackage;

import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class bev implements ColorRule {
    private bdu b(bdu bduVar) {
        return bduVar;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule
    public ColorResult process(ColorResult colorResult) {
        bdu bduVarD = d(colorResult);
        bdu bduVarB = b(bduVarD);
        bdu bduVarE = e(bduVarD);
        ColorResult colorResult2 = new ColorResult();
        colorResult2.setMainColors(Arrays.asList(bduVarB, bduVarE));
        colorResult2.setMainGradients(Arrays.asList(bduVarB, bduVarE));
        return colorResult2;
    }

    private bdu d(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }

    private bdu e(bdu bduVar) {
        if (bduVar.c() <= 0.7f) {
            return new bdu(-1, bduVar.b());
        }
        return new bdu(-16777216, bduVar.b());
    }
}
