package defpackage;

import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class bei implements ColorPipelineNode {
    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode
    public void process(ColorResult colorResult) {
        Log.i("ColorFilter", "before filter: " + colorResult.getMainColors().size() + " " + colorResult.getMainColors());
        List<bdu> list = (List) colorResult.getMainColors().stream().filter(new Predicate() { // from class: beh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bei.e((bdu) obj);
            }
        }).collect(Collectors.toList());
        if (list.size() > 0) {
            colorResult.setMainColors(list);
        } else {
            Log.w("ColorFilter", "no color after filter");
        }
        Log.i("ColorFilter", "after filter: " + colorResult.getMainColors().size() + " " + colorResult.getMainColors());
    }

    static /* synthetic */ boolean e(bdu bduVar) {
        return (bduVar.e() >= 0.2f || bduVar.c() <= 0.85f) && bduVar.c() >= 0.2f;
    }
}
