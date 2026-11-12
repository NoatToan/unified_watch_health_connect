package com.loc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.huami.nfc.base.PayResponse;
import com.huami.watch.notification.TransportUri;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.market.sdk.Constants;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class dy {
    public Hashtable<String, ArrayList<a>> a = new Hashtable<>();
    private long i = 0;
    private boolean j = false;
    private String k = "2.0.201501131131".replace(".", "");
    private String l = null;
    public boolean b = true;
    public long c = 0;
    public String d = null;
    public du e = null;
    private String m = null;
    private long n = 0;
    public boolean f = true;
    public boolean g = true;
    public String h = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);

    public static class a {
        private dr a = null;
        private String b = null;

        public final dr a() {
            return this.a;
        }

        public final void a(dr drVar) {
            this.a = drVar;
        }

        public final void a(String str) {
            this.b = TextUtils.isEmpty(str) ? null : str.replace("##", UpdateUtils.CMD_FILTER);
        }

        public final String b() {
            return this.b;
        }
    }

    private dr a(String str, StringBuilder sb) {
        a aVarA;
        try {
            if (str.contains("cgiwifi") || str.contains("wifi")) {
                aVarA = a(sb, str);
            } else {
                aVarA = (str.contains("cgi") && this.a.containsKey(str) && this.a.get(str).size() > 0) ? this.a.get(str).get(0) : null;
            }
            if (aVarA != null && eo.a(aVarA.a())) {
                dr drVarA = aVarA.a();
                drVarA.e("mem");
                drVarA.h(aVarA.b());
                if (eh.b(drVarA.getTime())) {
                    if (eo.a(drVarA)) {
                        this.c = 0L;
                    }
                    drVarA.setLocationType(4);
                    return drVarA;
                }
                Hashtable<String, ArrayList<a>> hashtable = this.a;
                if (hashtable != null && hashtable.containsKey(str)) {
                    this.a.get(str).remove(aVarA);
                }
            }
        } catch (Throwable th) {
            ei.a(th, "Cache", "get1");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[LOOP:1: B:41:0x00df->B:43:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff A[LOOP:2: B:45:0x00f9->B:47:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0149 A[SYNTHETIC] */
    private a a(StringBuilder sb, String str) {
        a aVar;
        boolean zContains;
        boolean z;
        Iterator it2;
        Iterator it3;
        double[] dArr;
        double[] dArr2;
        Iterator it4;
        int i;
        double[] dArrA;
        String str2;
        double d;
        double d2;
        if (this.a.isEmpty() || TextUtils.isEmpty(sb)) {
            return null;
        }
        if (!this.a.containsKey(str)) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        ArrayList<a> arrayList = this.a.get(str);
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                aVar = null;
                break;
            }
            a aVar2 = arrayList.get(size);
            if (!TextUtils.isEmpty(aVar2.b())) {
                String strB = aVar2.b();
                if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(sb) && strB.contains(",access")) {
                    if (sb.indexOf(",access") != -1) {
                        String[] strArrSplit = strB.split(",access");
                        String strSubstring = strArrSplit[0].contains(UpdateUtils.CMD_FILTER) ? strArrSplit[0].substring(strArrSplit[0].lastIndexOf(UpdateUtils.CMD_FILTER) + 1) : strArrSplit[0];
                        if (!TextUtils.isEmpty(strSubstring)) {
                            zContains = sb.toString().contains(strSubstring + ",access");
                        }
                    }
                    if (zContains) {
                        if (eo.a(aVar2.b(), sb.toString())) {
                            z = true;
                        }
                        aVar = aVar2;
                        break;
                    }
                    z = false;
                    a(aVar2.b(), (Hashtable<String, String>) hashtable);
                    a(sb.toString(), (Hashtable<String, String>) hashtable2);
                    hashtable3.clear();
                    it2 = hashtable.keySet().iterator();
                    while (it2.hasNext()) {
                        hashtable3.put((String) it2.next(), "");
                    }
                    it3 = hashtable2.keySet().iterator();
                    while (it3.hasNext()) {
                        hashtable3.put((String) it3.next(), "");
                    }
                    Set setKeySet = hashtable3.keySet();
                    dArr = new double[setKeySet.size()];
                    dArr2 = new double[setKeySet.size()];
                    it4 = setKeySet.iterator();
                    i = 0;
                    while (it4 != null && it4.hasNext()) {
                        str2 = (String) it4.next();
                        d = 1.0d;
                        if (hashtable.containsKey(str2)) {
                            d2 = 1.0d;
                        } else {
                            d2 = 0.0d;
                        }
                        dArr[i] = d2;
                        if (hashtable2.containsKey(str2)) {
                            d = 0.0d;
                        }
                        dArr2[i] = d;
                        i++;
                    }
                    setKeySet.clear();
                    dArrA = a(dArr, dArr2);
                    if (dArrA[0] < 0.800000011920929d || dArrA[1] >= 0.618d || (z && dArrA[0] >= 0.618d)) {
                        aVar = aVar2;
                        break;
                    }
                }
                zContains = false;
                if (zContains) {
                    if (eo.a(aVar2.b(), sb.toString())) {
                        z = true;
                    }
                    aVar = aVar2;
                    break;
                }
                z = false;
                a(aVar2.b(), (Hashtable<String, String>) hashtable);
                a(sb.toString(), (Hashtable<String, String>) hashtable2);
                hashtable3.clear();
                it2 = hashtable.keySet().iterator();
                while (it2.hasNext()) {
                    hashtable3.put((String) it2.next(), "");
                }
                it3 = hashtable2.keySet().iterator();
                while (it3.hasNext()) {
                    hashtable3.put((String) it3.next(), "");
                }
                Set setKeySet2 = hashtable3.keySet();
                dArr = new double[setKeySet2.size()];
                dArr2 = new double[setKeySet2.size()];
                it4 = setKeySet2.iterator();
                i = 0;
                while (it4 != null) {
                    str2 = (String) it4.next();
                    d = 1.0d;
                    if (hashtable.containsKey(str2)) {
                        d2 = 1.0d;
                    } else {
                        d2 = 0.0d;
                    }
                    dArr[i] = d2;
                    if (hashtable2.containsKey(str2)) {
                        d = 0.0d;
                    }
                    dArr2[i] = d;
                    i++;
                }
                setKeySet2.clear();
                dArrA = a(dArr, dArr2);
                if (dArrA[0] < 0.800000011920929d) {
                }
                aVar = aVar2;
                break;
            }
            size--;
        }
        hashtable.clear();
        hashtable2.clear();
        hashtable3.clear();
        return aVar;
    }

    private String a(String str, StringBuilder sb, Context context) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.l == null) {
                this.l = dx.a("MD5", k.c(context));
            }
            if (str.contains(com.alipay.sdk.m.s.a.l)) {
                str = str.substring(0, str.indexOf(com.alipay.sdk.m.s.a.l));
            }
            String strSubstring = str.substring(str.lastIndexOf(UpdateUtils.CMD_FILTER) + 1);
            if (strSubstring.equals("cgi")) {
                jSONObject.put("cgi", str.substring(0, str.length() - 12));
            } else if (!TextUtils.isEmpty(sb) && sb.indexOf(",access") != -1) {
                jSONObject.put("cgi", str.substring(0, str.length() - (strSubstring.length() + 9)));
                String[] strArrSplit = sb.toString().split(",access");
                jSONObject.put("mmac", strArrSplit[0].contains(UpdateUtils.CMD_FILTER) ? strArrSplit[0].substring(strArrSplit[0].lastIndexOf(UpdateUtils.CMD_FILTER) + 1) : strArrSplit[0]);
            }
            return o.b(dx.a(jSONObject.toString().getBytes("UTF-8"), this.l));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0281 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:105:0x0286 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:107:0x028c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:130:0x0247 A[EDGE_INSN: B:130:0x0247->B:82:0x0247 BREAK  A[LOOP:0: B:33:0x00b2->B:84:0x0257], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x010e A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #3 {all -> 0x00a8, blocks: (B:26:0x009b, B:36:0x00cb, B:38:0x00e5, B:39:0x00e9, B:43:0x00fe, B:45:0x010e, B:64:0x019d, B:66:0x01a3, B:68:0x01cf, B:69:0x01dc, B:70:0x01e1, B:40:0x00ed, B:42:0x00f3, B:49:0x013e, B:50:0x0151, B:59:0x0185, B:54:0x015b), top: B:123:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0185 A[Catch: all -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00a8, blocks: (B:26:0x009b, B:36:0x00cb, B:38:0x00e5, B:39:0x00e9, B:43:0x00fe, B:45:0x010e, B:64:0x019d, B:66:0x01a3, B:68:0x01cf, B:69:0x01dc, B:70:0x01e1, B:40:0x00ed, B:42:0x00f3, B:49:0x013e, B:50:0x0151, B:59:0x0185, B:54:0x015b), top: B:123:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0257 A[LOOP:0: B:33:0x00b2->B:84:0x0257, LOOP_END] */
    private void a(Context context, String str) throws Exception {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String string;
        StringBuilder sb;
        if (eh.m() && context != null) {
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                int i = 0;
                SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                try {
                    try {
                        if (!eo.a(sQLiteDatabaseOpenOrCreateDatabase, "hist")) {
                            if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                                return;
                            }
                            sQLiteDatabaseOpenOrCreateDatabase.close();
                            return;
                        }
                        long jA = eo.a() - eh.l();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("time >");
                        sb2.append(jA);
                        if (str != null) {
                            sb2.append(" and feature = '");
                            sb2.append(str + "'");
                        }
                        StringBuilder sb3 = sb2;
                        cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("hist" + this.k, new String[]{Constants.JSON_FEATURE, " nb", "loc"}, sb2.toString(), null, null, null, "time ASC", null);
                        try {
                            StringBuilder sb4 = new StringBuilder();
                            if (this.l == null) {
                                try {
                                    this.l = dx.a("MD5", k.c(context));
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabase2 = sQLiteDatabaseOpenOrCreateDatabase;
                                    ei.a(th, "DB", "fetchHist p2");
                                }
                            }
                            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                                sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                            } else {
                                while (true) {
                                    String str2 = ",access";
                                    if (cursorQuery.getString(i).startsWith("{")) {
                                        jSONObject2 = new JSONObject(cursorQuery.getString(i));
                                        sb4.delete(i, sb4.length());
                                        if (!TextUtils.isEmpty(cursorQuery.getString(1))) {
                                            str2 = cursorQuery.getString(1);
                                        } else if (eo.a(jSONObject2, "mmac")) {
                                            sb4.append(UpdateUtils.CMD_FILTER);
                                            sb4.append(jSONObject2.getString("mmac"));
                                        } else {
                                            jSONObject = new JSONObject(cursorQuery.getString(2));
                                            if (eo.a(jSONObject, "type")) {
                                                jSONObject.put("type", "new");
                                            }
                                        }
                                        sb4.append(str2);
                                        jSONObject = new JSONObject(cursorQuery.getString(2));
                                        if (eo.a(jSONObject, "type")) {
                                            jSONObject.put("type", "new");
                                        }
                                    } else {
                                        JSONObject jSONObject3 = new JSONObject(new String(dx.b(o.b(cursorQuery.getString(i)), this.l), "UTF-8"));
                                        sb4.delete(0, sb4.length());
                                        if (TextUtils.isEmpty(cursorQuery.getString(1))) {
                                            if (eo.a(jSONObject3, "mmac")) {
                                                sb4.append(UpdateUtils.CMD_FILTER);
                                                sb4.append(jSONObject3.getString("mmac"));
                                            }
                                            jSONObject = new JSONObject(new String(dx.b(o.b(cursorQuery.getString(2)), this.l), "UTF-8"));
                                            if (eo.a(jSONObject, "type")) {
                                                jSONObject.put("type", "new");
                                            }
                                            jSONObject2 = jSONObject3;
                                        } else {
                                            str2 = new String(dx.b(o.b(cursorQuery.getString(1)), this.l), "UTF-8");
                                        }
                                        sb4.append(str2);
                                        jSONObject = new JSONObject(new String(dx.b(o.b(cursorQuery.getString(2)), this.l), "UTF-8"));
                                        if (eo.a(jSONObject, "type")) {
                                            jSONObject.put("type", "new");
                                        }
                                        jSONObject2 = jSONObject3;
                                    }
                                    dr drVar = new dr("");
                                    drVar.b(jSONObject);
                                    try {
                                        if (eo.a(jSONObject2, "mmac") && eo.a(jSONObject2, "cgi")) {
                                            String str3 = (jSONObject2.getString("cgi") + UpdateUtils.CMD_FILTER) + "network#";
                                            if (jSONObject2.getString("cgi").contains(UpdateUtils.CMD_FILTER)) {
                                                sb = new StringBuilder();
                                                sb.append(str3);
                                                sb.append("cgiwifi");
                                            } else {
                                                sb = new StringBuilder();
                                                sb.append(str3);
                                                sb.append("wifi");
                                            }
                                            string = sb.toString();
                                        } else {
                                            if (eo.a(jSONObject2, "cgi")) {
                                                String str4 = (jSONObject2.getString("cgi") + UpdateUtils.CMD_FILTER) + "network#";
                                                if (jSONObject2.getString("cgi").contains(UpdateUtils.CMD_FILTER)) {
                                                    string = str4 + "cgi";
                                                }
                                                if (!cursorQuery.moveToNext()) {
                                                    break;
                                                }
                                                sb3 = sb3;
                                                sQLiteDatabaseOpenOrCreateDatabase = sQLiteDatabase;
                                                i = 0;
                                            }
                                            sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                                break;
                                            } else {
                                                sb3 = sb3;
                                                sQLiteDatabaseOpenOrCreateDatabase = sQLiteDatabase;
                                                i = 0;
                                            }
                                        }
                                        a(string, sb4, drVar, context, false);
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                            break;
                                        } else {
                                            sb3 = sb3;
                                            sQLiteDatabaseOpenOrCreateDatabase = sQLiteDatabase;
                                            i = 0;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                                }
                                sb4.delete(0, sb4.length());
                                sb3.delete(0, sb3.length());
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursorQuery = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                    cursorQuery = null;
                }
                sQLiteDatabase2 = sQLiteDatabase;
            } catch (Throwable th6) {
                th = th6;
                cursorQuery = null;
            }
            try {
                ei.a(th, "DB", "fetchHist p2");
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                    sQLiteDatabase2.close();
                }
            }
        }
    }

    private void a(String str, AMapLocation aMapLocation, StringBuilder sb, Context context) throws Exception {
        if (context == null) {
            return;
        }
        if (this.l == null) {
            this.l = dx.a("MD5", k.c(context));
        }
        String strA = a(str, sb, context);
        StringBuilder sb2 = new StringBuilder();
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
            sb2.append("CREATE TABLE IF NOT EXISTS hist");
            sb2.append(this.k);
            sb2.append(" (feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR);");
            sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb2.toString());
            sb2.delete(0, sb2.length());
            sb2.append("REPLACE INTO ");
            sb2.append("hist");
            sb2.append(this.k);
            sb2.append(" VALUES (?, ?, ?, ?)");
            Object[] objArr = new Object[4];
            objArr[0] = strA;
            byte[] bArrA = dx.a(sb.toString().getBytes("UTF-8"), this.l);
            objArr[1] = bArrA;
            objArr[2] = dx.a(aMapLocation.toStr().getBytes("UTF-8"), this.l);
            objArr[3] = Long.valueOf(aMapLocation.getTime());
            for (int i = 1; i < 3; i++) {
                objArr[i] = o.b((byte[]) objArr[i]);
            }
            sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb2.toString(), objArr);
            sb2.delete(0, sb2.length());
            sb2.delete(0, sb2.length());
            if (sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
            }
        } catch (Throwable th) {
            try {
                ei.a(th, "DB", "updateHist");
            } finally {
                sb2.delete(0, sb2.length());
                if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                }
            }
        }
    }

    private static void a(String str, Hashtable<String, String> hashtable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hashtable.clear();
        for (String str2 : str.split(UpdateUtils.CMD_FILTER)) {
            if (!TextUtils.isEmpty(str2) && !str2.contains(AESEncryptionHelper.SEPARATOR)) {
                hashtable.put(str2, "");
            }
        }
    }

    private static double[] a(double[] dArr, double[] dArr2) {
        double[] dArr3 = new double[3];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < dArr.length; i3++) {
            d2 += dArr[i3] * dArr[i3];
            d3 += dArr2[i3] * dArr2[i3];
            d += dArr[i3] * dArr2[i3];
            if (dArr2[i3] == 1.0d) {
                i2++;
                if (dArr[i3] == 1.0d) {
                    i++;
                }
            }
        }
        dArr3[0] = d / (Math.sqrt(d2) * Math.sqrt(d3));
        double d4 = i;
        dArr3[1] = (d4 * 1.0d) / ((double) i2);
        dArr3[2] = d4;
        for (int i4 = 0; i4 < 2; i4++) {
            if (dArr3[i4] > 1.0d) {
                dArr3[i4] = 1.0d;
            }
        }
        return dArr3;
    }

    private boolean b() {
        long jB = eo.b();
        long j = this.i;
        long j2 = jB - j;
        if (j == 0) {
            return false;
        }
        return this.a.size() > 360 || j2 > 36000000;
    }

    private void c() {
        this.i = 0L;
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        this.j = false;
    }

    public final dr a(Context context, String str, StringBuilder sb, boolean z) {
        if (TextUtils.isEmpty(str) || !eh.m()) {
            return null;
        }
        String str2 = str + com.alipay.sdk.m.s.a.l + this.f + com.alipay.sdk.m.s.a.l + this.g + com.alipay.sdk.m.s.a.l + this.h;
        if (str2.contains("gps") || !eh.m() || sb == null) {
            return null;
        }
        if (b()) {
            c();
            return null;
        }
        if (z && !this.j) {
            try {
                String strA = a(str2, sb, context);
                c();
                a(context, strA);
            } catch (Throwable unused) {
            }
        }
        if (this.a.isEmpty()) {
            return null;
        }
        return a(str2, sb);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ee A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:21:0x0030, B:23:0x0036, B:33:0x004a, B:41:0x0069, B:45:0x0071, B:47:0x007f, B:59:0x00a4, B:61:0x00ad, B:63:0x00b1, B:65:0x00b7, B:67:0x00c2, B:77:0x00e2, B:80:0x00ee, B:89:0x00fe, B:68:0x00c5, B:69:0x00c9, B:70:0x00ce, B:72:0x00d2, B:73:0x00d7, B:60:0x00ab, B:53:0x0091, B:55:0x0097, B:25:0x003a, B:27:0x003e), top: B:93:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8 A[ADDED_TO_REGION] */
    public final dr a(dv dvVar, boolean z, dr drVar, dw dwVar, StringBuilder sb, String str, Context context, boolean z2) {
        du duVar;
        boolean z3;
        boolean zA;
        long jA;
        String str2;
        dr drVarA;
        String str3;
        boolean z4 = true;
        if (!((this.b && (eh.m() || z2)) && (drVar == null || (eh.b(drVar.getTime()) && !z2)))) {
            return null;
        }
        try {
            du duVarD = dvVar.d();
            boolean z5 = !(duVarD == null && this.e == null) && ((duVar = this.e) == null || !duVar.equals(duVarD));
            if (drVar != null) {
                int size = dwVar.e().size();
                if (drVar.getAccuracy() <= 299.0f || size <= 5) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            if (drVar == null || (str3 = this.d) == null || z3 || z5) {
                zA = false;
            } else {
                zA = eo.a(str3, sb.toString());
                boolean z6 = this.c != 0 && eo.b() - this.c < 3000;
                if ((zA || z6) && eo.a(drVar)) {
                    drVar.e("mem");
                    drVar.setLocationType(2);
                    return drVar;
                }
            }
            if (zA) {
                this.c = 0L;
            } else {
                this.c = eo.b();
            }
            String str4 = this.m;
            if (str4 != null && !str.equals(str4)) {
                if (eo.a() - this.n < 3000) {
                    str2 = this.m;
                } else {
                    jA = eo.a();
                }
                if (z3) {
                    drVarA = null;
                } else {
                    drVarA = null;
                }
                if (z) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                }
                return null;
            }
            if (this.m == null) {
                jA = eo.a();
            } else {
                this.n = eo.a();
            }
            str2 = str;
            if (z3 || z) {
                drVarA = null;
            } else {
                drVarA = a(context, str2, sb, false);
            }
            if (z || eo.a(drVarA)) {
                z4 = false;
            }
            if (!z4 || z3 || z) {
                return null;
            }
            this.c = 0L;
            drVarA.setLocationType(4);
            return drVarA;
            this.n = jA;
            this.m = str;
            str2 = str;
            if (z3) {
                drVarA = null;
            } else {
                drVarA = null;
            }
            if (z) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void a() {
        this.c = 0L;
        this.d = null;
    }

    public final void a(Context context) {
        if (this.j) {
            return;
        }
        try {
            c();
            a(context, (String) null);
        } catch (Throwable th) {
            ei.a(th, "Cache", "loadDB");
        }
        this.j = true;
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.g = aMapLocationClientOption.isNeedAddress();
        this.f = aMapLocationClientOption.isOffset();
        this.b = aMapLocationClientOption.isLocationCacheEnable();
        this.h = String.valueOf(aMapLocationClientOption.getGeoLanguage());
    }

    public final void a(du duVar) {
        this.e = duVar;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(String str, StringBuilder sb, dr drVar, Context context, boolean z) {
        try {
            if (eo.a(drVar)) {
                String str2 = str + com.alipay.sdk.m.s.a.l + drVar.isOffset() + com.alipay.sdk.m.s.a.l + drVar.i() + com.alipay.sdk.m.s.a.l + drVar.j();
                if (!((TextUtils.isEmpty(str2) || !eo.a(drVar) || str2.startsWith(UpdateUtils.CMD_FILTER)) ? false : str2.contains("network")) || drVar.e().equals("mem") || drVar.e().equals("file") || drVar.e().equals("wifioff") || PayResponse.CODE_NFC_CHANNEL_ERROR.equals(drVar.d())) {
                    return;
                }
                if (b()) {
                    c();
                }
                JSONObject jSONObjectF = drVar.f();
                if (eo.a(jSONObjectF, "offpct")) {
                    jSONObjectF.remove("offpct");
                    drVar.a(jSONObjectF);
                }
                if (str2.contains("wifi")) {
                    if (TextUtils.isEmpty(sb)) {
                        return;
                    }
                    if (drVar.getAccuracy() >= 300.0f) {
                        int i = 0;
                        for (String str3 : sb.toString().split(UpdateUtils.CMD_FILTER)) {
                            if (str3.contains(",")) {
                                i++;
                            }
                        }
                        if (i >= 8) {
                            return;
                        }
                    } else if (drVar.getAccuracy() <= 3.0f) {
                        return;
                    }
                    if (str2.contains("cgiwifi") && !TextUtils.isEmpty(drVar.g())) {
                        String strReplace = str2.replace("cgiwifi", "cgi");
                        dr drVarH = drVar.h();
                        if (eo.a(drVarH)) {
                            a(strReplace, new StringBuilder(), drVarH, context, true);
                        }
                    }
                } else if (str2.contains("cgi") && ((sb != null && sb.indexOf(",") != -1) || "4".equals(drVar.d()))) {
                    return;
                }
                dr drVarA = a(str2, sb);
                if (eo.a(drVarA) && drVarA.toStr().equals(drVar.toStr(3))) {
                    return;
                }
                this.i = eo.b();
                a aVar = new a();
                aVar.a(drVar);
                aVar.a(TextUtils.isEmpty(sb) ? null : sb.toString());
                if (this.a.containsKey(str2)) {
                    this.a.get(str2).add(aVar);
                } else {
                    ArrayList<a> arrayList = new ArrayList<>();
                    arrayList.add(aVar);
                    this.a.put(str2, arrayList);
                }
                if (z) {
                    try {
                        a(str2, drVar, sb, context);
                    } catch (Throwable th) {
                        ei.a(th, "Cache", TransportUri.ACTION_ADD);
                    }
                }
            }
        } catch (Throwable th2) {
            ei.a(th2, "Cache", TransportUri.ACTION_ADD);
        }
    }

    public final void b(Context context) {
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        try {
            c();
            if (context != null) {
                try {
                    sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                    try {
                        if (eo.a(sQLiteDatabaseOpenOrCreateDatabase, "hist")) {
                            try {
                                sQLiteDatabaseOpenOrCreateDatabase.delete("hist" + this.k, "time<?", new String[]{String.valueOf(eo.a() - 86400000)});
                            } catch (Throwable th) {
                                ei.a(th, "DB", "clearHist");
                                String message = th.getMessage();
                                if (!TextUtils.isEmpty(message)) {
                                    message.contains("no such table");
                                }
                            }
                            if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                        } else if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                            sQLiteDatabaseOpenOrCreateDatabase.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            ei.a(th, "DB", "clearHist p2");
                            if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                        } catch (Throwable th3) {
                            if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                                sQLiteDatabaseOpenOrCreateDatabase.close();
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseOpenOrCreateDatabase = null;
                }
            }
            this.j = false;
            this.d = null;
            this.n = 0L;
        } catch (Throwable th5) {
            ei.a(th5, "Cache", "destroy part");
        }
    }
}
