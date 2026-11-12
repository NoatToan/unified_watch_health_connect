package defpackage;

import com.facebook.react.bridge.WritableMap;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface l1d {
    void a(String str, String str2);

    boolean b(String str, String str2, Map<String, Object> map);

    boolean c(String str);

    fwr d(String str, String str2);

    void e(String str, t1d t1dVar);

    void f(String str, String str2, m1d m1dVar);

    void g(String str, fwr fwrVar, our ourVar);

    HashMap<String, YRNBundleInfo> getLoadedBundleInfoMap(String str);

    void h(String str, String str2, m1d m1dVar);

    void i(String str, jxr jxrVar);

    boolean j(String str, String str2, WritableMap writableMap);
}
