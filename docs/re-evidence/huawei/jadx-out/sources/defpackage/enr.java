package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class enr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f33237c;

    static {
        HashSet hashSet = new HashSet(2);
        f33237c = hashSet;
        hashSet.add("c015d85d-6e29-4ff6-92e2-83bcddd44e53");
        hashSet.add("44812f21-5712-4ef1-ac74-6e7920442a9a");
    }

    public static boolean d(String str) {
        return f33237c.contains(str);
    }
}
