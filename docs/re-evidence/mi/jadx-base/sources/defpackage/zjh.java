package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zjh<T> {

    public class a extends zjh<Iterable<T>> {
        public a() {
        }

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                zjh.this.a(dnkVar, it.next());
            }
        }
    }

    public class b extends zjh<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.zjh
        public void a(dnk dnkVar, Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                zjh.this.a(dnkVar, Array.get(obj, i));
            }
        }
    }

    public static final class c<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41351b;
        public final dk4<T, RequestBody> c;

        public c(Method method, int i, dk4<T, RequestBody> dk4Var) {
            this.f41350a = method;
            this.f41351b = i;
            this.c = dk4Var;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) {
            if (t == null) {
                throw kmq.o(this.f41350a, this.f41351b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                dnkVar.l(this.c.convert(t));
            } catch (IOException e) {
                throw kmq.p(this.f41350a, e, this.f41351b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class d<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dk4<T, String> f41353b;
        public final boolean c;

        public d(String str, dk4<T, String> dk4Var, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f41352a = str;
            this.f41353b = dk4Var;
            this.c = z;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f41353b.convert(t)) == null) {
                return;
            }
            dnkVar.a(this.f41352a, strConvert, this.c);
        }
    }

    public static final class e<T> extends zjh<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41355b;
        public final dk4<T, String> c;
        public final boolean d;

        public e(Method method, int i, dk4<T, String> dk4Var, boolean z) {
            this.f41354a = method;
            this.f41355b = i;
            this.c = dk4Var;
            this.d = z;
        }

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw kmq.o(this.f41354a, this.f41355b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw kmq.o(this.f41354a, this.f41355b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw kmq.o(this.f41354a, this.f41355b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.c.convert(value);
                if (strConvert == null) {
                    throw kmq.o(this.f41354a, this.f41355b, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                dnkVar.a(key, strConvert, this.d);
            }
        }
    }

    public static final class f<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dk4<T, String> f41357b;

        public f(String str, dk4<T, String> dk4Var) {
            Objects.requireNonNull(str, "name == null");
            this.f41356a = str;
            this.f41357b = dk4Var;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f41357b.convert(t)) == null) {
                return;
            }
            dnkVar.b(this.f41356a, strConvert);
        }
    }

    public static final class g<T> extends zjh<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41359b;
        public final dk4<T, String> c;

        public g(Method method, int i, dk4<T, String> dk4Var) {
            this.f41358a = method;
            this.f41359b = i;
            this.c = dk4Var;
        }

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw kmq.o(this.f41358a, this.f41359b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw kmq.o(this.f41358a, this.f41359b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw kmq.o(this.f41358a, this.f41359b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                dnkVar.b(key, this.c.convert(value));
            }
        }
    }

    public static final class h extends zjh<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41361b;

        public h(Method method, int i) {
            this.f41360a = method;
            this.f41361b = i;
        }

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, Headers headers) {
            if (headers == null) {
                throw kmq.o(this.f41360a, this.f41361b, "Headers parameter must not be null.", new Object[0]);
            }
            dnkVar.c(headers);
        }
    }

    public static final class i<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41363b;
        public final Headers c;
        public final dk4<T, RequestBody> d;

        public i(Method method, int i, Headers headers, dk4<T, RequestBody> dk4Var) {
            this.f41362a = method;
            this.f41363b = i;
            this.c = headers;
            this.d = dk4Var;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) {
            if (t == null) {
                return;
            }
            try {
                dnkVar.d(this.c, this.d.convert(t));
            } catch (IOException e) {
                throw kmq.o(this.f41362a, this.f41363b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    public static final class j<T> extends zjh<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41365b;
        public final dk4<T, RequestBody> c;
        public final String d;

        public j(Method method, int i, dk4<T, RequestBody> dk4Var, String str) {
            this.f41364a = method;
            this.f41365b = i;
            this.c = dk4Var;
            this.d = str;
        }

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw kmq.o(this.f41364a, this.f41365b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw kmq.o(this.f41364a, this.f41365b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw kmq.o(this.f41364a, this.f41365b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                dnkVar.d(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.d), this.c.convert(value));
            }
        }
    }

    public static final class k<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41367b;
        public final String c;
        public final dk4<T, String> d;
        public final boolean e;

        public k(Method method, int i, String str, dk4<T, String> dk4Var, boolean z) {
            this.f41366a = method;
            this.f41367b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = dk4Var;
            this.e = z;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) throws IOException {
            if (t != null) {
                dnkVar.f(this.c, this.d.convert(t), this.e);
                return;
            }
            throw kmq.o(this.f41366a, this.f41367b, "Path parameter \"" + this.c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dk4<T, String> f41369b;
        public final boolean c;

        public l(String str, dk4<T, String> dk4Var, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f41368a = str;
            this.f41369b = dk4Var;
            this.c = z;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.f41369b.convert(t)) == null) {
                return;
            }
            dnkVar.g(this.f41368a, strConvert, this.c);
        }
    }

    public static final class m<T> extends zjh<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41371b;
        public final dk4<T, String> c;
        public final boolean d;

        public m(Method method, int i, dk4<T, String> dk4Var, boolean z) {
            this.f41370a = method;
            this.f41371b = i;
            this.c = dk4Var;
            this.d = z;
        }

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, Map<String, T> map) throws IOException {
            if (map == null) {
                throw kmq.o(this.f41370a, this.f41371b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw kmq.o(this.f41370a, this.f41371b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw kmq.o(this.f41370a, this.f41371b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.c.convert(value);
                if (strConvert == null) {
                    throw kmq.o(this.f41370a, this.f41371b, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                dnkVar.g(key, strConvert, this.d);
            }
        }
    }

    public static final class n<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dk4<T, String> f41372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f41373b;

        public n(dk4<T, String> dk4Var, boolean z) {
            this.f41372a = dk4Var;
            this.f41373b = z;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            dnkVar.g(this.f41372a.convert(t), null, this.f41373b);
        }
    }

    public static final class o extends zjh<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f41374a = new o();

        @Override // defpackage.zjh
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(dnk dnkVar, MultipartBody.Part part) {
            if (part != null) {
                dnkVar.e(part);
            }
        }
    }

    public static final class p extends zjh<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f41375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41376b;

        public p(Method method, int i) {
            this.f41375a = method;
            this.f41376b = i;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, Object obj) {
            if (obj == null) {
                throw kmq.o(this.f41375a, this.f41376b, "@Url parameter is null.", new Object[0]);
            }
            dnkVar.m(obj);
        }
    }

    public static final class q<T> extends zjh<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f41377a;

        public q(Class<T> cls) {
            this.f41377a = cls;
        }

        @Override // defpackage.zjh
        public void a(dnk dnkVar, T t) {
            dnkVar.h(this.f41377a, t);
        }
    }

    public abstract void a(dnk dnkVar, T t) throws IOException;

    public final zjh<Object> b() {
        return new b();
    }

    public final zjh<Iterable<T>> c() {
        return new a();
    }
}
