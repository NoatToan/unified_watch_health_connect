package org.acra.config;

import androidx.annotation.NonNull;
import java.util.List;
import org.acra.sender.ReportSender;

/* JADX INFO: loaded from: classes23.dex */
public class DefaultRetryPolicy implements RetryPolicy {
    @Override // org.acra.config.RetryPolicy
    public boolean shouldRetrySend(@NonNull List<ReportSender> list, @NonNull List<RetryPolicy.FailedSender> list2) {
        return list.size() == list2.size() && !list.isEmpty();
    }
}
