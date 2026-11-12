package defpackage;

import com.huawei.wearengine.channel.WearEngineChannel;

/* JADX INFO: loaded from: classes20.dex */
public class yif implements WearEngineChannel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f53372b = 0;
    private final Object e = new Object();

    @Override // com.huawei.wearengine.channel.WearEngineChannel
    public void updateChannelState(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("state can only be 0 or 1.");
        }
        this.f53372b = i;
    }

    @Override // com.huawei.wearengine.channel.WearEngineChannel
    public void reset() {
        this.f53372b = 0;
    }

    @Override // com.huawei.wearengine.channel.WearEngineChannel
    public int getState() {
        return this.f53372b;
    }

    @Override // com.huawei.wearengine.channel.WearEngineChannel
    public boolean isChannelOpen() {
        return this.f53372b == 0;
    }
}
