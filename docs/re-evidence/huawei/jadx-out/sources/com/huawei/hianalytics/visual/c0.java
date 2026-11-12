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
public interface c0 {
    ArrayList a();

    void a(Dialog dialog, String str);

    void a(View view);

    void a(View view, Activity activity);

    void a(View view, String str);

    void a(View view, JSONObject jSONObject);

    void a(ViewMark viewMark);

    void a(Class cls);

    void a(Object obj, String str);

    void a(String str);

    void a(String str, String str2);

    void a(String str, List list);

    void a(String str, JSONObject jSONObject);

    void a(List list);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, r1 r1Var);

    void a(boolean z);

    boolean a(EventType eventType);

    void b(View view);

    void b(View view, String str);

    void b(String str);

    void b(List list);

    boolean b();

    boolean b(Class cls);

    void c();

    void c(Class cls);

    void c(List list);

    boolean c(String str);

    String d();

    void d(Class cls);

    void d(List list);

    void e();

    void e(Class cls);

    void e(List list);

    void f(Class cls);

    void f(List list);

    boolean f();

    void g();

    void g(Class cls);

    void g(List list);

    Context h();

    void h(List list);

    boolean h(Class cls);

    boolean i();

    boolean i(Class cls);
}
