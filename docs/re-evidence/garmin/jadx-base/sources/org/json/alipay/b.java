package org.json.alipay;

import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f133510a = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f133511b;

    public b(c cVar) throws JSONException {
        this();
        if (cVar.c() != '{') {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c14 = cVar.c();
            if (c14 == 0) {
                throw cVar.a("A JSONObject text must end with '}'");
            }
            if (c14 == '}') {
                return;
            }
            cVar.a();
            String string = cVar.d().toString();
            char c15 = cVar.c();
            if (c15 == '=') {
                if (cVar.b() != '>') {
                    cVar.a();
                }
            } else if (c15 != ':') {
                throw cVar.a("Expected a ':' after a key");
            }
            Object objD = cVar.d();
            if (string == null) {
                throw new JSONException("Null key.");
            }
            if (objD != null) {
                b(objD);
                this.f133511b.put(string, objD);
            } else {
                this.f133511b.remove(string);
            }
            char c16 = cVar.c();
            if (c16 != ',' && c16 != ';') {
                if (c16 != '}') {
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

    public static String a(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return BuildConfig.TRAVIS;
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
            string = fb1.c.m(1, 0, string);
        }
        return string.endsWith(".") ? fb1.c.m(1, 0, string) : string;
    }

    public static void b(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d14 = (Double) obj;
                if (d14.isInfinite() || d14.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f14 = (Float) obj;
                if (f14.isInfinite() || f14.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    public static String c(String str) {
        String strConcat;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i14 = 0;
        char c14 = 0;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == '\f') {
                strConcat = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append('\\');
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                strConcat = "\\b";
                                break;
                            case '\t':
                                strConcat = "\\t";
                                break;
                            case '\n':
                                strConcat = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    String str2 = "000" + Integer.toHexString(cCharAt);
                                    strConcat = "\\u".concat(str2.substring(str2.length() - 4));
                                }
                                break;
                        }
                        i14++;
                        c14 = cCharAt;
                    } else {
                        stringBuffer.append('\\');
                    }
                } else if (c14 == '<') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(cCharAt);
                i14++;
                c14 = cCharAt;
            } else {
                strConcat = "\\r";
            }
            stringBuffer.append(strConcat);
            i14++;
            c14 = cCharAt;
        }
        stringBuffer.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        return stringBuffer.toString();
    }

    public String toString() {
        try {
            Iterator itA = a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itA.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(CoreConstants.COMMA_CHAR);
                }
                Object next = itA.next();
                stringBuffer.append(c(next.toString()));
                stringBuffer.append(CoreConstants.COLON_CHAR);
                stringBuffer.append(a(this.f133511b.get(next)));
            }
            stringBuffer.append(CoreConstants.CURLY_RIGHT);
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final class a {
        public a() {
        }

        public final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return BuildConfig.TRAVIS;
        }

        public /* synthetic */ a(byte b14) {
            this();
        }
    }

    public final boolean b(String str) {
        return this.f133511b.containsKey(str);
    }

    public b(String str) {
        this(new c(str));
    }

    public b(Map map) {
        this.f133511b = map == null ? new HashMap() : map;
    }

    public b() {
        this.f133511b = new HashMap();
    }

    public final Object a(String str) throws JSONException {
        Object obj = str == null ? null : this.f133511b.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + c(str) + "] not found.");
    }

    public final Iterator a() {
        return this.f133511b.keySet().iterator();
    }
}
