package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import l7.f;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMCheckableRow extends LinearLayout implements Checkable, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RelativeLayout f47742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f47743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f47744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f47745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f47746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f47747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f47748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f47749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f47750k;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public final void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
            super.onInitializeAccessibilityNodeInfo(view2, fVar);
            fVar.l(true);
            fVar.m(GCMCheckableRow.this.isChecked());
        }
    }

    public interface b {
        void a(View view2, boolean z14);
    }

    public GCMCheckableRow(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j1.f149702d, i14, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        this.f47741b = resourceId;
        if (resourceId != -1) {
            this.f47742c.setVisibility(0);
            this.f47743d.setVisibility(8);
            this.f47744e.setVisibility(8);
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f47741b, (ViewGroup) null);
            this.f47740a = viewInflate;
            this.f47742c.addView(viewInflate);
        } else {
            setLeftIcon(typedArrayObtainStyledAttributes.getDrawable(1));
            setDefaultText(typedArrayObtainStyledAttributes.getString(4));
            b(typedArrayObtainStyledAttributes.getBoolean(2, false));
            this.f47747h.setVisibility(typedArrayObtainStyledAttributes.getBoolean(3, false) ? 0 : 8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        this.f47741b = -1;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm_checkable_row_3_0, (ViewGroup) this, true);
        this.f47743d = (TextView) viewInflate.findViewById(R.id.checkable_row_label_left);
        this.f47744e = (TextView) viewInflate.findViewById(R.id.checkable_row_sub_label_left);
        this.f47745f = (ImageView) viewInflate.findViewById(R.id.checkable_row_icon_right);
        this.f47746g = (ImageView) viewInflate.findViewById(R.id.checkable_row_icon_left);
        this.f47747h = viewInflate.findViewById(R.id.checkable_row_top_divider);
        this.f47748i = viewInflate.findViewById(R.id.checkable_row_bottom_divider);
        this.f47742c = (RelativeLayout) findViewById(R.id.inner_layout_container);
        this.f47749j = (RelativeLayout) findViewById(R.id.content_container);
        setOnClickListener(this);
        s0.r(this, new a());
        if (c22.b.e(getContext())) {
            int iC = (int) c22.b.c(getContext(), getResources().getDimension(R.dimen.icon_default), 1.8f);
            this.f47745f.getLayoutParams().width = iC;
            this.f47745f.getLayoutParams().height = iC;
        }
    }

    public final void b(boolean z14) {
        this.f47748i.setVisibility(z14 ? 0 : 8);
    }

    public void c(boolean z14) {
        ImageView imageView = this.f47745f;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 4);
        }
    }

    public RelativeLayout getContentContainer() {
        return this.f47749j;
    }

    public TextView getDefaultTextView() {
        return this.f47743d;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        ImageView imageView = this.f47745f;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        toggle();
    }

    public void setBottomDividerColor(int i14) {
        this.f47748i.setBackgroundColor(i14);
    }

    public void setBottomDividerHeight(int i14) {
        ((LinearLayout.LayoutParams) this.f47748i.getLayoutParams()).height = i14;
    }

    public void setChecked(boolean z14) {
        ImageView imageView = this.f47745f;
        if (imageView != null) {
            imageView.setVisibility(z14 ? 0 : 4);
        }
        b bVar = this.f47750k;
        if (bVar != null) {
            bVar.a(this, z14);
        }
    }

    public void setDefaultSubText(int i14) {
        try {
            setDefaultSubText(getContext().getString(i14));
        } catch (Exception e4) {
            i2.g(e4, "GCMCheckableRow: Unable to set default sub text for resource id: " + i14);
        }
    }

    public void setDefaultSubTextContentDescription(String str) {
        TextView textView = this.f47744e;
        if (textView != null) {
            textView.setContentDescription(str);
        }
    }

    public void setDefaultText(int i14) {
        try {
            setDefaultText(getContext().getString(i14));
        } catch (Exception e4) {
            i2.g(e4, "GCMCheckableRow: Unable to set default text for resource id: " + i14);
        }
    }

    public void setDefaultTextAppearance(int i14) {
        this.f47743d.setTextAppearance(i14);
    }

    public void setDefaultTextContentDescription(String str) {
        TextView textView = this.f47743d;
        if (textView != null) {
            textView.setContentDescription(str);
        }
    }

    public void setLeftIcon(Drawable drawable) {
        ImageView imageView = this.f47746g;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.f47746g.setImageDrawable(drawable);
        }
    }

    public void setOnCheckChangeListener(b bVar) {
        this.f47750k = bVar;
    }

    public void setTopDividerColor(int i14) {
        this.f47747h.setBackgroundColor(i14);
    }

    public void setTopDividerHeight(int i14) {
        ((LinearLayout.LayoutParams) this.f47747h.getLayoutParams()).height = i14;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setDefaultSubText(String str) {
        TextView textView = this.f47744e;
        if (textView != null) {
            textView.setVisibility(0);
            this.f47744e.setText(str);
        }
    }

    public void setDefaultText(String str) {
        TextView textView = this.f47743d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public GCMCheckableRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GCMCheckableRow(Context context) {
        super(context);
        a();
    }
}
