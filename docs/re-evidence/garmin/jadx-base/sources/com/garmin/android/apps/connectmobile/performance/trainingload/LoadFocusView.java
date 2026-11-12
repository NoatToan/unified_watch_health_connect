package com.garmin.android.apps.connectmobile.performance.trainingload;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.t2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/LoadFocusView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setupAttributes", "(Landroid/util/AttributeSet;)V", "g", "I", "getLoadFocusValue", "()I", "setLoadFocusValue", "(I)V", "loadFocusValue", "h", "getLoadFocusOptMinValue", "setLoadFocusOptMinValue", "loadFocusOptMinValue", IntegerTokenConverter.CONVERTER_KEY, "getLoadFocusOptMaxValue", "setLoadFocusOptMaxValue", "loadFocusOptMaxValue", "", "j", "Ljava/lang/String;", "getLoadFocusLabel", "()Ljava/lang/String;", "setLoadFocusLabel", "(Ljava/lang/String;)V", "loadFocusLabel", JWKParameterNames.OCT_KEY_VALUE, "getLoadFocusColor", "setLoadFocusColor", "loadFocusColor", "", "l", "D", "getMaxValue", "()D", "setMaxValue", "(D)V", "maxValue", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LoadFocusView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f40163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f40165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f40166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int loadFocusValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int loadFocusOptMinValue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int loadFocusOptMaxValue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String loadFocusLabel;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int loadFocusColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public double maxValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f40175m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f40176n;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadFocusView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        Paint paint = new Paint();
        this.f40163a = paint;
        this.f40164b = 30.0f;
        this.f40165c = 10.0f;
        this.f40166d = 1.0f;
        this.loadFocusLabel = "";
        this.loadFocusColor = -1;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(context.getColor(R.color.gcm_text_primary));
        paint2.setTextSize(getResources().getDimension(R.dimen.andfont_body_1));
        paint2.setTextAlign(Paint.Align.LEFT);
        this.f40175m = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(context.getColor(R.color.gcm_text_primary));
        paint3.setTextSize(getResources().getDimension(R.dimen.andfont_body_1));
        paint3.setTextAlign(Paint.Align.RIGHT);
        this.f40176n = paint3;
        paint.setAntiAlias(true);
        setupAttributes(attributeSet);
        Rect rect = new Rect();
        String str = this.loadFocusLabel;
        paint2.getTextBounds(str, 0, str.length(), rect);
        this.f40167e = rect.height() / 2;
        this.f40168f = rect.width();
    }

    private final void setupAttributes(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, t2.f45042d, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(1);
        string.getClass();
        this.loadFocusLabel = string;
        this.loadFocusValue = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.loadFocusOptMinValue = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.loadFocusOptMaxValue = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.loadFocusColor = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Rect a(Paint paint, float f14, String str) {
        float dimension = getResources().getDimension(R.dimen.andfont_body_1);
        paint.setTextSize(dimension);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float fWidth = (f14 * dimension) / rect.width();
        if (fWidth < dimension) {
            paint.setTextSize(fWidth);
        }
        Rect rect2 = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect2);
        return rect2;
    }

    public final int getLoadFocusColor() {
        return this.loadFocusColor;
    }

    public final String getLoadFocusLabel() {
        return this.loadFocusLabel;
    }

    public final int getLoadFocusOptMaxValue() {
        return this.loadFocusOptMaxValue;
    }

    public final int getLoadFocusOptMinValue() {
        return this.loadFocusOptMinValue;
    }

    public final int getLoadFocusValue() {
        return this.loadFocusValue;
    }

    public final double getMaxValue() {
        return this.maxValue;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        double d14;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.maxValue > 0.0d) {
            Context context = getContext();
            context.getClass();
            if (c22.b.a(context) >= 1.5f) {
                width = getWidth() - 60;
                d14 = this.maxValue;
            } else {
                width = (getWidth() / 2.0f) - 30;
                d14 = this.maxValue;
            }
            this.f40166d = width / ((float) d14);
        }
        Context context2 = getContext();
        context2.getClass();
        float fA = c22.b.a(context2);
        Paint paint = this.f40175m;
        if (fA >= 1.5f) {
            Rect rectA = a(paint, getWidth(), this.loadFocusLabel);
            this.f40167e = rectA.height();
            this.f40168f = rectA.width();
            canvas.drawText(this.loadFocusLabel, getPaddingLeft(), this.f40167e, paint);
        } else {
            a(paint, getWidth() * 0.25f, this.loadFocusLabel);
            canvas.drawText(this.loadFocusLabel, getPaddingLeft(), (getHeight() * 0.5f) + this.f40167e, paint);
        }
        Context context3 = getContext();
        context3.getClass();
        float fA2 = c22.b.a(context3);
        Paint paint2 = this.f40176n;
        if (fA2 >= 1.5f) {
            canvas.drawText(String.valueOf(this.loadFocusValue), getResources().getDimension(R.dimen.spacing_small) + (2 * getPaddingStart()) + this.f40168f + a(paint2, getWidth(), String.valueOf(this.loadFocusValue)).width(), this.f40167e, paint2);
        } else {
            a(paint2, getWidth() * 0.45f, String.valueOf(this.loadFocusValue));
            canvas.drawText(String.valueOf(this.loadFocusValue), getWidth() * 0.45f, (getHeight() * 0.5f) + this.f40167e, paint2);
        }
        Paint.Style style = Paint.Style.FILL;
        Paint paint3 = this.f40163a;
        paint3.setStyle(style);
        paint3.setColor(this.loadFocusColor);
        Context context4 = getContext();
        context4.getClass();
        float fA3 = c22.b.a(context4);
        float f14 = this.f40165c;
        float f15 = this.f40164b;
        if (fA3 >= 1.5f) {
            float f16 = 50;
            canvas.drawRoundRect(new RectF(getPaddingStart(), this.f40167e + f16, (this.loadFocusValue * this.f40166d) + getPaddingStart(), (2 * f14) + this.f40167e + f16), f15, f15, paint3);
            invalidate();
        } else {
            canvas.drawRoundRect(new RectF(getWidth() * 0.5f, (getHeight() * 0.5f) - f14, (getWidth() * 0.5f) + (this.loadFocusValue * this.f40166d), (getHeight() * 0.5f) + f14), f15, f15, paint3);
        }
        paint3.setColor(a7.b.getColor(getContext(), R.color.gcm_icon_primary));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setPathEffect(new DashPathEffect(new float[]{6.0f, 3.0f}, 0.0f));
        paint3.setStrokeWidth(2.0f);
        Context context5 = getContext();
        context5.getClass();
        if (c22.b.a(context5) < 1069547520) {
            canvas.drawRoundRect(new RectF((getWidth() * 0.5f) + (this.loadFocusOptMinValue * this.f40166d), (getHeight() * 0.5f) - f14, (getWidth() * 0.5f) + (this.loadFocusOptMaxValue * this.f40166d), (getHeight() * 0.5f) + f14), f15, f15, paint3);
            return;
        }
        float f17 = 50;
        canvas.drawRoundRect(new RectF((this.loadFocusOptMinValue * this.f40166d) + getPaddingStart(), this.f40167e + f17, (this.loadFocusOptMaxValue * this.f40166d) + getPaddingStart(), (2 * f14) + this.f40167e + f17), f15, f15, paint3);
        invalidate();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.loadFocusValue = bundle.getInt("loadFocusValue", 0);
            this.loadFocusOptMinValue = bundle.getInt("loadFocusOptMinValue", 0);
            this.loadFocusOptMaxValue = bundle.getInt("loadFocusOptMaxValue", 0);
            String string = bundle.getString("loadFocusLabel", "");
            string.getClass();
            this.loadFocusLabel = string;
            this.loadFocusColor = bundle.getInt("loadFocusColor", 0);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("superState", Parcelable.class);
            } else {
                parcelable = bundle.getParcelable("superState");
                if (!(parcelable instanceof Parcelable)) {
                    parcelable = null;
                }
            }
            parcelable.getClass();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putInt("loadFocusValue", this.loadFocusValue);
        bundle.putInt("loadFocusOptMinValue", this.loadFocusOptMinValue);
        bundle.putInt("loadFocusOptMaxValue", this.loadFocusOptMaxValue);
        bundle.putString("loadFocusLabel", this.loadFocusLabel);
        bundle.putInt("loadFocusColor", this.loadFocusColor);
        bundle.putParcelable("superState", super.onSaveInstanceState());
        return bundle;
    }

    public final void setLoadFocusColor(int i14) {
        this.loadFocusColor = i14;
    }

    public final void setLoadFocusLabel(String str) {
        str.getClass();
        this.loadFocusLabel = str;
    }

    public final void setLoadFocusOptMaxValue(int i14) {
        this.loadFocusOptMaxValue = i14;
    }

    public final void setLoadFocusOptMinValue(int i14) {
        this.loadFocusOptMinValue = i14;
    }

    public final void setLoadFocusValue(int i14) {
        this.loadFocusValue = i14;
    }

    public final void setMaxValue(double d14) {
        this.maxValue = d14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/trainingload/LoadFocusView$a;", "", "<init>", "()V", "", "DEFAULT_COLOR", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadFocusView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LoadFocusView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
