package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.adapters.SportNounExpandableListAdapter;
import defpackage.njy;
import defpackage.sza;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SportNounExplainFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportNounExpandableListAdapter f25932a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExpandableListView f25934c;
    private Context e;
    private View i;
    private List<sza> d = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f25933b = null;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.a("SportNounExplainFragment", "onCreateView inflater is null");
            return null;
        }
        LogUtil.a("SportNounExplainFragment", "onCreateView");
        this.i = layoutInflater.inflate(R.layout.fragment_sport_noun_explain_list, viewGroup, false);
        this.e = getActivity();
        e();
        d(this.i);
        b(0);
        return this.i;
    }

    private void e() {
        LogUtil.a("SportNounExplainFragment", "initData");
        if (this.f25933b != null) {
            this.f25933b = null;
        }
        Resources resources = getResources();
        this.f25933b = new String[]{resources.getString(R.string.IDS_main_watch_heart_rate_string), resources.getString(R.string.IDS_pluginmotiontrack_detail_title_step), resources.getString(R.string.IDS_pluginmotiontrack_detail_running_posture), resources.getString(R.string.IDS_Fitness_terms_title_train), resources.getString(R.string.IDS_Fitness_terms_title_swim), resources.getString(R.string.IDS_aw_version2_basketball_data), resources.getString(R.string.IDS_pluginmotiontrack_detail_title_ride), resources.getString(R.string.IDS_motiontrack_cross_tainer_data)};
        int i = 0;
        while (true) {
            String[] strArr = this.f25933b;
            if (i >= strArr.length) {
                return;
            }
            this.d.add(new sza(strArr[i], i, this.e));
            i++;
        }
    }

    private void d(View view) {
        LogUtil.a("SportNounExplainFragment", "initView");
        ExpandableListView expandableListView = (ExpandableListView) view.findViewById(R.id.list_sport_noun_explain_simplify);
        this.f25934c = expandableListView;
        BaseActivity.cancelLayoutById(expandableListView);
        BaseActivity.setViewSafeRegion(false, this.f25934c);
        SportNounExpandableListAdapter sportNounExpandableListAdapter = new SportNounExpandableListAdapter(getContext());
        this.f25932a = sportNounExpandableListAdapter;
        this.f25934c.setAdapter(sportNounExpandableListAdapter);
        this.f25932a.c(this.d);
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("SportNounExplainFragment", "onDestroy");
        super.onDestroy();
    }

    private void c() {
        LogUtil.a("SportNounExplainFragment", "setTouchListener");
        this.f25934c.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() { // from class: com.huawei.ui.homehealth.runcard.trackfragments.SportNounExplainFragment.5
            @Override // android.widget.ExpandableListView.OnGroupClickListener
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
                if (!njy.e(SportNounExplainFragment.this.d, i)) {
                    sza szaVar = (sza) SportNounExplainFragment.this.d.get(i);
                    if (szaVar == null) {
                        LogUtil.j("SportNounExplainFragment", "groupData is null");
                        return true;
                    }
                    LogUtil.a("SportNounExplainFragment", "groupPosition: ", Integer.valueOf(i), " size: ", Integer.valueOf(szaVar.d()));
                    return false;
                }
                LogUtil.a("SportNounExplainFragment", "onGroupClick groupPosition is out of bounds");
                return false;
            }
        });
    }

    private void b(int i) {
        this.f25934c.expandGroup(i);
        if (njy.c(this.d, i)) {
            this.d.get(i).d(true);
        }
    }
}
