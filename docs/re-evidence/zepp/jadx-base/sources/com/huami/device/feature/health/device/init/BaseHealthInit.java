package com.huami.device.feature.health.device.init;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "", "", "supportRead", "supportWrite", "isSupport", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseHealthInit {
    public abstract boolean isSupport();

    public abstract boolean supportRead();

    public abstract boolean supportWrite();
}
