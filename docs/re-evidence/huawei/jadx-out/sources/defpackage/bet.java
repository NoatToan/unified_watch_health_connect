package defpackage;

import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule;
import java.util.Collections;

/* JADX INFO: loaded from: classes23.dex */
public class bet implements ColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule
    public ColorResult process(ColorResult colorResult) {
        bdu bduVarA = a(c(colorResult));
        ColorResult colorResult2 = new ColorResult();
        colorResult2.setMainColors(Collections.singletonList(bduVarA));
        colorResult2.setMainGradients(Collections.singletonList(bduVarA));
        return colorResult2;
    }

    private bdu c(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }

    private bdu a(bdu bduVar) {
        return bduVar.c() <= 0.7f ? new bdu(-16777216, bduVar.b()) : bduVar;
    }
}
