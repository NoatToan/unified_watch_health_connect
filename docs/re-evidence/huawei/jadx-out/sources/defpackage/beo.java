package defpackage;

import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class beo implements ColorPipelineNode {
    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode
    public void process(ColorResult colorResult) {
        List<bdu> mainColors = colorResult.getMainColors();
        final int iIntValue = ((Integer) mainColors.stream().map(new Function() { // from class: bes
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((bdu) obj).b());
            }
        }).reduce(new BinaryOperator() { // from class: bep
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Integer.valueOf(Integer.sum(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        }).orElse(0)).intValue();
        List<bdu> listSubList = (List) mainColors.stream().filter(new Predicate() { // from class: ber
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return beo.d(iIntValue, (bdu) obj);
            }
        }).sorted(new Comparator() { // from class: beq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return beo.d((bdu) obj, (bdu) obj2);
            }
        }).collect(Collectors.toList());
        if (listSubList.size() > 3) {
            listSubList = listSubList.subList(0, 3);
        }
        colorResult.setMainColors(listSubList);
    }

    static /* synthetic */ boolean d(int i, bdu bduVar) {
        return (((float) bduVar.b()) * 100.0f) / ((float) i) > 1.0f;
    }

    static /* synthetic */ int d(bdu bduVar, bdu bduVar2) {
        return -Float.compare(bduVar.b(), bduVar2.b());
    }
}
