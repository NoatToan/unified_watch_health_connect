package com.xiaomi.hm.health.bt.profile.usernew;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/usernew/Birth;", "", "", "toString", "", "component1", "", "component2", "component3", "year", "month", "day", "copy", "", "hashCode", "other", "", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getYear", "()S", "b", "B", "getMonth", "()B", "c", "getDay", "<init>", "(SBB)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Birth {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final short year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final byte day;

    public Birth(short s, byte b, byte b2) {
        this.year = s;
        this.month = b;
        this.day = b2;
    }

    public static /* synthetic */ Birth copy$default(Birth birth, short s, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            s = birth.year;
        }
        if ((i & 2) != 0) {
            b = birth.month;
        }
        if ((i & 4) != 0) {
            b2 = birth.day;
        }
        return birth.copy(s, b, b2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte getDay() {
        return this.day;
    }

    @NotNull
    public final Birth copy(short year, byte month, byte day) {
        return new Birth(year, month, day);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Birth)) {
            return false;
        }
        Birth birth = (Birth) other;
        return this.year == birth.year && this.month == birth.month && this.day == birth.day;
    }

    public final byte getDay() {
        return this.day;
    }

    public final byte getMonth() {
        return this.month;
    }

    public final short getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((this.year * 31) + this.month) * 31) + this.day;
    }

    @NotNull
    public String toString() {
        return "Birth[year: " + ((int) this.year) + ", month: " + ((int) this.month) + ", day: " + ((int) this.day) + JsonLexerKt.END_LIST;
    }
}
