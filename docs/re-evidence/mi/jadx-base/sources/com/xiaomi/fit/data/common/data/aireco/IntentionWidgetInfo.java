package com.xiaomi.fit.data.common.data.aireco;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/data/common/data/aireco/IntentionWidgetInfo;", "", "<init>", "()V", "appPackage", "", "getAppPackage", "()Ljava/lang/String;", "setAppPackage", "(Ljava/lang/String;)V", "widgetProviderName", "getWidgetProviderName", "setWidgetProviderName", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntentionWidgetInfo {

    @NotNull
    private String appPackage;

    @NotNull
    private String widgetProviderName;

    public IntentionWidgetInfo() {
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.appPackage = packageName;
        this.widgetProviderName = "";
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    public final String getWidgetProviderName() {
        return this.widgetProviderName;
    }

    public final void setAppPackage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appPackage = str;
    }

    public final void setWidgetProviderName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.widgetProviderName = str;
    }
}
