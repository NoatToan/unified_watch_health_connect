package rd2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class i extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f152075b = LoggerFactory.getLogger("DeviceSaveQuery");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f152076a;

    public i(j jVar) {
        this.f152076a = jVar;
    }

    public static int d(long j8) {
        int i14;
        Logger logger = f152075b;
        try {
            ContentValues contentValues = new ContentValues(6);
            contentValues.putNull("mac_address");
            contentValues.putNull("garmin_device_xml");
            contentValues.putNull("gble_ediv");
            contentValues.putNull("gble_ltk");
            contentValues.putNull("gble_rand");
            contentValues.put("is_connected", (Integer) 0);
            i14 = i(contentValues, j8);
        } catch (Exception e4) {
            logger.error("clearPairing", (Throwable) e4);
            i14 = -1;
        }
        StringBuilder sbW = v.h.w(i14, "clearPairing: unitID [", "], nbrRows [", j8);
        sbW.append("]");
        logger.debug(sbW.toString());
        e(i14);
        return i14;
    }

    public static void e(int i14) {
        if (i14 >= 1) {
            f.b();
        }
    }

    public static int h(ContentValues contentValues, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        int iUpdate = a.b().update("devices", contentValues, "mac_address=?", new String[]{str});
        StringBuilder sbL = hb.a.l("macAddress [", str, "], vals [");
        sbL.append(contentValues.toString());
        sbL.append("], nbrRows [");
        sbL.append(iUpdate);
        sbL.append("]");
        f152075b.debug(sbL.toString());
        e(iUpdate);
        return iUpdate;
    }

    public static int i(ContentValues contentValues, long j8) {
        int iUpdate = a.b().update("devices", contentValues, "unit_id=?", new String[]{String.valueOf(j8)});
        StringBuilder sbK = e0.k(j8, "unitID [", "], vals [");
        sbK.append(contentValues.toString());
        sbK.append("], nbrRows [");
        sbK.append(iUpdate);
        sbK.append("]");
        f152075b.debug(sbK.toString());
        e(iUpdate);
        return iUpdate;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00d9 A[PHI: r3 r7
      0x00d9: PHI (r3v12 ??) = 
      (r3v24 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
      (r3v25 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
      (r3v26 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
      (r3v27 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
      (r3v13 ??)
      (r3v29 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
      (r3v30 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
      (r3v14 ??)
     binds: [B:19:0x004b, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:97:0x00d9, B:26:0x006a, B:28:0x0070, B:114:0x00d9] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r7v1 long) = (r7v0 long), (r7v0 long), (r7v0 long), (r7v0 long), (r7v2 long), (r7v0 long), (r7v0 long), (r7v3 long) binds: [B:19:0x004b, B:20:0x004d, B:22:0x0055, B:24:0x005d, B:97:0x00d9, B:26:0x006a, B:28:0x0070, B:114:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final boolean f(long j8, String str, ContentValues contentValues) throws Throwable {
        ?? r16;
        int iUpdate;
        ?? r17;
        ?? r18;
        long j14;
        String[] strArrD;
        SQLiteDatabase sQLiteDatabaseB = a.b();
        ?? r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        if (sQLiteDatabaseB == null) {
            return false;
        }
        sQLiteDatabaseB.beginTransaction();
        try {
            try {
                try {
                    try {
                        this.f152076a.getClass();
                        long jG = j.g(j8, str);
                        long j15 = -1;
                        try {
                            if (jG != -1) {
                                r17 = 0;
                                iUpdate = sQLiteDatabaseB.update("devices", contentValues, "_id=?", new String[]{String.valueOf(jG)});
                                if (iUpdate > 0) {
                                    try {
                                        m.f().getClass();
                                        sQLiteDatabaseB.delete("orphan_devices", "unit_id=?", new String[]{String.valueOf(j8)});
                                    } catch (Exception e4) {
                                        e = e4;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                boolean z14 = iUpdate > 0;
                                sQLiteDatabaseB.endTransaction();
                                e(iUpdate);
                                return z14;
                            }
                            if (!contentValues.containsKey("connection_type")) {
                                try {
                                    contentValues.put("connection_type", (Integer) 0);
                                } catch (Exception e14) {
                                    e = e14;
                                    iUpdate = 0;
                                    r17 = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteDatabaseB.endTransaction();
                                    e(r14);
                                    throw th;
                                }
                            }
                            qd2.a aVarB = qd2.a.b();
                            String str2 = (String) contentValues.get("product_nbr");
                            if (aVarB == null || str2 == null || (strArrD = aVarB.d(qd2.a.b.ALL_DEVICES)) == null || TextUtils.isEmpty(strArrD[1])) {
                                r18 = r14;
                                j14 = j15;
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONObject(strArrD[1]).getJSONArray("devices");
                                    if (jSONArray == null || jSONArray.length() <= 0) {
                                        r18 = r14;
                                        j14 = j15;
                                    } else {
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 < jSONArray.length()) {
                                                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                                                String string = jSONObject.getString("partNumber");
                                                r18 = r14 == true ? 1 : 0;
                                                if (string != null) {
                                                    j14 = j15;
                                                    try {
                                                        if (string.length() != 4) {
                                                            try {
                                                                int iIndexOf = string.indexOf("-");
                                                                string = string.substring(iIndexOf + 2, iIndexOf + 6);
                                                            } catch (IndexOutOfBoundsException unused) {
                                                                string = null;
                                                            }
                                                        }
                                                        if (string == null && string.equals(str2)) {
                                                            String string2 = jSONObject.getString("applicationKey");
                                                            if (!TextUtils.isEmpty(string2)) {
                                                                contentValues.put("application_key", string2);
                                                            }
                                                        }
                                                        i14++;
                                                        r14 = r18 == true ? 1 : 0;
                                                        j15 = j14;
                                                    } catch (JSONException unused2) {
                                                    }
                                                } else {
                                                    j14 = j15;
                                                }
                                                string = null;
                                                if (string == null) {
                                                }
                                                i14++;
                                                r14 = r18 == true ? 1 : 0;
                                                j15 = j14;
                                            } else {
                                                r18 = r14;
                                                j14 = j15;
                                            }
                                        }
                                    }
                                } catch (JSONException unused3) {
                                }
                            }
                            long jInsert = sQLiteDatabaseB.insert("devices", null, contentValues);
                            if (jInsert != j14) {
                                m.f().getClass();
                                sQLiteDatabaseB.delete("orphan_devices", "unit_id=?", new String[]{String.valueOf(j8)});
                            }
                            sQLiteDatabaseB.setTransactionSuccessful();
                            if (jInsert != j14) {
                                sQLiteDatabaseB.endTransaction();
                                e(1);
                                return true;
                            }
                            sQLiteDatabaseB.endTransaction();
                            e(r18);
                            return r18;
                        } catch (Exception e15) {
                            e = e15;
                            iUpdate = r16 == true ? 1 : 0;
                            r17 = r16;
                        } catch (Throwable th4) {
                            th = th4;
                            r14 = 0;
                            sQLiteDatabaseB.endTransaction();
                            e(r14);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    boolean z15 = r14 == true ? 1 : 0;
                }
            } catch (Exception e16) {
                e = e16;
                r16 = r14;
            }
            f152075b.error("performUpdateOrInsert", (Throwable) e);
            sQLiteDatabaseB.endTransaction();
            e(iUpdate);
            return r17;
        } catch (Throwable th7) {
            th = th7;
            r14 = "connection_type";
        }
    }

    public final boolean g(long j8, int i14, String str, String str2, String str3, String str4, long j14, int i15, int i16, byte[] bArr, boolean z14, String str5, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z15, String str6) {
        String str7;
        ContentValues contentValues = new ContentValues(19);
        contentValues.put("unit_id", String.valueOf(j8));
        contentValues.put("product_nbr", String.valueOf(i14));
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("application_key", str);
        }
        contentValues.put("mac_address", str2);
        contentValues.put("product_display_name", str3);
        contentValues.put("bt_friendly_name", str3);
        contentValues.put("software_version", str4);
        contentValues.put("last_connected_timestamp", Long.valueOf(j14));
        contentValues.put("min_app_version_code_supported", Integer.valueOf(i15));
        contentValues.put("is_connected", Integer.valueOf(z14 ? 1 : 0));
        if (i16 != 1) {
            str7 = i16 != 2 ? PrivacyUpdateRequestError.UNKNOWN : "btc";
        } else {
            str7 = "ble";
        }
        if (i16 == 0) {
            f152075b.error("save: fix me, not handling device connection type [" + i16 + "]");
        }
        contentValues.put("connection_type", str7);
        contentValues.put("capabilities", (Integer) 0);
        contentValues.put("sport_capabilities", (Integer) 0);
        if (bArr != null && bArr.length > 0) {
            contentValues.put("garmin_device_xml", bArr);
        }
        if (!TextUtils.isEmpty(str5)) {
            contentValues.put("categories", str5);
        }
        if (bArr2 != null && bArr2.length > 0) {
            contentValues.put("gble_ediv", bArr2);
        }
        if (bArr3 != null && bArr3.length > 0) {
            contentValues.put("gble_rand", bArr3);
        }
        if (bArr4 != null && bArr4.length > 0) {
            contentValues.put("gble_ltk", bArr4);
        }
        if (!TextUtils.isEmpty(str6)) {
            contentValues.put("garmin_device_xml_id", str6);
        }
        contentValues.put("multi_link_support", Boolean.valueOf(z15));
        return f(j8, str7, contentValues);
    }

    public final boolean j(long j8, byte[] bArr) {
        this.f152076a.getClass();
        ArrayList arrayListH = j.h(j8);
        boolean z14 = false;
        if (arrayListH != null && arrayListH.size() > 0) {
            Iterator it = arrayListH.iterator();
            while (it.hasNext()) {
                String[] strArr = {String.valueOf(((Long) it.next()).longValue())};
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("garmin_device_xml", bArr);
                int iUpdate = a.b().update("devices", contentValues, "_id=?", strArr);
                e(iUpdate);
                if (iUpdate >= 1) {
                    z14 = true;
                }
            }
        }
        return z14;
    }
}
