package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class tfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f49049a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f49050c;

    public static void a(boolean z) {
        f49050c = z;
    }

    public static void c(Context context, List<FunctionSetSubCardData> list, boolean z) {
        int i;
        int i2;
        if (context == null) {
            return;
        }
        if (f49049a) {
            LogUtil.a("FunctionSetCardBiUtil", "already upload");
            return;
        }
        if (njy.e(list)) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                FunctionSetSubCardData functionSetSubCardData = list.get(i3);
                if (functionSetSubCardData != null) {
                    if (functionSetSubCardData.hasCardData()) {
                        i++;
                    } else {
                        i2++;
                    }
                }
            }
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("dataCardNumber", Integer.valueOf(i));
        map.put("noDataCardNumber", Integer.valueOf(i2));
        map.put("smartRecommend", Boolean.valueOf(z));
        LogUtil.a("FunctionSetCardBiUtil", "onDestroy, eventMap: ", map.toString());
        lmf.d().c(context, AnalyticsValue.FUNCTION_CARD_2040168.value(), map, 0);
        f49049a = true;
    }

    public static void e(Context context, FunctionSetSubCardData functionSetSubCardData, boolean z, int i) {
        if (context == null || functionSetSubCardData == null) {
            return;
        }
        b(functionSetSubCardData, i, z);
        d(context, functionSetSubCardData);
    }

    public static void b(FunctionSetSubCardData functionSetSubCardData, int i, boolean z) {
        if (functionSetSubCardData == null) {
            LogUtil.a("FunctionSetCardBiUtil", "addOrDeleteCardBiEvent, cardReader is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("cardName", functionSetSubCardData.getCardId());
        map.put("smartRecommend", Boolean.valueOf(z));
        map.put("changeType", Integer.valueOf(i));
        if (i == 1) {
            map.put("noDataCardType", Integer.valueOf(functionSetSubCardData.getCurrentIsLargeCard() ? 1 : 2));
        } else if (i == 2) {
            map.put("noHideCardType", Boolean.valueOf(functionSetSubCardData.hasCardData()));
        } else if (i != 3) {
            LogUtil.a("FunctionSetCardBiUtil", "addOrDeleteCardBiEvent other changeType : ", Integer.valueOf(i));
        } else {
            map.put("hideCardType", Boolean.valueOf(functionSetSubCardData.hasCardData()));
        }
        LogUtil.a("FunctionSetCardBiUtil", "addOrDeleteCardBiEvent, eventMap: ", map.toString());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.FUNCTION_CARD_2040169.value(), map, 0);
    }

    public static void d(Context context, FunctionSetSubCardData functionSetSubCardData) {
        if (functionSetSubCardData == null) {
            LogUtil.j("FunctionSetCardBiUtil", "reader is null");
            return;
        }
        LogUtil.a("FunctionSetCardBiUtil", "biEventCardShow FUNCTION_CARD_2040170");
        lmf.d().a(context, AnalyticsValue.FUNCTION_CARD_2040170.value(), functionSetSubCardData.getShowOrClickBiInfo(0), 0);
        e(context, functionSetSubCardData);
    }

    public static void c(Context context, FunctionSetSubCardData functionSetSubCardData) {
        if (functionSetSubCardData == null) {
            LogUtil.j("FunctionSetCardBiUtil", "reader is null");
        } else {
            lmf.d().a(context, "2010114", functionSetSubCardData.getShowOrClickBiInfo(1), 0);
        }
    }

    private static int a(String str, List<FunctionSetSubCardData> list, Context context) {
        CardConfig cardConfig;
        for (int i = 0; i < list.size(); i++) {
            FunctionSetSubCardData functionSetSubCardData = list.get(i);
            if (functionSetSubCardData != null && (cardConfig = functionSetSubCardData.getCardConfig()) != null) {
                String cardId = cardConfig.getCardId();
                if (!TextUtils.isEmpty(cardId) && cardId.equals(str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void b(Context context, int i) {
        if (context == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put(CommonUtil.PAGE_TYPE, Integer.valueOf(i));
        map.put("smartRecommend", Boolean.valueOf(f49050c));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEvent, FUNCTION_CARD_2040171: ", map.toString());
        lmf.d().c(context, AnalyticsValue.FUNCTION_CARD_2040171.value(), map, 0);
    }

    public static void e(Context context, boolean z, int i) {
        if (context == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("smartRecommend", Boolean.valueOf(z));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventLongClick, map: ", map.toString());
        lmf.d().c(context, "2010105", map, 0);
    }

    public static void c(Context context, boolean z, int i, FunctionSetSubCardData functionSetSubCardData) {
        String cardId = functionSetSubCardData.getCardId();
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        map.put("cardName", cardId);
        map.put("smartRecommend", Boolean.valueOf(z));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventClickEditCard, map: ", map.toString());
        lmf.d().c(context.getApplicationContext(), AnalyticsValue.HEALTH_HOME_MANAGERMENT_CARD_2010032.value(), map, 0);
    }

    public static void e(Context context, int i, FunctionSetSubCardData functionSetSubCardData, List<FunctionSetSubCardData> list, boolean z, int i2) {
        String cardId = functionSetSubCardData.getCardId();
        int iA = a(cardId, list, context);
        HashMap map = new HashMap();
        map.put("cardName", cardId);
        map.put("curPosition", Integer.valueOf(iA));
        map.put("addResult", "");
        map.put("deleteResult", cardId);
        map.put("positionResult", e(context, iA, list));
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        map.put("smartRecommend", Boolean.valueOf(z));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventEditCard, map: ", map.toString());
        lmf.d().c(context.getApplicationContext(), "2060074", map, 0);
    }

    private static String e(Context context, int i, List<FunctionSetSubCardData> list) {
        if (i >= list.size() - 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = i + 1;
            if (i2 >= list.size()) {
                break;
            }
            if (list.get(i2) != null) {
                sb.append(list.get(i2).getCardId());
                sb.append(":");
                sb.append(i2);
                sb.append("->");
                sb.append(i);
                sb.append(";");
            }
            i = i2;
        }
        String string = sb.toString();
        return TextUtils.isEmpty(string) ? string : string.substring(0, string.length() - 1);
    }

    public static void d(Context context, boolean z, boolean z2, int i) {
        HashMap map = new HashMap();
        map.put("smartSwitch", Boolean.valueOf(z));
        map.put("click", 1);
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventSwitchStateChanged, map: ", map.toString());
        lmf.d().c(context.getApplicationContext(), "2010115", map, 0);
    }

    public static void b(Context context) {
        HashMap map = new HashMap();
        map.put("scroll", "1");
        map.put("smartRecommend", Boolean.valueOf(f49050c));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventHomeFragmentScrollToBottom, map: ", map.toString());
        lmf.d().c(context.getApplicationContext(), "2010065", map, 0);
    }

    public static void c(Context context, int i, boolean z, ArrayList<skw> arrayList, int i2, List<skw> list) {
        LogUtil.a("FunctionSetCardBiUtil", "lastCardList: ", arrayList);
        LogUtil.a("FunctionSetCardBiUtil", "curCardList: ", list);
        HashMap map = new HashMap();
        map.put("addResult", b(arrayList, list, i2));
        map.put("deleteResult", c(arrayList, list, i2));
        map.put("positionResult", a(arrayList, list, i2));
        map.put("click", 1);
        map.put("from", Integer.valueOf(i));
        map.put("smartRecommend", Boolean.valueOf(z));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventCardPositionChanged, map: ", map.toString());
        lmf.d().c(context.getApplicationContext(), "2060074", map, 0);
    }

    private static String a(ArrayList<skw> arrayList, List<skw> list, int i) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null && (iIndexOf = list.indexOf(arrayList.get(i2))) != -1 && iIndexOf != i2 && i2 < i && list.get(iIndexOf).e() == 1) {
                sb.append(arrayList.get(i2).b());
                sb.append(":");
                sb.append(i2);
                sb.append("->");
                sb.append(iIndexOf);
                sb.append(";");
            }
        }
        String string = sb.toString();
        return TextUtils.isEmpty(string) ? string : string.substring(0, string.length() - 1);
    }

    private static String c(ArrayList<skw> arrayList, List<skw> list, int i) {
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                String strB = arrayList.get(i2).b();
                if (i2 < i && c(list, strB, false)) {
                    arrayList2.add(strB);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            sb.append((String) arrayList2.get(i3));
            if (i3 != arrayList2.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static String b(ArrayList<skw> arrayList, List<skw> list, int i) {
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null) {
                String strB = list.get(i2).b();
                if (list.get(i2).e() == 1 && b(arrayList, strB, i)) {
                    arrayList2.add(strB);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            sb.append((String) arrayList2.get(i3));
            if (i3 != arrayList2.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private static boolean b(ArrayList<skw> arrayList, String str, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                String strB = arrayList.get(i2).b();
                if (!TextUtils.isEmpty(strB) && strB.equals(str) && i2 >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean c(List<skw> list, String str, boolean z) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) != null) {
                String strB = list.get(i).b();
                if (TextUtils.isEmpty(strB)) {
                    continue;
                } else {
                    boolean z2 = z ? false : false;
                    if (strB.equals(str) && z2) {
                        return true;
                    }
                }
            }
            i++;
        }
        return false;
    }

    private static void e(Context context, FunctionSetSubCardData functionSetSubCardData) {
        CardConfig cardConfig;
        if (functionSetSubCardData == null || (cardConfig = functionSetSubCardData.getCardConfig()) == null || !"PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW".equals(cardConfig.getCardId())) {
            return;
        }
        int cardType = !functionSetSubCardData.hasCardData() ? 0 : functionSetSubCardData.getCardType();
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("cardType", Integer.valueOf(cardType));
        lmf.d().c(context.getApplicationContext(), "2200013", map, 0);
    }
}
