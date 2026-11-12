package com.xiaomi.fitness.habit.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/habit/bean/AddHabitDayBean;", "", "type", "", "text", "", "isSelected", "", "<init>", "(ILjava/lang/String;Z)V", "getType", "()I", "setType", "(I)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "()Z", "setSelected", "(Z)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddHabitDayBean {
    private boolean isSelected;

    @NotNull
    private String text;
    private int type;

    public AddHabitDayBean(int i, @NotNull String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.type = i;
        this.text = text;
        this.isSelected = z;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
