package com.garmin.android.consent.ui.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import b7.g;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import com.google.android.material.R;
import com.google.android.material.textfield.TextInputLayout;
import jj.p;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p92.y;
import p92.z;
import q92.w;
import qj.l;
import u12.e;
import v92.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/consent/ui/view/ConsentScreenView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/widget/ImageView$ScaleType;", "topImageScaleType", "", "setTopImageScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "", "headlineText", "setHeadlineText", "(Ljava/lang/String;)V", "confirmationErrorText", "setConfirmationError", "getConfirmationInput", "()Ljava/lang/String;", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConsentScreenView extends ScrollView {
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f49808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f49809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f49810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f49811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f49812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f49813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextInputLayout f49814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f49815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f49816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f49817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f49818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f49819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f49820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49822o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f49823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f49824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f49825r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49826t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f49827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f49828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f49829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f49830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f49831z;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49832a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.AGREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.DO_NOT_AGREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.OPT_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.GO_TO_OPT_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.GO_TO_OPT_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.CONFIRM_DELETE_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m.CONFIRM_DELETE_DATA_CANCEL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m.CONSENT_ACCESS_REQUIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f49832a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            ConsentScreenView consentScreenView = ConsentScreenView.this;
            TextInputLayout textInputLayout = consentScreenView.f49814g;
            if (textInputLayout == null) {
                s.m("confirmationInputView");
                throw null;
            }
            if (textInputLayout.isErrorEnabled()) {
                TextInputLayout textInputLayout2 = consentScreenView.f49814g;
                if (textInputLayout2 == null) {
                    s.m("confirmationInputView");
                    throw null;
                }
                textInputLayout2.setErrorEnabled(false);
                TextInputLayout textInputLayout3 = consentScreenView.f49814g;
                if (textInputLayout3 == null) {
                    s.m("confirmationInputView");
                    throw null;
                }
                textInputLayout3.setError(null);
                TextInputLayout textInputLayout4 = consentScreenView.f49814g;
                if (textInputLayout4 != null) {
                    textInputLayout4.setErrorIconDrawable((Drawable) null);
                } else {
                    s.m("confirmationInputView");
                    throw null;
                }
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f49819l = R.style.TextAppearance_AppCompat_Subhead;
        int i15 = R.style.TextAppearance_AppCompat_Body1;
        this.f49820m = i15;
        this.f49821n = i15;
        this.f49822o = i15;
        int i16 = R.style.Widget_AppCompat_Button;
        this.f49823p = i16;
        this.f49824q = i16;
        this.f49825r = i16;
        this.f49826t = com.garmin.android.apps.connectmobile.R.drawable.ic_error;
        this.f49827v = android.R.color.holo_red_light;
        this.f49828w = -1;
        this.f49829x = -1;
        this.f49830y = -1;
        this.f49831z = -1;
        this.A = -1;
        d(context, attributeSet);
    }

    public final void a(String str, String str2, boolean z14) {
        TextView textView = new TextView(getContext());
        textView.setPadding(0, this.f49829x, 0, 0);
        int i14 = s.g(str2, w.DI_CONNECT_DATA_DELETION_CONFIRMATION.f143796a) ? this.f49820m : this.f49819l;
        if (!z14) {
            i14 = this.f49821n;
        }
        textView.setTextAppearance(i14);
        textView.setText(str);
        int i15 = this.f49828w;
        if (i15 >= 0) {
            textView.setLineHeight(i15);
        }
        LinearLayout linearLayout = this.f49812e;
        if (linearLayout != null) {
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        } else {
            s.m("bodyViewGroup");
            throw null;
        }
    }

    public final void b(String str, View.OnClickListener onClickListener) {
        int i14 = this.A;
        TextView textView = new TextView(getContext());
        textView.setPadding(i14, i14, i14, i14);
        textView.setTextAppearance(this.f49822o);
        textView.setText(str);
        textView.setMinHeight((int) (48 * Resources.getSystem().getDisplayMetrics().density));
        textView.setGravity(17);
        textView.setOnClickListener(onClickListener);
        LinearLayout linearLayout = this.f49818k;
        if (linearLayout != null) {
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            s.m("termsViewGroup");
            throw null;
        }
    }

    public final int c(m mVar) {
        switch (b.f49832a[mVar.ordinal()]) {
            case 1:
                return this.f49823p;
            case 2:
                return this.f49825r;
            case 3:
                return this.f49824q;
            case 4:
                return this.f49825r;
            case 5:
                return this.f49823p;
            case 6:
                return this.f49824q;
            case 7:
                return this.f49824q;
            case 8:
                return this.f49825r;
            case 9:
                return this.f49823p;
            default:
                u0.r();
                return 0;
        }
    }

    @SuppressLint({"Recycle"})
    public final void d(Context context, AttributeSet attributeSet) {
        boolean z14;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        Number numberValueOf;
        TypedArray typedArrayObtainStyledAttributes = attributeSet != null ? context.obtainStyledAttributes(attributeSet, z.f136665a, com.garmin.android.apps.connectmobile.R.attr.consentScreenViewStyle, com.garmin.android.apps.connectmobile.R.style.Widget_ConsentTheme_ConsentScreen) : null;
        if (typedArrayObtainStyledAttributes != null) {
            try {
                z14 = typedArrayObtainStyledAttributes.getBoolean(5, false);
            } catch (Exception e4) {
                String strValueOf = String.valueOf(e4);
                y.f136664a.getClass();
                y.a.c("ConsentScreenView", strValueOf);
                z14 = false;
            }
        } else {
            z14 = false;
        }
        boolean z15 = true;
        View viewInflate = z14 ? LayoutInflater.from(context).inflate(com.garmin.android.apps.connectmobile.R.layout.consent_view_text_image_overlay, (ViewGroup) this, true) : LayoutInflater.from(context).inflate(com.garmin.android.apps.connectmobile.R.layout.consent_view, (ViewGroup) this, true);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.windowBackground, typedValue, true);
        int i14 = typedValue.type;
        if (i14 < 28 || i14 > 31) {
            try {
                Resources resources = getResources();
                int i15 = typedValue.resourceId;
                Resources.Theme theme = context.getTheme();
                ThreadLocal<TypedValue> threadLocal = g.f16255a;
                viewInflate.setBackground(resources.getDrawable(i15, theme));
            } catch (Resources.NotFoundException e14) {
                String strValueOf2 = String.valueOf(e14);
                y.f136664a.getClass();
                y.a.c("ConsentScreenView", strValueOf2);
            }
        } else {
            viewInflate.setBackgroundColor(typedValue.data);
        }
        this.f49808a = (LinearLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_content_container);
        this.f49809b = (ImageView) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_background_image);
        this.f49810c = findViewById(com.garmin.android.apps.connectmobile.R.id.consent_background_image_overlay);
        this.f49811d = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_headline);
        this.f49812e = (LinearLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_body);
        this.f49813f = (TextView) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_confirmation_body);
        this.f49814g = (TextInputLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_confirmation_input);
        this.f49815h = (LinearLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_btn_container);
        this.f49818k = (LinearLayout) findViewById(com.garmin.android.apps.connectmobile.R.id.consent_terms_policy);
        if (typedArrayObtainStyledAttributes != null) {
            try {
                int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(24, -1);
                this.f49828w = dimensionPixelSize4;
                TextView textView = this.f49811d;
                if (textView == null) {
                    s.m("headlineView");
                    throw null;
                }
                if (dimensionPixelSize4 >= 0) {
                    textView.setLineHeight(dimensionPixelSize4);
                }
                try {
                    int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                    if (dimensionPixelSize5 != -1) {
                        LinearLayout linearLayout = this.f49808a;
                        if (linearLayout == null) {
                            s.m("consentContentContainer");
                            throw null;
                        }
                        linearLayout.setPaddingRelative(dimensionPixelSize5, linearLayout.getPaddingTop(), dimensionPixelSize5, linearLayout.getPaddingBottom());
                    }
                } catch (Exception e15) {
                    String strValueOf3 = String.valueOf(e15);
                    y.f136664a.getClass();
                    y.a.c("ConsentScreenView", strValueOf3);
                }
                int dimensionPixelSize6 = (int) (8 * Resources.getSystem().getDisplayMetrics().density);
                try {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize6);
                } catch (Exception e16) {
                    String strValueOf4 = String.valueOf(e16);
                    y.f136664a.getClass();
                    y.a.c("ConsentScreenView", strValueOf4);
                    dimensionPixelSize = dimensionPixelSize6;
                }
                this.f49829x = dimensionPixelSize;
                try {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize6);
                } catch (Exception e17) {
                    String strValueOf5 = String.valueOf(e17);
                    y.f136664a.getClass();
                    y.a.c("ConsentScreenView", strValueOf5);
                    dimensionPixelSize2 = dimensionPixelSize6;
                }
                this.f49830y = dimensionPixelSize2;
                try {
                    dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize6);
                } catch (Exception e18) {
                    String strValueOf6 = String.valueOf(e18);
                    y.f136664a.getClass();
                    y.a.c("ConsentScreenView", strValueOf6);
                    dimensionPixelSize3 = dimensionPixelSize6;
                }
                this.f49831z = dimensionPixelSize3;
                try {
                    dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, dimensionPixelSize6);
                } catch (Exception e19) {
                    String strValueOf7 = String.valueOf(e19);
                    y.f136664a.getClass();
                    y.a.c("ConsentScreenView", strValueOf7);
                }
                this.A = dimensionPixelSize6;
                try {
                    int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(25, -2);
                    ImageView imageView = this.f49809b;
                    if (imageView == null) {
                        s.m("topImageView");
                        throw null;
                    }
                    imageView.setLayoutParams(new ConstraintLayout.b(-1, dimensionPixelOffset));
                    if (z14) {
                        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, -1);
                        if (dimensionPixelOffset2 >= 0) {
                            numberValueOf = Integer.valueOf(dimensionPixelOffset2);
                        } else {
                            numberValueOf = dimensionPixelOffset > 0 ? Float.valueOf(dimensionPixelOffset * 0.65f) : Float.valueOf(130 * Resources.getSystem().getDisplayMetrics().density);
                        }
                        TextView textView2 = this.f49811d;
                        if (textView2 == null) {
                            s.m("headlineView");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        layoutParams.getClass();
                        ((LinearLayout.LayoutParams) layoutParams).topMargin = numberValueOf.intValue();
                    }
                    try {
                        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(26);
                        if (drawable != null) {
                            View view2 = this.f49810c;
                            if (view2 == null) {
                                s.m("topImageOverlayView");
                                throw null;
                            }
                            view2.setBackground(drawable);
                        }
                    } catch (Exception e24) {
                        String strValueOf8 = String.valueOf(e24);
                        y.f136664a.getClass();
                        y.a.c("ConsentScreenView", strValueOf8);
                    }
                    try {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.style.TextAppearance_AppCompat_Headline);
                        TextView textView3 = this.f49811d;
                        if (textView3 == null) {
                            s.m("headlineView");
                            throw null;
                        }
                        textView3.setTextAppearance(resourceId);
                        try {
                            this.f49819l = typedArrayObtainStyledAttributes.getResourceId(3, R.style.TextAppearance_AppCompat_Subhead);
                        } catch (Exception e25) {
                            String strValueOf9 = String.valueOf(e25);
                            y.f136664a.getClass();
                            y.a.c("ConsentScreenView", strValueOf9);
                        }
                        try {
                            this.f49820m = typedArrayObtainStyledAttributes.getResourceId(2, R.style.TextAppearance_AppCompat_Body1);
                        } catch (Exception e26) {
                            String strValueOf10 = String.valueOf(e26);
                            y.f136664a.getClass();
                            y.a.c("ConsentScreenView", strValueOf10);
                        }
                        try {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(4, R.style.TextAppearance_AppCompat_Body1);
                            this.f49821n = resourceId2;
                            TextView textView4 = this.f49813f;
                            if (textView4 == null) {
                                s.m("confirmationTextView");
                                throw null;
                            }
                            textView4.setTextAppearance(resourceId2);
                            try {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, R.style.TextAppearance_AppCompat_Caption);
                                TextInputLayout textInputLayout = this.f49814g;
                                if (textInputLayout == null) {
                                    s.m("confirmationInputView");
                                    throw null;
                                }
                                EditText editText = textInputLayout.getEditText();
                                if (editText != null) {
                                    editText.setTextAppearance(resourceId3);
                                    Unit unit = Unit.INSTANCE;
                                }
                                try {
                                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(19, R.style.TextAppearance_AppCompat_Caption);
                                    TextInputLayout textInputLayout2 = this.f49814g;
                                    if (textInputLayout2 == null) {
                                        s.m("confirmationInputView");
                                        throw null;
                                    }
                                    textInputLayout2.setHintTextAppearance(resourceId4);
                                    try {
                                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(18, R.style.TextAppearance_AppCompat_Caption);
                                        TextInputLayout textInputLayout3 = this.f49814g;
                                        if (textInputLayout3 == null) {
                                            s.m("confirmationInputView");
                                            throw null;
                                        }
                                        textInputLayout3.setHelperTextTextAppearance(resourceId5);
                                        try {
                                            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(22, R.style.TextAppearance_AppCompat_Caption);
                                            TextInputLayout textInputLayout4 = this.f49814g;
                                            if (textInputLayout4 == null) {
                                                s.m("confirmationInputView");
                                                throw null;
                                            }
                                            textInputLayout4.setSuffixTextAppearance(resourceId6);
                                            int integer = 50;
                                            try {
                                                integer = typedArrayObtainStyledAttributes.getInteger(21, 50);
                                            } catch (Exception e27) {
                                                String strValueOf11 = String.valueOf(e27);
                                                y.f136664a.getClass();
                                                y.a.c("ConsentScreenView", strValueOf11);
                                            }
                                            TextInputLayout textInputLayout5 = this.f49814g;
                                            if (textInputLayout5 == null) {
                                                s.m("confirmationInputView");
                                                throw null;
                                            }
                                            EditText editText2 = textInputLayout5.getEditText();
                                            if (editText2 != null) {
                                                editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
                                                Unit unit2 = Unit.INSTANCE;
                                            }
                                            try {
                                                z15 = typedArrayObtainStyledAttributes.getBoolean(20, true);
                                            } catch (Exception e28) {
                                                String strValueOf12 = String.valueOf(e28);
                                                y.f136664a.getClass();
                                                y.a.c("ConsentScreenView", strValueOf12);
                                            }
                                            TextInputLayout textInputLayout6 = this.f49814g;
                                            if (z15) {
                                                if (textInputLayout6 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                textInputLayout6.setSuffixText(context.getString(com.garmin.android.apps.connectmobile.R.string.consent_lib_lbl_show));
                                                TextInputLayout textInputLayout7 = this.f49814g;
                                                if (textInputLayout7 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                EditText editText3 = textInputLayout7.getEditText();
                                                if (editText3 != null) {
                                                    editText3.setTransformationMethod(new PasswordTransformationMethod());
                                                    Unit unit3 = Unit.INSTANCE;
                                                }
                                            } else {
                                                if (textInputLayout6 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                textInputLayout6.setSuffixText(context.getString(com.garmin.android.apps.connectmobile.R.string.consent_lib_lbl_hide));
                                                TextInputLayout textInputLayout8 = this.f49814g;
                                                if (textInputLayout8 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                EditText editText4 = textInputLayout8.getEditText();
                                                if (editText4 != null) {
                                                    editText4.setTransformationMethod(null);
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                            }
                                            try {
                                                TextInputLayout textInputLayout9 = this.f49814g;
                                                if (textInputLayout9 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                ViewParent parent = textInputLayout9.getSuffixTextView().getParent();
                                                parent.getClass();
                                                ((LinearLayout) parent).setGravity(16);
                                                TextInputLayout textInputLayout10 = this.f49814g;
                                                if (textInputLayout10 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                textInputLayout10.getSuffixTextView().setOnClickListener(new e(25, this, context));
                                                TextInputLayout textInputLayout11 = this.f49814g;
                                                if (textInputLayout11 == null) {
                                                    s.m("confirmationInputView");
                                                    throw null;
                                                }
                                                ViewGroup.LayoutParams layoutParams2 = textInputLayout11.getLayoutParams();
                                                layoutParams2.getClass();
                                                ((LinearLayout.LayoutParams) layoutParams2).topMargin = this.f49830y;
                                                try {
                                                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(17, R.style.TextAppearance_AppCompat_Caption);
                                                    TextInputLayout textInputLayout12 = this.f49814g;
                                                    if (textInputLayout12 == null) {
                                                        s.m("confirmationInputView");
                                                        throw null;
                                                    }
                                                    textInputLayout12.setErrorTextAppearance(resourceId7);
                                                    int resourceId8 = android.R.color.holo_red_light;
                                                    try {
                                                        resourceId8 = typedArrayObtainStyledAttributes.getResourceId(15, android.R.color.holo_red_light);
                                                    } catch (Exception e29) {
                                                        String strValueOf13 = String.valueOf(e29);
                                                        y.f136664a.getClass();
                                                        y.a.c("ConsentScreenView", strValueOf13);
                                                    }
                                                    this.f49827v = resourceId8;
                                                    int resourceId9 = com.garmin.android.apps.connectmobile.R.drawable.ic_error;
                                                    try {
                                                        resourceId9 = typedArrayObtainStyledAttributes.getResourceId(16, com.garmin.android.apps.connectmobile.R.drawable.ic_error);
                                                    } catch (Exception e34) {
                                                        String strValueOf14 = String.valueOf(e34);
                                                        y.f136664a.getClass();
                                                        y.a.c("ConsentScreenView", strValueOf14);
                                                    }
                                                    this.f49826t = resourceId9;
                                                    try {
                                                        this.f49823p = typedArrayObtainStyledAttributes.getResourceId(10, R.style.Widget_AppCompat_Button);
                                                    } catch (Exception e35) {
                                                        String strValueOf15 = String.valueOf(e35);
                                                        y.f136664a.getClass();
                                                        y.a.c("ConsentScreenView", strValueOf15);
                                                    }
                                                    try {
                                                        this.f49824q = typedArrayObtainStyledAttributes.getResourceId(8, R.style.Widget_AppCompat_Button);
                                                    } catch (Exception e36) {
                                                        String strValueOf16 = String.valueOf(e36);
                                                        y.f136664a.getClass();
                                                        y.a.c("ConsentScreenView", strValueOf16);
                                                    }
                                                    try {
                                                        this.f49825r = typedArrayObtainStyledAttributes.getResourceId(9, R.style.Widget_AppCompat_Button);
                                                    } catch (Exception e37) {
                                                        String strValueOf17 = String.valueOf(e37);
                                                        y.f136664a.getClass();
                                                        y.a.c("ConsentScreenView", strValueOf17);
                                                    }
                                                    try {
                                                        this.f49822o = typedArrayObtainStyledAttributes.getResourceId(14, R.style.TextAppearance_AppCompat_Body1);
                                                    } catch (Exception e38) {
                                                        String strValueOf18 = String.valueOf(e38);
                                                        y.f136664a.getClass();
                                                        y.a.c("ConsentScreenView", strValueOf18);
                                                    }
                                                } catch (Exception e39) {
                                                    String strValueOf19 = String.valueOf(e39);
                                                    y.f136664a.getClass();
                                                    y.a.c("ConsentScreenView", strValueOf19);
                                                }
                                            } catch (Exception e44) {
                                                String strValueOf20 = String.valueOf(e44);
                                                y.f136664a.getClass();
                                                y.a.c("ConsentScreenView", strValueOf20);
                                            }
                                        } catch (Exception e45) {
                                            String strValueOf21 = String.valueOf(e45);
                                            y.f136664a.getClass();
                                            y.a.c("ConsentScreenView", strValueOf21);
                                        }
                                    } catch (Exception e46) {
                                        String strValueOf22 = String.valueOf(e46);
                                        y.f136664a.getClass();
                                        y.a.c("ConsentScreenView", strValueOf22);
                                    }
                                } catch (Exception e47) {
                                    String strValueOf23 = String.valueOf(e47);
                                    y.f136664a.getClass();
                                    y.a.c("ConsentScreenView", strValueOf23);
                                }
                            } catch (Exception e48) {
                                String strValueOf24 = String.valueOf(e48);
                                y.f136664a.getClass();
                                y.a.c("ConsentScreenView", strValueOf24);
                            }
                        } catch (Exception e49) {
                            String strValueOf25 = String.valueOf(e49);
                            y.f136664a.getClass();
                            y.a.c("ConsentScreenView", strValueOf25);
                        }
                    } catch (Exception e54) {
                        String strValueOf26 = String.valueOf(e54);
                        y.f136664a.getClass();
                        y.a.c("ConsentScreenView", strValueOf26);
                    }
                } catch (Exception e55) {
                    String strValueOf27 = String.valueOf(e55);
                    y.f136664a.getClass();
                    y.a.c("ConsentScreenView", strValueOf27);
                }
            } catch (Exception e56) {
                String strValueOf28 = String.valueOf(e56);
                y.f136664a.getClass();
                y.a.c("ConsentScreenView", strValueOf28);
            }
        }
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
            Unit unit5 = Unit.INSTANCE;
        }
    }

    public final void e(Uri uri) {
        k kVarC;
        p pVarC = com.bumptech.glide.b.c(getContext());
        pVarC.getClass();
        char[] cArr = qj.m.f144982a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            l.c(getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity activityA = p.a(getContext());
            if (activityA != null && (activityA instanceof androidx.fragment.app.m)) {
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) activityA;
                p1.a<View, Fragment> aVar = pVarC.f98927c;
                aVar.clear();
                p.b(mVar.getSupportFragmentManager().f7372c.f(), aVar);
                View viewFindViewById = mVar.findViewById(android.R.id.content);
                Fragment fragment = null;
                for (View view2 = this; !view2.equals(viewFindViewById) && (fragment = aVar.get(view2)) == null && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
                }
                aVar.clear();
                kVarC = fragment != null ? pVarC.d(fragment) : pVarC.e(mVar);
            } else {
                kVarC = pVarC.c(getContext().getApplicationContext());
            }
        } else {
            kVarC = pVarC.c(getContext().getApplicationContext());
        }
        j jVarH = kVarC.d(Drawable.class).H(uri);
        ImageView imageView = this.f49809b;
        if (imageView == null) {
            s.m("topImageView");
            throw null;
        }
        jVarH.E(imageView);
    }

    public final void f(m mVar, String str, View.OnClickListener onClickListener) {
        mVar.getClass();
        if (this.f49816i == null) {
            Button button = new Button(getContext(), null, 0, c(mVar));
            this.f49816i = button;
            LinearLayout linearLayout = this.f49815h;
            if (linearLayout == null) {
                s.m("buttonsContainer");
                throw null;
            }
            linearLayout.addView(button);
            Button button2 = this.f49816i;
            if (button2 == null) {
                s.m("primaryButtonView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
            layoutParams.getClass();
            ((LinearLayout.LayoutParams) layoutParams).topMargin = this.f49830y;
        }
        Button button3 = this.f49816i;
        if (button3 == null) {
            s.m("primaryButtonView");
            throw null;
        }
        button3.setText(str);
        Button button4 = this.f49816i;
        if (button4 != null) {
            button4.setOnClickListener(onClickListener);
        } else {
            s.m("primaryButtonView");
            throw null;
        }
    }

    public final void g(m mVar, String str, View.OnClickListener onClickListener) {
        mVar.getClass();
        if (this.f49817j == null) {
            Button button = new Button(getContext(), null, 0, c(mVar));
            this.f49817j = button;
            LinearLayout linearLayout = this.f49815h;
            if (linearLayout == null) {
                s.m("buttonsContainer");
                throw null;
            }
            linearLayout.addView(button);
            Button button2 = this.f49817j;
            if (button2 == null) {
                s.m("secondaryButtonView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = button2.getLayoutParams();
            layoutParams.getClass();
            ((LinearLayout.LayoutParams) layoutParams).topMargin = this.f49831z;
        }
        Button button3 = this.f49817j;
        if (button3 == null) {
            s.m("secondaryButtonView");
            throw null;
        }
        button3.setText(str);
        Button button4 = this.f49817j;
        if (button4 != null) {
            button4.setOnClickListener(onClickListener);
        } else {
            s.m("secondaryButtonView");
            throw null;
        }
    }

    public final String getConfirmationInput() {
        Editable text;
        TextInputLayout textInputLayout = this.f49814g;
        if (textInputLayout == null) {
            s.m("confirmationInputView");
            throw null;
        }
        EditText editText = textInputLayout.getEditText();
        if (editText == null || (text = editText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final void setConfirmationError(String confirmationErrorText) {
        Drawable background;
        Drawable drawableMutate;
        confirmationErrorText.getClass();
        TextInputLayout textInputLayout = this.f49814g;
        if (textInputLayout == null) {
            s.m("confirmationInputView");
            throw null;
        }
        textInputLayout.setErrorEnabled(true);
        TextInputLayout textInputLayout2 = this.f49814g;
        if (textInputLayout2 == null) {
            s.m("confirmationInputView");
            throw null;
        }
        textInputLayout2.setError(confirmationErrorText);
        TextInputLayout textInputLayout3 = this.f49814g;
        if (textInputLayout3 == null) {
            s.m("confirmationInputView");
            throw null;
        }
        textInputLayout3.setErrorIconDrawable(this.f49826t);
        TextInputLayout textInputLayout4 = this.f49814g;
        if (textInputLayout4 == null) {
            s.m("confirmationInputView");
            throw null;
        }
        EditText editText = textInputLayout4.getEditText();
        if (editText != null && (background = editText.getBackground()) != null && (drawableMutate = background.mutate()) != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(a7.b.getColor(getContext(), this.f49827v), PorterDuff.Mode.SRC_ATOP));
        }
        TextInputLayout textInputLayout5 = this.f49814g;
        if (textInputLayout5 == null) {
            s.m("confirmationInputView");
            throw null;
        }
        EditText editText2 = textInputLayout5.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new c());
        }
    }

    public final void setHeadlineText(String headlineText) {
        TextView textView = this.f49811d;
        if (textView != null) {
            textView.setText(headlineText);
        } else {
            s.m("headlineView");
            throw null;
        }
    }

    public final void setTopImageScaleType(ImageView.ScaleType topImageScaleType) {
        topImageScaleType.getClass();
        ImageView imageView = this.f49809b;
        if (imageView != null) {
            imageView.setScaleType(topImageScaleType);
        } else {
            s.m("topImageView");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/consent/ui/view/ConsentScreenView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "VERTICAL_VIEWS_MARGIN_DP", "I", "HEADLINE_OVERLAY_MARGIN_TOP_DP", "", "HEADLINE_OVERLAY_MARGIN_TOP_IMAGE_PERCENT", "F", "PASSWORD_MAX_LENGTH_DEFAULT", "MIN_REQUIRED_HEIGHT", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsentScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ConsentScreenView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConsentScreenView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public ConsentScreenView(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        this.f49819l = R.style.TextAppearance_AppCompat_Subhead;
        int i16 = R.style.TextAppearance_AppCompat_Body1;
        this.f49820m = i16;
        this.f49821n = i16;
        this.f49822o = i16;
        int i17 = R.style.Widget_AppCompat_Button;
        this.f49823p = i17;
        this.f49824q = i17;
        this.f49825r = i17;
        this.f49826t = com.garmin.android.apps.connectmobile.R.drawable.ic_error;
        this.f49827v = android.R.color.holo_red_light;
        this.f49828w = -1;
        this.f49829x = -1;
        this.f49830y = -1;
        this.f49831z = -1;
        this.A = -1;
        d(context, attributeSet);
    }
}
