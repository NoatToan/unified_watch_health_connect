package com.huami.watch.companion.watchface.utils;

import android.content.Context;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.bean.WatchFaceBean;
import com.huami.watch.companion.watchface.manager.BaseWatchFaceController;
import com.huami.watch.companion.watchface.manager.ClassicsWatchFaceController;
import com.huami.watch.companion.watchface.manager.DashBoardWatchFaceController;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceUtils {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 7;
    private static final int h = 8;
    private static final int i = 9;
    private static final int j = 10;
    private static final int k = 11;
    private static final int l = 12;

    private static String a(WatchFaceBean watchFaceBean) {
        if (watchFaceBean == null) {
            return null;
        }
        return watchFaceBean.getPkgNmae() + "_" + watchFaceBean.getSrvName();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    private static int b(WatchFaceBean watchFaceBean) {
        String strA = a(watchFaceBean);
        strA.hashCode();
        switch (strA) {
            case "com.huami.watch.watchface.two_com.huami.watch.watchface.XhDigitalWatchFaceTwo":
                return 2;
            case "com.huami.watch.watchface.ten_com.huami.watch.watchface.XhDigitalWatchFaceTen":
                return 10;
            case "com.huami.watch.watchface.three_com.huami.watch.watchface.XhDigitalWatchFaceThree":
                return 3;
            case "com.huami.watch.watchface.five_com.huami.watch.watchface.XhDigitalWatchFaceFive":
                return 5;
            case "com.huami.watch.watchface.eight_com.huami.watch.watchface.XhDigitalWatchFaceEight":
                return 8;
            case "com.huami.watch.watchface.four_com.huami.watch.watchface.XhDigitalWatchFaceFour":
                return 4;
            case "com.huami.watch.watchface.seven_com.huami.watch.watchface.XhDigitalWatchFaceSeven":
                return 7;
            case "com.huami.watch.watchface.nine_com.huami.watch.watchface.XhDigitalWatchFaceNine":
                return 9;
            case "com.huami.watch.watchface.one_com.huami.watch.watchface.XhAnalogWatchFaceOne":
                return 1;
            case "com.huami.watch.watchface.eleven_com.huami.watch.watchface.XhDigitalWatchFaceEleven":
                return 11;
            case "com.huami.watch.watchface.six_com.huami.watch.watchface.XhAnalogWatchFaceSix":
                return 6;
            case "com.huami.watch.watchface.twelve_com.huami.watch.watchface.XhDigitalWatchFaceTwelve":
                return 12;
            default:
                return -1;
        }
    }

    public static int getWatchFaceBg(WatchFaceBean watchFaceBean) {
        switch (b(watchFaceBean)) {
            case 1:
                return R.drawable.watch_face_normal_bg;
            case 2:
                return R.drawable.watch_face_dash_board_bg;
            case 3:
                return R.drawable.watch_face_perserve_bg;
            case 4:
                return R.drawable.watch_face_simple_bg;
            case 5:
                return R.drawable.watch_face_look_stars_bg;
            case 6:
                return R.drawable.watch_face_ferris_wheel;
            case 7:
                return R.drawable.watch_face_mcu_avengers;
            case 8:
                return R.drawable.watch_face_heroes;
            case 9:
                return R.drawable.watch_face_warm_heart;
            case 10:
                return R.drawable.watch_face_flame_red;
            case 11:
                return R.drawable.watch_face_delicate_elegant;
            case 12:
                return R.drawable.watch_face_refine_on;
            default:
                return R.drawable.watch_face_list_default;
        }
    }

    public static BaseWatchFaceController getWatchFaceController(Context context, WatchFaceBean watchFaceBean) {
        if (watchFaceBean == null) {
            return null;
        }
        int iB = b(watchFaceBean);
        if (iB == 1) {
            return new ClassicsWatchFaceController(context, watchFaceBean);
        }
        if (iB != 2) {
            return null;
        }
        return new DashBoardWatchFaceController(context, watchFaceBean);
    }
}
