package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.versionmgr.betaversionmgr.BetaVersionMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.R;
import com.huawei.hwversionmgr.activity.AppUpdateDialogActivity;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.hwversionmgr.utils.service.UpdateService;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes40.dex */
public class nuq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43764a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile nuq f43765c;
    private Context f;
    private int e = 0;
    private String h = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43766b = null;
    private String d = null;
    private MessageCenterApi i = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);

    private nuq(Context context) {
        this.f = context;
    }

    public static nuq d() {
        if (f43765c == null) {
            synchronized (f43764a) {
                if (f43765c == null) {
                    f43765c = new nuq(BaseApplication.getContext());
                }
            }
        }
        return f43765c;
    }

    public void e() {
        LogUtil.a("R_AppUpdateInteractor", "autoCheckAppNewVersionService");
        Context context = this.f;
        if (context != null) {
            HwVersionManager.b(context).d(true);
        }
    }

    public void g() {
        Context context = this.f;
        if (context != null) {
            HwVersionManager.b(context).d(false);
        }
    }

    public void a() {
        LogUtil.a("R_AppUpdateInteractor", "doDownloadAppFile ");
        Context context = this.f;
        if (context != null) {
            HwVersionManager.b(context).c();
        }
    }

    public void b() {
        LogUtil.a("R_AppUpdateInteractor", "cancelDownloadApp");
        Context context = this.f;
        if (context != null) {
            HwVersionManager.b(context).b();
        }
    }

    public void k() {
        LogUtil.a("R_AppUpdateInteractor", "installApk updateContext ", this.f);
        if (this.f == null) {
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) UpdateService.class);
        intent.setAction("action_app_install_new_version");
        this.f.startService(intent);
    }

    public boolean c(long j) {
        LogUtil.a("R_AppUpdateInteractor", "checkMemory needSize = ", Long.valueOf(j));
        try {
            StatFs statFs = new StatFs(this.f.getFilesDir().getCanonicalPath());
            return ((double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()))) * 0.9d > ((double) j);
        } catch (IOException unused) {
            LogUtil.e("R_AppUpdateInteractor", "checkMemory:getCanonicalPath IOException");
            return false;
        }
    }

    public boolean n() {
        NetworkInfo activeNetworkInfo;
        LogUtil.a("R_AppUpdateInteractor", "isWifiConnected");
        return (this.f.getSystemService("connectivity") instanceof ConnectivityManager) && (activeNetworkInfo = ((ConnectivityManager) this.f.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public String e(String str) {
        Context context = this.f;
        if (context != null) {
            return HwVersionManager.b(context).t(str);
        }
        return "";
    }

    public void c(Context context) {
        e(context, 3);
    }

    public void c(Context context, Boolean bool) {
        if (bool.booleanValue()) {
            e(context, 1);
        }
    }

    public int i() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public String j() {
        return this.h;
    }

    public void d(String str) {
        this.h = str;
    }

    public String h() {
        return this.f43766b;
    }

    public void a(String str) {
        this.f43766b = str;
    }

    public String f() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    private void e(Context context, int i) {
        if (!l()) {
            LogUtil.j("R_AppUpdateInteractor", "update message inserted");
            return;
        }
        MessageObject messageObject = new MessageObject();
        messageObject.setModule(String.valueOf(19));
        messageObject.setType("device_app_update");
        messageObject.setMsgType(2);
        messageObject.setPosition(i);
        messageObject.setMsgPosition(11);
        messageObject.setHuid(SharedPreferenceUtil.getInstance(context).getUserID());
        messageObject.setMsgContent("");
        LogUtil.a("R_AppUpdateInteractor", "app update contentStr = ", "");
        String string = context.getString(R.string.IDS_messagecenter_device_app_new_version_title);
        messageObject.setMsgTitle(string);
        messageObject.setMetadata(string);
        messageObject.setExpireTime(0L);
        messageObject.setReadFlag(0);
        LogUtil.a("R_AppUpdateInteractor", "app update mstTitle = ", string);
        messageObject.setCreateTime(System.currentTimeMillis());
        if (m()) {
            messageObject.setDetailUri("messagecenter://device_app_update");
        } else {
            messageObject.setDetailUri("messagecenter://device_app_update_health");
        }
        messageObject.setImgUri("assets://localMessageIcon/ic_update.webp");
        messageObject.setMsgId(this.i.getMessageId(String.valueOf(19), "device_app_update"));
        LogUtil.a("R_AppUpdateInteractor", "makingMessage insertMessage isSuccessful:", Boolean.valueOf(this.i.insertMessage(messageObject)));
    }

    private boolean l() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("R_AppUpdateInteractor", "canInsertMessage isBrowseMode");
            return false;
        }
        String strJ = j();
        if (Arrays.asList(nvc.b().d().split(",")).contains(strJ)) {
            return false;
        }
        nvc.b().b(strJ);
        return true;
    }

    public void c() {
        LogUtil.a("R_AppUpdateInteractor", "enter deleteMessage");
        ThreadPoolManager.c().execute(new Runnable() { // from class: nuq.3
            @Override // java.lang.Runnable
            public void run() {
                List<MessageObject> messages = nuq.this.i.getMessages(String.valueOf(19), "device_app_update");
                LogUtil.a("R_AppUpdateInteractor", "makeMessage, delete messageList, messageList.size() = ", Integer.valueOf(messages.size()));
                for (MessageObject messageObject : messages) {
                    if (messageObject != null) {
                        try {
                            if (!TextUtils.isEmpty(messageObject.getMsgId())) {
                                String msgId = messageObject.getMsgId();
                                LogUtil.a("R_AppUpdateInteractor", "makingMessage deleteMessage isSuccessful:", Boolean.valueOf(nuq.this.i.deleteMessage(msgId)));
                                int i = Integer.parseInt(msgId.substring(1));
                                lsb.d().e(i);
                                LogUtil.a("R_AppUpdateInteractor", "message id:", Integer.valueOf(i));
                            }
                        } catch (NumberFormatException unused) {
                            LogUtil.e("R_AppUpdateInteractor", "deleteMessage NumberFormatException");
                        }
                    }
                }
            }
        });
    }

    public void d(Context context, Intent intent) {
        if (context == null) {
            LogUtil.j("R_AppUpdateInteractor", "showNewVersionDialog context is null");
            return;
        }
        if (intent == null) {
            LogUtil.j("R_AppUpdateInteractor", "showNewVersionDialog intent is null");
            return;
        }
        if (CommonUtil.ap()) {
            b(context, intent);
            return;
        }
        if (intent.hasExtra("name")) {
            d(intent.getStringExtra("name"));
            if (!com.huawei.haf.application.BaseApplication.h()) {
                LogUtil.j("R_AppUpdateInteractor", "showAutoCheckNewVersionDialog CommonUtil.isRunningForeground is false");
                return;
            }
        }
        if (CommonUtil.bg() && !nvd.j()) {
            g();
        } else {
            intent.setClass(context, AppUpdateDialogActivity.class);
            context.startActivity(intent);
        }
    }

    private void b(Context context, Intent intent) {
        if (!com.huawei.haf.application.BaseApplication.h() && !intent.getBooleanExtra("isManual", false)) {
            LogUtil.j("R_AppUpdateInteractor", "showAutoCheckNewVersionDialog CommonUtil.isRunningForeground is false");
            return;
        }
        if (intent.getBooleanExtra("hasNewBetaVersion", false)) {
            Intent intent2 = new Intent();
            intent2.setPackage(BaseApplication.getContext().getPackageName());
            intent2.setAction("com.huawei.health.action.BETA_APP_UPDATE_TIPS");
            LocalBroadcastManager.getInstance().sendBroadcast(intent2);
            ((BetaVersionMgrApi) Services.b("HWBetaVersionMgr", BetaVersionMgrApi.class)).showNewBetaVersionDialog(context, intent.getBooleanExtra("isManual", false));
            return;
        }
        LogUtil.a("R_AppUpdateInteractor", "not have new beta version dialog to show");
    }

    private boolean m() {
        if (!"com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            LogUtil.a("R_AppUpdateInteractor", "Package name is ", BaseApplication.getAppPackage());
            return false;
        }
        LogUtil.a("R_AppUpdateInteractor", "Package name is com.huawei.bone.");
        return true;
    }

    public void a(Boolean bool) {
        Context context = this.f;
        if (context != null) {
            HwVersionManager.b(context).b(true, bool.booleanValue());
        }
    }
}
