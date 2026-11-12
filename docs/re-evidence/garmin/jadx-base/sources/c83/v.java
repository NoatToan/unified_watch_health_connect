package c83;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v<T> {

    public static final class a<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c83.h<T, RequestBody> f25838c;

        public a(Method method, int i14, c83.h<T, RequestBody> hVar) {
            this.f25836a = method;
            this.f25837b = i14;
            this.f25838c = hVar;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            int i14 = this.f25837b;
            Method method = this.f25836a;
            if (t7 == null) {
                throw f0.j(method, i14, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                yVar.f25896k = this.f25838c.convert(t7);
            } catch (IOException e4) {
                throw f0.k(method, e4, i14, org.apache.commons.lang3.e.f("Unable to convert ", " to RequestBody", t7), new Object[0]);
            }
        }
    }

    public static final class b<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c83.h<T, String> f25840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f25841c;

        public b(String str, c83.h<T, String> hVar, boolean z14) {
            Objects.requireNonNull(str, "name == null");
            this.f25839a = str;
            this.f25840b = hVar;
            this.f25841c = z14;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            String strConvert;
            if (t7 == null || (strConvert = this.f25840b.convert(t7)) == null) {
                return;
            }
            FormBody.Builder builder = yVar.f25895j;
            String str = this.f25839a;
            if (this.f25841c) {
                builder.addEncoded(str, strConvert);
            } else {
                builder.add(str, strConvert);
            }
        }
    }

    public static final class c<T> extends v<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c83.h<T, String> f25844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25845d;

        public c(Method method, int i14, c83.h<T, String> hVar, boolean z14) {
            this.f25842a = method;
            this.f25843b = i14;
            this.f25844c = hVar;
            this.f25845d = z14;
        }

        @Override // c83.v
        public final void a(y yVar, Object obj) {
            Map map = (Map) obj;
            int i14 = this.f25843b;
            Method method = this.f25842a;
            if (map == null) {
                throw f0.j(method, i14, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.j(method, i14, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.j(method, i14, am.j.m("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                c83.h<T, String> hVar = this.f25844c;
                String strConvert = hVar.convert((T) value);
                if (strConvert == null) {
                    throw f0.j(method, i14, "Field map value '" + value + "' converted to null by " + hVar.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                FormBody.Builder builder = yVar.f25895j;
                if (this.f25845d) {
                    builder.addEncoded(str, strConvert);
                } else {
                    builder.add(str, strConvert);
                }
            }
        }
    }

    public static final class d<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c83.h<T, String> f25847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f25848c;

        public d(String str, c83.h<T, String> hVar, boolean z14) {
            Objects.requireNonNull(str, "name == null");
            this.f25846a = str;
            this.f25847b = hVar;
            this.f25848c = z14;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            String strConvert;
            if (t7 == null || (strConvert = this.f25847b.convert(t7)) == null) {
                return;
            }
            yVar.a(this.f25846a, strConvert, this.f25848c);
        }
    }

    public static final class e<T> extends v<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c83.h<T, String> f25851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25852d;

        public e(Method method, int i14, c83.h<T, String> hVar, boolean z14) {
            this.f25849a = method;
            this.f25850b = i14;
            this.f25851c = hVar;
            this.f25852d = z14;
        }

        @Override // c83.v
        public final void a(y yVar, Object obj) {
            Map map = (Map) obj;
            int i14 = this.f25850b;
            Method method = this.f25849a;
            if (map == null) {
                throw f0.j(method, i14, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.j(method, i14, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.j(method, i14, am.j.m("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                yVar.a(str, this.f25851c.convert((T) value), this.f25852d);
            }
        }
    }

    public static final class f extends v<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25854b;

        public f(Method method, int i14) {
            this.f25853a = method;
            this.f25854b = i14;
        }

        @Override // c83.v
        public final void a(y yVar, Headers headers) {
            Headers headers2 = headers;
            if (headers2 != null) {
                yVar.f25891f.addAll(headers2);
            } else {
                throw f0.j(this.f25853a, this.f25854b, "Headers parameter must not be null.", new Object[0]);
            }
        }
    }

    public static final class g<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Headers f25857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c83.h<T, RequestBody> f25858d;

        public g(Method method, int i14, Headers headers, c83.h<T, RequestBody> hVar) {
            this.f25855a = method;
            this.f25856b = i14;
            this.f25857c = headers;
            this.f25858d = hVar;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            if (t7 == null) {
                return;
            }
            try {
                RequestBody requestBodyConvert = this.f25858d.convert(t7);
                yVar.f25894i.addPart(this.f25857c, requestBodyConvert);
            } catch (IOException e4) {
                throw f0.j(this.f25855a, this.f25856b, org.apache.commons.lang3.e.f("Unable to convert ", " to RequestBody", t7), e4);
            }
        }
    }

    public static final class h<T> extends v<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c83.h<T, RequestBody> f25861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f25862d;

        public h(Method method, int i14, c83.h<T, RequestBody> hVar, String str) {
            this.f25859a = method;
            this.f25860b = i14;
            this.f25861c = hVar;
            this.f25862d = str;
        }

        @Override // c83.v
        public final void a(y yVar, Object obj) {
            Map map = (Map) obj;
            int i14 = this.f25860b;
            Method method = this.f25859a;
            if (map == null) {
                throw f0.j(method, i14, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.j(method, i14, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.j(method, i14, am.j.m("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                yVar.f25894i.addPart(Headers.of(HttpHeaders.CONTENT_DISPOSITION, am.j.m("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f25862d), this.f25861c.convert((T) value));
            }
        }
    }

    public static final class i<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c83.h<T, String> f25866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f25867e;

        public i(Method method, int i14, String str, c83.h<T, String> hVar, boolean z14) {
            this.f25863a = method;
            this.f25864b = i14;
            Objects.requireNonNull(str, "name == null");
            this.f25865c = str;
            this.f25866d = hVar;
            this.f25867e = z14;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) throws EOFException {
            String strX;
            char c14;
            String str = this.f25865c;
            if (t7 == null) {
                throw f0.j(this.f25863a, this.f25864b, am.j.m("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String strConvert = this.f25866d.convert(t7);
            if (yVar.f25888c == null) {
                v.e0.l();
                return;
            }
            int length = strConvert.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    strX = strConvert;
                    break;
                }
                int iCodePointAt = strConvert.codePointAt(iCharCount);
                boolean z14 = this.f25867e;
                int i14 = 47;
                int i15 = -1;
                int i16 = 127;
                int i17 = 32;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z14 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    w63.e eVar = new w63.e();
                    eVar.Q(0, iCharCount, strConvert);
                    w63.e eVar2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strConvert.codePointAt(iCharCount);
                        if (z14 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                            c14 = CoreConstants.PERCENT_CHAR;
                        } else if (iCodePointAt2 < i17 || iCodePointAt2 >= i16 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i15 || (!z14 && (iCodePointAt2 == i14 || iCodePointAt2 == 37))) {
                            if (eVar2 == null) {
                                eVar2 = new w63.e();
                            }
                            eVar2.S(iCodePointAt2);
                            long j8 = eVar2.f183349b;
                            for (long j14 = 0; j14 < j8; j14++) {
                                byte bJ = eVar2.j(j14);
                                int i18 = bJ & UnsignedBytes.MAX_VALUE;
                                eVar.H(37);
                                char[] cArr = y.f25884l;
                                eVar.H(cArr[(i18 >> 4) & 15]);
                                eVar.H(cArr[bJ & Ascii.SI]);
                            }
                            c14 = CoreConstants.PERCENT_CHAR;
                            eVar2.a();
                        } else {
                            eVar.S(iCodePointAt2);
                            c14 = CoreConstants.PERCENT_CHAR;
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i14 = 47;
                        i15 = -1;
                        i16 = 127;
                        i17 = 32;
                    }
                    strX = eVar.x();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = yVar.f25888c.replace("{" + str + StringSubstitutor.DEFAULT_VAR_END, strX);
            if (y.f25885m.matcher(strReplace).matches()) {
                vb.h.s("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(strConvert));
            } else {
                yVar.f25888c = strReplace;
            }
        }
    }

    public static final class j<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c83.h<T, String> f25869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f25870c;

        public j(String str, c83.h<T, String> hVar, boolean z14) {
            Objects.requireNonNull(str, "name == null");
            this.f25868a = str;
            this.f25869b = hVar;
            this.f25870c = z14;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            String strConvert;
            if (t7 == null || (strConvert = this.f25869b.convert(t7)) == null) {
                return;
            }
            yVar.b(this.f25868a, strConvert, this.f25870c);
        }
    }

    public static final class k<T> extends v<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c83.h<T, String> f25873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25874d;

        public k(Method method, int i14, c83.h<T, String> hVar, boolean z14) {
            this.f25871a = method;
            this.f25872b = i14;
            this.f25873c = hVar;
            this.f25874d = z14;
        }

        @Override // c83.v
        public final void a(y yVar, Object obj) {
            Map map = (Map) obj;
            int i14 = this.f25872b;
            Method method = this.f25871a;
            if (map == null) {
                throw f0.j(method, i14, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw f0.j(method, i14, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw f0.j(method, i14, am.j.m("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                c83.h<T, String> hVar = this.f25873c;
                String strConvert = hVar.convert((T) value);
                if (strConvert == null) {
                    throw f0.j(method, i14, "Query map value '" + value + "' converted to null by " + hVar.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                yVar.b(str, strConvert, this.f25874d);
            }
        }
    }

    public static final class l<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c83.h<T, String> f25875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f25876b;

        public l(c83.h<T, String> hVar, boolean z14) {
            this.f25875a = hVar;
            this.f25876b = z14;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            if (t7 == null) {
                return;
            }
            yVar.b(this.f25875a.convert(t7), null, this.f25876b);
        }
    }

    public static final class m extends v<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f25877a = new m();

        private m() {
        }

        @Override // c83.v
        public final void a(y yVar, MultipartBody.Part part) {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                yVar.f25894i.addPart(part2);
            }
        }
    }

    public static final class n extends v<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f25878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25879b;

        public n(Method method, int i14) {
            this.f25878a = method;
            this.f25879b = i14;
        }

        @Override // c83.v
        public final void a(y yVar, Object obj) {
            if (obj != null) {
                yVar.f25888c = obj.toString();
            } else {
                throw f0.j(this.f25878a, this.f25879b, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    public static final class o<T> extends v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f25880a;

        public o(Class<T> cls) {
            this.f25880a = cls;
        }

        @Override // c83.v
        public final void a(y yVar, T t7) {
            yVar.f25890e.tag(this.f25880a, t7);
        }
    }

    public abstract void a(y yVar, T t7);
}
