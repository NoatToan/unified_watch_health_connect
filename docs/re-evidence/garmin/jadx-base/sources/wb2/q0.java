package wb2;

import android.content.Context;
import android.content.pm.PackageManager;
import ch.qos.logback.classic.Logger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f184086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f184087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f184088c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184089a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            f184089a = iArr;
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f184089a[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f184089a[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f184090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f184091b = UUID.randomUUID().toString();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f184092c;

        public b(q0 q0Var, String str, String str2) {
            this.f184090a = str;
            this.f184092c = str2;
        }

        public final String a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("UnitID", this.f184090a);
                jSONObject.put("SyncGUID", this.f184091b);
                jSONObject.put("Body", this.f184092c);
                return jSONObject.toString();
            } catch (JSONException e4) {
                e4.printStackTrace();
                return "";
            }
        }
    }

    public enum c {
        PROD("https://omt.garmin.com/"),
        CHINA("https://omt.garmin.cn/"),
        CHINA_TEST("https://omt.garmin.cn/"),
        TEST("https://omtstg.garmin.com/");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f184098a;

        c(String str) {
            this.f184098a = str;
        }
    }

    public q0(Context context) {
        this.f184087b = context;
        int i14 = gt2.c.f79010a;
        this.f184086a = gt2.b.f79005a.i("SyncReportUploader");
        int i15 = a.f184089a[((il2.e) ec2.e.b()).n().ordinal()];
        if (i15 == 1) {
            this.f184088c = c.PROD;
            return;
        }
        if (i15 == 2) {
            this.f184088c = c.CHINA;
        } else if (i15 != 3) {
            this.f184088c = c.TEST;
        } else {
            this.f184088c = c.CHINA_TEST;
        }
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void g() {
        ic2.a aVarB = ic2.a.b();
        if (!aVarB.f92644b) {
            StringBuffer stringBuffer = aVarB.f92643a;
            if (stringBuffer == null) {
                aVarB.f92643a = new StringBuffer("**************** Device interface logs ***********\n");
            } else {
                stringBuffer.replace(0, stringBuffer.length(), "");
                aVarB.f92643a.append("**************** Device interface logs ***********\n");
            }
            aVarB.f92644b = true;
        }
        p0 p0VarB = p0.b();
        if (p0VarB.f184083b) {
            return;
        }
        StringBuffer stringBuffer2 = p0VarB.f184082a;
        if (stringBuffer2 == null) {
            p0VarB.f184082a = new StringBuffer("**************** Sync logs ***********\n");
        } else {
            stringBuffer2.replace(0, stringBuffer2.length(), "");
            p0VarB.f184082a.append("**************** Sync logs ***********\n");
        }
        p0VarB.f184083b = true;
    }

    public final HashMap b() {
        String str;
        Context context = this.f184087b;
        HashMap map = new HashMap(5);
        map.put(HttpHeaders.ACCEPT, "application/json");
        map.put(HttpHeaders.CONTENT_TYPE, "application/json");
        map.put("Garmin-Client-Name", "ConnectMobile");
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "UNKNOWN";
        }
        if (str.indexOf("-") > 0) {
            map.put("Garmin-Client-Version", str.substring(0, str.indexOf("-")));
        } else {
            map.put("Garmin-Client-Version", str);
        }
        map.put("Garmin-Client-Platform", "Android");
        return map;
    }

    public final boolean c(long j8) {
        boolean zA = hb2.i.a(this.f184087b);
        Logger logger = this.f184086a;
        if (!zA) {
            logger.error("No Network connection");
            return false;
        }
        try {
            return d(new URL(this.f184088c.f184098a + "DeviceLogCapture/BluetoothLog/LoggingStatus/" + j8), b());
        } catch (IOException e4) {
            logger.error(e4.getMessage(), (Throwable) e4);
            return false;
        }
    }

    public final boolean d(URL url, HashMap map) {
        Logger logger = this.f184086a;
        Boolean boolValueOf = Boolean.FALSE;
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String strTrim = line.trim();
                    if (strTrim.length() > 0) {
                        boolValueOf = Boolean.valueOf(Boolean.parseBoolean(strTrim));
                    }
                }
            } catch (Throwable th3) {
                a(inputStream);
                throw th3;
            }
        } catch (MalformedInputException e4) {
            logger.error("MalformedInputException", (Throwable) e4);
        } catch (IOException e14) {
            logger.error(e14.getMessage(), (Throwable) e14);
        } catch (Throwable th4) {
            logger.error(th4.getMessage(), th4);
        }
        a(inputStream);
        return boolValueOf.booleanValue();
    }

    public final void e(long j8, String str) throws Throwable {
        boolean zA = hb2.i.a(this.f184087b);
        Logger logger = this.f184086a;
        if (!zA) {
            logger.error("No Network connection");
            return;
        }
        try {
            URL url = new URL(this.f184088c.f184098a + "DeviceLogCapture/BluetoothLog/LogMessage/" + j8);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j8);
            sb3.append("");
            f(url, sb3.toString(), b(), str);
        } catch (MalformedURLException e4) {
            logger.error(e4.getMessage(), (Throwable) e4);
        }
    }

    public final void f(URL url, String str, HashMap map, String str2) throws Throwable {
        Logger logger = this.f184086a;
        StringBuilder sbI = sn.a.i(str2, "\n********************* GFDI & GDI log ************************ \n");
        StringBuffer stringBuffer = ic2.a.b().f92643a;
        sbI.append(stringBuffer != null ? stringBuffer.toString() : "");
        StringBuffer stringBuffer2 = p0.b().f184082a;
        sbI.append(stringBuffer2 != null ? stringBuffer2.toString() : "");
        b bVar = new b(this, str, sbI.toString());
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.POST);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.addRequestProperty("content-Encoding", "gzip");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            String strA = bVar.a();
            GZIPOutputStream gZIPOutputStream = null;
            InputStream inputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new BufferedOutputStream(outputStream));
                try {
                    gZIPOutputStream2.write(strA.getBytes());
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    try {
                        inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("BluetoothLog : ");
                        StringBuilder sb4 = new StringBuilder();
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                        CharBuffer charBufferAllocate = CharBuffer.allocate(1024);
                        while (true) {
                            int i14 = inputStreamReader.read(charBufferAllocate);
                            if (i14 == -1) {
                                sb3.append(sb4.toString());
                                logger.debug(sb3.toString());
                                a(inputStream);
                                return;
                            }
                            charBufferAllocate.flip();
                            sb4.append((CharSequence) charBufferAllocate, 0, i14);
                        }
                    } catch (Throwable th3) {
                        a(inputStream);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (MalformedInputException e4) {
            logger.error(e4.getMessage(), (Throwable) e4);
        } catch (IOException e14) {
            logger.error(e14.getMessage(), e14);
        }
    }
}
