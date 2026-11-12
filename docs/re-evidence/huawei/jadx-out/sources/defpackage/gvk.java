package defpackage;

import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gvk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, Integer> f36089b = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: gvk.1
        {
            put("all", 200);
            put("newlesson", 201);
            put("activity", 204);
            put("vmall", 205);
            put("function", 206);
            put("yidian", 301);
            put(Constants.AD_MATERIAL_SUB_DIR, Integer.valueOf(a.w));
            put("actionlibrary", Integer.valueOf(a.C));
            put("stressreliefmusic", Integer.valueOf(a.z));
            put("healthheadlines", Integer.valueOf(a.A));
        }
    });
    private static final int[] d = {200, 206, 201, a.C, a.z, a.A, 203, 205, 204, a.w, 301};
    public static final Map<Integer, Integer> e = Collections.unmodifiableMap(new HashMap<Integer, Integer>() { // from class: gvk.5
        {
            put(4040, 1);
            put(4012, 2);
            put(4015, 3);
            put(4048, 4);
            put(4013, 5);
            put(4020, 6);
            put(4016, 7);
            put(4019, 8);
            put(4056, 9);
            put(50000, 10);
            put(52000, 11);
            put(4002, 12);
            put(4001, 13);
            put(4036, 14);
            put(4014, 15);
        }
    });

    public static int[] e() {
        int[] iArr = d;
        return Arrays.copyOf(iArr, iArr.length);
    }
}
