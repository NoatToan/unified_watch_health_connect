package com.autonavi.aps.amapapi.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.amap.api.col.p0003sl.iq;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.autonavi.aps.amapapi.restruct.d;
import com.autonavi.aps.amapapi.restruct.e;
import com.autonavi.aps.amapapi.utils.k;
import com.huawei.hms.network.embedded.n1;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Hashtable<String, ArrayList<C0034a>> f3971a = new Hashtable<>();
    private long i = 0;
    private boolean j = false;
    private String k = "2.0.201501131131".replace(".", "");
    private String l = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f3972b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f3973c = 0;
    String d = null;
    d e = null;
    private String m = null;
    private long n = 0;
    boolean f = true;
    boolean g = true;
    String h = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);

    public final void a(String str, StringBuilder sb, com.autonavi.aps.amapapi.model.a aVar, Context context, boolean z) {
        try {
            if (k.a(aVar)) {
                String str2 = str + "&" + aVar.isOffset() + "&" + aVar.i() + "&" + aVar.j();
                if (a(str2, aVar) && !aVar.e().equals("mem") && !aVar.e().equals("file") && !aVar.e().equals("wifioff") && !OpAnalyticsConstants.WATCH_FAIL_CODE.equals(aVar.d())) {
                    if (b()) {
                        c();
                    }
                    JSONObject jSONObjectF = aVar.f();
                    if (k.a(jSONObjectF, "offpct")) {
                        jSONObjectF.remove("offpct");
                        aVar.a(jSONObjectF);
                    }
                    if (str2.contains("wifi")) {
                        if (TextUtils.isEmpty(sb)) {
                            return;
                        }
                        if (aVar.getAccuracy() >= 300.0f) {
                            int i = 0;
                            for (String str3 : sb.toString().split("#")) {
                                if (str3.contains(",")) {
                                    i++;
                                }
                            }
                            if (i >= 8) {
                                return;
                            }
                        } else if (aVar.getAccuracy() <= 3.0f) {
                            return;
                        }
                        if (str2.contains("cgiwifi") && !TextUtils.isEmpty(aVar.g())) {
                            String strReplace = str2.replace("cgiwifi", "cgi");
                            com.autonavi.aps.amapapi.model.a aVarH = aVar.h();
                            if (k.a(aVarH)) {
                                a(strReplace, new StringBuilder(), aVarH, context, true);
                            }
                        }
                    } else if (str2.contains("cgi")) {
                        if (sb != null) {
                            if (sb.indexOf(",") != -1) {
                                return;
                            }
                        }
                        if ("4".equals(aVar.d())) {
                            return;
                        }
                    }
                    com.autonavi.aps.amapapi.model.a aVarA = a(str2, sb, false);
                    if (k.a(aVarA) && aVarA.toStr().equals(aVar.toStr(3))) {
                        return;
                    }
                    this.i = k.b();
                    C0034a c0034a = new C0034a();
                    c0034a.a(aVar);
                    c0034a.a(TextUtils.isEmpty(sb) ? null : sb.toString());
                    if (this.f3971a.containsKey(str2)) {
                        this.f3971a.get(str2).add(c0034a);
                    } else {
                        ArrayList<C0034a> arrayList = new ArrayList<>();
                        arrayList.add(c0034a);
                        this.f3971a.put(str2, arrayList);
                    }
                    if (z) {
                        try {
                            a(str2, aVar, sb, context);
                        } catch (Throwable th) {
                            com.autonavi.aps.amapapi.utils.c.a(th, n1.f15105b, "add");
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.autonavi.aps.amapapi.utils.c.a(th2, n1.f15105b, "add");
        }
    }

    public final com.autonavi.aps.amapapi.model.a a(Context context, String str, StringBuilder sb, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str) || !com.autonavi.aps.amapapi.utils.b.e()) {
            return null;
        }
        String str2 = str + "&" + this.f + "&" + this.g + "&" + this.h;
        if (str2.contains(GeocodeSearch.GPS) || !com.autonavi.aps.amapapi.utils.b.e() || sb == null) {
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
                a(context, strA, z2);
            } catch (Throwable unused) {
            }
        }
        if (this.f3971a.isEmpty()) {
            return null;
        }
        return a(str2, sb, z2);
    }

    private com.autonavi.aps.amapapi.model.a a(String str, StringBuilder sb, boolean z) {
        C0034a c0034aA;
        try {
            if (str.contains("cgiwifi") || str.contains("wifi")) {
                c0034aA = a(sb, str);
            } else {
                c0034aA = (str.contains("cgi") && this.f3971a.containsKey(str) && this.f3971a.get(str).size() > 0) ? this.f3971a.get(str).get(0) : null;
            }
            if (c0034aA != null && k.a(c0034aA.a())) {
                com.autonavi.aps.amapapi.model.a aVarA = c0034aA.a();
                aVarA.e("mem");
                aVarA.h(c0034aA.b());
                if (!z && !com.autonavi.aps.amapapi.utils.b.a(aVarA.getTime())) {
                    Hashtable<String, ArrayList<C0034a>> hashtable = this.f3971a;
                    if (hashtable != null && hashtable.containsKey(str)) {
                        this.f3971a.get(str).remove(c0034aA);
                    }
                }
                if (k.a(aVarA)) {
                    this.f3973c = 0L;
                }
                aVarA.setLocationType(4);
                return aVarA;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, n1.f15105b, "get1");
        }
        return null;
    }

    private boolean b() {
        long jB = k.b();
        long j = this.i;
        if (j == 0) {
            return false;
        }
        return this.f3971a.size() > 360 || jB - j > Constants.ANALYSIS_EVENT_KEEP_TIME;
    }

    private static boolean a(String str, com.autonavi.aps.amapapi.model.a aVar) {
        if (TextUtils.isEmpty(str) || !k.a(aVar) || str.startsWith("#")) {
            return false;
        }
        return str.contains("network");
    }

    private void c() {
        this.i = 0L;
        if (!this.f3971a.isEmpty()) {
            this.f3971a.clear();
        }
        this.j = false;
    }

    private C0034a a(StringBuilder sb, String str) {
        C0034a c0034a;
        char c2;
        C0034a c0034a2;
        if (this.f3971a.isEmpty() || TextUtils.isEmpty(sb)) {
            return null;
        }
        if (!this.f3971a.containsKey(str)) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        ArrayList<C0034a> arrayList = this.f3971a.get(str);
        char c3 = 1;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                C0034a c0034a3 = arrayList.get(size);
                if (!TextUtils.isEmpty(c0034a3.b())) {
                    if (a(c0034a3.b(), sb)) {
                        if (!k.a(c0034a3.b(), sb.toString())) {
                            c2 = c3;
                        }
                        c0034a2 = c0034a3;
                        break;
                    }
                    c2 = 0;
                    a(c0034a3.b(), (Hashtable<String, String>) hashtable);
                    a(sb.toString(), (Hashtable<String, String>) hashtable2);
                    hashtable3.clear();
                    Iterator it = hashtable.keySet().iterator();
                    while (it.hasNext()) {
                        hashtable3.put((String) it.next(), "");
                    }
                    Iterator it2 = hashtable2.keySet().iterator();
                    while (it2.hasNext()) {
                        hashtable3.put((String) it2.next(), "");
                    }
                    Set setKeySet = hashtable3.keySet();
                    double[] dArr = new double[setKeySet.size()];
                    double[] dArr2 = new double[setKeySet.size()];
                    Iterator it3 = setKeySet.iterator();
                    int i = 0;
                    while (it3 != null && it3.hasNext()) {
                        String str2 = (String) it3.next();
                        double d = 0.0d;
                        dArr[i] = hashtable.containsKey(str2) ? 1.0d : 0.0d;
                        if (hashtable2.containsKey(str2)) {
                            d = 1.0d;
                        }
                        dArr2[i] = d;
                        i++;
                    }
                    setKeySet.clear();
                    double[] dArrA = a(dArr, dArr2);
                    if (dArrA[0] < 0.800000011920929d) {
                        c0034a2 = c0034a3;
                        if (dArrA[c3] >= Math.min(com.autonavi.aps.amapapi.utils.b.g(), 0.618d) || (c2 != 0 && dArrA[0] >= Math.min(com.autonavi.aps.amapapi.utils.b.g(), 0.618d))) {
                            break;
                        }
                    } else {
                        c0034a2 = c0034a3;
                        break;
                    }
                }
                size--;
                c3 = 1;
            } else {
                c0034a = null;
            }
            hashtable.clear();
            hashtable2.clear();
            hashtable3.clear();
            return c0034a;
        }
        c0034a = c0034a2;
        hashtable.clear();
        hashtable2.clear();
        hashtable3.clear();
        return c0034a;
    }

    private static boolean a(String str, StringBuilder sb) {
        String strSubstring;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(sb) || !str.contains(",access") || sb.indexOf(",access") == -1) {
            return false;
        }
        String[] strArrSplit = str.split(",access");
        if (strArrSplit[0].contains("#")) {
            String str2 = strArrSplit[0];
            strSubstring = str2.substring(str2.lastIndexOf("#") + 1);
        } else {
            strSubstring = strArrSplit[0];
        }
        if (TextUtils.isEmpty(strSubstring)) {
            return false;
        }
        return sb.toString().contains(strSubstring + ",access");
    }

    private static void a(String str, Hashtable<String, String> hashtable) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hashtable.clear();
        for (String str2 : str.split("#")) {
            if (!TextUtils.isEmpty(str2) && !str2.contains("|")) {
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
            double d4 = dArr[i3];
            d2 += d4 * d4;
            double d5 = dArr2[i3];
            d3 += d5 * d5;
            d += d4 * d5;
            if (d5 == 1.0d) {
                i2++;
                if (d4 == 1.0d) {
                    i++;
                }
            }
        }
        dArr3[0] = d / (Math.sqrt(d2) * Math.sqrt(d3));
        double d6 = i;
        dArr3[1] = (d6 * 1.0d) / ((double) i2);
        dArr3[2] = d6;
        for (int i4 = 0; i4 < 2; i4++) {
            if (dArr3[i4] > 1.0d) {
                dArr3[i4] = 1.0d;
            }
        }
        return dArr3;
    }

    public final void a(Context context) {
        if (this.j) {
            return;
        }
        try {
            c();
            a(context, (String) null, false);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, n1.f15105b, "loadDB");
        }
        this.j = true;
    }

    /* JADX INFO: renamed from: com.autonavi.aps.amapapi.storage.a$a, reason: collision with other inner class name */
    static final class C0034a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.autonavi.aps.amapapi.model.a f3974a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3975b = null;

        protected C0034a() {
        }

        public final com.autonavi.aps.amapapi.model.a a() {
            return this.f3974a;
        }

        public final void a(com.autonavi.aps.amapapi.model.a aVar) {
            this.f3974a = aVar;
        }

        public final String b() {
            return this.f3975b;
        }

        public final void a(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f3975b = null;
            } else {
                this.f3975b = str.replace("##", "#");
            }
        }
    }

    private String a(String str, StringBuilder sb, Context context) {
        String strSubstring;
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            this.l = k.l(context);
            if (str.contains("&")) {
                str = str.substring(0, str.indexOf("&"));
            }
            String strSubstring2 = str.substring(str.lastIndexOf("#") + 1);
            if (strSubstring2.equals("cgi")) {
                jSONObject.put("cgi", str.substring(0, str.length() - 12));
            } else if (!TextUtils.isEmpty(sb) && sb.indexOf(",access") != -1) {
                jSONObject.put("cgi", str.substring(0, str.length() - (strSubstring2.length() + 9)));
                String[] strArrSplit = sb.toString().split(",access");
                if (strArrSplit[0].contains("#")) {
                    String str2 = strArrSplit[0];
                    strSubstring = str2.substring(str2.lastIndexOf("#") + 1);
                } else {
                    strSubstring = strArrSplit[0];
                }
                jSONObject.put("mmac", strSubstring);
            }
            return iq.b(com.autonavi.aps.amapapi.security.a.a(jSONObject.toString().getBytes("UTF-8"), this.l));
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a(String str, AMapLocation aMapLocation, StringBuilder sb, Context context) throws Exception {
        if (context == null) {
            return;
        }
        if (this.l == null) {
            this.l = k.l(context);
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
            byte[] bArrA = com.autonavi.aps.amapapi.security.a.a(sb.toString().getBytes("UTF-8"), this.l);
            objArr[1] = bArrA;
            objArr[2] = com.autonavi.aps.amapapi.security.a.a(aMapLocation.toStr().getBytes("UTF-8"), this.l);
            objArr[3] = Long.valueOf(aMapLocation.getTime());
            for (int i = 1; i < 3; i++) {
                objArr[i] = iq.b((byte[]) objArr[i]);
            }
            sQLiteDatabaseOpenOrCreateDatabase.execSQL(sb2.toString(), objArr);
            sb2.delete(0, sb2.length());
            sb2.delete(0, sb2.length());
            if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                return;
            }
            sQLiteDatabaseOpenOrCreateDatabase.close();
        } catch (Throwable th) {
            try {
                com.autonavi.aps.amapapi.utils.c.a(th, "DB", "updateHist");
            } finally {
                sb2.delete(0, sb2.length());
                if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0277 A[EDGE_INSN: B:118:0x0277->B:73:0x0277 BREAK  A[LOOP:0: B:32:0x00d3->B:75:0x0287], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0287 A[LOOP:0: B:32:0x00d3->B:75:0x0287, LOOP_END] */
    private void a(Context context, String str, boolean z) throws Exception {
        SQLiteDatabase sQLiteDatabase;
        boolean zIsOpen;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        char c2;
        int i;
        String str2;
        if (!com.autonavi.aps.amapapi.utils.b.e() || context == null) {
            return;
        }
        Cursor cursor = null;
        try {
            int i2 = 0;
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
            try {
                if (!k.a(sQLiteDatabaseOpenOrCreateDatabase, "hist")) {
                    if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                        return;
                    }
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                if (!z) {
                    long jA = k.a();
                    long jD = com.autonavi.aps.amapapi.utils.b.d();
                    sb.append("time >");
                    sb.append(jA - jD);
                    if (str != null) {
                        sb.append(" and feature = '");
                        sb.append(str + "'");
                    }
                } else {
                    long jA2 = k.a();
                    sb.append("time >");
                    sb.append(jA2 - Constants.ANALYSIS_EVENT_KEEP_TIME);
                    if (str != null) {
                        sb.append(" and feature = '");
                        sb.append(str + "'");
                    }
                }
                int i3 = 1;
                Cursor cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query("hist" + this.k, new String[]{TrackConstants$Events.FEATURE, " nb", "loc"}, sb.toString(), null, null, null, "time ASC", null);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    if (this.l == null) {
                        this.l = k.l(context);
                    }
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                    } else {
                        while (true) {
                            if (cursorQuery.getString(i2).startsWith("{")) {
                                jSONObject = new JSONObject(cursorQuery.getString(i2));
                                sb2.delete(i2, sb2.length());
                                if (!TextUtils.isEmpty(cursorQuery.getString(i3))) {
                                    sb2.append(cursorQuery.getString(i3));
                                } else if (k.a(jSONObject, "mmac")) {
                                    sb2.append("#");
                                    sb2.append(jSONObject.getString("mmac"));
                                    sb2.append(",access");
                                }
                                jSONObject2 = new JSONObject(cursorQuery.getString(2));
                                if (k.a(jSONObject2, "type")) {
                                    jSONObject2.put("type", "new");
                                }
                            } else {
                                JSONObject jSONObject3 = new JSONObject(new String(com.autonavi.aps.amapapi.security.a.b(iq.b(cursorQuery.getString(i2)), this.l), "UTF-8"));
                                sb2.delete(0, sb2.length());
                                if (!TextUtils.isEmpty(cursorQuery.getString(1))) {
                                    sb2.append(new String(com.autonavi.aps.amapapi.security.a.b(iq.b(cursorQuery.getString(1)), this.l), "UTF-8"));
                                } else if (k.a(jSONObject3, "mmac")) {
                                    sb2.append("#");
                                    sb2.append(jSONObject3.getString("mmac"));
                                    sb2.append(",access");
                                }
                                JSONObject jSONObject4 = new JSONObject(new String(com.autonavi.aps.amapapi.security.a.b(iq.b(cursorQuery.getString(2)), this.l), "UTF-8"));
                                if (k.a(jSONObject4, "type")) {
                                    jSONObject4.put("type", "new");
                                }
                                jSONObject = jSONObject3;
                                jSONObject2 = jSONObject4;
                            }
                            com.autonavi.aps.amapapi.model.a aVar = new com.autonavi.aps.amapapi.model.a("");
                            aVar.b(jSONObject2);
                            try {
                                if (k.a(jSONObject, "mmac") && k.a(jSONObject, "cgi")) {
                                    String str3 = (jSONObject.getString("cgi") + "#") + "network#";
                                    if (jSONObject.getString("cgi").contains("#")) {
                                        str2 = str3 + "cgiwifi";
                                    } else {
                                        str2 = str3 + "wifi";
                                    }
                                } else {
                                    if (k.a(jSONObject, "cgi")) {
                                        String str4 = (jSONObject.getString("cgi") + "#") + "network#";
                                        if (jSONObject.getString("cgi").contains("#")) {
                                            str2 = str4 + "cgi";
                                        }
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                        }
                                        i3 = i;
                                        sb = sb;
                                        sQLiteDatabaseOpenOrCreateDatabase = sQLiteDatabase;
                                        i2 = 0;
                                    }
                                    sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                                    c2 = 2;
                                    i = 1;
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    i3 = i;
                                    sb = sb;
                                    sQLiteDatabaseOpenOrCreateDatabase = sQLiteDatabase;
                                    i2 = 0;
                                }
                                a(str2, sb2, aVar, context, false);
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                i3 = i;
                                sb = sb;
                                sQLiteDatabaseOpenOrCreateDatabase = sQLiteDatabase;
                                i2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                try {
                                    com.autonavi.aps.amapapi.utils.c.a(th, "DB", "fetchHist p2");
                                    if (sQLiteDatabase != null) {
                                        if (zIsOpen) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                } finally {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                        sQLiteDatabase.close();
                                    }
                                }
                            }
                            c2 = 2;
                            i = 1;
                            sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                        }
                        sb2.delete(0, sb2.length());
                        sb.delete(0, sb.length());
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        return;
                    }
                    sQLiteDatabase.close();
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = sQLiteDatabaseOpenOrCreateDatabase;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = null;
        }
    }

    private void c(Context context) throws Exception {
        if (context == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = null;
        try {
            sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
            if (!k.a(sQLiteDatabaseOpenOrCreateDatabase, "hist")) {
                if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                    return;
                }
                sQLiteDatabaseOpenOrCreateDatabase.close();
                return;
            }
            try {
                sQLiteDatabaseOpenOrCreateDatabase.delete("hist" + this.k, "time<?", new String[]{String.valueOf(k.a() - Constants.ANALYSIS_EVENT_KEEP_TIME)});
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "DB", "clearHist");
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    message.contains("no such table");
                }
            }
            if (sQLiteDatabaseOpenOrCreateDatabase == null || !sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
            }
        } catch (Throwable th2) {
            try {
                com.autonavi.aps.amapapi.utils.c.a(th2, "DB", "clearHist p2");
            } finally {
                if (sQLiteDatabaseOpenOrCreateDatabase != null && sQLiteDatabaseOpenOrCreateDatabase.isOpen()) {
                    sQLiteDatabaseOpenOrCreateDatabase.close();
                }
            }
        }
    }

    public final void b(Context context) {
        try {
            c();
            c(context);
            this.j = false;
            this.d = null;
            this.n = 0L;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, n1.f15105b, "destroy part");
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.g = aMapLocationClientOption.isNeedAddress();
        this.f = aMapLocationClientOption.isOffset();
        this.f3972b = aMapLocationClientOption.isLocationCacheEnable();
        this.h = String.valueOf(aMapLocationClientOption.getGeoLanguage());
    }

    public final void a(d dVar) {
        this.e = dVar;
    }

    private boolean a(com.autonavi.aps.amapapi.model.a aVar, boolean z) {
        if (a(z)) {
            return aVar == null || com.autonavi.aps.amapapi.utils.b.a(aVar.getTime()) || z;
        }
        return false;
    }

    private boolean a(boolean z) {
        if (com.autonavi.aps.amapapi.utils.b.e() || z) {
            return this.f3972b || com.autonavi.aps.amapapi.utils.b.f() || z;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    public final com.autonavi.aps.amapapi.model.a a(e eVar, boolean z, com.autonavi.aps.amapapi.model.a aVar, com.autonavi.aps.amapapi.restruct.k kVar, StringBuilder sb, String str, Context context, boolean z2) {
        d dVar;
        boolean z3;
        String str2;
        com.autonavi.aps.amapapi.model.a aVarA;
        String str3;
        if (!a(aVar, z2)) {
            return null;
        }
        try {
            d dVarE = eVar.e();
            boolean z4 = !(dVarE == null && this.e == null) && ((dVar = this.e) == null || !dVar.equals(dVarE));
            if (aVar != null) {
                z3 = aVar.getAccuracy() > 299.0f && kVar.e().size() > 5;
            } else {
                z3 = false;
            }
            if (aVar != null && (str3 = this.d) != null && !z3 && !z4) {
                boolean zA = k.a(str3, sb.toString());
                boolean z5 = this.f3973c != 0 && k.b() - this.f3973c < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                if ((zA || z5) && k.a(aVar)) {
                    aVar.e("mem");
                    aVar.setLocationType(2);
                    return aVar;
                }
                if (!zA) {
                    this.f3973c = k.b();
                } else {
                    this.f3973c = 0L;
                }
            } else {
                this.f3973c = k.b();
            }
            String str4 = this.m;
            if (str4 == null || str.equals(str4)) {
                if (this.m == null) {
                    this.n = k.a();
                    this.m = str;
                } else {
                    this.n = k.a();
                }
            } else {
                if (k.a() - this.n < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                    str2 = this.m;
                } else {
                    this.n = k.a();
                    this.m = str;
                }
                if (!z3 || z) {
                    aVarA = null;
                } else {
                    aVarA = a(context, str2, sb, false, false);
                }
                if ((z && !k.a(aVarA)) || z3 || z) {
                    return null;
                }
                this.f3973c = 0L;
                aVarA.setLocationType(4);
                return aVarA;
            }
            str2 = str;
            if (z3) {
                aVarA = null;
            } else {
                aVarA = null;
            }
            if (z) {
                this.f3973c = 0L;
                aVarA.setLocationType(4);
                return aVarA;
            }
            this.f3973c = 0L;
            aVarA.setLocationType(4);
            return aVarA;
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a() {
        this.f3973c = 0L;
        this.d = null;
    }
}
