package com.huawei.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.data.WorkKeyHandler;
import com.huawei.hianalytics.kit.AesKeyGetterImpl;
import com.tencent.connect.common.Constants;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f11555c = {"ABTesting", "_default_config_tag"};
    public static final Object d = new Object();
    public static j0 e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11556a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11557b;

    public static j0 a() {
        if (e == null) {
            synchronized (j0.class) {
                if (e == null) {
                    e = new j0();
                }
            }
        }
        return e;
    }

    public final void a(Context context) {
        String strA;
        synchronized (d) {
            if (this.f11557b != null) {
                HiLog.i("HADM", "sdk has been initialized");
                return;
            }
            this.f11557b = context;
            EnvUtils.setAppContext(context);
            WorkKeyHandler.setAesKeyGetter(new AesKeyGetterImpl());
            k.b().a().f = context.getPackageName();
            l0 l0VarA = k.b().a();
            if (t.b()) {
                strA = t.a("ro.build.version.magic");
            } else {
                strA = t.a("ro.build.version.emui");
            }
            l0VarA.f11573a = strA;
            k.b().a().z = t.a("hw_sc.build.platform.version");
            q qVarA = q.a();
            if (qVarA.f11599a == null) {
                qVarA.f11599a = context;
            }
            k.b().a().q = x0.b(context);
            String strA2 = t.a(context);
            k.b().a().i = TextUtils.isEmpty(strA2) ? "" : strA2;
            if (j2.f11561b.a()) {
                String strA3 = c2.a("global_v2", Constants.PARAM_APP_VER);
                if (TextUtils.isEmpty(strA3)) {
                    strA3 = "";
                }
                c2.a("global_v2", Constants.PARAM_APP_VER, strA2);
                k.b().a().j = strA3;
                if (TextUtils.isEmpty(strA2) || strA2.equals(strA3)) {
                    return;
                }
                k.b().a().p = System.currentTimeMillis();
                return;
            }
            HiLog.i("HADM", "user lock");
        }
    }

    public final a0 a(String str, a0 a0Var) {
        a0 a0Var2 = (a0) this.f11556a.putIfAbsent(str, a0Var);
        a0 a0Var3 = (a0) this.f11556a.get(str);
        if (a0Var3 != null) {
            k kVarB = k.b();
            q0 q0Var = a0Var3.f11448a;
            kVarB.getClass();
            k.f11563b.put(str, q0Var);
        }
        return a0Var2;
    }

    public final a0 a(String str) {
        if (str == null) {
            HiLog.sw("HADM", "tag can't be null");
            return null;
        }
        if (this.f11556a.containsKey(str)) {
            HiLog.d("HADM", "tag: " + str + " found");
            return (a0) this.f11556a.get(str);
        }
        HiLog.sw("HADM", "tag: " + str + " not found");
        return null;
    }
}
