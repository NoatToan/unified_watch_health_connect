package org.json.alipay;

import com.huawei.operation.utils.Constants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes20.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f44589a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f44590b;

    public String toString() {
        try {
            Iterator itA = a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itA.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = itA.next();
                stringBuffer.append(d(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(b(this.f44590b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public Object e(String str) {
        return this.f44590b.remove(str);
    }

    public Object c(String str) {
        if (str == null) {
            return null;
        }
        return this.f44590b.get(str);
    }

    public boolean b(String str) {
        return this.f44590b.containsKey(str);
    }

    public b a(String str, Object obj) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj == null) {
            e(str);
            return this;
        }
        a(obj);
        this.f44590b.put(str, obj);
        return this;
    }

    public Iterator a() {
        return this.f44590b.keySet().iterator();
    }

    public Object a(String str) throws JSONException {
        Object objC = c(str);
        if (objC != null) {
            return objC;
        }
        throw new JSONException("JSONObject[" + d(str) + "] not found.");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    public static String d(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        int i = 0;
        char c2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
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
                        c2 = cCharAt;
                    } else {
                        stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                    }
                } else if (c2 == '<') {
                    stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                }
                stringBuffer.append(cCharAt);
                i++;
                c2 = cCharAt;
            } else {
                str2 = "\\r";
            }
            stringBuffer.append(str2);
            i++;
            c2 = cCharAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    public static String b(Object obj) {
        if (obj == null || obj.equals(null)) {
            return Constants.NULL;
        }
        if (obj instanceof Number) {
            return a((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof b) || (obj instanceof org.json.alipay.a)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new b((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new org.json.alipay.a((Collection) obj).toString();
        }
        return obj.getClass().isArray() ? new org.json.alipay.a(obj).toString() : d(obj.toString());
    }

    public static void a(Object obj) throws JSONException {
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

    public static final class a {
        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return Constants.NULL;
        }

        private a() {
        }
    }

    public static String a(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        a((Object) number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    public b(c cVar) throws JSONException {
        this();
        if (cVar.c() != '{') {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c2 = cVar.c();
            if (c2 == 0) {
                throw cVar.a("A JSONObject text must end with '}'");
            }
            if (c2 == '}') {
                return;
            }
            cVar.a();
            String string = cVar.d().toString();
            char c3 = cVar.c();
            if (c3 == '=') {
                if (cVar.b() != '>') {
                    cVar.a();
                }
            } else if (c3 != ':') {
                throw cVar.a("Expected a ':' after a key");
            }
            a(string, cVar.d());
            char c4 = cVar.c();
            if (c4 != ',' && c4 != ';') {
                if (c4 != '}') {
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

    public b(Map map) {
        this.f44590b = map == null ? new HashMap() : map;
    }

    public b(String str) {
        this(new c(str));
    }

    public b() {
        this.f44590b = new HashMap();
    }
}
