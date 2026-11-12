package com.xiaomi.hm.health.fragment;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class BaseFragment extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (isAdded()) {
            Iterator<Fragment> it2 = getChildFragmentManager().getFragments().iterator();
            while (it2.hasNext()) {
                it2.next().setUserVisibleHint(z);
            }
        }
    }
}
