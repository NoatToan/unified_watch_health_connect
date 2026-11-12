package com.huawei.health.device.wifi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.device.ui.measure.fragment.WiFiBodyFatScaleDataManagerFragment;
import com.huawei.health.device.wifi.interfaces.SelectClearUserInterface;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dyc;
import defpackage.dyg;
import defpackage.dyq;
import defpackage.eaq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class UserClearAdapter extends RecyclerView.Adapter<MyViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<eaq> f6447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f6449c;
    private String d;
    private SelectClearUserInterface e;

    static /* synthetic */ int d(UserClearAdapter userClearAdapter) {
        int i = userClearAdapter.f6448b;
        userClearAdapter.f6448b = i - 1;
        return i;
    }

    static /* synthetic */ int e(UserClearAdapter userClearAdapter) {
        int i = userClearAdapter.f6448b;
        userClearAdapter.f6448b = i + 1;
        return i;
    }

    public UserClearAdapter(List<eaq> list, Context context, SelectClearUserInterface selectClearUserInterface, String str) {
        this.f6447a = list;
        this.f6449c = context;
        this.e = selectClearUserInterface;
        this.d = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(this.f6449c).inflate(R.layout.item_wifi_user_clear, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        List<eaq> list;
        if (myViewHolder == null || (list = this.f6447a) == null) {
            dyg.a(false, "PluginDevice_UserClearAdapter", "holder or mClearBeanList is null");
            return;
        }
        final eaq eaqVar = list.get(i);
        if (eaqVar == null || eaqVar.d() == null) {
            dyg.a(false, "PluginDevice_UserClearAdapter", "bean is null");
            return;
        }
        if (i == this.f6447a.size() - 1) {
            myViewHolder.f6452b.setVisibility(8);
        } else {
            myViewHolder.f6452b.setVisibility(0);
        }
        WiFiBodyFatScaleDataManagerFragment.setUserNameAndPhoto(this.f6449c, eaqVar.d(), myViewHolder.d, myViewHolder.f6451a);
        if (eaqVar.b()) {
            myViewHolder.e.setChecked(true);
        } else {
            myViewHolder.e.setChecked(false);
        }
        myViewHolder.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.device.wifi.adapter.UserClearAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (eaqVar.b()) {
                    eaqVar.e(false);
                    UserClearAdapter.d(UserClearAdapter.this);
                    UserClearAdapter.this.e.selectItem(UserClearAdapter.this.f6447a.size(), UserClearAdapter.this.f6448b);
                } else {
                    eaqVar.e(true);
                    UserClearAdapter.e(UserClearAdapter.this);
                    UserClearAdapter.this.e.selectItem(UserClearAdapter.this.f6447a.size(), UserClearAdapter.this.f6448b);
                }
            }
        });
        double dE = eaqVar.e();
        if (dE <= 0.0d) {
            myViewHolder.f6453c.setText(this.f6449c.getResources().getString(R.string.IDS_device_wifi_no_record));
        } else {
            myViewHolder.f6453c.setText(dyc.b(dE, dyq.b(dE, this.d)));
        }
        this.e.selectItem(this.f6447a.size(), this.f6448b);
    }

    public void e() {
        List<eaq> list = this.f6447a;
        if (list == null) {
            dyg.a(false, "PluginDevice_UserClearAdapter", "setAllChooseItem mClearBeanList is null");
            return;
        }
        Iterator<eaq> it = list.iterator();
        while (it.hasNext()) {
            it.next().e(true);
            this.f6448b = this.f6447a.size();
        }
        notifyDataSetChanged();
        this.e.selectItem(this.f6447a.size(), this.f6448b);
    }

    public void d() {
        List<eaq> list = this.f6447a;
        if (list == null) {
            dyg.a(false, "PluginDevice_UserClearAdapter", "unsetAllChooseItem mClearBeanList is null");
            return;
        }
        Iterator<eaq> it = list.iterator();
        while (it.hasNext()) {
            it.next().e(false);
            this.f6448b = 0;
        }
        notifyDataSetChanged();
        this.e.selectItem(this.f6447a.size(), this.f6448b);
    }

    public ArrayList<eaq> a() {
        ArrayList<eaq> arrayList = new ArrayList<>(16);
        List<eaq> list = this.f6447a;
        if (list == null) {
            dyg.a(false, "PluginDevice_UserClearAdapter", "getChooseData mList is null");
            return arrayList;
        }
        for (eaq eaqVar : list) {
            if (eaqVar.b()) {
                arrayList.add(eaqVar);
            }
        }
        dyg.a(false, "PluginDevice_UserClearAdapter", "getChooseData data size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<eaq> list = this.f6447a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public ArrayList<eaq> b() {
        ArrayList<eaq> arrayList = new ArrayList<>(16);
        List<eaq> list = this.f6447a;
        if (list == null) {
            dyg.a(false, "PluginDevice_UserClearAdapter", "removeItem mList is null");
            return arrayList;
        }
        for (eaq eaqVar : list) {
            if (!eaqVar.b()) {
                arrayList.add(eaqVar);
            }
        }
        this.f6447a = arrayList;
        this.f6448b = 0;
        this.e.selectItem(arrayList.size(), this.f6448b);
        return arrayList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f6451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f6452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f6453c;
        HealthTextView d;
        HealthCheckBox e;

        public MyViewHolder(View view) {
            super(view);
            if (view == null) {
                dyg.a(false, "PluginDevice_UserClearAdapter", "MyViewHolder itemView is null");
                return;
            }
            this.d = (HealthTextView) view.findViewById(R.id.tv_user_clear_username);
            this.f6453c = (HealthTextView) view.findViewById(R.id.tv_user_clear_user_weight);
            this.e = (HealthCheckBox) view.findViewById(R.id.iv_user_clear_data_select_status);
            this.f6452b = (HealthDivider) view.findViewById(R.id.view_clear_user_data_line);
            this.f6451a = (ImageView) view.findViewById(R.id.item_user_clear_user_photo);
        }
    }
}
