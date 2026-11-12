package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.a;
import com.facebook.yrn.manager.YRNInstanceManager;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class fwr extends jxr {
    public a d;
    public YRNInstanceManager e;
    public final ConcurrentHashMap<String, our> f = new ConcurrentHashMap<>();
    public boolean g = false;

    public fwr() {
    }

    public void h(String str, our ourVar) {
        this.f.put(str, ourVar);
        d();
    }

    public void i() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ewr
            @Override // java.lang.Runnable
            public final void run() {
                this.f17140a.r();
            }
        });
    }

    public our j(String str) {
        return this.f.get(str);
    }

    public YRNBundleInfo k(String str) {
        YRNBundleInfo yRNBundleInfo;
        if (TextUtils.isEmpty(str) || ((yRNBundleInfo = this.c) != null && TextUtils.equals(str, yRNBundleInfo.getModule()))) {
            return this.c;
        }
        our ourVarJ = j(str);
        if (ourVarJ == null || ourVarJ.b() == null) {
            return null;
        }
        return ourVarJ.b();
    }

    public HashMap<String, YRNBundleInfo> l() {
        HashMap<String, YRNBundleInfo> map = new HashMap<>();
        YRNBundleInfo yRNBundleInfo = this.c;
        if (yRNBundleInfo != null) {
            map.put(yRNBundleInfo.getModule(), this.c.m873clone());
        }
        for (Map.Entry<String, our> entry : this.f.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null && entry.getValue().b() != null) {
                map.put(entry.getKey(), entry.getValue().b().m873clone());
            }
        }
        return map;
    }

    public YRNInstanceManager m() {
        return this.e;
    }

    public List<String> n() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, our>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public a o() {
        return this.d;
    }

    public boolean p() {
        return this.g;
    }

    public boolean q() {
        return this.d == null || this.e == null;
    }

    public final /* synthetic */ void r() {
        if (b() != null) {
            ezr.c().f(YRNTraceEvent.newEvent(b().getAppName(), 30, "卸载基础bundle", b(), null));
        }
        for (Map.Entry<String, our> entry : this.f.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                entry.getValue().h();
            }
        }
        this.f.clear();
        a aVar = this.d;
        if (aVar != null) {
            aVar.z();
            this.d = null;
        }
        YRNInstanceManager yRNInstanceManager = this.e;
        if (yRNInstanceManager != null) {
            yRNInstanceManager.destroyInstance();
            this.e = null;
        }
        if (b() != null) {
            ezr.c().f(YRNTraceEvent.newEvent(b().getAppName(), 300, "卸载基础bundle成功", b(), null));
        }
    }

    public void s(String str) {
        this.f.remove(str);
        a();
    }

    public void t(boolean z) {
        this.g = z;
    }

    public void u(YRNInstanceManager yRNInstanceManager) {
        this.e = yRNInstanceManager;
    }

    public void v(a aVar) {
        this.d = aVar;
    }

    public fwr(a aVar, YRNInstanceManager yRNInstanceManager, YRNBundleInfo yRNBundleInfo) {
        this.d = aVar;
        this.e = yRNInstanceManager;
        this.c = yRNBundleInfo;
    }
}
