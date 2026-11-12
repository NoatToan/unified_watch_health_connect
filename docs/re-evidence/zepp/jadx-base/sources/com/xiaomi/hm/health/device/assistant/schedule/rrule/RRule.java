package com.xiaomi.hm.health.device.assistant.schedule.rrule;

import android.annotation.SuppressLint;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.calendar.ICalendar;
import com.huami.bluetooth.profile.channel.module.schedule.RepeatMode;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlin.text.m;
import org.cybergarage.upnp.Argument;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 V2\u00020\u0001:\u0001VB\u0011\b\u0016\u0012\u0006\u0010P\u001a\u00020\n¢\u0006\u0004\bQ\u0010RB\u0011\b\u0016\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bQ\u0010UJ\"\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0006\u0010\u000e\u001a\u00020\nR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R)\u00109\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`48\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R)\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000302j\b\u0012\u0004\u0012\u00020\u0003`48\u0006@\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R)\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000302j\b\u0012\u0004\u0012\u00020\u0003`48\u0006@\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R)\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u000302j\b\u0012\u0004\u0012\u00020\u0003`48\u0006@\u0006¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00108R)\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u000302j\b\u0012\u0004\u0012\u00020\u0003`48\u0006@\u0006¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u00108R)\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u000302j\b\u0012\u0004\u0012\u00020\u0003`48\u0006@\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u00108R\"\u0010L\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006W"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/RRule;", "", "", "", "integers", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", Argument.OUT, "", "b", "", "dayString", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "a", "toRFC5545String", "Ljava/lang/String;", "name", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;", "getFreq", "()Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;", "setFreq", "(Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Frequency;)V", "freq", "c", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "getWkst", "()Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;", "setWkst", "(Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/Weekday;)V", "wkst", "Ljava/util/Date;", GoogleApiAvailabilityLight.a, "Ljava/util/Date;", "getUntil", "()Ljava/util/Date;", "setUntil", "(Ljava/util/Date;)V", "until", "e", LogUtil.I, "getCount", "()I", "setCount", "(I)V", "count", "f", "getInterval", "setInterval", "interval", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/assistant/schedule/rrule/WeekdayNum;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "getByDay", "()Ljava/util/ArrayList;", "byDay", "h", "getByMonth", "byMonth", "i", "getByMonthDay", "byMonthDay", z.j, "getByWeekNo", "byWeekNo", hl.k, "getByYearDay", "byYearDay", "l", "getBySetPos", "bySetPos", "", "m", "Z", "isNeverRepeat", "()Z", "setNeverRepeat", "(Z)V", "rfc5545String", "<init>", "(Ljava/lang/String;)V", "", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "(J)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RRule {

    @SuppressLint({"ConstantLocale"})
    @NotNull
    private static final SimpleDateFormat n = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'", Locale.getDefault());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Frequency freq;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Weekday wkst;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Date until;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int count;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int interval;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<WeekdayNum> byDay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> byMonth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> byMonthDay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> byWeekNo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> byYearDay;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<Integer> bySetPos;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isNeverRepeat;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    public RRule(@NotNull String str) {
        Frequency frequency;
        this.name = ICalendar.Property.RRULE;
        this.freq = Frequency.Daily;
        this.byDay = new ArrayList<>();
        this.byMonth = new ArrayList<>();
        this.byMonthDay = new ArrayList<>();
        this.byWeekNo = new ArrayList<>();
        this.byYearDay = new ArrayList<>();
        this.bySetPos = new ArrayList<>();
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) m.replace$default(str, ICalendar.Property.RRULE + ":", "", false, 4, (Object) null), new String[]{";", SearchCriteria.EQ}, false, 0, 6, (Object) null);
        int i = 0;
        while (i < listSplit$default.size()) {
            String str2 = (String) listSplit$default.get(i);
            if (Intrinsics.areEqual(str2, "FREQ")) {
                i++;
                switch ((String) listSplit$default.get(i)) {
                    case "WEEKLY":
                        frequency = Frequency.Weekly;
                        break;
                    case "YEARLY":
                        frequency = Frequency.Yearly;
                        break;
                    case "DAILY":
                        frequency = Frequency.Daily;
                        break;
                    case "MONTHLY":
                        frequency = Frequency.Monthly;
                        break;
                    default:
                        frequency = Frequency.Daily;
                        break;
                }
                this.freq = frequency;
            }
            if (Intrinsics.areEqual(str2, "INTERVAL")) {
                i++;
                Integer intOrNull = l.toIntOrNull((String) listSplit$default.get(i));
                this.interval = intOrNull == null ? 1 : intOrNull.intValue();
            }
            if (Intrinsics.areEqual(str2, "BYDAY")) {
                i++;
                for (String str3 : StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null)) {
                    Weekday weekdayA = a(str3);
                    if (weekdayA != null) {
                        if (str3.length() > 2) {
                            Integer intOrNull2 = l.toIntOrNull(new Regex("[^-?0-9]+").replace(str3, ""));
                            this.byDay.add(new WeekdayNum(intOrNull2 == null ? 0 : intOrNull2.intValue(), weekdayA));
                        } else {
                            this.byDay.add(new WeekdayNum(0, weekdayA));
                        }
                    }
                }
            }
            if (Intrinsics.areEqual(str2, "BYMONTHDAY")) {
                i++;
                Iterator it2 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null).iterator();
                while (it2.hasNext()) {
                    Integer intOrNull3 = l.toIntOrNull((String) it2.next());
                    if (intOrNull3 != null) {
                        this.byMonthDay.add(intOrNull3);
                    }
                }
            }
            if (Intrinsics.areEqual(str2, "BYMONTH")) {
                i++;
                Iterator it3 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null).iterator();
                while (it3.hasNext()) {
                    Integer intOrNull4 = l.toIntOrNull((String) it3.next());
                    if (intOrNull4 != null) {
                        this.byMonth.add(intOrNull4);
                    }
                }
            }
            if (Intrinsics.areEqual(str2, "BYWEEKNO")) {
                i++;
                Iterator it4 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null).iterator();
                while (it4.hasNext()) {
                    Integer intOrNull5 = l.toIntOrNull((String) it4.next());
                    if (intOrNull5 != null) {
                        this.byWeekNo.add(intOrNull5);
                    }
                }
            }
            if (Intrinsics.areEqual(str2, "BYYEARDAY")) {
                i++;
                Iterator it5 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null).iterator();
                while (it5.hasNext()) {
                    Integer intOrNull6 = l.toIntOrNull((String) it5.next());
                    if (intOrNull6 != null) {
                        this.byYearDay.add(intOrNull6);
                    }
                }
            }
            if (Intrinsics.areEqual(str2, "BYSETPOS")) {
                i++;
                Iterator it6 = StringsKt__StringsKt.split$default((CharSequence) listSplit$default.get(i), new String[]{","}, false, 0, 6, (Object) null).iterator();
                while (it6.hasNext()) {
                    Integer intOrNull7 = l.toIntOrNull((String) it6.next());
                    if (intOrNull7 != null) {
                        this.bySetPos.add(intOrNull7);
                    }
                }
            }
            if (Intrinsics.areEqual(str2, "COUNT")) {
                i++;
                Integer intOrNull8 = l.toIntOrNull((String) listSplit$default.get(i));
                this.count = intOrNull8 == null ? 1 : intOrNull8.intValue();
            } else if (Intrinsics.areEqual(str2, "UNTIL")) {
                i++;
                this.until = n.parse((String) listSplit$default.get(i));
            }
            if (Intrinsics.areEqual(str2, "WKST")) {
                i++;
                this.wkst = a((String) listSplit$default.get(i));
            }
            i++;
        }
    }

    private final Weekday a(String dayString) {
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "SU", false, 2, (Object) null)) {
            return Weekday.Sunday;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "MO", false, 2, (Object) null)) {
            return Weekday.Monday;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "TU", false, 2, (Object) null)) {
            return Weekday.Tuesday;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "WE", false, 2, (Object) null)) {
            return Weekday.Wednesday;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "TH", false, 2, (Object) null)) {
            return Weekday.Thursday;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "FR", false, 2, (Object) null)) {
            return Weekday.Friday;
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) dayString, (CharSequence) "SA", false, 2, (Object) null)) {
            return Weekday.Saturday;
        }
        return null;
    }

    private final void b(List<Integer> integers, StringBuilder out) {
        int size = integers.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i != 0) {
                out.append(',');
            }
            out.append(integers.get(i).intValue());
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @NotNull
    public final ArrayList<WeekdayNum> getByDay() {
        return this.byDay;
    }

    @NotNull
    public final ArrayList<Integer> getByMonth() {
        return this.byMonth;
    }

    @NotNull
    public final ArrayList<Integer> getByMonthDay() {
        return this.byMonthDay;
    }

    @NotNull
    public final ArrayList<Integer> getBySetPos() {
        return this.bySetPos;
    }

    @NotNull
    public final ArrayList<Integer> getByWeekNo() {
        return this.byWeekNo;
    }

    @NotNull
    public final ArrayList<Integer> getByYearDay() {
        return this.byYearDay;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final Frequency getFreq() {
        return this.freq;
    }

    public final int getInterval() {
        return this.interval;
    }

    @Nullable
    public final Date getUntil() {
        return this.until;
    }

    @Nullable
    public final Weekday getWkst() {
        return this.wkst;
    }

    /* JADX INFO: renamed from: isNeverRepeat, reason: from getter */
    public final boolean getIsNeverRepeat() {
        return this.isNeverRepeat;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setFreq(@NotNull Frequency frequency) {
        this.freq = frequency;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final void setNeverRepeat(boolean z) {
        this.isNeverRepeat = z;
    }

    public final void setUntil(@Nullable Date date) {
        this.until = date;
    }

    public final void setWkst(@Nullable Weekday weekday) {
        this.wkst = weekday;
    }

    @NotNull
    public final String toRFC5545String() {
        if (this.isNeverRepeat) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FREQ=");
        sb.append(this.freq.toString());
        if (this.interval > 0) {
            sb.append(";INTERVAL=");
            sb.append(this.interval);
        }
        if (this.until != null) {
            sb.append(";UNTIL=");
            sb.append(n.format(this.until));
        }
        if (this.count > 0) {
            sb.append(";COUNT=");
            sb.append(this.count);
        }
        if (!this.byYearDay.isEmpty()) {
            sb.append(";BYYEARDAY=");
            b(this.byYearDay, sb);
        }
        if (!this.byMonth.isEmpty()) {
            sb.append(";BYMONTH=");
            b(this.byMonth, sb);
        }
        if (!this.byMonthDay.isEmpty()) {
            sb.append(";BYMONTHDAY=");
            b(this.byMonthDay, sb);
        }
        if (!this.byWeekNo.isEmpty()) {
            sb.append(";BYWEEKNO=");
            b(this.byWeekNo, sb);
        }
        if (!this.byDay.isEmpty()) {
            sb.append(";BYDAY=");
            boolean z = true;
            for (WeekdayNum weekdayNum : this.byDay) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                sb.append(weekdayNum.toICalString());
            }
        }
        if (!this.bySetPos.isEmpty()) {
            sb.append(";BYSETPOS=");
            b(this.bySetPos, sb);
        }
        if (this.wkst != null) {
            sb.append(";WKST=");
            Weekday weekday = this.wkst;
            sb.append(weekday == null ? null : weekday.getInitials());
        }
        return sb.toString();
    }

    public RRule(long j) {
        this.name = ICalendar.Property.RRULE;
        Frequency frequency = Frequency.Daily;
        this.freq = frequency;
        ArrayList<WeekdayNum> arrayList = new ArrayList<>();
        this.byDay = arrayList;
        this.byMonth = new ArrayList<>();
        this.byMonthDay = new ArrayList<>();
        this.byWeekNo = new ArrayList<>();
        this.byYearDay = new ArrayList<>();
        this.bySetPos = new ArrayList<>();
        if (j == 0) {
            this.isNeverRepeat = true;
            return;
        }
        if (j == RepeatMode.Fortnight.getFlag()) {
            this.freq = Frequency.Weekly;
            this.interval = 2;
            return;
        }
        if (j == RepeatMode.EveryMonth.getFlag()) {
            this.freq = Frequency.Monthly;
            this.interval = 1;
            return;
        }
        if (j == RepeatMode.EveryYear.getFlag()) {
            this.freq = Frequency.Yearly;
            this.interval = 1;
            return;
        }
        if (j == RepeatMode.EveryWeek.getFlag()) {
            this.freq = Frequency.Weekly;
            this.interval = 1;
            return;
        }
        this.freq = Frequency.Weekly;
        this.interval = 1;
        if ((((long) RepeatMode.Monday.getFlag()) & j) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Monday));
        }
        if ((((long) RepeatMode.Tuesday.getFlag()) & j) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Tuesday));
        }
        if ((((long) RepeatMode.Wednesday.getFlag()) & j) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Wednesday));
        }
        if ((((long) RepeatMode.Thursday.getFlag()) & j) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Thursday));
        }
        if ((((long) RepeatMode.Friday.getFlag()) & j) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Friday));
        }
        if ((((long) RepeatMode.Saturday.getFlag()) & j) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Saturday));
        }
        if ((j & ((long) RepeatMode.Sunday.getFlag())) != 0) {
            arrayList.add(new WeekdayNum(0, Weekday.Sunday));
        }
        if (arrayList.size() == 7) {
            this.freq = frequency;
            arrayList.clear();
        }
    }
}
