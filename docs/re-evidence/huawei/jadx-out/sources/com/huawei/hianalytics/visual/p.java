package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class p implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f11676a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11677b;

    @Override // com.huawei.hianalytics.visual.y
    public final void a(View view, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String name = obj.getClass().getName();
            view.setTag(R.id.hianalytics_fragment_view_sdk_tag, name);
            if (view instanceof ViewGroup) {
                a(name, (ViewGroup) view);
            }
            Activity activityA = o0.a(view.getContext(), view);
            if (activityA == null) {
                return;
            }
            if (activityA.getWindow() != null) {
                if (activityA.getWindow().getDecorView() == null) {
                    return;
                } else {
                    activityA.getWindow().getDecorView().getRootView().setTag(R.id.hianalytics_fragment_view_sdk_tag, name);
                }
            }
            t.a(obj, name);
        } catch (Exception unused) {
            HiLog.w("HAFPEnter", "fail to set fragment name for view");
        }
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void b(Object obj) {
        if (obj == null) {
            return;
        }
        this.f11676a.remove(Integer.valueOf(obj.hashCode()));
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void b(Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (z) {
            a(obj, "setUserVisibleHint");
        } else {
            this.f11676a.remove(Integer.valueOf(obj.hashCode()));
        }
    }

    public final void a(Object obj, String str) {
        if (w.a().f() || obj == null) {
            return;
        }
        if (w.a().a(EventType.PAGE_ENTER)) {
            return;
        }
        if (w.a().b(obj.getClass()) || this.f11676a.containsKey(Integer.valueOf(obj.hashCode())) || !t.f(obj)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            i1.a(t.a((Activity) null, obj), jSONObject);
            m mVarA = m.a();
            jSONObject.getString("$page_name");
            mVarA.getClass();
            try {
                obj.getClass().getMethod("getParentFragment", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
                HiLog.w("ApplicationStateMonitor", "fail to find getParentFragment method");
            }
            String canonicalName = obj.getClass().getCanonicalName();
            jSONObject.put("$last_page", TextUtils.isEmpty(this.f11677b) ? "" : this.f11677b);
            jSONObject.put("$current_page", canonicalName);
            this.f11677b = canonicalName;
            i1.a(obj, jSONObject);
            i1.b(obj, jSONObject);
            w.a().a("$AppViewScreen", jSONObject);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("fail to report enter fragment event ");
            sb.append(str);
            sb.append(", ex: ");
            d0.a(e, sb, "HAFPEnter");
        }
        this.f11676a.put(Integer.valueOf(obj.hashCode()), obj);
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void a(Object obj) {
        a(obj, BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // com.huawei.hianalytics.visual.y
    public final void a(Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (z) {
            this.f11676a.remove(Integer.valueOf(obj.hashCode()));
        } else {
            a(obj, "onHiddenChanged");
        }
    }

    public static void a(String str, ViewGroup viewGroup) {
        if (str.isEmpty() || viewGroup == null) {
            return;
        }
        try {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setTag(R.id.hianalytics_fragment_view_sdk_tag, str);
                if ((childAt instanceof ViewGroup) && !(childAt instanceof ListView) && !(childAt instanceof GridView) && !(childAt instanceof Spinner) && !(childAt instanceof RadioGroup)) {
                    a(str, (ViewGroup) childAt);
                }
            }
        } catch (Exception unused) {
            HiLog.w("HAFPEnter", "fail to add name to each view");
        }
    }
}
