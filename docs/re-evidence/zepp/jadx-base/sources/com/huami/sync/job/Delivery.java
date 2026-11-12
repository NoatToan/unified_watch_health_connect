package com.huami.sync.job;

import androidx.exifinterface.media.ExifInterface;
import com.huami.sync.job.Job;
import com.twitter.sdk.android.tweetcomposer.g;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J+\u0010\t\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\f\u001a\u00020\b2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/sync/job/Delivery;", "Lcom/huami/sync/job/Job;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "Lcom/huami/sync/job/JobHandlerListener;", "listeners", "job", "", "prepare", "(Ljava/util/List;Lcom/huami/sync/job/Job;)V", g.g, "finish", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public interface Delivery<T extends Job<T>> {
    void cancel(@NotNull List<? extends JobHandlerListener<T>> listeners, @NotNull T job);

    void finish(@NotNull List<? extends JobHandlerListener<T>> listeners, @NotNull T job);

    void prepare(@NotNull List<? extends JobHandlerListener<T>> listeners, @NotNull T job);
}
