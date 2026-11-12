package com.huawei.health.health.bloodpressure.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dfl;
import defpackage.dfp;
import defpackage.njy;
import defpackage.qpx;
import health.compact.a.LanguageUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class BloodPressureTargetAdapter extends RecyclerView.Adapter<Holder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<dfl, Boolean> f7054b;
    private OnItemClickListener d;
    private List<dfl> e;
    private final WeakReference<Activity> g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7055c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7053a = BaseApplication.b();

    public interface OnItemClickListener<T> {
        void onItemClick(View view, int i);
    }

    public BloodPressureTargetAdapter(Activity activity, List<dfl> list) {
        this.g = new WeakReference<>(activity);
        this.e = list;
        this.e = b(list);
        e();
    }

    public void c(dfl dflVar) {
        LogUtil.a("BloodPressureTargetAdapter", "sort from Add");
        if (d(dflVar) && this.e.size() + 1 <= 10) {
            this.e.add(dflVar);
            this.e = b(this.e);
            e();
            notifyDataSetChanged();
        }
    }

    public void b(dfl dflVar, int i) {
        LogUtil.a("BloodPressureTargetAdapter", "sort from Update, position: ", Integer.valueOf(i));
        if (e(dflVar, i)) {
            this.e.remove(i);
            this.e.add(dflVar);
            this.e = b(this.e);
            e();
            notifyDataSetChanged();
        }
    }

    public void d(int i) {
        LogUtil.a("BloodPressureTargetAdapter", "sort from remove, position: ", Integer.valueOf(i));
        this.e.remove(i);
        this.e = b(this.e);
        notifyDataSetChanged();
    }

    public void a() {
        for (Map.Entry<dfl, Boolean> entry : this.f7054b.entrySet()) {
            if (entry.getValue().booleanValue()) {
                this.e.remove(entry.getKey());
            }
        }
        this.e = b(this.e);
        e();
        notifyDataSetChanged();
    }

    private boolean d(dfl dflVar) {
        if (njy.e(this.e)) {
            return true;
        }
        if (dflVar.compareTo(this.e.get(0)) < 0) {
            return a(-1);
        }
        List<dfl> list = this.e;
        if (dflVar.compareTo(list.get(list.size() - 1)) > 0) {
            return a(1);
        }
        int iB = b(dflVar);
        Iterator<dfl> it = this.e.iterator();
        while (it.hasNext()) {
            int iB2 = b(it.next());
            LogUtil.a("BloodPressureTargetAdapter", "newTime:", Integer.valueOf(iB), "temp:", Integer.valueOf(iB2));
            int i = iB - iB2;
            if (Math.abs(i) < 45 || Math.abs(i) > 1395) {
                return a(0);
            }
        }
        return true;
    }

    private boolean e(dfl dflVar, int i) {
        if (i == 0 && dflVar.compareTo(this.e.get(1)) > 0) {
            return a(-1);
        }
        if (i == this.e.size() - 1) {
            List<dfl> list = this.e;
            if (dflVar.compareTo(list.get(list.size() - 2)) < 0) {
                return a(1);
            }
        }
        if (i != 0 && i != this.e.size() - 1) {
            if (dflVar.compareTo(this.e.get(0)) < 0) {
                return a(-1);
            }
            List<dfl> list2 = this.e;
            if (dflVar.compareTo(list2.get(list2.size() - 1)) > 0) {
                return a(1);
            }
        }
        int iB = b(dflVar);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            int iB2 = b(this.e.get(i2));
            LogUtil.a("BloodPressureTargetAdapter", "newTime:", Integer.valueOf(iB), "temp:", Integer.valueOf(iB2));
            if (i2 != i) {
                int i3 = iB - iB2;
                if (Math.abs(i3) < 45 || Math.abs(i3) > 1395) {
                    return a(0);
                }
            }
        }
        return true;
    }

    private boolean a(int i) {
        if (i == -1) {
            Context context = this.f7053a;
            qpx.e(context, context.getString(R.string.IDS_blood_pressure_wake_up_toast));
            return false;
        }
        if (i == 0) {
            Context context2 = this.f7053a;
            qpx.b(context2, context2.getString(R.string.IDS_blood_pressure_customize_toast, 45));
            return false;
        }
        if (i == 1) {
            Context context3 = this.f7053a;
            qpx.e(context3, context3.getString(R.string.IDS_blood_pressure_before_sleep_toast));
            return false;
        }
        LogUtil.j("BloodPressureTargetAdapter", "undefined type, type : ", Integer.valueOf(i));
        return false;
    }

    private int b(dfl dflVar) {
        return (dflVar.c() * 60) + dflVar.e();
    }

    public void b() {
        e();
    }

    private void e() {
        this.f7054b = new HashMap(this.e.size());
        for (int i = 0; i < this.e.size(); i++) {
            this.f7054b.put(this.e.get(i), false);
        }
    }

    private List<dfl> b(List<dfl> list) {
        Collections.sort(list, dfp.e());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i == this.e.size() - 1) {
                arrayList.add(new dfl(9, this.e.get(i).c(), this.e.get(i).e(), 9));
            } else {
                arrayList.add(new dfl(i, this.e.get(i).c(), this.e.get(i).e(), i));
            }
        }
        return arrayList;
    }

    public void b(int i, boolean z) {
        c(i, z, 0);
    }

    public void c(int i, boolean z, final int i2) {
        LogUtil.a("BloodPressureTargetAdapter", "daysOfWeek:", Integer.valueOf(i), ", isEnabled:", Boolean.valueOf(z), ",saveType:", Integer.valueOf(i2));
        for (dfl dflVar : this.e) {
            dflVar.b(i);
            dflVar.b(z);
        }
        dfp.c(this.e, z, new ResponseCallback() { // from class: exv
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                this.f33657a.e(i2, i3, (List) obj);
            }
        });
    }

    public /* synthetic */ void e(int i, int i2, List list) {
        LogUtil.a("BloodPressureTargetAdapter", "savePlans code ", Integer.valueOf(i2), " data ", list);
        if (i2 == -1) {
            LogUtil.j("BloodPressureTargetAdapter", "updateAllAlarm failed");
        }
        if (i == 1) {
            return;
        }
        Activity activity = this.g.get();
        if (activity == null) {
            LogUtil.j("BloodPressureTargetAdapter", "savePlans activity is null");
        } else {
            activity.finish();
        }
    }

    public void c(int i) {
        this.f7055c = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Holder(LayoutInflater.from(viewGroup.getContext()).inflate(com.huawei.health.servicesui.R.layout.item_blood_pressure_target_complete, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final Holder holder, int i) {
        int i2;
        dfl dflVar = this.e.get(i);
        if (dflVar == null) {
            return;
        }
        LogUtil.a("BloodPressureTargetAdapter", dflVar.toString());
        holder.f7056a.setVisibility(8);
        holder.d.setVisibility(0);
        holder.f.setVisibility(0);
        holder.e.setVisibility(8);
        holder.f7057b.setText(dfp.e(dflVar));
        holder.g.setText(dfp.a(dflVar.c(), dflVar.e()));
        ImageView imageView = holder.j;
        if (LanguageUtil.ba(this.f7053a)) {
            i2 = R.drawable.common_ui_arrow_left;
        } else {
            i2 = R.drawable.common_ui_arrow_right;
        }
        imageView.setImageResource(i2);
        if (dflVar.d() == 0) {
            holder.e.setText(this.f7053a.getString(com.huawei.health.servicesui.R.string.IDS_blood_pressure_customize_title_desc1, 1));
            holder.e.setVisibility(8);
        }
        if (dflVar.d() != 9 && dflVar.d() != 0) {
            holder.f.setVisibility(8);
            if (this.f7055c == 1) {
                holder.f7056a.setVisibility(0);
            }
        }
        holder.f7056a.setOnCheckedChangeListener(null);
        if (holder.f7058c != null && this.d != null) {
            holder.f7058c.setOnClickListener(new View.OnClickListener() { // from class: exx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33658c.e(holder, view);
                }
            });
        }
        holder.f7056a.setChecked(this.f7054b.get(dflVar).booleanValue());
    }

    public /* synthetic */ void e(Holder holder, View view) {
        this.d.onItemClick(view, holder.getLayoutPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<dfl> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthCheckBox f7056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConstraintLayout f7058c;
        private HealthDivider d;
        private HealthTextView e;
        private HealthTextView f;
        private HealthTextView g;
        private ImageView j;

        public Holder(View view) {
            super(view);
            e();
        }

        private void e() {
            this.f7057b = (HealthTextView) this.itemView.findViewById(com.huawei.health.servicesui.R.id.plan_name);
            this.f = (HealthTextView) this.itemView.findViewById(com.huawei.health.servicesui.R.id.plan_necessity);
            this.e = (HealthTextView) this.itemView.findViewById(com.huawei.health.servicesui.R.id.plan_desc);
            this.g = (HealthTextView) this.itemView.findViewById(com.huawei.health.servicesui.R.id.plan_time);
            this.j = (ImageView) this.itemView.findViewById(com.huawei.health.servicesui.R.id.time_arrow);
            this.d = (HealthDivider) this.itemView.findViewById(com.huawei.health.servicesui.R.id.item_divider);
            this.f7056a = (HealthCheckBox) this.itemView.findViewById(com.huawei.health.servicesui.R.id.checkbox);
            this.f7058c = (ConstraintLayout) this.itemView.findViewById(com.huawei.health.servicesui.R.id.item_blood_pressure_target_layout);
        }
    }

    public void e(OnItemClickListener onItemClickListener) {
        this.d = onItemClickListener;
    }

    public List<dfl> d() {
        return this.e;
    }

    public void e(int i) {
        if (i != 0 && i != this.e.size() - 1) {
            this.f7054b.put(this.e.get(i), Boolean.valueOf(!this.f7054b.get(this.e.get(i)).booleanValue()));
        }
        notifyDataSetChanged();
    }
}
