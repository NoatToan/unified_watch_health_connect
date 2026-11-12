package com.iabtcf.decoder;

import com.iabtcf.utils.IntIterable;
import defpackage.yrt;
import defpackage.ysa;
import defpackage.ysf;
import defpackage.ysl;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface TCString {
    IntIterable getAllowedVendors();

    int getCmpId();

    int getCmpVersion();

    String getConsentLanguage();

    int getConsentScreen();

    Instant getCreated();

    IntIterable getCustomPurposesConsent();

    IntIterable getCustomPurposesLITransparency();

    boolean getDefaultVendorConsent();

    IntIterable getDisclosedVendors();

    Instant getLastUpdated();

    IntIterable getPubPurposesConsent();

    IntIterable getPubPurposesLITransparency();

    String getPublisherCC();

    List<ysl> getPublisherRestrictions();

    boolean getPurposeOneTreatment();

    IntIterable getPurposesConsent();

    IntIterable getPurposesLITransparency();

    IntIterable getSpecialFeatureOptIns();

    int getTcfPolicyVersion();

    boolean getUseNonStandardStacks();

    IntIterable getVendorConsent();

    IntIterable getVendorLegitimateInterest();

    int getVendorListVersion();

    int getVersion();

    boolean isServiceSpecific();

    static TCString decode(String str, DecoderOption... decoderOptionArr) throws ysa, IllegalArgumentException, ysf {
        return yrt.d(str, decoderOptionArr);
    }
}
