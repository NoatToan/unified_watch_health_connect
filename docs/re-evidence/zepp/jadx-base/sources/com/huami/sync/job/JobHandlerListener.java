package com.huami.sync.job;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sync.job.Job;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/sync/job/JobHandlerListener;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "job", "", "onPrepare", "(Lcom/huami/sync/job/Job;)V", "onCancel", "onFinish", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public interface JobHandlerListener<T extends Job<T>> {
    void onCancel(@NotNull T job);

    void onFinish(@NotNull T job);

    void onPrepare(@NotNull T job);
}
