package defpackage;

import com.huawei.wearengine.channel.ChannelState;

/* JADX INFO: loaded from: classes20.dex */
public class yid implements ChannelState {
    private int d;
    private String e;

    public void d(int i) {
        this.d = i;
    }

    public String b() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public void c(String str) {
        this.e = str;
    }

    @Override // com.huawei.wearengine.channel.ChannelState
    public boolean isChannelOpen() {
        return this.d == 1;
    }
}
