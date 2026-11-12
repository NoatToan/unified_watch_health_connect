package com.garmin.android.apps.connectmobile.view.reusablecomponents;

import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c32.f;
import c32.i;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r22.j1;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b.\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0093\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u000eR.\u0010+\u001a\u0004\u0018\u00010$2\b\u0010\u001f\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u00103\u001a\u0004\u0018\u00010,2\b\u0010\u001f\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u0010;\u001a\u0004\u0018\u0001042\b\u0010\u001f\u001a\u0004\u0018\u0001048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R.\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR.\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR0\u0010V\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\f\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR*\u0010]\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R*\u0010a\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010\u0014\u001a\u0004\b_\u0010\u0016\"\u0004\b`\u0010\u000eR.\u0010e\u001a\u0004\u0018\u0001042\b\u0010\u001f\u001a\u0004\u0018\u0001048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00106\u001a\u0004\bc\u00108\"\u0004\bd\u0010:R.\u0010m\u001a\u0004\u0018\u00010f2\b\u0010\u001f\u001a\u0004\u0018\u00010f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR.\u0010q\u001a\u0004\u0018\u00010$2\b\u0010\u001f\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010&\u001a\u0004\bo\u0010(\"\u0004\bp\u0010*R.\u0010u\u001a\u0004\u0018\u00010$2\b\u0010\u001f\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010&\u001a\u0004\bs\u0010(\"\u0004\bt\u0010*R*\u0010y\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010X\u001a\u0004\bw\u0010Z\"\u0004\bx\u0010\\R*\u0010}\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bz\u0010X\u001a\u0004\b{\u0010Z\"\u0004\b|\u0010\\R,\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0013\n\u0004\b~\u0010X\u001a\u0004\b\u007f\u0010Z\"\u0005\b\u0080\u0001\u0010\\R.\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010X\u001a\u0005\b\u0083\u0001\u0010Z\"\u0005\b\u0084\u0001\u0010\\R-\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0004\bX\u0010X\u001a\u0005\b\u0086\u0001\u0010Z\"\u0005\b\u0087\u0001\u0010\\R.\u0010\u008c\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010X\u001a\u0005\b\u008a\u0001\u0010Z\"\u0005\b\u008b\u0001\u0010\\R+\u0010\u008f\u0001\u001a\u0004\u0018\u0001042\b\u0010\u001f\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008d\u0001\u00108\"\u0005\b\u008e\u0001\u0010:R'\u0010\u0092\u0001\u001a\u0002042\u0006\u0010\u001f\u001a\u0002048F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0090\u0001\u00108\"\u0005\b\u0091\u0001\u0010:¨\u0006\u0094\u0001"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "shouldEdit", "", "setEditingMode", "(Z)V", "Landroid/text/Spannable;", "spannableString", "setSpannableTitle", "(Landroid/text/Spannable;)V", "b", "Z", "getMIsEditing", "()Z", "setMIsEditing", "mIsEditing", "Landroid/widget/EditText;", "f", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "value", "m", "getHasError", "setHasError", "hasError", "Landroid/graphics/drawable/Drawable;", JWKParameterNames.RSA_MODULUS, "Landroid/graphics/drawable/Drawable;", "getImageIcon", "()Landroid/graphics/drawable/Drawable;", "setImageIcon", "(Landroid/graphics/drawable/Drawable;)V", "imageIcon", "Landroid/content/res/ColorStateList;", "o", "Landroid/content/res/ColorStateList;", "getImageIconTint", "()Landroid/content/res/ColorStateList;", "setImageIconTint", "(Landroid/content/res/ColorStateList;)V", "imageIconTint", "", "p", "Ljava/lang/String;", "getEditHintText", "()Ljava/lang/String;", "setEditHintText", "(Ljava/lang/String;)V", "editHintText", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ljava/lang/Integer;", "getEditCharLimit", "()Ljava/lang/Integer;", "setEditCharLimit", "(Ljava/lang/Integer;)V", "editCharLimit", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getEditByteLimit", "setEditByteLimit", "editByteLimit", "Lkotlin/Function0;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Le23/a;", "getOnStartEditing", "()Le23/a;", "setOnStartEditing", "(Le23/a;)V", "onStartEditing", "Lkotlin/Function1;", "v", "Le23/l;", "getOnDoneEditing", "()Le23/l;", "setOnDoneEditing", "(Le23/l;)V", "onDoneEditing", "w", "I", "getInputType", "()I", "setInputType", "(I)V", "inputType", "x", "getShowCharacterCount", "setShowCharacterCount", "showCharacterCount", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "getAllowedDigits", "setAllowedDigits", "allowedDigits", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;", "z", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;", "getActionButtonData", "()Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;", "setActionButtonData", "(Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;)V", "actionButtonData", "A", "getNonEditingBackground", "setNonEditingBackground", "nonEditingBackground", "B", "getEditingBackground", "setEditingBackground", "editingBackground", "C", "getNonEditingTitleColor", "setNonEditingTitleColor", "nonEditingTitleColor", "D", "getEditingTitleColor", "setEditingTitleColor", "editingTitleColor", "E", "getNonEditingValueColor", "setNonEditingValueColor", "nonEditingValueColor", "F", "getEditingValueColor", "setEditingValueColor", "editingValueColor", "getCharacterCountColor", "setCharacterCountColor", "characterCountColor", "P", "getActionButtonColor", "setActionButtonColor", "actionButtonColor", "getTitle", "setTitle", "title", "getEditTextValue", "setEditTextValue", "editTextValue", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends FrameLayout {
    public static final /* synthetic */ int T = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public Drawable nonEditingBackground;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public Drawable editingBackground;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public int nonEditingTitleColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public int editingTitleColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public int nonEditingValueColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int editingValueColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int characterCountColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int actionButtonColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f47698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean mIsEditing;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f47700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f47701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f47702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final EditText editText;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f47704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f47705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f47706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f47707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f47708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f47709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasError;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Drawable imageIcon;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public ColorStateList imageIconTint;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public String editHintText;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Integer editCharLimit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Integer editByteLimit;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public e23.a<Unit> onStartEditing;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public l<? super String, Unit> onDoneEditing;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int inputType;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public boolean showCharacterCount;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public String allowedDigits;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public a actionButtonData;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;", "", "", "text", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Le23/a;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f47723b;

        public a(String str, e23.a<Unit> aVar) {
            str.getClass();
            aVar.getClass();
            this.f47722a = str;
            this.f47723b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47722a.equals(aVar.f47722a) && this.f47723b.equals(aVar.f47723b);
        }

        public final int hashCode() {
            return this.f47723b.hashCode() + (this.f47722a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonData(text=" + this.f47722a + ", action=" + this.f47723b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/reusablecomponents/b$c", "Landroid/text/TextWatcher;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            b.this.a();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    static {
        new C0930b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.inputType = 16384;
        this.showCharacterCount = true;
        this.nonEditingTitleColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.editingTitleColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.nonEditingValueColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.editingValueColor = a7.b.getColor(context, R.color.gcm_text_primary);
        this.characterCountColor = a7.b.getColor(context, R.color.gcm_text_secondary);
        this.actionButtonColor = a7.b.getColor(context, R.color.gray_black_static);
        LayoutInflater.from(context).inflate(R.layout.view_rc_inline_text_field, this);
        setLayoutTransition(new LayoutTransition());
        setPadding(getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.spacing_normal), getPaddingRight(), getPaddingBottom());
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149714p);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inline_text_field_container);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.inline_text_field_layout_dummy);
        viewFindViewById2.getClass();
        View viewFindViewById3 = findViewById(R.id.inline_text_field_title_dummy);
        viewFindViewById3.getClass();
        this.f47700c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.inline_text_field_edit_text_dummy);
        viewFindViewById4.getClass();
        this.f47701d = (EditText) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.inline_text_field_title);
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        this.f47702e = textView;
        View viewFindViewById6 = findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById6.getClass();
        EditText editText = (EditText) viewFindViewById6;
        this.editText = editText;
        View viewFindViewById7 = findViewById(R.id.inline_text_field_error_icon);
        viewFindViewById7.getClass();
        this.f47704g = (ImageView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.inline_text_field_edit_info);
        viewFindViewById8.getClass();
        View viewFindViewById9 = findViewById(R.id.inline_text_field_character_count);
        viewFindViewById9.getClass();
        this.f47705h = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.inline_text_field_clear_button);
        viewFindViewById10.getClass();
        ImageView imageView = (ImageView) viewFindViewById10;
        this.f47706i = imageView;
        View viewFindViewById11 = findViewById(R.id.inline_text_field_button_separator);
        viewFindViewById11.getClass();
        this.f47707j = viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.inline_text_field_action_button);
        viewFindViewById12.getClass();
        this.f47708k = (TextView) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.inline_text_field_image_icon);
        viewFindViewById13.getClass();
        this.f47709l = (ImageView) viewFindViewById13;
        textView.setText(typedArrayObtainStyledAttributes.getString(7));
        setNonEditingTitleColor(typedArrayObtainStyledAttributes.getColor(6, this.nonEditingTitleColor));
        setEditingTitleColor(typedArrayObtainStyledAttributes.getColor(2, this.editingTitleColor));
        setNonEditingValueColor(typedArrayObtainStyledAttributes.getColor(6, this.nonEditingValueColor));
        setEditingValueColor(typedArrayObtainStyledAttributes.getColor(3, this.editingValueColor));
        setActionButtonColor(typedArrayObtainStyledAttributes.getColor(0, this.actionButtonColor));
        setNonEditingBackground(typedArrayObtainStyledAttributes.getDrawable(4));
        setEditingBackground(typedArrayObtainStyledAttributes.getDrawable(1));
        typedArrayObtainStyledAttributes.recycle();
        final int i15 = 0;
        setOnClickListener(new View.OnClickListener(this) { // from class: c32.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.view.reusablecomponents.b f24111b;

            {
                this.f24111b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = this.f24111b;
                        bVar.setEditingMode(!bVar.mIsEditing);
                        break;
                    default:
                        this.f24111b.editText.getText().clear();
                        break;
                }
            }
        });
        editText.setOnFocusChangeListener(new f(this, i15));
        editText.addTextChangedListener(new c());
        editText.setImeOptions(6);
        editText.setRawInputType(this.inputType);
        final int i16 = 1;
        editText.setOnEditorActionListener(new bl0.a(this, i16));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: c32.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.view.reusablecomponents.b f24111b;

            {
                this.f24111b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = this.f24111b;
                        bVar.setEditingMode(!bVar.mIsEditing);
                        break;
                    default:
                        this.f24111b.editText.getText().clear();
                        break;
                }
            }
        });
        f();
    }

    public void a() {
        setContentDescription(getTitle() + StringUtils.SPACE + getEditTextValue());
        c();
    }

    public void b() {
        l<? super String, Unit> lVar = this.onDoneEditing;
        EditText editText = this.editText;
        if (lVar != null) {
            lVar.invoke(editText.getText().toString());
        }
        editText.setImportantForAccessibility(2);
    }

    @SuppressLint({"SetTextI18n"})
    public final void c() {
        int length = this.editText.getText().toString().length();
        Integer num = this.editCharLimit;
        this.f47705h.setText(length + " / " + (num != null ? num.intValue() : 0));
    }

    public final void d() {
        e.r(this.f47705h, this.editCharLimit != null && this.mIsEditing && this.showCharacterCount);
    }

    public final void e() {
        InputFilter.LengthFilter[] lengthFilterArr;
        if (!this.mIsEditing || this.editCharLimit == null) {
            lengthFilterArr = new InputFilter[0];
        } else {
            Integer num = this.editCharLimit;
            num.getClass();
            lengthFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        this.editText.setFilters(lengthFilterArr);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final void f() {
        boolean z14;
        boolean z15 = this.mIsEditing;
        EditText editText = this.editText;
        if (z15) {
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
        ViewGroup.LayoutParams layoutParams = this.f47702e.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, z14 ? 0 : getResources().getDimensionPixelSize(R.dimen.spacing_normal));
        }
        e.r(editText, z14);
    }

    @SuppressLint({"Recycle"})
    public void g() {
        e23.a<Unit> aVar;
        if (this.mIsEditing && (aVar = this.onStartEditing) != null) {
            aVar.invoke();
        }
        setBackground(this.mIsEditing ? this.editingBackground : this.nonEditingBackground);
        boolean z14 = this.mIsEditing;
        ValueAnimator duration = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z14 ? this.nonEditingTitleColor : this.editingTitleColor), Integer.valueOf(z14 ? this.editingTitleColor : this.nonEditingTitleColor)).setDuration(200L);
        boolean z15 = false;
        z15 = false;
        final int i14 = z15 ? 1 : 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: c32.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.view.reusablecomponents.b f24115b;

            {
                this.f24115b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = this.f24115b;
                switch (i15) {
                    case 0:
                        int i16 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        TextView textView = bVar.f47702e;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i17 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        EditText editText = bVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i18 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        ImageView imageView = bVar.f47706i;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        imageView.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = bVar.f47705h;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration.start();
        boolean z16 = this.mIsEditing;
        ValueAnimator duration2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(z16 ? this.nonEditingValueColor : this.editingValueColor), Integer.valueOf(z16 ? this.editingValueColor : this.nonEditingValueColor)).setDuration(200L);
        final int i15 = 1;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: c32.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.view.reusablecomponents.b f24115b;

            {
                this.f24115b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = this.f24115b;
                switch (i16) {
                    case 0:
                        int i17 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        TextView textView = bVar.f47702e;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i18 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        EditText editText = bVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i19 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        ImageView imageView = bVar.f47706i;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        imageView.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = bVar.f47705h;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration2.start();
        boolean z17 = this.mIsEditing;
        float f14 = z17 ? 0.0f : 1.0f;
        float f15 = z17 ? 1.0f : 0.0f;
        final int i16 = 2;
        ValueAnimator duration3 = ValueAnimator.ofFloat(f14, f15).setDuration(200L);
        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: c32.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.view.reusablecomponents.b f24115b;

            {
                this.f24115b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.view.reusablecomponents.b bVar = this.f24115b;
                switch (i17) {
                    case 0:
                        int i18 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        TextView textView = bVar.f47702e;
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        animatedValue.getClass();
                        textView.setTextColor(((Integer) animatedValue).intValue());
                        break;
                    case 1:
                        int i19 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        EditText editText = bVar.editText;
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        animatedValue2.getClass();
                        editText.setTextColor(((Integer) animatedValue2).intValue());
                        break;
                    default:
                        int i110 = com.garmin.android.apps.connectmobile.view.reusablecomponents.b.T;
                        valueAnimator.getClass();
                        ImageView imageView = bVar.f47706i;
                        Object animatedValue3 = valueAnimator.getAnimatedValue();
                        animatedValue3.getClass();
                        imageView.setAlpha(((Float) animatedValue3).floatValue());
                        TextView textView2 = bVar.f47705h;
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        animatedValue4.getClass();
                        textView2.setAlpha(((Float) animatedValue4).floatValue());
                        break;
                }
            }
        });
        duration3.start();
        e.r(this.f47706i, this.mIsEditing);
        d();
        e.r(this.f47709l, !this.mIsEditing);
        e.r(this.f47704g, this.hasError && !this.mIsEditing);
        f();
        if (this.mIsEditing) {
            EditText editText = this.editText;
            editText.setSelection(editText.getText().length());
            editText.setImportantForAccessibility(1);
            editText.requestFocus();
            Object systemService = editText.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
        e();
        if (this.mIsEditing && this.actionButtonData != null) {
            z15 = true;
        }
        e.r(this.f47708k, z15);
        e.r(this.f47707j, z15);
    }

    public final int getActionButtonColor() {
        return this.actionButtonColor;
    }

    public final a getActionButtonData() {
        return this.actionButtonData;
    }

    public final String getAllowedDigits() {
        return this.allowedDigits;
    }

    public final int getCharacterCountColor() {
        return this.characterCountColor;
    }

    public final Integer getEditByteLimit() {
        return this.editByteLimit;
    }

    public final Integer getEditCharLimit() {
        return this.editCharLimit;
    }

    public final String getEditHintText() {
        return this.editHintText;
    }

    public final EditText getEditText() {
        return this.editText;
    }

    public final String getEditTextValue() {
        return this.editText.getText().toString();
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

    public final Drawable getImageIcon() {
        return this.imageIcon;
    }

    public final ColorStateList getImageIconTint() {
        return this.imageIconTint;
    }

    public final int getInputType() {
        return this.inputType;
    }

    public final boolean getMIsEditing() {
        return this.mIsEditing;
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

    public final l<String, Unit> getOnDoneEditing() {
        return this.onDoneEditing;
    }

    public final e23.a<Unit> getOnStartEditing() {
        return this.onStartEditing;
    }

    public final boolean getShowCharacterCount() {
        return this.showCharacterCount;
    }

    public final String getTitle() {
        CharSequence text = this.f47702e.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final void h(boolean z14) {
        e.r(this.f47709l, z14);
    }

    public final void setActionButtonColor(int i14) {
        this.actionButtonColor = i14;
        this.f47708k.setTextColor(i14);
    }

    public final void setActionButtonData(a aVar) {
        this.actionButtonData = aVar;
        String str = aVar != null ? aVar.f47722a : null;
        TextView textView = this.f47708k;
        textView.setText(str);
        if (aVar == null) {
            textView.setOnClickListener(null);
        } else {
            textView.setOnClickListener(new a32.b(aVar, 21));
        }
    }

    public final void setAllowedDigits(String str) {
        this.allowedDigits = str;
        this.editText.setKeyListener(str != null ? DigitsKeyListener.getInstance(str) : null);
    }

    public final void setCharacterCountColor(int i14) {
        this.characterCountColor = i14;
        this.f47705h.setTextColor(i14);
    }

    public final void setEditByteLimit(Integer num) {
        i iVar;
        this.editByteLimit = num;
        i iVar2 = this.f47698a;
        EditText editText = this.editText;
        if (iVar2 != null) {
            editText.removeTextChangedListener(iVar2);
        }
        if (num != null) {
            iVar = new i(num.intValue(), editText);
            editText.addTextChangedListener(iVar);
        } else {
            iVar = null;
        }
        this.f47698a = iVar;
    }

    public final void setEditCharLimit(Integer num) {
        this.editCharLimit = num;
        e();
        c();
        d();
    }

    public final void setEditHintText(String str) {
        this.editHintText = str;
        this.editText.setHint(str);
    }

    public final void setEditTextValue(String str) {
        str.getClass();
        EditText editText = this.editText;
        editText.getClass();
        editText.setText(str);
        Unit unit = Unit.INSTANCE;
        EditText editText2 = this.f47701d;
        editText2.getClass();
        editText2.setText(str);
        Unit unit2 = Unit.INSTANCE;
        f();
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
    }

    public final void setEditingBackground(Drawable drawable) {
        this.editingBackground = drawable;
        if (!this.mIsEditing) {
            drawable = this.nonEditingBackground;
        }
        setBackground(drawable);
    }

    public final void setEditingMode(boolean shouldEdit) {
        this.mIsEditing = shouldEdit;
        g();
    }

    public final void setEditingTitleColor(int i14) {
        this.editingTitleColor = i14;
        if (this.mIsEditing) {
            this.f47702e.setTextColor(i14);
        }
    }

    public final void setEditingValueColor(int i14) {
        this.editingValueColor = i14;
        if (this.mIsEditing) {
            this.editText.setTextColor(i14);
        }
    }

    public final void setHasError(boolean z14) {
        this.hasError = z14;
        e.r(this.f47704g, z14 && !this.mIsEditing);
    }

    public final void setImageIcon(Drawable drawable) {
        this.imageIcon = drawable;
        this.f47709l.setImageDrawable(drawable);
    }

    public final void setImageIconTint(ColorStateList colorStateList) {
        this.imageIconTint = colorStateList;
        this.f47709l.setImageTintList(colorStateList);
    }

    public final void setInputType(int i14) {
        this.inputType = i14;
        this.editText.setRawInputType(i14);
    }

    public final void setMIsEditing(boolean z14) {
        this.mIsEditing = z14;
    }

    public final void setNonEditingBackground(Drawable drawable) {
        this.nonEditingBackground = drawable;
        if (this.mIsEditing) {
            drawable = this.editingBackground;
        }
        setBackground(drawable);
    }

    public final void setNonEditingTitleColor(int i14) {
        this.nonEditingTitleColor = i14;
        if (this.mIsEditing) {
            return;
        }
        this.f47702e.setTextColor(i14);
    }

    public final void setNonEditingValueColor(int i14) {
        this.nonEditingValueColor = i14;
        if (this.mIsEditing) {
            return;
        }
        this.editText.setTextColor(i14);
    }

    public final void setOnDoneEditing(l<? super String, Unit> lVar) {
        this.onDoneEditing = lVar;
    }

    public final void setOnStartEditing(e23.a<Unit> aVar) {
        this.onStartEditing = aVar;
    }

    public final void setShowCharacterCount(boolean z14) {
        this.showCharacterCount = z14;
        d();
    }

    public final void setSpannableTitle(Spannable spannableString) {
        spannableString.getClass();
        this.f47702e.setText(spannableString);
    }

    public final void setTitle(String str) {
        TextView textView = this.f47702e;
        textView.getClass();
        textView.setText(str);
        Unit unit = Unit.INSTANCE;
        TextView textView2 = this.f47700c;
        textView2.getClass();
        textView2.setText(str);
        Unit unit2 = Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.view.reusablecomponents.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$b;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0930b {
        public /* synthetic */ C0930b(j jVar) {
            this();
        }

        private C0930b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
