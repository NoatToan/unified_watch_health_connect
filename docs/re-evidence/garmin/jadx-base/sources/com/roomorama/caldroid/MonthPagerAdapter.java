package com.roomorama.caldroid;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import androidx.fragment.app.v;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MonthPagerAdapter extends a0 {
    private ArrayList<DateGridFragment> fragments;

    public MonthPagerAdapter(v vVar) {
        super(vVar);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public int getF44052d() {
        return 4;
    }

    public ArrayList<DateGridFragment> getFragments() {
        if (this.fragments == null) {
            this.fragments = new ArrayList<>();
            for (int i14 = 0; i14 < getF44052d(); i14++) {
                this.fragments.add(new DateGridFragment());
            }
        }
        return this.fragments;
    }

    @Override // androidx.fragment.app.a0
    public Fragment getItem(int i14) {
        return getFragments().get(i14);
    }

    public void setFragments(ArrayList<DateGridFragment> arrayList) {
        this.fragments = arrayList;
    }
}
