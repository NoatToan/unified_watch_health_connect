package com.xiaomi.accountsdk.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.accountsdk.account.XMPassportSettings;
import com.xiaomi.accountsdk.request.intercept.CTANetworkBaseControl;
import com.xiaomi.accountsdk.request.intercept.NetworkInterceptor;
import com.xiaomi.accountsdk.utils.AccountLogger;
import com.xiaomi.accountsdk.utils.EasyMap;
import com.xiaomi.accountsdk.utils.IOUtils;
import com.xiaomi.accountsdk.utils.ObjectUtils;
import com.xiaomi.accountsdk.utils.ServerTimeUtil;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.passport.utils.HttpCookies;
import com.xiaomi.passport.utils.HttpHeaders;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.ikp;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"NewApi"})
public final class SimpleRequest {
    private static final boolean DEBUG = false;
    public static final String HEADER_KEY_USER_AGENT = "User-Agent";
    public static final String LOCATION = "Location";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";
    private static final String TAG = "SimpleRequest";
    private static final int TIMEOUT = 30000;
    public static final String UTF8 = "utf-8";
    private static ConnectivityListener sConnectivityListener;
    private static CTANetworkBaseControl sCtaNetworkBaseControl = new CTANetworkBaseControl() { // from class: com.xiaomi.accountsdk.request.SimpleRequest.1
        @Override // com.xiaomi.accountsdk.request.intercept.CTANetworkBaseControl
        public boolean isCTANetworkEnable() {
            return true;
        }
    };
    private static HttpURLConnectionFactory sHttpURLConnectionFactory = new HttpURLConnectionFactory() { // from class: com.xiaomi.accountsdk.request.SimpleRequest.2
        @Override // com.xiaomi.accountsdk.request.SimpleRequest.HttpURLConnectionFactory
        public HttpURLConnection makeConn(URL url) throws IOException {
            if (SimpleRequest.sConnectivityListener != null) {
                SimpleRequest.sConnectivityListener.onOpenUrlConnection(url);
            }
            return (HttpURLConnection) url.openConnection();
        }
    };

    public static class HeaderContent {
        private int httpCode = -1;
        private final Set<String> cookieKeys = new HashSet();
        private final Map<String, String> headers = new HashMap();

        public Set<String> getCookieKeys() {
            return this.cookieKeys;
        }

        public String getHeader(String str) {
            return this.headers.get(str);
        }

        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public int getHttpCode() {
            return this.httpCode;
        }

        public void putCookies(Map<String, String> map) {
            putHeaders(map);
            if (map != null) {
                this.cookieKeys.addAll(map.keySet());
            }
        }

        public void putHeader(String str, String str2) {
            this.headers.put(str, str2);
        }

        public void putHeaders(Map<String, String> map) {
            this.headers.putAll(map);
        }

        public void setHttpCode(int i) {
            this.httpCode = i;
        }

