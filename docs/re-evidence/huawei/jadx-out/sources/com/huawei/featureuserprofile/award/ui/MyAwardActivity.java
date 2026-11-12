package com.huawei.featureuserprofile.award.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.featureuserprofile.R;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.AwardRecordsBean;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpn;
import defpackage.xfz;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MyAwardActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f5546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AwardExpiredFragment f5547c;
    private AwardValidFragment e;
    private HealthSubTabWidget f;
    private qpn g;
    private HealthViewPager h;
    private List<String> i;
    private List<AwardRecordsBean> d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f5545a = new a(this);

    /* JADX INFO: loaded from: classes6.dex */
    static class a extends BaseHandler<MyAwardActivity> {
        a(MyAwardActivity myAwardActivity) {
            super(myAwardActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MyAwardActivity myAwardActivity, Message message) {
            if (myAwardActivity == null || message == null) {
                LogUtil.j("MyAwardActivity", "handleMessageWhenReferenceNotNull fragment or msg is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                myAwardActivity.a();
            } else if (i == 1) {
                myAwardActivity.f();
            } else {
                LogUtil.j("MyAwardActivity", "MSG_NOT_MATCH");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("MyAwardActivity", "onCreate()");
        clearBackgroundDrawable();
        setContentView(R.layout.activity_my_award);
        cancelAdaptRingRegion();
        this.f5546b = this;
        b();
        e();
        c();
        j();
    }

    private void j() {
        Intent intent = getIntent();
        String string = "";
        if (intent != null && intent.getExtras() != null) {
            string = intent.getExtras().getString("from", "");
        }
        HashMap map = new HashMap();
        map.put(ParamConstants.CallbackMethod.ON_SHOW, 1);
        map.put("type", 3);
        LogUtil.a("MyAwardActivity", "setBiCollect from ", string);
        map.put("from", string);
        lmf.d().c(this.f5546b, AnalyticsValue.MY_ASSET_SHOW_2120122.value(), map, 0);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        arrayList.add(getString(R.string.IDS_my_award_valid));
        this.i.add(getString(R.string.IDS_my_award_expired));
    }

    private void e() {
        this.f = (HealthSubTabWidget) findViewById(R.id.tab_layout);
        g();
        this.h = (HealthViewPager) findViewById(R.id.viewpager);
        this.g = new qpn(this, this.h, this.f);
        for (int i = 0; i < this.i.size(); i++) {
            xfz xfzVarB = this.f.b(this.i.get(i));
            if (i == 0) {
                AwardValidFragment awardValidFragmentB = AwardValidFragment.b();
                this.e = awardValidFragmentB;
                this.g.b(xfzVarB, awardValidFragmentB, true);
            } else {
                AwardExpiredFragment awardExpiredFragmentD = AwardExpiredFragment.d();
                this.f5547c = awardExpiredFragmentD;
                this.g.b(xfzVarB, awardExpiredFragmentD, false);
            }
        }
        d();
    }

    private void d() {
        this.h.addOnPageChangeListener(new HwViewPager.b() { // from class: com.huawei.featureuserprofile.award.ui.MyAwardActivity.1
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.b, com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                MyAwardActivity.this.i();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        HealthSubTabWidget healthSubTabWidget = this.f;
        if (healthSubTabWidget == null || this.i == null) {
            return;
        }
        int subTabCount = healthSubTabWidget.getSubTabCount();
        for (int i = 0; i < subTabCount; i++) {
            xfz xfzVarA = this.f.a(i);
            if (xfzVarA != null && i < this.i.size()) {
                xfzVarA.a(this.i.get(i));
            }
        }
    }

    private void g() {
        if (LanguageUtil.o(this.f5546b)) {
            return;
        }
        try {
            Field declaredField = this.f.getClass().getSuperclass().getDeclaredField("mSubTabItemMargin");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                declaredField.set(this.f, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.hwsubtab_item_margin)));
            }
        } catch (IllegalAccessException e) {
            LogUtil.e("MyAwardActivity", e.getMessage());
        } catch (NoSuchFieldException e2) {
            LogUtil.e("MyAwardActivity", "can't get mSubTabItemMargin field for subtab", e2);
        }
    }

    private void c() {
        final c cVar = new c(this);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.featureuserprofile.award.ui.MyAwardActivity.2
            @Override // java.lang.Runnable
            public void run() {
                ((PayApi) Services.b("TradeService", PayApi.class)).awardListQuery(cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (njy.e(this.d)) {
            LogUtil.e("MyAwardActivity", "AwardRecordsBeans is empty");
            f();
            return;
        }
        ArrayList<AwardRecordsBean> arrayList = new ArrayList();
        arrayList.addAll(this.d);
        List<AwardRecordsBean> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        for (AwardRecordsBean awardRecordsBean : arrayList) {
            if (awardRecordsBean.getIsExpire() == 0) {
                arrayList2.add(awardRecordsBean);
            } else {
                arrayList3.add(awardRecordsBean);
            }
        }
        if (this.e != null) {
            if (arrayList2.size() > 0) {
                List<AwardRecordsBean> arrayList4 = new ArrayList<>();
                arrayList4.addAll(arrayList2);
                e(arrayList4);
                this.e.c(arrayList4);
                c(arrayList2);
            } else {
                this.e.c();
            }
        }
        if (this.f5547c != null) {
            if (arrayList3.size() > 0) {
                List<AwardRecordsBean> arrayList5 = new ArrayList<>();
                arrayList5.addAll(arrayList3);
                d(arrayList5);
                this.f5547c.d(arrayList5);
                return;
            }
            this.f5547c.c();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<MyAwardActivity> f5550c;

        c(MyAwardActivity myAwardActivity) {
            this.f5550c = new WeakReference<>(myAwardActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MyAwardActivity myAwardActivity = this.f5550c.get();
            if (myAwardActivity == null) {
                LogUtil.j("MyAwardActivity", "activity is null");
                return;
            }
            if (i == 0 && (obj instanceof List)) {
                myAwardActivity.d.addAll((List) obj);
                myAwardActivity.f5545a.sendEmptyMessage(0);
            } else {
                LogUtil.j("MyAwardActivity", "awardQuery fail:", Integer.valueOf(i));
                myAwardActivity.f5545a.sendEmptyMessage(1);
            }
        }
    }

    private void e(List<AwardRecordsBean> list) {
        Collections.sort(list, new Comparator() { // from class: cvl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f31411b.d((AwardRecordsBean) obj, (AwardRecordsBean) obj2);
            }
        });
    }

    public /* synthetic */ int d(AwardRecordsBean awardRecordsBean, AwardRecordsBean awardRecordsBean2) {
        String strA = a(awardRecordsBean);
        String exchangeStatus = awardRecordsBean.getExchangeStatus();
        String strA2 = a(awardRecordsBean2);
        String exchangeStatus2 = awardRecordsBean2.getExchangeStatus();
        if (!strA.equals(strA2)) {
            return strA.compareTo(strA2);
        }
        if ("1".equals(strA) && "1".equals(strA2) && !exchangeStatus.equals(exchangeStatus2)) {
            return Integer.compare(b(exchangeStatus), b(exchangeStatus2));
        }
        return Long.compare(awardRecordsBean2.getWonTime(), awardRecordsBean.getWonTime());
    }

    private void d(List<AwardRecordsBean> list) {
        Collections.sort(list, new Comparator() { // from class: cvm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f31412b.c((AwardRecordsBean) obj, (AwardRecordsBean) obj2);
            }
        });
    }

    public /* synthetic */ int c(AwardRecordsBean awardRecordsBean, AwardRecordsBean awardRecordsBean2) {
        String strA = a(awardRecordsBean);
        String strA2 = a(awardRecordsBean2);
        if (!strA.equals(strA2)) {
            return strA.compareTo(strA2);
        }
        return Long.compare(awardRecordsBean2.getWonTime(), awardRecordsBean.getWonTime());
    }

    private String a(AwardRecordsBean awardRecordsBean) {
        String awardType = awardRecordsBean.getAwardType();
        return "4".equals(awardType) ? "1" : awardType;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    private int b(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 180654607) {
            if (iHashCode != 1254744472) {
                if (iHashCode == 2082219389 && str.equals("is_send")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("is_exchange")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("not_exchange")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return 1;
        }
        if (b2 != 1) {
            return b2 != 2 ? Integer.MAX_VALUE : 3;
        }
        return 2;
    }

    private void c(List<AwardRecordsBean> list) {
        if (njy.e(list)) {
            LogUtil.j("MyAwardActivity", "awardValidList is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        List<AwardRecordsBean> listA = a(arrayList);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        long jD = SharedPreferenceManager.d(Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_award_time", 0L);
        long wonTime = listA.get(0).getWonTime();
        LogUtil.a("MyAwardActivity", "beforeTime:", Long.valueOf(jD), " wonTime:", Long.valueOf(wonTime));
        if (wonTime > jD) {
            SharedPreferenceManager.c(Integer.toString(PrebakedEffectId.RT_VICTORY), accountInfo + "key_award_time", wonTime);
        }
    }

    private static List<AwardRecordsBean> a(List<AwardRecordsBean> list) {
        Collections.sort(list, new Comparator() { // from class: cvj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((AwardRecordsBean) obj2).getWonTime(), ((AwardRecordsBean) obj).getWonTime());
            }
        });
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        AwardValidFragment awardValidFragment = this.e;
        if (awardValidFragment != null) {
            awardValidFragment.c();
        }
        AwardExpiredFragment awardExpiredFragment = this.f5547c;
        if (awardExpiredFragment != null) {
            awardExpiredFragment.c();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
