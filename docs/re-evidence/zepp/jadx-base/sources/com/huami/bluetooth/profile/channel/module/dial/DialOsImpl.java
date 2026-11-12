package com.huami.bluetooth.profile.channel.module.dial;

import com.huami.bluetooth.profile.channel.module.DialModule;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/dial/DialOsImpl;", "Lcom/huami/bluetooth/profile/channel/module/dial/DialApi;", "", "dialId", "", "setDialId", "getDialId", "()Ljava/lang/Integer;", "srcId", "dest", "", "size", "replaceDial", "", "dialIds", "deleteDial", "imageSize", "getStorageState", "getAllWatchFaceIds", "colorId", "setDialDefaultColor", "Lcom/huami/bluetooth/profile/channel/module/DialModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/DialModule;", "dialModule", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/DialModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DialOsImpl implements DialApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DialModule dialModule;

    public DialOsImpl(@NotNull DialModule dialModule) {
        this.dialModule = dialModule;
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean deleteDial(@NotNull List<Integer> dialIds) {
        return this.dialModule.deleteDialSync(dialIds).getData().booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    @NotNull
    public List<Integer> getAllWatchFaceIds() {
        return this.dialModule.getDialIdListSync().getData();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    @NotNull
    public Integer getDialId() {
        return this.dialModule.getDialIdSync().getData();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean getStorageState(int dialId, long imageSize) {
        return this.dialModule.checkDeviceSpaceSync(dialId, imageSize).getData().booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public int replaceDial(int srcId, int dest, long size) {
        return this.dialModule.replaceDialIdSync(srcId, dest, size).getData().intValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean setDialDefaultColor(int colorId) {
        return this.dialModule.setDialDefaultColorSync(colorId).getData().booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.dial.DialApi
    public boolean setDialId(int dialId) {
        return this.dialModule.setDialIdSync(dialId).getData().booleanValue();
    }
}
