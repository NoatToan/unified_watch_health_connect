package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.twu;
import defpackage.wia;
import health.compact.a.LanguageUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenRangeProvider extends MinorProvider<twu> {
    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, twu twuVar) {
        String strD;
        LogUtil.a("BloodOxygenRangeProvider", "begin parseParams");
        if (twuVar.f()) {
            map.put("LEFT_TOP_VALUE", context.getString(R.string.IDS_hw_health_blood_oxygen_range));
            if (TextUtils.isEmpty(twuVar.d())) {
                map.put("LEFT_TEXT", e("--"));
            } else {
                map.put("LEFT_TEXT", e(twuVar.d()));
            }
            map.put("RIGHT_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_range_elevation));
            if (TextUtils.isEmpty(twuVar.e())) {
                map.put("RIGHT_BOTTOM_TEXT", e("--"));
                return;
            } else {
                map.put("RIGHT_BOTTOM_TEXT", e(twuVar.e()));
                return;
            }
        }
        if (LanguageUtil.bc(BaseApplication.getContext())) {
            strD = d(", ", twuVar);
        } else {
            strD = d(" ", twuVar);
        }
        map.put("LEFT_TOP_VALUE", strD);
        if (TextUtils.isEmpty(twuVar.b())) {
            map.put("LEFT_TEXT", e("--"));
        } else {
            map.put("LEFT_TEXT", e(twuVar.b()));
        }
        map.put("RIGHT_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_range));
        if (TextUtils.isEmpty(twuVar.d())) {
            map.put("RIGHT_BOTTOM_TEXT", e("--"));
        } else {
            map.put("RIGHT_BOTTOM_TEXT", e(twuVar.d()));
        }
    }

    private SpannableString e(String str) {
        return wia.e(BaseApplication.getContext(), "[\\d\\-]", str, R.style.privacy_only_risk_num, R.style.privacy_only_risk_unit);
    }

    private String d(String str, twu twuVar) {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_blood_oxygen_latest_value) + str + twuVar.a();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "BloodOxygenRangeProvider";
    }
}
