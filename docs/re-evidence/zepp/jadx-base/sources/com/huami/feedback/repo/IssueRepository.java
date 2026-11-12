package com.huami.feedback.repo;

import com.huami.feedback.entity.Issue;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/feedback/repo/IssueRepository;", "", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "devices", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/entity/Issue;", "getIssues", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface IssueRepository {
    @NotNull
    Flow<List<Issue>> getIssues(@NotNull List<FeedbackDevice> devices);
}
