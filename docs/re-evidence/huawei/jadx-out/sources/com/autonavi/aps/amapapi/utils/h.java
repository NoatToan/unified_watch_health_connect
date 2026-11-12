package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.iq;
import com.amap.api.col.p0003sl.ns;
import com.amap.api.location.AMapLocation;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static h f;
    private static long i;
    private File d;
    private String e;
    private Context g;
    private boolean h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap<String, Long> f4006c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f4004a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f4005b = null;

    public static h a(Context context) {
        h hVar;
        synchronized (h.class) {
            if (f == null) {
                f = new h(context);
            }
            hVar = f;
        }
        return hVar;
    }

    private h(Context context) {
        this.e = null;
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        String path = applicationContext.getFilesDir().getPath();
        if (this.e == null) {
            this.e = k.l(this.g);
        }
        try {
            this.d = new File(path, "reportRecorder");
        } catch (Throwable th) {
            ns.a(th);
        }
        c();
    }

    public final void a() {
        synchronized (this) {
            if (this.h) {
                d();
                this.h = false;
            }
        }
    }

    public final void a(AMapLocation aMapLocation) {
        synchronized (this) {
            try {
                if ((!this.f4006c.containsKey(this.f4004a) && this.f4006c.size() >= 8) || (this.f4006c.containsKey(this.f4004a) && this.f4006c.size() >= 9)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<String, Long>> it = this.f4006c.entrySet().iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(it.next().getKey());
                            if (arrayList.size() == this.f4006c.size() - 7) {
                                break;
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        this.f4006c.remove((String) it2.next());
                    }
                }
                if (aMapLocation.getErrorCode() != 0) {
                    return;
                }
                if (aMapLocation.getLocationType() != 6 && aMapLocation.getLocationType() != 5) {
                    if (this.f4006c.containsKey(this.f4004a)) {
                        long jLongValue = this.f4006c.get(this.f4004a).longValue() + 1;
                        i = jLongValue;
                        this.f4006c.put(this.f4004a, Long.valueOf(jLongValue));
                    } else {
                        this.f4006c.put(this.f4004a, 1L);
                        i = 1L;
                    }
                    long j = i;
                    if (j != 0 && j % 100 == 0) {
                        a();
                    }
                    this.h = true;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (b(this.g)) {
                    for (Map.Entry<String, Long> entry : this.f4006c.entrySet()) {
                        try {
                            if (!this.f4004a.equals(entry.getKey())) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("param_long_first", entry.getKey());
                                jSONObject.put("param_long_second", entry.getValue());
                                i.a(this.g, "O023", jSONObject);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private boolean b(Context context) {
        if (this.f4005b == null) {
            this.f4005b = j.a(context, "pref", "lastavedate", "0");
        }
        if (this.f4005b.equals(this.f4004a)) {
            return false;
        }
        SharedPreferences.Editor editorA = j.a(context, "pref");
        j.a(editorA, "lastavedate", this.f4004a);
        j.a(editorA);
        this.f4005b = this.f4004a;
        return true;
    }

    private void c() {
        synchronized (this) {
            LinkedHashMap<String, Long> linkedHashMap = this.f4006c;
            if (linkedHashMap == null || linkedHashMap.size() <= 0) {
                try {
                    this.f4004a = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
                    Iterator<String> it = k.a(this.d).iterator();
                    while (it.hasNext()) {
                        try {
                            try {
                                String[] strArrSplit = new String(com.autonavi.aps.amapapi.security.a.b(iq.b(it.next()), this.e), "UTF-8").split(",");
                                if (strArrSplit != null && strArrSplit.length > 1) {
                                    this.f4006c.put(strArrSplit[0], Long.valueOf(Long.parseLong(strArrSplit[1])));
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }

    private void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> entry : this.f4006c.entrySet()) {
                try {
                    sb.append(iq.b(com.autonavi.aps.amapapi.security.a.a((entry.getKey() + "," + entry.getValue()).getBytes("UTF-8"), this.e)) + "\n");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            k.a(this.d, string);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
