package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class wjs {
    public static Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static wjs f38043k;
    public static a l;
    public static String m;
    public static String n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, pis> f38044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tjs f38045b;
    public b c;
    public String d;
    public long e;
    public final long f;
    public long g;
    public String h;
    public static final Map<String, mis> i = new HashMap();
    public static boolean o = false;

    public interface a {
        wjs a(Context context, tjs tjsVar, b bVar, String str);
    }

    public interface b {
        String a(String str);
    }

    public wjs(Context context, tjs tjsVar, b bVar, String str) {
        this(context, tjsVar, bVar, str, null, null);
    }

    public static synchronized wjs c() {
        wjs wjsVar;
        wjsVar = f38043k;
        if (wjsVar == null) {
            throw new IllegalStateException("the host manager is not initialized yet.");
        }
        return wjsVar;
    }

    public static String d() {
        if (j == null) {
            return "unknown";
        }
        try {
            xbs xbsVarE = obs.e();
            if (xbsVarE == null) {
                return "unknown";
            }
            if (xbsVarE.a() == 1) {
                return "WIFI-UNKNOWN";
            }
            return xbsVarE.e() + "-" + xbsVarE.h();
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static String e(String str) {
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

    public static synchronized void j(Context context, tjs tjsVar, b bVar, String str, String str2, String str3) {
        try {
            Context applicationContext = context.getApplicationContext();
            j = applicationContext;
            if (applicationContext == null) {
                j = context;
            }
            if (f38043k == null) {
                a aVar = l;
                if (aVar == null) {
                    f38043k = new wjs(context, tjsVar, bVar, str, str2, str3);
                } else {
                    f38043k = aVar.a(context, tjsVar, bVar, str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void k(a aVar) {
        l = aVar;
        f38043k = null;
    }

    public static void n(String str, String str2) {
        Map<String, mis> map = i;
        mis misVar = map.get(str);
        synchronized (map) {
            try {
                if (misVar == null) {
                    mis misVar2 = new mis(str);
                    misVar2.h(604800000L);
                    misVar2.j(str2);
                    map.put(str, misVar2);
                } else {
                    misVar.j(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mis A(String str) {
        if (System.currentTimeMillis() - this.g <= this.e * 60000) {
            return null;
        }
        this.g = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        mis misVar = g(arrayList).get(0);
        if (misVar != null) {
            this.e = 0L;
            return misVar;
        }
        long j2 = this.e;
        if (j2 >= 15) {
            return null;
        }
        this.e = j2 + 1;
        return null;
    }

    public String B() {
        if ("com.xiaomi.xmsf".equals(m)) {
            return m;
        }
        return m + ":pushservice";
    }

    public void C() {
        String next;
        synchronized (this.f38044a) {
            try {
                Iterator<pis> it = this.f38044a.values().iterator();
                while (it.hasNext()) {
                    it.next().g(true);
                }
                while (true) {
                    Iterator<String> it2 = this.f38044a.keySet().iterator();
                    do {
                        if (it2.hasNext()) {
                            next = it2.next();
                        }
                    } while (!this.f38044a.get(next).d().isEmpty());
                    this.f38044a.remove(next);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String D() {
        return "host_fallbacks";
    }

    public final String E() {
        try {
            PackageInfo packageInfo = j.getPackageManager().getPackageInfo(j.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    public mis a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty");
        }
        return b(new URL(str).getHost(), true);
    }

    public mis b(String str, boolean z) {
        mis misVarA;
        x9s.A("HostManager", "-->getFallbacksByHost(): host=", str, ", fetchRemoteIfNeed=", Boolean.valueOf(z));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        if (!this.f38045b.a(str)) {
            return null;
        }
        mis misVarU = u(str);
        if (misVarU == null || !misVarU.u()) {
            return (z && obs.v(j) && (misVarA = A(str)) != null) ? misVarA : new fks(this, str, misVarU);
        }
        return misVarU;
    }

    public String f(ArrayList<String> arrayList, String str, String str2, boolean z) throws IOException {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<kbs> arrayList3 = new ArrayList();
        arrayList3.add(new bbs("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new bbs("conpt", e(obs.j(j))));
        }
        if (z) {
            arrayList3.add(new bbs("reserved", "1"));
        }
        arrayList3.add(new bbs("uuid", str2));
        arrayList3.add(new bbs("list", qcs.d(arrayList, ",")));
        arrayList3.add(new bbs("countrycode", yes.a(j).f()));
        arrayList3.add(new bbs("push_sdk_vc", String.valueOf(50708)));
        String strR = r();
        mis misVarU = u(strR);
        String str3 = String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", strR);
        if (misVarU == null) {
            arrayList2.add(str3);
            Map<String, mis> map = i;
            synchronized (map) {
                try {
                    mis misVar = map.get(strR);
                    if (misVar != null) {
                        Iterator<String> it = misVar.e(true).iterator();
                        while (it.hasNext()) {
                            arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=5.0", it.next()));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            arrayList2 = misVarU.d(str3);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder builderBuildUpon = Uri.parse(it2.next()).buildUpon();
            for (kbs kbsVar : arrayList3) {
                builderBuildUpon.appendQueryParameter(kbsVar.a(), kbsVar.b());
            }
            try {
                b bVar = this.c;
                return bVar == null ? obs.k(j, new URL(builderBuildUpon.toString())) : bVar.a(builderBuildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        x9s.o("network exception: " + e.getMessage());
        throw e;
    }

    public final ArrayList<mis> g(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        C();
        synchronized (this.f38044a) {
            try {
                o();
                for (String str : this.f38044a.keySet()) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map<String, mis> map = i;
        synchronized (map) {
            try {
                for (Object obj : map.values().toArray()) {
                    mis misVar = (mis) obj;
                    if (!misVar.u()) {
                        i.remove(misVar.d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!arrayList.contains(r())) {
            arrayList.add(r());
        }
        ArrayList<mis> arrayList2 = new ArrayList<>(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(null);
        }
        try {
            String str2 = obs.y(j) ? "wifi" : "wap";
            String strF = f(arrayList, str2, this.d, true);
            if (!TextUtils.isEmpty(strF)) {
                JSONObject jSONObject2 = new JSONObject(strF);
                x9s.y(strF);
                if ("OK".equalsIgnoreCase(jSONObject2.getString("S"))) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("R");
                    String string = jSONObject3.getString("province");
                    String string2 = jSONObject3.getString("city");
                    String string3 = jSONObject3.getString("isp");
                    String string4 = jSONObject3.getString(DeviceInfo.Builder.PrivateDataKey.IP);
                    String string5 = jSONObject3.getString("country");
                    JSONObject jSONObject4 = jSONObject3.getJSONObject(str2);
                    x9s.B("get bucket: net=" + string3 + ", hosts=" + jSONObject4.toString());
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        String str3 = arrayList.get(i3);
                        JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray(str3);
                        if (jSONArrayOptJSONArray == null) {
                            x9s.o("no bucket found for " + str3);
                            jSONObject = jSONObject4;
                        } else {
                            mis misVar2 = new mis(str3);
                            int i4 = 0;
                            while (i4 < jSONArrayOptJSONArray.length()) {
                                String string6 = jSONArrayOptJSONArray.getString(i4);
                                if (!TextUtils.isEmpty(string6)) {
                                    misVar2.i(new qks(string6, jSONArrayOptJSONArray.length() - i4));
                                }
                                i4++;
                                jSONObject4 = jSONObject4;
                            }
                            jSONObject = jSONObject4;
                            arrayList2.set(i3, misVar2);
                            misVar2.i = string5;
                            misVar2.e = string;
                            misVar2.g = string3;
                            misVar2.h = string4;
                            misVar2.f = string2;
                            if (jSONObject3.has("stat-percent")) {
                                misVar2.g(jSONObject3.getDouble("stat-percent"));
                            }
                            if (jSONObject3.has("stat-domain")) {
                                misVar2.r(jSONObject3.getString("stat-domain"));
                            }
                            if (jSONObject3.has(StepsInfo.KEY_STEPS)) {
                                misVar2.h(((long) jSONObject3.getInt(StepsInfo.KEY_STEPS)) * 1000);
                            }
                            l(misVar2.b());
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
                                x9s.o("no bucket found for " + next);
                            } else {
                                mis misVar3 = new mis(next);
                                misVar3.h(j2);
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                                    String string7 = jSONArrayOptJSONArray2.getString(i5);
                                    if (!TextUtils.isEmpty(string7)) {
                                        misVar3.i(new qks(string7, jSONArrayOptJSONArray2.length() - i5));
                                    }
                                }
                                Map<String, mis> map2 = i;
                                synchronized (map2) {
                                    try {
                                        if (this.f38045b.a(next)) {
                                            map2.put(next, misVar3);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            x9s.o("failed to get bucket " + e.getMessage());
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            mis misVar4 = arrayList2.get(i6);
            if (misVar4 != null) {
                m(arrayList.get(i6), misVar4);
            }
        }
        w();
        return arrayList2;
    }

    public JSONObject h() {
        JSONObject jSONObject;
        synchronized (this.f38044a) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put(DeviceTagInterface.TAG_VERSION_CODE, 2);
                JSONArray jSONArray = new JSONArray();
                Iterator<pis> it = this.f38044a.values().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().e());
                }
                jSONObject.put("data", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator<mis> it2 = i.values().iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().f());
                }
                jSONObject.put("reserved", jSONArray2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public void i() {
        synchronized (this.f38044a) {
            this.f38044a.clear();
        }
    }

    public void l(String str) {
        this.h = str;
    }

    public void m(String str, mis misVar) {
        if (TextUtils.isEmpty(str) || misVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + misVar);
        }
        if (this.f38045b.a(str)) {
            synchronized (this.f38044a) {
                try {
                    o();
                    if (this.f38044a.containsKey(str)) {
                        this.f38044a.get(str).f(misVar);
                    } else {
                        pis pisVar = new pis(str);
                        pisVar.f(misVar);
                        this.f38044a.put(str, pisVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean o() {
        synchronized (this.f38044a) {
            try {
                if (o) {
                    return true;
                }
                o = true;
                this.f38044a.clear();
                try {
                    String strY = y();
                    if (!TextUtils.isEmpty(strY)) {
                        t(strY);
                        x9s.y("loading the new hosts succeed");
                        return true;
                    }
                } catch (Throwable th) {
                    x9s.o("load bucket failure: " + th.getMessage());
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final byte[] p() {
        return mcs.c(j.getPackageName() + "_key_salt");
    }

    public mis q(String str) {
        return b(str, true);
    }

    public String r() {
        return "resolver.msg.xiaomi.net";
    }

    public void s() {
        ArrayList<String> arrayList;
        synchronized (this.f38044a) {
            try {
                o();
                arrayList = new ArrayList<>(this.f38044a.keySet());
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    pis pisVar = this.f38044a.get(arrayList.get(size));
                    if (pisVar != null && pisVar.a() != null) {
                        arrayList.remove(size);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList<mis> arrayListG = g(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayListG.get(i2) != null) {
                m(arrayList.get(i2), arrayListG.get(i2));
            }
        }
    }

    public void t(String str) {
        synchronized (this.f38044a) {
            try {
                this.f38044a.clear();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt(DeviceTagInterface.TAG_VERSION_CODE) != 2) {
                    throw new JSONException("Bad version");
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
                if (jSONArrayOptJSONArray != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        pis pisVarB = new pis().b(jSONArrayOptJSONArray.getJSONObject(i2));
                        this.f38044a.put(pisVarB.c(), pisVarB);
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("reserved");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i3);
                        String strOptString = jSONObject2.optString(com.xiaomi.onetrack.api.b.E);
                        if (!TextUtils.isEmpty(strOptString)) {
                            try {
                                mis misVarA = new mis(strOptString).a(jSONObject2);
                                i.put(misVarA.d, misVarA);
                                x9s.o("load local reserved host for " + misVarA.d);
                            } catch (JSONException unused) {
                                x9s.o("parse reserved host fail.");
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mis u(String str) {
        pis pisVar;
        mis misVarA;
        synchronized (this.f38044a) {
            o();
            pisVar = this.f38044a.get(str);
        }
        if (pisVar == null || (misVarA = pisVar.a()) == null) {
            return null;
        }
        return misVarA;
    }

    public String v() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f38044a) {
            try {
                for (Map.Entry<String, pis> entry : this.f38044a.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append(":\n");
                    sb.append(entry.getValue().toString());
                    sb.append("\n");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb.toString();
    }

    public void w() {
        FileOutputStream fileOutputStreamOpenFileOutput;
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        Exception e;
        synchronized (this.f38044a) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    String string = h().toString();
                    x9s.y("persist host fallbacks = " + string);
                    if (TextUtils.isEmpty(string)) {
                        fileOutputStreamOpenFileOutput = null;
                    } else {
                        fileOutputStreamOpenFileOutput = j.openFileOutput(D(), 0);
                        try {
                            bufferedOutputStream = new BufferedOutputStream(fileOutputStreamOpenFileOutput);
                            try {
                                try {
                                    bufferedOutputStream.write(hxs.c(p(), string.getBytes(StandardCharsets.UTF_8)));
                                    bufferedOutputStream.flush();
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (Exception e2) {
                                    e = e2;
                                    x9s.o("persist bucket failure: " + e.getMessage());
                                    mgt.b(bufferedOutputStream);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mgt.b(bufferedOutputStream);
                                mgt.b(fileOutputStreamOpenFileOutput);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            bufferedOutputStream = null;
                            e = e;
                            x9s.o("persist bucket failure: " + e.getMessage());
                            mgt.b(bufferedOutputStream);
                            mgt.b(fileOutputStreamOpenFileOutput);
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedOutputStream = null;
                            th = th;
                            mgt.b(bufferedOutputStream);
                            mgt.b(fileOutputStreamOpenFileOutput);
                            throw th;
                        }
                    }
                    mgt.b(bufferedOutputStream2);
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStreamOpenFileOutput = null;
                bufferedOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStreamOpenFileOutput = null;
                bufferedOutputStream = null;
            }
            mgt.b(fileOutputStreamOpenFileOutput);
        }
    }

    public mis x(String str) {
        mis misVar;
        Map<String, mis> map = i;
        synchronized (map) {
            misVar = map.get(str);
        }
        return misVar;
    }

    public String y() {
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        try {
            File file = new File(j.getFilesDir(), D());
            try {
                if (!file.isFile()) {
                    mgt.b(null);
                    mgt.b(null);
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                    try {
                        String str = new String(hxs.b(p(), mgt.g(bufferedInputStream)), StandardCharsets.UTF_8);
                        x9s.y("load host fallbacks = " + str);
                        mgt.b(bufferedInputStream);
                        mgt.b(fileInputStream);
                        return str;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
                x9s.o("load host exception " + th.getMessage());
                return null;
            } finally {
                mgt.b(bufferedInputStream);
                mgt.b(fileInputStream);
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
            fileInputStream = null;
        }
    }

    public void z() {
        String strB = B();
        try {
            File file = new File(j.getFilesDir(), strB);
            if (file.exists()) {
                boolean zDelete = file.delete();
                StringBuilder sb = new StringBuilder();
                sb.append("Delete old host fallbacks file ");
                sb.append(strB);
                sb.append(zDelete ? " successful." : " failed.");
                x9s.o(sb.toString());
            } else {
                x9s.y("Old host fallbacks file " + strB + " does not exist.");
            }
        } catch (Exception e) {
            x9s.o("Delete old host fallbacks file " + strB + " error: " + e.getMessage());
        }
    }

    public wjs(Context context, tjs tjsVar, b bVar, String str, String str2, String str3) {
        this.f38044a = new HashMap();
        this.d = "0";
        this.e = 0L;
        this.f = 15L;
        this.g = 0L;
        this.h = "isp_prov_city_country_ip";
        this.c = bVar;
        if (tjsVar == null) {
            this.f38045b = new cks(this);
        } else {
            this.f38045b = tjsVar;
        }
        this.d = str;
        m = str2 == null ? context.getPackageName() : str2;
        n = str3 == null ? E() : str3;
    }
}
