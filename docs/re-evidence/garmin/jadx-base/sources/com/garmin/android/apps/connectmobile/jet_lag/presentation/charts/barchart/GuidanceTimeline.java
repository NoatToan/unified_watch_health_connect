package com.garmin.android.apps.connectmobile.jet_lag.presentation.charts.barchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/charts/barchart/GuidanceTimeline;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GuidanceTimeline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f36960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f36961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f36962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f36963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f36964e;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidanceTimeline(Context context) {
        super(context);
        context.getClass();
        this.f36960a = new Paint();
        this.f36961b = new Paint();
        a(context);
    }

    public final void a(Context context) {
        int color = a7.b.getColor(context, R.color.gcm_surface_3);
        Paint paint = this.f36960a;
        paint.setColor(color);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setAntiAlias(true);
        int color2 = a7.b.getColor(context, R.color.gcm_surface_3);
        Paint paint2 = this.f36961b;
        paint2.setColor(color2);
        paint2.setStrokeCap(cap);
        paint2.setAntiAlias(true);
        this.f36963d = TypedValue.applyDimension(1, 8, getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int width = getWidth();
        float height = getHeight();
        if (this.f36962c == null) {
            this.f36962c = new RectF(0.0f, 0.0f, width, height);
        }
        RectF rectF = this.f36962c;
        if (rectF != null) {
            float f14 = this.f36963d;
            canvas.drawRoundRect(rectF, f14, f14, this.f36960a);
        }
        ArrayList<b> arrayList = this.f36964e;
        if (arrayList != null) {
            for (b bVar : arrayList) {
                int color = a7.b.getColor(getContext(), bVar.f36967c);
                Paint paint = this.f36961b;
                paint.setColor(color);
                RectF rectF2 = new RectF((bVar.f36965a * width) / 1440.0f, 0.0f, (bVar.f36966b * width) / 1440.0f, height);
                int i14 = bVar.f36968d;
                if (i14 == 1) {
                    paint.setStyle(Paint.Style.FILL);
                    paint.setStrokeWidth(0.0f);
                    float f15 = this.f36963d;
                    canvas.drawRoundRect(rectF2, f15, f15, paint);
                } else if (i14 == 2) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(6.0f);
                    float f16 = this.f36963d;
                    canvas.drawRoundRect(rectF2, f16, f16, paint);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/charts/barchart/GuidanceTimeline$a;", "", "<init>", "()V", "", "FILL_STYLE", "I", "OUTLINE_STYLE", "", "MINUTES_IN_DAY", "F", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/jet_lag/presentation/charts/barchart/GuidanceTimeline$b;", "", "", TtmlNode.START, TtmlNode.END, "colorRes", TtmlNode.TAG_STYLE, "<init>", "(IIII)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36968d;

        public b(int i14, int i15, int i16, int i17) {
            this.f36965a = i14;
            this.f36966b = i15;
            this.f36967c = i16;
            this.f36968d = i17;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f36965a == bVar.f36965a && this.f36966b == bVar.f36966b && this.f36967c == bVar.f36967c && this.f36968d == bVar.f36968d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f36968d) + q2.d(this.f36967c, q2.d(this.f36966b, Integer.hashCode(this.f36965a) * 31, 31), 31);
        }

        public final String toString() {
            return androidx.core.view.j.e(this.f36967c, this.f36968d, ", style=", ")", e5.j(this.f36965a, this.f36966b, "GuidanceTimelineInterval(start=", ", end=", ", colorRes="));
        }

        public /* synthetic */ b(int i14, int i15, int i16, int i17, int i18, j jVar) {
            this(i14, i15, i16, (i18 & 8) != 0 ? 1 : i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidanceTimeline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f36960a = new Paint();
        this.f36961b = new Paint();
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidanceTimeline(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f36960a = new Paint();
        this.f36961b = new Paint();
        a(context);
    }
}
