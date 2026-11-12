package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import e23.l;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r22.j1;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010+\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u00101\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00104\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R$\u00107\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100¨\u00068"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/ComplexEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function2;", "Landroid/view/View;", "", "", "onFocusChange", "setOnFocusChangeListener", "(Le23/p;)V", "Lkotlin/Function1;", "onClickListener", "setOnClickListener", "(Le23/l;)V", "setDrawableOnClickListener", "resourceId", "setResourceId", "(I)V", "Landroid/view/ViewGroup;", "value", "a", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;", "parentContainer", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTopLabel", "()Landroid/widget/TextView;", "topLabel", "Landroid/widget/EditText;", "c", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getDrawableEnd", "()Landroid/widget/ImageView;", "drawableEnd", JWKParameterNames.RSA_EXPONENT, "getAdditionalMessageLabel", "additionalMessageLabel", "f", "getAdditionalMessageIcon", "additionalMessageIcon", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ComplexEditText extends ConstraintLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f47732h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final ViewGroup parentContainer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final TextView topLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final EditText editText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final ImageView drawableEnd;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final TextView additionalMessageLabel;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final ImageView additionalMessageIcon;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplexEditText(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.complex_edit_text, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149700b, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inner_layout);
        viewFindViewById.getClass();
        this.parentContainer = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.top_label);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.topLabel = textView;
        View viewFindViewById3 = findViewById(R.id.edit_text);
        viewFindViewById3.getClass();
        EditText editText = (EditText) viewFindViewById3;
        this.editText = editText;
        View viewFindViewById4 = findViewById(R.id.drawable_end);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        this.drawableEnd = imageView;
        View viewFindViewById5 = findViewById(R.id.additional_message);
        viewFindViewById5.getClass();
        TextView textView2 = (TextView) viewFindViewById5;
        this.additionalMessageLabel = textView2;
        View viewFindViewById6 = findViewById(R.id.additional_message_icon);
        viewFindViewById6.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById6;
        this.additionalMessageIcon = imageView2;
        textView.setText(typedArrayObtainStyledAttributes.getString(2));
        imageView.setBackground(typedArrayObtainStyledAttributes.getDrawable(1));
        String string = typedArrayObtainStyledAttributes.getString(0);
        this.f47739g = string;
        textView2.setText(string);
        imageView2.setBackground(typedArrayObtainStyledAttributes.getDrawable(3));
        editText.setBackground(j.a.a(context, R.drawable.gcm_edit_text_unselected));
        j();
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ImageView getAdditionalMessageIcon() {
        return this.additionalMessageIcon;
    }

    public final TextView getAdditionalMessageLabel() {
        return this.additionalMessageLabel;
    }

    public final ImageView getDrawableEnd() {
        return this.drawableEnd;
    }

    public final EditText getEditText() {
        return this.editText;
    }

    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }

    public final TextView getTopLabel() {
        return this.topLabel;
    }

    public final void i() {
        e.j(this.additionalMessageIcon);
        this.editText.setBackground(getResources().getDrawable(R.drawable.gcm_edit_text_unselected, null));
        this.additionalMessageLabel.setText(this.f47739g);
    }

    public final void j() {
        TextView textView = this.additionalMessageLabel;
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || w.J(text)) ? 8 : 0);
        ImageView imageView = this.drawableEnd;
        imageView.setVisibility(imageView.getBackground() != null ? 0 : 8);
        ImageView imageView2 = this.additionalMessageIcon;
        imageView2.setVisibility(imageView2.getBackground() != null ? 0 : 8);
    }

    public final void setDrawableOnClickListener(l<? super View, Unit> onClickListener) {
        onClickListener.getClass();
        this.drawableEnd.setOnClickListener(new h32.a(this, onClickListener, 1));
    }

    public final void setOnClickListener(l<? super View, Unit> onClickListener) {
        onClickListener.getClass();
        this.editText.setOnClickListener(new h32.a(this, onClickListener, 0));
    }

    public final void setOnFocusChangeListener(p<? super View, ? super Boolean, Unit> onFocusChange) {
        onFocusChange.getClass();
        this.editText.setOnFocusChangeListener(new ew1.l(2, this, onFocusChange));
    }

    public final void setResourceId(int resourceId) {
        EditText editText = this.editText;
        editText.setId(resourceId);
        ImageView imageView = this.drawableEnd;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f6134v = resourceId;
        bVar.f6112i = resourceId;
        bVar.f6118l = resourceId;
        imageView.setLayoutParams(bVar);
        ImageView imageView2 = this.additionalMessageIcon;
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        layoutParams2.getClass();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f6114j = resourceId;
        imageView2.setLayoutParams(bVar2);
        TextView textView = this.additionalMessageLabel;
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.f6114j = resourceId;
        textView.setLayoutParams(bVar3);
        this.topLabel.setLabelFor(editText.getId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComplexEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComplexEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ComplexEditText(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
