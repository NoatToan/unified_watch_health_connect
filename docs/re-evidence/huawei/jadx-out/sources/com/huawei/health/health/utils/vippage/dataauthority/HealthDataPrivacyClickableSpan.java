package com.huawei.health.health.utils.vippage.dataauthority;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qrs;

/* JADX INFO: loaded from: classes28.dex */
public class HealthDataPrivacyClickableSpan extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PrivacyClickable f7112a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7113c;
    private String d;

    public interface PrivacyClickable {
        void onClick();
    }

    public HealthDataPrivacyClickableSpan(Context context) {
        this.f7113c = context;
        ThreadPoolManager.c().execute(new Runnable() { // from class: fcu
            @Override // java.lang.Runnable
            public final void run() {
                this.f33864a.b();
            }
        });
    }

    public /* synthetic */ void b() {
        this.d = c();
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        String str;
        LogUtil.a("HealthDataPrivacyClickableSpan", "ClickableSpan_onClick");
        if (qrs.c(500)) {
            LogUtil.j("HealthDataPrivacyClickableSpan", "ClickableSpan_onClick isFastClick");
            return;
        }
        if (this.f7113c == null || (str = this.d) == null) {
            LogUtil.j("HealthDataPrivacyClickableSpan", "ClickableSpan_onClick mContext == null || mUrl == null");
            return;
        }
        AppRouter.e(Uri.parse(str)).b(this.f7113c);
        PrivacyClickable privacyClickable = this.f7112a;
        if (privacyClickable != null) {
            privacyClickable.onClick();
        }
    }

    public void b(PrivacyClickable privacyClickable) {
        this.f7112a = privacyClickable;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#fb6522"));
            textPaint.setUnderlineText(false);
        }
    }

    private String c() {
        return "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.privacy-collection-display?h5pro=true&urlType=4&pName=com.huawei.health&path=healthAssessment";
    }
}
