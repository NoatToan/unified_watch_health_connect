package com.xiaomi.fitness.devicesettings.export.sleep;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/sleep/SnoreSwitchStatus;", "", "Companion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface SnoreSwitchStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE = 0;
    public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE = 1;
    public static final int STATUS_SNORE_DETECTION_SWITCH_OPEN = 2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/sleep/SnoreSwitchStatus$Companion;", "", "<init>", "()V", "STATUS_SNORE_DETECTION_SWITCH_CLOSE", "", "STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE", "STATUS_SNORE_DETECTION_SWITCH_OPEN", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE = 0;
        public static final int STATUS_SNORE_DETECTION_SWITCH_CLOSE_ONCE = 1;
        public static final int STATUS_SNORE_DETECTION_SWITCH_OPEN = 2;

        private Companion() {
        }
    }
}
