package com.huawei.ui.main.stories.me.views.builder;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.H5proUtil;
import defpackage.qrs;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyClickableSpan extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28546a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PrivacyClickable f28547c;
    private String d;
    private Context e;

    public interface PrivacyClickable {
        void onClick(int i);
    }

    public PrivacyClickableSpan(Context context, final int i) {
        this.e = context;
        this.f28546a = i;
        ThreadPoolManager.c().execute(new Runnable() { // from class: vwk
            @Override // java.lang.Runnable
            public final void run() {
                this.f51656b.e(i);
            }
        });
    }

    public /* synthetic */ void e(int i) {
        if (i == 0) {
            this.d = b();
            return;
        }
        if (i == 1) {
            this.d = a();
        } else if (i == 2) {
            this.d = c();
        } else if (i == 3) {
            this.d = d();
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        String str;
        LogUtil.a("PrivacyClickableSpan", "ClickableSpan_onClick");
        if (qrs.c(500)) {
            LogUtil.j("PrivacyClickableSpan", "ClickableSpan_onClick isFastClick");
            return;
        }
        if (this.e == null || (str = this.d) == null) {
            LogUtil.j("PrivacyClickableSpan", "ClickableSpan_onClick mContext == null || mUrl == null");
            return;
        }
        if (str.startsWith("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5") || this.d.startsWith("huaweihealth://huaweihealth.app/openwith?type=aar&urlType=4&pName=com.huawei.health&address=")) {
            MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
            if (marketRouterApi != null) {
                marketRouterApi.router(this.d);
            }
        } else {
            H5proUtil.jumpFromDeeplink(this.e, this.d);
        }
        PrivacyClickable privacyClickable = this.f28547c;
        if (privacyClickable != null) {
            privacyClickable.onClick(this.f28546a);
        }
    }

    public void c(PrivacyClickable privacyClickable) {
        this.f28547c = privacyClickable;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#fb6522"));
            textPaint.setUnderlineText(false);
        }
    }

    private String b() {
        String commonCountryCode = GRSManager.c(this.e).getCommonCountryCode();
        return GRSManager.c(this.e).getNoCheckUrl("domainConsumerHuawei", commonCountryCode) + "/" + commonCountryCode.toLowerCase(Locale.ROOT) + "/legal/privacy-questions/?forceDarkMode=0";
    }

    private String a() {
        return "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.knowledge?h5pro=true&isImmerse&showStatusBar=true&urlType=4&pName=com.huawei.health&path=RecommendAlgorithms";
    }

    private String c() {
        return "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.privacy-collection-display?h5pro=true&urlType=4&pName=com.huawei.health&path=healthAssessment";
    }

    private String d() {
        return "huaweihealth://huaweihealth.app/openwith?type=aar&urlType=4&pName=com.huawei.health&address=" + GRSManager.c(this.e).getUrl("domainContentcenterDbankcdnNew") + "/cch5/health/watchFace/index.html#/tags?from=recommendationSwitch";
    }
}
