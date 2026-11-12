package com.huawei.healthcloud.plugintrack.runningroute.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CoordinatorAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<View> f10566a;
    private List<String> e;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public CoordinatorAdapter(ArrayList<View> arrayList, List<String> list) {
        this.f10566a = arrayList;
        this.e = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (njy.e(this.f10566a, i)) {
            return;
        }
        viewGroup.removeView(this.f10566a.get(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<View> list = this.f10566a;
        int size = list != null ? list.size() : 0;
        LogUtil.a("CoordinatorAdapter", "count: ", Integer.valueOf(size));
        return size;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f10566a, i)) {
            return null;
        }
        View view = this.f10566a.get(i);
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
        viewGroup.addView(view);
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.e.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        for (int i = 0; i < this.f10566a.size(); i++) {
            if (obj.equals(this.f10566a.get(i))) {
                return i;
            }
        }
        return -2;
    }
}
