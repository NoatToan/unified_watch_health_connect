package com.xiaomi.fitness.watch.face.edit.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/SlotType;", "", "<init>", "()V", "CUSTOM_WIDGET", "", "FONT", "TIME", "DIAL", "APP_WIDGET", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotType {

    @NotNull
    public static final String APP_WIDGET = "appWidget";

    @NotNull
    public static final String CUSTOM_WIDGET = "widget";

    @NotNull
    public static final String DIAL = "dial";

    @NotNull
    public static final String FONT = "font";

    @NotNull
    public static final SlotType INSTANCE = new SlotType();

    @NotNull
    public static final String TIME = "time";

    private SlotType() {
    }
}
