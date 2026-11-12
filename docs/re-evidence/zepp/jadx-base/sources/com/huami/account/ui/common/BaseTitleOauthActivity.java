package com.huami.account.ui.common;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseTitleOauthActivity extends BaseTitleActivity {
    public static final String IS_OAUTH = "IS_OAUTH";
    private static final String y = "BaseTitleOauthActivity";
    private static boolean z = false;
    private boolean x = false;

    private void n(Intent intent) {
        intent.putExtra(IS_OAUTH, this.x);
    }

    private boolean o(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            if (intent.getComponent() == null) {
                return false;
            }
            String className = intent.getComponent().getClassName();
            return !TextUtils.isEmpty(className) && BaseTitleOauthActivity.class.isAssignableFrom(Class.forName(className));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p(Exception exc) {
        return "解析 IS_OAUTH 参数出错：\n" + Log.getStackTraceString(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q(ActivityNotFoundException activityNotFoundException) {
        return "未能完成跳转：" + activityNotFoundException.getMessage();
    }

    private void r() {
        if (this.x) {
            z = true;
        } else if (z) {
            z = false;
            AccountExternalsKt.getAccountDelegate().goStartUpActivityFromLogout();
        }
    }

    public void fromOauth() {
        this.x = true;
    }

    public boolean isFromOauth() {
        return this.x;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean z2 = false;
        if (intent != null) {
            try {
                if (intent.getBooleanExtra(IS_OAUTH, false)) {
                    z2 = true;
                }
            } catch (Exception e) {
                HMLog.error(y, new Function0() { // from class: qr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BaseTitleOauthActivity.p(e);
                    }
                });
                return;
            }
        }
        this.x = z2;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (this.x && o(intent)) {
            intent.addFlags(33554432);
            n(intent);
        }
        try {
            super.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            HMLog.info(y, new Function0() { // from class: pr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseTitleOauthActivity.q(e);
                }
            });
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (this.x && o(intent)) {
            n(intent);
        }
        super.startActivityForResult(intent, i);
    }
}
