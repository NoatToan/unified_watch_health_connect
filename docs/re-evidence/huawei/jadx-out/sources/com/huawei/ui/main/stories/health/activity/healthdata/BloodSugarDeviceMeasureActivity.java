package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureDetailFragment;
import com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureEmptyFragment;
import com.huawei.ui.main.stories.health.fragment.BloodSugarMeasureMutipleFragment;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import defpackage.emq;
import defpackage.etn;
import defpackage.lmf;
import defpackage.njy;
import defpackage.nkb;
import defpackage.qpx;
import defpackage.qre;
import defpackage.uwf;
import defpackage.uwh;
import defpackage.vci;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarDeviceMeasureActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<emq> f27413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CountDownLatch f27414c;
    private List<DataConfirmRefreshListener> d;
    private boolean e;
    private int f;
    private String g;
    private long h;
    private String i;
    private boolean k;
    private long l;
    private int n;
    private List<List<uwh>> o;
    private CustomTitleBar s;
    private List<BaseFragment> j = new ArrayList(3);
    private int r = -1;
    private Handler m = new c(this);

    public interface DataConfirmRefreshListener {
        void refresh();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blood_sugar_device_measure);
        clearBackgroundDrawable();
        k();
        l();
        o();
    }

    public void c(String str, Map<String, Object> map) {
        lmf.d().c(this, str, map, 0);
    }

    private void p() {
        String strValue = AnalyticsValue.HEALTH_BLOOD_SUGAR_NOTIFICATION_2040083.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        c(strValue, map);
    }

    private void k() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("entrance");
        LogUtil.a("BloodSugarDeviceMeasureActivity", "entrance=", stringExtra);
        this.i = stringExtra;
        this.g = intent.getStringExtra("product_name");
        if ("jump_from_blood_sugar_notify".equals(this.i)) {
            p();
            long longExtra = intent.getLongExtra("start_time", 0L);
            this.l = longExtra;
            long longExtra2 = intent.getLongExtra("end_time", longExtra);
            this.h = longExtra2;
            if (this.l != longExtra2) {
                this.k = true;
                this.f27413b = d(intent.getStringExtra("blood_sugar_data_list"));
            }
        } else if ("jump_from_blood_sugar_history".equals(this.i) || "jump_from_blood_sugar_home".equals(this.i) || "jump_from_blood_sugar_feedback".equals(this.i)) {
            long longExtra3 = intent.getLongExtra("start_time", 0L);
            this.l = longExtra3;
            this.h = longExtra3;
            this.r = intent.getIntExtra("time_period", -1);
            this.g = getString(R.string.IDS_hw_show_healthdata_bloodsugar_measurement_record);
        } else {
            LogUtil.a("BloodSugarDeviceMeasureActivity", "jump_from_blood_sugar_initiative_measure");
        }
        LogUtil.a("BloodSugarDeviceMeasureActivity", "mDeviceName=", this.g, ", startTime=", Long.valueOf(this.l), ", endTime=", Long.valueOf(this.h));
    }

    private List<emq> d(String str) {
        JsonArray asJsonArray = JsonParser.parseString(str).getAsJsonArray();
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = asJsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add((emq) gson.fromJson(it.next(), emq.class));
        }
        return arrayList;
    }

    private void l() {
        this.s = (CustomTitleBar) findViewById(R.id.titlebar);
        if ("jump_from_blood_sugar_notify".equals(this.i) || "jump_from_blood_sugar_initiative_measure".equals(this.i)) {
            if (!TextUtils.isEmpty(this.g)) {
                this.s.setTitleText(this.g);
            }
            this.s.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                    this.f50418c.c(view);
                }
            });
        } else {
            if ("jump_from_blood_sugar_history".equals(this.i) || "jump_from_blood_sugar_home".equals(this.i) || "jump_from_blood_sugar_feedback".equals(this.i)) {
                this.s.setTitleText(this.g);
                this.s.setLeftButtonDrawable(getDrawable(R.drawable.ic_public_cancel_1), qre.f(R.string.accessibility_close));
                this.s.setRightButtonDrawable(getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
                this.s.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: uoi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                        this.f50420a.b(view);
                    }
                });
                this.s.setRightButtonVisibility(0);
                return;
            }
            LogUtil.j("BloodSugarDeviceMeasureActivity", "initTitleBar else");
        }
    }

    public /* synthetic */ void c(View view) throws IllegalAccessException, InstantiationException {
        i();
    }

    public /* synthetic */ void b(View view) throws IllegalAccessException, InstantiationException {
        i();
    }

    private void o() throws IllegalAccessException, InstantiationException {
        if ("jump_from_blood_sugar_notify".equals(this.i) || "jump_from_blood_sugar_history".equals(this.i) || "jump_from_blood_sugar_home".equals(this.i) || "jump_from_blood_sugar_feedback".equals(this.i)) {
            e(this.l, this.h, this.r, 0);
        } else if ("jump_from_blood_sugar_initiative_measure".equals(this.i)) {
            n();
            v();
        } else {
            LogUtil.j("BloodSugarDeviceMeasureActivity", "initView else");
        }
    }

    private void v() throws IllegalAccessException, InstantiationException {
        if (this.n == 0) {
            c(4);
        } else if (h()) {
            c(1);
        } else {
            c(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    private void r() {
        byte b2;
        HashMap map;
        String str = this.i;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -824305694) {
            if (iHashCode != -758500271) {
                if (iHashCode == 1397670459 && str.equals("jump_from_blood_sugar_notify")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("jump_from_blood_sugar_home")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("jump_from_blood_sugar_history")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            map = new HashMap();
            map.put("type", 3);
        } else if (b2 == 1) {
            map = new HashMap();
            map.put("type", 2);
        } else if (b2 != 2) {
            map = null;
        } else {
            map = new HashMap();
            map.put("type", 1);
        }
        if (map != null) {
            String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_CONFIRMED_2030071.value();
            map.put("click", "1");
            c(strValue, map);
        }
    }

    private <T extends BaseFragment> T d(Class<? extends T> cls) throws IllegalAccessException, InstantiationException {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        T tNewInstance = null;
        for (BaseFragment baseFragment : this.j) {
            if (cls.isInstance(baseFragment)) {
                tNewInstance = cls.cast(baseFragment);
            } else {
                fragmentTransactionBeginTransaction.hide(baseFragment);
            }
        }
        if (tNewInstance == null) {
            try {
                tNewInstance = cls.newInstance();
            } catch (IllegalAccessException | InstantiationException e2) {
                LogUtil.e("BloodSugarDeviceMeasureActivity", e2);
            }
            fragmentTransactionBeginTransaction.add(R.id.hw_show_healthdata_bloodsugar_measure_fragment_container, tNewInstance);
            this.j.add(tNewInstance);
        }
        fragmentTransactionBeginTransaction.show(tNewInstance);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return tNewInstance;
    }

    public void c(int i) throws IllegalAccessException, InstantiationException {
        LogUtil.a("BloodSugarDeviceMeasureActivity", "switchPage=", Integer.valueOf(i));
        if (i == 0) {
            r();
            d(BloodSugarMeasureDetailFragment.class);
            return;
        }
        if (i == 1) {
            d(BloodSugarMeasureMutipleFragment.class);
            return;
        }
        if (i == 2) {
            if ("jump_from_blood_sugar_feedback".equals(this.i)) {
                setResult(200);
                finish();
                return;
            } else {
                u();
                return;
            }
        }
        if (i == 3) {
            HealthDataDetailActivity.a(this, "BloodSugarCardConstructor", 8);
            finish();
        } else if (i == 4) {
            d(BloodSugarMeasureEmptyFragment.class);
        } else {
            if (i != 5) {
                return;
            }
            finish();
        }
    }

    private void u() {
        uwh uwhVarX = x();
        if (uwhVarX == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("titleName", this.g);
        intent.putExtra("time", uwhVarX.g());
        intent.putExtra("bloodTimePeriod", BigDecimal.valueOf(uwhVarX.m()).intValue());
        intent.putExtra("bloodNum", uwhVarX.o());
        intent.setClass(this, BloodSugarFeedbackActivity.class);
        startActivityForResult(intent, 1);
    }

    private uwh x() {
        if (!njy.c(this.o, this.f)) {
            return null;
        }
        List<uwh> list = this.o.get(this.f);
        uwh uwhVarRemove = list.remove(this.f27412a);
        if (list.isEmpty()) {
            this.o.remove(this.f);
        }
        this.n--;
        return uwhVarRemove;
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() throws IllegalAccessException, InstantiationException {
        super.onResumeFragments();
        if (this.e) {
            this.e = false;
            t();
        }
    }

    private void t() throws IllegalAccessException, InstantiationException {
        if (this.k) {
            int i = this.n;
            if (i == 0) {
                d(BloodSugarMeasureEmptyFragment.class);
                return;
            } else {
                LogUtil.a("BloodSugarDeviceMeasureActivity", "current mHealthDataCount = ", Integer.valueOf(i));
                d(BloodSugarMeasureMutipleFragment.class);
                return;
            }
        }
        if ("jump_from_blood_sugar_notify".equals(this.i)) {
            c(3);
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.e = true;
        }
    }

    private void i() throws IllegalAccessException, InstantiationException {
        if ("jump_from_blood_sugar_history".equals(this.i) || "jump_from_blood_sugar_home".equals(this.i) || "jump_from_blood_sugar_feedback".equals(this.i)) {
            c(5);
            return;
        }
        if ("jump_from_blood_sugar_initiative_measure".equals(this.i)) {
            w();
            return;
        }
        BaseFragment baseFragment = null;
        for (BaseFragment baseFragment2 : this.j) {
            if (!baseFragment2.isHidden()) {
                baseFragment = baseFragment2;
            }
        }
        if (baseFragment instanceof BloodSugarMeasureDetailFragment) {
            if (this.k) {
                if (this.n == 0) {
                    c(4);
                    return;
                } else {
                    c(1);
                    return;
                }
            }
            c(3);
            return;
        }
        c(3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws IllegalAccessException, InstantiationException {
        i();
    }

    private void w() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getString(R.string.IDS_hw_show_healthdata_bloodsugar_is_save_data)).a(getString(R.string.IDS_hw_show_healthdata_bloodsugar_certain), new View.OnClickListener() { // from class: uod
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50415a.d(view);
            }
        }).d(getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: uof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                this.f50417c.a(view);
            }
        });
        builder.c().show();
    }

    public /* synthetic */ void d(View view) {
        uwh uwhVarD = d();
        if (uwhVarD == null) {
            return;
        }
        b(uwhVarD, BigDecimal.valueOf(uwhVarD.m()).intValue(), uwhVarD.g());
    }

    public /* synthetic */ void a(View view) throws IllegalAccessException, InstantiationException {
        c(5);
    }

    private void n() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("time_period", 0);
        float floatExtra = intent.getFloatExtra("blood_sugar_value", 0.0f);
        long longExtra = intent.getLongExtra("blood_sugar_time", 0L);
        String stringExtra = intent.getStringExtra("blood_sugar_unique_id");
        uwh uwhVar = new uwh();
        uwhVar.c(intExtra);
        uwhVar.e(floatExtra);
        uwhVar.e(longExtra);
        uwhVar.b(stringExtra);
        HiBloodSugarMetaData hiBloodSugarMetaData = new HiBloodSugarMetaData();
        hiBloodSugarMetaData.setConfirmed(false);
        uwhVar.c(HiJsonUtil.d(hiBloodSugarMetaData));
        ArrayList arrayList = new ArrayList();
        arrayList.add(uwhVar);
        ArrayList arrayList2 = new ArrayList();
        this.o = arrayList2;
        arrayList2.add(arrayList);
        this.n = c(this.o);
    }

    private void e(long j, long j2, int i, int i2) {
        uwf.d().d(BaseApplication.getContext(), j, j2, 0, new e(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<List<uwh>> list, int i, final int i2) {
        LogUtil.a("BloodSugarDeviceMeasureActivity", "count=", Integer.valueOf(c(list)));
        if ("jump_from_blood_sugar_notify".equals(this.i)) {
            this.o = e(list);
        } else {
            this.o = e(list, i);
        }
        int iC = c(this.o);
        this.n = iC;
        LogUtil.a("BloodSugarDeviceMeasureActivity", "mHealthDataCount=", Integer.valueOf(iC));
        runOnUiThread(new Runnable() { // from class: uoj
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InstantiationException {
                this.e.e(i2);
            }
        });
    }

    public /* synthetic */ void e(int i) throws IllegalAccessException, InstantiationException {
        if (i == 1) {
            s();
        } else {
            v();
        }
    }

    private boolean b(uwh uwhVar) {
        Iterator<emq> it = this.f27413b.iterator();
        while (it.hasNext()) {
            emq next = it.next();
            if (uwhVar.g() == next.getEndTime() && BigDecimal.valueOf(uwhVar.m()).intValue() == emq.d(next.getEndTime())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    private List<List<uwh>> e(List<List<uwh>> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<List<uwh>> it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = null;
            for (uwh uwhVar : it.next()) {
                HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) HiJsonUtil.d(uwhVar.j(), HiBloodSugarMetaData.class);
                if (hiBloodSugarMetaData != null) {
                    if (!njy.e(this.f27413b)) {
                        if (b(uwhVar)) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(uwhVar);
                        }
                    } else if (!hiBloodSugarMetaData.getConfirmed()) {
                        LogUtil.a("BloodSugarDeviceMeasureActivity", "Add data to list");
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(uwhVar);
                    }
                }
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private List<List<uwh>> e(List<List<uwh>> list, int i) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<List<uwh>> it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = null;
            for (uwh uwhVar : it.next()) {
                if (i == -1 || i == uwhVar.m()) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(uwhVar);
                }
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    public void e() {
        if (this.o == null) {
            return;
        }
        this.f27414c = new CountDownLatch(this.n);
        for (int i = 0; i < this.o.size(); i++) {
            for (int i2 = 0; i2 < this.o.get(i).size(); i2++) {
                uwh uwhVar = this.o.get(i).get(i2);
                if (uwhVar != null) {
                    b(uwhVar, BigDecimal.valueOf(uwhVar.m()).intValue(), uwhVar.g());
                }
            }
        }
    }

    public void a() {
        this.f27414c = null;
        this.f27413b = null;
        e(this.l, this.h, this.r, 1);
    }

    private void s() throws IllegalAccessException, InstantiationException {
        if (this.n == 0) {
            c(4);
        } else {
            q();
        }
    }

    public void d(int i, long j) {
        if (j > System.currentTimeMillis()) {
            qpx.e(this, getResources().getString(R.string.IDS_hw_health_show_healthdata_timeerror));
            return;
        }
        uwh uwhVarD = d();
        if (uwhVarD == null) {
            return;
        }
        b(uwhVarD, i, j);
    }

    private void b(final uwh uwhVar, final int i, final long j) {
        if (i == BigDecimal.valueOf(uwhVar.m()).intValue() && j == uwhVar.g()) {
            e(uwhVar, i, j);
            d(uwhVar);
        } else {
            int iIntValue = BigDecimal.valueOf(uwhVar.m()).intValue();
            long jG = uwhVar.g();
            vci.d().a();
            uwf.d().e(BaseApplication.getContext(), iIntValue, jG, jG, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarDeviceMeasureActivity.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        LogUtil.j("BloodSugarDeviceMeasureActivity", "Failed to deleteBloodSuagrData, errorCode=", Integer.valueOf(i2));
                    } else {
                        LogUtil.a("BloodSugarDeviceMeasureActivity", "Succeeded to deleteBloodSuagrData");
                    }
                    BloodSugarDeviceMeasureActivity.this.e(uwhVar, i, j);
                    BloodSugarDeviceMeasureActivity.this.d(uwhVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(uwh uwhVar, int i, long j) {
        uwhVar.c(i);
        uwhVar.e(j);
        HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) HiJsonUtil.d(uwhVar.j(), HiBloodSugarMetaData.class);
        if (hiBloodSugarMetaData != null) {
            hiBloodSugarMetaData.setConfirmed(true);
            uwhVar.c(HiJsonUtil.d(hiBloodSugarMetaData));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(uwh uwhVar) {
        if (uwhVar == null) {
            LogUtil.e("BloodSugarDeviceMeasureActivity", "insert healthData is null");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(10001);
        String strI = uwhVar.i();
        LogUtil.a("BloodSugarDeviceMeasureActivity", "time=", Long.valueOf(uwhVar.g()), "uuid=", strI);
        hiHealthData.setValue(etn.h(strI) ? uwhVar.l() : uwhVar.o());
        hiHealthData.setType((int) uwhVar.m());
        hiHealthData.setDeviceUuid(strI);
        hiHealthData.setMetaData(uwhVar.j());
        hiHealthData.setStartTime(uwhVar.g());
        hiHealthData.setEndTime(uwhVar.g());
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchDataSource(HiDataSourceFetchOption.builder().c(1).b(new int[]{uwhVar.a()}).a(), new b(this, hiHealthData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        CountDownLatch countDownLatch = this.f27414c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            if (this.f27414c.getCount() == 0) {
                Message messageObtainMessage = this.m.obtainMessage();
                messageObtainMessage.what = 1;
                this.m.sendMessage(messageObtainMessage);
                return;
            }
            return;
        }
        runOnUiThread(new Runnable() { // from class: uok
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InstantiationException {
                this.d.j();
            }
        });
    }

    public /* synthetic */ void j() throws IllegalAccessException, InstantiationException {
        c(2);
    }

    public static class b implements HiDataClientListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HiHealthData f27417b;
        private final WeakReference<BloodSugarDeviceMeasureActivity> e;

        b(BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity, HiHealthData hiHealthData) {
            this.e = new WeakReference<>(bloodSugarDeviceMeasureActivity);
            this.f27417b = hiHealthData;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataClientListener
        public void onResult(List<HiHealthClient> list) {
            nkb.d().d(BaseApplication.getContext(), this.f27417b, njy.e(list) ? null : list.get(0).getPackageName(), new IBaseResponseCallback() { // from class: uoh
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f50419c.b(i, obj);
                }
            });
        }

        public /* synthetic */ void b(int i, Object obj) {
            LogUtil.a("BloodSugarDeviceMeasureActivity", "DataClientListener onResponse errorCode ", Integer.valueOf(i));
            BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity = this.e.get();
            if (bloodSugarDeviceMeasureActivity != null && !bloodSugarDeviceMeasureActivity.isFinishing()) {
                bloodSugarDeviceMeasureActivity.m();
            } else {
                LogUtil.j("BloodSugarDeviceMeasureActivity", "DataClientListener onResult onResponse activity ", bloodSugarDeviceMeasureActivity);
            }
        }
    }

    static class c extends BaseHandler<BloodSugarDeviceMeasureActivity> {
        c(BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity) {
            super(bloodSugarDeviceMeasureActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity, Message message) {
            if (message == null) {
                LogUtil.j("BloodSugarDeviceMeasureActivity", "handleMessageWhenReferenceNotNull message is null");
            } else if (message.what != 1) {
                LogUtil.j("BloodSugarDeviceMeasureActivity", "handleMessageWhenReferenceNotNull message is error");
            } else {
                bloodSugarDeviceMeasureActivity.a();
            }
        }
    }

    private int c(List<List<uwh>> list) {
        int size = 0;
        if (list == null) {
            return 0;
        }
        Iterator<List<uwh>> it = list.iterator();
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public int c() {
        return this.n;
    }

    public List<List<uwh>> f() {
        return this.o;
    }

    public void c(int i, int i2) throws IllegalAccessException, InstantiationException {
        this.f = i;
        this.f27412a = i2;
        c(0);
    }

    public uwh d() {
        if (njy.c(this.o, this.f) && njy.c(this.o.get(this.f), this.f27412a)) {
            return this.o.get(this.f).get(this.f27412a);
        }
        return null;
    }

    public String b() {
        return this.i;
    }

    public boolean h() {
        return this.k;
    }

    public CustomTitleBar g() {
        return this.s;
    }

    public void d(DataConfirmRefreshListener dataConfirmRefreshListener) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(dataConfirmRefreshListener);
    }

    private void q() {
        Iterator<DataConfirmRefreshListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().refresh();
        }
    }

    static class e implements CommonUiBaseResponse {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f27419c;
        private final WeakReference<BloodSugarDeviceMeasureActivity> d;

        private e(BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity, int i, int i2) {
            this.d = new WeakReference<>(bloodSugarDeviceMeasureActivity);
            this.f27419c = i;
            this.f27418b = i2;
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            BloodSugarDeviceMeasureActivity bloodSugarDeviceMeasureActivity = this.d.get();
            if (bloodSugarDeviceMeasureActivity == null) {
                return;
            }
            if (i != 0) {
                LogUtil.j("BloodSugarDeviceMeasureActivity", "Failed to readBloodSugarData, errorCode=", Integer.valueOf(i));
            } else {
                LogUtil.a("BloodSugarDeviceMeasureActivity", "Succeeded to readBloodSugarData");
            }
            if (obj instanceof List) {
                bloodSugarDeviceMeasureActivity.b((List<List<uwh>>) obj, this.f27419c, this.f27418b);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
