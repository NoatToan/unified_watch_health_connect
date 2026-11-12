package defpackage;

import com.huawei.health.basefitnessadvice.R;

/* JADX INFO: loaded from: classes9.dex */
public class iec {
    public static String c(int i) {
        if (i == 0) {
            return btx.c().getResources().getString(R.string.sug_weight_beginner_L);
        }
        if (i == 1) {
            return btx.c().getResources().getString(R.string.sug_weight_intermediate_L);
        }
        if (i == 2) {
            return btx.c().getResources().getString(R.string.sug_weight_advanced_L);
        }
        if (i == 6) {
            return btx.c().getResources().getString(R.string.sug_weight_rudiments_L);
        }
        return "--";
    }

    public static String a(int i) {
        if (i == 0) {
            return btx.c().getResources().getString(R.string.sug_share_beginner_L);
        }
        if (i == 1) {
            return btx.c().getResources().getString(R.string.sug_share_intermediate_L);
        }
        if (i == 2) {
            return btx.c().getResources().getString(R.string.sug_share_advanced_L);
        }
        if (i == 6) {
            return btx.c().getResources().getString(R.string.sug_share_rudiments_L);
        }
        return "--";
    }
}
