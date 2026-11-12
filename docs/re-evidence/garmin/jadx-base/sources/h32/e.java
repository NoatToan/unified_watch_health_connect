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
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.nimbusds.jose.jwk.JWKParameterNames;
import go1.g0;
import j20.x;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r1.q2;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u00002\u00020\u0001:\u0004KLMNB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R*\u0010'\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR.\u0010/\u001a\u0004\u0018\u00010(2\b\u0010#\u001a\u0004\u0018\u00010(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00107\u001a\u0004\u0018\u0001002\b\u0010#\u001a\u0004\u0018\u0001008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R.\u0010;\u001a\u0004\u0018\u0001002\b\u0010#\u001a\u0004\u0018\u0001008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R*\u0010B\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR*\u0010F\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010J\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010A¨\u0006O"}, d2 = {"Lh32/e;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getText", "()Ljava/lang/String;", "Lkotlin/Function0;", "", "f", "Le23/a;", "getOnClickActionCallback", "()Le23/a;", "setOnClickActionCallback", "(Le23/a;)V", "onClickActionCallback", "", "g", "Z", "isEditing", "()Z", "setEditing", "(Z)V", "Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText;", "h", "Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText;", "getEditText", "()Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText;", "editText", "value", JWKParameterNames.RSA_MODULUS, "getHasError", "setHasError", "hasError", "Lh32/e$a;", "o", "Lh32/e$a;", "getActionButtonData", "()Lh32/e$a;", "setActionButtonData", "(Lh32/e$a;)V", "actionButtonData", "Landroid/graphics/drawable/Drawable;", "p", "Landroid/graphics/drawable/Drawable;", "getNonEditingBackground", "()Landroid/graphics/drawable/Drawable;", "setNonEditingBackground", "(Landroid/graphics/drawable/Drawable;)V", "nonEditingBackground", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getEditingBackground", "setEditingBackground", "editingBackground", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "I", "getNonEditingValueColor", "()I", "setNonEditingValueColor", "(I)V", "nonEditingValueColor", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getEditingValueColor", "setEditingValueColor", "editingValueColor", "v", "getActionButtonColor", "setActionButtonColor", "actionButtonColor", "d", "a", "b", "c", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e extends ConstraintLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f81301w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f81303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f81304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super String, Unit> f81305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.a<Unit> f81306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> onClickActionCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isEditing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final MultiLineImeEditText editText;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f81310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f81311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f81312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f81313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f81314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasError;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public a actionButtonData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Drawable nonEditingBackground;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Drawable editingBackground;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public int nonEditingValueColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int editingValueColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int actionButtonColor;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh32/e$a;", "", "", "text", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Le23/a;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f81323b;

        public a(String str, e23.a<Unit> aVar) {
            str.getClass();
            aVar.getClass();
            this.f81322a = str;
            this.f81323b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f81322a.equals(aVar.f81322a) && this.f81323b.equals(aVar.f81323b);
        }

        public final int hashCode() {
            return this.f81323b.hashCode() + (this.f81322a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonData(text=" + this.f81322a + ", action=" + this.f81323b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh32/e$c;", "Landroid/text/InputFilter;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    /* JADX INFO: renamed from: h32.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h32/e$e", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1616e implements TextWatcher {
        public C1616e() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            e.this.l();
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
    public e(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f81302a = true;
        this.nonEditingValueColor = a7.b.getColor(context, R.color.gray_black_static);
        this.editingValueColor = a7.b.getColor(context, R.color.gray_black_static);
        this.actionButtonColor = a7.b.getColor(context, R.color.gray_black_static);
        LayoutInflater.from(context).inflate(R.layout.rc_view_inline_single_text_field, this);
        setLayoutTransition(new LayoutTransition());
        setPadding(getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.spacing_normal), getPaddingRight(), getPaddingBottom());
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149708j);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.gcm_inline_two_field_layout);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.inline_text_field_title_dummy);
        viewFindViewById2.getClass();
        View viewFindViewById3 = findViewById(R.id.inline_text_field_edit_text_dummy);
        viewFindViewById3.getClass();
        View viewFindViewById4 = findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById4.getClass();
        MultiLineImeEditText multiLineImeEditText = (MultiLineImeEditText) viewFindViewById4;
        this.editText = multiLineImeEditText;
        View viewFindViewById5 = findViewById(R.id.inline_text_field_error_icon);
        viewFindViewById5.getClass();
        this.f81310i = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.inline_text_field_edit_info);
        viewFindViewById6.getClass();
        View viewFindViewById7 = findViewById(R.id.inline_text_field_character_count);
        viewFindViewById7.getClass();
        this.f81311j = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.inline_text_field_clear_button);
        viewFindViewById8.getClass();
        ImageView imageView = (ImageView) viewFindViewById8;
        this.f81312k = imageView;
        View viewFindViewById9 = findViewById(R.id.inline_text_field_button_separator);
        viewFindViewById9.getClass();
        this.f81313l = viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.inline_text_field_action_button);
        viewFindViewById10.getClass();
        this.f81314m = (TextView) viewFindViewById10;
        setNonEditingValueColor(typedArrayObtainStyledAttributes.getColor(4, this.nonEditingValueColor));
        setEditingValueColor(typedArrayObtainStyledAttributes.getColor(2, this.editingValueColor));
        setActionButtonColor(typedArrayObtainStyledAttributes.getColor(0, this.actionButtonColor));
        setNonEditingBackground(typedArrayObtainStyledAttributes.getDrawable(3));
        setEditingBackground(typedArrayObtainStyledAttributes.getDrawable(1));
        typedArrayObtainStyledAttributes.recycle();
        final int i15 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: h32.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f81298b;

            {
                this.f81298b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        e eVar = this.f81298b;
                        eVar.isEditing = !eVar.isEditing;
                        eVar.j();
                        break;
                    default:
                        Editable text = this.f81298b.editText.getText();
                        if (text != null) {
                            text.clear();
                        }
                        break;
                }
            }
        });
        int i16 = 4;
        multiLineImeEditText.setExtraOnFocusChangeListener(new c32.f(this, i16));
        multiLineImeEditText.addTextChangedListener(new C1616e());
        multiLineImeEditText.setOnEditorActionListener(new bl0.a(this, i16));
        final int i17 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: h32.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f81298b;

            {
                this.f81298b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        e eVar = this.f81298b;
                        eVar.isEditing = !eVar.isEditing;
                        eVar.j();
                        break;
                    default:
                        Editable text = this.f81298b.editText.getText();
                        if (text != null) {
                            text.clear();
                        }
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

    public final MultiLineImeEditText getEditText() {
        return this.editText;
    }

    public final Drawable getEditingBackground() {
        return this.editingBackground;
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

    public final int getNonEditingValueColor() {
        return this.nonEditingValueColor;
    }

    public final e23.a<Unit> getOnClickActionCallback() {
        return this.onClickActionCallback;
    }

    public final String getText() {
        MultiLineImeEditText multiLineImeEditText = this.editText;
        if (multiLineImeEditText.getVisibility() == 0) {
            return String.valueOf(multiLineImeEditText.getText());
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(d dVar) {
        this.f81302a = dVar.f81333j;
        Integer num = dVar.f81326c;
        this.f81303b = num;
        this.f81306e = dVar.f81328e;
        this.f81305d = dVar.f81329f;
        this.onClickActionCallback = dVar.f81330g;
        setActionButtonData(dVar.f81331h);
        this.f81304c = dVar.f81335l;
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            arrayList.add(new InputFilter.LengthFilter(num.intValue()));
        }
        if (s.g(this.f81304c, Boolean.TRUE)) {
            arrayList.add(new c());
        }
        boolean zIsEmpty = arrayList.isEmpty();
        MultiLineImeEditText multiLineImeEditText = this.editText;
        if (!zIsEmpty) {
            multiLineImeEditText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
        String str = dVar.f81324a;
        multiLineImeEditText.setText(str);
        v22.e.r(multiLineImeEditText, this.isEditing || str.length() > 0);
        multiLineImeEditText.setHint(dVar.f81325b);
        Editable text = multiLineImeEditText.getText();
        multiLineImeEditText.setSelection(text != null ? text.length() : 0);
        Integer num2 = dVar.f81327d;
        if (num2 != null) {
            multiLineImeEditText.addTextChangedListener(new g22.d(num2, multiLineImeEditText));
        }
        multiLineImeEditText.setImeOptions(6);
        multiLineImeEditText.setRawInputType(dVar.f81332i);
        String str2 = dVar.f81334k;
        if (str2 != null) {
            multiLineImeEditText.setKeyListener(DigitsKeyListener.getInstance(str2));
        }
        l();
    }

    public final void j() {
        Editable text;
        e23.a<Unit> aVar;
        if (this.isEditing && (aVar = this.f81306e) != null) {
            aVar.invoke();
        }
        char c14 = 1;
        setClickable(!this.isEditing);
        setBackground(this.isEditing ? this.editingBackground : this.nonEditingBackground);
        boolean z14 = this.isEditing;
        ValueAnimator duration = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z14 ? this.nonEditingValueColor : this.editingValueColor), Integer.valueOf(z14 ? this.editingValueColor : this.nonEditingValueColor)).setDuration(200L);
        final int i14 = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f81300b;

            {
                this.f81300b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i14;
                e eVar = this.f81300b;
                switch (i15) {
                    case 0:
                        int i16 = e.f81301w;
                        valueAnimator.getClass();
                        MultiLineImeEditText multiLineImeEditText = eVar.editText;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        multiLineImeEditText.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    default:
                        int i17 = e.f81301w;
                        valueAnimator.getClass();
                        ImageView imageView = eVar.f81312k;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        imageView.setAlpha(((Float) animatedValue2).floatValue());
                        TextView textView = eVar.f81311j;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        textView.setAlpha(((Float) animatedValue3).floatValue());
                        break;
                }
            }
        });
        duration.start();
        boolean z15 = this.isEditing;
        ValueAnimator duration2 = ValueAnimator.ofFloat(z15 ? 0.0f : 1.0f, z15 ? 1.0f : 0.0f).setDuration(200L);
        final char c15 = c14 == true ? 1 : 0;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: h32.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f81300b;

            {
                this.f81300b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = c15;
                e eVar = this.f81300b;
                switch (i15) {
                    case 0:
                        int i16 = e.f81301w;
                        valueAnimator.getClass();
                        MultiLineImeEditText multiLineImeEditText = eVar.editText;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        multiLineImeEditText.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    default:
                        int i17 = e.f81301w;
                        valueAnimator.getClass();
                        ImageView imageView = eVar.f81312k;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        imageView.setAlpha(((Float) animatedValue2).floatValue());
                        TextView textView = eVar.f81311j;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        textView.setAlpha(((Float) animatedValue3).floatValue());
                        break;
                }
            }
        });
        duration2.start();
        v22.e.r(this.f81312k, this.isEditing);
        v22.e.r(this.f81311j, this.f81303b != null && this.isEditing && this.f81302a);
        v22.e.r(this.f81310i, this.hasError && !this.isEditing);
        boolean z16 = this.isEditing;
        MultiLineImeEditText multiLineImeEditText = this.editText;
        v22.e.r(multiLineImeEditText, z16 || ((text = multiLineImeEditText.getText()) != null && text.length() > 0));
        if (this.isEditing) {
            Editable text2 = multiLineImeEditText.getText();
            multiLineImeEditText.setSelection(text2 != null ? text2.length() : 0);
            multiLineImeEditText.requestFocus();
            Object systemService = multiLineImeEditText.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).showSoftInput(multiLineImeEditText, 1);
        }
        boolean z17 = this.isEditing && this.actionButtonData != null;
        v22.e.r(this.f81314m, z17);
        v22.e.r(this.f81313l, z17);
    }

    public final void k() {
        MultiLineImeEditText multiLineImeEditText = this.editText;
        multiLineImeEditText.clearFocus();
        multiLineImeEditText.setSelected(false);
        v22.e.c(multiLineImeEditText, this);
    }

    @SuppressLint({"SetTextI18n"})
    public final void l() {
        int length = String.valueOf(this.editText.getText()).length();
        Integer num = this.f81303b;
        this.f81311j.setText(length + " / " + (num != null ? num.intValue() : 0));
    }

    public final void setActionButtonColor(int i14) {
        this.actionButtonColor = i14;
        this.f81314m.setTextColor(i14);
    }

    public final void setActionButtonData(a aVar) {
        this.actionButtonData = aVar;
        String str = aVar != null ? aVar.f81322a : null;
        TextView textView = this.f81314m;
        textView.setText(str);
        if (aVar == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new g0(aVar, 2));
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

    public final void setEditingValueColor(int i14) {
        this.editingValueColor = i14;
        if (this.isEditing) {
            this.editText.setTextColor(i14);
        }
    }

    public final void setHasError(boolean z14) {
        this.hasError = z14;
        v22.e.r(this.f81310i, z14 && !this.isEditing);
    }

    public final void setNonEditingBackground(Drawable drawable) {
        this.nonEditingBackground = drawable;
        if (this.isEditing) {
            drawable = this.editingBackground;
        }
        setBackground(drawable);
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh32/e$b;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh32/e$d;", "", "", "text", "hint", "", "charLimit", "byteLimit", "Lkotlin/Function0;", "", "onStartEditing", "Lkotlin/Function1;", "onDoneEditing", "onClickListener", "Lh32/e$a;", "actionButtonData", "inputType", "", "showCharacterCount", "allowedDigits", "excludeEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Le23/a;Le23/l;Le23/a;Lh32/e$a;IZLjava/lang/String;Ljava/lang/Boolean;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f81326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f81327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e23.a<Unit> f81328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e23.l<String, Unit> f81329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.a<Unit> f81330g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a f81331h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f81332i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f81333j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f81334k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Boolean f81335l;

        public /* synthetic */ d(String str, String str2, Integer num, Integer num2, e23.a aVar, e23.l lVar, e23.a aVar2, a aVar3, int i14, boolean z14, String str3, Boolean bool, int i15, p005kotlin.jvm.internal.j jVar) {
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
            return s.g(this.f81324a, dVar.f81324a) && s.g(this.f81325b, dVar.f81325b) && s.g(this.f81326c, dVar.f81326c) && s.g(this.f81327d, dVar.f81327d) && s.g(this.f81328e, dVar.f81328e) && s.g(this.f81329f, dVar.f81329f) && s.g(this.f81330g, dVar.f81330g) && s.g(this.f81331h, dVar.f81331h) && this.f81332i == dVar.f81332i && this.f81333j == dVar.f81333j && s.g(this.f81334k, dVar.f81334k) && s.g(this.f81335l, dVar.f81335l);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f81324a.hashCode() * 31, 31, this.f81325b);
            Integer num = this.f81326c;
            int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f81327d;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            e23.a<Unit> aVar = this.f81328e;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            e23.l<String, Unit> lVar = this.f81329f;
            int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
            e23.a<Unit> aVar2 = this.f81330g;
            int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.f81331h;
            int iG = q6.f.g(q2.d(this.f81332i, (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31, 31), 31, this.f81333j);
            String str = this.f81334k;
            int iHashCode6 = (iG + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f81335l;
            return iHashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("InlineData(text=", this.f81324a, ", hint=", this.f81325b, ", charLimit=");
            x.m(sbI, this.f81326c, ", byteLimit=", this.f81327d, ", onStartEditing=");
            sbI.append(this.f81328e);
            sbI.append(", onDoneEditing=");
            sbI.append(this.f81329f);
            sbI.append(", onClickListener=");
            sbI.append(this.f81330g);
            sbI.append(", actionButtonData=");
            sbI.append(this.f81331h);
            sbI.append(", inputType=");
            fb1.c.x(sbI, this.f81332i, ", showCharacterCount=", this.f81333j, ", allowedDigits=");
            sbI.append(this.f81334k);
            sbI.append(", excludeEmoji=");
            sbI.append(this.f81335l);
            sbI.append(")");
            return sbI.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, Integer num, Integer num2, e23.a<Unit> aVar, e23.l<? super String, Unit> lVar, e23.a<Unit> aVar2, a aVar3, int i14, boolean z14, String str3, Boolean bool) {
            str.getClass();
            str2.getClass();
            this.f81324a = str;
            this.f81325b = str2;
            this.f81326c = num;
            this.f81327d = num2;
            this.f81328e = aVar;
            this.f81329f = lVar;
            this.f81330g = aVar2;
            this.f81331h = aVar3;
            this.f81332i = i14;
            this.f81333j = z14;
            this.f81334k = str3;
            this.f81335l = bool;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
