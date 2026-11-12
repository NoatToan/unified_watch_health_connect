package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.analytics.AnalyticManager;
import com.miui.tsmclient.analytics.TSMDataStatInterface;
import com.miui.tsmclient.database.c;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoManager;
import com.miui.tsmclient.nfc.NfcOperatorManager;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.APDUConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ljs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f25141a;

    public static int a(Context context) {
        return DeviceUtils.getAppVersionCode(context);
    }

    public static String b(CardInfo cardInfo) {
        return DeviceUtils.getDeviceModel(cardInfo);
    }

    public static String c(String str) {
        return (str == null || str.length() < 3 || !h(str)) ? str : str.substring(0, str.length() - 3);
    }

    public static void d(Context context, CardInfo cardInfo, boolean z) {
        if (cardInfo.isTransCard() && z) {
            PrefUtils.putSecureSettings(context, PrefUtils.SETTINGS_SYSTEM_PREF_KEY_TRANS_CARD, 1);
        }
    }

    public static boolean e(Context context, CardInfo cardInfo) {
        if (cardInfo == null || TextUtils.isEmpty(cardInfo.mAid)) {
            LogUtils.w("Aid of activated card must not be empty");
            return false;
        }
        String aid = cardInfo.getAid();
        LogUtils.d("activateCard appAid:" + aid);
        HashMap map = new HashMap();
        map.put("aid", c(cardInfo.mAid));
        AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_LAUNCH, "activateCard"), map);
        ArrayList arrayList = new ArrayList();
        arrayList.add("0");
        arrayList.add(cardInfo.mAid);
        TSMDataStatInterface.getInstance().recordListEvent(3, arrayList);
        if (!cardInfo.getTerminal().activateCard(aid)) {
            AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_FAILED, "activateCard"), map);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("-1");
            arrayList2.add(cardInfo.mAid);
            TSMDataStatInterface.getInstance().recordListEvent(3, arrayList2);
            return false;
        }
        d(context, cardInfo, false);
        LogUtils.d("activateCard appAid:" + aid + " success");
        AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_SUCCESS, "activateCard"), map);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("1");
        arrayList3.add(cardInfo.mAid);
        TSMDataStatInterface.getInstance().recordListEvent(3, arrayList3);
        return true;
    }

    public static String f(CardInfo cardInfo) {
        return DeviceUtils.getMIUIRomType(cardInfo);
    }

    public static void g(Context context, CardInfo cardInfo) {
        CardInfoManager.getInstance(context).remove(cardInfo);
        PrefUtils.remove(context, String.format(PrefUtils.PREF_KEY_CARD_EXTRA, cardInfo.mCardType));
        PrefUtils.remove(context, String.format(PrefUtils.PREF_KEY_ISSUED_CARD_EXTRA_DATA, cardInfo.mCardType));
        if (cardInfo.cardIdEquals(PrefUtils.getString(context, PrefUtils.PREF_KEY_LAST_CARD, null))) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_LAST_CARD);
        }
        String string = PrefUtils.getString(context, PrefUtils.PREF_KEY_LAST_TRANSIT_CARD, null);
        if (!TextUtils.isEmpty(string) && string.equals(cardInfo.mAid)) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_LAST_TRANSIT_CARD);
        }
        String string2 = PrefUtils.getString(context, PrefUtils.PREF_KEY_LAST_MIFARE_CARD, null);
        if (!TextUtils.isEmpty(string2) && string2.equals(cardInfo.mAid)) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_LAST_MIFARE_CARD);
        }
        String string3 = PrefUtils.getString(context, PrefUtils.PREF_KEY_LAST_MIPAY_CARD, null);
        if (!TextUtils.isEmpty(string3) && string3.equals(cardInfo.mAid)) {
            PrefUtils.remove(context, PrefUtils.PREF_KEY_LAST_MIPAY_CARD);
        }
        c.a().b(context, cardInfo.mCardName);
        if (PrefUtils.getTravelInfoTip(context, cardInfo.mAid) != null) {
            PrefUtils.setTravelInfoTip(context, cardInfo.mAid, null);
        }
    }

    public static final boolean h(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(Coder.bytesToHexString(APDUConstants.PBOC_CARD_AID_PREFFIX));
    }

    public static String i() {
        return DeviceUtils.getHyperOSRomType();
    }

    public static boolean j(Context context, CardInfo cardInfo) {
        if (cardInfo == null || TextUtils.isEmpty(cardInfo.mAid)) {
            LogUtils.w("Aid of deactivated card must not be empty");
            return false;
        }
        HashMap map = new HashMap();
        map.put("aid", c(cardInfo.mAid));
        AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_LAUNCH, "deactivateCard"), map);
        ArrayList arrayList = new ArrayList();
        arrayList.add("0");
        arrayList.add(cardInfo.mAid);
        TSMDataStatInterface.getInstance().recordListEvent(4, arrayList);
        if (!cardInfo.getTerminal().deactivateCard(cardInfo.getAid())) {
            AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_FAILED, "deactivateCard"), map);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("-1");
            arrayList2.add(cardInfo.mAid);
            TSMDataStatInterface.getInstance().recordListEvent(4, arrayList2);
            return false;
        }
        LogUtils.d("deactivateCard appAid:" + cardInfo.getAid() + " success");
        AnalyticManager.getInstance().recordEvent("nfc", String.format(AnalyticManager.KEY_OPERATION_SUCCESS, "deactivateCard"), map);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("1");
        arrayList3.add(cardInfo.mAid);
        TSMDataStatInterface.getInstance().recordListEvent(4, arrayList3);
        return true;
    }

    public static String k() {
        return DeviceUtils.getHyperOSVersion();
    }

    public static String l(Context context) {
        String string = PrefUtils.getString(context, Constants.KEY_FID, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            Bundle bundleCall = context.getContentResolver().call(Uri.parse(Constants.CONTENT_PROVIDER_URI_NEXT_PAY), Constants.KEY_FID, (String) null, (Bundle) null);
            if (bundleCall == null) {
                return string;
            }
            string = bundleCall.getString(Constants.KEY_FID, "");
            PrefUtils.putString(context, Constants.KEY_FID, string);
            return string;
        } catch (IllegalArgumentException e) {
            LogUtils.e("isn't exist for fid provider", e);
            return string;
        }
    }

    public static List<String> m(CardInfo cardInfo) {
        return DeviceUtils.getSIMNumber(cardInfo);
    }

    public static String n() {
        return DeviceUtils.getRomVersion();
    }

    public static String o(Context context) {
        LogUtils.d("read nfcId from cache");
        if (TextUtils.isEmpty(f25141a)) {
            LogUtils.d("read nfcId from pref");
            String string = PrefUtils.getString(context, PrefUtils.PREF_KEY_NFC_ID, "");
            f25141a = string;
            if (TextUtils.isEmpty(string)) {
                LogUtils.d("read nfcId");
                byte[] nfccDieid = NfcOperatorManager.getOperator().getNfccDieid();
                if (nfccDieid != null) {
                    String strBytesToHexString = Coder.bytesToHexString(nfccDieid);
                    f25141a = strBytesToHexString;
                    if ("00000000000000000000000000000000".equals(strBytesToHexString)) {
                        f25141a = null;
                    }
                    PrefUtils.putString(context, PrefUtils.PREF_KEY_NFC_ID, f25141a);
                }
            }
        }
        return f25141a;
    }

    public static Bundle p(Context context) {
        try {
            String signedSpiPk = NfcOperatorManager.getOperator().getSignedSpiPk();
            if (signedSpiPk == null) {
                return null;
            }
            LogUtils.d("signedPK : " + signedSpiPk);
            String[] strArrSplit = signedSpiPk.split(gv5.CONNECT_STR);
            HashMap map = new HashMap();
            for (int i = 0; i < strArrSplit.length; i++) {
                int iIndexOf = strArrSplit[i].indexOf(61);
                if (iIndexOf != -1 && iIndexOf < strArrSplit[i].length() - 1) {
                    String strSubstring = strArrSplit[i].substring(0, iIndexOf);
                    String str = strArrSplit[i];
                    map.put(strSubstring, str.substring(iIndexOf + 1, str.length()));
                }
            }
            Bundle bundle = new Bundle();
            bundle.putString(Constants.KEY_CPU_MODEL, (String) map.get(Constants.KEY_CPU_MODEL));
            bundle.putString("deviceModel", (String) map.get("deviceModel"));
            bundle.putString(Constants.KEY_KEY_ALG, (String) map.get(Constants.KEY_KEY_ALG));
            bundle.putString(Constants.KEY_PKX, (String) map.get(Constants.KEY_PKX));
            bundle.putString(Constants.KEY_PKY, (String) map.get(Constants.KEY_PKY));
            bundle.putString(Constants.KEY_TZID, (String) map.get(Constants.KEY_TZID));
            bundle.putString("sign", (String) map.get("sign"));
            return bundle;
        } catch (Exception e) {
            LogUtils.e("getSignedSpiPk error", e);
            return null;
        }
    }
}
