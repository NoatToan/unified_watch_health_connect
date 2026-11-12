package defpackage;

import android.text.TextUtils;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.entity.SectorKey;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.MifareClassicTag;
import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.utils.NfcUtilsKt;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ltg {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static ltg f25421a = new ltg();
    }

    public ltg() {
    }

    public static ltg c() {
        return a.f25421a;
    }

    public static boolean d(String str) {
        ByteArray byteArrayWrap = ByteArray.wrap(Coder.hexStringToBytes(str));
        return ByteArray.equals(byteArrayWrap, APDUConstants.AID_HZT) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_LNT) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_SUZHOUTONG) || ByteArray.equals(byteArrayWrap, APDUConstants.AID_WHT);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String str2 = "door_yellow";
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isStaging()) {
            if (str.contains("1628784548174")) {
                str2 = "door_blue";
            } else if (!str.contains("1629165300387") && !str.contains("1629079022387")) {
                if (str.contains("1629105398492")) {
                    str2 = "door_red";
                } else if (str.contains("1628784559553")) {
                    str2 = "door_green";
                } else {
                    str2 = "door_default";
                }
            }
        } else if (str.contains(AppUtil.getApp().getString(o0j.l3))) {
            str2 = "door_blue";
        } else if (!str.contains(AppUtil.getApp().getString(o0j.r3))) {
            if (str.contains(AppUtil.getApp().getString(o0j.o3))) {
                str2 = "door_red";
            } else if (str.contains(AppUtil.getApp().getString(o0j.m3))) {
                str2 = "door_green";
            } else {
                str2 = "door_mi";
                if (!str.contains("xiaomi_staff_card") && !str.contains("door_mi")) {
                    str2 = "door_default";
                }
            }
        }
        vqg.d("shiftToSid url:" + str + " sid:" + str2);
        return str2;
    }

    public int a(String str) {
        try {
            return ssg.u().a(str);
        } catch (Exception e) {
            vqg.c("NfcSyncManager getBalance", e);
            return 0;
        }
    }

    public String b() throws Exception {
        vqg.d("TSM_SYNC getDefaultCard");
        return ssg.u().i();
    }

    public void checkCRSStatus(ssg.b bVar) throws Exception {
        ssg.u().checkCRSStatus(bVar);
    }

    public void closeTai(ssg.b<Boolean> bVar) {
        ssg.u().closeTai(bVar);
    }

    public wrg e(CardWrapper cardWrapper) {
        wrg wrgVar = new wrg();
        String str = cardWrapper.mAid;
        if (str == null || !str.contains(",")) {
            wrgVar.d = cardWrapper.mAid;
        } else {
            wrgVar.d = cardWrapper.mAid.split(",")[0];
        }
        if (cardWrapper.isMaster()) {
            wrgVar.e = cardWrapper.getBankName() + "(**** " + cardWrapper.bankCard.getTokenInfo().getAccountPanSuffix() + ")";
        } else {
            wrgVar.e = cardWrapper.mCardName;
        }
        wrgVar.f = "";
        String cardFace = cardWrapper.getCardFace();
        if (cardWrapper.isMaster()) {
            if (NfcUtilsKt.isOldMasterCardDevice() && cardWrapper.bankCard.getCardType() == 2) {
                wrgVar.c = 5;
            } else {
                wrgVar.c = 4;
            }
        } else if (cardWrapper.isTransit() || cardWrapper.isCloudTransit()) {
            wrgVar.c = 1;
            if (cardFace != null) {
                wrgVar.f = cardFace.replace("w1080h1920q80", "w360h640q80");
            }
            wrgVar.g = cardWrapper.mCardType;
            wrgVar.h = cardWrapper.mCardBalance;
            wrgVar.j = 23;
            wrgVar.f38284k = 1;
            wrgVar.l = 19;
            CardConfigManager.CardConfig cardConfig = CardConfigManager.getInstance().getCardConfig(wrgVar.d);
            if (cardConfig != null) {
                CardConfigManager.HciTLVRule hciTLVRule = cardConfig.getHciTLVRule(wrgVar.d);
                HashMap map = new HashMap();
                List<String> memberAidList = cardConfig.getMemberAidList();
                if (memberAidList != null) {
                    for (String str2 : memberAidList) {
                        CardConfigManager.HciTLVRule hciTLVRule2 = cardConfig.getHciTLVRule(str2);
                        if (hciTLVRule2 != null) {
                            map.put(str2, hciTLVRule2);
                        }
                    }
                }
                if (hciTLVRule != null) {
                    map.put(wrgVar.d, hciTLVRule);
                    vqg.d("zhu tlvHci is not null");
                } else {
                    vqg.d("zhu tlvHci is null cardName:" + wrgVar.e + " aid:" + wrgVar.d);
                }
                int size = map.size();
                wrg.b[] bVarArr = new wrg.b[size];
                int i = 0;
                for (Map.Entry entry : map.entrySet()) {
                    wrg.b bVarF = f((CardConfigManager.HciTLVRule) entry.getValue());
                    bVarF.c = (String) entry.getKey();
                    bVarArr[i] = bVarF;
                    i++;
                }
                wrgVar.m = bVarArr;
                vqg.d("tlvHci length is " + size);
                wrgVar.i = cardConfig.isSupportCityUHci(wrgVar.d);
                CardConfigManager.HCIRule hCIRule = cardConfig.getHCIRule(wrgVar.d);
                if (hCIRule != null) {
                    wrgVar.j = hCIRule.getDataLength();
                    wrgVar.l = hCIRule.getBalanceOffset();
                    wrgVar.f38284k = hCIRule.getTradeAmountOffset();
                    vqg.d("hci tradeLength:" + wrgVar.j + "   balanceOffset:" + wrgVar.l + "  tradeOffset:" + wrgVar.f38284k + " cardName:" + wrgVar.e + "  aid:" + wrgVar.d);
                } else {
                    vqg.d("hci hciRule = null cardName:" + wrgVar.e + "  aid:" + wrgVar.d);
                }
            } else {
                vqg.d("hci cardConfig = null :cardName:" + wrgVar.e + " aid:" + wrgVar.d);
            }
            wrgVar.i = wrgVar.i || d(wrgVar.d);
            wrgVar.n = gzp.b(cardWrapper.mCardType, cardWrapper.mAid);
            vqg.d("parse result.balance:" + wrgVar.h + "  cardInfo.mCardBalance:" + cardWrapper.mCardBalance + "  aid:" + cardWrapper.mAid + " name:" + cardWrapper.mCardName);
        } else if (cardWrapper.isMifare()) {
            wrgVar.c = 0;
            wrgVar.f = cardFace;
            wrgVar.g = i(cardFace);
        } else if (cardWrapper.isCar()) {
            wrgVar.d = cardWrapper.getAid();
            if (cardWrapper.getCategory() == CardCategory.ICCOA_DIGITAL_KEY) {
                wrgVar.c = 7;
            } else {
                wrgVar.c = 5;
            }
            wrgVar.g = cardWrapper.digitalKeyCardDetail.getVehicleBrandId();
            wrgVar.o = Coder.hexStringToBytes(cardWrapper.getId());
            vqg.d("car " + cardWrapper.digitalKeyCardDetail.getBrand() + "  sid" + cardWrapper.digitalKeyCardDetail.getVehicleBrandId() + " aid:" + cardWrapper.getAid() + " id:" + cardWrapper.getId());
        } else if (cardWrapper.isPrivateCarKey()) {
            wrgVar.d = cardWrapper.getAid();
            wrgVar.c = 8;
            vqg.d("out aid:" + cardWrapper.getAid());
        }
        vqg.d("aid: " + wrgVar.d + " name:" + cardWrapper.mCardName);
        return wrgVar;
    }

    public final wrg.b f(CardConfigManager.HciTLVRule hciTLVRule) {
        wrg.b bVar = new wrg.b();
        bVar.d = hciTLVRule.getTLVDataOffset();
        bVar.f = hciTLVRule.getTradeAmountTags();
        bVar.h = hciTLVRule.getBalanceTags();
        bVar.g = hciTLVRule.getTradeAmountOffset();
        bVar.i = hciTLVRule.getBalanceOffset();
        String hciPrefix = hciTLVRule.getHciPrefix();
        if (hciPrefix == null) {
            hciPrefix = "";
        }
        bVar.e = hciPrefix;
        return bVar;
    }

    public MifareTag g(int i) throws Exception {
        return ssg.u().r(i);
    }

    public void h() {
        ssg.u().w();
    }

    public void j(CardWrapper cardWrapper) {
        vqg.d("TSM_SYNC syncAddCard2Device cardName:" + cardWrapper.mCardName + "  aid:" + cardWrapper.mAid + "  id:" + cardWrapper.mSeCard.getId());
        if (cardWrapper.isCar()) {
            ssg.u().o(e(cardWrapper));
        } else {
            if (TextUtils.isEmpty(cardWrapper.mCardName) || TextUtils.isEmpty(cardWrapper.mAid)) {
                return;
            }
            ssg.u().o(e(cardWrapper));
        }
    }

    public void k(String str) {
        vqg.d("syncAidlDelDevice aid:" + str);
        ssg.u().f(str, 1);
    }

    public void l(String str, int i) {
        vqg.d("syncAidlDelDevice aid:" + str + " type:" + i);
        ssg.u().f(str, i);
    }

    public void m(String str, int i) {
        vqg.d("TSM_SYNC syncBalance aid:" + str + " balance:" + i);
        ssg.u().p(str, i);
    }

    public void n() {
        vqg.d("syncCardList2Device");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(zl3.g().g);
        arrayList.addAll(zl3.g().e);
        arrayList.addAll(zl3.g().f);
        o(true, arrayList);
    }

    public void o(boolean z, List<CardWrapper> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("syncCardList2Device size:");
        sb.append(list == null ? 0 : list.size());
        vqg.d(sb.toString());
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (CardWrapper cardWrapper : list) {
            if (!cardWrapper.isNeedActive()) {
                arrayList.add(cardWrapper);
            }
        }
        int size = arrayList.size();
        wrg[] wrgVarArr = new wrg[size];
        for (int i = 0; i < arrayList.size(); i++) {
            wrgVarArr[i] = e((CardWrapper) arrayList.get(i));
        }
        vqg.d("syncCardList2Device proto size:" + size);
        ssg.u().e(z, wrgVarArr);
    }

    public void openTai(ssg.b<Boolean> bVar) {
        ssg.u().openTai(bVar);
    }

    public void p() {
        vqg.d("TSM_SYNC syncCardList2Device");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(zl3.g().j);
        o(true, arrayList);
    }

    public void pinStatus(ssg.b bVar) throws Exception {
        ssg.u().pinStatus(bVar);
    }

    public boolean q(CardWrapper cardWrapper) throws Exception {
        int i;
        vqg.d("TSM_SYNC syncDefaultCard");
        if (cardWrapper.isTransit()) {
            i = 1;
        } else {
            i = cardWrapper.isMifare() ? 0 : 2;
        }
        return ssg.u().j(cardWrapper.mAid, i);
    }

    public void r(CardWrapper cardWrapper) {
        int i;
        vqg.d("syncDelCard2Device aid:" + cardWrapper.mAid);
        if (cardWrapper.isTransit()) {
            i = 1;
        } else if (cardWrapper.isCar()) {
            i = 5;
        } else {
            i = cardWrapper.isMifare() ? 0 : 2;
        }
        ssg.u().f(cardWrapper.mAid, i);
    }

    public void s(int i, int i2) {
        vqg.d("TSM_SYNC syncIssueStatus " + i + " " + i2);
        ssg.u().n(i, i2, "", "");
    }

    public void t(int i, int i2, CardWrapper cardWrapper) {
        String strI;
        vqg.d("syncIssueStatus  type:" + i + " status:" + i2);
        String cardFace = cardWrapper.getCardFace();
        if (cardWrapper.isTransit() || cardWrapper.isCloudTransit()) {
            String str = cardWrapper.mCardType;
            cardFace = cardWrapper.getCardFace();
            strI = str;
        } else {
            strI = i(cardFace);
        }
        ssg ssgVarU = ssg.u();
        if (TextUtils.isEmpty(strI)) {
            strI = "";
        }
        if (TextUtils.isEmpty(cardFace)) {
            cardFace = "";
        }
        ssgVarU.n(i, i2, strI, cardFace);
    }

    public void u(int i, int i2, String str) {
        if (i == 5) {
            ssg.u().n(i, i2, str, "");
            return;
        }
        vqg.d("TSM_SYNC syncIssueStatus type:" + i + " status:" + i2);
        String strI = i(str);
        ssg ssgVarU = ssg.u();
        if (TextUtils.isEmpty(strI)) {
            strI = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        ssgVarU.n(i, i2, strI, str);
    }

    public void v(CardWrapper cardWrapper) {
        vqg.d("TSM_SYNC syncUpdateCard2Device cardName:" + cardWrapper.mCardName);
        ssg.u().d(e(cardWrapper));
    }

    public void w(boolean z) {
        vqg.d("syncYoYoCard2Device start");
        wrg wrgVar = new wrg();
        wrgVar.c = 6;
        wrgVar.d = "A000000322100701";
        wrgVar.e = AppUtil.getApp().getString(o0j.C7);
        if (z) {
            ssg.u().e(false, new wrg[]{wrgVar});
        } else {
            ssg.u().o(wrgVar);
        }
    }

    public void x() {
        vqg.d("syncYoYoCardDelete2Device start");
        ssg.u().f("A000000322100701", 6);
    }

    public void y() {
        vqg.d("syncYoYoCard2Device start");
        ssg.u().e(false, new wrg[0]);
    }

    public MifareClassicTag z(List<SectorKey> list) throws Exception {
        return ssg.u().m(list);
    }
}
