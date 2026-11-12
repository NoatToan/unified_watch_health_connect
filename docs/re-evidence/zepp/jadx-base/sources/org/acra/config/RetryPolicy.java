package org.acra.config;

import androidx.annotation.NonNull;
import java.util.List;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderException;

/* JADX INFO: loaded from: classes23.dex */
public interface RetryPolicy {

    public static class FailedSender {
        private final ReportSender a;
        private final ReportSenderException b;

        public FailedSender(@NonNull ReportSender reportSender, @NonNull ReportSenderException reportSenderException) {
            this.a = reportSender;
            this.b = reportSenderException;
        }

        @NonNull
        public ReportSenderException getException() {
            return this.b;
        }

        @NonNull
        public ReportSender getSender() {
            return this.a;
        }
    }

    boolean shouldRetrySend(@NonNull List<ReportSender> list, @NonNull List<FailedSender> list2);
}
