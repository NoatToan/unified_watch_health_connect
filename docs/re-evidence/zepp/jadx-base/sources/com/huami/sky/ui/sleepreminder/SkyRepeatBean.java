package com.huami.sky.ui.sleepreminder;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/SkyRepeatBean;", "", "", "component1", "", "component2", "weekDay", "isChecked", "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getWeekDay", "()Ljava/lang/String;", "b", "Z", "()Z", "setChecked", "(Z)V", "<init>", "(Ljava/lang/String;Z)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SkyRepeatBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String weekDay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isChecked;

    public SkyRepeatBean(@NotNull String str, boolean z) {
        this.weekDay = str;
        this.isChecked = z;
    }

    public static /* synthetic */ SkyRepeatBean copy$default(SkyRepeatBean skyRepeatBean, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skyRepeatBean.weekDay;
        }
        if ((i & 2) != 0) {
            z = skyRepeatBean.isChecked;
        }
        return skyRepeatBean.copy(str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWeekDay() {
        return this.weekDay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final SkyRepeatBean copy(@NotNull String weekDay, boolean isChecked) {
        return new SkyRepeatBean(weekDay, isChecked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkyRepeatBean)) {
            return false;
        }
        SkyRepeatBean skyRepeatBean = (SkyRepeatBean) other;
        return Intrinsics.areEqual(this.weekDay, skyRepeatBean.weekDay) && this.isChecked == skyRepeatBean.isChecked;
    }

    @NotNull
    public final String getWeekDay() {
        return this.weekDay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.weekDay.hashCode() * 31;
        boolean z = this.isChecked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    @NotNull
    public String toString() {
        return "SkyRepeatBean(weekDay=" + this.weekDay + ", isChecked=" + this.isChecked + ")";
    }
}
