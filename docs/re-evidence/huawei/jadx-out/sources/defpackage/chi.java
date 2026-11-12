package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class chi {
    public static cha b(Map map, String str, cha chaVar) {
        Object objD = d(map, str, chaVar);
        return objD instanceof cha ? (cha) objD : chaVar;
    }

    private static <T> Object d(Map map, String str, T t) {
        return (map == null || map.isEmpty()) ? t : map.get(str);
    }
}
