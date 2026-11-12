package defpackage;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.gson.JsonParser;
import com.mi.health.course.export.CourseApiKt;
import com.mi.health.course.export.data.CourseNewEquipmentBenefits;
import com.mi.health.course.export.data.CourseVipInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.webview.OptionButton;
import com.xiaomi.fitness.webview.OptionMenu;
import com.xiaomi.fitness.webview.bean.WebviewData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class lxb extends kad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ysc f25519a;

    public lxb(Context context, iqc iqcVar, ysc yscVar) {
        super(context, iqcVar);
        this.f25519a = yscVar;
    }

    public static /* synthetic */ Unit m(int i, CourseNewEquipmentBenefits courseNewEquipmentBenefits) {
        courseNewEquipmentBenefits.setStatus(Integer.valueOf(i));
        return null;
    }

    public static /* synthetic */ Unit n() {
        return null;
    }

    public static /* synthetic */ Unit o(CourseVipInfo courseVipInfo) {
        return null;
    }

    public static /* synthetic */ Unit p() {
        return null;
    }

    @JavascriptInterface
    public void addPlanSuccess() {
    }

    public final boolean k() {
        iqc iqcVar = this.webViewPage;
        return iqcVar == null || iqcVar.isInValid();
    }

    public final /* synthetic */ void l(WebviewData webviewData) {
        this.f25519a.onFeedbackResult(Boolean.valueOf(webviewData.isResolved()));
    }

    @JavascriptInterface
    public void onFeedbackResult(String str) {
        final WebviewData webviewData = (WebviewData) xpd.f(str, WebviewData.class);
        if (webviewData != null) {
            this.mainHandler.post(new Runnable() { // from class: kxb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24388a.l(webviewData);
                }
            });
        }
    }

    public final /* synthetic */ void q(OptionButton optionButton) {
        this.f25519a.showOptionButton(optionButton);
    }

    public final /* synthetic */ void r(OptionMenu optionMenu) {
        this.f25519a.showPopMenu(optionMenu);
    }

    @JavascriptInterface
    public void refreshCourseVipData(String str) {
        try {
            final int asInt = JsonParser.parseString(str).getAsJsonObject().get("status").getAsInt();
            CourseApiKt.getCourseApi().getNewEquipmentBenefits(new Function1() { // from class: dxb
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return lxb.m(asInt, (CourseNewEquipmentBenefits) obj);
                }
            }, new Function0() { // from class: exb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return lxb.n();
                }
            });
            if (asInt == 1) {
                CourseApiKt.getCourseApi().refreshCourseVipData(new Function1() { // from class: fxb
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return lxb.o((CourseVipInfo) obj);
                    }
                }, new Function0() { // from class: gxb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return lxb.p();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    @JavascriptInterface
    public void removePlanSuccess() {
    }

    public final /* synthetic */ void s(String str) {
        this.f25519a.showTitleBar(str);
    }

    @JavascriptInterface
    public void setAlertTime(int i, long j) {
    }

    @JavascriptInterface
    public void setOptionButton(String str) {
        final OptionButton optionButton;
        Logger.i("HealthJavaScriptImpl", "setOptionButton:" + str);
        if (k() || str == null || this.f25519a == null || (optionButton = (OptionButton) xpd.f(str, OptionButton.class)) == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: jxb
            @Override // java.lang.Runnable
            public final void run() {
                this.f23216a.q(optionButton);
            }
        });
    }

    @JavascriptInterface
    public void setPopMenu(String str) {
        final OptionMenu optionMenu;
        if (k() || str == null || this.f25519a == null || (optionMenu = (OptionMenu) xpd.f(str, OptionMenu.class)) == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: ixb
            @Override // java.lang.Runnable
            public final void run() {
                this.f22190a.r(optionMenu);
            }
        });
    }

    @JavascriptInterface
    public void setTitleBar(final String str) {
        if (k() || this.f25519a == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: cxb
            @Override // java.lang.Runnable
            public final void run() {
                this.f14825a.s(str);
            }
        });
    }

    public final /* synthetic */ void t(OptionButton.MenuItem menuItem) {
        this.f25519a.triggerShare(menuItem);
    }

    @JavascriptInterface
    public void triggerShare(String str) {
        final OptionButton.MenuItem menuItem;
        if (k() || str == null || this.f25519a == null || (menuItem = (OptionButton.MenuItem) xpd.f(str, OptionButton.MenuItem.class)) == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: hxb
            @Override // java.lang.Runnable
            public final void run() {
                this.f20563a.t(menuItem);
            }
        });
    }
}
