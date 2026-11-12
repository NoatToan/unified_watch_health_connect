package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.hianalytics.visual.autocollect.exposure.ViewMark;
import com.huawei.hianalytics.visual.autocollect.instrument.FragmentInstrumentation;
import com.huawei.hihealth.model.SampleEvent;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.FutureTask;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class f0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11640b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HiAnalyticsInstance f11641c;
    public final HAAutoConfigOptions d;
    public CopyOnWriteArraySet e;
    public CopyOnWriteArraySet f;
    public final CopyOnWriteArraySet g;
    public CopyOnWriteArraySet h;
    public final CopyOnWriteArrayList i;
    public JSONObject j;
    public final boolean k;
    public final boolean l;
    public final HashMap m;
    public final HashMap n;

    public f0(Context context, HiAnalyticsInstance hiAnalyticsInstance, HiAnalyticsConfig hiAnalyticsConfig, HiAnalyticsConfig hiAnalyticsConfig2, HAAutoConfigOptions hAAutoConfigOptions) {
        this.f11639a = context instanceof Application ? context : context.getApplicationContext();
        this.f11641c = hiAnalyticsInstance;
        this.d = hAAutoConfigOptions;
        this.e = new CopyOnWriteArraySet();
        this.f = new CopyOnWriteArraySet();
        this.h = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
        this.i = new CopyOnWriteArrayList();
        this.j = new JSONObject();
        this.m = new HashMap();
        if (hiAnalyticsConfig != null) {
            this.k = true;
        }
        if (hiAnalyticsConfig2 != null) {
            this.l = true;
        }
        this.n = new HashMap();
        Application application = (Application) context.getApplicationContext();
        u uVar = u.f11699c;
        uVar.a(application);
        uVar.a(new e());
        if (a.f11616b == null) {
            a.f11616b = new a();
        }
        uVar.a(a.f11616b);
        uVar.a(new z());
        FragmentInstrumentation.addHAFragmentCallbacks(new p());
        FragmentInstrumentation.addHAFragmentCallbacks(new s());
        if (s0.f11693a == null) {
            FutureTask futureTask = new FutureTask(new r0(context));
            h1.a().execute(futureTask);
            s0.f11693a = futureTask;
        }
        a(context, hAAutoConfigOptions);
        if (hAAutoConfigOptions.isAutoCollectEnabled() && hAAutoConfigOptions.isWebViewBridgeEnabled()) {
            h0.a(context, hAAutoConfigOptions);
        }
    }

    public static void a(Context context, HiAnalyticsConfig hiAnalyticsConfig, HiAnalyticsConfig hiAnalyticsConfig2, HAAutoConfigOptions hAAutoConfigOptions) {
        if (context == null) {
            HiLog.sw("HAAgentImpl", "create(): instance context is null, create failed! TAG: hianalytics_default_autocollect");
            return;
        }
        if (!hAAutoConfigOptions.isAutoCollectEnabled()) {
            HiLog.sw("HAAgentImpl", "hiAnalytics auto collect instance is disabled, please enable");
            return;
        }
        f0 f0Var = new f0(context, new HiAnalyticsInstance.Builder(context).setOperConf(hiAnalyticsConfig).setMaintConf(hiAnalyticsConfig2).refresh("hianalytics_default_autocollect"), hiAnalyticsConfig, hiAnalyticsConfig2, hAAutoConfigOptions);
        synchronized (w.f11712b) {
            w.f11711a = f0Var;
        }
        q1.f11686b.a();
        if (!w.a().f()) {
            if (!w.a().a(EventType.APP_INSTALL)) {
                l.b();
            }
        }
        HiLog.i("HAAgentImpl", "HiAnalytics Visual auto collect instance init end. ========sdk V:3.2.14.503");
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (cls != null) {
                this.g.add(Integer.valueOf(cls.hashCode()));
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void c(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str) && !this.i.contains(str)) {
                this.i.add(str);
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final String d() {
        return f1.f11642b.f11643a.f11635a;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void e(Class cls) {
        if (cls == null) {
            return;
        }
        if (this.f == null) {
            this.f = new CopyOnWriteArraySet();
        }
        this.f.add(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void f(Class cls) {
        if (cls == null) {
            return;
        }
        this.g.add(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void g() {
        Context context = this.f11639a;
        if (context == null) {
            HiLog.sw("HAAgentImpl", "syncVisualConfig context is null");
            return;
        }
        HAAutoConfigOptions hAAutoConfigOptions = this.d;
        if (hAAutoConfigOptions == null) {
            HiLog.sw("HAAgentImpl", "syncVisualConfig haAutoConfigOptions is null");
        } else {
            a(context, hAAutoConfigOptions);
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final Context h() {
        return this.f11639a;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean i() {
        return this.d.isVisualizedEnabled() || this.d.isVisualConfigEnabled();
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean f() {
        if (this.d.isAutoCollectEnabled()) {
            return false;
        }
        return !this.f11640b;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean h(Class cls) {
        if (this.g.isEmpty()) {
            return false;
        }
        return !this.g.contains(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean i(Class cls) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.e;
        return copyOnWriteArraySet != null && copyOnWriteArraySet.contains(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void d(Class cls) {
        if (cls == null) {
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArraySet();
        }
        this.e.remove(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void e(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f == null) {
            this.f = new CopyOnWriteArraySet();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (cls != null) {
                this.f.add(Integer.valueOf(cls.hashCode()));
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void f(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArraySet();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (cls != null) {
                this.e.remove(Integer.valueOf(cls.hashCode()));
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void h(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArraySet();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (cls != null) {
                this.e.add(Integer.valueOf(cls.hashCode()));
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean c(String str) {
        if (str == null || this.i.isEmpty()) {
            return false;
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void d(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f == null) {
            this.f = new CopyOnWriteArraySet();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (cls != null) {
                this.f.remove(Integer.valueOf(cls.hashCode()));
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void g(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f11640b = true;
        this.d.setAutoCollectEventTypes(list);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean b() {
        return this.d.isWebViewBridgeEnabled();
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean b(Class cls) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f;
        return copyOnWriteArraySet != null && copyOnWriteArraySet.contains(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        view.setTag(R.id.hianalytics_fragment_view_user_tag, str);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void c(Class cls) {
        if (cls == null) {
            return;
        }
        if (this.h == null) {
            this.h = new CopyOnWriteArraySet();
        }
        this.h.add(cls);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void g(Class cls) {
        if (cls == null) {
            return;
        }
        if (this.f == null) {
            this.f = new CopyOnWriteArraySet();
        }
        this.f.remove(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(View view) {
        l1 l1Var;
        p1 p1VarA = p1.a();
        p1VarA.getClass();
        if (w.a().f()) {
            return;
        }
        if (w.a().a(EventType.VIEW_EXPOSURE)) {
            return;
        }
        if (view == null || p1VarA.f11679b == null) {
            l1Var = null;
            break;
        }
        Activity activityA = o0.a(view.getContext(), view);
        if (activityA != null) {
            l1Var = (l1) p1VarA.f11679b.get(activityA);
        } else {
            try {
                Iterator it = p1VarA.f11679b.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        l1Var = null;
                        break;
                    }
                    l1 l1Var2 = (l1) it.next();
                    if (l1Var2.f11661c.containsKey(view)) {
                        l1Var = l1Var2;
                        break;
                    }
                }
            } catch (ConcurrentModificationException unused) {
                HiLog.d("HAEO", "concurrent modification");
            }
        }
        if (l1Var == null) {
            return;
        }
        p1.a(l1Var, view);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void c() {
        HiAnalyticsInstance hiAnalyticsInstance = this.f11641c;
        if (hiAnalyticsInstance == null) {
            HiLog.w("HAAgentImpl", "onReport, HiAnalyticsAgentImpl auto Instance is null");
            return;
        }
        if (this.k) {
            hiAnalyticsInstance.onReport(0);
        }
        if (this.l) {
            this.f11641c.onReport(1);
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void e() {
        if (this.j == null) {
            return;
        }
        this.j = new JSONObject();
    }

    public final void a(Context context, HAAutoConfigOptions hAAutoConfigOptions) {
        if (hAAutoConfigOptions.isAutoCollectEnabled() && hAAutoConfigOptions.isVisualConfigEnabled()) {
            z0 z0Var = y0.f11716a;
            z0Var.a(context, hAAutoConfigOptions);
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            List list = z0Var.f11722c;
            if (list == null || list.isEmpty()) {
                return;
            }
            for (String str : z0Var.f11722c) {
                if (!copyOnWriteArrayList.contains(str)) {
                    copyOnWriteArrayList.add(str);
                }
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(boolean z) {
        HiLog.i("HAAgentImpl", "enableAutoCollect: " + z);
        this.d.setAutoCollectEnabled(z);
        this.f11640b = z;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(List list) {
        if (list == null || this.d.getAutoCollectEventTypes().isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.d.getAutoCollectEventTypes().remove((EventType) it.next());
        }
        if (this.d.getAutoCollectEventTypes().isEmpty()) {
            this.f11640b = false;
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(String str) {
        a(str, (List) null);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(Class cls) {
        if (cls == null) {
            return;
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArraySet();
        }
        this.e.add(Integer.valueOf(cls.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean a(EventType eventType) {
        if (eventType == null) {
            return false;
        }
        return !this.d.getAutoCollectEventTypes().contains(eventType);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        view.setTag(R.id.hianalytics_view_id_tag, str);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(Dialog dialog, String str) {
        if (dialog == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Window window = dialog.getWindow();
            if (window == null || window.getDecorView() == null) {
                return;
            }
            window.getDecorView().setTag(R.id.hianalytics_view_id_tag, str);
        } catch (Exception unused) {
            HiLog.w("HAAgentImpl", "fail to set view id for dialog");
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(Object obj, String str) {
        Class clsA = i1.a();
        if (clsA == null || obj == null || TextUtils.isEmpty(str) || !clsA.isInstance(obj)) {
            return;
        }
        try {
            Object objInvoke = obj.getClass().getMethod("getWindow", new Class[0]).invoke(obj, new Object[0]);
            if (objInvoke == null) {
                return;
            }
            Window window = (Window) objInvoke;
            if (window.getDecorView() != null) {
                window.getDecorView().setTag(R.id.hianalytics_view_id_tag, str);
            }
        } catch (Exception unused) {
            HiLog.sw("HAAgentImpl", "fail to set view id for alertDialog");
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view, Activity activity) {
        if (view == null || activity == null) {
            return;
        }
        view.setTag(R.id.hianalytics_activity_view_user_tag, activity);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.hianalytics_view_disabled_user_tag, "1");
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view, JSONObject jSONObject) {
        if (view == null || jSONObject == null) {
            return;
        }
        view.setTag(R.id.hianalytics_view_custom_property_tag, jSONObject);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final ArrayList a() {
        if (this.h == null) {
            this.h = new CopyOnWriteArraySet();
        }
        return new ArrayList(this.h);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(JSONObject jSONObject) {
        if (this.j == null) {
            this.j = new JSONObject();
        }
        i1.a(jSONObject, this.j);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str) {
        JSONObject jSONObject = this.j;
        if (jSONObject == null) {
            return;
        }
        jSONObject.remove(str);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str, JSONObject jSONObject) {
        h1.a().execute(new e0(this, jSONObject, null, str));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(JSONObject jSONObject, r1 r1Var) {
        h1.a().execute(new e0(this, jSONObject, r1Var, "$ViewClick"));
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(ViewMark viewMark) {
        p1.a().b(viewMark);
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str, List list) {
        if (!TextUtils.isEmpty(str) && str.startsWith(SampleEvent.SEPARATOR)) {
            Set hashSet = (Set) this.m.get(str);
            if (hashSet == null) {
                hashSet = new HashSet();
            }
            if (list != null && list.size() > 0) {
                hashSet.addAll(list);
            }
            this.m.put(str, hashSet);
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str, String str2) {
        String strPattern;
        if (!TextUtils.isEmpty(str) && str2 != null) {
            try {
                strPattern = Pattern.compile(str).pattern();
            } catch (Exception e) {
                d0.a(e, new StringBuilder("invalid reg: "), "HAAgentImpl");
                strPattern = "";
            }
            if (TextUtils.isEmpty(strPattern)) {
                return;
            }
            this.n.put(strPattern, str2);
            return;
        }
        HiLog.w("HAAgentImpl", "reg or replacement is null");
    }
}
