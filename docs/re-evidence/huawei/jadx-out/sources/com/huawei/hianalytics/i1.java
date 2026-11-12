package com.huawei.hianalytics;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
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
public final class i1 extends e2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11551c;
    public String d;
    public String e;
    public long f;

    public i1(m0 m0Var, String str) {
        super(m0Var, str);
        this.f11551c = new ArrayList();
    }

    @Override // com.huawei.hianalytics.e2
    public final void a(final Bundle bundle) {
        if (g0.f11539a[0].equals(this.f11487b) && l.a().f11572c && BaseDialog.LIFE_CYCLE_ON_RESUME.equalsIgnoreCase(bundle.getString("state"))) {
            TaskThread.getRecordThread().addToQueue(new Runnable() { // from class: com.huawei.hianalytics.i1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(bundle);
                }
            });
        }
    }

    public final void b(Bundle bundle) {
        try {
            ComponentName componentName = (ComponentName) bundle.getParcelable("comp");
            if (componentName == null) {
                return;
            }
            this.f11486a.removeMessages(1);
            if (!m.a(componentName.getClassName())) {
                b();
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = componentName.getPackageName();
            this.f11486a.sendMessageDelayed(messageObtain, l.a().m);
        } catch (Throwable th) {
            HiLog.i("CC2", "cache " + th.getMessage());
        }
    }

    public final void c() {
        synchronized (this) {
            if (this.f11551c.isEmpty()) {
                return;
            }
            try {
                HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag("ha_default_collection");
                if (instanceByTag != null) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f11551c.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((h1) it.next()).a());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("liteApps", jSONArray);
                    jSONObject.put("version", "2.0");
                    if (HiLog.isDebugEnable()) {
                        HiLog.d("CC2", "onEvent:" + jSONObject);
                    }
                    instanceByTag.onEventSync(0, "101", jSONObject);
                }
            } catch (Throwable th) {
                HiLog.i("CC2", "flush fail: " + th.getMessage());
            }
            this.f11551c.clear();
        }
    }

    @Override // com.huawei.hianalytics.e2
    public final void a() {
        b();
    }

    public final void b() {
        synchronized (this) {
            if (TextUtils.isEmpty(this.d)) {
                return;
            }
            this.f11486a.removeMessages(2);
            this.f11551c.add(new h1(this.d, this.f, System.currentTimeMillis(), this.e));
            if (this.f11551c.size() >= l.a().j) {
                c();
            } else {
                this.f11486a.sendEmptyMessageDelayed(2, l.a().k);
            }
            this.d = "";
            this.f = 0L;
            this.e = "";
        }
    }
}
