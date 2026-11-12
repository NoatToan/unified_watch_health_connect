package com.xiaomi.fitness.devicesettings.base.clock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import com.xiaomi.fitness.widget.button.BaseSwitchButton;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import com.xiaomi.fitness.widget.button.SwitchButton;
import defpackage.eui;
import defpackage.jni;
import defpackage.ni4;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class a extends RecyclerView.Adapter<RecyclerView.d0> implements ISwitchButton.a, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<AlarmClockViewModel.AlarmClockList> f11943b;
    public AdapterView.OnItemClickListener e;
    public f h;
    public boolean c = false;
    public final List<AlarmSettingItem> d = new ArrayList();
    public e f = null;
    public g g = null;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.clock.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0439a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.d0 f11944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f11945b;

        public ViewOnClickListenerC0439a(RecyclerView.d0 d0Var, int i) {
            this.f11944a = d0Var;
            this.f11945b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.c || a.this.e == null) {
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = a.this.e;
            View view2 = this.f11944a.itemView;
            int i = this.f11945b;
            onItemClickListener.onItemClick(null, view2, i, i);
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f11946a;

        public b(View view) {
            super(view);
            this.f11946a = (TextView) view.findViewById(zqi.O0);
        }
    }

    public static class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f11947a;

        public c(View view) {
            super(view);
            this.f11947a = (TextView) view.findViewById(zqi.O0);
        }
    }

    public static class d extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f11948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f11949b;
        public SwitchButton c;
        public CheckBox d;
        public View e;

        public d(View view) {
            super(view);
            this.f11948a = (TextView) view.findViewById(zqi.N0);
            this.f11949b = (TextView) view.findViewById(zqi.I0);
            this.c = (SwitchButton) view.findViewById(zqi.L0);
            this.d = (CheckBox) view.findViewById(zqi.J0);
            this.e = view.findViewById(zqi.K0);
        }
    }

    public interface e {
        void a(boolean z);
    }

    public interface f {
        void a(ISwitchButton iSwitchButton, AlarmSettingItem alarmSettingItem, boolean z);
    }

    public interface g {
        void a(CompoundButton compoundButton, List<AlarmSettingItem> list);
    }

    public a(Context context, List<AlarmClockViewModel.AlarmClockList> list) {
        this.f11942a = context;
        this.f11943b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<AlarmClockViewModel.AlarmClockList> list = this.f11943b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f11943b.get(i).getViewType();
    }

    public List<AlarmSettingItem> getSelectItemList() {
        return this.d;
    }

    public List<AlarmSettingItem> l() {
        ArrayList arrayList = new ArrayList();
        for (AlarmClockViewModel.AlarmClockList alarmClockList : this.f11943b) {
            if (alarmClockList.getItem() != null) {
                arrayList.add(alarmClockList.getItem());
            }
        }
        return arrayList;
    }

    public final /* synthetic */ boolean m(RecyclerView.d0 d0Var, View view) {
        if (this.c) {
            return false;
        }
        this.c = true;
        this.d.add((AlarmSettingItem) d0Var.itemView.getTag());
        notifyDataSetChanged();
        e eVar = this.f;
        if (eVar != null) {
            eVar.a(true);
        }
        return true;
    }

    public void n(ISwitchButton iSwitchButton) {
        iSwitchButton.setOnCheckedChangeCallback(null);
        int iIntValue = ((Integer) iSwitchButton.getTag()).intValue();
        this.f11943b.get(iIntValue).getItem().setEnable(!iSwitchButton.isChecked());
        notifyItemChanged(iIntValue);
        iSwitchButton.setOnCheckedChangeCallback(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 d0Var, int i) {
        if (!(d0Var instanceof d)) {
            if (d0Var instanceof b) {
                ((b) d0Var).f11946a.setText(wzi.W5);
                return;
            } else {
                if (d0Var instanceof c) {
                    ((c) d0Var).f11947a.setText(wzi.l5);
                    return;
                }
                return;
            }
        }
        d dVar = (d) d0Var;
        AlarmSettingItem item = this.f11943b.get(i).getItem();
        if (item == null) {
            return;
        }
        dVar.itemView.setTag(item);
        dVar.itemView.setVisibility(0);
        dVar.f11948a.setText(item.getHM());
        dVar.f11949b.setText(String.format("%s | %s", item.getStringRepeatType(this.f11942a), item.getTimeString(this.f11942a)));
        if (this.c) {
            dVar.c.setVisibility(4);
            dVar.d.setVisibility(0);
            setCheckedNoEvent(dVar.d, this.d.contains(item), this);
        } else {
            dVar.d.setVisibility(8);
            dVar.c.setVisibility(0);
        }
        dVar.e.setVisibility(8);
        dVar.c.setTag(Integer.valueOf(i));
        dVar.d.setTag(item);
        BaseSwitchButton.j(dVar.c, item.isEnable(), this);
        dVar.itemView.setOnClickListener(new ViewOnClickListenerC0439a(d0Var, i));
        dVar.itemView.setBackground(ni4.e(this.f11942a, jni.R));
        dVar.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: v21
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f36401a.m(d0Var, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
    public void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
        int iIntValue = ((Integer) iSwitchButton.getTag()).intValue();
        AlarmSettingItem item = this.f11943b.get(iIntValue).getItem();
        item.setEnable(z);
        notifyItemChanged(iIntValue);
        f fVar = this.h;
        if (fVar != null) {
            fVar.a(iSwitchButton, item, z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new d(LayoutInflater.from(this.f11942a).inflate(eui.p1, viewGroup, false));
        }
        return i == 3 ? new b(LayoutInflater.from(this.f11942a).inflate(eui.q1, viewGroup, false)) : new c(LayoutInflater.from(this.f11942a).inflate(eui.q1, viewGroup, false));
    }

    public final void setCheckedNoEvent(CompoundButton compoundButton, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        compoundButton.setOnCheckedChangeListener(null);
        compoundButton.setChecked(z);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setEditMode(boolean z) {
        this.c = z;
        this.d.clear();
        notifyDataSetChanged();
    }

    public void setOnEditModeChageListener(e eVar) {
        this.f = eVar;
    }

    public void setOnItemCheckChangeLister(f fVar) {
        this.h = fVar;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.e = onItemClickListener;
    }

    public void setOnItemSelectListener(g gVar) {
        this.g = gVar;
    }

    public void setSelectAll(boolean z) {
        this.d.clear();
        if (z) {
            for (AlarmClockViewModel.AlarmClockList alarmClockList : this.f11943b) {
                if (alarmClockList.getViewType() == 1) {
                    this.d.add(alarmClockList.getItem());
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AlarmSettingItem alarmSettingItem = (AlarmSettingItem) compoundButton.getTag();
        if (z) {
            this.d.add(alarmSettingItem);
        } else {
            this.d.remove(alarmSettingItem);
        }
        g gVar = this.g;
        if (gVar != null) {
            gVar.a(compoundButton, this.d);
        }
    }
}
