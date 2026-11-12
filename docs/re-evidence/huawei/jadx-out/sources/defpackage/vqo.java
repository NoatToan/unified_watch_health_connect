package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Integer, Integer> f51469a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f51470c = new Object();

    public static int a(int i, String str) {
        int iIntValue;
        synchronized (f51470c) {
            if (!f51469a.isEmpty() && f51469a.containsKey(Integer.valueOf(i)) && f51469a.get(Integer.valueOf(i)) != null) {
                iIntValue = f51469a.get(Integer.valueOf(i)).intValue();
            } else {
                int iC = vrg.c(i, str);
                f51469a.put(Integer.valueOf(i), Integer.valueOf(iC));
                iIntValue = iC;
            }
        }
        return iIntValue;
    }

    public static void e() {
        synchronized (f51470c) {
            f51469a.clear();
        }
    }
}
