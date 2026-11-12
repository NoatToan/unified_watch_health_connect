package com.xiaomi.fitness.device.manager.ui.scan.recognize;

import com.xiaomi.fitness.mijia.sdk.data.AdvPacket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/LocalBeaconRecognizer;", "Lcom/xiaomi/fitness/device/manager/ui/scan/recognize/BeaconRecognizer;", "mProductIdList", "", "", "<init>", "(Ljava/util/List;)V", "isAvailable", "", "packet", "Lcom/xiaomi/fitness/mijia/sdk/data/AdvPacket;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalBeaconRecognizer extends BeaconRecognizer {

    @Nullable
    private final List<Integer> mProductIdList;

    public LocalBeaconRecognizer(@Nullable List<Integer> list) {
        super(list, false);
        this.mProductIdList = list;
    }

    @Override // com.xiaomi.fitness.device.manager.ui.scan.recognize.BeaconRecognizer
    public boolean isAvailable(@NotNull AdvPacket packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        return true;
    }
}
