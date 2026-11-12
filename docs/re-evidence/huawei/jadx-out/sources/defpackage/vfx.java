package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import com.huawei.ui.main.stories.health.views.healthdata.VerticalTextView;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class vfx extends vfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f51050a;
    private dnb ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f51051b;
    private HealthTextView d;
    private LinearLayout e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView i;
    private ImageView j;
    private ImageView k;
    private HealthTextView l;
    private LinearLayout m;
    private ImageView n;
    private HealthTextView o;
    private ImageView p;
    private HealthTextView q;
    private ImageView r;
    private HealthTextView s;
    private ImageView t;
    private Context u;
    private ImageView v;
    private HealthTextView w;
    private BodyReportRecycleItem x;
    private HealthTextView y;

    public vfx(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        super(context, bodyReportRecycleItem);
        this.u = context;
        this.x = bodyReportRecycleItem;
        if (bodyReportRecycleItem != null) {
            this.ac = bodyReportRecycleItem.a();
        }
    }

    @Override // defpackage.vfm
    public String d() {
        if (this.u == null) {
            return super.d();
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hw_weight_body_type_interpretation);
    }

    @Override // defpackage.vfm
    public View e() {
        Context context = this.u;
        if (context == null) {
            return super.e();
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.body_shape_predication_layout, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.fragment_weight_body_data_body_type_fat);
        VerticalTextView verticalTextView = (VerticalTextView) viewInflate.findViewById(R.id.fragment_weight_body_data_body_type_fat_other);
        String language = this.u.getResources().getConfiguration().locale.getLanguage();
        if (LanguageUtil.o(this.u) || "ja".equalsIgnoreCase(language)) {
            verticalTextView.setVisibility(8);
            healthTextView.setVisibility(0);
        } else {
            verticalTextView.setVisibility(0);
            verticalTextView.setDirection(!LanguageUtil.ba(this.u) ? 1 : 0);
            healthTextView.setVisibility(8);
        }
        this.r = (ImageView) viewInflate.findViewById(R.id.body_type_img_01);
        this.v = (ImageView) viewInflate.findViewById(R.id.body_type_img_02);
        this.i = (ImageView) viewInflate.findViewById(R.id.body_type_img_03);
        this.f51050a = (ImageView) viewInflate.findViewById(R.id.body_type_img_04);
        this.t = (ImageView) viewInflate.findViewById(R.id.body_type_img_05);
        this.p = (ImageView) viewInflate.findViewById(R.id.body_type_img_06);
        this.k = (ImageView) viewInflate.findViewById(R.id.body_type_img_07);
        this.n = (ImageView) viewInflate.findViewById(R.id.body_type_img_08);
        this.j = (ImageView) viewInflate.findViewById(R.id.body_type_img_09);
        this.y = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_01);
        this.w = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_02);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_03);
        this.h = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_04);
        this.s = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_05);
        this.q = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_06);
        this.l = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_07);
        this.o = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_08);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.body_type_tv_09);
        this.m = (LinearLayout) viewInflate.findViewById(R.id.fragment_weight_body_data_root_view);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.fragment_weight_body_data_body_shape_content);
        this.f51051b = (ImageView) viewInflate.findViewById(R.id.body_analysis_report_shape_show_img);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.body_analysis_report_shape_show_tv);
        f();
        c();
        return viewInflate;
    }

    private void f() {
        this.y.setText(vcz.d(1));
        this.w.setText(vcz.d(2));
        this.g.setText(vcz.d(3));
        this.h.setText(vcz.d(4));
        this.s.setText(vcz.d(5));
        this.q.setText(vcz.d(6));
        this.l.setText(vcz.d(7));
        this.o.setText(vcz.d(8));
        this.f.setText(vcz.d(9));
        int iD = vei.d(this.ac);
        if (!ezh.e(iD) || iD == 0) {
            return;
        }
        a(iD);
    }

    private void a(int i) {
        switch (i) {
            case 1:
                this.r.setImageResource(R.mipmap.ic_body_type_img_01b);
                this.y.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
                break;
            case 2:
                this.v.setImageResource(R.mipmap.ic_body_type_img_02b);
                this.w.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
                break;
            case 3:
                this.i.setImageResource(R.mipmap.ic_body_type_img_03b);
                this.g.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
                break;
            case 4:
                this.f51050a.setImageResource(R.mipmap.ic_body_type_img_04b);
                this.h.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
                break;
            case 5:
                this.t.setImageResource(R.mipmap.ic_body_type_img_05b);
                this.s.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
                break;
            case 6:
                this.p.setImageResource(R.mipmap.ic_body_type_img_06b);
                this.q.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
                break;
            default:
                d(i);
                break;
        }
    }

    private void d(int i) {
        if (i == 7) {
            this.k.setImageResource(R.mipmap.ic_body_type_img_07b);
            this.l.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
        } else if (i == 8) {
            this.n.setImageResource(R.mipmap.ic_body_type_img_08b);
            this.o.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
        } else if (i == 9) {
            this.j.setImageResource(R.mipmap.ic_body_type_img_09b);
            this.f.setTextColor(BaseApplication.getContext().getResources().getColor(R.color.hw_show_color_text_blue));
        } else {
            LogUtil.j("BodyReportPhysiquePredicationView", "currentSelectionOther bodyType does not exist");
        }
    }

    private void c() {
        dnb dnbVar = this.ac;
        if (dnbVar == null) {
            LogUtil.j("BodyReportPhysiquePredicationView", "initBodyShape WeightBean is null");
            return;
        }
        if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(dnbVar.getWeightScaleProductId()) && this.ac.c() < 18) {
            this.m.setGravity(17);
            this.e.setVisibility(8);
            return;
        }
        this.m.setGravity(51);
        this.e.setVisibility(0);
        int iB = exz.b(this.ac.an(), this.ac.j());
        if (ezh.a(iB)) {
            this.d.setText(vcz.e(iB));
            this.f51051b.setImageResource(vdc.d(iB));
        }
    }

    @Override // defpackage.vfm
    public BodyReportRecycleItem a() {
        BodyReportRecycleItem bodyReportRecycleItem = this.x;
        return bodyReportRecycleItem == null ? super.a() : bodyReportRecycleItem;
    }
}
