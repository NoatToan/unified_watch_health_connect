package com.huawei.ui.homehealth.healthtrend;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import defpackage.qdh;
import defpackage.qdm;
import defpackage.qee;
import defpackage.som;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes17.dex */
public class HealthInsightsCardData extends AbstractBaseCardData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f25553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f25554c;
    private boolean d = true;
    private som e;

    public HealthInsightsCardData(Context context) {
        this.f25554c = context;
        this.mPositionTag = 70;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f25553b = layoutInflater.inflate(R.layout.health_insights, viewGroup, false);
        this.e = new som(this.f25553b, this.f25554c, false);
        this.f25553b.setVisibility(8);
        this.e.c();
        if (!LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.a("HealthInsightsCardData", "has Login in health insights show");
            e();
            d();
        }
        LogUtil.a("HealthInsightsCardData", "getCardViewHolder total time is ：", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return this.e;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "HealthInsightsCardData";
    }

    private void e() {
        if (this.f25553b == null) {
            return;
        }
        LogUtil.a("HealthInsightsCardData", "showView");
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthtrend.HealthInsightsCardData.2
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) HealthInsightsCardData.this.f25553b.getLayoutParams();
                layoutParams.height = -2;
                HealthInsightsCardData.this.f25553b.setLayoutParams(layoutParams);
                HealthInsightsCardData.this.f25553b.setVisibility(0);
            }
        });
    }

    private void b() {
        if (this.f25553b == null) {
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthtrend.HealthInsightsCardData.4
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) HealthInsightsCardData.this.f25553b.getLayoutParams();
                layoutParams.height = 0;
                HealthInsightsCardData.this.f25553b.setLayoutParams(layoutParams);
                HealthInsightsCardData.this.f25553b.setVisibility(8);
            }
        });
    }

    private boolean c() {
        if (this.e == null || this.f25553b == null) {
            LogUtil.j("HealthInsightsCardData", "ViewHolder is null");
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            if (this.f25553b.getVisibility() == 0) {
                LogUtil.a("HealthInsightsCardData", "login out hide itemview");
                b();
            }
            return false;
        }
        LogUtil.a("HealthInsightsCardData", "begin to refresh CardData");
        if (this.f25553b.getVisibility() != 8) {
            return true;
        }
        LogUtil.a("HealthInsightsCardData", "Card is hide, need to show Card");
        e();
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        LogUtil.a("HealthInsightsCardData", "login change need to refresh Card");
        if (c()) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: sol
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d();
                }
            });
            return;
        }
        if (!CommonUtil.bu() && qdm.j()) {
            som somVar = this.e;
            if (somVar == null) {
                LogUtil.j("HealthInsightsCardData", "ViewHolder is null");
                return;
            } else {
                somVar.c();
                LogUtil.a("HealthInsightsCardData", "developer switch is open");
                return;
            }
        }
        LogUtil.a("HealthInsightsCardData", "getHealthHighlights");
        qdh.d(new ResponseCallback() { // from class: soj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f48460b.c(i, (String) obj);
            }
        });
    }

    public /* synthetic */ void c(int i, String str) {
        LogUtil.a("HealthInsightsCardData", "getSummaryToCard  errorCode ", Integer.valueOf(i), " summaryResponse ", str);
        if (i != 0) {
            LogUtil.a("HealthInsightsCardData", "getHealthHighlights error Code is: ", Integer.valueOf(i));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HealthInsightsCardData", "response is empty.");
            return;
        }
        if (!qdm.e(str)) {
            LogUtil.a("HealthInsightsCardData", "summaryResponse is not change.");
            return;
        }
        qee qeeVar = (qee) HiJsonUtil.d(str, qee.class);
        qdm.d(str);
        som somVar = this.e;
        if (somVar == null) {
            LogUtil.j("HealthInsightsCardData", "ViewHolder is null return");
        } else {
            somVar.d(qeeVar);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        som somVar = this.e;
        if (somVar != null) {
            somVar.d();
        }
        if (c() && !this.d) {
            LogUtil.a("HealthInsightsCardData", "onResume getHealthHighlights.");
            d();
        }
        this.d = false;
        ReleaseLogUtil.d("HealthInsightsCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        som somVar = this.e;
        if (somVar == null) {
            LogUtil.j("HealthInsightsCardData", "ViewHolder is null");
        } else {
            somVar.e();
        }
    }
}
