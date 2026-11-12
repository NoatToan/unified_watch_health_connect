package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i3.e5;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003ijkB\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0016\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000eR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R*\u0010%\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(\"\u0004\b)\u0010\u000eR*\u0010*\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b*\u0010(\"\u0004\b,\u0010\u000eR$\u00101\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010#\"\u0004\b/\u00100R$\u00105\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010#\"\u0004\b4\u00100R0\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u0001062\f\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u0001068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010B\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010E\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010#\"\u0004\bD\u00100R$\u0010I\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010#\"\u0004\bH\u00100R$\u0010L\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010#\"\u0004\bK\u00100R$\u0010P\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010#\"\u0004\bO\u00100R$\u0010T\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010#\"\u0004\bS\u00100R$\u0010W\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010#\"\u0004\bV\u00100R$\u0010Z\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010#\"\u0004\bY\u00100R$\u0010]\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010#\"\u0004\b\\\u00100R$\u0010a\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010#\"\u0004\b`\u00100R(\u0010h\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006l"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker;", "Landroid/view/View;", "", "Ljava/lang/Runnable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "isDebug", "", "setDebug", "(Z)V", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemSelectedListener", "(Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker$b;)V", "hasSameWidth", "setSameWidth", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker$c;", "setOnWheelChangeListener", "(Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker$c;)V", "hasIndicator", "setIndicator", "hasCurtain", "setCurtain", "hasAtmospheric", "setAtmospheric", "", "value", "T", "I", "getCurrentItemPosition", "()I", "currentItemPosition", "isCyclic", "X0", "Z", "()Z", "setCyclic", "isCurved", "Y0", "setCurved", "count", "getVisibleItemCount", "setVisibleItemCount", "(I)V", "visibleItemCount", ModelSourceWrapper.POSITION, "getSelectedItemPosition", "setSelectedItemPosition", "selectedItemPosition", "", "data", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "", "text", "getMaximumWidthText", "()Ljava/lang/String;", "setMaximumWidthText", "(Ljava/lang/String;)V", "maximumWidthText", "getMaximumWidthTextPosition", "setMaximumWidthTextPosition", "maximumWidthTextPosition", TtmlNode.ATTR_TTS_COLOR, "getSelectedItemTextColor", "setSelectedItemTextColor", "selectedItemTextColor", "getItemTextColor", "setItemTextColor", "itemTextColor", "size", "getItemTextSize", "setItemTextSize", "itemTextSize", "space", "getItemSpace", "setItemSpace", "itemSpace", "getIndicatorSize", "setIndicatorSize", "indicatorSize", "getIndicatorColor", "setIndicatorColor", "indicatorColor", "getCurtainColor", "setCurtainColor", "curtainColor", "align", "getItemAlign", "setItemAlign", "itemAlign", "Landroid/graphics/Typeface;", "tf", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "typeface", "b", "c", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WheelPicker extends View implements Runnable {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int H0;
    public int I;
    public final int I0;
    public final int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public int P;
    public int P0;
    public int Q0;
    public int R0;
    public final int S0;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int currentItemPosition;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public boolean isCyclic;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public boolean isCurved;
    public boolean Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f45213a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f45214a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f45215b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f45216b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scroller f45217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f45218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f45220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f45221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f45222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f45223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f45224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Camera f45225k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f45226k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f45227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f45228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<?> f45229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f45230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f45233r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45234t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f45235v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f45237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f45238y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f45239z;

    public interface b {
    }

    public interface c {
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f45213a = new Handler();
        this.I0 = 50;
        this.J0 = 8000;
        this.S0 = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dx1.a.f61481b);
        typedArrayObtainStyledAttributes.getClass();
        this.f45229n = new ArrayList();
        this.f45238y = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, getResources().getDimensionPixelSize(R.dimen.WheelItemTextSize));
        this.f45231p = typedArrayObtainStyledAttributes.getInt(18, 7);
        this.P = typedArrayObtainStyledAttributes.getInt(16, 0);
        this.T0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.P0 = typedArrayObtainStyledAttributes.getInt(14, -1);
        this.f45230o = typedArrayObtainStyledAttributes.getString(13);
        this.f45237x = typedArrayObtainStyledAttributes.getColor(17, 0);
        this.f45236w = typedArrayObtainStyledAttributes.getColor(11, -7829368);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.WheelItemSpace));
        setCyclic(typedArrayObtainStyledAttributes.getBoolean(4, false));
        this.U0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        this.A = typedArrayObtainStyledAttributes.getColor(7, -1166541);
        this.f45239z = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, getResources().getDimensionPixelSize(R.dimen.WheelIndicatorSize));
        this.V0 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.B = typedArrayObtainStyledAttributes.getColor(2, -1996488705);
        this.W0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        setCurved(typedArrayObtainStyledAttributes.getBoolean(3, false));
        this.D = typedArrayObtainStyledAttributes.getInt(9, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        typedArrayObtainStyledAttributes.recycle();
        j();
        Paint paint = new Paint(69);
        this.f45215b = paint;
        paint.setTextSize(this.f45238y);
        if (string != null) {
            Typeface.createFromAsset(context.getAssets(), string);
        }
        i();
        e();
        this.f45217c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.I0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.J0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S0 = viewConfiguration.getScaledTouchSlop();
        this.f45221g = new Rect();
        this.f45222h = new Rect();
        this.f45223i = new Rect();
        this.f45224j = new Rect();
        this.f45225k = new Camera();
        this.f45227l = new Matrix();
        this.f45228m = new Matrix();
    }

    public final void a() {
        if (this.V0 || this.f45237x != 0) {
            Rect rect = this.f45221g;
            int i14 = rect.left;
            int i15 = this.L0;
            int i16 = this.F;
            this.f45224j.set(i14, i15 - i16, rect.right, i15 + i16);
        }
    }

    public final void b() {
        int i14;
        int i15 = this.D;
        Rect rect = this.f45221g;
        if (i15 != 1) {
            i14 = i15 != 2 ? this.K0 : rect.right;
        } else {
            i14 = rect.left;
        }
        this.M0 = i14;
        float f14 = this.L0;
        Paint paint = this.f45215b;
        paint.getClass();
        this.N0 = (int) (f14 - ((paint.descent() + paint.ascent()) / 2));
    }

    public final void c() {
        int size;
        int i14 = this.P;
        int i15 = this.E;
        int i16 = i14 * i15;
        if (this.isCyclic) {
            size = Integer.MIN_VALUE;
        } else {
            List<?> list = this.f45229n;
            list.getClass();
            size = ((list.size() - 1) * (-i15)) + i16;
        }
        this.f45226k0 = size;
        if (this.isCyclic) {
            i16 = Integer.MAX_VALUE;
        }
        this.H0 = i16;
    }

    public final void d() {
        if (this.U0) {
            int i14 = this.f45239z / 2;
            int i15 = this.L0;
            int i16 = this.F;
            int i17 = i15 + i16;
            int i18 = i15 - i16;
            Rect rect = this.f45221g;
            this.f45222h.set(rect.left, i17 - i14, rect.right, i17 + i14);
            this.f45223i.set(rect.left, i18 - i14, rect.right, i18 + i14);
        }
    }

    public final void e() {
        this.f45235v = 0;
        this.f45234t = 0;
        boolean z14 = this.T0;
        Paint paint = this.f45215b;
        if (z14) {
            paint.getClass();
            List<?> list = this.f45229n;
            list.getClass();
            this.f45234t = (int) paint.measureText(String.valueOf(list.get(0)));
        } else if (g(this.P0)) {
            paint.getClass();
            List<?> list2 = this.f45229n;
            list2.getClass();
            this.f45234t = (int) paint.measureText(String.valueOf(list2.get(this.P0)));
        } else if (TextUtils.isEmpty(this.f45230o)) {
            List<?> list3 = this.f45229n;
            list3.getClass();
            Iterator<?> it = list3.iterator();
            while (it.hasNext()) {
                String strValueOf = String.valueOf(it.next());
                paint.getClass();
                this.f45234t = Math.max(this.f45234t, (int) paint.measureText(strValueOf));
            }
        } else {
            paint.getClass();
            this.f45234t = (int) paint.measureText(this.f45230o);
        }
        paint.getClass();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f45235v = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public final void f(Canvas canvas, SpannableString spannableString, float f14, int i14, boolean z14) {
        Canvas canvas2;
        SpannableString spannableString2;
        float f15 = f14;
        int i15 = 0;
        while (i15 < spannableString.length()) {
            int iNextSpanTransition = spannableString.nextSpanTransition(i15, spannableString.length(), Object.class);
            Paint paint = this.f45215b;
            paint.getClass();
            float fMeasureText = paint.measureText(spannableString, i15, iNextSpanTransition) + f15;
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString.getSpans(i15, iNextSpanTransition, ForegroundColorSpan.class);
            if (foregroundColorSpanArr.length > 0) {
                int color = paint.getColor();
                if (z14) {
                    paint.setColor(foregroundColorSpanArr[0].getForegroundColor());
                }
                canvas2 = canvas;
                spannableString2 = spannableString;
                canvas2.drawText(spannableString2, i15, iNextSpanTransition, f15, i14, paint);
                paint.setColor(color);
            } else {
                canvas2 = canvas;
                spannableString2 = spannableString;
                canvas2.drawText(spannableString2, i15, iNextSpanTransition, f15, i14, paint);
            }
            f15 = fMeasureText + 50;
            canvas = canvas2;
            spannableString = spannableString2;
            i15 = iNextSpanTransition;
        }
    }

    public final boolean g(int i14) {
        if (i14 < 0) {
            return false;
        }
        List<?> list = this.f45229n;
        list.getClass();
        return i14 < list.size();
    }

    public int getCurrentItemPosition() {
        return this.currentItemPosition;
    }

    /* JADX INFO: renamed from: getCurtainColor, reason: from getter */
    public int getB() {
        return this.B;
    }

    public List<?> getData() {
        return this.f45229n;
    }

    /* JADX INFO: renamed from: getIndicatorColor, reason: from getter */
    public int getA() {
        return this.A;
    }

    /* JADX INFO: renamed from: getIndicatorSize, reason: from getter */
    public int getF45239z() {
        return this.f45239z;
    }

    /* JADX INFO: renamed from: getItemAlign, reason: from getter */
    public int getD() {
        return this.D;
    }

    /* JADX INFO: renamed from: getItemSpace, reason: from getter */
    public int getC() {
        return this.C;
    }

    /* JADX INFO: renamed from: getItemTextColor, reason: from getter */
    public int getF45236w() {
        return this.f45236w;
    }

    /* JADX INFO: renamed from: getItemTextSize, reason: from getter */
    public int getF45238y() {
        return this.f45238y;
    }

    /* JADX INFO: renamed from: getMaximumWidthText, reason: from getter */
    public String getF45230o() {
        return this.f45230o;
    }

    /* JADX INFO: renamed from: getMaximumWidthTextPosition, reason: from getter */
    public int getP0() {
        return this.P0;
    }

    /* JADX INFO: renamed from: getSelectedItemPosition, reason: from getter */
    public int getP() {
        return this.P;
    }

    /* JADX INFO: renamed from: getSelectedItemTextColor, reason: from getter */
    public int getF45237x() {
        return this.f45237x;
    }

    public Typeface getTypeface() {
        Paint paint = this.f45215b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    /* JADX INFO: renamed from: getVisibleItemCount, reason: from getter */
    public int getF45231p() {
        return this.f45231p;
    }

    public final void h(int i14, boolean z14) {
        this.f45219e = false;
        Scroller scroller = this.f45217c;
        if (!z14 || !scroller.isFinished()) {
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
            }
            List<?> list = this.f45229n;
            list.getClass();
            int iMax = Math.max(Math.min(i14, list.size() - 1), 0);
            this.P = iMax;
            this.currentItemPosition = iMax;
            this.O0 = 0;
            c();
            requestLayout();
            invalidate();
            return;
        }
        List<?> data = getData();
        data.getClass();
        int size = data.size();
        int currentItemPosition = i14 - getCurrentItemPosition();
        if (currentItemPosition == 0) {
            return;
        }
        if (this.isCyclic && Math.abs(currentItemPosition) > size / 2) {
            if (currentItemPosition > 0) {
                size = -size;
            }
            currentItemPosition += size;
        }
        scroller.startScroll(0, scroller.getCurrY(), 0, (-currentItemPosition) * this.E);
        this.f45213a.post(this);
    }

    public final void i() {
        int i14 = this.D;
        Paint paint = this.f45215b;
        if (i14 == 1) {
            paint.getClass();
            paint.setTextAlign(Paint.Align.LEFT);
        } else if (i14 != 2) {
            paint.getClass();
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.getClass();
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    public final void j() {
        int i14 = this.f45231p;
        if (i14 < 2) {
            org.apache.commons.lang3.e.u("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i14 % 2 == 0) {
            this.f45231p = i14 + 1;
        }
        int i15 = this.f45231p + 2;
        this.f45232q = i15;
        this.f45233r = i15 / 2;
    }

    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.training.atp.create.steps.WheelPicker.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        int mode2 = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        int i16 = this.f45234t;
        int i17 = this.f45235v;
        int i18 = this.f45231p;
        int iB = b71.i.b(i18, 1, this.C, i17 * i18);
        if (this.isCurved) {
            iB = (int) (((double) (iB * 2)) / 3.141592653589793d);
        }
        if (this.f45216b1) {
            i2.a.l(i2.f36769a, "WheelPicker", am.j.g(i16, iB, "Wheel's content size is (", ":", ")"));
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i16;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iB;
        if (this.f45216b1) {
            i2.a.l(i2.f36769a, "WheelPicker", am.j.g(paddingRight, paddingBottom, "Wheel's size is (", ":", ")"));
        }
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(paddingRight, size) : paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingBottom, size2) : paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Rect rect = this.f45221g;
        rect.set(paddingLeft, paddingTop, width, height);
        if (this.f45216b1) {
            i2.a.l(i2.f36769a, "WheelPicker", androidx.core.view.j.e(rect.left, rect.top, ":", ")", e5.j(rect.width(), rect.height(), "Wheel's drawn rect size is (", ":", ") and location is (")));
        }
        this.K0 = rect.centerX();
        this.L0 = rect.centerY();
        b();
        this.I = rect.height() / 2;
        int iHeight = rect.height() / this.f45231p;
        this.E = iHeight;
        this.F = iHeight / 2;
        c();
        d();
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i14;
        int i15;
        motionEvent.getClass();
        int action = motionEvent.getAction();
        Scroller scroller = this.f45217c;
        if (action == 0) {
            this.f45219e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f45218d;
            if (velocityTracker == null) {
                this.f45218d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            VelocityTracker velocityTracker2 = this.f45218d;
            velocityTracker2.getClass();
            velocityTracker2.addMovement(motionEvent);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                this.f45214a1 = true;
            }
            int y14 = (int) motionEvent.getY();
            this.Q0 = y14;
            this.R0 = y14;
            return true;
        }
        if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.Z0 || this.f45214a1) {
                VelocityTracker velocityTracker3 = this.f45218d;
                velocityTracker3.getClass();
                velocityTracker3.addMovement(motionEvent);
                VelocityTracker velocityTracker4 = this.f45218d;
                velocityTracker4.getClass();
                velocityTracker4.computeCurrentVelocity(1000, this.J0);
                this.f45214a1 = false;
                VelocityTracker velocityTracker5 = this.f45218d;
                velocityTracker5.getClass();
                int yVelocity = (int) velocityTracker5.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i16 = this.O0;
                if (iAbs > this.I0) {
                    scroller.fling(0, i16, 0, yVelocity, 0, 0, this.f45226k0, this.H0);
                    int finalY = scroller.getFinalY();
                    int finalY2 = scroller.getFinalY() % this.E;
                    if (Math.abs(finalY2) > this.F) {
                        int i17 = this.O0;
                        int i18 = this.E;
                        i15 = i17 < 0 ? (-i18) - finalY2 : i18 - finalY2;
                    } else {
                        i15 = -finalY2;
                    }
                    scroller.setFinalY(i15 + finalY);
                } else {
                    int i19 = i16 % this.E;
                    if (Math.abs(i19) > this.F) {
                        int i24 = this.O0;
                        int i25 = this.E;
                        i14 = i24 < 0 ? (-i25) - i19 : i25 - i19;
                    } else {
                        i14 = -i19;
                    }
                    scroller.startScroll(0, i16, 0, i14);
                }
                if (!this.isCyclic) {
                    int finalY3 = scroller.getFinalY();
                    int i26 = this.H0;
                    if (finalY3 > i26) {
                        scroller.setFinalY(i26);
                    } else {
                        int finalY4 = scroller.getFinalY();
                        int i27 = this.f45226k0;
                        if (finalY4 < i27) {
                            scroller.setFinalY(i27);
                        }
                    }
                }
                this.f45213a.post(this);
                VelocityTracker velocityTracker6 = this.f45218d;
                if (velocityTracker6 != null) {
                    velocityTracker6.recycle();
                    this.f45218d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker7 = this.f45218d;
                if (velocityTracker7 != null) {
                    velocityTracker7.recycle();
                    this.f45218d = null;
                    return true;
                }
            }
        } else {
            if (Math.abs(this.R0 - motionEvent.getY()) < this.S0) {
                this.Z0 = true;
                return true;
            }
            this.Z0 = false;
            VelocityTracker velocityTracker8 = this.f45218d;
            velocityTracker8.getClass();
            velocityTracker8.addMovement(motionEvent);
            float y15 = motionEvent.getY() - this.Q0;
            if (Math.abs(y15) >= 1.0f) {
                this.O0 = (int) (this.O0 + y15);
                this.Q0 = (int) motionEvent.getY();
                invalidate();
                return true;
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<?> list = this.f45229n;
        if (list == null || list.size() == 0) {
            return;
        }
        Scroller scroller = this.f45217c;
        if (scroller.isFinished() && !this.f45214a1) {
            int i14 = this.E;
            if (i14 == 0) {
                return;
            }
            int i15 = ((-this.O0) / i14) + this.P;
            List<?> list2 = this.f45229n;
            list2.getClass();
            int size = i15 % list2.size();
            if (size < 0) {
                List<?> list3 = this.f45229n;
                list3.getClass();
                size += list3.size();
            }
            if (this.f45216b1) {
                i2.a aVar = i2.f36769a;
                List<?> list4 = this.f45229n;
                list4.getClass();
                i2.a.l(aVar, "WheelPicker", size + ":" + list4.get(size) + ":" + this.O0);
            }
            this.currentItemPosition = size;
            if (this.f45220f != null && this.f45219e) {
                List<?> list5 = this.f45229n;
                list5.getClass();
                list5.get(size);
            }
        }
        if (scroller.computeScrollOffset()) {
            this.O0 = scroller.getCurrY();
            postInvalidate();
            this.f45213a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean hasAtmospheric) {
        this.W0 = hasAtmospheric;
        invalidate();
    }

    public void setCurtain(boolean hasCurtain) {
        this.V0 = hasCurtain;
        a();
        invalidate();
    }

    public void setCurtainColor(int i14) {
        this.B = i14;
        invalidate();
    }

    public void setCurved(boolean z14) {
        this.isCurved = z14;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z14) {
        this.isCyclic = z14;
        c();
        invalidate();
    }

    public void setData(List<?> list) {
        if (list == null) {
            x.l("WheelPicker's data can not be null!");
            return;
        }
        this.f45229n = list;
        if (this.P > list.size() - 1 || getCurrentItemPosition() > list.size() - 1) {
            this.currentItemPosition = list.size() - 1;
            this.P = getCurrentItemPosition();
        } else {
            this.P = getCurrentItemPosition();
        }
        this.O0 = 0;
        e();
        c();
        requestLayout();
        invalidate();
    }

    public final void setDebug(boolean isDebug) {
        this.f45216b1 = isDebug;
    }

    public void setIndicator(boolean hasIndicator) {
        this.U0 = hasIndicator;
        d();
        invalidate();
    }

    public void setIndicatorColor(int i14) {
        this.A = i14;
        invalidate();
    }

    public void setIndicatorSize(int i14) {
        this.f45239z = i14;
        d();
        invalidate();
    }

    public void setItemAlign(int i14) {
        this.D = i14;
        i();
        b();
        invalidate();
    }

    public void setItemSpace(int i14) {
        this.C = i14;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i14) {
        this.f45236w = i14;
        invalidate();
    }

    public void setItemTextSize(int i14) {
        Context context = getContext();
        context.getClass();
        if (c22.b.a(context) > 1.3f) {
            Context context2 = getContext();
            context2.getClass();
            i14 = (int) c22.b.b(context2, i14, 1.4f);
        }
        this.f45238y = i14;
        Paint paint = this.f45215b;
        paint.getClass();
        paint.setTextSize(this.f45238y);
        e();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            x.l("Maximum width text can not be null!");
            return;
        }
        this.f45230o = str;
        e();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i14) {
        if (!g(i14)) {
            List<?> list = this.f45229n;
            list.getClass();
            throw new ArrayIndexOutOfBoundsException(tn.k.e(list.size(), i14, "Maximum width text Position must in [0, ", "), but current is "));
        }
        this.P0 = i14;
        e();
        requestLayout();
        invalidate();
    }

    public void setOnItemSelectedListener(b listener) {
        this.f45220f = listener;
    }

    public void setOnWheelChangeListener(c listener) {
    }

    public void setSameWidth(boolean hasSameWidth) {
        this.T0 = hasSameWidth;
        e();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i14) {
        h(i14, true);
    }

    public void setSelectedItemTextColor(int i14) {
        this.f45237x = i14;
        a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f45215b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        e();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i14) {
        this.f45231p = i14;
        j();
        requestLayout();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker$a;", "", "<init>", "()V", "", "SCROLL_STATE_IDLE", "I", "SCROLL_STATE_DRAGGING", "SCROLL_STATE_SCROLLING", "ALIGN_CENTER", "ALIGN_LEFT", "ALIGN_RIGHT", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WheelPicker(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ WheelPicker(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
