package com.mi.health;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mi/health/WidgetConstants;", "", "<init>", "()V", "WIDGET_ITEM_TYPE", "", "MIUI_APP_WIDGET_UPDATE_ACTION", "", "APP_WIDGET_UPDATE_ACTION", "ACTION_UI_MODE_CHANGED", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WidgetConstants {

    @NotNull
    public static final String ACTION_UI_MODE_CHANGED = "com.mi.health.widget.action.UI_MODE_CHANGED";

    @NotNull
    public static final String APP_WIDGET_UPDATE_ACTION = "android.appwidget.action.APPWIDGET_UPDATE";

    @NotNull
    public static final WidgetConstants INSTANCE = new WidgetConstants();

    @NotNull
    public static final String MIUI_APP_WIDGET_UPDATE_ACTION = "miui.appwidget.action.APPWIDGET_UPDATE";
    public static final int WIDGET_ITEM_TYPE = 4;

    private WidgetConstants() {
    }
}
