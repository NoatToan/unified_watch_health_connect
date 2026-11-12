package com.huami.bloodpressure_ui.intro;

import android.content.Context;
import com.chenenyu.router.Router;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "gotoBloodPressureInfo", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureInfoActivityKt {
    public static final void gotoBloodPressureInfo(@NotNull Context context) {
        Router.build(BloodPressureInfoActivity.ROUTE_BLOODPRESSURE_INFO).go(context);
    }
}
