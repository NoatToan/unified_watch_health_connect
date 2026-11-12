package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.channel.commonutils.android.Region;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ak {
    public static Context a;
    private static ak i;
    private static a j;
    private static String k;
    private static String l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public b f43a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final Map<String, p> f44a;
    private aj c;
    private String d;
    private long e;
    private final long f;
    private long g;
    private String h;
    public static final Map<String, ag> b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f42a = false;

    public interface a {
        ak a(Context context, aj ajVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    public ak(Context context, aj ajVar, b bVar, String str) {
        this(context, ajVar, bVar, str, null, null);
    }

    public ak(Context context, aj ajVar, b bVar, String str, String str2, String str3) {
        this.f44a = new HashMap();
        this.d = "0";
        this.e = 0L;
        this.f = 15L;
        this.g = 0L;
        this.h = "isp_prov_city_country_ip";
        this.f43a = bVar;
        this.c = ajVar == null ? new q(this) : ajVar;
        this.d = str;
        k = str2 == null ? context.getPackageName() : str2;
        l = str3 == null ? i() : str3;
    }

    public static synchronized ak a() {
        ak akVar;
        akVar = i;
        if (akVar == null) {
            throw new IllegalStateException("the host manager is not initialized yet.");
        }
        return akVar;
    }

    public static synchronized void a(Context context, aj ajVar, b bVar, String str, String str2, String str3) {
        Context applicationContext = context.getApplicationContext();
        a = applicationContext;
        if (applicationContext == null) {
            a = context;
        }
        if (i == null) {
            a aVar = j;
            if (aVar == null) {
                i = new ak(context, ajVar, bVar, str, str2, str3);
            } else {
                i = aVar.a(context, ajVar, bVar, str);
            }
        }
    }

    public static synchronized void a(a aVar) {
        j = aVar;
        i = null;
    }

    public static void a(String str, String str2) {
        Map<String, ag> map = b;
        ag agVar = map.get(str);
        synchronized (map) {
            try {
                if (agVar == null) {
                    ag agVar2 = new ag(str);
                    agVar2.a(604800000L);
                    agVar2.m3493a(str2);
                    map.put(str, agVar2);
                } else {
                    agVar.m3493a(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b() throws JSONException, IOException {
        ak akVarA = a();
        akVarA.j();
        akVarA.m3498a();
        akVarA.m3504d();
        com.xiaomi.channel.commonutils.logger.b.m3434a("region changed so clear cached hosts");
    }

    public static String f() {
        NetworkInfo activeNetworkInfo;
        Context context = a;
        if (context == null) {
            return "unknown";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI-UNKNOWN";
            }
            return activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String g(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i2 = 0; i2 < bytes.length; i2++) {
                byte b2 = bytes[i2];
                int i3 = b2 & 240;
                if (i3 != 240) {
                    bytes[i2] = (byte) (((b2 & 15) ^ ((byte) (((b2 >> 4) + length) & 15))) | i3);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    private ArrayList<ag> h(ArrayList<String> arrayList) throws JSONException, IOException {
        JSONObject jSONObject;
        e();
        synchronized (this.f44a) {
            m3500a();
            for (String str : this.f44a.keySet()) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        Map<String, ag> map = b;
        synchronized (map) {
            for (Object obj : map.values().toArray()) {
                ag agVar = (ag) obj;
                if (!agVar.b()) {
                    b.remove(agVar.b);
                }
            }
        }
        if (!arrayList.contains(m3501b())) {
            arrayList.add(m3501b());
        }
        ArrayList<ag> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(null);
        }
        try {
            String str2 = y.d(a) ? "wifi" : "wap";
            String strA = a(arrayList, str2, this.d, true);
            if (!TextUtils.isEmpty(strA)) {
                JSONObject jSONObject2 = new JSONObject(strA);
                com.xiaomi.channel.commonutils.logger.b.b(strA);
                if ("OK".equalsIgnoreCase(jSONObject2.getString(ExifInterface.LATITUDE_SOUTH))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("R");
                    String string = jSONObject3.getString("province");
                    String string2 = jSONObject3.getString("city");
                    String string3 = jSONObject3.getString("isp");
                    String string4 = jSONObject3.getString("ip");
                    String string5 = jSONObject3.getString("country");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                    com.xiaomi.channel.commonutils.logger.b.c("get bucket: net=" + string3 + ", hosts=" + jSONObject4.toString());
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        String str3 = arrayList.get(i3);
                        JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray(str3);
                        if (jSONArrayOptJSONArray == null) {
                            com.xiaomi.channel.commonutils.logger.b.m3434a("no bucket found for " + str3);
                            jSONObject = jSONObject4;
                        } else {
                            ag agVar2 = new ag(str3);
                            int i4 = 0;
                            while (i4 < jSONArrayOptJSONArray.length()) {
                                String string6 = jSONArrayOptJSONArray.getString(i4);
                                if (!TextUtils.isEmpty(string6)) {
                                    agVar2.b(new t(string6, jSONArrayOptJSONArray.length() - i4));
                                }
                                i4++;
                                jSONObject4 = jSONObject4;
                            }
                            jSONObject = jSONObject4;
                            arrayList2.set(i3, agVar2);
                            agVar2.g = string5;
                            agVar2.c = string;
                            agVar2.e = string3;
                            agVar2.f = string4;
                            agVar2.d = string2;
                            if (jSONObject3.has("stat-percent")) {
                                agVar2.a(jSONObject3.getDouble("stat-percent"));
                            }
                            if (jSONObject3.has("stat-domain")) {
                                agVar2.b(jSONObject3.getString("stat-domain"));
                            }
                            if (jSONObject3.has("ttl")) {
                                agVar2.a(((long) jSONObject3.getInt("ttl")) * 1000);
                            }
                            m3499a(agVar2.a());
                        }
                        i3++;
                        jSONObject4 = jSONObject;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("reserved");
                    if (jSONObjectOptJSONObject != null) {
                        long j2 = jSONObject3.has("reserved-ttl") ? ((long) jSONObject3.getInt("reserved-ttl")) * 1000 : 604800000L;
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                            if (jSONArrayOptJSONArray2 == null) {
                                com.xiaomi.channel.commonutils.logger.b.m3434a("no bucket found for " + next);
                            } else {
                                ag agVar3 = new ag(next);
                                agVar3.a(j2);
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                                    String string7 = jSONArrayOptJSONArray2.getString(i5);
                                    if (!TextUtils.isEmpty(string7)) {
                                        agVar3.b(new t(string7, jSONArrayOptJSONArray2.length() - i5));
                                    }
                                }
                                Map<String, ag> map2 = b;
                                synchronized (map2) {
                                    if (this.c.a(next)) {
                                        map2.put(next, agVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("failed to get bucket " + e.getMessage());
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ag agVar4 = arrayList2.get(i6);
            if (agVar4 != null) {
                a(arrayList.get(i6), agVar4);
            }
        }
        m3504d();
        return arrayList2;
    }

    private String i() {
        try {
            PackageInfo packageInfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    private void j() {
        Map<String, ag> map = b;
        synchronized (map) {
            map.clear();
        }
    }

    public ag a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return a(new URL(str).getHost(), true);
    }

    public ag a(String str, boolean z) {
        ag agVarE;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        if (!this.c.a(str)) {
            return null;
        }
        ag agVarC = c(str);
        if (agVarC == null || !agVarC.b()) {
            return (z && y.m3842a(a) && (agVarE = e(str)) != null) ? agVarE : new s(this, str, agVarC);
        }
        return agVarC;
    }

    public String a(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<x> arrayList3 = new ArrayList();
        if (str.equals("wap")) {
            arrayList3.add(new v("conpt", g(y.m3840a(a))));
        }
        if (z) {
            arrayList3.add(new v("reserved", "1"));
        }
        arrayList3.add(new v("list", ad.a(arrayList, ",")));
        arrayList3.add(new v("countrycode", com.xiaomi.push.service.a.a(a).b()));
        arrayList3.add(new v("push_sdk_vc", String.valueOf(BuildConfig.VERSION_CODE)));
        ag agVarC = c(m3501b());
        String str3 = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", m3501b());
        if (agVarC == null) {
            arrayList2.add(str3);
            Map<String, ag> map = b;
            synchronized (map) {
                ag agVar = map.get(m3501b());
                if (agVar != null) {
                    Iterator<String> it2 = agVar.a(true).iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it2.next()));
                    }
                }
            }
        } else {
            arrayList2 = agVarC.a(str3);
        }
        Iterator<String> it3 = arrayList2.iterator();
        IOException e = null;
        while (it3.hasNext()) {
            Uri.Builder builderBuildUpon = Uri.parse(it3.next()).buildUpon();
            for (x xVar : arrayList3) {
                builderBuildUpon.appendQueryParameter(xVar.a(), xVar.b());
            }
            try {
                b bVar = this.f43a;
                return bVar == null ? y.a(a, new URL(builderBuildUpon.toString())) : bVar.a(builderBuildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("network exception: " + e.getMessage());
        throw e;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public JSONObject m3497a() throws JSONException {
        JSONObject jSONObject;
        synchronized (this.f44a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            Iterator<p> it2 = this.f44a.values().iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().e());
            }
            jSONObject.put("data", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator<ag> it3 = b.values().iterator();
            while (it3.hasNext()) {
                jSONArray2.put(it3.next().m3492a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3498a() {
        synchronized (this.f44a) {
            this.f44a.clear();
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3499a(String str) {
        this.h = str;
    }

    public void a(String str, ag agVar) {
        if (TextUtils.isEmpty(str) || agVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + agVar);
        }
        if (this.c.a(str)) {
            synchronized (this.f44a) {
                m3500a();
                if (this.f44a.containsKey(str)) {
                    this.f44a.get(str).f(agVar);
                } else {
                    p pVar = new p(str);
                    pVar.f(agVar);
                    this.f44a.put(str, pVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3500a() {
        synchronized (this.f44a) {
            if (f42a) {
                return true;
            }
            f42a = true;
            this.f44a.clear();
            try {
                String strC = c();
                if (!TextUtils.isEmpty(strC)) {
                    m3502b(strC);
                    com.xiaomi.channel.commonutils.logger.b.b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("load bucket failure: " + th.getMessage());
            }
            return false;
        }
    }

    public ag b(String str) {
        return a(str, true);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public String m3501b() {
        String strA = com.xiaomi.push.service.a.a(a).a();
        if (TextUtils.isEmpty(strA) || Region.Global.name().equals(strA)) {
            return "resolver.msg.global.xiaomi.net";
        }
        if (Region.Europe.name().equals(strA)) {
            return "fr.resolver.msg.global.xiaomi.net";
        }
        if (Region.Russia.name().equals(strA)) {
            return "ru.resolver.msg.global.xiaomi.net";
        }
        return Region.India.name().equals(strA) ? "mb.resolver.msg.global.xiaomi.net" : "resolver.msg.global.xiaomi.net";
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m3502b(String str) {
        synchronized (this.f44a) {
            this.f44a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") != 2) {
                throw new JSONException("Bad version");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    p pVarB = new p().b(jSONArrayOptJSONArray.getJSONObject(i2));
                    this.f44a.put(pVarB.c(), pVarB);
                }
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("reserved");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
                    String strOptString = jSONObject2.optString("host");
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            ag agVarA = new ag(strOptString).a(jSONObject2);
                            b.put(agVarA.b, agVarA);
                            com.xiaomi.channel.commonutils.logger.b.m3434a("load local reserved host for " + agVarA.b);
                        } catch (JSONException unused) {
                            com.xiaomi.channel.commonutils.logger.b.m3434a("parse reserved host fail.");
                        }
                    }
                }
            }
        }
    }

    public ag c(String str) {
        p pVar;
        ag agVarA;
        synchronized (this.f44a) {
            m3500a();
            pVar = this.f44a.get(str);
        }
        if (pVar == null || (agVarA = pVar.a()) == null) {
            return null;
        }
        return agVarA;
    }

    public String c() {
        BufferedReader bufferedReader;
        try {
            try {
                File file = new File(a.getFilesDir(), d());
                if (!file.isFile()) {
                    h.a((Closeable) null);
                    return null;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            h.a(bufferedReader);
                            return string;
                        }
                        sb.append(line);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
            com.xiaomi.channel.commonutils.logger.b.m3434a("load host exception " + th.getMessage());
            return null;
        } finally {
            h.a(bufferedReader);
        }
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public void m3503c() throws JSONException, IOException {
        ArrayList<String> arrayList;
        synchronized (this.f44a) {
            m3500a();
            arrayList = new ArrayList<>(this.f44a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                p pVar = this.f44a.get(arrayList.get(size));
                if (pVar != null && pVar.a() != null) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<ag> arrayListH = h(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayListH.get(i2) != null) {
                a(arrayList.get(i2), arrayListH.get(i2));
            }
        }
    }

    public ag d(String str) {
        ag agVar;
        Map<String, ag> map = b;
        synchronized (map) {
            agVar = map.get(str);
        }
        return agVar;
    }

    public String d() {
        if (PkgNameConstants.XMSF.equals(k)) {
            return k;
        }
        return k + ":pushservice";
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public void m3504d() throws JSONException, IOException {
        synchronized (this.f44a) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(a.openFileOutput(d(), 0)));
                String string = m3497a().toString();
                if (!TextUtils.isEmpty(string)) {
                    bufferedWriter.write(string);
                }
                bufferedWriter.close();
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("persist bucket failure: " + e.getMessage());
            }
        }
    }

    public ag e(String str) {
        if (System.currentTimeMillis() - this.g <= this.e * 60 * 1000) {
            return null;
        }
        this.g = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        ag agVar = h(arrayList).get(0);
        if (agVar != null) {
            this.e = 0L;
            return agVar;
        }
        long j2 = this.e;
        if (j2 >= 15) {
            return null;
        }
        this.e = j2 + 1;
        return null;
    }

    public void e() {
        String next;
        synchronized (this.f44a) {
            Iterator<p> it2 = this.f44a.values().iterator();
            while (it2.hasNext()) {
                it2.next().g(true);
            }
            while (true) {
                boolean z = false;
                while (true) {
                    if (!z) {
                        Iterator<String> it3 = this.f44a.keySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (this.f44a.get(next).d().isEmpty()) {
                                    break;
                                }
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                this.f44a.remove(next);
            }
        }
    }
}
