package com.huawei.watchface;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes20.dex */
public class b3 {
    public static b3 d;
    public static volatile Executor e = Executors.newFixedThreadPool(2);
    public static final Object f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f30087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g4 f30088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IBaseResponseCallback f30089c;

    public static class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f30090a;

        public a(b3 b3Var) {
            this.f30090a = new WeakReference(b3Var);
        }

        public final b3 a() {
            return (b3) this.f30090a.get();
        }

        public g4 b() {
            if (a() == null) {
                return null;
            }
            return a().d();
        }

        @Override // android.os.AsyncTask
        public g4 doInBackground(Void... voidArr) {
            return b();
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(g4 g4Var) {
            super.onPostExecute(g4Var);
            if (a() == null) {
                return;
            }
            a().a(g4Var);
        }
    }

    public b3() {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.b3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    public static b3 b() {
        b3 b3Var;
        synchronized (b3.class) {
            if (d == null) {
                d = new b3();
            }
            b3Var = d;
        }
        return b3Var;
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        this.f30089c = iBaseResponseCallback;
    }

    public g4 c() {
        return this.f30088b;
    }

    public g4 d() {
        if (WatchFaceHttpUtil.b() == null) {
            HwLog.i("OnlineStateManager", "getSupportTypeFromService null == hostName");
            return new g4();
        }
        d1 d1Var = new d1();
        int i = 3;
        while (i > 0) {
            i--;
            g4 g4VarB = d1Var.b(d1Var.c(""));
            this.f30088b = g4VarB;
            if (g4VarB != null) {
                HwLog.i("OnlineStateManager", "request state success reTryCount = " + i);
                break;
            }
            if (!CommonUtils.C()) {
                break;
            }
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e2) {
                HwLog.e("OnlineStateManager", "mJsonFileAsyncTask InterruptedException error:" + HwLog.printException((Exception) e2));
            }
        }
        return this.f30088b;
    }

    public final /* synthetic */ void e() {
        String commonCountryCode = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode();
        try {
            if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea() || !"CN".equals(commonCountryCode)) {
                String strB = b(Environment.getApplicationContext(), "overseasSupportOnlineInfo");
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                this.f30088b = g4.i(strB);
                return;
            }
            String strB2 = b(Environment.getApplicationContext(), "SupportOnlineInfo");
            if (TextUtils.isEmpty(strB2)) {
                return;
            }
            this.f30088b = g4.i(strB2);
        } catch (Exception e2) {
            HwLog.e("OnlineStateManager", "OnlineStateManager Exception:" + HwLog.printException(e2));
        }
    }

    public void f() {
        synchronized (f) {
            a aVar = this.f30087a;
            if (aVar != null) {
                if (aVar.isCancelled()) {
                    this.f30087a.cancel(true);
                }
                this.f30087a = null;
            }
            try {
                a aVar2 = new a(this);
                this.f30087a = aVar2;
                aVar2.executeOnExecutor(e, new Void[0]);
            } catch (Exception e2) {
                HwLog.e("OnlineStateManager", "queryOnlineState Exception:" + HwLog.printException(e2));
            }
        }
    }

    public void a(g4 g4Var) {
        IBaseResponseCallback iBaseResponseCallback = this.f30089c;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.onResponse(0, g4Var);
        }
        if (g4Var == null) {
            HwLog.d("OnlineStateManager", "supportType == null");
            return;
        }
        g4 g4Var2 = this.f30088b;
        if (g4Var2 == null || !g4Var2.equals(g4Var)) {
            this.f30088b = g4Var;
        }
    }

    public static void b(Context context, String str, String str2) {
        synchronized (b3.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strC = k5.c(str2, "storagePw");
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            SharedPreferences.Editor editorEdit = e4.b(context, "supportonline").edit();
            editorEdit.putString("onlineState_" + str, strC);
            editorEdit.commit();
        }
    }

    public static void a(Context context, String str, String str2) {
        synchronized (b3.class) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                SharedPreferences sharedPreferencesB = e4.b(context, "supportonline");
                if (sharedPreferencesB == null) {
                    HwLog.i("OnlineStateManager", "saveChargeOnlineState sp is null");
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
                if (editorEdit == null) {
                    HwLog.i("OnlineStateManager", "saveChargeOnlineState editor is null");
                    return;
                } else {
                    editorEdit.putString(str, str2);
                    editorEdit.commit();
                    return;
                }
            }
            HwLog.i("OnlineStateManager", "saveChargeOnlineState type is empty or info is empty");
        }
    }

    public static String b(Context context, String str) {
        synchronized (b3.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            SharedPreferences sharedPreferencesB = e4.b(context, "supportonline");
            String strA = "";
            if (sharedPreferencesB != null) {
                if (sharedPreferencesB.contains("onlineState_" + str)) {
                    strA = k5.a(sharedPreferencesB.getString("onlineState_" + str, ""), "storagePw");
                }
            }
            return strA;
        }
    }

    public static String a(Context context, String str) {
        synchronized (b3.class) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            SharedPreferences sharedPreferencesB = e4.b(context, "supportonline");
            if (sharedPreferencesB == null) {
                HwLog.i("OnlineStateManager", "getChargeOnlineState sp is null");
                return "";
            }
            if (!sharedPreferencesB.contains(str)) {
                HwLog.i("OnlineStateManager", "getChargeOnlineState sp not contains type");
                return "";
            }
            return sharedPreferencesB.getString(str, "");
        }
    }

    public void a() {
        HwLog.d("OnlineStateManager", "OnlineStateManager clear");
        this.f30089c = null;
        a aVar = this.f30087a;
        if (aVar != null) {
            aVar.cancel(true);
            this.f30087a = null;
        }
    }
}
