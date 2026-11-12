package com.huawei.watchface;

import android.text.TextUtils;
import android.util.Xml;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes45.dex */
public class a5 extends JsonReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f30059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final XmlPullParser f30060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f30061c;
    public final f d;
    public final Stack e;
    public final Stack f;
    public final j g;
    public final b h;
    public h i;
    public h j;
    public i k;
    public i l;
    public JsonToken m;
    public boolean n;
    public boolean o;
    public boolean p;
    public JsonToken q;
    public int r;
    public boolean s;

    public static abstract /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30062a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f30062a = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30062a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30062a[JsonToken.BEGIN_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30067b;

        public c(int i, String str) {
            this.f30066a = i;
            this.f30067b = str;
        }

        public String toString() {
            return "'" + this.f30067b + "'/" + this.f30066a;
        }
    }

    public interface d {
        Object a();
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f30070c;
        public boolean d;
        public boolean e;
    }

    public enum g {
        INSIDE_OBJECT(false),
        INSIDE_ARRAY(true),
        INSIDE_EMBEDDED_ARRAY(true),
        INSIDE_PRIMITIVE_EMBEDDED_ARRAY(true),
        INSIDE_PRIMITIVE_ARRAY(true),
        PRIMITIVE_VALUE(false),
        NAME(false);

        final boolean mIsInsideArray;

        g(boolean z) {
            this.mIsInsideArray = z;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JsonToken f30074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f30075b;

        public String toString() {
            return this.f30074a + ", " + this.f30075b;
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f30077b;

        public String toString() {
            return this.f30076a + ", " + this.f30077b;
        }
    }

    public a5(Reader reader, e eVar) {
        super(reader);
        this.f30061c = new f(new d() { // from class: com.huawei.watchface.a5$$ExternalSyntheticLambda0
            @Override // com.huawei.watchface.a5.d
            public final Object a() {
                return new a5.h();
            }
        });
        this.d = new f(new d() { // from class: com.huawei.watchface.a5$$ExternalSyntheticLambda1
            @Override // com.huawei.watchface.a5.d
            public final Object a() {
                return new a5.i();
            }
        });
        this.e = new Stack();
        this.f = new Stack();
        j jVar = new j();
        this.g = jVar;
        this.h = new b(10);
        this.o = true;
        this.p = false;
        this.r = 0;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        this.f30060b = xmlPullParserNewPullParser;
        this.f30059a = eVar;
        jVar.f30078a = -1;
        try {
            xmlPullParserNewPullParser.setInput(reader);
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", eVar.d);
        } catch (XmlPullParserException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String a(String str, String str2, XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (xmlPullParser != null) {
            int namespaceCount = xmlPullParser.getNamespaceCount(xmlPullParser.getDepth());
            for (int i2 = 0; i2 < namespaceCount; i2++) {
                if (str2.equals(xmlPullParser.getNamespaceUri(i2))) {
                    str2 = xmlPullParser.getNamespacePrefix(i2);
                    break;
                }
            }
        }
        return HiDataFilter.DataFilterExpression.LESS_THAN + str2 + HiDataFilter.DataFilterExpression.BIGGER_THAN + str;
    }

    public final void b(JsonToken jsonToken) throws IOException {
        JsonToken jsonTokenPeek = peek();
        this.q = null;
        if (jsonTokenPeek != jsonToken) {
            throw new IllegalStateException("jsonToken expected, but met actual");
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
        this.m = jsonToken;
        b(jsonToken);
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        JsonToken jsonToken = JsonToken.BEGIN_OBJECT;
        this.m = jsonToken;
        b(jsonToken);
    }

    public final void c(JsonToken jsonToken) {
        h hVar = (h) this.f30061c.a();
        hVar.f30074a = jsonToken;
        hVar.f30075b = null;
        h hVar2 = this.j;
        if (hVar2 == null) {
            this.j = hVar;
            this.i = hVar;
        } else {
            hVar.f30075b = hVar2;
            this.j = hVar;
        }
    }

    public final JsonToken d() {
        h hVar = this.j;
        if (hVar == null) {
            return JsonToken.END_DOCUMENT;
        }
        this.j = hVar.f30075b;
        if (hVar == this.i) {
            this.i = null;
        }
        this.f30061c.a(hVar);
        return hVar.f30074a;
    }

    public final i e() {
        i iVar = this.l;
        if (iVar == null) {
            throw new IllegalStateException("No value can be given");
        }
        if (iVar == this.k) {
            this.k = null;
        }
        this.d.a(iVar);
        this.l = iVar.f30077b;
        return iVar;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this.m = jsonToken;
        b(jsonToken);
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this.m = jsonToken;
        b(jsonToken);
    }

    public final j f() throws XmlPullParserException, IOException {
        int next = this.f30060b.next();
        j jVar = this.g;
        jVar.a();
        if (next == 1) {
            this.n = true;
            return jVar;
        }
        if (next == 2) {
            jVar.f30078a = 1;
            jVar.f30079b = this.f30060b.getName();
            jVar.d = this.f30060b.getNamespace();
            if (this.f30060b.getAttributeCount() > 0) {
                this.h.a(this.f30060b);
                jVar.e = this.h;
            }
            return jVar;
        }
        if (next == 3) {
            jVar.f30078a = 2;
            jVar.f30079b = this.f30060b.getName();
            jVar.d = this.f30060b.getNamespace();
            return jVar;
        }
        if (next != 4) {
            HwLog.i("WatchFaceConfigReader", "nextXmlInfo default");
            jVar.f30078a = -1;
            return jVar;
        }
        String strTrim = this.f30060b.getText().trim();
        if (strTrim.length() == 0) {
            this.p = true;
            jVar.f30078a = -1;
            return jVar;
        }
        this.p = false;
        jVar.f30078a = 3;
        jVar.f30080c = strTrim;
        return jVar;
    }

    public final JsonToken g() {
        h hVar = this.j;
        if (hVar != null) {
            return hVar.f30074a;
        }
        return null;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        peek();
        JsonToken jsonToken = this.q;
        return (jsonToken == JsonToken.END_OBJECT || jsonToken == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        b(JsonToken.BOOLEAN);
        String str = e().f30076a;
        if ("true".equalsIgnoreCase(str) || "false".equalsIgnoreCase(str)) {
            return true;
        }
        throw new IOException("Cannot parse mValue to boolean");
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        b(JsonToken.STRING);
        return Double.parseDouble(e().f30076a);
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        b(JsonToken.STRING);
        return CommonUtils.k(e().f30076a);
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        b(JsonToken.STRING);
        return Long.parseLong(e().f30076a);
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        JsonToken jsonToken = JsonToken.NAME;
        this.m = jsonToken;
        b(jsonToken);
        return e().f30076a;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        b(JsonToken.STRING);
        return e().f30076a;
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.m == null && this.o) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (this.q != null) {
            try {
                a();
                this.m = null;
                return this.q;
            } catch (XmlPullParserException e2) {
                throw new JsonSyntaxException("XML parsing exception", e2);
            }
        }
        try {
            a(false);
            this.m = null;
            JsonToken jsonTokenD = d();
            this.q = jsonTokenD;
            return jsonTokenD;
        } catch (XmlPullParserException e3) {
            throw new JsonSyntaxException("XML parsing exception", e3);
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() {
        this.s = true;
        int i2 = 0;
        do {
            try {
                JsonToken jsonTokenPeek = peek();
                if (jsonTokenPeek == JsonToken.BEGIN_ARRAY || jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
                    i2++;
                } else if (jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_OBJECT) {
                    i2--;
                } else if (this.k != null) {
                    e();
                } else {
                    this.q = null;
                }
                this.q = null;
            } catch (Throwable th) {
                this.s = false;
                throw th;
            }
        } while (i2 != 0);
        this.s = false;
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f30063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f30064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f30065c;
        public int d = 0;

        public b(int i) {
            a(i);
        }

        public final void a(int i) {
            this.f30063a = new ArrayList(i);
            this.f30064b = new ArrayList(i);
            this.f30065c = new ArrayList(i);
            this.d = i;
        }

        public String b(int i) {
            List list = this.f30063a;
            boolean z = list != null && i < list.size() && i >= 0;
            List list2 = this.f30065c;
            return (list2 == null || i >= list2.size() || i < 0 || !z) ? "" : a5.a((String) this.f30063a.get(i), (String) this.f30065c.get(i), null);
        }

        public void a(XmlPullParser xmlPullParser) {
            int attributeCount = xmlPullParser.getAttributeCount();
            if (attributeCount > this.d) {
                a(attributeCount);
            }
            this.f30063a.clear();
            this.f30064b.clear();
            this.f30065c.clear();
            for (int i = 0; i < attributeCount; i++) {
                this.f30063a.add(xmlPullParser.getAttributeName(i));
                if (a5.this.f30059a.d) {
                    this.f30065c.add(xmlPullParser.getAttributePrefix(i));
                } else {
                    this.f30065c.add("");
                }
                this.f30064b.add(xmlPullParser.getAttributeValue(i));
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f30071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f30072b = new ArrayList(32);

        public f(d dVar) {
            this.f30071a = dVar;
        }

        public Object a() {
            if (this.f30072b.isEmpty()) {
                return this.f30071a.a();
            }
            return this.f30072b.remove(this.f30072b.size() - 1);
        }

        public void a(Object obj) {
            this.f30072b.add(obj);
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f30080c;
        public String d;
        public b e;

        public void a() {
            this.f30078a = -1;
            this.f30079b = null;
            this.f30080c = null;
            this.d = null;
            this.e = null;
        }

        public String a(XmlPullParser xmlPullParser) {
            return a5.a(this.f30079b, this.d, xmlPullParser);
        }
    }

    public final void b() throws XmlPullParserException, IOException {
        d();
        e();
        if (this.f30059a.f30068a && g() == null) {
            a(true);
        }
        this.e.pop();
        this.e.pop();
        this.e.pop();
        int size = this.e.size();
        if (this.f30059a.f30068a && g() == JsonToken.STRING) {
            this.e.push(g.INSIDE_PRIMITIVE_ARRAY);
            return;
        }
        this.e.push(g.INSIDE_ARRAY);
        int i2 = size + 1;
        if (this.e.size() <= i2 || this.e.get(i2) != g.INSIDE_OBJECT) {
            this.e.push(g.INSIDE_OBJECT);
        }
        JsonToken jsonTokenG = g();
        JsonToken jsonToken = JsonToken.BEGIN_OBJECT;
        if (jsonTokenG != jsonToken) {
            c(jsonToken);
        }
    }

    public final void c(j jVar) {
        g gVar = (g) this.e.peek();
        if (this.f30059a.f30070c && gVar.mIsInsideArray && this.f.size() > 0) {
            c cVar = (c) this.f.peek();
            if (cVar.f30066a == this.f30060b.getDepth()) {
                if (!(this.f30059a.d ? jVar.a(this.f30060b) : jVar.f30079b).equals(cVar.f30067b)) {
                    a(JsonToken.END_ARRAY);
                    c();
                    gVar = (g) this.e.peek();
                }
            }
        }
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            a(JsonToken.BEGIN_OBJECT);
            this.e.push(g.INSIDE_OBJECT);
        } else if (iOrdinal != 3 && iOrdinal != 4) {
            if (iOrdinal == 6) {
                a(JsonToken.BEGIN_OBJECT);
                this.e.push(g.INSIDE_OBJECT);
            }
            this.e.push(g.NAME);
            a(JsonToken.NAME);
            a(jVar.a(this.f30060b));
            this.p = true;
        } else {
            this.e.push(g.PRIMITIVE_VALUE);
        }
        if (jVar.e != null) {
            g gVar2 = (g) this.e.peek();
            if (gVar2 != g.PRIMITIVE_VALUE) {
                if (gVar2 == g.NAME) {
                    a(JsonToken.BEGIN_OBJECT);
                    this.e.push(g.INSIDE_OBJECT);
                }
                a(jVar.e);
                return;
            }
            throw new IllegalStateException("Attributes data in primitive scope");
        }
    }

    public final boolean d(j jVar) {
        int iOrdinal = ((g) this.e.peek()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 5) {
                a(jVar.f30080c, false);
                return false;
            }
            if (iOrdinal != 6) {
                HwLog.i("WatchFaceConfigReader", "Cannot process text xmlValue inside scope");
                return true;
            }
            a(jVar.f30080c, true);
            return true;
        }
        int i2 = this.r;
        String str = SampleEvent.SEPARATOR;
        if (i2 > 0) {
            str = SampleEvent.SEPARATOR + this.r;
        }
        this.r++;
        a(JsonToken.NAME);
        a(str);
        a(jVar.f30080c, false);
        return false;
    }

    public final void a() throws XmlPullParserException, IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this.q;
        JsonToken jsonToken3 = this.m;
        if (jsonToken2 != jsonToken3 && jsonToken3 == (jsonToken = JsonToken.BEGIN_ARRAY)) {
            int i2 = a.f30062a[jsonToken2.ordinal()];
            if (i2 == 1) {
                this.q = jsonToken;
                g gVar = (g) this.e.peek();
                if (g() == JsonToken.NAME) {
                    if (this.f30059a.f30070c) {
                        this.e.pop();
                        c(JsonToken.BEGIN_OBJECT);
                        this.e.push(g.INSIDE_EMBEDDED_ARRAY);
                        this.e.push(g.INSIDE_OBJECT);
                        g gVar2 = g.NAME;
                        if (gVar == gVar2) {
                            this.e.push(gVar2);
                            return;
                        }
                        return;
                    }
                    b();
                    return;
                }
                return;
            }
            if (i2 != 2) {
                HwLog.i("WatchFaceConfigReader", "mToken is not a rule, do nothing");
                return;
            }
            this.q = jsonToken;
            e eVar = this.f30059a;
            if (eVar.f30070c) {
                if (eVar.f30068a) {
                    c(JsonToken.STRING);
                    this.e.push(g.INSIDE_PRIMITIVE_EMBEDDED_ARRAY);
                    return;
                }
                c(JsonToken.END_OBJECT);
                c(JsonToken.STRING);
                c(JsonToken.NAME);
                c(JsonToken.BEGIN_OBJECT);
                b(e().f30076a);
                b(SampleEvent.SEPARATOR);
                this.e.push(g.INSIDE_EMBEDDED_ARRAY);
                return;
            }
            c(JsonToken.END_ARRAY);
        }
    }

    public final void b(String str) {
        i iVar = (i) this.d.a();
        iVar.f30076a = str;
        iVar.f30077b = null;
        i iVar2 = this.l;
        if (iVar2 == null) {
            this.k = iVar;
            this.l = iVar;
        } else {
            iVar.f30077b = iVar2;
            this.l = iVar;
        }
    }

    public final void b(j jVar) {
        if (!this.f30059a.f30069b) {
            a(this.m);
            this.e.push(g.INSIDE_OBJECT);
            c(jVar);
            return;
        }
        if (jVar.e != null) {
            a(JsonToken.BEGIN_OBJECT);
            this.e.push(g.INSIDE_OBJECT);
            a(jVar.e);
            return;
        }
        int i2 = a.f30062a[this.m.ordinal()];
        if (i2 == 1) {
            a(JsonToken.BEGIN_OBJECT);
            this.e.push(g.INSIDE_OBJECT);
        } else if (i2 != 3) {
            HwLog.i("WatchFaceConfigReader", "First expectedToken does not begin_object or begin_array");
        } else {
            a(JsonToken.BEGIN_ARRAY);
            this.e.push(this.f30059a.e ? g.INSIDE_PRIMITIVE_ARRAY : g.INSIDE_ARRAY);
        }
    }

    public final void c() {
        this.e.pop();
        if (this.e.isEmpty() || this.e.peek() != g.NAME) {
            return;
        }
        this.e.pop();
    }

    public final void a(JsonToken jsonToken) {
        h hVar = (h) this.f30061c.a();
        hVar.f30074a = jsonToken;
        hVar.f30075b = null;
        h hVar2 = this.i;
        if (hVar2 == null) {
            this.i = hVar;
            this.j = hVar;
        } else {
            hVar2.f30075b = hVar;
            this.i = hVar;
        }
    }

    public final void a(String str) {
        i iVar = (i) this.d.a();
        iVar.f30076a = str.trim();
        iVar.f30077b = null;
        i iVar2 = this.k;
        if (iVar2 == null) {
            this.k = iVar;
            this.l = iVar;
        } else {
            iVar2.f30077b = iVar;
            this.k = iVar;
        }
    }

    public final void a(b bVar) {
        int size = bVar.f30063a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(JsonToken.NAME);
            a("@" + bVar.b(i2));
            a(JsonToken.STRING);
            a((String) bVar.f30064b.get(i2));
        }
    }

    public final void a(boolean z) throws XmlPullParserException, IOException {
        while (true) {
            if ((this.i != null || this.n) && !z) {
                return;
            }
            j jVarF = f();
            if (this.n) {
                if (this.f30059a.f30069b) {
                    return;
                }
                a(JsonToken.END_OBJECT);
                return;
            }
            int i2 = jVarF.f30078a;
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        a(jVarF);
                    } else {
                        if (i2 != 3) {
                            HwLog.i("WatchFaceConfigReader", "xml type is not a rule, do nothing");
                        } else {
                            z = d(jVarF);
                        }
                        if (!z && this.s) {
                            return;
                        }
                    }
                } else if (this.o) {
                    this.o = false;
                    b(jVarF);
                } else {
                    c(jVarF);
                }
                z = false;
                if (!z) {
                    continue;
                }
            }
        }
    }

    public final void a(String str, boolean z) {
        h hVar;
        if (z && (hVar = this.i) != null && hVar.f30074a == JsonToken.STRING) {
            if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                i iVar = this.k;
                sb.append(iVar.f30076a);
                sb.append("");
                sb.append(str);
                iVar.f30076a = sb.toString();
                return;
            }
            return;
        }
        a(JsonToken.STRING);
        a(str);
    }

    public final void a(j jVar) {
        switch ((g) this.e.peek()) {
            case INSIDE_OBJECT:
                a(JsonToken.END_OBJECT);
                this.r = 0;
                c();
                break;
            case INSIDE_ARRAY:
            case INSIDE_PRIMITIVE_ARRAY:
                a(JsonToken.END_ARRAY);
                c();
                break;
            case INSIDE_EMBEDDED_ARRAY:
            case INSIDE_PRIMITIVE_EMBEDDED_ARRAY:
                a(JsonToken.END_ARRAY);
                a(JsonToken.END_OBJECT);
                c();
                c();
                break;
            case PRIMITIVE_VALUE:
                this.e.pop();
                break;
            case NAME:
                if (this.p) {
                    a("", true);
                }
                c();
                break;
            default:
                HwLog.i("WatchFaceConfigReader", "mScopeStack's top element status is not a rule, do nothing");
                break;
        }
        if (this.f30059a.f30070c) {
            int depth = this.f30060b.getDepth();
            String strA = this.f30059a.d ? jVar.a(this.f30060b) : jVar.f30079b;
            while (this.f.size() > 0 && ((c) this.f.peek()).f30066a > depth) {
                this.f.pop();
            }
            if (this.f.size() != 0 && ((c) this.f.peek()).f30066a >= depth) {
                ((c) this.f.peek()).f30067b = strA;
            } else {
                this.f.push(new c(depth, strA));
            }
        }
    }
}
