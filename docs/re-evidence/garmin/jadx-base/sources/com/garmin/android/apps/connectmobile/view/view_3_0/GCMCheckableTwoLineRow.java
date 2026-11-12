package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.s0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import l7.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r22.j1;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\u001bJ\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001bJ\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\n¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\r¢\u0006\u0004\b+\u0010\u0011R\"\u00103\u001a\u00020,8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableTwoLineRow;", "Landroid/widget/LinearLayout;", "Landroid/widget/Checkable;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checked", "", "setChecked", "(Z)V", "Landroid/widget/TextView;", "getTopLabelTextView", "()Landroid/widget/TextView;", "getBottomLabelTextView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "resourceId", "setTopLabel", "(I)V", "", "text", "(Ljava/lang/String;)V", "setBottomLabel", "colorId", "setTopDividerColor", "height", "setTopDividerHeight", "setBottomDividerColor", "setBottomDividerHeight", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableTwoLineRow$a;", "onCheckChangeListener", "setOnCheckChangeListener", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableTwoLineRow$a;)V", "enabled", "setBackgroundEnabledStyle", "Landroid/widget/RelativeLayout;", "a", "Landroid/widget/RelativeLayout;", "getMRowBackground", "()Landroid/widget/RelativeLayout;", "setMRowBackground", "(Landroid/widget/RelativeLayout;)V", "mRowBackground", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class GCMCheckableTwoLineRow extends LinearLayout implements Checkable, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public RelativeLayout mRowBackground;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f47753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f47754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f47755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f47756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f47757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f47758g;

    public interface a {
        void a(View view2, boolean z14);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableTwoLineRow$b", "Landroidx/core/view/a;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            view2.getClass();
            fVar.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.t(GCMCheckableTwoLineRow.this.isChecked());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMCheckableTwoLineRow(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j1.f149703e, i14, 0);
        typedArrayObtainStyledAttributes.getClass();
        setTopLabel(typedArrayObtainStyledAttributes.getString(7));
        setBottomLabel(typedArrayObtainStyledAttributes.getString(2));
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        View view2 = this.f47756e;
        if (view2 == null) {
            s.m("mTopDivider");
            throw null;
        }
        e.v(view2, z14);
        setTopDividerColor(typedArrayObtainStyledAttributes.getColor(5, -1));
        setTopDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        View view3 = this.f47757f;
        if (view3 == null) {
            s.m("mBottomDivider");
            throw null;
        }
        e.v(view3, z15);
        setBottomDividerColor(typedArrayObtainStyledAttributes.getColor(0, -1));
        setBottomDividerHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm_checkable_two_line_row, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.two_line_row_background);
        viewFindViewById.getClass();
        setMRowBackground((RelativeLayout) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(R.id.label_top);
        viewFindViewById2.getClass();
        this.f47753b = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.label_bottom);
        viewFindViewById3.getClass();
        this.f47754c = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.checkable_row_icon_right);
        viewFindViewById4.getClass();
        this.f47755d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.checkable_row_top_divider);
        viewFindViewById5.getClass();
        this.f47756e = viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.checkable_row_bottom_divider);
        viewFindViewById6.getClass();
        this.f47757f = viewFindViewById6;
        setOnClickListener(this);
        ImageView imageView = this.f47755d;
        if (imageView == null) {
            s.m("mImageView");
            throw null;
        }
        Context context = getContext();
        context.getClass();
        c22.c.a(imageView, context, R.dimen.icon_small, 1.3f, 1.8f);
        s0.r(viewInflate, new b());
    }

    public final void b(boolean z14) {
        ImageView imageView = this.f47755d;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 4);
        } else {
            s.m("mImageView");
            throw null;
        }
    }

    public TextView getBottomLabelTextView() {
        TextView textView = this.f47754c;
        if (textView != null) {
            return textView;
        }
        s.m("mBottomLabelTextView");
        throw null;
    }

    public ImageView getImageView() {
        ImageView imageView = this.f47755d;
        if (imageView != null) {
            return imageView;
        }
        s.m("mImageView");
        throw null;
    }

    public final RelativeLayout getMRowBackground() {
        RelativeLayout relativeLayout = this.mRowBackground;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        s.m("mRowBackground");
        throw null;
    }

    public TextView getTopLabelTextView() {
        TextView textView = this.f47753b;
        if (textView != null) {
            return textView;
        }
        s.m("mTopLabelTextView");
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        ImageView imageView = this.f47755d;
        if (imageView != null) {
            return e.d(imageView);
        }
        s.m("mImageView");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        view2.getClass();
        toggle();
    }

    public final void setBackgroundEnabledStyle(boolean enabled) {
        if (enabled) {
            getMRowBackground().getBackground().setAlpha(255);
        } else {
            getMRowBackground().getBackground().setAlpha(128);
        }
    }

    public final void setBottomDividerColor(int colorId) {
        View view2 = this.f47757f;
        if (view2 != null) {
            view2.setBackgroundColor(colorId);
        } else {
            s.m("mBottomDivider");
            throw null;
        }
    }

    public final void setBottomDividerHeight(int height) {
        View view2 = this.f47757f;
        if (view2 == null) {
            s.m("mBottomDivider");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setBottomLabel(String text) {
        TextView textView = this.f47754c;
        if (textView == null) {
            s.m("mBottomLabelTextView");
            throw null;
        }
        textView.setText(text);
        TextView textView2 = this.f47754c;
        if (textView2 != null) {
            e.q(textView2);
        } else {
            s.m("mBottomLabelTextView");
            throw null;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        ImageView imageView = this.f47755d;
        if (imageView == null) {
            s.m("mImageView");
            throw null;
        }
        imageView.setVisibility(checked ? 0 : 4);
        a aVar = this.f47758g;
        if (aVar != null) {
            aVar.a(this, checked);
        }
    }

    public final void setMRowBackground(RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this.mRowBackground = relativeLayout;
    }

    public final void setOnCheckChangeListener(a onCheckChangeListener) {
        this.f47758g = onCheckChangeListener;
    }

    public final void setTopDividerColor(int colorId) {
        View view2 = this.f47756e;
        if (view2 != null) {
            view2.setBackgroundColor(colorId);
        } else {
            s.m("mTopDivider");
            throw null;
        }
    }

    public final void setTopDividerHeight(int height) {
        View view2 = this.f47756e;
        if (view2 == null) {
            s.m("mTopDivider");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.getClass();
        ((LinearLayout.LayoutParams) layoutParams).height = height;
    }

    public final void setTopLabel(String text) {
        TextView textView = this.f47753b;
        if (textView != null) {
            textView.setText(text);
        } else {
            s.m("mTopLabelTextView");
            throw null;
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setTopLabel(int resourceId) {
        if (resourceId > 0) {
            setTopLabel(getContext().getString(resourceId));
        }
    }

    public GCMCheckableTwoLineRow(Context context) {
        super(context);
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GCMCheckableTwoLineRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ GCMCheckableTwoLineRow(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
