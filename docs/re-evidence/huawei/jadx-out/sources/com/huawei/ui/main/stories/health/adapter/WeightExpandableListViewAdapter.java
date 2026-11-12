package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import defpackage.dnb;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class WeightExpandableListViewAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27800b;
    private final Handler e;
    private final Resources h;
    private final boolean j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String[]> f27801c = new ArrayList(16);
    private List<List<dnb>> d = new ArrayList(16);
    private ArrayList<List<Boolean>> i = new ArrayList<>(16);

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

    public WeightExpandableListViewAdapter(Handler handler) {
        Context context = BaseApplication.getContext();
        this.f27800b = context;
        this.h = context.getResources();
        this.e = handler;
        this.j = Utils.o();
    }

    public void a(ArrayList<String[]> arrayList, ArrayList<List<dnb>> arrayList2) {
        this.f27801c.clear();
        this.d.clear();
        this.i.clear();
        if (njy.b(arrayList) && njy.b(arrayList2)) {
            this.f27801c = (List) arrayList.clone();
            this.d = (List) arrayList2.clone();
            for (int i = 0; i < arrayList.size(); i++) {
                List<dnb> list = arrayList2.get(i);
                if (!njy.e(list)) {
                    ArrayList arrayList3 = new ArrayList(16);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        arrayList3.add(false);
                    }
                    this.i.add(arrayList3);
                }
            }
        }
        notifyDataSetChanged();
    }

    public int e() {
        if (njy.e(this.f27801c)) {
            return 0;
        }
        int size = 0;
        for (int i = 0; i < this.f27801c.size(); i++) {
            List<dnb> list = this.d.get(i);
            if (!njy.e(list)) {
                size += list.size();
            }
        }
        return size;
    }

    public int a() {
        int i = 0;
        if (njy.e(this.i)) {
            return 0;
        }
        Iterator<List<Boolean>> it = this.i.iterator();
        while (it.hasNext()) {
            Iterator<Boolean> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().booleanValue()) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dnb getChild(int i, int i2) {
        if (njy.e(this.d, i)) {
            LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "getChild mChildList is out of bounds");
            return null;
        }
        List<dnb> list = this.d.get(i);
        if (njy.e(list, i2)) {
            LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "getChild weightBeanList is out of bounds");
            return null;
        }
        return list.get(i2);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        a aVarB;
        if (view == null) {
            view = c();
            aVarB = b(view);
        } else {
            aVarB = (a) view.getTag();
        }
        aVarB.d.setBackgroundResource(LanguageUtil.ba(this.f27800b) ? R.drawable.common_ui_arrow_left : R.drawable.common_ui_arrow_right);
        if (njy.e(this.d, i) || a(i2, i)) {
            LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "getChildView groupPosition or childPosition param exception");
            return view;
        }
        if (njy.c(this.d, i)) {
            dnb dnbVar = this.d.get(i).get(i2);
            if (dnbVar != null) {
                aVarB.h.setText(qrk.a(this.f27800b, dnbVar.ax(), 1));
            }
            aVarB.f27803a.setVisibility(z ? 8 : 0);
            vei.e(dnbVar, aVarB.g);
            a(aVarB, i, i2);
            c(dnbVar, aVarB, i, i2);
        }
        return view;
    }

    private View c() {
        View viewInflate = View.inflate(this.f27800b, R.layout.health_data_weight_expandlistview_child_item, null);
        BaseActivity.setViewSafeRegion(false, viewInflate);
        return viewInflate;
    }

    private a b(View view) {
        a aVar = new a();
        aVar.g = (ImageView) view.findViewById(R.id.child_item_image);
        aVar.n = (HealthTextView) view.findViewById(R.id.child_item_weight);
        aVar.m = (HealthTextView) view.findViewById(R.id.child_item_weight_unit);
        aVar.f27805c = (ImageView) view.findViewById(R.id.child_item_fat_image);
        aVar.f27804b = (HealthTextView) view.findViewById(R.id.child_item_fat);
        aVar.i = (ImageView) view.findViewById(R.id.child_item_skeletal_muscle_image);
        aVar.j = (HealthTextView) view.findViewById(R.id.child_item_skeletal_muscle);
        aVar.f = (HealthTextView) view.findViewById(R.id.child_item_skeletal_muscle_unit);
        aVar.h = (HealthTextView) view.findViewById(R.id.child_item_time);
        aVar.d = (ImageView) view.findViewById(R.id.child_item_arrow);
        aVar.e = (HealthCheckBox) view.findViewById(R.id.child_item_check_box);
        aVar.f27803a = (HealthDivider) view.findViewById(R.id.child_item_divider);
        view.setTag(aVar);
        return aVar;
    }

    private void a(a aVar, int i, int i2) {
        aVar.e.setOnCheckedChangeListener(null);
        if (this.f27799a) {
            aVar.e.setEnabled(true);
            aVar.e.setVisibility(0);
            aVar.d.setVisibility(8);
            if (njy.e(this.i, i)) {
                LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "isShowCheckBox groupPosition is out of bounds");
                return;
            }
            List<Boolean> list = this.i.get(i);
            if (njy.e(list, i2)) {
                LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "isShowCheckBox childPosition is out of bounds");
                return;
            } else {
                aVar.e.setChecked(list.get(i2).booleanValue());
                return;
            }
        }
        aVar.e.setChecked(false);
        aVar.e.setEnabled(false);
        aVar.e.setVisibility(8);
        aVar.d.setVisibility(0);
    }

    private boolean a(int i, int i2) {
        if (i < 0) {
            return true;
        }
        return njy.c(this.d, i2) && i > this.d.get(i2).size();
    }

    private void c(dnb dnbVar, a aVar, int i, int i2) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "setViewVisible bean is null");
            return;
        }
        double dAv = dnbVar.av();
        aVar.n.setText(UnitUtil.c(UnitUtil.c(dAv), 1, 1, 2, null));
        aVar.m.setText(d(dAv));
        double dB = dnbVar.b();
        if (dnbVar.isVisible(1, this.j)) {
            aVar.f27805c.setVisibility(0);
            aVar.f27804b.setVisibility(0);
            aVar.f27804b.setText(UnitUtil.e(dB, 2, 1));
        } else {
            aVar.f27805c.setVisibility(8);
            aVar.f27804b.setVisibility(8);
        }
        double dAm = dnbVar.am();
        if (dnbVar.isVisible(10, this.j)) {
            aVar.i.setVisibility(0);
            aVar.j.setVisibility(0);
            aVar.f.setVisibility(0);
            aVar.j.setText(UnitUtil.e(UnitUtil.b(dAm, 1), 1, 1));
            aVar.f.setText(d(dAm));
        } else {
            aVar.i.setVisibility(8);
            aVar.j.setVisibility(8);
            aVar.f.setVisibility(8);
        }
        b(aVar, i, i2);
        e(aVar);
    }

    private void b(a aVar, final int i, final int i2) {
        aVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.health.adapter.WeightExpandableListViewAdapter$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.e.e(i, i2, compoundButton, z);
            }
        });
    }

    /* synthetic */ void e(int i, int i2, CompoundButton compoundButton, boolean z) {
        LogUtil.a("HealthWeight_WeightExpandableListViewAdapter", "holder.mCheckBox isCheck = ", Boolean.valueOf(z), ",groupPosition = ", Integer.valueOf(i), ", childPosition = ", Integer.valueOf(i2));
        if (njy.c(this.i, i)) {
            List<Boolean> list = this.i.get(i);
            if (!njy.c(list, i2) || this.e == null) {
                return;
            }
            list.set(i2, Boolean.valueOf(z));
            Message messageObtain = Message.obtain();
            messageObtain.what = -1;
            messageObtain.obj = Boolean.valueOf(z);
            this.e.sendMessage(messageObtain);
        }
    }

    private String d(double d) {
        return vei.e(UnitUtil.c(d), false);
    }

    private void e(a aVar) {
        int measuredWidth;
        if (aVar.f27805c.getVisibility() == 8 || aVar.i.getVisibility() == 8) {
            return;
        }
        float f = 14;
        aVar.f27804b.setTextSize(1, f);
        aVar.j.setTextSize(1, f);
        aVar.f.setTextSize(1, f);
        int i = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        aVar.f27805c.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        aVar.i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        aVar.d.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        aVar.e.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        aVar.h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        if (aVar.e.getVisibility() == 0) {
            measuredWidth = aVar.e.getMeasuredWidth();
        } else {
            measuredWidth = aVar.d.getMeasuredWidth();
        }
        int iD = qrs.d(this.f27800b, 16.0f);
        int iD2 = qrs.d(this.f27800b, 6.0f);
        int iD3 = qrs.d(this.f27800b, 4.0f);
        int iQ = qrs.q();
        int dimensionPixelSize = this.h.getDimensionPixelSize(R.dimen.maxPaddingStart);
        int dimensionPixelSize2 = this.h.getDimensionPixelSize(R.dimen.maxPaddingEnd);
        int measuredWidth2 = aVar.g.getMeasuredWidth();
        int measuredWidth3 = aVar.h.getMeasuredWidth();
        int measuredWidth4 = aVar.f27805c.getMeasuredWidth();
        int measuredWidth5 = aVar.i.getMeasuredWidth();
        while (i <= 4) {
            int i2 = i;
            if (Float.compare(aVar.f27804b.getPaint().measureText(aVar.f27804b.getText().toString()) + aVar.j.getPaint().measureText(aVar.j.getText().toString()) + aVar.f.getPaint().measureText(aVar.f.getText().toString()), (((((((((((((iQ - dimensionPixelSize) - dimensionPixelSize2) - measuredWidth2) - measuredWidth3) - measuredWidth) - iD) - iD3) - measuredWidth4) - measuredWidth5) - iD2) - iD2) - iD3) - iD3) - iD3) == 1) {
                float f2 = 14 - i2;
                aVar.f27804b.setTextSize(1, f2);
                aVar.j.setTextSize(1, f2);
                aVar.f.setTextSize(1, f2);
            }
            i = i2 + 1;
        }
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "getChildrenCount is out of bounds");
            return 0;
        }
        return this.d.get(i).size();
    }

    @Override // android.widget.ExpandableListAdapter
    public Object getGroup(int i) {
        if (njy.e(this.f27801c, i)) {
            LogUtil.j("HealthWeight_WeightExpandableListViewAdapter", "getGroup is out of bounds");
            return null;
        }
        return this.f27801c.get(i);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f27801c.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = View.inflate(this.f27800b, R.layout.health_data_weight_expandlistview_father_item, null);
            cVar = new c();
            cVar.f27806a = (LinearLayout) view.findViewById(R.id.health_data_weight_father_ll);
            cVar.e = (HealthTextView) view.findViewById(R.id.hw_show_health_data_weight_history_listview_father_textview1);
            cVar.d = (HealthTextView) view.findViewById(R.id.hw_show_health_data_weight_history_listview_father_avg_textview);
            cVar.d.setText(this.h.getString(R.string.IDS_hw_health_show_healthdata_weight_average));
            cVar.i = (HealthTextView) view.findViewById(R.id.hw_show_health_data_weight_history_listview_father_textview2);
            cVar.g = (HealthTextView) view.findViewById(R.id.health_data_weight_history_list_view_father_textview2_unit);
            cVar.f27808c = (ImageView) qsp.a(view, R.id.father_img_arrow);
            cVar.f27807b = (HealthDivider) qsp.a(view, R.id.weight_father_divider);
            BaseActivity.setViewSafeRegion(false, cVar.f27806a);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        double d = d(i, cVar);
        b(i, z, cVar, d);
        d(cVar, d, z);
        return view;
    }

    private void d(c cVar, double d, boolean z) {
        int i;
        int iE = UnitUtil.e();
        if (iE == 1) {
            i = R.plurals.IDS_health_catty;
        } else if (iE == 3) {
            i = R.plurals.IDS_lb_string;
        } else {
            i = R.plurals.IDS_kg_string;
        }
        double dC = UnitUtil.c(d);
        lrd.b(cVar.f27806a, qre.a(R.string.accessibility_weight_history_average, cVar.e.getText(), qre.e(i, UnitUtil.b(dC, Locale.getDefault()), UnitUtil.c(dC, 1, 1, 2, null))), z);
    }

    private double d(int i, c cVar) {
        if (njy.e(this.f27801c, i)) {
            ReleaseLogUtil.d("HealthWeight_WeightExpandableListViewAdapter", "getAverageWeight groupPosition ", Integer.valueOf(i), " mFatherList ", this.f27801c);
            return 0.0d;
        }
        String[] strArr = this.f27801c.get(i);
        if (njy.c(strArr, 0)) {
            cVar.e.setText(strArr[0]);
        } else {
            ReleaseLogUtil.d("HealthWeight_WeightExpandableListViewAdapter", "getAverageWeight mTitle stringArray ", strArr);
        }
        if (njy.c(strArr, 1)) {
            return qrs.g(strArr[1]);
        }
        ReleaseLogUtil.d("HealthWeight_WeightExpandableListViewAdapter", "getAverageWeight stringArray ", strArr);
        return 0.0d;
    }

    private void b(int i, boolean z, c cVar, double d) {
        cVar.i.setText(" " + UnitUtil.c(UnitUtil.c(d), 1, 1, 2, null));
        cVar.g.setText(d(d));
        cVar.f27807b.setVisibility(i == 0 ? 8 : 0);
        cVar.f27808c.setImageResource(z ? R.drawable.ic_health_list_drop_down_arrow_nor : R.drawable.ic_health_list_drop_down_arrow_sel);
        CardConstants.c(cVar.e);
    }

    public boolean d() {
        return this.f27799a;
    }

    public void d(boolean z) {
        this.f27799a = z;
    }

    public ArrayList<List<Boolean>> b() {
        return this.i;
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        LinearLayout f27806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f27807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f27808c;
        HealthTextView d;
        HealthTextView e;
        HealthTextView g;
        HealthTextView i;

        private c() {
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthDivider f27803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f27804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ImageView f27805c;
        ImageView d;
        HealthCheckBox e;
        HealthTextView f;
        ImageView g;
        HealthTextView h;
        ImageView i;
        HealthTextView j;
        HealthTextView m;
        HealthTextView n;

        private a() {
        }
    }
}
