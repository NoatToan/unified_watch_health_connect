package com.xiaomi.hm.health.device.settings.todo;

import com.huami.bluetooth.profile.channel.module.todo.Todo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xmlywind.sdk.common.Constants;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/todo/TodoUtils;", "", "", "currentTime", "Lcom/huami/bluetooth/profile/channel/module/todo/Todo;", "todo", "", Constants.IS_EXPIRED, "isToday", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TodoUtils {

    @NotNull
    public static final TodoUtils INSTANCE = new TodoUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "time", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, Long> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final long a(long j) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Long invoke(Long l) {
            return Long.valueOf(a(l.longValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "time", "current", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Long, Long, Boolean> {
        public final /* synthetic */ Function1<Long, Long> a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, long j2, long j3, long j4) {
                super(0);
                this.a = j;
                this.b = j2;
                this.c = j3;
                this.d = j4;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "isDateExpired - " + this.a + ": " + this.b + ", " + this.c + ": " + this.d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Long, Long> function1) {
            super(2);
            this.a = function1;
        }

        public final boolean a(long j, long j2) {
            HMLog.verbose$default(null, new a(j, this.a.invoke(Long.valueOf(j)).longValue(), j2, this.a.invoke(Long.valueOf(j2)).longValue()), 1, null);
            return this.a.invoke(Long.valueOf(j)).longValue() < this.a.invoke(Long.valueOf(j2)).longValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Long l, Long l2) {
            return Boolean.valueOf(a(l.longValue(), l2.longValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "time", "current", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Long, Long, Boolean> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ long a;
            public final /* synthetic */ Calendar b;
            public final /* synthetic */ long c;
            public final /* synthetic */ Calendar d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j, Calendar calendar, long j2, Calendar calendar2) {
                super(0);
                this.a = j;
                this.b = calendar;
                this.c = j2;
                this.d = calendar2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "isTimeExpired - " + this.a + ": " + this.b.getTimeInMillis() + ", " + this.c + ": " + this.d.getTimeInMillis();
            }
        }

        public c() {
            super(2);
        }

        public final boolean a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar.set(1, calendar2.get(1));
            calendar.set(2, calendar2.get(2));
            calendar.set(5, calendar2.get(5));
            HMLog.verbose$default(null, new a(j, calendar, j2, calendar2), 1, null);
            return calendar.getTimeInMillis() < calendar2.getTimeInMillis();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Long l, Long l2) {
            return Boolean.valueOf(a(l.longValue(), l2.longValue()));
        }
    }

    private TodoUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    public final boolean isExpired(long currentTime, @NotNull Todo todo) {
        a aVar = a.a;
        c cVar = c.a;
        b bVar = new b(aVar);
        Long time = todo.getTime();
        Long l = null;
        if (time != null) {
            if (!(time.longValue() > 0)) {
                time = null;
            }
        } else {
            time = null;
        }
        Long date = todo.getDate();
        if (date != null) {
            if (date.longValue() > 0) {
                l = date;
            }
        }
        if (time == null || l == null) {
            if (time != null) {
                return cVar.invoke(time, Long.valueOf(currentTime)).booleanValue();
            }
            if (l != null) {
                return bVar.invoke(l, Long.valueOf(currentTime)).booleanValue();
            }
        } else {
            if (bVar.invoke(l, Long.valueOf(currentTime)).booleanValue()) {
                return true;
            }
            if (TimeUtils.isTheSameDay(currentTime, l.longValue()) && cVar.invoke(time, Long.valueOf(currentTime)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isToday(long currentTime, @NotNull Todo todo) {
        return todo.getDate() != null && TimeUtils.isTheSameDay(currentTime, todo.getDate().longValue());
    }
}
