package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class hy {

    public static class a {
        public static hy a = new hy();
    }

    private static gt a(String str, List<gt> list) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; list != null && i < list.size(); i++) {
            gt gtVar = list.get(i);
            if (gtVar != null) {
                String[] strArrG = gtVar.g();
                for (String str2 : strArrG) {
                    if (!TextUtils.isEmpty(strArrG[i]) && str.contains(str2)) {
                        return gtVar;
                    }
                }
            }
        }
        return null;
    }

    private static JSONArray a(String str) {
        if (str == null) {
            str = "";
        }
        String[] strArr = {"AMapPboRenderThread", "GLThread", "AMapGlRenderThread", "AMapThreadUtil", "GNaviMap", "main"};
        JSONArray jSONArray = new JSONArray();
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (thread != null && !str.equals(thread.getName())) {
                for (int i = 0; i < 6; i++) {
                    String str2 = strArr[i];
                    String name = thread.getName();
                    if (((TextUtils.isEmpty(str2) || TextUtils.isEmpty(name) || (!str2.contains(name) && !name.contains(str2))) ? false : true) && a(thread) != null) {
                        jSONArray.put(a(thread));
                    }
                }
            }
        }
        return jSONArray;
    }

    private static JSONObject a(Thread thread) {
        if (thread == null || thread.getStackTrace() == null) {
            return null;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threadId", thread.getId());
            jSONObject.put("threadName", thread.getName());
            jSONObject.put("threadGroup", thread.getThreadGroup());
            StringBuffer stringBuffer = new StringBuffer();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement);
                stringBuffer.append("<br />");
            }
            jSONObject.put("stacks", stringBuffer.toString());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static boolean a(Context context, String str, String str2, List<gt> list, boolean z, gt gtVar) {
        String string = "";
        if (str2 != null) {
            Iterator<Thread> it2 = Thread.getAllStackTraces().keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    string = null;
                    break;
                }
                Thread next = it2.next();
                if (next != null && !TextUtils.isEmpty(next.getName()) && (str2.contains(next.getName()) || next.getName().contains(str2))) {
                    StackTraceElement[] stackTrace = next.getStackTrace();
                    if (stackTrace == null) {
                        break;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stringBuffer.append("at ");
                        stringBuffer.append(stackTraceElement);
                        stringBuffer.append("<br />");
                    }
                    string = stringBuffer.toString();
                    break;
                }
            }
        }
        gt gtVarA = a(string, list);
        if (z && gtVarA == null) {
            return false;
        }
        String str3 = str + "<br />" + string;
        JSONArray jSONArrayA = a(str2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crashStack", str3);
            jSONObject.put("backStacks", jSONArrayA);
        } catch (Throwable unused) {
        }
        String string2 = jSONObject.toString();
        if (TextUtils.isEmpty(string2)) {
            return false;
        }
        try {
            if (!z && gtVarA == null) {
                hn.b(context, gtVar, string2, "NATIVE_APP_CRASH_CLS_NAME", "NATIVE_CRASH_MHD_NAME");
                return true;
            }
            hn.a(context, gtVarA, string2, "NATIVE_CRASH_CLS_NAME", "NATIVE_CRASH_MHD_NAME");
            return true;
        } catch (Throwable unused2) {
        }
    }
}
