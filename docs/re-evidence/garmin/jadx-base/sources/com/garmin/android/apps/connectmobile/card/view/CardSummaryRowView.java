package com.garmin.android.apps.connectmobile.card.view;

import a7.b;
import am.h2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import androidx.vectordrawable.graphics.drawable.f;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class CardSummaryRowView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f31310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f31311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f31314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f31315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f31317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31318i;

    public CardSummaryRowView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.card_summary_row, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h2.f4005a, i14, 0);
        this.f31318i = typedArrayObtainStyledAttributes.getInt(2, getRightViewValue());
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.inflate_container);
        this.f31317h = frameLayout;
        this.f31310a = viewInflate.findViewById(R.id.card_row_divider);
        int i15 = this.f31318i;
        if (i15 != 0) {
            View.inflate(context, a(i15), frameLayout);
            b();
            this.f31311b.setText(typedArrayObtainStyledAttributes.getString(1));
            this.f31311b.setCompoundDrawablesRelativeWithIntrinsicBounds(typedArrayObtainStyledAttributes.getDrawable(0), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f31311b.setTextColor(b.getColor(getContext(), R.color.gcm_text_primary));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i14) {
        if (i14 == 1) {
            return R.layout.card_summary_one_value_content_view;
        }
        if (i14 == 2) {
            return R.layout.card_summary_row_goal_value_content_view;
        }
        if (i14 == 3) {
            return R.layout.card_summary_row_two_value_content_view;
        }
        if (i14 != 4) {
            return 0;
        }
        return c22.b.a(getContext()) >= 1.3f ? R.layout.card_summary_row_value_with_privacy_font_scaled : R.layout.card_summary_row_value_with_privacy;
    }

    public final void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        this.f31312c = (TextView) findViewById(R.id.card_row_value);
        this.f31315f = (ImageView) findViewById(R.id.card_row_goal_completed);
        this.f31313d = (TextView) findViewById(R.id.card_row_value_one);
        this.f31314e = (TextView) findViewById(R.id.card_row_value_two);
        this.f31316g = (TextView) findViewById(R.id.card_row_privacy);
        this.f31311b = (TextView) findViewById(R.id.card_row_name);
        if (this.f31318i == 1 && c22.b.a(getContext()) >= 1.5f && (textView3 = this.f31311b) != null) {
            if (textView3.getParent() instanceof ConstraintLayout) {
                d dVar = new d();
                dVar.f((ConstraintLayout) this.f31311b.getParent());
                dVar.e(this.f31311b.getId(), 5);
                dVar.e(this.f31311b.getId(), 7);
                dVar.h(this.f31311b.getId(), 7, 0, 7);
                dVar.h(this.f31311b.getId(), 3, 0, 3);
                TextView textView4 = this.f31312c;
                if (textView4 != null) {
                    textView4.setSingleLine(false);
                    this.f31312c.setAutoSizeTextTypeWithDefaults(0);
                    dVar.e(this.f31312c.getId(), 6);
                    dVar.e(this.f31312c.getId(), 3);
                    dVar.h(this.f31312c.getId(), 6, 0, 6);
                    dVar.h(this.f31312c.getId(), 3, this.f31311b.getId(), 4);
                    dVar.s(this.f31312c.getId(), 6, getResources().getDimensionPixelSize(R.dimen.spacing_large));
                }
                dVar.b((ConstraintLayout) this.f31311b.getParent());
            }
            this.f31311b.setSingleLine(false);
            this.f31311b.setAutoSizeTextTypeWithDefaults(0);
        }
        if (this.f31318i == 3 && c22.b.a(getContext()) >= 1.5f && (textView2 = this.f31311b) != null && (textView2.getParent() instanceof ConstraintLayout)) {
            d dVar2 = new d();
            dVar2.f((ConstraintLayout) this.f31311b.getParent());
            Guideline guideline = (Guideline) findViewById(R.id.guideline_50_percent);
            int iB = (int) c22.b.b(getContext(), getResources().getDimensionPixelSize(R.dimen.andfont_body_2), 2.0f);
            dVar2.e(this.f31311b.getId(), 5);
            dVar2.e(this.f31311b.getId(), 7);
            dVar2.h(this.f31311b.getId(), 3, 0, 3);
            dVar2.h(this.f31311b.getId(), 7, 0, 7);
            dVar2.s(this.f31311b.getId(), 4, getResources().getDimensionPixelSize(R.dimen.spacing_small));
            TextView textView5 = this.f31313d;
            if (textView5 != null) {
                dVar2.e(textView5.getId(), 6);
                dVar2.e(this.f31313d.getId(), 7);
                dVar2.e(this.f31313d.getId(), 3);
                dVar2.e(this.f31313d.getId(), 4);
                dVar2.h(this.f31313d.getId(), 3, this.f31311b.getId(), 4);
                dVar2.h(this.f31313d.getId(), 4, 0, 4);
                dVar2.h(this.f31313d.getId(), 6, 0, 6);
                dVar2.h(this.f31313d.getId(), 7, guideline.getId(), 6);
                dVar2.s(this.f31313d.getId(), 6, getResources().getDimensionPixelSize(R.dimen.spacing_large));
                this.f31313d.setTextSize(iB);
            }
            TextView textView6 = this.f31314e;
            if (textView6 != null) {
                dVar2.e(textView6.getId(), 6);
                dVar2.h(this.f31314e.getId(), 3, this.f31311b.getId(), 4);
                dVar2.h(this.f31314e.getId(), 6, guideline.getId(), 7);
                this.f31314e.setTextSize(iB);
            }
            dVar2.b((ConstraintLayout) this.f31311b.getParent());
        }
        if (this.f31318i != 2 || c22.b.a(getContext()) < 1.5f || (textView = this.f31311b) == null || !(textView.getParent() instanceof ConstraintLayout)) {
            return;
        }
        d dVar3 = new d();
        dVar3.f((ConstraintLayout) this.f31311b.getParent());
        dVar3.e(this.f31311b.getId(), 5);
        dVar3.e(this.f31311b.getId(), 7);
        dVar3.h(this.f31311b.getId(), 3, 0, 3);
        dVar3.h(this.f31311b.getId(), 7, 0, 7);
        TextView textView7 = this.f31312c;
        if (textView7 != null) {
            dVar3.e(textView7.getId(), 4);
            dVar3.e(this.f31312c.getId(), 3);
            dVar3.e(this.f31312c.getId(), 6);
            dVar3.h(this.f31312c.getId(), 6, 0, 6);
            dVar3.h(this.f31312c.getId(), 3, this.f31311b.getId(), 4);
            dVar3.s(this.f31312c.getId(), 6, getResources().getDimensionPixelSize(R.dimen.spacing_large));
        }
        dVar3.b((ConstraintLayout) this.f31311b.getParent());
    }

    public final void c(CharSequence charSequence, String str) {
        TextView textView = this.f31312c;
        if (textView != null) {
            textView.setText(charSequence);
            this.f31312c.setContentDescription(str);
        }
    }

    public int getRightViewValue() {
        return 0;
    }

    public String getRowName() {
        return this.f31311b.getText().toString();
    }

    public void setBoundedRowIcon(Drawable drawable) {
        TextView textView = this.f31311b;
        if (textView != null) {
            textView.setCompoundDrawables(drawable, null, null, null);
        }
    }

    public void setDividerVisibility(boolean z14) {
        this.f31310a.setVisibility(z14 ? 0 : 8);
    }

    public void setGoalCompleted(boolean z14) {
        Context context;
        int i14;
        ImageView imageView = this.f31315f;
        if (imageView != null) {
            f fVarA = f.a(R.drawable.check, null, imageView.getContext().getResources());
            fVarA.mutate();
            fVarA.setTint(b.getColor(this.f31315f.getContext(), z14 ? R.color.gcm_icon_success : R.color.gcm_icon_secondary));
            ImageView imageView2 = this.f31315f;
            if (z14) {
                context = getContext();
                i14 = R.string.lbl_goal_reached;
            } else {
                context = getContext();
                i14 = R.string.lbl_goal_not_reached;
            }
            imageView2.setContentDescription(context.getString(i14));
            this.f31315f.setImageDrawable(fVarA);
        }
    }

    public void setPrivacyVisibility(boolean z14) {
        TextView textView = this.f31316g;
        if (textView != null) {
            textView.setVisibility(z14 ? 0 : 8);
        }
    }

    public void setRowIcon(Drawable drawable) {
        TextView textView = this.f31311b;
        if (textView != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setRowName(String str) {
        TextView textView = this.f31311b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setRowNameContentDescription(CharSequence charSequence) {
        this.f31311b.setContentDescription(charSequence);
    }

    public void setRowType(int i14) {
        if (this.f31318i != i14) {
            this.f31318i = i14;
            FrameLayout frameLayout = this.f31317h;
            frameLayout.removeAllViews();
            View.inflate(getContext(), a(this.f31318i), frameLayout);
            b();
        }
    }

    public void setValue1Text(CharSequence charSequence) {
        TextView textView = this.f31313d;
        if (textView != null) {
            textView.setText(charSequence);
            this.f31313d.setContentDescription(null);
        }
    }

    public void setValue2Text(CharSequence charSequence) {
        if (this.f31313d != null) {
            this.f31314e.setText(charSequence);
            this.f31314e.setContentDescription(null);
        }
    }

    public void setValueText(CharSequence charSequence) {
        c(charSequence, null);
    }

    public CardSummaryRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardSummaryRowView(Context context) {
        this(context, null, 0);
    }
}
