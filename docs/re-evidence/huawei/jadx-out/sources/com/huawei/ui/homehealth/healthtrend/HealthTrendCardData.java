package com.huawei.ui.homehealth.healthtrend;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.R;
import defpackage.ddv;
import defpackage.qqp;
import defpackage.son;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes17.dex */
public class HealthTrendCardData extends AbstractBaseCardData {
    private static XmlResourceParser e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f25556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private son f25558c;

    public HealthTrendCardData(Context context) {
        this.f25557b = context;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ddv.b().initH5Pro();
        XmlResourceParser xmlResourceParser = e;
        if (xmlResourceParser != null) {
            try {
                this.f25556a = layoutInflater.inflate((XmlPullParser) xmlResourceParser, viewGroup, false);
                e.close();
                e = null;
                LogUtil.a("HealthTrendCardData", "pre parser time is : ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                e.close();
                e = null;
                throw th;
            }
        } else {
            this.f25556a = layoutInflater.inflate(R.layout.health_trend_card, viewGroup, false);
            LogUtil.a("HealthTrendCardData", "no pre parser time is : ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        this.f25558c = new son(this.f25556a, this.f25557b, false);
        this.f25556a.setVisibility(8);
        if (!LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.a("HealthTrendCardData", "Logined health trend show H5 webview");
            c();
        }
        LogUtil.a("HealthTrendCardData", "getCardViewHolder total time is ：", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        return this.f25558c;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "HealthTrendCardData";
    }

    public static void a() {
        e = BaseApplication.b().getResources().getLayout(R.layout.health_trend_card);
    }

    private void c() {
        if (this.f25556a == null) {
            return;
        }
        LogUtil.a("HealthTrendCardData", "show H5 webview");
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthtrend.HealthTrendCardData.5
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) HealthTrendCardData.this.f25556a.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.bottomMargin = qqp.a(BaseApplication.b(), 12.0f);
                HealthTrendCardData.this.f25556a.setLayoutParams(layoutParams);
                HealthTrendCardData.this.f25556a.setVisibility(0);
            }
        });
    }

    private void e() {
        if (this.f25556a == null) {
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthtrend.HealthTrendCardData.4
            @Override // java.lang.Runnable
            public void run() {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) HealthTrendCardData.this.f25556a.getLayoutParams();
                layoutParams.height = 0;
                layoutParams.bottomMargin = 0;
                HealthTrendCardData.this.f25556a.setLayoutParams(layoutParams);
                HealthTrendCardData.this.f25556a.setVisibility(8);
            }
        });
    }

    private boolean b() {
        if (this.f25558c == null || this.f25556a == null) {
            LogUtil.j("HealthTrendCardData", "ViewHolder is null");
            return false;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            if (this.f25556a.getVisibility() == 0) {
                LogUtil.a("HealthTrendCardData", "loginout hide itemview");
                e();
            }
            return false;
        }
        LogUtil.a("HealthTrendCardData", "begin to refresh CardData");
        if (this.f25556a.getVisibility() != 8) {
            return true;
        }
        LogUtil.a("HealthTrendCardData", "H5 Card is hide, need to show Card");
        c();
        return true;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        LogUtil.a("HealthTrendCardData", "login change H5 need to refresh Card");
        if (b()) {
            this.f25558c.b();
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (b()) {
            this.f25558c.a();
            this.f25558c.e();
        }
        ReleaseLogUtil.d("HealthTrendCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        son sonVar = this.f25558c;
        if (sonVar == null) {
            LogUtil.j("HealthTrendCardData", "ViewHolder is null");
        } else {
            sonVar.c();
        }
    }
}
