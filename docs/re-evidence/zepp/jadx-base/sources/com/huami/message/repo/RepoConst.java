package com.huami.message.repo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/huami/message/repo/RepoConst;", "", "", "COMMENT_LATEST_ID", "J", "AGREE_LATEST_ID", "COMMENT_HISTORY_ID", "AGREE_HISTORY_ID", "NOTICE_LATEST_ID", "NOTICE_HISTORY_ID", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class RepoConst {
    public static final long AGREE_HISTORY_ID = 4;
    public static final long AGREE_LATEST_ID = 2;
    public static final long COMMENT_HISTORY_ID = 3;
    public static final long COMMENT_LATEST_ID = 1;

    @NotNull
    public static final RepoConst INSTANCE = new RepoConst();
    public static final long NOTICE_HISTORY_ID = 6;
    public static final long NOTICE_LATEST_ID = 5;

    private RepoConst() {
    }
}
