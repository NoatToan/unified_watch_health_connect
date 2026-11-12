package org.eclipse.californium.scandium.dtls.pskstore;

import defpackage.aaae;
import defpackage.aabp;
import defpackage.aabq;
import defpackage.aade;
import java.net.InetSocketAddress;
import javax.crypto.SecretKey;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;

/* JADX INFO: loaded from: classes20.dex */
public interface AdvancedPskStore {
    aabp getIdentity(InetSocketAddress inetSocketAddress, aade aadeVar);

    boolean hasEcdhePskSupported();

    aabq requestPskSecretResult(aaae aaaeVar, aade aadeVar, aabp aabpVar, String str, SecretKey secretKey, byte[] bArr, boolean z);

    void setResultHandler(HandshakeResultHandler handshakeResultHandler);
}
