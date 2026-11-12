package com.huawei.healthcloud.plugintrack.bolt;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.FadingRecyclerView;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.up.model.UserInfomation;
import defpackage.een;
import defpackage.ivo;
import defpackage.jaq;
import defpackage.jxk;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qrk;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class BoltCustomDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f10429a;
    private ImageView aa;
    private ImageView ab;
    private ImageView ac;
    private ImageView ad;
    private ImageView ae;
    private ImageView af;
    private ImageView ag;
    private ImageView ah;
    private ImageView ai;
    private ImageView aj;
    private ImageView ak;
    private ImageView al;
    private ImageView am;
    private ImageView an;
    private ImageView ao;
    private ImageView ap;
    private ImageView aq;
    private ImageView ar;
    private ImageView as;
    private LinearLayout at;
    private NoTitleCustomAlertDialog au;
    private LinearLayout av;
    private LinearLayout aw;
    private CustomViewDialog ax;
    private Context ay;
    private List<ivo.d> az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ivo.d> f10430b;
    private List<ivo.d> ba;
    private List<ivo.d> bb;
    private int bc;
    private jaq bd;
    private HealthProgressBar be;
    private int bf;
    private HealthTextView bg;
    private HealthButton bh;
    private List<ivo.d> bi;
    private View bj;
    private HealthTextView bk;
    private View bl;
    private View bm;
    private FadingRecyclerView bn;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f10431c;
    private CustomViewDialog d;
    private HealthTextView e;
    private List<ivo.d> f;
    private int g;
    private CustomViewDialog h;
    private HealthButton i;
    private Context j;
    private boolean k;
    private boolean l;
    private FadingRecyclerView m;
    private int n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private ImageView r;
    private ImageView s;
    private ImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private ImageView y;
    private ImageView z;

    public interface OnConfirmCallBack {
        void confirmCallBack();
    }

    private BoltCustomDialog() {
        this.g = 0;
        this.n = -1;
        this.l = true;
    }

    public static BoltCustomDialog c() {
        return d.e;
    }

    public boolean e() {
        return this.l;
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void c(Context context, int i) {
        CustomViewDialog customViewDialog = this.ax;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            LogUtil.j("Track_BoltCustomDialog", "showBoltNoPositionDialog:mNoWearingDialog is showing");
            return;
        }
        if (context == null) {
            LogUtil.j("Track_BoltCustomDialog", "showBoltNoPositionDialog : context is null");
            return;
        }
        this.j = context;
        this.bf = i;
        View viewInflate = View.inflate(context, R.layout.dialog_bolt_no_wearing_position, null);
        this.bl = viewInflate;
        jxk.e(this.ay, (HealthTextView) viewInflate.findViewById(R.id.tv_no_wear_tips), R.color.textColorPrimary);
        CustomViewDialog.Builder builderE = new CustomViewDialog.Builder(context).c(this.ay).e(true);
        builderE.d(this.bl).d(R.string.IDS_settings_button_nps_ok, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BoltCustomDialog.this.ax.dismiss();
            }
        });
        CustomViewDialog customViewDialogD = builderE.d();
        this.ax = customViewDialogD;
        customViewDialogD.show();
    }

    public void d(Context context, int i, OnConfirmCallBack onConfirmCallBack, int i2) {
        b(context, context, i, onConfirmCallBack, i2);
    }

    public void b(Context context, Context context2, int i, OnConfirmCallBack onConfirmCallBack, int i2) {
        LogUtil.a("Track_BoltCustomDialog", "showBoltDeviceListDialog context ", context, " resourcesContext ", context2, " sportType ", Integer.valueOf(i), " sportStatus ", Integer.valueOf(i2));
        CustomViewDialog customViewDialog = this.h;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            this.h.dismiss();
        }
        if (context == null) {
            LogUtil.j("Track_BoltCustomDialog", "showBoltDeviceListDialog: context is null!");
            return;
        }
        this.j = context;
        if (context2 == null) {
            context2 = context;
        }
        this.ay = context2;
        this.bf = i;
        this.bc = i2;
        o();
        i();
        h();
        a(false);
        d(context, onConfirmCallBack);
    }

    public void c(Context context, int i, int i2, OnConfirmCallBack onConfirmCallBack) {
        if (context == null) {
            LogUtil.j("Track_BoltCustomDialog", "showBoltConnectDialog: context is null!");
            return;
        }
        CustomViewDialog customViewDialog = this.d;
        if (customViewDialog != null && customViewDialog.isShowing()) {
            LogUtil.a("Track_BoltCustomDialog", "mBoltConnectTipDialog is showing");
            return;
        }
        if (a()) {
            onConfirmCallBack.confirmCallBack();
            return;
        }
        this.j = context;
        this.k = false;
        View viewC = c(i, i2, onConfirmCallBack);
        CustomViewDialog.Builder builderE = new CustomViewDialog.Builder(this.j).c(this.ay).e(true);
        builderE.d(viewC).b(false);
        CustomViewDialog customViewDialogD = builderE.d();
        this.d = customViewDialogD;
        customViewDialogD.show();
    }

    private View c(final int i, final int i2, final OnConfirmCallBack onConfirmCallBack) {
        View viewInflate = View.inflate(this.j, R.layout.dialog_bolt_connect_check, null);
        ((HealthTextView) viewInflate.findViewById(R.id.bolt_connect_text)).setText(this.j.getResources().getString(R.string.IDS_bolt_connect_tip, een.b(554, BaseApplication.getContext(), BaseApplication.getContext().getPackageName())));
        b(viewInflate);
        HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.bolt_btn_connect);
        healthButton.setText(this.j.getResources().getString(R.string.IDS_tips_connect_go));
        HealthButton healthButton2 = (HealthButton) viewInflate.findViewById(R.id.bolt_btn_start);
        healthButton2.setText(this.j.getResources().getString(R.string.IDS_bolt_start));
        healthButton2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_BoltCustomDialog", "ignore connect, start sport");
                if (onConfirmCallBack == null) {
                    LogUtil.j("Track_BoltCustomDialog", "setDialogTitleAndShow : callBack is null");
                    return;
                }
                BoltCustomDialog.this.m();
                onConfirmCallBack.confirmCallBack();
                BoltCustomDialog boltCustomDialog = BoltCustomDialog.this;
                boltCustomDialog.b(boltCustomDialog.d);
            }
        });
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_BoltCustomDialog", "start bolt connect");
                BoltCustomDialog.this.m();
                if (i2 == 1) {
                    BoltCustomDialog boltCustomDialog = BoltCustomDialog.this;
                    boltCustomDialog.c(boltCustomDialog.j, i);
                } else {
                    BoltCustomDialog boltCustomDialog2 = BoltCustomDialog.this;
                    boltCustomDialog2.d(boltCustomDialog2.j, i, onConfirmCallBack, 0);
                }
                BoltCustomDialog boltCustomDialog3 = BoltCustomDialog.this;
                boltCustomDialog3.b(boltCustomDialog3.d);
            }
        });
        return viewInflate;
    }

    private void b(View view) {
        HealthCheckBox healthCheckBox = (HealthCheckBox) view.findViewById(R.id.bolt_collect_checkbox);
        String strG = g();
        if (TextUtils.isEmpty(strG) || e(strG) < 2) {
            healthCheckBox.setText(this.j.getString(R.string.IDS_bolt_no_remind_thirty, 30));
        } else {
            healthCheckBox.setText(this.j.getString(R.string.IDS_not_remind));
        }
        healthCheckBox.setChecked(this.k);
        healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BoltCustomDialog.this.k = z;
            }
        });
    }

    public boolean a() {
        String strG = g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if (e(strG) >= 3) {
            LogUtil.a("Track_BoltCustomDialog", "The bolt connect tip ignore 3 times.");
            return true;
        }
        if (System.currentTimeMillis() >= qrk.c(d(strG), 30)) {
            return false;
        }
        LogUtil.a("Track_BoltCustomDialog", "The bolt connect tip ignore less than 30 days.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        String str;
        if (this.k) {
            String strG = g();
            String string = Long.toString(System.currentTimeMillis());
            if (TextUtils.isEmpty(strG)) {
                str = "1#" + string;
            } else {
                str = (e(strG) + 1) + "#" + string;
            }
            this.bd.a(str);
            LogUtil.a("Track_BoltCustomDialog", "Do not show bolt connect tips from ", str);
        }
    }

    private String g() {
        if (this.bd == null) {
            this.bd = ivo.c();
        }
        return this.bd.k();
    }

    private int e(String str) {
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length > 0) {
            return CommonUtil.n(this.j, strArrSplit[0]);
        }
        return 0;
    }

    private long d(String str) {
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length > 1) {
            return CommonUtil.i(strArrSplit[1]);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(BaseDialog baseDialog) {
        if (baseDialog == null || !baseDialog.isShowing()) {
            return;
        }
        baseDialog.dismiss();
    }

    private void i() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            this.n = 1;
        } else {
            UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
            if (userInfo != null) {
                this.n = userInfo.getGenderOrDefaultValue();
            } else {
                LogUtil.j("Track_BoltCustomDialog", "getUserGender : userInfomation is null");
                this.n = 1;
            }
        }
        LogUtil.a("Track_BoltCustomDialog", "initData : mGenderOrDefaultValue =", Integer.valueOf(this.n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.a("Track_BoltCustomDialog", "setBoltCustomDialogData with DeviceStatusInvoked is ", Boolean.valueOf(z));
        a(this.bf);
        n();
        j();
        b(z);
    }

    private void b(boolean z) {
        if (SportSupportUtil.a(this.bf)) {
            a(this.bi, this.f);
            a(this.j, this.bi, this.f, this.bc, z);
        }
        if (this.bf == 259) {
            a(this.f10430b, this.f);
            b(this.j, this.f10430b, this.f, this.bc, z);
        }
    }

    private void n() {
        if (this.bf == 259) {
            this.o.setVisibility(8);
            this.at.setVisibility(0);
            this.bk.setText(this.j.getResources().getString(R.string.IDS_bolt_wear_bike_spoke));
            k();
        }
        if (SportSupportUtil.a(this.bf)) {
            this.at.setVisibility(8);
            this.o.setVisibility(0);
            this.bk.setText(this.j.getResources().getString(R.string.IDS_bolt_wear_waist));
        }
    }

    private void a(Context context, List<ivo.d> list, List<ivo.d> list2, int i, boolean z) {
        LogUtil.a("Track_BoltCustomDialog", "setRunSportDialog");
        if (njy.e(list) && njy.e(list2)) {
            b();
            if (z) {
                return;
            }
            c(this.j, this.bf);
            return;
        }
        b(list, 1, i);
        b(list2, 0, i);
        c(this.ba, this.bb);
        d(context, list, list2, i);
    }

    private void b(Context context, List<ivo.d> list, List<ivo.d> list2, int i, boolean z) {
        LogUtil.a("Track_BoltCustomDialog", "setBikeSportDialog");
        if (njy.e(list) && njy.e(list2)) {
            b();
            if (z) {
                return;
            }
            c(this.j, this.bf);
            return;
        }
        b(list, 2, i);
        b(list2, 0, i);
        e(this.az, this.bb);
        a(context, i);
    }

    private void a(List<ivo.d> list, List<ivo.d> list2) {
        if (!njy.e(list) && list.size() <= 2) {
            this.bn.setSpanPixel(0);
        }
        if (njy.e(list2) || list2.size() > 2) {
            return;
        }
        this.m.setSpanPixel(0);
    }

    private void c(List<ivo.d> list, List<ivo.d> list2) {
        LogUtil.a("Track_BoltCustomDialog", "showRunLineOnDialog");
        int size = !njy.e(list) ? list.size() : 0;
        int size2 = !njy.e(list2) ? list2.size() : 0;
        if (size2 == 0 && size > 0) {
            this.aw.setVisibility(8);
            this.av.setVisibility(0);
            this.bm.setVisibility(0);
            c(size);
        }
        if (size2 > 0 && size == 0) {
            this.aw.setVisibility(0);
            this.av.setVisibility(8);
            this.bm.setVisibility(0);
            e(size2);
        }
        if (size2 <= 0 || size <= 0) {
            return;
        }
        f(size2, size);
        this.bm.setVisibility(8);
    }

    private void c(int i) {
        if (i == 1) {
            if (this.n == 0) {
                this.z.setVisibility(0);
                return;
            } else {
                this.an.setVisibility(0);
                return;
            }
        }
        if (i == 2) {
            if (this.n == 0) {
                this.aa.setVisibility(0);
                return;
            } else {
                this.an.setVisibility(0);
                return;
            }
        }
        if (this.n == 0) {
            this.ad.setVisibility(0);
        } else {
            this.am.setVisibility(0);
        }
    }

    private void e(int i) {
        if (i == 1) {
            if (this.n == 0) {
                this.x.setVisibility(0);
                return;
            } else {
                this.ak.setVisibility(0);
                return;
            }
        }
        if (i == 2) {
            if (this.n == 0) {
                this.ab.setVisibility(0);
                return;
            } else {
                this.ak.setVisibility(0);
                return;
            }
        }
        if (this.n == 0) {
            this.u.setVisibility(0);
        } else {
            this.aj.setVisibility(0);
        }
    }

    private void f(int i, int i2) {
        e(i, i2);
        i(i, i2);
        b(i, i2);
    }

    private void b(int i, int i2) {
        if (i2 >= 3 && i == 1) {
            if (this.n == 0) {
                this.ai.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.as.setVisibility(0);
                this.ap.setVisibility(0);
            }
        }
        if (i2 >= 3 && i == 2) {
            if (this.n == 0) {
                this.ai.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.as.setVisibility(0);
                this.ap.setVisibility(0);
            }
        }
        if (i2 < 3 || i < 3) {
            return;
        }
        if (this.n == 0) {
            this.ac.setVisibility(0);
            this.ag.setVisibility(0);
        } else {
            this.al.setVisibility(0);
            this.aq.setVisibility(0);
        }
    }

    private void i(int i, int i2) {
        if (i2 == 2 && i == 1) {
            if (this.n == 0) {
                this.ai.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.as.setVisibility(0);
                this.ap.setVisibility(0);
            }
        }
        if (i2 == 2 && i == 2) {
            if (this.n == 0) {
                this.ai.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.as.setVisibility(0);
                this.ap.setVisibility(0);
            }
        }
        if (i2 != 2 || i < 3) {
            return;
        }
        if (this.n == 0) {
            this.ai.setVisibility(0);
            this.ah.setVisibility(0);
        } else {
            this.as.setVisibility(0);
            this.ap.setVisibility(0);
        }
    }

    private void e(int i, int i2) {
        if (i2 == 1 && i == 1) {
            if (this.n == 0) {
                this.ai.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.as.setVisibility(0);
                this.ap.setVisibility(0);
            }
        }
        if (i2 == 1 && i == 2) {
            if (this.n == 0) {
                this.ai.setVisibility(0);
                this.ah.setVisibility(0);
            } else {
                this.as.setVisibility(0);
                this.ap.setVisibility(0);
            }
        }
        if (i2 != 1 || i < 3) {
            return;
        }
        if (this.n == 0) {
            this.ai.setVisibility(0);
            this.ah.setVisibility(0);
        } else {
            this.as.setVisibility(0);
            this.ap.setVisibility(0);
        }
    }

    private void e(List<ivo.d> list, List<ivo.d> list2) {
        LogUtil.a("Track_BoltCustomDialog", "showBikeLineOnDialog");
        int size = !njy.e(list) ? list.size() : 0;
        int size2 = !njy.e(list2) ? list2.size() : 0;
        if (size > 0 && size2 == 0) {
            this.t.setVisibility(0);
        }
        if (size == 0 && size2 > 0) {
            this.s.setVisibility(0);
        }
        a(size, size2);
        c(size, size2);
        d(size, size2);
    }

    private void d(int i, int i2) {
        if (i >= 3 && i2 == 1) {
            this.q.setVisibility(0);
            this.y.setVisibility(0);
        }
        if (i >= 3 && i2 == 2) {
            this.q.setVisibility(0);
            this.y.setVisibility(0);
        }
        if (i < 3 || i2 < 3) {
            return;
        }
        this.p.setVisibility(0);
        this.v.setVisibility(0);
    }

    private void c(int i, int i2) {
        if (i == 2 && i2 == 1) {
            this.q.setVisibility(0);
            this.y.setVisibility(0);
        }
        if (i == 2 && i2 == 2) {
            this.q.setVisibility(0);
            this.y.setVisibility(0);
        }
        if (i != 2 || i2 < 3) {
            return;
        }
        this.q.setVisibility(0);
        this.y.setVisibility(0);
    }

    private void a(int i, int i2) {
        if (i == 1 && i2 == 1) {
            this.q.setVisibility(0);
            this.y.setVisibility(0);
        }
        if (i == 1 && i2 == 2) {
            this.q.setVisibility(0);
            this.y.setVisibility(0);
        }
        if (i != 1 || i2 < 3) {
            return;
        }
        this.q.setVisibility(0);
        this.y.setVisibility(0);
    }

    private List<ivo.d> e(List<ivo.d> list, int i, int i2) {
        String strW;
        if (i != 0) {
            strW = "";
        } else {
            strW = this.bd.u();
        }
        if (i == 1) {
            strW = this.bd.z();
        }
        if (i == 2) {
            strW = this.bd.w();
        }
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("Track_BoltCustomDialog", "getShowBoltList() : boltList is empty.");
            return arrayList;
        }
        LogUtil.a("Track_BoltCustomDialog", "getShowBoltList : Extract from the SP boltDeviceIdentifyFormSp = ", CommonUtil.n(strW), "; wearingPosition = ", Integer.valueOf(i));
        boolean z = false;
        for (int i3 = 0; i3 < list.size(); i3++) {
            ivo.d dVar = list.get(i3);
            if (dVar.e().getDeviceIdentify().equals(strW)) {
                dVar.d(true);
                arrayList.add(dVar);
                z = true;
            } else {
                dVar.d(false);
            }
        }
        LogUtil.a("Track_BoltCustomDialog", "getShowBoltList:isSpIdentifyInCurrentBlots = ", Boolean.valueOf(z));
        if (!z) {
            list.get(0).d(true);
            a(list.get(0).e().getDeviceIdentify(), i);
            arrayList.add(list.get(0));
        }
        return (i2 != 1 && i2 == 0) ? list : arrayList;
    }

    private void a(int i) {
        LogUtil.a("Track_BoltCustomDialog", "initData");
        this.g = 0;
        this.bf = i;
        this.bd = ivo.c();
        Map<Integer, List<ivo.d>> mapC = ivo.a().c(ivo.a().e(false), false);
        this.bi = mapC.get(1);
        this.f = mapC.get(0);
        this.f10430b = mapC.get(2);
    }

    public void d() {
        List<ivo.d> listE = e(ivo.a().e(false));
        LogUtil.a("Track_BoltCustomDialog", "showLowTemperatureDialog list size is ", Integer.valueOf(listE.size()));
        if (njy.b(listE)) {
            b(listE);
        }
    }

    private List<ivo.d> e(List<ivo.d> list) {
        ArrayList arrayList = new ArrayList(16);
        for (ivo.d dVar : list) {
            if (dVar != null && dVar.d() == 3) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    private void o() {
        ivo.a().b("Track_BoltCustomDialog", new IBaseResponseCallback() { // from class: ivp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f38105a.c(i, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("Track_BoltCustomDialog", "registerBoltConnectionStatusListener : onResponse errorCode = ", Integer.valueOf(i), "; objData = ", obj);
        this.l = false;
        a(true);
    }

    private void d(Context context, final OnConfirmCallBack onConfirmCallBack) {
        this.bg.setText(BaseApplication.getContext().getString(R.string.IDS_bolt_dialog_title));
        if (qqs.e(this.ay)) {
            this.bh.setBackground(qqf.c(context.getDrawable(R.drawable.bolt_dialog_refresh), context.getResources().getColor(R.color.healthTintColorPrimaryDark)));
        } else {
            this.bh.setBackgroundResource(R.drawable.bolt_dialog_refresh);
        }
        this.bh.setVisibility(0);
        this.bh.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_BoltCustomDialog", "RightTopButton onClick");
                BoltCustomDialog.this.bh.setVisibility(8);
                BoltCustomDialog.this.be.setVisibility(0);
                ivo.a().e(true);
                BoltCustomDialog.this.bg.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.3.5
                    @Override // java.lang.Runnable
                    public void run() {
                        BoltCustomDialog.this.be.setVisibility(8);
                        BoltCustomDialog.this.bh.setVisibility(0);
                        BoltCustomDialog.this.a(false);
                    }
                }, ProfileExtendConstants.TIME_OUT);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_BoltCustomDialog", "mConfirmBtn onClick");
                BoltCustomDialog.this.h.dismiss();
                ivo.a().a("Track_BoltCustomDialog");
                OnConfirmCallBack onConfirmCallBack2 = onConfirmCallBack;
                if (onConfirmCallBack2 == null) {
                    LogUtil.j("Track_BoltCustomDialog", "setDialogTitleAndShow : callBack is null");
                } else {
                    onConfirmCallBack2.confirmCallBack();
                }
            }
        });
        CustomViewDialog.Builder builderE = new CustomViewDialog.Builder(context).c(this.ay).e(true);
        builderE.b(this.bj, 0, 0).b(false);
        if (this.bc == 1) {
            this.bh.setVisibility(8);
        }
        CustomViewDialog customViewDialogD = builderE.d();
        this.h = customViewDialogD;
        customViewDialogD.show();
    }

    public void b() {
        CustomViewDialog customViewDialog = this.h;
        if (customViewDialog == null || !customViewDialog.isShowing()) {
            return;
        }
        this.h.dismiss();
    }

    private void d(Context context, List<ivo.d> list, List<ivo.d> list2, int i) {
        LogUtil.a("Track_BoltCustomDialog", "setRunDialogTips");
        b(i);
        this.e.setText(context.getResources().getString(R.string.IDS_bolt_dialog_device, 1, 1));
        if (this.g == 1 || (list2.size() == 1 && list.size() == 1)) {
            this.e.setText(context.getResources().getString(R.string.IDS_bolt_dialog_device_list));
        }
        if (this.g <= 1 || list2.size() == 1 || list.size() == 1) {
            return;
        }
        this.e.setText(context.getResources().getString(R.string.IDS_bolt_dialog_device, 1, 1));
    }

    private void b(int i) {
        if (i == 1) {
            this.e.setVisibility(8);
        }
        if (i == 0) {
            this.e.setVisibility(0);
        }
    }

    private void a(Context context, int i) {
        LogUtil.a("Track_BoltCustomDialog", "setBikeDialogTips");
        b(i);
        this.e.setText(context.getResources().getString(R.string.IDS_bolt_dialog_device_list));
    }

    private void b(List<ivo.d> list, final int i, int i2) {
        LogUtil.a("Track_BoltCustomDialog", "enter setBoltList()");
        if (njy.e(list)) {
            LogUtil.j("Track_BoltCustomDialog", "setBoltList is empty; wearingPosition = ", Integer.valueOf(i));
            d(i);
            return;
        }
        final List<ivo.d> listE = e(list, i, i2);
        a(list, i, i2);
        final BoltDeviceInfoAdapter boltDeviceInfoAdapter = new BoltDeviceInfoAdapter(this.ay, listE, this.j);
        if (i == 1 || i == 2) {
            this.av.setVisibility(0);
            this.bn.setAdapter(boltDeviceInfoAdapter);
            this.g += list.size();
        }
        if (i == 0) {
            this.aw.setVisibility(0);
            this.m.setAdapter(boltDeviceInfoAdapter);
            this.g += list.size();
        }
        boltDeviceInfoAdapter.b(new BoltDeviceInfoAdapter.OnItemClickListener() { // from class: ivn
            @Override // com.huawei.healthcloud.plugintrack.bolt.BoltDeviceInfoAdapter.OnItemClickListener
            public final void onItemClick(int i3) {
                this.f38095a.d(listE, boltDeviceInfoAdapter, i, i3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(List list, BoltDeviceInfoAdapter boltDeviceInfoAdapter, int i, int i2) {
        LogUtil.a("Track_BoltCustomDialog", "boltAdapter.setOnItemClickListener position: ", Integer.valueOf(i2));
        if (njy.e(list, i2)) {
            LogUtil.j("Track_BoltCustomDialog", "setBoltList showBoltList outOfBounds");
        } else {
            d(i2, boltDeviceInfoAdapter, list, (ivo.d) list.get(i2), i);
        }
    }

    private void b(final List<ivo.d> list) {
        LogUtil.a("Track_BoltCustomDialog", " buildLowTemperatureDialog enter ");
        ivo.d dVar = list.get(0);
        if (dVar == null) {
            LogUtil.e("Track_BoltCustomDialog", "buildLowTemperatureDialog boltDeviceInfo is null");
            return;
        }
        if (dVar.e().getDeviceConnectState() != 2) {
            LogUtil.a("Track_BoltCustomDialog", " buildLowTemperatureDialog getDeviceConnectState has disconnected ");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.au;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.a("Track_BoltCustomDialog", " buildLowTemperatureDialog isShowing ");
            return;
        }
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e("Track_BoltCustomDialog", "buildLowTemperatureDialog context is null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(activityJ).b(this.ay).a(true);
        builderA.a(String.format(Locale.ROOT, activityJ.getString(R.string.IDS_bolt_low_temperature_battery_tip), een.b(554, activityJ, activityJ.getPackageName()))).a(R.string.sug_dialog_yes, new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_BoltCustomDialog", " buildLowTemperatureDialog click.");
                ivo.a().c(list);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        this.au = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.au.show();
    }

    private void d(int i) {
        if (i == 0) {
            if (!njy.e(this.bb)) {
                this.bb.clear();
            }
            this.aw.setVisibility(8);
        }
        if (i == 1) {
            if (!njy.e(this.ba)) {
                this.ba.clear();
            }
            this.av.setVisibility(8);
        }
        if (i == 2) {
            if (!njy.e(this.az)) {
                this.az.clear();
            }
            this.av.setVisibility(8);
        }
    }

    private void a(List<ivo.d> list, int i, int i2) {
        if (i == 0) {
            this.bb = e(list, i, i2);
        }
        if (i == 1) {
            this.ba = e(list, i, i2);
        }
        if (i == 2) {
            this.az = e(list, i, i2);
        }
    }

    private void a(String str, int i) {
        if (this.bd == null) {
            this.bd = ivo.c();
        }
        if (i == 2) {
            this.bd.m(str);
            LogUtil.a("Track_BoltCustomDialog", "saveWearPositionIdentify : save bike identify = ", CommonUtil.n(str));
        }
        if (i == 1) {
            this.bd.n(str);
            LogUtil.a("Track_BoltCustomDialog", "saveWearPositionIdentify : save waist identify = ", CommonUtil.n(str));
        }
        if (i == 0) {
            this.bd.l(str);
            LogUtil.a("Track_BoltCustomDialog", "saveWearPositionIdentify : save foot identify = ", CommonUtil.n(str));
        }
    }

    private void d(int i, BoltDeviceInfoAdapter boltDeviceInfoAdapter, List<ivo.d> list, ivo.d dVar, int i2) {
        if (njy.e(list)) {
            LogUtil.j("Track_BoltCustomDialog", "setBoltListCheckedStatus boltDeviceList is null");
            return;
        }
        int deviceConnectState = dVar.e().getDeviceConnectState();
        LogUtil.a("Track_BoltCustomDialog", "setBoltListCheckedStatus : deviceConnectState = ", Integer.valueOf(deviceConnectState));
        if (deviceConnectState == 2) {
            LogUtil.a("Track_BoltCustomDialog", "setBoltListCheckedStatus : DEVICE_CONNECTED");
            a(i, list);
            a(dVar.e().getDeviceIdentify(), i2);
            ivo.a(dVar.e());
        }
        if (deviceConnectState == 1) {
            LogUtil.a("Track_BoltCustomDialog", "setBoltListCheckedStatus DEVICE_CONNECTING");
        }
        if (deviceConnectState == 3 || deviceConnectState == 4) {
            LogUtil.a("Track_BoltCustomDialog", "setBoltListCheckedStatus : DEVICE_DISCONNECTED");
            String deviceIdentify = dVar.e().getDeviceIdentify();
            ivo.a().c(deviceIdentify);
            if (this.bd == null) {
                this.bd = ivo.c();
            }
            this.bd.j(deviceIdentify);
            d(i, list);
        }
        boltDeviceInfoAdapter.notifyDataSetChanged();
    }

    private void d(int i, List<ivo.d> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ivo.d dVar = list.get(i2);
            if (i2 == i) {
                dVar.c(true);
            } else {
                dVar.c(false);
            }
        }
    }

    private void a(int i, List<ivo.d> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ivo.d dVar = list.get(i2);
            if (i2 == i) {
                dVar.d(true);
            } else {
                dVar.d(false);
            }
        }
    }

    private void c(Context context) {
        if (this.n == 0) {
            this.o.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_bolt_man));
        } else {
            this.o.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_bolt_women));
        }
    }

    private void h() {
        View viewInflate = View.inflate(this.j, R.layout.dialog_bolt_device_list, null);
        this.bj = viewInflate;
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.bolt_dialog_title);
        this.bg = healthTextView;
        jxk.e(this.ay, healthTextView, R.color.textColorPrimary);
        this.be = (HealthProgressBar) this.bj.findViewById(R.id.bolt_dialog_title_loading);
        this.bh = (HealthButton) this.bj.findViewById(R.id.bolt_dialog_title_refresh_btn);
        HealthButton healthButton = (HealthButton) this.bj.findViewById(R.id.bolt_confirm_btn);
        this.i = healthButton;
        jxk.c(this.ay, healthButton, R.drawable.dialog_button_background);
        View viewFindViewById = this.bj.findViewById(R.id.view_list_Placeholder);
        this.bm = viewFindViewById;
        viewFindViewById.setVisibility(8);
        HealthTextView healthTextView2 = (HealthTextView) this.bj.findViewById(R.id.tv_header_waist);
        this.bk = healthTextView2;
        jxk.e(this.ay, healthTextView2, R.color.emui_color_text_secondary);
        jxk.e(this.ay, (HealthTextView) this.bj.findViewById(R.id.tv_header_foot), R.color.emui_color_text_secondary);
        e(this.j);
        f();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        FadingRecyclerView fadingRecyclerView = (FadingRecyclerView) this.bj.findViewById(R.id.bolt_waist_recycler_view);
        this.bn = fadingRecyclerView;
        fadingRecyclerView.addItemDecoration(new RecyclerItemDecoration(1, this.j.getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalM), arrayList));
        this.bn.setLayoutManager(new LinearLayoutManager(this.j));
        FadingRecyclerView fadingRecyclerView2 = (FadingRecyclerView) this.bj.findViewById(R.id.bolt_foot_recycler_view);
        this.m = fadingRecyclerView2;
        fadingRecyclerView2.addItemDecoration(new RecyclerItemDecoration(1, this.j.getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalM), arrayList));
        this.m.setLayoutManager(new LinearLayoutManager(this.j));
    }

    private void f() {
        this.at = (LinearLayout) this.bj.findViewById(R.id.ll_bolt_bike_images);
        ImageView imageView = (ImageView) this.bj.findViewById(R.id.bolt_bike_spokes);
        this.f10429a = imageView;
        jxk.b(this.ay, imageView, R.drawable.ic_bolt_bike);
        ImageView imageView2 = (ImageView) this.bj.findViewById(R.id.bolt_bike_foot);
        this.f10431c = imageView2;
        jxk.b(this.ay, imageView2, R.drawable.ic_bolt_foot);
        this.t = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_1_bike);
        this.s = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_1_foot);
        this.y = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_2_1_1_foot);
        this.q = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_2_1_1_bike);
        this.r = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_2_2_2_bike_2);
        this.w = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_2_2_2_foot_2);
        this.p = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_2_3_3_bike);
        this.v = (ImageView) this.bj.findViewById(R.id.ic_bolt_bike_2_3_3_foot);
    }

    private void e(Context context) {
        this.o = (ImageView) this.bj.findViewById(R.id.bolt_man_women);
        c(context);
        HealthTextView healthTextView = (HealthTextView) this.bj.findViewById(R.id.bolt_wearing_tips);
        this.e = healthTextView;
        jxk.e(this.ay, healthTextView, R.color.textColorSecondary);
        this.av = (LinearLayout) this.bj.findViewById(R.id.ll_waist);
        this.aw = (LinearLayout) this.bj.findViewById(R.id.ll_foot);
        this.ai = (ImageView) this.bj.findViewById(R.id.ic_bolt_2_foot_1);
        this.ah = (ImageView) this.bj.findViewById(R.id.ic_bolt_2_waist_1);
        this.ae = (ImageView) this.bj.findViewById(R.id.ic_bolt_man_2_2_2_foot);
        this.af = (ImageView) this.bj.findViewById(R.id.ic_bolt_man_2_2_2_waist);
        this.ac = (ImageView) this.bj.findViewById(R.id.ic_bolt_man_2_3_3_foot);
        this.ag = (ImageView) this.bj.findViewById(R.id.ic_bolt_man_2_3_3_waist);
        this.x = (ImageView) this.bj.findViewById(R.id.ic_bolt_1_foot_1);
        this.ab = (ImageView) this.bj.findViewById(R.id.ic_bolt_1_foot_2_1);
        this.u = (ImageView) this.bj.findViewById(R.id.ic_bolt_1_foot_3);
        this.z = (ImageView) this.bj.findViewById(R.id.ic_bolt_1_waist_1);
        this.aa = (ImageView) this.bj.findViewById(R.id.ic_bolt_1_waist_2_1);
        this.ad = (ImageView) this.bj.findViewById(R.id.ic_bolt_1_waist_3);
        this.an = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_1_waist_1);
        this.am = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_1_waist_3);
        this.ak = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_1_foot_1);
        this.aj = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_1_foot_3);
        this.as = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_2_1_1_foot);
        this.ap = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_2_1_1_waist);
        this.ao = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_2_2_2_foot);
        this.ar = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_2_2_2_waist);
        this.al = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_2_3_3_foot);
        this.aq = (ImageView) this.bj.findViewById(R.id.ic_bolt_women_2_3_3_waist);
    }

    private void j() {
        this.ai.setVisibility(8);
        this.ah.setVisibility(8);
        this.ae.setVisibility(8);
        this.af.setVisibility(8);
        this.ac.setVisibility(8);
        this.ag.setVisibility(8);
        this.x.setVisibility(8);
        this.ab.setVisibility(8);
        this.u.setVisibility(8);
        this.z.setVisibility(8);
        this.aa.setVisibility(8);
        this.ad.setVisibility(8);
        this.an.setVisibility(8);
        this.am.setVisibility(8);
        this.ak.setVisibility(8);
        this.aj.setVisibility(8);
        this.as.setVisibility(8);
        this.ap.setVisibility(8);
        this.ao.setVisibility(8);
        this.ar.setVisibility(8);
        this.al.setVisibility(8);
        this.aq.setVisibility(8);
        this.t.setVisibility(8);
        this.s.setVisibility(8);
        this.y.setVisibility(8);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.w.setVisibility(8);
        this.p.setVisibility(8);
        this.v.setVisibility(8);
    }

    private void k() {
        if (this.f10430b.size() == 0 && this.f.size() > 0) {
            this.f10429a.setVisibility(8);
            this.f10431c.setVisibility(0);
        }
        if (this.f10430b.size() > 0 && this.f.size() == 0) {
            this.f10429a.setVisibility(0);
            this.f10431c.setVisibility(8);
        }
        if (this.f10430b.size() <= 0 || this.f.size() <= 0) {
            return;
        }
        this.f10429a.setVisibility(0);
        this.f10431c.setVisibility(0);
    }

    static class d {
        private static final BoltCustomDialog e = new BoltCustomDialog();
    }
}
