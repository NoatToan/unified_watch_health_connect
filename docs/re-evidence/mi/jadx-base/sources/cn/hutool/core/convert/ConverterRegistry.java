package cn.hutool.core.convert;

import cn.hutool.core.convert.impl.ArrayConverter;
import cn.hutool.core.convert.impl.AtomicBooleanConverter;
import cn.hutool.core.convert.impl.AtomicIntegerArrayConverter;
import cn.hutool.core.convert.impl.AtomicLongArrayConverter;
import cn.hutool.core.convert.impl.AtomicReferenceConverter;
import cn.hutool.core.convert.impl.BeanConverter;
import cn.hutool.core.convert.impl.BooleanConverter;
import cn.hutool.core.convert.impl.CalendarConverter;
import cn.hutool.core.convert.impl.CharacterConverter;
import cn.hutool.core.convert.impl.CharsetConverter;
import cn.hutool.core.convert.impl.ClassConverter;
import cn.hutool.core.convert.impl.CurrencyConverter;
import cn.hutool.core.convert.impl.DateConverter;
import cn.hutool.core.convert.impl.DurationConverter;
import cn.hutool.core.convert.impl.EnumConverter;
import cn.hutool.core.convert.impl.LocaleConverter;
import cn.hutool.core.convert.impl.MapConverter;
import cn.hutool.core.convert.impl.NumberConverter;
import cn.hutool.core.convert.impl.OptionalConverter;
import cn.hutool.core.convert.impl.PathConverter;
import cn.hutool.core.convert.impl.PeriodConverter;
import cn.hutool.core.convert.impl.PrimitiveConverter;
import cn.hutool.core.convert.impl.ReferenceConverter;
import cn.hutool.core.convert.impl.StackTraceElementConverter;
import cn.hutool.core.convert.impl.StringConverter;
import cn.hutool.core.convert.impl.TemporalAccessorConverter;
import cn.hutool.core.convert.impl.TimeZoneConverter;
import cn.hutool.core.convert.impl.URIConverter;
import cn.hutool.core.convert.impl.URLConverter;
import cn.hutool.core.convert.impl.UUIDConverter;
import cn.hutool.core.date.DateTime;
import defpackage.b5q;
import defpackage.bbk;
import defpackage.ek4;
import defpackage.g4h;
import defpackage.i04;
import defpackage.i44;
import defpackage.i5q;
import defpackage.nyl;
import defpackage.rh2;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class ConverterRegistry implements Serializable {
    private static final long serialVersionUID = 1;
    private volatile Map<Type, ek4<?>> customConverterMap;
    private Map<Type, ek4<?>> defaultConverterMap;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConverterRegistry f5508a = new ConverterRegistry();
    }

    public ConverterRegistry() {
        defaultConverter();
        putCustomBySpi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T convertSpecial(Type type, Class<T> cls, Object obj, T t) {
        if (cls == null) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            return (T) new i44(type).convert(obj, (Collection) t);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (T) new MapConverter(type).convert(obj, (Map) t);
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (cls.isEnum()) {
            return (T) new EnumConverter(cls).convert(obj, t);
        }
        if (cls.isArray()) {
            return (T) new ArrayConverter(cls).convert(obj, t);
        }
        return null;
    }

    private ConverterRegistry defaultConverter() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.defaultConverterMap = concurrentHashMap;
        Class cls = Integer.TYPE;
        concurrentHashMap.put(cls, new PrimitiveConverter(cls));
        Map<Type, ek4<?>> map = this.defaultConverterMap;
        Class cls2 = Long.TYPE;
        map.put(cls2, new PrimitiveConverter(cls2));
        Map<Type, ek4<?>> map2 = this.defaultConverterMap;
        Class cls3 = Byte.TYPE;
        map2.put(cls3, new PrimitiveConverter(cls3));
        Map<Type, ek4<?>> map3 = this.defaultConverterMap;
        Class cls4 = Short.TYPE;
        map3.put(cls4, new PrimitiveConverter(cls4));
        Map<Type, ek4<?>> map4 = this.defaultConverterMap;
        Class cls5 = Float.TYPE;
        map4.put(cls5, new PrimitiveConverter(cls5));
        Map<Type, ek4<?>> map5 = this.defaultConverterMap;
        Class cls6 = Double.TYPE;
        map5.put(cls6, new PrimitiveConverter(cls6));
        Map<Type, ek4<?>> map6 = this.defaultConverterMap;
        Class cls7 = Character.TYPE;
        map6.put(cls7, new PrimitiveConverter(cls7));
        Map<Type, ek4<?>> map7 = this.defaultConverterMap;
        Class cls8 = Boolean.TYPE;
        map7.put(cls8, new PrimitiveConverter(cls8));
        this.defaultConverterMap.put(Number.class, new NumberConverter());
        this.defaultConverterMap.put(Integer.class, new NumberConverter(Integer.class));
        this.defaultConverterMap.put(AtomicInteger.class, new NumberConverter(AtomicInteger.class));
        this.defaultConverterMap.put(Long.class, new NumberConverter(Long.class));
        this.defaultConverterMap.put(AtomicLong.class, new NumberConverter(AtomicLong.class));
        this.defaultConverterMap.put(Byte.class, new NumberConverter(Byte.class));
        this.defaultConverterMap.put(Short.class, new NumberConverter(Short.class));
        this.defaultConverterMap.put(Float.class, new NumberConverter(Float.class));
        this.defaultConverterMap.put(Double.class, new NumberConverter(Double.class));
        this.defaultConverterMap.put(Character.class, new CharacterConverter());
        this.defaultConverterMap.put(Boolean.class, new BooleanConverter());
        this.defaultConverterMap.put(AtomicBoolean.class, new AtomicBooleanConverter());
        this.defaultConverterMap.put(BigDecimal.class, new NumberConverter(BigDecimal.class));
        this.defaultConverterMap.put(BigInteger.class, new NumberConverter(BigInteger.class));
        this.defaultConverterMap.put(CharSequence.class, new StringConverter());
        this.defaultConverterMap.put(String.class, new StringConverter());
        this.defaultConverterMap.put(URI.class, new URIConverter());
        this.defaultConverterMap.put(URL.class, new URLConverter());
        this.defaultConverterMap.put(Calendar.class, new CalendarConverter());
        this.defaultConverterMap.put(Date.class, new DateConverter(Date.class));
        this.defaultConverterMap.put(DateTime.class, new DateConverter(DateTime.class));
        this.defaultConverterMap.put(java.sql.Date.class, new DateConverter(java.sql.Date.class));
        this.defaultConverterMap.put(Time.class, new DateConverter(Time.class));
        this.defaultConverterMap.put(Timestamp.class, new DateConverter(Timestamp.class));
        this.defaultConverterMap.put(TemporalAccessor.class, new TemporalAccessorConverter(Instant.class));
        this.defaultConverterMap.put(Instant.class, new TemporalAccessorConverter(Instant.class));
        this.defaultConverterMap.put(LocalDateTime.class, new TemporalAccessorConverter(LocalDateTime.class));
        this.defaultConverterMap.put(LocalDate.class, new TemporalAccessorConverter(LocalDate.class));
        this.defaultConverterMap.put(LocalTime.class, new TemporalAccessorConverter(LocalTime.class));
        this.defaultConverterMap.put(ZonedDateTime.class, new TemporalAccessorConverter(ZonedDateTime.class));
        this.defaultConverterMap.put(OffsetDateTime.class, new TemporalAccessorConverter(OffsetDateTime.class));
        this.defaultConverterMap.put(OffsetTime.class, new TemporalAccessorConverter(OffsetTime.class));
        this.defaultConverterMap.put(Period.class, new PeriodConverter());
        this.defaultConverterMap.put(Duration.class, new DurationConverter());
        this.defaultConverterMap.put(WeakReference.class, new ReferenceConverter(WeakReference.class));
        this.defaultConverterMap.put(SoftReference.class, new ReferenceConverter(SoftReference.class));
        this.defaultConverterMap.put(AtomicReference.class, new AtomicReferenceConverter());
        this.defaultConverterMap.put(AtomicIntegerArray.class, new AtomicIntegerArrayConverter());
        this.defaultConverterMap.put(AtomicLongArray.class, new AtomicLongArrayConverter());
        this.defaultConverterMap.put(Class.class, new ClassConverter());
        this.defaultConverterMap.put(TimeZone.class, new TimeZoneConverter());
        this.defaultConverterMap.put(Locale.class, new LocaleConverter());
        this.defaultConverterMap.put(Charset.class, new CharsetConverter());
        this.defaultConverterMap.put(Path.class, new PathConverter());
        this.defaultConverterMap.put(Currency.class, new CurrencyConverter());
        this.defaultConverterMap.put(UUID.class, new UUIDConverter());
        this.defaultConverterMap.put(StackTraceElement.class, new StackTraceElementConverter());
        this.defaultConverterMap.put(Optional.class, new OptionalConverter());
        return this;
    }

    public static ConverterRegistry getInstance() {
        return a.f5508a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putCustomBySpi$0(ek4 ek4Var) {
        try {
            Type typeN = i5q.n(i04.a(ek4Var));
            if (typeN != null) {
                putCustom(typeN, (ek4<?>) ek4Var);
            }
        } catch (Exception unused) {
        }
    }

    private void putCustomBySpi() {
        nyl.a(ek4.class).forEach(new Consumer() { // from class: hk4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f20155a.lambda$putCustomBySpi$0((ek4) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Object] */
    public <T> T convert(Type type, Object obj, T t, boolean z) throws ConvertException {
        if (i5q.r(type) && t == null) {
            return obj;
        }
        if (g4h.i(obj)) {
            return t;
        }
        if (i5q.r(type)) {
            type = t.getClass();
        }
        if (type instanceof b5q) {
            type = ((b5q) type).a();
        }
        ek4 converter = getConverter(type, z);
        if (converter != null) {
            return converter.convert(obj, t);
        }
        Class<?> clsE = i5q.e(type);
        if (clsE == null) {
            if (t == null) {
                return obj;
            }
            clsE = t.getClass();
        }
        T t2 = (T) convertSpecial(type, clsE, obj, t);
        if (t2 != null) {
            return t2;
        }
        if (rh2.t(clsE)) {
            return new BeanConverter(type).convert(obj, t);
        }
        throw new ConvertException("Can not Converter from [{}] to [{}]", obj.getClass().getName(), type.getTypeName());
    }

    public <T> ek4<T> getConverter(Type type, boolean z) {
        if (z) {
            ek4<T> customConverter = getCustomConverter(type);
            return customConverter == null ? getDefaultConverter(type) : customConverter;
        }
        ek4<T> defaultConverter = getDefaultConverter(type);
        return defaultConverter == null ? getCustomConverter(type) : defaultConverter;
    }

    public <T> ek4<T> getCustomConverter(Type type) {
        if (this.customConverterMap == null) {
            return null;
        }
        return (ek4) this.customConverterMap.get(type);
    }

    public <T> ek4<T> getDefaultConverter(Type type) {
        Map<Type, ek4<?>> map = this.defaultConverterMap;
        if (map == null) {
            return null;
        }
        return (ek4) map.get(type);
    }

    public ConverterRegistry putCustom(Type type, Class<? extends ek4<?>> cls) {
        return putCustom(type, (ek4<?>) bbk.t(cls, new Object[0]));
    }

    public ConverterRegistry putCustom(Type type, ek4<?> ek4Var) {
        if (this.customConverterMap == null) {
            synchronized (this) {
                try {
                    if (this.customConverterMap == null) {
                        this.customConverterMap = new ConcurrentHashMap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.customConverterMap.put(type, ek4Var);
        return this;
    }

    public <T> T convert(Type type, Object obj, T t) throws ConvertException {
        return (T) convert(type, obj, t, true);
    }

    public <T> T convert(Type type, Object obj) throws ConvertException {
        return (T) convert(type, obj, null);
    }
}
