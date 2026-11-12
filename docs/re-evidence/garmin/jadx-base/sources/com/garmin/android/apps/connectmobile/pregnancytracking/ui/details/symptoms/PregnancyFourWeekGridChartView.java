package com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.symptoms;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getColumnLabelHeight", "()I", "", "getMGridWidth", "()F", "mGridWidth", "getMLabelWidth", "mLabelWidth", "getMGridOrigin", "mGridOrigin", "", "getMRightToLeft", "()Z", "mRightToLeft", "b", "c", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PregnancyFourWeekGridChartView extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f40836k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f40838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f40839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextPaint f40840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f40841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f40842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<c> f40843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f40845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f40846j;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView$b;", "", "", "title", "", "numColumns", "", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView$c;", "rows", TtmlNode.ATTR_TTS_COLOR, "labels", "labelsInt", "<init>", "(Ljava/lang/String;ILjava/util/List;ILjava/util/List;Ljava/util/List;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f40849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f40850d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f40851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<Integer> f40852f;

        public b(String str, int i14, List<c> list, int i15, List<String> list2, List<Integer> list3) {
            str.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.f40847a = str;
            this.f40848b = i14;
            this.f40849c = list;
            this.f40850d = i15;
            this.f40851e = list2;
            this.f40852f = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f40847a.equals(bVar.f40847a) && this.f40848b == bVar.f40848b && this.f40849c.equals(bVar.f40849c) && this.f40850d == bVar.f40850d && this.f40851e.equals(bVar.f40851e) && this.f40852f.equals(bVar.f40852f);
        }

        public final int hashCode() {
            return this.f40852f.hashCode() + u0.b(q2.d(this.f40850d, u0.b(q2.d(this.f40848b, this.f40847a.hashCode() * 31, 31), 31, this.f40849c), 31), 31, this.f40851e);
        }

        public final String toString() {
            StringBuilder sbK = j.k(this.f40848b, "Grid(title=", this.f40847a, ", numColumns=", ", rows=");
            sbK.append(this.f40849c);
            sbK.append(", color=");
            sbK.append(this.f40850d);
            sbK.append(", labels=");
            return n23.j.j(sbK, this.f40851e, ", labelsInt=", this.f40852f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView$c;", "", "", Constants.ScionAnalytics.PARAM_LABEL, "", "", "columns", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Boolean> f40854b;

        public c(String str, List<Boolean> list) {
            str.getClass();
            list.getClass();
            this.f40853a = str;
            this.f40854b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f40853a.equals(cVar.f40853a) && this.f40854b.equals(cVar.f40854b);
        }

        public final int hashCode() {
            return this.f40854b.hashCode() + (this.f40853a.hashCode() * 31);
        }

        public final String toString() {
            return fb1.c.o("GridRow(label=", this.f40853a, ", columns=", this.f40854b, ")");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PregnancyFourWeekGridChartView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(a7.b.getColor(context, R.color.mct_grid_gray));
        this.f40837a = paint;
        Paint paint2 = new Paint();
        paint2.setColor(a7.b.getColor(context, R.color.gray_50_static));
        this.f40838b = paint2;
        this.f40839c = new Paint();
        f40836k.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(h22.a.a(h22.b.a(Typeface.DEFAULT), context));
        textPaint.setTextSize(c22.b.b(context, context.getResources().getDimension(R.dimen.andfont_label), 1.5f));
        textPaint.setColor(a7.b.getColor(context, R.color.gcm_chart_text_label));
        this.f40840d = textPaint;
        this.f40841e = getResources().getDimension(R.dimen.spacing_small);
        this.f40842f = getResources().getDimension(R.dimen.spacing_normal);
        j0 j0Var = j0.f134944a;
        this.f40843g = j0Var;
        this.f40846j = j0Var;
    }

    private final int getColumnLabelHeight() {
        Rect rect = new Rect();
        int iMin = Math.min(this.f40844h - 1, 4);
        int iMax = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            String strA = a(i14, iMin);
            this.f40840d.getTextBounds(strA, 0, strA.length(), rect);
            iMax = Math.max(iMax, rect.height());
        }
        return iMax;
    }

    private final float getMGridOrigin() {
        return getWidth() - getMGridWidth();
    }

    private final float getMGridWidth() {
        return (getWidth() - getMLabelWidth()) - this.f40841e;
    }

    private final float getMLabelWidth() {
        return getWidth() * 0.3f;
    }

    private final boolean getMRightToLeft() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final String a(int i14, int i15) {
        if (!this.f40846j.isEmpty() && this.f40846j.size() > i14) {
            return this.f40846j.get(i14);
        }
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        int iC = 1;
        if (i14 != 0) {
            int i16 = i15 - 1;
            iC = this.f40844h;
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
        float f14;
        Canvas canvas2;
        TextPaint textPaint;
        float mLabelWidth;
        Canvas canvas3 = canvas;
        canvas3.getClass();
        if (this.f40844h < 1 || this.f40843g.isEmpty()) {
            return;
        }
        this.f40845i = (getMGridWidth() - 1) / this.f40844h;
        float size = this.f40843g.size();
        float f15 = this.f40842f;
        float f16 = f15 * size;
        if (getMRightToLeft()) {
            canvas3.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        Iterator<T> it = this.f40843g.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            int i15 = i14 + 1;
            Iterator<T> it3 = ((c) it.next()).f40854b.iterator();
            int i16 = 0;
            while (it3.hasNext()) {
                int i17 = i16 + 1;
                if (((Boolean) it3.next()).booleanValue()) {
                    float mGridOrigin = getMGridOrigin();
                    float f17 = i16;
                    float f18 = this.f40845i;
                    float f19 = (f17 * f18) + mGridOrigin;
                    if (f18 < 1.0f) {
                        f18 = 1.0f;
                    }
                    canvas3.drawRect((f17 * this.f40845i) + getMGridOrigin(), i14 * f15, f19 + f18, i15 * f15, this.f40839c);
                }
                canvas3 = canvas;
                i16 = i17;
                i15 = i15;
            }
            canvas3 = canvas;
            i14 = i15;
        }
        int i18 = this.f40844h;
        Paint paint = this.f40837a;
        if (i18 <= 40 && this.f40845i > 1.0f && i18 >= 0) {
            int i19 = 0;
            while (true) {
                float f22 = i19;
                float f24 = f16;
                int i24 = i19;
                canvas.drawLine(getMGridOrigin() + (this.f40845i * f22), 0.0f, getMGridOrigin() + (f22 * this.f40845i), f24, (i19 == 0 || i19 % 7 != 0) ? paint : this.f40838b);
                f14 = f24;
                if (i24 == i18) {
                    break;
                }
                i19 = i24 + 1;
                f16 = f14;
            }
        } else {
            f14 = f16;
        }
        int size2 = this.f40843g.size();
        if (size2 >= 0) {
            int i25 = 0;
            while (true) {
                float f25 = i25 * f15;
                canvas2 = canvas;
                Paint paint2 = paint;
                canvas2.drawLine(getMGridOrigin(), f25, getWidth(), f25, paint2);
                if (i25 == size2) {
                    break;
                }
                i25++;
                paint = paint2;
            }
        } else {
            canvas2 = canvas;
        }
        if (getMRightToLeft()) {
            canvas2.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        Iterator<T> it4 = this.f40843g.iterator();
        int i26 = 0;
        while (true) {
            boolean zHasNext = it4.hasNext();
            textPaint = this.f40840d;
            if (!zHasNext) {
                break;
            }
            int i27 = i26 + 1;
            c cVar = (c) it4.next();
            if (getMRightToLeft()) {
                textPaint.setTextAlign(Paint.Align.LEFT);
                mLabelWidth = getWidth() - getMLabelWidth();
            } else {
                textPaint.setTextAlign(Paint.Align.RIGHT);
                mLabelWidth = getMLabelWidth();
            }
            CharSequence charSequenceEllipsize = TextUtils.ellipsize(cVar.f40853a, textPaint, getMLabelWidth(), TextUtils.TruncateAt.END);
            Rect rect = new Rect();
            String str = cVar.f40853a;
            textPaint.getTextBounds(str, 0, str.length(), rect);
            canvas2.drawText(charSequenceEllipsize.toString(), mLabelWidth, ((i26 + 0.5f) * f15) - rect.exactCenterY(), textPaint);
            i26 = i27;
        }
        int columnLabelHeight = getColumnLabelHeight();
        int iMin = Math.min(this.f40844h - 1, !this.f40846j.isEmpty() ? this.f40846j.size() : 4);
        float mGridWidth = getMGridWidth() / this.f40844h;
        float f26 = 3 * mGridWidth;
        for (int i28 = 0; i28 < iMin; i28++) {
            textPaint.setTextAlign(i28 == 0 ? getMRightToLeft() ? Paint.Align.RIGHT : Paint.Align.LEFT : getMRightToLeft() ? Paint.Align.LEFT : Paint.Align.RIGHT);
            String strA = a(i28, iMin);
            float mGridOrigin2 = (i28 * mGridWidth * (this.f40844h / iMin)) + getMGridOrigin() + f26;
            if (i28 > 0) {
                mGridOrigin2 += mGridWidth;
            }
            canvas2.drawText(strA, mGridOrigin2, f14 + columnLabelHeight + this.f40841e, textPaint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        float columnLabelHeight = getColumnLabelHeight() + this.f40841e + (this.f40842f * this.f40843g.size());
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/symptoms/PregnancyFourWeekGridChartView$a;", "", "<init>", "()V", "", "NUM_LABELS", "I", "", "LABEL_WIDTH_PERCENT", "F", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PregnancyFourWeekGridChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PregnancyFourWeekGridChartView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PregnancyFourWeekGridChartView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
