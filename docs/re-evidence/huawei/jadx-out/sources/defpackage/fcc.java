package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fcc extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f33845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fcd f33846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f33847c;
    private List<String> d;
    private List<String> e;
    private List<Integer> g;
    private HealthViewPager h;
    private List<String> i;
    private View j;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public fcc(Context context, eyd eydVar) {
        this.f33847c = context;
        this.g = eydVar.b();
        this.i = eydVar.c();
        this.f33845a = eydVar.e();
        this.e = eydVar.d();
        this.d = eydVar.a();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.g)) {
            return 0;
        }
        return this.g.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        LogUtil.a("BootPagerAdapter", "instantiateItem, index = " + i);
        if (njy.e(this.g, i)) {
            return new Object();
        }
        if (!(viewGroup instanceof HealthViewPager)) {
            return new Object();
        }
        View viewB = b(i);
        if (viewB == null) {
            return new Object();
        }
        ((HealthViewPager) viewGroup).addView(viewB);
        return viewB;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    public void b(fcd fcdVar) {
        this.f33846b = fcdVar;
    }

    public void e(View view) {
        this.j = view;
    }

    public void c(HealthViewPager healthViewPager) {
        this.h = healthViewPager;
    }

    private View b(int i) {
        View viewInflate = LayoutInflater.from(this.f33847c).inflate(R.layout.member_guide_view_page, (ViewGroup) null);
        b(viewInflate, i);
        c(viewInflate, i);
        a(viewInflate, i);
        e(viewInflate, i);
        d(viewInflate, i);
        b(viewInflate);
        return viewInflate;
    }

    private void b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.member_guide_image_layout);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int marginStart = layoutParams2.getMarginStart();
            int marginEnd = layoutParams2.getMarginEnd();
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            layoutParams2.setMargins(marginStart + ((Integer) safeRegionWidth.first).intValue(), 0, marginEnd + ((Integer) safeRegionWidth.second).intValue(), 0);
            constraintLayout.setLayoutParams(layoutParams2);
        }
    }

    private void b(View view, int i) {
        if (njy.e(this.g, i)) {
            return;
        }
        ((ImageView) view.findViewById(R.id.page_image_view)).setImageDrawable(ResourcesCompat.getDrawable(BaseApplication.getContext().getResources(), this.g.get(i).intValue(), null));
    }

    private void c(View view, int i) {
        if (njy.e(this.i, i)) {
            return;
        }
        ((HealthTextView) view.findViewById(R.id.member_guide_title)).setText(this.i.get(i));
    }

    private void a(View view, final int i) {
        if (njy.e(this.f33845a, i)) {
            return;
        }
        HealthButton healthButton = (HealthButton) view.findViewById(R.id.member_guide_button);
        c(healthButton);
        healthButton.setText(this.f33845a.get(i));
        if (this.f33845a.get(i).equals(this.f33847c.getString(R.string.IDS_member_center_start_trip))) {
            healthButton.setTextColor(this.f33847c.getColor(R.color.vip_product_card_button_text_color));
        }
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: fcc.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (i == fcc.this.g.size() - 1) {
                    if (fcc.this.f33846b != null) {
                        fcc.this.f33846b.dismiss();
                    }
                } else if (fcc.this.h != null) {
                    fcc.this.h.setCurrentItem(i + 1);
                }
            }
        });
    }

    private void c(HealthButton healthButton) {
        ViewGroup.LayoutParams layoutParams = healthButton.getLayoutParams();
        int iB = qqp.b(this.f33847c);
        int iB2 = fxk.b();
        int iJ = new HealthColumnSystem(BaseApplication.getContext()).j();
        int i = (iB2 - ((iJ + 1) * iB)) / iJ;
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.width = qrs.af(this.f33847c) ? (i + iB) * 2 : i * 3;
            healthButton.setLayoutParams(layoutParams2);
        }
    }

    private void e(View view, int i) {
        if (njy.e(this.e, i)) {
            return;
        }
        qsp.a((HealthTextView) view.findViewById(R.id.member_guide_description), this.e.get(i), true);
    }

    private void d(View view, int i) {
        if (njy.e(this.d, i) || TextUtils.isEmpty(this.d.get(i))) {
            return;
        }
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.member_guide_attention);
        healthTextView.setText(this.d.get(i));
        healthTextView.setVisibility(0);
    }
}
