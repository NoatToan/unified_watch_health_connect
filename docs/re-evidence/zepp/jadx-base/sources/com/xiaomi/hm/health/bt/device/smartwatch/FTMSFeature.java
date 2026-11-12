package com.xiaomi.hm.health.bt.device.smartwatch;

import com.google.firebase.crashlytics.internal.settings.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/smartwatch/FTMSFeature;", "", "", "featureIndex", "", "hasFeature", "", "a", "[B", b.e, "<init>", "([B)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FTMSFeature {
    public static final int INDEX_NO_LOAD = 17;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final byte[] features;

    public FTMSFeature(@NotNull byte[] bArr) {
        this.features = bArr;
    }

    public final boolean hasFeature(int featureIndex) {
        return ((byte) (((byte) (1 << (featureIndex % 8))) & this.features[featureIndex / 8])) != 0;
    }
}