        public String toString() {
            return "HeaderContent{headers=" + this.headers + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public interface HttpURLConnectionFactory {
        HttpURLConnection makeConn(URL url) throws IOException;
    }

    public static class MapContent extends HeaderContent {
        private Map<String, Object> bodies;

        public MapContent(Map<String, Object> map) {
            this.bodies = map;
        }

        public Map<String, Object> getBodies() {
            return this.bodies;
        }

        public Object getFromBody(String str) {
            return this.bodies.get(str);
        }

        @Override // com.xiaomi.accountsdk.request.SimpleRequest.HeaderContent
        public String toString() {
            return "MapContent{bodies=" + this.bodies + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class StreamContent extends HeaderContent {
        private InputStream stream;

        public StreamContent(InputStream inputStream) {
            this.stream = inputStream;
        }

        public void closeStream() {
            IOUtils.closeQuietly(this.stream);
        }

        public InputStream getStream() {
            return this.stream;
        }
    }

    public static class StringContent extends HeaderContent {
        private String body;

        public StringContent(String str) {
            this.body = str;
        }

        public String getBody() {
            return this.body;
        }

        public void setBody(String str) {
            this.body = str;
        }

        @Override // com.xiaomi.accountsdk.request.SimpleRequest.HeaderContent
        public String toString() {
            return "StringContent{body='" + this.body + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    private static String appendUrl(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("origin is not allowed null");
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return builderBuildUpon.build().toString();
    }

    public static void checkCTANetworkEnable() throws IOException {
        CTANetworkBaseControl cTANetworkBaseControl = sCtaNetworkBaseControl;
        if (cTANetworkBaseControl != null && !cTANetworkBaseControl.isCTANetworkEnable()) {
            throw new IOException("must pass XiaomiAccount CTA!!!!");
        }
    }

    public static MapContent convertStringToMap(StringContent stringContent) {
        JSONObject jSONObject;
        if (stringContent == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(stringContent.getBody());
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        MapContent mapContent = new MapContent(ObjectUtils.jsonToMap(jSONObject));
        mapContent.putHeaders(stringContent.getHeaders());
        return mapContent;
    }

    private static String decode(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Map<String, String> decodeParamsMap(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split(NAME_VALUE_SEPARATOR);
            if (strArrSplit.length == 2) {
                map.put(decode(strArrSplit[0]), decode(strArrSplit[1]));
            }
        }
        return map;
    }

    private static String encode(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String encodeParamsMap(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            String strEncode = encode(entry.getKey());
            String strEncode2 = !TextUtils.isEmpty(entry.getValue()) ? encode(entry.getValue()) : "";
            sb.append(strEncode);
            sb.append(NAME_VALUE_SEPARATOR);
            sb.append(strEncode2);
        }
        return sb.toString();
    }

    public static MapContent getAsMap(String str, Map<String, String> map, Map<String, String> map2, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return getAsMap(str, map, map2, null, z);
    }

    public static StreamContent getAsStream(String str, Map<String, String> map, Map<String, String> map2) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return getAsStream(str, map, map2, null);
    }

    public static StringContent getAsString(String str, Map<String, String> map, Map<String, String> map2, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return getAsString(str, map, null, map2, z, null);
    }

    public static HttpURLConnectionFactory getHttpURLConnectionFactoryForTest() {
        return sHttpURLConnectionFactory;
    }

    public static void injectHttpURLConnectionFactoryForTest(HttpURLConnectionFactory httpURLConnectionFactory) {
        sHttpURLConnectionFactory = httpURLConnectionFactory;
    }

    public static String joinMap(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append(NAME_VALUE_SEPARATOR);
            sb.append(value);
        }
        return sb.toString();
    }

    public static HttpURLConnection makeConn(String str, Map<String, String> map, Map<String, String> map2, Integer num) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            url = null;
        }
        if (url == null) {
            AccountLogger.log(TAG, "failed to init url");
            return null;
        }
        if (num == null) {
            num = 30000;
        }
        try {
            CookieHandler.setDefault(null);
            HttpURLConnection httpURLConnectionMakeConn = sHttpURLConnectionFactory.makeConn(url);
            httpURLConnectionMakeConn.setInstanceFollowRedirects(false);
            httpURLConnectionMakeConn.setConnectTimeout(num.intValue());
            httpURLConnectionMakeConn.setReadTimeout(num.intValue());
            httpURLConnectionMakeConn.setUseCaches(false);
            httpURLConnectionMakeConn.setRequestProperty("Content-Type", HttpHeaders.getContentType(map2, "application/x-www-form-urlencoded"));
            if (map2 == null || TextUtils.isEmpty(map2.get("User-Agent"))) {
                if (!TextUtils.isEmpty(XMPassportSettings.getUserAgent())) {
                    httpURLConnectionMakeConn.setRequestProperty("User-Agent", XMPassportSettings.getUserAgent());
                }
            }
            if (map == null) {
                map = new EasyMap<>();
            }
            httpURLConnectionMakeConn.setRequestProperty(NetConstants.COOKIE, joinMap(map, "; "));
            if (map2 != null) {
                for (String str2 : map2.keySet()) {
                    httpURLConnectionMakeConn.setRequestProperty(str2, map2.get(str2));
                }
            }
            return httpURLConnectionMakeConn;
        } catch (Exception e2) {
            AccountLogger.log(TAG, e2);
            return null;
        }
    }

    public static Map<String, String> parseCookies(List<HttpCookie> list) {
        HashMap map = new HashMap();
        for (HttpCookie httpCookie : list) {
            if (!httpCookie.hasExpired()) {
                String name = httpCookie.getName();
                String value = httpCookie.getValue();
                if (name != null) {
                    map.put(name, value);
                }
            }
        }
        return map;
    }

    public static MapContent postAsMap(String str, Map<String, String> map, Map<String, String> map2, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return postAsMap(str, map, map2, null, z);
    }

    public static StringContent postAsString(String str, Map<String, String> map, Map<String, String> map2, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return postAsString(str, map, map2, null, null, z, null);
    }

    public static void setConnectivityListener(ConnectivityListener connectivityListener) {
        sConnectivityListener = connectivityListener;
    }

    public static void setCtaNetworkBaseControl(CTANetworkBaseControl cTANetworkBaseControl) {
        sCtaNetworkBaseControl = cTANetworkBaseControl;
    }

    public static MapContent getAsMap(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return convertStringToMap(getAsString(str, map, map3, map2, z));
    }

    public static StreamContent getAsStream(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws AccessDeniedException, IOException, AuthenticationFailureException {
        Integer num;
        Integer num2;
        checkCTANetworkEnable();
        String strAppendUrl = appendUrl(str, map);
        String strA = ikp.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        NetworkInterceptor.get().onBegin(strA, "GET", str);
        AccountLogger.HttpRequestLog httpRequestLogRequest = new AccountLogger.HttpRequestLog(strAppendUrl, "GET").request(map3, map2);
        try {
            try {
                HttpURLConnection httpURLConnectionMakeConn = makeConn(strAppendUrl, map2, map3, null);
                if (httpURLConnectionMakeConn == null) {
                    throw new IOException("failed to create connection");
                }
                httpURLConnectionMakeConn.setDoInput(true);
                httpURLConnectionMakeConn.setRequestMethod("GET");
                httpURLConnectionMakeConn.setInstanceFollowRedirects(true);
                httpURLConnectionMakeConn.connect();
                int responseCode = httpURLConnectionMakeConn.getResponseCode();
                Integer numValueOf = Integer.valueOf(responseCode);
                try {
                    if (responseCode == 200) {
                        Map<String, List<String>> headerFields = httpURLConnectionMakeConn.getHeaderFields();
                        CookieManager cookieManager = new CookieManager();
                        URI uriCreate = URI.create(strAppendUrl);
                        cookieManager.put(uriCreate, headerFields);
                        List<HttpCookie> list = cookieManager.getCookieStore().get(uriCreate);
                        Map<String, String> cookies = parseCookies(list);
                        cookies.putAll(ObjectUtils.listToMap(headerFields));
                        StreamContent streamContent = new StreamContent(httpURLConnectionMakeConn.getInputStream());
                        streamContent.putHeaders(cookies);
                        NetworkInterceptor.get().onSuccess(strA, "GET", str, jCurrentTimeMillis, responseCode, 0);
                        HttpCookies.set(list);
                        httpRequestLogRequest.result(responseCode, headerFields, list);
                        AccountLogger.log(httpRequestLogRequest);
                        return streamContent;
                    }
                    if (responseCode == 403) {
                        throw new AccessDeniedException(responseCode, "access denied, encrypt error or user is forbidden to access the resource");
                    }
                    if (responseCode == 401 || responseCode == 400) {
                        AuthenticationFailureException authenticationFailureException = new AuthenticationFailureException(responseCode, "authentication failure for get, code: " + responseCode);
                        authenticationFailureException.setWwwAuthenticateHeader(httpURLConnectionMakeConn.getHeaderField("WWW-Authenticate"));
                        authenticationFailureException.setCaDisableSecondsHeader(httpURLConnectionMakeConn.getHeaderField("CA-DISABLE-SECONDS"));
                        throw authenticationFailureException;
                    }
                    if (responseCode != 301) {
                        throw new IOException("http status error when GET: " + responseCode);
                    }
                    throw new IOException("http status error when GET: " + responseCode + "\nunexpected redirect from " + httpURLConnectionMakeConn.getURL().getHost() + " to " + httpURLConnectionMakeConn.getHeaderField(LOCATION));
                } catch (ProtocolException e) {
                    e = e;
                    num2 = numValueOf;
                    NetworkInterceptor.get().onException(strA, "GET", str, jCurrentTimeMillis, e, num2);
                    httpRequestLogRequest.result(e);
                    throw new IOException("protocol error");
                } catch (Exception e2) {
                    e = e2;
                    num = numValueOf;
                    NetworkInterceptor.get().onException(strA, "GET", str, jCurrentTimeMillis, e, num);
                    httpRequestLogRequest.result(e);
                    throw e;
                }
            } catch (Throwable th) {
                AccountLogger.log(httpRequestLogRequest);
                throw th;
            }
        } catch (ProtocolException e3) {
            e = e3;
            num2 = null;
        } catch (Exception e4) {
            e = e4;
            num = null;
        }
    }

    public static StringContent getAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return getAsString(str, map, map2, map3, z, null);
    }

    public static MapContent postAsMap(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return convertStringToMap(postAsString(str, map, map2, map3, (Map<String, String>) null, z));
    }

    public static StringContent postAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z, Integer num) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return postAsString(str, map, map2, map3, null, z, num);
    }

