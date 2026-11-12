package com.huami.feedback.entity;

import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.xiaomi.hm.health.lab.webapi.HMUploadDeviceLogAPI;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/feedback/entity/UploadDeviceInfo;", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "component1", "Ljava/io/File;", "component2", "", "component3", "selectDevice", HMUploadDeviceLogAPI.a.b, "sourceList", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "getSelectDevice", "()Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "b", "Ljava/io/File;", "getLogFile", "()Ljava/io/File;", "c", "Ljava/lang/String;", "getSourceList", "()Ljava/lang/String;", "<init>", "(Lcom/huami/feedback/sync/api/device/FeedbackDevice;Ljava/io/File;Ljava/lang/String;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UploadDeviceInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final FeedbackDevice selectDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final File logFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sourceList;

    public UploadDeviceInfo(@Nullable FeedbackDevice feedbackDevice, @Nullable File file, @NotNull String str) {
        this.selectDevice = feedbackDevice;
        this.logFile = file;
        this.sourceList = str;
    }

    public static /* synthetic */ UploadDeviceInfo copy$default(UploadDeviceInfo uploadDeviceInfo, FeedbackDevice feedbackDevice, File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            feedbackDevice = uploadDeviceInfo.selectDevice;
        }
        if ((i & 2) != 0) {
            file = uploadDeviceInfo.logFile;
        }
        if ((i & 4) != 0) {
            str = uploadDeviceInfo.sourceList;
        }
        return uploadDeviceInfo.copy(feedbackDevice, file, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FeedbackDevice getSelectDevice() {
        return this.selectDevice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final File getLogFile() {
        return this.logFile;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceList() {
        return this.sourceList;
    }

    @NotNull
    public final UploadDeviceInfo copy(@Nullable FeedbackDevice selectDevice, @Nullable File logFile, @NotNull String sourceList) {
        return new UploadDeviceInfo(selectDevice, logFile, sourceList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadDeviceInfo)) {
            return false;
        }
        UploadDeviceInfo uploadDeviceInfo = (UploadDeviceInfo) other;
        return Intrinsics.areEqual(this.selectDevice, uploadDeviceInfo.selectDevice) && Intrinsics.areEqual(this.logFile, uploadDeviceInfo.logFile) && Intrinsics.areEqual(this.sourceList, uploadDeviceInfo.sourceList);
    }

    @Nullable
    public final File getLogFile() {
        return this.logFile;
    }

    @Nullable
    public final FeedbackDevice getSelectDevice() {
        return this.selectDevice;
    }

    @NotNull
    public final String getSourceList() {
        return this.sourceList;
    }

    public int hashCode() {
        FeedbackDevice feedbackDevice = this.selectDevice;
        int iHashCode = (feedbackDevice == null ? 0 : feedbackDevice.hashCode()) * 31;
        File file = this.logFile;
        return ((iHashCode + (file != null ? file.hashCode() : 0)) * 31) + this.sourceList.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadDeviceInfo(selectDevice=" + this.selectDevice + ", logFile=" + this.logFile + ", sourceList=" + this.sourceList + ')';
    }

    public /* synthetic */ UploadDeviceInfo(FeedbackDevice feedbackDevice, File file, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : feedbackDevice, (i & 2) != 0 ? null : file, str);
    }
}
