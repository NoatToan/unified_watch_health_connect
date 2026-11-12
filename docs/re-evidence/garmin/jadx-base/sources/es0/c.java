package es0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import p005kotlin.Metadata;
import zz.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Les0/c;", "Lzz/j;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Les0/g;", "jetLagMarker", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Les0/g;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPortHandler f65184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f65185b;

    public c(ViewPortHandler viewPortHandler, g gVar) {
        viewPortHandler.getClass();
        gVar.getClass();
        this.f65184a = viewPortHandler;
        this.f65185b = gVar;
    }

    @Override // zz.j
    /* JADX INFO: renamed from: a */
    public final float getF207579b() {
        return this.f65185b.getMarkerTopPosition();
    }

    @Override // zz.j
    public final void b(Canvas canvas, PointF pointF, Paint paint) {
        paint.getClass();
        canvas.restore();
        canvas.save();
        canvas.drawLine(pointF.x, this.f65185b.getMarkerTopPosition(), pointF.x, this.f65184a.contentBottom(), paint);
    }
}
