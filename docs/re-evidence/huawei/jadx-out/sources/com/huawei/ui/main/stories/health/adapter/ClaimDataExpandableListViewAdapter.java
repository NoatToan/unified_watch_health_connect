package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.SelectUserInterface;
import defpackage.dnj;
import defpackage.eau;
import defpackage.njy;
import defpackage.qsp;
import defpackage.vbs;
import defpackage.vei;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ClaimDataExpandableListViewAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27713a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SelectUserInterface f27715c;
    private List<dnj> d = new ArrayList(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<eau>> f27714b = new ArrayList(16);
    private final Context e = BaseApplication.getContext();

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public ClaimDataExpandableListViewAdapter(SelectUserInterface selectUserInterface) {
        this.f27715c = selectUserInterface;
    }

    public void a(List<dnj> list, List<List<eau>> list2) {
        if (njy.e(list)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "setList userList is empty");
            return;
        }
        if (njy.e(list2)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "setList childList is empty");
            return;
        }
        this.d.clear();
        this.f27714b.clear();
        this.d.addAll(list);
        this.f27714b.addAll(list2);
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public eau getChild(int i, int i2) {
        if (njy.e(this.f27714b, i)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getChild weightBeanList is out of bounds");
            return null;
        }
        if (njy.e(this.f27714b.get(i), i2)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getChild weightBeanList is out of bounds");
            return null;
        }
        return this.f27714b.get(i).get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = View.inflate(this.e, R.layout.item_claim_data_fatrate_fluctuation, null);
            BaseActivity.setViewSafeRegion(false, view);
            cVar = new c(view);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        c cVar2 = cVar;
        if (njy.e(this.f27714b, i)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getChild weightBeanList is out of bounds");
            return view;
        }
        if (njy.e(this.f27714b.get(i), i2)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "onBindViewHolder mList is out of bounds");
            return view;
        }
        eau eauVar = this.f27714b.get(i).get(i2);
        if (eauVar == null) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "onBindViewHolder dataBean is null");
            return view;
        }
        HiHealthData hiHealthDataA = eauVar.a();
        if (hiHealthDataA == null) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "onBindViewHolder hiHealthData is null");
            return view;
        }
        e(i, i2, cVar2, eauVar, hiHealthDataA);
        return view;
    }

    private void e(int i, int i2, c cVar, final eau eauVar, HiHealthData hiHealthData) {
        int i3 = hiHealthData.getInt("trackdata_deviceType");
        double dC = UnitUtil.c(eauVar.d());
        cVar.f27719c.setText(vei.b(dC, vei.d(dC, i3)) + " " + UnitUtil.e(hiHealthData.getDouble(BleConstants.BODY_FAT_RATE), 2, 1));
        String strB = eauVar.b();
        if (!TextUtils.isEmpty(strB)) {
            cVar.d.setText(strB);
        }
        cVar.f27718b.setChecked(eauVar.f());
        cVar.e.setVisibility(i2 == this.f27714b.get(i).size() - 1 ? 8 : 0);
        cVar.f27718b.setOnClickListener(new View.OnClickListener() { // from class: usd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(eauVar, view);
            }
        });
        if (i2 == 0) {
            cVar.f27717a.setBackgroundResource(R.drawable.privacy_card_view_bg_round_top);
        } else if (i2 == this.f27714b.get(i).size() - 1) {
            cVar.f27717a.setBackgroundResource(R.drawable.privacy_card_view_bg_round_bottom);
        } else {
            cVar.f27717a.setBackgroundColor(ContextCompat.getColor(this.e, R.color.colorCardBg));
        }
    }

    public /* synthetic */ void c(eau eauVar, View view) {
        if (eauVar.f()) {
            this.f27713a--;
        } else {
            this.f27713a++;
        }
        LogUtil.a("HealthWeight_ClaimDataExpandableListViewAdapter", "mSelectStatus onClick ... dataBean.isChoose = ", Boolean.valueOf(eauVar.f()), ", mSize = ", Integer.valueOf(this.f27713a));
        this.f27715c.selectItem(b(), this.f27713a);
        eauVar.a(!eauVar.f());
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.e(this.f27714b, i)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getChild weightBeanList is out of bounds");
            return 0;
        }
        return this.f27714b.get(i).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getGroup is out of bounds");
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.d.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = View.inflate(this.e, R.layout.item_claim_measure_user_data, null);
            BaseActivity.setViewSafeRegion(false, view);
            bVar = new b(view);
            view.setTag(bVar);
        } else {
            if (!(view.getTag() instanceof b)) {
                LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "view.getTag() is not FatherViewHolder");
                return view;
            }
            bVar = (b) view.getTag();
        }
        if (njy.e(this.d, i)) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getGroupView groupPosition is out of bounds");
            return view;
        }
        dnj dnjVar = this.d.get(i);
        if (dnjVar == null) {
            LogUtil.j("HealthWeight_ClaimDataExpandableListViewAdapter", "getView user is null");
            return view;
        }
        vbs.d(dnjVar, bVar.e, bVar.f27716b);
        return view;
    }

    public void a() {
        this.f27713a = 0;
        Iterator<List<eau>> it = this.f27714b.iterator();
        while (it.hasNext()) {
            for (eau eauVar : it.next()) {
                if (eauVar.f()) {
                    eauVar.a(false);
                }
            }
        }
    }

    public int b() {
        Iterator<List<eau>> it = this.f27714b.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public void e() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.d.size(); i++) {
            List<eau> list = this.f27714b.get(i);
            ArrayList arrayList3 = new ArrayList();
            for (eau eauVar : list) {
                if (!eauVar.f()) {
                    arrayList3.add(eauVar);
                }
            }
            if (arrayList3.size() > 0) {
                arrayList2.add(this.d.get(i));
                arrayList.add(arrayList3);
            }
        }
        this.d = arrayList2;
        this.f27714b = arrayList;
        this.f27713a = 0;
        this.f27715c.selectItem(b(), this.f27713a);
        notifyDataSetChanged();
    }

    public Map<dnj, ArrayList<eau>> d() {
        HashMap map = new HashMap();
        for (int i = 0; i < this.d.size(); i++) {
            List<eau> list = this.f27714b.get(i);
            ArrayList arrayList = new ArrayList();
            for (eau eauVar : list) {
                if (eauVar.f()) {
                    arrayList.add(eauVar);
                }
            }
            if (arrayList.size() > 0) {
                map.put(this.d.get(i), arrayList);
            }
        }
        return map;
    }

    public ArrayList<eau> c() {
        ArrayList<eau> arrayList = new ArrayList<>();
        Iterator<List<eau>> it = this.f27714b.iterator();
        while (it.hasNext()) {
            for (eau eauVar : it.next()) {
                if (eauVar.f()) {
                    arrayList.add(eauVar);
                }
            }
        }
        return arrayList;
    }

    public void b(boolean z) {
        LogUtil.a("HealthWeight_ClaimDataExpandableListViewAdapter", "setAllChooseItem isAllSelect = ", Boolean.valueOf(z));
        Iterator<List<eau>> it = this.f27714b.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator<eau> it2 = it.next().iterator();
            while (it2.hasNext()) {
                i++;
                it2.next().a(z);
            }
        }
        if (z) {
            this.f27713a = i;
        } else {
            this.f27713a = 0;
        }
        notifyDataSetChanged();
        this.f27715c.selectItem(b(), this.f27713a);
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f27716b;
        private HealthTextView e;

        public b(View view) {
            this.f27716b = (ImageView) qsp.a(view, R.id.item_weight_current_user_photo);
            this.e = (HealthTextView) qsp.a(view, R.id.item_right_title_text);
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f27717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthCheckBox f27718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f27719c;
        HealthTextView d;
        HealthDivider e;

        public c(View view) {
            this.f27719c = (HealthTextView) view.findViewById(R.id.tv_claim_weight_data_body_weight);
            this.f27719c = (HealthTextView) view.findViewById(R.id.tv_claim_weight_data_body_weight);
            this.d = (HealthTextView) view.findViewById(R.id.tv_claim_weight_data_measur_time);
            this.f27718b = (HealthCheckBox) view.findViewById(R.id.iv_claim_weight_data_select_status);
            this.e = (HealthDivider) view.findViewById(R.id.view_claim_weight_data_line);
            this.f27717a = (RelativeLayout) view.findViewById(R.id.item_content_rl);
        }
    }
}
