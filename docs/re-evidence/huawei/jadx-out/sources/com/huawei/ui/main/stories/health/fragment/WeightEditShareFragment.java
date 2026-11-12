package com.huawei.ui.main.stories.health.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.WeightEditShareGridAdapter;
import com.huawei.ui.main.stories.health.interactors.healthdata.WeightShareEditListener;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WeightEditShareFragment extends BaseFragment implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Bitmap> f27923b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27924c;
    private GridView d;
    private WeightEditShareGridAdapter e;
    private View h;
    private WeightShareEditListener j;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("WeightEditShareFragment", "onCreate");
        this.f27922a = getActivity();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27924c = arguments.getInt("share_source_type");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("WeightEditShareFragment", "onCreateView");
        if (this.h == null) {
            this.h = layoutInflater.inflate(R.layout.hw_health_edit_share_fragment, viewGroup, false);
            d();
            this.d = (GridView) this.h.findViewById(R.id.hw_health_edit_share_gridview);
            this.e = new WeightEditShareGridAdapter(this.f27922a, this.f27923b, this.f27924c);
            this.d.setNumColumns(4);
            this.d.setAdapter((ListAdapter) this.e);
            this.d.setOnItemClickListener(this);
            this.d.setFocusable(false);
            if (LanguageUtil.ba(this.f27922a)) {
                this.d.setRotationY(180.0f);
            }
        }
        return this.h;
    }

    private void d() {
        this.f27923b.clear();
        if (this.f27924c == 0) {
            this.f27923b = CardConstants.d();
        } else if (LanguageUtil.f(this.f27922a)) {
            this.f27923b = CardConstants.b();
        } else {
            this.f27923b = CardConstants.d(getResources());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (njy.e(this.f27923b, i) || this.j == null) {
            LogUtil.j("WeightEditShareFragment", "position is OutOfBounds mBitmapIds or listener = null");
            return;
        }
        View viewFindViewById = view.findViewById(R.id.hw_health_edit_share_select);
        if (viewFindViewById == null) {
            LogUtil.j("WeightEditShareFragment", "shareView = null");
            return;
        }
        int i2 = this.f27924c;
        if (i2 != 0) {
            if (i2 == 1) {
                if (viewFindViewById.getVisibility() != 0) {
                    LogUtil.a("WeightEditShareFragment", "refreshWeightShareData show the view, position = ", Integer.valueOf(i));
                    viewFindViewById.setVisibility(0);
                    this.j.refreshWeightShareData(i, true);
                    return;
                } else {
                    LogUtil.a("WeightEditShareFragment", "refreshWeightShareData not show the view, position = ", Integer.valueOf(i));
                    viewFindViewById.setVisibility(8);
                    this.j.refreshWeightShareData(i, false);
                    return;
                }
            }
            LogUtil.j("WeightEditShareFragment", "errorType = ", Integer.valueOf(i2));
            return;
        }
        if (i == 0) {
            LogUtil.a("WeightEditShareFragment", "need go to camera");
            this.j.gotoCamera();
            return;
        }
        for (int i3 = 0; i3 < adapterView.getCount(); i3++) {
            View childAt = adapterView.getChildAt(i3);
            if (i == i3) {
                childAt.findViewById(R.id.hw_health_edit_share_select).setVisibility(0);
                LogUtil.a("WeightEditShareFragment", "refreshWeightShareBackground position = ", Integer.valueOf(i));
                this.j.refreshWeightShareBackground(i - 1);
            } else {
                childAt.findViewById(R.id.hw_health_edit_share_select).setVisibility(8);
            }
        }
    }

    public void b(WeightShareEditListener weightShareEditListener) {
        this.j = weightShareEditListener;
    }

    public void c() {
        if (this.d == null || this.e == null) {
            LogUtil.j("WeightEditShareFragment", "refreshGrid position mGridView is null");
            return;
        }
        LogUtil.a("WeightEditShareFragment", "refreshGrid position");
        for (int i = 0; i < this.e.getCount(); i++) {
            this.d.getChildAt(i).findViewById(R.id.hw_health_edit_share_select).setVisibility(8);
        }
    }
}
