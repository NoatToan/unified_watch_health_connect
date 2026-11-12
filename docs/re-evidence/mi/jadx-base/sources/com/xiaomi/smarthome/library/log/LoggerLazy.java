package com.xiaomi.smarthome.library.log;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/smarthome/library/log/LoggerLazy;", "Lkotlin/Lazy;", "Lcom/xiaomi/smarthome/library/log/MJLogWrapper;", "type", "Lcom/xiaomi/smarthome/library/log/LogType;", "tag", "", "level", "", "(Lcom/xiaomi/smarthome/library/log/LogType;Ljava/lang/String;I)V", "cached", "value", "getValue", "()Lcom/xiaomi/smarthome/library/log/MJLogWrapper;", "isInitialized", "", "smarthome-log-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoggerLazy implements Lazy<MJLogWrapper> {

    @Nullable
    private MJLogWrapper cached;
    private final int level;

    @NotNull
    private final String tag;

    @NotNull
    private final LogType type;

    public LoggerLazy(@NotNull LogType type, @NotNull String tag, int i) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.type = type;
        this.tag = tag;
        this.level = i;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.Lazy
    @NotNull
    public MJLogWrapper getValue() {
        MJLogWrapper mJLogWrapper = this.cached;
        if (mJLogWrapper != null) {
            return mJLogWrapper;
        }
        MJLogWrapper mJLogWrapper2 = new MJLogWrapper(this.type, this.tag, this.level);
        this.cached = mJLogWrapper2;
        return mJLogWrapper2;
    }
}
