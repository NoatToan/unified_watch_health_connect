package defpackage;

import android.text.TextUtils;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f36248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gze f36249c;
    private float d;
    private float e;
    private List<gze> i;
    private final Map<String, ITargetUpdateListener> j = Collections.synchronizedMap(new HashMap());
    private boolean g = false;
    private String h = Integer.toString(20002);
    private StorageParams f = new StorageParams();

    public void e(List<gze> list) {
        LogUtil.a("Track_TargetManager", "initTargetList ");
        if (list == null || list.isEmpty()) {
            LogUtil.j("Track_TargetManager", "initTargetList input is null or empty");
            return;
        }
        this.i = list;
        SharedPreferenceManager.e(BaseApplication.getContext(), this.h, "sport_plan_target_new", CommonUtil.c(this.i), this.f);
        if (this.i.size() > 0) {
            this.f36249c = this.i.get(0);
        }
    }

    public void a() {
        List<gze> list = this.i;
        if (list != null && list.size() > 0) {
            this.i.remove(0);
            if (this.i.size() > 0) {
                int i = this.f36249c.i();
                gze gzeVar = this.i.get(0);
                this.f36249c = gzeVar;
                if (i != gzeVar.i()) {
                    LogUtil.a("Track_TargetManager", "updateNewTargetValue() changeType");
                }
                g();
                if (this.f36249c.i() == 200) {
                    h();
                } else {
                    e(201, "");
                }
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "sport_plan_target_new", CommonUtil.c(this.i), new StorageParams());
            } else {
                h();
            }
        } else {
            h();
        }
        LogUtil.a("Track_TargetManager", "updateNewTargetValue ");
    }

    private void h() {
        this.g = true;
        e(200, "");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    private void g() {
        gze gzeVar = this.f36249c;
        if (gzeVar != null) {
            int i = gzeVar.i();
            if (i == 0) {
                this.f36249c.c(this.d);
            } else if (i == 1) {
                this.f36249c.c(this.f36248b);
            } else if (i == 2) {
                this.f36249c.c(this.f36247a * 1000.0f);
            } else if (i == 4 || i == 5) {
                this.f36249c.c(this.e);
            } else if (i == 255) {
                this.f36249c.c(this.d);
            } else {
                LogUtil.e("Track_TargetManager", "Wrong target");
            }
        }
        LogUtil.a("Track_TargetManager", "setSportCountdownTypeValue ");
    }

    private float i() {
        gze gzeVar = this.f36249c;
        if (gzeVar == null) {
            return 0.0f;
        }
        int i = gzeVar.i();
        if (i == 0) {
            this.f36249c.a(this.d);
        } else if (i == 1) {
            this.f36249c.d(this.f36248b);
        } else if (i == 2) {
            this.f36249c.d(this.f36247a * 1000.0f);
        } else if (i == 4) {
            this.f36249c.b(this.e, 4);
        } else if (i != 5) {
            if (i != 255) {
                return 0.0f;
            }
            this.f36249c.a(this.d);
        } else {
            this.f36249c.b(this.e, 5);
        }
        return this.f36249c.b();
    }

    public void e(float f, long j, float f2, int i) {
        this.f36248b = f;
        this.f36247a = f2;
        this.d = j;
        this.e = i;
        if (this.g) {
            return;
        }
        float fI = i();
        j();
        if (fI >= 1.0f) {
            a();
        }
    }

    private void f() {
        gze gzeVar = this.f36249c;
        if (gzeVar != null) {
            int i = gzeVar.i();
            if (i == 0) {
                this.f36249c.e(this.d);
            } else if (i == 1) {
                this.f36249c.e(this.f36248b);
            } else {
                if (i != 2) {
                    return;
                }
                this.f36249c.e(this.f36247a * 1000.0f * 1.0f);
            }
        }
    }

    private void e(int i, String str) {
        Iterator<ITargetUpdateListener> it = this.j.values().iterator();
        while (it.hasNext()) {
            it.next().onStateUpdate(i, str);
        }
    }

    private void j() {
        Iterator<ITargetUpdateListener> it = this.j.values().iterator();
        while (it.hasNext()) {
            it.next().onTargetDataUpdate(this.f36249c);
        }
    }

    public List<gze> d() {
        return this.i;
    }

    public gze b() {
        return this.f36249c;
    }

    public void e(String str, ITargetUpdateListener iTargetUpdateListener) {
        if (TextUtils.isEmpty(str) || iTargetUpdateListener == null) {
            LogUtil.e("Track_TargetManager", "registerTargetUpdateListener failed. tag: ", str, ". listener is null: ", Boolean.valueOf(iTargetUpdateListener == null));
        } else {
            LogUtil.a("Track_TargetManager", "registerTargetUpdateListener success. tag: ", str);
            this.j.put(str, iTargetUpdateListener);
        }
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str) || !this.j.containsKey(str)) {
            LogUtil.e("Track_TargetManager", "unregisterTargetUpdateListener failed: tag is empty or tag not in map. tag: ", str);
        } else {
            LogUtil.a("Track_TargetManager", "unregisterTargetUpdateListener success. tag: ", str);
            this.j.remove(str);
        }
    }

    public float c() {
        if (this.f36249c == null) {
            return 0.0f;
        }
        f();
        return this.f36249c.a();
    }

    public float e() {
        gze gzeVar = this.f36249c;
        if (gzeVar != null) {
            return gzeVar.b();
        }
        return 0.0f;
    }
}
