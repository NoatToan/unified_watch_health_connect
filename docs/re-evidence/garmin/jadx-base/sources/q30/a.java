package q30;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lq30/a;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends h00.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float[] f142377m;

    static {
        new C2673a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        this.f142377m = new float[]{0.0f, 0.0f};
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        canvas.getClass();
        str.getClass();
        mPPointF.getClass();
        Utils.drawXAxisValue(canvas, "●", f14, f15, this.f80599c, mPPointF, f16);
        Utils.drawXAxisValue(canvas, str, f14, f15 + pz.d.f141918a, this.f80598b, mPPointF, f16);
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        Canvas canvas2;
        super.drawLabels(canvas, f14, mPPointF);
        List<xz.h> list = this.f80600d;
        if (list != null) {
            for (xz.h hVar : list) {
                float f15 = hVar.f192754a;
                float[] fArr = this.f142377m;
                fArr[0] = f15;
                this.mTrans.pointValuesToPixel(fArr);
                int i14 = (int) fArr[0];
                Drawable drawable = hVar.f192755b;
                if (drawable != null) {
                    canvas2 = canvas;
                    Utils.drawImage(canvas2, drawable, i14, (int) (16.0f + f14), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                } else {
                    canvas2 = canvas;
                }
                canvas = canvas2;
            }
        }
    }

    /* JADX INFO: renamed from: q30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq30/a$a;", "", "<init>", "()V", "", "AXIS_TOP_PADDING", "F", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2673a {
        public /* synthetic */ C2673a(j jVar) {
            this();
        }

        private C2673a() {
        }
    }
}
