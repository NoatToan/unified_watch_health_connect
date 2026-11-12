package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.j;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getColumnLabelHeight", "()I", "", "getMGridWidth", "()F", "mGridWidth", "getMLabelWidth", "mLabelWidth", "getMGridOrigin", "mGridOrigin", "", "getMRightToLeft", "()Z", "mRightToLeft", "b", "c", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GridChartView extends View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f39176i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f39177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f39178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f39179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<c> f39182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f39184h;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView$b;", "", "", "title", "", "numColumns", "", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView$c;", "rows", TtmlNode.ATTR_TTS_COLOR, "<init>", "(Ljava/lang/String;ILjava/util/List;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f39187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39188d;

        public b(String str, int i14, List<c> list, int i15) {
            str.getClass();
            list.getClass();
            this.f39185a = str;
            this.f39186b = i14;
            this.f39187c = list;
            this.f39188d = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f39185a.equals(bVar.f39185a) && this.f39186b == bVar.f39186b && this.f39187c.equals(bVar.f39187c) && this.f39188d == bVar.f39188d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f39188d) + u0.b(q2.d(this.f39186b, this.f39185a.hashCode() * 31, 31), 31, this.f39187c);
        }

        public final String toString() {
            StringBuilder sbK = j.k(this.f39186b, "Grid(title=", this.f39185a, ", numColumns=", ", rows=");
            sbK.append(this.f39187c);
            sbK.append(", color=");
            sbK.append(this.f39188d);
            sbK.append(")");
            return sbK.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView$c;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "", "", "columns", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Boolean> f39190b;

        public c(String str, List<Boolean> list) {
            str.getClass();
            list.getClass();
            this.f39189a = str;
            this.f39190b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f39189a.equals(cVar.f39189a) && this.f39190b.equals(cVar.f39190b);
        }

        public final int hashCode() {
            return this.f39190b.hashCode() + (this.f39189a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("GridRow(label=", this.f39189a, ", columns=", this.f39190b, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridChartView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(a7.b.getColor(context, R.color.mct_grid_gray));
        this.f39177a = paint;
        this.f39178b = new Paint();
        f39176i.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(h22.a.a(h22.b.a(Typeface.DEFAULT), context));
        textPaint.setTextSize(c22.b.b(context, context.getResources().getDimension(R.dimen.andfont_label), 1.5f));
        textPaint.setColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        this.f39179c = textPaint;
        this.f39180d = getResources().getDimension(R.dimen.spacing_small);
        this.f39181e = getResources().getDimension(R.dimen.spacing_normal);
        this.f39182f = j0.f134944a;
    }

    private final int getColumnLabelHeight() {
        Rect rect = new Rect();
        int iMin = Math.min(this.f39183g - 1, 5);
        int iMax = 0;
        for (int i14 = 0; i14 < 5; i14++) {
            String strA = a(i14, iMin);
            this.f39179c.getTextBounds(strA, 0, strA.length(), rect);
            iMax = Math.max(iMax, rect.height());
        }
        return iMax;
    }

    private final float getMGridOrigin() {
        return getWidth() - getMGridWidth();
    }

    private final float getMGridWidth() {
        return (getWidth() - getMLabelWidth()) - this.f39180d;
    }

    private final float getMLabelWidth() {
        return getWidth() * 0.3f;
    }

    private final boolean getMRightToLeft() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final String a(int i14, int i15) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        int iC = 1;
        if (i14 != 0) {
            int i16 = i15 - 1;
            iC = this.f39183g;
            if (i14 != i16) {
                iC = MathKt.c((i14 / i16) * iC);
            }
        }
        String str = integerInstance.format(Integer.valueOf(iC));
        str.getClass();
        return str;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        TextPaint textPaint;
        float mLabelWidth;
        Canvas canvas3 = canvas;
        canvas3.getClass();
        if (this.f39183g < 1 || this.f39182f.isEmpty()) {
            return;
        }
        this.f39184h = (getMGridWidth() - 1) / this.f39183g;
        float size = this.f39182f.size();
        float f14 = this.f39181e;
        float f15 = f14 * size;
        if (getMRightToLeft()) {
            canvas3.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        Iterator<T> it = this.f39182f.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int i15 = i14 + 1;
            Iterator<T> it3 = ((c) it.next()).f39190b.iterator();
            int i16 = 0;
            while (it3.hasNext()) {
                int i17 = i16 + 1;
                if (((Boolean) it3.next()).booleanValue()) {
                    float mGridOrigin = getMGridOrigin();
                    float f16 = i16;
                    float f17 = this.f39184h;
                    float f18 = (f16 * f17) + mGridOrigin;
                    if (f17 < 1.0f) {
                        f17 = 1.0f;
                    }
                    canvas3.drawRect((f16 * this.f39184h) + getMGridOrigin(), i14 * f14, f18 + f17, i15 * f14, this.f39178b);
                }
                canvas3 = canvas;
                i16 = i17;
                i15 = i15;
            }
            canvas3 = canvas;
            i14 = i15;
        }
        int i18 = this.f39183g;
        Paint paint = this.f39177a;
        if (i18 <= 40 && this.f39184h > 1.0f && i18 >= 0) {
            int i19 = 0;
            while (true) {
                float f19 = i19;
                canvas.drawLine((this.f39184h * f19) + getMGridOrigin(), 0.0f, (f19 * this.f39184h) + getMGridOrigin(), f15, paint);
                if (i19 == i18) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        int size2 = this.f39182f.size();
        if (size2 >= 0) {
            int i24 = 0;
            while (true) {
                float f22 = i24 * f14;
                canvas2 = canvas;
                canvas2.drawLine(getMGridOrigin(), f22, getWidth(), f22, paint);
                if (i24 == size2) {
                    break;
                } else {
                    i24++;
                }
            }
        } else {
            canvas2 = canvas;
        }
        if (getMRightToLeft()) {
            canvas2.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        Iterator<T> it4 = this.f39182f.iterator();
        int i25 = 0;
        while (true) {
            boolean zHasNext = it4.hasNext();
            textPaint = this.f39179c;
            if (!zHasNext) {
                break;
            }
            int i26 = i25 + 1;
            c cVar = (c) it4.next();
            if (getMRightToLeft()) {
                textPaint.setTextAlign(Paint.Align.LEFT);
                mLabelWidth = getWidth() - getMLabelWidth();
            } else {
                textPaint.setTextAlign(Paint.Align.RIGHT);
                mLabelWidth = getMLabelWidth();
            }
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(cVar.f39189a, textPaint, getMLabelWidth(), TextUtils.TruncateAt.END);
            Rect rect = new Rect();
            String str = cVar.f39189a;
            textPaint.getTextBounds(str, 0, str.length(), rect);
            canvas2.drawText(charSequenceEllipsize.toString(), mLabelWidth, ((i25 + 0.5f) * f14) - rect.exactCenterY(), textPaint);
            i25 = i26;
        }
        int columnLabelHeight = getColumnLabelHeight();
        int iMin = Math.min(this.f39183g - 1, 5);
        for (int i27 = 0; i27 < iMin; i27++) {
            textPaint.setTextAlign(i27 == 0 ? getMRightToLeft() ? Paint.Align.RIGHT : Paint.Align.LEFT : getMRightToLeft() ? Paint.Align.LEFT : Paint.Align.RIGHT);
            String strA = a(i27, iMin);
            float mGridWidth = (i27 / (iMin - 1)) * getMGridWidth();
            canvas2.drawText(strA, getMRightToLeft() ? getMGridWidth() - mGridWidth : getMGridOrigin() + mGridWidth, columnLabelHeight + f15 + this.f39180d, textPaint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        float columnLabelHeight = getColumnLabelHeight() + this.f39180d + (this.f39181e * this.f39182f.size());
        int size = View.MeasureSpec.getSize(i14);
        int mode = View.MeasureSpec.getMode(i15);
        int size2 = View.MeasureSpec.getSize(i15);
        if (mode == Integer.MIN_VALUE) {
            size2 = Math.min((int) columnLabelHeight, size2);
        } else if (mode == 0) {
            size2 = (int) columnLabelHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/util/GridChartView$a;", "", "<init>", "()V", "", "NUM_LABELS", "I", "", "LABEL_WIDTH_PERCENT", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridChartView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GridChartView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
