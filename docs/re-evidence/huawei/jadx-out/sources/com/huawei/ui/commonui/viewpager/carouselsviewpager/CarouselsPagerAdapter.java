package com.huawei.ui.commonui.viewpager.carouselsviewpager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class CarouselsPagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<View> f24037b = new ArrayList<>();

    public interface IViewGenerator {
        View inflate(Context context, String str);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public CarouselsPagerAdapter(Context context, ArrayList<String> arrayList, IViewGenerator iViewGenerator) {
        this.f24036a = arrayList.size();
        int i = 0;
        while (true) {
            int i2 = this.f24036a;
            if (i >= i2 * 3) {
                return;
            }
            this.f24037b.add(iViewGenerator.inflate(context, arrayList.get(i % i2)));
            i++;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f24037b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public View instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f24037b, i)) {
            LogUtil.a("CarouselsPagerAdapter", "position is invalid");
            return null;
        }
        View view = this.f24037b.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }
}
