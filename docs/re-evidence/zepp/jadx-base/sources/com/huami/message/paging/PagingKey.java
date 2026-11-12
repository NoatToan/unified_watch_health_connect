package com.huami.message.paging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/huami/message/paging/PagingKey;", "", "", PagingKey.MESSAGE_CENTER_LIST, "Ljava/lang/String;", "MESSAGE_CENTER_LIST_PREFIX", PagingKey.NOTIFICATION_LIST, "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class PagingKey {

    @NotNull
    public static final PagingKey INSTANCE = new PagingKey();

    @NotNull
    public static final String MESSAGE_CENTER_LIST = "MESSAGE_CENTER_LIST";

    @NotNull
    public static final String MESSAGE_CENTER_LIST_PREFIX = "MESSAGE_SUB_LIST_PREFIX_";

    @NotNull
    public static final String NOTIFICATION_LIST = "NOTIFICATION_LIST";

    private PagingKey() {
    }
}
