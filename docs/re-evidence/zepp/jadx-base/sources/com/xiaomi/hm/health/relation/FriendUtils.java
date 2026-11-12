package com.xiaomi.hm.health.relation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.StringRes;
import com.xiaomi.hm.health.baseutil.UnitUtils;
import com.xiaomi.hm.health.manager.UnitManager;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes21.dex */
public class FriendUtils {
    public static String[] formatWeight(Context context, float f) {
        String[] strArr = new String[2];
        String string = context.getString(R.string.relatives_unit_kg);
        int weightUnit = UnitManager.getInstance().getWeightUnit();
        if (weightUnit == 1) {
            f = UnitUtils.kg2pound(f);
            string = context.getString(R.string.relatives_unit_yb);
        } else if (weightUnit == 16) {
            f = UnitUtils.kg2jin(f);
            string = context.getString(R.string.relatives_unit_sj);
        }
        strArr[0] = String.valueOf(f);
        strArr[1] = string;
        return strArr;
    }

    public static String getUtcString(Context context, int i, String str) {
        if (i == -100) {
            return TextUtils.isEmpty(str) ? "" : str;
        }
        return i >= 0 ? context.getString(R.string.relatives_friend_timezone_prex, Integer.valueOf(i / 3600)) : context.getString(R.string.relatives_friend_timezone_prex_f, Integer.valueOf(Math.abs(i) / 3600));
    }

    @StringRes
    public static int toAddResultMessage(int i) {
        if (i != 2) {
            return i != 4 ? R.string.relatives_send_fail : R.string.relatives_server_fault;
        }
        return R.string.relatives_add_friend_limit;
    }

    public static int transformWeight(Double d) {
        return new BigDecimal(d.toString()).multiply(new BigDecimal(100)).intValue();
    }

    public static float transformWeight(int i) {
        return new BigDecimal(i).divide(new BigDecimal(100), 2, 7).floatValue();
    }
}
