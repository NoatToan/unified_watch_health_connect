package defpackage;

import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorPipelineNode;
import com.huawei.animationkit.computationalwallpaper.coloranalysis.ColorResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bed {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ColorPipelineNode> f1052b = new ArrayList();

    public bed d(ColorPipelineNode colorPipelineNode) {
        this.f1052b.add(colorPipelineNode);
        return this;
    }

    public ColorResult a(ColorResult colorResult) {
        Iterator<ColorPipelineNode> it = this.f1052b.iterator();
        while (it.hasNext()) {
            it.next().process(colorResult);
            if (bdn.i()) {
                colorResult.addHistory(new ArrayList(colorResult.getMainColors()));
            }
        }
        return colorResult;
    }
}
