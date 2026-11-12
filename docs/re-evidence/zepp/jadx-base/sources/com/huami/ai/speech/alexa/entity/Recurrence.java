package com.huami.ai.speech.alexa.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\r\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/ai/speech/alexa/entity/Recurrence;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "()[Ljava/lang/String;", "component3", "freq", "byDay", "interval", "copy", "(Ljava/lang/String;[Ljava/lang/String;I)Lcom/huami/ai/speech/alexa/entity/Recurrence;", "toString", "a", "Ljava/lang/String;", "getFreq", "()Ljava/lang/String;", "b", "[Ljava/lang/String;", "getByDay", "c", LogUtil.I, "getInterval", "()I", "<init>", "(Ljava/lang/String;[Ljava/lang/String;I)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Recurrence {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("freq")
    @NotNull
    private final String freq;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("byDay")
    @NotNull
    private final String[] byDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("interval")
    private final int interval;

    public Recurrence(@NotNull String str, @NotNull String[] strArr, int i) {
        this.freq = str;
        this.byDay = strArr;
        this.interval = i;
    }

    public static /* synthetic */ Recurrence copy$default(Recurrence recurrence, String str, String[] strArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recurrence.freq;
        }
        if ((i2 & 2) != 0) {
            strArr = recurrence.byDay;
        }
        if ((i2 & 4) != 0) {
            i = recurrence.interval;
        }
        return recurrence.copy(str, strArr, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFreq() {
        return this.freq;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getByDay() {
        return this.byDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInterval() {
        return this.interval;
    }

    @NotNull
    public final Recurrence copy(@NotNull String freq, @NotNull String[] byDay, int interval) {
        return new Recurrence(freq, byDay, interval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Recurrence.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.ai.speech.alexa.entity.Recurrence");
        return Arrays.equals(this.byDay, ((Recurrence) other).byDay);
    }

    @NotNull
    public final String[] getByDay() {
        return this.byDay;
    }

    @NotNull
    public final String getFreq() {
        return this.freq;
    }

    public final int getInterval() {
        return this.interval;
    }

    public int hashCode() {
        return Arrays.hashCode(this.byDay);
    }

    @NotNull
    public String toString() {
        return "Recurrence(freq=" + this.freq + ", byDay=" + Arrays.toString(this.byDay) + ", interval=" + this.interval + ')';
    }
}
