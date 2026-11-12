package defpackage;

import android.graphics.Bitmap;
import com.huawei.animationkit.computationalwallpaper.graphicanalysis.AiAnalysisStrategy;

/* JADX INFO: loaded from: classes23.dex */
public class bfh {
    private final AiAnalysisStrategy e;

    public bfh(AiAnalysisStrategy aiAnalysisStrategy) {
        this.e = aiAnalysisStrategy;
    }

    public bfe b(Bitmap bitmap) throws bdo {
        return this.e.analyze(bitmap);
    }
}
