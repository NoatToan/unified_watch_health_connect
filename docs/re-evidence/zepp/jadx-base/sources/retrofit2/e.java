package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes23.dex */
abstract class e<T> {

    public class a extends e<Iterable<T>> {
        public a() {
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.g gVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it2 = iterable.iterator();
            while (it2.hasNext()) {
                e.this.a(gVar, it2.next());
            }
        }
    }

    public class b extends e<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                e.this.a(gVar, Array.get(obj, i));
            }
        }
    }

    public static final class c<T> extends e<T> {
        private final Converter<T, RequestBody> a;

        public c(Converter<T, RequestBody> converter) {
            this.a = converter;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                gVar.j(this.a.convert(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class d<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;
        private final boolean c;

        public d(String str, Converter<T, String> converter, boolean z) {
            this.a = (String) retrofit2.i.b(str, "name == null");
            this.b = converter;
            this.c = z;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.b.convert(t)) == null) {
                return;
            }
            gVar.a(this.a, strConvert, this.c);
        }
    }

    /* JADX INFO: renamed from: retrofit2.e$e, reason: collision with other inner class name */
    public static final class C1215e<T> extends e<Map<String, T>> {
        private final Converter<T, String> a;
        private final boolean b;

        public C1215e(Converter<T, String> converter, boolean z) {
            this.a = converter;
            this.b = z;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.g gVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Field map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                }
                String strConvert = this.a.convert(value);
                if (strConvert == null) {
                    throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.a.getClass().getName() + " for key '" + key + "'.");
                }
                gVar.a(key, strConvert, this.b);
            }
        }
    }

    public static final class f<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;

        public f(String str, Converter<T, String> converter) {
            this.a = (String) retrofit2.i.b(str, "name == null");
            this.b = converter;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.b.convert(t)) == null) {
                return;
            }
            gVar.b(this.a, strConvert);
        }
    }

    public static final class g<T> extends e<Map<String, T>> {
        private final Converter<T, String> a;

        public g(Converter<T, String> converter) {
            this.a = converter;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.g gVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Header map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                }
                gVar.b(key, this.a.convert(value));
            }
        }
    }

    public static final class h<T> extends e<T> {
        private final Headers a;
        private final Converter<T, RequestBody> b;

        public h(Headers headers, Converter<T, RequestBody> converter) {
            this.a = headers;
            this.b = converter;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                gVar.c(this.a, this.b.convert(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class i<T> extends e<Map<String, T>> {
        private final Converter<T, RequestBody> a;
        private final String b;

        public i(Converter<T, RequestBody> converter, String str) {
            this.a = converter;
            this.b = str;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.g gVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                }
                gVar.c(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.b), this.a.convert(value));
            }
        }
    }

    public static final class j<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;
        private final boolean c;

        public j(String str, Converter<T, String> converter, boolean z) {
            this.a = (String) retrofit2.i.b(str, "name == null");
            this.b = converter;
            this.c = z;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) throws IOException {
            if (t != null) {
                gVar.e(this.a, this.b.convert(t), this.c);
                return;
            }
            throw new IllegalArgumentException("Path parameter \"" + this.a + "\" value must not be null.");
        }
    }

    public static final class k<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;
        private final boolean c;

        public k(String str, Converter<T, String> converter, boolean z) {
            this.a = (String) retrofit2.i.b(str, "name == null");
            this.b = converter;
            this.c = z;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.b.convert(t)) == null) {
                return;
            }
            gVar.f(this.a, strConvert, this.c);
        }
    }

    public static final class l<T> extends e<Map<String, T>> {
        private final Converter<T, String> a;
        private final boolean b;

        public l(Converter<T, String> converter, boolean z) {
            this.a = converter;
            this.b = z;
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.g gVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw new IllegalArgumentException("Query map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                }
                String strConvert = this.a.convert(value);
                if (strConvert == null) {
                    throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.a.getClass().getName() + " for key '" + key + "'.");
                }
                gVar.f(key, strConvert, this.b);
            }
        }
    }

    public static final class m<T> extends e<T> {
        private final Converter<T, String> a;
        private final boolean b;

        public m(Converter<T, String> converter, boolean z) {
            this.a = converter;
            this.b = z;
        }

        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            gVar.f(this.a.convert(t), null, this.b);
        }
    }

    public static final class n extends e<MultipartBody.Part> {
        public static final n a = new n();

        private n() {
        }

        @Override // retrofit2.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(retrofit2.g gVar, @Nullable MultipartBody.Part part) {
            if (part != null) {
                gVar.d(part);
            }
        }
    }

    public static final class o extends e<Object> {
        @Override // retrofit2.e
        public void a(retrofit2.g gVar, @Nullable Object obj) {
            retrofit2.i.b(obj, "@Url parameter is null.");
            gVar.k(obj);
        }
    }

    public abstract void a(retrofit2.g gVar, @Nullable T t) throws IOException;

    public final e<Object> b() {
        return new b();
    }

    public final e<Iterable<T>> c() {
        return new a();
    }
}
