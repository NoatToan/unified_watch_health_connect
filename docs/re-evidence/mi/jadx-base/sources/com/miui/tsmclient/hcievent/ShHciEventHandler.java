package com.miui.tsmclient.hcievent;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.smarthome.plugin.update.PluginError;

/* JADX INFO: loaded from: classes6.dex */
public class ShHciEventHandler extends AbsTransportationEventHandler {
    @Override // com.miui.tsmclient.hcievent.AbsTransportationEventHandler
    public HciEventInfo doHandleData(String str, long j, ByteArray byteArray) {
        return new HciEventInfo(str, j, Coder.bytesToInt(byteArray.duplicate(4, 4).toBytes()), Coder.bytesToInt(byteArray.duplicate(0, 4).toBytes()) + PluginError.CANCEL_OPEN_PLUGIN, false);
    }

    @Override // com.miui.tsmclient.hcievent.IHciEventHandler
    public boolean isSupport(byte[] bArr, byte[] bArr2) {
        return ByteArray.equals(ByteArray.wrap(bArr), APDUConstants.AID_SPTC);
    }
}
