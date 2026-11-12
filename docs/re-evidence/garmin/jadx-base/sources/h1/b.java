package h1;

import androidx.camera.core.impl.f1;
import b0.b0;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f80733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f80734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f80735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f80736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f80737e;

    static {
        HashMap map = new HashMap();
        f80733a = map;
        HashMap map2 = new HashMap();
        f80734b = map2;
        HashMap map3 = new HashMap();
        f80735c = map3;
        HashMap map4 = new HashMap();
        f80736d = map4;
        HashMap map5 = new HashMap();
        f80737e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        b0 b0Var = b0.f13854d;
        map6.put(b0Var, 1);
        b0 b0Var2 = b0.f13855e;
        map6.put(b0Var2, 2);
        b0 b0Var3 = b0.f13856f;
        map6.put(b0Var3, 4096);
        b0 b0Var4 = b0.f13857g;
        map6.put(b0Var4, 8192);
        HashMap map7 = new HashMap();
        map7.put(b0Var, 1);
        map7.put(b0Var2, 2);
        map7.put(b0Var3, 4096);
        map7.put(b0Var4, 8192);
        HashMap map8 = new HashMap();
        map8.put(b0Var, 1);
        map8.put(b0Var2, 4);
        map8.put(b0Var3, 4096);
        map8.put(b0Var4, 16384);
        HashMap map9 = new HashMap();
        map9.put(b0.f13858h, 256);
        map9.put(b0.f13859i, 512);
        map5.put(MimeTypes.VIDEO_H265, map6);
        map5.put(MimeTypes.VIDEO_AV1, map7);
        map5.put(MimeTypes.VIDEO_VP9, map8);
        map5.put(MimeTypes.VIDEO_DOLBY_VISION, map9);
    }

    private b() {
    }

    public static boolean a(f1.c cVar, b0 b0Var) {
        int iA = cVar.a();
        Set set = (Set) f80733a.get(Integer.valueOf(b0Var.f13861b));
        if (set == null || !set.contains(Integer.valueOf(iA))) {
            return false;
        }
        int iF = cVar.f();
        Set set2 = (Set) f80734b.get(Integer.valueOf(b0Var.f13860a));
        return set2 != null && set2.contains(Integer.valueOf(iF));
    }
}
