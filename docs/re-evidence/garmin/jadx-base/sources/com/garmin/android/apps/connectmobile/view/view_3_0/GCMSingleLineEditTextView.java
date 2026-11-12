package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c32.f;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import g22.n;
import go1.g0;
import j20.x;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001:\u0004?@ABB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u001aR.\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010/\u001a\u0004\u0018\u00010$2\b\u0010\u000e\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R*\u00106\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010:\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R*\u0010>\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105¨\u0006C"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getText", "()Ljava/lang/String;", "", "value", "o", "Z", "getHasError", "()Z", "setHasError", "(Z)V", "hasError", "p", "Ljava/lang/String;", "getErrorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "errorMessage", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;", "getActionButtonData", "()Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;", "setActionButtonData", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;)V", "actionButtonData", "Landroid/graphics/drawable/Drawable;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Landroid/graphics/drawable/Drawable;", "getNonEditingBackground", "()Landroid/graphics/drawable/Drawable;", "setNonEditingBackground", "(Landroid/graphics/drawable/Drawable;)V", "nonEditingBackground", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getEditingBackground", "setEditingBackground", "editingBackground", "v", "I", "getNonEditingValueColor", "()I", "setNonEditingValueColor", "(I)V", "nonEditingValueColor", "w", "getEditingValueColor", "setEditingValueColor", "editingValueColor", "x", "getActionButtonColor", "setActionButtonColor", "actionButtonColor", "d", "a", "b", "c", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMSingleLineEditTextView extends ConstraintLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f47803y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f47805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f47806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l<? super String, Unit> f47807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.a<Unit> f47808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.a<Unit> f47809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MultiLineImeEditText f47811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f47812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f47813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f47814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f47815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f47816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f47817n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean hasError;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String errorMessage;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public a actionButtonData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Drawable nonEditingBackground;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Drawable editingBackground;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int nonEditingValueColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int editingValueColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int actionButtonColor;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;", "", "", "text", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Le23/a;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f47827b;

        public a(String str, e23.a<Unit> aVar) {
            str.getClass();
            aVar.getClass();
            this.f47826a = str;
            this.f47827b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47826a.equals(aVar.f47826a) && this.f47827b.equals(aVar.f47827b);
        }

        public final int hashCode() {
            return this.f47827b.hashCode() + (this.f47826a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonData(text=" + this.f47826a + ", action=" + this.f47827b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$c;", "Landroid/text/InputFilter;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements InputFilter {
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
            charSequence.getClass();
            while (i14 < i15) {
                int type = Character.getType(charSequence.charAt(i14));
                if (type == 19 || type == 28) {
                    return "";
                }
                i14++;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$e", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i14 = GCMSingleLineEditTextView.f47803y;
            GCMSingleLineEditTextView.this.l();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMSingleLineEditTextView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47804a = true;
        this.nonEditingValueColor = a7.b.getColor(context, R.color.gray_black_static);
        this.editingValueColor = a7.b.getColor(context, R.color.gray_black_static);
        this.actionButtonColor = a7.b.getColor(context, R.color.gray_black_static);
        LayoutInflater.from(context).inflate(R.layout.edit_text_single_line, this);
        setLayoutTransition(new LayoutTransition());
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        View viewFindViewById = findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById.getClass();
        MultiLineImeEditText multiLineImeEditText = (MultiLineImeEditText) viewFindViewById;
        this.f47811h = multiLineImeEditText;
        View viewFindViewById2 = findViewById(R.id.inline_text_field_error_icon);
        viewFindViewById2.getClass();
        this.f47812i = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.inline_text_field_edit_info);
        viewFindViewById3.getClass();
        View viewFindViewById4 = findViewById(R.id.inline_text_field_character_count);
        viewFindViewById4.getClass();
        this.f47813j = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.inline_text_field_clear_button);
        viewFindViewById5.getClass();
        ImageView imageView = (ImageView) viewFindViewById5;
        this.f47814k = imageView;
        View viewFindViewById6 = findViewById(R.id.inline_text_field_button_separator);
        viewFindViewById6.getClass();
        this.f47815l = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.inline_text_field_action_button);
        viewFindViewById7.getClass();
        this.f47816m = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.error_text_view);
        viewFindViewById8.getClass();
        this.f47817n = (TextView) viewFindViewById8;
        final int i15 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: h32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMSingleLineEditTextView f81381b;

            {
                this.f81381b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        GCMSingleLineEditTextView gCMSingleLineEditTextView = this.f81381b;
                        gCMSingleLineEditTextView.f47810g = !gCMSingleLineEditTextView.f47810g;
                        gCMSingleLineEditTextView.j();
                        break;
                    default:
                        Editable text = this.f81381b.f47811h.getText();
                        if (text != null) {
                            text.clear();
                        }
                        break;
                }
            }
        });
        int i16 = 6;
        multiLineImeEditText.setExtraOnFocusChangeListener(new f(this, i16));
        multiLineImeEditText.addTextChangedListener(new e());
        multiLineImeEditText.setOnEditorActionListener(new bl0.a(this, i16));
        final int i17 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: h32.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMSingleLineEditTextView f81381b;

            {
                this.f81381b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        GCMSingleLineEditTextView gCMSingleLineEditTextView = this.f81381b;
                        gCMSingleLineEditTextView.f47810g = !gCMSingleLineEditTextView.f47810g;
                        gCMSingleLineEditTextView.j();
                        break;
                    default:
                        Editable text = this.f81381b.f47811h.getText();
                        if (text != null) {
                            text.clear();
                        }
                        break;
                }
            }
        });
        setNonEditingBackground(new ColorDrawable(a7.b.getColor(context, R.color.gcm_surface_1)));
        setEditingBackground(new ColorDrawable(a7.b.getColor(context, R.color.gcm_surface_2)));
        setNonEditingValueColor(a7.b.getColor(context, R.color.gcm_text_primary));
        setEditingValueColor(a7.b.getColor(context, R.color.gcm_text_primary));
        setActionButtonColor(a7.b.getColor(context, R.color.teal_70));
        j();
    }

    public final int getActionButtonColor() {
        return this.actionButtonColor;
    }

    public final a getActionButtonData() {
        return this.actionButtonData;
    }

    public final Drawable getEditingBackground() {
        return this.editingBackground;
    }

    public final int getEditingValueColor() {
        return this.editingValueColor;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final Drawable getNonEditingBackground() {
        return this.nonEditingBackground;
    }

    public final int getNonEditingValueColor() {
        return this.nonEditingValueColor;
    }

    public final String getText() {
        MultiLineImeEditText multiLineImeEditText = this.f47811h;
        if (multiLineImeEditText.getVisibility() == 0) {
            return String.valueOf(multiLineImeEditText.getText());
        }
        return null;
    }

    public final void i(d dVar) {
        this.f47804a = dVar.f47837j;
        Integer num = dVar.f47830c;
        this.f47805b = num;
        this.f47808e = dVar.f47832e;
        this.f47807d = dVar.f47833f;
        this.f47809f = dVar.f47834g;
        setActionButtonData(dVar.f47835h);
        this.f47806c = dVar.f47839l;
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            arrayList.add(new InputFilter.LengthFilter(num.intValue()));
        }
        if (s.g(this.f47806c, Boolean.TRUE)) {
            arrayList.add(new c());
        }
        boolean zIsEmpty = arrayList.isEmpty();
        MultiLineImeEditText multiLineImeEditText = this.f47811h;
        if (!zIsEmpty) {
            multiLineImeEditText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
        String str = dVar.f47828a;
        str.getClass();
        multiLineImeEditText.setText(str);
        multiLineImeEditText.setHint(dVar.f47829b);
        Editable text = multiLineImeEditText.getText();
        multiLineImeEditText.setSelection(text != null ? text.length() : 0);
        Integer num2 = dVar.f47831d;
        if (num2 != null) {
            multiLineImeEditText.addTextChangedListener(new g22.d(num2, multiLineImeEditText));
        }
        multiLineImeEditText.setImeOptions(6);
        multiLineImeEditText.setRawInputType(dVar.f47836i);
        String str2 = dVar.f47838k;
        if (str2 != null) {
            multiLineImeEditText.setKeyListener(DigitsKeyListener.getInstance(str2));
        }
        l();
    }

    public final void j() {
        e23.a<Unit> aVar;
        if (this.f47810g && (aVar = this.f47808e) != null) {
            aVar.invoke();
        }
        char c14 = 1;
        setClickable(!this.f47810g);
        setBackground(this.f47810g ? this.editingBackground : this.nonEditingBackground);
        boolean z14 = this.f47810g;
        ValueAnimator duration = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z14 ? this.nonEditingValueColor : this.editingValueColor), Integer.valueOf(z14 ? this.editingValueColor : this.nonEditingValueColor)).setDuration(200L);
        final int i14 = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMSingleLineEditTextView f81383b;

            {
                this.f81383b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i14;
                GCMSingleLineEditTextView gCMSingleLineEditTextView = this.f81383b;
                switch (i15) {
                    case 0:
                        int i16 = GCMSingleLineEditTextView.f47803y;
                        valueAnimator.getClass();
                        MultiLineImeEditText multiLineImeEditText = gCMSingleLineEditTextView.f47811h;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        multiLineImeEditText.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    default:
                        int i17 = GCMSingleLineEditTextView.f47803y;
                        valueAnimator.getClass();
                        ImageView imageView = gCMSingleLineEditTextView.f47814k;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        imageView.setAlpha(((Float) animatedValue2).floatValue());
                        TextView textView = gCMSingleLineEditTextView.f47813j;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        textView.setAlpha(((Float) animatedValue3).floatValue());
                        break;
                }
            }
        });
        duration.start();
        boolean z15 = this.f47810g;
        ValueAnimator duration2 = ValueAnimator.ofFloat(z15 ? 0.0f : 1.0f, z15 ? 1.0f : 0.0f).setDuration(200L);
        final char c15 = c14 == true ? 1 : 0;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCMSingleLineEditTextView f81383b;

            {
                this.f81383b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = c15;
                GCMSingleLineEditTextView gCMSingleLineEditTextView = this.f81383b;
                switch (i15) {
                    case 0:
                        int i16 = GCMSingleLineEditTextView.f47803y;
                        valueAnimator.getClass();
                        MultiLineImeEditText multiLineImeEditText = gCMSingleLineEditTextView.f47811h;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        multiLineImeEditText.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    default:
                        int i17 = GCMSingleLineEditTextView.f47803y;
                        valueAnimator.getClass();
                        ImageView imageView = gCMSingleLineEditTextView.f47814k;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        imageView.setAlpha(((Float) animatedValue2).floatValue());
                        TextView textView = gCMSingleLineEditTextView.f47813j;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        textView.setAlpha(((Float) animatedValue3).floatValue());
                        break;
                }
            }
        });
        duration2.start();
        v22.e.r(this.f47814k, this.f47810g);
        v22.e.r(this.f47813j, this.f47805b != null && this.f47810g && this.f47804a);
        v22.e.r(this.f47812i, this.hasError && !this.f47810g);
        if (!this.hasError) {
            setErrorMessage(null);
        }
        if (this.f47810g) {
            MultiLineImeEditText multiLineImeEditText = this.f47811h;
            Editable text = multiLineImeEditText.getText();
            multiLineImeEditText.setSelection(text != null ? text.length() : 0);
            multiLineImeEditText.requestFocus();
            Object systemService = multiLineImeEditText.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).showSoftInput(multiLineImeEditText, 1);
        }
        boolean z16 = this.f47810g && this.actionButtonData != null;
        v22.e.r(this.f47816m, z16);
        v22.e.r(this.f47815l, z16);
    }

    public final void k() {
        MultiLineImeEditText multiLineImeEditText = this.f47811h;
        multiLineImeEditText.clearFocus();
        multiLineImeEditText.setSelected(false);
        v22.e.c(multiLineImeEditText, this);
    }

    @SuppressLint({"SetTextI18n"})
    public final void l() {
        int length = String.valueOf(this.f47811h.getText()).length();
        Integer num = this.f47805b;
        this.f47813j.setText(length + " / " + (num != null ? num.intValue() : 0));
    }

    public final void setActionButtonColor(int i14) {
        this.actionButtonColor = i14;
        this.f47816m.setTextColor(i14);
    }

    public final void setActionButtonData(a aVar) {
        this.actionButtonData = aVar;
        String str = aVar != null ? aVar.f47826a : null;
        TextView textView = this.f47816m;
        textView.setText(str);
        if (aVar == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new g0(aVar, 4));
        }
    }

    public final void setEditingBackground(Drawable drawable) {
        this.editingBackground = drawable;
        if (!this.f47810g) {
            drawable = this.nonEditingBackground;
        }
        setBackground(drawable);
    }

    public final void setEditingValueColor(int i14) {
        this.editingValueColor = i14;
        if (this.f47810g) {
            this.f47811h.setTextColor(i14);
        }
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
        boolean zD = n.d(str);
        TextView textView = this.f47817n;
        v22.e.v(textView, zD);
        String str2 = this.errorMessage;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
    }

    public final void setHasError(boolean z14) {
        this.hasError = z14;
        v22.e.r(this.f47812i, z14 && !this.f47810g);
        if (this.hasError) {
            return;
        }
        setErrorMessage(null);
    }

    public final void setNonEditingBackground(Drawable drawable) {
        this.nonEditingBackground = drawable;
        if (this.f47810g) {
            drawable = this.editingBackground;
        }
        setBackground(drawable);
    }

    public final void setNonEditingValueColor(int i14) {
        this.nonEditingValueColor = i14;
        if (this.f47810g) {
            return;
        }
        this.f47811h.setTextColor(i14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$b;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$d;", "", "", "text", "hint", "", "charLimit", "byteLimit", "Lkotlin/Function0;", "", "onStartEditing", "Lkotlin/Function1;", "onDoneEditing", "onClickListener", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;", "actionButtonData", "inputType", "", "showCharacterCount", "allowedDigits", "excludeEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Le23/a;Le23/l;Le23/a;Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMSingleLineEditTextView$a;IZLjava/lang/String;Ljava/lang/Boolean;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f47830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f47831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f47832e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l<String, Unit> f47833f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.a<Unit> f47834g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f47835h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f47836i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f47837j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f47838k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f47839l;

        public /* synthetic */ d(String str, String str2, Integer num, Integer num2, e23.a aVar, l lVar, e23.a aVar2, a aVar3, int i14, boolean z14, String str3, Boolean bool, int i15, j jVar) {
            this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : num2, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? null : lVar, (i15 & 64) != 0 ? null : aVar2, (i15 & 128) != 0 ? null : aVar3, (i15 & 256) != 0 ? 1 : i14, (i15 & 512) == 0 ? z14 : true, (i15 & 1024) != 0 ? null : str3, (i15 & 2048) != 0 ? null : bool);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f47828a, dVar.f47828a) && s.g(this.f47829b, dVar.f47829b) && s.g(this.f47830c, dVar.f47830c) && s.g(this.f47831d, dVar.f47831d) && s.g(this.f47832e, dVar.f47832e) && s.g(this.f47833f, dVar.f47833f) && s.g(this.f47834g, dVar.f47834g) && s.g(this.f47835h, dVar.f47835h) && this.f47836i == dVar.f47836i && this.f47837j == dVar.f47837j && s.g(this.f47838k, dVar.f47838k) && s.g(this.f47839l, dVar.f47839l);
        }

        public final int hashCode() {
            int iJ = g.j(this.f47828a.hashCode() * 31, 31, this.f47829b);
            Integer num = this.f47830c;
            int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f47831d;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            e23.a<Unit> aVar = this.f47832e;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            l<String, Unit> lVar = this.f47833f;
            int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            e23.a<Unit> aVar2 = this.f47834g;
            int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.f47835h;
            int iG = q6.f.g(q2.d(this.f47836i, (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31), 31, this.f47837j);
            String str = this.f47838k;
            int iHashCode6 = (iG + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f47839l;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("InlineData(text=", this.f47828a, ", hint=", this.f47829b, ", charLimit=");
            x.m(sbI, this.f47830c, ", byteLimit=", this.f47831d, ", onStartEditing=");
            sbI.append(this.f47832e);
            sbI.append(", onDoneEditing=");
            sbI.append(this.f47833f);
            sbI.append(", onClickListener=");
            sbI.append(this.f47834g);
            sbI.append(", actionButtonData=");
            sbI.append(this.f47835h);
            sbI.append(", inputType=");
            fb1.c.x(sbI, this.f47836i, ", showCharacterCount=", this.f47837j, ", allowedDigits=");
            sbI.append(this.f47838k);
            sbI.append(", excludeEmoji=");
            sbI.append(this.f47839l);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, Integer num, Integer num2, e23.a<Unit> aVar, l<? super String, Unit> lVar, e23.a<Unit> aVar2, a aVar3, int i14, boolean z14, String str3, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.f47828a = str;
            this.f47829b = str2;
            this.f47830c = num;
            this.f47831d = num2;
            this.f47832e = aVar;
            this.f47833f = lVar;
            this.f47834g = aVar2;
            this.f47835h = aVar3;
            this.f47836i = i14;
            this.f47837j = z14;
            this.f47838k = str3;
            this.f47839l = bool;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSingleLineEditTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMSingleLineEditTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMSingleLineEditTextView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
