package org.json.alipay;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f29558a = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f29559b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return AbstractJsonLexerKt.NULL;
        }
    }

    public b() {
        this.f29559b = new HashMap();
    }

    private static void b(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    public static String c(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        int i = 0;
        char c = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    String str3 = "000" + Integer.toHexString(cCharAt);
                                    str2 = "\\u" + str3.substring(str3.length() - 4);
                                }
                                break;
                        }
                        i++;
                        c = cCharAt;
                    } else {
                        stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                    }
                } else if (c == '<') {
                    stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                }
                stringBuffer.append(cCharAt);
                i++;
                c = cCharAt;
            } else {
                str2 = "\\r";
            }
            stringBuffer.append(str2);
            i++;
            c = cCharAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    public final Object a(String str) throws JSONException {
        Object obj = str == null ? null : this.f29559b.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + c(str) + "] not found.");
    }

    public String toString() {
        try {
            Iterator itA = a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itA.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = itA.next();
                stringBuffer.append(c(next.toString()));
                stringBuffer.append(AbstractJsonLexerKt.COLON);
                stringBuffer.append(a(this.f29559b.get(next)));
            }
            stringBuffer.append(AbstractJsonLexerKt.END_OBJ);
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public b(String str) {
        this(new c(str));
    }

    public static String a(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return AbstractJsonLexerKt.NULL;
        }
        if (!(obj instanceof Number)) {
            if ((obj instanceof Boolean) || (obj instanceof b) || (obj instanceof org.json.alipay.a)) {
                return obj.toString();
            }
            if (obj instanceof Map) {
                return new b((Map) obj).toString();
            }
            if (obj instanceof Collection) {
                return new org.json.alipay.a((Collection) obj).toString();
            }
            return obj.getClass().isArray() ? new org.json.alipay.a(obj).toString() : c(obj.toString());
        }
        Number number = (Number) obj;
        b(number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    public final boolean b(String str) {
        return this.f29559b.containsKey(str);
    }

    public b(Map map) {
        this.f29559b = map == null ? new HashMap() : map;
    }

    public final Iterator a() {
        return this.f29559b.keySet().iterator();
    }

    public b(c cVar) throws JSONException {
        this();
        if (cVar.c() != '{') {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c = cVar.c();
            if (c == 0) {
                throw cVar.a("A JSONObject text must end with '}'");
            }
            if (c == '}') {
                return;
            }
            cVar.a();
            String string = cVar.d().toString();
            char c2 = cVar.c();
            if (c2 == '=') {
                if (cVar.b() != '>') {
                    cVar.a();
                }
            } else if (c2 != ':') {
                throw cVar.a("Expected a ':' after a key");
            }
            Object objD = cVar.d();
            if (string == null) {
                throw new JSONException("Null key.");
            }
            if (objD != null) {
                b(objD);
                this.f29559b.put(string, objD);
            } else {
                this.f29559b.remove(string);
            }
            char c3 = cVar.c();
            if (c3 != ',' && c3 != ';') {
                if (c3 != '}') {
                    throw cVar.a("Expected a ',' or '}'");
                }
                return;
            } else if (cVar.c() == '}') {
                return;
            } else {
                cVar.a();
            }
        }
    }
}
