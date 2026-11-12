package com.huawei.ui.thirdpartservice.activity.alisport;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.view.GravityCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.main.api.MainCommonApi;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.ThirdAuthTokenI;
import com.huawei.hwcloudmodel.model.ThirdAuthTokenO;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.thirdpartservice.R;
import defpackage.lmf;
import defpackage.lqo;
import defpackage.lsy;
import defpackage.wvn;
import defpackage.wyz;
import defpackage.wzb;
import defpackage.wzd;
import defpackage.wzn;
import defpackage.wzo;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public class AliSportActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f29091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f29092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f29093c;
    private Context d;
    private LinearLayout e;
    private HealthTextView f;
    private lqo g;
    private HealthTextView i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("AliSportActivity", "onCreate");
        super.onCreate(bundle);
        this.d = this;
        this.f29093c = new e(this);
        this.g = lqo.b(this.d);
        setContentView(R.layout.activity_ali_sport);
        Intent intent = getIntent();
        if (intent != null) {
            c(intent.getBooleanExtra("AUTH_STATUS", false));
        }
    }

    private void c(boolean z) {
        this.i = (HealthTextView) findViewById(R.id.ali_sport_connect_tip);
        HealthButton healthButton = (HealthButton) findViewById(R.id.aliSport_button_connect);
        this.f29091a = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: wwv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52564c.c(view);
            }
        });
        this.f29092b = (HealthButton) findViewById(R.id.aliSport_button_cancel_connect);
        this.e = (LinearLayout) findViewById(R.id.aliSport_button_cancel_linear_layout);
        this.f29092b.setOnClickListener(new View.OnClickListener() { // from class: www
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        this.f = (HealthTextView) findViewById(R.id.ali_sport_connect_show_content);
        e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        if ("false".equals(((MainCommonApi) Services.b("Main", MainCommonApi.class)).getPersonalPrivacySettingValue(3))) {
            ((WeChatApi) Services.b("Main", WeChatApi.class)).showSportPrivacySettingDialog(this.d, R.string.IDS_ali_title);
        } else {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.i.setVisibility(z ? 8 : 0);
        this.f29091a.setVisibility(z ? 8 : 0);
        this.e.setVisibility(z ? 0 : 8);
        this.f.setText(z ? R.string.IDS_ali_introduction_after_link : R.string.IDS_ali_introduction);
        if (z) {
            this.f.setGravity(17);
        } else {
            this.f.setGravity(GravityCompat.START);
        }
        KeyValDbManager.d(BaseApplication.getContext()).c("third_part_service_ali_sport_status", String.valueOf(z), null);
    }

    private void a() {
        if (wvn.d(this.d, "com.eg.android.AlipayGphone")) {
            lsy.a(new Runnable() { // from class: wwz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52568a.e();
                }
            });
            return;
        }
        LogUtil.j("AliSportActivity", "startAliAuth System is not install Ali pay App.");
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=com.eg.android.AlipayGphone"));
        intent.addFlags(268435456);
        if (intent.resolveActivity(this.d.getPackageManager()) == null) {
            wvn.b(this.d, R.string.IDS_common_notification_know_tips, R.string.IDS_hw_data_share_app_not_install);
        } else {
            b(intent);
        }
    }

    private void b(int i) {
        Message messageObtainMessage = this.f29093c.obtainMessage();
        messageObtainMessage.what = i;
        this.f29093c.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!CommonUtil.ab(this.d)) {
            b(6);
            return;
        }
        wzo wzoVarB = wzn.b(this, wyz.b(1, 45, 1045, 2045));
        if (wzoVarB == null) {
            b(2);
            return;
        }
        String strC = wzoVarB.c();
        if (!TextUtils.equals(strC, "9000") || !TextUtils.equals(wzoVarB.e(), "200")) {
            LogUtil.a("AliSportActivity", "doAliAuth failed ! ali auth error , result is ", strC);
            if (TextUtils.equals(strC, "6001")) {
                b(5);
                return;
            } else {
                b(2);
                return;
            }
        }
        ThirdAuthTokenI thirdAuthTokenIB = b(wzoVarB.d(), wzoVarB.b());
        if (thirdAuthTokenIB == null) {
            LogUtil.a("AliSportActivity", "doAliAuth failed ! prepare thirdAuthToken error , userID is null");
            b(2);
            return;
        }
        b(thirdAuthTokenIB);
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("status", 0);
        String strValue = AnalyticsValue.HEALTH_MINE_SHARE_DATA_ALI_SYNC_2140011.value();
        lmf.d().c(this.d, strValue, map, 0);
        LogUtil.a("AliSportActivity", "BI save notification click event finish, value = ", strValue);
    }

    private void b(ThirdAuthTokenI thirdAuthTokenI) {
        HashMap map = new HashMap();
        map.put("thirdAuthToken", thirdAuthTokenI);
        new wzb(ThirdAuthTokenO.class, "/dataOpen/third/thirdAuthorization").b(map, new ICloudOperationResult() { // from class: wwq
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.f52563b.a((ThirdAuthTokenO) obj, str, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ThirdAuthTokenO thirdAuthTokenO, String str, boolean z) {
        LogUtil.a("AliSportActivity", "thirdAuthorization isSuccess is ", Boolean.valueOf(z));
        if (z && thirdAuthTokenO.getThirdAuthToken() != null) {
            b(1);
        } else {
            b(2);
        }
    }

    private ThirdAuthTokenI b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.e("R_AliSportActivity", "getThirdToken authCode is null");
            return null;
        }
        ThirdAuthTokenI thirdAuthTokenI = new ThirdAuthTokenI();
        thirdAuthTokenI.setThirdAccountType(24);
        thirdAuthTokenI.setOpenId(str);
        thirdAuthTokenI.setThirdTokenType(3);
        thirdAuthTokenI.setThirdToken(str2);
        return thirdAuthTokenI;
    }

    private void c() {
        if (!CommonUtil.ab(this.d)) {
            b(6);
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).b(R.string.IDS_hwh_ali_sport_disconnect_note_content).c(R.string.IDS_qq_health_disconnect_button, new View.OnClickListener() { // from class: wwr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: wwt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.d("AliSportActivity", "onClick");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isDestroyed() || isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        b();
    }

    private void b() {
        HashMap map = new HashMap();
        map.put("thirdAccountType", 24);
        new wzd(Object.class, "/dataOpen/third/cancelThirdAuthorization").d(map, new ICloudOperationResult() { // from class: wws
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            public final void operationResult(Object obj, String str, boolean z) {
                this.e.d(obj, str, z);
            }
        });
        HashMap map2 = new HashMap(2);
        map2.put("click", "1");
        map2.put("status", 1);
        String strValue = AnalyticsValue.HEALTH_MINE_SHARE_DATA_ALI_SYNC_2140011.value();
        lmf.d().c(this.d, strValue, map2, 0);
        LogUtil.a("AliSportActivity", "BI save notification click event finish, value = ", strValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Object obj, String str, boolean z) {
        LogUtil.a("AliSportActivity", "cancelThirdAuthorization isSuccess is ", Boolean.valueOf(z));
        if (z) {
            b(3);
        } else {
            b(4);
        }
    }

    private void b(Intent intent) {
        PackageManager packageManager = getPackageManager();
        if (packageManager == null) {
            LogUtil.e("AliSportActivity", "packageManager is null");
            return;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            LogUtil.e("AliSportActivity", "resolveInfo is null");
            return;
        }
        try {
            if (!TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.name) && !TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.packageName)) {
                LogUtil.a("AliSportActivity", "packageName:", resolveInfoResolveActivity.activityInfo.packageName);
                LogUtil.a("AliSportActivity", "name:", resolveInfoResolveActivity.activityInfo.name);
                if (!resolveInfoResolveActivity.activityInfo.name.startsWith(resolveInfoResolveActivity.activityInfo.packageName)) {
                    LogUtil.e("AliSportActivity", "ResolverActivity Not Found");
                    throw new ActivityNotFoundException();
                }
                intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                startActivity(intent);
                return;
            }
            throw new ActivityNotFoundException();
        } catch (ActivityNotFoundException | SecurityException unused) {
            LogUtil.e("AliSportActivity", "SecurityException: Permission Denial: starting Intent");
            wvn.b(this.d, R.string.IDS_common_notification_know_tips, R.string.IDS_hw_data_share_app_not_install);
        }
    }

    static class e extends BaseHandler<AliSportActivity> {
        e(AliSportActivity aliSportActivity) {
            super(aliSportActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AliSportActivity aliSportActivity, Message message) {
            LogUtil.d("AliSportActivity", "handleMessage msg is ", Integer.valueOf(message.what));
            switch (message.what) {
                case 1:
                    aliSportActivity.e(true);
                    break;
                case 2:
                    aliSportActivity.e(false);
                    Toast.makeText(aliSportActivity, R.string.IDS_hwh_ali_sport_auth_failed, 0).show();
                    break;
                case 3:
                case 5:
                    aliSportActivity.e(false);
                    break;
                case 4:
                    Toast.makeText(aliSportActivity, R.string.IDS_hwh_ali_sport_net_error, 0).show();
                    break;
                case 6:
                    Toast.makeText(aliSportActivity, R.string.IDS_connect_error, 0).show();
                    break;
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
