package com.huawei.ui.homehealth.healthheadlinecard;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardData;
import defpackage.ezo;
import defpackage.gdy;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qqt;
import defpackage.skz;
import defpackage.slq;
import defpackage.smp;
import defpackage.sne;
import defpackage.snk;
import defpackage.snn;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class HealthHeadLinesCardData extends AbstractBaseCardData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f25519c;
    private final WeakReference<Context> e;
    private HealthHeadLinesCardViewHolder g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25517a = true;
    private final Observer i = new AnonymousClass5();
    private final Observer d = new AnonymousClass3();

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
    }

    public HealthHeadLinesCardData(Context context) {
        this.e = new WeakReference<>(context == null ? BaseApplication.getContext() : context);
        LogUtil.a("HealthHeadLinesCardData", "HealthHeadLinesCardData create");
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardData$5, reason: invalid class name */
    public class AnonymousClass5 implements Observer {
        AnonymousClass5() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            smp smpVarB = smp.b();
            gdy gdyVarJ = smpVarB.j();
            String strH = gdyVarJ.h();
            LogUtil.a("HealthHeadLinesCardData", "handle show view, currentMediaId = ", strH, ", title = ", gdyVarJ.o());
            if (!TextUtils.isEmpty(strH)) {
                if (HealthHeadLinesCardData.this.g != null) {
                    HealthHeadLinesCardData.this.g.a(gdyVarJ, smpVarB.q());
                }
                HealthHeadLinesCardData.this.g();
                return;
            }
            HealthHeadLinesCardData.this.c();
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!njy.c(objArr, 0)) {
                LogUtil.e("HealthHeadLinesCardData", "null args!");
                return;
            }
            LogUtil.a("HealthHeadLinesCardData", "show headlines observer args = ", objArr);
            Object obj = objArr[0];
            if (obj instanceof Boolean) {
                HandlerExecutor.b(((Boolean) obj).booleanValue() ? new Runnable() { // from class: sli
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.d();
                    }
                } : new Runnable() { // from class: slk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b();
                    }
                });
            }
        }

        public /* synthetic */ void b() {
            HealthHeadLinesCardData.this.a();
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardData$3, reason: invalid class name */
    public class AnonymousClass3 implements Observer {
        AnonymousClass3() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(final String str, final Object... objArr) {
            HandlerExecutor.b(new Runnable() { // from class: slj
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(str, objArr);
                }
            });
        }

        public /* synthetic */ void e(String str, Object[] objArr) {
            LogUtil.a("HealthHeadLinesCardData", "login status changed label = ", str, ", args = ", objArr);
            if (str == null) {
                return;
            }
            if ("com.huawei.plugin.account.logout".equals(str)) {
                smp.b().j(2);
                smp.b().c();
                smp.b().aa();
                skz.b();
                SharedPreferenceManager.c(Integer.toString(10000), "ShowHealthHeadLinesData", "");
                HealthHeadLinesCardData.this.a();
                return;
            }
            if ("com.huawei.plugin.account.login".equals(str)) {
                HealthHeadLinesCardData.this.i();
            }
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f25519c = layoutInflater.inflate(R.layout.home_item_health_headlines, viewGroup, false);
        this.g = new HealthHeadLinesCardViewHolder(this, this.f25519c, b(), false);
        a();
        j();
        skz.b();
        smp.b().e();
        LogUtil.a("HealthHeadLinesCardData", "getCardViewHolder");
        i();
        return this.g;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "HealthHeadLinesCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        LogUtil.a("HealthHeadLinesCardData", "onResume lastShowTime:", Long.valueOf(this.f25518b));
        gdy gdyVarJ = smp.b().j();
        String strH = gdyVarJ == null ? "" : gdyVarJ.h();
        if (lsl.aa(this.f25518b) || !TextUtils.isEmpty(strH)) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        View view = this.f25519c;
        if (view == null) {
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        layoutParams.height = 0;
        layoutParams.bottomMargin = 0;
        this.f25519c.setLayoutParams(layoutParams);
        this.f25519c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View view = this.f25519c;
        if (view == null) {
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.bottomMargin = qqp.a(b(), 12.0f);
        this.f25519c.setLayoutParams(layoutParams);
        this.f25519c.setVisibility(0);
        LogUtil.a("HealthHeadLinesCardData", "showView");
    }

    private void j() {
        if (this.f25517a) {
            ObserverManagerUtil.d(this.i, "HOME_RECYCLE_VIEW_MOVE");
            ObserverManagerUtil.d(this.d, "com.huawei.plugin.account.logout");
            ObserverManagerUtil.d(this.d, "com.huawei.plugin.account.login");
            this.f25517a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f25518b = System.currentTimeMillis();
        String strB = SharedPreferenceManager.b(Integer.toString(10000), "ShowHealthHeadLinesData", "");
        if (!TextUtils.isEmpty(strB)) {
            c("true".equals(strB));
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: slf
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        }
    }

    public /* synthetic */ void e() {
        c(slq.a());
    }

    private void c(boolean z) {
        LogUtil.a("HealthHeadLinesCardData", "isShow ", Boolean.valueOf(z));
        slq.c(z);
        LoginInit loginInit = LoginInit.getInstance(b());
        if (VersionControlUtil.isSupportOperationAccount() && z && loginInit.getIsLogined()) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(final gdy gdyVar, final int i) {
        LogUtil.a("HealthHeadLinesCardData", "initShowViewHolder start");
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: sld
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48325c.b(gdyVar, i);
                }
            });
            return;
        }
        if (gdyVar == null) {
            LogUtil.j("HealthHeadLinesCardData", "initShowViewHolder audioItem is null");
            return;
        }
        LogUtil.a("HealthHeadLinesCardData", "initShowViewHolder");
        HealthHeadLinesCardViewHolder healthHeadLinesCardViewHolder = this.g;
        if (healthHeadLinesCardViewHolder != null) {
            healthHeadLinesCardViewHolder.a(gdyVar, i);
        }
        g();
        d();
    }

    public void c() {
        final gdy gdyVarJ;
        ReleaseLogUtil.d("R_HealthHeadLinesCardData", "initHealthHeadlinesListHistoryData");
        final smp smpVarB = smp.b();
        final sne sneVarS = smpVarB.s();
        if (sneVarS == null || !skz.j(sneVarS.e())) {
            gdyVarJ = null;
        } else {
            gdyVarJ = smpVarB.q() != 3 ? sneVarS.b().get(0) : smpVarB.j();
            LogUtil.a("HealthHeadLinesCardData", "initHealthHeadlinesListHistoryData has today list, curShowAudio:", gdyVarJ);
            b(gdyVarJ, smpVarB.q());
        }
        HealthHeadLinesInfoManager.d().b(new UiCallback<List<snn>>() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardData.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("R_HealthHeadLinesCardData", "getTodayWorkoutListHistory failed, errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
                HealthHeadLinesCardData.this.e(sneVarS);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<snn> list) {
                if (!njy.e(list)) {
                    HealthHeadLinesCardData.this.c(list);
                    List<snk> listD = skz.d(list);
                    List<gdy> listA = skz.a(list);
                    if (njy.e(listD) || njy.e(listA)) {
                        ReleaseLogUtil.a("R_HealthHeadLinesCardData", "audioItemList or detailList is empty. init by backup plan.");
                        HealthHeadLinesCardData.this.e(sneVarS);
                        return;
                    }
                    if (gdyVarJ == null) {
                        smp.b().ab();
                    }
                    gdy gdyVarJ2 = listA.get(listA.size() - 1);
                    snk snkVar = listD.get(listD.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(gdyVarJ2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(snkVar);
                    smpVarB.d(arrayList, arrayList2);
                    ReleaseLogUtil.d("R_HealthHeadLinesCardData", "accept, current play state = ", Integer.valueOf(smpVarB.q()));
                    LogUtil.a("HealthHeadLinesCardData", "initHealthHeadlinesListHistoryData audioItems today item = ", gdyVarJ2);
                    if (smpVarB.q() == 3) {
                        gdyVarJ2 = smpVarB.j();
                    }
                    gdy gdyVar = gdyVarJ;
                    if (gdyVar == null || !qqt.b(gdyVar).equals(qqt.b(gdyVarJ2))) {
                        HealthHeadLinesCardData.this.b(gdyVarJ2, smpVarB.q());
                    }
                    ReleaseLogUtil.d("R_HealthHeadLinesCardData", "dealWithWorkoutDetailAndInitHolder end.");
                    return;
                }
                ReleaseLogUtil.a("R_HealthHeadLinesCardData", "data is empty. init by backup plan.");
                HealthHeadLinesCardData.this.e(sneVarS);
            }
        }, b(sneVarS), lsl.c(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<snn> list) {
        LogUtil.a("HealthHeadLinesCardData", "sortAudioWorkoutDetailData before data：", list.toString());
        Collections.sort(list, new Comparator() { // from class: slb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HealthHeadLinesCardData.d((snn) obj, (snn) obj2);
            }
        });
    }

    public static /* synthetic */ int d(snn snnVar, snn snnVar2) {
        if (snnVar == null || snnVar2 == null) {
            return 0;
        }
        String strA = snnVar.a();
        String strA2 = snnVar2.a();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            return 0;
        }
        try {
            return Long.compare(DateFormatUtil.d(strA, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD).getTime(), DateFormatUtil.d(strA2, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD).getTime());
        } catch (ParseException unused) {
            LogUtil.e("HealthHeadLinesCardData", "Covert Time Format Exception");
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(sne sneVar) {
        if (sneVar == null || njy.e(sneVar.b())) {
            ReleaseLogUtil.a("R_HealthHeadLinesCardData", "mediaInfo is null. setHolder fail.");
        } else {
            b(sneVar.b().get(0), smp.b().q());
        }
    }

    private long b(sne sneVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sneVar == null || njy.e(sneVar.b())) {
            ReleaseLogUtil.d("R_HealthHeadLinesCardData", "getPlayList is null. setHolder fail. try to get one month detailInfo.");
            return ezo.d(skz.b(jCurrentTimeMillis, -29));
        }
        long jD = skz.d(sneVar.e().get(0));
        LogUtil.a("R_HealthHeadLinesCardData", "cacheWorkoutDetailDate = ", Long.valueOf(jD), "; todayTime = ", Long.valueOf(jCurrentTimeMillis));
        return lsl.r(Math.min(jD, jCurrentTimeMillis));
    }

    private void h() {
        ObserverManagerUtil.a(this.i, "HOME_RECYCLE_VIEW_MOVE");
        ObserverManagerUtil.a(this.d, "com.huawei.plugin.account.logout");
        ObserverManagerUtil.a(this.d, "com.huawei.plugin.account.login");
    }

    private Context b() {
        Context context = this.e.get();
        return context != null ? context : BaseApplication.getContext();
    }

    private void d() {
        HashMap map = new HashMap(16);
        map.put(ParamConstants.CallbackMethod.ON_SHOW, 1);
        LogUtil.a("HealthHeadLinesCardData", "HEALTH_HEADLINES_SHOW_1100053 healthHeadLinesMap = ", map);
        lmf.d().c(b(), AnalyticsValue.HEALTH_HEADLINES_SHOW_1100053.value(), map, 0);
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        ReleaseLogUtil.d("R_HealthHeadLinesCardData", "onDestroy");
        HealthHeadLinesCardViewHolder healthHeadLinesCardViewHolder = this.g;
        if (healthHeadLinesCardViewHolder != null) {
            healthHeadLinesCardViewHolder.e();
        }
        super.onDestroy();
        LogUtil.a("HealthHeadLinesCardData", "onDestroy");
        h();
    }
}
