package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface vbh<K> extends tbh<K> {
    default BigDecimal getBigDecimal(K k2) {
        return getBigDecimal(k2, null);
    }

    default BigInteger getBigInteger(K k2) {
        return getBigInteger(k2, null);
    }

    default Boolean getBool(K k2) {
        return getBool(k2, null);
    }

    default Byte getByte(K k2) {
        return getByte(k2, null);
    }

    default Character getChar(K k2) {
        return getChar(k2, null);
    }

    default Date getDate(K k2) {
        return getDate(k2, null);
    }

    default Double getDouble(K k2) {
        return getDouble(k2, null);
    }

    default <E extends Enum<E>> E getEnum(Class<E> cls, K k2) {
        return (E) getEnum(cls, k2, null);
    }

    default Float getFloat(K k2) {
        return getFloat(k2, null);
    }

    default Integer getInt(K k2) {
        return getInt(k2, null);
    }

    default Long getLong(K k2) {
        return getLong(k2, null);
    }

    default Object getObj(K k2) {
        return getObj(k2, null);
    }

    default Short getShort(K k2) {
        return getShort(k2, null);
    }

    default String getStr(K k2) {
        return getStr(k2, null);
    }
}
