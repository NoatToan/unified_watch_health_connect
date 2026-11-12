package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;

/* JADX INFO: loaded from: classes23.dex */
public class cai extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<BitmapDrawable> f1389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f1390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1391c = BaseApplication.getContext();
    private int d;
    private int e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public cai(SparseArray<BitmapDrawable> sparseArray, SparseArray<String> sparseArray2) {
        this.f1389a = sparseArray;
        this.f1390b = sparseArray2;
        a(false);
    }

    public void a(boolean z) {
        this.d = qjs.c(z, 3);
        this.e = qrs.m() / 5;
        notifyDataSetChanged();
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        SparseArray<BitmapDrawable> sparseArray = this.f1389a;
        if (sparseArray == null) {
            return 0;
        }
        return Math.max(sparseArray.size(), 0);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(this.f1391c, R.layout.item_mask, null);
        if (this.f1389a == null) {
            LogUtil.j("HL_MaskViewPageAdapter", "instantiateItem mDrawableArray is null");
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
        HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.item_mask_card_view);
        if (this.e > 0) {
            ViewGroup.LayoutParams layoutParams = healthCardView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = this.e;
                healthCardView.setLayoutParams(layoutParams2);
            }
        }
        int i2 = i + 1;
        if (this.f1390b == null) {
            LogUtil.j("HL_MaskViewPageAdapter", "instantiateItem mStringArray is null");
        } else {
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.item_mask_text);
            healthTextView.setText(this.f1390b.get(i2));
            ViewGroup.LayoutParams layoutParams3 = healthTextView.getLayoutParams();
            layoutParams3.width = this.d;
            healthTextView.setLayoutParams(layoutParams3);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.item_mask_image);
        BitmapDrawable bitmapDrawable = this.f1389a.get(i2);
        imageView.setImageDrawable(bitmapDrawable);
        if (bitmapDrawable == null) {
            LogUtil.j("HL_MaskViewPageAdapter", "instantiateItem bitmapDrawable is null");
            e(imageView, 1946, 1101);
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap == null) {
            LogUtil.j("HL_MaskViewPageAdapter", "instantiateItem bitmap is null");
            e(imageView, 1946, 1101);
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        e(imageView, width > 0 ? width : 1946, height > 0 ? height : 1101);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    private void e(ImageView imageView, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = (i2 * this.d) / i;
        layoutParams.width = this.d;
        imageView.setLayoutParams(layoutParams);
    }
}
