package defpackage;

import com.tsmclient.smartcard.CardConstants;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class gzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, String[]> f19508a;

    static {
        HashMap map = new HashMap();
        f19508a = map;
        String[] strArr = {"805C000204"};
        map.put("BMAC_MOT", strArr);
        f19508a.put("GUANGXI", strArr);
        f19508a.put("XIAMEN_MOT", strArr);
        f19508a.put("SHIJIAZHUANG_MOT", strArr);
        f19508a.put("SPTC_V3", strArr);
        f19508a.put("DALIAN_MOT", strArr);
        f19508a.put("SUZHOU_MOT", strArr);
        f19508a.put("DALIAN", strArr);
        f19508a.put(CardConstants.HAERBIN, strArr);
        f19508a.put("HAINANTONG", strArr);
        f19508a.put("JILIN", strArr);
        f19508a.put("NANTONG", strArr);
        f19508a.put("SHENYANG_MOT", strArr);
        f19508a.put("GUIZHOU_MOT", strArr);
        f19508a.put("TIANJIN_MOT", strArr);
        f19508a.put("CHENGDU", strArr);
        f19508a.put(CardConstants.HZT, strArr);
        f19508a.put(CardConstants.CST, strArr);
        String[] strArr2 = {"00A40000023F01", "805C000204"};
        f19508a.put(CardConstants.NINGBO, strArr2);
        f19508a.put(CardConstants.QINGDAO, strArr2);
        f19508a.put("HEFEI", strArr2);
        f19508a.put(CardConstants.XIAN, strArr2);
        f19508a.put("XIAMEN", strArr2);
        String[] strArr3 = {"00A40000021001", "805C000204"};
        f19508a.put(CardConstants.WHT, strArr3);
        f19508a.put("SZT", strArr3);
        f19508a.put(CardConstants.ZHENGZHOU, strArr3);
        f19508a.put("LNT", new String[]{"00A4000002DDF1", "00A4000002ADF3", "805C000204"});
        f19508a.put(CardConstants.SUZHOUTONG, new String[]{"805C000104"});
        f19508a.put("CHONGQING", new String[]{"00A4040009A00000000386980701", "805C000204"});
    }

    public static String a(String str) {
        return "00A404" + String.format("%04x", Integer.valueOf(str.length() / 2)) + str;
    }

    public static String[] b(String str, String str2) {
        if ("LNT_MOT".equals(str)) {
            return new String[]{"00A4040010A0000006320101055800022058100000", "805C000204"};
        }
        if ("TAIZHOU_MOT".equals(str)) {
            return new String[]{"00A4040010A00000063201010531805441495A484F", "805C000204"};
        }
        if (CardConstants.HAERBIN.equals(str)) {
            return new String[]{"00A4040010A0000006320101051500484145524249", "00B0950000", "805C000204"};
        }
        String strA = a(str2);
        String[] strArr = f19508a.get(str);
        if (strArr == null) {
            return new String[]{strA, "805C000204"};
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        strArr2[0] = strA;
        System.arraycopy(strArr, 0, strArr2, 1, length);
        return strArr2;
    }

    public static boolean c(CardWrapper cardWrapper) {
        return "BMAC_MOT".equalsIgnoreCase(cardWrapper.mCardType);
    }

    public static boolean d(CardWrapper cardWrapper) {
        return cardWrapper.mCardType.startsWith("LNT_MOT");
    }
}
