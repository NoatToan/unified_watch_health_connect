package cn.hutool.core.map;

import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.qj1;
import defpackage.r43;
import defpackage.tt3;
import defpackage.ubh;
import defpackage.yj4;
import defpackage.yz3;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MapProxy implements Map<Object, Object>, ubh<Object>, InvocationHandler, Serializable {
    private static final long serialVersionUID = 1;
    Map map;

    public MapProxy(Map<?, ?> map) {
        this.map = map;
    }

    public static MapProxy create(Map<?, ?> map) {
        return map instanceof MapProxy ? (MapProxy) map : new MapProxy(map);
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.map.get(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ BigDecimal getBigDecimal(Object obj) {
        return super.getBigDecimal(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ BigInteger getBigInteger(Object obj) {
        return super.getBigInteger(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Boolean getBool(Object obj) {
        return super.getBool(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Byte getByte(Object obj) {
        return super.getByte(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Character getChar(Object obj) {
        return super.getChar(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Date getDate(Object obj) {
        return super.getDate(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Double getDouble(Object obj) {
        return super.getDouble(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Enum getEnum(Class cls, Object obj) {
        return super.getEnum(cls, obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Float getFloat(Object obj) {
        return super.getFloat(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Integer getInt(Object obj) {
        return super.getInt(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Long getLong(Object obj) {
        return super.getLong(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Object getObj(Object obj) {
        return super.getObj(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ Short getShort(Object obj) {
        return super.getShort(obj);
    }

    @Override // defpackage.vbh
    public /* bridge */ /* synthetic */ String getStr(Object obj) {
        return super.getStr(obj);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String strP;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (qj1.D(parameterTypes)) {
            Class<?> returnType = method.getReturnType();
            if (Void.TYPE != returnType) {
                String name = method.getName();
                if (name.startsWith("get")) {
                    strP = tt3.P(name, 3);
                } else if (r43.a(returnType) && name.startsWith("is")) {
                    strP = tt3.P(name, 2);
                } else {
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(hashCode());
                    }
                    if ("toString".equals(name)) {
                        return toString();
                    }
                    strP = null;
                }
                if (tt3.H(strP)) {
                    if (!containsKey(strP)) {
                        strP = tt3.q0(strP);
                    }
                    return yj4.c(method.getGenericReturnType(), get(strP));
                }
            }
        } else if (1 == parameterTypes.length) {
            String name2 = method.getName();
            if (name2.startsWith(CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
                String strP2 = tt3.P(name2, 3);
                if (tt3.H(strP2)) {
                    put(strP2, objArr[0]);
                }
            } else if ("equals".equals(name2)) {
                return Boolean.valueOf(equals(objArr[0]));
            }
        }
        throw new UnsupportedOperationException(method.toGenericString());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.map.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Object, ? extends Object> map) {
        this.map.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.map.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    public <T> T toProxyBean(Class<T> cls) {
        return (T) Proxy.newProxyInstance(yz3.b(), new Class[]{cls}, this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ BigDecimal getBigDecimal(Object obj, BigDecimal bigDecimal) {
        return super.getBigDecimal(obj, bigDecimal);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ BigInteger getBigInteger(Object obj, BigInteger bigInteger) {
        return super.getBigInteger(obj, bigInteger);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Boolean getBool(Object obj, Boolean bool) {
        return super.getBool(obj, bool);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Byte getByte(Object obj, Byte b2) {
        return super.getByte(obj, b2);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Character getChar(Object obj, Character ch) {
        return super.getChar(obj, ch);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Date getDate(Object obj, Date date) {
        return super.getDate(obj, date);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Double getDouble(Object obj, Double d) {
        return super.getDouble(obj, d);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Enum getEnum(Class cls, Object obj, Enum r3) {
        return super.getEnum(cls, obj, r3);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Float getFloat(Object obj, Float f) {
        return super.getFloat(obj, f);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Integer getInt(Object obj, Integer num) {
        return super.getInt(obj, num);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Long getLong(Object obj, Long l) {
        return super.getLong(obj, l);
    }

    @Override // defpackage.tbh
    public Object getObj(Object obj, Object obj2) {
        Object obj3 = this.map.get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ Short getShort(Object obj, Short sh) {
        return super.getShort(obj, sh);
    }

    @Override // defpackage.ubh, defpackage.tbh
    public /* bridge */ /* synthetic */ String getStr(Object obj, String str) {
        return super.getStr(obj, str);
    }
}
