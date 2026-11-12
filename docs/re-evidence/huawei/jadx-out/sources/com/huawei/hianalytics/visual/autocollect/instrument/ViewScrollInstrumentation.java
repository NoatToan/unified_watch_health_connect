package com.huawei.hianalytics.visual.autocollect.instrument;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.R;
import com.huawei.hianalytics.visual.i1;
import com.huawei.hianalytics.visual.k1;
import com.huawei.hianalytics.visual.o0;
import com.huawei.hianalytics.visual.r1;
import com.huawei.hianalytics.visual.t;
import com.huawei.hianalytics.visual.v1;
import com.huawei.hianalytics.visual.w;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ViewScrollInstrumentation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f11624a;

    public static boolean a(View view) {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("android.widget.SearchView");
        } catch (Exception unused) {
            cls = null;
        }
        try {
            cls2 = Class.forName("androidx.appcompat.widget.SearchView");
        } catch (Exception unused2) {
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return true;
                }
            } catch (Exception unused3) {
                HiLog.w("HAVSI", "fail to load class for searchView");
                return false;
            }
        }
        return cls2 != null && cls2.isInstance(view);
    }

    public static void focusChangeOnView(View view, boolean z) {
        k1 k1VarA;
        Object objA;
        if (view == null) {
            return;
        }
        boolean z2 = view instanceof EditText;
        if (!z2 && !a(view)) {
            HiLog.d("HAVSI", "focusChangeOnView view is not EditText or SearchView");
            return;
        }
        if (v1.a()) {
            return;
        }
        Class<?> cls = view.getClass();
        if (v1.h(view) || v1.c(cls) || (k1VarA = v1.a((AdapterView) null, view, view.getClass())) == null) {
            return;
        }
        if (z) {
            f11624a = SystemClock.elapsedRealtime();
        }
        if (z) {
            return;
        }
        if (z2 && TextUtils.isEmpty(((EditText) view).getText())) {
            return;
        }
        if (a(view) && ((objA = i1.a(view, "getQuery", new Object[0])) == null || TextUtils.isEmpty(objA.toString()))) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f11624a;
            if (jElapsedRealtime <= 0) {
                HiLog.d("HAVSI", "edit duration <= 0");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$event_duration", jElapsedRealtime);
            jSONObject.put("$view_id", v1.e(view));
            jSONObject.put("$event_name", v1.e(view));
            r1 r1VarD = v1.d(view);
            if (view instanceof EditText) {
                jSONObject.put("$view_type", "EditText");
            } else {
                jSONObject.put("$view_type", "SearchView");
            }
            jSONObject.put("$view_content", v1.a(r1VarD.d));
            i1.a(o0.b(k1VarA.f11657a), jSONObject);
            i1.a(t.a(k1VarA.f11657a, k1VarA.f11658b), jSONObject);
            JSONObject jSONObject2 = (JSONObject) view.getTag(R.id.hianalytics_view_custom_property_tag);
            if (jSONObject2 != null) {
                jSONObject.put("$custom_property", jSONObject2);
            }
            w.a().a(jSONObject, v1.a(k1VarA.f11657a, view, jSONObject));
        } catch (Exception unused) {
            HiLog.w("HAVSI", "fail to report focus change event");
        }
    }

    public static void scrollChangeOnView(View view, int i, int i2, int i3, int i4) {
        if (view == null || v1.a()) {
            return;
        }
        Class<?> cls = view.getClass();
        if (v1.h(view) || v1.c(cls) || v1.a((AdapterView) null, view, view.getClass()) == null || i2 <= i4) {
            return;
        }
        view.setTag(R.id.hianalytics_scroll_view_tag, Integer.valueOf(i2));
    }
}
