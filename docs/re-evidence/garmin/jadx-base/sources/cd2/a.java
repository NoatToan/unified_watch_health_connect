package cd2;

import am.j;
import androidx.room.a0;
import com.garmin.android.lib.networking.exceptions.UnexpectedResponseCodeException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import d53.u;
import d53.w;
import dd2.c;
import dh.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcd2/a;", "", "", "deviceUnitID", "Lcd2/a$a$a;", "deviceConsumerType", "Lzi2/a;", "connectEnvironment", "", "signedInCustomerOAuth2DIBearerToken", "Ldd2/c;", "signedInCustomerOAuth1GCCredential", "applicationKey", "<init>", "(JLcd2/a$a$a;Lzi2/a;Ljava/lang/String;Ldd2/c;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0412a.EnumC0413a f26875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zi2.a f26876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f26878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26879f;

    static {
        new C0412a(null);
    }

    public a(long j8, C0412a.EnumC0413a enumC0413a, zi2.a aVar, String str, c cVar, String str2) {
        enumC0413a.getClass();
        aVar.getClass();
        this.f26874a = j8;
        this.f26875b = enumC0413a;
        this.f26876c = aVar;
        this.f26877d = str;
        this.f26878e = cVar;
        this.f26879f = str2;
        if ((str == null || w.J(str)) && cVar == null) {
            throw new InvalidParameterException("must provide either 'signedInCustomerOAuth2DIBearerToken' or 'signedInCustomerOAuth1GCCredential'");
        }
        if (cVar != null) {
            if (str2 == null || w.J(str2)) {
                throw new InvalidParameterException("must provide 'applicationKey' with 'signedInCustomerOAuth1GCCredential'");
            }
        }
    }

    public final c a() throws Throwable {
        long j8 = this.f26874a;
        HttpURLConnection httpURLConnection = null;
        String str = this.f26877d;
        zi2.a aVar = this.f26876c;
        if (str != null) {
            String strM = j.m("https://", aVar.f204881b, "/oauth-service/oauth/exchange/device/1.0");
            byte[] bArrO = u.o("device_id=".concat(nd2.c.i(String.valueOf(j8))));
            try {
                URLConnection uRLConnectionOpenConnection = new URL(strM).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    httpURLConnection2.setRequestMethod(FirebasePerformance.HttpMethod.POST);
                    httpURLConnection2.setUseCaches(false);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer ".concat(str));
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                    httpURLConnection2.setFixedLengthStreamingMode(bArrO.length);
                    httpURLConnection2.connect();
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    try {
                        outputStream.write(bArrO);
                        Unit unit = Unit.INSTANCE;
                        outputStream.close();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode == 200) {
                            InputStream inputStream = httpURLConnection2.getInputStream();
                            inputStream.getClass();
                            c cVarB = b(strM, new JSONArray(new String(b.M(inputStream), d53.c.f57666b)));
                            try {
                                httpURLConnection2.disconnect();
                            } catch (Exception unused) {
                            }
                            return cVarB;
                        }
                        throw new UnexpectedResponseCodeException(strM, responseCode, strM + " -> " + httpURLConnection2.getResponseCode() + ", deviceUnitID:" + j8);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(outputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            String str2 = aVar.f204881b;
            String str3 = this.f26879f;
            String strJ = a0.j("https://", str2, "/oauth-service/oauth/tokens/device/", str3);
            try {
                URLConnection uRLConnectionOpenConnection2 = new URL(strJ).openConnection();
                uRLConnectionOpenConnection2.getClass();
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) uRLConnectionOpenConnection2;
                try {
                    httpURLConnection3.setUseCaches(false);
                    c cVar = this.f26878e;
                    cVar.getClass();
                    xy2.b.J(httpURLConnection3, cVar.f59212a, cVar.f59213b, cVar.f59214c, cVar.f59215d, null);
                    int responseCode2 = httpURLConnection3.getResponseCode();
                    if (responseCode2 == 200) {
                        InputStream inputStream2 = httpURLConnection3.getInputStream();
                        inputStream2.getClass();
                        c cVarB2 = b(strJ, new JSONArray(new String(b.M(inputStream2), d53.c.f57666b)));
                        try {
                            httpURLConnection3.disconnect();
                        } catch (Exception unused3) {
                        }
                        return cVarB2;
                    }
                    throw new UnexpectedResponseCodeException(strJ, responseCode2, strJ + " -> " + httpURLConnection3.getResponseCode() + ", deviceUnitID:" + j8 + ", applicationKey:" + str3);
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = httpURLConnection3;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public final c b(String str, JSONArray jSONArray) throws Exception {
        int length = jSONArray.length();
        int i14 = 0;
        while (true) {
            C0412a.EnumC0413a enumC0413a = this.f26875b;
            if (i14 >= length) {
                StringBuilder sbI = p6.b.i("[", str, "]'s response JSON did not contain deviceConsumerType '", enumC0413a.name(), "' for deviceUnitID ");
                sbI.append(this.f26874a);
                throw new Exception(sbI.toString());
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            if (s.g(jSONObject.getString("deviceConsumerType"), enumC0413a.name())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("deviceConsumerTokenDto");
                JSONObject jSONObject3 = jSONObject.getJSONObject("userTokenDto");
                String strOptString = jSONObject3.optString("token", "");
                strOptString.getClass();
                String strOptString2 = jSONObject3.optString("secret", "");
                strOptString2.getClass();
                String strOptString3 = jSONObject2.optString("token", "");
                strOptString3.getClass();
                String strOptString4 = jSONObject2.optString("secret", "");
                strOptString4.getClass();
                return new c(strOptString, strOptString2, strOptString3, strOptString4);
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: cd2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcd2/a$a;", "", "<init>", "()V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C0412a {

        /* JADX INFO: renamed from: cd2.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcd2/a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC0413a {
            /* JADX INFO: Fake field, exist only in values array */
            CIQ,
            DEVICE
        }

        public /* synthetic */ C0412a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0412a() {
        }
    }

    public /* synthetic */ a(long j8, C0412a.EnumC0413a enumC0413a, zi2.a aVar, String str, c cVar, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i14 & 2) != 0 ? C0412a.EnumC0413a.DEVICE : enumC0413a, aVar, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : cVar, (i14 & 32) != 0 ? null : str2);
    }
}
