package u52;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import h00.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lu52/d;", "Lh00/j;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends j {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer, null, false, null, 56, null);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void renderLimitLineLabel(Canvas canvas, LimitLine limitLine, float[] fArr, float f14) {
        canvas.getClass();
        limitLine.getClass();
        fArr.getClass();
        String label = limitLine.getLabel();
        if (label == null || label.length() == 0) {
            return;
        }
        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
        this.mLimitLinePaint.setPathEffect(null);
        this.mLimitLinePaint.setColor(limitLine.getTextColor());
        this.mLimitLinePaint.setStrokeWidth(0.5f);
        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
        this.mLimitLinePaint.setTextAlign(Paint.Align.CENTER);
        float fContentTop = (this.mViewPortHandler.contentTop() + f14) - 20.0f;
        canvas.restore();
        canvas.save();
        float xOffset = limitLine.getXOffset() + limitLine.getLineWidth();
        float fCalcTextWidth = Utils.calcTextWidth(this.mLimitLinePaint, label);
        float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
        float f15 = fArr[0] + xOffset;
        float f16 = fCalcTextWidth / 2;
        float f17 = f16 + xOffset;
        float width = (canvas.getWidth() - f16) - xOffset;
        if (f15 <= f17) {
            canvas.drawText(label, f17, fContentTop - fCalcTextHeight, this.mLimitLinePaint);
        } else {
            Paint paint = this.mLimitLinePaint;
            if (f15 >= width) {
                canvas.drawText(label, width, fContentTop - fCalcTextHeight, paint);
            } else {
                canvas.drawText(label, f15, fContentTop - fCalcTextHeight, paint);
            }
        }
        canvas.drawText("▼", f15 - 7.0f, fContentTop, this.mLimitLinePaint);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu52/d$a;", "", "<init>", "()V", "", "EXTRA_TOP_OFFSET", "F", "ARROW_OFFSET", "", "ARROW", "Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
