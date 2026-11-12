package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetSubCardData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f34557a = false;

    public static void d(Context context, List<FunctionSetSubCardData> list, boolean z) {
        int i;
        int i2;
        if (context == null) {
            return;
        }
        if (f34557a) {
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
        f34557a = true;
    }

    public static void c(Context context, FunctionSetSubCardData functionSetSubCardData, boolean z, int i) {
        if (context == null || functionSetSubCardData == null) {
            return;
        }
        b(functionSetSubCardData, i, z);
        b(context, functionSetSubCardData);
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

    public static void b(Context context, FunctionSetSubCardData functionSetSubCardData) {
        if (functionSetSubCardData == null) {
            LogUtil.j("FunctionSetCardBiUtil", "reader is null");
            return;
        }
        LogUtil.a("FunctionSetCardBiUtil", "biEventCardShow FUNCTION_CARD_2040170");
        lmf.d().a(context, AnalyticsValue.FUNCTION_CARD_2040170.value(), functionSetSubCardData.getShowOrClickBiInfo(0), 0);
        d(context, functionSetSubCardData);
    }

    public static void a(Context context, FunctionSetSubCardData functionSetSubCardData) {
        if (functionSetSubCardData == null) {
            LogUtil.j("FunctionSetCardBiUtil", "reader is null");
        } else {
            lmf.d().a(context, "2010114", functionSetSubCardData.getShowOrClickBiInfo(1), 0);
        }
    }

    private static int b(String str, List<FunctionSetSubCardData> list, Context context) {
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

    public static void a(Context context, boolean z, int i) {
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

    public static void e(Context context, boolean z, int i, FunctionSetSubCardData functionSetSubCardData) {
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
        int iB = b(cardId, list, context);
        HashMap map = new HashMap();
        map.put("cardName", cardId);
        map.put("curPosition", Integer.valueOf(iB));
        map.put("addResult", "");
        map.put("deleteResult", cardId);
        map.put("positionResult", d(context, iB, list));
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        map.put("from", Integer.valueOf(i2));
        map.put("smartRecommend", Boolean.valueOf(z));
        LogUtil.a("FunctionSetCardBiUtil", "uploadBiEventEditCard, map: ", map.toString());
        lmf.d().c(context.getApplicationContext(), "2060074", map, 0);
    }

    private static String d(Context context, int i, List<FunctionSetSubCardData> list) {
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

    private static void d(Context context, FunctionSetSubCardData functionSetSubCardData) {
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
