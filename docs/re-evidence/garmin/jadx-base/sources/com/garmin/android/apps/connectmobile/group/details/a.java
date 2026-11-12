package com.garmin.android.apps.connectmobile.group.details;

import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import b71.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import po.g;
import qm0.d;
import qm0.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/a;", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupDetailFragment f36179a;

    public a(GroupDetailFragment groupDetailFragment) {
        this.f36179a = groupDetailFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        GroupDetailFragment groupDetailFragment = this.f36179a;
        TabLayout tabLayout = groupDetailFragment.f36160c;
        Object obj = null;
        if (tabLayout == null) {
            s.m("tabLayout");
            throw null;
        }
        if (tabLayout.getSelectedTabPosition() == b.a.f36271d.ordinal()) {
            List<Fragment> listF = groupDetailFragment.getChildFragmentManager().f7372c.f();
            ArrayList arrayListL = j.l(listF);
            for (Object obj2 : listF) {
                if (obj2 instanceof x) {
                    arrayListL.add(obj2);
                }
            }
            for (Object obj3 : arrayListL) {
                if (((x) obj3).isResumed()) {
                    obj = obj3;
                    break;
                }
            }
            x xVar = (x) obj;
            if (xVar != null) {
                AppBarLayout appBarLayout = xVar.f145579d;
                if (appBarLayout != null) {
                    appBarLayout.post(new g(xVar, 8));
                }
                List<Fragment> listF2 = xVar.getChildFragmentManager().f7372c.f();
                ArrayList arrayListL2 = j.l(listF2);
                for (Object obj4 : listF2) {
                    if (obj4 instanceof d) {
                        arrayListL2.add(obj4);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : arrayListL2) {
                    if (((d) obj5).isAdded()) {
                        arrayList.add(obj5);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).n7();
                }
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        String str;
        GroupDetailFragment groupDetailFragment = this.f36179a;
        b bVar = groupDetailFragment.f36158a;
        if (bVar == null) {
            s.m("adapter");
            throw null;
        }
        ArrayList arrayList = bVar.f36267k;
        TabLayout tabLayout = groupDetailFragment.f36160c;
        if (tabLayout == null) {
            s.m("tabLayout");
            throw null;
        }
        b.a aVar = (b.a) arrayList.get(tabLayout.getSelectedTabPosition());
        aVar.getClass();
        int i14 = jm0.d.a.f99563a[aVar.ordinal()];
        if (i14 == 1) {
            str = "Feed";
        } else if (i14 == 2) {
            str = "Challenges";
        } else if (i14 == 3) {
            str = "LeaderBoard";
        } else {
            if (i14 != 4) {
                u0.r();
                return;
            }
            str = "About";
        }
        Bundle bundleD = i.d("tab", str);
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "PageViewGroupsDetail");
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
