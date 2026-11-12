package com.xiaomi.hm.health.healthdata.utils;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.Router;
import com.huami.bloodpressure_ui.BloodPressureActivityKt;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.health.ui.HealthDetectSettingActivity;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.AddHealthDataActivity;
import com.xiaomi.hm.health.healthdata.ui.HealthDataHistoryActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/HealthDataNavigator;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "dataType", "", "navigateToAddHealthData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "navigateToHealthDataHistory", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "healthDataType", "navigateToHealthDataDetail", "navigateToDataDetail", "navigateToDataDetailNew", "navigateToDetectSetting", "goToBloodPressure", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataNavigator {

    @NotNull
    public static final HealthDataNavigator INSTANCE = new HealthDataNavigator();

    private HealthDataNavigator() {
    }

    public final void goToBloodPressure(@NotNull Context context) {
        BloodPressureActivityKt.navigateToBloodPressure$default(context, 0L, 2, null);
    }

    public final void navigateToAddHealthData(@NotNull Fragment fragment, @NotNull DataType dataType) {
        Intent intent = new Intent(fragment.getContext(), (Class<?>) AddHealthDataActivity.class);
        intent.putExtra("dataType", dataType.getType());
        fragment.startActivity(intent);
    }

    public final void navigateToDataDetail(@NotNull Context context, @NotNull DataType dataType) {
        navigateToDataDetailNew(context, dataType);
    }

    public final void navigateToDataDetailNew(@NotNull Context context, @NotNull DataType dataType) {
        Router.build("detail/DataDetailBaseNewActivity").with("data_type", dataType.getType()).go(context);
    }

    public final void navigateToDetectSetting(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) HealthDetectSettingActivity.class));
    }

    public final void navigateToHealthDataDetail(@NotNull Context context, @NotNull HealthDataType healthDataType) {
        navigateToDataDetailNew(context, healthDataType);
    }

    public final void navigateToHealthDataHistory(@NotNull Context context, @NotNull DataType dataType) {
        Intent intent = new Intent(context, (Class<?>) HealthDataHistoryActivity.class);
        intent.putExtra("dataType", dataType.getType());
        context.startActivity(intent);
    }
}
