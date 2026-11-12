package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class sbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Long> f33492a = new HashMap();

    public static void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f33492a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (jElapsedRealtime - entry.getValue().longValue() > 60000) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f33492a.remove((String) it.next());
        }
    }

    public static boolean b(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String strF = qcs.f(bArr);
            if (!TextUtils.isEmpty(strF)) {
                Map<String, Long> map = f33492a;
                synchronized (map) {
                    if (map.get(strF + str) != null) {
                        z = true;
                    } else {
                        map.put(strF + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    a();
                }
            }
        }
        return z;
    }
}
