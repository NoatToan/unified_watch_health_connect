package com.huawei.hms.network.file.a;

import com.huawei.hms.network.file.core.util.FLogger;
import com.huawei.hms.network.inner.utils.CheckConfigUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f15675c = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, b> f15676a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, b> f15677b = new HashMap();

    public void e() {
        try {
            JSONObject jSONObject = new JSONObject(com.huawei.hms.network.file.core.b.a("file_manager|filemanager_protocol_policy"));
            if (jSONObject.has("filesize")) {
                a(jSONObject.getString("filesize"), this.f15676a);
            }
            if (jSONObject.has("upload_filesize")) {
                a(jSONObject.getString("upload_filesize"), this.f15677b);
            }
        } catch (JSONException e) {
            FLogger.w("DownloadProtocolChoose", e.getMessage(), new Object[0]);
        }
    }

    public boolean d() {
        return this.f15676a.containsKey("h3_pcc") || this.f15677b.containsKey("h3_pcc");
    }

    public boolean c() {
        return this.f15676a.containsKey("h3_pcc_multipath") || this.f15677b.containsKey("h3_pcc_multipath");
    }

    public boolean b() {
        return this.f15676a.containsKey(CheckConfigUtils.Constants.HTTP_2) || this.f15677b.containsKey(CheckConfigUtils.Constants.HTTP_2);
    }

    public boolean a(int i) {
        return !(i == 0 ? this.f15676a : this.f15677b).isEmpty();
    }

    public boolean a() {
        return this.f15676a.containsKey("h1") || this.f15677b.containsKey("h1");
    }

    public void a(String str, Map<String, b> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String[] strArrSplit = jSONObject.getString(next).split(";");
                b bVar = new b(strArrSplit.length);
                int i = 0;
                while (true) {
                    if (i >= strArrSplit.length) {
                        if (bVar.f15680a <= 0) {
                            break;
                        }
                        map.put(next, bVar);
                        break;
                    } else if (!a(next, strArrSplit[i], bVar, i)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } catch (Exception e) {
            FLogger.w("DownloadProtocolChoose", e.getMessage(), new Object[0]);
        }
    }

    public String a(int i, long j) {
        if (i == 0) {
            for (String str : this.f15676a.keySet()) {
                if (a(i, j, str)) {
                    return str;
                }
            }
            return "";
        }
        for (String str2 : this.f15677b.keySet()) {
            if (a(i, j, str2)) {
                return str2;
            }
        }
        return "";
    }

    public static h f() {
        return f15675c;
    }

    private boolean a(String str, String str2, b bVar, int i) {
        String[] strArrSplit = str2.split(Constants.LINK);
        if (strArrSplit.length != 2) {
            FLogger.e("DownloadProtocolChoose", "invalid config:" + str);
            return false;
        }
        FLogger.d("DownloadProtocolChoose", str + strArrSplit[0] + Constants.LINK + strArrSplit[1], new Object[0]);
        bVar.a(i, Long.parseLong(strArrSplit[0]), Long.parseLong(strArrSplit[1]));
        return true;
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f15678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f15679b;

        public String toString() {
            return "FileSize{minFileSize=" + this.f15678a + ", maxFileSize=" + this.f15679b + '}';
        }

        public a(h hVar, long j, long j2) {
            this.f15678a = j;
            this.f15679b = j2;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a[] f15681b;

        public void a(int i, long j, long j2) {
            this.f15681b[i] = new a(h.this, j, j2);
        }

        public b(int i) {
            this.f15680a = i;
            this.f15681b = new a[i];
        }
    }

    private boolean a(int i, long j, String str) {
        if (i == 0) {
            for (a aVar : this.f15676a.get(str).f15681b) {
                if (j > aVar.f15678a && j <= aVar.f15679b) {
                    return true;
                }
            }
            return false;
        }
        for (a aVar2 : this.f15677b.get(str).f15681b) {
            if (j > aVar2.f15678a && j <= aVar2.f15679b) {
                return true;
            }
        }
        return false;
    }

    private h() {
    }
}
