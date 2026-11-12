package com.xiaomi.account.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.xiaomi.accountsdk.utils.AccountLogger;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public class SplitUtils {
    private static final String EXTRA_KEY_EXEMPT_ADD_FORCE_SPLIT_FLAG = "exempt_add_force_split_flag";
    public static final int FLAG_MIUI_CANCEL_SPLIT = 8;
    public static final int FLAG_MIUI_FORCE_SPLIT = 16;
    public static final int FLAG_MIUI_SPLIT_ACTIVITY = 4;
    private static final String TAG = "SplitUtils";

    public static void addMiuiFlags(Intent intent, int i) {
        try {
            intent.getClass().getMethod("addMiuiFlags", Integer.TYPE).invoke(intent, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            AccountLogger.log(TAG, "reflect addMiuiFlag error: " + e);
        }
    }

    public static void clearCancelSplitFlag(Intent intent) {
        if (isIntentFromSettingSplit(intent)) {
            clearCancelSplitFlagIfExist(intent);
        }
    }

    public static void clearCancelSplitFlagIfExist(Intent intent) {
        int miuiFlags = getMiuiFlags(intent);
        if (miuiFlags == -1 || (miuiFlags & 8) == 0) {
            return;
        }
        setMiuiFlags(intent, miuiFlags ^ 8);
    }

    private static int getMiuiFlags(Intent intent) {
        try {
            return ((Integer) intent.getClass().getMethod("getMiuiFlags", new Class[0]).invoke(intent, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            AccountLogger.log(TAG, "reflect getMiuiFlags error: " + e);
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x004f A[RETURN] */
    public static boolean isCurrentDisplayMoreThanHalfScreen(Context context) {
        float f;
        float f2;
        int i;
        Point point = new Point();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRealSize(point);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (!isLandscape(point)) {
            float f3 = displayMetrics.widthPixels / (point.x + 0.0f);
            if (f3 == 1.0f) {
                f2 = displayMetrics.heightPixels;
                i = point.y;
            } else {
                f = f3;
            }
            if (isInRegion(f, 0.0f, 0.5f)) {
                return false;
            }
            return true;
        }
        f2 = displayMetrics.widthPixels;
        i = point.x;
        f = f2 / (i + 0.0f);
        if (isInRegion(f, 0.0f, 0.5f)) {
            return false;
        }
        return true;
    }

    private static boolean isInRegion(float f, float f2, float f3) {
        return f >= f2 && f < f3;
    }

    public static boolean isIntentExemptAddForceSplitFlag(Intent intent) {
        return intent.getBooleanExtra(EXTRA_KEY_EXEMPT_ADD_FORCE_SPLIT_FLAG, false);
    }

    public static boolean isIntentFromSettingSplit(Intent intent) {
        int miuiFlags = getMiuiFlags(intent);
        return (miuiFlags == -1 || (miuiFlags & 4) == 0) ? false : true;
    }

    private static boolean isLandscape(Point point) {
        return point.x > point.y;
    }

    public static void removeIntentExemptAddForceSplitFlag(Intent intent) {
        intent.removeExtra(EXTRA_KEY_EXEMPT_ADD_FORCE_SPLIT_FLAG);
    }

    public static void removeSplitModeKeyOnPad(Intent intent) {
        if (intent.hasExtra("miui.extra.splitmode")) {
            intent.removeExtra("miui.extra.splitmode");
        }
    }

    public static void setIntentExemptAddForceSplitFlag(Intent intent) {
        intent.putExtra(EXTRA_KEY_EXEMPT_ADD_FORCE_SPLIT_FLAG, true);
    }

    private static void setMiuiFlags(Intent intent, int i) {
        try {
            intent.getClass().getMethod("setMiuiFlags", Integer.TYPE).invoke(intent, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            AccountLogger.log(TAG, "reflect getMiuiFlags error: " + e);
        }
    }
}
