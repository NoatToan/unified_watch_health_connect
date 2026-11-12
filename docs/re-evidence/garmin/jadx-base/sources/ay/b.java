package ay;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pz.d;
import w5.r;
import xz.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lay/b;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "a", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends h00.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13649m;

    static {
        new a(null);
        f13649m = (int) Utils.convertDpToPixel(4.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        int i14 = this.mAxis.mEntryCount * 120;
        int i15 = i14 + 2;
        float[] fArr = new float[i15];
        int i16 = i14 + 1;
        int iN = r.n(0, i16, 2);
        if (iN >= 0) {
            int i17 = 0;
            while (true) {
                fArr[i17] = i17 / 2.0f;
                if (i17 == iN) {
                    break;
                } else {
                    i17 += 2;
                }
            }
        }
        this.mTrans.pointValuesToPixel(fArr);
        int iN2 = r.n(0, i16, 120);
        if (iN2 >= 0) {
            int i18 = 0;
            while (true) {
                float f15 = fArr[i18];
                if (this.mViewPortHandler.isInBoundsX(f15)) {
                    Utils.drawXAxisValue(canvas, "•", f15, (f14 + 24.0f) - f13649m, this.f80599c, mPPointF, 0.0f);
                }
                if (i18 == iN2) {
                    break;
                } else {
                    i18 += 120;
                }
            }
        }
        List<h> list = this.f80600d;
        if (list != null) {
            for (h hVar : list) {
                int i19 = hVar.f192754a * 2;
                if (i19 >= i15) {
                    return;
                }
                float f16 = fArr[i19];
                if (this.mViewPortHandler.isInBoundsX(f16)) {
                    Drawable drawable = hVar.f192755b;
                    if (drawable != null) {
                        Utils.drawImage(canvas, drawable, (int) f16, (int) (f14 + 24.0f), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    }
                    String str = hVar.f192756c;
                    if (str != null) {
                        float fOffsetRight = 0.0f;
                        if (str != null) {
                            Rect rect = new Rect();
                            Paint paint = this.f80598b;
                            if (paint != null) {
                                paint.getTextBounds(str, 0, str.length(), rect);
                            }
                            int i24 = rect.right;
                            if ((i24 / 2) + f16 > this.mViewPortHandler.offsetRight() + this.mViewPortHandler.contentRight()) {
                                fOffsetRight = (i24 / 2.0f) - this.mViewPortHandler.offsetRight();
                            }
                        }
                        Utils.drawXAxisValue(canvas, str, f16 - fOffsetRight, f14 + 24.0f + d.f141918a, this.f80598b, mPPointF, this.mXAxis.getLabelRotationAngle());
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lay/b$a;", "", "<init>", "()V", "", "SMALL_MARK", "Ljava/lang/String;", "", "AXIS_TOP_PADDING", "F", "", "MINUTES_IN_AN_HOUR", "I", "LARGE_DOT_OFFSET", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
