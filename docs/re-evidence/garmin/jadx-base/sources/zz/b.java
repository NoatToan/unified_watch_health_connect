package zz;

import android.graphics.PointF;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzz/b;", "Lzz/i;", "<init>", "()V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f207537a;

    static {
        new a(null);
        f207537a = Utils.convertDpToPixel(500.0f);
    }

    @Override // zz.i
    public Highlight a(List<? extends Highlight> list, float f14, PointF pointF) {
        Highlight highlight = null;
        float f15 = f207537a;
        for (Highlight highlight2 : list) {
            float fAbs = Math.abs(highlight2.getXPx() - pointF.x);
            if (fAbs < f15) {
                highlight = highlight2;
                f15 = fAbs;
            }
        }
        return highlight;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzz/b$a;", "", "<init>", "()V", "", "MAX_HIGHLIGHT_DISTANCE", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
