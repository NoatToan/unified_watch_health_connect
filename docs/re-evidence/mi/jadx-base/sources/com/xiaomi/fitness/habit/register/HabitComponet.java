package com.xiaomi.fitness.habit.register;

import com.example.habit.export.HabitManagerKt;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import com.xiaomi.fitness.habit.scheme.HabitPageScheme;
import defpackage.xfl;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/habit/register/HabitComponet;", "", "<init>", "()V", "registerActivityCreate", "", "addHabitPunchInShortcut", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "habit")
public final class HabitComponet {
    @ComponentTask(notLaterThan = 4, onMainThread = false)
    public final void addHabitPunchInShortcut() {
        HabitManagerKt.getHabitManager().addHabitPunchInShortcut();
    }

    @ComponentTask(notLaterThan = 2, onMainThread = true)
    public final void registerActivityCreate() {
        xfl.a().d(new HabitPageScheme());
    }
}
