package com.huawei.openalliance.ad.views.compliance;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hs;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdvertiserInfo;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.i;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ComplianceView extends i {
    private View k;
    private TextView l;
    private RelativeLayout m;
    private TextView n;
    private ContentRecord o;
    private ImageView p;
    private hs q;

    @Override // com.huawei.openalliance.ad.views.i
    public void setViewClickListener(hs hsVar) {
        this.q = hsVar;
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void setAdContent(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        this.o = contentRecord;
        a();
        b();
        c();
        f();
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void c() {
        try {
            hw.b("ComplianceView", "adapterView mFeedbackViewPaddingLeft = %s, mFeedbackViewPaddingRight= %s", Integer.valueOf(this.g), Integer.valueOf(this.h));
            if (d()) {
                this.f21242b.setPadding(this.g, 0, this.h, 0);
                this.f21242b.requestLayout();
                this.f21242b.getViewTreeObserver().addOnGlobalLayoutListener(this.j);
            }
        } catch (Throwable th) {
            hw.c("ComplianceView", "adapterView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void b(Context context) {
        ImageView imageView = (ImageView) findViewById(R.id.right_arrow);
        this.p = imageView;
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_feedback_right_arrow);
            if (dk.c()) {
                this.p.setImageBitmap(bd.b(drawable));
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void a(Context context) {
        try {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.hiad_compliance_choice_view, this);
            this.f21242b = viewInflate.findViewById(R.id.compliance_view_root);
            this.k = viewInflate.findViewById(R.id.why_this_ad_line);
            this.l = (TextView) viewInflate.findViewById(R.id.compliance_info);
            this.m = (RelativeLayout) viewInflate.findViewById(R.id.why_this_ad_btn);
            this.f21243c = viewInflate.findViewById(R.id.compliance_scrollview);
            this.n = (TextView) viewInflate.findViewById(R.id.why_this_ad_tv);
        } catch (Throwable th) {
            hw.c("ComplianceView", "initView error, %s", th.getClass().getSimpleName());
        }
    }

    private void f() {
        TextView textView;
        if (!as.n(getContext()) || (textView = this.l) == null || this.n == null) {
            return;
        }
        textView.setTextSize(1, 28.0f);
        this.n.setTextSize(1, 28.0f);
    }

    private void b() {
        String value;
        ContentRecord contentRecord = this.o;
        if (contentRecord != null) {
            List<AdvertiserInfo> listAU = contentRecord.aU();
            StringBuffer stringBuffer = new StringBuffer();
            if (bm.a(listAU)) {
                hw.b("ComplianceView", "complianceInfo is null");
                return;
            }
            for (int i = 0; i < listAU.size(); i++) {
                if (i != listAU.size() - 1) {
                    stringBuffer.append(listAU.get(i).getValue());
                    value = ", ";
                } else {
                    value = listAU.get(i).getValue();
                }
                stringBuffer.append(value);
            }
            TextView textView = this.l;
            if (textView != null) {
                textView.setText(stringBuffer);
            }
        }
    }

    private void a() {
        if (this.k == null || this.m == null) {
            hw.b("ComplianceView", "partingLine or whyThisAdClick view not init");
            return;
        }
        if (this.i != null && !this.i.booleanValue()) {
            hw.b("ComplianceView", "not need show why this ad");
            return;
        }
        this.k.setVisibility(0);
        this.m.setVisibility(0);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.compliance.ComplianceView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ComplianceView.this.o != null) {
                    as.a(ComplianceView.this.getContext(), ComplianceView.this.o);
                    if (ComplianceView.this.q != null) {
                        ComplianceView.this.q.a();
                    }
                }
            }
        });
    }

    public ComplianceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ComplianceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComplianceView(Context context) {
        super(context);
    }
}
