package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.l;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class xtd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Object> f39455a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39456b;

    public xtd(int i) {
        this.f39456b = i;
    }

    @NotNull
    public final List<Object> a(@NotNull Collection<?> collection, @NotNull ILogger iLogger) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), iLogger));
        }
        return arrayList;
    }

    @NotNull
    public final List<Object> b(@NotNull Object[] objArr, @NotNull ILogger iLogger) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(d(obj, iLogger));
        }
        return arrayList;
    }

    @NotNull
    public final Map<String, Object> c(@NotNull Map<?, ?> map, @NotNull ILogger iLogger) throws Exception {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), d(obj2, iLogger));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    @Nullable
    public Object d(@Nullable Object obj, @NotNull ILogger iLogger) throws Exception {
        Object string;
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return l.a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return l.c((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (this.f39455a.contains(obj)) {
                iLogger.c(SentryLevel.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            this.f39455a.add(obj);
            try {
                if (this.f39455a.size() > this.f39456b) {
                    this.f39455a.remove(obj);
                    iLogger.c(SentryLevel.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                if (obj.getClass().isArray()) {
                    string = b((Object[]) obj, iLogger);
                } else if (obj instanceof Collection) {
                    string = a((Collection) obj, iLogger);
                } else {
                    if (!(obj instanceof Map)) {
                        Map<String, Object> mapE = e(obj, iLogger);
                        if (mapE.isEmpty()) {
                            string = obj.toString();
                        } else {
                            obj2 = mapE;
                        }
                        return obj2;
                    }
                    string = c((Map) obj, iLogger);
                }
                obj2 = string;
                return obj2;
            } catch (Exception e) {
                iLogger.a(SentryLevel.INFO, "Not serializing object due to throwing sub-path.", e);
            } finally {
                this.f39455a.remove(obj);
            }
        }
        return obj.toString();
    }

    @NotNull
    public Map<String, Object> e(@NotNull Object obj, @NotNull ILogger iLogger) throws Exception {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, d(field.get(obj), iLogger));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    iLogger.c(SentryLevel.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return map;
    }
}
