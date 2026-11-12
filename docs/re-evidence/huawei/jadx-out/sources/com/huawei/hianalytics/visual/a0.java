package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a0 f11618c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f11619a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f11620b = new SparseArray();

    public static a0 a() {
        if (f11618c == null) {
            synchronized (a0.class) {
                if (f11618c == null) {
                    f11618c = new a0();
                }
            }
        }
        return f11618c;
    }

    public final r1 a(View view, String str, String str2, String str3) {
        r1 r1Var = null;
        View rootView = null;
        try {
            HashMap map = this.f11619a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!TextUtils.isEmpty(str2)) {
                sb.append(str2);
            }
            sb.append(str3);
            r1 r1Var2 = (r1) map.get(sb.toString());
            if (r1Var2 != null) {
                return r1Var2;
            }
            if (view != null) {
                try {
                    rootView = view.getRootView();
                } catch (Exception e) {
                    e = e;
                    r1Var = r1Var2;
                    d0.a(e, new StringBuilder("fail to get view node from visual, ex: "), "HAViewNodeService");
                    return r1Var;
                }
            }
            if (rootView == null) {
                m.a().getClass();
                Activity activityB = u.f11699c.b();
                if (activityB != null && activityB.getWindow() != null && activityB.getWindow().isActive()) {
                    rootView = activityB.getWindow().getDecorView();
                }
            }
            if (rootView != null) {
                this.f11619a.clear();
                this.f11620b.clear();
                SparseArray sparseArray = new SparseArray();
                HashMap map2 = new HashMap();
                try {
                    a(rootView, sparseArray, map2);
                    this.f11619a = map2;
                    this.f11620b = sparseArray;
                } catch (Exception unused) {
                    HiLog.w("HAViewNodeService", "fail to traverse view node");
                }
            }
            HashMap map3 = this.f11619a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(str2);
            }
            sb2.append(str3);
            return (r1) map3.get(sb2.toString());
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void a(View view, SparseArray sparseArray, HashMap map) {
        if (view == null) {
            return;
        }
        r1 r1VarA = a(view, true);
        if (r1VarA != null) {
            sparseArray.put(view.hashCode(), r1VarA);
            if (!TextUtils.isEmpty(r1VarA.e)) {
                JSONObject jSONObject = new JSONObject();
                Activity activityA = o0.a(view.getContext(), view);
                if (activityA == null) {
                    m.a().getClass();
                    activityA = u.f11699c.b();
                }
                if (activityA != null && activityA.getWindow() != null && activityA.getWindow().isActive()) {
                    Object objA = t.a(view, activityA);
                    jSONObject = objA == null ? o0.b(activityA) : t.a(activityA, objA);
                }
                String strOptString = jSONObject.optString("$page_name");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = r1VarA.e;
                    String str2 = r1VarA.g;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                    }
                    sb.append(strOptString);
                    map.put(sb.toString(), r1VarA);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    a(childAt, sparseArray, map);
                }
            }
        }
    }

    public final r1 a(View view, boolean z) {
        r1 r1VarF;
        String str;
        r1 r1VarA;
        int iLastIndexOf;
        r1 r1Var;
        if (z && (r1Var = (r1) this.f11620b.get(view.hashCode())) != null) {
            return r1Var;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof ViewGroup ? (View) parent : null;
        if (view2 == null) {
            r1VarA = v1.f(view);
        } else {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (z) {
                r1VarF = (r1) this.f11620b.get(view2.hashCode());
                if (r1VarF == null) {
                    r1VarF = v1.f(view2);
                    this.f11620b.put(view2.hashCode(), r1VarF);
                }
            } else {
                r1VarF = v1.f(view2);
            }
            if (r1VarF == null) {
                str = "";
            } else {
                sb.append(r1VarF.f);
                sb2.append(r1VarF.e);
                str = r1VarF.g;
            }
            r1VarA = v1.a(view, ((ViewGroup) view2).indexOfChild(view));
            if (r1VarA != null) {
                if (!TextUtils.isEmpty(r1VarA.e) && r1VarA.e.contains(Constants.LINK) && !TextUtils.isEmpty(str) && (iLastIndexOf = sb2.lastIndexOf(Constants.LINK)) != -1) {
                    sb2.replace(iLastIndexOf, iLastIndexOf + 1, str);
                }
                sb.append(r1VarA.f);
                sb2.append(r1VarA.e);
                r1VarA = new r1(view, r1VarA.f11690b, r1VarA.f11691c, v1.a(r1VarA.d), sb2.toString(), sb.toString(), r1VarA.g, r1VarA.h, r1VarA.i);
            }
        }
        if (z) {
            this.f11620b.put(view.hashCode(), r1VarA);
        }
        return r1VarA;
    }
}
