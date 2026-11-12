package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SwimmingPassage;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.b9h;
import defpackage.dro;
import defpackage.fro;
import defpackage.gro;
import defpackage.hoi;
import defpackage.iha;
import defpackage.j1j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class SwimDetailSegmentFragment extends BaseSportDetailFragment implements b9h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataTitleSimpleView f11863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f11864b;
    public iha c;
    public List<gro> d;
    public List<gro> e = new ArrayList();
    public List<SwimmingPassage> f;
    public dro g;
    public SportBasicReport h;

    private void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            this.h = (SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES);
            this.f = bundle.getParcelableArrayList(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_ITEM_DISTANCE_LIST);
        }
    }

    private void initRecycler() {
        this.d = new ArrayList();
        this.f11864b.setLayoutManager(new LinearLayoutManager(requireActivity()));
        this.f11864b.addItemDecoration(new fro());
        this.g = new dro(requireActivity(), this.d, this);
        List<gro> listCreateDataList = createDataList();
        if (listCreateDataList.size() == 0) {
            this.f11864b.setVisibility(8);
            return;
        }
        this.f11864b.setVisibility(0);
        this.e.addAll(listCreateDataList);
        this.g.m(this.e);
        if (listCreateDataList.size() > getMaxShowCountNum()) {
            this.g.setBottomCount(1);
            listCreateDataList = listCreateDataList.subList(0, getMaxShowCountNum());
        } else {
            this.g.setBottomCount(0);
        }
        this.d.addAll(listCreateDataList);
        this.g.notifyDataSetChanged();
        this.f11864b.setAdapter(this.g);
        this.f11864b.setNestedScrollingEnabled(false);
    }

    public final List<gro> createDataList() {
        List<gro> list = this.d;
        if (list != null) {
            list.clear();
        }
        ArrayList arrayList = new ArrayList();
        List<SwimmingPassage> list2 = this.f;
        if (list2 != null && list2.size() != 0) {
            int size = this.f.size();
            int duration = 0;
            int i = 1;
            for (int i2 = 0; i2 < size; i2++) {
                SwimmingPassage swimmingPassage = this.f.get(i2);
                gro groVar = new gro(i, swimmingPassage.getDuration(), 100.0f, swimmingPassage.getPace().intValue(), 0, swimmingPassage.getSwolf().intValue(), swimmingPassage.getSwimmingPosture().intValue());
                duration = (int) (((long) duration) + swimmingPassage.getDuration());
                arrayList.add(groVar);
                if (i % 5 == 0) {
                    arrayList.add(new gro(duration, i * 100, 1));
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public String getCardName() {
        return "swim_pace";
    }

    public void initView() {
        initParamsFromBundle(getArguments());
        this.f11863a.bindData(hoi.i2, getString(j1j.R9));
        initRecycler();
        initBaseChart();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    public View onInflateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        iha ihaVarA0 = iha.A0(layoutInflater, viewGroup, false);
        this.c = ihaVarA0;
        this.f11864b = ihaVarA0.C;
        this.f11863a = ihaVarA0.B;
        this.mLineChart = ihaVarA0.A;
        initView();
        return this.c.getRoot();
    }

    @Override // defpackage.b9h
    public void onLoadMore() {
        List<gro> list = this.e;
        if (list != null) {
            if (list.size() > 0) {
                this.d.clear();
            }
            this.d.addAll(this.e);
            this.g.notifyDataSetChanged();
        }
        this.d.addAll(createDataList());
    }

    @Override // defpackage.b9h
    public void onShowPassage() {
        this.d.clear();
        List<gro> arrayList = new ArrayList<>();
        List<gro> list = this.e;
        if (list != null) {
            arrayList = list.size() > getMaxShowCountNum() ? this.e.subList(0, getMaxShowCountNum()) : this.e;
        }
        this.d.addAll(arrayList);
        this.g.notifyDataSetChanged();
    }
}
