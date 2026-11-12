package com.huawei.health.health.utils.functionsetcard;

import android.content.Context;
import android.os.ParcelFormatException;
import com.huawei.hwcommonmodel.fitnessdatatype.ResultUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CardFlowInteractors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f7073a = new ArrayList();

    public CardFlowInteractors(Context context) {
        for (CardNameConstants cardNameConstants : CardNameConstants.values()) {
            this.f7073a.add(cardNameConstants.getName());
        }
    }

    public static void b(Context context, String str, int i) {
        SharedPreferenceManager.e(context, String.valueOf(10000), str, String.valueOf(i), new StorageParams());
    }

    public static int d(Context context, String str, int i) {
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), str);
        if ("".equals(strE)) {
            strE = String.valueOf(i);
        }
        if (strE == null || "".equals(strE)) {
            return -99;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("CardFlowInteractors", "NumberFormatException ", LogAnonymous.b(e));
            return 0;
        }
    }

    public static Map<String, Integer> a(Context context, Map<String, Integer> map) {
        HashMap map2 = new HashMap();
        String strE = SharedPreferenceManager.e(context, String.valueOf(10000), "SERVICE_CARD_KEY");
        boolean z = strE == null || "".equals(strE);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            String strE2 = SharedPreferenceManager.e(context, String.valueOf(10000), key);
            if (strE2 == null || "".equals(strE2)) {
                strE2 = "DEVICE_MANAGER_CARD".equals(key) ? map.size() + "" : String.valueOf(entry.getValue());
            } else if (z && !"SERVICE_CARD_KEY".equals(key)) {
                try {
                    int i = Integer.parseInt(strE2);
                    if (i >= 3 && i != 100 && i != 1000 && i != 900) {
                        strE2 = String.valueOf(i + 1);
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("CardFlowInteractors", "NumberFormatException ", LogAnonymous.b(e));
                }
            }
            try {
                try {
                    map2.put(entry.getKey(), Integer.valueOf(Integer.parseInt(strE2)));
                } catch (ParcelFormatException unused) {
                    map2.put(entry.getKey(), Integer.valueOf(Integer.parseInt(String.valueOf(entry.getValue()))));
                }
            } catch (NumberFormatException e2) {
                LogUtil.e("CardFlowInteractors", "NumberFormatException ", LogAnonymous.b(e2));
            }
        }
        return map2;
    }

    public enum CardIDConstants {
        TITLE_CARD(1000),
        DIALOG_CARD(-3),
        STEP_CARD(-2),
        ACHIEVEMENT_CARD(-1),
        OPERA_MSG_CARD(0),
        SPORT_RECORDING(1),
        FUNCTION_MENU_CARD(1),
        QUICK_ENTRY_CARD(1),
        FUNCTION_SET_CARD(2),
        HEALTH_HEAD_LINES_CARD(3),
        RUN_CARD(1000),
        TRAIN_CARD(1000),
        PREVIEW_CARD(4),
        TODO_CARD(5),
        CARE_CARD(6),
        STEP_TREND_CARD(7),
        RUN_TREND_CARD(8),
        SMART_CARD(9),
        FAMILY_HEALTH_CARD(10),
        HEALTH_TREND_CARD(9),
        OPERATION_CARD(11),
        HEALTH_MODEL_CARD(5),
        DEVICE_MANAGER_CARD(13),
        SPORTS_CARD(1000),
        WEIGHT_CARD(1000),
        SLEEP_CARD(1000),
        BLOODPRESSURE_CARD(1000),
        BLOODSUGAR_CARD(1000),
        HEARTRATE_CARD(1000),
        PHYSIOLOGICAL_CYCLE_CARD(1000),
        THREE_CIRCLE_CARD(1000),
        ACTIVE_HOUR_CARD(1000),
        BLOODOXYGEN_CARD(1000),
        TEMPERATURE_CARD(1000),
        PLAN_CARD(1000),
        BOTTOM_CARD(100);

        private int defaultIndex;

        CardIDConstants(int i) {
            this.defaultIndex = i;
        }

        public int getDefaultIndex() {
            return ((Integer) ResultUtils.commonFunc(Integer.valueOf(this.defaultIndex))).intValue();
        }
    }

    public enum CardNameConstants {
        TITLE_CARD("TITLE_CARD_KEY"),
        ACHIEVEMENT_CARD("ACHIEVEMENT_CARD_KEY"),
        STEP_CARD("STEP_CARD_KEY"),
        SPORT_RECORDING("SPORT_RECORDING"),
        QUICK_ENTRY_CARD("QUICK_ENTRY_CARD"),
        FUNCTION_SET_CARD("FUNCTION_SET_CARD_KEY"),
        FUNCTION_MENU_CARD("FUNCTION_MENU_CARD_KEY"),
        DIALOG_CARD("DIALOG_CARD_KEY"),
        HEALTH_HEAD_LINES_CARD("HEALTH_HEAD_LINES_KEY"),
        RUN_CARD("RUN_CARD_KEY"),
        TRAIN_CARD("TRAIN_CARD_KEY"),
        HEALTH_TREND_CARD("HEALTH_TREND_CARD_KEY"),
        OPERATION_CARD("OPERATION_CARD_KEY"),
        HEALTH_MODEL_CARD("HEALTH_MODEL_CARD_KEY"),
        PREVIEW_CARD("PREVIEW_CARD_KEY"),
        TODO_CARD("TODO_CARD_KEY"),
        CARE_CARD("CARE_CARD_KEY"),
        STEP_TREND_CARD("STEP_TREND_CARD_KEY"),
        RUN_TREND_CARD("RUN_TREND_CARD_KEY"),
        SMART_CARD("SMART_CARD_KEY"),
        OPERA_MSG_CARD("OPERA_MSG_CARD_KEY"),
        PLAN_CARD("PLAN_CARD_KEY"),
        SPORTS_CARD("SPORTS_CARD_KEY_NEW"),
        WEIGHT_CARD("WEIGHT_CARD_KEY_NEW"),
        SLEEP_CARD("SLEEP_CARD_KEY_NEW"),
        BLOODPRESSURE_CARD("BLOODPRESSURE_CARD_KEY_NEW"),
        BLOODSUGAR_CARD("BLOODSUGAR_CARD_KEY_NEW"),
        HEARTRATE_CARD("HEARTRATE_CARD_KAY_NEW"),
        BLOODOXYGEN_CARD("BLOODOXYGEN_CARD_KEY_NEW"),
        PHYSIOLOGICAL_CYCLE_CARD("PHYSIOLOGICAL_CYCLE_CARD_KEY_NEW"),
        THREE_CIRCLE_CARD("THREE_CIRCLE_CARD_KEY_NEW"),
        HEALTH_RECORD_CARD("Health_Record_CARD_KEY_NEW"),
        ACTIVE_HOUR_CARD("ACTIVE_HOUR_CARD_KEY_NEW"),
        DEVICE_MANAGER_CARD("DEVICE_MANAGER_CARD"),
        STRESS_CARD("STRESS_CARD_KEY_NEW"),
        TEMPERATURE_CARD("TEMPERATURE_CARD_KEY_NEW"),
        MANAGER_CARD("MANAGER_CARD_KEY_NEW"),
        SPORT_HISTORY("SPORT_HISTORY_NEW");

        private String name;

        CardNameConstants(String str) {
            this.name = str;
        }

        public String getName() {
            return (String) ResultUtils.commonFunc(this.name);
        }
    }
}
