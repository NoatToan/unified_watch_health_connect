package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.indoorequip.R;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class nyi implements HealthViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43946a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f43947c;
    private LinearLayout d;
    private List<ImageView> e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    public nyi(Context context, LinearLayout linearLayout, int i) {
        this.f43947c = context;
        this.d = linearLayout;
        this.f43946a = i;
        a();
    }

    private void a() {
        this.e = new ArrayList(0);
        for (int i = 0; i < this.f43946a; i++) {
            ImageView imageView = new ImageView(this.f43947c);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.leftMargin = 10;
            layoutParams.rightMargin = 10;
            if (i == 0) {
                imageView.setBackgroundResource(R.drawable.bg_details_photo_viewindicator_red);
            } else {
                imageView.setBackgroundResource(R.drawable.bg_details_photo_viewindicator_grey);
            }
            this.d.addView(imageView, layoutParams);
            this.e.add(imageView);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.f43946a;
            if (i2 >= i3) {
                return;
            }
            if (i % i3 == i2) {
                this.e.get(i2).setBackgroundResource(R.drawable.bg_details_photo_viewindicator_red);
            } else {
                this.e.get(i2).setBackgroundResource(R.drawable.bg_details_photo_viewindicator_grey);
            }
            i2++;
        }
    }
}
