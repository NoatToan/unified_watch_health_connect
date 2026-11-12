package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import defpackage.fbt;
import defpackage.j0t;
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
    private LinkedHashMap<String, Long> c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f6912a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f6913b = null;

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
            fbt.a(th);
        }
        c();
    }

    public static synchronized h a(Context context) {
        try {
            if (f == null) {
                f = new h(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    private synchronized void c() {
        LinkedHashMap<String, Long> linkedHashMap = this.c;
        if (linkedHashMap == null || linkedHashMap.size() <= 0) {
            try {
                this.f6912a = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis()));
                Iterator<String> it = k.a(this.d).iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            String[] strArrSplit = new String(com.autonavi.aps.amapapi.security.a.b(j0t.g(it.next()), this.e), "UTF-8").split(",");
                            if (strArrSplit != null && strArrSplit.length > 1) {
                                this.c.put(strArrSplit[0], Long.valueOf(Long.parseLong(strArrSplit[1])));
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

    private void d() {
        try {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                try {
                    sb.append(j0t.f(com.autonavi.aps.amapapi.security.a.a((entry.getKey() + "," + entry.getValue()).getBytes("UTF-8"), this.e)) + "\n");
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

    public final synchronized void b() {
        try {
            if (b(this.g)) {
                for (Map.Entry<String, Long> entry : this.c.entrySet()) {
                    try {
                        if (!this.f6912a.equals(entry.getKey())) {
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

    public final synchronized void a() {
        if (this.h) {
            d();
            this.h = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:14:0x002d, B:15:0x003c, B:17:0x0042, B:23:0x005f, B:24:0x0063, B:25:0x0067, B:27:0x006d, B:28:0x0079, B:32:0x0081, B:34:0x0088, B:37:0x0090, B:39:0x009c, B:41:0x00c6, B:43:0x00ce, B:45:0x00d5, B:46:0x00d8, B:40:0x00b9, B:10:0x0019, B:12:0x0023, B:18:0x0048), top: B:59:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:14:0x002d, B:15:0x003c, B:17:0x0042, B:23:0x005f, B:24:0x0063, B:25:0x0067, B:27:0x006d, B:28:0x0079, B:32:0x0081, B:34:0x0088, B:37:0x0090, B:39:0x009c, B:41:0x00c6, B:43:0x00ce, B:45:0x00d5, B:46:0x00d8, B:40:0x00b9, B:10:0x0019, B:12:0x0023, B:18:0x0048), top: B:59:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[Catch: all -> 0x0016, LOOP:1: B:25:0x0067->B:27:0x006d, LOOP_END, TryCatch #1 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:14:0x002d, B:15:0x003c, B:17:0x0042, B:23:0x005f, B:24:0x0063, B:25:0x0067, B:27:0x006d, B:28:0x0079, B:32:0x0081, B:34:0x0088, B:37:0x0090, B:39:0x009c, B:41:0x00c6, B:43:0x00ce, B:45:0x00d5, B:46:0x00d8, B:40:0x00b9, B:10:0x0019, B:12:0x0023, B:18:0x0048), top: B:59:0x0001, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0063 A[EDGE_INSN: B:64:0x0063->B:24:0x0063 BREAK  A[LOOP:0: B:15:0x003c->B:66:0x003c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x003c A[SYNTHETIC] */
    public final synchronized void a(AMapLocation aMapLocation) {
        ArrayList arrayList;
        Iterator<Map.Entry<String, Long>> it;
        Iterator it2;
        try {
            if (this.c.containsKey(this.f6912a) || this.c.size() < 8) {
                if (this.c.containsKey(this.f6912a) && this.c.size() >= 9) {
                    arrayList = new ArrayList();
                    it = this.c.entrySet().iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(it.next().getKey());
                            if (arrayList.size() == this.c.size() - 7) {
                                break;
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        this.c.remove((String) it2.next());
                    }
                }
            } else {
                arrayList = new ArrayList();
                it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getKey());
                    if (arrayList.size() == this.c.size() - 7) {
                        break;
                        break;
                    }
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.c.remove((String) it2.next());
                }
            }
            if (aMapLocation.getErrorCode() != 0) {
                return;
            }
            if (aMapLocation.getLocationType() != 6 && aMapLocation.getLocationType() != 5) {
                if (this.c.containsKey(this.f6912a)) {
                    long jLongValue = this.c.get(this.f6912a).longValue() + 1;
                    i = jLongValue;
                    this.c.put(this.f6912a, Long.valueOf(jLongValue));
                } else {
                    this.c.put(this.f6912a, 1L);
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

    private boolean b(Context context) {
        if (this.f6913b == null) {
            this.f6913b = j.a(context, "pref", "lastavedate", "0");
        }
        if (this.f6913b.equals(this.f6912a)) {
            return false;
        }
        SharedPreferences.Editor editorA = j.a(context, "pref");
        j.a(editorA, "lastavedate", this.f6912a);
        j.a(editorA);
        this.f6913b = this.f6912a;
        return true;
    }
}
