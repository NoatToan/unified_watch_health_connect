package com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils;

import android.content.Context;
import android.util.SparseArray;
import com.huami.account.HMLoginManager;
import com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity;
import com.huami.chart.data.YAxisData;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.model.WeatherSetting;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/utils/TempUtils;", "", "", "tempInUnitC", "a", "tempInUnitF", "b", "", "getTempUnit", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getTempDisplayString", "getTempDisplayFloat", "temp", "getTempInUnitC", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/YAxisData;", "getTempYAxisData", "", "supportWristTempDevice", "", "launchToDetail", "Ljava/lang/String;", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempUtils {

    @NotNull
    public static final TempUtils INSTANCE = new TempUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TempUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "supportWristTempDevice:" + this.a;
        }
    }

    private TempUtils() {
    }

    private final float a(float tempInUnitC) {
        return ((tempInUnitC * 9.0f) / 5.0f) + 32.0f;
    }

    private final float b(float tempInUnitF) {
        return ((tempInUnitF - 32.0f) * 5.0f) / 9.0f;
    }

    public final float getTempDisplayFloat(float tempInUnitC) {
        int tempUnit = getTempUnit();
        if (tempUnit == 0) {
            return tempInUnitC;
        }
        if (tempUnit != 1) {
            return -1.0f;
        }
        return a(tempInUnitC);
    }

    @NotNull
    public final String getTempDisplayString(@NotNull Context context, float tempInUnitC) {
        int tempUnit = getTempUnit();
        if (tempUnit != 0) {
            return tempUnit != 1 ? "" : context.getString(R.string.temperature_value_fahrenheit, DataExKt.formatWithDecimal(Float.valueOf(a(tempInUnitC)), 1));
        }
        return context.getString(R.string.temperature_value_centigrade, DataExKt.formatWithDecimal(Float.valueOf(tempInUnitC), 1));
    }

    public final float getTempInUnitC(float temp) {
        return getTempUnit() == 1 ? b(temp) : temp;
    }

    public final int getTempUnit() {
        return WeatherSetting.fromJsonString(HMPersonInfo.getInstance().getMiliConfig().getWeatherSetting()).getTemperatureUnit();
    }

    @NotNull
    public final SparseArray<YAxisData> getTempYAxisData() {
        int i = 0;
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(35.0f), Float.valueOf(36.75f), Float.valueOf(38.5f), Float.valueOf(40.25f), Float.valueOf(42.0f));
        SparseArray<YAxisData> sparseArray = new SparseArray<>();
        int size = arrayListArrayListOf.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                float fFloatValue = ((Number) arrayListArrayListOf.get(i)).floatValue();
                sparseArray.put(i, new YAxisData(fFloatValue, DataExKt.formatWithDecimal(Float.valueOf(getTempDisplayFloat(fFloatValue)), 1)));
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return sparseArray;
    }

    public final void launchToDetail(@NotNull Context context) {
        if (!supportWristTempDevice()) {
            HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(context, HealthDataType.TEMPERATURE);
        } else {
            TemperatureDetailActivity.INSTANCE.launch(context, HMLoginManager.getHuamiId());
        }
    }

    public final boolean supportWristTempDevice() {
        HMLog.info(TAG, new a(false));
        return false;
    }
}
