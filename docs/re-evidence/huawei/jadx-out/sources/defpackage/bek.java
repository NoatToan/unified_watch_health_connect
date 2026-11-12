package defpackage;

import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;

/* JADX INFO: loaded from: classes23.dex */
public class bek implements ColorPipelineNode {
    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode
    public void process(ColorResult colorResult) {
        Log.i("ColorOptimizer", "before optimize: " + colorResult.getMainColors());
        for (int i = 0; i < colorResult.getMainColors().size(); i++) {
            bdu bduVar = colorResult.getMainColors().get(i);
            float fE = bduVar.e();
            if (Float.compare(fE, 0.0f) != 0) {
                if (fE < 0.3f) {
                    fE *= 1.5f;
                }
                fE = Math.max(Math.min(fE, 0.9f), 0.1f);
            }
            float fC = bduVar.c();
            if (fC < 0.7f) {
                fC *= 1.5f;
            }
            colorResult.getMainColors().set(i, new bdu(bduVar.d(), fE, Math.max(Math.min(fC, 0.9f), 0.35f), bduVar.b()));
        }
        Log.i("ColorOptimizer", "after optimize: " + colorResult.getMainColors());
    }
}
