package mj2;

import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmj2/c;", "", "<init>", "()V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f119091a = new c();

    private c() {
    }

    public static String a(fj2.a aVar) {
        aVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        String city = aVar.getCity();
        if (city != null && city.length() != 0) {
            sb3.append(aVar.getCity());
            sb3.append(StringUtils.SPACE);
        }
        String stateOrProvince = aVar.getStateOrProvince();
        if (stateOrProvince != null && stateOrProvince.length() != 0) {
            sb3.append(aVar.getStateOrProvince());
            sb3.append(StringUtils.SPACE);
        }
        String postalCode = aVar.getPostalCode();
        if (postalCode != null && postalCode.length() != 0) {
            sb3.append(aVar.getPostalCode());
            sb3.append(StringUtils.SPACE);
        }
        String str = aVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
        if (str != null && str.length() != 0) {
            sb3.append(aVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String());
            sb3.append(StringUtils.SPACE);
        }
        return sb3.toString();
    }
}
