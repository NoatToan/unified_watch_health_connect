package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.hianalytics.visual.autocollect.exposure.ViewMark;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements c0 {
    @Override // com.huawei.hianalytics.visual.c0
    public final void a(Dialog dialog, String str) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view, Activity activity) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view, String str) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(View view, JSONObject jSONObject) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(Class cls) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(Object obj, String str) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str, String str2) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str, List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(String str, JSONObject jSONObject) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(JSONObject jSONObject) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(JSONObject jSONObject, r1 r1Var) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(boolean z) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean a(EventType eventType) {
        return true;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(View view, String str) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(String str) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean b() {
        return false;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean b(Class cls) {
        return true;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void c() {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void c(Class cls) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void c(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean c(String str) {
        return false;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void d(Class cls) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void d(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void e() {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void e(Class cls) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void e(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void f(Class cls) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void f(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean f() {
        return true;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void g() {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void g(Class cls) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void g(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final Context h() {
        return null;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void h(List list) {
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean h(Class cls) {
        return false;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean i() {
        return false;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final boolean i(Class cls) {
        return true;
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final String d() {
        return "";
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void b(View view) {
        Activity activityA;
        if (view == null || (activityA = o0.a(view.getContext(), view)) == null) {
            return;
        }
        q1 q1Var = q1.f11686b;
        synchronized (q1Var) {
            List<ViewMark> list = (List) q1Var.f11687a.get(Integer.valueOf(activityA.hashCode()));
            if (list == null) {
                return;
            }
            for (ViewMark viewMark : list) {
                if (viewMark != null && view == viewMark.getView()) {
                    list.remove(viewMark);
                    return;
                }
            }
        }
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final ArrayList a() {
        return new ArrayList();
    }

    @Override // com.huawei.hianalytics.visual.c0
    public final void a(ViewMark viewMark) {
        View view;
        Activity activityA;
        if (viewMark == null || (view = viewMark.getView()) == null || (activityA = o0.a(view.getContext(), view)) == null) {
            return;
        }
        q1 q1Var = q1.f11686b;
        synchronized (q1Var) {
            int iHashCode = activityA.hashCode();
            List arrayList = (List) q1Var.f11687a.get(Integer.valueOf(iHashCode));
            if (arrayList == null) {
                arrayList = new ArrayList();
                q1Var.f11687a.put(Integer.valueOf(iHashCode), arrayList);
            }
            arrayList.add(viewMark);
        }
    }
}
