package com.xiaomi.fitness.chart.entrys;

import com.github.mikephil.charting.data.BarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.a52;
import defpackage.vqr;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 :2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001:B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0003\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0003\u0010\u000fJ\u0011\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0000H\u0096\u0002J\u0013\u00106\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020\u000bH\u0016J\u0006\u00109\u001a\u00020/R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0012\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "Lcom/github/mikephil/charting/data/BarEntry;", "", "<init>", "()V", "x", "", "y", "timestamp", "", "type", "", "(FFJI)V", "vals", "", "(F[F)V", "selected", "getSelected", "()I", "setSelected", "(I)V", "targetSelected", "getTargetSelected", "setTargetSelected", "isMinMax", "localDate", "Lorg/joda/time/LocalDate;", "goalValue", "getGoalValue", "setGoalValue", "goalY", "getGoalY", "()F", "setGoalY", "(F)V", "entryMinY", "getEntryMinY", "setEntryMinY", "validType", "drawableType", "levelType", "levelValue", "", "itemType", "barEntryTimeType", "chartItemType", "needShowIcon", "", "getNeedShowIcon", "()Z", "setNeedShowIcon", "(Z)V", "compareTo", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "equals", "", "hashCode", "isSelected", "Companion", "chart_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class RecyclerBarEntry extends BarEntry implements Comparable<RecyclerBarEntry> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_INVALID = 1;
    public static final int TYPE_ITEM_TYPE_EXPAND = 1;
    public static final int TYPE_ITEM_TYPE_NORMAL = 0;
    public static final int TYPE_LONG_PRESS_SELECTED = 2;
    public static final int TYPE_MINMAX_DEF = 0;
    public static final int TYPE_MINMAX_MAX = 1;
    public static final int TYPE_MINMAX_MAX_NEAR = 2;
    public static final int TYPE_MINMAX_MIN = -1;
    public static final int TYPE_MINMAX_MIN_NEAR = -2;
    public static final int TYPE_SINGLE_TAP_UP_SELECTED = 1;
    public static final int TYPE_UNSELECTED = 0;
    public static final int TYPE_VALID = 0;
    public static final int TYPE_XAXIS_END_DAY = 5;
    public static final int TYPE_XAXIS_END_TODAY = 6;
    public static final int TYPE_XAXIS_FIRST = 1;
    public static final int TYPE_XAXIS_SECOND = 2;
    public static final int TYPE_XAXIS_SPECIAL = 4;
    public static final int TYPE_XAXIS_THIRD = 3;

    @JvmField
    public int barEntryTimeType;

    @JvmField
    public int chartItemType;

    @JvmField
    public int drawableType;
    private float entryMinY;
    private int goalValue;
    private float goalY;

    @JvmField
    public int isMinMax;

    @JvmField
    @NotNull
    public String itemType;

    @JvmField
    public int levelType;

    @JvmField
    @NotNull
    public String levelValue;

    @JvmField
    @Nullable
    public LocalDate localDate;
    private boolean needShowIcon;
    private int selected;
    private int targetSelected;

    @JvmField
    public long timestamp;

    @JvmField
    public int type;

    @JvmField
    public int validType;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\u0014\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u001b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\u001e\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00172\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u0004\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b!\u0010\u001cJ)\u0010\"\u001a\u00020\u001e\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010$R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010$R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010$R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010$R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010$R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010$R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010$R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010$R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010$R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010$¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry$Companion;", "", "", "endTime", "", "itemDistance", "", "isLastEntryOfTheDay", "(JI)Z", "isLastEntryOfTheToday", "Lorg/joda/time/LocalDate;", "localDate", "getWeekBarEntryType", "(Lorg/joda/time/LocalDate;)I", "La52;", "attrs", "getMonthBarEntryType", "(La52;Lorg/joda/time/LocalDate;)I", "getMonthBarEntryType2", "startTime", "getDayBarEntryType", "(La52;JJ)I", "getDayBarEntryType2", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "T", "", "barEntries", "getValidEntryReverse", "(Ljava/util/List;)I", "entries", "", "getTheMaxNumber", "(Ljava/util/List;)F", "getValidEntry", "getValidEntryFloat", "TYPE_XAXIS_FIRST", "I", "TYPE_XAXIS_SECOND", "TYPE_XAXIS_THIRD", "TYPE_XAXIS_SPECIAL", "TYPE_XAXIS_END_DAY", "TYPE_XAXIS_END_TODAY", "TYPE_UNSELECTED", "TYPE_SINGLE_TAP_UP_SELECTED", "TYPE_LONG_PRESS_SELECTED", "TYPE_VALID", "TYPE_INVALID", "TYPE_MINMAX_DEF", "TYPE_MINMAX_MIN", "TYPE_MINMAX_MIN_NEAR", "TYPE_MINMAX_MAX", "TYPE_MINMAX_MAX_NEAR", "TYPE_ITEM_TYPE_NORMAL", "TYPE_ITEM_TYPE_EXPAND", "<init>", "()V", "chart_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isLastEntryOfTheDay(long endTime, int itemDistance) {
            return TimeDateUtil.timestampToLocalDate(endTime).getDayOfWeek() != TimeDateUtil.timestampToLocalDate(((long) ((int) (((float) itemDistance) * 1.5f))) + endTime).getDayOfWeek();
        }

        private final boolean isLastEntryOfTheToday(long endTime, int itemDistance) {
            return isLastEntryOfTheDay(endTime, itemDistance) && TimeDateUtil.isToday(TimeDateUtil.timestampToLocalDate(endTime));
        }

        @JvmStatic
        public final int getDayBarEntryType(@Nullable a52 attrs, long startTime, long endTime) {
            int i = 3;
            if (attrs == null) {
                return 3;
            }
            int i2 = (int) (endTime - startTime);
            boolean zIsEndHourOfTheDay = TimeDateUtil.isEndHourOfTheDay(endTime);
            int hourOfTheDay = TimeDateUtil.getHourOfTheDay(startTime);
            if (zIsEndHourOfTheDay && vqr.a(hourOfTheDay, attrs)) {
                return 4;
            }
            if (zIsEndHourOfTheDay) {
                i = 1;
            } else if (vqr.a(hourOfTheDay, attrs)) {
                i = 2;
            }
            if (isLastEntryOfTheToday(endTime, i2)) {
                return 6;
            }
            if (isLastEntryOfTheDay(endTime, i2)) {
                return 5;
            }
            return i;
        }

        @JvmStatic
        public final int getDayBarEntryType2(@Nullable a52 attrs, long startTime, long endTime) {
            return (attrs != null && vqr.a(TimeDateUtil.getHourOfTheDay(startTime), attrs)) ? 2 : 3;
        }

        @JvmStatic
        public final int getMonthBarEntryType(@NotNull a52 attrs, @NotNull LocalDate localDate) {
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            boolean zIsLastDayOfMonth = TimeDateUtil.isLastDayOfMonth(localDate);
            int dayOfYear = localDate.getDayOfYear();
            if (zIsLastDayOfMonth && (dayOfYear + 1) % attrs.V == 0) {
                return 4;
            }
            if (zIsLastDayOfMonth) {
                return 1;
            }
            return (dayOfYear + 1) % attrs.V == 0 ? 2 : 3;
        }

        @JvmStatic
        public final int getMonthBarEntryType2(@NotNull a52 attrs, @NotNull LocalDate localDate) {
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            return (Intrinsics.areEqual(TimeDateUtil.getFirstDayOfMonth(localDate), localDate) || localDate.getDayOfMonth() % 7 == 0) ? 2 : 3;
        }

        public final <T extends RecyclerBarEntry> float getTheMaxNumber(@Nullable List<? extends T> entries) {
            if (entries == null || entries.isEmpty()) {
                return 0.0f;
            }
            T t = entries.get(0);
            Intrinsics.checkNotNull(t);
            float y = t.getY();
            int size = entries.size();
            for (int i = 0; i < size; i++) {
                T t2 = entries.get(i);
                Intrinsics.checkNotNull(t2);
                y = Math.max(Math.max(y, t2.getY()), t2.getY());
            }
            return y;
        }

        @JvmStatic
        public final <T extends RecyclerBarEntry> int getValidEntry(@NotNull List<? extends T> barEntries) {
            T t;
            Intrinsics.checkNotNullParameter(barEntries, "barEntries");
            int size = barEntries.size();
            do {
                size--;
                if (-1 >= size) {
                    return 0;
                }
                t = barEntries.get(size);
                Intrinsics.checkNotNull(t);
            } while (t.getY() <= 0.0f);
            return (int) t.getY();
        }

        @JvmStatic
        public final <T extends RecyclerBarEntry> float getValidEntryFloat(@NotNull List<? extends T> barEntries) {
            T t;
            Intrinsics.checkNotNullParameter(barEntries, "barEntries");
            int size = barEntries.size();
            do {
                size--;
                if (-1 >= size) {
                    return 0.0f;
                }
                t = barEntries.get(size);
                Intrinsics.checkNotNull(t);
            } while (t.getY() <= 0.0f);
            return t.getY();
        }

        public final <T extends RecyclerBarEntry> int getValidEntryReverse(@NotNull List<? extends T> barEntries) {
            Intrinsics.checkNotNullParameter(barEntries, "barEntries");
            int size = barEntries.size();
            for (int i = 0; i < size; i++) {
                T t = barEntries.get(i);
                Intrinsics.checkNotNull(t);
                if (t.getY() > 0.0f) {
                    return (int) t.getY();
                }
            }
            return 0;
        }

        @JvmStatic
        public final int getWeekBarEntryType(@Nullable LocalDate localDate) {
            Intrinsics.checkNotNull(localDate);
            return TimeDateUtil.isSunday(localDate) ? 1 : 2;
        }
    }

    public RecyclerBarEntry() {
        super(0.0f, 0.0f);
        this.levelType = -1;
        this.levelValue = "";
        this.itemType = "";
        this.needShowIcon = true;
    }

    @JvmStatic
    public static final int getDayBarEntryType(@Nullable a52 a52Var, long j, long j2) {
        return INSTANCE.getDayBarEntryType(a52Var, j, j2);
    }

    @JvmStatic
    public static final int getDayBarEntryType2(@Nullable a52 a52Var, long j, long j2) {
        return INSTANCE.getDayBarEntryType2(a52Var, j, j2);
    }

    @JvmStatic
    public static final int getMonthBarEntryType(@NotNull a52 a52Var, @NotNull LocalDate localDate) {
        return INSTANCE.getMonthBarEntryType(a52Var, localDate);
    }

    @JvmStatic
    public static final int getMonthBarEntryType2(@NotNull a52 a52Var, @NotNull LocalDate localDate) {
        return INSTANCE.getMonthBarEntryType2(a52Var, localDate);
    }

    @JvmStatic
    public static final <T extends RecyclerBarEntry> int getValidEntry(@NotNull List<? extends T> list) {
        return INSTANCE.getValidEntry(list);
    }

    @JvmStatic
    public static final <T extends RecyclerBarEntry> float getValidEntryFloat(@NotNull List<? extends T> list) {
        return INSTANCE.getValidEntryFloat(list);
    }

    @JvmStatic
    public static final int getWeekBarEntryType(@Nullable LocalDate localDate) {
        return INSTANCE.getWeekBarEntryType(localDate);
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !Intrinsics.areEqual(getClass(), o.getClass())) {
            return false;
        }
        RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) o;
        return this.timestamp == recyclerBarEntry.timestamp && this.type == recyclerBarEntry.type && getX() == recyclerBarEntry.getX() && Intrinsics.areEqual(this.localDate, recyclerBarEntry.localDate);
    }

    public final float getEntryMinY() {
        return this.entryMinY;
    }

    public final int getGoalValue() {
        return this.goalValue;
    }

    public final float getGoalY() {
        return this.goalY;
    }

    public final boolean getNeedShowIcon() {
        return this.needShowIcon;
    }

    public final int getSelected() {
        return this.selected;
    }

    public final int getTargetSelected() {
        return this.targetSelected;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.timestamp), Integer.valueOf(this.type), this.localDate);
    }

    public final boolean isSelected() {
        int i = this.selected;
        return i == 1 || i == 2;
    }

    public final void setEntryMinY(float f) {
        this.entryMinY = f;
    }

    public final void setGoalValue(int i) {
        this.goalValue = i;
    }

    public final void setGoalY(float f) {
        this.goalY = f;
    }

    public final void setNeedShowIcon(boolean z) {
        this.needShowIcon = z;
    }

    public final void setSelected(int i) {
        this.selected = i;
    }

    public final void setTargetSelected(int i) {
        this.targetSelected = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull RecyclerBarEntry o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return (int) (this.timestamp - o.timestamp);
    }

    public RecyclerBarEntry(float f, float f2, long j, int i) {
        super(f, f2);
        this.levelType = -1;
        this.levelValue = "";
        this.itemType = "";
        this.needShowIcon = true;
        this.timestamp = j;
        this.type = i;
        this.validType = 0;
        this.localDate = TimeDateUtil.timestampToLocalDate(j);
    }

    public RecyclerBarEntry(float f, @Nullable float[] fArr) {
        super(f, fArr);
        this.levelType = -1;
        this.levelValue = "";
        this.itemType = "";
        this.needShowIcon = true;
    }
}
