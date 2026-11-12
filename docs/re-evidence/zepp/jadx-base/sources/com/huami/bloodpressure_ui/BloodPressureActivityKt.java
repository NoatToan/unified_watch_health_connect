package com.huami.bloodpressure_ui;

import android.content.Context;
import com.chenenyu.router.Router;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u001c\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "timeStamp", "", "navigateToBloodPressure", "", "a", "Ljava/lang/String;", "getKEY_BLOOD_PRESSURE_TIMESTAMP", "()Ljava/lang/String;", "KEY_BLOOD_PRESSURE_TIMESTAMP", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureActivityKt {

    @NotNull
    private static final String a = "KEY_BLOOD_PRESSURE_TIMESTAMP";

    @NotNull
    public static final String getKEY_BLOOD_PRESSURE_TIMESTAMP() {
        return a;
    }

    public static final void navigateToBloodPressure(@NotNull Context context, long j) {
        Router.build("bloodpressure/BloodPressureActivity").with(a, Long.valueOf(j)).go(context);
    }

    public static /* synthetic */ void navigateToBloodPressure$default(Context context, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        navigateToBloodPressure(context, j);
    }
}
