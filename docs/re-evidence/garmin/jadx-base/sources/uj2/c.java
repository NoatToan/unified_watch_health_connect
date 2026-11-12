package uj2;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.URLUtil;
import ch.qos.logback.classic.spi.CallerData;
import com.garmin.connectiq.common.devices.DeviceException;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.protobuf.ByteString;
import com.mapbox.common.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import u62.z;
import vt2.l;
import vt2.m;
import vt2.n;
import vt2.p;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f171584g = LoggerFactory.getLogger("CIQReq#HttpProtoRequestHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f171585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GDIConnectIQHTTPProto.ConnectIQHTTPService f171586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sj2.a f171588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uj2.d f171589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f171590f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f171592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f171593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f171594d;

        static {
            int[] iArr = new int[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.values().length];
            f171594d = iArr;
            try {
                iArr[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f171594d[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f171594d[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f171594d[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f171594d[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.GET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.values().length];
            f171593c = iArr2;
            try {
                iArr2[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.XML.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f171593c[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.PLAIN_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f171593c[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.URL_ENCODED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f171593c[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.JSON.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.values().length];
            f171592b = iArr3;
            try {
                iArr3[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f171592b[GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[d.values().length];
            f171591a = iArr4;
            try {
                iArr4[d.JSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f171591a[d.URL_ENCODED.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum d {
        /* JADX INFO: Fake field, exist only in values array */
        PLAIN_TEXT(2, "text/plain", GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.PLAIN_TEXT),
        URL_ENCODED(0, "application/x-www-form-urlencoded", GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.URL_ENCODED),
        JSON(1, "application/json", GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.JSON),
        UNDEFINED(-1, "", null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f171600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f171601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType f171602c;

        d(int i14, String str, GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType responseType) {
            this.f171600a = i14;
            this.f171601b = str;
            this.f171602c = responseType;
        }

        public static d a(String str, d dVar) {
            if (str != null) {
                for (d dVar2 : values()) {
                    if (str.contains(dVar2.f171601b)) {
                        return dVar2;
                    }
                }
            }
            return dVar;
        }
    }

    public static class h extends AbstractC3191c {
        public h(String str, Exception exc, int i14) {
            super(str, exc);
            this.f171595a = i14;
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE;
        }
    }

    public static class i extends AbstractC3191c {
        public i(String str) {
            super(str);
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.UNKNOWN;
        }
    }

    public static class j extends AbstractC3191c {
        public j(String str, int i14) {
            super(str);
            this.f171595a = i14;
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.NETWORK_RESPONSE_TOO_LARGE;
        }
    }

    public static class k extends AbstractC3191c {
        public k(Throwable th3) {
            super(th3);
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.NETWORK_REQUEST_TIMED_OUT;
        }
    }

    public c(Context context, long j8, String str, GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService, sj2.a aVar, uj2.d dVar) {
        this.f171585a = context.getApplicationContext();
        this.f171586b = connectIQHTTPService;
        this.f171587c = str;
        this.f171590f = j8;
        this.f171589e = dVar;
        this.f171588d = aVar;
    }

    public static String a(HashMap map, boolean z14) throws UnsupportedEncodingException {
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            if (z14) {
                strEncode = strEncode.replace(Marker.ANY_NON_NULL_MARKER, "%20");
                strEncode2 = strEncode2.replace(Marker.ANY_NON_NULL_MARKER, "%20");
            }
            if (sb3.length() != 0) {
                sb3.append("&");
            }
            am.j.y(sb3, strEncode, "=", strEncode2);
        }
        return sb3.toString();
    }

    public static String b(HashMap map) {
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb3.length() > 0) {
                sb3.append("&");
            }
            sb3.append((String) entry.getKey());
            sb3.append("=");
            sb3.append((String) entry.getValue());
        }
        return sb3.toString();
    }

    public static GDIConnectIQHTTPProto.ConnectIQHTTPResponse.Builder c(int i14, n nVar, int i15, boolean z14, vt2.i iVar) throws f, h, j {
        ByteString byteStringCopyFrom;
        GDIConnectIQHTTPProto.ConnectIQHTTPResponse.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQHTTPResponse.newBuilder();
        builderNewBuilder.setStatus(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.OK);
        builderNewBuilder.setHttpStatusCode(i14);
        builderNewBuilder.setInflatedSize(0);
        if (nVar != null) {
            int iC = nVar.c();
            if (i15 > 0 && iC > i15) {
                throw new j(androidx.core.view.j.f(iC, " bytes returned."), i14);
            }
            try {
                if (z14) {
                    aj2.a aVar = new aj2.a();
                    ArrayList<Byte> arrayList = new ArrayList<>();
                    ArrayList<Byte> arrayList2 = new ArrayList<>();
                    byte[] bArrB = p.b(nVar);
                    for (byte b14 : bArrB) {
                        arrayList.add(Byte.valueOf(b14));
                    }
                    aVar.a(arrayList, arrayList2, 9);
                    if (arrayList2.size() < arrayList.size()) {
                        byte[] bArr = new byte[arrayList2.size()];
                        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                            bArr[i16] = arrayList2.get(i16).byteValue();
                        }
                        byteStringCopyFrom = ByteString.copyFrom(bArr);
                        builderNewBuilder.setInflatedSize(bArrB.length);
                    } else {
                        byteStringCopyFrom = ByteString.copyFrom(bArrB);
                        builderNewBuilder.setInflatedSize(0);
                    }
                    builderNewBuilder.setHttpBody(byteStringCopyFrom);
                } else {
                    builderNewBuilder.setHttpBody(ByteString.copyFrom(p.b(nVar)));
                    builderNewBuilder.setInflatedSize(0);
                }
            } catch (Exception e4) {
                throw new f("Unable to serialize response body???", e4, i14);
            }
        }
        if (iVar == null) {
            return builderNewBuilder;
        }
        try {
            builderNewBuilder.setHttpHeaderFields(ByteString.copyFrom(p.b(iVar)));
            return builderNewBuilder;
        } catch (Exception e14) {
            throw new h("Unable to serialize response headers???", e14, i14);
        }
    }

    public static vt2.b d(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < jsonArray.size(); i14++) {
            JsonElement jsonElement = jsonArray.get(i14);
            if (jsonElement.isJsonNull()) {
                arrayList.add(new l((byte[]) null));
            } else if (jsonElement.isJsonArray()) {
                arrayList.add(d(jsonElement.getAsJsonArray()));
            } else if (jsonElement.isJsonObject()) {
                arrayList.add(e(jsonElement.getAsJsonObject()));
            } else {
                arrayList.add(n.b(l(jsonElement.getAsJsonPrimitive()), true));
            }
        }
        return new vt2.b(arrayList);
    }

    public static vt2.i e(JsonObject jsonObject) {
        HashMap map = new HashMap();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value.isJsonNull()) {
                map.put(key, new l((byte[]) null));
            } else if (value.isJsonArray()) {
                map.put(key, d(value.getAsJsonArray()));
            } else if (value.isJsonObject()) {
                map.put(key, e(value.getAsJsonObject()));
            } else {
                map.put(key, n.b(l(value.getAsJsonPrimitive()), true));
            }
        }
        return new vt2.i(map);
    }

    public static String f(byte[] bArr) {
        JSONObject jSONObjectH;
        vt2.a aVarA = p.a(bArr);
        if (aVarA.size() == 0) {
            return new JSONObject("{}").toString();
        }
        if (aVarA.size() != 1) {
            return null;
        }
        n<?> nVar = aVarA.get(0);
        byte b14 = nVar.f180206a;
        if (b14 == 5) {
            JSONArray jSONArrayG = g((vt2.b) nVar);
            if (jSONArrayG == null) {
                return null;
            }
            return jSONArrayG.toString();
        }
        if (b14 != 11 || (jSONObjectH = h((vt2.i) nVar)) == null) {
            return null;
        }
        return jSONObjectH.toString();
    }

    public static JSONArray g(vt2.b bVar) {
        JSONObject jSONObjectH;
        JSONArray jSONArray = new JSONArray();
        for (n nVar : bVar.f180193b) {
            byte b14 = nVar.f180206a;
            if (b14 == 3) {
                jSONArray.put(((m) nVar).f180205c);
            } else if (b14 == 9) {
                jSONArray.put(Boolean.valueOf(((vt2.c) nVar).f180195b));
            } else if (b14 == 1) {
                jSONArray.put(Integer.valueOf(((vt2.j) nVar).f180202b));
            } else if (b14 == 14) {
                jSONArray.put(Long.valueOf(((vt2.k) nVar).f180203b));
            } else if (b14 == 2) {
                jSONArray.put(Float.valueOf(((vt2.h) nVar).f180199b));
            } else if (b14 == 15) {
                jSONArray.put(Double.valueOf(((vt2.g) nVar).f180198b));
            } else if (b14 == 0) {
                jSONArray.put(JSONObject.NULL);
            } else if (b14 == 5) {
                JSONArray jSONArrayG = g((vt2.b) nVar);
                if (jSONArrayG == null) {
                    return null;
                }
                jSONArray.put(jSONArrayG);
            } else {
                if (b14 != 11 || (jSONObjectH = h((vt2.i) nVar)) == null) {
                    return null;
                }
                jSONArray.put(jSONObjectH);
            }
        }
        return jSONArray;
    }

    public static JSONObject h(vt2.i iVar) {
        JSONObject jSONObjectH;
        JSONObject jSONObject = new JSONObject();
        HashMap<n<?>, n<?>> map = iVar.f180200b;
        for (n<?> nVar : map.keySet()) {
            if (nVar.f180206a != 3) {
                return null;
            }
            m mVar = (m) nVar;
            n<?> nVar2 = map.get(nVar);
            if (nVar2 == null) {
                return null;
            }
            try {
                byte b14 = nVar2.f180206a;
                if (b14 == 3) {
                    jSONObject.put(mVar.f180205c, ((m) nVar2).f180205c);
                } else if (b14 == 9) {
                    jSONObject.put(mVar.f180205c, Boolean.valueOf(((vt2.c) nVar2).f180195b));
                } else if (b14 == 1) {
                    jSONObject.put(mVar.f180205c, Integer.valueOf(((vt2.j) nVar2).f180202b));
                } else if (b14 == 14) {
                    jSONObject.put(mVar.f180205c, Long.valueOf(((vt2.k) nVar2).f180203b));
                } else if (b14 == 2) {
                    jSONObject.put(mVar.f180205c, Float.valueOf(((vt2.h) nVar2).f180199b));
                } else if (b14 == 15) {
                    jSONObject.put(mVar.f180205c, Double.valueOf(((vt2.g) nVar2).f180198b));
                } else if (b14 == 0) {
                    jSONObject.put(mVar.f180205c, JSONObject.NULL);
                } else {
                    if (b14 != 5) {
                        if (b14 == 11 && (jSONObjectH = h((vt2.i) nVar2)) != null) {
                            jSONObject.put(mVar.f180205c, jSONObjectH);
                        }
                        return null;
                    }
                    JSONArray jSONArrayG = g((vt2.b) nVar2);
                    if (jSONArrayG == null) {
                        return null;
                    }
                    jSONObject.put(mVar.f180205c, jSONArrayG);
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static HashMap i(byte[] bArr) throws b {
        HashMap map = new HashMap();
        vt2.a aVarA = p.a(bArr);
        if (aVarA.size() == 1) {
            int i14 = 0;
            if (aVarA.get(0) instanceof vt2.i) {
                for (Map.Entry<n<?>, n<?>> entry : ((vt2.i) aVarA.get(0)).f180200b.entrySet()) {
                    if (!(entry.getKey() instanceof m) || !(entry.getValue() instanceof m)) {
                        throw new b(i14);
                    }
                    map.put(((m) entry.getKey()).f180205c, ((m) entry.getValue()).f180205c);
                }
            }
        }
        return map;
    }

    public static String j(ByteString byteString, d dVar, GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version version) throws e {
        try {
            int i14 = a.f171591a[dVar.ordinal()];
            if (i14 == 1) {
                return f(byteString.toByteArray());
            }
            if (i14 != 2) {
                return null;
            }
            HashMap mapN = n(byteString);
            if (version == GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_2) {
                return a(mapN, false);
            }
            if (version == GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_1) {
                return b(mapN);
            }
            return null;
        } catch (UnsupportedEncodingException | JSONException e4) {
            throw new e(e4);
        }
    }

    public static String k(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && HttpHeaders.CONTENT_TYPE.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public static Object l(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive.isBoolean()) {
            return Boolean.valueOf(jsonPrimitive.getAsBoolean());
        }
        if (!jsonPrimitive.isNumber()) {
            return jsonPrimitive.getAsString();
        }
        String asString = jsonPrimitive.getAsString();
        Number asNumber = jsonPrimitive.getAsNumber();
        try {
            if (asString.contains(".")) {
                return ((double) jsonPrimitive.getAsFloat()) == jsonPrimitive.getAsDouble() ? Float.valueOf(asNumber.floatValue()) : Double.valueOf(asNumber.doubleValue());
            }
            return ((long) jsonPrimitive.getAsInt()) == jsonPrimitive.getAsLong() ? Integer.valueOf(asNumber.intValue()) : Long.valueOf(asNumber.longValue());
        } catch (NumberFormatException unused) {
            return jsonPrimitive.getAsString();
        }
    }

    public static HashMap m(GDIConnectIQHTTPProto.ConnectIQHTTPRequest connectIQHTTPRequest) throws g {
        ByteString httpHeaderFields = connectIQHTTPRequest.getHttpHeaderFields();
        HashMap map = new HashMap();
        if (httpHeaderFields != null && httpHeaderFields.size() > 0) {
            try {
                vt2.a aVarA = p.a(httpHeaderFields.toByteArray());
                if (aVarA == null || aVarA.size() != 1) {
                    throw new g("Unable to deserialize headers");
                }
                n<?> nVar = aVarA.get(0);
                if (nVar.f180206a != 11) {
                    throw new g("Top level object was not a HASH");
                }
                HashMap<n<?>, n<?>> map2 = ((vt2.i) nVar).f180200b;
                for (n<?> nVar2 : map2.keySet()) {
                    if (nVar2.f180206a != 3) {
                        throw new g("Header field key was not of type STRING");
                    }
                    n<?> nVar3 = map2.get(nVar2);
                    if (nVar2.e().toString().equalsIgnoreCase(com.google.common.net.HttpHeaders.CONTENT_TYPE)) {
                        Objects.requireNonNull(nVar3);
                        if (nVar3.f180206a == 1) {
                            int iIntValue = ((Integer) nVar3.e()).intValue();
                            d dVar = d.JSON;
                            if (iIntValue == dVar.f171600a) {
                                map.put(((m) nVar2).f180205c, dVar.f171601b);
                            } else {
                                int iIntValue2 = ((Integer) nVar3.e()).intValue();
                                d dVar2 = d.URL_ENCODED;
                                if (iIntValue2 != dVar2.f171600a) {
                                    throw new g("Content type value not recognized");
                                }
                                map.put(((m) nVar2).f180205c, dVar2.f171601b);
                            }
                        }
                    }
                    Objects.requireNonNull(nVar3);
                    if (nVar3.f180206a != 3) {
                        throw new g("Header field value was not of type STRING");
                    }
                    map.put(((m) nVar2).f180205c, ((m) nVar3).f180205c);
                }
            } catch (UnsupportedEncodingException e4) {
                throw new g("UnsupportedEncodingException", e4);
            }
        }
        return map;
    }

    public static HashMap n(ByteString byteString) throws e {
        HashMap map = new HashMap();
        if (byteString != null && byteString.size() > 0) {
            try {
                vt2.a aVarA = p.a(byteString.toByteArray());
                if (aVarA == null || aVarA.size() != 1) {
                    throw new e("Unable to deserialize headers");
                }
                n<?> nVar = aVarA.get(0);
                if (nVar.f180206a != 11) {
                    throw new e("Top level object was not a HASH");
                }
                HashMap<n<?>, n<?>> map2 = ((vt2.i) nVar).f180200b;
                for (n<?> nVar2 : map2.keySet()) {
                    String string = nVar2.e().toString();
                    n<?> nVar3 = map2.get(nVar2);
                    if (nVar3 != null && nVar3.e() != null) {
                        map.put(string, nVar3.e().toString());
                    }
                }
            } catch (UnsupportedEncodingException e4) {
                throw new e(e4);
            }
        }
        return map;
    }

    public static GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType o(HashMap map) {
        d dVar;
        d dVarA;
        GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType responseType = GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.JSON;
        if (map != null) {
            String strK = k(map);
            if (!TextUtils.isEmpty(strK) && (dVarA = d.a(strK, (dVar = d.UNDEFINED))) != dVar) {
                return dVarA.f171602c;
            }
        }
        return responseType;
    }

    public static String p(GDIConnectIQHTTPProto.ConnectIQHTTPRequest connectIQHTTPRequest) throws e {
        try {
            return a(n(connectIQHTTPRequest.getHttpBody()), true);
        } catch (UnsupportedEncodingException | e e4) {
            throw new e(e4);
        }
    }

    public static boolean r(String str) {
        return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) && URLUtil.isValidUrl(str);
    }

    public static n<?> u(String str) {
        if (!TextUtils.isEmpty(str)) {
            JsonElement string = JsonParser.parseString(str);
            if (string.isJsonObject()) {
                return e(string.getAsJsonObject());
            }
            if (string.isJsonArray()) {
                return d(string.getAsJsonArray());
            }
            if (string.isJsonPrimitive()) {
                String asString = string.getAsString();
                if (!TextUtils.isEmpty(asString)) {
                    return new m(asString);
                }
            }
        }
        return null;
    }

    public static n<?> v(String str) throws UnsupportedEncodingException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=");
            if (iIndexOf == -1) {
                throw new UnsupportedEncodingException(am.j.m("Bad Url response pair: \"", str2, "\""));
            }
            String strDecode = URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8");
            String strDecode2 = URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8");
            if (strDecode2.isEmpty()) {
                map.put(new m(strDecode), new l());
            } else {
                map.put(new m(strDecode), new m(strDecode2));
            }
        }
        return n.b(map, true);
    }

    public final void q(AbstractC3191c abstractC3191c) {
        x(abstractC3191c.a(), abstractC3191c.f171595a);
        f171584g.error(abstractC3191c.a().name() + ": " + abstractC3191c.getMessage());
    }

    public final void s(GDIConnectIQHTTPProto.ConnectIQHTTPRequest connectIQHTTPRequest) {
        String strJ;
        String url = connectIQHTTPRequest.getUrl();
        Logger logger = f171584g;
        logger.debug("Request Url: " + url);
        GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod httpMethod = connectIQHTTPRequest.getHttpMethod();
        ByteString httpBody = connectIQHTTPRequest.getHttpBody();
        int maxResponseLength = connectIQHTTPRequest.getMaxResponseLength();
        boolean compressResponseBody = connectIQHTTPRequest.getCompressResponseBody();
        z.i("Max Response Length: ", maxResponseLength, logger);
        try {
            if (!r(url)) {
                logger.error("Request URL should be valid");
                throw new i("Invalid URL from request");
            }
            HashMap mapM = m(connectIQHTTPRequest);
            d dVar = d.UNDEFINED;
            int i14 = a.f171594d[httpMethod.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                dVar = d.URL_ENCODED;
            } else if (i14 == 4 || i14 == 5) {
                dVar = d.JSON;
            }
            d dVarA = d.a(k(mapM), dVar);
            Iterator it = mapM.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equalsIgnoreCase(HttpHeaders.CONTENT_TYPE)) {
                    it.remove();
                }
            }
            sj2.a aVar = this.f171588d;
            if (httpBody == null || httpBody.size() <= 0) {
                strJ = null;
            } else {
                strJ = j(httpBody, dVarA, GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_1);
                if (url.contains("accounts.spotify.com")) {
                    aVar.getClass();
                    strJ = strJ.replace(URLEncoder.encode("https://localhost"), URLEncoder.encode("gcm://spotify-signin"));
                }
            }
            try {
                wj2.b bVar = new wj2.b(url, httpMethod.name(), mapM, strJ, dVarA.f171601b, aVar.d());
                logger.debug("Starting request: " + System.currentTimeMillis());
                bVar.a();
                logger.debug("Request responded with status code: " + bVar.b());
                logger.debug("Response Body:\n" + bVar.f185802i);
                try {
                    GDIConnectIQHTTPProto.ConnectIQHTTPResponse.Builder builderC = c(bVar.b(), u(bVar.f185802i), connectIQHTTPRequest.hasMaxResponseLength() ? connectIQHTTPRequest.getMaxResponseLength() : 0, compressResponseBody, connectIQHTTPRequest.getIncludeHttpHeaderFieldsInResponse() ? new vt2.i(bVar.f185801h) : null);
                    GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
                    builderNewBuilder.setConnectIqHttpResponse(builderC);
                    this.f171589e.a(nu2.a.a(builderNewBuilder));
                    logger.debug("Responding to http request: " + System.currentTimeMillis());
                } catch (JsonSyntaxException e4) {
                    throw new f(e4, bVar.b());
                }
            } catch (IOException e14) {
                throw new k(e14);
            }
        } catch (e e15) {
            e = e15;
            q(e);
        } catch (f e16) {
            e = e16;
            q(e);
        } catch (g e17) {
            e = e17;
            q(e);
        } catch (h e18) {
            e = e18;
            q(e);
        } catch (i e19) {
            e = e19;
            q(e);
        } catch (j e24) {
            e = e24;
            q(e);
        } catch (k e25) {
            e = e25;
            q(e);
        } catch (Throwable th3) {
            x(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.UNKNOWN, 0);
            logger.error("Throwable caught in makeJsonRequest(): {}", th3.getMessage());
        }
    }

    public final void t(GDIConnectIQHTTPProto.ConnectIQHTTPRequest connectIQHTTPRequest) {
        String str;
        vt2.i iVar;
        n<?> mVar;
        Logger logger = f171584g;
        try {
            GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod hTTPMethod = GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.GET;
            GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod httpMethod = connectIQHTTPRequest.hasHttpMethod() ? connectIQHTTPRequest.getHttpMethod() : hTTPMethod;
            HashMap mapM = m(connectIQHTTPRequest);
            String url = connectIQHTTPRequest.getUrl();
            if (!r(url)) {
                logger.error("Request URL is invalid");
                throw new i("Invalid URL from request");
            }
            d dVarA = d.a(k(mapM), (GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.PUT == httpMethod || GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.POST == httpMethod || GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.PATCH == httpMethod) ? d.URL_ENCODED : null);
            if (httpMethod == hTTPMethod) {
                dVarA = null;
            }
            if ((httpMethod == hTTPMethod || httpMethod == GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.DELETE) && dVarA == null) {
                String strP = p(connectIQHTTPRequest);
                if (!TextUtils.isEmpty(strP)) {
                    url = url + CallerData.NA + strP;
                }
            }
            sj2.a aVar = this.f171588d;
            if (dVarA != null) {
                String strJ = j(connectIQHTTPRequest.getHttpBody(), dVarA, GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_2);
                if (url.contains("accounts.spotify.com")) {
                    aVar.getClass();
                    strJ = strJ.replace(URLEncoder.encode("https://localhost"), URLEncoder.encode("gcm://spotify-signin"));
                }
                str = strJ;
            } else {
                str = null;
            }
            try {
                wj2.b bVar = new wj2.b(url, httpMethod.name(), mapM, str, dVarA == 0 ? null : dVarA.f171601b, aVar.d());
                logger.debug("Starting request: " + System.currentTimeMillis());
                bVar.a();
                if (connectIQHTTPRequest.hasIncludeHttpHeaderFieldsInResponse() && connectIQHTTPRequest.getIncludeHttpHeaderFieldsInResponse()) {
                    HashMap map = new HashMap();
                    HashMap map2 = bVar.f185801h;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                    iVar = new vt2.i(map);
                } else {
                    iVar = null;
                }
                GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType responseTypeO = o(bVar.f185801h);
                if (connectIQHTTPRequest.hasResponseType() && connectIQHTTPRequest.getResponseType() != responseTypeO) {
                    throw new f(new Exception(), bVar.b());
                }
                try {
                    int i14 = a.f171593c[responseTypeO.ordinal()];
                    boolean z14 = true;
                    if (i14 == 1) {
                        x(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE, 2989);
                        logger.error("A response type of XML is not supported.");
                        return;
                    }
                    if (i14 != 2) {
                        String str2 = bVar.f185802i;
                        mVar = i14 != 3 ? u(str2) : v(str2);
                    } else {
                        logger.warn("A response type of plain text is not officially supported.");
                        String str3 = bVar.f185802i;
                        mVar = TextUtils.isEmpty(str3) ? null : new m(str3);
                    }
                    int maxResponseLength = connectIQHTTPRequest.hasMaxResponseLength() ? connectIQHTTPRequest.getMaxResponseLength() : 0;
                    if (!connectIQHTTPRequest.hasCompressResponseBody() || !connectIQHTTPRequest.getCompressResponseBody()) {
                        z14 = false;
                    }
                    GDIConnectIQHTTPProto.ConnectIQHTTPResponse.Builder builderC = c(bVar.b(), mVar, maxResponseLength, z14, iVar);
                    GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
                    builderNewBuilder.setConnectIqHttpResponse(builderC);
                    this.f171589e.a(nu2.a.a(builderNewBuilder));
                    logger.debug("Responding to http request: " + System.currentTimeMillis());
                } catch (JsonSyntaxException e4) {
                    e = e4;
                    throw new f(e, bVar.b());
                } catch (UnsupportedEncodingException e14) {
                    e = e14;
                    throw new f(e, bVar.b());
                }
            } catch (IOException e15) {
                throw new k(e15);
            }
        } catch (e e16) {
            e = e16;
            q(e);
        } catch (f e17) {
            e = e17;
            q(e);
        } catch (g e18) {
            e = e18;
            q(e);
        } catch (h e19) {
            e = e19;
            q(e);
        } catch (i e24) {
            e = e24;
            q(e);
        } catch (j e25) {
            e = e25;
            q(e);
        } catch (k e26) {
            e = e26;
            q(e);
        } catch (Throwable th3) {
            x(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.UNKNOWN, 0);
            logger.error("Throwable caught in makeWebRequest(): {}", th3.getMessage());
        }
    }

    public final void w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus responseStatus, int i14) {
        f171584g.debug("Sending Oauth response: status=" + responseStatus + ", error=" + i14);
        GDIConnectIQHTTPProto.ConnectIQOAuthResponse.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQOAuthResponse.newBuilder();
        builderNewBuilder.setStatus(responseStatus);
        GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder2 = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
        builderNewBuilder2.setConnectIqOauthResponse(builderNewBuilder);
        this.f171589e.a(nu2.a.a(builderNewBuilder2));
    }

    public final void x(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus responseStatus, int i14) {
        GDIConnectIQHTTPProto.ConnectIQHTTPResponse.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQHTTPResponse.newBuilder();
        builderNewBuilder.setStatus(responseStatus);
        builderNewBuilder.setHttpStatusCode(i14);
        GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder2 = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
        builderNewBuilder2.setConnectIqHttpResponse(builderNewBuilder);
        this.f171589e.a(nu2.a.a(builderNewBuilder2));
    }

    public final void y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus responseStatus, int i14) {
        GDIConnectIQHTTPProto.ConnectIQImageResponse.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQImageResponse.newBuilder();
        builderNewBuilder.setStatus(responseStatus);
        builderNewBuilder.setHttpStatusCode(i14);
        GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder2 = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
        builderNewBuilder2.setConnectIqImageResponse(builderNewBuilder);
        this.f171589e.a(nu2.a.a(builderNewBuilder2));
    }

    public final void z() {
        ut2.a.C3225a[] c3225aArr;
        Pair pairB;
        Pair pair;
        GDIConnectIQHTTPProto.ConnectIQHTTPService connectIQHTTPService = this.f171586b;
        final int i14 = 1;
        if (connectIQHTTPService.hasConnectIqHttpRequest()) {
            GDIConnectIQHTTPProto.ConnectIQHTTPRequest connectIqHttpRequest = connectIQHTTPService.getConnectIqHttpRequest();
            GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version version = GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.VERSION_1;
            if (connectIqHttpRequest.hasVersion()) {
                version = connectIqHttpRequest.getVersion();
            }
            if (a.f171592b[version.ordinal()] != 1) {
                s(connectIqHttpRequest);
                return;
            } else {
                t(connectIqHttpRequest);
                return;
            }
        }
        boolean zHasConnectIqImageRequest = connectIQHTTPService.hasConnectIqImageRequest();
        Context context = this.f171585a;
        Logger logger = f171584g;
        final int i15 = 0;
        if (!zHasConnectIqImageRequest) {
            if (!connectIQHTTPService.hasConnectIqOauthRequest()) {
                if (!connectIQHTTPService.hasOpenWebpageNotification()) {
                    x(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.UNKNOWN, 0);
                    logger.error("The protobuf call doesn't contain a request.");
                    return;
                }
                GDIConnectIQHTTPProto.OpenWebpageNotification openWebpageNotification = connectIQHTTPService.getOpenWebpageNotification();
                if (!openWebpageNotification.hasUrl()) {
                    logger.error("Open web page request with no URL");
                    return;
                }
                String url = openWebpageNotification.getUrl();
                if ((!URLUtil.isHttpUrl(url) && !URLUtil.isHttpsUrl(url)) || !URLUtil.isValidUrl(url)) {
                    logger.error("Open web page request with invalid URL");
                    return;
                }
                HashMap map = new HashMap();
                if (openWebpageNotification.hasParams()) {
                    try {
                        map = i(openWebpageNotification.getParams().toByteArray());
                    } catch (Exception e4) {
                        logger.error("Open web page failed to deserialize params", (Throwable) e4);
                        return;
                    }
                }
                new Handler(context.getMainLooper()).post(new uj2.b(this, 1, context, new xj2.a(url, map, openWebpageNotification.hasAppName() ? openWebpageNotification.getAppName() : null, System.currentTimeMillis())));
                return;
            }
            GDIConnectIQHTTPProto.ConnectIQOAuthRequest connectIqOauthRequest = connectIQHTTPService.getConnectIqOauthRequest();
            if (!connectIqOauthRequest.hasInitialUrl() || !connectIqOauthRequest.hasResultUrl()) {
                w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.BAD_REQUEST, 1);
            }
            String initialUrl = connectIqOauthRequest.getInitialUrl();
            String resultUrl = connectIqOauthRequest.getResultUrl();
            HashMap map2 = new HashMap();
            if (connectIqOauthRequest.hasInitialUrlParameters()) {
                try {
                    map2 = i(connectIqOauthRequest.getInitialUrlParameters().toByteArray());
                } catch (b unused) {
                    w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.BAD_REQUEST, 3);
                } catch (Exception unused2) {
                    w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.BAD_REQUEST, 2);
                }
            }
            HashMap map3 = map2;
            int iOrdinal = connectIqOauthRequest.hasResultType() ? connectIqOauthRequest.getResultType().ordinal() : GDIConnectIQHTTPProto.ConnectIQOAuthRequest.ResultFormat.URL.getNumber();
            HashMap map4 = new HashMap();
            if (connectIqOauthRequest.hasResultKeys()) {
                try {
                    vt2.a aVarA = p.a(connectIqOauthRequest.getResultKeys().toByteArray());
                    if (aVarA.size() == 1 && (aVarA.get(0) instanceof vt2.i)) {
                        for (Map.Entry<n<?>, n<?>> entry : ((vt2.i) aVarA.get(0)).f180200b.entrySet()) {
                            if ((entry.getKey() instanceof m) && (entry.getValue() instanceof m)) {
                                map4.put(((m) entry.getKey()).f180205c, ((m) entry.getValue()).f180205c);
                            } else {
                                w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.BAD_REQUEST, 5);
                            }
                        }
                    } else {
                        w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.BAD_REQUEST, 6);
                    }
                } catch (Exception unused3) {
                    w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.BAD_REQUEST, 4);
                }
            }
            String appName = connectIqOauthRequest.hasAppName() ? connectIqOauthRequest.getAppName() : "<app name>";
            byte[] byteArray = {0};
            if (connectIqOauthRequest.hasAppUuid()) {
                byteArray = connectIqOauthRequest.getAppUuid().toByteArray();
            }
            byte[] bArr = byteArray;
            byte[] byteArray2 = {0};
            if (connectIqOauthRequest.hasStoreUuid()) {
                byteArray2 = connectIqOauthRequest.getStoreUuid().toByteArray();
            }
            new Handler(context.getMainLooper()).post(new uj2.b(this, 0, context, new ConnectIQOAuthRequest(this.f171590f, this.f171587c, System.currentTimeMillis(), appName, bArr, byteArray2, initialUrl, map3, resultUrl, iOrdinal, map4)));
            w(GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.OK, 0);
            return;
        }
        GDIConnectIQHTTPProto.ConnectIQImageRequest connectIqImageRequest = connectIQHTTPService.getConnectIqImageRequest();
        sj2.a aVar = this.f171588d;
        if (!connectIqImageRequest.hasUrl()) {
            y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -1);
            logger.error("No URL provided for makeImageRequest().");
            return;
        }
        String url2 = connectIqImageRequest.getUrl();
        if (!r(url2)) {
            y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -1);
            logger.error("Request URL is invalid");
            return;
        }
        if (!connectIqImageRequest.hasPartNumber()) {
            y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -1);
            logger.error("No Device ID provided for makeImageRequest().");
            return;
        }
        int partNumber = connectIqImageRequest.getPartNumber();
        int maxWidth = connectIqImageRequest.hasMaxWidth() ? connectIqImageRequest.getMaxWidth() : -1;
        int maxHeight = connectIqImageRequest.hasMaxHeight() ? connectIqImageRequest.getMaxHeight() : -1;
        ut2.a.b bVar = ut2.a.b.FLOYD_STEINBERG;
        if (connectIqImageRequest.hasDithering() && connectIqImageRequest.getDithering() == GDIConnectIQHTTPProto.ConnectIQImageRequest.Dithering.NONE) {
            bVar = ut2.a.b.NONE;
        }
        ut2.a.b bVar2 = bVar;
        if (connectIqImageRequest.hasPalette()) {
            try {
                vt2.a aVarA2 = p.a(connectIqImageRequest.getPalette().toByteArray());
                if (aVarA2 != null && aVarA2.size() == 1) {
                    n<?> nVar = aVarA2.get(0);
                    if (nVar.f180206a != 5) {
                        GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus responseStatus = GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_REQUEST;
                        x(responseStatus, 0);
                        logger.error(responseStatus.name() + ": Top level object was not an ARRAY");
                        return;
                    }
                    ArrayList arrayList = ((vt2.b) nVar).f180193b;
                    ut2.a.C3225a[] c3225aArr2 = new ut2.a.C3225a[arrayList.size()];
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        if (((n) arrayList.get(i16)).f180206a != 1) {
                            GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus responseStatus2 = GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_REQUEST;
                            x(responseStatus2, 0);
                            logger.error(responseStatus2.name() + ": Top level object was not an ARRAY");
                            return;
                        }
                        c3225aArr2[i16] = new ut2.a.C3225a(((Integer) ((n) arrayList.get(i16)).e()).intValue() | (-16777216));
                    }
                    c3225aArr = c3225aArr2;
                }
                GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus responseStatus3 = GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_REQUEST;
                x(responseStatus3, 0);
                logger.error(responseStatus3.name() + ": Unable to deserialize palette");
                return;
            } catch (UnsupportedEncodingException unused4) {
                GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus responseStatus4 = GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_REQUEST;
                x(responseStatus4, 0);
                logger.error(responseStatus4 + ": UnsupportedEncodingException");
                return;
            }
        }
        c3225aArr = null;
        try {
            OkHttpClient okHttpClientB = aVar.b();
            if (okHttpClientB == null) {
                pairB = null;
            } else {
                zi2.a aVarA3 = aVar.a();
                Logger logger2 = yj2.b.f197581a;
                aVarA3.getClass();
                int i17 = yj2.b.C3704b.f197583a[aVarA3.ordinal()];
                pairB = yj2.a.b(okHttpClientB, i17 != 1 ? (i17 == 2 || i17 == 3) ? "api.gcs.garmin.cn" : "api.gcs.test.garmin.com" : "api.gcs.garmin.com", aVar.g(), url2, maxWidth, maxHeight, c3225aArr, bVar2, partNumber, this.f171590f);
                maxWidth = maxWidth;
                maxHeight = maxHeight;
                c3225aArr = c3225aArr;
                bVar2 = bVar2;
                partNumber = partNumber;
            }
        } catch (IOException e14) {
            logger.error("Problem downloading processed image from GCS in downloadProcessedImage()", (Throwable) e14);
        }
        if (pairB == null) {
            try {
                try {
                    yj2.a aVar2 = new yj2.a(yj2.a.a(url2, aVar.c()));
                    if (maxWidth > 0 && maxHeight > 0) {
                        float fC = aVar2.c(maxWidth, maxHeight);
                        if (fC < 1.0d) {
                            aVar2.e(fC);
                        }
                    }
                    byte[] bArrD = yj2.a.d(context, aVar2, partNumber, c3225aArr, bVar2);
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrD, 8, bArrD.length);
                    aj2.a aVar3 = new aj2.a();
                    ArrayList<Byte> arrayList2 = new ArrayList<>();
                    ArrayList<Byte> arrayList3 = new ArrayList<>();
                    for (byte b14 : bArrCopyOfRange) {
                        arrayList3.add(Byte.valueOf(b14));
                    }
                    aVar3.a(arrayList3, arrayList2, 10);
                    if (arrayList2.size() < arrayList3.size()) {
                        byte[] bArr2 = new byte[arrayList2.size()];
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            bArr2[i18] = arrayList2.get(i18).byteValue();
                        }
                        pair = new Pair(bArr2, Integer.valueOf(bArrCopyOfRange.length));
                    } else {
                        pair = new Pair(bArrCopyOfRange, 0);
                    }
                } catch (DeviceException e15) {
                    new Thread(new Runnable(this) { // from class: uj2.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f171579b;

                        {
                            this.f171579b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19 = i15;
                            c cVar = this.f171579b;
                            switch (i19) {
                                case 0:
                                    Logger logger3 = c.f171584g;
                                    try {
                                        yj2.b.b(cVar.f171585a, cVar.f171588d.a());
                                    } catch (Exception unused5) {
                                        return;
                                    }
                                    break;
                                default:
                                    Logger logger4 = c.f171584g;
                                    try {
                                        yj2.b.b(cVar.f171585a, cVar.f171588d.a());
                                    } catch (Exception unused6) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    }).start();
                    y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -4);
                    logger.error("Problem processing image in makeImageRequest()", (Throwable) e15);
                    pair = null;
                } catch (FileNotFoundException e16) {
                    new Thread(new Runnable(this) { // from class: uj2.a

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f171579b;

                        {
                            this.f171579b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19 = i14;
                            c cVar = this.f171579b;
                            switch (i19) {
                                case 0:
                                    Logger logger3 = c.f171584g;
                                    try {
                                        yj2.b.b(cVar.f171585a, cVar.f171588d.a());
                                    } catch (Exception unused5) {
                                        return;
                                    }
                                    break;
                                default:
                                    Logger logger4 = c.f171584g;
                                    try {
                                        yj2.b.b(cVar.f171585a, cVar.f171588d.a());
                                    } catch (Exception unused6) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    }).start();
                    y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -5);
                    logger.error("Problem processing image in makeImageRequest() - devices.xml file not found", (Throwable) e16);
                    pair = null;
                } catch (Exception e17) {
                    y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -3);
                    logger.error("Problem processing image in makeImageRequest()", (Throwable) e17);
                    pair = null;
                }
            } catch (IOException e18) {
                y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.UNKNOWN, -2);
                logger.error("Problem downloading image in downloadImageAndProcessLocally()", (Throwable) e18);
            }
            pairB = pair;
        }
        if (pairB == null) {
            return;
        }
        int iIntValue = ((Integer) pairB.second).intValue() > 0 ? ((Integer) pairB.second).intValue() : ((byte[]) pairB.first).length;
        if (connectIqImageRequest.hasMaxSize() && iIntValue > connectIqImageRequest.getMaxSize()) {
            y(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.IMAGE_TOO_LARGE, 0);
            logger.error("Image too big.");
            return;
        }
        GDIConnectIQHTTPProto.ConnectIQImageResponse.Builder builderNewBuilder = GDIConnectIQHTTPProto.ConnectIQImageResponse.newBuilder();
        builderNewBuilder.setStatus(GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.OK);
        builderNewBuilder.setHttpStatusCode(200);
        builderNewBuilder.setImageData(ByteString.copyFrom((byte[]) pairB.first));
        builderNewBuilder.setInflatedSize(((Integer) pairB.second).intValue());
        GDIConnectIQHTTPProto.ConnectIQHTTPService.Builder builderNewBuilder2 = GDIConnectIQHTTPProto.ConnectIQHTTPService.newBuilder();
        builderNewBuilder2.setConnectIqImageResponse(builderNewBuilder);
        this.f171589e.a(nu2.a.a(builderNewBuilder2));
    }

    public static class b extends Exception {
        public /* synthetic */ b(int i14) {
            this();
        }

        private b() {
        }
    }

    public static class e extends AbstractC3191c {
        public e(String str) {
            super(str);
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_BODY_IN_REQUEST;
        }

        public e(Exception exc) {
            super(exc);
        }
    }

    public static class g extends AbstractC3191c {
        public g(String str) {
            super(str);
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_REQUEST;
        }

        public g(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static class f extends AbstractC3191c {
        public f(Throwable th3, int i14) {
            super(th3);
            this.f171595a = i14;
        }

        @Override // uj2.c.AbstractC3191c
        public final GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a() {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_BODY_IN_NETWORK_RESPONSE;
        }

        public f(String str, Throwable th3, int i14) {
            super(str, th3);
            this.f171595a = i14;
        }
    }

    /* JADX INFO: renamed from: uj2.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC3191c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f171595a;

        public AbstractC3191c(String str) {
            super(str);
            this.f171595a = 0;
        }

        public abstract GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus a();

        public AbstractC3191c(String str, Throwable th3) {
            super(str, th3);
            this.f171595a = 0;
        }

        public AbstractC3191c(Throwable th3) {
            super(th3);
            this.f171595a = 0;
        }
    }
}
