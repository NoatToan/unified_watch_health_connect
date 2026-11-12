package com.huawei.health.interactor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.dialog.CustomAdViewDialog;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.oxi;
import defpackage.qqf;
import defpackage.ugn;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.IoUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class OperationAdInteractor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomAdViewDialog f7197c;
    private final Context e;
    private Handler h;
    private Window d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f7195a = new a();
    private String i = "2018YearReport";
    private String g = "G0002018";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7196b = false;
    private final MessageCenterApi f = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);

    public OperationAdInteractor(Context context) {
        this.e = context;
    }

    public void a(Handler handler) {
        this.h = handler;
        h();
    }

    public boolean d() {
        if (Utils.o() || CommonUtil.ca()) {
            return false;
        }
        String accountInfo = LoginInit.getInstance(this.e).getAccountInfo(1011);
        LogUtil.a("Login_AdUtils", "isAllowShowYearReport() huid=" + accountInfo);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10006), g());
        LogUtil.a("Login_AdUtils", "isAllowShowYearReport() with alert count=", strE, "current date=", Long.valueOf(jCurrentTimeMillis));
        String strE2 = SharedPreferenceManager.e(this.e, Integer.toString(10006), accountInfo + "key_ui_year_report_time");
        long jD = oxi.d(strE2);
        LogUtil.a("Login_AdUtils", "isAllowShowYearReport() history date =" + strE2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jD);
        Calendar calendarI = i();
        if (!TextUtils.isEmpty(strE) && oxi.a(strE) >= 3) {
            LogUtil.a("Login_AdUtils", "isAllowShowYearReport() alert times reach maxtimes");
            return false;
        }
        if (jCurrentTimeMillis > 1580486399000L) {
            LogUtil.a("Login_AdUtils", "isAllowShowYearReport() alert reach endDate");
            return false;
        }
        if (!TextUtils.isEmpty(strE2) && calendarI.get(5) <= calendar.get(5) && calendarI.get(2) == calendar.get(2)) {
            LogUtil.a("Login_AdUtils", "isAllowShowYearReport() alert date same date");
            return false;
        }
        e(strE, jCurrentTimeMillis, accountInfo);
        return true;
    }

    public void e(String str, long j, String str2) {
        LogUtil.a("Login_AdUtils", "yearReportAlertInfoUpdate() update alertInfo with count =", str, "currentDate=", Long.valueOf(j));
        if (TextUtils.isEmpty(str)) {
            SharedPreferenceManager.e(this.e, Integer.toString(10006), g(), "1", new StorageParams());
        } else {
            SharedPreferenceManager.e(this.e, Integer.toString(10006), g(), String.valueOf(oxi.a(str) + 1), new StorageParams());
        }
        SharedPreferenceManager.e(this.e, Integer.toString(10006), str2 + "key_ui_year_report_time", String.valueOf(j), new StorageParams());
    }

    public void b() {
        LogUtil.a("Login_AdUtils", "showYearReport() show year report");
        GRSManager.c(this.e).d("achievementUrl", new GrsQueryCallback() { // from class: com.huawei.health.interactor.OperationAdInteractor.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String str2 = str + "/web/annualHtml/annualReport2019.html";
                LogUtil.d("Login_AdUtils", "webUrl2019= ", str2);
                int i = OperationAdInteractor.this.i().get(1);
                OperationAdInteractor.this.g = "G000" + i;
                OperationAdInteractor.this.i = i + "YearReport";
                OperationAdInteractor.this.h.obtainMessage(200, new e(null, str2, OperationAdInteractor.this.g, OperationAdInteractor.this.i, "2")).sendToTarget();
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.e("Login_AdUtils", "onCallBackFail errorCode = ", Integer.valueOf(i));
            }
        });
    }

    public void e() {
        Context context;
        LogUtil.a("Login_AdUtils", "registerReceiver CloseAgreeDialogsReceiver");
        IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        if (this.f7195a == null || (context = this.e) == null) {
            return;
        }
        BroadcastManagerUtil.a(context.getApplicationContext(), this.f7195a, intentFilter);
    }

    public void j() {
        Context context;
        LogUtil.a("Login_AdUtils", "unregisterReceiver CloseAgreeDialogsReceiver");
        if (this.f7195a == null || (context = this.e) == null) {
            return;
        }
        context.getApplicationContext().unregisterReceiver(this.f7195a);
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(intent.getAction()) || !"homekey".equals(intent.getStringExtra("reason")) || OperationAdInteractor.this.d == null) {
                return;
            }
            LogUtil.a("Login_AdUtils", "setWindowAnimations(0) homekey");
            if (OperationAdInteractor.this.d.getAttributes().windowAnimations != 0) {
                LogUtil.a("Login_AdUtils", "setWindowAnimations(0) homekey windowAnimations != 0");
                OperationAdInteractor.this.d.setWindowAnimations(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Calendar i() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        return calendar;
    }

    private String g() {
        return LoginInit.getInstance(this.e).getAccountInfo(1011) + "key_ui_year_report_alert_count_" + i().get(1);
    }

    private void h() {
        LogUtil.a("Login_AdUtils", "getHomeDialogMessage enter");
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10000), "health_msg_switch_promotion");
        LogUtil.a("Login_AdUtils", "getHomeDialogMessage promotionRecommend = " + strE);
        if ("0".equals(strE)) {
            return;
        }
        ThreadPoolManager.c().b("Login_AdUtils", new Runnable() { // from class: com.huawei.health.interactor.OperationAdInteractor.2
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Login_AdUtils", "getHomeDialogMessage execute");
                if (!OperationAdInteractor.this.f7196b) {
                    List<MessageObject> messages = OperationAdInteractor.this.f.getMessages(26);
                    boolean zB = njy.b(messages);
                    OperationAdInteractor.this.f7196b = true;
                    LogUtil.a("Login_AdUtils", "getHomeDialogMessage isHasData = ", Boolean.valueOf(zB));
                    if (OperationAdInteractor.this.d()) {
                        OperationAdInteractor.this.b();
                        return;
                    } else if (zB) {
                        LogUtil.d("Login_AdUtils", "getHomeDialogMessage dialogMessageList = ", messages.get(0));
                        OperationAdInteractor.this.d(messages.get(0));
                        return;
                    } else {
                        LogUtil.j("Login_AdUtils", "getHomeDialogMessage is other condition");
                        return;
                    }
                }
                LogUtil.a("Login_AdUtils", "has show");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MessageObject messageObject) {
        LogUtil.a("Login_AdUtils", "downloadAdImage");
        final String imgUri = messageObject.getImgUri();
        String detailUri = messageObject.getDetailUri();
        final String msgId = messageObject.getMsgId();
        final String msgTitle = messageObject.getMsgTitle();
        final String module = messageObject.getModule();
        if (TextUtils.isEmpty(msgId) || this.e == null) {
            return;
        }
        if (TextUtils.isEmpty(imgUri) || TextUtils.isEmpty(detailUri)) {
            this.f.setMessageRead(msgId);
        } else {
            oet.d().c(imgUri, new ugn().getHeaders(), ofe.c((Object) null), Response.class, new ResultCallback<Response>() { // from class: com.huawei.health.interactor.OperationAdInteractor.5
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Response response) {
                    OperationAdInteractor.this.a(response, imgUri, msgId, msgTitle, module);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.a("Login_AdUtils", "downloadAdImage onFailure");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Response response, String str, String str2, String str3, String str4) {
        LogUtil.a("Login_AdUtils", "downloadAdImage onResponse");
        ResponseBody body = response.getBody();
        if (body == null || !response.isSuccessful()) {
            LogUtil.a("Login_AdUtils", "downloadAdImage null==responseBody || !response.isSuccessful()");
            return;
        }
        LogUtil.a("Login_AdUtils", "downloadAdImage contentLength = " + body.getContentLength());
        InputStream inputStream = body.getInputStream();
        try {
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                IoUtils.c(inputStream);
                if (bitmapDecodeStream == null) {
                    LogUtil.j("Login_AdUtils", "downloadAdImage null = bitmap");
                    return;
                }
                LogUtil.a("Login_AdUtils", "bitmap width:", Integer.valueOf(bitmapDecodeStream.getWidth()), " heigh:", Integer.valueOf(bitmapDecodeStream.getHeight()));
                if ("2".equals(str4) && (bitmapDecodeStream = qqf.c(bitmapDecodeStream, qqf.e(R.drawable.message_ad, this.e), this.e.getResources().getString(R.string.IDS_messageCenter_ad_logo), this.e)) == null) {
                    LogUtil.a("Login_AdUtils", "downloadAdImage newBitmap == null");
                    return;
                }
                Bitmap bitmap = bitmapDecodeStream;
                LogUtil.a("Login_AdUtils", "newBitmap width:", Integer.valueOf(bitmap.getWidth()), " heigh:", Integer.valueOf(bitmap.getHeight()));
                this.h.obtainMessage(200, new e(bitmap, str, str2, str3, str4)).sendToTarget();
            } catch (IllegalArgumentException unused) {
                LogUtil.e("getBitmap IllegalArgumentException", new Object[0]);
                IoUtils.c(inputStream);
            }
        } catch (Throwable th) {
            IoUtils.c(inputStream);
            throw th;
        }
    }

    public void c() {
        LogUtil.a("Login_AdUtils", "enter is_dialog_dismiss()");
        CustomAdViewDialog customAdViewDialog = this.f7197c;
        if (customAdViewDialog == null || !customAdViewDialog.a()) {
            return;
        }
        LogUtil.a("Login_AdUtils", "dialog_dismiss");
        this.f7197c.dismiss();
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f7204c;
        private String d;
        private String e;

        private e(Bitmap bitmap, String str, String str2, String str3, String str4) {
            this.f7204c = bitmap;
            this.d = str;
            this.f7202a = str2;
            this.e = str3;
            this.f7203b = str4;
        }
    }

    public void a() {
        LogUtil.a("Login_AdUtils", "onDestroy");
        this.f7195a = null;
        CustomAdViewDialog customAdViewDialog = this.f7197c;
        if (customAdViewDialog != null) {
            customAdViewDialog.dismiss();
            this.f7197c = null;
        }
        if (this.d != null) {
            this.d = null;
        }
    }
}
