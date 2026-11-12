package com.huami.watch.dataflow.sync.gps.filter;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watch/dataflow/sync/gps/filter/Config;", "", "", "a", "Z", "getEnable", "()Z", "setEnable", "(Z)V", "enable", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class Config {
    public static final Config INSTANCE = new Config();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean enable;

    private Config() {
    }

    public final boolean getEnable() {
        return enable;
    }

    public final void setEnable(boolean z) {
        enable = z;
    }
}
