package com.huawei.health.receiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.njy;
import defpackage.qki;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class PermissionDialogReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qki f8656a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f8657c;
    private Handler d = new Handler(Looper.getMainLooper());

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.huawei.health.action.ACTION_PERMISSION_REQUEST".equals(action)) {
            LogUtil.a("PermissionDialogReceiver", "PermissionDialogReceiver detailDialog show");
            d(intent);
        } else {
            if ("com.huawei.health.action.ACTION_PERMISSION_REQUEST_FINISH".equals(action)) {
                LogUtil.a("PermissionDialogReceiver", "PermissionDialogReceiver detailDialog dismiss");
                a();
                b();
                return;
            }
            LogUtil.a("PermissionDialogReceiver", "PermissionDialogReceiver receive unknown localBroadCast action = ", action);
        }
    }

    private void d(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("Permissions");
        final String stringExtra = intent.getStringExtra("RequestClassName");
        if (stringArrayExtra == null) {
            LogUtil.j("PermissionDialogReceiver", "permission is null");
            return;
        }
        final ArrayList arrayList = new ArrayList(Arrays.asList(stringArrayExtra));
        if (PermissionUtil.f()) {
            arrayList.remove(Constants.POST_NOTIFICATIONS);
        }
        if (njy.e(arrayList)) {
            LogUtil.j("PermissionDialogReceiver", "permissionList is empty");
            return;
        }
        LogUtil.a("PermissionDialogReceiver", "schedulePermissionRequest handlePermissionRequest postDelayed");
        Runnable runnable = new Runnable() { // from class: gsu
            @Override // java.lang.Runnable
            public final void run() {
                this.f36002c.e(stringExtra, arrayList);
            }
        };
        this.f8657c = runnable;
        this.d.postDelayed(runnable, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, List<String> list) {
        LogUtil.a("PermissionDialogReceiver", "handlePermission requestClassName=", str, " permission=", list.get(0));
        Activity activityC = c(str);
        if (activityC == null) {
            LogUtil.j("PermissionDialogReceiver", "handlePermissionRequest topActivity and requestActivity are empty");
            return;
        }
        qki qkiVar = new qki(activityC, list);
        this.f8656a = qkiVar;
        qkiVar.show();
    }

    private void a() {
        if (this.d == null || this.f8657c == null) {
            return;
        }
        LogUtil.a("PermissionDialogReceiver", "cancelPendingPermissionRequest permissionRequest removeCallbacks");
        this.d.removeCallbacks(this.f8657c);
    }

    private Activity c(String str) {
        Activity activityJ = BaseApplication.j();
        LogUtil.a("PermissionDialogReceiver", "getRequestActivity topActivity is:", activityJ);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PermissionDialogReceiver", "getRequestActivity requestClassName isEmpty");
            return activityJ;
        }
        Activity[] activityArrE = BaseApplication.e();
        if (CollectionUtils.d(activityArrE)) {
            LogUtil.j("PermissionDialogReceiver", "getRequestActivity activities isEmpty");
            return activityJ;
        }
        for (Activity activity : activityArrE) {
            if (activity != null && activity.getComponentName() != null && str.equals(activity.getComponentName().getClassName())) {
                LogUtil.a("PermissionDialogReceiver", "getRequestActivity activityName:", activity.getComponentName());
                return activity;
            }
        }
        return activityJ;
    }

    private void b() {
        qki qkiVar = this.f8656a;
        if (qkiVar == null) {
            LogUtil.j("PermissionDialogReceiver", "dismissDialog mDialog is null");
            return;
        }
        if (qkiVar.isShowing()) {
            Context baseContext = ((ContextWrapper) this.f8656a.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                Activity activity = (Activity) baseContext;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    this.f8656a.dismiss();
                }
            }
        }
        this.f8656a = null;
    }
}
