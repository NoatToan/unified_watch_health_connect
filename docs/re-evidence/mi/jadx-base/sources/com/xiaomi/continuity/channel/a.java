package com.xiaomi.continuity.channel;

import android.util.ArraySet;
import com.xiaomi.continuity.ServiceName;
import defpackage.epq;
import defpackage.gj4;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class a extends b.a implements gj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChannelInnerListener f11182b;
    public final Set<String> c;

    public a(int i, ChannelInnerListener channelInnerListener) {
        ArraySet arraySet = new ArraySet();
        this.c = arraySet;
        Objects.requireNonNull(channelInnerListener, "invalid null lListener");
        this.f11181a = i;
        this.f11182b = channelInnerListener;
        arraySet.add("channel.CONFIRM_WITH_USER_DATA");
        arraySet.add("channel.NOTIFY_SERVER_CONNECTED");
    }

    @Override // com.xiaomi.continuity.channel.b
    public String getFeatures() {
        return epq.a(this.c);
    }

    public void h() {
        this.f11182b.onException(502);
    }

    @Override // com.xiaomi.continuity.channel.b
    public void onChannelConfirm(String str, ServiceName serviceName, int i, ConfirmInfo confirmInfo) {
        this.f11182b.onChannelConfirm(str, serviceName, i, new ConfirmInfoV2(confirmInfo.getTrustLevel(), confirmInfo.getComparisonNumber(), confirmInfo.getAppPackage(), confirmInfo.getAppSignature(), confirmInfo.getDevicePlatformType(), confirmInfo.getMediumType(), null, null));
    }

    @Override // com.xiaomi.continuity.channel.b
    public void onChannelConfirmV2(String str, ServiceName serviceName, int i, ConfirmInfoV2 confirmInfoV2) {
        this.f11182b.onChannelConfirm(str, serviceName, i, confirmInfoV2);
    }

    public void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2) {
        this.f11182b.onChannelCreateFailed(str, serviceName, i, i2);
    }

    @Override // com.xiaomi.continuity.channel.b
    public void onChannelCreated(String str, ServiceName serviceName, ChannelInfo channelInfo) {
        this.f11182b.onChannelCreated(str, serviceName, channelInfo);
        channelInfo.WipeTransKey();
    }

    public void onChannelRelease(int i, int i2) {
        this.f11182b.onChannelRelease(i, i2);
    }

    @Override // com.xiaomi.continuity.channel.b
    public void onReceived(int i, byte[] bArr, int i2) {
        this.f11182b.onReceived(i, bArr, i2);
    }

    @Override // com.xiaomi.continuity.channel.b
    public void onRequestSocketPort(String str, ServiceName serviceName, int i) {
        this.f11182b.onRequestSocketPort(str, serviceName, i);
    }

    @Override // com.xiaomi.continuity.channel.b
    public void onServerRegisterStatus(ServiceName serviceName, int i) {
        this.f11182b.onServerRegisterStatus(serviceName, i);
    }

    public void p5(ContinuityConnectionManager continuityConnectionManager) {
        continuityConnectionManager.addServiceListener(this);
    }

    public void q5(ContinuityConnectionManager continuityConnectionManager) {
        continuityConnectionManager.removeServiceListener(this);
    }
}
