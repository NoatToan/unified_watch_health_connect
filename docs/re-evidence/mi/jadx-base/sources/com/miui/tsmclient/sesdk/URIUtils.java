package com.miui.tsmclient.sesdk;

import android.net.Uri;
import android.text.TextUtils;
import com.miui.tsmclient.sesdk.tsmsdkcard.ICCOADigitalKeyParamInfo;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class URIUtils {
    public static String getBrandID(Uri uri) {
        String queryParameter = uri.getQueryParameter("vehicleId");
        String strSubstring = !TextUtils.isEmpty(queryParameter) ? queryParameter.substring(0, 4) : null;
        String queryParameter2 = uri.getQueryParameter(SDKConstants.KEY_BRAND_ID);
        if (strSubstring == null || queryParameter2 == null) {
            return queryParameter2;
        }
        return strSubstring + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + queryParameter2;
    }

    public static String getCardFace(Uri uri) {
        return uri.getQueryParameter(SDKConstants.KEY_CARD_FACE);
    }

    public static String getICCOAIssueParams(Uri uri) {
        String queryParameter = uri.getQueryParameter("friendlyName");
        String queryParameter2 = uri.getQueryParameter("sessionId");
        String queryParameter3 = uri.getQueryParameter("vehicleId");
        String queryParameter4 = uri.getQueryParameter("shareId");
        ICCOADigitalKeyParamInfo.Builder wirelessCapabilities = new ICCOADigitalKeyParamInfo.Builder().setFriendlyName(queryParameter).setVehicleId(queryParameter3).setFriendSessionID(queryParameter2).setShareID(queryParameter4).setBrandID(uri.getQueryParameter(SDKConstants.KEY_BRAND_ID)).setWirelessCapabilities(uri.getQueryParameter("technology"));
        String queryParameter5 = uri.getQueryParameter(SDKConstants.SOURCE_TYPE);
        if (!TextUtils.isEmpty(queryParameter5)) {
            wirelessCapabilities.setSourceType(Integer.parseInt(queryParameter5));
        }
        return wirelessCapabilities.build().toString();
    }

    public static String getMailboxID(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.get(pathSegments.size() - 1);
    }

    public static String getBrandID(String str) {
        return getBrandID(Uri.parse(Uri.decode(str)));
    }

    public static String getCardFace(String str) {
        return getCardFace(Uri.parse(Uri.decode(str)));
    }

    public static String getICCOAIssueParams(String str) {
        return getICCOAIssueParams(Uri.parse(Uri.decode(str)));
    }

    public static String getMailboxID(String str) {
        return getMailboxID(Uri.parse(Uri.decode(str)));
    }
}
