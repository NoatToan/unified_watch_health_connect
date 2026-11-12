package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.date.a;
import defpackage.r43;
import defpackage.s2h;
import defpackage.tt3;
import defpackage.w73;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class NumberConverter extends AbstractConverter<Number> {
    private static final long serialVersionUID = 1;
    private final Class<? extends Number> targetType;

    public NumberConverter() {
        this.targetType = Number.class;
    }

    public static Number convert(Object obj, Class<?> cls, Function<Object, String> function) {
        if (obj instanceof Enum) {
            return convert(Integer.valueOf(((Enum) obj).ordinal()), cls, function);
        }
        if (Byte.class == cls) {
            if (obj instanceof Number) {
                return Byte.valueOf(((Number) obj).byteValue());
            }
            if (obj instanceof Boolean) {
                return r43.d(((Boolean) obj).booleanValue());
            }
            String strApply = function.apply(obj);
            try {
                if (tt3.F(strApply)) {
                    return null;
                }
                return Byte.valueOf(strApply);
            } catch (NumberFormatException unused) {
                return Byte.valueOf(s2h.z(strApply).byteValue());
            }
        }
        if (Short.class == cls) {
            if (obj instanceof Number) {
                return Short.valueOf(((Number) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                return r43.p(((Boolean) obj).booleanValue());
            }
            if (obj instanceof byte[]) {
                return Short.valueOf(w73.g((byte[]) obj));
            }
            String strApply2 = function.apply(obj);
            try {
                if (tt3.F(strApply2)) {
                    return null;
                }
                return Short.valueOf(strApply2);
            } catch (NumberFormatException unused2) {
                return Short.valueOf(s2h.z(strApply2).shortValue());
            }
        }
        if (Integer.class == cls) {
            if (obj instanceof Number) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Boolean) {
                return r43.l(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Date) {
                return Integer.valueOf((int) ((Date) obj).getTime());
            }
            if (obj instanceof Calendar) {
                return Integer.valueOf((int) ((Calendar) obj).getTimeInMillis());
            }
            if (obj instanceof TemporalAccessor) {
                return Integer.valueOf((int) a.x((TemporalAccessor) obj).toEpochMilli());
            }
            if (obj instanceof byte[]) {
                return Integer.valueOf(w73.c((byte[]) obj));
            }
            String strApply3 = function.apply(obj);
            if (tt3.F(strApply3)) {
                return null;
            }
            return Integer.valueOf(s2h.x(strApply3));
        }
        if (AtomicInteger.class == cls) {
            Number numberConvert = convert(obj, Integer.class, function);
            if (numberConvert != null) {
                AtomicInteger atomicInteger = new AtomicInteger();
                atomicInteger.set(numberConvert.intValue());
                return atomicInteger;
            }
        } else {
            if (Long.class == cls) {
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (obj instanceof Boolean) {
                    return r43.n(((Boolean) obj).booleanValue());
                }
                if (obj instanceof Date) {
                    return Long.valueOf(((Date) obj).getTime());
                }
                if (obj instanceof Calendar) {
                    return Long.valueOf(((Calendar) obj).getTimeInMillis());
                }
                if (obj instanceof TemporalAccessor) {
                    return Long.valueOf(a.x((TemporalAccessor) obj).toEpochMilli());
                }
                if (obj instanceof byte[]) {
                    return Long.valueOf(w73.e((byte[]) obj));
                }
                String strApply4 = function.apply(obj);
                if (tt3.F(strApply4)) {
                    return null;
                }
                return Long.valueOf(s2h.y(strApply4));
            }
            if (AtomicLong.class == cls) {
                Number numberConvert2 = convert(obj, Long.class, function);
                if (numberConvert2 != null) {
                    AtomicLong atomicLong = new AtomicLong();
                    atomicLong.set(numberConvert2.longValue());
                    return atomicLong;
                }
            } else if (LongAdder.class == cls) {
                Number numberConvert3 = convert(obj, Long.class, function);
                if (numberConvert3 != null) {
                    LongAdder longAdder = new LongAdder();
                    longAdder.add(numberConvert3.longValue());
                    return longAdder;
                }
            } else {
                if (Float.class == cls) {
                    if (obj instanceof Number) {
                        return Float.valueOf(((Number) obj).floatValue());
                    }
                    if (obj instanceof Boolean) {
                        return r43.j(((Boolean) obj).booleanValue());
                    }
                    if (obj instanceof byte[]) {
                        return Float.valueOf((float) w73.a((byte[]) obj));
                    }
                    String strApply5 = function.apply(obj);
                    if (tt3.F(strApply5)) {
                        return null;
                    }
                    return Float.valueOf(s2h.w(strApply5));
                }
                if (Double.class == cls) {
                    if (obj instanceof Number) {
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                    if (obj instanceof Boolean) {
                        return r43.h(((Boolean) obj).booleanValue());
                    }
                    if (obj instanceof byte[]) {
                        return Double.valueOf(w73.a((byte[]) obj));
                    }
                    String strApply6 = function.apply(obj);
                    if (tt3.F(strApply6)) {
                        return null;
                    }
                    return Double.valueOf(s2h.v(strApply6));
                }
                if (DoubleAdder.class == cls) {
                    Number numberConvert4 = convert(obj, Long.class, function);
                    if (numberConvert4 != null) {
                        DoubleAdder doubleAdder = new DoubleAdder();
                        doubleAdder.add(numberConvert4.doubleValue());
                        return doubleAdder;
                    }
                } else {
                    if (BigDecimal.class == cls) {
                        return toBigDecimal(obj, function);
                    }
                    if (BigInteger.class == cls) {
                        return toBigInteger(obj, function);
                    }
                    if (Number.class == cls) {
                        if (obj instanceof Number) {
                            return (Number) obj;
                        }
                        if (obj instanceof Boolean) {
                            return r43.l(((Boolean) obj).booleanValue());
                        }
                        String strApply7 = function.apply(obj);
                        if (tt3.F(strApply7)) {
                            return null;
                        }
                        return s2h.z(strApply7);
                    }
                }
            }
        }
        throw new UnsupportedOperationException(tt3.y("Unsupport Number type: {}", cls.getName()));
    }

    private static BigDecimal toBigDecimal(Object obj, Function<Object, String> function) {
        if (obj instanceof Number) {
            return s2h.A((Number) obj);
        }
        if (obj instanceof Boolean) {
            return new BigDecimal(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        return obj instanceof byte[] ? s2h.A(Double.valueOf(w73.a((byte[]) obj))) : s2h.B(function.apply(obj));
    }

    private static BigInteger toBigInteger(Object obj, Function<Object, String> function) {
        if (obj instanceof Long) {
            return BigInteger.valueOf(((Long) obj).longValue());
        }
        if (obj instanceof Boolean) {
            return BigInteger.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        return obj instanceof byte[] ? BigInteger.valueOf(w73.e((byte[]) obj)) : s2h.C(function.apply(obj));
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public String convertToStr(Object obj) {
        String strR0 = tt3.r0(super.convertToStr(obj));
        if (!tt3.I(strR0)) {
            return strR0;
        }
        char upperCase = Character.toUpperCase(strR0.charAt(strR0.length() - 1));
        return (upperCase == 'D' || upperCase == 'L' || upperCase == 'F') ? tt3.m0(strR0, -1) : strR0;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Number> getTargetType() {
        return this.targetType;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Number convertInternal(Object obj) {
        return convert(obj, this.targetType, new Function() { // from class: h2h
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return this.f19613a.convertToStr(obj2);
            }
        });
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=java.lang.Class<? extends java.lang.Number>, code=java.lang.Class, for r1v0, types: [java.lang.Class<? extends java.lang.Number>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NumberConverter(java.lang.Class r1) {
        /*
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
        L7:
            r0.targetType = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.hutool.core.convert.impl.NumberConverter.<init>(java.lang.Class):void");
    }
}
