package com.google.android.gms.fitness.data;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.huami.nfc.web.Constant;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzah {
    private static final double c;
    private static final double d;
    private static final double e;
    private static final double f;
    private static final zzah g;
    public static final Set<String> zzom;
    private final Map<String, Map<String, zzaj>> a;
    private final Map<String, zzaj> b;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c = 10.0d / timeUnit.toNanos(1L);
        d = 1000.0d / timeUnit.toNanos(1L);
        e = 2000.0d / TimeUnit.HOURS.toNanos(1L);
        f = 100.0d / timeUnit.toNanos(1L);
        zzom = Collections.unmodifiableSet(new HashSet(Arrays.asList("altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type")));
        g = new zzah();
    }

    private zzah() {
        HashMap map = new HashMap();
        map.put(Constant.KEY_LATITUDE, new zzaj(-90.0d, 90.0d));
        map.put(Constant.KEY_LONGITUDE, new zzaj(-180.0d, 180.0d));
        map.put("accuracy", new zzaj(0.0d, 10000.0d));
        map.put("bpm", new zzaj(0.0d, 1000.0d));
        map.put("altitude", new zzaj(-100000.0d, 100000.0d));
        map.put("percentage", new zzaj(0.0d, 100.0d));
        map.put("confidence", new zzaj(0.0d, 100.0d));
        map.put("duration", new zzaj(0.0d, 9.223372036854776E18d));
        map.put("height", new zzaj(0.0d, 3.0d));
        map.put("weight", new zzaj(0.0d, 1000.0d));
        map.put("speed", new zzaj(0.0d, 11000.0d));
        this.b = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("com.google.step_count.delta", a(GetWatermarkAPI.KEY_NAME_STEPS, new zzaj(0.0d, c)));
        map2.put("com.google.calories.consumed", a(Field.NUTRIENT_CALORIES, new zzaj(0.0d, d)));
        map2.put("com.google.calories.expended", a(Field.NUTRIENT_CALORIES, new zzaj(0.0d, e)));
        map2.put("com.google.distance.delta", a("distance", new zzaj(0.0d, f)));
        this.a = Collections.unmodifiableMap(map2);
    }

    private static <K, V> Map<K, V> a(K k, V v) {
        HashMap map = new HashMap();
        map.put(k, v);
        return map;
    }

    public static zzah zzt() {
        return g;
    }

    @Nullable
    public final zzaj zza(String str, String str2) {
        Map<String, zzaj> map = this.a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Nullable
    public final zzaj zzi(String str) {
        return this.b.get(str);
    }
}
