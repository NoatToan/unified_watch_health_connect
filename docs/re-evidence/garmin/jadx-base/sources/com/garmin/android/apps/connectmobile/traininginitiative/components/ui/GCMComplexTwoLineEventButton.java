package com.garmin.android.apps.connectmobile.traininginitiative.components.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.s0;
import b7.g;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import l7.f;
import og2.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r22.j1;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010#2\b\u0010)\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R(\u0010,\u001a\u0004\u0018\u00010#2\b\u0010,\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R(\u0010/\u001a\u0004\u0018\u00010#2\b\u0010/\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010&\"\u0004\b1\u0010(R(\u00102\u001a\u0004\u0018\u00010#2\b\u00102\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u00065"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/components/ui/GCMComplexTwoLineEventButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setLeftIcon", "(Landroid/graphics/drawable/Drawable;)V", "setLeftBottomIcon", "setLeftIconBackground", "setRightIcon", "Landroid/widget/ImageView;", "getLeftIconView", "()Landroid/widget/ImageView;", TtmlNode.ATTR_TTS_COLOR, "setBackgroundColor", "(I)V", "", "buttonTopLabel", "getButtonTopLabel", "()Ljava/lang/String;", "setButtonTopLabel", "(Ljava/lang/String;)V", "buttonBottomLeftFirstLabel", "getButtonBottomLeftFirstLabel", "setButtonBottomLeftFirstLabel", "buttonBottomLeftSecondLabel", "getButtonBottomLeftSecondLabel", "setButtonBottomLeftSecondLabel", "monthLabel", "getMonthLabel", "setMonthLabel", "dateLabel", "getDateLabel", "setDateLabel", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMComplexTwoLineEventButton extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f45660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f45661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f45662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f45663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f45664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f45665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f45666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f45667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f45669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View.OnClickListener f45670k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/components/ui/GCMComplexTwoLineEventButton$a", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.k(f.a.f110568g);
            fVar.o(false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/traininginitiative/components/ui/GCMComplexTwoLineEventButton$b", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.core.view.a {
        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.b(f.a.f110568g);
            fVar.o(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMComplexTwoLineEventButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_two_line_event_button, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149707i, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.inner_layout);
        this.f45660a = viewGroup;
        View viewFindViewById = findViewById(R.id.icon_left);
        viewFindViewById.getClass();
        this.f45661b = (ImageView) viewFindViewById;
        setLeftIcon(typedArrayObtainStyledAttributes.getDrawable(11));
        View viewFindViewById2 = findViewById(R.id.label_top);
        viewFindViewById2.getClass();
        this.f45664e = (TextView) viewFindViewById2;
        setButtonTopLabel(typedArrayObtainStyledAttributes.getString(10));
        View viewFindViewById3 = findViewById(R.id.label_bottom_first);
        viewFindViewById3.getClass();
        this.f45665f = (TextView) viewFindViewById3;
        setButtonBottomLeftFirstLabel(typedArrayObtainStyledAttributes.getString(7));
        View viewFindViewById4 = findViewById(R.id.label_bottom_second);
        viewFindViewById4.getClass();
        this.f45666g = (TextView) viewFindViewById4;
        setButtonBottomLeftSecondLabel(typedArrayObtainStyledAttributes.getString(7));
        View viewFindViewById5 = findViewById(R.id.icon_bottom_left);
        viewFindViewById5.getClass();
        this.f45662c = (ImageView) viewFindViewById5;
        setLeftBottomIcon(typedArrayObtainStyledAttributes.getDrawable(11));
        View viewFindViewById6 = findViewById(R.id.month_date_layout);
        viewFindViewById6.getClass();
        this.f45667h = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.text_view_month);
        viewFindViewById7.getClass();
        this.f45668i = (TextView) viewFindViewById7;
        setMonthLabel(typedArrayObtainStyledAttributes.getString(7));
        View viewFindViewById8 = findViewById(R.id.text_view_date);
        viewFindViewById8.getClass();
        this.f45669j = (TextView) viewFindViewById8;
        setDateLabel(typedArrayObtainStyledAttributes.getString(7));
        View viewFindViewById9 = findViewById(R.id.icon_right);
        viewFindViewById9.getClass();
        this.f45663d = (ImageView) viewFindViewById9;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        Drawable drawable = resources.getDrawable(R.drawable.check, null);
        k.F(R.color.gcm_icon_primary_action, context, drawable);
        setRightIcon(drawable);
        k(false);
        int color = typedArrayObtainStyledAttributes.getColor(0, -1);
        if (color != -1) {
            viewGroup.getClass();
            viewGroup.setBackgroundColor(color);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String getButtonBottomLeftFirstLabel() {
        CharSequence text = this.f45665f.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final String getButtonBottomLeftSecondLabel() {
        CharSequence text = this.f45666g.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final String getButtonTopLabel() {
        CharSequence text = this.f45664e.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final String getDateLabel() {
        CharSequence text = this.f45669j.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final ImageView getLeftIconView() {
        ImageView imageView = this.f45661b;
        e.q(imageView);
        return imageView;
    }

    public final String getMonthLabel() {
        CharSequence text = this.f45668i.getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final void i(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f45665f;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView.setContentDescription(null);
    }

    public final void j(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f45666g;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView.setContentDescription(null);
    }

    public final void k(boolean z14) {
        this.f45663d.setVisibility(z14 ? 0 : 8);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        ViewGroup viewGroup = this.f45660a;
        viewGroup.getClass();
        viewGroup.setBackgroundColor(color);
    }

    public final void setButtonBottomLeftFirstLabel(String str) {
        i(str);
    }

    public final void setButtonBottomLeftSecondLabel(String str) {
        j(str);
    }

    public final void setButtonTopLabel(String str) {
        this.f45664e.setText(str);
    }

    public final void setDateLabel(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f45669j;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView.setContentDescription(null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ViewGroup viewGroup = this.f45660a;
        if (viewGroup != null) {
            viewGroup.setEnabled(enabled);
        }
        TextView textView = this.f45666g;
        TextView textView2 = this.f45665f;
        TextView textView3 = this.f45664e;
        if (!enabled) {
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_1));
            }
            textView3.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary_disabled));
            textView2.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary_disabled));
            textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary_disabled));
            this.f45668i.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary_disabled));
            viewGroup.getClass();
            viewGroup.setOnClickListener(null);
            return;
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
        }
        textView3.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_primary));
        textView2.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary));
        textView.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary));
        View viewFindViewById = findViewById(R.id.text_view_month);
        viewFindViewById.getClass();
        TextView textView4 = (TextView) viewFindViewById;
        this.f45668i = textView4;
        textView4.setTextColor(a7.b.getColor(getContext(), R.color.gcm_text_secondary));
        if (viewGroup != null) {
            View.OnClickListener onClickListener = this.f45670k;
            if (onClickListener != null) {
                viewGroup.setOnClickListener(onClickListener);
            } else {
                s.m("mOnClickListener");
                throw null;
            }
        }
    }

    public final void setLeftBottomIcon(Drawable drawable) {
        ImageView imageView = this.f45662c;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setLeftIcon(Drawable drawable) {
        ImageView imageView = this.f45661b;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setLeftIconBackground(Drawable drawable) {
        ImageView imageView = this.f45661b;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setBackground(drawable);
        }
    }

    public final void setMonthLabel(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f45668i;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        this.f45668i.setVisibility(0);
        this.f45668i.setContentDescription(null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l14) {
        ViewGroup viewGroup = this.f45660a;
        if (viewGroup != null) {
            if (l14 == null) {
                s0.r(viewGroup, new a());
            } else {
                this.f45670k = l14;
                s0.r(viewGroup, new b());
            }
            viewGroup.setOnClickListener(l14);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l14) {
        ViewGroup viewGroup = this.f45660a;
        viewGroup.getClass();
        viewGroup.setOnLongClickListener(l14);
    }

    public final void setRightIcon(Drawable drawable) {
        ImageView imageView = this.f45663d;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMComplexTwoLineEventButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMComplexTwoLineEventButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMComplexTwoLineEventButton(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
