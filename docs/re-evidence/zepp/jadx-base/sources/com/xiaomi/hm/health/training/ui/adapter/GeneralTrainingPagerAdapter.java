package com.xiaomi.hm.health.training.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.xiaomi.hm.health.training.ui.fragment.ActionTrainingListFragment;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseListFragment;
import com.xiaomi.hm.health.training.ui.fragment.TrainingKnowledgeListFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class GeneralTrainingPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> a;

    public GeneralTrainingPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(new FeaturedCourseListFragment());
        this.a.add(new ActionTrainingListFragment());
        this.a.add(new TrainingKnowledgeListFragment());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return this.a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        return this.a.get(i);
    }
}
