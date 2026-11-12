package h32;

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
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import go1.g0;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r1.q2;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\b\u0017\u0018\u00002\u00020\u0001:\u0003[\\]B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010'\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR*\u0010+\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR.\u00103\u001a\u0004\u0018\u00010,2\b\u0010#\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u0010;\u001a\u0004\u0018\u0001042\b\u0010#\u001a\u0004\u0018\u0001048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010?\u001a\u0004\u0018\u0001042\b\u0010#\u001a\u0004\u0018\u0001048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R*\u0010F\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER*\u0010J\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010A\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER*\u0010N\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010A\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER*\u0010R\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER*\u0010V\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010A\u001a\u0004\bT\u0010C\"\u0004\bU\u0010ER(\u0010Z\u001a\u0004\u0018\u00010\n2\b\u0010#\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010Y¨\u0006^"}, d2 = {"Lh32/h;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getText", "()Ljava/lang/String;", "Lkotlin/Function0;", "", JWKParameterNames.RSA_EXPONENT, "Le23/a;", "getOnClickActionCallback", "()Le23/a;", "setOnClickActionCallback", "(Le23/a;)V", "onClickActionCallback", "", "f", "Z", "isEditing", "()Z", "setEditing", "(Z)V", "Landroid/widget/EditText;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "value", "o", "getHasError", "setHasError", "hasError", "p", "getShowsErrorIcon", "setShowsErrorIcon", "showsErrorIcon", "Lh32/h$a;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Lh32/h$a;", "getActionButtonData", "()Lh32/h$a;", "setActionButtonData", "(Lh32/h$a;)V", "actionButtonData", "Landroid/graphics/drawable/Drawable;", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Landroid/graphics/drawable/Drawable;", "getNonEditingBackground", "()Landroid/graphics/drawable/Drawable;", "setNonEditingBackground", "(Landroid/graphics/drawable/Drawable;)V", "nonEditingBackground", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getEditingBackground", "setEditingBackground", "editingBackground", "v", "I", "getNonEditingTitleColor", "()I", "setNonEditingTitleColor", "(I)V", "nonEditingTitleColor", "w", "getEditingTitleColor", "setEditingTitleColor", "editingTitleColor", "x", "getNonEditingValueColor", "setNonEditingValueColor", "nonEditingValueColor", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getEditingValueColor", "setEditingValueColor", "editingValueColor", "z", "getActionButtonColor", "setActionButtonColor", "actionButtonColor", "getTitle", "setTitle", "(Ljava/lang/String;)V", "title", "c", "a", "b", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f81342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super String, Unit> f81343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.a<Unit> f81344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> onClickActionCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isEditing;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.l<? super String, Unit> f81347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f81348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final EditText editText;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f81350j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f81351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FrameLayout f81352l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f81353m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f81354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean hasError;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean showsErrorIcon;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public a actionButtonData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Drawable nonEditingBackground;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Drawable editingBackground;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int nonEditingTitleColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int editingTitleColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int nonEditingValueColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int editingValueColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public int actionButtonColor;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh32/h$a;", "", "", "text", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Le23/a;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f81366b;

        public a(String str, e23.a<Unit> aVar) {
            str.getClass();
            aVar.getClass();
            this.f81365a = str;
            this.f81366b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81365a.equals(aVar.f81365a) && this.f81366b.equals(aVar.f81366b);
        }

        public final int hashCode() {
            return this.f81366b.hashCode() + (this.f81365a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonData(text=" + this.f81365a + ", action=" + this.f81366b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h32/h$d", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            e23.l<? super String, Unit> lVar;
            h hVar = h.this;
            hVar.k();
            if (editable != null) {
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(editable);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(editable);
                if (composingSpanStart != -1 && composingSpanEnd != -1) {
                    editable = null;
                }
                if (editable == null || (lVar = hVar.f81347g) == null) {
                    return;
                }
                lVar.invoke(editable.toString());
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
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f81341a = true;
        this.showsErrorIcon = true;
        this.nonEditingTitleColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.editingTitleColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.nonEditingValueColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.editingValueColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.actionButtonColor = a7.b.getColor(context, R.color.gcm_text_primary);
        LayoutInflater.from(context).inflate(R.layout.rc_view_inline_text_field, (ViewGroup) this, true);
        setLayoutTransition(new LayoutTransition());
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149709k);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inline_text_field_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f81348h = textView;
        View viewFindViewById2 = findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById2.getClass();
        EditText editText = (EditText) viewFindViewById2;
        this.editText = editText;
        View viewFindViewById3 = findViewById(R.id.inline_text_field_error_icon);
        viewFindViewById3.getClass();
        this.f81350j = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.inline_text_field_edit_info);
        viewFindViewById4.getClass();
        View viewFindViewById5 = findViewById(R.id.inline_text_field_character_count);
        viewFindViewById5.getClass();
        this.f81351k = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.inline_text_field_clear_button);
        viewFindViewById6.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById6;
        this.f81352l = frameLayout;
        View viewFindViewById7 = findViewById(R.id.inline_text_field_button_separator);
        viewFindViewById7.getClass();
        this.f81353m = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.inline_text_field_action_button);
        viewFindViewById8.getClass();
        this.f81354n = (TextView) viewFindViewById8;
        if (c22.b.e(context)) {
            textView.setTextSize(0, c22.b.b(context, getResources().getDimension(R.dimen.andfont_body_1), 1.3f));
        }
        textView.setText(typedArrayObtainStyledAttributes.getString(7));
        setNonEditingTitleColor(typedArrayObtainStyledAttributes.getColor(5, this.nonEditingTitleColor));
        setEditingTitleColor(typedArrayObtainStyledAttributes.getColor(2, this.editingTitleColor));
        setNonEditingValueColor(typedArrayObtainStyledAttributes.getColor(6, this.nonEditingValueColor));
        setEditingValueColor(typedArrayObtainStyledAttributes.getColor(3, this.editingValueColor));
        setActionButtonColor(typedArrayObtainStyledAttributes.getColor(0, this.actionButtonColor));
        setNonEditingBackground(typedArrayObtainStyledAttributes.getDrawable(4));
        setEditingBackground(typedArrayObtainStyledAttributes.getDrawable(1));
        typedArrayObtainStyledAttributes.recycle();
        final int i15 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: h32.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f81340b;

            {
                this.f81340b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        h hVar = this.f81340b;
                        hVar.isEditing = !hVar.isEditing;
                        hVar.j();
                        break;
                    default:
                        this.f81340b.editText.getText().clear();
                        break;
                }
            }
        });
        int i16 = 5;
        editText.setOnFocusChangeListener(new c32.f(this, i16));
        editText.addTextChangedListener(new d());
        editText.setOnEditorActionListener(new bl0.a(this, i16));
        final int i17 = 1;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: h32.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f81340b;

            {
                this.f81340b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        h hVar = this.f81340b;
                        hVar.isEditing = !hVar.isEditing;
                        hVar.j();
                        break;
                    default:
                        this.f81340b.editText.getText().clear();
                        break;
                }
            }
        });
        j();
    }

    public final int getActionButtonColor() {
        return this.actionButtonColor;
    }

    public final a getActionButtonData() {
        return this.actionButtonData;
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

    public final boolean getShowsErrorIcon() {
        return this.showsErrorIcon;
    }

    public final String getText() {
        EditText editText = this.editText;
        if (editText.getVisibility() == 0) {
            return editText.getText().toString();
        }
        return null;
    }

    public final String getTitle() {
        CharSequence text = this.f81348h.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void i(c cVar) {
        this.f81341a = cVar.f81376j;
        Integer num = cVar.f81369c;
        this.f81342b = num;
        this.f81344d = cVar.f81371e;
        this.f81343c = cVar.f81372f;
        this.onClickActionCallback = cVar.f81373g;
        setActionButtonData(cVar.f81374h);
        this.f81347g = cVar.f81378l;
        EditText editText = this.editText;
        if (num != null) {
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())});
        }
        String str = cVar.f81367a;
        editText.setText(str);
        v22.e.r(editText, this.isEditing || str.length() > 0);
        editText.setHint(cVar.f81368b);
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
        Integer num2 = cVar.f81370d;
        if (num2 != null) {
            editText.addTextChangedListener(new g22.d(num2, editText));
        }
        editText.setImeOptions(6);
        editText.setRawInputType(cVar.f81375i);
        String str2 = cVar.f81377k;
        if (str2 != null) {
            editText.setKeyListener(DigitsKeyListener.getInstance(str2));
        }
        k();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    public final void j() {
        boolean z14;
        e23.a<Unit> aVar;
        if (this.isEditing && (aVar = this.f81344d) != null) {
            aVar.invoke();
        }
        char c14 = 1;
        setClickable(!this.isEditing);
        setBackground(this.isEditing ? this.editingBackground : this.nonEditingBackground);
        boolean z15 = this.isEditing;
        ValueAnimator duration = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z15 ? this.nonEditingTitleColor : this.editingTitleColor), Integer.valueOf(z15 ? this.editingTitleColor : this.nonEditingTitleColor)).setDuration(200L);
        final int i14 = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f81338b;

            {
                this.f81338b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i14;
                h hVar = this.f81338b;
                switch (i15) {
                    case 0:
                        int i16 = h.A;
                        valueAnimator.getClass();
                        TextView textView = hVar.f81348h;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i17 = h.A;
                        valueAnimator.getClass();
                        EditText editText = hVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i18 = h.A;
                        valueAnimator.getClass();
                        FrameLayout frameLayout = hVar.f81352l;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        frameLayout.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = hVar.f81351k;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration.start();
        boolean z16 = this.isEditing;
        ValueAnimator duration2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z16 ? this.nonEditingValueColor : this.editingValueColor), Integer.valueOf(z16 ? this.editingValueColor : this.nonEditingValueColor)).setDuration(200L);
        final char c15 = c14 == true ? 1 : 0;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f81338b;

            {
                this.f81338b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = c15;
                h hVar = this.f81338b;
                switch (i15) {
                    case 0:
                        int i16 = h.A;
                        valueAnimator.getClass();
                        TextView textView = hVar.f81348h;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i17 = h.A;
                        valueAnimator.getClass();
                        EditText editText = hVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i18 = h.A;
                        valueAnimator.getClass();
                        FrameLayout frameLayout = hVar.f81352l;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        frameLayout.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = hVar.f81351k;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration2.start();
        boolean z17 = this.isEditing;
        float f14 = z17 ? 0.0f : 1.0f;
        float f15 = z17 ? 1.0f : 0.0f;
        final int i15 = 2;
        ValueAnimator duration3 = ValueAnimator.ofFloat(f14, f15).setDuration(200L);
        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f81338b;

            {
                this.f81338b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i16 = i15;
                h hVar = this.f81338b;
                switch (i16) {
                    case 0:
                        int i17 = h.A;
                        valueAnimator.getClass();
                        TextView textView = hVar.f81348h;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i18 = h.A;
                        valueAnimator.getClass();
                        EditText editText = hVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i19 = h.A;
                        valueAnimator.getClass();
                        FrameLayout frameLayout = hVar.f81352l;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        frameLayout.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = hVar.f81351k;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration3.start();
        v22.e.r(this.f81352l, this.isEditing);
        v22.e.r(this.f81351k, this.f81342b != null && this.isEditing && this.f81341a);
        l();
        boolean z18 = this.isEditing;
        EditText editText = this.editText;
        if (z18) {
            z14 = true;
        } else {
            Editable text = editText.getText();
            text.getClass();
            if (text.length() > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        v22.e.r(editText, z14);
        if (this.isEditing) {
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
            Object systemService = editText.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
        boolean z19 = this.isEditing && this.actionButtonData != null;
        v22.e.r(this.f81354n, z19);
        v22.e.r(this.f81353m, z19);
    }

    @SuppressLint({"SetTextI18n"})
    public final void k() {
        int length = this.editText.getText().toString().length();
        Integer num = this.f81342b;
        this.f81351k.setText(length + " / " + (num != null ? num.intValue() : 0));
    }

    public final void l() {
        v22.e.r(this.f81350j, this.hasError && !this.isEditing && this.showsErrorIcon);
    }

    public final void setActionButtonColor(int i14) {
        this.actionButtonColor = i14;
        this.f81354n.setTextColor(i14);
    }

    public final void setActionButtonData(a aVar) {
        this.actionButtonData = aVar;
        String str = aVar != null ? aVar.f81365a : null;
        TextView textView = this.f81354n;
        textView.setText(str);
        if (aVar == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new g0(aVar, 3));
        }
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
            this.f81348h.setTextColor(i14);
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
        l();
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
        this.f81348h.setTextColor(i14);
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

    public final void setShowsErrorIcon(boolean z14) {
        this.showsErrorIcon = z14;
        l();
    }

    public final void setTitle(String str) {
        this.f81348h.setText(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh32/h$b;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh32/h$c;", "", "", "text", "hint", "", "charLimit", "byteLimit", "Lkotlin/Function0;", "", "onStartEditing", "Lkotlin/Function1;", "onDoneEditing", "onClickListener", "Lh32/h$a;", "actionButtonData", "inputType", "", "showCharacterCount", "allowedDigits", "onChangedText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Le23/a;Le23/l;Le23/a;Lh32/h$a;IZLjava/lang/String;Le23/l;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f81369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f81370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f81371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.l<String, Unit> f81372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.a<Unit> f81373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f81374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81375i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f81376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f81377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final e23.l<String, Unit> f81378l;

        public /* synthetic */ c(String str, String str2, Integer num, Integer num2, e23.a aVar, e23.l lVar, e23.a aVar2, a aVar3, int i14, boolean z14, String str3, e23.l lVar2, int i15, p005kotlin.jvm.internal.j jVar) {
            this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : num2, (i15 & 16) != 0 ? null : aVar, (i15 & 32) != 0 ? null : lVar, (i15 & 64) != 0 ? null : aVar2, (i15 & 128) != 0 ? null : aVar3, (i15 & 256) != 0 ? 1 : i14, (i15 & 512) == 0 ? z14 : true, (i15 & 1024) != 0 ? null : str3, (i15 & 2048) != 0 ? null : lVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f81367a, cVar.f81367a) && s.g(this.f81368b, cVar.f81368b) && s.g(this.f81369c, cVar.f81369c) && s.g(this.f81370d, cVar.f81370d) && s.g(this.f81371e, cVar.f81371e) && s.g(this.f81372f, cVar.f81372f) && s.g(this.f81373g, cVar.f81373g) && s.g(this.f81374h, cVar.f81374h) && this.f81375i == cVar.f81375i && this.f81376j == cVar.f81376j && s.g(this.f81377k, cVar.f81377k) && s.g(this.f81378l, cVar.f81378l);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f81367a.hashCode() * 31, 31, this.f81368b);
            Integer num = this.f81369c;
            int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f81370d;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            e23.a<Unit> aVar = this.f81371e;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            e23.l<String, Unit> lVar = this.f81372f;
            int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            e23.a<Unit> aVar2 = this.f81373g;
            int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.f81374h;
            int iG = q6.f.g(q2.d(this.f81375i, (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31), 31, this.f81376j);
            String str = this.f81377k;
            int iHashCode6 = (iG + (str == null ? 0 : str.hashCode())) * 31;
            e23.l<String, Unit> lVar2 = this.f81378l;
            return iHashCode6 + (lVar2 != null ? lVar2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("InlineData(text=", this.f81367a, ", hint=", this.f81368b, ", charLimit=");
            x.m(sbI, this.f81369c, ", byteLimit=", this.f81370d, ", onStartEditing=");
            sbI.append(this.f81371e);
            sbI.append(", onDoneEditing=");
            sbI.append(this.f81372f);
            sbI.append(", onClickListener=");
            sbI.append(this.f81373g);
            sbI.append(", actionButtonData=");
            sbI.append(this.f81374h);
            sbI.append(", inputType=");
            fb1.c.x(sbI, this.f81375i, ", showCharacterCount=", this.f81376j, ", allowedDigits=");
            sbI.append(this.f81377k);
            sbI.append(", onChangedText=");
            sbI.append(this.f81378l);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, Integer num, Integer num2, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar2, a aVar3, int i14, boolean z14, String str3, e23.l<? super String, Unit> lVar2) {
            str.getClass();
            str2.getClass();
            this.f81367a = str;
            this.f81368b = str2;
            this.f81369c = num;
            this.f81370d = num2;
            this.f81371e = aVar;
            this.f81372f = lVar;
            this.f81373g = aVar2;
            this.f81374h = aVar3;
            this.f81375i = i14;
            this.f81376j = z14;
            this.f81377k = str3;
            this.f81378l = lVar2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
