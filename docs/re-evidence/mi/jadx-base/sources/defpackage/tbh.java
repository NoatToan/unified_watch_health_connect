package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface tbh<K> {
    BigDecimal getBigDecimal(K k2, BigDecimal bigDecimal);

    BigInteger getBigInteger(K k2, BigInteger bigInteger);

    Boolean getBool(K k2, Boolean bool);

    Byte getByte(K k2, Byte b2);

    Character getChar(K k2, Character ch);

    Date getDate(K k2, Date date);

    Double getDouble(K k2, Double d);

    <E extends Enum<E>> E getEnum(Class<E> cls, K k2, E e);

    Float getFloat(K k2, Float f);

    Integer getInt(K k2, Integer num);

    Long getLong(K k2, Long l);

    Object getObj(K k2, Object obj);

    Short getShort(K k2, Short sh);

    String getStr(K k2, String str);
}
