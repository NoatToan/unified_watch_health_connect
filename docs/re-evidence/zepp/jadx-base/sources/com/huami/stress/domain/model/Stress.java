package com.huami.stress.domain.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import defpackage.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/stress/domain/model/Stress;", "", "", "component1", "", "component2", "value", "time", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getValue", "()I", "b", "J", "getTime", "()J", "c", "Ljava/lang/String;", "getDateStr", "()Ljava/lang/String;", "setDateStr", "(Ljava/lang/String;)V", "dateStr", "<init>", "(IJ)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Stress {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("value")
    private final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("time")
    private final long time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String dateStr;

    public Stress(int i, long j) {
        this.value = i;
        this.time = j;
        this.dateStr = new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.getDefault()).format(new Date(j));
    }

    public static /* synthetic */ Stress copy$default(Stress stress, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stress.value;
        }
        if ((i2 & 2) != 0) {
            j = stress.time;
        }
        return stress.copy(i, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final Stress copy(int value, long time) {
        return new Stress(value, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stress)) {
            return false;
        }
        Stress stress = (Stress) other;
        return this.value == stress.value && this.time == stress.time;
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value * 31) + b.a(this.time);
    }

    public final void setDateStr(@NotNull String str) {
        this.dateStr = str;
    }

    @NotNull
    public String toString() {
        return "Stress(value=" + this.value + ", time=" + this.time + ')';
    }
}
