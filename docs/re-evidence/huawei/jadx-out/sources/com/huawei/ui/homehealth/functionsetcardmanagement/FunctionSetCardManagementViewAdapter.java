package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.homeinterface.OnStartDragListener;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qre;
import defpackage.skw;
import defpackage.sox;
import defpackage.tfi;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionSetCardManagementViewAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LayoutInflater f25490a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25492c;
    private List<skw> d;
    private NoTitleCustomAlertDialog e;
    private OnStartDragListener i;
    private List<skw> f = new ArrayList(9);
    private List<skw> g = new ArrayList(9);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f25491b = new d(this);

    static class d extends BaseHandler<FunctionSetCardManagementViewAdapter> {
        public d(FunctionSetCardManagementViewAdapter functionSetCardManagementViewAdapter) {
            super(functionSetCardManagementViewAdapter);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(FunctionSetCardManagementViewAdapter functionSetCardManagementViewAdapter, Message message) {
            LogUtil.a("FunctionSetCardManagementViewAdapter", "handleMessageWhenReferenceNotNull()");
            if (functionSetCardManagementViewAdapter == null || message == null) {
                LogUtil.a("FunctionSetCardManagementViewAdapter", "handleMessageWhenReferenceNotNull obj or msg == null !");
                return;
            }
            int i = message.what;
            if (i == 0) {
                Bundle data = message.getData();
                if (data == null) {
                    ReleaseLogUtil.e("FunctionSetCardManagementViewAdapter", "handleMessageWhenReferenceNotNull SHOW_MENSTRUAL_DIALOG bundle is null");
                    return;
                } else {
                    functionSetCardManagementViewAdapter.b(data.getString("switch_string"), data.getInt("position"));
                    return;
                }
            }
            if (i == 1) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    functionSetCardManagementViewAdapter.e(data2.getInt("position"));
                    return;
                } else {
                    ReleaseLogUtil.e("FunctionSetCardManagementViewAdapter", "handleMessageWhenReferenceNotNull GET_MENSTRUAL_SWITCH_STATUS bundle is null");
                    return;
                }
            }
            LogUtil.j("FunctionSetCardManagementViewAdapter", "unknown msg");
        }
    }

    public FunctionSetCardManagementViewAdapter(List<skw> list, Context context, OnStartDragListener onStartDragListener) {
        this.d = list;
        this.f25492c = context;
        this.i = onStartDragListener;
        this.f25490a = LayoutInflater.from(context);
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.f25490a;
        if (layoutInflater == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "mLayoutInflater is null");
            return null;
        }
        if (i == 1) {
            return new FunctionSetCardManagementViewHolder(layoutInflater.inflate(R.layout.function_set_management_view_card, viewGroup, false), this.f25492c, false, this.i);
        }
        if (i == 0) {
            return new FunctionSetCardManagementDeleteViewHolder(layoutInflater.inflate(R.layout.function_set_management_view_card_delete, viewGroup, false), this.f25492c, false);
        }
        LogUtil.j("FunctionSetCardManagementViewAdapter", "wrong view type");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<skw> list;
        if (viewHolder == null || (list = this.d) == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "holder or mDataList is null");
            return;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "position is wrong :", Integer.valueOf(i));
            return;
        }
        String strC = this.d.get(i).c();
        viewHolder.setIsRecyclable(false);
        if (viewHolder instanceof FunctionSetCardManagementViewHolder) {
            LogUtil.d("FunctionSetCardManagementViewAdapter", "ViewHolder cardName:", this.d.get(i).c(), "position", Integer.valueOf(i));
            FunctionSetCardManagementViewHolder functionSetCardManagementViewHolder = (FunctionSetCardManagementViewHolder) viewHolder;
            lrd.a(viewHolder.itemView, strC, (Class<?>) View.class);
            functionSetCardManagementViewHolder.d(this.d.get(i));
            if (i != getItemCount() - 1 && this.f.size() - 1 == i) {
                ((HealthDivider) functionSetCardManagementViewHolder.itemView.findViewById(R.id.itemDivider)).setVisibility(8);
            }
            c(functionSetCardManagementViewHolder.c(), i);
        }
        if (viewHolder instanceof FunctionSetCardManagementDeleteViewHolder) {
            LogUtil.d("FunctionSetCardManagementViewAdapter", "DeleteViewHolder cardName:", this.d.get(i).c(), "position", Integer.valueOf(i));
            FunctionSetCardManagementDeleteViewHolder functionSetCardManagementDeleteViewHolder = (FunctionSetCardManagementDeleteViewHolder) viewHolder;
            if (this.f.size() == 0 || this.f.size() != i) {
                functionSetCardManagementDeleteViewHolder.e().setVisibility(8);
            }
            lrd.a(viewHolder.itemView, strC, (Class<?>) View.class);
            functionSetCardManagementDeleteViewHolder.b(this.d.get(i));
            b(functionSetCardManagementDeleteViewHolder.b(), i);
        }
    }

    public void a(int i, int i2) {
        LogUtil.a("FunctionSetCardManagementViewAdapter", "fromPosition =", Integer.valueOf(i));
        LogUtil.a("FunctionSetCardManagementViewAdapter", "toPosition =", Integer.valueOf(i2));
        List<skw> list = this.d;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "mDataList is null");
            return;
        }
        if (i < 0 || i >= list.size() || i2 < 0 || i2 >= this.d.size() || this.d.get(i).e() != 1 || this.d.get(i2).e() != 1) {
            return;
        }
        int i3 = this.d.get(i).i();
        this.d.get(i).c(this.d.get(i2).i());
        this.d.get(i2).c(i3);
        if (i2 < getItemCount()) {
            Collections.swap(this.d, i, i2);
            notifyItemMoved(i, i2);
        }
    }

    public void d(int i) {
        LogUtil.a("FunctionSetCardManagementViewAdapter", "onItemSwiped position = ", Integer.valueOf(i));
        this.d.remove(i);
        notifyDataSetChanged();
    }

    private void c(View view, final int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "setDeleteOnClick : position is out of bounds", Integer.valueOf(i));
        } else {
            lrd.a(view, qre.f(R.string.IDS_common_remove_text), (Class<?>) ImageView.class);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int i2 = i;
                    if (i2 >= 0 && i2 < FunctionSetCardManagementViewAdapter.this.d.size()) {
                        FunctionSetCardManagementViewAdapter.this.j(i);
                    } else {
                        LogUtil.j("FunctionSetCardManagementViewAdapter", "setDeleteOnClick : position is wrong :", Integer.valueOf(i));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        if (i < 0 || i >= this.d.size()) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "setItemDeleteStatus : position is wrong :", Integer.valueOf(i));
            return;
        }
        if (!this.f25492c.getResources().getString(R.string.IDS_physiological_cycle).equals(this.d.get(i).c())) {
            LogUtil.a("FunctionSetCardManagementViewAdapter", "setItemDeleteStatus position = ", Integer.valueOf(i));
            this.d.get(i).e(2);
            c();
            notifyDataSetChanged();
            return;
        }
        a(i);
    }

    private void a(final int i) {
        LogUtil.a("FunctionSetCardManagementViewAdapter", "processPhysiologicalCycleCardDelete");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                String strJ = tfi.j(FunctionSetCardManagementViewAdapter.this.f25492c);
                if (strJ == null) {
                    LogUtil.e("FunctionSetCardManagementViewAdapter", "getMenstrualSwitch is null.");
                    FunctionSetCardManagementViewAdapter.this.b(i);
                } else {
                    if ("".equals(strJ)) {
                        FunctionSetCardManagementViewAdapter.this.a(i, strJ);
                        return;
                    }
                    try {
                        if (new JSONObject(strJ).getInt("masterSwitch") == 1 && FunctionSetCardManagementViewAdapter.this.f25491b != null) {
                            FunctionSetCardManagementViewAdapter.this.a(i, strJ);
                            return;
                        }
                    } catch (JSONException unused) {
                        LogUtil.e("FunctionSetCardManagementViewAdapter", "setPhysicalCycleSwitch JSONException.");
                    }
                    FunctionSetCardManagementViewAdapter.this.b(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        Message messageObtainMessage = this.f25491b.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        bundle.putString("switch_string", str);
        messageObtainMessage.what = 0;
        messageObtainMessage.setData(bundle);
        this.f25491b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    ArrayList arrayList = new ArrayList(5);
                    arrayList.add("masterSwitch");
                    arrayList.add("menstrualStartSwitch");
                    arrayList.add("menstrualEndSwitch");
                    arrayList.add("easyPregnancyStartSwitch");
                    arrayList.add("easyPregnancyEndSwitch");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONObject.put((String) it.next(), 0);
                    }
                    HiUserPreference userPreference = HiHealthManager.d(FunctionSetCardManagementViewAdapter.this.f25492c).getUserPreference("com.huawei.health.mc");
                    if (userPreference == null) {
                        ReleaseLogUtil.e("FunctionSetCardManagementViewAdapter", "setPhysicalCycleSwitch userPreference is null");
                        return;
                    }
                    userPreference.setValue(jSONObject.toString());
                    userPreference.setSyncStatus(0);
                    HiHealthManager.d(FunctionSetCardManagementViewAdapter.this.f25492c).setUserPreference(userPreference);
                } catch (JSONException unused) {
                    LogUtil.e("FunctionSetCardManagementViewAdapter", "setPhysicalCycleSwitch JSONException.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final int i) {
        if (this.e == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f25492c);
            builder.a(this.f25492c.getResources().getString(R.string.IDS_physiological_cycle_hide_card_dialog_content)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewAdapter.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FunctionSetCardManagementViewAdapter.this.e(str);
                    FunctionSetCardManagementViewAdapter.this.e();
                    FunctionSetCardManagementViewAdapter.this.e(i);
                }
            });
            this.e = builder.c();
        }
        if (this.e.isShowing()) {
            return;
        }
        this.e.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        d dVar = this.f25491b;
        if (dVar == null) {
            ReleaseLogUtil.e("FunctionSetCardManagementViewAdapter", "sendMessageRefreshCards mHandler is null");
            return;
        }
        Message messageObtainMessage = dVar.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        messageObtainMessage.what = 1;
        messageObtainMessage.setData(bundle);
        this.f25491b.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        skw skwVar;
        if (njy.c(this.d, i) && (skwVar = this.d.get(i)) != null) {
            skwVar.e(2);
        }
        c();
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        MenstrualSwitchStatus menstrualSwitchStatus = new MenstrualSwitchStatus();
        menstrualSwitchStatus.setMasterSwitch(0);
        menstrualSwitchStatus.setMenstruationStartRemindSwitch(0);
        menstrualSwitchStatus.setMenstruationEndRemindSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyStartSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyEndSwitch(0);
        sox.d().a(menstrualSwitchStatus);
    }

    private void b(View view, final int i) {
        if (njy.e(this.d, i)) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "setAddOnClick : position is out of bounds", Integer.valueOf(i));
        } else {
            lrd.a(view, qre.f(R.string.IDS_contact_add), (Class<?>) ImageView.class);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewAdapter.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int i2 = i;
                    if (i2 >= 0 && i2 < FunctionSetCardManagementViewAdapter.this.d.size()) {
                        FunctionSetCardManagementViewAdapter.this.c(i);
                    } else {
                        LogUtil.j("FunctionSetCardManagementViewAdapter", "setAddOnClick : position is wrong :", Integer.valueOf(i));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (i < 0 || i >= this.d.size()) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "setItemAddStatus : position is wrong :", Integer.valueOf(i));
            return;
        }
        LogUtil.a("FunctionSetCardManagementViewAdapter", "setItemAddStatus position = ", Integer.valueOf(i));
        this.d.get(i).e(1);
        c();
        notifyDataSetChanged();
    }

    private void c() {
        b();
        d();
        for (int i = 0; i < this.f.size(); i++) {
            this.f.get(i).c(i);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.g.get(i2).c(i2 + 1000);
        }
        Collections.sort(this.d);
    }

    private void b() {
        this.f.clear();
        List<skw> list = this.d;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "getShowedDataList : mDataList is null");
            return;
        }
        for (skw skwVar : list) {
            if (skwVar.e() == 1) {
                this.f.add(skwVar);
            }
        }
    }

    private void d() {
        this.g.clear();
        List<skw> list = this.d;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewAdapter", "getNotShowedDataList : mDataList is null");
            return;
        }
        for (skw skwVar : list) {
            if (skwVar.e() != 1) {
                this.g.add(skwVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        super.getItemViewType(i);
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i).e() == 1 ? 1 : 0;
        }
        LogUtil.j("FunctionSetCardManagementViewAdapter", "getItemViewType : position is wrong :", Integer.valueOf(i));
        return 1;
    }

    public List<skw> a() {
        return this.d;
    }
}
