package defpackage;

import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbh {
    private static eet e = new eet();

    public static String e(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.d("HwPayUtil", "getAllCardList, messageHex=", strE);
        if (strE != null && strE.length() > 4) {
            try {
                ees eesVarB = e.b(strE.substring(4, strE.length()));
                int iB = 0;
                int iB2 = 0;
                int iB3 = 0;
                for (eew eewVar : eesVarB.e()) {
                    int iB4 = CommonUtil.b(eewVar.e(), 16);
                    if (iB4 == 1) {
                        iB = CommonUtil.b(eewVar.b(), 16);
                    } else if (iB4 == 2) {
                        iB2 = CommonUtil.b(eewVar.b(), 16);
                    } else if (iB4 == 3) {
                        iB3 = CommonUtil.b(eewVar.b(), 16);
                    } else {
                        LogUtil.e("not support tlv Type!", new Object[0]);
                    }
                }
                LogUtil.a("HwPayUtil", "cardNum =", Integer.valueOf(iB), "CARD_INFO_START =", Integer.valueOf(iB2), "CARD_INFO_END =", Integer.valueOf(iB3));
                return c(a(eesVarB.b()), iB, iB2, iB3);
            } catch (eeu e2) {
                LogUtil.e("HwPayUtil", "getCardInfo Tlv error e = ", e2.getMessage());
                return null;
            } catch (NumberFormatException e3) {
                LogUtil.e("HwPayUtil", "getCardInfo error e = ", e3.getMessage());
            }
        }
        return null;
    }

    public static boolean e(eew eewVar) {
        String strB;
        if (eewVar != null && (strB = eewVar.b()) != null && strB.length() >= 40) {
            String strSubstring = strB.substring(0, 40);
            if (strSubstring.replace(AudioConstant.WOMAN, "").isEmpty() || strSubstring.replace("f", "").isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private static List<String> a(List<ees> list) throws eeu, NumberFormatException {
        ArrayList arrayList = new ArrayList(16);
        if (list != null && !list.isEmpty()) {
            Iterator<ees> it = list.iterator();
            while (it.hasNext()) {
                Iterator<ees> it2 = it.next().b().iterator();
                while (it2.hasNext()) {
                    List<eew> listE = it2.next().e();
                    LogUtil.d("HwPayUtil", "List, child tlv=", Integer.valueOf(listE.size()));
                    arrayList.add(b(listE).s());
                }
            }
        }
        return arrayList;
    }

    private static mbm b(List<eew> list) throws eeu, NumberFormatException {
        mbm mbmVar = new mbm();
        for (eew eewVar : list) {
            LogUtil.d("HwPayUtil", "List, getTag = ", eewVar.e(), "List, getValue = ", eewVar.b());
            switch (CommonUtil.b(eewVar.e(), 16)) {
                case 6:
                    mbmVar.d(eeq.d(eewVar.b()));
                    break;
                case 7:
                    mbmVar.f(eeq.d(eewVar.b()));
                    break;
                case 8:
                    mbmVar.g(eeq.d(eewVar.b()));
                    break;
                case 9:
                    mbmVar.j(eeq.d(eewVar.b()));
                    break;
                case 10:
                    mbmVar.b(CommonUtil.b(eewVar.b(), 16));
                    if (mbmVar.c() == 0) {
                        mbmVar.b(2);
                    }
                    break;
                case 11:
                    d(mbmVar, eewVar);
                    break;
                default:
                    c(mbmVar, eewVar);
                    break;
            }
        }
        return mbmVar;
    }

    private static void c(mbm mbmVar, eew eewVar) throws eeu, NumberFormatException {
        if (eewVar == null || mbmVar == null) {
            return;
        }
        switch (CommonUtil.b(eewVar.e(), 16)) {
            case 12:
                mbmVar.e(eeq.d(eewVar.b()));
                break;
            case 13:
                mbmVar.h(eeq.d(eewVar.b()));
                break;
            case 14:
                mbmVar.c(eeq.d(eewVar.b()));
                break;
            case 15:
                mbmVar.b(eeq.d(eewVar.b()));
                break;
            case 16:
                mbmVar.d(CommonUtil.b(eewVar.b(), 16));
                break;
            case 17:
                mbmVar.c(CommonUtil.x(eewVar.b()));
                break;
            case 18:
                mbmVar.c(CommonUtil.b(eewVar.b(), 16));
                break;
            case 19:
                mbmVar.a(eeq.d(eewVar.b()));
                break;
            case 20:
                mbmVar.a(CommonUtil.x(eewVar.b()));
                break;
            case 21:
                mbmVar.i(eeq.d(eewVar.b()));
                break;
            case 22:
                mbmVar.e(CommonUtil.x(eewVar.b()));
                break;
            case 23:
                if (!e(eewVar)) {
                    mbmVar.k(eeq.d(eewVar.b()));
                    break;
                }
                break;
            default:
                LogUtil.j("HwPayUtil", "dont supprot the tlv type = ", Integer.valueOf(CommonUtil.b(eewVar.e(), 16)));
                break;
        }
    }

    private static void d(mbm mbmVar, eew eewVar) throws NumberFormatException {
        if (eewVar == null) {
            return;
        }
        if (CommonUtil.b(eewVar.b(), 16) == 1) {
            mbmVar.c(true);
        } else {
            mbmVar.c(false);
        }
    }

    private static String c(List<String> list, int i, int i2, int i3) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
        } else {
            jSONArray = null;
        }
        try {
            jSONObject.put("cardInfo", jSONArray);
            jSONObject.put("cardNum", i);
            jSONObject.put("cardInfoStart", i2);
            jSONObject.put("cardInfoEnd", i3);
        } catch (JSONException e2) {
            LogUtil.e("HwPayUtil", "generateCardInfo happen jsonException", e2.getMessage());
        }
        return jSONObject.toString();
    }

    public static Object c(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayUtil", "parseAccessConfig messageHex is error");
            return null;
        }
        LogUtil.a("HwPayUtil", "parseAccessConfig messageHex", strE);
        try {
            List<eew> listE = e.b(strE.substring(4, strE.length())).e();
            if (listE == null) {
                LogUtil.j("HwPayUtil", "parseAccessConfig tlvs is null");
                return null;
            }
            mbj mbjVar = new mbj();
            for (eew eewVar : listE) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 1) {
                    mbjVar.d(CommonUtil.b(eewVar.b(), 16));
                } else if (iB == 2) {
                    mbjVar.c(CommonUtil.b(eewVar.b(), 16));
                } else if (iB == 3) {
                    mbjVar.e(CommonUtil.b(eewVar.b(), 16));
                } else if (iB != 127) {
                    LogUtil.j("HwPayUtil", "parseAccessConfig is default");
                } else {
                    mbjVar.a(CommonUtil.b(eewVar.b(), 16));
                }
            }
            return mbjVar.a();
        } catch (eeu unused) {
            LogUtil.e("HwPayUtil", "parseAccessConfig TlvException");
            return null;
        }
    }
}
