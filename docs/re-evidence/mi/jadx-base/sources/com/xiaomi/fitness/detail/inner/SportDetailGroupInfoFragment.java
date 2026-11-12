package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.model.GroupInfoViewModel;
import com.xiaomi.fitness.detail.recycler.SportGroupInfoAdapter;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.byi;
import defpackage.hea;
import defpackage.hoi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SportDetailGroupInfoFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataTitleSimpleView f11859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f11860b;
    public hea c;
    public ArrayList<GroupSportDetailInfo> d;
    public List<GroupInfoViewModel> e;
    public SportGroupInfoAdapter f;

    private void initGroupInfoRecycler() {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.addAll(SportRecordDataUtil.createGroupInfoViewModel(this.d, this.sportType));
        this.f11860b.setLayoutManager(new LinearLayoutManager(requireActivity()));
        SportGroupInfoAdapter sportGroupInfoAdapter = new SportGroupInfoAdapter(requireActivity(), this.e, this.sportType);
        this.f = sportGroupInfoAdapter;
        this.f11860b.setAdapter(sportGroupInfoAdapter);
    }

    private void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            this.d = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST);
        }
    }

    public static void x(SportBasicReport sportBasicReport, int i, int i2, ArrayList<GroupSportDetailInfo> arrayList, FragmentManager fragmentManager) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST, arrayList);
        bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportBasicReport);
        bundle.putInt("sport_type", i);
        BaseSportDetailFragment.switchFragment(bsi.a0, SportDetailGroupInfoFragment.class, BaseSportDetailFragment.createFragmentTag("SportDetailGroupInfoFragment", i2, i), bundle, fragmentManager);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public String getCardName() {
        return "sport_group_info";
    }

    public void initView() {
        initBaseParams();
        initParamsFromBundle(getArguments());
        this.f11859a.bindData(hoi.C0, getResources().getQuantityString(byi.H, this.d.size(), Integer.valueOf(this.d.size())));
        initGroupInfoRecycler();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        hea heaVarA0 = hea.A0(layoutInflater, viewGroup, false);
        this.c = heaVarA0;
        this.f11860b = heaVarA0.C;
        this.f11859a = heaVarA0.B;
        return heaVarA0.getRoot();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
    }
}
