package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.model.SportGolfInfoModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.dea;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.xnn;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SportDetailGolfInfoFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dea f11857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataTitleSimpleView f11858b;
    public RecyclerView c;
    public List<SportGolfInfoModel> d;
    public xnn e;

    private void initGroupInfoRecycler() {
        this.c.setLayoutManager(new LinearLayoutManager(requireActivity()));
        xnn xnnVar = new xnn(requireActivity(), this.d, 0);
        this.e = xnnVar;
        this.c.setAdapter(xnnVar);
    }

    private void initParamsFromBundle(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        if (bundle != null) {
            arrayList.addAll(bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST));
        }
    }

    public static void x(SportBasicReport sportBasicReport, int i, ArrayList<SportGolfInfoModel> arrayList, FragmentManager fragmentManager) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST, arrayList);
        bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportBasicReport);
        bundle.putInt("sport_type", i);
        BaseSportDetailFragment.switchFragment(bsi.Z, SportDetailGolfInfoFragment.class, BaseSportDetailFragment.createFragmentTag("SportDetailGolfInfoFragment", 0, i), bundle, fragmentManager);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public String getCardName() {
        return "each_pole_detail";
    }

    public void initView() {
        initBaseChart();
        initParamsFromBundle(getArguments());
        this.f11858b.bindData(hoi.Q1, getString(j1j.S4));
        initGroupInfoRecycler();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dea deaVarA0 = dea.A0(layoutInflater, viewGroup, false);
        this.f11857a = deaVarA0;
        this.c = deaVarA0.C;
        this.f11858b = deaVarA0.B;
        initView();
        return this.f11857a.getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }
}
