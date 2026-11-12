package com.huawei.ui.main.stories.smartcenter.activity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.Guidepost;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.ive;
import defpackage.jxh;
import defpackage.lmf;
import defpackage.njd;
import defpackage.nsv;
import defpackage.wng;
import health.compact.a.Utils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class SmartMsgSkipActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28840b;
    private Context d;
    private String e = "";

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = this;
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("id", 0);
        int intExtra2 = intent.getIntExtra("msgType", 0);
        String stringExtra = intent.getStringExtra("msgContent");
        this.e = intent.getStringExtra(CommonUtil.MSG_TITLE);
        this.f28840b = intent.getIntExtra("from", 0);
        LogUtil.d("SmartMsgSkipActivity", "SmartCard_mSmartMsgKeyId", Integer.valueOf(intExtra));
        d(intExtra, intExtra2, stringExtra);
        finish();
    }

    private void d(int i, int i2, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 2);
        nsv.e(this.d).d(i, contentValues);
        LogUtil.a("SmartMsgSkipActivity", "skipToTargetActivity, msgType=", Integer.valueOf(i2));
        switch (i2) {
            case 20000:
                b(20000, i2);
                Guidepost guidepostC = AppRouter.c("/HWUserProfileMgr/MyTargetActivity");
                b(guidepostC);
                guidepostC.b(this.d);
                finish();
                break;
            case SmartMsgConstant.MSG_TYPE_SLEEP_USER /* 40007 */:
                wng.a(this.f28840b, this.d, str);
                b(40000, i2);
                break;
            case 50001:
                b(50000, i2);
                wng.b(this.f28840b, this.d, str);
                finish();
                break;
            case 60000:
                b(60000, i2);
                Guidepost guidepostC2 = AppRouter.c("/HWUserProfileMgr/UserInfoActivity");
                b(guidepostC2);
                guidepostC2.b(this.d);
                finish();
                break;
            case SmartMsgConstant.MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND /* 90001 */:
                b(SmartMsgConstant.MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND, i2);
                d(str);
                break;
            case 100000:
                wng.e(this.d, str);
                b(100000, i2);
                break;
            default:
                LogUtil.j("SmartMsgSkipActivity", "no match target activity");
                break;
        }
    }

    private void d(String str) {
        long j;
        long j2;
        try {
            String[] strArrSplit = new JSONObject(str).getString(SmartMsgConstant.MSG_CONTENT_MESSAGE_CENTER_DETAIL_URL).split(" ");
            if (strArrSplit == null || strArrSplit.length < 2) {
                LogUtil.j("SmartMsgSkipActivity", "can't resolve trackUrl");
                return;
            }
            try {
                j = Long.parseLong(strArrSplit[0]);
                try {
                    j2 = Long.parseLong(strArrSplit[1]);
                } catch (NumberFormatException e) {
                    e = e;
                    LogUtil.e("SmartMsgSkipActivity", e.getMessage());
                    j2 = 0;
                }
            } catch (NumberFormatException e2) {
                e = e2;
                j = 0;
            }
            if (j != 0 && j2 != 0) {
                jxh.a(j, j2, new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.smartcenter.activity.SmartMsgSkipActivity.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0 && (obj instanceof njd)) {
                            njd njdVar = (njd) obj;
                            ive.c().b(njdVar.b(), njdVar.c());
                        } else {
                            LogUtil.j("SmartMsgSkipActivity", "MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND Not return valid data");
                        }
                    }
                });
            }
            finish();
        } catch (JSONException e3) {
            LogUtil.e("SmartMsgSkipActivity", "track content parse error: ", e3.getMessage());
        }
    }

    private void b(Guidepost guidepost) {
        if (this.f28840b == 1) {
            guidepost.d(1879048192);
        }
    }

    private void b(int i, int i2) {
        int i3 = this.f28840b;
        if (i3 == 2) {
            HashMap map = new HashMap(4);
            String strValue = AnalyticsValue.HEALTH_HOME_OPERA_POSITION_CLICK_2010075.value();
            map.put("click", "1");
            map.put("type", Integer.valueOf(i2));
            if (!Utils.o()) {
                map.put("title", this.e);
            }
            lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
            return;
        }
        if (i3 == 0) {
            HashMap map2 = new HashMap(4);
            map2.put("click", "1");
            map2.put("module", Integer.valueOf(i));
            map2.put("type", Integer.valueOf(i2));
            if (!Utils.o()) {
                map2.put("title", this.e);
            }
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HOME_SMART_CARD_MSG_CLICK_2010051.value(), map2, 0);
            return;
        }
        LogUtil.j("SmartMsgSkipActivity", "no match BI Event");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
