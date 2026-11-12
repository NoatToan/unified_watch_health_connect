package defpackage;

import com.amap.api.services.district.DistrictSearchQuery;
import com.braintreepayments.api.PostalAddress;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010$H\u0007J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/braintreepayments/api/PostalAddressParser;", "", "()V", "COUNTRY_CODE_ALPHA_2_KEY", "", "COUNTRY_CODE_KEY", "COUNTRY_CODE_UNDERSCORE_KEY", "EXTENDED_ADDRESS_KEY", "LINE_1_KEY", "LINE_2_KEY", "LOCALITY_KEY", "POSTAL_CODE_KEY", "POSTAL_CODE_UNDERSCORE_KEY", "RECIPIENT_NAME_KEY", "RECIPIENT_NAME_UNDERSCORE_KEY", "REGION_KEY", "STREET_ADDRESS_KEY", "USER_ADDRESS_ADDRESS_1_KEY", "USER_ADDRESS_ADDRESS_2_KEY", "USER_ADDRESS_ADDRESS_3_KEY", "USER_ADDRESS_ADDRESS_4_KEY", "USER_ADDRESS_ADDRESS_5_KEY", "USER_ADDRESS_ADMINISTRATIVE_AREA_KEY", "USER_ADDRESS_COUNTRY_CODE_KEY", "USER_ADDRESS_LOCALITY_KEY", "USER_ADDRESS_NAME_KEY", "USER_ADDRESS_PHONE_NUMBER_KEY", "USER_ADDRESS_POSTAL_CODE_KEY", "USER_ADDRESS_SORTING_CODE_KEY", "VENMO_GQL_ADDRESS1_KEY", "VENMO_GQL_ADDRESS2_KEY", "VENMO_GQL_LOCALITY_KEY", "VENMO_GQL_RECIPIENT_KEY", "VENMO_GQL_REGION_KEY", "formatExtendedUserAddress", "address", "Lorg/json/JSONObject;", "fromJson", "Lcom/braintreepayments/api/PostalAddress;", "accountAddress", "fromUserAddressJson", "json", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ul {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ul f50306b = new ul();

    private ul() {
    }

    @JvmStatic
    public static final PostalAddress d(JSONObject jSONObject) {
        PostalAddress postalAddressC;
        if (jSONObject != null) {
            String strE = tu.e(jSONObject, "street1", null);
            String strE2 = tu.e(jSONObject, "street2", null);
            String strE3 = tu.e(jSONObject, "country", null);
            if (strE == null) {
                strE = tu.e(jSONObject, "line1", null);
            }
            if (strE2 == null) {
                strE2 = tu.e(jSONObject, "line2", null);
            }
            if (strE3 == null) {
                strE3 = tu.e(jSONObject, "countryCode", null);
            }
            if (strE == null) {
                strE = tu.e(jSONObject, "addressLine1", null);
            }
            if (strE2 == null) {
                strE2 = tu.e(jSONObject, "addressLine2", null);
            }
            if (strE == null && tu.e(jSONObject, "name", null) != null) {
                postalAddressC = f50306b.c(jSONObject);
            } else {
                PostalAddress postalAddress = new PostalAddress();
                postalAddress.setRecipientName(tu.e(jSONObject, "recipientName", null));
                postalAddress.setStreetAddress(strE);
                postalAddress.setExtendedAddress(strE2);
                postalAddress.setLocality(tu.e(jSONObject, DistrictSearchQuery.KEYWORDS_CITY, null));
                postalAddress.setRegion(tu.e(jSONObject, "state", null));
                postalAddress.setPostalCode(tu.e(jSONObject, "postalCode", null));
                postalAddress.setCountryCodeAlpha2(strE3);
                String recipientName = postalAddress.getRecipientName();
                if (recipientName == null) {
                    recipientName = tu.e(jSONObject, "fullName", null);
                }
                postalAddress.setRecipientName(recipientName);
                String locality = postalAddress.getLocality();
                if (locality == null) {
                    locality = tu.e(jSONObject, "adminArea2", null);
                }
                postalAddress.setLocality(locality);
                String region = postalAddress.getRegion();
                if (region == null) {
                    region = tu.e(jSONObject, "adminArea1", null);
                }
                postalAddress.setRegion(region);
                postalAddressC = postalAddress;
            }
            if (postalAddressC != null) {
                return postalAddressC;
            }
        }
        return new PostalAddress();
    }

    public final PostalAddress c(JSONObject jSONObject) {
        zcp.c(jSONObject, "");
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.setRecipientName(tu.e(jSONObject, "name", ""));
        postalAddress.setPhoneNumber(tu.e(jSONObject, "phoneNumber", ""));
        postalAddress.setStreetAddress(tu.e(jSONObject, "address1", ""));
        postalAddress.setExtendedAddress(f50306b.a(jSONObject));
        postalAddress.setLocality(tu.e(jSONObject, "locality", ""));
        postalAddress.setRegion(tu.e(jSONObject, "administrativeArea", ""));
        postalAddress.setCountryCodeAlpha2(tu.e(jSONObject, "countryCode", ""));
        postalAddress.setPostalCode(tu.e(jSONObject, "postalCode", ""));
        postalAddress.setSortingCode(tu.e(jSONObject, "sortingCode", ""));
        return postalAddress;
    }

    private final String a(JSONObject jSONObject) {
        return zes.a((CharSequence) (tu.e(jSONObject, "address2", "") + '\n' + tu.e(jSONObject, "address3", "") + '\n' + tu.e(jSONObject, "address4", "") + '\n' + tu.e(jSONObject, "address5", ""))).toString();
    }
}
