package defpackage;

import com.iabtcf.decoder.TCString;
import com.iabtcf.utils.FieldDefs;
import com.iabtcf.utils.IntIterable;
import java.time.Instant;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes20.dex */
class ysb implements TCString {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ysh f53796b;

    private ysb(ysh yshVar) {
        this.f53796b = yshVar;
    }

    public static ysb c(ysh yshVar) {
        return new ysb(yshVar);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVersion() {
        return this.f53796b.g(FieldDefs.V1_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getCreated() {
        return Instant.ofEpochMilli(this.f53796b.b(FieldDefs.V1_CREATED) * 100);
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getLastUpdated() {
        return Instant.ofEpochMilli(this.f53796b.b(FieldDefs.V1_LAST_UPDATED) * 100);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpId() {
        return this.f53796b.d(FieldDefs.V1_CMP_ID);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpVersion() {
        return this.f53796b.d(FieldDefs.V1_CMP_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getConsentScreen() {
        return this.f53796b.g(FieldDefs.V1_CONSENT_SCREEN);
    }

    @Override // com.iabtcf.decoder.TCString
    public String getConsentLanguage() {
        return this.f53796b.f(FieldDefs.V1_CONSENT_LANGUAGE);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVendorListVersion() {
        return this.f53796b.d(FieldDefs.V1_VENDOR_LIST_VERSION);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorConsent() {
        return d(this.f53796b, FieldDefs.V1_VENDOR_MAX_VENDOR_ID, FieldDefs.V1_VENDOR_BITRANGE_FIELD);
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getDefaultVendorConsent() {
        return this.f53796b.a(FieldDefs.V1_VENDOR_IS_RANGE_ENCODING) && this.f53796b.a(FieldDefs.V1_VENDOR_DEFAULT_CONSENT);
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesConsent() {
        return ysc.c(this.f53796b, FieldDefs.V1_PURPOSES_ALLOW);
    }

    @Override // com.iabtcf.decoder.TCString
    public int getTcfPolicyVersion() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean isServiceSpecific() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getUseNonStandardStacks() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getSpecialFeatureOptIns() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getPurposeOneTreatment() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public String getPublisherCC() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorLegitimateInterest() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public List<ysl> getPublisherRestrictions() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getAllowedVendors() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getDisclosedVendors() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesConsent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesConsent() {
        throw new UnsupportedOperationException();
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesLITransparency() {
        throw new UnsupportedOperationException();
    }

    private IntIterable d(ysh yshVar, FieldDefs fieldDefs, FieldDefs fieldDefs2) {
        BitSet bitSet = new BitSet();
        int iE = yshVar.e(fieldDefs);
        if (yshVar.b(fieldDefs.getEnd(yshVar))) {
            boolean zA = yshVar.a(FieldDefs.V1_VENDOR_DEFAULT_CONSENT);
            ysc.d(yshVar, bitSet, FieldDefs.V1_VENDOR_NUM_ENTRIES.getOffset(yshVar), Optional.of(fieldDefs));
            if (zA) {
                bitSet.flip(1, iE + 1);
            }
        } else {
            for (int i = 0; i < iE; i++) {
                if (yshVar.b(fieldDefs2.getOffset(yshVar) + i)) {
                    bitSet.set(i + 1);
                }
            }
        }
        return ysd.e(bitSet);
    }

    public int hashCode() {
        int version = getVersion();
        Instant created = getCreated();
        Instant lastUpdated = getLastUpdated();
        int cmpId = getCmpId();
        int cmpVersion = getCmpVersion();
        int consentScreen = getConsentScreen();
        String consentLanguage = getConsentLanguage();
        int vendorListVersion = getVendorListVersion();
        IntIterable vendorConsent = getVendorConsent();
        boolean defaultVendorConsent = getDefaultVendorConsent();
        return Objects.hash(Integer.valueOf(version), created, lastUpdated, Integer.valueOf(cmpId), Integer.valueOf(cmpVersion), Integer.valueOf(consentScreen), consentLanguage, Integer.valueOf(vendorListVersion), vendorConsent, Boolean.valueOf(defaultVendorConsent), getPurposesConsent());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ysb ysbVar = (ysb) obj;
        return getVersion() == ysbVar.getVersion() && Objects.equals(getCreated(), ysbVar.getCreated()) && Objects.equals(getLastUpdated(), ysbVar.getLastUpdated()) && getCmpId() == ysbVar.getCmpId() && getCmpVersion() == ysbVar.getCmpVersion() && getConsentScreen() == ysbVar.getConsentScreen() && Objects.equals(getConsentLanguage(), ysbVar.getConsentLanguage()) && getVendorListVersion() == ysbVar.getVendorListVersion() && Objects.equals(getVendorConsent(), ysbVar.getVendorConsent()) && getDefaultVendorConsent() == ysbVar.getDefaultVendorConsent() && Objects.equals(getPurposesConsent(), ysbVar.getPurposesConsent());
    }

    public String toString() {
        return "TCStringV1 [getVersion()=" + getVersion() + ", getCreated()=" + getCreated() + ", getLastUpdated()=" + getLastUpdated() + ", getCmpId()=" + getCmpId() + ", getCmpVersion()=" + getCmpVersion() + ", getConsentScreen()=" + getConsentScreen() + ", getConsentLanguage()=" + getConsentLanguage() + ", getVendorListVersion()=" + getVendorListVersion() + ", getVendorConsent()=" + getVendorConsent() + ", getDefaultVendorConsent()=" + getDefaultVendorConsent() + ", getPurposesConsent()=" + getPurposesConsent() + "]";
    }
}
