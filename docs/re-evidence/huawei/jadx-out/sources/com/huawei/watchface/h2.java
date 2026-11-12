package com.huawei.watchface;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.ILoginCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;

/* JADX INFO: loaded from: classes20.dex */
public class h2 {
    public static final Object f = new Object();
    public static h2 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InstallWatchFaceBean f30185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f30187c;
    public j0 d;
    public OperateWatchFaceCallback e;

    public class a implements Runnable {
        public a() {
        }

        public final /* synthetic */ void a(String str, View view) {
            h2.this.a(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            final String commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
            h2.this.a(new View.OnClickListener() { // from class: com.huawei.watchface.h2$a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.a(commonCountryCode, view);
                }
            }, new View.OnClickListener() { // from class: com.huawei.watchface.h2$a$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.a(view);
                }
            });
        }

        public final /* synthetic */ void a(View view) {
            h2.this.b();
        }
    }

    public class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30190b;

        public b(String str, boolean z) {
            this.f30189a = str;
            this.f30190b = z;
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            HwLog.i("HwWatchFaceLoginHelper", "loginByHealthHmsLite responseCode: " + i);
            if (i != 0) {
                HwLog.w("HwWatchFaceLoginHelper", "loginByHealthHmsLite failed.");
                h2.this.b("0");
            } else {
                HwLog.i("HwWatchFaceLoginHelper", "loginByHealthHmsLite success.");
                HwWatchFaceApi.getInstance(Environment.getApplicationContext()).setAccountInfoMap(null);
                h2.this.c(this.f30189a, this.f30190b);
                h2.this.b("1");
            }
        }
    }

    public class c implements ILoginCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f30193b;

        public c(String str, boolean z) {
            this.f30192a = str;
            this.f30193b = z;
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginFailed(Object obj) {
            HwLog.e("HwWatchFaceLoginHelper", "loginByHms failed");
            h2.this.b("0");
        }

        @Override // com.huawei.watchface.utils.callback.ILoginCallback
        public void onLoginSuccess(Object obj) {
            HwLog.i("HwWatchFaceLoginHelper", "loginByHms success");
            HwWatchFaceApi.getInstance(Environment.getApplicationContext()).setAccountInfoMap(null);
            h2.this.c(this.f30192a, this.f30193b);
            h2.this.b("1");
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f30195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30196b;

        public d(boolean z, String str) {
            this.f30195a = z;
            this.f30196b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
            boolean zIfAllowLogin = HwWatchFaceApi.getInstance(h2.this.f30187c).ifAllowLogin();
            boolean z = this.f30195a != zIfAllowLogin && zIfAllowLogin;
            HwLog.i("HwWatchFaceLoginHelper", "beforeCountryCode:" + this.f30196b + ",nowCountryCode:" + commonCountryCode + "beforeallowLogin:" + this.f30195a + ",nowAllowLogin:" + zIfAllowLogin + ",isLoginChange:" + z);
            if (!TextUtils.equals(this.f30196b, commonCountryCode) || z) {
                HwLog.i("HwWatchFaceLoginHelper", "loginSuccessAction quitApp");
                h2.this.c();
            } else {
                Looper.prepare();
                h2.this.g();
                Looper.loop();
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f30200c;
        public final /* synthetic */ String d;
        public final /* synthetic */ View.OnClickListener e;

        public e(String str, String str2, View.OnClickListener onClickListener, String str3, View.OnClickListener onClickListener2) {
            this.f30198a = str;
            this.f30199b = str2;
            this.f30200c = onClickListener;
            this.d = str3;
            this.e = onClickListener2;
        }

        @Override // java.lang.Runnable
        public void run() {
            h2 h2Var = h2.this;
            h2Var.d = new j0.a(h2Var.f30187c).b(this.f30198a).a(this.f30199b).a(R.string.cancel, this.f30200c).a(this.d, this.e).a();
            if (h2.this.d.isShowing() || ((Activity) h2.this.f30187c).isFinishing()) {
                return;
            }
            HwLog.i("HwWatchFaceLoginHelper", "DialogWithTitle is showing");
            h2.this.d.setCancelable(false);
            h2.this.d.show();
        }
    }

    public class f implements View.OnClickListener {
        public f(h2 h2Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
            CommonUtils.a(intent);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View.OnClickListener f30201a;

        public g(View.OnClickListener onClickListener) {
            this.f30201a = onClickListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            z2 z2VarA = new z2.a(h2.this.f30187c).a(R.string.IDS_watchface_quit_app).b(R.string.hava_kown, this.f30201a).a();
            if (z2VarA.isShowing() || ((Activity) h2.this.f30187c).isFinishing()) {
                return;
            }
            HwLog.i("HwWatchFaceLoginHelper", "QuitDialog is showing");
            z2VarA.setCancelable(false);
            z2VarA.show();
        }
    }

    public h2(Context context) {
        if (context instanceof Activity) {
            this.f30187c = context;
        }
    }

    public static h2 a(Context context) {
        h2 h2Var;
        synchronized (f) {
            if (g == null) {
                g = new h2(context);
            }
            h2Var = g;
        }
        return h2Var;
    }

    public static void e() {
        synchronized (f) {
            if (g != null) {
                g = null;
            }
        }
    }

    private void showQuitDialog(View.OnClickListener onClickListener) {
        Context context = this.f30187c;
        if (context == null) {
            HwLog.w("HwWatchFaceLoginHelper", "showLoginDialog, mContext is null");
        } else {
            ((Activity) context).runOnUiThread(new g(onClickListener));
        }
    }

    public final void b() {
        a();
    }

    public final void c(String str, boolean z) {
        ThreadPoolManager.getInstance().tagExecute("HwWatchFaceLoginHelper", new d(z, str));
    }

    public final void d() {
        HwLog.i("HwWatchFaceLoginHelper", "refreshPage() enter");
        if (this.f30185a == null) {
            HwLog.i("HwWatchFaceLoginHelper", "refreshPage() mActionParams is null.");
        } else if (this.e != null) {
            HwLog.i("HwWatchFaceLoginHelper", "refreshPage mOperateWatchFaceCallback notifyRefreshPage");
            this.e.notifyRefreshPage(this.f30185a.getActionUrl());
        }
    }

    public final void f() {
        InstallWatchFaceBean installWatchFaceBean = this.f30185a;
        if (installWatchFaceBean == null) {
            return;
        }
        String watchFaceHiTopId = installWatchFaceBean.getWatchFaceHiTopId();
        String version = this.f30185a.getVersion();
        String fileUrl = this.f30185a.getFileUrl();
        String fileSize = this.f30185a.getFileSize();
        if (TextUtils.isEmpty(watchFaceHiTopId) || TextUtils.isEmpty(version) || TextUtils.isEmpty(fileUrl) || TextUtils.isEmpty(fileSize)) {
            return;
        }
        HwLog.i("HwWatchFaceLoginHelper", "start install again");
        HwWatchFaceManager.getInstance(Environment.getApplicationContext()).installWatchFace(this.f30185a);
    }

    public final void g() {
        HwLog.i("HwWatchFaceLoginHelper", "startOperationAgain, mActionType:" + this.f30186b);
        if (this.f30185a == null) {
            HwLog.w("HwWatchFaceLoginHelper", "startActionAgain, mActionParams is null");
            return;
        }
        int i = this.f30186b;
        if (i == 1) {
            f();
            return;
        }
        if (i == 2) {
            h();
        } else if (i != 3) {
            HwLog.w("HwWatchFaceLoginHelper", "startActionAgain no type");
        } else {
            d();
        }
    }

    public final void h() {
        InstallWatchFaceBean installWatchFaceBean = this.f30185a;
        if (installWatchFaceBean == null) {
            HwLog.i("HwWatchFaceLoginHelper", "startPay() mActionParams is null.");
            return;
        }
        String productId = installWatchFaceBean.getProductId();
        String watchFaceHiTopId = this.f30185a.getWatchFaceHiTopId();
        String version = this.f30185a.getVersion();
        String price = this.f30185a.getPrice();
        String showDialog = this.f30185a.getShowDialog();
        String symbolType = this.f30185a.getSymbolType();
        if (TextUtils.isEmpty(productId) || TextUtils.isEmpty(watchFaceHiTopId) || TextUtils.isEmpty(version)) {
            HwLog.i("HwWatchFaceLoginHelper", "startPay() productId|hiTopId|version is empty.");
        } else {
            if (TextUtils.isEmpty(price) || TextUtils.isEmpty(showDialog) || TextUtils.isEmpty(symbolType)) {
                return;
            }
            HwLog.i("HwWatchFaceLoginHelper", "startPay() again.");
            i2.a(this.f30187c).d(this.f30185a);
        }
    }

    public final void b(String str, boolean z) {
        HwWatchFaceApi.getInstance(Environment.getApplicationContext()).loginByHealthHms(this.f30187c, new c(str, z));
    }

    public final void c() {
        HwLog.i("HwWatchFaceLoginHelper", "loginCallback quit app");
        showQuitDialog(new f(this));
    }

    public final void b(String str) {
        HwLog.i("HwWatchFaceLoginHelper", "transmitWatchFaceLoginResult result:" + str);
        OperateWatchFaceCallback operateWatchFaceCallback = this.e;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitWatchFaceLoginResult(str);
        } else {
            HwLog.e("HwWatchFaceLoginHelper", "transmitWatchFaceLoginResult, mOperateWatchFaceCallback is null");
        }
    }

    public void a(int i, InstallWatchFaceBean installWatchFaceBean) {
        HwLog.i("HwWatchFaceLoginHelper", "dealLogin watchFace should login.");
        if (this.f30187c != null && installWatchFaceBean != null) {
            this.f30185a = installWatchFaceBean;
            this.f30186b = i;
            ThreadPoolManager.getInstance().tagExecute("HwWatchFaceLoginHelper", new a());
            return;
        }
        HwLog.w("HwWatchFaceLoginHelper", "dealLogin error.");
    }

    public final void a(String str) {
        boolean zIfAllowLogin = HwWatchFaceApi.getInstance(this.f30187c).ifAllowLogin();
        HwLog.i("HwWatchFaceLoginHelper", "onPositiveClick allowLogin:" + zIfAllowLogin);
        b("-1");
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isHmsLiteEnable()) {
            a(str, zIfAllowLogin);
        } else {
            b(str, zIfAllowLogin);
        }
        a();
    }

    public final void a(String str, boolean z) {
        HwWatchFaceApi.getInstance(Environment.getApplicationContext()).loginByHealthHmsLite(this.f30187c, new b(str, z));
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        HwLog.i("HwWatchFaceLoginHelper", "enter setWatchFaceCallback");
        this.e = operateWatchFaceCallback;
    }

    public final void a(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        String stringById;
        String stringById2;
        String stringById3;
        if (!CommonUtils.a(this.f30187c) && !HwWatchFaceApi.getInstance(this.f30187c).isHmsLiteEnable()) {
            stringById = DensityUtil.getStringById(R.string.IDS_hw_watchface_hw_account_install);
            stringById2 = DensityUtil.getStringById(R.string.IDS_hw_watchface_hms_install_remind);
            stringById3 = DensityUtil.getStringById(R.string.IDS_hw_watchface_go_hms_install);
        } else {
            stringById = DensityUtil.getStringById(R.string.IDS_hw_watchface_hw_account_login);
            stringById2 = DensityUtil.getStringById(R.string.IDS_hw_watchface_login_remind);
            stringById3 = DensityUtil.getStringById(R.string.dialog_no_account_title);
        }
        String str = stringById;
        String str2 = stringById2;
        String str3 = stringById3;
        Context context = this.f30187c;
        if (context == null) {
            HwLog.w("HwWatchFaceLoginHelper", "showLoginDialog, mContext is null");
        } else {
            ((Activity) context).runOnUiThread(new e(str, str2, onClickListener2, str3, onClickListener));
        }
    }

    public final void a() {
        j0 j0Var = this.d;
        if (j0Var != null) {
            j0Var.dismiss();
            this.d = null;
        }
    }
}
