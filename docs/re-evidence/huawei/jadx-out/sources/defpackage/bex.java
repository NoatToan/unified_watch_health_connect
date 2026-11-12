package defpackage;

import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public class bex implements ColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule
    public ColorResult process(ColorResult colorResult) {
        bdu bduVarD = d(colorResult);
        bdu bduVarD2 = d(bduVarD);
        bdu bduVarE = e(bduVarD);
        ColorResult colorResult2 = new ColorResult();
        colorResult2.setMainColors(Arrays.asList(bduVarD2, bduVarE));
        colorResult2.setMainGradients(Arrays.asList(bduVarD2, bduVarE));
        Log.i("DigitalWatchFaceColorRule", "result: " + colorResult2.getMainColors());
        return colorResult2;
    }

    private bdu d(ColorResult colorResult) {
        return bgf.b(colorResult.getMainColors());
    }

    private bdu d(bdu bduVar) {
        return (bduVar.c() <= 0.35f || bduVar.c() > 0.7f) ? bduVar : new bdu(-16777216, bduVar.b());
    }

    private bdu e(bdu bduVar) {
        if (bduVar.c() <= 0.35f) {
            return new bdu(bduVar.d(), bduVar.e(), bduVar.c() + 0.4f, bduVar.b());
        }
        return bduVar.c() <= 0.7f ? bduVar : new bdu(-16777216, bduVar.b());
    }
}
