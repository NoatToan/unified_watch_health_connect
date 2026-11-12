package defpackage;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class vtd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Type, wtd<?>> f37206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wtd<mpd> f37207b;
    public wtd<mpd> c;

    public vtd() {
        ConcurrentHashMap<Type, wtd<?>> concurrentHashMap = new ConcurrentHashMap<>(100);
        this.f37206a = concurrentHashMap;
        concurrentHashMap.put(Date.class, wh2.c);
        concurrentHashMap.put(int[].class, yj1.c);
        concurrentHashMap.put(Integer[].class, yj1.d);
        concurrentHashMap.put(short[].class, yj1.c);
        concurrentHashMap.put(Short[].class, yj1.d);
        concurrentHashMap.put(long[].class, yj1.f40227k);
        concurrentHashMap.put(Long[].class, yj1.l);
        concurrentHashMap.put(byte[].class, yj1.g);
        concurrentHashMap.put(Byte[].class, yj1.h);
        concurrentHashMap.put(char[].class, yj1.i);
        concurrentHashMap.put(Character[].class, yj1.j);
        concurrentHashMap.put(float[].class, yj1.m);
        concurrentHashMap.put(Float[].class, yj1.n);
        concurrentHashMap.put(double[].class, yj1.o);
        concurrentHashMap.put(Double[].class, yj1.p);
        concurrentHashMap.put(boolean[].class, yj1.q);
        concurrentHashMap.put(Boolean[].class, yj1.f40228r);
        this.f37207b = new bw5(this);
        this.c = new cw5(this);
        concurrentHashMap.put(mpd.class, this.f37207b);
        concurrentHashMap.put(lpd.class, this.f37207b);
        concurrentHashMap.put(JSONArray.class, this.f37207b);
        concurrentHashMap.put(JSONObject.class, this.f37207b);
    }
}
