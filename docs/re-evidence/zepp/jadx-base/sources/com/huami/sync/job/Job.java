package com.huami.sync.job;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sync.job.Job;
import com.twitter.sdk.android.tweetcomposer.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001a\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b-\u0010.J\u0014\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0000J\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0000J\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR.\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR*\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0012¨\u0006/"}, d2 = {"Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "tag", "Lcom/huami/sync/job/Priority;", "priority", g.g, "finish", "", "sequence", "other", "compareTo", "(Lcom/huami/sync/job/Job;)I", "<set-?>", "a", "Ljava/lang/Object;", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "", "b", "Z", "isCancel", "()Z", "setCancel", "(Z)V", "c", "isFinish", "setFinish", GoogleApiAvailabilityLight.a, LogUtil.I, "getSequence", "()I", "setSequence", "(I)V", "e", "Lcom/huami/sync/job/Priority;", "getPriority", "()Lcom/huami/sync/job/Priority;", "setPriority", "(Lcom/huami/sync/job/Priority;)V", "getRepeatFilterKey", "repeatFilterKey", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public abstract class Job<T extends Job<T>> implements Comparable<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Object tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isCancel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isFinish;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int sequence;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private Priority priority = Priority.NORMAL;

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Job<?> cancel() {
        this.isCancel = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Job<?> finish() {
        this.isFinish = true;
        return this;
    }

    @NotNull
    public final Priority getPriority() {
        return this.priority;
    }

    @Nullable
    public abstract Object getRepeatFilterKey();

    public final int getSequence() {
        return this.sequence;
    }

    @Nullable
    public final Object getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: isCancel, reason: from getter */
    public final boolean getIsCancel() {
        return this.isCancel;
    }

    /* JADX INFO: renamed from: isFinish, reason: from getter */
    public final boolean getIsFinish() {
        return this.isFinish;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Job<?> priority(@NotNull Priority priority) {
        this.priority = priority;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Job<?> sequence(int sequence) {
        this.sequence = sequence;
        return this;
    }

    public final void setCancel(boolean z) {
        this.isCancel = z;
    }

    public final void setFinish(boolean z) {
        this.isFinish = z;
    }

    public final void setPriority(@NotNull Priority priority) {
        this.priority = priority;
    }

    public final void setSequence(int i) {
        this.sequence = i;
    }

    public final void setTag(@Nullable Object obj) {
        this.tag = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Job<?> tag(@Nullable Object tag) {
        this.tag = tag;
        return this;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull T other) {
        Priority priority = this.priority;
        Priority priority2 = other.priority;
        return priority == priority2 ? this.sequence - other.sequence : priority2.ordinal() - priority.ordinal();
    }
}
