package zz;

import android.graphics.PointF;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzz/c;", "Lzz/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPortHandler f207538b;

    public c(ViewPortHandler viewPortHandler) {
        viewPortHandler.getClass();
        this.f207538b = viewPortHandler;
    }

    @Override // zz.b, zz.i
    public final Highlight a(List<? extends Highlight> list, float f14, PointF pointF) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Highlight highlight = (Highlight) obj;
            if (this.f207538b.isInBounds(highlight.getXPx(), highlight.getYPx())) {
                arrayList.add(obj);
            }
        }
        return super.a(arrayList, f14, pointF);
    }
}
