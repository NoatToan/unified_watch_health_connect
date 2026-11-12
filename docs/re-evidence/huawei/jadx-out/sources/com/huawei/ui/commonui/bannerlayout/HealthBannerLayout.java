package com.huawei.ui.commonui.bannerlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qsp;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBannerLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f23281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23282c;
    private HealthTextView d;
    private String e;
    private String g;

    public HealthBannerLayout(Context context) {
        this(context, null);
    }

    public HealthBannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public HealthBannerLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public HealthBannerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.sub_title);
        if (typedArrayObtainStyledAttributes != null) {
            this.g = typedArrayObtainStyledAttributes.getString(R.styleable.banner_bannerTitle);
            this.e = typedArrayObtainStyledAttributes.getString(R.styleable.banner_leftButtonText);
            this.f23280a = typedArrayObtainStyledAttributes.getString(R.styleable.banner_rightButtonText);
            typedArrayObtainStyledAttributes.recycle();
        }
        b(context);
    }

    private void b(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_health_banner, this);
        this.f23282c = (HealthTextView) viewInflate.findViewById(R.id.banner_title);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.banner_left_button);
        this.f23281b = (HealthTextView) viewInflate.findViewById(R.id.banner_right_button);
        qsp.b(this.f23282c, this.g);
        qsp.b(this.d, this.e);
        qsp.b(this.f23281b, this.f23280a);
    }

    public void setTitle(String str) {
        qsp.b(this.f23282c, str);
    }

    public void setLeftButtonText(String str) {
        qsp.b(this.d, str);
    }

    public void setRightButtonText(String str) {
        qsp.b(this.f23281b, str);
    }

    public void setLeftButtonClickListener(View.OnClickListener onClickListener) {
        qsp.b(this.d, onClickListener);
    }

    public void setRightButtonClickListener(View.OnClickListener onClickListener) {
        qsp.b(this.f23281b, onClickListener);
    }
}
