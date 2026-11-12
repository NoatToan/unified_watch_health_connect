package com.huami.feedback.datasource;

import com.huami.feedback.entity.Issue;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/huami/feedback/datasource/IssueLocalDataSource;", "", "", "Lcom/huami/feedback/entity/Issue;", "issue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "issues", "", "saveIssue", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface IssueLocalDataSource {
    @Nullable
    Object issue(@NotNull Continuation<? super List<Issue>> continuation);

    void saveIssue(@NotNull List<Issue> issues);
}
