package com.garmin.android.apps.connectmobile.hydration.presentation.detail;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import java.text.ParseException;
import java.util.ArrayDeque;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.b0;
import vp0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/detail/HydrationView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "", "setInitialHydrationValue", "(Ljava/lang/Double;)V", "", "waveShiftRatio", "setWaveShiftRatio", "(F)V", "waterLevelRatio", "setWaterLevelRatio", "setHydrationAnimValue", "(I)V", "ratio", "setAmplitudeRatio", "goal", "setHydrationGoal", "Lq22/b;", "unit", "setUnitOfMeasure", "(Lq22/b;)V", "", "contentDescription", "setContentDescription", "(Ljava/lang/String;)V", "a", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HydrationView extends View {
    public static final int E;
    public static final int F;
    public static final int I;
    public static final int P;
    public static final int T;
    public AnimatorSet A;
    public f B;
    public final ArrayDeque C;
    public final double D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f36664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f36665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f36669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f36671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f36672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BitmapShader f36673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f36674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f36675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f36676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f36677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bitmap f36678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bitmap f36679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f36680r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f36681t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f36682v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f36683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f36684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f36685y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ObjectAnimator f36686z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/hydration/presentation/detail/HydrationView$b", "Landroid/animation/AnimatorListenerAdapter;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f36687b = 0;

        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            super.onAnimationEnd(animator);
            HydrationView hydrationView = HydrationView.this;
            if (hydrationView.C.isEmpty()) {
                return;
            }
            hydrationView.postDelayed(new b0(hydrationView, 13), 5L);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/hydration/presentation/detail/HydrationView$c", "Landroid/animation/AnimatorListenerAdapter;", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f36690b;

        public c(double d14) {
            this.f36690b = d14;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            super.onAnimationEnd(animator);
            HydrationView hydrationView = HydrationView.this;
            double d14 = this.f36690b;
            hydrationView.f36669g = d14;
            f fVar = hydrationView.B;
            if (fVar != null) {
                hydrationView.f36667e = fVar.f179355c.a(d14, fVar.f179354b, false);
            } else {
                s.m("hydrationViewFormatter");
                throw null;
            }
        }
    }

    static {
        new a(null);
        E = R.color.gcm_hydration_wave_color;
        F = R.color.transparent;
        I = R.color.gcm_text_primary;
        P = R.color.gcm_text_secondary;
        T = R.color.gcm_border_divider_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HydrationView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Paint paint = new Paint();
        this.f36675m = paint;
        Paint paint2 = new Paint();
        this.f36676n = paint2;
        Paint paint3 = new Paint();
        this.f36677o = paint3;
        Paint paint4 = new Paint();
        Paint paint5 = new Paint();
        this.f36680r = paint5;
        this.f36682v = new Paint(1);
        Paint paint6 = new Paint();
        this.f36683w = paint6;
        Paint paint7 = new Paint();
        this.f36684x = paint7;
        Paint paint8 = new Paint();
        this.f36685y = paint8;
        this.C = new ArrayDeque();
        this.D = Math.pow(10.0d, 4);
        setUnitOfMeasure(q22.b.MILLILITER);
        this.f36674l = new Matrix();
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint2.setColor(a7.b.getColor(context, F));
        paint4.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint4.setStyle(style);
        paint4.setAntiAlias(true);
        this.f36664b = 0.05f;
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth((int) ((3.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f));
        paint3.setColor(a7.b.getColor(context, T));
        paint6.setColor(a7.b.getColor(context, P));
        paint6.setStyle(style);
        paint6.setAntiAlias(true);
        paint6.setTextSize(c22.b.b(context, c(13.0f), 1.5f));
        paint5.setColorFilter(new PorterDuffColorFilter(a7.b.getColor(context, R.color.gcm_icon_success), PorterDuff.Mode.SRC_IN));
        int i15 = I;
        paint8.setColor(a7.b.getColor(context, i15));
        paint8.setStyle(style);
        paint8.setAntiAlias(true);
        paint8.setTextSize(c22.b.b(context, c(42.0f), 1.5f));
        paint7.setColor(a7.b.getColor(context, i15));
        paint7.setStyle(style);
        paint7.setAntiAlias(true);
        paint7.setTextSize(c22.b.b(context, c(18.0f), 1.5f));
        Drawable drawable = a7.b.getDrawable(context, R.drawable.check);
        if (drawable != null) {
            drawable.setTint(a7.b.getColor(context, R.color.gcm_icon_success));
        }
        this.f36678p = drawable != null ? d7.b.b(drawable, 0, 0, 7) : null;
        this.f36679q = BitmapFactory.decodeResource(getResources(), 2131232296);
    }

    private final void setContentDescription(String contentDescription) {
        setContentDescription((CharSequence) contentDescription);
    }

    public final void a(Double d14) {
        if (d14 != null) {
            if (Double.compare(d14.doubleValue(), 0.0d) != 0) {
                double dDoubleValue = d14.doubleValue();
                double d15 = this.f36669g + dDoubleValue;
                b(d15 >= 0.0d ? d15 : 0.0d, dDoubleValue);
            }
        }
    }

    public final void b(double d14, double d15) {
        AnimatorSet animatorSet = this.A;
        if ((animatorSet != null ? animatorSet.isRunning() : false) || Double.compare(this.f36665c, 0.0d) == 0) {
            this.C.add(Double.valueOf(d15));
            AnimatorSet animatorSet2 = this.A;
            if (animatorSet2 != null) {
                animatorSet2.end();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "waterLevelRatio", this.f36671i, ((int) ((((double) 100) * d14) / this.f36665c)) / 100);
        objectAnimatorOfFloat.setDuration(1000 - ((long) 200));
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "amplitudeRatio", this.f36664b, 60.0f, 1.0f);
        long j8 = ((long) 500) + 1000;
        objectAnimatorOfFloat2.setDuration(j8);
        objectAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
        f fVar = this.B;
        if (fVar == null) {
            s.m("hydrationViewFormatter");
            throw null;
        }
        q22.b bVar = fVar.f179354b;
        q22.b bVar2 = q22.b.MILLILITER;
        double dF = bVar == bVar2 ? fVar.f179355c.f(d14, bVar2) : d14;
        double d16 = this.f36669g;
        double d17 = this.D;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "hydrationAnimValue", (int) (d16 * d17), (int) (dF * d17));
        objectAnimatorOfInt.setDuration(1000L);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "waveShiftRatio", 0.0f, 1.0f);
        this.f36686z = objectAnimatorOfFloat3;
        if (objectAnimatorOfFloat3 != null) {
            objectAnimatorOfFloat3.setDuration(j8);
            objectAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator());
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.A = animatorSet3;
        animatorSet3.addListener(new b());
        objectAnimatorOfInt.addListener(new c(d14));
        AnimatorSet animatorSet4 = this.A;
        if (animatorSet4 != null) {
            animatorSet4.playTogether(objectAnimatorOfFloat, this.f36686z, objectAnimatorOfFloat2, objectAnimatorOfInt);
        }
        AnimatorSet animatorSet5 = this.A;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final int c(float f14) {
        return (int) ((f14 * getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.start();
            Unit unit = Unit.INSTANCE;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.A;
        if (animatorSet != null) {
            animatorSet.cancel();
            Unit unit = Unit.INSTANCE;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws ParseException {
        String string;
        Bitmap bitmap;
        float f14;
        float fDescent;
        float fAscent;
        canvas.getClass();
        this.f36663a = canvas.getWidth();
        if (canvas.getHeight() < this.f36663a) {
            this.f36663a = canvas.getHeight();
        }
        BitmapShader bitmapShader = this.f36673k;
        Paint paint = this.f36675m;
        if (bitmapShader == null) {
            paint.setShader(null);
            return;
        }
        if (paint.getShader() == null) {
            paint.setShader(this.f36673k);
        }
        Matrix matrix = this.f36674l;
        matrix.getClass();
        matrix.setScale(1.0f, this.f36664b / 0.1f, 0.0f, this.f36670h);
        int width = getWidth();
        int height = getHeight();
        float f15 = width;
        float f16 = 2.0f;
        float f17 = f15 / 2.0f;
        float f18 = height;
        float f19 = f18 / 2.0f;
        matrix.postTranslate(this.f36672j * f15, (0.5f - this.f36671i) * f18);
        BitmapShader bitmapShader2 = this.f36673k;
        bitmapShader2.getClass();
        bitmapShader2.setLocalMatrix(matrix);
        Paint paint2 = this.f36677o;
        float strokeWidth = paint2.getStrokeWidth();
        float f22 = f17 - strokeWidth;
        canvas.drawCircle(f17, f19, f22, this.f36676n);
        canvas.drawCircle(f17, f19, f22, paint);
        if (strokeWidth > 0.0f) {
            canvas.drawCircle(f17, f19, ((f15 - strokeWidth) / 2.0f) - 1.0f, paint2);
        }
        float f24 = 10.0f;
        if (this.f36681t == null) {
            int i14 = (int) f22;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float width2 = (canvas2.getWidth() * 6.5f) / 10.0f;
            Bitmap bitmap2 = this.f36679q;
            if (bitmap2 != null) {
                Path path = new Path();
                path.addCircle(f17, f17, i14, Path.Direction.CCW);
                Paint paint3 = new Paint(1);
                paint3.setColor(-16777216);
                canvas2.clipPath(path, Region.Op.INTERSECT);
                canvas2.drawBitmap(bitmap2, width2, 0.0f, paint3);
            }
            this.f36681t = bitmapCreateBitmap;
        } else {
            f24 = 10.0f;
            f16 = 2.0f;
        }
        Bitmap bitmap3 = this.f36681t;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.f36682v);
        }
        String str = this.f36667e;
        Paint paint4 = this.f36684x;
        if (str != null) {
            Paint paint5 = this.f36685y;
            float f25 = 2;
            float fMeasureText = (f15 - paint5.measureText(str)) / f25;
            Context context = getContext();
            context.getClass();
            if (c22.b.a(context) >= 1.3f) {
                f14 = (4.5f * f18) / f24;
                fDescent = paint4.descent();
                fAscent = paint4.ascent();
            } else {
                f14 = (height * 5) / f24;
                fDescent = paint4.descent();
                fAscent = paint4.ascent();
            }
            float f26 = f14 - ((fAscent + fDescent) / f25);
            paint5.setTypeface(h22.a.a("font/roboto_regular.ttf", getContext()));
            String str2 = this.f36667e;
            if (str2 != null) {
                canvas.drawText(str2, fMeasureText, f26, paint5);
            }
        }
        String str3 = this.f36668f;
        if (str3 != null) {
            float f27 = 2;
            float fMeasureText2 = (f15 - paint4.measureText(str3)) / f27;
            float fAscent2 = ((height * 6) / f24) - ((paint4.ascent() + paint4.descent()) / f27);
            paint4.setTypeface(h22.a.a("font/roboto_regular.ttf", getContext()));
            canvas.drawText(str3, fMeasureText2, fAscent2, paint4);
        }
        String str4 = this.f36666d;
        if (str4 != null) {
            Paint paint6 = this.f36683w;
            float f28 = 2;
            float fMeasureText3 = (f15 - paint6.measureText(str4)) / f28;
            Context context2 = getContext();
            context2.getClass();
            float fAscent3 = c22.b.a(context2) >= 1.3f ? ((f18 * 7.2f) / f24) - ((paint6.ascent() + paint6.descent()) / f28) : ((height * 7) / f24) - ((paint6.ascent() + paint6.descent()) / f28);
            paint6.setTypeface(h22.a.a("font/roboto_light.ttf", getContext()));
            canvas.drawText(str4, fMeasureText3, fAscent3, paint6);
        }
        float f29 = (height * 8) / f24;
        double d14 = this.f36669g;
        double d15 = this.f36665c;
        f fVar = this.B;
        if (fVar == null) {
            s.m("hydrationViewFormatter");
            throw null;
        }
        int iA = jp0.c.a(d14, d15, fVar.f179354b, fVar.f179355c);
        if (iA >= 100 && (bitmap = this.f36678p) != null) {
            canvas.drawBitmap(bitmap, (width - bitmap.getWidth()) / f16, f29, this.f36680r);
        }
        f fVar2 = this.B;
        if (fVar2 == null) {
            s.m("hydrationViewFormatter");
            throw null;
        }
        String str5 = this.f36667e;
        String str6 = this.f36668f;
        String str7 = this.f36666d;
        String strValueOf = String.valueOf(iA);
        l22.b bVar = fVar2.f179353a;
        strValueOf.getClass();
        if (str5 == null || str6 == null) {
            string = bVar.getString(R.string.txt_empty_page_no_data);
        } else {
            string = (str7 == null || w.J(str7)) ? bVar.a(R.string.lbl_hydration_level_goal_value_only, str5, str6, strValueOf) : bVar.a(R.string.lbl_hydration_level_goal, str5, str6, str7, strValueOf);
        }
        setContentDescription(string);
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode != Integer.MIN_VALUE && (mode == 0 || mode != 1073741824)) {
            size = 0;
        }
        int mode2 = View.MeasureSpec.getMode(i15);
        int size2 = ((mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i15) : 0) + 2;
        if (size >= size2) {
            size = size2;
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i14, int i15, int i16, int i17) {
        super.onSizeChanged(i14, i15, i16, i17);
        this.f36663a = i14;
        if (i15 < i14) {
            this.f36663a = i15;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        double d14 = 6.283185307179586d / ((double) measuredWidth);
        float f14 = measuredHeight;
        float f15 = 0.1f * f14;
        this.f36670h = f14 * 0.5f;
        float f16 = measuredWidth;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int i18 = measuredWidth + 1;
        int i19 = measuredHeight + 1;
        float[] fArr = new float[i18];
        int color = a7.b.getColor(getContext(), E);
        paint.setColor(Color.argb(Math.round(Color.alpha(color) * 0.3f), Color.red(color), Color.green(color), Color.blue(color)));
        int i24 = 0;
        while (i24 < i18) {
            double d15 = d14;
            float fSin = (float) ((Math.sin(((double) i24) * d14) * ((double) f15)) + ((double) this.f36670h));
            int i25 = i24;
            float f17 = i25;
            canvas.drawLine(f17, fSin, f17, i19, paint);
            fArr[i25] = fSin;
            i24 = i25 + 1;
            d14 = d15;
        }
        paint.setColor(color);
        int i26 = (int) (f16 / 4);
        for (int i27 = 0; i27 < i18; i27++) {
            float f18 = i27;
            canvas.drawLine(f18, fArr[(i27 + i26) % i18], f18, i19, paint);
        }
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        this.f36673k = bitmapShader;
        this.f36675m.setShader(bitmapShader);
    }

    public final void setAmplitudeRatio(float ratio) {
        float f14 = ratio / 1000;
        if (this.f36664b == f14) {
            return;
        }
        this.f36664b = f14;
        invalidate();
    }

    public final void setHydrationAnimValue(int value) {
        double d14 = ((double) value) / this.D;
        if (this.f36669g == d14) {
            return;
        }
        this.f36669g = d14;
        f fVar = this.B;
        if (fVar == null) {
            s.m("hydrationViewFormatter");
            throw null;
        }
        this.f36667e = fVar.f179355c.a(d14, fVar.f179354b, false);
        invalidate();
    }

    public final void setHydrationGoal(Double goal) {
        if (goal == null) {
            this.f36665c = 0.0d;
            this.f36666d = "";
            return;
        }
        this.f36665c = goal.doubleValue();
        f fVar = this.B;
        if (fVar != null) {
            this.f36666d = fVar.f179355c.c(goal.doubleValue(), fVar.f179354b);
        } else {
            s.m("hydrationViewFormatter");
            throw null;
        }
    }

    public final void setInitialHydrationValue(Double value) {
        if (value != null) {
            double dDoubleValue = value.doubleValue();
            double d14 = this.f36669g;
            if (dDoubleValue <= 0.0d) {
                double d15 = (-1.0d) * d14;
                double d16 = d14 + d15;
                b(d16 >= 0.0d ? d16 : 0.0d, d15);
            } else if (Double.compare(value.doubleValue(), d14) != 0) {
                double dDoubleValue2 = value.doubleValue() - d14;
                double d17 = this.f36669g + dDoubleValue2;
                b(d17 >= 0.0d ? d17 : 0.0d, dDoubleValue2);
            }
        }
    }

    public final void setUnitOfMeasure(q22.b unit) {
        unit.getClass();
        Context context = getContext();
        context.getClass();
        f fVar = new f(new l22.a(context), unit);
        this.B = fVar;
        this.f36667e = fVar.f179355c.a(this.f36669g, fVar.f179354b, false);
        f fVar2 = this.B;
        if (fVar2 == null) {
            s.m("hydrationViewFormatter");
            throw null;
        }
        this.f36668f = fVar2.f179353a.getString(fVar2.f179354b.f142315d);
        setHydrationGoal(Double.valueOf(this.f36665c));
        invalidate();
    }

    public final void setWaterLevelRatio(float waterLevelRatio) {
        if (this.f36671i == waterLevelRatio) {
            return;
        }
        this.f36671i = waterLevelRatio;
        invalidate();
    }

    public final void setWaveShiftRatio(float waveShiftRatio) {
        if (this.f36672j == waveShiftRatio) {
            return;
        }
        this.f36672j = waveShiftRatio;
        invalidate();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/hydration/presentation/detail/HydrationView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_WAVE_COLOR", "I", "DEFAULT_WAVE_BACKGROUND_COLOR", "DEFAULT_VALUE_COLOR", "DEFAULT_GOAL_COLOR", "DEFAULT_BORDER_COLOR", "", "DEFAULT_AMPLITUDE_RATIO", "F", "DEFAULT_AMPLITUDE_VALUE", "DEFAULT_WATER_LEVEL_RATIO", "DEFAULT_WAVE_LENGTH_RATIO", "DEFAULT_WAVE_SHIFT_RATIO", "DEFAULT_WAVE_PROGRESS_VALUE", "DEFAULT_BORDER_WIDTH", "DEFAULT_VALUE_TEXT_SIZE", "DEFAULT_UOM_SIZE", "DEFAULT_GOAL_SIZE", "gcm-hydration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HydrationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HydrationView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ HydrationView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
