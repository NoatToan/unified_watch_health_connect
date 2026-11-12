package com.xiaomi.hm.health.device.settings.todo;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "Lcom/xiaomi/hm/health/device/settings/todo/ParcelableTodo;", "toParcelableTodo", "", "date", "time", "calculatorFirstRemind", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo$Source;", "", "a", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class TodoExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "timestamp", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, Long> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(@Nullable Long l) {
            if (l != null) {
                if (l.longValue() > 0) {
                    return l;
                }
            }
            return null;
        }
    }

    private static final int a(Todo.Source source) {
        if (Intrinsics.areEqual(source, Todo.Source.XiaoAi.INSTANCE)) {
            return 1;
        }
        return Intrinsics.areEqual(source, Todo.Source.Alexa.INSTANCE) ? 2 : 0;
    }

    @Nullable
    public static final Long calculatorFirstRemind(@Nullable Long l, @Nullable Long l2) {
        Calendar calendar = null;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(jLongValue);
        calendar2.set(1, calendar3.get(1));
        calendar2.set(6, calendar3.get(6));
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue2);
            calendar2.set(11, calendar.get(11));
            calendar2.set(12, calendar.get(12));
        }
        if (calendar == null) {
            calendar2.set(11, 0);
            calendar2.set(12, 0);
        }
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return Long.valueOf(calendar2.getTimeInMillis());
    }

    @NotNull
    public static final ParcelableTodo toParcelableTodo(@NotNull Todo todo) {
        a aVar = a.a;
        return new ParcelableTodo(todo.getId(), todo.getContent(), a(todo.getSource()), aVar.invoke(todo.getDate()), aVar.invoke(todo.getTime()), todo.getRepeat(), aVar.invoke(todo.getCompleteTime()), todo.getFirstRemind());
    }
}
