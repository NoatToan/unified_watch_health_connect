package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.ximalaya.ting.android.opensdk.httputil.httpswitch.IDCGroupManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] g = {JsonLexerKt.UNICODE_ESC, 'l', 'l'};
    private static final char[] h = {'r', JsonLexerKt.UNICODE_ESC, 'e'};
    private static final char[] i = {'r', JsonLexerKt.UNICODE_ESC, 'e', '\"'};
    private static final char[] j = {'a', 'l', 's', 'e'};
    private static final char[] k = {'a', 'l', 's', 'e', '\"'};
    private static final char[] l = {'\n'};
    private static final a<Integer> m = new b();
    private static final a<Long> n = new com.google.android.gms.common.server.response.a();
    private static final a<Float> o = new d();
    private static final a<Double> p = new c();
    private static final a<Boolean> q = new f();
    private static final a<String> r = new e();
    private static final a<BigInteger> s = new h();
    private static final a<BigDecimal> t = new g();
    private final char[] a = new char[1];
    private final char[] b = new char[32];
    private final char[] c = new char[1024];
    private final StringBuilder d = new StringBuilder(32);
    private final StringBuilder e = new StringBuilder(1024);
    private final Stack<Integer> f = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(@RecentlyNonNull String str) {
            super(str);
        }

        public ParseException(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }

        public ParseException(@RecentlyNonNull Throwable th) {
            super(th);
        }
    }

    public interface a<O> {
        @Nullable
        O a(FastParser fastParser, BufferedReader bufferedReader) throws ParseException, IOException;
    }

    private final char A(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.a) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.a[0])) {
            if (bufferedReader.read(this.a) == -1) {
                return (char) 0;
            }
        }
        return this.a[0];
    }

    private final int b(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2;
        char cA = A(bufferedReader);
        if (cA == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cA == ',') {
            throw new ParseException("Missing value");
        }
        if (cA == 'n') {
            n(bufferedReader, g);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cA == '\"') {
            i2 = 0;
            boolean z = false;
            while (i2 < cArr.length && bufferedReader.read(cArr, i2, 1) != -1) {
                char c = cArr[i2];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c == '\"' && !z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i2 + 1);
                    return i2;
                }
                z = c == '\\' ? !z : false;
                i2++;
            }
        } else {
            cArr[0] = cA;
            i2 = 1;
            while (i2 < cArr.length && bufferedReader.read(cArr, i2, 1) != -1) {
                if (cArr[i2] == '}' || cArr[i2] == ',' || Character.isWhitespace(cArr[i2]) || cArr[i2] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i2 - 1);
                    cArr[i2] = 0;
                    return i2;
                }
                i2++;
            }
        }
        if (i2 == cArr.length) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    @Nullable
    private final String c(BufferedReader bufferedReader) throws ParseException, IOException {
        this.f.push(2);
        char cA = A(bufferedReader);
        if (cA == '\"') {
            this.f.push(3);
            String strM = m(bufferedReader, this.b, this.d, null);
            g(3);
            if (A(bufferedReader) == ':') {
                return strM;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cA == ']') {
            g(2);
            g(1);
            g(5);
            return null;
        }
        if (cA == '}') {
            g(2);
            return null;
        }
        StringBuilder sb = new StringBuilder(19);
        sb.append("Unexpected token: ");
        sb.append(cA);
        throw new ParseException(sb.toString());
    }

    @Nullable
    private final String d(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        char cA = A(bufferedReader);
        if (cA == '\"') {
            return m(bufferedReader, cArr, sb, cArr2);
        }
        if (cA != 'n') {
            throw new ParseException("Expected string");
        }
        n(bufferedReader, g);
        return null;
    }

    @Nullable
    private final <T extends FastJsonResponse> ArrayList<T> e(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) throws ParseException, IOException {
        IDCGroupManager.AnonymousClass1.C10481 c10481 = (ArrayList<T>) new ArrayList();
        char cA = A(bufferedReader);
        if (cA == ']') {
            g(5);
            return c10481;
        }
        if (cA == 'n') {
            n(bufferedReader, g);
            g(5);
            return null;
        }
        if (cA != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(cA);
            throw new ParseException(sb.toString());
        }
        this.f.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZac = field.zac();
                if (!i(bufferedReader, fastJsonResponseZac)) {
                    return c10481;
                }
                c10481.add(fastJsonResponseZac);
                char cA2 = A(bufferedReader);
                if (cA2 != ',') {
                    if (cA2 == ']') {
                        g(5);
                        return c10481;
                    }
                    StringBuilder sb2 = new StringBuilder(19);
                    sb2.append("Unexpected token: ");
                    sb2.append(cA2);
                    throw new ParseException(sb2.toString());
                }
                if (A(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.f.push(1);
            } catch (IllegalAccessException e) {
                throw new ParseException("Error instantiating inner object", e);
            } catch (InstantiationException e2) {
                throw new ParseException("Error instantiating inner object", e2);
            }
        }
    }

    @Nullable
    private final <O> ArrayList<O> f(BufferedReader bufferedReader, a<O> aVar) throws ParseException, IOException {
        char cA = A(bufferedReader);
        if (cA == 'n') {
            n(bufferedReader, g);
            return null;
        }
        if (cA != '[') {
            throw new ParseException("Expected start of array");
        }
        this.f.push(5);
        ArrayList<O> arrayList = new ArrayList<>();
        while (true) {
            bufferedReader.mark(1024);
            char cA2 = A(bufferedReader);
            if (cA2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cA2 != ',') {
                if (cA2 == ']') {
                    g(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(aVar.a(this, bufferedReader));
            }
        }
    }

    private final void g(int i2) throws ParseException {
        if (this.f.isEmpty()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i2);
            sb.append(" but had empty stack");
            throw new ParseException(sb.toString());
        }
        int iIntValue = this.f.pop().intValue();
        if (iIntValue == i2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i2);
        sb2.append(" but had ");
        sb2.append(iIntValue);
        throw new ParseException(sb2.toString());
    }

    /* JADX WARN: Code duplicated, block: B:119:0x027f  */
    /* JADX WARN: Code duplicated, block: B:138:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x027d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i2;
        HashMap map;
        char cA;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strC = c(bufferedReader);
        if (strC == null) {
            g(1);
            return false;
        }
        while (strC != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strC);
            if (field == null) {
                strC = l(bufferedReader);
            } else {
                this.f.push(4);
                switch (field.zaa) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, (ArrayList<Integer>) f(bufferedReader, m));
                        } else {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, r(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb = new StringBuilder(55);
                                sb.append("Expected end of object or field separator, but found: ");
                                sb.append(cA);
                                throw new ParseException(sb.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zab(field, f(bufferedReader, s));
                        } else {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, v(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb2 = new StringBuilder(55);
                                sb2.append("Expected end of object or field separator, but found: ");
                                sb2.append(cA);
                                throw new ParseException(sb2.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zac(field, f(bufferedReader, n));
                        } else {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, s(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb3 = new StringBuilder(55);
                                sb3.append("Expected end of object or field separator, but found: ");
                                sb3.append(cA);
                                throw new ParseException(sb3.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zad(field, f(bufferedReader, o));
                        } else {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, w(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb4 = new StringBuilder(55);
                                sb4.append("Expected end of object or field separator, but found: ");
                                sb4.append(cA);
                                throw new ParseException(sb4.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zae(field, f(bufferedReader, p));
                        } else {
                            fastJsonResponse.zaa(field, y(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb5 = new StringBuilder(55);
                                sb5.append("Expected end of object or field separator, but found: ");
                                sb5.append(cA);
                                throw new ParseException(sb5.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zaf(field, f(bufferedReader, t));
                        } else {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, z(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb6 = new StringBuilder(55);
                                sb6.append("Expected end of object or field separator, but found: ");
                                sb6.append(cA);
                                throw new ParseException(sb6.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 6:
                        if (!field.zab) {
                            fastJsonResponse.zaa(field, j(bufferedReader, false));
                            i2 = 4;
                            g(i2);
                            g(2);
                            cA = A(bufferedReader);
                            if (cA != ',') {
                                strC = c(bufferedReader);
                            } else {
                                if (cA == '}') {
                                    StringBuilder sb7 = new StringBuilder(55);
                                    sb7.append("Expected end of object or field separator, but found: ");
                                    sb7.append(cA);
                                    throw new ParseException(sb7.toString());
                                }
                                strC = null;
                            }
                        } else {
                            fastJsonResponse.zag(field, f(bufferedReader, q));
                            i2 = 4;
                            g(i2);
                            g(2);
                            cA = A(bufferedReader);
                            if (cA != ',') {
                                strC = c(bufferedReader);
                            } else {
                                if (cA == '}') {
                                    StringBuilder sb8 = new StringBuilder(55);
                                    sb8.append("Expected end of object or field separator, but found: ");
                                    sb8.append(cA);
                                    throw new ParseException(sb8.toString());
                                }
                                strC = null;
                            }
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zah(field, f(bufferedReader, r));
                        } else {
                            fastJsonResponse.zaa((FastJsonResponse.Field) field, p(bufferedReader));
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb9 = new StringBuilder(55);
                                sb9.append("Expected end of object or field separator, but found: ");
                                sb9.append(cA);
                                throw new ParseException(sb9.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zaa((FastJsonResponse.Field) field, Base64Utils.decode(d(bufferedReader, this.c, this.e, l)));
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb10 = new StringBuilder(55);
                                sb10.append("Expected end of object or field separator, but found: ");
                                sb10.append(cA);
                                throw new ParseException(sb10.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 9:
                        fastJsonResponse.zaa((FastJsonResponse.Field) field, Base64Utils.decodeUrlSafe(d(bufferedReader, this.c, this.e, l)));
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb11 = new StringBuilder(55);
                                sb11.append("Expected end of object or field separator, but found: ");
                                sb11.append(cA);
                                throw new ParseException(sb11.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 10:
                        char cA2 = A(bufferedReader);
                        if (cA2 == 'n') {
                            n(bufferedReader, g);
                            map = null;
                        } else {
                            if (cA2 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.f.push(1);
                            map = new HashMap();
                            while (true) {
                                char cA3 = A(bufferedReader);
                                if (cA3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cA3 == '\"') {
                                    String strM = m(bufferedReader, this.b, this.d, null);
                                    if (A(bufferedReader) != ':') {
                                        String strValueOf = String.valueOf(strM);
                                        throw new ParseException(strValueOf.length() != 0 ? "No map value found for key ".concat(strValueOf) : new String("No map value found for key "));
                                    }
                                    if (A(bufferedReader) != '\"') {
                                        String strValueOf2 = String.valueOf(strM);
                                        throw new ParseException(strValueOf2.length() != 0 ? "Expected String value for key ".concat(strValueOf2) : new String("Expected String value for key "));
                                    }
                                    map.put(strM, m(bufferedReader, this.b, this.d, null));
                                    char cA4 = A(bufferedReader);
                                    if (cA4 != ',') {
                                        if (cA4 != '}') {
                                            StringBuilder sb12 = new StringBuilder(48);
                                            sb12.append("Unexpected character while parsing string map: ");
                                            sb12.append(cA4);
                                            throw new ParseException(sb12.toString());
                                        }
                                        g(1);
                                    }
                                } else if (cA3 == '}') {
                                    g(1);
                                }
                                i2 = 4;
                                g(i2);
                                g(2);
                                cA = A(bufferedReader);
                                if (cA != ',') {
                                    strC = c(bufferedReader);
                                } else {
                                    if (cA == '}') {
                                        StringBuilder sb13 = new StringBuilder(55);
                                        sb13.append("Expected end of object or field separator, but found: ");
                                        sb13.append(cA);
                                        throw new ParseException(sb13.toString());
                                    }
                                    strC = null;
                                }
                            }
                        }
                        fastJsonResponse.zaa((FastJsonResponse.Field) field, (Map<String, String>) map);
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb14 = new StringBuilder(55);
                                sb14.append("Expected end of object or field separator, but found: ");
                                sb14.append(cA);
                                throw new ParseException(sb14.toString());
                            }
                            strC = null;
                        }
                        break;
                    case 11:
                        if (!field.zab) {
                            char cA5 = A(bufferedReader);
                            if (cA5 == 'n') {
                                n(bufferedReader, g);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.f.push(1);
                                if (cA5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZac = field.zac();
                                    i(bufferedReader, fastJsonResponseZac);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZac);
                                } catch (IllegalAccessException e) {
                                    throw new ParseException("Error instantiating inner object", e);
                                } catch (InstantiationException e2) {
                                    throw new ParseException("Error instantiating inner object", e2);
                                }
                            }
                            break;
                        } else {
                            char cA6 = A(bufferedReader);
                            if (cA6 == 'n') {
                                n(bufferedReader, g);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.f.push(5);
                                if (cA6 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, e(bufferedReader, field));
                            }
                        }
                        i2 = 4;
                        g(i2);
                        g(2);
                        cA = A(bufferedReader);
                        if (cA != ',') {
                            strC = c(bufferedReader);
                        } else {
                            if (cA == '}') {
                                StringBuilder sb15 = new StringBuilder(55);
                                sb15.append("Expected end of object or field separator, but found: ");
                                sb15.append(cA);
                                throw new ParseException(sb15.toString());
                            }
                            strC = null;
                        }
                        break;
                    default:
                        int i3 = field.zaa;
                        StringBuilder sb16 = new StringBuilder(30);
                        sb16.append("Invalid field type ");
                        sb16.append(i3);
                        throw new ParseException(sb16.toString());
                }
            }
        }
        g(1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        while (true) {
            char cA = A(bufferedReader);
            if (cA != '\"') {
                if (cA == 'f') {
                    n(bufferedReader, z ? k : j);
                    return false;
                }
                if (cA == 'n') {
                    n(bufferedReader, g);
                    return false;
                }
                if (cA == 't') {
                    n(bufferedReader, z ? i : h);
                    return true;
                }
                StringBuilder sb = new StringBuilder(19);
                sb.append("Unexpected token: ");
                sb.append(cA);
                throw new ParseException(sb.toString());
            }
            if (z) {
                throw new ParseException("No boolean value found in string");
            }
            z = true;
        }
    }

    @Nullable
    private final String l(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cA = A(bufferedReader);
        if (cA != '\"') {
            if (cA == ',') {
                throw new ParseException("Missing value");
            }
            int i2 = 1;
            if (cA == '[') {
                this.f.push(5);
                bufferedReader.mark(32);
                if (A(bufferedReader) == ']') {
                    g(5);
                } else {
                    bufferedReader.reset();
                    boolean z = false;
                    boolean z2 = false;
                    while (i2 > 0) {
                        char cA2 = A(bufferedReader);
                        if (cA2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cA2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cA2 == '\"' && !z) {
                            z2 = !z2;
                        }
                        if (cA2 == '[' && !z2) {
                            i2++;
                        }
                        if (cA2 == ']' && !z2) {
                            i2--;
                        }
                        z = (cA2 == '\\' && z2) ? !z : false;
                    }
                    g(5);
                }
            } else if (cA != '{') {
                bufferedReader.reset();
                b(bufferedReader, this.c);
            } else {
                this.f.push(1);
                bufferedReader.mark(32);
                char cA3 = A(bufferedReader);
                if (cA3 == '}') {
                    g(1);
                } else {
                    if (cA3 != '\"') {
                        StringBuilder sb = new StringBuilder(18);
                        sb.append("Unexpected token ");
                        sb.append(cA3);
                        throw new ParseException(sb.toString());
                    }
                    bufferedReader.reset();
                    c(bufferedReader);
                    while (l(bufferedReader) != null) {
                    }
                    g(1);
                }
            }
        } else {
            if (bufferedReader.read(this.a) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c = this.a[0];
            boolean z3 = false;
            while (true) {
                if (c == '\"' && !z3) {
                    break;
                }
                z3 = c == '\\' ? !z3 : false;
                if (bufferedReader.read(this.a) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c = this.a[0];
                if (Character.isISOControl(c)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cA4 = A(bufferedReader);
        if (cA4 == ',') {
            g(2);
            return c(bufferedReader);
        }
        if (cA4 == '}') {
            g(2);
            return null;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("Unexpected token ");
        sb2.append(cA4);
        throw new ParseException(sb2.toString());
    }

    private static String m(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @Nullable char[] cArr2) throws ParseException, IOException {
        boolean z;
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int i2 = bufferedReader.read(cArr);
            if (i2 == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i3];
                if (Character.isISOControl(c)) {
                    if (cArr2 == null) {
                        z = false;
                        break;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= cArr2.length) {
                            z = false;
                            break;
                        }
                        if (cArr2[i4] == c) {
                            z = true;
                            break;
                        }
                        i4++;
                    }
                    if (!z) {
                        throw new ParseException("Unexpected control character while reading string");
                    }
                }
                if (c == '\"' && !z2) {
                    sb.append(cArr, 0, i3);
                    bufferedReader.reset();
                    bufferedReader.skip(i3 + 1);
                    return z3 ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                }
                if (c == '\\') {
                    z2 = !z2;
                    z3 = true;
                } else {
                    z2 = false;
                }
            }
            sb.append(cArr, 0, i2);
            bufferedReader.mark(cArr.length);
        }
    }

    private final void n(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i2 = 0;
        while (i2 < cArr.length) {
            int i3 = bufferedReader.read(this.b, 0, cArr.length - i2);
            if (i3 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (cArr[i4 + i2] != this.b[i4]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i2 += i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final String p(BufferedReader bufferedReader) throws ParseException, IOException {
        return d(bufferedReader, this.b, this.d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(BufferedReader bufferedReader) throws ParseException, IOException {
        int i2;
        int i3;
        boolean z;
        int iB = b(bufferedReader, this.c);
        int i4 = 0;
        if (iB == 0) {
            return 0;
        }
        char[] cArr = this.c;
        if (iB <= 0) {
            throw new ParseException("No number to parse");
        }
        if (cArr[0] == '-') {
            i2 = Integer.MIN_VALUE;
            i3 = 1;
            z = true;
        } else {
            i2 = -2147483647;
            i3 = 0;
            z = false;
        }
        if (i3 < iB) {
            int i5 = i3 + 1;
            int iDigit = Character.digit(cArr[i3], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            int i6 = -iDigit;
            i3 = i5;
            i4 = i6;
        }
        while (i3 < iB) {
            int i7 = i3 + 1;
            int iDigit2 = Character.digit(cArr[i3], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i4 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i8 = i4 * 10;
            if (i8 < i2 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i4 = i8 - iDigit2;
            i3 = i7;
        }
        if (!z) {
            return -i4;
        }
        if (i3 > 1) {
            return i4;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long s(BufferedReader bufferedReader) throws ParseException, IOException {
        long j2;
        boolean z;
        int iB = b(bufferedReader, this.c);
        long j3 = 0;
        if (iB == 0) {
            return 0L;
        }
        char[] cArr = this.c;
        if (iB <= 0) {
            throw new ParseException("No number to parse");
        }
        int i2 = 0;
        if (cArr[0] == '-') {
            j2 = Long.MIN_VALUE;
            i2 = 1;
            z = true;
        } else {
            j2 = -9223372036854775807L;
            z = false;
        }
        if (i2 < iB) {
            int i3 = i2 + 1;
            int iDigit = Character.digit(cArr[i2], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i2 = i3;
            j3 = -iDigit;
        }
        while (i2 < iB) {
            int i4 = i2 + 1;
            int iDigit2 = Character.digit(cArr[i2], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j3 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j4 = j3 * 10;
            long j5 = iDigit2;
            if (j4 < j2 + j5) {
                throw new ParseException("Number too large");
            }
            j3 = j4 - j5;
            i2 = i4;
        }
        if (!z) {
            return -j3;
        }
        if (i2 > 1) {
            return j3;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final BigInteger v(BufferedReader bufferedReader) throws ParseException, IOException {
        int iB = b(bufferedReader, this.c);
        if (iB == 0) {
            return null;
        }
        return new BigInteger(new String(this.c, 0, iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float w(BufferedReader bufferedReader) throws ParseException, IOException {
        int iB = b(bufferedReader, this.c);
        if (iB == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.c, 0, iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double y(BufferedReader bufferedReader) throws ParseException, IOException {
        int iB = b(bufferedReader, this.c);
        if (iB == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.c, 0, iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public final BigDecimal z(BufferedReader bufferedReader) throws ParseException, IOException {
        int iB = b(bufferedReader, this.c);
        if (iB == 0) {
            return null;
        }
        return new BigDecimal(new String(this.c, 0, iB));
    }

    @KeepForSdk
    public void parse(@RecentlyNonNull InputStream inputStream, @RecentlyNonNull T t2) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.f.push(0);
                char cA = A(bufferedReader);
                if (cA == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cA == '[') {
                    this.f.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t2.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t2.addConcreteTypeArrayInternal(value, value.zae, e(bufferedReader, value));
                } else {
                    if (cA != '{') {
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(cA);
                        throw new ParseException(sb.toString());
                    }
                    this.f.push(1);
                    i(bufferedReader, t2);
                }
                g(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }
}
