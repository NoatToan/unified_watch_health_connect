package com.huawei.ui.main.stories.privacy.template.model.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import defpackage.njy;
import defpackage.wgv;
import defpackage.wia;
import defpackage.wua;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BloodOxygenGroupAdapter extends GroupDataAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28667c = "BloodOxygenGroupAdapter";

    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter
    public View a(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_blood_oxygen_child_item, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter, android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        GroupDataAdapter.a aVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.privacy_list_father_item, viewGroup, false);
            aVar = new GroupDataAdapter.a(view);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            aVar = tag instanceof GroupDataAdapter.a ? (GroupDataAdapter.a) tag : null;
        }
        if (aVar != null) {
            HealthTextView healthTextView = aVar.d;
            if (njy.c(this.f28702a, i)) {
                healthTextView.setText(this.f28702a.get(i).b());
            } else {
                LogUtils.w(f28667c, "getGroupView mGroupData isOutOfBounds");
            }
            if (z) {
                aVar.f28708c.setImageResource(R.drawable.ic_health_list_drop_down_arrow_sel);
                return view;
            }
            aVar.f28708c.setImageResource(R.drawable.ic_health_list_drop_down_arrow_nor);
        }
        return view;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter, android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        GroupDataAdapter.e eVarD;
        int dimensionPixelOffset;
        if (view == null) {
            view = a(viewGroup);
            eVarD = d(view);
            view.setTag(eVarD);
        } else {
            Object tag = view.getTag();
            eVarD = tag instanceof GroupDataAdapter.e ? (GroupDataAdapter.e) tag : null;
        }
        if (eVarD != null) {
            if (njy.e(this.f28702a, i)) {
                LogUtils.w(f28667c, "getChildView mGroupData isOutOfBounds");
                return view;
            }
            List<PrivacyDataModel> listC = this.f28702a.get(i).c();
            if (njy.e(listC, i2)) {
                LogUtils.w(f28667c, "getChildView modelList isOutOfBounds");
                return view;
            }
            eVarD.b(listC.get(i2));
            if (LanguageUtil.ba(eVarD.h.getContext())) {
                eVarD.f28709a.setBackgroundResource(R.drawable.common_ui_arrow_left);
            }
            if (eVarD instanceof b) {
                Resources resources = eVarD.h.getContext().getResources();
                b bVar = (b) eVarD;
                if (bVar.k.getVisibility() == 8) {
                    dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.default_list_item_Height_size_48dp);
                } else {
                    dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.health_common_64dp);
                }
                bVar.n.setMinHeight(dimensionPixelOffset);
            }
            eVarD.h.setBackgroundResource(R.drawable.privacy_card_view_bg_round);
            d(eVarD, i2, i);
        }
        return view;
    }

    @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter
    public GroupDataAdapter.e d(View view) {
        return new b(view);
    }

    class b extends GroupDataAdapter.e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f28669c;
        private HealthTextView j;
        private HealthTextView k;
        private HealthTextView l;
        private Context m;
        private ConstraintLayout n;
        private HealthTextView o;
        private RelativeLayout q;

        b(View view) {
            super(view);
            this.m = view.getContext();
            this.n = (ConstraintLayout) view.findViewById(R.id.privacy_data_layout);
            this.k = (HealthTextView) view.findViewById(R.id.privacy_extra_data);
            this.q = (RelativeLayout) view.findViewById(R.id.privacy_other_data_layout);
            this.l = (HealthTextView) view.findViewById(R.id.privacy_highland_risk_tab);
            this.o = (HealthTextView) view.findViewById(R.id.privacy_highland_risk_value);
            this.j = (HealthTextView) view.findViewById(R.id.privacy_blood_oxygen_value);
            this.f28669c = (HealthTextView) view.findViewById(R.id.privacy_altitude_value);
        }

        @Override // com.huawei.ui.main.stories.privacy.template.model.adapter.GroupDataAdapter.e
        protected void b(PrivacyDataModel privacyDataModel) {
            super.b(privacyDataModel);
            int i = privacyDataModel.getInt("bloodOxygenCardKey");
            if (i == 1001) {
                c(privacyDataModel);
            } else if (i == 1002) {
                d(privacyDataModel);
            } else {
                e(privacyDataModel);
            }
        }

        private void c(PrivacyDataModel privacyDataModel) {
            this.q.setVisibility(0);
            this.d.setText(this.m.getString(R.string.IDS_hw_health_blood_oxygen_assessment));
            this.g.setText(privacyDataModel.getDataDesc());
            this.k.setVisibility(8);
            int i = privacyDataModel.getInt("lakeLouiseScoreKey");
            String strD = wgv.d(i);
            this.l.setText(wua.h(i));
            this.l.setBackground(wia.i(i));
            this.o.setText(wia.e(this.m, "[\\d]", strD, wia.a(i), wia.f(i)));
            int i2 = privacyDataModel.getInt("bloodOxygenKey");
            this.j.setText(wia.e(this.m, "[\\d]", UnitUtil.e(i2, 2, 0), wia.e(i2), wia.d(i2)));
            int i3 = privacyDataModel.getInt("altitudeKey");
            if (i3 == Integer.MIN_VALUE) {
                this.f28669c.setText("--");
            } else {
                this.f28669c.setText(wia.e(this.m, "[\\d]", wgv.e(i3), R.style.privacy_blood_oxygen_num_normal, R.style.privacy_blood_oxygen_unit_normal));
            }
        }

        private void d(PrivacyDataModel privacyDataModel) {
            this.q.setVisibility(8);
            int i = privacyDataModel.getInt("bloodOxygenKey");
            this.d.setText(wia.e(this.m, "[\\d%]", BaseApplication.getContext().getResources().getString(R.string.IDS_health_blood_oxygen_info, wia.b(privacyDataModel.getInt("bloodOxygenCardKey")), UnitUtil.e(i, 2, 0)), wia.c(i), wia.e()));
            this.g.setText(privacyDataModel.getDataDesc());
            int i2 = privacyDataModel.getInt("altitudeKey");
            if (wia.g(i2)) {
                this.k.setText(this.k.getResources().getString(R.string.IDS_hw_health_blood_oxygen_elevation) + " " + wgv.e(i2));
                this.k.setVisibility(0);
                return;
            }
            this.k.setVisibility(8);
        }

        private void e(PrivacyDataModel privacyDataModel) {
            this.q.setVisibility(8);
            this.d.setText(privacyDataModel.getDataTitle());
            this.g.setText(privacyDataModel.getDataDesc());
            this.k.setVisibility(8);
        }
    }
}
