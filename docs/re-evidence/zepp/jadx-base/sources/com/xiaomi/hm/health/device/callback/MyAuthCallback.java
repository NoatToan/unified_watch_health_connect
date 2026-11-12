package com.xiaomi.hm.health.device.callback;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.device.event.HMDeviceAuthEvent;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public class MyAuthCallback implements IHMAuthCallback {
    private String a;
    private String b;
    public HMDeviceSource source;

    public MyAuthCallback() {
        this.source = HMDeviceSource.VDEVICE;
        this.a = null;
        this.b = null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
    public void onAuthentication(HMAuthState hMAuthState) {
        EventBus.getDefault().post(new HMDeviceAuthEvent(this.source, hMAuthState));
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
    public byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i) {
        return HMDeviceWebAPI.getSign(bArr, bArr2, i);
    }

    public MyAuthCallback(HMDeviceSource hMDeviceSource) {
        this.source = HMDeviceSource.VDEVICE;
        this.a = null;
        this.b = null;
        this.source = hMDeviceSource;
    }

    public MyAuthCallback(HMDeviceSource hMDeviceSource, String str, String str2) {
        this.source = HMDeviceSource.VDEVICE;
        this.a = null;
        this.b = null;
        this.source = hMDeviceSource;
        this.a = str;
        this.b = str2;
    }
}
