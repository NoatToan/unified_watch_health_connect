package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorRule;
import com.huawei.animationkit.computationalwallpaper.generator.DynamicWallpaper;
import com.huawei.animationkit.computationalwallpaper.generator.ResolverResult;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.Pattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.ColorPattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.KaleidoscopePattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.LayerPattern;
import com.huawei.animationkit.computationalwallpaper.pattern.pattern.impl.VectorPattern;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bfb {
    private static final bfb e = new bfb();
    private final bfa d = new bfa();

    private bfb() {
    }

    public static bfb d() {
        return e;
    }

    public List<DynamicWallpaper> c(Bitmap bitmap) throws bdo {
        try {
            ResolverResult resolverResultE = this.d.e(bitmap);
            return c(resolverResultE, bfz.c().e().selectTemplate(resolverResultE));
        } catch (RuntimeException e2) {
            Log.e("DynamicWallpaperGenerator", "generate dynamic wallpaper failed.", e2);
            throw new bdo(e2);
        }
    }

    private List<DynamicWallpaper> c(ResolverResult resolverResult, List<bfz.d> list) throws bdo {
        ArrayList arrayList = new ArrayList();
        for (bfz.d dVar : list) {
            Pattern patternD = d(resolverResult.getColorResult(), dVar);
            arrayList.add(new DynamicWallpaper(resolverResult, patternD, bdl.e(patternD, resolverResult.getColorResult(), dVar)));
        }
        return arrayList;
    }

    private Pattern d(ColorResult colorResult, bfz.d dVar) throws bdo {
        Pattern patternD;
        if (dVar.d().equals(VectorPattern.class)) {
            patternD = bfg.d(dVar, d(colorResult, dVar.b()), dVar.a());
        } else if (dVar.d().equals(KaleidoscopePattern.class)) {
            patternD = bfg.c(dVar.i(), d(colorResult, dVar.b()));
        } else if (dVar.d().equals(LayerPattern.class)) {
            patternD = bfg.e(dVar.i(), colorResult);
        } else if (dVar.d().equals(ColorPattern.class)) {
            patternD = bfg.b(dVar.i(), d(colorResult, dVar.b()));
        } else {
            patternD = bfg.d(dVar.d().getName(), colorResult);
        }
        patternD.setTag(dVar.f());
        return patternD;
    }

    private ColorResult d(ColorResult colorResult, ColorRule colorRule) {
        return colorRule == null ? colorResult : colorRule.process(colorResult);
    }
}
