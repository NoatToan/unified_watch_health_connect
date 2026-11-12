package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import defpackage.kyo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkyo;", "widgetV2", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetBean;", "convert2WidgetBean", "(Lkyo;)Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetBean;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class WidgetBeanKt {
    @NotNull
    public static final WidgetBean convert2WidgetBean(@NotNull kyo widgetV2) {
        Intrinsics.checkNotNullParameter(widgetV2, "widgetV2");
        int i = widgetV2.e;
        int i2 = widgetV2.c;
        int i3 = widgetV2.d;
        String appId = widgetV2.h;
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        return new WidgetBean(i, i2, i3, appId, widgetV2.g);
    }
}
