package com.huawei.ui.commonui.illustration;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes16.dex */
public class IllustrationView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f23541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f23542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23543c;
    private Context d;
    private HealthTextView e;
    private String f;
    private int h;

    public IllustrationView(Context context) {
        this(context, null);
    }

    public IllustrationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IllustrationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = -1;
        this.d = context;
        e();
        e(attributeSet);
    }

    private void e() {
        LayoutInflater.from(this.d).inflate(R.layout.health_common_illustration_view, (ViewGroup) this, true);
        this.f23542b = (RelativeLayout) findViewById(R.id.illustration_view);
        this.f23541a = (ImageView) findViewById(R.id.illustration_background);
        this.e = (HealthTextView) findViewById(R.id.illustration_title);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
        if (identifier > 0) {
            this.h = getResources().getDimensionPixelSize(identifier);
        }
        this.f23542b.getLayoutParams().height = -2;
        ViewGroup.LayoutParams layoutParams = this.f23541a.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -1;
    }

    private void e(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.d.obtainStyledAttributes(attributeSet, R.styleable.IllustrationView);
        this.f = typedArrayObtainStyledAttributes.getString(R.styleable.IllustrationView_title);
        this.f23543c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.IllustrationView_illustration, -1);
        typedArrayObtainStyledAttributes.recycle();
        String str = this.f;
        if (str != null) {
            setSubHeader(str);
        }
        int i = this.f23543c;
        if (i != -1) {
            setIllustration(i);
        }
    }

    public void setSubHeader(String str) {
        HealthTextView healthTextView = this.e;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public void setIllustration(int i) {
        ImageView imageView = this.f23541a;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public void setIllustration(Bitmap bitmap) {
        ImageView imageView = this.f23541a;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void setSubHeaderVisibility(int i) {
        HealthTextView healthTextView = this.e;
        if (healthTextView != null) {
            healthTextView.setVisibility(i);
        }
    }
}
