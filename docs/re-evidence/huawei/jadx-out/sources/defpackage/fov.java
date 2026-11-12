package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fov extends HealthPagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f34331c;
    private List<Object> e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public fov(HealthViewPager healthViewPager, Context context) {
        this.f34331c = context;
    }

    public void b(List<Object> list) {
        this.e = list;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<Object> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.e, i)) {
            LogUtil.j("Section16_9Card_01Adapter", "isOutOfBounds");
            return LayoutInflater.from(this.f34331c).inflate(R.layout.section16_9card_01_banner_item, (ViewGroup) null);
        }
        Object obj = this.e.get(i);
        if (!(obj instanceof fst)) {
            return null;
        }
        View viewC = c((fst) obj);
        if (viewGroup instanceof HealthViewPager) {
            viewGroup.addView(viewC);
        }
        return viewC;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (!(obj instanceof View) || njy.e(this.e, i)) {
            return;
        }
        ((HealthViewPager) viewGroup).removeView((View) obj);
    }

    private View c(fst fstVar) {
        View viewInflate = LayoutInflater.from(this.f34331c).inflate(R.layout.section16_9card_01_banner_item, (ViewGroup) null);
        qqf.a(fstVar.a(), (ImageView) viewInflate.findViewById(R.id.item_background), 0);
        ((HealthTextView) viewInflate.findViewById(R.id.item_title)).setText(fstVar.b());
        ((HealthTextView) viewInflate.findViewById(R.id.item_desc)).setText(fstVar.d());
        ftm ftmVarI = fstVar.i();
        if (ftmVarI != null) {
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.item_top_right_text);
            healthTextView.setVisibility(ftmVarI.d());
            healthTextView.setText(ftmVarI.c());
            healthTextView.setBackground(ftmVarI.b());
        }
        String strE = fstVar.e();
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.item_bottom_right_text);
        if (!TextUtils.isEmpty(strE)) {
            healthTextView2.setText(strE);
            healthTextView2.setVisibility(0);
        }
        viewInflate.setOnClickListener(fstVar.c());
        return viewInflate;
    }
}
