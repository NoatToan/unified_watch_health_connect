package com.huami.ai.skill;

import androidx.core.app.NotificationCompat;
import com.huami.ai.entity.alert.Alarm;
import com.huami.ai.entity.alert.Reminder;
import com.huami.ai.entity.alert.Timer;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ\u0013\u0010\u000f\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000bJ\u001d\u0010\u0015\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u0013\u0010\u0018\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\rJ\u001b\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H¦@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\rJ#\u0010\u001e\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000bJ\u0013\u0010\u001f\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u0013\u0010 \u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b \u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/huami/ai/skill/AlertSkill;", "", "Lcom/huami/ai/entity/alert/Alarm;", "alarm", "", "setAlarm", "(Lcom/huami/ai/entity/alert/Alarm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "token", "deleteAlarm", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAlarm", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeAlarm", "queryAlarm", "Lcom/huami/ai/entity/alert/Reminder;", NotificationCompat.CATEGORY_REMINDER, "setReminder", "(Lcom/huami/ai/entity/alert/Reminder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteReminder", "closeReminder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryReminder", "openReminder", "Lcom/huami/ai/entity/alert/Timer;", "timer", "setTimer", "(Lcom/huami/ai/entity/alert/Timer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openTimer", "deleteTimer", "closeTimer", "queryTimer", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public interface AlertSkill {
    @Nullable
    Object closeAlarm(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object closeReminder(@Nullable String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object closeTimer(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteAlarm(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteReminder(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object deleteTimer(@Nullable List<String> list, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object openAlarm(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object openReminder(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object openTimer(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryAlarm(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryReminder(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryTimer(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setAlarm(@NotNull Alarm alarm, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setReminder(@NotNull Reminder reminder, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setTimer(@NotNull Timer timer, @NotNull Continuation<? super Boolean> continuation);
}
