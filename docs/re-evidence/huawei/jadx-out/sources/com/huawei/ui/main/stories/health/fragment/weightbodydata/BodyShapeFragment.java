package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.view.View;
import android.widget.ImageView;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.dnb;
import defpackage.exz;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;

/* JADX INFO: loaded from: classes19.dex */
public class BodyShapeFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f27955c;
    private HealthTextView d;
    private HealthCardView e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getLayoutId() {
        return R.layout.fragment_weight_body_data_body_shape;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        this.d = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_shape_text);
        this.f27955c = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_shape);
        this.e = (HealthCardView) view.findViewById(R.id.fragment_weight_body_shape_card_view);
        initResultViewAndAboutView(view);
        d();
    }

    private void d() {
        int iB;
        if (this.mWeightBean != null) {
            iB = exz.b(this.mWeightBean.an(), this.mWeightBean.j());
        } else {
            iB = exz.b(MultiUsersManager.INSTANCE.getMainUser().d(), this.mAiBodyShapeBean.c());
        }
        String strE = vcz.e(iB);
        this.e.setVisibility(0);
        this.d.setText(strE);
        this.d.setVisibility(0);
        this.f27955c.setImageResource(vdc.b(iB));
        this.f27955c.setVisibility(0);
        initResult(vcz.c(iB), vcz.a(iB));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initAbout(vcw.b(0), vcw.b(1));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        dnb dnbVar = this.mWeightBean;
        return 27;
    }
}
