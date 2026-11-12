package com.huami.watch.companion.config;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.api.model.HMWebAccess;
import com.huami.midong.webview.ui.JsBridgeActivity;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.NextActions;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.AccountLoginHelper;
import com.huami.watch.companion.account.AccountLogoutHelper;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.hmwatchmanager.view.DialogMultiBtnFragment;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CloudConfigCallback implements CloudClient.ConfigCallback, Cloud.ConfigCallBack {
    private static final String a = "Cloud";
    public static boolean sIsLoginInvalidDialogShown;

    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;
        public final /* synthetic */ FragmentActivity b;

        public a(AlertDialogFragment alertDialogFragment, FragmentActivity fragmentActivity) {
            this.a = alertDialogFragment;
            this.b = fragmentActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
            CloudConfigCallback.sIsLoginInvalidDialogShown = false;
            AccountLogoutHelper.getHelper().logout(this.b, true);
            Analytics.event(this.b, AnalyticsEvents.EVENT_FORCE_LOGGED_OUT_CONFIRM);
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ AlertDialogFragment b;

        public class a implements Consumer<Integer> {
            public final /* synthetic */ AlertDialogFragment a;

            public a(AlertDialogFragment alertDialogFragment) {
                this.a = alertDialogFragment;
            }

            @Override // io.reactivex.functions.Consumer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(Integer num) throws Exception {
                int iIntValue = num.intValue();
                if (iIntValue == -2) {
                    this.a.dismissAllowingStateLoss();
                    Toast.makeText(b.this.a, R.string.re_login_fail_tip, 1).show();
                } else {
                    if (iIntValue != -1) {
                        return;
                    }
                    this.a.dismissAllowingStateLoss();
                    b.this.b.dismissAllowingStateLoss();
                    CloudConfigCallback.sIsLoginInvalidDialogShown = false;
                    Toast.makeText(b.this.a, R.string.login_success, 1).show();
                }
            }
        }

        public b(FragmentActivity fragmentActivity, AlertDialogFragment alertDialogFragment) {
            this.a = fragmentActivity;
            this.b = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(2);
            alertDialogFragmentNewInstance.setMessage(this.a.getString(R.string.re_login_tip));
            alertDialogFragmentNewInstance.setCancelable(false);
            alertDialogFragmentNewInstance.show(this.a.getFragmentManager(), "Re-Login");
            AccountLoginHelper.getHelper().reLogin(this.a, new a(alertDialogFragmentNewInstance));
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ AlertDialogFragment b;
        public final /* synthetic */ List c;
        public final /* synthetic */ String[] d;

        public c(Activity activity, AlertDialogFragment alertDialogFragment, List list, String[] strArr) {
            this.a = activity;
            this.b = alertDialogFragment;
            this.c = list;
            this.d = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudConfigCallback.b(this.a, this.b, this.c, this.d[0]);
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ AlertDialogFragment b;
        public final /* synthetic */ List c;
        public final /* synthetic */ String[] d;

        public d(Activity activity, AlertDialogFragment alertDialogFragment, List list, String[] strArr) {
            this.a = activity;
            this.b = alertDialogFragment;
            this.c = list;
            this.d = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudConfigCallback.b(this.a, this.b, this.c, this.d[0]);
        }
    }

    public class e implements View.OnClickListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ AlertDialogFragment b;
        public final /* synthetic */ List c;
        public final /* synthetic */ String[] d;

        public e(Activity activity, AlertDialogFragment alertDialogFragment, List list, String[] strArr) {
            this.a = activity;
            this.b = alertDialogFragment;
            this.c = list;
            this.d = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CloudConfigCallback.b(this.a, this.b, this.c, this.d[1]);
        }
    }

    public class f implements DialogMultiBtnFragment.OnButtonClick {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ AlertDialogFragment b;
        public final /* synthetic */ List c;
        public final /* synthetic */ String[] d;

        public f(Activity activity, AlertDialogFragment alertDialogFragment, List list, String[] strArr) {
            this.a = activity;
            this.b = alertDialogFragment;
            this.c = list;
            this.d = strArr;
        }

        @Override // com.huami.watch.hmwatchmanager.view.DialogMultiBtnFragment.OnButtonClick
        public void onButtonClick(int i) {
            CloudConfigCallback.b(this.a, this.b, this.c, this.d[i]);
        }
    }

    public class g implements AlertDialogFragment.Callback {
        @Override // com.huami.watch.hmwatchmanager.view.AlertDialogFragment.Callback
        public void onCreateView() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, AlertDialogFragment alertDialogFragment, List<NextActions> list, String str) {
        alertDialogFragment.dismissAllowingStateLoss();
        if (context.getString(R.string.re_register).equals(str) || context.getString(R.string.re_login).equals(str)) {
            return;
        }
        if (context.getString(R.string.login_to_help).equals(str)) {
            f(context);
        } else if (context.getString(R.string.login_defreeze_account).equals(str)) {
            toNextActions(context, list);
        } else if (context.getString(R.string.login_export_data_or_del_account).equals(str)) {
            g(context, Cloud.urlAccountConsole());
        }
    }

    private static void c(@NonNull Activity activity, String str, String str2, String... strArr) {
        d(activity, null, str, str2, strArr);
    }

    private static void d(@NonNull Activity activity, List<NextActions> list, String str, String str2, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance();
        if (strArr.length == 1) {
            alertDialogFragmentNewInstance.setStyle(4);
            alertDialogFragmentNewInstance.setMessage(str2);
            alertDialogFragmentNewInstance.setNeutral(strArr[0], new c(activity, alertDialogFragmentNewInstance, list, strArr));
        } else if (strArr.length == 2) {
            alertDialogFragmentNewInstance.setStyle(3);
            alertDialogFragmentNewInstance.setMessage(str2);
            alertDialogFragmentNewInstance.setCancel(strArr[0], new d(activity, alertDialogFragmentNewInstance, list, strArr));
            alertDialogFragmentNewInstance.setConfirm(strArr[1], new e(activity, alertDialogFragmentNewInstance, list, strArr));
        } else {
            alertDialogFragmentNewInstance.setStyle(8);
            DialogMultiBtnFragment dialogMultiBtnFragment = new DialogMultiBtnFragment();
            dialogMultiBtnFragment.addButton(Arrays.asList(strArr), new f(activity, alertDialogFragmentNewInstance, list, strArr));
            dialogMultiBtnFragment.setMessage(str2);
            alertDialogFragmentNewInstance.setContent(dialogMultiBtnFragment);
            alertDialogFragmentNewInstance.setCallback(new g());
        }
        alertDialogFragmentNewInstance.setTitle(str);
        alertDialogFragmentNewInstance.setCancelable(false);
        try {
            alertDialogFragmentNewInstance.show(activity.getFragmentManager(), "LoginErrorTip");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void e(FragmentActivity fragmentActivity, long j) {
        if (sIsLoginInvalidDialogShown) {
            Log.w(a, "LoginInvalidDialog already shown, Abort!!", new Object[0]);
            return;
        }
        String string = j != 0 ? String.format(fragmentActivity.getString(R.string.login_mutex_tip), TimeUtil.formatDateTime(j, fragmentActivity.getString(R.string.date_time_format))) : null;
        if (string == null) {
            string = fragmentActivity.getString(R.string.login_invalid);
        }
        Log.d(a, "Show Login Invalid Dialog!!", new Object[0]);
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(0);
        alertDialogFragmentNewInstance.setCancelable(false);
        alertDialogFragmentNewInstance.setMessage(string);
        alertDialogFragmentNewInstance.setCancel(fragmentActivity.getString(R.string.logout), new a(alertDialogFragmentNewInstance, fragmentActivity));
        alertDialogFragmentNewInstance.setConfirm(fragmentActivity.getString(R.string.re_login), new b(fragmentActivity, alertDialogFragmentNewInstance));
        try {
            FragmentManager fragmentManager = fragmentActivity.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.beginTransaction().add(alertDialogFragmentNewInstance, "LoginInvalid").commitAllowingStateLoss();
                sIsLoginInvalidDialogShown = true;
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    private static void f(Context context) {
        JsBridgeActivity.load(context, Cloud.urlEnCommonHelp(), context.getString(R.string.help_item_common_problem), true);
        Analytics.event(context, AnalyticsEvents.EVENT_OPEN_WEB_PAGE, "Help");
    }

    private static void g(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JsBridgeActivity.load(context, str, true);
    }

    public static void toNextActions(Context context, List<NextActions> list) {
        Log.d(a, "Do NextActions : " + list + ", " + context, new Object[0]);
        if (!(context instanceof Activity) || ((Activity) context).isDestroyed() || ArraysUtil.isEmpty(list)) {
            return;
        }
        NextActions nextActions = list.get(0);
        Log.d(a, "Do NextAction : " + nextActions + ", " + nextActions.getRel() + ", " + nextActions.getHref(), new Object[0]);
        g(context, nextActions.getHref());
    }

    @Override // com.huami.watch.companion.cloud.Cloud.ConfigCallBack
    public Context getContext() {
        return CompanionApplication.getContext();
    }

    @Override // com.huami.watch.companion.cloud.Cloud.ConfigCallBack
    public String getUserAgent() {
        return "";
    }

    @Override // com.huami.watch.companion.cloud.Cloud.ConfigCallBack
    public boolean isAccountOversea() {
        return Account.isOversea(getContext());
    }

    @Override // com.huami.watch.companion.cloud.CloudClient.ConfigCallback
    public boolean isLogHeadersEnabled() {
        return Config.isDebug();
    }

    @Override // com.huami.watch.companion.cloud.Cloud.ConfigCallBack
    public boolean isTestHosts() {
        return Config.isTestHosts();
    }

    @Override // com.huami.watch.companion.cloud.CloudClient.ConfigCallback
    public boolean onLoginError(Activity activity, ErrorCode errorCode) {
        String errorCode2 = errorCode.getErrorCode();
        if (HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_NOT_REGISTER.equals(errorCode2)) {
            Log.d(a, "User not registered!!", new Object[0]);
            c(activity, activity.getString(R.string.login_can_not), activity.getString(R.string.login_account_not_exits), activity.getString(R.string.re_register));
            return true;
        }
        if (HMWebAccess.AUTH_SERVER_ERROR_ACCOUNT_ALREADY_REGISTER.equals(errorCode2) || HMProcessLoginDataManager.REGISTER_ERROR_EMAIL_HAD_REGISTERED.equals(errorCode2)) {
            Log.d(a, "User already registered!!", new Object[0]);
            c(activity, activity.getString(R.string.login_account_reminder), activity.getString(R.string.login_account_exits), activity.getString(R.string.re_login));
            return true;
        }
        if (HMWebAccess.AUTH_SERVER_ERROR_FROZEN.equals(errorCode2)) {
            Log.d(a, "未成年人,迁移冻结,账号迁移中", new Object[0]);
            d(activity, errorCode.getNextActions(), activity.getString(R.string.login_can_not), activity.getString(R.string.login_account_frozen_nonage, new Object[]{errorCode.getUserId()}), activity.getString(R.string.login_defreeze_account), activity.getString(R.string.login_export_data_or_del_account), activity.getString(R.string.btn_cancel));
            return true;
        }
        if (!HMWebAccess.AUTH_SERVER_ERROR_RIGHTS_RESTRICTIVE.equals(errorCode2) && !"0123".equals(errorCode2)) {
            return false;
        }
        Log.d(a, "限制权,纠正权", new Object[0]);
        c(activity, activity.getString(R.string.login_can_not), activity.getString(R.string.login_account_frozen_disabled, new Object[]{errorCode.getUserId()}), activity.getString(R.string.btn_cancel), activity.getString(R.string.login_to_help));
        return true;
    }

    @Override // com.huami.watch.companion.cloud.CloudClient.ConfigCallback
    public synchronized void onMutexLogin(FragmentActivity fragmentActivity, long j) {
        e(fragmentActivity, j);
    }

    @Override // com.huami.watch.companion.cloud.CloudClient.ConfigCallback
    public void onNextActions(Context context, List<NextActions> list) {
        toNextActions(context, list);
    }

    @Override // com.huami.watch.companion.cloud.CloudClient.ConfigCallback
    public synchronized void onUnauthed(FragmentActivity fragmentActivity) {
        AccountLogoutHelper.getHelper().logout(fragmentActivity, true);
    }
}
