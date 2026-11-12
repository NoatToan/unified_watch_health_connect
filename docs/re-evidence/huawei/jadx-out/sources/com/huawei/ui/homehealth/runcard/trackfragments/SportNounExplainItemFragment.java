package com.huawei.ui.homehealth.runcard.trackfragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.runcard.trackfragments.adapters.SportNounListAdapter;
import com.huawei.ui.homehealth.runcard.trackfragments.models.SportNounChildData;
import defpackage.syx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SportNounExplainItemFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25938c;
    private SportNounListAdapter d;
    private List<syx> e;
    private SportNounChildData f;
    private View h;
    private ListView j;

    public SportNounExplainItemFragment() {
        this.f25937b = 0;
        this.e = new ArrayList(10);
    }

    public SportNounExplainItemFragment(int i, int i2) {
        this.f25937b = 0;
        this.e = new ArrayList(10);
        this.f25937b = i;
        this.f25938c = i2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater == null) {
            LogUtil.a("SportNounExplainItemFragment", "inflater is null");
            return null;
        }
        LogUtil.a("SportNounExplainItemFragment", "onCreateView");
        this.h = layoutInflater.inflate(R.layout.fragment_sport_noun_explain_list_item, viewGroup, false);
        FragmentActivity activity = getActivity();
        this.f25936a = activity;
        this.f = new SportNounChildData(activity);
        e();
        a(this.h);
        return this.h;
    }

    private void e() {
        LogUtil.a("SportNounExplainItemFragment", "initData");
        if (this.e != null) {
            this.e = null;
        }
        switch (this.f25937b) {
            case 1:
                this.e = this.f.b();
                break;
            case 2:
                this.e = this.f.i();
                break;
            case 3:
                this.e = this.f.h();
                break;
            case 4:
                this.e = this.f.c(this.f25938c);
                break;
            case 5:
                this.e = this.f.g();
                break;
            case 6:
                this.e = this.f.d();
                break;
            case 7:
                this.e = this.f.e();
                break;
            case 8:
                this.e = this.f.a();
                break;
            case 9:
                this.e = this.f.j();
                break;
        }
    }

    private void a(View view) {
        LogUtil.a("SportNounExplainItemFragment", "initView");
        this.j = (ListView) view.findViewById(R.id.list_sport_noun_explain_listview);
        SportNounListAdapter sportNounListAdapter = new SportNounListAdapter(this.f25936a, this.e);
        this.d = sportNounListAdapter;
        this.j.setAdapter((ListAdapter) sportNounListAdapter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LogUtil.a("SportNounExplainItemFragment", "onDestroy");
        super.onDestroy();
    }
}
