package com.xiaomi.hm.health.device.assistant.schedule.rrule;

import com.huami.bluetooth.profile.channel.module.schedule.RepeatMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/RecurrenceRuleDecode;", "", "", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/WeekdayNum;", "weekNo", "", "interval", "", "a", "(Ljava/util/List;I)Ljava/lang/Long;", "", "ruleString", "decode", "(Ljava/lang/String;)Ljava/lang/Long;", "Lkotlin/Lazy;", "b", "()J", "everyDayRepeat", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RecurrenceRuleDecode {

    @NotNull
    public static final RecurrenceRuleDecode INSTANCE = new RecurrenceRuleDecode();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy everyDayRepeat = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Frequency.values().length];
            iArr[Frequency.Daily.ordinal()] = 1;
            iArr[Frequency.Weekly.ordinal()] = 2;
            iArr[Frequency.Monthly.ordinal()] = 3;
            iArr[Frequency.Yearly.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Weekday.values().length];
            iArr2[Weekday.Monday.ordinal()] = 1;
            iArr2[Weekday.Tuesday.ordinal()] = 2;
            iArr2[Weekday.Wednesday.ordinal()] = 3;
            iArr2[Weekday.Thursday.ordinal()] = 4;
            iArr2[Weekday.Friday.ordinal()] = 5;
            iArr2[Weekday.Saturday.ordinal()] = 6;
            iArr2[Weekday.Sunday.ordinal()] = 7;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Long invoke() {
            int i = this.a;
            if (i == 1) {
                return Long.valueOf(RepeatMode.EveryWeek.getFlag());
            }
            if (i != 2) {
                return null;
            }
            return Long.valueOf(RepeatMode.Fortnight.getFlag());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Long> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        public final long a() {
            RepeatMode[] repeatModeArr = {RepeatMode.Monday, RepeatMode.Tuesday, RepeatMode.Wednesday, RepeatMode.Thursday, RepeatMode.Friday, RepeatMode.Saturday, RepeatMode.Sunday};
            int flag = 0;
            for (int i = 0; i < 7; i++) {
                flag |= repeatModeArr[i].getFlag();
            }
            return flag;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return Long.valueOf(a());
        }
    }

    private RecurrenceRuleDecode() {
    }

    private final Long a(List<WeekdayNum> weekNo, int interval) {
        RepeatMode repeatMode;
        Long lValueOf = null;
        if ((weekNo.isEmpty() ^ true ? weekNo : null) != null) {
            int flag = 0;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(weekNo, 10));
            Iterator<T> it2 = weekNo.iterator();
            while (it2.hasNext()) {
                switch (WhenMappings.$EnumSwitchMapping$1[((WeekdayNum) it2.next()).getWeekday().ordinal()]) {
                    case 1:
                        repeatMode = RepeatMode.Monday;
                        break;
                    case 2:
                        repeatMode = RepeatMode.Tuesday;
                        break;
                    case 3:
                        repeatMode = RepeatMode.Wednesday;
                        break;
                    case 4:
                        repeatMode = RepeatMode.Thursday;
                        break;
                    case 5:
                        repeatMode = RepeatMode.Friday;
                        break;
                    case 6:
                        repeatMode = RepeatMode.Saturday;
                        break;
                    case 7:
                        repeatMode = RepeatMode.Sunday;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(repeatMode);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                flag |= ((RepeatMode) it3.next()).getFlag();
            }
            lValueOf = Long.valueOf(flag);
        }
        return lValueOf == null ? (Long) new a(interval).invoke() : lValueOf;
    }

    private final long b() {
        return ((Number) everyDayRepeat.getValue()).longValue();
    }

    @Nullable
    public final Long decode(@Nullable String ruleString) {
        Long lValueOf;
        if (ruleString != null) {
            try {
                if (!(ruleString.length() == 0) && !Intrinsics.areEqual(ruleString.toLowerCase(Locale.getDefault()), "null")) {
                    RRule rRule = new RRule(ruleString);
                    int i = WhenMappings.$EnumSwitchMapping$0[rRule.getFreq().ordinal()];
                    if (i == 1) {
                        lValueOf = Long.valueOf(b());
                        lValueOf.longValue();
                        if (!(rRule.getInterval() == 1)) {
                            return null;
                        }
                    } else {
                        if (i == 2) {
                            return a(rRule.getByDay(), rRule.getInterval());
                        }
                        if (i == 3) {
                            lValueOf = Long.valueOf(RepeatMode.EveryMonth.getFlag());
                            lValueOf.longValue();
                            if (!(rRule.getInterval() == 1)) {
                                return null;
                            }
                        } else {
                            if (i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lValueOf = Long.valueOf(RepeatMode.EveryYear.getFlag());
                            lValueOf.longValue();
                            if (!(rRule.getInterval() == 1)) {
                                return null;
                            }
                        }
                    }
                    return lValueOf;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return 0L;
    }
}
