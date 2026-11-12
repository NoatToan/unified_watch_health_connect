package com.example.statistics.export;

import com.xiaomi.onetrack.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/example/statistics/export/OneTrackStatBean;", "", i.d, "", "tip", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "getTip", "setTip", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "statistics-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OneTrackStatBean {

    @NotNull
    private String eventName;

    @NotNull
    private String tip;

    public OneTrackStatBean(@NotNull String eventName, @NotNull String tip) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(tip, "tip");
        this.eventName = eventName;
        this.tip = tip;
    }

    public static /* synthetic */ OneTrackStatBean copy$default(OneTrackStatBean oneTrackStatBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTrackStatBean.eventName;
        }
        if ((i & 2) != 0) {
            str2 = oneTrackStatBean.tip;
        }
        return oneTrackStatBean.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    @NotNull
    public final OneTrackStatBean copy(@NotNull String eventName, @NotNull String tip) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(tip, "tip");
        return new OneTrackStatBean(eventName, tip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTrackStatBean)) {
            return false;
        }
        OneTrackStatBean oneTrackStatBean = (OneTrackStatBean) other;
        return Intrinsics.areEqual(this.eventName, oneTrackStatBean.eventName) && Intrinsics.areEqual(this.tip, oneTrackStatBean.tip);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.tip.hashCode();
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setTip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tip = str;
    }

    @NotNull
    public String toString() {
        return "OneTrackStatBean(eventName=" + this.eventName + ", tip=" + this.tip + ")";
    }
}
