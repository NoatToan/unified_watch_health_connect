package defpackage;

import android.text.TextUtils;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26232b;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26233k;
    public ArrayList<qks> c = new ArrayList<>();
    public double l = 0.1d;
    public String m = "s.mi1.cc";
    public long n = 86400000;

    public mis(String str) {
        this.f26231a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f26232b = System.currentTimeMillis();
        this.c.add(new qks(str, -1));
        this.f26231a = wjs.d();
        this.d = str;
    }

    public synchronized mis a(JSONObject jSONObject) {
        this.f26231a = jSONObject.optString(OneTrack.Param.NET);
        this.n = jSONObject.getLong(StepsInfo.KEY_STEPS);
        this.l = jSONObject.getDouble("pct");
        this.f26232b = jSONObject.getLong(DeviceTagInterface.TAG_DATA_START);
        this.f = jSONObject.optString("city");
        this.e = jSONObject.optString("prv");
        this.i = jSONObject.optString("cty");
        this.g = jSONObject.optString("isp");
        this.h = jSONObject.optString(DeviceInfo.Builder.PrivateDataKey.IP);
        this.d = jSONObject.optString(b.E);
        this.j = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            i(new qks().b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized String b() {
        if (!TextUtils.isEmpty(this.f26233k)) {
            return this.f26233k;
        }
        if (TextUtils.isEmpty(this.g)) {
            return "hardcode_isp";
        }
        String strG = qcs.g(new String[]{this.g, this.e, this.f, this.i, this.h}, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        this.f26233k = strG;
        return strG;
    }

    public synchronized ArrayList<String> c() {
        return e(false);
    }

    public ArrayList<String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.d)) {
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = e(true).iterator();
        while (it.hasNext()) {
            rjs rjsVarB = rjs.b(it.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), rjsVarB.c(), rjsVarB.a(), url.getFile()).toString());
        }
        return arrayList;
    }

    public synchronized ArrayList<String> e(boolean z) {
        ArrayList<String> arrayList;
        try {
            int size = this.c.size();
            qks[] qksVarArr = new qks[size];
            this.c.toArray(qksVarArr);
            Arrays.sort(qksVarArr);
            arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                qks qksVar = qksVarArr[i];
                if (z) {
                    arrayList.add(qksVar.f31615b);
                } else {
                    int iIndexOf = qksVar.f31615b.indexOf(":");
                    if (iIndexOf != -1) {
                        arrayList.add(qksVar.f31615b.substring(0, iIndexOf));
                    } else {
                        arrayList.add(qksVar.f31615b);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized JSONObject f() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put(OneTrack.Param.NET, this.f26231a);
            jSONObject.put(StepsInfo.KEY_STEPS, this.n);
            jSONObject.put("pct", this.l);
            jSONObject.put(DeviceTagInterface.TAG_DATA_START, this.f26232b);
            jSONObject.put("city", this.f);
            jSONObject.put("prv", this.e);
            jSONObject.put("cty", this.i);
            jSONObject.put("isp", this.g);
            jSONObject.put(DeviceInfo.Builder.PrivateDataKey.IP, this.h);
            jSONObject.put(b.E, this.d);
            jSONObject.put("xf", this.j);
            JSONArray jSONArray = new JSONArray();
            Iterator<qks> it = this.c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().c());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public void g(double d) {
        this.l = d;
    }

    public void h(long j) {
        if (j > 0) {
            this.n = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    public synchronized void i(qks qksVar) {
        v(qksVar.f31615b);
        this.c.add(qksVar);
    }

    public synchronized void j(String str) {
        i(new qks(str));
    }

    public void k(String str, int i, long j, long j2, Exception exc) {
        n(str, new lis(i, j, j2, exc));
    }

    public void l(String str, long j, long j2) {
        try {
            s(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    public void m(String str, long j, long j2, Exception exc) {
        try {
            t(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public synchronized void n(String str, lis lisVar) {
        for (qks qksVar : this.c) {
            if (TextUtils.equals(str, qksVar.f31615b)) {
                qksVar.d(lisVar);
                break;
            }
        }
    }

    public synchronized void o(String[] strArr) {
        int i;
        try {
            int size = this.c.size() - 1;
            while (true) {
                i = 0;
                if (size < 0) {
                    break;
                }
                int length = strArr.length;
                while (i < length) {
                    if (TextUtils.equals(this.c.get(size).f31615b, strArr[i])) {
                        this.c.remove(size);
                        break;
                    }
                    i++;
                }
                size--;
            }
            Iterator<qks> it = this.c.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = it.next().d;
                if (i3 > i2) {
                    i2 = i3;
                }
            }
            while (i < strArr.length) {
                i(new qks(strArr[i], (strArr.length + i2) - i));
                i++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean p() {
        return TextUtils.equals(this.f26231a, wjs.d());
    }

    public boolean q(mis misVar) {
        return TextUtils.equals(this.f26231a, misVar.f26231a);
    }

    public void r(String str) {
        this.m = str;
    }

    public void s(String str, long j, long j2) {
        k(str, 0, j, j2, null);
    }

    public void t(String str, long j, long j2, Exception exc) {
        k(str, -1, j, j2, exc);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26231a);
        sb.append("\n");
        sb.append(b());
        for (qks qksVar : this.c) {
            sb.append("\n");
            sb.append(qksVar.toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public boolean u() {
        return System.currentTimeMillis() - this.f26232b < this.n;
    }

    public final synchronized void v(String str) {
        Iterator<qks> it = this.c.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f31615b, str)) {
                it.remove();
            }
        }
    }

    public boolean w() {
        long j = this.n;
        if (864000000 >= j) {
            j = 864000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f26232b;
        return jCurrentTimeMillis - j2 > j || (jCurrentTimeMillis - j2 > this.n && this.f26231a.startsWith("WIFI-"));
    }
}
