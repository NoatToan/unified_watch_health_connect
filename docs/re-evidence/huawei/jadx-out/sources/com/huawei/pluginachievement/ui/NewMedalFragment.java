package com.huawei.pluginachievement.ui;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.ui.adapter.MedalExpandableAdapter;
import com.huawei.pluginachievement.ui.listenerinterface.MedalFragmentFreshListener;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class NewMedalFragment extends BaseFragment implements MedalFragmentFreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthExpandableListView f22142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MedalExpandableAdapter f22143c;
    private String e;
    private Map<String, ArrayList<MedalInfoDesc>> f;
    private ArrayList<String> g;
    private LinearLayout i;
    private AchieveMedalNewActivity j;
    private Pair<Integer, Integer> h = BaseActivity.getSafeRegionWidth();
    private Map<String, Integer> d = new HashMap(16);

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() instanceof AchieveMedalNewActivity) {
            this.j = (AchieveMedalNewActivity) getActivity();
            this.f22141a = getArguments().getInt("position");
            String string = getArguments().getString("kind");
            this.e = string;
            LogUtil.a("PluginAchievement_MyMedalFragment", "onCreate() kind= ", string, " category= ", Integer.valueOf(this.f22141a));
            try {
                if (getArguments().getStringArrayList("secondtab") != null) {
                    this.g = getArguments().getStringArrayList("secondtab");
                } else {
                    Map<String, ArrayList<String>> mapD = this.j.d();
                    if (mapD != null) {
                        this.g = mapD.get(this.e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                LogUtil.e("PluginAchievement_MyMedalFragment", "onCreate ArrayIndexOutOfBoundsException");
            }
            this.f = this.j.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.new_medal_content_fragment, (ViewGroup) null);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.no_medal_layout);
        HealthExpandableListView healthExpandableListView = (HealthExpandableListView) viewInflate.findViewById(R.id.expandable_list_view);
        this.f22142b = healthExpandableListView;
        healthExpandableListView.setPadding(((Integer) this.h.first).intValue(), 0, ((Integer) this.h.second).intValue(), 0);
        b();
        return viewInflate;
    }

    private void b() {
        ArrayList<String> arrayList = this.g;
        if (arrayList != null) {
            boolean z = false;
            for (String str : arrayList) {
                Map<String, ArrayList<MedalInfoDesc>> map = this.f;
                if (map != null && map.get(str) != null && this.f.get(str).size() > 0) {
                    z = true;
                }
            }
            if (z) {
                LogUtil.a("PluginAchievement_MyMedalFragment", "onCreateView() secondTab toString = ", this.g.toString(), " flags = true");
                this.i.setVisibility(4);
                HashMap map2 = new HashMap(16);
                for (int i = 0; i < this.g.size(); i++) {
                    map2.put(Integer.valueOf(i), this.g.get(i));
                    this.d.put(this.g.get(i), 0);
                }
                MedalExpandableAdapter medalExpandableAdapter = new MedalExpandableAdapter(getActivity(), this.f, map2);
                this.f22143c = medalExpandableAdapter;
                this.f22142b.setAdapter(medalExpandableAdapter);
                this.j.e(this.f22141a, e(this.f22142b, this.f22143c));
                this.f22142b.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: com.huawei.pluginachievement.ui.NewMedalFragment.1
                    @Override // android.widget.ExpandableListView.OnGroupExpandListener
                    public void onGroupExpand(int i2) {
                        if (njy.e(NewMedalFragment.this.g, i2)) {
                            return;
                        }
                        NewMedalFragment.this.d.put((String) NewMedalFragment.this.g.get(i2), 1);
                        NewMedalFragment newMedalFragment = NewMedalFragment.this;
                        NewMedalFragment.this.j.d(NewMedalFragment.this.f22141a, i2, newMedalFragment.e(newMedalFragment.f22142b, NewMedalFragment.this.f22143c));
                    }
                });
                this.f22142b.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() { // from class: com.huawei.pluginachievement.ui.NewMedalFragment.2
                    @Override // android.widget.ExpandableListView.OnGroupCollapseListener
                    public void onGroupCollapse(int i2) {
                        if (njy.e(NewMedalFragment.this.g, i2)) {
                            return;
                        }
                        NewMedalFragment.this.d.put((String) NewMedalFragment.this.g.get(i2), 0);
                        NewMedalFragment newMedalFragment = NewMedalFragment.this;
                        NewMedalFragment.this.j.d(NewMedalFragment.this.f22141a, i2, newMedalFragment.e(newMedalFragment.f22142b, NewMedalFragment.this.f22143c));
                    }
                });
            }
        }
    }

    public int e(ExpandableListView expandableListView, MedalExpandableAdapter medalExpandableAdapter) {
        Map<String, Integer> map;
        Integer num;
        if (medalExpandableAdapter == null || (map = this.d) == null || map.size() == 0) {
            return 0;
        }
        int childrenCount = 0;
        int measuredHeight = 0;
        for (int i = 0; i < medalExpandableAdapter.getGroupCount(); i++) {
            View groupView = medalExpandableAdapter.getGroupView(i, false, null, expandableListView);
            if (groupView != null) {
                groupView.measure(0, 0);
                measuredHeight += groupView.getMeasuredHeight();
                childrenCount += medalExpandableAdapter.getChildrenCount(0) - 1;
            }
        }
        LogUtil.a("PluginAchievement_MyMedalFragment", "getListHeight secondTab list = ", Integer.valueOf(childrenCount));
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (!njy.e(this.g, i2) && (num = this.d.get(this.g.get(i2))) != null && num.intValue() == 1) {
                for (int i3 = 0; i3 < medalExpandableAdapter.getChildrenCount(i2); i3++) {
                    View childView = medalExpandableAdapter.getChildView(i2, i3, false, null, expandableListView);
                    if (childView != null) {
                        childView.measure(0, 0);
                        measuredHeight += childView.getMeasuredHeight();
                        childrenCount += medalExpandableAdapter.getChildrenCount(i2) - 1;
                    }
                }
            }
        }
        int dividerHeight = measuredHeight + (expandableListView.getDividerHeight() * childrenCount);
        LogUtil.a("PluginAchievement_MyMedalFragment", "getListHeight secondTab totallist = ", Integer.valueOf(dividerHeight));
        return dividerHeight;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        MedalExpandableAdapter medalExpandableAdapter = this.f22143c;
        if (medalExpandableAdapter != null) {
            medalExpandableAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    public void e() {
        AchieveMedalNewActivity achieveMedalNewActivity = this.j;
        if (achieveMedalNewActivity != null) {
            this.f = achieveMedalNewActivity.a();
            Map<String, ArrayList<String>> mapD = this.j.d();
            if (this.f == null || mapD == null) {
                return;
            }
            ArrayList<String> arrayList = mapD.get(this.e);
            this.g = arrayList;
            if (arrayList == null) {
                return;
            }
            b();
        }
    }

    @Override // com.huawei.pluginachievement.ui.listenerinterface.MedalFragmentFreshListener
    public void onFragmentFreshListener(String str) {
        this.j.onFragmentFreshListener(str);
    }
}
