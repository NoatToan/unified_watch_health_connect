package jw0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.h0;
import pv0.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ljw0/c;", "Lh00/b;", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "viewPortHandler", "Lcom/github/mikephil/charting/components/XAxis;", "xAxis", "Lcom/github/mikephil/charting/utils/Transformer;", "trans", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lkw0/a;", "behaviourDailyLogsWithoutMetrics", "", "isDaily", "<init>", "(Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/XAxis;Lcom/github/mikephil/charting/utils/Transformer;Landroid/content/Context;Ljava/util/List;Z)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends h00.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f101333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<kw0.a> f101334n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f101335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f101336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f101337q;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, Context context, List<kw0.a> list, boolean z14) {
        super(viewPortHandler, xAxis, transformer);
        viewPortHandler.getClass();
        xAxis.getClass();
        transformer.getClass();
        context.getClass();
        list.getClass();
        this.f101333m = context;
        this.f101334n = list;
        this.f101335o = z14;
        this.f101337q = h0.Z(list).isEmpty() ? 0 : 8;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabel(Canvas canvas, String str, float f14, float f15, MPPointF mPPointF, float f16) {
        Drawable drawableA;
        canvas.getClass();
        str.getClass();
        mPPointF.getClass();
        int i14 = this.f101336p;
        String str2 = (i14 == 0 || i14 == this.f80602f + (-1)) ? "●" : "•";
        float f17 = (i14 == 0 || i14 == this.f80602f + (-1)) ? f15 : f15 + (pz.d.f141919b / 4);
        kw0.a aVar = (kw0.a) h0.e0(i14, this.f101334n);
        int i15 = this.f101337q;
        if (aVar != null) {
            s sVar = aVar.f106904b;
            boolean z14 = this.f101335o;
            Context context = this.f101333m;
            if (z14) {
                bw0.a.C0329a.f21563a.getClass();
                bw0.a.f21562a.getClass();
                drawableA = j.a.a(context, bw0.a.c(sVar));
                Integer numB = bw0.a.b(sVar);
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    if (drawableA != null) {
                        drawableA.setTint(context.getColor(iIntValue));
                    }
                }
            } else {
                bw0.a.c.f21565a.getClass();
                drawableA = j.a.a(context, R.drawable.chart_item_circle);
                if (drawableA != null) {
                    drawableA.setTint(context.getColor(R.color.gds_data_viz_neutral_primary));
                }
            }
            Utils.drawImage(canvas, drawableA, MathKt.c(f14), MathKt.c(f17) + i15, 20, 20);
        }
        Utils.drawXAxisValue(canvas, str2, f14, f17 + (i15 * 2), this.f80599c, mPPointF, f16);
        Utils.drawXAxisValue(canvas, str, f14, f17 + pz.d.f141918a + i15, this.f80598b, mPPointF, f16);
        this.f101336p++;
    }

    @Override // com.github.mikephil.charting.renderer.XAxisRenderer
    public final void drawLabels(Canvas canvas, float f14, MPPointF mPPointF) {
        canvas.getClass();
        mPPointF.getClass();
        this.f101336p = 0;
        super.drawLabels(canvas, f14, mPPointF);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljw0/c$a;", "", "<init>", "()V", "", "BEHAVIOUR_DAILY_LOG_ICON_OFFSET", "I", "BEHAVIOUR_DAILY_LOG_ICON_SIZE", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, Context context, List list, boolean z14, int i14, j jVar) {
        this(viewPortHandler, xAxis, transformer, context, list, (i14 & 32) != 0 ? true : z14);
    }
}
