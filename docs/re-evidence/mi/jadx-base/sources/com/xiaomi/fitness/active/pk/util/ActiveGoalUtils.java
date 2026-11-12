package com.xiaomi.fitness.active.pk.util;

import defpackage.fni;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/active/pk/util/ActiveGoalUtils;", "", "<init>", "()V", "getIconWithGoalField", "", "field", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActiveGoalUtils {

    @NotNull
    public static final ActiveGoalUtils INSTANCE = new ActiveGoalUtils();

    private ActiveGoalUtils() {
    }

    public final int getIconWithGoalField(int field) {
        if (field == 1) {
            return fni.g;
        }
        if (field == 2) {
            return fni.e;
        }
        if (field != 3) {
            return field != 4 ? fni.h : fni.h;
        }
        return fni.f;
    }
}
