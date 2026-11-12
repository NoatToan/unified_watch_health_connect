package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes7.dex */
public class enj extends HealthData {
    private static int[] d = {a.C, 417, 536, 9088};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f33233a = {150, 358, 536, 9088};
    private static int[] e = {180, 417, 536, 9088};

    public static int e(Context context, int i) {
        int[] iArr;
        if (context == null || i < 0 || i > 9088) {
            return 1100;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        int genderOrDefaultValue = userInfo != null ? userInfo.getGenderOrDefaultValue() : -1;
        if (genderOrDefaultValue == 0) {
            iArr = d;
        } else if (genderOrDefaultValue == 1) {
            iArr = f33233a;
        } else {
            iArr = e;
        }
        return e(i, iArr);
    }

    private static int e(int i, int[] iArr) {
        if (i < iArr[1]) {
            return 1101;
        }
        if (i < iArr[2]) {
            return 1102;
        }
        if (i < iArr[3]) {
            return 1103;
        }
        if (i < iArr[4]) {
            return ExceptionCode.CHECK_FILE_HASH_FAILED;
        }
        return 1100;
    }

    public static void d(HealthTextView healthTextView, int i) {
        if (healthTextView == null) {
            LogUtil.j("UricAcid", "setUricAcidLevelTextAndColor, valueLevelView is null!");
        }
        Resources resources = BaseApplication.getContext().getResources();
        switch (i) {
            case 1101:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_low));
                healthTextView.setTextColor(resources.getColor(R.color.color_uric_acid_low));
                break;
            case 1102:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal));
                healthTextView.setTextColor(resources.getColor(R.color.color_uric_acid_normal));
                break;
            case 1103:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_high));
                healthTextView.setTextColor(resources.getColor(R.color.color_uric_acid_high));
                break;
            case ExceptionCode.CHECK_FILE_HASH_FAILED /* 1104 */:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high));
                healthTextView.setTextColor(resources.getColor(R.color.color_uric_acid_high));
                break;
        }
    }
}
