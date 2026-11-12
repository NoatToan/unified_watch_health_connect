package okhttp3.internal.http;

import com.google.firebase.perf.FirebasePerformance;
import d53.c;
import d53.u;
import i3.e5;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.e;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.k0;
import w63.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lw63/e;", "", "result", "", "readChallengeHeader", "(Lw63/e;Ljava/util/List;)V", "", "skipCommasAndWhitespace", "(Lw63/e;)Z", "", "prefix", "startsWith", "(Lw63/e;B)Z", "readQuotedString", "(Lw63/e;)Ljava/lang/String;", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "Lw63/h;", "QUOTED_STRING_DELIMITERS", "Lw63/h;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpHeaders {
    private static final h QUOTED_STRING_DELIMITERS;
    private static final h TOKEN_DELIMITERS;

    static {
        h.f183361d.getClass();
        QUOTED_STRING_DELIMITERS = h.a.c("\"\\");
        TOKEN_DELIMITERS = h.a.c("\t ,=");
    }

    @e
    public static final boolean hasBody(Response response) {
        response.getClass();
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (str.equalsIgnoreCase(headers.name(i14))) {
                w63.e eVar = new w63.e();
                eVar.R(headers.value(i14));
                try {
                    readChallengeHeader(eVar, arrayList);
                } catch (EOFException e4) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e4);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        response.getClass();
        if (s.g(response.request().method(), FirebasePerformance.HttpMethod.HEAD)) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, com.google.common.net.HttpHeaders.TRANSFER_ENCODING, null, 2, null))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8 A[EDGE_INSN: B:59:0x00b8->B:48:0x00b8 BREAK  A[LOOP:2: B:22:0x006e->B:47:0x00b6], SYNTHETIC] */
    private static final void readChallengeHeader(w63.e eVar, List<Challenge> list) throws EOFException {
        String token;
        while (true) {
            String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipCommasAndWhitespace(eVar);
                    token2 = readToken(eVar);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipCommasAndWhitespace = skipCommasAndWhitespace(eVar);
                String token3 = readToken(eVar);
                if (token3 == null) {
                    if (eVar.F1()) {
                        k0 k0Var = k0.f134949a;
                        k0Var.getClass();
                        list.add(new Challenge(token2, k0Var));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(eVar, (byte) 61);
                boolean zSkipCommasAndWhitespace2 = skipCommasAndWhitespace(eVar);
                if (zSkipCommasAndWhitespace || !(zSkipCommasAndWhitespace2 || eVar.F1())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(eVar, (byte) 61) + iSkipAll;
                    while (true) {
                        if (token3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (startsWith(eVar, (byte) 34)) {
                                token = readQuotedString(eVar);
                            } else {
                                token = readToken(eVar);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipCommasAndWhitespace(eVar)) {
                            }
                            token3 = null;
                        } else {
                            token3 = readToken(eVar);
                            if (!skipCommasAndWhitespace(eVar)) {
                                iSkipAll2 = Util.skipAll(eVar, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || skipCommasAndWhitespace(eVar)) {
                                    return;
                                }
                                if (startsWith(eVar, (byte) 34)) {
                                    token = readQuotedString(eVar);
                                } else {
                                    token = readToken(eVar);
                                }
                                if (token != null || ((String) linkedHashMap.put(token3, token)) != null) {
                                    return;
                                }
                                if (skipCommasAndWhitespace(eVar) && !eVar.F1()) {
                                    return;
                                } else {
                                    token3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new Challenge(token2, linkedHashMap));
                    token2 = token3;
                } else {
                    StringBuilder sbK = e5.k(token3);
                    sbK.append(u.u("=", iSkipAll));
                    Map mapSingletonMap = Collections.singletonMap(null, sbK.toString());
                    mapSingletonMap.getClass();
                    list.add(new Challenge(token2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    private static final String readQuotedString(w63.e eVar) throws EOFException {
        if (eVar.readByte() != 34) {
            vb.h.s("Failed requirement.");
            return null;
        }
        w63.e eVar2 = new w63.e();
        while (true) {
            long jT1 = eVar.t1(QUOTED_STRING_DELIMITERS);
            if (jT1 == -1) {
                return null;
            }
            if (eVar.j(jT1) == 34) {
                eVar2.write(eVar, jT1);
                eVar.readByte();
                return eVar2.x();
            }
            if (eVar.f183349b == jT1 + 1) {
                return null;
            }
            eVar2.write(eVar, jT1);
            eVar.readByte();
            eVar2.write(eVar, 1L);
        }
    }

    private static final String readToken(w63.e eVar) {
        long jT1 = eVar.t1(TOKEN_DELIMITERS);
        if (jT1 == -1) {
            jT1 = eVar.f183349b;
        }
        if (jT1 != 0) {
            return eVar.w(jT1, c.f57666b);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    private static final boolean skipCommasAndWhitespace(w63.e eVar) throws EOFException {
        boolean z14 = false;
        while (!eVar.F1()) {
            byte bJ = eVar.j(0L);
            if (bJ == 44) {
                eVar.readByte();
                z14 = true;
            } else {
                if (bJ != 32 && bJ != 9) {
                    break;
                }
                eVar.readByte();
            }
        }
        return z14;
    }

    private static final boolean startsWith(w63.e eVar, byte b14) {
        return !eVar.F1() && eVar.j(0L) == b14;
    }
}
