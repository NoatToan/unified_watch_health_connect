package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class eph extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f33305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LruCache<String, Bitmap> f33306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<Object> f33307c;
    private Context e;

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    public eph(ArrayList<String> arrayList, Context context) {
        this.f33305a = new ArrayList<>(10);
        this.f33307c = new ArrayList<>(10);
        this.f33306b = new LruCache<>(1048576);
        this.f33305a = arrayList;
        if (context == null) {
            this.e = BaseApplication.getContext();
        } else {
            this.e = context.getApplicationContext();
        }
    }

    public eph(Context context, ArrayList<Object> arrayList) {
        this.f33305a = new ArrayList<>(10);
        this.f33307c = new ArrayList<>(10);
        this.f33306b = new LruCache<>(1048576);
        if (arrayList == null) {
            LogUtil.j("PluginDevice_ImgPagerAdapter", "imgArray is null");
            return;
        }
        if (context == null) {
            this.e = BaseApplication.getContext();
        } else {
            this.e = context.getApplicationContext();
        }
        this.f33307c = arrayList;
    }

    public void d(ArrayList<String> arrayList) {
        this.f33305a = arrayList;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        ArrayList<String> arrayList = this.f33305a;
        if (arrayList != null && arrayList.size() > 0) {
            return this.f33305a.size();
        }
        ArrayList<Object> arrayList2 = this.f33307c;
        if (arrayList2 != null) {
            return arrayList2.size();
        }
        LogUtil.a("PluginDevice_ImgPagerAdapter", "getCount else");
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == ((View) obj);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ImageView imageView = obj instanceof ImageView ? (ImageView) obj : null;
        if (imageView == null || imageView.getDrawable() == null) {
            return;
        }
        imageView.setImageDrawable(null);
        a(imageView);
        if (viewGroup != null) {
            viewGroup.removeView(imageView);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) throws Throwable {
        ArrayList<Object> arrayList = this.f33307c;
        Bitmap bitmapC = null;
        if (arrayList == null || this.f33305a == null) {
            LogUtil.j("PluginDevice_ImgPagerAdapter", "mImgPaths is null or mImgArrays is null");
            return null;
        }
        if (arrayList.size() == 0 && i >= this.f33305a.size()) {
            LogUtil.j("PluginDevice_ImgPagerAdapter", "position is Beyond mImgPaths.size()");
            return null;
        }
        if (this.f33305a.size() == 0 && i >= this.f33307c.size()) {
            LogUtil.j("PluginDevice_ImgPagerAdapter", "position is Beyond mImgArrays.size()");
            return null;
        }
        LogUtil.j("PluginDevice_ImgPagerAdapter", "instantiateItem default");
        ImageView imageView = new ImageView(this.e);
        if (this.f33307c.size() > 0) {
            LogUtil.a("PluginDevice_ImgPagerAdapter", "mCurrentImgId Image");
            Object obj = this.f33307c.get(i);
            if (obj instanceof Integer) {
                imageView.setImageResource(((Integer) obj).intValue());
            }
            if (obj instanceof String) {
                imageView.setImageBitmap(elo.c((String) obj));
            }
        } else if (this.f33306b.get(this.f33305a.get(i)) == null) {
            String str = this.f33305a.get(i);
            bitmapC = elo.c(str);
            if (new File(str).exists() && bitmapC != null) {
                LogUtil.a("PluginDevice_ImgPagerAdapter", "cache Image");
                this.f33306b.put(str, bitmapC);
            }
        } else {
            String str2 = this.f33305a.get(i);
            LogUtil.a("PluginDevice_ImgPagerAdapter", "load exists Image");
            bitmapC = this.f33306b.get(str2);
        }
        if (bitmapC == null) {
            LogUtil.a("PluginDevice_ImgPagerAdapter", "ImgPagerAdapter instantiateItem:bm == null");
        } else {
            imageView.setImageBitmap(bitmapC);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        if (viewGroup instanceof HealthViewPager) {
            ((HealthViewPager) viewGroup).addView(imageView, 0);
        }
        return imageView;
    }

    public void a(ImageView imageView) {
        Bitmap bitmap;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
        LogUtil.a("PluginDevice_ImgPagerAdapter", "ImgPagerAdapter bitmap is recycle");
    }
}
