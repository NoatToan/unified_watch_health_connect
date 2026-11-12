package com.xiaomi.fitness.detail.inner;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.SportDetailGroupInfoActivity;
import com.xiaomi.fitness.detail.model.SportCourseInfoModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.b9h;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.oea;
import defpackage.pcn;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class SportDetailCourseFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataTitleSimpleView f11854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f11855b;
    public oea c;
    public ArrayList<SportCourseInfoModel> d;
    public List<SportCourseInfoModel> e;
    public List<SportCourseInfoModel> f;
    public pcn g;
    public SportBasicReport h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SportDetailCourseFragment.this.onTraceBtnFullScreen("seg_detail");
            Intent intent = new Intent();
            intent.setClass(SportDetailCourseFragment.this.requireContext(), SportDetailGroupInfoActivity.class);
            intent.putExtra("sport_report", SportDetailCourseFragment.this.d);
            intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY, ((BaseSportDetailFragment) SportDetailCourseFragment.this).sportType);
            intent.putExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, SportDetailCourseFragment.this.h);
            SportDetailCourseFragment.this.startActivity(intent);
        }
    }

    private void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            this.d = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST);
            this.h = (SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES);
        }
    }

    public static void y(SportBasicReport sportBasicReport, int i, int i2, ArrayList<SportCourseInfoModel> arrayList, FragmentManager fragmentManager) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_VALUE_LIST, arrayList);
        bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportBasicReport);
        bundle.putInt("sport_type", i);
        BaseSportDetailFragment.switchFragment(bsi.a0, SportDetailCourseFragment.class, BaseSportDetailFragment.createFragmentTag("SportDetailIntermittentFragment", i2, i), bundle, fragmentManager);
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public String getCardName() {
        int i = this.sportType;
        return (i == 9 || i == 10) ? "each_swim_detail" : "segment_detail";
    }

    public final void initGroupInfoRecycler() {
        List<SportCourseInfoModel> listSubList;
        this.e = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(this.d);
        this.f11855b.setLayoutManager(new LinearLayoutManager(requireActivity()));
        this.g = new pcn(requireActivity(), this.e, this.sportType, this.h, this);
        if (this.d.size() > 0 && (this.d.get(0).getSportState() == 32 || this.d.get(0).getSportState() == 33)) {
            this.g.h = false;
        }
        new ArrayList();
        if (this.f.size() > 10) {
            this.g.setFooterViewCount(1);
            listSubList = this.f.subList(0, 10);
        } else {
            listSubList = this.f;
            this.g.setFooterViewCount(0);
        }
        this.e.addAll(listSubList);
        this.f11855b.setAdapter(this.g);
    }

    public void initView() {
        initBaseParams();
        initParamsFromBundle(getArguments());
        int i = this.sportType;
        if (i == 9 || i == 10) {
            this.f11854a.bindData(hoi.C0, getString(j1j.f7));
        } else {
            this.f11854a.bindData(hoi.C0, getString(j1j.e7));
        }
        ImageView ivExpandView = super.getIvExpandView();
        Objects.requireNonNull(ivExpandView);
        ivExpandView.setOnClickListener(new a());
        initGroupInfoRecycler();
        initDetailViewModel();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        oea oeaVarA0 = oea.A0(layoutInflater, viewGroup, false);
        this.c = oeaVarA0;
        this.f11855b = oeaVarA0.D;
        this.f11854a = oeaVarA0.B;
        super.setIvExpandView(oeaVarA0.C);
        return this.c.getRoot();
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        onTraceBtnLoad("seg_detail", true);
        if (this.f.size() > 0) {
            this.e.clear();
            this.e.addAll(this.f);
            this.g.notifyDataSetChanged();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    @Override // defpackage.b9h
    public void onShowPassage() {
        onTraceBtnLoad("seg_detail", false);
        this.e.clear();
        new ArrayList();
        this.e.addAll(this.f.size() > 10 ? this.f.subList(0, 10) : this.f);
        this.g.notifyDataSetChanged();
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView();
    }
}
