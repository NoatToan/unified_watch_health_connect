package com.huami.sleep.daysleep.sleepstagechart.vo;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0007HÆ\u0003J4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectTip;", "", "other", "", "equals", "", "hashCode", "", "component1", "", "component2", "()[Ljava/lang/String;", "component3", "title", "value", "timeDur", "copy", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectTip;", "toString", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "[Ljava/lang/String;", "getValue", "c", "getTimeDur", "<init>", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SelectTip {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String[] value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String timeDur;

    public SelectTip(@NotNull String str, @NotNull String[] strArr, @NotNull String str2) {
        this.title = str;
        this.value = strArr;
        this.timeDur = str2;
    }

    public static /* synthetic */ SelectTip copy$default(SelectTip selectTip, String str, String[] strArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectTip.title;
        }
        if ((i & 2) != 0) {
            strArr = selectTip.value;
        }
        if ((i & 4) != 0) {
            str2 = selectTip.timeDur;
        }
        return selectTip.copy(str, strArr, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[] getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeDur() {
        return this.timeDur;
    }

    @NotNull
    public final SelectTip copy(@NotNull String title, @NotNull String[] value, @NotNull String timeDur) {
        return new SelectTip(title, value, timeDur);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SelectTip.class, other == null ? null : other.getClass())) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.sleep.daysleep.sleepstagechart.vo.SelectTip");
        SelectTip selectTip = (SelectTip) other;
        return Intrinsics.areEqual(this.title, selectTip.title) && Arrays.equals(this.value, selectTip.value) && Intrinsics.areEqual(this.timeDur, selectTip.timeDur);
    }

    @NotNull
    public final String getTimeDur() {
        return this.timeDur;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Arrays.hashCode(this.value)) * 31) + this.timeDur.hashCode();
    }

    @NotNull
    public String toString() {
        return "SelectTip(title=" + this.title + ", value=" + Arrays.toString(this.value) + ", timeDur=" + this.timeDur + ")";
    }
}
