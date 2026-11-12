package com.google.zxing.maxicode.decoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.baseflow.permissionhandler.m;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.zxing.common.BitMatrix;
import com.haibin.calendarview.BuildConfig;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.applet.AppletConfig;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mipay.MipayKt;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.watch.companion.cloud.WebResponse;
import com.huami.watch.dataflow.chart.util.AnimUtil;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.HMBleConstant;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.gdsp.breathrate.BreathRateEventParser;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import com.xiaomi.infra.galaxy.fds.Common;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import it.sauronsoftware.ftp4j.FTPCodes;
import org.threeten.bp.chrono.ThaiBuddhistChronology;

/* JADX INFO: loaded from: classes4.dex */
final class a {
    private static final int[][] b = {new int[]{121, 120, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, 157, 156, 163, 162, 169, 168, 175, DataTypeSource.SPORT_TYPE_CHECKERS, DataTypeSource.SPORT_TYPE_DOWNHILL, 180, DataTypeSource.SPORT_TYPE_TAP_DANCE, DataTypeSource.SPORT_TYPE_DISCO, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, DataTypeSource.SPORT_TYPE_BRIDGE, 183, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING, 189, 188, Constant.WEIGHT_DEFAULT_IMPERIAL, 194, 201, 200, StageEnum.APP_TWS_START_UPDTAE_NV_KEY, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, 155, 154, 161, 160, 167, 166, DataTypeSource.SPORT_TYPE_CHESS, 172, DataTypeSource.SPORT_TYPE_SHOOT, DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING, DataTypeSource.SPORT_TYPE_MODERN_DANCE, DataTypeSource.SPORT_TYPE_BOULDERING, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, 190, 197, 196, 203, 202, 818, 817}, new int[]{283, 282, 277, 276, 271, 270, WeightingState.state_bodyfat_detail, WeightingState.state_weight_detail, 259, 258, PageType.PAGE_SHORTCUT, 252, Mtu.ATT_MTU_MAX, 246, 241, 240, 235, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, AppletConfig.DEFAULT_DEVICE_SOURCE, 228, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 222, 217, 216, 211, m.d, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, 249, 248, Constant.HEIGHT_MAX, 242, 237, 236, 231, FTPCodes.USER_LOGGED_IN, 225, 224, 219, 218, 213, 212, 207, 206, 821, 820}, new int[]{ConstantKt.DRAW_END_INDEX, 286, 281, 280, 275, 274, 269, 268, WeightingState.state_low_power, WeightingState.state_weight_overload, 257, 256, 251, 250, com.unionpay.tsmservice.data.Constant.PLAIN_TEXT_MAX_LENGTH, 244, 239, 238, 233, 232, FTPCodes.ENTER_PASSIVE_MODE, FTPCodes.DATA_CONNECTION_CLOSING, 221, 220, FTPCodes.NAME_SYSTEM_TIME, FTPCodes.HELP_MESSAGE, m.c, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, TypedValues.AttributesType.TYPE_PIVOT_TARGET, SportDeviceUtils.SOURCE_ZURICH_W, SportDeviceUtils.SOURCE_ZURICH, FTPCodes.USERNAME_OK, SportDeviceUtils.SOURCE_MADRID_W, 337, 336, PnP.ID_HUAMI, SportDeviceUtils.SOURCE_SOFIA_W, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, SportDeviceUtils.SOURCE_VERONA_W, SportDeviceUtils.SOURCE_VERONA, AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID, FTPCodes.NEED_ACCOUNT, 339, 338, 345, 344, 351, FTPCodes.PENDING_FURTHER_INFORMATION, 357, 356, 363, 362, BuildConfig.VERSION_CODE, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, 304, 311, 310, TypedValues.AttributesType.TYPE_EASING, TypedValues.AttributesType.TYPE_PATH_ROTATE, 323, 322, SportDeviceUtils.SOURCE_MADRID, 328, 335, 334, 341, 340, SportDeviceUtils.SOURCE_PROVENCE_W, SportDeviceUtils.SOURCE_PROVENCE, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{Common.HTTP_STATUS_CONFLICT, 408, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, 410, Common.HTTP_STATUS_METHOD_NOT_ALLOWED, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{413, 412, 407, 406, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{415, 414, 421, 420, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, StageEnum.APP_TWS_RESULT_FOTA_FILE_SYSTEM_NVKEY_SUCCESS, StageEnum.APP_TWS_RESULT_FOTA_NV_SUCCESS}, new int[]{417, 416, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, PsExtractor.o, 440, 447, 446, StageEnum.APP_TWS_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, -3}, new int[]{419, 418, 425, 424, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, PsExtractor.l, 449, 448, 836, 835}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, FTPCodes.FILE_ACTION_NOT_TAKEN, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 453, 452, 839, 838}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, HMBleConstant.MAX_LATENCY_MIN, 455, 454, HMSedentaryConfig.INGORE_STOP_INDEX, -3}, new int[]{487, 486, FacebookRequestErrorClassification.ESC_APP_INACTIVE, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, TypedValues.PositionType.TYPE_SIZE_PERCENT, 504, 511, 510, 517, 516, 842, 841}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, TypedValues.PositionType.TYPE_PERCENT_Y, TypedValues.PositionType.TYPE_PERCENT_X, 513, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, TypedValues.PositionType.TYPE_CURVE_FIT, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, FTPCodes.FILE_NAME_NOT_ALLOWED, FTPCodes.EXCEEDED_STORAGE_ALLOCATION, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, StageEnum.APP_INTEGRITY_CHECK_SUCCESS, StageEnum.APP_WRITE_START, 523, 522, 846, -3}, new int[]{561, StageEnum.APP_NV_KEY_UPDATE_START, 555, RtspMessageChannel.i, 549, 548, ThaiBuddhistChronology.d, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, FTPCodes.NOT_LOGGED_IN, RaceId.RACE_SWITCH_POWER_MODE, RaceId.RACE_GET_POWER_MODE, 848, 847}, new int[]{563, 562, 557, 556, FTPCodes.PAGE_TYPE_UNKNOWN, 550, StageEnum.APP_FILE_SYSTEM_NEED_RESTORE, StageEnum.APP_FILE_SYSTEM_ERASE_START, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, StageEnum.APP_RESULT_FOTA_FILE_SYSTEM_NVKEY_SUCCESS, StageEnum.APP_RESULT_FOTA_NV_SUCCESS, 583, 582, 589, 588, 595, 594, 601, 600, TypedValues.MotionType.TYPE_PATHMOTION_ARC, TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, 613, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, StageEnum.APP_RESULT_FOTA_FAIL_FILE_SYSTEM_RESTORE, 585, 584, 591, 590, 597, 596, TypedValues.MotionType.TYPE_EASING, TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, TypedValues.MotionType.TYPE_DRAW_PATH, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{BreathRateEventParser.DATA_UNIT_SIZE, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, DTransferConstants.NO_AUTHORIZED_CODE, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, WebResponse.CODE_LIKED, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, TypedValues.TransitionType.TYPE_INTERPOLATOR, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, AnimUtil.DURATION_CHART_SLEEP_SWITCH, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, TypedValues.TransitionType.TYPE_STAGGERED, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, MipayKt.REQUEST_PAY, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, ChartTransmitUtil.MODE_EDIT, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, StageEnum.APP_TWS_INTEGRITY_CHECK_SUCCESS, StageEnum.APP_TWS_WRITE_START, 791, 790, 797, 796, 803, StageEnum.APP_TWS_NEW_FILE_SYSTEM_UPDATE_COMPLETE, 809, 808, 815, 814, 863, 862}};
    private final BitMatrix a;

    public a(BitMatrix bitMatrix) {
        this.a = bitMatrix;
    }

    public byte[] a() {
        byte[] bArr = new byte[144];
        int height = this.a.getHeight();
        int width = this.a.getWidth();
        for (int i = 0; i < height; i++) {
            int[] iArr = b[i];
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = iArr[i2];
                if (i3 >= 0 && this.a.get(i2, i)) {
                    int i4 = i3 / 6;
                    bArr[i4] = (byte) (((byte) (1 << (5 - (i3 % 6)))) | bArr[i4]);
                }
            }
        }
        return bArr;
    }
}
