package zz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzz/g;", "Lzz/k;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Landroid/graphics/Paint;", "overlayRectPaint", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Landroid/graphics/Paint;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPortHandler f207542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f207543b;

    static {
        new a(null);
    }

    public g(ViewPortHandler viewPortHandler, Paint paint) {
        viewPortHandler.getClass();
        paint.getClass();
        this.f207542a = viewPortHandler;
        this.f207543b = paint;
    }

    @Override // zz.k
    public final void a(Canvas canvas, Highlight[] highlightArr) {
        if (highlightArr == null || highlightArr.length != 2) {
            return;
        }
        Rect rect = new Rect((int) highlightArr[0].getDrawX(), 0, (int) highlightArr[1].getDrawX(), (int) this.f207542a.contentBottom());
        canvas.restore();
        canvas.save();
        canvas.drawRect(rect, this.f207543b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzz/g$a;", "", "<init>", "()V", "", "OVERLAY_TOP_POSITION", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
