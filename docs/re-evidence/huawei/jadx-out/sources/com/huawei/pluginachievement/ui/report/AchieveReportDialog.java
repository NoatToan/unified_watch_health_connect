package com.huawei.pluginachievement.ui.report;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.pluginachievement.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.lmf;
import defpackage.oru;
import defpackage.osb;
import defpackage.ouo;
import defpackage.out;
import defpackage.pal;
import defpackage.paw;
import defpackage.qpb;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public class AchieveReportDialog extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f22258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f22259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22260c;
    private LinearLayout d;
    private ImageView e;
    private String f;
    private HealthTextView g;
    private Context h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView l;
    private HealthTextView m;
    private HiUserInfo o;
    private String p;
    private View s;
    private int k = 0;
    private Handler n = new a(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(134217728);
        setContentView(R.layout.achieve_report_message_dialog);
        cancelAdaptRingRegion();
        this.h = this;
        e();
        qpb.d(this.h);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "intent is null");
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("dialogType", 0);
        this.k = intExtra;
        if (intExtra == 0) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("dialogValue");
        if (stringExtra == null) {
            stringExtra = "";
        }
        d(AnalyticsValue.PB_MESSAGE_1100031.value());
        b();
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "enter initView mType=", Integer.valueOf(this.k), "value=", stringExtra);
        this.d = (LinearLayout) out.d(this, R.id.achieve_pb_share_ll);
        this.p = stringExtra;
        this.i = (HealthTextView) out.d(this, R.id.achieve_breakdown_mgs_tiltle);
        this.g = (HealthTextView) out.d(this, R.id.content_value);
        this.j = (HealthTextView) out.d(this, R.id.content_unit);
        this.l = (HealthTextView) out.b(this.d, R.id.content_unit);
        this.f22260c = (HealthTextView) out.d(this, R.id.achieve_breakdown_dialog_date);
        HealthButton healthButton = (HealthButton) out.d(this, R.id.achieve_pb_dialog_share_button);
        this.f22258a = healthButton;
        healthButton.setOnClickListener(this);
        ImageView imageView = (ImageView) out.d(this, R.id.achieve_breakdown_dialog_title_ImageView);
        this.f22259b = imageView;
        imageView.setOnClickListener(this);
        setViewSafeRegion(false, (RelativeLayout) out.d(this, R.id.achieve_breakdown_dialog_view));
        this.i.setText(paw.b(this.k, this.h));
        String strE = paw.e(String.valueOf(intent.getLongExtra("dialogDate", System.currentTimeMillis())));
        this.f = strE;
        this.f22260c.setText(strE);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.g.setText(b(stringExtra));
        } else {
            this.g.setText(stringExtra);
        }
        a();
        c();
    }

    private String b(String str) {
        int i = this.k;
        if (i == 2) {
            return c(str);
        }
        return (i == 1 || i == 3 || i == 10) ? a(str) : str;
    }

    private String a(String str) {
        float fH = qrs.h(str);
        return fH == 0.0f ? str : UnitUtil.e(fH, 1, 2);
    }

    private String c(String str) {
        int iA = qrs.a(str);
        return iA == 0 ? str : UnitUtil.e(iA, 1, 0);
    }

    private void c() {
        int i = this.k;
        if (i == 12 || i == 13) {
            String quantityString = this.h.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit, qrs.a(this.p));
            this.j.setText(String.format(Locale.ENGLISH, "(%s)", quantityString));
            this.l.setText(String.format(Locale.ENGLISH, "(%s)", quantityString));
            return;
        }
        if (i == 14) {
            String string = this.h.getString(R.string.IDS_indoor_skipper_number_minute);
            this.j.setText(String.format(Locale.ENGLISH, "(%s)", string));
            this.l.setText(String.format(Locale.ENGLISH, "(%s)", string));
            return;
        }
        if (i == 15) {
            String string2 = this.h.getString(R.string.IDS_second);
            this.j.setText(String.format(Locale.ENGLISH, "(%s)", string2));
            this.l.setText(String.format(Locale.ENGLISH, "(%s)", string2));
        } else if (!paw.i(i) || this.k == 2) {
            this.j.setVisibility(8);
            this.l.setVisibility(8);
        } else if (UnitUtil.f()) {
            this.j.setText(String.format(Locale.ENGLISH, "(%s)", paw.a(this.k, this.h)));
            this.l.setText(String.format(Locale.ENGLISH, "(%s)", paw.a(this.k, this.h)));
        } else {
            this.j.setText(String.format(Locale.ENGLISH, "(%s)", paw.e(this.k, this.h)));
            this.l.setText(String.format(Locale.ENGLISH, "(%s)", paw.e(this.k, this.h)));
        }
    }

    private void b() {
        ((ImageView) out.d(this, R.id.achieve_pb_image_type)).setImageResource(paw.e(this.k));
        ((HealthTextView) out.d(this, R.id.achieve_pb_img_text)).setText(paw.a(this.k));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (R.id.achieve_breakdown_dialog_title_ImageView == view.getId()) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "onClick: finish");
            finish();
            return;
        }
        if (R.id.achieve_pb_dialog_share_button == view.getId()) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "onClick: share");
            if (!osb.c(this.h)) {
                paw.a(this.h);
                return;
            }
            View view2 = this.s;
            if (view2 != null) {
                view2.setVisibility(osb.d() ? 0 : 4);
            }
            if (oru.a(this.h).getAdapter() != null) {
                this.m.setText(osb.b());
                HashMap map = new HashMap(4);
                map.put("click", "1");
                if (!Utils.o()) {
                    map.put("pb", String.valueOf(this.k));
                }
                Bitmap bitmapC = ouo.c(this.d);
                if (bitmapC != null) {
                    osb.c(this.h, bitmapC, AnalyticsValue.PB_MESSAGE_SHARE_1100032.value(), map);
                    d(AnalyticsValue.PB_MESSAGE_SHARE_1100032.value());
                    return;
                }
                return;
            }
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "adapter is null");
        }
    }

    private void d(String str) {
        HashMap map = new HashMap(4);
        map.put("type", Integer.valueOf(this.k));
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    private void a() {
        ((ImageView) out.b(this.d, R.id.achieve_pb_image_type)).setImageResource(paw.e(this.k));
        ((HealthTextView) out.b(this.d, R.id.achieve_pb_img_text)).setText(paw.a(this.k));
        ((HealthTextView) out.b(this.d, R.id.achieve_pb_share_date)).setText(this.f);
        ((HealthTextView) out.b(this.d, R.id.achieve_pb_share_text)).setText(this.p);
        ((HealthTextView) out.b(this.d, R.id.achieve_breakdown_mgs_tiltle)).setText(paw.b(this.k, this.h));
        this.e = (ImageView) out.b(this.d, R.id.nick_img);
        this.m = (HealthTextView) out.b(this.d, R.id.nick_name);
        this.s = out.b(this.d, R.id.achieve_pb_share_app_name);
        f();
    }

    private void f() {
        if ("1".equals(SharedPreferenceManager.e(this.h, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "accountMigrate: isThirdLogin == 1 and return!");
            h();
        } else {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new BaseResponseCallback<UserInfomation>() { // from class: com.huawei.pluginachievement.ui.report.AchieveReportDialog.1
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i, UserInfomation userInfomation) {
                    if (i != 0) {
                        AchieveReportDialog.this.n.sendEmptyMessage(1);
                        return;
                    }
                    if (userInfomation == null) {
                        LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "get userInfo success but obtain null obj.");
                        return;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = userInfomation;
                    messageObtain.what = 0;
                    AchieveReportDialog.this.n.sendMessage(messageObtain);
                }
            });
        }
    }

    private void h() {
        HiHealthManager.d(this.h).fetchUserData(new HiCommonListener() { // from class: com.huawei.pluginachievement.ui.report.AchieveReportDialog.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                AchieveReportDialog achieveReportDialog = AchieveReportDialog.this;
                achieveReportDialog.o = pal.d(obj, achieveReportDialog.o, AchieveReportDialog.this.n, 4);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "fetchUserData onFailure");
            }
        });
    }

    static class a extends BaseHandler<AchieveReportDialog> {
        a(AchieveReportDialog achieveReportDialog) {
            super(achieveReportDialog);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchieveReportDialog achieveReportDialog, Message message) {
            int i = message.what;
            if (i == 0) {
                if (message.obj instanceof UserInfomation) {
                    achieveReportDialog.c((UserInfomation) message.obj);
                }
            } else if (i == 1) {
                LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "MSG_GET_USER_INFO_FAIL");
            } else {
                if (i != 4) {
                    return;
                }
                achieveReportDialog.d();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "enter onDestroy");
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "handleWhenGetUserInfoSuccess()! userInfo is null! ");
            return;
        }
        String name = userInfomation.getName();
        if (name == null || name.equals("")) {
            String accountName = new UpApi(this.h).getAccountName();
            if (accountName != null) {
                this.m.setText(accountName);
            }
        } else {
            this.m.setText(name);
        }
        String picPath = userInfomation.getPicPath();
        if (TextUtils.isEmpty(picPath)) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "handle", "WhenGetUserInfoSuccess()! headImgPath is null! ");
            this.e.setImageResource(R.mipmap.ic_personal_head);
            return;
        }
        Bitmap bitmapA = qqf.a(this.h, picPath);
        if (bitmapA != null) {
            this.e.setImageBitmap(bitmapA);
        } else {
            a(userInfomation);
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "handleWhenGetUserInfoSuccess() bitmap is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HiUserInfo hiUserInfo = this.o;
        if (hiUserInfo == null) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "accountMigrate: setUserNameFromLocal mHiUserInfo == null");
            return;
        }
        this.m.setText(hiUserInfo.getName());
        String strE = e(this.o.getHeadImgUrl());
        if (!TextUtils.isEmpty(strE)) {
            Bitmap bitmapA = qqf.a(this.h, strE);
            if (bitmapA != null) {
                this.e.setImageBitmap(bitmapA);
                return;
            }
            return;
        }
        this.e.setImageResource(R.mipmap.ic_personal_head);
        LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "accountMigrate: setUserNameFromLocal() headImgPath is null! ");
    }

    private void a(UserInfomation userInfomation) {
        if (userInfomation.getPortraitUrl() == null) {
            LogUtil.j("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "it's so terrible, as missing the headImage url, we can do nothing!");
        }
    }

    private String e(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 0) {
            str2 = this.h.getFilesDir() + "/photos/headimage/" + strArrSplit[strArrSplit.length - 1];
        } else {
            str2 = this.h.getFilesDir() + "/photos/headimage/" + str;
        }
        if (new File(str2).exists()) {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "accountMigrate: getHeadImageFromLocal file.exists() yes");
        } else {
            LogUtil.a("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "accountMigrate: getHeadImageFromLocal file.exists() no");
            File[] fileArrListFiles = new File(this.h.getFilesDir() + "/photos/headimage").listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                try {
                    return fileArrListFiles[fileArrListFiles.length - 1].getCanonicalPath();
                } catch (IOException unused) {
                    LogUtil.e("PLGACHIEVE_PLGACHIEVE_AchieveReportDialog", "IOException : ");
                }
            }
        }
        return str2;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
