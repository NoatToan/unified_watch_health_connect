package com.xiaomi.fitness.devicesettings.bluttooth.todo.remind.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/remind/data/TodoStatus;", "", "<init>", "()V", "NOT_DONE", "", "DONE", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TodoStatus {
    public static final int DONE = 2;

    @NotNull
    public static final TodoStatus INSTANCE = new TodoStatus();
    public static final int NOT_DONE = 1;

    private TodoStatus() {
    }
}
