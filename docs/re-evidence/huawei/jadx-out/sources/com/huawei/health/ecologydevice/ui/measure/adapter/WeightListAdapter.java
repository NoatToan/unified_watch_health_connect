package com.huawei.health.ecologydevice.ui.measure.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ecologydevice.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dxw;
import defpackage.ekd;
import defpackage.elh;
import defpackage.elo;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class WeightListAdapter extends ProductListAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<elh> f6651c;
    private LayoutInflater d;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public WeightListAdapter(Context context, ArrayList<elh> arrayList) {
        super(arrayList);
        this.f6651c = arrayList;
        this.d = LayoutInflater.from(context);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ListAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public elh getItem(int i) {
        ArrayList<elh> arrayList = this.f6651c;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        return this.f6651c.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ProductListAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar = null;
        Object[] objArr = 0;
        if (i >= this.f6651c.size()) {
            return null;
        }
        elh elhVar = this.f6651c.get(i);
        if (getItemViewType(i) != 1) {
            return super.getView(i, view, viewGroup);
        }
        if (view == null) {
            d dVar2 = new d();
            view = this.d.inflate(R.layout.my_device_bind_list_header, viewGroup, false);
            dVar2.e = (HealthTextView) view.findViewById(R.id.tv_header_name);
            dVar2.f6652a = (HealthDivider) view.findViewById(R.id.view_header_line);
            view.setTag(dVar2);
            dVar = dVar2;
        } else {
            Object tag = view.getTag();
            if (tag instanceof d) {
                dVar = (d) tag;
            }
        }
        if (dVar != null) {
            c(dVar, elhVar);
            return view;
        }
        LogUtil.j("WeightListAdapter", "holder is null");
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        ArrayList<elh> arrayList = this.f6651c;
        if (arrayList == null || i >= arrayList.size()) {
            return -1;
        }
        return this.f6651c.get(i).k();
    }

    private void c(d dVar, elh elhVar) {
        dVar.e.setText(elhVar.i());
        if (elhVar.f()) {
            dVar.f6652a.setVisibility(4);
        } else {
            dVar.f6652a.setVisibility(0);
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            dVar.e.setTextDirection(4);
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ProductListAdapter
    protected void d(Context context, int i, ProductListAdapter.b bVar) throws Throwable {
        super.d(context, i, bVar);
        if (this.f6651c.get(i).w() || bVar == null) {
            return;
        }
        bVar.f6629c.setVisibility(8);
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.adapter.ProductListAdapter
    protected void a(HealthTextView healthTextView, elh elhVar, String str) {
        if ("9323f6b7-b459-44f4-a698-988d1769832a".equals(elhVar.t())) {
            if (LanguageUtil.bb(dxw.d()) || LanguageUtil.ac(dxw.d()) || LanguageUtil.l(dxw.d())) {
                healthTextView.setText(elo.a(elhVar.t(), elhVar.l().d()));
                return;
            } else {
                healthTextView.setText("HUAWEI FIT");
                return;
            }
        }
        super.a(healthTextView, elhVar, "");
    }

    public void d(ArrayList<elh> arrayList) {
        this.e = ekd.d(arrayList);
        super.setProductList(this.e);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthDivider f6652a;
        HealthTextView e;

        private d() {
        }
    }
}
