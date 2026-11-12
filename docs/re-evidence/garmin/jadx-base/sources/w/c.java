package w;

import android.hardware.camera2.params.DynamicRangeProfiles;
import b0.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f180961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f180962b;

    static {
        HashMap map = new HashMap();
        f180961a = map;
        HashMap map2 = new HashMap();
        f180962b = map2;
        b0 b0Var = b0.f13854d;
        map.put(1L, b0Var);
        map2.put(b0Var, Collections.singletonList(1L));
        map.put(2L, b0.f13855e);
        map2.put((b0) map.get(2L), Collections.singletonList(2L));
        b0 b0Var2 = b0.f13856f;
        map.put(4L, b0Var2);
        map2.put(b0Var2, Collections.singletonList(4L));
        b0 b0Var3 = b0.f13857g;
        map.put(8L, b0Var3);
        map2.put(b0Var3, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            f180961a.put((Long) it.next(), b0.f13858h);
        }
        f180962b.put(b0.f13858h, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it3 = listAsList2.iterator();
        while (it3.hasNext()) {
            f180961a.put((Long) it3.next(), b0.f13859i);
        }
        f180962b.put(b0.f13859i, listAsList2);
    }

    private c() {
    }

    public static Long a(b0 b0Var, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f180962b.get(b0Var);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l14 : list) {
            if (supportedProfiles.contains(l14)) {
                return l14;
            }
        }
        return null;
    }
}
