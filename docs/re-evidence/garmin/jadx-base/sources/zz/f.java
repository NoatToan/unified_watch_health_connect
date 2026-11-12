package zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.MPPointF;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzz/f;", "Lcom/github/mikephil/charting/components/MarkerView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "layoutResourceId", "Lzz/j;", "highlightDrawer", "<init>", "(Landroid/content/Context;ILzz/j;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public abstract class f extends MarkerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f207541a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i14, j jVar) {
        super(context, i14);
        context.getClass();
        this.f207541a = jVar;
    }

    public final void a(Canvas canvas, float f14, float f15) {
        super.draw(canvas, f14, f15);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        int width = getWidth() / 2;
        float width2 = canvas.getWidth() - (getWidth() / 2);
        j jVar = this.f207541a;
        float f207579b = jVar != null ? jVar.getF207579b() - getHeight() : 0.0f;
        float f16 = width;
        if (f14 <= f16) {
            super.draw(canvas, f16, f207579b);
        } else if (f14 >= width2) {
            super.draw(canvas, width2, f207579b);
        } else {
            super.draw(canvas, f14, f207579b);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public final MPPointF getOffsetForDrawingAtPoint(float f14, float f15) {
        return new MPPointF(-(getWidth() / 2.0f), 0.0f);
    }

    public /* synthetic */ f(Context context, int i14, j jVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this(context, i14, (i15 & 4) != 0 ? null : jVar);
    }
}
