package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes7.dex */
public class SleepInterpretationsTextview extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f7990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7992c;
    private HealthTextView d;
    private HealthTextView e;

    public SleepInterpretationsTextview(Context context) {
        super(context);
        this.f7990a = getDefaultDrawable();
        this.f7992c = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        this.f7991b = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        d(context);
    }

    public SleepInterpretationsTextview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7990a = getDefaultDrawable();
        this.f7992c = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        this.f7991b = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        d(context);
    }

    public SleepInterpretationsTextview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7990a = getDefaultDrawable();
        this.f7992c = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        this.f7991b = BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        d(context);
    }

    public void setupTextView(String str) {
        Drawable drawable = this.f7990a;
        int i = (drawable == null || drawable.getBounds() == null) ? 0 : this.f7990a.getBounds().right - this.f7990a.getBounds().left;
        LeadingMarginSpan.Standard standard = new LeadingMarginSpan.Standard(i == 0 ? 0 : i + this.f7992c, 0);
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        spannableString.setSpan(standard, 0, spannableString.length(), 18);
        this.d.setText(spannableString);
        this.e.setCompoundDrawables(null, null, this.f7990a, null);
    }

    public void setupDrawable(Drawable drawable) {
        this.f7990a = drawable;
    }

    public void d() {
        Drawable defaultDrawable = getDefaultDrawable();
        this.f7990a = defaultDrawable;
        if (defaultDrawable == null) {
            LogUtil.j("SleepInterpretationsTextview", "drawable is null");
        } else {
            int i = this.f7991b;
            defaultDrawable.setBounds(0, 0, i, i);
        }
    }

    private Drawable getDefaultDrawable() {
        return ContextCompat.getDrawable(BaseApplication.getContext(), R.drawable.sleep_suggestions_purple_dot);
    }

    private void d(Context context) {
        LayoutInflater.from(context).inflate(R.layout.sleep_suggestions_text_view_layout, this);
        this.e = (HealthTextView) findViewById(R.id.indent_icon_text_view);
        this.d = (HealthTextView) findViewById(R.id.content_text_view);
        Drawable drawable = this.f7990a;
        if (drawable != null) {
            int i = this.f7991b;
            drawable.setBounds(0, 0, i, i);
        }
    }
}
