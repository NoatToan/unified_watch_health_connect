package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TabHost;
import com.huawei.hianalytics.core.log.HiLog;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11656a;

    public j1(String str) {
        this.f11656a = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[Catch: Exception -> 0x00cc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0010, B:25:0x0050, B:27:0x0056, B:31:0x0064, B:34:0x006b, B:36:0x0075, B:37:0x0077, B:40:0x0083, B:42:0x0087, B:45:0x008d, B:48:0x009c, B:51:0x00aa, B:54:0x00b9, B:10:0x0026), top: B:59:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewA;
        View view;
        View view2;
        String strC;
        Context context;
        Activity activity;
        Object objA;
        if (v1.a() || v1.c(TabHost.class)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_type", "TabHost");
            String str = this.f11656a;
            if (!TextUtils.isEmpty(str)) {
                y1.b();
                View[] viewArrA = y1.a();
                try {
                    int length = viewArrA.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            View view3 = viewArrA[i];
                            if (view3.getClass() != y1.i && (viewA = y1.a(view3, str)) != null) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (viewA == null) {
                    return;
                }
                view = null;
                view2 = viewA;
                while (view == null && view2 != null && view2.getParent() != null) {
                    view2 = (View) view2.getParent();
                    if (view2 instanceof TabHost) {
                        view = view2;
                    }
                }
                if (view == null && v1.h(view)) {
                    return;
                }
                strC = v1.c(viewA);
                if (TextUtils.isEmpty(strC)) {
                    strC = this.f11656a;
                }
                jSONObject.put("$view_content", strC);
                context = viewA.getContext();
                if (context == null) {
                    return;
                }
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    return;
                }
                if (w.a().i(activity.getClass())) {
                    return;
                }
                i1.a(o0.b(activity), jSONObject);
                objA = t.a(viewA, activity);
                if (objA == null) {
                    return;
                }
                if (w.a().i(objA.getClass())) {
                    return;
                }
                i1.a(t.a(activity, objA), jSONObject);
                w.a().a(jSONObject, v1.a(activity, viewA, jSONObject));
            }
            viewA = null;
            if (viewA == null) {
                return;
            }
            view = null;
            view2 = viewA;
            while (view == null) {
                view2 = (View) view2.getParent();
                if (view2 instanceof TabHost) {
                    view = view2;
                }
            }
            if (view == null) {
            }
            strC = v1.c(viewA);
            if (TextUtils.isEmpty(strC)) {
                strC = this.f11656a;
            }
            jSONObject.put("$view_content", strC);
            context = viewA.getContext();
            if (context == null) {
                return;
            }
            if (context instanceof Activity) {
            }
            if (activity == null) {
                return;
            }
            if (w.a().i(activity.getClass())) {
                return;
            }
            i1.a(o0.b(activity), jSONObject);
            objA = t.a(viewA, activity);
            if (objA == null) {
                return;
            }
            if (w.a().i(objA.getClass())) {
                return;
            }
            i1.a(t.a(activity, objA), jSONObject);
            w.a().a(jSONObject, v1.a(activity, viewA, jSONObject));
        } catch (Exception unused2) {
            HiLog.w("HAVCI", "fail to report TabHost click data");
        }
    }
}
