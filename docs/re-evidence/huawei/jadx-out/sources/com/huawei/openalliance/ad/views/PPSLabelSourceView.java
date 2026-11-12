package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes12.dex */
public class PPSLabelSourceView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PPSLabelView f20899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f20900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f20901c;
    private boolean d;
    private boolean e;

    public TextView getAdSource() {
        return this.f20900b;
    }

    public PPSLabelView getAdLabel() {
        return this.f20899a;
    }

    public TextView getAdJumpText() {
        return this.f20901c;
    }

    public void b(Context context, boolean z) {
        if (!this.d) {
            inflate(context, b(z), this);
        }
        this.d = true;
        this.f20899a = (PPSLabelView) findViewById(R.id.hiad_ad_label);
        this.f20900b = (TextView) findViewById(R.id.hiad_ad_source);
        this.f20901c = (TextView) findViewById(R.id.hiad_ad_jump_text);
    }

    public void a(js jsVar, ContentRecord contentRecord, boolean z) {
        PPSLabelView pPSLabelView = this.f20899a;
        if (pPSLabelView != null) {
            pPSLabelView.a(jsVar, contentRecord, z);
        }
    }

    public void a(Context context, boolean z) {
        if (!this.d) {
            this.e = z;
        }
        b(context, z);
        if (this.e != z) {
            this.e = z;
            a(z);
        }
    }

    private int b(boolean z) {
        return z ? R.layout.hiad_ad_label_source_with_click : R.layout.hiad_ad_label_source;
    }

    private void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f20899a.getParent();
        this.f20901c.setBackgroundColor(getResources().getColor(R.color.hiad_transparent));
        Resources resources = getResources();
        if (z) {
            viewGroup.setBackgroundColor(resources.getColor(R.color.hiad_transparent));
            this.f20899a.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
            this.f20900b.setBackground(getResources().getDrawable(R.drawable.hiad_bg_ad_source));
        } else {
            viewGroup.setBackground(resources.getDrawable(R.drawable.hiad_bg_ad_source));
            this.f20899a.setBackgroundColor(getResources().getColor(R.color.hiad_transparent));
            this.f20900b.setBackgroundColor(getResources().getColor(R.color.hiad_transparent));
        }
        int iA = as.a(getContext(), getResources().getDimension(R.dimen.hiad_1_dp));
        viewGroup.setPadding(0, 0, 0, 0);
        this.f20899a.setPadding(iA, 0, z ? iA : 0, 0);
        this.f20901c.setPadding(0, 0, iA, 0);
        this.f20900b.setPadding(z ? iA : 0, 0, iA, 0);
        this.f20901c.setTextAlignment(5);
    }

    public PPSLabelSourceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.d = false;
        this.e = false;
    }

    public PPSLabelSourceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.e = false;
    }

    public PPSLabelSourceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.e = false;
    }

    public PPSLabelSourceView(Context context) {
        super(context, null);
        this.d = false;
        this.e = false;
    }
}
