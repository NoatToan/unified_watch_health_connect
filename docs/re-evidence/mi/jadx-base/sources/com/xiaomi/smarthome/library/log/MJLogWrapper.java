package com.xiaomi.smarthome.library.log;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000J\u001a\u0010\u0013\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000J\u001a\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0086\bø\u0001\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/smarthome/library/log/MJLogWrapper;", "", "type", "Lcom/xiaomi/smarthome/library/log/LogType;", "tag", "", "level", "", "(Lcom/xiaomi/smarthome/library/log/LogType;Ljava/lang/String;I)V", "getLevel", "()I", "getTag", "()Ljava/lang/String;", "getType", "()Lcom/xiaomi/smarthome/library/log/LogType;", "all", "", "lazyMessage", "Lkotlin/Function0;", "grey", "raw", "smarthome-log-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MJLogWrapper {
    private final int level;

    @NotNull
    private final String tag;

    @NotNull
    private final LogType type;

    public MJLogWrapper(@NotNull LogType type, @NotNull String tag, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.type = type;
        this.tag = tag;
        this.level = i;
    }

    public final void all(@NotNull Function0<String> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if ((getLevel() & 1) == 0) {
            return;
        }
        MiJiaLog.writeLogOnAll(getType(), getTag(), lazyMessage.invoke());
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final LogType getType() {
        return this.type;
    }

    public final void grey(@NotNull Function0<String> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if ((getLevel() & 2) == 0) {
            return;
        }
        MiJiaLog.writeLogOnGrey(getType(), getTag(), lazyMessage.invoke());
    }

    public final void raw(@NotNull Function0<String> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if ((getLevel() & 4) == 0) {
            return;
        }
        MiJiaLog.onlyLogcat(getTag(), lazyMessage.invoke());
    }
}
