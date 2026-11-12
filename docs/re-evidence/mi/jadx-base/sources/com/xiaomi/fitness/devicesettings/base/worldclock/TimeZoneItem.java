package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.zwh;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class TimeZoneItem implements Comparable<TimeZoneItem>, Parcelable {
    public static final Parcelable.Creator<TimeZoneItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11957b;
    public String c;
    public String d;
    public TimeZone e;
    public String f;
    public long g;
    public String h;
    public String i;

    public class a implements Parcelable.Creator<TimeZoneItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeZoneItem createFromParcel(Parcel parcel) {
            return new TimeZoneItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeZoneItem[] newArray(int i) {
            return new TimeZoneItem[i];
        }
    }

    public TimeZoneItem(String str, String str2, String str3, String str4, long j) {
        this(str2, str3, str4, j);
        this.f11956a = str;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(TimeZoneItem timeZoneItem) {
        l(this);
        l(timeZoneItem);
        if (timeZoneItem.i.equals(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
            return -1;
        }
        if (this.i.equals(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
            return 1;
        }
        return this.h.compareTo(timeZoneItem.h);
    }

    public String c() {
        return this.f11957b;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f11956a;
    }

    public String h(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String timeStrWithTimeZone = TimeDateUtil.getTimeStrWithTimeZone(jCurrentTimeMillis, TimeDateUtil.getDateMMDDFormatPattern(), DateTimeZone.forTimeZone(TimeZone.getTimeZone(i())));
        long offset = TimeZone.getDefault().getOffset(jCurrentTimeMillis);
        long offset2 = TimeZone.getTimeZone(i()).getOffset(jCurrentTimeMillis);
        if (offset == offset2) {
            return String.format("%s %s", timeStrWithTimeZone, context.getString(wzi.pa));
        }
        long j = ((long) ((int) (offset2 - offset))) / 3600000;
        int i = (int) j;
        return String.format(j > 0 ? "%s +%s" : "%s %s", timeStrWithTimeZone, context.getResources().getQuantityString(qyi.D, i, Integer.valueOf(i)));
    }

    public String i() {
        return this.c;
    }

    public String k() {
        return this.f;
    }

    public void l(TimeZoneItem timeZoneItem) {
        if (timeZoneItem.h == null) {
            timeZoneItem.h = zwh.d(timeZoneItem.f11957b);
            timeZoneItem.i = zwh.b(this.h);
        }
    }

    public String toString() {
        return "TimeZoneItem{name=" + this.f11957b + ", cityId =" + this.d + ", timezone=" + this.f + ", id=" + this.c + ", country=" + this.f11956a + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11956a);
        parcel.writeString(this.f11957b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    public TimeZoneItem(String str, String str2, String str3, long j) {
        this.f11956a = "";
        this.c = str2;
        this.f11957b = str;
        this.d = str3;
        TimeZone timeZone = TimeZone.getTimeZone(str2);
        this.e = timeZone;
        this.f = timeZone.getDisplayName(true, 0);
        this.g = this.e.getOffset(j);
    }

    public TimeZoneItem(Parcel parcel) {
        this.f11956a = "";
        this.f11956a = parcel.readString();
        this.f11957b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = (TimeZone) parcel.readSerializable();
        this.f = parcel.readString();
        this.g = parcel.readLong();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
}
