package com.huawei.health.ecologydevice.ui.healthdata.activity;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.ecologydevice.R;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment;
import com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarDetailFragment;
import com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarFeedbackFragment;
import com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarMultipleFragment;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiBloodSugarMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.elh;
import defpackage.elo;
import defpackage.emr;
import defpackage.erj;
import defpackage.etn;
import defpackage.njy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes27.dex */
public class BloodSugarHistoryActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CountDownLatch f6591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6592c;
    private List<DataConfirmRefreshListener> d;
    private List<List<HiHealthData>> e;
    private int g;
    private String h;
    private elh i;
    private String l;
    private final List<BaseFragment> f = new ArrayList(3);
    private Handler j = new b(this);

    public interface DataConfirmRefreshListener {
        void refresh();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blood_sugar_history);
        clearBackgroundDrawable();
        k();
        m();
        o();
    }

    private void k() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
        if (contentValues != null) {
            this.h = contentValues.getAsString("productId");
            this.l = contentValues.getAsString("uniqueId");
        }
        this.i = ResourceManager.c().b(this.h);
    }

    private void m() {
        String strA;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar);
        elh elhVar = this.i;
        if (elhVar == null) {
            strA = "";
        } else {
            strA = elo.a(this.h, elhVar.l().d());
        }
        if (!TextUtils.isEmpty(strA)) {
            customTitleBar.setTitleText(strA);
        }
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: eon
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                this.f33278c.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) throws IllegalAccessException, InstantiationException {
        d();
    }

    private void o() {
        d(0);
    }

    public void c(int i) throws IllegalAccessException, InstantiationException {
        LogUtil.a("BloodSugarHistoryActivity", "switchPage=", Integer.valueOf(i));
        if (i == 0) {
            d(BloodSugarDetailFragment.class);
            return;
        }
        if (i == 1) {
            d(BloodSugarFeedbackFragment.class);
            return;
        }
        if (i == 2) {
            d(BloodSugarMultipleFragment.class);
            return;
        }
        if (i == 3) {
            erj.a(this, HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR);
        } else if (i == 4) {
            erj.d(this);
        } else {
            if (i != 5) {
                return;
            }
            finish();
        }
    }

    private <T extends BaseFragment> T d(Class<? extends T> cls) throws IllegalAccessException, InstantiationException {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        T tNewInstance = null;
        for (BaseFragment baseFragment : this.f) {
            if (cls.isInstance(baseFragment)) {
                tNewInstance = cls.cast(baseFragment);
            } else {
                fragmentTransactionBeginTransaction.hide(baseFragment);
            }
        }
        if (tNewInstance == null) {
            try {
                tNewInstance = cls.newInstance();
            } catch (IllegalAccessException | InstantiationException e) {
                LogUtil.e("BloodSugarHistoryActivity", e);
            }
            fragmentTransactionBeginTransaction.add(R.id.blood_sugar_fragment_container, tNewInstance);
            this.f.add(tNewInstance);
        }
        fragmentTransactionBeginTransaction.show(tNewInstance);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return tNewInstance;
    }

    public void d() throws IllegalAccessException, InstantiationException {
        BaseFragment baseFragment = null;
        for (BaseFragment baseFragment2 : this.f) {
            if (!baseFragment2.isHidden()) {
                baseFragment = baseFragment2;
            }
        }
        if (baseFragment instanceof BloodSugarBaseFragment) {
            if (this.f6590a == 0) {
                j();
                return;
            } else {
                n();
                return;
            }
        }
        f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws IllegalAccessException, InstantiationException {
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i) {
        emr.d().e(this.l, new CommonUiResponse() { // from class: eok
            @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
            public final void onResponse(int i2, Object obj) {
                this.e.c(i, i2, (List) obj);
            }
        });
    }

    public /* synthetic */ void c(int i, int i2, List list) {
        if (i2 != 0) {
            LogUtil.j("BloodSugarHistoryActivity", "Failed to readBloodSugarData, errorCode = ", Integer.valueOf(i2));
        } else {
            LogUtil.a("BloodSugarHistoryActivity", "Succeeded to readBloodSugarData");
        }
        c(list, i);
    }

    private void c(List<List<HiHealthData>> list, final int i) {
        LogUtil.a("BloodSugarHistoryActivity", "loadDataResult the count of BloodSugar is ", Integer.valueOf(e(list)));
        List<List<HiHealthData>> listB = b(list);
        this.e = listB;
        int iE = e(listB);
        this.f6590a = iE;
        LogUtil.a("BloodSugarHistoryActivity", "loadDataResult mBloodSugarListsCount = ", Integer.valueOf(iE));
        runOnUiThread(new Runnable() { // from class: eog
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InstantiationException {
                this.f33273b.a(i);
            }
        });
    }

    public /* synthetic */ void a(int i) throws IllegalAccessException, InstantiationException {
        if (i == 1) {
            p();
        } else {
            s();
        }
    }

    private List<List<HiHealthData>> b(List<List<HiHealthData>> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<List<HiHealthData>> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
        return arrayList;
    }

    private void a(List<HiHealthData> list, List<List<HiHealthData>> list2) {
        ArrayList arrayList = null;
        for (HiHealthData hiHealthData : list) {
            HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodSugarMetaData.class);
            if (hiBloodSugarMetaData != null && !hiBloodSugarMetaData.getConfirmed()) {
                LogUtil.a("BloodSugarHistoryActivity", "Add data to list");
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(hiHealthData);
            }
        }
        if (arrayList != null) {
            list2.add(arrayList);
        }
    }

    private void s() throws IllegalAccessException, InstantiationException {
        if (a() == 0) {
            j();
        } else if (a() > 1) {
            n();
        } else {
            g();
        }
    }

    private void p() {
        l();
    }

    public void b() {
        if (this.e == null) {
            return;
        }
        this.f6591b = new CountDownLatch(this.f6590a);
        for (int i = 0; i < this.e.size(); i++) {
            for (int i2 = 0; i2 < this.e.get(i).size(); i2++) {
                HiHealthData hiHealthData = this.e.get(i).get(i2);
                d(hiHealthData, BigDecimal.valueOf(hiHealthData.getType()).intValue());
            }
        }
    }

    public void b(int i) {
        HiHealthData hiHealthDataE = e();
        if (hiHealthDataE == null) {
            LogUtil.j("BloodSugarHistoryActivity", "bloodSugar is null");
        } else {
            d(hiHealthDataE, i);
        }
    }

    private void d(final HiHealthData hiHealthData, final int i) {
        int iIntValue = BigDecimal.valueOf(hiHealthData.getType()).intValue();
        if (i == iIntValue) {
            LogUtil.d("BloodSugarHistoryActivity", "The timePeriod is not modified");
            e(hiHealthData, i);
            c(hiHealthData);
        } else {
            LogUtil.d("BloodSugarHistoryActivity", "The timePeriod is modified");
            long endTime = hiHealthData.getEndTime();
            emr.d().b(endTime, endTime, iIntValue, new IBaseResponseCallback() { // from class: eof
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f33272c.b(hiHealthData, i, i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void b(HiHealthData hiHealthData, int i, int i2, Object obj) {
        a(hiHealthData, i, i2);
    }

    private void a(HiHealthData hiHealthData, int i, int i2) {
        if (i2 != 0) {
            LogUtil.j("BloodSugarHistoryActivity", "Failed to deleteBloodSugarData, errorCode=", Integer.valueOf(i2));
            return;
        }
        LogUtil.a("BloodSugarHistoryActivity", "Succeeded to deleteBloodSugarData");
        e(hiHealthData, i);
        c(hiHealthData);
    }

    private void e(HiHealthData hiHealthData, int i) {
        hiHealthData.setType(i);
        HiBloodSugarMetaData hiBloodSugarMetaData = (HiBloodSugarMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodSugarMetaData.class);
        if (hiBloodSugarMetaData != null) {
            hiBloodSugarMetaData.setConfirmed(true);
            hiHealthData.setMetaData(HiJsonUtil.d(hiBloodSugarMetaData));
        }
    }

    private void c(final HiHealthData hiHealthData) {
        emr.d().e(hiHealthData, new IBaseResponseCallback() { // from class: eoe
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f33270c.a(hiHealthData, i, obj);
            }
        });
    }

    public /* synthetic */ void a(HiHealthData hiHealthData, int i, Object obj) {
        if (i != 0) {
            LogUtil.j("BloodSugarHistoryActivity", "Failed to getBloodSugarDataOrigin, errorCode=", Integer.valueOf(i));
        } else {
            e(hiHealthData, String.valueOf(obj));
        }
    }

    private void e(HiHealthData hiHealthData, String str) {
        emr.d().b(hiHealthData, str, new IBaseResponseCallback() { // from class: eoh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.d(i, obj);
            }
        });
    }

    public /* synthetic */ void d(int i, Object obj) {
        e(i);
    }

    private void e(int i) {
        if (i != 0) {
            LogUtil.j("BloodSugarHistoryActivity", "Failed to insertBloodSugarData, errorCode=", Integer.valueOf(i));
        } else {
            LogUtil.a("BloodSugarHistoryActivity", "Succeeded to insertBloodSugarData");
        }
        CountDownLatch countDownLatch = this.f6591b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            if (this.f6591b.getCount() == 0) {
                etn.e(this.j, 2, (Object) null);
                this.f6591b = null;
                return;
            }
            return;
        }
        etn.e(this.j, 1, (Object) null);
    }

    public void f() throws IllegalAccessException, InstantiationException {
        c(4);
        c(5);
    }

    public void j() throws IllegalAccessException, InstantiationException {
        c(3);
        c(5);
    }

    public void g() throws IllegalAccessException, InstantiationException {
        c(0);
    }

    public void h() throws IllegalAccessException, InstantiationException {
        c(1);
    }

    public void n() throws IllegalAccessException, InstantiationException {
        c(2);
    }

    private int e(List<List<HiHealthData>> list) {
        int size = 0;
        if (list == null) {
            return 0;
        }
        Iterator<List<HiHealthData>> it = list.iterator();
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public int a() {
        return this.f6590a;
    }

    public List<List<HiHealthData>> c() {
        return this.e;
    }

    public void a(int i, int i2) throws IllegalAccessException, InstantiationException {
        this.g = i;
        this.f6592c = i2;
        g();
    }

    public HiHealthData i() {
        if (!njy.c(this.e, this.g)) {
            return null;
        }
        List<HiHealthData> list = this.e.get(this.g);
        if (!njy.c(list, this.f6592c)) {
            return null;
        }
        HiHealthData hiHealthDataRemove = list.remove(this.f6592c);
        if (list.isEmpty()) {
            this.e.remove(this.g);
        }
        this.f6590a--;
        return hiHealthDataRemove;
    }

    public HiHealthData e() {
        if (njy.c(this.e, this.g) && njy.c(this.e.get(this.g), this.f6592c)) {
            return this.e.get(this.g).get(this.f6592c);
        }
        return null;
    }

    public void d(DataConfirmRefreshListener dataConfirmRefreshListener) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(dataConfirmRefreshListener);
    }

    private void l() {
        Iterator<DataConfirmRefreshListener> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().refresh();
        }
    }

    static class b extends BaseHandler<BloodSugarHistoryActivity> {
        b(BloodSugarHistoryActivity bloodSugarHistoryActivity) {
            super(bloodSugarHistoryActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BloodSugarHistoryActivity bloodSugarHistoryActivity, Message message) throws IllegalAccessException, InstantiationException {
            if (message.what == 1) {
                bloodSugarHistoryActivity.h();
            } else if (message.what == 2) {
                bloodSugarHistoryActivity.d(1);
            } else {
                LogUtil.j("BloodSugarHistoryActivity", "undefined");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
