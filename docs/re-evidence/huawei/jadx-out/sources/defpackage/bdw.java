package defpackage;

import android.graphics.Bitmap;
import androidx.palette.graphics.Palette;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes23.dex */
public class bdw {
    public ColorResult a(Bitmap bitmap) {
        Palette.Builder builderFrom = Palette.from(bitmap);
        builderFrom.clearFilters();
        List<bdu> list = (List) builderFrom.generate().getSwatches().stream().sorted(new Comparator() { // from class: bec
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bdw.a((Palette.Swatch) obj, (Palette.Swatch) obj2);
            }
        }).map(new Function() { // from class: bdz
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bdw.d((Palette.Swatch) obj);
            }
        }).collect(Collectors.toList());
        ColorResult colorResult = new ColorResult();
        colorResult.setOriginalColors(list);
        colorResult.setMainColors(new ArrayList(list));
        return colorResult;
    }

    static /* synthetic */ int a(Palette.Swatch swatch, Palette.Swatch swatch2) {
        return -(swatch.getPopulation() - swatch2.getPopulation());
    }

    static /* synthetic */ bdu d(Palette.Swatch swatch) {
        return new bdu(swatch.getRgb(), swatch.getPopulation());
    }
}
