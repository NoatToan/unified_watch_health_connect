package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.tencent.open.SocialConstants;
import defpackage.qkn;
import defpackage.qko;
import defpackage.qkq;
import defpackage.qkr;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public final class AchieveDialogFactory {

    static final class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AchieveDialogFactory f23378b = new AchieveDialogFactory();
    }

    public static AchieveDialogFactory e() {
        return e.f23378b;
    }

    private AchieveDialogFactory() {
    }

    public BaseAchieveDialog a(Context context, DialogType dialogType, Bundle bundle, DialogResourcesListener dialogResourcesListener) {
        BaseAchieveDialog qkrVar;
        boolean z;
        BaseAchieveDialog baseAchieveDialogD;
        LogUtil.a("AchieveDialogFactory", "createDialog dialogType", dialogType.toString());
        String string = bundle.getString("achieveText", d(context, dialogType.getDefAchieveTextResId(), new String[0]));
        int i = bundle.getInt("checkBtnText", dialogType.getDefCheckBtnTextResId());
        String strA = a(bundle.getInt("heatCal", 0));
        String strA2 = a(bundle.getInt("intensityTime", 0));
        String strA3 = a(bundle.getInt("activeHour", 0));
        ThreeCircleShareCallback threeCircleShareCallback = bundle.getSerializable("three_circle_callback") instanceof ThreeCircleShareCallback ? (ThreeCircleShareCallback) bundle.getSerializable("three_circle_callback") : null;
        switch (dialogType) {
            case THREE_LEAF_ACTIVE:
            case THREE_LEAF_PERFECT:
                qkrVar = new qkr(context, dialogType, dialogResourcesListener);
                z = true;
                break;
            case THREE_CIRCLE:
                qkrVar = new qko(context, dialogType, dialogResourcesListener, threeCircleShareCallback).setHeatText(strA).setIntensityTimeText(strA2).setActiveHourText(strA3);
                z = true;
                break;
            case SINGLE_CIRCLE_WALK:
                String strD = d(context, bundle.getInt("title", dialogType.getDefTitleResId()), new String[0]);
                int i2 = bundle.getInt("target_value", 0);
                baseAchieveDialogD = new qkq(context, dialogType, dialogResourcesListener, threeCircleShareCallback).d(strD).d(c(e(context, bundle.getInt("target_desc", dialogType.getDefTargetDescResId()), i2), a(i2)));
                qkrVar = baseAchieveDialogD;
                z = false;
                break;
            case SINGLE_CIRCLE_CALORIE:
            case SINGLE_CIRCLE_INTENSITY:
            case SINGLE_CIRCLE_ACTIVE:
                String strD2 = d(context, bundle.getInt("title", dialogType.getDefTitleResId()), new String[0]);
                int i3 = bundle.getInt("target_value", 0);
                baseAchieveDialogD = new qkn(context, dialogType, dialogResourcesListener, threeCircleShareCallback).e(strD2).a(a(bundle.getInt("achieve_user_value", 0))).c(d(context, bundle.getInt(SocialConstants.PARAM_APP_DESC, dialogType.getDefDescResId()), new String[0])).b(e(context, bundle.getInt("target_desc", dialogType.getDefTargetDescResId()), i3)).c(dialogType.getColorResId()).setHeatText(strA).setIntensityTimeText(strA2).setActiveHourText(strA3);
                qkrVar = baseAchieveDialogD;
                z = false;
                break;
            default:
                string = string;
                i = i;
                z = false;
                qkrVar = null;
                break;
        }
        if (qkrVar != null) {
            qkrVar.setAchieveText(string, z).setCheckButtonText(d(context, i, new String[0]));
        }
        return qkrVar;
    }

    private String a(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private String d(Context context, int i, String... strArr) {
        if (i == 0) {
            return "";
        }
        return (strArr == null || strArr.length <= 0) ? context.getResources().getString(i) : context.getResources().getString(i, strArr);
    }

    private String e(Context context, int i, int i2) {
        if (i == 0) {
            return "";
        }
        return context.getResources().getQuantityString(i, i2, a(i2));
    }

    private SpannableString c(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = spannableString.toString().indexOf(str2);
        if (iIndexOf != -1) {
            spannableString.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_master_display_2)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableString;
    }

    public enum DialogType {
        THREE_LEAF_ACTIVE("three_leaf_achieve_anim", R.string.IDS_achive_vitality_three_leaf_text, R.string.IDS_achive_ok_check_text),
        THREE_LEAF_PERFECT("three_leaf_green_achieve_anim", R.string.IDS_achive_perfect_three_leaf_text, R.string.IDS_achive_perfect_three_leaf_check_text),
        THREE_CIRCLE("three_circle_achieve_anim", R.string.IDS_achive_three_circle_text_new, R.string.IDS_achive_three_circle_share),
        SINGLE_CIRCLE_WALK("single_circle_walk_achieve_anim", R.color.walk_count_color, R.string.IDS_three_leaf_step_comp_title, R.string.IDS_achive_single_circle_desc, R.plurals.IDS_single_circle_walk_target_desc, R.string.IDS_three_leaf_step_complete_content, R.string.IDS_achive_three_circle_share),
        SINGLE_CIRCLE_CALORIE("single_circle_heat_achieve_anim", R.color.heat_cal_color, R.string.IDS_active_caloric, R.string.IDS_achive_single_circle_desc, R.plurals.IDS_kcalories_unit, R.string.IDS_achieve_single_circle_heat, R.string.IDS_achive_three_circle_share),
        SINGLE_CIRCLE_INTENSITY("single_circle_intensity_achieve_anim", R.color.intensity_time_color, R.string.IDS_active_workout, R.string.IDS_achive_single_circle_desc, R.plurals.IDS_single_circle_intensity_target_desc, R.string.IDS_achieve_single_circle_intensity, R.string.IDS_achive_three_circle_share),
        SINGLE_CIRCLE_ACTIVE("single_circle_active_achieve_anim", R.color.active_time_color, R.string.IDS_three_circle_card_activity_hours, R.string.IDS_achive_single_circle_desc, R.plurals.IDS_single_circle_active_target_desc, R.string.IDS_achive_single_circle_active_hours_congratulation, R.string.IDS_achive_three_circle_share);

        private final String mAnimResName;
        private int mColorResId;
        private final int mDefAchieveTextResId;
        private final int mDefCheckBtnTextResId;
        private int mDefDescResId;
        private int mDefTargetDescResId;
        private int mDefTitleResId;

        DialogType(String str, int i, int i2) {
            this.mAnimResName = str;
            this.mDefAchieveTextResId = i;
            this.mDefCheckBtnTextResId = i2;
        }

        DialogType(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this(str, i5, i6);
            this.mColorResId = i;
            this.mDefTitleResId = i2;
            this.mDefDescResId = i3;
            this.mDefTargetDescResId = i4;
        }

        public int getColorResId() {
            return this.mColorResId;
        }

        public String getAnimResName() {
            return this.mAnimResName;
        }

        public int getDefTitleResId() {
            return this.mDefTitleResId;
        }

        public int getDefDescResId() {
            return this.mDefDescResId;
        }

        public int getDefTargetDescResId() {
            return this.mDefTargetDescResId;
        }

        public int getDefAchieveTextResId() {
            return this.mDefAchieveTextResId;
        }

        public int getDefCheckBtnTextResId() {
            return this.mDefCheckBtnTextResId;
        }
    }
}
