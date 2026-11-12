package com.huawei.ui.main.stories.health.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.ClaimMeasureDataAdapter;
import com.huawei.ui.main.stories.health.interactors.healthdata.SelectUserInterface;
import defpackage.eau;
import defpackage.njy;
import defpackage.vei;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ClaimMeasureDataAdapter extends RecyclerView.Adapter<MyViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SelectUserInterface f27720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<eau> f27721b = new ArrayList(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27722c;
    private int d;

    public ClaimMeasureDataAdapter(Context context, SelectUserInterface selectUserInterface) {
        this.f27720a = selectUserInterface;
        this.f27722c = context;
    }

    public void d() {
        this.d = 0;
        for (eau eauVar : this.f27721b) {
            if (eauVar.f()) {
                eauVar.a(false);
            }
        }
    }

    public void e(List<eau> list) {
        if (njy.e(list)) {
            LogUtil.j("ClaimMeasureDataAdapter", "setList beanList is empty");
            return;
        }
        if (this.f27721b.size() <= 0) {
            this.f27721b.addAll(list);
        } else {
            for (eau eauVar : list) {
                if (!this.f27721b.contains(eauVar)) {
                    this.f27721b.add(eauVar);
                }
            }
            Collections.sort(this.f27721b, new Comparator() { // from class: usg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ClaimMeasureDataAdapter.a((eau) obj, (eau) obj2);
                }
            });
        }
        notifyDataSetChanged();
    }

    public static /* synthetic */ int a(eau eauVar, eau eauVar2) {
        return (int) (eauVar2.e() - eauVar.e());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(this.f27722c).inflate(R.layout.item_claim_measure_data, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        if (njy.e(this.f27721b, i)) {
            LogUtil.j("ClaimMeasureDataAdapter", "onBindViewHolder mList is out of bounds");
            return;
        }
        final eau eauVar = this.f27721b.get(i);
        if (eauVar == null) {
            LogUtil.j("ClaimMeasureDataAdapter", "onBindViewHolder dataBean is null");
            return;
        }
        HiHealthData hiHealthDataA = eauVar.a();
        if (hiHealthDataA == null) {
            LogUtil.j("ClaimMeasureDataAdapter", "onBindViewHolder hiHealthData is null");
            return;
        }
        int i2 = hiHealthDataA.getInt("trackdata_deviceType");
        double dC = UnitUtil.c(eauVar.d());
        myViewHolder.d.setText(vei.b(dC, vei.d(dC, i2)));
        String strB = eauVar.b();
        if (!TextUtils.isEmpty(strB)) {
            myViewHolder.e.setText(strB);
        }
        myViewHolder.f27725c.setChecked(eauVar.f());
        myViewHolder.f27724b.setVisibility(i == this.f27721b.size() + (-1) ? 8 : 0);
        myViewHolder.f27725c.setOnClickListener(new View.OnClickListener() { // from class: usj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50508a.a(eauVar, view);
            }
        });
    }

    public /* synthetic */ void a(eau eauVar, View view) {
        if (eauVar.f()) {
            this.d--;
        } else {
            this.d++;
        }
        LogUtil.a("ClaimMeasureDataAdapter", "mSelectStatus onClick ... dataBean.isChoose = ", Boolean.valueOf(eauVar.f()), ", mSize = ", Integer.valueOf(this.d));
        this.f27720a.selectItem(this.f27721b.size(), this.d);
        eauVar.a(!eauVar.f());
    }

    public void e(boolean z) {
        LogUtil.a("ClaimMeasureDataAdapter", "setAllChooseItem isAllSelect = ", Boolean.valueOf(z));
        Iterator<eau> it = this.f27721b.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
        if (z) {
            this.d = this.f27721b.size();
        } else {
            this.d = 0;
        }
        notifyDataSetChanged();
        this.f27720a.selectItem(this.f27721b.size(), this.d);
    }

    public ArrayList<eau> b() {
        ArrayList<eau> arrayList = new ArrayList<>(16);
        for (eau eauVar : this.f27721b) {
            if (eauVar.f()) {
                arrayList.add(eauVar);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27721b.size();
    }

    public void e() {
        ArrayList arrayList = new ArrayList(16);
        for (eau eauVar : this.f27721b) {
            if (!eauVar.f()) {
                arrayList.add(eauVar);
            }
        }
        this.f27721b = arrayList;
        this.d = 0;
        this.f27720a.selectItem(arrayList.size(), this.d);
        notifyDataSetChanged();
    }

    public int c() {
        return this.f27721b.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f27724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthCheckBox f27725c;
        HealthTextView d;
        HealthTextView e;

        public MyViewHolder(View view) {
            super(view);
            this.d = (HealthTextView) view.findViewById(R.id.tv_claim_weight_data_body_weight);
            this.e = (HealthTextView) view.findViewById(R.id.tv_claim_weight_data_measur_time);
            this.f27725c = (HealthCheckBox) view.findViewById(R.id.iv_claim_weight_data_select_status);
            this.f27724b = (HealthDivider) view.findViewById(R.id.view_claim_weight_data_line);
        }
    }
}
