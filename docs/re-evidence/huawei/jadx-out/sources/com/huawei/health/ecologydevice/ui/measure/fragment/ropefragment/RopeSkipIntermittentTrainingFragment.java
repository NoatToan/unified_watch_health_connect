package com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment;

import android.text.TextUtils;
import android.view.View;
import com.huawei.ecologydevice.R;
import defpackage.emh;
import defpackage.etl;
import defpackage.qpx;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class RopeSkipIntermittentTrainingFragment extends RopeSkipSettingBaseFragment {
    private static final int DEEP_ENHANCED_FAT_BURNING_MODE_REST_DATE = 60;
    private static final int DEEP_FAT_BURNING_JUMP_DATE = 180;
    private static final int DEEP_FAT_BURNING_JUMP_MINUTE = 20;
    private static final int EASY_FAT_BURNING_JUMP_DATE = 90;
    private static final int EASY_FAT_BURNING_JUMP_MINUTE = 10;
    private static final int ENHANCED_FAT_BURNING_JUMP_DATE = 300;
    private static final int ENHANCED_FAT_BURNING_JUMP_MINUTE = 30;
    private static final int EXERCISE_EACH_GROUP_TIMES_DEFAULT = 0;
    private static final int GROUP_DEFAULT = 5;
    private static final int SPEEDING_EASY_FAT_BURNING_MODE_REST_DATE = 30;
    private static final int SPEEDING_EXERCISE_DATE = 30;
    private static final int SPEEDING_EXERCISE_MINUTE = 5;

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initData() {
        setTitle(getString(R.string.IDS_indoor_skipper_interval_training));
        super.initData();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    /* JADX INFO: renamed from: setItemClickListener */
    public void m1074x1c99b493(View view, int i, etl etlVar) {
        byte b2;
        if (etlVar == null || etlVar.a() == 1) {
            return;
        }
        LogUtil.a("RopeSkipSettingBaseFragment", "setItemClickListener settingType is ", etlVar.d());
        String strD = etlVar.d();
        strD.hashCode();
        switch (strD) {
            case "speeding_mode":
                b2 = 0;
                break;
            case "enhanced_fat_burning_jump_mode":
                b2 = 1;
                break;
            case "easy_fat_burning_jump_mode":
                b2 = 2;
                break;
            case "intermitmode_custom_type":
                b2 = 3;
                break;
            case "deep_fat_burning_jump_mode":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            startIndoorEquipDisplay(30, 30);
            return;
        }
        if (b2 == 1) {
            startIndoorEquipDisplay(300, 60);
            return;
        }
        if (b2 == 2) {
            startIndoorEquipDisplay(90, 30);
            return;
        }
        if (b2 == 3) {
            addFragment(new RopeSkipIntermittentSettingFragment());
        } else if (b2 == 4) {
            startIndoorEquipDisplay(180, 60);
        } else {
            LogUtil.a("RopeSkipSettingBaseFragment", "setItemClickListener settingType is null");
        }
    }

    @Override // com.huawei.health.ecologydevice.ui.measure.fragment.ropefragment.RopeSkipSettingBaseFragment
    public void initSettingsData() {
        setTimeModeData();
    }

    private void setTimeModeData() {
        this.mSettingsItemBeanArrayList.clear();
        String str = getQuantityStr(R.plurals.IDS_rope_groups, 5) + "  ";
        this.mSettingsItemBeanArrayList.add(getItemBean(7, R.string.IDS_rope_speeding, str + getGroupString(5), R.drawable.list_item_background_single_normal, "speeding_mode"));
        this.mSettingsItemBeanArrayList.add(getItemBean(7, R.string.IDS_rope_easy_fat_burning_jump, str + getGroupString(10), R.drawable.list_item_background_single_normal, "easy_fat_burning_jump_mode"));
        this.mSettingsItemBeanArrayList.add(getItemBean(7, R.string.IDS_rope_deep_fat_burning_jump, str + getGroupString(20), R.drawable.list_item_background_single_normal, "deep_fat_burning_jump_mode"));
        this.mSettingsItemBeanArrayList.add(getItemBean(7, R.string.IDS_rope_enhanced_fat_burning_jump, str + getGroupString(30), R.drawable.list_item_background_single_normal, "enhanced_fat_burning_jump_mode"));
        this.mSettingsItemBeanArrayList.add(getItemBean(7, R.string.IDS_rope_customization, "", -1, "intermitmode_custom_type"));
    }

    private String getGroupString(int i) {
        String quantityStr = getQuantityStr(R.plurals.IDS_hwh_motiontrack_start_track_sport_min_number, i);
        return TextUtils.isEmpty(quantityStr) ? "" : quantityStr.replace(" ", "");
    }

    private void startIndoorEquipDisplay(int i, int i2) {
        if (!emh.b().g()) {
            LogUtil.d("RopeSkipSettingBaseFragment", "Rope Device disconnect");
            qpx.e(this.mainActivity, R.string.IDS_bolt_bluetooth_disconnected);
        } else {
            jumpToDisplayActivity(1, i, 0, i2, 5);
        }
    }
}
