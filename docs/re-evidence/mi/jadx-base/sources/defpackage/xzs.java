package defpackage;

import com.amap.api.col.p0003sl.ic;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.amap.api.services.core.AMapException;
import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;
import java.util.List;
import miuix.preference.flexible.PreferenceMarkLevel;
import miuix.preference.flexible.RadioButtonPreferenceTemplate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class xzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f39630a = {"com.amap.api.trace", "com.amap.api.trace.core"};

    public static int a(List<LatLng> list) {
        int i = 0;
        if (list == null || list.size() == 0) {
            return 0;
        }
        int iCalculateLineDistance = 0;
        while (i < list.size() - 1) {
            LatLng latLng = list.get(i);
            i++;
            LatLng latLng2 = list.get(i);
            if (latLng == null || latLng2 == null) {
                break;
            }
            iCalculateLineDistance = (int) (iCalculateLineDistance + AMapUtils.calculateLineDistance(latLng, latLng2));
        }
        return iCalculateLineDistance;
    }

    public static void b(int i, String str) throws ic {
        if (i != 0) {
            switch (i) {
                case 10000:
                    return;
                case 10001:
                    throw new ic(AMapException.AMAP_INVALID_USER_KEY);
                case 10002:
                    throw new ic(AMapException.AMAP_SERVICE_NOT_AVAILBALE);
                case 10003:
                    throw new ic(AMapException.AMAP_DAILY_QUERY_OVER_LIMIT);
                case 10004:
                    throw new ic(AMapException.AMAP_ACCESS_TOO_FREQUENT);
                case 10005:
                    throw new ic(AMapException.AMAP_INVALID_USER_IP);
                case 10006:
                    throw new ic(AMapException.AMAP_INVALID_USER_DOMAIN);
                case 10007:
                    throw new ic("用户签名未通过");
                case 10008:
                    throw new ic(AMapException.AMAP_INVALID_USER_SCODE);
                case 10009:
                    throw new ic(AMapException.AMAP_USERKEY_PLAT_NOMATCH);
                case 10010:
                    throw new ic(AMapException.AMAP_IP_QUERY_OVER_LIMIT);
                case MiSportImportUtilKt.REQUEST_CODE /* 10011 */:
                    throw new ic(AMapException.AMAP_NOT_SUPPORT_HTTPS);
                case 10012:
                    throw new ic(AMapException.AMAP_INSUFFICIENT_PRIVILEGES);
                case 10013:
                    throw new ic(AMapException.AMAP_USER_KEY_RECYCLED);
                default:
                    switch (i) {
                        case ErrorCode.ERROR_CODE_INVALID_PARAM /* 20000 */:
                            throw new ic(AMapException.AMAP_SERVICE_INVALID_PARAMS);
                        case PreferenceMarkLevel.LEVEL_LARGE_ONLY_TITLE /* 20001 */:
                            throw new ic(AMapException.AMAP_SERVICE_MISSING_REQUIRED_PARAMS);
                        case PreferenceMarkLevel.LEVEL_LARGE_ONLY_SUMMARY /* 20002 */:
                            throw new ic(AMapException.AMAP_SERVICE_ILLEGAL_REQUEST);
                        case 20003:
                            throw new ic(AMapException.AMAP_SERVICE_UNKNOWN_ERROR);
                        default:
                            switch (i) {
                                case 30000:
                                    throw new ic(AMapException.AMAP_ENGINE_RESPONSE_ERROR);
                                case RadioButtonPreferenceTemplate.LEVEL_NORMAL_RADIO_BUTTON_FULL /* 30001 */:
                                    throw new ic(AMapException.AMAP_ENGINE_RESPONSE_DATA_ERROR);
                                case RadioButtonPreferenceTemplate.LEVEL_NORMAL_RADIO_BUTTON_ONLY_TITLE /* 30002 */:
                                    throw new ic(AMapException.AMAP_ENGINE_CONNECT_TIMEOUT);
                                case RadioButtonPreferenceTemplate.LEVEL_NORMAL_RADIO_BUTTON_ONLY_SUMMARY /* 30003 */:
                                    throw new ic(AMapException.AMAP_ENGINE_RETURN_TIMEOUT);
                                default:
                                    throw new ic(str);
                            }
                    }
            }
        }
    }

    public static void c(String str) throws ic {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(CommonConstants.KEY_ERR_CODE)) {
                b(jSONObject.getInt(CommonConstants.KEY_ERR_CODE), jSONObject.getString("errmsg"));
                return;
            }
            if (jSONObject.has("status") && jSONObject.has("infocode")) {
                String string = jSONObject.getString("status");
                int i = jSONObject.getInt("infocode");
                if ("1".equals(string)) {
                    return;
                }
                String string2 = jSONObject.getString("info");
                if ("0".equals(string)) {
                    b(i, string2);
                }
            }
        } catch (JSONException unused) {
            throw new ic("协议解析错误 - ProtocolException");
        }
    }
}
