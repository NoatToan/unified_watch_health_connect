package com.garmin.android.apps.connectmobile.traininginitiative.components.ui;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\b\b\u0001\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\b\b\u0001\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010 J\u0015\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b#\u0010 J\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010 J\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010 J\u0015\u0010(\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b(\u0010 J\u0015\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b)\u0010 J\u0017\u0010\u001f\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b\u001f\u0010,J\u0017\u0010-\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010 R(\u0010\u001b\u001a\u0004\u0018\u00010.2\b\u0010\u001b\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b\u001c\u00101R(\u0010+\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00100\"\u0004\b\u001f\u00101¨\u00064"}, d2 = {"Lcom/garmin/android/apps/connectmobile/traininginitiative/components/ui/GCMComplexButton;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnLongClickListener;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setRightIcon", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/text/Spannable;", "buttonTopLabel", "setButtonTopLabel", "(Landroid/text/Spannable;)V", "stringRes", "setButtonBottomLeftLabel", "(I)V", TtmlNode.ATTR_TTS_COLOR, "setButtonTopLabelTextColor", "setButtonBottomLeftLabelTextColor", "colorId", "setTopDividerColor", "height", "setTopDividerHeight", "setBottomDividerColor", "setBottomDividerHeight", "Landroid/text/SpannableStringBuilder;", "buttonBottomLeftLabel", "(Landroid/text/SpannableStringBuilder;)V", "setBackgroundColor", "", "getButtonTopLabel", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "buttonBottomLabel", "getButtonBottomLeftLabel", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMComplexButton extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f45653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f45654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f45655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f45656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f45657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f45658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f45659g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMComplexButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_button, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149707i, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        View viewFindViewById = findViewById(R.id.inner_layout);
        viewFindViewById.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        this.f45653a = viewGroup;
        View viewFindViewById2 = findViewById(R.id.icon_right);
        viewFindViewById2.getClass();
        this.f45654b = (ImageView) viewFindViewById2;
        setRightIcon(typedArrayObtainStyledAttributes.getDrawable(12));
        View viewFindViewById3 = findViewById(R.id.label_top);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.f45655c = textView;
        setButtonTopLabel(typedArrayObtainStyledAttributes.getString(10));
        View viewFindViewById4 = findViewById(R.id.label_bottom);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f45656d = textView2;
        setButtonBottomLeftLabel(typedArrayObtainStyledAttributes.getString(7));
        if (typedArrayObtainStyledAttributes.getBoolean(4, false)) {
            textView.setSingleLine(false);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            textView2.setSingleLine(false);
        }
        View viewFindViewById5 = findViewById(R.id.top_divider);
        this.f45657e = viewFindViewById5;
        if (typedArrayObtainStyledAttributes.getBoolean(6, false) && viewFindViewById5 != null) {
            viewFindViewById5.setVisibility(0);
        }
        int color = typedArrayObtainStyledAttributes.getColor(14, -1);
        if (color != -1 && viewFindViewById5 != null) {
            viewFindViewById5.setBackgroundColor(color);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        ViewGroup.LayoutParams layoutParams = viewFindViewById5 != null ? viewFindViewById5.getLayoutParams() : null;
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = dimensionPixelSize;
        View viewFindViewById6 = findViewById(R.id.bottom_divider);
        this.f45658f = viewFindViewById6;
        if (typedArrayObtainStyledAttributes.getBoolean(5, false) && viewFindViewById6 != null) {
            viewFindViewById6.setVisibility(0);
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
        if (color2 != -1 && viewFindViewById6 != null) {
            viewFindViewById6.setBackgroundColor(color2);
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById6 != null ? viewFindViewById6.getLayoutParams() : null;
        layoutParams2.getClass();
        ((LinearLayout.LayoutParams) layoutParams2).height = dimensionPixelSize2;
        int color3 = typedArrayObtainStyledAttributes.getColor(0, -1);
        if (color3 != -1) {
            viewGroup.setBackgroundColor(color3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(boolean z14) {
        ImageView imageView = this.f45654b;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 4);
        }
    }

    public final String getButtonBottomLeftLabel() {
        TextView textView = this.f45656d;
        CharSequence text = textView != null ? textView.getText() : null;
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final String getButtonTopLabel() {
        TextView textView = this.f45655c;
        CharSequence text = textView != null ? textView.getText() : null;
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        ViewGroup viewGroup = this.f45653a;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(color);
        }
    }

    public final void setBottomDividerColor(int colorId) {
        View view2 = this.f45658f;
        if (view2 != null) {
            view2.setBackgroundColor(colorId);
        }
    }

    public final void setBottomDividerHeight(int height) {
        View view2 = this.f45658f;
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setButtonBottomLeftLabel(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f45656d;
        if (zIsEmpty) {
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            if (textView != null) {
                textView.setText(str);
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public final void setButtonBottomLeftLabelTextColor(int color) {
        TextView textView = this.f45656d;
        if (textView != null) {
            textView.setTextColor(b.getColor(getContext(), color));
        }
    }

    public final void setButtonTopLabel(String str) {
        TextView textView = this.f45655c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setButtonTopLabelTextColor(int color) {
        TextView textView = this.f45655c;
        if (textView != null) {
            textView.setTextColor(b.getColor(getContext(), color));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ViewGroup viewGroup = this.f45653a;
        if (viewGroup != null) {
            viewGroup.setEnabled(enabled);
        }
        TextView textView = this.f45656d;
        TextView textView2 = this.f45655c;
        if (enabled) {
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
            }
            if (textView2 != null) {
                textView2.setTextColor(b.getColor(getContext(), R.color.gcm_text_primary));
            }
            if (textView != null) {
                textView.setTextColor(b.getColor(getContext(), R.color.gcm_text_secondary));
            }
            if (viewGroup != null) {
                viewGroup.setOnClickListener(this.f45659g);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(b.getColor(getContext(), R.color.gcm_surface_1));
        }
        if (textView2 != null) {
            textView2.setTextColor(b.getColor(getContext(), R.color.gcm_text_primary_disabled));
        }
        if (textView != null) {
            textView.setTextColor(b.getColor(getContext(), R.color.gcm_text_secondary_disabled));
        }
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l14) {
        this.f45659g = l14;
        ViewGroup viewGroup = this.f45653a;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(l14);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l14) {
        ViewGroup viewGroup = this.f45653a;
        if (viewGroup != null) {
            viewGroup.setOnLongClickListener(l14);
        }
    }

    public final void setRightIcon(Drawable drawable) {
        ImageView imageView = this.f45654b;
        if (drawable == null) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final void setTopDividerColor(int colorId) {
        View view2 = this.f45657e;
        if (view2 != null) {
            view2.setBackgroundColor(colorId);
        }
    }

    public final void setTopDividerHeight(int height) {
        View view2 = this.f45657e;
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setButtonTopLabel(Spannable buttonTopLabel) {
        TextView textView = this.f45655c;
        if (textView != null) {
            textView.setText(buttonTopLabel);
        }
    }

    public final void setButtonBottomLeftLabel(int stringRes) {
        TextView textView = this.f45656d;
        if (textView != null) {
            textView.setText(stringRes);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public final void setButtonBottomLeftLabel(SpannableStringBuilder buttonBottomLeftLabel) {
        TextView textView = this.f45656d;
        if (textView != null) {
            textView.setText(buttonBottomLeftLabel);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMComplexButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMComplexButton(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GCMComplexButton(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
