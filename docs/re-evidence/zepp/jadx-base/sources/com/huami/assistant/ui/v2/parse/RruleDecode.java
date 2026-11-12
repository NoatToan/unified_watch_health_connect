package com.huami.assistant.ui.v2.parse;

import android.text.TextUtils;
import android.text.format.Time;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.EventRecurrence;
import com.huami.bluetooth.profile.channel.module.schedule.RepeatMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/assistant/ui/v2/parse/RruleDecode;", "", "", "a", "()Ljava/lang/Long;", "decode", "getRepeatStopTime", "", "isNeverRepeat", "", "Ljava/lang/String;", "rrule", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "startTime", "c", "Lkotlin/Lazy;", "()J", "everyDayRepeat", "Lcom/huami/assistant/calendar/EventRecurrence;", GoogleApiAvailabilityLight.a, "Lcom/huami/assistant/calendar/EventRecurrence;", "event", "<init>", "(Ljava/lang/String;Ljava/util/Calendar;)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class RruleDecode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String rrule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Calendar startTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy everyDayRepeat = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final EventRecurrence event;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            RepeatMode[] repeatModeArr = {RepeatMode.Monday, RepeatMode.Tuesday, RepeatMode.Wednesday, RepeatMode.Thursday, RepeatMode.Friday, RepeatMode.Saturday, RepeatMode.Sunday};
            int flag = 0;
            for (int i = 0; i < 7; i++) {
                flag |= repeatModeArr[i].getFlag();
            }
            return Long.valueOf(flag);
        }
    }

    public RruleDecode(@NotNull String str, @NotNull Calendar calendar) {
        this.rrule = str;
        this.startTime = calendar;
        EventRecurrence eventRecurrence = new EventRecurrence();
        this.event = eventRecurrence;
        if (isNeverRepeat()) {
            return;
        }
        eventRecurrence.parse(str);
        Time time = new Time();
        time.set(calendar.getTimeInMillis());
        Unit unit = Unit.INSTANCE;
        eventRecurrence.setStartDate(time);
    }

    private final Long a() {
        RepeatMode repeatMode;
        int[] iArr = this.event.byday;
        Long lValueOf = null;
        if (iArr != null) {
            int flag = 0;
            if (!(!(iArr.length == 0))) {
                iArr = null;
            }
            if (iArr != null) {
                ArrayList arrayList = new ArrayList(iArr.length);
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    if (i2 == 131072) {
                        repeatMode = RepeatMode.Monday;
                    } else if (i2 == 262144) {
                        repeatMode = RepeatMode.Tuesday;
                    } else if (i2 == 524288) {
                        repeatMode = RepeatMode.Wednesday;
                    } else if (i2 == 1048576) {
                        repeatMode = RepeatMode.Thursday;
                    } else if (i2 != 2097152) {
                        repeatMode = i2 != 4194304 ? RepeatMode.Sunday : RepeatMode.Saturday;
                    } else {
                        repeatMode = RepeatMode.Friday;
                    }
                    arrayList.add(repeatMode);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    flag |= ((RepeatMode) it2.next()).getFlag();
                }
                lValueOf = Long.valueOf(flag);
            }
        }
        return lValueOf == null ? Long.valueOf(b()) : lValueOf;
    }

    private static final long b() {
        return RepeatMode.EveryWeek.getFlag();
    }

    private final long c() {
        return ((Number) this.everyDayRepeat.getValue()).longValue();
    }

    @Nullable
    public final Long decode() {
        if (isNeverRepeat()) {
            return 0L;
        }
        EventRecurrence eventRecurrence = this.event;
        int i = eventRecurrence.freq;
        if (i == 5 && eventRecurrence.interval == 2) {
            return Long.valueOf(RepeatMode.Fortnight.getFlag());
        }
        int i2 = eventRecurrence.interval;
        if (i2 != 1 && i2 != 0) {
            return null;
        }
        if (i == 4) {
            return Long.valueOf(c());
        }
        if (i == 5) {
            return a();
        }
        if (i == 6) {
            return Long.valueOf(RepeatMode.EveryMonth.getFlag());
        }
        if (i != 7) {
            return null;
        }
        return Long.valueOf(RepeatMode.EveryYear.getFlag());
    }

    public final long getRepeatStopTime() {
        String str;
        if (isNeverRepeat() || (str = this.event.until) == null) {
            return 4294967295L;
        }
        Time time = new Time();
        time.parse(str);
        Long lValueOf = Long.valueOf(time.toMillis(false));
        if (!(lValueOf.longValue() > 0)) {
            lValueOf = null;
        }
        Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() / ((long) 1000)) : null;
        if (lValueOf2 == null) {
            return 4294967295L;
        }
        return lValueOf2.longValue();
    }

    public final boolean isNeverRepeat() {
        if (!TextUtils.isEmpty(this.rrule)) {
            String str = this.rrule;
            Locale locale = Locale.getDefault();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            if (!Intrinsics.areEqual(str.toLowerCase(locale), "null")) {
                return false;
            }
        }
        return true;
    }
}
