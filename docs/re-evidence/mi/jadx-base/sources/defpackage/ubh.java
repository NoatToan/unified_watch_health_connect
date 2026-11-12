package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface ubh<K> extends vbh<K> {
    @Override // defpackage.tbh
    default BigDecimal getBigDecimal(K k2, BigDecimal bigDecimal) {
        Object obj = getObj(k2);
        return obj == null ? bigDecimal : yj4.h(obj, bigDecimal);
    }

    @Override // defpackage.tbh
    default BigInteger getBigInteger(K k2, BigInteger bigInteger) {
        Object obj = getObj(k2);
        return obj == null ? bigInteger : yj4.j(obj, bigInteger);
    }

    @Override // defpackage.tbh
    default Boolean getBool(K k2, Boolean bool) {
        Object obj = getObj(k2);
        return obj == null ? bool : yj4.k(obj, bool);
    }

    @Override // defpackage.tbh
    default Byte getByte(K k2, Byte b2) {
        Object obj = getObj(k2);
        return obj == null ? b2 : yj4.l(obj, b2);
    }

    @Override // defpackage.tbh
    default Character getChar(K k2, Character ch) {
        Object obj = getObj(k2);
        return obj == null ? ch : yj4.m(obj, ch);
    }

    @Override // defpackage.tbh
    default Date getDate(K k2, Date date) {
        Object obj = getObj(k2);
        return obj == null ? date : yj4.n(obj, date);
    }

    @Override // defpackage.tbh
    default Double getDouble(K k2, Double d) {
        Object obj = getObj(k2);
        return obj == null ? d : yj4.o(obj, d);
    }

    @Override // defpackage.tbh
    default <E extends Enum<E>> E getEnum(Class<E> cls, K k2, E e) {
        Object obj = getObj(k2);
        return obj == null ? e : (E) yj4.q(cls, obj, e);
    }

    @Override // defpackage.tbh
    default Float getFloat(K k2, Float f) {
        Object obj = getObj(k2);
        return obj == null ? f : yj4.r(obj, f);
    }

    @Override // defpackage.tbh
    default Integer getInt(K k2, Integer num) {
        Object obj = getObj(k2);
        return obj == null ? num : yj4.t(obj, num);
    }

    @Override // defpackage.tbh
    default Long getLong(K k2, Long l) {
        Object obj = getObj(k2);
        return obj == null ? l : yj4.u(obj, l);
    }

    @Override // defpackage.tbh
    default Short getShort(K k2, Short sh) {
        Object obj = getObj(k2);
        return obj == null ? sh : yj4.v(obj, sh);
    }

    @Override // defpackage.tbh
    default String getStr(K k2, String str) {
        Object obj = getObj(k2);
        return obj == null ? str : yj4.x(obj, str);
    }
}
