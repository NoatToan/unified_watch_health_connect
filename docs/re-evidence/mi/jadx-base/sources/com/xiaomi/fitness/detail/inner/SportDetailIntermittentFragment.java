package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.GroupSportDetailInfo;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.model.GroupInfoViewModel;
import com.xiaomi.fitness.detail.recycler.SportGroupInfoAdapter;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.byi;
import defpackage.hoi;
import defpackage.oea;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SportDetailIntermittentFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataTitleSimpleView f11861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f11862b;
    public oea c;
    public ArrayList<GroupSportDetailInfo> d;
    public List<GroupInfoViewModel> e;
    public SportGroupInfoAdapter f;

    private void initGroupInfoRecycler() {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.addAll(SportRecordDataUtil.createGroupInfoViewModel(this.d, this.sportType));
        this.f11862b.setLayoutManager(new LinearLayoutManager(requireActivity()));
        SportGroupInfoAdapter sportGroupInfoAdapter = new SportGroupInfoAdapter(requireActivity(), this.e, this.sportType);
        this.f = sportGroupInfoAdapter;
        this.f11862b.setAdapter(sportGroupInfoAdapter);
    }

    private void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            this.d = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST);
        }
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public String getCardName() {
        return "sport_intermittent_group";
    }

    public void initView() {
        initBaseParams();
        initParamsFromBundle(getArguments());
        this.f11861a.bindData(hoi.C0, getResources().getQuantityString(byi.H, this.d.size(), Integer.valueOf(this.d.size())));
        initGroupInfoRecycler();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        oea oeaVarA0 = oea.A0(layoutInflater, viewGroup, false);
        this.c = oeaVarA0;
        this.f11862b = oeaVarA0.D;
        this.f11861a = oeaVarA0.B;
        return oeaVarA0.getRoot();
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