    public static StringContent getAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z, Integer num) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return getAsString(str, map, map2, map3, z, num, null);
    }

    public static StringContent postAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return postAsString(str, map, map2, map3, map4, z, null);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01b2  */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x005f: MOVE (r4 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:14:0x005f */
    public static StringContent getAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z, Integer num, RequestWithVersionCodeControl.VersionTagInfo versionTagInfo) throws Throwable {
        Integer num2;
        HttpURLConnection httpURLConnection;
        checkCTANetworkEnable();
        Map<String, String> mapFillRequestHeadersWithVersionCode = RequestWithVersionCodeControl.fillRequestHeadersWithVersionCode(str, map2, versionTagInfo);
        String strAppendUrl = appendUrl(str, map);
        String strA = ikp.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        NetworkInterceptor.get().onBegin(strA, "GET", str);
        AccountLogger.HttpRequestLog httpRequestLogRequest = new AccountLogger.HttpRequestLog(strAppendUrl, "GET").request(mapFillRequestHeadersWithVersionCode, map3);
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                HttpURLConnection httpURLConnectionMakeConn = makeConn(strAppendUrl, map3, mapFillRequestHeadersWithVersionCode, num);
                try {
                    if (httpURLConnectionMakeConn != null) {
                        httpURLConnectionMakeConn.setDoInput(true);
                        httpURLConnectionMakeConn.setRequestMethod("GET");
                        httpURLConnectionMakeConn.connect();
                        int responseCode = httpURLConnectionMakeConn.getResponseCode();
                        Integer numValueOf = Integer.valueOf(responseCode);
                        try {
                            if (ServerTimeUtil.getComputer() != null) {
                                try {
                                    String headerField = httpURLConnectionMakeConn.getHeaderField(HTTP.DATE_HEADER);
                                    if (headerField != null) {
                                        ServerTimeUtil.getComputer().alignWithServerDateHeader(str, headerField);
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    num2 = numValueOf;
                                }
                            }
                            if (responseCode != 200 && responseCode != 302) {
                                if (responseCode == 403) {
                                    throw new AccessDeniedException(responseCode, "access denied, encrypt error or user is forbidden to access the resource");
                                }
                                if (responseCode == 401 || responseCode == 400) {
                                    AuthenticationFailureException authenticationFailureException = new AuthenticationFailureException(responseCode, "authentication failure for get, code: " + responseCode);
                                    authenticationFailureException.setWwwAuthenticateHeader(httpURLConnectionMakeConn.getHeaderField("WWW-Authenticate"));
                                    authenticationFailureException.setCaDisableSecondsHeader(httpURLConnectionMakeConn.getHeaderField("CA-DISABLE-SECONDS"));
                                    throw authenticationFailureException;
                                }
                                if (responseCode == 301) {
                                    throw new IOException("http status error when GET: " + responseCode + "\nunexpected redirect from " + httpURLConnectionMakeConn.getURL().getHost() + " to " + httpURLConnectionMakeConn.getHeaderField(LOCATION));
                                }
                                throw new IOException("http status error when GET: " + responseCode);
                            }
                            Map<String, List<String>> headerFields = httpURLConnectionMakeConn.getHeaderFields();
                            CookieManager cookieManager = new CookieManager();
                            URI uriCreate = URI.create(strAppendUrl);
                            cookieManager.put(uriCreate, headerFields);
                            List<HttpCookie> list = cookieManager.getCookieStore().get(uriCreate);
                            Map<String, String> cookies = parseCookies(list);
                            StringBuilder sb = new StringBuilder();
                            if (z) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionMakeConn.getInputStream()), 1024);
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line);
                                    } catch (Throwable th) {
                                        IOUtils.closeQuietly(bufferedReader);
                                        throw th;
                                    }
                                }
                                IOUtils.closeQuietly(bufferedReader);
                            }
                            String string = sb.toString();
                            StringContent stringContent = new StringContent(string);
                            stringContent.putCookies(cookies);
                            stringContent.putHeaders(ObjectUtils.listToMap(headerFields));
                            stringContent.setHttpCode(responseCode);
                            RequestWithVersionCodeControl.fillOrCacheRequestResult(str, stringContent, versionTagInfo);
                            try {
                                NetworkInterceptor.get().onSuccess(strA, "GET", str, jCurrentTimeMillis, responseCode, string.length());
                                HttpCookies.set(list);
                                httpRequestLogRequest.result(responseCode, string, headerFields, list);
                                httpURLConnectionMakeConn.disconnect();
                                AccountLogger.log(httpRequestLogRequest);
                                return stringContent;
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        num2 = numValueOf;
                        NetworkInterceptor.get().onException(strA, "GET", str, jCurrentTimeMillis, e, num2);
                        httpRequestLogRequest.result(e);
                        throw e;
                    }
                    throw new IOException("failed to create connection");
                } catch (Exception e4) {
                    e = e4;
                    num2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                AccountLogger.log(httpRequestLogRequest);
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            num2 = null;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            AccountLogger.log(httpRequestLogRequest);
            throw th;
        }
    }

    public static StringContent postAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z, Integer num) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return postAsString(str, map, map2, map3, map4, z, num, (RequestWithVersionCodeControl.VersionTagInfo) null);
    }

    public static StringContent postAsString(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, boolean z, Integer num, RequestWithVersionCodeControl.VersionTagInfo versionTagInfo) throws AccessDeniedException, IOException, AuthenticationFailureException {
        return postAsString(str, encodeParamsMap(map), map2, map3, map4, z, num, versionTagInfo);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0299  */
    /* JADX WARN: Code duplicated, block: B:144:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6 A[EDGE_INSN: B:154:0x01d6->B:83:0x01d6 BREAK  A[LOOP:1: B:137:0x01ca->B:155:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b0 A[Catch: all -> 0x0193, Exception -> 0x0198, ProtocolException -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x0193, blocks: (B:60:0x0164, B:61:0x0177, B:63:0x017d, B:71:0x01aa, B:73:0x01b0, B:74:0x01b3, B:76:0x01ba, B:83:0x01d6, B:84:0x01da, B:85:0x01dd, B:86:0x01de, B:88:0x020c), top: B:136:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba A[Catch: all -> 0x0193, Exception -> 0x0198, ProtocolException -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x0193, blocks: (B:60:0x0164, B:61:0x0177, B:63:0x017d, B:71:0x01aa, B:73:0x01b0, B:74:0x01b3, B:76:0x01ba, B:83:0x01d6, B:84:0x01da, B:85:0x01dd, B:86:0x01de, B:88:0x020c), top: B:136:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d0 A[Catch: all -> 0x01d4, TRY_LEAVE, TryCatch #13 {all -> 0x01d4, blocks: (B:77:0x01ca, B:79:0x01d0), top: B:137:0x01ca }] */
    public static StringContent postAsString(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, boolean z, Integer num, RequestWithVersionCodeControl.VersionTagInfo versionTagInfo) throws Throwable {
        AccountLogger.HttpRequestLog httpRequestLog;
        HttpURLConnection httpURLConnection;
        long j;
        AccountLogger.HttpRequestLog httpRequestLog2;
        Integer num2;
        Integer num3;
        Integer num4;
        int responseCode;
        ArrayList arrayList;
        String host;
        final HashSet hashSet;
        HashMap map4;
        CookieStore cookieStore;
        Iterator it;
        Map<String, String> cookies;
        StringBuilder sb;
        BufferedReader bufferedReader;
        String line;
        checkCTANetworkEnable();
        Map<String, String> mapFillRequestHeadersWithVersionCode = RequestWithVersionCodeControl.fillRequestHeadersWithVersionCode(str, map2, versionTagInfo);
        String strAppendUrl = map3 != null ? appendUrl(str, map3) : str;
        String strA = ikp.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        NetworkInterceptor.get().onBegin(strA, "POST", str);
        AccountLogger.HttpRequestLog httpRequestLogRequest = new AccountLogger.HttpRequestLog(strAppendUrl, "POST").request(mapFillRequestHeadersWithVersionCode, map);
        try {
            try {
                HttpURLConnection httpURLConnectionMakeConn = makeConn(strAppendUrl, map, mapFillRequestHeadersWithVersionCode, num);
                if (httpURLConnectionMakeConn != null) {
                    try {
                        try {
                            httpURLConnectionMakeConn.setDoInput(true);
                            httpURLConnectionMakeConn.setDoOutput(true);
                            httpURLConnectionMakeConn.setRequestMethod("POST");
                            httpURLConnectionMakeConn.connect();
                            if (!TextUtils.isEmpty(str2)) {
                                try {
                                    httpRequestLogRequest.request(str2);
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnectionMakeConn.getOutputStream());
                                    try {
                                        bufferedOutputStream.write(str2.getBytes("utf-8"));
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                        responseCode = httpURLConnectionMakeConn.getResponseCode();
                                        Integer numValueOf = Integer.valueOf(responseCode);
                                        try {
                                            if (responseCode == 200 && responseCode != 302) {
                                                if (responseCode == 403) {
                                                    throw new AccessDeniedException(responseCode, "access denied, encrypt error or user is forbidden to access the resource");
                                                }
                                                if (responseCode == 401 || responseCode == 400) {
                                                    AuthenticationFailureException authenticationFailureException = new AuthenticationFailureException(responseCode, "authentication failure for post, code: " + responseCode);
                                                    authenticationFailureException.setWwwAuthenticateHeader(httpURLConnectionMakeConn.getHeaderField("WWW-Authenticate"));
                                                    authenticationFailureException.setCaDisableSecondsHeader(httpURLConnectionMakeConn.getHeaderField("CA-DISABLE-SECONDS"));
                                                    throw authenticationFailureException;
                                                }
                                                if (responseCode == 301) {
                                                    throw new IOException("http status error when POST: " + responseCode + "\nunexpected redirect from " + httpURLConnectionMakeConn.getURL().getHost() + " to " + httpURLConnectionMakeConn.getHeaderField(LOCATION));
                                                }
                                                throw new IOException("http status error when POST: " + responseCode);
                                            }
                                            Map<String, List<String>> headerFields = httpURLConnectionMakeConn.getHeaderFields();
                                            arrayList = new ArrayList();
                                            URI uriCreate = URI.create(strAppendUrl);
                                            host = uriCreate.getHost();
                                            hashSet = new HashSet();
                                            hashSet.add(host);
                                            if (mapFillRequestHeadersWithVersionCode != null && mapFillRequestHeadersWithVersionCode.containsKey(b.E)) {
                                                hashSet.add(mapFillRequestHeadersWithVersionCode.get(b.E));
                                            }
                                            try {
                                                try {
                                                    CookieManager cookieManager = new CookieManager(null, new CookiePolicy() { // from class: com.xiaomi.accountsdk.request.SimpleRequest.3
                                                        @Override // java.net.CookiePolicy
                                                        public boolean shouldAccept(URI uri, HttpCookie httpCookie) {
                                                            String domain = httpCookie.getDomain();
                                                            Iterator it2 = hashSet.iterator();
                                                            while (it2.hasNext()) {
                                                                if (HttpCookie.domainMatches(domain, (String) it2.next())) {
                                                                    return true;
                                                                }
                                                            }
                                                            return false;
                                                        }
                                                    });
                                                    cookieManager.put(uriCreate, headerFields);
                                                    map4 = new HashMap();
                                                    cookieStore = cookieManager.getCookieStore();
                                                    it = hashSet.iterator();
                                                    while (it.hasNext()) {
                                                        try {
                                                            arrayList.addAll(cookieStore.get(URI.create(strAppendUrl.replaceFirst(host, (String) it.next()))));
                                                        } catch (ProtocolException e) {
                                                            e = e;
                                                            j = jCurrentTimeMillis;
                                                            num3 = numValueOf;
                                                            httpRequestLog2 = httpRequestLogRequest;
                                                            NetworkInterceptor.get().onException(strA, "POST", str, j, e, num3);
                                                            httpRequestLog2.result(e);
                                                            throw new IOException("protocol error");
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            j = jCurrentTimeMillis;
                                                            num2 = numValueOf;
                                                            httpRequestLog2 = httpRequestLogRequest;
                                                            NetworkInterceptor.get().onException(strA, "POST", str, j, e, num2);
                                                            httpRequestLog2.result(e);
                                                            throw e;
                                                        }
                                                    }
                                                    cookies = parseCookies(arrayList);
                                                    if (cookies != null) {
                                                        map4.putAll(cookies);
                                                    }
                                                    sb = new StringBuilder();
                                                    if (z) {
                                                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionMakeConn.getInputStream()), 1024);
                                                        while (true) {
                                                            try {
                                                                line = bufferedReader.readLine();
                                                                if (line != null) {
                                                                    break;
                                                                }
                                                                sb.append(line);
                                                            } catch (Throwable th) {
                                                                IOUtils.closeQuietly(bufferedReader);
                                                                throw th;
                                                            }
                                                        }
                                                        IOUtils.closeQuietly(bufferedReader);
                                                    }
                                                    String string = sb.toString();
                                                    StringContent stringContent = new StringContent(string);
                                                    stringContent.putCookies(map4);
                                                    stringContent.setHttpCode(responseCode);
                                                    stringContent.putHeaders(ObjectUtils.listToMap(headerFields));
                                                    RequestWithVersionCodeControl.fillOrCacheRequestResult(strAppendUrl, stringContent, versionTagInfo);
                                                    j = jCurrentTimeMillis;
                                                    try {
                                                        NetworkInterceptor.get().onSuccess(strA, "POST", str, jCurrentTimeMillis, responseCode, string.length());
                                                        HttpCookies.set(arrayList);
                                                        httpRequestLog2 = httpRequestLogRequest;
                                                        try {
                                                            httpRequestLog2.result(responseCode, string, headerFields, arrayList);
                                                            httpURLConnectionMakeConn.disconnect();
                                                            AccountLogger.log(httpRequestLog2);
                                                            return stringContent;
                                                        } catch (ProtocolException e3) {
                                                            e = e3;
                                                            num3 = numValueOf;
                                                            NetworkInterceptor.get().onException(strA, "POST", str, j, e, num3);
                                                            httpRequestLog2.result(e);
                                                            throw new IOException("protocol error");
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            num2 = numValueOf;
                                                            NetworkInterceptor.get().onException(strA, "POST", str, j, e, num2);
                                                            httpRequestLog2.result(e);
                                                            throw e;
                                                        }
                                                    } catch (ProtocolException e5) {
                                                        e = e5;
                                                        httpRequestLog2 = httpRequestLogRequest;
                                                        num3 = numValueOf;
                                                        NetworkInterceptor.get().onException(strA, "POST", str, j, e, num3);
                                                        httpRequestLog2.result(e);
                                                        throw new IOException("protocol error");
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        httpRequestLog2 = httpRequestLogRequest;
                                                        num2 = numValueOf;
                                                        NetworkInterceptor.get().onException(strA, "POST", str, j, e, num2);
                                                        httpRequestLog2.result(e);
                                                        throw e;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    httpRequestLog = httpRequestLogRequest;
                                                    httpURLConnection = httpURLConnectionMakeConn;
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                    AccountLogger.log(httpRequestLog);
                                                    throw th;
                                                }
                                            } catch (ProtocolException e7) {
                                                e = e7;
                                                j = jCurrentTimeMillis;
                                            } catch (Exception e8) {
                                                e = e8;
                                                j = jCurrentTimeMillis;
                                            }
                                        } catch (ProtocolException e9) {
                                            e = e9;
                                            j = jCurrentTimeMillis;
                                            httpRequestLog2 = httpRequestLogRequest;
                                        } catch (Exception e10) {
                                            e = e10;
                                            j = jCurrentTimeMillis;
                                            httpRequestLog2 = httpRequestLogRequest;
                                        }
                                    } catch (Throwable th3) {
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                        throw th3;
                                    }
                                } catch (ProtocolException e11) {
                                    e = e11;
                                    j = jCurrentTimeMillis;
                                    httpRequestLog2 = httpRequestLogRequest;
                                    num3 = null;
                                    NetworkInterceptor.get().onException(strA, "POST", str, j, e, num3);
                                    httpRequestLog2.result(e);
                                    throw new IOException("protocol error");
                                } catch (Exception e12) {
                                    e = e12;
                                    j = jCurrentTimeMillis;
                                    httpRequestLog2 = httpRequestLogRequest;
                                    num2 = null;
                                    NetworkInterceptor.get().onException(strA, "POST", str, j, e, num2);
                                    httpRequestLog2.result(e);
                                    throw e;
                                }
                            } else {
                                responseCode = httpURLConnectionMakeConn.getResponseCode();
                                Integer numValueOf2 = Integer.valueOf(responseCode);
                                if (responseCode == 200) {
                                }
                                Map<String, List<String>> headerFields2 = httpURLConnectionMakeConn.getHeaderFields();
                                arrayList = new ArrayList();
                                URI uriCreate2 = URI.create(strAppendUrl);
                                host = uriCreate2.getHost();
                                hashSet = new HashSet();
                                hashSet.add(host);
                                if (mapFillRequestHeadersWithVersionCode != null) {
                                    hashSet.add(mapFillRequestHeadersWithVersionCode.get(b.E));
                                }
                                CookieManager cookieManager2 = new CookieManager(null, new CookiePolicy() { // from class: com.xiaomi.accountsdk.request.SimpleRequest.3
                                    @Override // java.net.CookiePolicy
                                    public boolean shouldAccept(URI uri, HttpCookie httpCookie) {
                                        String domain = httpCookie.getDomain();
                                        Iterator it2 = hashSet.iterator();
                                        while (it2.hasNext()) {
                                            if (HttpCookie.domainMatches(domain, (String) it2.next())) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }
                                });
                                cookieManager2.put(uriCreate2, headerFields2);
                                map4 = new HashMap();
                                cookieStore = cookieManager2.getCookieStore();
                                it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.addAll(cookieStore.get(URI.create(strAppendUrl.replaceFirst(host, (String) it.next()))));
                                }
                                cookies = parseCookies(arrayList);
                                if (cookies != null) {
                                    map4.putAll(cookies);
                                }
                                sb = new StringBuilder();
                                if (z) {
                                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionMakeConn.getInputStream()), 1024);
                                    while (true) {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            break;
                                            break;
                                        }
                                        sb.append(line);
                                    }
                                    IOUtils.closeQuietly(bufferedReader);
                                }
                                String string2 = sb.toString();
                                StringContent stringContent2 = new StringContent(string2);
                                stringContent2.putCookies(map4);
                                stringContent2.setHttpCode(responseCode);
                                stringContent2.putHeaders(ObjectUtils.listToMap(headerFields2));
                                RequestWithVersionCodeControl.fillOrCacheRequestResult(strAppendUrl, stringContent2, versionTagInfo);
                                j = jCurrentTimeMillis;
                                NetworkInterceptor.get().onSuccess(strA, "POST", str, jCurrentTimeMillis, responseCode, string2.length());
                                HttpCookies.set(arrayList);
                                httpRequestLog2 = httpRequestLogRequest;
                                httpRequestLog2.result(responseCode, string2, headerFields2, arrayList);
                                httpURLConnectionMakeConn.disconnect();
                                AccountLogger.log(httpRequestLog2);
                                return stringContent2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            httpRequestLog = httpRequestLogRequest;
                        }
                    } catch (ProtocolException e13) {
                        e = e13;
                        j = jCurrentTimeMillis;
                        httpRequestLog2 = httpRequestLogRequest;
                        num4 = null;
                        num3 = num4;
                        NetworkInterceptor.get().onException(strA, "POST", str, j, e, num3);
                        httpRequestLog2.result(e);
                        throw new IOException("protocol error");
                    } catch (Exception e14) {
                        e = e14;
                        j = jCurrentTimeMillis;
                        httpRequestLog2 = httpRequestLogRequest;
                        num4 = null;
                        num2 = num4;
                        NetworkInterceptor.get().onException(strA, "POST", str, j, e, num2);
                        httpRequestLog2.result(e);
                        throw e;
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    AccountLogger.log(httpRequestLog);
                    throw th;
                }
                j = jCurrentTimeMillis;
                httpRequestLog2 = httpRequestLogRequest;
                num4 = null;
                try {
                    throw new IOException("failed to create URLConnection");
                } catch (ProtocolException e15) {
                    e = e15;
                    num3 = num4;
                    NetworkInterceptor.get().onException(strA, "POST", str, j, e, num3);
                    httpRequestLog2.result(e);
                    throw new IOException("protocol error");
                } catch (Exception e16) {
                    e = e16;
                    num2 = num4;
                    NetworkInterceptor.get().onException(strA, "POST", str, j, e, num2);
                    httpRequestLog2.result(e);
                    throw e;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (ProtocolException e17) {
            e = e17;
            j = jCurrentTimeMillis;
            httpRequestLog2 = httpRequestLogRequest;
            num3 = null;
        } catch (Exception e18) {
            e = e18;
            j = jCurrentTimeMillis;
            httpRequestLog2 = httpRequestLogRequest;
            num2 = null;
        } catch (Throwable th6) {
            th = th6;
            httpRequestLog = httpRequestLogRequest;
            httpURLConnection = null;
        }
    }
}
