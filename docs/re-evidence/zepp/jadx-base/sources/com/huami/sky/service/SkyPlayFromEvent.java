package com.huami.sky.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/service/SkyPlayFromEvent;", "", "", "from", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FROM_HOME_PAGE", "FROM_REMINDER_NOTIFICATION_CLICK", "FROM_SLEEP", "FROM_INIT_GUIDE", "FROM_PLAY_NOTIFICATION_CLICK", "FROM_OTHER", "FROM_DEEP_LINK", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public enum SkyPlayFromEvent {
    FROM_HOME_PAGE("0"),
    FROM_REMINDER_NOTIFICATION_CLICK("1"),
    FROM_SLEEP("2"),
    FROM_INIT_GUIDE("3"),
    FROM_PLAY_NOTIFICATION_CLICK("4"),
    FROM_OTHER("5"),
    FROM_DEEP_LINK("6");


    @NotNull
    private final String from;

    SkyPlayFromEvent(String str) {
        this.from = str;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }
}
