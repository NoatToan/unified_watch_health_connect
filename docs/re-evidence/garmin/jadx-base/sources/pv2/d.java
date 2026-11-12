package pv2;

import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c32.f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import mt0.e0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p3.q1;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\b\u0017\u0018\u00002\u00020\u0001:\u0002KLB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010'\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR.\u0010/\u001a\u0004\u0018\u00010(2\b\u0010#\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00103\u001a\u0004\u0018\u00010(2\b\u0010#\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R*\u0010:\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010>\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R*\u0010B\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b@\u00107\"\u0004\bA\u00109R*\u0010F\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bC\u00105\u001a\u0004\bD\u00107\"\u0004\bE\u00109R(\u0010J\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lpv2/d;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getText", "()Ljava/lang/String;", "Lkotlin/Function0;", "", IntegerTokenConverter.CONVERTER_KEY, "Le23/a;", "getOnClickActionCallback", "()Le23/a;", "setOnClickActionCallback", "(Le23/a;)V", "onClickActionCallback", "", "j", "Z", "isEditing", "()Z", "setEditing", "(Z)V", "Landroid/widget/EditText;", "l", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "value", "p", "getHasError", "setHasError", "hasError", "Landroid/graphics/drawable/Drawable;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Landroid/graphics/drawable/Drawable;", "getNonEditingBackground", "()Landroid/graphics/drawable/Drawable;", "setNonEditingBackground", "(Landroid/graphics/drawable/Drawable;)V", "nonEditingBackground", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getEditingBackground", "setEditingBackground", "editingBackground", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "I", "getNonEditingTitleColor", "()I", "setNonEditingTitleColor", "(I)V", "nonEditingTitleColor", "v", "getEditingTitleColor", "setEditingTitleColor", "editingTitleColor", "w", "getNonEditingValueColor", "setNonEditingValueColor", "nonEditingValueColor", "x", "getEditingValueColor", "setEditingValueColor", "editingValueColor", "getTitle", "setTitle", "(Ljava/lang/String;)V", "title", "b", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d extends ConstraintLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f141647y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f141648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f141649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f141650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f141651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f141652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f141653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f141654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e23.a<Unit> f141655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> onClickActionCallback;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isEditing;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f141658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final EditText editText;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f141660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f141661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f141662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean hasError;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Drawable nonEditingBackground;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Drawable editingBackground;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int nonEditingTitleColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int editingTitleColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int nonEditingValueColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int editingValueColor;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"pv2/d$c", "Landroid/text/TextWatcher;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            d dVar = d.this;
            dVar.j();
            if (dVar.f141653f == 1) {
                dVar.setHasError(false);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f141648a = true;
        this.f141650c = -1.0d;
        this.f141651d = -1.0d;
        this.f141652e = -1;
        this.f141653f = 1;
        this.nonEditingTitleColor = a7.b.getColor(context, R.color.rts_primary_text_color);
        this.editingTitleColor = a7.b.getColor(context, R.color.rts_primary_text_color);
        this.nonEditingValueColor = a7.b.getColor(context, R.color.rts_primary_text_color);
        this.editingValueColor = a7.b.getColor(context, R.color.rts_primary_text_color);
        LayoutInflater.from(context).inflate(R.layout.rts_inline_text_field, (ViewGroup) this, true);
        setLayoutTransition(new LayoutTransition());
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vu2.a.f180396a);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inline_text_field_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f141658k = textView;
        View viewFindViewById2 = findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById2.getClass();
        EditText editText = (EditText) viewFindViewById2;
        this.editText = editText;
        View viewFindViewById3 = findViewById(R.id.inline_text_field_error_icon);
        viewFindViewById3.getClass();
        this.f141660m = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.inline_text_field_edit_info);
        viewFindViewById4.getClass();
        View viewFindViewById5 = findViewById(R.id.inline_text_field_character_count);
        viewFindViewById5.getClass();
        this.f141661n = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.inline_text_field_clear_button);
        viewFindViewById6.getClass();
        ImageView imageView = (ImageView) viewFindViewById6;
        this.f141662o = imageView;
        textView.setText(typedArrayObtainStyledAttributes.getString(7));
        setNonEditingTitleColor(typedArrayObtainStyledAttributes.getColor(5, this.nonEditingTitleColor));
        setEditingTitleColor(typedArrayObtainStyledAttributes.getColor(2, this.editingTitleColor));
        setNonEditingValueColor(typedArrayObtainStyledAttributes.getColor(6, this.nonEditingValueColor));
        setEditingValueColor(typedArrayObtainStyledAttributes.getColor(3, this.editingValueColor));
        setNonEditingBackground(typedArrayObtainStyledAttributes.getDrawable(4));
        setEditingBackground(typedArrayObtainStyledAttributes.getDrawable(1));
        typedArrayObtainStyledAttributes.recycle();
        final int i15 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: pv2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f141644b;

            {
                this.f141644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        d dVar = this.f141644b;
                        dVar.isEditing = !dVar.isEditing;
                        dVar.i();
                        break;
                    default:
                        this.f141644b.editText.getText().clear();
                        break;
                }
            }
        });
        int i16 = 9;
        editText.setOnFocusChangeListener(new f(this, i16));
        editText.addTextChangedListener(new c());
        editText.setOnEditorActionListener(new bl0.a(this, i16));
        final int i17 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: pv2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f141644b;

            {
                this.f141644b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        d dVar = this.f141644b;
                        dVar.isEditing = !dVar.isEditing;
                        dVar.i();
                        break;
                    default:
                        this.f141644b.editText.getText().clear();
                        break;
                }
            }
        });
        i();
    }

    public final EditText getEditText() {
        return this.editText;
    }

    public final Drawable getEditingBackground() {
        return this.editingBackground;
    }

    public final int getEditingTitleColor() {
        return this.editingTitleColor;
    }

    public final int getEditingValueColor() {
        return this.editingValueColor;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final Drawable getNonEditingBackground() {
        return this.nonEditingBackground;
    }

    public final int getNonEditingTitleColor() {
        return this.nonEditingTitleColor;
    }

    public final int getNonEditingValueColor() {
        return this.nonEditingValueColor;
    }

    public final e23.a<Unit> getOnClickActionCallback() {
        return this.onClickActionCallback;
    }

    public final String getText() {
        EditText editText = this.editText;
        if (editText.getVisibility() == 0) {
            return editText.getText().toString();
        }
        return null;
    }

    public final String getTitle() {
        CharSequence text = this.f141658k.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x013a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        boolean z14;
        boolean z15 = this.isEditing;
        final int i14 = 2;
        Object[] objArr = 0;
        final int i15 = 1;
        EditText editText = this.editText;
        if (z15) {
            e23.a<Unit> aVar = this.f141655h;
            if (aVar != null) {
                aVar.invoke();
            }
            int i16 = this.f141653f;
            if (i16 == 1) {
                Integer num = this.f141649b;
                if (num != null) {
                    editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())});
                }
            } else if (i16 == 2 || i16 == 8194) {
                double d14 = this.f141651d;
                if (d14 > -1.0d) {
                    e eVar = new e(d14, this.isEditing, new q1(this, 24));
                    int i17 = this.f141652e;
                    if (i17 > -1) {
                        eVar.f141686d = i17;
                    }
                    editText.setFilters(new e[]{eVar});
                }
            }
        } else {
            editText.setFilters(new InputFilter[0]);
        }
        setClickable(!this.isEditing);
        setBackground(this.isEditing ? this.editingBackground : this.nonEditingBackground);
        boolean z16 = this.isEditing;
        ValueAnimator duration = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z16 ? this.nonEditingTitleColor : this.editingTitleColor), Integer.valueOf(z16 ? this.editingTitleColor : this.nonEditingTitleColor)).setDuration(200L);
        final Object[] objArr2 = objArr == true ? 1 : 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pv2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f141646b;

            {
                this.f141646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i18 = objArr2;
                d dVar = this.f141646b;
                switch (i18) {
                    case 0:
                        int i19 = d.f141647y;
                        valueAnimator.getClass();
                        TextView textView = dVar.f141658k;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i24 = d.f141647y;
                        valueAnimator.getClass();
                        EditText editText2 = dVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText2.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i25 = d.f141647y;
                        valueAnimator.getClass();
                        ImageView imageView = dVar.f141662o;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        imageView.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = dVar.f141661n;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration.start();
        boolean z17 = this.isEditing;
        ValueAnimator duration2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z17 ? this.nonEditingValueColor : this.editingValueColor), Integer.valueOf(z17 ? this.editingValueColor : this.nonEditingValueColor)).setDuration(200L);
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pv2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f141646b;

            {
                this.f141646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i18 = i15;
                d dVar = this.f141646b;
                switch (i18) {
                    case 0:
                        int i19 = d.f141647y;
                        valueAnimator.getClass();
                        TextView textView = dVar.f141658k;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i24 = d.f141647y;
                        valueAnimator.getClass();
                        EditText editText2 = dVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText2.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i25 = d.f141647y;
                        valueAnimator.getClass();
                        ImageView imageView = dVar.f141662o;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        imageView.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = dVar.f141661n;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration2.start();
        boolean z18 = this.isEditing;
        ValueAnimator duration3 = ValueAnimator.ofFloat(z18 ? 0.0f : 1.0f, z18 ? 1.0f : 0.0f).setDuration(200L);
        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pv2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f141646b;

            {
                this.f141646b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i18 = i14;
                d dVar = this.f141646b;
                switch (i18) {
                    case 0:
                        int i19 = d.f141647y;
                        valueAnimator.getClass();
                        TextView textView = dVar.f141658k;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i24 = d.f141647y;
                        valueAnimator.getClass();
                        EditText editText2 = dVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText2.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i25 = d.f141647y;
                        valueAnimator.getClass();
                        ImageView imageView = dVar.f141662o;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        imageView.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = dVar.f141661n;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration3.start();
        boolean z19 = this.isEditing;
        ImageView imageView = this.f141662o;
        oc.b.H(imageView, z19);
        oc.b.H(this.f141661n, this.f141649b != null && this.isEditing && this.f141648a);
        oc.b.H(this.f141660m, this.hasError);
        oc.b.H(imageView, !this.hasError);
        if (!this.isEditing) {
            Editable text = editText.getText();
            text.getClass();
            z14 = text.length() > 0;
        }
        oc.b.H(editText, z14);
        if (this.isEditing) {
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
            Object systemService = editText.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void j() {
        int length = this.editText.getText().toString().length();
        Integer num = this.f141649b;
        this.f141661n.setText(length + " / " + (num != null ? num.intValue() : 0));
    }

    public final void setEditing(boolean z14) {
        this.isEditing = z14;
    }

    public final void setEditingBackground(Drawable drawable) {
        this.editingBackground = drawable;
        if (!this.isEditing) {
            drawable = this.nonEditingBackground;
        }
        setBackground(drawable);
    }

    public final void setEditingTitleColor(int i14) {
        this.editingTitleColor = i14;
        if (this.isEditing) {
            this.f141658k.setTextColor(i14);
        }
    }

    public final void setEditingValueColor(int i14) {
        this.editingValueColor = i14;
        if (this.isEditing) {
            this.editText.setTextColor(i14);
        }
    }

    public final void setHasError(boolean z14) {
        this.hasError = z14;
        oc.b.H(this.f141660m, z14);
        oc.b.H(this.f141662o, !this.hasError);
    }

    public final void setNonEditingBackground(Drawable drawable) {
        this.nonEditingBackground = drawable;
        if (this.isEditing) {
            drawable = this.editingBackground;
        }
        setBackground(drawable);
    }

    public final void setNonEditingTitleColor(int i14) {
        this.nonEditingTitleColor = i14;
        if (this.isEditing) {
            return;
        }
        this.f141658k.setTextColor(i14);
    }

    public final void setNonEditingValueColor(int i14) {
        this.nonEditingValueColor = i14;
        if (this.isEditing) {
            return;
        }
        this.editText.setTextColor(i14);
    }

    public final void setOnClickActionCallback(e23.a<Unit> aVar) {
        this.onClickActionCallback = aVar;
    }

    public final void setTitle(String str) {
        this.f141658k.setText(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpv2/d$a;", "", "<init>", "()V", "", "animationDuration", "J", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpv2/d$b;", "", "", "text", "hint", "", "charLimit", "byteLimit", "", "minValue", "maxValue", "precision", "Lkotlin/Function0;", "", "onStartEditing", "onClickListener", "inputType", "", "showCharacterCount", "allowedDigits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;DDILe23/a;Le23/a;IZLjava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f141670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f141671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f141672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f141673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f141674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f141675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f141676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e23.a<Unit> f141677h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e23.a<Unit> f141678i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f141679j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f141680k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f141681l;

        public /* synthetic */ b(String str, String str2, Integer num, Integer num2, double d14, double d15, int i14, e23.a aVar, e23.a aVar2, int i15, boolean z14, String str3, int i16, j jVar) {
            this(str, (i16 & 2) != 0 ? "" : str2, (i16 & 4) != 0 ? null : num, (i16 & 8) != 0 ? null : num2, d14, d15, i14, (i16 & 128) != 0 ? null : aVar, (i16 & 256) != 0 ? null : aVar2, (i16 & 512) != 0 ? 1 : i15, (i16 & 1024) != 0 ? true : z14, (i16 & 2048) != 0 ? null : str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f141670a, bVar.f141670a) && s.g(this.f141671b, bVar.f141671b) && s.g(this.f141672c, bVar.f141672c) && s.g(this.f141673d, bVar.f141673d) && Double.compare(this.f141674e, bVar.f141674e) == 0 && Double.compare(this.f141675f, bVar.f141675f) == 0 && this.f141676g == bVar.f141676g && s.g(this.f141677h, bVar.f141677h) && s.g(this.f141678i, bVar.f141678i) && this.f141679j == bVar.f141679j && this.f141680k == bVar.f141680k && s.g(this.f141681l, bVar.f141681l);
        }

        public final int hashCode() {
            int iJ = g.j(this.f141670a.hashCode() * 31, 31, this.f141671b);
            Integer num = this.f141672c;
            int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f141673d;
            int iD = q2.d(this.f141676g, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f141674e), 31, this.f141675f), 31);
            e23.a<Unit> aVar = this.f141677h;
            int iHashCode2 = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
            e23.a<Unit> aVar2 = this.f141678i;
            int iG = q6.f.g(q2.d(this.f141679j, (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31), 31, this.f141680k);
            String str = this.f141681l;
            return iG + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("InlineData(text=", this.f141670a, ", hint=", this.f141671b, ", charLimit=");
            x.m(sbI, this.f141672c, ", byteLimit=", this.f141673d, ", minValue=");
            sbI.append(this.f141674e);
            am.j.x(sbI, ", maxValue=", this.f141675f, ", precision=");
            sbI.append(this.f141676g);
            sbI.append(", onStartEditing=");
            sbI.append(this.f141677h);
            sbI.append(", onClickListener=");
            sbI.append(this.f141678i);
            sbI.append(", inputType=");
            sbI.append(this.f141679j);
            sbI.append(", showCharacterCount=");
            sbI.append(this.f141680k);
            sbI.append(", allowedDigits=");
            sbI.append(this.f141681l);
            sbI.append(")");
            return sbI.toString();
        }

        public b(String str, String str2, Integer num, Integer num2, double d14, double d15, int i14, e23.a<Unit> aVar, e23.a<Unit> aVar2, int i15, boolean z14, String str3) {
            str.getClass();
            str2.getClass();
            this.f141670a = str;
            this.f141671b = str2;
            this.f141672c = num;
            this.f141673d = num2;
            this.f141674e = d14;
            this.f141675f = d15;
            this.f141676g = i14;
            this.f141677h = aVar;
            this.f141678i = aVar2;
            this.f141679j = i15;
            this.f141680k = z14;
            this.f141681l = str3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
