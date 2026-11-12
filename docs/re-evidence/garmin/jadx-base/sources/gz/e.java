package gz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.components.MarkerView;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u001b\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u000eR$\u0010\"\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lgz/e;", "Lcom/github/mikephil/chartingv2/components/MarkerView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", TtmlNode.TAG_LAYOUT, "Lgz/f;", "markerValueFormatter", "<init>", "(Landroid/content/Context;ILgz/f;)V", "", "leftOffset", "", "setLeftOffset", "(F)V", "rightOffset", "setRightOffset", "", "value", "setValueLabel", "(Ljava/lang/String;)V", "setTimeLabel", "c", "F", "getDefaultPaddingSmall", "()F", "setDefaultPaddingSmall", "defaultPaddingSmall", "d", "Lgz/f;", "getMMarkerValueFormatter", "()Lgz/f;", "setMMarkerValueFormatter", "(Lgz/f;)V", "mMarkerValueFormatter", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public class e extends MarkerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f80395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f80396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float defaultPaddingSmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public f mMarkerValueFormatter;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f80399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f80400f;

    public e(Context context, int i14, f fVar) {
        Resources resources;
        super(context, i14);
        View viewFindViewById = findViewById(R.id.value_label);
        this.f80395a = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        View viewFindViewById2 = findViewById(R.id.time_label);
        this.f80396b = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
        float dimension = (context == null || (resources = context.getResources()) == null) ? 0.0f : resources.getDimension(R.dimen.spacing_micro);
        this.defaultPaddingSmall = dimension;
        this.mMarkerValueFormatter = fVar;
        this.f80399e = dimension;
        this.f80400f = dimension;
    }

    public static void b(TextView textView, String str) {
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            textView.setText(str);
        }
    }

    private final void setLeftOffset(float leftOffset) {
        this.f80399e = leftOffset + this.defaultPaddingSmall;
    }

    private final void setRightOffset(float rightOffset) {
        this.f80400f = rightOffset + this.defaultPaddingSmall;
    }

    public final void a(float f14, float f15) {
        setLeftOffset(f14);
        setRightOffset(f15);
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public void draw(Canvas canvas, float f14, float f15) {
        canvas.getClass();
        float width = (getWidth() / 2) + this.f80399e;
        float width2 = (canvas.getWidth() - (getWidth() / 2)) - this.f80400f;
        if (f14 <= width) {
            super.draw(canvas, width, this.defaultPaddingSmall);
            return;
        }
        float f16 = this.defaultPaddingSmall;
        if (f14 >= width2) {
            super.draw(canvas, width2, f16);
        } else {
            super.draw(canvas, f14, f16);
        }
    }

    public final float getDefaultPaddingSmall() {
        return this.defaultPaddingSmall;
    }

    public final f getMMarkerValueFormatter() {
        return this.mMarkerValueFormatter;
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public final int getXOffset(float f14) {
        return -(getWidth() / 2);
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public final int getYOffset(float f14) {
        return 0;
    }

    @Override // com.github.mikephil.chartingv2.components.MarkerView
    public void refreshContent(Entry entry, Highlight highlight) {
        f fVar;
        if (entry == null || (fVar = this.mMarkerValueFormatter) == null) {
            return;
        }
        setValueLabel(fVar.b(entry.getVal()));
        f fVar2 = this.mMarkerValueFormatter;
        setTimeLabel(fVar2 != null ? fVar2.c(entry.getXIndex()) : null);
    }

    public final void setDefaultPaddingSmall(float f14) {
        this.defaultPaddingSmall = f14;
    }

    public final void setMMarkerValueFormatter(f fVar) {
        this.mMarkerValueFormatter = fVar;
    }

    public final void setTimeLabel(String value) {
        b(this.f80396b, value);
    }

    public final void setValueLabel(String value) {
        b(this.f80395a, value);
    }

    public e(Context context, int i14) {
        this(context, i14, null, 4, null);
    }

    public /* synthetic */ e(Context context, int i14, f fVar, int i15, j jVar) {
        this(context, i14, (i15 & 4) != 0 ? null : fVar);
    }
}
