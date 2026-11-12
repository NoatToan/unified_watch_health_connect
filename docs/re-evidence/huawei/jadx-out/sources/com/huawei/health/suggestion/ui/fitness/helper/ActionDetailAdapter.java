package com.huawei.health.suggestion.ui.fitness.helper;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.view.ActionDetailView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ActionDetailAdapter extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ActionDetailView f9291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionDetailViewClickEvent f9292b;
    private List d;
    private SparseArray<ActionDetailView> e;
    private Motion f;
    private String g;
    private boolean h = true;
    private boolean j = false;
    private String i = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9293c = -1;

    public interface ActionDetailViewClickEvent {
        void onCloseImageClick();

        void onDownLoadClick(int i);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ActionDetailAdapter(List list) {
        this.d = list;
        this.e = new SparseArray<>(list.size());
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        return Math.min(this.d.size(), 1);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.e == null || viewGroup.getContext() == null) {
            return viewGroup;
        }
        ActionDetailView actionDetailView = this.e.get(i);
        this.f9291a = actionDetailView;
        if (actionDetailView == null) {
            this.f9291a = new ActionDetailView(viewGroup.getContext());
        }
        if (b(this.d, i)) {
            return this.f9291a;
        }
        this.f = (Motion) this.d.get(i);
        if (this.j) {
            this.f9291a.setLongVideoUrl(this.i);
            this.f9291a.a(null, 2, this.f);
        } else if (i == 0) {
            this.f9291a.setFitnessType(this.g);
            this.f9291a.setShowMedia(this.h);
            this.f9291a.a(null, 1, this.f);
        }
        this.e.put(i, this.f9291a);
        ActionDetailView actionDetailView2 = this.f9291a;
        if (actionDetailView2 != null && this.f9292b != null) {
            actionDetailView2.setOnDownLoadViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.ActionDetailAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActionDetailAdapter.this.f9292b.onDownLoadClick(ActionDetailAdapter.this.f9293c);
                }
            });
            this.f9291a.setOnCloseImageClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.ActionDetailAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActionDetailAdapter.this.f9292b.onCloseImageClick();
                }
            });
        }
        viewGroup.addView(this.f9291a);
        return this.f9291a;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ActionDetailView actionDetailView;
        SparseArray<ActionDetailView> sparseArray = this.e;
        if (sparseArray == null || i >= sparseArray.size() || (actionDetailView = this.e.get(i)) == null) {
            return;
        }
        viewGroup.removeView(actionDetailView);
        actionDetailView.setSurfaceTextureListener(null);
        d();
        this.e.clear();
    }

    private boolean b(List list, int i) {
        return njy.e(list, i) || !(list.get(i) instanceof Motion);
    }

    public void d() {
        ActionDetailView actionDetailView = this.f9291a;
        if (actionDetailView != null) {
            actionDetailView.e();
            this.f9291a.setSurfaceTextureListener(null);
            this.f9291a = null;
        }
    }

    public void b(boolean z) {
        ActionDetailView actionDetailView = this.f9291a;
        if (actionDetailView != null) {
            actionDetailView.setShowMedia(z);
        }
        this.h = z;
    }

    public void c(boolean z) {
        this.j = z;
    }

    public void e(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.g = str;
    }

    public void e(ActionDetailViewClickEvent actionDetailViewClickEvent) {
        this.f9292b = actionDetailViewClickEvent;
    }

    public void b(int i) {
        this.f9293c = i;
    }

    public void b() {
        ActionDetailView actionDetailView = this.f9291a;
        if (actionDetailView != null) {
            actionDetailView.d();
        }
    }

    public void c() {
        ActionDetailView actionDetailView = this.f9291a;
        if (actionDetailView != null) {
            actionDetailView.b();
        }
    }

    public ActionDetailView e() {
        return this.f9291a;
    }

    public void b(String str) {
        ActionDetailView actionDetailView = this.f9291a;
        if (actionDetailView != null) {
            actionDetailView.setTvDownLoadingProgress(str);
        }
    }

    public void d(String str) {
        ActionDetailView actionDetailView = this.f9291a;
        if (actionDetailView != null) {
            actionDetailView.setAudioSize(str);
        }
    }
}
