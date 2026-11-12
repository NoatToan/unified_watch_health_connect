package com.huawei.openalliance.ad;

import android.app.Activity;
import com.huawei.operation.beans.TitleBean;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, ug> f20312a = new HashMap(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Class<? extends ug>> f20313b;

    private static ug b(String str) throws IllegalAccessException, InstantiationException {
        Class<? extends ug> cls = f20313b.get(str);
        if (cls == null) {
            hw.a("ShareManager", "There is no matching type for %s", str);
            return null;
        }
        ug ugVarNewInstance = cls.newInstance();
        f20312a.put(str, ugVarNewInstance);
        return ugVarNewInstance;
    }

    public static boolean a(String str) {
        try {
            Class<? extends ug> cls = f20313b.get(str);
            if (cls != null) {
                return cls.newInstance().a();
            }
            hw.a("ShareManager", "There is no matching type for %s", str);
            return false;
        } catch (Throwable unused) {
            hw.c("ShareManager", "Share throws exception");
            return false;
        }
    }

    public static void a(String str, Activity activity, uk ukVar, um umVar) {
        hw.a("ShareManager", "shareAd : %s", str);
        try {
            Map<String, ug> map = f20312a;
            ug ugVarB = !map.containsKey(str) ? b(str) : map.get(str);
            if (ugVarB != null) {
                ugVarB.a(activity, ukVar, umVar);
            }
        } catch (Throwable unused) {
            hw.c("ShareManager", "Share throws exception");
        }
    }

    static {
        HashMap map = new HashMap();
        f20313b = map;
        map.put(TitleBean.RIGHT_BTN_TYPE_MORE, ui.class);
        map.put("WX", uq.class);
        map.put(Constants.SOURCE_QQ, uj.class);
        map.put("WB", up.class);
        map.put("weLink", uo.class);
    }
}
