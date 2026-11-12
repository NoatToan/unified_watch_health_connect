package com.xiaomi.fitness.device.contact.export;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/SyncType;", "", "Companion", "device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface SyncType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SYNC_TYPE_ALL = -1;
    public static final int SYNC_TYPE_BATTERY = 3;
    public static final int SYNC_TYPE_CONFIG = 7;
    public static final int SYNC_TYPE_CURSE = 9;
    public static final int SYNC_TYPE_FITNESS = 1;
    public static final int SYNC_TYPE_HABIT = 8;
    public static final int SYNC_TYPE_LANGUAGE = 6;
    public static final int SYNC_TYPE_NFC = 0;
    public static final int SYNC_TYPE_PROFILE = 5;
    public static final int SYNC_TYPE_TIME = 4;
    public static final int SYNC_TYPE_WATCH_FACE = 2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/SyncType$Companion;", "", "<init>", "()V", "SYNC_TYPE_ALL", "", "SYNC_TYPE_NFC", "SYNC_TYPE_FITNESS", "SYNC_TYPE_WATCH_FACE", "SYNC_TYPE_BATTERY", "SYNC_TYPE_TIME", "SYNC_TYPE_PROFILE", "SYNC_TYPE_LANGUAGE", "SYNC_TYPE_CONFIG", "SYNC_TYPE_HABIT", "SYNC_TYPE_CURSE", "device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SYNC_TYPE_ALL = -1;
        public static final int SYNC_TYPE_BATTERY = 3;
        public static final int SYNC_TYPE_CONFIG = 7;
        public static final int SYNC_TYPE_CURSE = 9;
        public static final int SYNC_TYPE_FITNESS = 1;
        public static final int SYNC_TYPE_HABIT = 8;
        public static final int SYNC_TYPE_LANGUAGE = 6;
        public static final int SYNC_TYPE_NFC = 0;
        public static final int SYNC_TYPE_PROFILE = 5;
        public static final int SYNC_TYPE_TIME = 4;
        public static final int SYNC_TYPE_WATCH_FACE = 2;

        private Companion() {
        }
    }
}
