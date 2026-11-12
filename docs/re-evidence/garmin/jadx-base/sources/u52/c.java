package u52;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;
import f00.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lu52/c;", "Lf00/e;", "Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;", "chart", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/github/mikephil/charting/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;Landroid/content/Context;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f168710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f168711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f168712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f168713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f168714l;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(lineDataProvider, chartAnimator, viewPortHandler, false, null, 24, null);
        lineDataProvider.getClass();
        chartAnimator.getClass();
        viewPortHandler.getClass();
        context.getClass();
        this.f168710h = context;
        this.f168714l = new Paint(1);
    }

    @Override // com.github.mikephil.charting.renderer.LineScatterCandleRadarRenderer
    public final void drawHighlightLines(Canvas canvas, float f14, float f15, ILineScatterCandleRadarDataSet<?> iLineScatterCandleRadarDataSet) {
        Canvas canvas2;
        float fContentBottom = this.mViewPortHandler.contentBottom();
        float f16 = fContentBottom - (((fContentBottom - f15) * this.f168711i) / 100.0f);
        float fContentBottom2 = ((this.mViewPortHandler.contentBottom() - this.mViewPortHandler.contentTop()) * this.f168713k) / this.f168712j;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f168714l;
        paint.setStyle(style);
        paint.setColor(a7.b.getColor(this.f168710h, R.color.white_with_30_opacity));
        if (canvas != null) {
            canvas2 = canvas;
            canvas2.drawRect(this.mViewPortHandler.contentLeft(), f16 - fContentBottom2, this.mViewPortHandler.contentRight(), f16 + fContentBottom2, paint);
        } else {
            canvas2 = canvas;
        }
        if (canvas2 != null) {
            canvas2.drawCircle(f14, f16, 8.0f, this.mCirclePaintInner);
        }
        super.drawHighlightLines(canvas2, f14, f16, iLineScatterCandleRadarDataSet);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu52/c$a;", "", "<init>", "()V", "", "CIRCLE_RADIUS", "F", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
