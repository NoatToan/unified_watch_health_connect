package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.LabelPosition;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dw;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class PPSWLSView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PPSSplashLabelView f21047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f21048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ChoicesView f21049c;
    private jj d;
    private WeakReference<PPSLinkedView> e;
    private Integer f;
    private Integer g;
    private View.OnClickListener h;

    public void setPpsLinkedView(PPSLinkedView pPSLinkedView) {
        this.e = new WeakReference<>(pPSLinkedView);
    }

    public void setChoiceViewOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setAdMediator(jj jjVar) {
        this.d = jjVar;
    }

    public int[] getChoiceViewSize() {
        return dk.c(this.f21049c);
    }

    public int[] getChoiceViewLoc() {
        return dk.b(this.f21049c);
    }

    public void a(Integer num, Integer num2) {
        this.f = num;
        this.g = num2;
    }

    public void a(ContentRecord contentRecord, boolean z, int i, int i2, boolean z2) {
        hw.b("PPSWLSView", "positionAndSet. ");
        String strR = contentRecord.R() == null ? LabelPosition.LOWER_LEFT : contentRecord.R();
        this.f21049c.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hiad_splash_wls_side_margin);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hiad_splash_wls_vertical_margin);
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if ("tr".equals(strR)) {
                dw.a(getContext(), i, i2, z2, dimensionPixelSize, dimensionPixelSize2, layoutParams2);
            } else {
                a(z, i, i2, z2, dimensionPixelSize, dimensionPixelSize2, layoutParams2);
            }
            setLayoutParams(layoutParams2);
        }
        b(contentRecord, strR);
        a(contentRecord, strR);
        a(contentRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PPSLinkedView getPpsLinkedView() {
        WeakReference<PPSLinkedView> weakReference = this.e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void c(String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21048b.getLayoutParams();
        layoutParams.addRule(6, R.id.hiad_ad_label_wls);
        layoutParams.addRule(8, R.id.hiad_ad_label_wls);
        if (!this.f21047a.a()) {
            layoutParams.addRule(15);
        }
        layoutParams.addRule("tr".equals(str) ? 16 : 17, R.id.hiad_ad_label_wls);
        this.f21048b.setLayoutParams(layoutParams);
    }

    private void b(String str) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21047a.getLayoutParams();
        layoutParams.addRule(15);
        layoutParams.addRule("tr".equals(str) ? 16 : 17, R.id.splash_why_this_ad);
        this.f21047a.setLayoutParams(layoutParams);
    }

    private void b(final ContentRecord contentRecord, String str) {
        a(str);
        String strE = dg.e(contentRecord.am());
        String strE2 = dg.e(contentRecord.an());
        if (!TextUtils.isEmpty(strE)) {
            if (TextUtils.isEmpty(strE2)) {
                this.f21049c.b();
            } else {
                this.f21049c.setAdChoiceIcon(strE2);
            }
        }
        this.f21049c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSWLSView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (hw.a()) {
                    hw.a("PPSWLSView", "choiceView onclick");
                }
                if (PPSWLSView.this.h != null) {
                    PPSWLSView.this.h.onClick(view);
                    return;
                }
                if (as.a(PPSWLSView.this.getContext(), contentRecord)) {
                    if (PPSWLSView.this.d != null) {
                        PPSWLSView.this.d.e();
                    }
                    if (PPSWLSView.this.getPpsLinkedView() != null) {
                        PPSWLSView.this.getPpsLinkedView().a((Integer) 10, true);
                    }
                }
            }
        });
    }

    private void a(boolean z, int i, int i2, boolean z2, int i3, int i4, RelativeLayout.LayoutParams layoutParams) {
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        layoutParams.leftMargin = i3;
        layoutParams.setMarginStart(i3);
        layoutParams.bottomMargin = i4;
        if (i2 == 0) {
            if (cc.b(getContext()) && z2) {
                layoutParams.setMarginStart(layoutParams.leftMargin + i);
                layoutParams.leftMargin += i;
            } else if (!cc.b(getContext()) || (cc.b(getContext()) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1)) {
                layoutParams.setMarginStart(dk.f(getContext()));
                layoutParams.leftMargin = dk.f(getContext());
            }
            if (z) {
                return;
            }
            if (!com.huawei.openalliance.ad.utils.ab.n(getContext()) && !com.huawei.openalliance.ad.utils.ab.q(getContext())) {
                return;
            }
        } else if (z) {
            return;
        }
        layoutParams.bottomMargin += dk.f(getContext());
    }

    private void a(String str) {
        Resources resources = getResources();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21049c.getLayoutParams();
        if ("tr".equals(str)) {
            layoutParams.addRule(10);
            layoutParams.addRule(21);
            layoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.hiad_8_dp));
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(20);
            layoutParams.setMarginEnd(resources.getDimensionPixelSize(R.dimen.hiad_8_dp));
        }
        this.f21049c.setLayoutParams(layoutParams);
    }

    private void a(ContentRecord contentRecord, String str) {
        b(str);
        String strP = !dg.b(contentRecord.P()) ? contentRecord.P() : getResources().getString(R.string.hiad_ad_label_new);
        this.f21047a.setDataAndRefreshUi(contentRecord);
        if (this.f21047a.a()) {
            this.f21047a.a(null, strP, this.f, false);
            this.f21047a.setVisibility(0);
        } else {
            ViewGroup.LayoutParams layoutParams = this.f21047a.getLayoutParams();
            layoutParams.width = 0;
            this.f21047a.setLayoutParams(layoutParams);
            this.f21047a.setVisibility(4);
        }
    }

    private void a(ContentRecord contentRecord) {
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ != null) {
            String strE = dg.e(metaDataJ.l());
            if (TextUtils.isEmpty(strE)) {
                this.f21048b.setVisibility(8);
                return;
            }
            this.f21048b.setText(strE);
            this.f21048b.setVisibility(0);
            c(contentRecord.R());
        }
    }

    private void a(Context context) {
        inflate(context, R.layout.hiad_wls_view, this);
        ChoicesView choicesView = (ChoicesView) findViewById(R.id.splash_why_this_ad);
        this.f21049c = choicesView;
        choicesView.setVisibility(8);
        PPSSplashLabelView pPSSplashLabelView = (PPSSplashLabelView) findViewById(R.id.hiad_ad_label_wls);
        this.f21047a = pPSSplashLabelView;
        pPSSplashLabelView.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.hiad_ad_source_wls);
        this.f21048b = textView;
        textView.setVisibility(8);
    }

    public PPSWLSView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        a(context);
    }

    public PPSWLSView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public PPSWLSView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PPSWLSView(Context context) {
        super(context, null);
        a(context);
    }
}
