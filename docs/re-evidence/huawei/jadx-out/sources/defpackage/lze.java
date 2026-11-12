package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lze {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41184b = new Object();
    private static lze d;
    private ExtendHandler e;
    private String j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41185a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lzf f41186c = lzf.a();
    private Map<String, Boolean> f = new HashMap(16);

    private lze() {
    }

    public boolean e(String str) {
        Boolean bool = this.f.get(str);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        LogUtil.a("HwSportAppMarketManger", "getRedDotStatus deviceIdentity : ", lzf.e(str), "; status : ", Boolean.valueOf(zBooleanValue));
        return zBooleanValue;
    }

    public void c(String str, boolean z) {
        a();
        LogUtil.a("HwSportAppMarketManger", "setRedDotStatus deviceIdentity : ", lzf.e(str), "; status : ", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f.put(str, Boolean.valueOf(z));
    }

    public void a() {
        this.f.clear();
        LogUtil.a("HwSportAppMarketManger", "clearRedDotStatus");
    }

    public void d(String str) {
        ReleaseLogUtil.d("DEVMGR_HwSportAppMarketManger", "installWatchFaceApp");
    }

    public static lze c() {
        lze lzeVar;
        LogUtil.a("HwSportAppMarketManger", "getInstance()");
        synchronized (f41184b) {
            if (d == null) {
                d = new lze();
            }
            lzeVar = d;
        }
        return lzeVar;
    }

    public void d() {
        this.f41185a = false;
        h();
    }

    private void h() {
        this.f41186c.d(new IBaseResponseCallback() { // from class: lze.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    ReleaseLogUtil.d("DEVMGR_HwSportAppMarketManger", "showAppMarketViewHelper is not agree user agreement");
                    lze.this.c(1, 0);
                } else {
                    ReleaseLogUtil.d("DEVMGR_HwSportAppMarketManger", "showAppMarketViewHelper is agree user agreement");
                    lze.this.c(2, 0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ReleaseLogUtil.d("DEVMGR_HwSportAppMarketManger", "startAppMarket");
        lyy.b().d(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Activity activity = BaseApplication.getActivity();
        if (activity == null || activity.isFinishing() || !this.f41185a) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        ReleaseLogUtil.d("DEVMGR_HwSportAppMarketManger", "showMarketPrivacyDialog");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.a(R.string.IDS_application_market_dialog_title);
        builder.d(this.f41186c.e(b("/terms/scope/huawei/appgallery-wear/terms.htm?code="), b("/terms/scope/huawei/appgallery-wear/privacy-statement.htm?code=")));
        builder.e(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: lze.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                lze.this.e();
            }
        });
        builder.a(R.string.IDS_user_watchFace_permission_ok, new View.OnClickListener() { // from class: lze.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("HwSportAppMarketManger", "showMarketPrivacyDialog is true");
                SharedPreferenceManager.c(BaseApplication.getContext(), true);
                mhs.a().setSwitchSetting("app_market_privacy_service_status", "1", null);
                lze.this.j();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: renamed from: lze$3, reason: invalid class name */
    class AnonymousClass3 extends ClickableSpan {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41187c;

        AnonymousClass3(String str) {
            this.f41187c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            LogUtil.a("HwSportAppMarketManger", "getClickableSpan onClick");
            final Activity activity = BaseApplication.getActivity();
            if (activity != null) {
                if (lze.this.j != null) {
                    LogUtil.a("HwSportAppMarketManger", "getClickableSpan url :", CommonUtil.r(lze.this.j));
                    final String str = this.f41187c;
                    activity.runOnUiThread(new Runnable() { // from class: lzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f41193c.c(activity, str);
                        }
                    });
                    return;
                }
                LogUtil.j("HwSportAppMarketManger", "getClickableSpan mUrl or context is null");
                return;
            }
            LogUtil.j("HwSportAppMarketManger", "getClickableSpan onClick topActivity is null");
        }

        /* synthetic */ void c(Activity activity, String str) {
            Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", lze.this.c(str));
            lzf.a(activity, intent, "HwSportAppMarketManger");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#fb6522"));
            textPaint.setUnderlineText(false);
        }
    }

    private ClickableSpan b(String str) {
        return new AnonymousClass3(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        return this.j + (str + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010) + Constants.LANGUAGE + LanguageUtil.a());
    }

    public void b() {
        a(null);
    }

    public void a(final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().a("HwSportAppMarketManger", new Runnable() { // from class: lze.2
            @Override // java.lang.Runnable
            public void run() {
                lze.this.j = GRSManager.c(BaseApplication.getContext()).getUrl("domainPrivacyLegalCloudHuawei");
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(0, "");
                }
            }
        });
    }

    public void c(DeviceCapability deviceCapability, IBaseResponseCallback iBaseResponseCallback) {
        this.f41186c.b(deviceCapability, iBaseResponseCallback);
    }

    public void a(int i, Object obj) {
        if (i == 8) {
            mhs.a().setSwitchSetting("app_market_privacy_service_status", "2", null);
        } else {
            LogUtil.j("HwSportAppMarketManger", "setAppMarketParameter type is error");
        }
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            LogUtil.a("HwSportAppMarketManger", "handleMessage message what:", Integer.valueOf(message.what));
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    lze.this.j();
                    return true;
                }
                LogUtil.j("HwSportAppMarketManger", "handleMessage default");
                return false;
            }
            final Activity activity = BaseApplication.getActivity();
            if (activity == null) {
                ReleaseLogUtil.d("DEVMGR_HwSportAppMarketManger", "handleMessage topActivity is null");
                return true;
            }
            activity.runOnUiThread(new Runnable() { // from class: lze.d.1
                @Override // java.lang.Runnable
                public void run() {
                    lze.this.c(activity);
                }
            });
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        this.e = HandlerCenter.b(new d(), "HwSportAppMarketManger");
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        this.e.sendMessage(messageObtain, i2);
    }
}
