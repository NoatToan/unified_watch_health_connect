package com.huami.health.afppg.service.event;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/health/afppg/service/event/AFibEventDay;", "", "", "component1", "", "Lcom/huami/health/afppg/service/event/AFib;", "component2", "duration", "atrialFibrillationList", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getDuration", "()I", "setDuration", "(I)V", "Ljava/util/List;", "getAtrialFibrillationList", "()Ljava/util/List;", "setAtrialFibrillationList", "(Ljava/util/List;)V", "<init>", "(ILjava/util/List;)V", "afppg-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class AFibEventDay {

    @NotNull
    private List<AFib> atrialFibrillationList;
    private int duration;

    /* JADX WARN: Multi-variable type inference failed */
    public AFibEventDay() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public AFibEventDay(int i, @NotNull List<AFib> list) {
        this.duration = i;
        this.atrialFibrillationList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AFibEventDay copy$default(AFibEventDay aFibEventDay, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aFibEventDay.duration;
        }
        if ((i2 & 2) != 0) {
            list = aFibEventDay.atrialFibrillationList;
        }
        return aFibEventDay.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<AFib> component2() {
        return this.atrialFibrillationList;
    }

    @NotNull
    public final AFibEventDay copy(int duration, @NotNull List<AFib> atrialFibrillationList) {
        return new AFibEventDay(duration, atrialFibrillationList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFibEventDay)) {
            return false;
        }
        AFibEventDay aFibEventDay = (AFibEventDay) other;
        return this.duration == aFibEventDay.duration && Intrinsics.areEqual(this.atrialFibrillationList, aFibEventDay.atrialFibrillationList);
    }

    @NotNull
    public final List<AFib> getAtrialFibrillationList() {
        return this.atrialFibrillationList;
    }

    public final int getDuration() {
        return this.duration;
    }

    public int hashCode() {
        int i = this.duration * 31;
        List<AFib> list = this.atrialFibrillationList;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final void setAtrialFibrillationList(@NotNull List<AFib> list) {
        this.atrialFibrillationList = list;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    @NotNull
    public String toString() {
        return "AFibEventDay(duration=" + this.duration + ", atrialFibrillationList=" + this.atrialFibrillationList + ")";
    }

    public /* synthetic */ AFibEventDay(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
