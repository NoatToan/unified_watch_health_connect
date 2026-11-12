package com.xiaomi.fitness.trail.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.viewbinding.LazyViewBindingProperty;
import com.xiaomi.fitness.common.viewbinding.ViewBindingProperty;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.dki;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.jpp;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000289B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010$\u001a\u00020\u000bH\u0002J\u0006\u0010%\u001a\u00020\u0005J\u0006\u0010&\u001a\u00020\u0005J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u0017H\u0007J\u0006\u0010*\u001a\u00020\u0017J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0017H\u0016J\u0018\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0017H\u0016J\u000e\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0017J\u0010\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Holder;", "Landroid/view/View$OnClickListener;", "indicatorStart", "", "timeDim", "", "onItemClick", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Indicator;", "", "<init>", "(JLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getTimeDim", "()Ljava/lang/String;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "count", "", "calendar", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "nowMills", "indicatorEnd", "checkedEndMills", "checkedStartMills", "firstWeekStart", "firstMonthStart", "firstYearStart", "selectedColor", "unselectedColor", "setData", "getStart", "getEnd", "selectedPos", "setSelectedPos", "value", "getSelectedPos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getValue", "pos", "onClick", "v", "Landroid/view/View;", "getItemCount", "Holder", "Indicator", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorAdapter extends RecyclerView.Adapter<Holder> implements View.OnClickListener {
    private final Calendar calendar;
    private long checkedEndMills;
    private long checkedStartMills;
    private int count;
    private final long firstMonthStart;
    private final long firstWeekStart;
    private final long firstYearStart;
    private long indicatorEnd;
    private final long indicatorStart;
    private final LayoutInflater inflater;
    private final long nowMills;

    @NotNull
    private final Function1<Indicator, Unit> onItemClick;
    private final int selectedColor;
    private int selectedPos;

    @NotNull
    private final String timeDim;
    private final int unselectedColor;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Ljpp;", "kotlin.jvm.PlatformType", "binding$delegate", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "getBinding", "()Ljpp;", "binding", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRecordIndicatorAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordIndicatorAdapter.kt\ncom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Holder\n+ 2 ViewHolderBindings.kt\ncom/xiaomi/fitness/common/viewbinding/ViewHolderBindings\n*L\n1#1,156:1\n24#2,5:157\n*S KotlinDebug\n*F\n+ 1 RecordIndicatorAdapter.kt\ncom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Holder\n*L\n151#1:157,5\n*E\n"})
    public static final class Holder extends RecyclerView.d0 {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Holder.class, "binding", "getBinding()Lcom/xiaomi/fitness/trail/databinding/TrailIndicatorItemBinding;", 0))};

        /* JADX INFO: renamed from: binding$delegate, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty binding;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.binding = new LazyViewBindingProperty(new Function1<Holder, jpp>() { // from class: com.xiaomi.fitness.trail.adapter.IndicatorAdapter$Holder$special$$inlined$viewBinding$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final jpp invoke2(IndicatorAdapter.Holder viewHolder) {
                    Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                    return jpp.A0(viewHolder.itemView);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final jpp getBinding() {
            return (jpp) this.binding.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/IndicatorAdapter$Indicator;", "", "pos", "", "show", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "year", "<init>", "(ILjava/lang/String;JJLjava/lang/String;)V", "getPos", "()I", "getShow", "()Ljava/lang/String;", "getStart", "()J", "getEnd", "getYear", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Indicator {
        private final long end;
        private final int pos;

        @NotNull
        private final String show;
        private final long start;

        @NotNull
        private final String year;

        public Indicator(int i, @NotNull String show, long j, long j2, @NotNull String year) {
            Intrinsics.checkNotNullParameter(show, "show");
            Intrinsics.checkNotNullParameter(year, "year");
            this.pos = i;
            this.show = show;
            this.start = j;
            this.end = j2;
            this.year = year;
        }

        public static /* synthetic */ Indicator copy$default(Indicator indicator, int i, String str, long j, long j2, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = indicator.pos;
            }
            if ((i2 & 2) != 0) {
                str = indicator.show;
            }
            String str3 = str;
            if ((i2 & 4) != 0) {
                j = indicator.start;
            }
            long j3 = j;
            if ((i2 & 8) != 0) {
                j2 = indicator.end;
            }
            long j4 = j2;
            if ((i2 & 16) != 0) {
                str2 = indicator.year;
            }
            return indicator.copy(i, str3, j3, j4, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPos() {
            return this.pos;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getShow() {
            return this.show;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getYear() {
            return this.year;
        }

        @NotNull
        public final Indicator copy(int pos, @NotNull String show, long start, long end, @NotNull String year) {
            Intrinsics.checkNotNullParameter(show, "show");
            Intrinsics.checkNotNullParameter(year, "year");
            return new Indicator(pos, show, start, end, year);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) other;
            return this.pos == indicator.pos && Intrinsics.areEqual(this.show, indicator.show) && this.start == indicator.start && this.end == indicator.end && Intrinsics.areEqual(this.year, indicator.year);
        }

        public final long getEnd() {
            return this.end;
        }

        public final int getPos() {
            return this.pos;
        }

        @NotNull
        public final String getShow() {
            return this.show;
        }

        public final long getStart() {
            return this.start;
        }

        @NotNull
        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.pos) * 31) + this.show.hashCode()) * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end)) * 31) + this.year.hashCode();
        }

        @NotNull
        public String toString() {
            return "Indicator(pos=" + this.pos + ", show=" + this.show + ", start=" + this.start + ", end=" + this.end + ", year=" + this.year + ")";
        }

        public /* synthetic */ Indicator(int i, String str, long j, long j2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, j, j2, (i2 & 16) != 0 ? "" : str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndicatorAdapter(long j, @NotNull String timeDim, @NotNull Function1<? super Indicator, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(timeDim, "timeDim");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.indicatorStart = j;
        this.timeDim = timeDim;
        this.onItemClick = onItemClick;
        this.inflater = LayoutInflater.from(ApplicationExtKt.getApplication());
        this.calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.nowMills = jCurrentTimeMillis;
        this.indicatorEnd = jCurrentTimeMillis;
        this.checkedEndMills = jCurrentTimeMillis;
        this.checkedStartMills = jCurrentTimeMillis;
        TimeDateUtil timeDateUtil = TimeDateUtil.INSTANCE;
        this.firstWeekStart = timeDateUtil.atStartOfWeek(jCurrentTimeMillis);
        this.firstMonthStart = timeDateUtil.atStartOfMonth(this.indicatorEnd);
        this.firstYearStart = timeDateUtil.atStartOfYear(this.indicatorEnd);
        this.selectedColor = ExtUtilsKt.getColor(dki.Z0);
        this.unselectedColor = ExtUtilsKt.getColor(dki.a1);
        setData();
        this.selectedPos = this.count - 1;
    }

    private final void setData() {
        int iWeeksBetween;
        int i;
        String str = this.timeDim;
        int iHashCode = str.hashCode();
        if (iHashCode != -734561654) {
            if (iHashCode != 110549828) {
                if (iHashCode == 1236635661 && str.equals(SportDataTypeKt.DIMEN_MONTHLY)) {
                    iWeeksBetween = TimeDateUtil.INSTANCE.monthsBetween(this.indicatorStart, this.indicatorEnd);
                }
                i = iWeeksBetween + 1;
            } else if (str.equals(SportDataTypeKt.DIMEN_TOTAL)) {
                i = 1;
            }
            i = iWeeksBetween + 1;
        } else {
            iWeeksBetween = !str.equals(SportDataTypeKt.DIMEN_YEARLY) ? TimeDateUtil.INSTANCE.weeksBetween(this.indicatorStart, this.indicatorEnd) : TimeDateUtil.INSTANCE.yearsBetween(this.indicatorStart, this.indicatorEnd);
            i = iWeeksBetween + 1;
        }
        this.count = i;
        this.selectedPos = i - 1;
    }

    /* JADX INFO: renamed from: getEnd, reason: from getter */
    public final long getCheckedEndMills() {
        return this.checkedEndMills;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount, reason: from getter */
    public int getCount() {
        return this.count;
    }

    @NotNull
    public final Function1<Indicator, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final int getSelectedPos() {
        return this.selectedPos;
    }

    public final long getStart() {
        if (Intrinsics.areEqual(this.timeDim, SportDataTypeKt.DIMEN_TOTAL)) {
            return 0L;
        }
        return this.checkedStartMills;
    }

    @NotNull
    public final String getTimeDim() {
        return this.timeDim;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    @NotNull
    public final Indicator getValue(int pos) {
        Indicator indicator;
        int i;
        boolean z;
        int i2;
        String strValueOf;
        String str = this.timeDim;
        int iHashCode = str.hashCode();
        if (iHashCode == -734561654) {
            if (str.equals(SportDataTypeKt.DIMEN_YEARLY)) {
                this.calendar.setTimeInMillis(this.firstYearStart);
                this.calendar.add(1, (-this.count) + pos + 1);
                long timeInMillis = this.calendar.getTimeInMillis();
                indicator = new Indicator(pos, TimeDateUtil.getDateYYYYFormat(timeInMillis), timeInMillis, TimeDateUtil.INSTANCE.atEndOfYear(timeInMillis), null, 16, null);
                return indicator;
            }
            long j = this.firstWeekStart - (((long) ((this.count - pos) - 1)) * 604800000);
            this.calendar.setTimeInMillis(j);
            i = this.calendar.get(1);
            if (this.calendar.get(6) == 1) {
                z = true;
            } else {
                z = false;
            }
            long j2 = 604800000 + j;
            long j3 = 604799999 + j;
            this.calendar.setTimeInMillis(j3);
            i2 = this.calendar.get(1);
            String string = ResourceExtKt.getString(j1j.h, TimeDateUtil.getDateMMddNumberFormat(j), TimeDateUtil.getDateMMddNumberFormat(j3));
            if (i == i2) {
                strValueOf = String.valueOf(i2);
            } else {
                strValueOf = String.valueOf(i2);
            }
            return new Indicator(pos, string, j, j2, strValueOf);
        }
        if (iHashCode != 110549828) {
            if (iHashCode == 1236635661 && str.equals(SportDataTypeKt.DIMEN_MONTHLY)) {
                this.calendar.setTimeInMillis(this.firstMonthStart);
                this.calendar.add(2, (-this.count) + pos + 1);
                long timeInMillis2 = this.calendar.getTimeInMillis();
                return new Indicator(pos, TimeDateUtil.getDateMMSimpleFormat(timeInMillis2), timeInMillis2, TimeDateUtil.INSTANCE.atEndOfMonth(timeInMillis2), this.calendar.get(2) == 0 ? String.valueOf(this.calendar.get(1)) : "");
            }
        } else if (str.equals(SportDataTypeKt.DIMEN_TOTAL)) {
            indicator = new Indicator(pos, ResourceExtKt.getString(j1j.i, TimeDateUtil.getDateYYYYMMdd(this.indicatorStart, "YYYY/mm/dd")), this.indicatorStart, this.indicatorEnd, null, 16, null);
            return indicator;
        }
        long j4 = this.firstWeekStart - (((long) ((this.count - pos) - 1)) * 604800000);
        this.calendar.setTimeInMillis(j4);
        i = this.calendar.get(1);
        if (this.calendar.get(6) == 1) {
            z = true;
        } else {
            z = false;
        }
        long j5 = 604800000 + j4;
        long j6 = 604799999 + j4;
        this.calendar.setTimeInMillis(j6);
        i2 = this.calendar.get(1);
        String string2 = ResourceExtKt.getString(j1j.h, TimeDateUtil.getDateMMddNumberFormat(j4), TimeDateUtil.getDateMMddNumberFormat(j6));
        if (i == i2 || z) {
            strValueOf = String.valueOf(i2);
        } else {
            strValueOf = "";
        }
        return new Indicator(pos, string2, j4, j5, strValueOf);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Object tag = v.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.trail.adapter.IndicatorAdapter.Indicator");
        Indicator indicator = (Indicator) tag;
        if (indicator.getPos() == this.selectedPos) {
            return;
        }
        setSelectedPos(indicator.getPos());
        this.onItemClick.invoke2(indicator);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setSelectedPos(int value) {
        Indicator value2 = getValue(value);
        this.checkedStartMills = value2.getStart();
        this.checkedEndMills = value2.getEnd();
        this.selectedPos = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        String show;
        String show2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Indicator value = getValue(position);
        holder.getBinding().A.setText(value.getShow());
        holder.getBinding().B.setText(value.getYear());
        holder.getBinding().A.setTextColor(position == this.selectedPos ? this.selectedColor : this.unselectedColor);
        holder.getBinding().B.setTextColor(position == this.selectedPos ? this.selectedColor : this.unselectedColor);
        holder.getView().setTag(value);
        if (position != this.selectedPos) {
            if (Intrinsics.areEqual(value.getYear(), "")) {
                show = value.getShow();
            } else {
                show = value.getYear() + ResourceExtKt.getString(j1j.common_year) + ", " + value.getShow();
            }
            holder.getView().setContentDescription(AppUtil.getApp().getString(j1j.y, show));
            return;
        }
        this.checkedStartMills = value.getStart();
        this.checkedEndMills = value.getEnd();
        if (Intrinsics.areEqual(value.getYear(), "")) {
            show2 = value.getShow();
        } else {
            show2 = value.getYear() + ResourceExtKt.getString(j1j.common_year) + ", " + value.getShow();
        }
        holder.getView().setContentDescription(AppUtil.getApp().getString(j1j.x, show2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = this.inflater.inflate(ivi.X1, parent, false);
        viewInflate.setOnClickListener(this);
        Intrinsics.checkNotNull(viewInflate);
        return new Holder(viewInflate);
    }
}
