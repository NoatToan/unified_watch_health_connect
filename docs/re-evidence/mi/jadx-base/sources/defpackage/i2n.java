package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class i2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2n f20709a = new i2n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, Map<String, h2n>> f20710b = new HashMap();

    public static h2n a(String str, String str2) {
        h2n h2nVar = (f20710b.containsKey(str) && f20710b.get(str).containsKey(str2)) ? f20710b.get(str).get(str2) : null;
        return h2nVar == null ? ax5.b() : h2nVar;
    }
}
