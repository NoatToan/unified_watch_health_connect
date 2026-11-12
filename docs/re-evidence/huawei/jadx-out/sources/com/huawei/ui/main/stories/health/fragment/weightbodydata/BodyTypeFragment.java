package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import com.huawei.ui.main.stories.health.fragment.weightbodydata.BodyTypeFragment;
import com.huawei.ui.main.stories.health.views.healthdata.VerticalTextView;
import defpackage.ezh;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vei;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class BodyTypeFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f27957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f27958c;
    private ImageView d;
    private HealthTextView e;
    private HealthTextView f;
    private ImageView g;
    private HealthTextView h;
    private ImageView i;
    private ImageView j;
    private HealthTextView k;
    private HealthTextView l;
    private ImageView m;
    private HealthTextView n;
    private ImageView o;
    private int p;
    private ImageView q;
    private HealthTextView r;
    private HealthTextView s;
    private ImageView t;
    private HealthTextView w;
    private VerticalTextView x;
    private HealthTextView y;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 13;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getLayoutId() {
        return R.layout.fragment_weight_body_data_body_type;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        this.d = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type);
        this.y = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_status);
        this.w = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_fat);
        this.x = (VerticalTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_fat_other);
        this.t = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_01);
        this.q = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_02);
        this.f27958c = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_03);
        this.f27957b = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_04);
        this.m = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_05);
        this.o = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_06);
        this.i = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_07);
        this.j = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_08);
        this.g = (ImageView) view.findViewById(R.id.fragment_weight_body_data_body_type_img_09);
        this.s = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_01);
        this.r = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_02);
        this.e = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_03);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_04);
        this.f27956a = healthTextView;
        healthTextView.setSplittable(true);
        this.k = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_05);
        this.l = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_06);
        this.n = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_07);
        this.f = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_08);
        this.h = (HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_tv_09);
        ((HealthSubHeader) view.findViewById(R.id.fragment_weight_body_type_sub_header)).setSubHeaderBackgroundColor(getColor(R.color.transparent));
        initResultViewAndAboutView(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_weight_body_data_body_type_fat_option_card);
        ImageView imageView = (ImageView) view.findViewById(R.id.health_body_type_progressbar);
        if (LanguageUtil.ba(this.mContext)) {
            imageView.setScaleX(-1.0f);
        }
        d(linearLayout, imageView);
        ((HealthTextView) view.findViewById(R.id.fragment_weight_body_data_body_type_abscissa_title)).setSplittable(true);
    }

    private void d(final LinearLayout linearLayout, final ImageView imageView) {
        imageView.post(new Runnable() { // from class: uvr
            @Override // java.lang.Runnable
            public final void run() {
                BodyTypeFragment.c(linearLayout, imageView);
            }
        });
    }

    public static /* synthetic */ void c(LinearLayout linearLayout, ImageView imageView) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        int iMin = Math.min(imageView.getWidth(), imageView.getHeight());
        layoutParams.width = iMin;
        layoutParams.height = iMin;
        layoutParams.gravity = 17;
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.s.setText(vcz.d(1));
        this.r.setText(vcz.d(2));
        this.e.setText(vcz.d(3));
        this.f27956a.setText(vcz.d(4));
        this.k.setText(vcz.d(5));
        this.l.setText(vcz.d(6));
        this.n.setText(vcz.d(7));
        this.f.setText(vcz.d(8));
        this.h.setText(vcz.d(9));
        int iD = vei.d(this.mWeightBean);
        this.p = iD;
        if (ezh.e(iD)) {
            this.y.setText(vcz.d(this.p));
            e();
        }
    }

    private void e() {
        switch (this.p) {
            case 1:
                this.t.setImageResource(R.mipmap.ic_body_type_img_01b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_01b);
                this.s.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                break;
            case 2:
                this.q.setImageResource(R.mipmap.ic_body_type_img_02b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_02b);
                this.r.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                break;
            case 3:
                this.f27958c.setImageResource(R.mipmap.ic_body_type_img_03b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_03b);
                this.e.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                break;
            case 4:
                this.f27957b.setImageResource(R.mipmap.ic_body_type_img_04b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_04b);
                this.f27956a.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                break;
            case 5:
                this.m.setImageResource(R.mipmap.ic_body_type_img_05b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_05b);
                this.k.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                break;
            case 6:
                this.o.setImageResource(R.mipmap.ic_body_type_img_06b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_06b);
                this.l.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                break;
            default:
                a();
                break;
        }
    }

    private void a() {
        int i = this.p;
        if (i == 7) {
            this.i.setImageResource(R.mipmap.ic_body_type_img_07b);
            this.d.setImageResource(R.mipmap.ic_body_type_img_07b);
            this.n.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
        } else if (i == 8) {
            this.j.setImageResource(R.mipmap.ic_body_type_img_08b);
            this.d.setImageResource(R.mipmap.ic_body_type_img_08b);
            this.f.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
        } else {
            if (i == 9) {
                this.g.setImageResource(R.mipmap.ic_body_type_img_09b);
                this.d.setImageResource(R.mipmap.ic_body_type_img_09b);
                this.h.setTextColor(ContextCompat.getColor(this.mContext, R.color.textColorPrimary));
                return;
            }
            LogUtil.j("HealthWeight_BodyTypeFragment", "currentSelectionOther mBodyTypeValue does not exist");
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initResult(vcz.c(1, this.p), vcz.c(2, this.p));
        initAbout(vcw.c(0), vcw.c(1));
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (LanguageUtil.o(this.mContext) || "ja".equalsIgnoreCase(this.mResources.getConfiguration().locale.getLanguage())) {
            this.x.setVisibility(8);
            this.w.setVisibility(0);
        } else {
            this.x.setVisibility(0);
            this.x.setDirection(!LanguageUtil.ba(this.mContext) ? 1 : 0);
            this.w.setVisibility(8);
        }
    }
}
