package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoRepeatMode;", "", "<init>", "()V", "ONCE", "", "DAILY", "WEEKLY", "MONTHLY", "YEARLY", "CUSTOM", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TodoRepeatMode {
    public static final int CUSTOM = 5;
    public static final int DAILY = 1;

    @NotNull
    public static final TodoRepeatMode INSTANCE = new TodoRepeatMode();
    public static final int MONTHLY = 3;
    public static final int ONCE = 0;
    public static final int WEEKLY = 2;
    public static final int YEARLY = 4;

    private TodoRepeatMode() {
    }
}
