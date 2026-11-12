package defpackage;

import com.iabtcf.decoder.TCString;
import com.iabtcf.utils.FieldDefs;
import com.iabtcf.utils.IntIterable;
import com.iabtcf.v2.RestrictionType;
import com.iabtcf.v2.SegmentType;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: classes20.dex */
class ysc implements TCString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumSet<FieldDefs> f53797a = EnumSet.noneOf(FieldDefs.class);
    private int ac;
    private int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntIterable f53798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f53799c;
    private int d;
    private final ysh e;
    private IntIterable f;
    private int g;
    private int h;
    private Instant i;
    private Instant j;
    private IntIterable k;
    private int l;
    private boolean m;
    private IntIterable n;
    private boolean o;
    private IntIterable p;
    private IntIterable q;
    private String r;
    private List<ysl> s;
    private IntIterable t;
    private final Collection<ysh> u;
    private IntIterable v;
    private IntIterable w;
    private boolean x;
    private IntIterable y;
    private IntIterable z;

    @Override // com.iabtcf.decoder.TCString
    public boolean getDefaultVendorConsent() {
        return false;
    }

    private ysc(ysh yshVar, ysh... yshVarArr) {
        this.e = yshVar;
        this.u = Arrays.asList(yshVarArr);
    }

    public static ysc e(ysh yshVar, ysh... yshVarArr) {
        return new ysc(yshVar, yshVarArr);
    }

    private ysh c(SegmentType segmentType) {
        if (segmentType == SegmentType.DEFAULT) {
            return this.e;
        }
        for (ysh yshVar : this.u) {
            if (segmentType == SegmentType.from(yshVar.c(FieldDefs.OOB_SEGMENT_TYPE))) {
                return yshVar;
            }
        }
        return null;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesConsent() {
        if (this.f53797a.add(FieldDefs.PPTC_PUB_PURPOSES_CONSENT)) {
            this.t = ysd.d;
            ysh yshVarC = c(SegmentType.PUBLISHER_TC);
            if (yshVarC != null) {
                this.t = c(yshVarC, FieldDefs.PPTC_PUB_PURPOSES_CONSENT);
            }
        }
        return this.t;
    }

    static ysd e(ysh yshVar, FieldDefs fieldDefs, FieldDefs fieldDefs2) {
        BitSet bitSet = new BitSet();
        int iE = yshVar.e(fieldDefs);
        if (yshVar.b(fieldDefs.getEnd(yshVar))) {
            a(yshVar, bitSet, fieldDefs2, Optional.of(fieldDefs));
        } else {
            for (int i = 0; i < iE; i++) {
                if (yshVar.b(fieldDefs2.getOffset(yshVar) + i)) {
                    bitSet.set(i + 1);
                }
            }
        }
        return ysd.e(bitSet);
    }

    static int d(final ysh yshVar, BitSet bitSet, int i, Optional<FieldDefs> optional) {
        int iE = yshVar.e(i);
        int length = i + FieldDefs.NUM_ENTRIES.getLength(yshVar);
        Integer num = (Integer) optional.map(new Function() { // from class: yry
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(yshVar.e((FieldDefs) obj));
            }
        }).orElse(Integer.MAX_VALUE);
        int iIntValue = num.intValue();
        for (int i2 = 0; i2 < iE; i2++) {
            int i3 = length + 1;
            boolean zB = yshVar.b(length);
            int iC = yshVar.c(i3);
            int length2 = i3 + FieldDefs.START_OR_ONLY_VENDOR_ID.getLength(yshVar);
            if (zB) {
                int iC2 = yshVar.c(length2);
                length2 += FieldDefs.START_OR_ONLY_VENDOR_ID.getLength(yshVar);
                if (iC > iC2) {
                    throw new yrz(String.format("start vendor id (%d) is greater than endVendorId (%d)", Integer.valueOf(iC), Integer.valueOf(iC2)));
                }
                if (iC2 > iIntValue) {
                    throw new yrz(String.format("end vendor id (%d) is greater than max (%d)", Integer.valueOf(iC2), num));
                }
                bitSet.set(iC, iC2 + 1);
            } else {
                bitSet.set(iC);
            }
            length = length2;
        }
        return length;
    }

    static void a(ysh yshVar, BitSet bitSet, FieldDefs fieldDefs, Optional<FieldDefs> optional) {
        d(yshVar, bitSet, fieldDefs.getOffset(yshVar), optional);
    }

    private int c(List<ysl> list, int i, ysh yshVar) {
        int iE = yshVar.e(i);
        int length = i + FieldDefs.NUM_ENTRIES.getLength(yshVar);
        for (int i2 = 0; i2 < iE; i2++) {
            byte bF = yshVar.f(length);
            int length2 = length + FieldDefs.PURPOSE_ID.getLength(yshVar);
            RestrictionType restrictionTypeFrom = RestrictionType.from(yshVar.d(length2));
            BitSet bitSet = new BitSet();
            length = d(this.e, bitSet, length2 + 2, Optional.empty());
            list.add(new ysl(bF, restrictionTypeFrom, ysd.e(bitSet)));
        }
        return length;
    }

    static ysd c(ysh yshVar, FieldDefs fieldDefs) {
        int offset = fieldDefs.getOffset(yshVar);
        int length = fieldDefs.getLength(yshVar);
        ysd.a aVarC = ysd.c();
        for (int i = 0; i < length; i++) {
            if (yshVar.b(offset + i)) {
                aVarC.a(i + 1);
            }
        }
        return aVarC.b();
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVersion() {
        if (this.f53797a.add(FieldDefs.CORE_VERSION)) {
            this.ad = this.e.g(FieldDefs.CORE_VERSION);
        }
        return this.ad;
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getCreated() {
        if (this.f53797a.add(FieldDefs.CORE_CREATED)) {
            this.j = Instant.ofEpochMilli(this.e.b(FieldDefs.CORE_CREATED) * 100);
        }
        return this.j;
    }

    @Override // com.iabtcf.decoder.TCString
    public Instant getLastUpdated() {
        if (this.f53797a.add(FieldDefs.CORE_LAST_UPDATED)) {
            this.i = Instant.ofEpochMilli(this.e.b(FieldDefs.CORE_LAST_UPDATED) * 100);
        }
        return this.i;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpId() {
        if (this.f53797a.add(FieldDefs.CORE_CMP_ID)) {
            this.d = (short) this.e.d(FieldDefs.CORE_CMP_ID);
        }
        return this.d;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getCmpVersion() {
        if (this.f53797a.add(FieldDefs.CORE_CMP_VERSION)) {
            this.g = (short) this.e.d(FieldDefs.CORE_CMP_VERSION);
        }
        return this.g;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getConsentScreen() {
        if (this.f53797a.add(FieldDefs.CORE_CONSENT_SCREEN)) {
            this.h = this.e.g(FieldDefs.CORE_CONSENT_SCREEN);
        }
        return this.h;
    }

    @Override // com.iabtcf.decoder.TCString
    public String getConsentLanguage() {
        if (this.f53797a.add(FieldDefs.CORE_CONSENT_LANGUAGE)) {
            this.f53799c = this.e.f(FieldDefs.CORE_CONSENT_LANGUAGE);
        }
        return this.f53799c;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getVendorListVersion() {
        if (this.f53797a.add(FieldDefs.CORE_VENDOR_LIST_VERSION)) {
            this.ac = (short) this.e.d(FieldDefs.CORE_VENDOR_LIST_VERSION);
        }
        return this.ac;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesConsent() {
        if (this.f53797a.add(FieldDefs.CORE_PURPOSES_CONSENT)) {
            this.q = c(this.e, FieldDefs.CORE_PURPOSES_CONSENT);
        }
        return this.q;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorConsent() {
        if (this.f53797a.add(FieldDefs.CORE_VENDOR_BITRANGE_FIELD)) {
            this.v = e(this.e, FieldDefs.CORE_VENDOR_MAX_VENDOR_ID, FieldDefs.CORE_VENDOR_BITRANGE_FIELD);
        }
        return this.v;
    }

    @Override // com.iabtcf.decoder.TCString
    public int getTcfPolicyVersion() {
        if (this.f53797a.add(FieldDefs.CORE_TCF_POLICY_VERSION)) {
            this.l = this.e.g(FieldDefs.CORE_TCF_POLICY_VERSION);
        }
        return this.l;
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean isServiceSpecific() {
        if (this.f53797a.add(FieldDefs.CORE_IS_SERVICE_SPECIFIC)) {
            this.o = this.e.a(FieldDefs.CORE_IS_SERVICE_SPECIFIC);
        }
        return this.o;
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getUseNonStandardStacks() {
        if (this.f53797a.add(FieldDefs.CORE_USE_NON_STANDARD_STOCKS)) {
            this.x = this.e.a(FieldDefs.CORE_USE_NON_STANDARD_STOCKS);
        }
        return this.x;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getSpecialFeatureOptIns() {
        if (this.f53797a.add(FieldDefs.CORE_SPECIAL_FEATURE_OPT_INS)) {
            this.w = c(this.e, FieldDefs.CORE_SPECIAL_FEATURE_OPT_INS);
        }
        return this.w;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPurposesLITransparency() {
        if (this.f53797a.add(FieldDefs.CORE_PURPOSES_LI_TRANSPARENCY)) {
            this.y = c(this.e, FieldDefs.CORE_PURPOSES_LI_TRANSPARENCY);
        }
        return this.y;
    }

    @Override // com.iabtcf.decoder.TCString
    public boolean getPurposeOneTreatment() {
        if (this.f53797a.add(FieldDefs.CORE_PURPOSE_ONE_TREATMENT)) {
            this.m = this.e.a(FieldDefs.CORE_PURPOSE_ONE_TREATMENT);
        }
        return this.m;
    }

    @Override // com.iabtcf.decoder.TCString
    public String getPublisherCC() {
        if (this.f53797a.add(FieldDefs.CORE_PUBLISHER_CC)) {
            this.r = this.e.f(FieldDefs.CORE_PUBLISHER_CC);
        }
        return this.r;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getVendorLegitimateInterest() {
        if (this.f53797a.add(FieldDefs.CORE_VENDOR_LI_BITRANGE_FIELD)) {
            this.z = e(this.e, FieldDefs.CORE_VENDOR_LI_MAX_VENDOR_ID, FieldDefs.CORE_VENDOR_LI_BITRANGE_FIELD);
        }
        return this.z;
    }

    @Override // com.iabtcf.decoder.TCString
    public List<ysl> getPublisherRestrictions() {
        if (this.f53797a.add(FieldDefs.CORE_PUB_RESTRICTION_ENTRY)) {
            ArrayList arrayList = new ArrayList();
            this.s = arrayList;
            c(arrayList, FieldDefs.CORE_NUM_PUB_RESTRICTION.getOffset(this.e), this.e);
        }
        return this.s;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getAllowedVendors() {
        if (this.f53797a.add(FieldDefs.AV_VENDOR_BITRANGE_FIELD)) {
            this.f53798b = ysd.d;
            ysh yshVarC = c(SegmentType.ALLOWED_VENDOR);
            if (yshVarC != null) {
                this.f53798b = e(yshVarC, FieldDefs.AV_MAX_VENDOR_ID, FieldDefs.AV_VENDOR_BITRANGE_FIELD);
            }
        }
        return this.f53798b;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getDisclosedVendors() {
        if (this.f53797a.add(FieldDefs.DV_VENDOR_BITRANGE_FIELD)) {
            this.n = ysd.d;
            ysh yshVarC = c(SegmentType.DISCLOSED_VENDOR);
            if (yshVarC != null) {
                this.n = e(yshVarC, FieldDefs.DV_MAX_VENDOR_ID, FieldDefs.DV_VENDOR_BITRANGE_FIELD);
            }
        }
        return this.n;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getPubPurposesLITransparency() {
        if (this.f53797a.add(FieldDefs.PPTC_PUB_PURPOSES_LI_TRANSPARENCY)) {
            this.p = ysd.d;
            ysh yshVarC = c(SegmentType.PUBLISHER_TC);
            if (yshVarC != null) {
                this.p = c(yshVarC, FieldDefs.PPTC_PUB_PURPOSES_LI_TRANSPARENCY);
            }
        }
        return this.p;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesConsent() {
        if (this.f53797a.add(FieldDefs.PPTC_CUSTOM_PURPOSES_CONSENT)) {
            this.f = ysd.d;
            ysh yshVarC = c(SegmentType.PUBLISHER_TC);
            if (yshVarC != null) {
                this.f = c(yshVarC, FieldDefs.PPTC_CUSTOM_PURPOSES_CONSENT);
            }
        }
        return this.f;
    }

    @Override // com.iabtcf.decoder.TCString
    public IntIterable getCustomPurposesLITransparency() {
        if (this.f53797a.add(FieldDefs.PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY)) {
            this.k = ysd.d;
            ysh yshVarC = c(SegmentType.PUBLISHER_TC);
            if (yshVarC != null) {
                this.k = c(yshVarC, FieldDefs.PPTC_CUSTOM_PURPOSES_LI_TRANSPARENCY);
            }
        }
        return this.k;
    }

    public int hashCode() {
        IntIterable allowedVendors = getAllowedVendors();
        String consentLanguage = getConsentLanguage();
        int cmpId = getCmpId();
        int cmpVersion = getCmpVersion();
        Instant created = getCreated();
        Instant lastUpdated = getLastUpdated();
        int consentScreen = getConsentScreen();
        IntIterable customPurposesConsent = getCustomPurposesConsent();
        IntIterable customPurposesLITransparency = getCustomPurposesLITransparency();
        IntIterable disclosedVendors = getDisclosedVendors();
        boolean purposeOneTreatment = getPurposeOneTreatment();
        boolean zIsServiceSpecific = isServiceSpecific();
        int tcfPolicyVersion = getTcfPolicyVersion();
        String publisherCC = getPublisherCC();
        IntIterable pubPurposesConsent = getPubPurposesConsent();
        IntIterable pubPurposesLITransparency = getPubPurposesLITransparency();
        List<ysl> publisherRestrictions = getPublisherRestrictions();
        IntIterable purposesConsent = getPurposesConsent();
        IntIterable purposesLITransparency = getPurposesLITransparency();
        IntIterable specialFeatureOptIns = getSpecialFeatureOptIns();
        boolean useNonStandardStacks = getUseNonStandardStacks();
        return Objects.hash(allowedVendors, consentLanguage, Integer.valueOf(cmpId), Integer.valueOf(cmpVersion), created, lastUpdated, Integer.valueOf(consentScreen), customPurposesConsent, customPurposesLITransparency, disclosedVendors, Boolean.valueOf(purposeOneTreatment), Boolean.valueOf(zIsServiceSpecific), Integer.valueOf(tcfPolicyVersion), publisherCC, pubPurposesConsent, pubPurposesLITransparency, publisherRestrictions, purposesConsent, purposesLITransparency, specialFeatureOptIns, Boolean.valueOf(useNonStandardStacks), getVendorConsent(), getVendorLegitimateInterest(), Integer.valueOf(getVendorListVersion()), Integer.valueOf(getVersion()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ysc yscVar = (ysc) obj;
        return Objects.equals(getAllowedVendors(), yscVar.getAllowedVendors()) && Objects.equals(getConsentLanguage(), yscVar.getConsentLanguage()) && getCmpId() == yscVar.getCmpId() && getCmpVersion() == yscVar.getCmpVersion() && Objects.equals(getCreated(), yscVar.getCreated()) && Objects.equals(getLastUpdated(), yscVar.getLastUpdated()) && getConsentScreen() == yscVar.getConsentScreen() && Objects.equals(getCustomPurposesConsent(), yscVar.getCustomPurposesConsent()) && Objects.equals(getCustomPurposesLITransparency(), yscVar.getCustomPurposesLITransparency()) && Objects.equals(getDisclosedVendors(), yscVar.getDisclosedVendors()) && getPurposeOneTreatment() == yscVar.getPurposeOneTreatment() && isServiceSpecific() == yscVar.isServiceSpecific() && getTcfPolicyVersion() == yscVar.getTcfPolicyVersion() && Objects.equals(getPublisherCC(), yscVar.getPublisherCC()) && Objects.equals(getPubPurposesConsent(), yscVar.getPubPurposesConsent()) && Objects.equals(getPubPurposesLITransparency(), yscVar.getPubPurposesLITransparency()) && Objects.equals(getPublisherRestrictions(), yscVar.getPublisherRestrictions()) && Objects.equals(getPurposesConsent(), yscVar.getPurposesConsent()) && Objects.equals(getPurposesLITransparency(), yscVar.getPurposesLITransparency()) && Objects.equals(getSpecialFeatureOptIns(), yscVar.getSpecialFeatureOptIns()) && getUseNonStandardStacks() == yscVar.getUseNonStandardStacks() && Objects.equals(getVendorConsent(), yscVar.getVendorConsent()) && Objects.equals(getVendorLegitimateInterest(), yscVar.getVendorLegitimateInterest()) && getVendorListVersion() == yscVar.getVendorListVersion() && getVersion() == yscVar.getVersion();
    }

    public String toString() {
        return "TCStringV2 [getVersion()=" + getVersion() + ", getCreated()=" + getCreated() + ", getLastUpdated()=" + getLastUpdated() + ", getCmpId()=" + getCmpId() + ", getCmpVersion()=" + getCmpVersion() + ", getConsentScreen()=" + getConsentScreen() + ", getConsentLanguage()=" + getConsentLanguage() + ", getVendorListVersion()=" + getVendorListVersion() + ", getTcfPolicyVersion()=" + getTcfPolicyVersion() + ", isServiceSpecific()=" + isServiceSpecific() + ", getUseNonStandardStacks()=" + getUseNonStandardStacks() + ", getSpecialFeatureOptIns()=" + getSpecialFeatureOptIns() + ", getPurposesConsent()=" + getPurposesConsent() + ", getPurposesLITransparency()=" + getPurposesLITransparency() + ", getPurposeOneTreatment()=" + getPurposeOneTreatment() + ", getPublisherCC()=" + getPublisherCC() + ", getVendorConsent()=" + getVendorConsent() + ", getVendorLegitimateInterest()=" + getVendorLegitimateInterest() + ", getPublisherRestrictions()=" + getPublisherRestrictions() + ", getDisclosedVendors()=" + getDisclosedVendors() + ", getAllowedVendors()=" + getAllowedVendors() + ", getPubPurposesConsent()=" + getPubPurposesConsent() + ", getPubPurposesLITransparency()=" + getPubPurposesLITransparency() + ", getCustomPurposesConsent()=" + getCustomPurposesConsent() + ", getCustomPurposesLITransparency()=" + getCustomPurposesLITransparency() + "]";
    }
}
