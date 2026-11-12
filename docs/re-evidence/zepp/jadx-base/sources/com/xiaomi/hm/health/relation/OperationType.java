package com.xiaomi.hm.health.relation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/relation/OperationType;", "", "", "Accept", "Ljava/lang/String;", "Reject", "Black", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
public final class OperationType {

    @NotNull
    public static final String Accept = "follow_accept";

    @NotNull
    public static final String Black = "black";

    @NotNull
    public static final OperationType INSTANCE = new OperationType();

    @NotNull
    public static final String Reject = "follow_reject";

    private OperationType() {
    }
}
