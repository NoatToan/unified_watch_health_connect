package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwmenstrualmanager.bean.MenstrualSwitchStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.homeinterface.OnStartDragListener;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
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
public class FunctionSetCardManagementViewChineseAdapter extends RecyclerView.Adapter<FunctionSetCardManagementShowChineseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FunctionSetCardManagementActivity f25501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f25503c;
    private int d;
    private List<skw> e;
    private LayoutInflater i;
    private NoTitleCustomAlertDialog m;
    private OnStartDragListener n;
    private Vibrator s;
    private int t;
    private List<skw> o = new ArrayList(9);
    private List<skw> l = new ArrayList(9);
    private boolean j = true;
    private boolean h = true;
    private boolean f = false;
    private boolean g = false;
    private List<skw> k = new ArrayList();

    public void b(boolean z) {
        this.j = z;
        notifyDataSetChanged();
    }

    public boolean e() {
        return this.j;
    }

    static class c extends BaseHandler<FunctionSetCardManagementViewChineseAdapter> {
        public c(FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter) {
            super(functionSetCardManagementViewChineseAdapter);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter, Message message) {
            LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "handleMessageWhenReferenceNotNull()");
            if (functionSetCardManagementViewChineseAdapter == null || message == null) {
                LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "handleMessageWhenReferenceNotNull obj or msg == null !");
                return;
            }
            int i = message.what;
            if (i == 0) {
                Bundle data = message.getData();
                if (data != null) {
                    functionSetCardManagementViewChineseAdapter.i(data.getInt("position"));
                    return;
                } else {
                    ReleaseLogUtil.e("FunctionSetCardManagementViewChineseAdapter", "handleMessageWhenReferenceNotNull SHOW_MENSTRUAL_DIALOG bundle is null");
                    return;
                }
            }
            if (i == 1) {
                Bundle data2 = message.getData();
                if (data2 != null) {
                    functionSetCardManagementViewChineseAdapter.e(data2.getInt("position"));
                    return;
                } else {
                    ReleaseLogUtil.e("FunctionSetCardManagementViewChineseAdapter", "handleMessageWhenReferenceNotNull GET_MENSTRUAL_SWITCH_STATUS bundle is null");
                    return;
                }
            }
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "unknown msg");
        }
    }

    public FunctionSetCardManagementViewChineseAdapter(List<skw> list, Context context, OnStartDragListener onStartDragListener) {
        ArrayList arrayList = new ArrayList(list);
        this.e = arrayList;
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "mDataList: ", arrayList);
        this.f25502b = context;
        if (onStartDragListener instanceof FunctionSetCardManagementActivity) {
            this.f25501a = (FunctionSetCardManagementActivity) onStartDragListener;
        }
        this.n = onStartDragListener;
        this.i = LayoutInflater.from(context);
        this.f25503c = new c(this);
        g();
    }

    public void a(final ArrayList<skw> arrayList) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.3
                @Override // java.lang.Runnable
                public void run() {
                    FunctionSetCardManagementViewChineseAdapter.this.a(arrayList);
                }
            });
            return;
        }
        this.e.clear();
        this.e.addAll(arrayList);
        g();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FunctionSetCardManagementShowChineseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.i;
        if (layoutInflater == null) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "mLayoutInflater is null");
            return null;
        }
        return new FunctionSetCardManagementShowChineseViewHolder(layoutInflater.inflate(R.layout.function_set_management_view_card_delete_chinese, viewGroup, false), this.f25502b, false, this.n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FunctionSetCardManagementShowChineseViewHolder functionSetCardManagementShowChineseViewHolder, final int i) {
        List<skw> list;
        if (functionSetCardManagementShowChineseViewHolder == null || (list = this.o) == null) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "holder or mShowedDataList is null");
            return;
        }
        if (i < 0 || i >= list.size()) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "mShowedDataList position is wrong :", Integer.valueOf(i));
            return;
        }
        c(functionSetCardManagementShowChineseViewHolder.itemView, i);
        functionSetCardManagementShowChineseViewHolder.setIsRecyclable(false);
        LogUtil.d("FunctionSetCardManagementViewChineseAdapter", "ViewHolder cardName:", this.o.get(i).c(), "position", Integer.valueOf(i));
        functionSetCardManagementShowChineseViewHolder.d(this.o.get(i), this.j);
        d(functionSetCardManagementShowChineseViewHolder.c(), i);
        functionSetCardManagementShowChineseViewHolder.e().setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (FunctionSetCardManagementViewChineseAdapter.this.s == null) {
                    FunctionSetCardManagementViewChineseAdapter functionSetCardManagementViewChineseAdapter = FunctionSetCardManagementViewChineseAdapter.this;
                    functionSetCardManagementViewChineseAdapter.s = (Vibrator) functionSetCardManagementViewChineseAdapter.f25502b.getSystemService("vibrator");
                }
                if (FunctionSetCardManagementViewChineseAdapter.this.s != null) {
                    FunctionSetCardManagementViewChineseAdapter.this.s.vibrate(50L);
                }
                LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "shown card is long clicked, position: ", Integer.valueOf(i));
                if (FunctionSetCardManagementViewChineseAdapter.this.j) {
                    return false;
                }
                FunctionSetCardManagementViewChineseAdapter.this.f25501a.e(true);
                return false;
            }
        });
    }

    private void c(View view, int i) {
        if (view.getLayoutParams() instanceof RecyclerView.LayoutParams) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f25502b.getResources().getDimensionPixelSize(R.dimen.health_common_6dp);
            int dimensionPixelSize2 = this.f25502b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize3 = this.f25502b.getResources().getDimensionPixelSize(R.dimen.health_common_0dp);
            int dimensionPixelSize4 = this.f25502b.getResources().getDimensionPixelSize(R.dimen.health_common_6dp);
            if (qrs.ah(this.f25502b) || qrs.af(this.f25502b)) {
                int i2 = i % 4;
                if (i2 == 0) {
                    layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4);
                } else if (i2 == 3) {
                    layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize4);
                } else {
                    layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4);
                }
            } else if (i % 2 == 0) {
                layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4);
            } else {
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize4);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public void c(int i) {
        g();
        notifyDataSetChanged();
    }

    public void e(int i, int i2) {
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "fromPosition =", Integer.valueOf(i));
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "toPosition =", Integer.valueOf(i2));
        List<skw> list = this.o;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "mShowedDataList is null");
            return;
        }
        if (i < 0 || i >= list.size() || i2 < 0 || i2 >= this.o.size() || this.o.get(i).e() != 1 || this.o.get(i2).e() != 1 || i == i2) {
            return;
        }
        this.f = true;
        if (this.h) {
            this.k.clear();
            this.k.addAll(this.e);
            this.d = i;
            this.h = false;
        }
        this.t = i2;
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", this.e);
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", this.o);
        notifyItemMoved(i, i2);
    }

    public void a() {
        int i;
        int i2;
        if (!this.f) {
            LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "only long click, not move");
            return;
        }
        int i3 = 0;
        this.f = false;
        this.e.clear();
        int i4 = this.t;
        int i5 = this.d;
        if (i4 == i5) {
            this.e.addAll(this.k);
        } else if (i5 > i4) {
            while (i3 < this.t) {
                this.e.add(this.k.get(i3));
                i3++;
            }
            this.e.add(this.k.get(this.d));
            int i6 = this.t;
            while (true) {
                i2 = this.d;
                if (i6 >= i2) {
                    break;
                }
                this.e.add(this.k.get(i6));
                i6++;
            }
            for (int i7 = i2 + 1; i7 < this.k.size(); i7++) {
                this.e.add(this.k.get(i7));
            }
        } else {
            while (true) {
                i = this.d;
                if (i3 >= i) {
                    break;
                }
                this.e.add(this.k.get(i3));
                i3++;
            }
            for (int i8 = i + 1; i8 < this.t + 1; i8++) {
                this.e.add(this.k.get(i8));
            }
            this.e.add(this.k.get(this.d));
            for (int i9 = this.t + 1; i9 < this.k.size(); i9++) {
                this.e.add(this.k.get(i9));
            }
        }
        g();
        notifyDataSetChanged();
        this.f25501a.d(this.e);
        this.h = true;
        this.f25501a.e(this.d, this.t);
    }

    public void d(int i) {
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "onItemSwiped position = ", Integer.valueOf(i));
        this.o.remove(i);
        this.e.remove(i);
        notifyDataSetChanged();
    }

    private void d(View view, final int i) {
        if (njy.e(this.o, i)) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "setAddOnClick : position is out of bounds", Integer.valueOf(i));
        } else {
            lrd.a(view, qre.f(R.string.IDS_common_remove_text), (Class<?>) ImageView.class);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int i2 = i;
                    if (i2 >= 0 && i2 < FunctionSetCardManagementViewChineseAdapter.this.o.size()) {
                        FunctionSetCardManagementViewChineseAdapter.this.g(i);
                    } else {
                        LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "setDeleteOnClick : position is wrong :", Integer.valueOf(i));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        if (i < 0 || i >= this.o.size()) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "setItemDeleteStatus : position is wrong :", Integer.valueOf(i));
            return;
        }
        if (!this.f25502b.getResources().getString(R.string.IDS_physiological_cycle).equals(this.o.get(i).c())) {
            LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "setItemDeleteStatus position = ", Integer.valueOf(i));
            this.o.get(i).e(2);
            g();
            notifyDataSetChanged();
            this.f25501a.b(i, this.o.size() - 1);
            return;
        }
        b(i);
    }

    private void b(final int i) {
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "processPhysiologicalCycleCardDelete");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                String strJ = tfi.j(FunctionSetCardManagementViewChineseAdapter.this.f25502b);
                if (strJ == null) {
                    LogUtil.e("FunctionSetCardManagementViewChineseAdapter", "getMenstrualSwitch is null.");
                    FunctionSetCardManagementViewChineseAdapter.this.a(i);
                } else {
                    if ("".equals(strJ)) {
                        FunctionSetCardManagementViewChineseAdapter.this.f(i);
                        return;
                    }
                    try {
                        if (new JSONObject(strJ).getInt("masterSwitch") == 1 && FunctionSetCardManagementViewChineseAdapter.this.f25503c != null) {
                            FunctionSetCardManagementViewChineseAdapter.this.f(i);
                            return;
                        }
                    } catch (JSONException unused) {
                        LogUtil.e("FunctionSetCardManagementViewChineseAdapter", "setPhysicalCycleSwitch JSONException.");
                    }
                    FunctionSetCardManagementViewChineseAdapter.this.a(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        Message messageObtainMessage = this.f25503c.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        messageObtainMessage.what = 0;
        messageObtainMessage.setData(bundle);
        this.f25503c.sendMessage(messageObtainMessage);
    }

    private void b(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ArrayList arrayList = new ArrayList(5);
                    arrayList.add("masterSwitch");
                    arrayList.add("menstrualStartSwitch");
                    arrayList.add("menstrualEndSwitch");
                    arrayList.add("easyPregnancyStartSwitch");
                    arrayList.add("easyPregnancyEndSwitch");
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONObject.put((String) it.next(), 0);
                    }
                    HiUserPreference userPreference = HiHealthManager.d(FunctionSetCardManagementViewChineseAdapter.this.f25502b).getUserPreference("com.huawei.health.mc");
                    if (userPreference == null) {
                        ReleaseLogUtil.e("FunctionSetCardManagementViewChineseAdapter", "setPhysicalCycleSwitch userPreference is null");
                        return;
                    }
                    userPreference.setValue(jSONObject.toString());
                    userPreference.setSyncStatus(0);
                    HiHealthManager.d(FunctionSetCardManagementViewChineseAdapter.this.f25502b).setUserPreference(userPreference);
                } catch (JSONException unused) {
                    LogUtil.e("FunctionSetCardManagementViewChineseAdapter", "setPhysicalCycleSwitch JSONException.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final int i) {
        if (this.m == null) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f25502b);
            builder.a(this.f25502b.getResources().getString(R.string.IDS_physiological_cycle_hide_card_dialog_content)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            }).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.FunctionSetCardManagementViewChineseAdapter.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FunctionSetCardManagementViewChineseAdapter.this.g = true;
                    FunctionSetCardManagementViewChineseAdapter.this.e(i);
                }
            });
            this.m = builder.c();
        }
        if (this.m.isShowing()) {
            return;
        }
        this.m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        c cVar = this.f25503c;
        if (cVar == null) {
            ReleaseLogUtil.e("FunctionSetCardManagementViewChineseAdapter", "sendMessageRefreshCards mHandler is null");
            return;
        }
        Message messageObtainMessage = cVar.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        messageObtainMessage.what = 1;
        messageObtainMessage.setData(bundle);
        this.f25503c.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        skw skwVar;
        if (njy.c(this.o, i) && (skwVar = this.o.get(i)) != null) {
            skwVar.e(2);
        }
        g();
        notifyDataSetChanged();
        this.f25501a.b(i, this.o.size() - 1);
    }

    private void f() {
        MenstrualSwitchStatus menstrualSwitchStatus = new MenstrualSwitchStatus();
        menstrualSwitchStatus.setMasterSwitch(0);
        menstrualSwitchStatus.setMenstruationStartRemindSwitch(0);
        menstrualSwitchStatus.setMenstruationEndRemindSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyStartSwitch(0);
        menstrualSwitchStatus.setEasyPregnancyEndSwitch(0);
        sox.d().a(menstrualSwitchStatus);
    }

    private void g() {
        i();
        d();
        for (int i = 0; i < this.o.size(); i++) {
            this.o.get(i).c(i);
        }
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.l.get(i2).c(i2 + 1000);
        }
        Collections.sort(this.e);
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "mDataList: ", this.e);
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "mShowedDataList: ", this.o);
        LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "mNotShowedDataList: ", this.l);
    }

    private void i() {
        this.o.clear();
        List<skw> list = this.e;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "getShowedDataList : mDataList is null");
            return;
        }
        for (skw skwVar : list) {
            if (skwVar.e() == 1) {
                this.o.add(skwVar);
            }
        }
    }

    public void b() {
        if (this.g) {
            String strJ = tfi.j(this.f25502b);
            try {
                if (new JSONObject(strJ).getInt("masterSwitch") == 1) {
                    b(strJ);
                    f();
                    this.g = false;
                }
            } catch (JSONException unused) {
                LogUtil.a("FunctionSetCardManagementViewChineseAdapter", "parse fail");
            }
        }
    }

    private void d() {
        this.l.clear();
        List<skw> list = this.e;
        if (list == null) {
            LogUtil.j("FunctionSetCardManagementViewChineseAdapter", "getNotShowedDataList : mDataList is null");
            return;
        }
        for (skw skwVar : list) {
            if (skwVar.e() != 1) {
                this.l.add(skwVar);
            }
        }
    }

    public List<skw> c() {
        return this.e;
    }
}
