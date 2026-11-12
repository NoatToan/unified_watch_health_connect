package com.huawei.ui.main.stories.health.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.WeightBodyDataActivity;
import defpackage.dnb;
import defpackage.dne;
import defpackage.dnj;
import defpackage.exz;
import defpackage.iov;
import defpackage.jhl;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.uwc;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdy;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class WeightBodyIndexRecycleAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dnb f27788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<uwc> f27789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f27790c;
    private final Context d;
    private CustomTextAlertDialog e;
    private ArrayList<String> f;
    private boolean g;
    private byte h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private final Resources m;
    private ArrayList<String> n;
    private boolean o;
    private dnj q;
    private int t;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    public WeightBodyIndexRecycleAdapter(Context context, List<uwc> list, dnb dnbVar, boolean z) {
        this(context, list, dnbVar, z, false);
    }

    public WeightBodyIndexRecycleAdapter(Context context, List<uwc> list, dnb dnbVar, boolean z, boolean z2) {
        this.q = MultiUsersManager.INSTANCE.getCurrentUser();
        this.k = true;
        this.f27789b = new ArrayList(16);
        this.f = new ArrayList<>();
        this.n = new ArrayList<>();
        Context contextB = BaseApplication.b();
        this.f27790c = contextB;
        this.m = contextB.getResources();
        this.d = context;
        this.g = z;
        this.o = z2;
        this.f27789b.clear();
        this.f27789b.addAll(list);
        this.f27788a = dnbVar;
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "WeightBodyIndexRecycleAdapter mBean is null");
            return;
        }
        a();
        if (this.f27788a.c() > 0 && this.f27788a.r() > 0) {
            this.h = dne.a(this.f27788a.an());
        } else {
            d();
        }
    }

    private void d() {
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: uso
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f50518a.a(i, (dnj) obj);
            }
        });
    }

    public /* synthetic */ void a(final int i, final dnj dnjVar) {
        Context context = this.d;
        if (!(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "asyncGetUser mActivity instanceof Activity false");
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: usp
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(dnjVar, i);
                }
            });
        }
    }

    public /* synthetic */ void c(dnj dnjVar, int i) {
        if (dnjVar == null || i != 0) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "asyncGetUser user is null or errorCode not success");
            this.q = MultiUsersManager.INSTANCE.getCurrentUser();
        } else {
            this.q = dnjVar;
        }
        dnj dnjVar2 = this.q;
        if (dnjVar2 == null) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "asyncGetUser mUser is null");
        } else {
            this.h = dne.a(dnjVar2.d());
            notifyDataSetChanged();
        }
    }

    public void a(dnb dnbVar) {
        this.f27788a = dnbVar;
        a();
    }

    public void a(List<uwc> list) {
        this.f27789b.clear();
        if (list.size() <= 3) {
            this.k = false;
        } else {
            this.k = true;
        }
        this.f.clear();
        this.n.clear();
        this.f27789b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.f27790c).inflate(R.layout.body_index_detail_recycle_items, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        e eVar = (e) viewHolder;
        if (njy.e(this.f27789b, i)) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "onBindViewHolder is out of bounds");
            return;
        }
        uwc uwcVar = this.f27789b.get(i);
        if (uwcVar == null) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "onBindViewHolder item is null");
            return;
        }
        int iA = uwcVar.a();
        if ((LanguageUtil.c(this.f27790c) || LanguageUtil.aj(this.f27790c)) && iA == 5) {
            eVar.f27794a.findViewById(R.id.body_index_recycle_data_layout).setLayoutDirection(0);
        }
        b(eVar, i);
        eVar.i.setText(this.m.getString(uwcVar.e()));
        eVar.d.setText(uwcVar.b());
        boolean z = true;
        boolean z2 = iA == 12 && !uwcVar.g();
        boolean z3 = iA == 13 || iA == 27;
        if (iA != 29 && iA != 28) {
            z = false;
        }
        if (z2 || z3 || z) {
            eVar.e.setVisibility(8);
            eVar.g.setTypeface(Typeface.create(Constants.FONT, 0));
        } else {
            eVar.e.setVisibility(0);
        }
        eVar.g.setText(uwcVar.c());
        if ((iA == 27 || iA == 25) && this.o) {
            eVar.f27796c.setVisibility(0);
        } else {
            eVar.f27796c.setVisibility(8);
        }
        c(eVar, uwcVar, iA);
    }

    private void b(e eVar, final int i) {
        eVar.f27794a.setOnClickListener(new View.OnClickListener() { // from class: usq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50521b.e(i, view);
            }
        });
    }

    public /* synthetic */ void e(int i, View view) {
        if (njy.e(this.f27789b, i)) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "clickItemView is out of bounds");
            return;
        }
        uwc uwcVar = this.f27789b.get(i);
        if (uwcVar == null) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "clickItemView item is null");
            return;
        }
        if (uwcVar.a() == 12 && !uwcVar.g()) {
            e();
            return;
        }
        if (this.f27788a == null) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "clickItemView mBean is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(uwcVar.a()));
        lmf.d().c(this.f27790c, AnalyticsValue.WEIGHT_PAGE_CLICK_DATA_DETAIL_2160113.value(), map, 0);
        LogUtil.a("HealthWeight_WeightBodyIndexRecycleAdapter", "clickItemView() mIsGuestMeasure = ", Boolean.valueOf(this.j));
        Intent intent = new Intent(this.f27790c, (Class<?>) WeightBodyDataActivity.class);
        intent.putExtra("isWeight", false);
        intent.putExtra("position", i);
        intent.putExtra("WeightBean", this.f27788a);
        intent.putExtra("start_time", this.l);
        intent.putExtra("start_type", this.t);
        intent.putExtra("is_show_change", this.i);
        intent.putExtra("isGuestMeasure", this.j);
        iov.d(this.d, intent);
    }

    private void e() {
        final dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.d);
        builder.e(this.m.getString(R.string.IDS_hw_pressure_adjust)).a(this.m.getString(R.string.IDS_device_wifi_pressure_calibrate_guide_dialog_msg, currentUser.h())).b(this.m.getString(R.string.IDS_hw_pressure_adjust), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.WeightBodyIndexRecycleAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                vdy.e(WeightBodyIndexRecycleAdapter.this.d, currentUser.i());
            }
        }).a(this.m.getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.adapter.WeightBodyIndexRecycleAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        if (this.e == null) {
            this.e = builder.b();
        }
        CustomTextAlertDialog customTextAlertDialog = this.e;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.setCanceledOnTouchOutside(false);
            if (this.e.isShowing()) {
                return;
            }
            this.e.show();
        }
    }

    private void c(e eVar, uwc uwcVar, int i) {
        double d = uwcVar.d();
        if (i == 2) {
            int iB = exz.b(d, Utils.o(), this.h, this.f27788a.c());
            eVar.f27795b.setTextColor(vdc.e(iB));
            eVar.f27795b.setText(vcz.d(0, iB));
            c("BMI", iB);
        } else if (i != 9) {
            switch (i) {
                case 11:
                    int iA = exz.a(d);
                    eVar.f27795b.setTextColor(vdc.e(iA));
                    eVar.f27795b.setText(vcz.h(0, iA));
                    c(ObserveLabels.HEART_RATE, iA);
                    break;
                case 12:
                    int iD = exz.d(d);
                    eVar.f27795b.setTextColor(vdc.j(iD));
                    eVar.f27795b.setText(vcz.g(0, iD));
                    c("PRESSURE_INDEX", iD);
                    break;
                default:
                    switch (i) {
                        case 25:
                            int iC = exz.c(this.h, d);
                            eVar.f27795b.setTextColor(vdc.f(iC));
                            eVar.f27795b.setText(vcz.n(0, iC));
                            if (iC == 2) {
                                this.f.add("WAIST_HIP_RATIO");
                            }
                            break;
                        case 26:
                            int iC2 = exz.c(this.h, d, this.f27788a.c());
                            eVar.f27795b.setTextColor(vdc.e(iC2));
                            eVar.f27795b.setText(vcz.o(0, iC2));
                            eVar.g.setText(uwcVar.c());
                            c("RASM", iC2);
                            break;
                        case 27:
                            break;
                        default:
                            if (this.f27788a != null) {
                                d(eVar.f27795b, eVar.g, i, (int) this.f27788a.getDoubleOrIntLevelByType(i));
                            }
                            break;
                    }
                case 13:
                    eVar.d.setText(uwcVar.b());
                    eVar.d.setTextSize(0, this.m.getDimensionPixelSize(R.dimen.health_common_16dp));
                    eVar.d.setPadding(0, jhl.c(this.f27790c, 4.0f), 0, 0);
                    eVar.g.setText("");
                    eVar.f27795b.setText("");
                    eVar.d.setAutoTextInfo(10, 1, 0);
                    break;
            }
        } else {
            c(eVar, d);
            eVar.f27795b.setText("");
        }
        c(eVar.f27795b, i);
    }

    private void d(HealthTextView healthTextView, HealthTextView healthTextView2, int i, int i2) {
        if (i == 1) {
            healthTextView.setTextColor(vdc.e(i2));
            healthTextView.setText(vcz.i(0, i2));
            c("BODY_FAT", i2);
            return;
        }
        if (i == 10) {
            healthTextView.setTextColor(vdc.e(i2));
            healthTextView.setText(vcz.m(0, i2));
            c("SKELETAL_MUSCLE", i2);
            return;
        }
        if (i == 14) {
            healthTextView.setTextColor(vdc.e(i2));
            healthTextView.setText(vcz.e(0, i2));
            c("FAT_FREE", i2);
            return;
        }
        switch (i) {
            case 3:
                healthTextView.setTextColor(vdc.e(i2));
                healthTextView.setText(vcz.l(0, i2));
                c("WATER_RATE", i2);
                break;
            case 4:
                healthTextView2.setAutoTextInfo(10, 1, 0);
                healthTextView.setTextColor(vdc.e(i2));
                healthTextView.setText(vcz.b(0, i2));
                c("METABOLISM", i2);
                break;
            case 5:
                healthTextView.setTextColor(vdc.h(i2));
                healthTextView.setText(vcz.k(0, i2));
                c("VISCERAL_FAT", i2);
                break;
            case 6:
                healthTextView.setTextColor(vdc.e(i2));
                healthTextView.setText(vcz.j(0, i2));
                c("MUSCLE", i2);
                break;
            case 7:
                healthTextView.setTextColor(vdc.e(i2));
                healthTextView.setText(vcz.a(0, i2));
                c("BONE", i2);
                break;
            case 8:
                healthTextView.setTextColor(vdc.e(i2));
                healthTextView.setText(vcz.f(0, i2));
                c("PROTEIN", i2);
                break;
            default:
                LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "initCardItemForOther default type ", Integer.valueOf(i));
                break;
        }
    }

    private void c(HealthTextView healthTextView, int i) {
        if (i == 13 || i == 27 || i == 9) {
            healthTextView.setVisibility(4);
        } else {
            healthTextView.setVisibility(0);
        }
        if (!this.g || i == 2 || i == 11) {
            return;
        }
        healthTextView.setVisibility(4);
    }

    private void c(String str, int i) {
        if (this.k) {
            if (i > 2) {
                this.f.add(str);
            }
            if (i < 2) {
                this.n.add(str);
            }
        }
    }

    private void c(e eVar, double d) {
        int i;
        if (d > 0.0d) {
            int i2 = (int) d;
            String strE = UnitUtil.e(i2, 1, 0);
            SpannableString spannableString = new SpannableString(this.m.getQuantityString(R.plurals.IDS_hw_show_bodyage_unit_years_old, i2, strE));
            int length = spannableString.length();
            int length2 = strE.length();
            if (length2 > length) {
                LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "judgeBodyYear ageLength is error");
                length2 = length;
            }
            int iIndexOf = spannableString.toString().indexOf(strE);
            int i3 = iIndexOf + length2;
            int i4 = 12;
            if (LanguageUtil.aj(this.f27790c)) {
                iIndexOf = length - length2;
                i3 = length;
                i4 = 10;
                i = 12;
            } else {
                i = 18;
            }
            spannableString.setSpan(new AbsoluteSizeSpan(i4, true), 0, length, 17);
            if (iIndexOf != -1) {
                spannableString.setSpan(new AbsoluteSizeSpan(i, true), iIndexOf, i3, 17);
            }
            eVar.d.setText(spannableString);
            return;
        }
        eVar.d.setText("--");
    }

    private void a() {
        if (this.f27788a == null) {
            this.i = false;
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "getBodyTypeData mBean is null");
            return;
        }
        this.i = false;
        this.t = 0;
        dnj dnjVar = this.q;
        final String strI = dnjVar == null ? null : dnjVar.i();
        final int iD = vei.d(this.f27788a);
        final long jAx = this.f27788a.ax();
        ThreadPoolManager.c().execute(new Runnable() { // from class: usn
            @Override // java.lang.Runnable
            public final void run() {
                this.f50517c.e(strI, jAx, iD);
            }
        });
    }

    public /* synthetic */ void e(String str, long j, int i) {
        long jAx;
        int iD;
        ArrayList<dnb> arrayListE = vei.e(str, j, this.q, this.g);
        if (arrayListE.size() <= 1) {
            return;
        }
        int size = arrayListE.size() - 1;
        dnb dnbVar = arrayListE.get(size);
        if (lsl.g(dnbVar.ax(), j)) {
            return;
        }
        while (true) {
            if (size >= 0) {
                if (!lsl.g(dnbVar.ax(), arrayListE.get(size).ax())) {
                    if (arrayListE.get(size).ax() == j && dnbVar.r() > 0) {
                        iD = vei.d(dnbVar);
                        jAx = dnbVar.ax();
                        break;
                    }
                    break;
                }
                size--;
            }
            jAx = 0;
            iD = 0;
            i = 0;
            break;
        }
        a(iD, iD != i, jAx);
    }

    private void a(final int i, final boolean z, final long j) {
        Context context = this.d;
        if (!(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightBodyIndexRecycleAdapter", "updateBodyTypeChange mActivity is not Activity");
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: usm
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(i, z, j);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, boolean z, long j) {
        this.t = i;
        this.i = z;
        this.l = j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f27789b.size();
    }

    public void d(boolean z) {
        this.j = z;
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f27794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f27795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthImageView f27796c;
        private final HealthTextView d;
        private final View e;
        private final HealthTextView g;
        private final HealthTextView i;

        e(View view) {
            super(view);
            this.f27794a = view;
            this.i = (HealthTextView) view.findViewById(R.id.body_index_recycle_title);
            this.d = (HealthTextView) view.findViewById(R.id.body_index_recycle_value);
            this.g = (HealthTextView) view.findViewById(R.id.body_index_recycle_unit);
            this.f27795b = (HealthTextView) view.findViewById(R.id.body_index_recycle_level);
            this.e = view.findViewById(R.id.body_index_recycle_margin_view);
            this.f27796c = (HealthImageView) view.findViewById(R.id.body_index_tips_icon);
        }
    }
}
