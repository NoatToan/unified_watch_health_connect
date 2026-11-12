package com.huawei.health.suggestion.model.customcourse;

import android.content.Context;
import com.huawei.health.suggestion.R;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.TargetConfig;
import defpackage.iat;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TypeConfig {
    public static List<iat> getTargetTypeList(Context context, int i) {
        ArrayList arrayList = new ArrayList(5);
        if (context == null) {
            return arrayList;
        }
        iat iatVarCreateChoiceModel = createChoiceModel(context, R.string.sug_time, 1);
        iat iatVarCreateChoiceModel2 = createChoiceModel(context, R.string.sug_distance, 0);
        iat iatVarCreateChoiceModel3 = createChoiceModel(context, R.string.sug_target_type_calories, 3);
        iat iatVarCreateChoiceModel4 = createChoiceModel(context, R.string.IDS_main_watch_heart_rate_string, 5);
        iat iatVarCreateChoiceModel5 = createChoiceModel(context, R.string.IDS_sug_none, 255);
        if (i == 0) {
            iatVarCreateChoiceModel2.e(true);
        } else if (i == 1) {
            iatVarCreateChoiceModel.e(true);
        } else if (i == 3) {
            iatVarCreateChoiceModel3.e(true);
        } else if (i == 4 || i == 5) {
            iatVarCreateChoiceModel4.e(true);
        } else if (i == 255) {
            iatVarCreateChoiceModel5.e(true);
        }
        arrayList.add(iatVarCreateChoiceModel);
        arrayList.add(iatVarCreateChoiceModel2);
        arrayList.add(iatVarCreateChoiceModel3);
        arrayList.add(iatVarCreateChoiceModel4);
        arrayList.add(iatVarCreateChoiceModel5);
        return arrayList;
    }

    private static iat createChoiceModel(Context context, int i, int i2) {
        Attribute attribute = new Attribute();
        attribute.saveName(context.getResources().getString(i));
        attribute.saveId(Integer.toString(i2));
        return new iat(false, attribute);
    }

    public static List<iat> getIntensityTypeList(Context context, int i) {
        ArrayList arrayList = new ArrayList(6);
        if (context == null) {
            return arrayList;
        }
        iat iatVarCreateChoiceModel = createChoiceModel(context, R.string.IDS_sug_none, 255);
        iat iatVarCreateChoiceModel2 = createChoiceModel(context, R.string.IDS_sug_heart_rate_zone, 17);
        iat iatVarCreateChoiceModel3 = createChoiceModel(context, R.string.IDS_motiontrack_pace_zone, 13);
        iat iatVarCreateChoiceModel4 = createChoiceModel(context, R.string.IDS_sug_run_pace, 15);
        iat iatVarCreateChoiceModel5 = createChoiceModel(context, R.string.IDS_sug_cadence, 16);
        iat iatVarCreateChoiceModel6 = createChoiceModel(context, R.string.IDS_sug_heart_rate_range, 1);
        if (i == 1) {
            iatVarCreateChoiceModel6.e(true);
        } else if (i == 13) {
            iatVarCreateChoiceModel3.e(true);
        } else if (i == 255) {
            iatVarCreateChoiceModel.e(true);
        } else {
            switch (i) {
                case 15:
                    iatVarCreateChoiceModel4.e(true);
                    break;
                case 16:
                    iatVarCreateChoiceModel5.e(true);
                    break;
                case 17:
                    iatVarCreateChoiceModel2.e(true);
                    break;
            }
        }
        arrayList.add(iatVarCreateChoiceModel);
        arrayList.add(iatVarCreateChoiceModel2);
        arrayList.add(iatVarCreateChoiceModel3);
        arrayList.add(iatVarCreateChoiceModel4);
        arrayList.add(iatVarCreateChoiceModel5);
        arrayList.add(iatVarCreateChoiceModel6);
        return arrayList;
    }

    public static String[] getRepeatTimeArray(Context context, int i) {
        int i2 = i - 1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 + 2;
            strArr[i3] = context.getResources().getQuantityString(R.plurals.sug_share_group, i4, UnitUtil.e(i4, 1, 0));
        }
        return strArr;
    }

    public static void setDefaultImperialData(TargetConfig targetConfig) {
        if (UnitUtil.f()) {
            if (targetConfig.getId().equals(Integer.toString(0))) {
                targetConfig.setValueL(UnitUtil.c(1.0d, 3) * 1000.0d);
            }
            if (targetConfig.getId().equals(Integer.toString(15))) {
                targetConfig.setValueL(UnitUtil.e(630, 3) * 1000.0d);
                targetConfig.setValueH(UnitUtil.e(720, 3) * 1000.0d);
            }
        }
    }
}
