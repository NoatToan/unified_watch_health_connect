package com.huawei.indoorequip.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.gzv;
import defpackage.izn;
import defpackage.ltc;
import defpackage.nyn;
import defpackage.nzc;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CombineSportEquipItemDrawer {
    private static final float COEFFICIENT_OF_CAL_INSTANTANEOUS_SPEED = 100.0f;
    private static final double DEFAULT_VALUES = 0.0d;
    private static final String GET_QUANTITY_STRING_FORMAT_ARGS = "";
    private static final float ITEM_SPAN = 12.0f;
    private static final int RESISTANCE_TRANSFORM = 10;
    private static final int RUN_POSTURE_TEXT_SIZE = 30;
    private static final int SCIENTIFIC_GUIDE_ON_LEST_SPEED = 8;
    private static final float SKIPPING_HEIGHT_SPAN = 96.0f;
    private static final String TAG = "Track_IDEQ_CombineSportEquipItemDrawer";
    private static final float TAHITI_POSTURE_ICON_SPAN = 50.0f;
    private static final float TEXT_SIZE_REDUCE_FACTOR = 0.7f;
    protected Context mContext;
    private boolean mIsShowHeartRate;
    private boolean mIsShowImperialUnit;
    protected List<SportEquipItemDetail.e> mItemDataList;
    private int mSportType;
    private SupportDataRange mSupportDataRange;

    private boolean isPaceSport(int i) {
        return i == 275 || i == 264;
    }

    public CombineSportEquipItemDrawer(Context context, boolean z) {
        this.mSportType = 0;
        this.mSupportDataRange = null;
        this.mIsShowImperialUnit = UnitUtil.f();
        this.mContext = context;
        this.mIsShowHeartRate = z;
    }

    public CombineSportEquipItemDrawer(Context context, int i, boolean z, SupportDataRange supportDataRange) {
        this.mSupportDataRange = null;
        this.mSportType = i;
        this.mIsShowImperialUnit = UnitUtil.f();
        this.mContext = context;
        this.mIsShowHeartRate = z;
        this.mSupportDataRange = supportDataRange;
    }

    public void setIsShowHeartRate(boolean z) {
        this.mIsShowHeartRate = z;
    }

    private void buildSportDataItemList() {
        List<SportEquipItemDetail.e> list = this.mItemDataList;
        if (list == null) {
            this.mItemDataList = new ArrayList();
        } else {
            list.clear();
        }
    }

    public void setPageItem(int[] iArr, Map<Integer, Object> map) {
        if (iArr == null) {
            return;
        }
        buildSportDataItemList();
        for (int i : iArr) {
            addRunningData(map, i);
            if (i != 22) {
                if (i != 27) {
                    if (i != 37) {
                        if (i != 40006) {
                            if (i != 39) {
                                if (i == 40) {
                                    this.mItemDataList.add(buildGroupCountItem(getValue(map, i)));
                                } else {
                                    switch (i) {
                                        case 40001:
                                            this.mItemDataList.add(buildSkipperNumberItem(getSkippingValue(map, i)));
                                            break;
                                        case 40002:
                                            this.mItemDataList.add(buildStumblingRopeItem(getSkippingValue(map, i)));
                                            break;
                                        case 40003:
                                            this.mItemDataList.add(buildContinuousSkippingJumpItem(getSkippingValue(map, i)));
                                            break;
                                        case 40004:
                                            this.mItemDataList.add(buildSkippingSpeedItem(getSkippingValue(map, i)));
                                            break;
                                        default:
                                            setPageItemSplit(i, map);
                                            break;
                                    }
                                }
                            } else {
                                this.mItemDataList.add(buildActionGroupItem(getValue(map, i)));
                            }
                        } else {
                            this.mItemDataList.add(buildSkippingAvgSpeedItem(getSkippingValue(map, i)));
                        }
                    } else {
                        this.mItemDataList.add(buildWeightItem(getValue(map, i)));
                    }
                } else {
                    this.mItemDataList.add(buildPaddleItem(getValue(map, i)));
                }
            } else {
                setResistanceLevel(map, i);
            }
        }
    }

    private void setPageItemSplit(int i, Map<Integer, Object> map) {
        switch (i) {
            case 31:
                this.mItemDataList.add(buildInstantaneousCadenceItem(getValue(map, i)));
                break;
            case 40013:
                this.mItemDataList.add(buildSkipperIntermittentJumpAccumulatedCount(getSkippingValue(map, i)));
                break;
            case 40014:
                this.mItemDataList.add(buildSkipperIntermittentJumpAccumulatedDuration(getSkippingValue(map, i)));
                break;
            case 40016:
                this.mItemDataList.add(buildSkipperIntermittentJumpRoundNumberItem(getSkippingValue(map, i)));
                break;
            case 40051:
                this.mItemDataList.add(buildTimeItem(initValue(map, i)));
                break;
            case 40057:
            case 40058:
                this.mItemDataList.add(buildCalorieItem(initValue(map, i)));
                break;
            case 40059:
                this.mItemDataList.add(buildSkippingSpeedItem(getSkippingValue(map, i)));
                break;
            case 40063:
                buildRopeShakerItem(getSkippingValue(map, i), R.string.IDS_indoor_skipper_single_shaker);
                break;
            case 40064:
                buildRopeShakerItem(getSkippingValue(map, i), R.string.IDS_indoor_skipper_double_shaker);
                break;
            case 40065:
                buildRopeShakerItem(getSkippingValue(map, i), R.string.IDS_indoor_skipper_triple_shaker);
                break;
            default:
                LogUtil.a(TAG, "other item: ", Integer.valueOf(i));
                break;
        }
    }

    private void setResistanceLevel(Map<Integer, Object> map, int i) {
        int value = getValue(map, i);
        LogUtil.a(TAG, "resistLevel ", Integer.valueOf(value));
        if (this.mSupportDataRange != null) {
            LogUtil.a(TAG, "mSupportDataRange != null");
            LogUtil.a(TAG, "mSupportDataRange min", Integer.valueOf(this.mSupportDataRange.getMinLevel() / 10));
            LogUtil.a(TAG, "mSupportDataRange max", Integer.valueOf(this.mSupportDataRange.getMaxLevel() / 10));
            if (this.mSupportDataRange.getMaxLevel() == 0) {
                return;
            }
            this.mItemDataList.add(buildResistLevelItem(value, this.mSupportDataRange.getMinLevel() / 10, this.mSupportDataRange.getMaxLevel() / 10));
            return;
        }
        this.mItemDataList.add(buildResistLevelItem(value, 0, 15));
    }

    private void addRunningData(Map<Integer, Object> map, int i) {
        if (i == 1) {
            this.mItemDataList.add(buildDistanceItem(initValue(map, i)));
            return;
        }
        if (i == 2) {
            this.mItemDataList.add(buildTimeItem(initValue(map, i)));
            return;
        }
        if (i == 3) {
            this.mItemDataList.add(buildIndoorEquipRunSpeedItem(getSpeedValue(map, i)));
            return;
        }
        if (i == 4) {
            this.mItemDataList.add(buildIndoorEquipRunStepRateItem(initValue(map, i)));
            return;
        }
        if (i == 6) {
            this.mItemDataList.add(buildCalorieItem(initValue(map, i)));
            return;
        }
        if (i == 7) {
            this.mItemDataList.add(buildPowerItem(getValue(map, i)));
            return;
        }
        if (i == 8) {
            this.mItemDataList.add(buildIndoorRunStepItem(getValue(map, i)));
            return;
        }
        if (i == 14) {
            if (isPaceSport(this.mSportType)) {
                this.mItemDataList.add(buildInstanesPaceItem(getPaceValue(map, i)));
            }
        } else {
            if (i != 20002) {
                if (i == 20004 && this.mIsShowHeartRate) {
                    this.mItemDataList.add(buildHeartRateItem(initValue(map, i)));
                    return;
                }
                return;
            }
            buildRunPosetureItem(map);
        }
    }

    private SportEquipItemDetail.e buildInstanesPaceItem(float f) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.ie_pace_title), izn.a(f));
    }

    private float getPaceValue(Map<Integer, Object> map, int i) {
        if (map == null || map.get(Integer.valueOf(i)) == null) {
            return 0.0f;
        }
        float fFloatValue = new BigDecimal(((Integer) map.get(Integer.valueOf(i))).intValue()).divide(new BigDecimal(100.0d), 2, 4).floatValue();
        LogUtil.a(TAG, "pace is ", Float.valueOf(fFloatValue));
        return UnitUtil.f() ? (float) UnitUtil.c(fFloatValue, 3) : fFloatValue;
    }

    private int getSkippingValue(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }

    private float getSpeedValue(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0.0f;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue() / 100.0f;
    }

    private int getValue(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }

    private int initValue(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }

    protected void buildRunPosetureItem(Map<Integer, Object> map) {
        String string;
        Drawable drawableE;
        gzv gzvVar = (gzv) map.get(20002);
        float fIntValue = map.get(3) == null ? 0.0f : ((Integer) map.get(3)).intValue() / 100.0f;
        if (gzvVar == null) {
            setPostureDefault(fIntValue);
            return;
        }
        int iE = gzvVar.e();
        int i = gzvVar.i();
        int iC = gzvVar.c();
        int i2 = iE > i ? iE : i;
        if (i2 > iC) {
            iC = i2;
        }
        if (iC <= 0 || iC == i) {
            string = this.mContext.getString(R.string.ie_landing_way_whole);
            drawableE = nzc.e(this.mContext, R.drawable.horizontal_landing2);
        } else if (iC == iE) {
            string = this.mContext.getString(R.string.ie_landing_way_front);
            drawableE = nzc.e(this.mContext, R.drawable.horizontal_landing3);
        } else {
            string = this.mContext.getString(R.string.IDS_running_posture_avg_foot_strike_pattern_hind);
            drawableE = nzc.e(this.mContext, R.drawable.horizontal_landing1);
        }
        int iJ = gzvVar.j();
        int iB = nzc.b("swing angle", iJ, fIntValue);
        int iB2 = gzvVar.b();
        int iB3 = nzc.b("eversion angle", iB2, fIntValue);
        this.mItemDataList.add(buildSwingAngleItem(iJ, iB, fIntValue));
        this.mItemDataList.add(buildEversionAmplitude(iB2, iB3, fIntValue));
        this.mItemDataList.add(buildIndoorLandingMethod(string));
        this.mItemDataList.add(buildIndoorLandingIcon(drawableE));
    }

    private void setPostureDefault(float f) {
        String string = this.mContext.getString(R.string.ie_state_of_eqp_UNKNOWN_string);
        this.mItemDataList.add(buildSwingAngleItem(0.0d, 0, f));
        this.mItemDataList.add(buildEversionAmplitude(0.0d, 0, f));
        this.mItemDataList.add(buildIndoorLandingMethod(string));
        this.mItemDataList.add(buildIndoorLandingIcon(null));
    }

    private SportEquipItemDetail.e buildPowerItem(int i) {
        String string = this.mContext.getString(R.string.IDS_indoor_equip_power);
        String string2 = this.mContext.getResources().getString(R.string.ie_motiontrack_detail_pace_default);
        if (i > 0) {
            string2 = UnitUtil.e(i, 1, 0);
        }
        return new SportEquipItemDetail.e(null, this.mContext.getString(R.string.IDS_motiontrack_history_all_unit, string, this.mContext.getString(R.string.IDS_indoor_equip_power_unit_watt)), string2);
    }

    private SportEquipItemDetail.e buildPaddleItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getString(R.string.IDS_indoor_equip_paddle_times), UnitUtil.e(i, 1, 0));
    }

    private SportEquipItemDetail.e buildWeightItem(int i) {
        String quantityString;
        String string = this.mContext.getString(R.string.IDS_rowing_machine_weight);
        String strE = UnitUtil.e(i, 1, 0);
        if (UnitUtil.f()) {
            quantityString = this.mContext.getResources().getQuantityString(R.plurals.IDS_lb_string, i, "");
        } else {
            quantityString = this.mContext.getResources().getQuantityString(R.plurals.IDS_rowing_machine_kg, i, "");
        }
        return new SportEquipItemDetail.e(null, this.mContext.getString(R.string.IDS_motiontrack_history_all_unit, string, quantityString), strE);
    }

    private SportEquipItemDetail.e buildGroupCountItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getString(R.string.IDS_rowing_machine_group_count), this.mContext.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, i, "")), UnitUtil.e(i, 1, 0));
    }

    private SportEquipItemDetail.e buildActionGroupItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getString(R.string.IDS_rowing_machine_action_group), this.mContext.getResources().getQuantityString(R.plurals.sug_share_group, i, "")), UnitUtil.e(i, 1, 0));
    }

    private SportEquipItemDetail.e buildContinuousSkippingJumpItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getResources().getString(R.string.IDS_indoor_skipper_jump), this.mContext.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit, 0)).trim(), dealWithValue(i, "continuousSkippingJump is error"));
    }

    private SportEquipItemDetail.e buildStumblingRopeItem(int i) {
        String string = this.mContext.getResources().getString(R.string.IDS_indoor_skipper_stumbling_rope);
        return new SportEquipItemDetail.e(null, this.mContext.getString(R.string.IDS_motiontrack_history_all_unit, string, this.mContext.getResources().getString(R.string.IDS_awake_times)), dealWithValue(i, "stumblingRope is error"));
    }

    private String dealWithValue(int i, String str) {
        String string = this.mContext.getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        if (i >= 0) {
            return UnitUtil.e(i, 1, 0);
        }
        LogUtil.e(TAG, str);
        return string;
    }

    private SportEquipItemDetail.e buildSkippingSpeedItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), this.mContext.getResources().getString(R.string.IDS_indoor_skipper_number_minute)).trim(), dealWithValue(i, "skippingSpeed is over speed"));
    }

    private SportEquipItemDetail.e buildSkippingAvgSpeedItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_detail_averagespeed), this.mContext.getResources().getString(R.string.IDS_indoor_skipper_number_minute)).trim(), dealWithValue(i, "skippingAvgSpeed is over speed"));
    }

    private SportEquipItemDetail.e buildSkipperNumberItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_indoor_skipper_jump_num), dealWithValue(i, "skipperNumber is over speed"));
    }

    private SportEquipItemDetail.e buildSkipperIntermittentJumpRoundNumberItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_indoor_skipper_jump_round_num), dealWithValue(i, "roundNum is over speed"));
    }

    private SportEquipItemDetail.e buildSkipperIntermittentJumpAccumulatedCount(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.ids_indoor_skipper_jump_accumulated_count), dealWithValue(i, "accumulatedCount is over speed"));
    }

    private SportEquipItemDetail.e buildSkipperIntermittentJumpAccumulatedDuration(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.ids_indoor_skipper_jump_accumulated_duration), UnitUtil.e(i));
    }

    private void buildRopeShakerItem(int i, int i2) {
        if (i == -1) {
            LogUtil.j(TAG, "buildRopeShakerItem() count is invalid value");
            return;
        }
        this.mItemDataList.add(new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getResources().getString(i2), this.mContext.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit, 0)).trim(), dealWithValue(i, "buildRopeShakerItem is error")));
    }

    private SportEquipItemDetail.e buildResistLevelItem(int i, int i2, int i3) {
        String str = String.format(this.mContext.getString(R.string.IDS_indoor_equip_resistance_item), Integer.valueOf(i2), Integer.valueOf(i3));
        String string = this.mContext.getResources().getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        if (i <= i3 && i >= i2) {
            string = UnitUtil.e(i, 1, 0);
        }
        return new SportEquipItemDetail.e(null, str, string);
    }

    private SportEquipItemDetail.e buildIndoorLandingIcon(Drawable drawable) {
        return new SportEquipItemDetail.e(drawable, null, null);
    }

    private SportEquipItemDetail.e buildIndoorLandingMethod(String str) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.ie_landing_way), str);
    }

    private SportEquipItemDetail.e buildEversionAmplitude(double d, int i, float f) {
        nyn itemConfig;
        if (f < 8.0f) {
            itemConfig = remindAngleNormal();
        } else {
            itemConfig = getItemConfig(i);
        }
        int i2 = (int) d;
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.ie_eversionExcursionType), this.mContext.getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, i2, Integer.valueOf(i2)), itemConfig);
    }

    private SportEquipItemDetail.e buildInstantaneousCadenceItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getResources().getString(R.string.IDS_indoor_equip_cadence), this.mContext.getResources().getString(R.string.IDS_indoor_equip_paddle_unit_times_minute)).trim(), dealWithValue(i, "buildInstantaneousCadenceItem is error"));
    }

    private nyn remindAngleNormal() {
        nyn nynVar = new nyn();
        nynVar.e(false);
        nynVar.d(-1);
        nynVar.a(-1);
        nynVar.a((Drawable) null);
        return nynVar;
    }

    private nyn remindAngleValueTooSmall() {
        nyn nynVar = new nyn();
        nynVar.e(true);
        nynVar.d(-14774785);
        nynVar.a(-14774785);
        nynVar.a(this.mContext.getResources().getDrawable(R.drawable.arrow_down));
        return nynVar;
    }

    private nyn remindAngleValueTooLarge() {
        nyn nynVar = new nyn();
        nynVar.e(true);
        nynVar.d(-53241);
        nynVar.a(-53241);
        nynVar.a(this.mContext.getResources().getDrawable(R.drawable.arrow_up));
        return nynVar;
    }

    private SportEquipItemDetail.e buildSwingAngleItem(double d, int i, float f) {
        nyn itemConfig;
        if (f < 8.0f) {
            itemConfig = remindAngleNormal();
        } else {
            itemConfig = getItemConfig(i);
        }
        int i2 = (int) d;
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.ie_swingAngleType), this.mContext.getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, i2, Integer.valueOf(i2)), itemConfig);
    }

    private nyn getItemConfig(int i) {
        if (i == 1) {
            return remindAngleValueTooSmall();
        }
        if (i == 2) {
            return remindAngleValueTooLarge();
        }
        return remindAngleNormal();
    }

    private SportEquipItemDetail.e buildIndoorRunStepItem(int i) {
        return new SportEquipItemDetail.e(this.mSportType == 264 ? this.mContext.getResources().getDrawable(R.drawable.ic_phone) : null, this.mContext.getResources().getString(R.string.ie_main_watch_steps_rate_string), UnitUtil.e(i, 1, 0));
    }

    private SportEquipItemDetail.e buildIndoorEquipRunStepRateItem(int i) {
        Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.ic_phone);
        String string = this.mContext.getResources().getString(R.string.ie_motiontrack_show_map_sport_steprate);
        String string2 = this.mContext.getResources().getString(R.string.ie_motiontrack_detail_pace_default);
        if (i > 0) {
            string2 = UnitUtil.e(i, 1, 0);
        }
        return new SportEquipItemDetail.e(drawable, this.mContext.getString(R.string.IDS_motiontrack_history_all_unit, string, this.mContext.getResources().getString(R.string.IDS_motiontrack_show_detail_stempsmin)), string2);
    }

    private SportEquipItemDetail.e buildIndoorEquipRunSpeedItem(float f) {
        String string = this.mIsShowImperialUnit ? this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour) : this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour);
        String string2 = this.mContext.getResources().getString(R.string.ie_motiontrack_detail_pace_default);
        if (f > 0.0f) {
            if (this.mIsShowImperialUnit) {
                string2 = UnitUtil.e(((double) f) * 0.6213712d, 1, 1);
            } else {
                string2 = UnitUtil.e(f, 1, 1);
            }
        }
        return new SportEquipItemDetail.e(null, string, string2);
    }

    private SportEquipItemDetail.e buildHeartRateItem(int i) {
        String string;
        String string2;
        Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.ic_wear);
        if (i <= 0 || i > 220) {
            string = this.mContext.getResources().getString(R.string.ie_motiontrack_detail_heartrate_default);
        } else {
            string = UnitUtil.e(i, 1, 0);
        }
        if (this.mSportType == 283) {
            string2 = this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, this.mContext.getResources().getString(R.string.ie_main_watch_heart_rate_string), this.mContext.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string)).trim();
        } else {
            string2 = this.mContext.getResources().getString(R.string.ie_main_watch_heart_rate_string);
        }
        return new SportEquipItemDetail.e(drawable, string2, string);
    }

    private SportEquipItemDetail.e buildCalorieItem(int i) {
        return new SportEquipItemDetail.e(null, qre.f(R.string.IDS_track_total_calories_kcal), UnitUtil.e(i, 1, 0));
    }

    private SportEquipItemDetail.e buildTimeItem(int i) {
        return new SportEquipItemDetail.e(null, this.mContext.getResources().getString(R.string.IDS_hw_motiontrack_segment_use_time), UnitUtil.e(i));
    }

    private SportEquipItemDetail.e buildDistanceItem(int i) {
        String string;
        double dB;
        boolean zF = UnitUtil.f();
        if (zF) {
            string = this.mContext.getResources().getString(R.string.ie_motiontrack_show_sport_unit_mi);
        } else {
            string = this.mContext.getResources().getString(R.string.ie_motiontrack_show_sport_unit_km);
        }
        if (zF) {
            dB = ltc.d(i);
        } else {
            dB = ltc.b(i);
        }
        return new SportEquipItemDetail.e(null, string, UnitUtil.e(dB, 1, 2));
    }

    protected void fillTitleContainer(SportEquipItemDrawer sportEquipItemDrawer) {
        float dimension;
        int itemHeight;
        float itemWidth;
        List<SportEquipItemDetail.e> list = this.mItemDataList;
        if (list == null || list.isEmpty()) {
            LogUtil.e(TAG, "fillTitleContainer mItemDataList is null");
            return;
        }
        if (sportEquipItemDrawer == null) {
            LogUtil.e(TAG, "fillTitleContainer container is null");
            return;
        }
        sportEquipItemDrawer.removeAllViews();
        if (!(this.mContext.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            LogUtil.e(TAG, "object is invalid type");
            return;
        }
        boolean zAf = qrs.af(this.mContext);
        if (zAf) {
            dimension = qrs.d(this.mContext, 50.0f);
        } else {
            dimension = this.mContext.getResources().getDimension(R.dimen.defaultPaddingStart);
        }
        float f = dimension;
        if (this.mSportType == 283) {
            itemHeight = qrs.d(this.mContext, SKIPPING_HEIGHT_SPAN);
            itemWidth = sportEquipItemDrawer.getRopeSkipItemWidth();
        } else {
            itemHeight = ((int) sportEquipItemDrawer.getItemHeight()) + qrs.d(this.mContext, ITEM_SPAN);
            itemWidth = sportEquipItemDrawer.getItemWidth();
        }
        int i = itemHeight;
        int i2 = (int) itemWidth;
        int size = this.mItemDataList.size();
        for (int i3 = 0; i3 < size; i3++) {
            SportEquipItemDetail sportEquipItemDetailAcquireSportEquipItemDetail = acquireSportEquipItemDetail(zAf, (int) f, i, i2, i3);
            if (sportEquipItemDrawer.getChildAt(i3) != null) {
                sportEquipItemDrawer.removeViewAt(i3);
            }
            sportEquipItemDrawer.addView(sportEquipItemDetailAcquireSportEquipItemDetail, i3);
        }
    }

    private SportEquipItemDetail acquireSportEquipItemDetail(boolean z, int i, int i2, int i3, int i4) {
        SportEquipItemDetail.e eVar = this.mItemDataList.get(i4);
        SportEquipItemDetail sportEquipItemDetail = new SportEquipItemDetail(this.mContext, this.mSportType, i3, eVar.a());
        changeItemShowRule(sportEquipItemDetail, z);
        sportEquipItemDetail.setGroupSize(i3, i2);
        sportEquipItemDetail.setItemView(eVar);
        if (eVar.c() != null && eVar.c().equals(this.mContext.getString(R.string.ie_landing_way))) {
            sportEquipItemDetail.e(qrs.d(this.mContext, 30.0f));
        }
        if (eVar.c() == null && eVar.a() == null) {
            sportEquipItemDetail.e(i, this.mContext.getResources().getDimensionPixelSize(R.dimen.common_ui_horizon_text_size_60));
        }
        return sportEquipItemDetail;
    }

    private void changeItemShowRule(SportEquipItemDetail sportEquipItemDetail, boolean z) {
        if (this.mSportType != 283 && z) {
            sportEquipItemDetail.setGravity(48);
            Context context = this.mContext;
            sportEquipItemDetail.c(context, context.getResources().getDimension(R.dimen.defaultPaddingStart));
        }
        if (z) {
            return;
        }
        if (this.mSportType == 283) {
            sportEquipItemDetail.c(this.mContext, 0.0f);
            return;
        }
        sportEquipItemDetail.setGravity(48);
        Context context2 = this.mContext;
        sportEquipItemDetail.c(context2, context2.getResources().getDimension(R.dimen.defaultPaddingStart));
    }
}
