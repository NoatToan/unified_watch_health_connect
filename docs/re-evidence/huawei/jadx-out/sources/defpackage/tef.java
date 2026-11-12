package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.keepalive.KeepAliveActivity;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class tef {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49016b;

    public void e(final Context context) {
        LogUtil.a("SCUI_AlivePromptGuideSetting", "obtainUrlDomain ENTER ");
        GRSManager.c(BaseApplication.getContext()).d("domainKlgMapDtlUrl", new GrsQueryCallback() { // from class: tef.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    tef.this.f49016b = str;
                    tef.this.b(context);
                } else {
                    LogUtil.j("SCUI_AlivePromptGuideSetting", "obtainUrlDomain urlDomain is empty");
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("SCUI_AlivePromptGuideSetting", "obtainUrlDomain onCallBackFail ", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        HandlerExecutor.b(new Runnable() { // from class: tef.4
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.putExtra("keepAliveUrl", tef.this.a(context));
                intent.setClass(context, KeepAliveActivity.class);
                context.startActivity(intent);
            }
        });
    }

    public String a(Context context) {
        String strA;
        int iN = CommonUtil.n(context, LoginInit.getInstance(context).getAccountInfo(1009));
        LogUtil.a("SCUI_AlivePromptGuideSetting", "getStepAlivePromptUrl ", Integer.valueOf(iN));
        if (iN == 1) {
            if (!LanguageUtil.f(context)) {
                strA = String.format(Locale.ENGLISH, "/hwtips/protection_setup/%s/protection.html?cid=%s", "en-US", "11074");
            } else {
                strA = nzz.a("11074");
            }
        } else {
            strA = String.format(Locale.ENGLISH, "/handbook/SingleJumppage/protection_setup/en-US/index.html?lang=%s", CommonUtil.z());
        }
        return this.f49016b + strA;
    }
}
