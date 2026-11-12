package com.huami.watch.musicupload.viewmodel;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.watch.musicupload.adapter.FileInfo;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 @2\u00020\u0001:\u0001@B5\u0012\u0006\u0010*\u001a\u00020%\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u0007\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u0010=\u001a\u000206¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0019\u0010*\u001a\u00020%8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010/\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00102\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019R\u0019\u00105\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/TransformTask;", "", "", "resetRetry", "", "toString", "other", "", "equals", "", "hashCode", "a", LogUtil.I, "getState", "()I", "setState", "(I)V", "state", "b", "getRetryTime", "setRetryTime", "retryTime", "c", "Z", "getNeedRetry", "()Z", "setNeedRetry", "(Z)V", "needRetry", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getAdditionTasks", "()Ljava/util/List;", "setAdditionTasks", "(Ljava/util/List;)V", "additionTasks", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "e", "Lcom/huami/watch/musicupload/adapter/FileInfo;", "getFileInfo", "()Lcom/huami/watch/musicupload/adapter/FileInfo;", "fileInfo", "f", "Ljava/lang/String;", "getToPath", "()Ljava/lang/String;", "toPath", "g", "getUpload", SnoreListFragment.TYPE_UPLOAD, "h", "getId", "id", "", "i", "J", "getTransfored", "()J", "setTransfored", "(J)V", "transfored", "<init>", "(Lcom/huami/watch/musicupload/adapter/FileInfo;Ljava/lang/String;ZLjava/lang/String;J)V", "Companion", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class TransformTask {
    public static final int STATE_CANCEL = 1;
    public static final int STATE_FAILED = 4;
    public static final int STATE_FINISH = 2;
    public static final int STATE_PENDING = 0;
    public static final int STATE_TRANSFER = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int retryTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean needRetry;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private List<TransformTask> additionTasks;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final FileInfo fileInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String toPath;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean upload;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long transfored;

    public TransformTask(@NotNull FileInfo fileInfo, @NotNull String str, boolean z, @NotNull String str2, long j) {
        this.fileInfo = fileInfo;
        this.toPath = str;
        this.upload = z;
        this.id = str2;
        this.transfored = j;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TransformTask.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(other, "null cannot be cast to non-null type com.huami.watch.musicupload.viewmodel.TransformTask");
        TransformTask transformTask = (TransformTask) other;
        return ((Intrinsics.areEqual(this.fileInfo, transformTask.fileInfo) ^ true) || (Intrinsics.areEqual(this.toPath, transformTask.toPath) ^ true)) ? false : true;
    }

    @Nullable
    public final List<TransformTask> getAdditionTasks() {
        return this.additionTasks;
    }

    @NotNull
    public final FileInfo getFileInfo() {
        return this.fileInfo;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getNeedRetry() {
        return this.needRetry;
    }

    public final int getRetryTime() {
        return this.retryTime;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getToPath() {
        return this.toPath;
    }

    public final long getTransfored() {
        return this.transfored;
    }

    public final boolean getUpload() {
        return this.upload;
    }

    public int hashCode() {
        return (this.fileInfo.hashCode() * 31) + this.toPath.hashCode();
    }

    public final void resetRetry() {
        this.retryTime = 0;
        this.needRetry = false;
    }

    public final void setAdditionTasks(@Nullable List<TransformTask> list) {
        this.additionTasks = list;
    }

    public final void setNeedRetry(boolean z) {
        this.needRetry = z;
    }

    public final void setRetryTime(int i) {
        this.retryTime = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTransfored(long j) {
        this.transfored = j;
    }

    @NotNull
    public String toString() {
        return "TransformTask(fileInfo=" + this.fileInfo + ", upload=" + this.upload + ", id='" + this.id + "', state: " + this.state + ')';
    }

    public /* synthetic */ TransformTask(FileInfo fileInfo, String str, boolean z, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileInfo, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? fileInfo.getPath() : str2, (i & 16) != 0 ? 0L : j);
    }
}
