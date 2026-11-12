package com.example.statistics.export;

import com.xiaomi.fitness.main.export.MainTab;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/example/statistics/export/OneTrackConstant;", "", "<init>", "()V", "EVENT_NAME_CONNECTIVITY", "", "EVENT_NAME_CONNECTIVITY_DEVICE", "EVENT_NAME_MIWEAR_DEV_POWER", "EVENT_NAME_MIWEAR_DEV_BLUETOOTH", "EVENT_AUTO_TRACK", "PAGE_ORIGIN", MainTab.PAGE_TYPE, "KEY_TIP", "VALUE_AUTO_TRACK_TIP", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OneTrackConstant {

    @NotNull
    public static final String EVENT_AUTO_TRACK = "auto_track_pageview";

    @NotNull
    public static final String EVENT_NAME_CONNECTIVITY = "connectivity";

    @NotNull
    public static final String EVENT_NAME_CONNECTIVITY_DEVICE = "miwear_dev_app_event";

    @NotNull
    public static final String EVENT_NAME_MIWEAR_DEV_BLUETOOTH = "miwear_dev_bluetooth";

    @NotNull
    public static final String EVENT_NAME_MIWEAR_DEV_POWER = "miwear_dev_power";

    @NotNull
    public static final OneTrackConstant INSTANCE = new OneTrackConstant();

    @NotNull
    public static final String KEY_TIP = "tip";

    @NotNull
    public static final String PAGE_ORIGIN = "origin";

    @NotNull
    public static final String PAGE_TYPE = "type";

    @NotNull
    public static final String VALUE_AUTO_TRACK_TIP = "56.0.0.0.26766";

    private OneTrackConstant() {
    }
}
