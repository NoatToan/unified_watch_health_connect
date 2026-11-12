package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import defpackage.qk1;
import defpackage.rh2;
import defpackage.yj4;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public class Dict extends LinkedHashMap<String, Object> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final long serialVersionUID = 6135423866861206530L;
    private boolean caseInsensitive;

    public Dict() {
        this(false);
    }

    public static Dict create() {
        return new Dict();
    }

    private String customKey(String str) {
        return (!this.caseInsensitive || str == null) ? str : str.toLowerCase();
    }

    @SafeVarargs
    public static Dict of(Pair<String, Object>... pairArr) {
        Dict dictCreate = create();
        for (Pair<String, Object> pair : pairArr) {
            dictCreate.put(pair.getKey(), pair.getValue());
        }
        return dictCreate;
    }

    public static <T> Dict parse(T t) {
        return create().parseBean(t);
    }

    public Dict filter(String... strArr) {
        Dict dict = new Dict(strArr.length, 1.0f);
        for (String str : strArr) {
            if (containsKey(str)) {
                dict.put(str, get(str));
            }
        }
        return dict;
    }

    public <T> T get(String str, T t) {
        T t2 = (T) get(str);
        return t2 != null ? t2 : t;
    }

    public <T> T getBean(String str) {
        return (T) get(str, null);
    }

    public byte[] getBytes(String str) {
        return (byte[]) get(str, null);
    }

    public Number getNumber(String str) {
        return (Number) get(str, null);
    }

    public Time getTime(String str) {
        return (Time) get(str, null);
    }

    public Timestamp getTimestamp(String str) {
        return (Timestamp) get(str, null);
    }

    public <T> Dict parseBean(T t) {
        qk1.u(t, "Bean class must be not null", new Object[0]);
        putAll(rh2.e(t));
        return this;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends String, ?> map) {
        map.forEach(new BiConsumer() { // from class: sv6
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f34015a.put((String) obj, obj2);
            }
        });
    }

    public <T extends Dict> void removeEqual(T t, String... strArr) {
        Object obj;
        HashSet hashSetQ = CollUtil.q(strArr);
        for (Map.Entry entry : t.entrySet()) {
            if (!hashSetQ.contains(entry.getKey()) && (obj = get(entry.getKey())) != null && obj.equals(entry.getValue())) {
                remove(entry.getKey());
            }
        }
    }

    public Dict set(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public Dict setIgnoreNull(String str, Object obj) {
        if (str != null && obj != null) {
            set(str, obj);
        }
        return this;
    }

    public <T> T toBean(T t) {
        return (T) toBean(t, false);
    }

    public <T> T toBeanIgnoreCase(T t) {
        rh2.n(this, t, false);
        return t;
    }

    public <T> T toBeanWithCamelCase(T t) {
        rh2.m(this, t, true, false);
        return t;
    }

    public Dict(boolean z) {
        this(16, z);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Dict clone() {
        return (Dict) super.clone();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return super.get(customKey((String) obj));
    }

    public BigDecimal getBigDecimal(String str) {
        return yj4.g(get(str));
    }

    public BigInteger getBigInteger(String str) {
        return yj4.i(get(str));
    }

    public Boolean getBool(String str) {
        return yj4.k(get(str), null);
    }

    public Byte getByte(String str) {
        return yj4.l(get(str), null);
    }

    public Character getChar(String str) {
        return yj4.m(get(str), null);
    }

    public Date getDate(String str) {
        return (Date) get(str, null);
    }

    public Double getDouble(String str) {
        return yj4.o(get(str), null);
    }

    public <E extends Enum<E>> E getEnum(Class<E> cls, String str) {
        return (E) yj4.p(cls, get(str));
    }

    public Float getFloat(String str) {
        return yj4.r(get(str), null);
    }

    public Integer getInt(String str) {
        return yj4.t(get(str), null);
    }

    public Long getLong(String str) {
        return yj4.u(get(str), null);
    }

    public Object getObj(String str) {
        return super.get(str);
    }

    public Short getShort(String str) {
        return yj4.v(get(str), null);
    }

    public String getStr(String str) {
        return yj4.x(get(str), null);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(String str, Object obj) {
        return super.put(customKey(str), obj);
    }

    public <T> T toBean(T t, boolean z) {
        rh2.m(this, t, z, false);
        return t;
    }

    public <T> T toBeanIgnoreCase(Class<T> cls) {
        return (T) rh2.C(this, cls, false);
    }

    public Dict(int i) {
        this(i, false);
    }

    public <T> Dict parseBean(T t, boolean z, boolean z2) {
        qk1.u(t, "Bean class must be not null", new Object[0]);
        putAll(rh2.h(t, z, z2));
        return this;
    }

    public <T> T toBean(Class<T> cls) {
        return (T) rh2.A(this, cls);
    }

    public Dict(int i, boolean z) {
        this(i, 0.75f, z);
    }

    public static Dict of(Object... objArr) {
        Dict dictCreate = create();
        String strW = null;
        for (int i = 0; i < objArr.length; i++) {
            if (i % 2 == 0) {
                strW = yj4.w(objArr[i]);
            } else {
                dictCreate.put(strW, objArr[i]);
            }
        }
        return dictCreate;
    }

    public Dict(int i, float f) {
        this(i, f, false);
    }

    public Dict(int i, float f, boolean z) {
        super(i, f);
        this.caseInsensitive = z;
    }

    public Dict(Map<String, Object> map) {
        super(map == null ? new HashMap<>() : map);
    }
}
