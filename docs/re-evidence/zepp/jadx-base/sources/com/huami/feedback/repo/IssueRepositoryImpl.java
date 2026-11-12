package com.huami.feedback.repo;

import com.huami.feedback.datasource.IssueDataSource;
import com.huami.feedback.entity.Issue;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/feedback/repo/IssueRepositoryImpl;", "Lcom/huami/feedback/repo/IssueRepository;", "", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "devices", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/feedback/entity/Issue;", "getIssues", "Lcom/huami/feedback/datasource/IssueDataSource;", "a", "Lcom/huami/feedback/datasource/IssueDataSource;", "issueDataSource", "<init>", "(Lcom/huami/feedback/datasource/IssueDataSource;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class IssueRepositoryImpl implements IssueRepository {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IssueDataSource issueDataSource;

    public IssueRepositoryImpl(@NotNull IssueDataSource issueDataSource) {
        this.issueDataSource = issueDataSource;
    }

    @Override // com.huami.feedback.repo.IssueRepository
    @NotNull
    public Flow<List<Issue>> getIssues(@NotNull List<FeedbackDevice> devices) {
        return this.issueDataSource.issue();
    }
}
