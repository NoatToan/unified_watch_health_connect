package com.huawei.hms.network.inner.utils;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class CheckConfigUtils {

    public static final class Constants {
        public static final String HTTP_1_1 = "http/1.1";
        public static final String HTTP_2 = "h2";
        public static final int MAX_CONNECTION_ATTEMPT_DELAY = 2000;
        public static final int MAX_DNS_RESULT_TTL = 86400;
        public static final int MAX_REQUEST_DISCRETE_TIME = 3000;
        public static final int MAX_RETRY_AFTER_TIME = 8000;
        public static final int MAX_RETRY_WAITING_TIME = 8000;
        public static final int MIN_CALL_TIMEOUT = 20;
        public static final int MIN_CONNECTION_ATTEMPT_DELAY = 100;
        public static final int MIN_CONNECT_TIMEOUT = 1000;
        public static final int MIN_DNS_RESULT_TTL = 60;
        public static final int ZERO = 0;
    }

    public static boolean isValidProtocols(String str) {
        String[] strArrSplit = str.replace("[", "").replace("]", "").split(",");
        if (strArrSplit.length > 2) {
            return false;
        }
        for (String str2 : strArrSplit) {
            String strTrim = str2.trim();
            if (!Constants.HTTP_1_1.equalsIgnoreCase(strTrim) && !Constants.HTTP_2.equalsIgnoreCase(strTrim)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).keys().hasNext();
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean isBoolean(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.trim().equalsIgnoreCase("false") || str.trim().equalsIgnoreCase("true");
    }

    /* JADX WARN: Code duplicated, block: B:163:0x01e5 A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean checkIsCorrect(String str, Object obj) {
        byte b2;
        String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
        str.hashCode();
        switch (str.hashCode()) {
            case -2109981599:
                b2 = !str.equals("core_write_timeout") ? (byte) -1 : (byte) 0;
                break;
            case -2031506344:
                b2 = !str.equals("core_read_timeout") ? (byte) -1 : (byte) 1;
                break;
            case -1811966503:
                b2 = !str.equals("core_enable_plaintext_url_path") ? (byte) -1 : (byte) 2;
                break;
            case -1572121518:
                b2 = !str.equals("core_ping_interval") ? (byte) -1 : (byte) 3;
                break;
            case -1262348183:
                b2 = !str.equals("core_connect_empty_body") ? (byte) -1 : (byte) 4;
                break;
            case -1257502875:
                b2 = !str.equals("core_enable_privacy_policy") ? (byte) -1 : (byte) 5;
                break;
            case -1185147479:
                b2 = !str.equals(PolicyNetworkService.ClientConstants.FOLLOW_REDIRECTS) ? (byte) -1 : (byte) 6;
                break;
            case -1045087210:
                b2 = !str.equals(PolicyNetworkService.ClientConstants.TRAFFIC_CLASS) ? (byte) -1 : (byte) 7;
                break;
            case -689784472:
                b2 = !str.equals(PolicyNetworkService.RequestConstants.MAX_REQUEST_DISCRETE_TIME) ? (byte) -1 : (byte) 8;
                break;
            case -516324064:
                b2 = !str.equals("core_call_timeout") ? (byte) -1 : (byte) 9;
                break;
            case -343912796:
                b2 = !str.equals("core_retry_time") ? (byte) -1 : (byte) 10;
                break;
            case -301427323:
                b2 = !str.equals(PolicyNetworkService.GlobalConstants.ENABLE_HTTPDNS) ? (byte) -1 : (byte) 11;
                break;
            case -283391380:
                b2 = !str.equals("core_connect_timeout") ? (byte) -1 : (byte) 12;
                break;
            case -101891586:
                b2 = !str.equals("core_enable_concurrent_connect") ? (byte) -1 : (byte) 13;
                break;
            case 24897867:
                b2 = !str.equals(PolicyNetworkService.GlobalConstants.CONNECT_KEEP_ALIVE_DURATION) ? (byte) -1 : (byte) 14;
                break;
            case 36667665:
                b2 = !str.equals(PolicyNetworkService.RequestConstants.MAX_RETRY_WAITING_TIME) ? (byte) -1 : (byte) 15;
                break;
            case 334958086:
                b2 = !str.equals("core_concurrent_connect_delay") ? (byte) -1 : (byte) 16;
                break;
            case 711202959:
                b2 = !str.equals(PolicyNetworkService.GlobalConstants.CONNECT_POOL_SIZE) ? (byte) -1 : (byte) 17;
                break;
            case 829138776:
                b2 = !str.equals("core_enable_alllink_delay_analysis") ? (byte) -1 : (byte) 18;
                break;
            case 963591750:
                b2 = !str.equals("core_metrics_data") ? (byte) -1 : (byte) 19;
                break;
            case 1221718978:
                b2 = !str.equals(PolicyNetworkService.RequestConstants.ENABLE_TRAFFIC_CONTROL_WITH_429) ? (byte) -1 : (byte) 20;
                break;
            case 1364016192:
                b2 = !str.equals(PolicyNetworkService.GlobalConstants.DNS_RESULT_TTL) ? (byte) -1 : Ascii.NAK;
                break;
            case 1706988163:
                b2 = !str.equals(PolicyNetworkService.GlobalConstants.ENABLE_IPV6) ? (byte) -1 : Ascii.SYN;
                break;
            case 1896258216:
                b2 = !str.equals("core_disable_weaknetwork_retry") ? (byte) -1 : Ascii.ETB;
                break;
            case 1920152635:
                b2 = !str.equals(PolicyNetworkService.ClientConstants.SUPPORT_PROTOCOLS) ? (byte) -1 : Ascii.CAN;
                break;
            case 1968870966:
                b2 = !str.equals(PolicyNetworkService.ClientConstants.FOLLOW_SSL_REDIRECTS) ? (byte) -1 : Ascii.EM;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 1:
            case 14:
            case 17:
                if (StringUtils.stringToInteger(strValueOf, -1) > 0) {
                    return true;
                }
                return false;
            case 2:
            case 4:
            case 5:
            case 6:
            case 11:
            case 13:
            case 18:
            case 20:
            case 22:
            case 23:
            case 25:
                if (isBoolean(strValueOf)) {
                    return true;
                }
                return false;
            case 3:
            case 10:
                if (StringUtils.stringToInteger(strValueOf, -1) >= 0) {
                    return true;
                }
                return false;
            case 7:
                int iStringToInteger = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger < 0 || iStringToInteger > 255) {
                    return false;
                }
                return true;
            case 8:
                int iStringToInteger2 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger2 < 0 || iStringToInteger2 > 3000) {
                    return false;
                }
                return true;
            case 9:
                int iStringToInteger3 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger3 == 0 || iStringToInteger3 >= 20) {
                    return true;
                }
                return false;
            case 12:
                if (StringUtils.stringToInteger(strValueOf, -1) >= 1000) {
                    return true;
                }
                return false;
            case 15:
                int iStringToInteger4 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger4 < 0 || iStringToInteger4 > 8000) {
                    return false;
                }
                return true;
            case 16:
                int iStringToInteger5 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger5 < 100 || iStringToInteger5 > 2000) {
                    return false;
                }
                return true;
            case 19:
                if (isMap(strValueOf)) {
                    return true;
                }
                return false;
            case 21:
                int iStringToInteger6 = StringUtils.stringToInteger(strValueOf, -1);
                if (iStringToInteger6 < 60 || iStringToInteger6 > 86400) {
                    return false;
                }
                return true;
            case 24:
                if (isValidProtocols(strValueOf)) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }
}
