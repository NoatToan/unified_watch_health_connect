package com.huawei.health.suggestion.ui.healthcourse.adapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment;
import com.huawei.health.suggestion.ui.healthcourse.fragment.SeriesCourseVideoFragment;
import com.huawei.pluginfitnessadvice.course.BaseVideoInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class ShortVideoPagerAdapter extends FragmentStateAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9561c;
    private List<BaseVideoInfo> e;

    public ShortVideoPagerAdapter(FragmentActivity fragmentActivity, List<BaseVideoInfo> list, boolean z) {
        super(fragmentActivity);
        this.e = new ArrayList();
        this.e = new ArrayList(list);
        this.f9561c = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f9561c && this.e.size() > 1) {
            return this.e.size() + 2;
        }
        return this.e.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i) {
        int iA = a(i);
        if (this.e.isEmpty()) {
            return new EmptyFragment();
        }
        if (this.e.get(iA).getType() == 1) {
            return SeriesCourseVideoFragment.c(this.e.get(iA));
        }
        return BaseVideoFragment.a(this.e.get(iA));
    }

    public int a(int i) {
        int size = this.e.size();
        if (size == 0) {
            return 0;
        }
        if (!this.f9561c) {
            return i;
        }
        if (i == 0) {
            return size - 1;
        }
        if (i == size + 1) {
            return 0;
        }
        return i - 1;
    }

    public void e(List<BaseVideoInfo> list) {
        List<BaseVideoInfo> list2 = this.e;
        list2.addAll(list2.size(), list);
        notifyItemRangeChanged(this.e.size(), list.size());
    }

    public boolean d() {
        return this.f9561c;
    }

    public static class EmptyFragment extends Fragment {
        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
        }
    }
}
