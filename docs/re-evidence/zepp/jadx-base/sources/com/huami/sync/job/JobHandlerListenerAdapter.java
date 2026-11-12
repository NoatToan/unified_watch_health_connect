package com.huami.sync.job;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sync.job.Job;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huami/sync/job/JobHandlerListenerAdapter;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/sync/job/JobHandlerListener;", "job", "", "onPrepare", "(Lcom/huami/sync/job/Job;)V", "onCancel", "onFinish", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public abstract class JobHandlerListenerAdapter<T extends Job<T>> implements JobHandlerListener<T> {
    @Override // com.huami.sync.job.JobHandlerListener
    public void onCancel(@NotNull T job) {
    }

    @Override // com.huami.sync.job.JobHandlerListener
    public void onFinish(@NotNull T job) {
    }

    @Override // com.huami.sync.job.JobHandlerListener
    public void onPrepare(@NotNull T job) {
    }
}
