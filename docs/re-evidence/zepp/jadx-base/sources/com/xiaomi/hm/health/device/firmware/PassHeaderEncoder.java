package com.xiaomi.hm.health.device.firmware;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/PassHeaderEncoder;", "Lcom/xiaomi/hm/health/device/firmware/IHeaderEncoder;", "", "encode", "a", "Ljava/lang/String;", "path", "<init>", "(Ljava/lang/String;)V", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class PassHeaderEncoder implements IHeaderEncoder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String path;

    public PassHeaderEncoder(@NotNull String str) {
        this.path = str;
    }

    @Override // com.xiaomi.hm.health.device.firmware.IHeaderEncoder
    @NotNull
    /* JADX INFO: renamed from: encode, reason: from getter */
    public String getPath() {
        return this.path;
    }
}
