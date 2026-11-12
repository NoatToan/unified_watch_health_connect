package com.garmin.android.apps.connectmobile.training.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import dx1.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/view/TrainingPlansTwoLineButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "resId", "setIconImageResource", "(I)V", "", "text", "setLabelTop", "(Ljava/lang/CharSequence;)V", "Landroid/widget/TextView;", "getLabelTop", "()Landroid/widget/TextView;", "getLabelBottom", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TrainingPlansTwoLineButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f45650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f45651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f45652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainingPlansTwoLineButton(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14, i15);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm4_training_plans_two_rows_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.icon);
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        this.f45650a = imageView;
        View viewFindViewById2 = findViewById(R.id.label_top);
        viewFindViewById2.getClass();
        this.f45651b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.label_bottom);
        viewFindViewById3.getClass();
        this.f45652c = (TextView) viewFindViewById3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f61480a, i14, i15);
        typedArrayObtainStyledAttributes.getClass();
        if (typedArrayObtainStyledAttributes.hasValue(3) && typedArrayObtainStyledAttributes.hasValue(1)) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
            layoutParams.height = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            imageView.setLayoutParams(layoutParams);
        }
        setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(2));
        setLabelTop(typedArrayObtainStyledAttributes.getString(4));
        a(this, typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(TrainingPlansTwoLineButton trainingPlansTwoLineButton, String str) {
        TextView textView = trainingPlansTwoLineButton.f45652c;
        textView.setText(str);
        textView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
    }

    /* JADX INFO: renamed from: getLabelBottom, reason: from getter */
    public final TextView getF45652c() {
        return this.f45652c;
    }

    /* JADX INFO: renamed from: getLabelTop, reason: from getter */
    public final TextView getF45651b() {
        return this.f45651b;
    }

    public final void setIconDrawable(Drawable drawable) {
        ImageView imageView = this.f45650a;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
    }

    public final void setIconImageResource(int resId) {
        ImageView imageView = this.f45650a;
        if (resId == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(resId);
            imageView.setVisibility(0);
        }
    }

    public final void setLabelTop(CharSequence text) {
        TextView textView = this.f45651b;
        textView.setText(text);
        textView.setVisibility((text == null || text.length() == 0) ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrainingPlansTwoLineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrainingPlansTwoLineButton(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrainingPlansTwoLineButton(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ TrainingPlansTwoLineButton(Context context, AttributeSet attributeSet, int i14, int i15, int i16, j jVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? 0 : i15);
    }
}
