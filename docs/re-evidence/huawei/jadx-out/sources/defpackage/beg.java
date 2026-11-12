package defpackage;

import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes23.dex */
public class beg implements ColorPipelineNode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f1054c = new Random();

    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode
    public void process(ColorResult colorResult) {
        a(colorResult);
        d(colorResult);
        Log.i("ColorMatcher", "additional color: " + colorResult.getAdditionalColors());
        Log.i("ColorMatcher", "gradient: " + colorResult.getMainGradients() + "additional gradient: " + colorResult.getAdditionalGradients());
    }

    private void a(ColorResult colorResult) {
        if (colorResult.getMainColors().size() >= 3) {
            colorResult.setAdditionalColors(Collections.EMPTY_LIST);
            return;
        }
        bdu bduVar = colorResult.getMainColors().get(0);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 3 - colorResult.getMainColors().size(); i++) {
            if (bduVar.c() > 0.7f) {
                arrayList.add(Integer.valueOf(i + 6));
            } else if (bduVar.c() < 0.4d) {
                arrayList.add(Integer.valueOf(6 - i));
            } else {
                arrayList.add(Integer.valueOf(6 - i));
                arrayList.add(Integer.valueOf(i + 6));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 3 - colorResult.getMainColors().size(); i2++) {
            arrayList2.add(bea.b(bduVar, ((Integer) arrayList.get(i2)).intValue()));
        }
        colorResult.setAdditionalColors(arrayList2);
    }

    private void d(ColorResult colorResult) {
        this.f1054c.setSeed(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(colorResult.getMainColors().get(0)));
        for (int i = 1; i < colorResult.getMainColors().size(); i++) {
            arrayList.add(d(colorResult.getMainColors().get(i)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<bdu> it = colorResult.getAdditionalColors().iterator();
        while (it.hasNext()) {
            arrayList2.add(d(it.next()));
        }
        colorResult.setMainGradients(arrayList);
        colorResult.setAdditionalGradients(arrayList2);
    }

    private bdu b(bdu bduVar) {
        return new bdu(Math.max(bduVar.d() - ((int) ((this.f1054c.nextFloat() * 30.0f) + 30.0f)), 0.0f), bduVar.e(), bduVar.c(), bduVar.b());
    }

    private bdu d(bdu bduVar) {
        return bea.b(bduVar, 4);
    }
}
