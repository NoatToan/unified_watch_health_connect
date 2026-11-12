package com.huawei.wisecloud.drmclient.license.verify;

/* JADX INFO: loaded from: classes20.dex */
public class LicenseVerifierFactory {
    public static LicenseVerifier getVerifier() {
        LicenseHeaderVerifier licenseHeaderVerifier = new LicenseHeaderVerifier();
        licenseHeaderVerifier.setNext(new PayloadServerInfoVerifier());
        licenseHeaderVerifier.setNext(new PayloadKeyInfoVerifier());
        licenseHeaderVerifier.setNext(new PayloadLicensePolicyVerifier());
        licenseHeaderVerifier.setNext(new PayloadGenerateTimeVerifier());
        return licenseHeaderVerifier;
    }
}
