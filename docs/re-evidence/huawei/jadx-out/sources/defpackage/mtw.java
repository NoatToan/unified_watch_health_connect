package defpackage;

import android.text.TextUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.SyncHelper;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mtw {
    public static void e(StringBuffer stringBuffer, String str, String str2) {
        if (mtz.b(str2)) {
            return;
        }
        stringBuffer.append(str).append(str2).append("\r\n");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public static void d(String str, mtc mtcVar, StringBuffer stringBuffer) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "vnd.android.cursor.item/email_v2":
                b2 = 0;
                break;
            case "vnd.android.cursor.item/contact_event":
                b2 = 1;
                break;
            case "vnd.android.cursor.item/postal-address_v2":
                b2 = 2;
                break;
            case "vnd.android.cursor.item/phone_v2":
                b2 = 3;
                break;
            case "vnd.android.cursor.item/im":
                b2 = 4;
                break;
            case "vnd.android.cursor.item/relation":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            b(mtcVar.a("vnd.android.cursor.item/email_v2"), stringBuffer, "EMAIL;X1-", SyncHelper.Encode.ENCODE);
            return;
        }
        if (b2 == 1) {
            c(mtcVar.a("vnd.android.cursor.item/contact_event"), stringBuffer, "X-CUSTOM-EVENT-0;X1-");
            return;
        }
        if (b2 == 2) {
            a(mtcVar.c(), stringBuffer);
            return;
        }
        if (b2 == 3) {
            c(mtcVar.a("vnd.android.cursor.item/phone_v2"), stringBuffer, "TEL;X1-");
        } else if (b2 == 4) {
            b(mtcVar.a("vnd.android.cursor.item/im"), stringBuffer, "X-CUSTOM-IM;X1-", SyncHelper.Encode.ENCODE);
        } else {
            if (b2 != 5) {
                return;
            }
            b(mtcVar.a("vnd.android.cursor.item/relation"), stringBuffer, "X-CUSTOM-RELATION-0;X1-", SyncHelper.Encode.ENCODE);
        }
    }

    private static void c(HashMap<String, List<String>> map, StringBuffer stringBuffer, String str) {
        b(map, stringBuffer, str, SyncHelper.Encode.NORMAL);
    }

    private static void b(HashMap<String, List<String>> map, StringBuffer stringBuffer, String str, SyncHelper.Encode encode) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                String str2 = SyncHelper.Encode.ENCODE.equals(encode) ? str + mtz.a(key) + ";ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:" : str + mtz.a(key) + ":";
                int size = value.size();
                for (int i = 0; i < size; i++) {
                    String strC = value.get(i);
                    if (SyncHelper.Encode.ENCODE.equals(encode)) {
                        strC = c(new String[]{strC}, SyncHelper.Transferred.NORMAL);
                    }
                    e(stringBuffer, str2, strC);
                }
            }
        }
    }

    private static void a(HashMap<String, List<String[]>> map, StringBuffer stringBuffer) {
        if (map == null || map.size() == 0) {
            return;
        }
        for (Map.Entry<String, List<String[]>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String[]> value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                String str = "ADR;X1-" + mtz.a(key) + ";ENCODING=QUOTED-PRINTABLE;CHARSET=UTF-8:";
                int size = value.size();
                for (int i = 0; i < size; i++) {
                    e(stringBuffer, str, c(value.get(i), SyncHelper.Transferred.TRANSFERRED));
                }
            }
        }
    }

    public static String c(String[] strArr, SyncHelper.Transferred transferred) {
        StringBuilder sb = new StringBuilder(256);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String strC = strArr[i];
            if (SyncHelper.Transferred.TRANSFERRED.equals(transferred)) {
                strC = mtz.b(strC) ? "" : mtz.c(strC);
            }
            sb.append(mtz.b(strC) ? "" : mtx.b(strC));
            if (i != length - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static String e(String str) {
        return d(str, "");
    }

    public static String d(String str, String str2) {
        return mtz.b(str) ? str2 : mtx.b(mtz.c(str));
    }

    public static void a(List<String> list, String str, StringBuffer stringBuffer) {
        a(list, str, stringBuffer, SyncHelper.Encode.NORMAL);
    }

    public static void a(List<String> list, String str, StringBuffer stringBuffer, SyncHelper.Encode encode) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Collections.sort(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strD = list.get(i);
            if (SyncHelper.Encode.ENCODE.equals(encode)) {
                strD = d(strD, "");
            }
            e(stringBuffer, str, strD);
        }
    }

    public static void e(List<String[]> list, String str, StringBuffer stringBuffer, SyncHelper.Encode encode) {
        String strC;
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(list, new d());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String[] strArr = list.get(i);
            if (SyncHelper.Encode.ENCODE.equals(encode)) {
                strC = c(strArr, SyncHelper.Transferred.TRANSFERRED);
            } else {
                LogUtil.a("ContactSync", 1, "VcardHelper", "do not use branch");
                strC = "";
            }
            e(stringBuffer, str, strC);
        }
    }

    public static void d(JSONObject jSONObject, ArrayList<mtu> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(i, mts.a(arrayList.get(i)));
        }
        jSONObject.put("hiCallDeviceList", jSONArray);
    }

    public static class d implements Comparator<String[]>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String[] strArr, String[] strArr2) {
            return mtz.e(strArr, ",", "").compareToIgnoreCase(mtz.e(strArr2, ",", ""));
        }
    }
}
