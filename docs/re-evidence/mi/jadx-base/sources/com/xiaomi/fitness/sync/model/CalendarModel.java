package com.xiaomi.fitness.sync.model;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/sync/model/CalendarModel;", "", "<init>", "()V", "CalendarEvent", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalendarModel {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sync/model/CalendarModel$CalendarEvent;", "", "title", "", "description", "location", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "allday", "", "reminderMinutes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJII)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLocation", "getStart", "()J", "getEnd", "getAllday", "()I", "getReminderMinutes", "compareTo", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CalendarEvent implements Comparable<CalendarEvent> {
        private final int allday;

        @Nullable
        private final String description;
        private final long end;

        @Nullable
        private final String location;
        private final int reminderMinutes;
        private final long start;

        @Nullable
        private final String title;

        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, int i, int i2) {
            this.title = str;
            this.description = str2;
            this.location = str3;
            this.start = j;
            this.end = j2;
            this.allday = i;
            this.reminderMinutes = i2;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getAllday() {
            return this.allday;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getReminderMinutes() {
            return this.reminderMinutes;
        }

        @NotNull
        public final CalendarEvent copy(@Nullable String title, @Nullable String description, @Nullable String location, long start, long end, int allday, int reminderMinutes) {
            return new CalendarEvent(title, description, location, start, end, allday, reminderMinutes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CalendarEvent)) {
                return false;
            }
            CalendarEvent calendarEvent = (CalendarEvent) other;
            return Intrinsics.areEqual(this.title, calendarEvent.title) && Intrinsics.areEqual(this.description, calendarEvent.description) && Intrinsics.areEqual(this.location, calendarEvent.location) && this.start == calendarEvent.start && this.end == calendarEvent.end && this.allday == calendarEvent.allday && this.reminderMinutes == calendarEvent.reminderMinutes;
        }

        public final int getAllday() {
            return this.allday;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        public final long getEnd() {
            return this.end;
        }

        @Nullable
        public final String getLocation() {
            return this.location;
        }

        public final int getReminderMinutes() {
            return this.reminderMinutes;
        }

        public final long getStart() {
            return this.start;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.location;
            return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.start)) * 31) + Long.hashCode(this.end)) * 31) + Integer.hashCode(this.allday)) * 31) + Integer.hashCode(this.reminderMinutes);
        }

        @NotNull
        public String toString() {
            return "CalendarEvent(title=" + this.title + ", description=" + this.description + ", location=" + this.location + ", start=" + this.start + ", end=" + this.end + ", allday=" + this.allday + ", reminderMinutes=" + this.reminderMinutes + ")";
        }

        public /* synthetic */ CalendarEvent(String str, String str2, String str3, long j, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, j, j2, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2);
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull CalendarEvent o) {
            Intrinsics.checkNotNullParameter(o, "o");
            return Intrinsics.compare(this.start, o.start);
        }
    }
}
