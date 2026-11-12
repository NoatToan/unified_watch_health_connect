package com.xiaomi.hm.health.relation;

import com.huami.ecg.core.db.entity.EcgData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u00020\u00078F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/relation/ActionType;", "", "", "actionValue", "Ljava/lang/String;", "getActionValue", "()Ljava/lang/String;", "", "isAccept", "()Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Accept", "Refuse", "Ignore", "relatives_release"}, k = 1, mv = {1, 5, 1})
public enum ActionType {
    Accept("1"),
    Refuse("0"),
    Ignore(EcgData.DEFAULT_DIGIT_VALUE);


    @NotNull
    private final String actionValue;

    ActionType(String str) {
        this.actionValue = str;
    }

    @NotNull
    public final String getActionValue() {
        return this.actionValue;
    }

    public final boolean isAccept() {
        return this == Accept;
    }
}
