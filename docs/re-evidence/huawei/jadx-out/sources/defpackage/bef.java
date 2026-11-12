package defpackage;

import android.util.Log;
import android.util.Pair;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class bef implements ColorPipelineNode {
    private static final List<b> e;

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add(new b(GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 25));
        arrayList.add(new b(15, 50));
        arrayList.add(new b(40, 70));
        arrayList.add(new b(60, MachineControlPointResponse.OP_CODE_EXTENSION_SET_UNLOCK_CODE));
        arrayList.add(new b(160, 200));
        arrayList.add(new b(190, 260));
        arrayList.add(new b(255, 290));
        arrayList.add(new b(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 340));
    }

    @Override // com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode
    public void process(ColorResult colorResult) {
        Log.i("ColorMerger", "before merge: " + colorResult);
        ArrayList arrayList = new ArrayList();
        List<bdu> mainColors = colorResult.getMainColors();
        for (int i = 0; i < mainColors.size(); i++) {
            bdu bduVar = mainColors.get(i);
            arrayList.add(new Pair(Float.valueOf((bduVar.e() + (bduVar.c() * 1.4f)) - (i * 0.05f)), mainColors.get(i)));
        }
        List list = (List) arrayList.stream().sorted(new Comparator() { // from class: bem
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bef.d((Pair) obj, (Pair) obj2);
            }
        }).map(new Function() { // from class: bel
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bef.a((Pair) obj);
            }
        }).collect(Collectors.toList());
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < list.size(); i4++) {
                if (((bdu) list.get(i2)).b() != 0 && ((bdu) list.get(i4)).b() != 0 && e((bdu) list.get(i2), (bdu) list.get(i4))) {
                    ((bdu) list.get(i2)).c(((bdu) list.get(i2)).b() + ((bdu) list.get(i4)).b());
                    ((bdu) list.get(i4)).c(0);
                }
            }
            i2 = i3;
        }
        colorResult.setMainColors((List) list.stream().filter(new Predicate() { // from class: ben
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return bef.c((bdu) obj);
            }
        }).sorted(new Comparator() { // from class: bej
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bef.d((bdu) obj, (bdu) obj2);
            }
        }).collect(Collectors.toList()));
        Log.i("ColorMerger", "after merge: " + colorResult);
    }

    static /* synthetic */ int d(Pair pair, Pair pair2) {
        return -Float.compare(((Float) pair.first).floatValue(), ((Float) pair2.first).floatValue());
    }

    static /* synthetic */ bdu a(Pair pair) {
        return (bdu) pair.second;
    }

    static /* synthetic */ boolean c(bdu bduVar) {
        return bduVar.b() > 0;
    }

    static /* synthetic */ int d(bdu bduVar, bdu bduVar2) {
        return -Float.compare(bduVar.b(), bduVar2.b());
    }

    private boolean e(bdu bduVar, bdu bduVar2) {
        if (bduVar.e() < 0.08f && bduVar2.e() < 0.08f && Math.abs(bduVar.c() - bduVar2.c()) < 0.1f) {
            return true;
        }
        for (b bVar : e) {
            if (bVar.e(bduVar.d()) && bVar.e(bduVar2.d()) && a(bduVar.d(), bduVar2.d()) < 25.0f) {
                return true;
            }
        }
        return false;
    }

    private float a(float f, float f2) {
        float fAbs = Math.abs(f - f2);
        return Math.min(fAbs, 360.0f - fAbs);
    }

    static class b {
        private final int d;
        private final int e;

        private b(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e(float f) {
            int i = this.e;
            int i2 = this.d;
            if (i > i2) {
                return f > ((float) i2) && f <= ((float) i);
            }
            return f > ((float) i2) || f <= ((float) i);
        }
    }
}
