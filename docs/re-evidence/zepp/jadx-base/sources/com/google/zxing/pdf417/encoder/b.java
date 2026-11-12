package com.google.zxing.pdf417.encoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.baseflow.permissionhandler.m;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.haibin.calendarview.BuildConfig;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.applet.AppletConfig;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.watch.companion.cloud.WebResponse;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.HMBleConstant;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateEventParser;
import com.xiaomi.infra.galaxy.fds.Common;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import it.sauronsoftware.ftp4j.FTPCodes;
import org.threeten.bp.chrono.ThaiBuddhistChronology;

/* JADX INFO: loaded from: classes4.dex */
final class b {
    private static final int[][] a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, RaceId.RACE_GET_POWER_MODE, 801, 132, 295, 116, PsExtractor.l, 428, 295, 42, DataTypeSource.SPORT_TYPE_BRIDGE, 65}, new int[]{361, 575, 922, RaceId.RACE_SWITCH_POWER_MODE, DataTypeSource.SPORT_TYPE_BRIDGE, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, WeightingState.state_low_power, 147, 593, 800, 571, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 803, 133, 231, 390, 685, SportDeviceUtils.SOURCE_MADRID_W, 63, 410}, new int[]{539, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 6, 93, 862, 771, 453, 106, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, ConstantKt.DRAW_END_INDEX, 107, TypedValues.PositionType.TYPE_SIZE_PERCENT, 733, 877, 381, 612, 723, 476, 462, 172, 430, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 858, 822, ThaiBuddhistChronology.d, 376, 511, 400, 672, 762, 283, DataTypeSource.SPORT_TYPE_BOULDERING, 440, 35, 519, 31, HMBleConstant.MAX_LATENCY_MIN, 594, 225, 535, 517, 352, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, HMSedentaryConfig.INGORE_STOP_INDEX, 629, 4, 381, 843, 623, WeightingState.state_weight_detail, ThaiBuddhistChronology.d}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 860, BreathRateEventParser.DATA_UNIT_SIZE, 193, 219, 129, DataTypeSource.SPORT_TYPE_DISCO, 236, ConstantKt.DRAW_END_INDEX, 192, 775, 278, DataTypeSource.SPORT_TYPE_CHESS, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, TypedValues.PositionType.TYPE_PERCENT_Y, 48, 228, 821, 808, 898, StageEnum.APP_TWS_WRITE_START, 663, 627, 378, 382, WeightingState.state_weight_overload, 380, TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, DTransferConstants.NO_AUTHORIZED_CODE, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, SportDeviceUtils.SOURCE_MADRID_W, 539, 297, 827, 865, 37, 517, StageEnum.APP_TWS_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, 315, 550, 86, 801, 4, 108, 539}, new int[]{RaceId.RACE_GET_POWER_MODE, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, TypedValues.Custom.TYPE_DIMENSION, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, BreathRateEventParser.DATA_UNIT_SIZE, 11, 204, 796, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, SportDeviceUtils.SOURCE_ZURICH_W, 240, 216, 257, 284, 549, m.c, 884, 315, 70, SportDeviceUtils.SOURCE_MADRID, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, TypedValues.Custom.TYPE_REFERENCE, 90, 2, 290, 743, 199, 655, TypedValues.Custom.TYPE_STRING, SportDeviceUtils.SOURCE_MADRID, 49, StageEnum.APP_TWS_NEW_FILE_SYSTEM_UPDATE_COMPLETE, 580, 355, 588, 188, 462, 10, 134, 628, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 479, 130, 739, 71, WeightingState.state_low_power, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 374, 601, 192, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 142, 673, 687, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, 722, 384, 177, 752, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 640, 455, 193, 689, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 805, 641, 48, 60, 732, 621, 895, StageEnum.APP_FILE_SYSTEM_ERASE_START, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, DTransferConstants.NO_AUTHORIZED_CODE, StageEnum.APP_WRITE_START, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, SportDeviceUtils.SOURCE_SOFIA_W, 126, 32, 681, FTPCodes.USERNAME_OK, 792, 620, 60, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, PsExtractor.o, 180, 791, 893, 754, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 383, 228, 749, 760, 213, 54, 297, 134, 54, StageEnum.APP_TWS_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, 299, 922, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 910, 532, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, TypedValues.PositionType.TYPE_SIZE_PERCENT, 579, 481, DataTypeSource.SPORT_TYPE_CHESS, 404, 251, 688, 95, 497, 555, 642, ThaiBuddhistChronology.d, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, Common.HTTP_STATUS_CONFLICT, 574, 118, 498, 285, 380, FTPCodes.PENDING_FURTHER_INFORMATION, 492, 197, WeightingState.state_bodyfat_detail, 920, 155, 914, 299, AppletConfig.DEFAULT_DEVICE_SOURCE, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, SportDeviceUtils.SOURCE_VERONA_W, 520, 435, ThaiBuddhistChronology.d, 203, WebResponse.CODE_LIKED, 249, SportDeviceUtils.SOURCE_PROVENCE, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, StageEnum.APP_FILE_SYSTEM_NEED_RESTORE, 37, 858, 916, FTPCodes.EXCEEDED_STORAGE_ALLOCATION, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, StageEnum.APP_TWS_WRITE_START, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, ConstantKt.DRAW_END_INDEX, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, AppletConfig.DEFAULT_DEVICE_SOURCE, 65, 861, 841, 512, 164, 477, 221, 92, 358, StageEnum.APP_TWS_INTEGRITY_CHECK_SUCCESS, 288, 357, 850, 836, 827, 736, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 94, 8, 494, 114, 521, 2, 499, 851, ThaiBuddhistChronology.d, 152, 729, 771, 95, 248, 361, StageEnum.APP_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, SportDeviceUtils.SOURCE_SOFIA_W, 244, DataTypeSource.SPORT_TYPE_CHESS, 35, 463, 651, 51, 699, 591, 452, StageEnum.APP_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, 37, 124, 298, FTPCodes.NEED_ACCOUNT, FTPCodes.EXCEEDED_STORAGE_ALLOCATION, 43, 427, 119, 662, ChartTransmitUtil.MODE_EDIT, 475, 850, 764, 364, StageEnum.APP_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, 911, 283, 711, 472, 420, Constant.PLAIN_TEXT_MAX_LENGTH, 288, 594, 394, 511, SportDeviceUtils.SOURCE_VERONA_W, 589, ChartTransmitUtil.MODE_EDIT, 699, 688, 43, 408, 842, 383, 721, 521, StageEnum.APP_NV_KEY_UPDATE_START, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, m.c, 563, 564, PnP.ID_HUAMI, 693, 109, TypedValues.MotionType.TYPE_DRAW_PATH, 563, 365, DataTypeSource.SPORT_TYPE_DOWNHILL, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, ChartTransmitUtil.MODE_EDIT, 618, 586, 424, StageEnum.APP_TWS_RESULT_FOTA_FILE_SYSTEM_NVKEY_SUCCESS, 77, 597, SportDeviceUtils.SOURCE_PROVENCE, 269, 757, 632, 695, 751, FTPCodes.USERNAME_OK, Mtu.ATT_MTU_MAX, DataTypeSource.SPORT_TYPE_BOULDERING, 45, 787, 680, 18, 66, 407, BuildConfig.VERSION_CODE, 54, 492, 228, 613, 830, 922, 437, 519, 644, TypedValues.Custom.TYPE_DIMENSION, 789, 420, 305, PsExtractor.o, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, StageEnum.APP_NV_KEY_UPDATE_START, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, m.d, 815, TypedValues.Custom.TYPE_DIMENSION, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 907, 817, DataTypeSource.SPORT_TYPE_TAP_DANCE, 62, 16, 425, 535, 336, 286, 437, 375, 273, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, SportDeviceUtils.SOURCE_MADRID_W, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, TypedValues.AttributesType.TYPE_PATH_ROTATE, SportDeviceUtils.SOURCE_SOFIA_W, 299, 534, 105, 667, 488, 640, 672, StageEnum.APP_RESULT_FOTA_NV_SUCCESS, 540, TypedValues.AttributesType.TYPE_PATH_ROTATE, 486, 721, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, FTPCodes.NEED_ACCOUNT, 899, 165, DTransferConstants.NO_AUTHORIZED_CODE, 600, SportDeviceUtils.SOURCE_ZURICH_W, 498, 655, 357, 752, 768, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, WeightingState.state_low_power}};

    private b() {
    }

    public static String a(CharSequence charSequence, int i) {
        int iB = b(i);
        char[] cArr = new char[iB];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iB - 1;
            int iCharAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((a[i][i3] * iCharAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * a[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(iB);
        for (int i4 = iB - 1; i4 >= 0; i4--) {
            if (cArr[i4] != 0) {
                cArr[i4] = (char) (929 - cArr[i4]);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    public static int b(int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i + 1);
    }

    public static int c(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i <= 40) {
            return 2;
        }
        if (i <= 160) {
            return 3;
        }
        if (i <= 320) {
            return 4;
        }
        if (i <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
