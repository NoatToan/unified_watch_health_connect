package com.huami.sleep.service.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/service/bean/Stage;", "", "", "component1", "component2", "component3", "mode", "start", Command.STOP, "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMode", "()I", "b", "getStart", "c", "getStop", "<init>", "(III)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Stage {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("mode")
    private final int mode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("start")
    private final int start;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(Command.STOP)
    private final int stop;

    public Stage() {
        this(0, 0, 0, 7, null);
    }

    public Stage(int i, int i2, int i3) {
        this.mode = i;
        this.start = i2;
        this.stop = i3;
    }

    public static /* synthetic */ Stage copy$default(Stage stage, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = stage.mode;
        }
        if ((i4 & 2) != 0) {
            i2 = stage.start;
        }
        if ((i4 & 4) != 0) {
            i3 = stage.stop;
        }
        return stage.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStop() {
        return this.stop;
    }

    @NotNull
    public final Stage copy(int mode, int start, int stop) {
        return new Stage(mode, start, stop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stage)) {
            return false;
        }
        Stage stage = (Stage) other;
        return this.mode == stage.mode && this.start == stage.start && this.stop == stage.stop;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getStop() {
        return this.stop;
    }

    public int hashCode() {
        return (((this.mode * 31) + this.start) * 31) + this.stop;
    }

    @NotNull
    public String toString() {
        return "Stage(mode=" + this.mode + ", start=" + this.start + ", stop=" + this.stop + ")";
    }

    public /* synthetic */ Stage(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
