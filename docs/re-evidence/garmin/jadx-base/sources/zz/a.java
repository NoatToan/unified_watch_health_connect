package zz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzz/a;", "Lzz/j;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "", "topPadding", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;F)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPortHandler f207535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f207536b;

    public a(ViewPortHandler viewPortHandler, float f14) {
        viewPortHandler.getClass();
        this.f207535a = viewPortHandler;
        this.f207536b = f14;
    }

    @Override // zz.j
    public final float a() {
        return this.f207535a.contentTop() + this.f207536b;
    }

    @Override // zz.j
    public final void b(Canvas canvas, PointF pointF, Paint paint) {
        paint.getClass();
        canvas.restore();
        canvas.save();
        canvas.drawLine(pointF.x, a(), pointF.x, this.f207535a.contentBottom(), paint);
    }

    public /* synthetic */ a(ViewPortHandler viewPortHandler, float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(viewPortHandler, (i14 & 2) != 0 ? 0.0f : f14);
    }
}
