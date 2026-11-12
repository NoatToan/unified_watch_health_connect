package com.huami.message.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/message/util/Clock;", "", "", "now", "<init>", "()V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class Clock {

    @NotNull
    public static final Clock INSTANCE = new Clock();

    private Clock() {
    }

    public final long now() {
        return System.currentTimeMillis();
    }
}
