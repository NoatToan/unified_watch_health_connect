package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import com.huawei.health.knit.section.listener.HealthPageResTrigger;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ucb extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f49917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f49918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f49919c;
    private IBaseResponseCallback d;
    private HealthPageResTrigger e;
    private List<String> f;
    private HealthViewPager g;
    private List<String> h;
    private List<String> i;
    private View j;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ucb(Context context, List<Integer> list, List<String> list2, List<String> list3) {
        if (njy.e(list) || njy.e(list2) || njy.e(list3) || list.size() != list2.size() || list.size() != list3.size()) {
            throw new IllegalArgumentException("data is illegal!");
        }
        this.f49918b = context;
        this.f49917a = list;
        this.i = list2;
        this.f49919c = list3;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.e(this.f49917a)) {
            return 0;
        }
        return this.f49917a.size();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        LogUtil.a("BootPagerAdapter", "instantiateItem, index = " + i);
        if (njy.e(this.f49917a, i)) {
            return new Object();
        }
        if (!(viewGroup instanceof HealthViewPager)) {
            return new Object();
        }
        View viewA = a(i);
        if (viewA == null) {
            return new Object();
        }
        ((HealthViewPager) viewGroup).addView(viewA);
        return viewA;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    public void e(View view) {
        this.j = view;
    }

    public void c(HealthViewPager healthViewPager) {
        this.g = healthViewPager;
    }

    private View a(final int i) {
        if (!njy.c(this.f49917a, i) || !njy.c(this.i, i) || !njy.c(this.f49919c, i)) {
            return null;
        }
        View viewInflate = LayoutInflater.from(this.f49918b).inflate(R.layout.sleep_boot_page_view_page, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.page_image_view);
        imageView.setImageDrawable(ResourcesCompat.getDrawable(BaseApplication.getContext().getResources(), this.f49917a.get(i).intValue(), null));
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.page_text);
        healthTextView.setText(this.i.get(i));
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.page_button);
        healthButton.setText(this.f49919c.get(i));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: ubz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49916a.e(i, view);
            }
        });
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.skip_text);
        if (njy.b(this.f)) {
            healthTextView2.setText(this.f.get(i));
            healthTextView2.setVisibility(0);
            healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: ucg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49926c.b(view);
                }
            });
        }
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.page_title);
        if (njy.b(this.h)) {
            healthTextView3.setText(this.h.get(i));
            healthTextView3.setVisibility(0);
            healthTextView.setTextSize(0, this.f49918b.getResources().getDimension(R.dimen.textSizeBody2));
        }
        c(viewInflate, i, healthTextView, imageView);
        return viewInflate;
    }

    /* synthetic */ void e(int i, View view) {
        if (i == this.f49917a.size() - 1) {
            View view2 = this.j;
            if (view2 != null) {
                view2.setVisibility(8);
                HealthPageResTrigger healthPageResTrigger = this.e;
                if (healthPageResTrigger != null) {
                    healthPageResTrigger.setBootAdapter(true);
                }
            }
            IBaseResponseCallback iBaseResponseCallback = this.d;
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, true);
                return;
            }
            return;
        }
        HealthViewPager healthViewPager = this.g;
        if (healthViewPager != null) {
            healthViewPager.setCurrentItem(i + 1);
        }
    }

    /* synthetic */ void b(View view) {
        View view2 = this.j;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, true);
        }
    }

    protected void c(View view, int i, HealthTextView healthTextView, ImageView imageView) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.float_content);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelSize = this.f49918b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.f49918b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int i2 = this.f49918b.getResources().getDisplayMetrics().widthPixels;
        if (i == 0) {
            if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(((Integer) safeRegionWidth.first).intValue() + dimensionPixelSize, 0, ((Integer) safeRegionWidth.second).intValue() + dimensionPixelSize2, vdo.b(this.f49918b, 122.0f));
                linearLayout.setLayoutParams(layoutParams);
            }
            if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
                layoutParams2.topMargin = vdo.b(this.f49918b, 4.0f);
                healthTextView.setLayoutParams(layoutParams2);
            }
            d(safeRegionWidth, dimensionPixelSize, dimensionPixelSize2, i2, imageView);
            return;
        }
        if (i == this.f49917a.size() - 1) {
            if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams3.removeRule(15);
                layoutParams3.addRule(10, -1);
                layoutParams3.setMargins(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue(), vdo.b(this.f49918b, 35.0f), dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue(), 0);
                linearLayout.setLayoutParams(layoutParams3);
            }
            if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams4.height = vdo.b(this.f49918b, 324.0f);
                layoutParams4.width = -2;
                layoutParams4.gravity = GravityCompat.END;
                layoutParams4.setMarginEnd(vdo.b(this.f49918b, -12.0f));
                imageView.setLayoutParams(layoutParams4);
                return;
            }
            return;
        }
        if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams5.removeRule(12);
            layoutParams5.addRule(15, -1);
            layoutParams5.setMargins(((Integer) safeRegionWidth.first).intValue() + dimensionPixelSize, 0, ((Integer) safeRegionWidth.second).intValue() + dimensionPixelSize2, 0);
            linearLayout.setLayoutParams(layoutParams5);
        }
        d(safeRegionWidth, dimensionPixelSize, dimensionPixelSize2, i2, imageView);
    }

    protected void d(Pair<Integer, Integer> pair, int i, int i2, int i3, ImageView imageView) {
        if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            int iIntValue = (((i3 - i) - i2) - ((Integer) pair.first).intValue()) - ((Integer) pair.second).intValue();
            int iB = vdo.b(this.f49918b, 336.0f);
            boolean z = qrs.af(this.f49918b) || qrs.t() || qrs.ah(this.f49918b);
            LogUtil.a("BootPagerAdapter", "isWideScreen: ", Boolean.valueOf(z));
            if (z) {
                if (i3 > iB) {
                    iIntValue = iB;
                }
                layoutParams.width = iIntValue;
            } else {
                layoutParams.width = iIntValue;
            }
            layoutParams.gravity = 1;
            imageView.setLayoutParams(layoutParams);
            LogUtil.a("BootPagerAdapter", "width: ", Integer.valueOf(imageView.getWidth()), ", ", Integer.valueOf(layoutParams.width));
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        this.d = iBaseResponseCallback;
    }
}
