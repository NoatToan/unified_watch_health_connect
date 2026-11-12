package com.example.habit.export;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J0\u0010\b\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&J@\u0010\u000f\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0012j\b\u0012\u0004\u0012\u00020\u0011`\u0010\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\nH&J:\u0010\u0014\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0012j\b\u0012\u0004\u0012\u00020\u0011`\u0010\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0017"}, d2 = {"Lcom/example/habit/export/HabitManager;", "", "gotoHabitPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "habitNum", "", "loadTodayHabitList", "success", "Lkotlin/Function1;", "", "Lcom/example/habit/export/Today;", "fail", "Lkotlin/Function0;", "loadHabitList", "Lkotlin/collections/ArrayList;", "Lcom/example/habit/export/HabitBean;", "Ljava/util/ArrayList;", "", "loadMyHabitList", "addHabitPunchInShortcut", "Companion", "habit-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HabitManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/example/habit/export/HabitManager$Companion;", "", "<init>", "()V", "habit-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addHabitPunchInShortcut();

    void gotoHabitPage(@NotNull Activity activity, int habitNum);

    void loadHabitList(@NotNull Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull Function1<? super String, Unit> fail);

    void loadMyHabitList(@NotNull Function1<? super ArrayList<HabitBean>, Unit> success, @NotNull Function0<Unit> fail);

    void loadTodayHabitList(@NotNull Function1<? super List<Today>, Unit> success, @NotNull Function0<Unit> fail);
}
