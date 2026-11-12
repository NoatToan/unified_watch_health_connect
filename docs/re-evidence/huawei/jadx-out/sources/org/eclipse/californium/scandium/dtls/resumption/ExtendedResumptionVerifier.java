package org.eclipse.californium.scandium.dtls.resumption;

import defpackage.aaai;
import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;

/* JADX INFO: loaded from: classes20.dex */
public interface ExtendedResumptionVerifier extends ResumptionVerifier {
    boolean skipRequestHelloVerify(aaai aaaiVar, boolean z, ExtendedMasterSecretMode extendedMasterSecretMode);
}
