package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class jh9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jh9 f22801a = new jh9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, String> f22802b;

    static {
        HashMap<String, String> map = new HashMap<>();
        f22802b = map;
        String name = u5d.class.getName();
        map.put(name, name);
        map.put("Data", ik5.class.getName());
        map.put("ImageSelector", u5d.class.getName());
        map.put("Navigator", tig.class.getName());
        map.put("WebView", pbr.class.getName());
        map.put("ImmersionMenu", o6d.class.getName());
        map.put("UI", o7q.class.getName());
    }

    public static jh9 a() {
        return f22801a;
    }

    public String b(String str) {
        return f22802b.get(str);
    }
}
