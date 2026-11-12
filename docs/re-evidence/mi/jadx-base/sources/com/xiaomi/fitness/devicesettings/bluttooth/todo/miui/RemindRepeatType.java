package com.xiaomi.fitness.devicesettings.bluttooth.todo.miui;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/todo/miui/RemindRepeatType;", "", "<init>", "()V", "ONCE", "", "DAY", "WEEK", "MONTOFRI", "SATTOSUN", "WORKINGDAY", "HOLIDAY", "MONTH", "YEAR", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemindRepeatType {
    public static final int DAY = 1;
    public static final int HOLIDAY = 6;

    @NotNull
    public static final RemindRepeatType INSTANCE = new RemindRepeatType();
    public static final int MONTH = 7;
    public static final int MONTOFRI = 3;
    public static final int ONCE = 0;
    public static final int SATTOSUN = 4;
    public static final int WEEK = 2;
    public static final int WORKINGDAY = 5;
    public static final int YEAR = 8;

    private RemindRepeatType() {
    }
}
