package com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import defpackage.eeq;
import defpackage.lsk;
import defpackage.mzy;
import defpackage.nab;
import defpackage.nae;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HwControlLocalAppHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17510a;

    private int d(int i) {
        if (i < 1 || i > 7) {
            return 0;
        }
        return 1 << (i - 1);
    }

    public HwControlLocalAppHelper(Context context) {
        this.f17510a = context;
    }

    private void y(mzy mzyVar) {
        if (mzyVar == null) {
            LogUtil.j("HwControlLocalAppHelper", "dealControlLocalApp but callParam is null");
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        String strA = a(mzyVar);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.j("HwControlLocalAppHelper", "dealControlLocalApp but commandCodeTlv is null");
            return;
        }
        c(strA, sb);
        c(c(mzyVar), sb);
        b(mzyVar, sb);
        c(s(mzyVar), sb);
        c(k(mzyVar), sb);
        c(b(mzyVar), sb);
        c(m(mzyVar), sb);
        c(r(mzyVar), sb);
        e(mzyVar, sb);
        nae.e(sb.toString(), 5);
    }

    private void c(String str, StringBuilder sb) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sb.append(str);
        LogUtil.a("HwControlLocalAppHelper", "appendTlv tlv:", str);
    }

    private void b(mzy mzyVar, StringBuilder sb) {
        c(o(mzyVar), sb);
        c(e(mzyVar), sb);
        c(h(mzyVar), sb);
        c(d(mzyVar), sb);
        c(j(mzyVar), sb);
        c(p(mzyVar), sb);
        c(l(mzyVar), sb);
    }

    private void e(mzy mzyVar, StringBuilder sb) {
        c(n(mzyVar), sb);
        c(f(mzyVar), sb);
        c(i(mzyVar), sb);
        c(g(mzyVar), sb);
        c(q(mzyVar), sb);
        c(t(mzyVar), sb);
    }

    private String a(mzy mzyVar) {
        int iA;
        if (TextUtils.isEmpty(mzyVar.d()) || (iA = lsk.a(mzyVar.d(), 10)) <= 0) {
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(1) + eeq.b(strD.length() / 2) + strD;
    }

    private String b(mzy mzyVar) {
        List<mzy.a> listB = mzyVar.b();
        if (listB == null || listB.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(listB.size());
        for (mzy.a aVar : listB) {
            String strA = eeq.a(aVar.c());
            String strD = eeq.d(10);
            String strB = eeq.b(strA.length() / 2);
            String strA2 = eeq.a(aVar.d());
            String strD2 = eeq.d(11);
            String strB2 = eeq.b(strA2.length() / 2);
            sb.append(strD);
            sb.append(strB);
            sb.append(strA);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strA2);
        }
        return eeq.d(137) + eeq.b(sb.length() / 2) + ((Object) sb);
    }

    private String d(mzy mzyVar) {
        String strB = !TextUtils.isEmpty(mzyVar.c()) ? b(mzyVar.c(), 1000) : "";
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(12) + eeq.b(strB.length() / 2) + strB;
    }

    private String j(mzy mzyVar) {
        String strB = !TextUtils.isEmpty(mzyVar.f()) ? b(mzyVar.f(), 1) : "";
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(13) + eeq.b(strB.length() / 2) + strB;
    }

    private String p(mzy mzyVar) {
        String strB = !TextUtils.isEmpty(mzyVar.x()) ? b(mzyVar.x(), 1) : "";
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(14) + eeq.b(strB.length() / 2) + strB;
    }

    private String m(mzy mzyVar) {
        int iA;
        if (TextUtils.isEmpty(mzyVar.r()) || (iA = lsk.a(mzyVar.r(), 10)) <= 0) {
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(15) + eeq.b(strD.length() / 2) + strD;
    }

    private String r(mzy mzyVar) {
        String strB = !TextUtils.isEmpty(mzyVar.s()) ? b(mzyVar.s(), 1) : "";
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(16) + eeq.b(strB.length() / 2) + strB;
    }

    private String l(mzy mzyVar) {
        String strB = !TextUtils.isEmpty(mzyVar.p()) ? b(mzyVar.p(), 1) : "";
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(17) + eeq.b(strB.length() / 2) + strB;
    }

    public boolean b(String str, String str2) {
        if (!str2.contains("|")) {
            return str.equals(str2);
        }
        for (String str3 : str2.split("\\|")) {
            if (str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    private String e(JSONObject jSONObject, String str) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (b(str, next)) {
                return jSONObject.optString(next);
            }
        }
        return "";
    }

    private String c(mzy mzyVar) {
        int iA;
        String strE;
        if (TextUtils.isEmpty(mzyVar.a())) {
            return "";
        }
        if (mzyVar.e() == null) {
            strE = eeq.a(mzyVar.a());
        } else {
            String strE2 = e(mzyVar.e(), mzyVar.a());
            if (TextUtils.isEmpty(strE2) || (iA = lsk.a(strE2, 10)) <= 0) {
                return "";
            }
            strE = eeq.e(iA);
        }
        return eeq.d(2) + eeq.b(strE.length() / 2) + strE;
    }

    private String s(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.m())) {
            return "";
        }
        String strA = a(mzyVar.m());
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        return eeq.d(4) + eeq.b(strA.length() / 2) + strA;
    }

    private String k(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.q())) {
            return "";
        }
        String strB = b(mzyVar.q());
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(5) + eeq.b(strB.length() / 2) + strB;
    }

    private String e(mzy mzyVar) {
        String strB = !TextUtils.isEmpty(mzyVar.j()) ? b(mzyVar.j(), 1000) : "";
        if (!TextUtils.isEmpty(mzyVar.i())) {
            strB = b(mzyVar.i(), 1000);
        }
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        return eeq.d(6) + eeq.b(strB.length() / 2) + strB;
    }

    private String h(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.h()) && TextUtils.isEmpty(mzyVar.k())) {
            return "";
        }
        String strD = eeq.d(((TextUtils.isEmpty(mzyVar.k()) || !"Y/indoor".contains(mzyVar.k())) && (TextUtils.isEmpty(mzyVar.h()) || !"Y/indoor".contains(mzyVar.h()))) ? 2 : 1);
        return eeq.d(7) + eeq.b(strD.length() / 2) + strD;
    }

    private String o(mzy mzyVar) {
        int iA;
        String strD;
        if (TextUtils.isEmpty(mzyVar.v())) {
            return "";
        }
        if (mzyVar.w() == null) {
            strD = eeq.a(mzyVar.v());
        } else {
            String strE = e(mzyVar.w(), mzyVar.v());
            if (TextUtils.isEmpty(strE) || (iA = lsk.a(strE, 10)) <= 0) {
                return "";
            }
            strD = eeq.d(iA);
        }
        return eeq.d(3) + eeq.b(strD.length() / 2) + strD;
    }

    private String n(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.t())) {
            return "";
        }
        int iA = lsk.a(mzyVar.t(), 10);
        if (iA == -1) {
            LogUtil.j("HwControlLocalAppHelper", "buildSettingItemTlv Invaild settingItem");
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(18) + eeq.b(strD.length() / 2) + strD;
    }

    private String f(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.o())) {
            return "";
        }
        int iA = lsk.a(mzyVar.o(), 10);
        if (iA == -1) {
            LogUtil.j("HwControlLocalAppHelper", "buildOptCodeTlv Invaild optCode");
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(19) + eeq.b(strD.length() / 2) + strD;
    }

    private String i(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.g())) {
            return "";
        }
        if (mzyVar.l() == null) {
            LogUtil.j("HwControlLocalAppHelper", "buildMediaTypeTlv mediaTypeDictionary is null");
            return "";
        }
        int iA = lsk.a(e(mzyVar.l(), mzyVar.g()), 10);
        if (iA == -1) {
            LogUtil.j("HwControlLocalAppHelper", "buildMediaTypeTlv Invalid mediaType");
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(20) + eeq.b(strD.length() / 2) + strD;
    }

    private String g(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.n())) {
            return "";
        }
        int iA = lsk.a(mzyVar.n(), 10);
        if (iA == -1) {
            LogUtil.j("HwControlLocalAppHelper", "buildOptTypeTlv Invalid optType");
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(21) + eeq.b(strD.length() / 2) + strD;
    }

    private String q(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.u())) {
            return "";
        }
        if (mzyVar.y() == null) {
            LogUtil.j("HwControlLocalAppHelper", "buildVolumeTypeTlv volumeTypeDictionary is null");
            return "";
        }
        int iA = lsk.a(e(mzyVar.y(), mzyVar.u()), 10);
        if (iA == -1) {
            LogUtil.j("HwControlLocalAppHelper", "buildVolumeTypeTlv Invalid volumeType");
            return "";
        }
        String strD = eeq.d(iA);
        return eeq.d(22) + eeq.b(strD.length() / 2) + strD;
    }

    private String t(mzy mzyVar) {
        if (TextUtils.isEmpty(mzyVar.z())) {
            return "";
        }
        String strA = eeq.a(mzyVar.z());
        return eeq.d(23) + eeq.b(strA.length() / 2) + strA;
    }

    private String b(String str, int i) {
        double d;
        int i2;
        try {
            d = Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwControlLocalAppHelper", "parse distance find NumberFormatException");
            d = 0.0d;
        }
        if (d <= 0.0d || (i2 = (int) (d * ((double) i))) <= 0) {
            return "";
        }
        return eeq.c(i2);
    }

    private String b(String str) {
        int iIndexOf = str.indexOf(ExifInterface.GPS_DIRECTION_TRUE);
        if (iIndexOf < 0) {
            return "";
        }
        String[] strArrSplit = str.substring(iIndexOf + 1, iIndexOf + 6).split(":");
        int iA = strArrSplit.length > 0 ? lsk.a(strArrSplit[0], 10) : -1;
        if (iA < 0) {
            return "";
        }
        int iA2 = strArrSplit.length > 1 ? lsk.a(strArrSplit[1], 10) : -1;
        if (iA2 < 0) {
            return "";
        }
        return eeq.d(iA) + eeq.d(iA2);
    }

    private String a(String str) {
        int iE;
        if (str.contains(",") && str.contains(Constants.LINK)) {
            iE = h(str);
        } else if (str.contains(",")) {
            iE = f(str);
        } else if (str.contains(Constants.LINK)) {
            iE = j(str);
        } else {
            iE = e(str);
        }
        if (iE == 0) {
            return "";
        }
        return eeq.d(iE);
    }

    private int h(String str) {
        int iE;
        int i = 0;
        for (String str2 : str.split(",")) {
            if (str2.contains(Constants.LINK)) {
                iE = j(str2);
            } else {
                iE = e(str2);
            }
            i += iE;
        }
        return i;
    }

    private int e(String str) {
        if (str.startsWith("W") && str.length() == 2) {
            return d(lsk.a(str.substring(1), 10));
        }
        if (str.length() == 1) {
            return d(lsk.a(str, 10));
        }
        return 0;
    }

    private int j(String str) {
        String[] strArrSplit = str.split(Constants.LINK);
        int iD = 0;
        if (strArrSplit.length < 2) {
            return 0;
        }
        String str2 = strArrSplit[0];
        String str3 = strArrSplit[1];
        String strSubstring = str2.length() > 0 ? str2.substring(str2.length() - 1) : null;
        String strSubstring2 = str3.length() > 0 ? str3.substring(str3.length() - 1) : null;
        int iA = lsk.a(strSubstring, 10);
        int iA2 = lsk.a(strSubstring2, 10);
        if (iA >= 0 && iA2 >= 0) {
            if (iA > iA2) {
                return c(iA, iA2);
            }
            while (iA <= iA2) {
                iD += d(iA);
                iA++;
            }
        }
        return iD;
    }

    private int c(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 1; i3 < i2 + 1; i3++) {
            stringBuffer.append("W").append(Integer.toString(i3)).append(",");
        }
        while (i < 7) {
            stringBuffer.append("W").append(Integer.toString(i)).append(",");
            i++;
        }
        stringBuffer.append("W").append(Integer.toString(7));
        return f(stringBuffer.toString());
    }

    private int f(String str) {
        int iE = 0;
        for (String str2 : str.split(",")) {
            iE += e(str2);
        }
        return iE;
    }

    private void d(JSONObject jSONObject, mzy mzyVar) {
        if (CommonUtil.n(this.f17510a, mzyVar.d()) != 13) {
            LogUtil.j("HwControlLocalAppHelper", "processTimer commandCode != 13");
            return;
        }
        mzyVar.r(jSONObject.optString("timerCode"));
        String strOptString = jSONObject.optString("duration");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        mzyVar.s(strOptString);
    }

    public void a(JSONObject jSONObject, mzy mzyVar, boolean z) throws Throwable {
        d(jSONObject, mzyVar, z);
        b(jSONObject, mzyVar);
        d(jSONObject, mzyVar);
        c(jSONObject, mzyVar);
        y(mzyVar);
    }

    private void c(JSONObject jSONObject, mzy mzyVar) {
        String strOptString = jSONObject.optString("settingItem");
        if (!TextUtils.isEmpty(strOptString)) {
            mzyVar.l(strOptString);
        }
        String strOptString2 = jSONObject.optString("optCode");
        if (!TextUtils.isEmpty(strOptString2)) {
            mzyVar.i(strOptString2);
        }
        String strOptString3 = jSONObject.optString("streamType");
        if (!TextUtils.isEmpty(strOptString3)) {
            mzyVar.g(strOptString3);
        }
        try {
            mzyVar.e(new JSONObject("{\"Exercise\":\"0\",\"Ringtone\":\"1\",\"Hivoice\":\"2\",\"Media\":\"1\"}"));
            mzyVar.d(new JSONObject("{\"number\":\"0\",\"level\":\"1\",\"percent\":\"2\",\"fraction\":\"3\",\"other\":\"4\"}"));
        } catch (JSONException unused) {
            LogUtil.e("HwControlLocalAppHelper", "processSystem JSONException, type dictionary init failed");
        }
        String strOptString4 = jSONObject.optString("optType");
        if (!TextUtils.isEmpty(strOptString4)) {
            mzyVar.j(strOptString4);
        }
        String[] strArr = {"number", "level", "percent", "fraction", "other"};
        for (int i = 0; i < 5; i++) {
            String strOptString5 = jSONObject.optString(strArr[i]);
            if (!TextUtils.isEmpty(strOptString5)) {
                mzyVar.w(strArr[i]);
                mzyVar.u(strOptString5);
                return;
            }
        }
    }

    private void d(JSONObject jSONObject, mzy mzyVar, boolean z) {
        String strOptString = jSONObject.optString("length");
        if (!TextUtils.isEmpty(strOptString)) {
            mzyVar.h(strOptString);
        }
        String strOptString2 = jSONObject.optString("unit");
        if (!TextUtils.isEmpty(strOptString2)) {
            mzyVar.t(strOptString2);
        }
        String strOptString3 = jSONObject.optString("indoorOrNot");
        if (!TextUtils.isEmpty(strOptString3)) {
            mzyVar.f(strOptString3);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("typeDictionary");
        if (jSONObjectOptJSONObject != null) {
            mzyVar.c(jSONObjectOptJSONObject);
        }
        String strOptString4 = jSONObject.optString("distance");
        if (!TextUtils.isEmpty(strOptString4)) {
            mzyVar.a(strOptString4);
        }
        String strOptString5 = jSONObject.optString(ParsedFieldTag.KAKA_TASK_SCENARIO);
        if (!TextUtils.isEmpty(strOptString5)) {
            mzyVar.k(strOptString5);
        }
        String strOptString6 = jSONObject.optString("duration");
        if (!TextUtils.isEmpty(strOptString6) && CommonUtil.n(this.f17510a, mzyVar.d()) != 13) {
            mzyVar.b(strOptString6);
        }
        String strOptString7 = jSONObject.optString("calorie");
        if (!TextUtils.isEmpty(strOptString7)) {
            mzyVar.e(strOptString7);
        }
        String strOptString8 = jSONObject.optString("trip");
        if (!TextUtils.isEmpty(strOptString8)) {
            mzyVar.q(strOptString8);
        }
        String strOptString9 = jSONObject.optString("type");
        if (!TextUtils.isEmpty(strOptString9)) {
            mzyVar.p(strOptString9);
        }
        String strOptString10 = jSONObject.optString("times");
        if (!TextUtils.isEmpty(strOptString10)) {
            mzyVar.m(strOptString10);
        }
        if (z) {
            mzyVar.p("marathon");
            ReleaseLogUtil.d("R_HwControlLocalAppHelper", "marathon sports type add");
        }
    }

    private void b(JSONObject jSONObject, mzy mzyVar) throws Throwable {
        ArrayList arrayList = new ArrayList(16);
        c(jSONObject, arrayList);
        mzy.a aVar = new mzy.a();
        String strOptString = jSONObject.optString("contactId");
        String strOptString2 = jSONObject.optString("phoneNumberId");
        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
            aVar.b(strOptString);
            mzy.a aVarD = nab.d(this.f17510a, strOptString, lsk.a(strOptString2, 10));
            if (aVarD != null) {
                aVar.a(aVarD.d());
                aVar.c(aVarD.c());
            }
        }
        String strOptString3 = jSONObject.optString("contactName");
        if (!TextUtils.isEmpty(strOptString3)) {
            aVar.c(strOptString3);
        }
        String strOptString4 = jSONObject.optString("phoneNumber");
        if (!TextUtils.isEmpty(strOptString4)) {
            aVar.a(strOptString4);
        }
        if (!TextUtils.isEmpty(aVar.d())) {
            arrayList.add(aVar);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        mzyVar.b(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    private void c(JSONObject jSONObject, List<mzy.a> list) throws Throwable {
        String strOptString;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("contactList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.j("HwControlLocalAppHelper", "processCallList contactList is null");
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString2 = jSONObjectOptJSONObject.optString("contactId");
                if (!TextUtils.isEmpty(strOptString2)) {
                    mzy.a aVar = new mzy.a();
                    aVar.b(strOptString2);
                    String strOptString3 = jSONObjectOptJSONObject.optString("phoneNumberId");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        mzy.a aVarD = nab.d(this.f17510a, strOptString2, lsk.a(strOptString3, 10));
                        if (aVarD != null) {
                            aVar.a(aVarD.d());
                            aVar.c(aVarD.c());
                            strOptString = jSONObjectOptJSONObject.optString("contactName");
                            if (!TextUtils.isEmpty(strOptString)) {
                                aVar.c(strOptString);
                            }
                            if (TextUtils.isEmpty(aVar.c()) && !TextUtils.isEmpty(aVar.d())) {
                                list.add(aVar);
                            }
                        }
                    } else {
                        strOptString = jSONObjectOptJSONObject.optString("contactName");
                        if (!TextUtils.isEmpty(strOptString)) {
                            aVar.c(strOptString);
                        }
                        if (TextUtils.isEmpty(aVar.c())) {
                        }
                    }
                }
            }
        }
    }

    public void e() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(10);
        linkedHashMap.put("type", "1");
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VOICE_ASSISTANT_2190001.value(), linkedHashMap);
        LogUtil.a("HwControlLocalAppHelper", "mKitRecognizeListener onInit BI");
    }

    public void c(String str) {
        String strB;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("contexts");
            strB = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? "" : nab.b(jSONArrayOptJSONArray);
        } catch (JSONException unused) {
            LogUtil.e("HwControlLocalAppHelper", "processOnResult JSONException");
        }
        String str2 = TextUtils.isEmpty(strB) ? "" : strB;
        LogUtil.a("HwControlLocalAppHelper", "domainCode:", str2);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(10);
        linkedHashMap.put("type", "2");
        linkedHashMap.put("domainCode", str2);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VOICE_ASSISTANT_2190001.value(), linkedHashMap);
        LogUtil.a("HwControlLocalAppHelper", "censusDomain censusDomainBI ");
    }

    public void a(long j) {
        if (j < -2147483648L || j > 2147483647L) {
            LogUtil.j("Integer overflow", new Object[0]);
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(10);
        linkedHashMap.put("type", "3");
        linkedHashMap.put("duration", String.valueOf(j));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_VOICE_ASSISTANT_2190001.value(), linkedHashMap);
        LogUtil.a("HwControlLocalAppHelper", "breakLinkVoice OpAnalyticsUtil spanInitToEndBI");
    }

    public static void d(String str) {
        int i = ("music.play".equals(str) || "music.resume".equals(str)) ? 1 : -1;
        if ("music.pause".equals(str)) {
            i = 2;
        }
        if ("music.prev".equals(str)) {
            i = 3;
        }
        if ("music.next".equals(str)) {
            i = 4;
        }
        LogUtil.j("HwControlLocalAppHelper", "processCommand command is：", Integer.valueOf(i));
        nae.e(i);
    }
}
