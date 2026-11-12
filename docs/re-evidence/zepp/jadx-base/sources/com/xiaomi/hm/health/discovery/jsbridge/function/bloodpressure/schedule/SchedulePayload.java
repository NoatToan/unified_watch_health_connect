package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.schedule;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/schedule/SchedulePayload;", "", "", "component1", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/schedule/ScheduleBean;", "Lkotlin/collections/ArrayList;", "component2", "device", "scheduleList", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getDevice", "()I", "b", "Ljava/util/ArrayList;", "getScheduleList", "()Ljava/util/ArrayList;", "<init>", "(ILjava/util/ArrayList;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SchedulePayload {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("device")
    private final int device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("scheduleList")
    @NotNull
    private final ArrayList<ScheduleBean> scheduleList;

    public SchedulePayload(int i, @NotNull ArrayList<ScheduleBean> arrayList) {
        this.device = i;
        this.scheduleList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulePayload copy$default(SchedulePayload schedulePayload, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = schedulePayload.device;
        }
        if ((i2 & 2) != 0) {
            arrayList = schedulePayload.scheduleList;
        }
        return schedulePayload.copy(i, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDevice() {
        return this.device;
    }

    @NotNull
    public final ArrayList<ScheduleBean> component2() {
        return this.scheduleList;
    }

    @NotNull
    public final SchedulePayload copy(int device, @NotNull ArrayList<ScheduleBean> scheduleList) {
        return new SchedulePayload(device, scheduleList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulePayload)) {
            return false;
        }
        SchedulePayload schedulePayload = (SchedulePayload) other;
        return this.device == schedulePayload.device && Intrinsics.areEqual(this.scheduleList, schedulePayload.scheduleList);
    }

    public final int getDevice() {
        return this.device;
    }

    @NotNull
    public final ArrayList<ScheduleBean> getScheduleList() {
        return this.scheduleList;
    }

    public int hashCode() {
        return (this.device * 31) + this.scheduleList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SchedulePayload(device=" + this.device + ", scheduleList=" + this.scheduleList + ")";
    }
}
