package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.activity.PrivacyCenterActivity;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile wss f52420a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f52422c;
    private Timer g;
    private Handler h;
    private CommonDialog21 i = null;
    private String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f52421b = BaseApplication.getContext();
    private IWXAPI d = g();

    static /* synthetic */ void a(View view) {
    }

    static /* synthetic */ void c(View view) {
    }

    private wss() {
    }

    private void j() {
        if (TextUtils.isEmpty(this.f52422c)) {
            this.f52422c = GRSManager.c(this.f52421b).getUrl("healthCloudUrl");
        }
    }

    public static wss d(Context context) {
        if (f52420a == null) {
            synchronized (wss.class) {
                if (f52420a == null) {
                    f52420a = new wss();
                }
            }
        }
        return f52420a;
    }

    public void a(Handler handler) {
        LogUtil.a("UIME_WeChatInteactors", "setWeChatHandler()");
        this.h = handler;
    }

    private void f() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        try {
            this.e = new String(whiteBoxManagerB.a(Base64.decode(whiteBoxManagerB.a(1, 17) + whiteBoxManagerB.a(1, 1017) + whiteBoxManagerB.a(1, 2017), 0)), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.e("UIME_WeChatInteactors", "initAppID appid UnsupportedEncodingException, exception is ", e.getMessage());
        } catch (Exception unused) {
            LogUtil.e("UIME_WeChatInteactors", "initAppID Exception");
        }
    }

    private IWXAPI g() {
        if (TextUtils.isEmpty(this.e)) {
            f();
            IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.f52421b, this.e, false);
            this.d = iwxapiCreateWXAPI;
            iwxapiCreateWXAPI.registerApp(this.e);
        }
        return this.d;
    }

    public void a(Context context) {
        LogUtil.a("UIME_WeChatInteactors", "go2WeChatHandle start");
        if (context == null) {
            LogUtil.e("UIME_WeChatInteactors", "context is null!");
            return;
        }
        if (this.h == null) {
            this.h = new Handler();
        }
        if ("false".equals(wmq.a(context.getApplicationContext()).c(3))) {
            LogUtil.j("UIME_WeChatInteactors", "syncSportStatus is false.");
            d(context, R.string.IDS_hw_healt_data_share_wechat_rank_list);
        } else if (!CommonUtil.ab(context.getApplicationContext())) {
            LogUtil.a("UIME_WeChatInteactors", "go2WeChatHandle no network!");
            qpx.e(context.getApplicationContext(), R.string.IDS_connect_network);
        } else {
            g(context);
        }
    }

    private void g(Context context) {
        if (!g().isWXAppInstalled()) {
            LogUtil.a("UIME_WeChatInteactors", "go2WeChatHandle WeChat is not installed! start install it ");
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.tencent.mm"));
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                LogUtil.e("UIME_WeChatInteactors", "go2WeChatHandle install Exception exception = ", e.getMessage());
                j(context);
                return;
            }
        }
        h(context);
        f(context);
    }

    private void f(final Context context) {
        final Activity activityJ;
        if (context instanceof Activity) {
            activityJ = (Activity) context;
        } else {
            activityJ = com.huawei.haf.application.BaseApplication.j();
        }
        lsy.a(new Runnable() { // from class: wsw
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(context, activityJ);
            }
        });
    }

    /* synthetic */ void d(final Context context, Activity activity) {
        final boolean zB = b(context);
        if (activity == null) {
            LogUtil.j("UIME_WeChatInteactors", "activity is null");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: wsu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52446c.b(context, zB);
                }
            });
        }
    }

    /* synthetic */ void b(Context context, boolean z) {
        Intent intent = new Intent();
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        if (z) {
            intent.setClassName(context, "com.huawei.ui.thirdpartservice.activity.wechat.WeChatHealthActivity");
        } else {
            intent.setClassName(context, "com.huawei.ui.thirdpartservice.activity.wechat.WeChatConnectActivity");
        }
        if (context == null) {
            BaseApplication.getContext().startActivity(intent);
        } else {
            context.startActivity(intent);
        }
        a();
    }

    public boolean b(Context context) {
        return "true".equals(c(context));
    }

    private void j(Context context) {
        if (context instanceof Activity) {
            String upperCase = context.getString(R.string.IDS_common_notification_know_tips).toUpperCase(Locale.ENGLISH);
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.a(context.getString(R.string.IDS_hw_data_share_app_not_install)).a(upperCase, new View.OnClickListener() { // from class: wsz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wss.a(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setCancelable(false);
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            noTitleCustomAlertDialogC.show();
        }
    }

    private void h(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing() || activity.getWindow() == null || activity.getWindow().getDecorView().getWindowToken() == null) {
                return;
            }
            CommonDialog21 commonDialog21A = this.i;
            if (commonDialog21A == null) {
                commonDialog21A = CommonDialog21.a(context, R.style.app_update_dialogActivity);
            }
            this.i = commonDialog21A;
            commonDialog21A.b(context.getString(R.string.IDS_wechat_public_jump_dialog));
            commonDialog21A.setCancelable(false);
            commonDialog21A.c();
            LogUtil.a("UIME_WeChatInteactors", "mJumpToHwPublicDialog.show()");
            Timer timer = this.g;
            if (timer != null) {
                timer.cancel();
            }
            this.g = new Timer("UIME_WeChatInteactors");
            this.g.schedule(new TimerTask() { // from class: wss.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (wss.this.h == null) {
                        return;
                    }
                    wss.this.h.sendEmptyMessage(202);
                }
            }, 30000L);
        }
    }

    public void a() {
        try {
            e();
        } catch (IllegalArgumentException e) {
            LogUtil.e("UIME_WeChatInteactors", "dismissJumpToHwPublicDialog exception is ", e.getMessage());
        }
    }

    private void e() {
        LogUtil.a("UIME_WeChatInteactors", "handleMessage ", "dismissJumpToHwPublicDialog ");
        CommonDialog21 commonDialog21 = this.i;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        LogUtil.a("UIME_WeChatInteactors", "dismissJumpToHwPublicDialog ", "cancel ");
        this.i.cancel();
        Timer timer = this.g;
        if (timer != null) {
            timer.cancel();
        }
        this.i = null;
    }

    public String c(Context context) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return "";
        }
        j();
        if (context == null || Utils.o()) {
            LogUtil.e("UIME_WeChatInteactors", "isUserBinded Context is null || isOversea.");
            return "";
        }
        String strC = c();
        LogUtil.a("UIME_WeChatInteactors", "isUserBinded ans is ", strC);
        String str = "BIND_WECHAT_RANK";
        KeyValDbManager.d(context).b("BIND_WECHAT_RANK", strC);
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            str = "BIND_WECHAT_RANK" + ckg.b(accountInfo);
        }
        SharedPreferenceManager.c(Integer.toString(10000), str, System.currentTimeMillis() + "_" + strC);
        return strC;
    }

    private String c() {
        chj chjVar = new chj();
        Map<String, String> headers = chjVar.getHeaders();
        final String[] strArr = {""};
        String strC = ofe.c(chjVar.getBody(new HashMap()));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oet.d().c(this.f52422c + "/dataOpen/weixin/isUserBinded", headers, strC, String.class, new ResultCallback<String>() { // from class: wss.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                try {
                    LogUtil.a("UIME_WeChatInteactors", " getUserBinded  :", str);
                    strArr[0] = new JSONObject(str).optString("result");
                } catch (JSONException e) {
                    LogUtil.a("UIME_WeChatInteactors", "getUserBinded JSONException ! exception is ", e.getMessage());
                }
                countDownLatch.countDown();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("UIME_WeChatInteactors", " getUserBinded exception :", th.getMessage());
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("UIME_WeChatInteactors", "getUserBinded Request timed out");
            }
        } catch (InterruptedException unused) {
            LogUtil.j("UIME_WeChatInteactors", " InterruptedException");
        }
        LogUtil.a("UIME_WeChatInteactors", " getUserBinded  result:", strArr[0]);
        return strArr[0];
    }

    public static void d(final Context context, int i) {
        if (context instanceof Activity) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.a(context.getString(R.string.IDS_hw_healt_data_share_wechat_tips_privacy_setting, context.getString(i))).a(context.getString(R.string.IDS_hw_open_pressure_auto_detection).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.userprofile.interactors.WeChatInteactors$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Context context2 = context;
                    context2.startActivity(new Intent(context2, (Class<?>) PrivacyCenterActivity.class));
                }
            }).d(context.getString(R.string.IDS_hw_show_cancel), new View.OnClickListener() { // from class: wsx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wss.c(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            noTitleCustomAlertDialogC.show();
        }
    }

    public static void e(final Context context) {
        if (context == null) {
            LogUtil.e("UIME_WeChatInteactors", "jumpWechatHelp error: context is null");
        } else {
            GRSManager.c(context).d("domainTipsResDbankcdn", new GrsQueryCallback() { // from class: wss.4
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        LogUtil.e("UIME_WeChatInteactors", "jumpWechatHelp error: url is empty");
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(LanguageUtil.l(context) ? "/SmartWear/WeChat/EMUI8.0/C001B001/zh-CN/index.html" : "/SmartWear/WeChat/EMUI8.0/C001B001/en-US/index.html");
                    String string = sb.toString();
                    Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
                    intent.putExtra("url", string);
                    context.startActivity(intent);
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.e("UIME_WeChatInteactors", "grs get fail:", Integer.valueOf(i));
                }
            });
        }
    }

    public void i(Context context) {
        if (context == null) {
            LogUtil.e("UIME_WeChatInteactors", "showDeviceAlreadyBinded fail: context is null");
            return;
        }
        LogUtil.a("UIME_WeChatInteactors", "showDeviceAlreadyBinded enter");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
        builder.e(context.getString(R.string.IDS_hw_wechat_rank_show_common_title)).a(context.getString(R.string.IDS_hw_wechat_rank_bind_title_common_dialog_content_new)).a(context.getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: wsv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("UIME_WeChatInteactors", "showDeviceAlreadyBinded setNegativeButton");
            }
        });
        builder.b(context.getString(R.string.IDS_thirdparty_wechat_qrcode_view_help).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: wtc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        builder.b().show();
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("UIME_WeChatInteactors", "showDeviceAlreadyBinded setPositiveButton");
        e(this.f52421b);
    }

    public void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wsy
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (!otu.b(this.f52421b).f() && "true".equals(c(this.f52421b))) {
            LogUtil.a("UIME_WeChatInteactors", "checkWeChatAndAliBind done");
            SharedPreferenceManager.e(this.f52421b, Integer.toString(10000), "wechat_red_dot_show", "true", new StorageParams());
            otu.b(BaseApplication.getContext()).e();
        }
    }

    public void a(String str, String str2, int i) {
        if (!g().isWXAppInstalled()) {
            LogUtil.a("UIME_WeChatInteactors", "WeChat is not installed");
            qpx.e(this.f52421b, R.string.IDS_plugin_socialshare_install_wechat);
            return;
        }
        qpx.e(this.f52421b, R.string.IDS_hw_go_wechat_for_consultation);
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = str;
        req.path = str2;
        req.miniprogramType = i;
        g().sendReq(req);
    }
}
