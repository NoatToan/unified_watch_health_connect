package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.t;
import f12.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/HexagonLevelView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "contentDescription", "", "setLevelContentDescription", "(Ljava/lang/String;)V", "", "textShadow", "setTextShadow", "(Z)V", "value", "getLevel", "()I", "setLevel", "(I)V", "level", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HexagonLevelView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f47462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f47463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f47465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f47466g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HexagonLevelView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47464e = true;
        setLayerType(1, null);
        this.f47465f = new TextView(context);
        Typeface typefaceA = h22.a.a("font/roboto_regular.ttf", context);
        TextView textView = this.f47465f;
        textView.getClass();
        textView.setTypeface(typefaceA, 1);
        TextView textView2 = this.f47465f;
        textView2.getClass();
        textView2.setTextSize(TypedValue.applyDimension(2, 10.0f, getResources().getDisplayMetrics()));
        TextView textView3 = this.f47465f;
        textView3.getClass();
        textView3.setTextColor(a7.b.getColor(context, R.color.gcm_text_on_color));
        TextView textView4 = this.f47465f;
        textView4.getClass();
        textView4.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        TextView textView5 = this.f47465f;
        textView5.getClass();
        textView5.setLayoutParams(layoutParams);
        addView(this.f47465f);
        Drawable drawable = a7.b.getDrawable(context, R.drawable.badge_level_background);
        this.f47466g = drawable;
        setBackground(drawable);
        setClipToPadding(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149712n, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            this.f47461b = a(typedArrayObtainStyledAttributes.getString(1));
            this.f47462c = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
            this.f47463d = a(typedArrayObtainStyledAttributes.getString(3));
            if (isInEditMode()) {
                b(Math.min(getWidth(), getHeight()));
            }
            setLevel(0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static float a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Matcher matcher = Pattern.compile("(\\d+.?\\d*)%").matcher(str);
        if (matcher.find()) {
            return Float.valueOf(matcher.group(1)).floatValue() * 0.01f;
        }
        return 0.0f;
    }

    public final void b(float f14) {
        float f15 = 2;
        float f16 = (1 - (this.f47461b * f15)) * f14;
        if (f16 <= 0.0f) {
            return;
        }
        float f17 = getResources().getDisplayMetrics().density;
        float f18 = getResources().getDisplayMetrics().scaledDensity;
        float f19 = this.f47463d;
        float f22 = this.f47462c;
        if (f19 > 0.0f) {
            float f24 = (((int) (((double) ((f16 * f19) / f18)) + 0.5d)) + 1) * f18;
            if (f22 <= 0.0f || f22 <= f24) {
                f22 = f24;
            }
        }
        TextView textView = this.f47465f;
        textView.getClass();
        textView.setTextSize(0, f22);
        TextView textView2 = this.f47465f;
        textView2.getClass();
        Paint.FontMetrics fontMetrics = textView2.getPaint().getFontMetrics();
        double d14 = (fontMetrics.descent - fontMetrics.bottom) + (fontMetrics.ascent - fontMetrics.top);
        TextView textView3 = this.f47465f;
        textView3.getClass();
        textView3.setPadding(0, 0, 0, (int) (d14 + 0.5d));
        if (this.f47464e) {
            float f25 = f15 * this.f47463d * f17;
            TextView textView4 = this.f47465f;
            textView4.getClass();
            textView4.setShadowLayer(f25, 0.0f, 0.0f, a7.b.getColor(getContext(), R.color.gcm3_user_level_shadow));
        }
    }

    /* JADX INFO: renamed from: getLevel, reason: from getter */
    public final int getF47460a() {
        return this.f47460a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        b(Math.min(measuredWidth, measuredHeight));
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public final void setLevel(int i14) {
        this.f47460a = i14;
        if (i14 <= 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        TextView textView = this.f47465f;
        if (textView != null) {
            textView.setText(String.valueOf(this.f47460a));
        }
        Context context = getContext();
        u uVarA = u.a(this.f47460a);
        uVarA.getClass();
        int color = a7.b.getColor(context, t.a(uVarA));
        Drawable drawable = this.f47466g;
        if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final void setLevelContentDescription(String contentDescription) {
        setContentDescription(contentDescription);
        TextView textView = this.f47465f;
        if (textView != null) {
            textView.setImportantForAccessibility(2);
        }
    }

    public final void setTextShadow(boolean textShadow) {
        this.f47464e = textShadow;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/HexagonLevelView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PERCENT_PATTERN", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HexagonLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HexagonLevelView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ HexagonLevelView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
