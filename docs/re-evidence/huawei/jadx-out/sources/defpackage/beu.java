package defpackage;

import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class beu implements ColorRule {
    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule
    public ColorResult process(ColorResult colorResult) {
        ColorResult colorResult2 = new ColorResult(colorResult);
        if (e(colorResult2)) {
            c(colorResult2);
        }
        if (d(colorResult2)) {
            a(colorResult2);
        }
        Log.i("FlowerColorRule", "input: " + colorResult);
        Log.i("FlowerColorRule", "output: " + colorResult2);
        return colorResult2;
    }

    private boolean e(ColorResult colorResult) {
        Iterator<bdu> it = colorResult.getMainColors().iterator();
        while (it.hasNext()) {
            if (a(it.next())) {
                return true;
            }
        }
        Iterator<bdu> it2 = colorResult.getAdditionalColors().iterator();
        while (it2.hasNext()) {
            if (a(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean d(ColorResult colorResult) {
        Iterator<bdu> it = colorResult.getMainColors().iterator();
        while (it.hasNext()) {
            if (e(it.next())) {
                return true;
            }
        }
        Iterator<bdu> it2 = colorResult.getAdditionalColors().iterator();
        while (it2.hasNext()) {
            if (e(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private void c(ColorResult colorResult) {
        colorResult.getMainColors().addAll(colorResult.getAdditionalColors());
        colorResult.getMainGradients().addAll(colorResult.getAdditionalGradients());
        colorResult.getAdditionalColors().clear();
        colorResult.getAdditionalGradients().clear();
        float f = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < colorResult.getMainColors().size(); i2++) {
            bdu bduVar = colorResult.getMainColors().get(i2);
            if (a(bduVar)) {
                float fE = bduVar.e() + (bduVar.c() * 1.4f);
                if (fE > f) {
                    i = i2;
                    f = fE;
                }
            }
        }
        Log.i("FlowerColorRule", "find flower color at " + i);
        a(colorResult.getMainColors(), i, 0);
        a(colorResult.getMainGradients(), i, 0);
    }

    private void a(ColorResult colorResult) {
        colorResult.getMainColors().addAll(colorResult.getAdditionalColors());
        colorResult.getMainGradients().addAll(colorResult.getAdditionalGradients());
        colorResult.getAdditionalColors().clear();
        colorResult.getAdditionalGradients().clear();
        float f = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < colorResult.getMainColors().size(); i2++) {
            bdu bduVar = colorResult.getMainColors().get(i2);
            if (e(bduVar)) {
                float fE = bduVar.e() + (bduVar.c() * 1.4f);
                if (fE > f) {
                    i = i2;
                    f = fE;
                }
            }
        }
        Log.i("FlowerColorRule", "find leaf color at " + i);
        a(colorResult.getMainColors(), i, colorResult.getMainColors().size() + (-1));
        a(colorResult.getMainGradients(), i, colorResult.getMainGradients().size() + (-1));
    }

    private boolean e(bdu bduVar) {
        return bduVar.d() > 70.0f && bduVar.d() < 260.0f && ((double) bduVar.e()) > 0.08d;
    }

    private boolean a(bdu bduVar) {
        return (bduVar.d() < 70.0f || bduVar.d() > 150.0f) && ((double) bduVar.e()) > 0.08d;
    }

    private void a(List<bdu> list, int i, int i2) {
        bdu bduVar = list.get(i);
        list.set(i, list.get(i2));
        list.set(i2, bduVar);
    }
}
