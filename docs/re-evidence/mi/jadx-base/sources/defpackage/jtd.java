package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import io.sentry.vendor.gson.stream.a;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class jtd implements f4h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f23113a;

    public jtd(Reader reader) {
        this.f23113a = new a(reader);
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> T A(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws Exception {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return fsdVar.a(this, iLogger);
        }
        this.f23113a.D();
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public String B() throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return this.f23113a.nextString();
        }
        this.f23113a.D();
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> List<T> C(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException {
        if (this.f23113a.peek() == JsonToken.NULL) {
            this.f23113a.D();
            return null;
        }
        this.f23113a.a();
        ArrayList arrayList = new ArrayList();
        if (this.f23113a.n()) {
            do {
                try {
                    arrayList.add(fsdVar.a(this, iLogger));
                } catch (Exception e) {
                    iLogger.a(SentryLevel.WARNING, "Failed to deserialize object in list.", e);
                }
            } while (this.f23113a.peek() == JsonToken.BEGIN_OBJECT);
        }
        this.f23113a.l();
        return arrayList;
    }

    @Override // defpackage.f4h
    @Nullable
    public Float I() throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return Float.valueOf(nextFloat());
        }
        this.f23113a.D();
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public TimeZone V(ILogger iLogger) throws IOException {
        if (this.f23113a.peek() == JsonToken.NULL) {
            this.f23113a.D();
            return null;
        }
        try {
            return TimeZone.getTimeZone(this.f23113a.nextString());
        } catch (Exception e) {
            iLogger.a(SentryLevel.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // defpackage.f4h
    @Nullable
    public Double W() throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return Double.valueOf(this.f23113a.nextDouble());
        }
        this.f23113a.D();
        return null;
    }

    public void a() throws IOException {
        this.f23113a.a();
    }

    public void b() throws IOException {
        this.f23113a.l();
    }

    @Override // defpackage.f4h
    public void beginObject() throws IOException {
        this.f23113a.beginObject();
    }

    public boolean c() throws IOException {
        return this.f23113a.n();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23113a.close();
    }

    public boolean d() throws IOException {
        return this.f23113a.s();
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> Map<String, List<T>> e0(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException {
        if (peek() == JsonToken.NULL) {
            l();
            return null;
        }
        HashMap map = new HashMap();
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
    }

    @Override // defpackage.f4h
    public void endObject() throws IOException {
        this.f23113a.endObject();
    }

    @Override // defpackage.f4h
    @Nullable
    public Integer h0() throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return Integer.valueOf(this.f23113a.nextInt());
        }
        this.f23113a.D();
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public Long j0() throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return Long.valueOf(this.f23113a.nextLong());
        }
        this.f23113a.D();
        return null;
    }

    public void l() throws IOException {
        this.f23113a.D();
    }

    @Override // defpackage.f4h
    public void l0(ILogger iLogger, Map<String, Object> map, String str) {
        try {
            map.put(str, q0());
        } catch (Exception e) {
            iLogger.b(SentryLevel.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }

    @Override // defpackage.f4h
    public double nextDouble() throws IOException {
        return this.f23113a.nextDouble();
    }

    @Override // defpackage.f4h
    public float nextFloat() throws IOException {
        return (float) this.f23113a.nextDouble();
    }

    @Override // defpackage.f4h
    public int nextInt() throws IOException {
        return this.f23113a.nextInt();
    }

    @Override // defpackage.f4h
    public long nextLong() throws IOException {
        return this.f23113a.nextLong();
    }

    @Override // defpackage.f4h
    @NotNull
    public String nextName() throws IOException {
        return this.f23113a.nextName();
    }

    @Override // defpackage.f4h
    public String nextString() throws IOException {
        return this.f23113a.nextString();
    }

    @Override // defpackage.f4h
    @NotNull
    public JsonToken peek() throws IOException {
        return this.f23113a.peek();
    }

    @Override // defpackage.f4h
    @Nullable
    public Object q0() throws IOException {
        return new htd().e(this);
    }

    @Override // defpackage.f4h
    @Nullable
    public Date r(ILogger iLogger) throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return f4h.w(this.f23113a.nextString(), iLogger);
        }
        this.f23113a.D();
        return null;
    }

    @Override // defpackage.f4h
    public void setLenient(boolean z) {
        this.f23113a.setLenient(z);
    }

    @Override // defpackage.f4h
    public void skipValue() throws IOException {
        this.f23113a.skipValue();
    }

    @Override // defpackage.f4h
    @Nullable
    public Boolean t() throws IOException {
        if (this.f23113a.peek() != JsonToken.NULL) {
            return Boolean.valueOf(this.f23113a.s());
        }
        this.f23113a.D();
        return null;
    }

    @Override // defpackage.f4h
    @Nullable
    public <T> Map<String, T> v(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException {
        if (this.f23113a.peek() == JsonToken.NULL) {
            this.f23113a.D();
            return null;
        }
        this.f23113a.beginObject();
        HashMap map = new HashMap();
        if (this.f23113a.n()) {
            while (true) {
                try {
                    map.put(this.f23113a.nextName(), fsdVar.a(this, iLogger));
                } catch (Exception e) {
                    iLogger.a(SentryLevel.WARNING, "Failed to deserialize object in map.", e);
                }
                if (this.f23113a.peek() != JsonToken.BEGIN_OBJECT && this.f23113a.peek() != JsonToken.NAME) {
                    break;
                }
            }
        }
        this.f23113a.endObject();
        return map;
    }
}
