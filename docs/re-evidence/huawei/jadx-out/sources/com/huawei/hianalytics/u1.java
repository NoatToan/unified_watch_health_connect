package com.huawei.hianalytics;

import android.content.ComponentName;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends e2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11611c;
    public String d;
    public String e;
    public String f;

    public u1(m0 m0Var, String str) {
        super(m0Var, str);
        this.f11611c = new ArrayList();
    }

    @Override // com.huawei.hianalytics.e2
    public final void a() {
    }

    @Override // com.huawei.hianalytics.e2
    public final void a(final Bundle bundle) {
        if (l.a().e) {
            String str = l.a().f;
            if ((TextUtils.equals(str, "all") || TextUtils.equals(str, this.f11487b)) && BaseDialog.LIFE_CYCLE_ON_RESUME.equalsIgnoreCase(bundle.getString("state")) && (!bundle.getBoolean("isHomeActivity"))) {
                TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.u1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(bundle);
                    }
                });
            }
        }
    }

    public final void b(Bundle bundle) {
        ComponentName componentName;
        try {
            componentName = (ComponentName) bundle.getParcelable("comp");
        } catch (Throwable unused) {
            componentName = null;
        }
        if (componentName == null) {
            return;
        }
        String packageName = componentName.getPackageName();
        String className = componentName.getClassName();
        String shortClassName = componentName.getShortClassName();
        if (TextUtils.isEmpty(shortClassName)) {
            shortClassName = null;
        } else {
            int iLastIndexOf = shortClassName.lastIndexOf(".");
            if (iLastIndexOf > -1) {
                shortClassName = shortClassName.substring(iLastIndexOf + 1);
            }
        }
        if (!TextUtils.isEmpty(className)) {
            Iterator it = l.a().p.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(className, (String) it.next())) {
                    return;
                }
            }
        }
        if (!TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(className)) {
            Iterator it2 = l.a().o.iterator();
            while (it2.hasNext()) {
                if (className.startsWith((String) it2.next())) {
                    t1 t1Var = new t1();
                    t1Var.f11606a = this.d;
                    t1Var.f11607b = packageName;
                    t1Var.f11608c = this.e;
                    t1Var.d = shortClassName;
                    t1Var.f = System.currentTimeMillis();
                    String strA = d2.a(this.f);
                    if (!TextUtils.isEmpty(strA)) {
                        strA = new StringBuilder(strA).reverse().toString();
                    }
                    t1Var.e = strA;
                    synchronized (this) {
                        this.f11486a.removeMessages(6);
                        this.f11611c.add(t1Var);
                        if (this.f11611c.size() >= l.a().j) {
                            b();
                        } else {
                            this.f11486a.sendEmptyMessageDelayed(6, l.a().k);
                        }
                        break;
                    }
                }
            }
        }
        this.d = packageName;
        this.e = shortClassName;
        if (!m.a(className)) {
            this.f = null;
        } else {
            this.f11486a.removeMessages(7);
            this.f11486a.sendEmptyMessageDelayed(7, l.a().m);
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.f11611c.isEmpty()) {
                return;
            }
            try {
                HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
                if (instanceByTag != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f11611c.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((t1) it.next()).a());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pageOpen", jSONArray);
                    instanceByTag.onEventSync(0, "106", jSONObject);
                }
            } catch (Throwable th) {
                HiLog.i("CC3", "flush fail: " + th.getMessage());
            }
            this.f11611c.clear();
        }
    }
}
