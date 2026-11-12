package io.sentry.util;

import defpackage.f4h;
import defpackage.fsd;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements f4h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<Map.Entry<String, Object>> f21893a;

    public o(Map<String, Object> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f21893a = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> T A(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws Exception {
        return (T) m(iLogger, fsdVar);
    }

    @Override // defpackage.f4h
    @Nullable
    public String B() throws IOException {
        return (String) l();
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> List<T> C(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException {
        if (peek() == JsonToken.NULL) {
            d();
            return null;
        }
        try {
            a();
            ArrayList arrayList = new ArrayList();
            if (c()) {
                do {
                    try {
                        arrayList.add(fsdVar.a(this, iLogger));
                    } catch (Exception e) {
                        iLogger.a(SentryLevel.WARNING, "Failed to deserialize object in list.", e);
                    }
                } while (peek() == JsonToken.BEGIN_OBJECT);
            }
            b();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // defpackage.f4h
    @Nullable
    public Float I() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return Float.valueOf(((Number) objL).floatValue());
        }
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public TimeZone V(@NotNull ILogger iLogger) throws IOException {
        String strB = B();
        if (strB != null) {
            return TimeZone.getTimeZone(strB);
        }
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public Double W() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return Double.valueOf(((Number) objL).doubleValue());
        }
        return null;
    }

    public void a() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f21893a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        this.f21893a.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            this.f21893a.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    public void b() throws IOException {
        if (this.f21893a.size() > 1) {
            this.f21893a.removeLast();
        }
    }

    @Override // defpackage.f4h
    public void beginObject() throws IOException {
        Map.Entry<String, Object> entryRemoveLast = this.f21893a.removeLast();
        if (entryRemoveLast == null) {
            throw new IOException("No more entries");
        }
        Object value = entryRemoveLast.getValue();
        if (!(value instanceof Map)) {
            throw new IOException("Current token is not an object");
        }
        this.f21893a.addLast(new AbstractMap.SimpleEntry(null, JsonToken.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            this.f21893a.addLast((Map.Entry) it.next());
        }
    }

    public boolean c() throws IOException {
        return !this.f21893a.isEmpty();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21893a.clear();
    }

    public void d() throws IOException {
        if (l() == null) {
            return;
        }
        throw new IOException("Expected null but was " + peek());
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> Map<String, List<T>> e0(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException {
        if (peek() == JsonToken.NULL) {
            d();
            return null;
        }
        HashMap map = new HashMap();
        try {
            beginObject();
            if (c()) {
                while (true) {
                    String strNextName = nextName();
                    List<T> listC = C(iLogger, fsdVar);
                    if (listC != null) {
                        map.put(strNextName, listC);
                    }
                    if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.f4h
    public void endObject() throws IOException {
        if (this.f21893a.size() > 1) {
            this.f21893a.removeLast();
        }
    }

    @Override // defpackage.f4h
    @Nullable
    public Integer h0() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return Integer.valueOf(((Number) objL).intValue());
        }
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public Long j0() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return Long.valueOf(((Number) objL).longValue());
        }
        return null;
    }

    @Nullable
    public final <T> T l() throws IOException {
        try {
            return (T) m(null, null);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.f4h
    public void l0(@NotNull ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, q0());
        } catch (Exception e) {
            iLogger.b(SentryLevel.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }

    @Nullable
    public final <T> T m(@Nullable ILogger iLogger, @Nullable fsd<T> fsdVar) throws Exception {
        Map.Entry<String, Object> entryPeekLast = this.f21893a.peekLast();
        if (entryPeekLast == null) {
            return null;
        }
        T t = (T) entryPeekLast.getValue();
        if (fsdVar != null && iLogger != null) {
            return fsdVar.a(this, iLogger);
        }
        this.f21893a.removeLast();
        return t;
    }

    @Override // defpackage.f4h
    public double nextDouble() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return ((Number) objL).doubleValue();
        }
        throw new IOException("Expected double");
    }

    @Override // defpackage.f4h
    public float nextFloat() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return ((Number) objL).floatValue();
        }
        throw new IOException("Expected float");
    }

    @Override // defpackage.f4h
    public int nextInt() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return ((Number) objL).intValue();
        }
        throw new IOException("Expected int");
    }

    @Override // defpackage.f4h
    public long nextLong() throws IOException {
        Object objL = l();
        if (objL instanceof Number) {
            return ((Number) objL).longValue();
        }
        throw new IOException("Expected long");
    }

    @Override // defpackage.f4h
    @NotNull
    public String nextName() throws IOException {
        Map.Entry<String, Object> entryPeekLast = this.f21893a.peekLast();
        if (entryPeekLast != null && entryPeekLast.getKey() != null) {
            return entryPeekLast.getKey();
        }
        throw new IOException("Expected a name but was " + peek());
    }

    @Override // defpackage.f4h
    public String nextString() throws IOException {
        String str = (String) l();
        if (str != null) {
            return str;
        }
        throw new IOException("Expected string");
    }

    @Override // defpackage.f4h
    @NotNull
    public JsonToken peek() throws IOException {
        Map.Entry<String, Object> entryPeekLast;
        if (!this.f21893a.isEmpty() && (entryPeekLast = this.f21893a.peekLast()) != null) {
            if (entryPeekLast.getKey() != null) {
                return JsonToken.NAME;
            }
            Object value = entryPeekLast.getValue();
            if (value instanceof Map) {
                return JsonToken.BEGIN_OBJECT;
            }
            if (value instanceof List) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (value instanceof String) {
                return JsonToken.STRING;
            }
            if (value instanceof Number) {
                return JsonToken.NUMBER;
            }
            if (value instanceof Boolean) {
                return JsonToken.BOOLEAN;
            }
            return value instanceof JsonToken ? (JsonToken) value : JsonToken.END_DOCUMENT;
        }
        return JsonToken.END_DOCUMENT;
    }

    @Override // defpackage.f4h
    @Nullable
    public Object q0() throws IOException {
        return l();
    }

    @Override // defpackage.f4h
    @Nullable
    public Date r(@NotNull ILogger iLogger) throws IOException {
        return f4h.w(B(), iLogger);
    }

    @Override // defpackage.f4h
    public void setLenient(boolean z) {
    }

    @Override // defpackage.f4h
    public void skipValue() throws IOException {
    }

    @Override // defpackage.f4h
    @Nullable
    public Boolean t() throws IOException {
        return (Boolean) l();
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> Map<String, T> v(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException {
        if (peek() == JsonToken.NULL) {
            d();
            return null;
        }
        try {
            beginObject();
            HashMap map = new HashMap();
            if (c()) {
                while (true) {
                    try {
                        map.put(nextName(), fsdVar.a(this, iLogger));
                    } catch (Exception e) {
                        iLogger.a(SentryLevel.WARNING, "Failed to deserialize object in map.", e);
                    }
                    if (peek() != JsonToken.BEGIN_OBJECT && peek() != JsonToken.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
