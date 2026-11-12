package com.huami.nfc.web;

import com.huami.nfc.applet.city.CityAppletExtensionsKt;
import com.huami.nfc.base.INfcChannel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/nfc/web/DefaultApduScriptImpl;", "Lcom/huami/nfc/web/IApduScript;", "", "apdu", "executeApdu", "Lcom/huami/nfc/base/INfcChannel;", "a", "Lcom/huami/nfc/base/INfcChannel;", "channel", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "web_release"}, k = 1, mv = {1, 5, 1})
public final class DefaultApduScriptImpl implements IApduScript {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    public DefaultApduScriptImpl(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    @Override // com.huami.nfc.web.IApduScript
    @NotNull
    public String executeApdu(@NotNull String apdu) {
        return CityAppletExtensionsKt.toApduScript(this.channel.transmit(CityAppletExtensionsKt.toBytes(apdu)));
    }
}
