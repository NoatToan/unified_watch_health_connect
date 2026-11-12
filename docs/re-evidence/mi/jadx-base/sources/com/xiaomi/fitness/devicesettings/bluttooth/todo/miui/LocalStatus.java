package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/LocalStatus;", "", "<init>", "()V", "NEW", "", "AFTER_SYNC", "NEED_UPDATE", "DELETE", "JUST_SORT", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalStatus {
    public static final int AFTER_SYNC = 1;
    public static final int DELETE = 3;

    @NotNull
    public static final LocalStatus INSTANCE = new LocalStatus();
    public static final int JUST_SORT = 4;
    public static final int NEED_UPDATE = 2;
    public static final int NEW = 0;

    private LocalStatus() {
    }
}
