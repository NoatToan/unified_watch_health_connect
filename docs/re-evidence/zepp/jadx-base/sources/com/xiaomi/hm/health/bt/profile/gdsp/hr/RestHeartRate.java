package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.mifit.sportlib.common.Constants;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/RestHeartRate;", "Ljava/io/Serializable;", "Ljava/util/Calendar;", "component1", "", "component2", "calendar", Constants.DATA_KEY_HR, "copy", "", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "b", LogUtil.I, "getHr", "()I", "<init>", "(Ljava/util/Calendar;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RestHeartRate implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar calendar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int hr;

    public RestHeartRate(@NotNull Calendar calendar, int i) {
        this.calendar = calendar;
        this.hr = i;
    }

    public static /* synthetic */ RestHeartRate copy$default(RestHeartRate restHeartRate, Calendar calendar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            calendar = restHeartRate.calendar;
        }
        if ((i2 & 2) != 0) {
            i = restHeartRate.hr;
        }
        return restHeartRate.copy(calendar, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getCalendar() {
        return this.calendar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHr() {
        return this.hr;
    }

    @NotNull
    public final RestHeartRate copy(@NotNull Calendar calendar, int hr) {
        return new RestHeartRate(calendar, hr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestHeartRate)) {
            return false;
        }
        RestHeartRate restHeartRate = (RestHeartRate) other;
        return Intrinsics.areEqual(this.calendar, restHeartRate.calendar) && this.hr == restHeartRate.hr;
    }

    @NotNull
    public final Calendar getCalendar() {
        return this.calendar;
    }

    public final int getHr() {
        return this.hr;
    }

    public int hashCode() {
        return (this.calendar.hashCode() * 31) + this.hr;
    }

    @NotNull
    public String toString() {
        return "RestHeartRate(calendar=" + this.calendar + ", hr=" + this.hr + ')';
    }
}
