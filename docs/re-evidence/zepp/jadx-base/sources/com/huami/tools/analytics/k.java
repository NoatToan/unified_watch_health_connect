package com.huami.tools.analytics;

import com.huami.tools.analytics.internal.utils.JavaUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
class k {
    private static final String a = "HmStat-EventValidator";

    public static boolean a(Event event) {
        if (event == null) {
            return true;
        }
        if (JavaUtils.isEmpty(event.getCom.huami.tools.analytics.DbUtils.Const.Columns.Event.EVENT_ID java.lang.String())) {
            p.b().w(a, String.format(Locale.CHINA, "缺少事件id, %s", event.getBasicInfo()));
            return true;
        }
        if (JavaUtils.isEmpty(event.getType())) {
            p.b().w(a, String.format(Locale.CHINA, "缺少事件类型, %s", event.getBasicInfo()));
            return true;
        }
        if (event.getTimestamp() == null) {
            p.b().w(a, String.format(Locale.CHINA, "缺少事件发生的时间, %s", event.getBasicInfo()));
            return true;
        }
        if (String.valueOf(event.getTimestamp()).length() != 13) {
            p.b().w(a, String.format(Locale.CHINA, "事件发生的时间戳数字个数错误, %s", event.getBasicInfo()));
            return true;
        }
        if (event.getTimezone() == null) {
            p.b().w(a, String.format(Locale.CHINA, "缺少事件发生的时间所对应的时区, %s", event.getBasicInfo()));
            return true;
        }
        if (event.getStringValue() != null && !event.getStringValue().isEmpty() && event.getStringValue().length() >= 1048576) {
            p.b().w(a, String.format(Locale.CHINA, "事件字符串取值过大, %s", event.getBasicInfo()));
            return true;
        }
        if (event.getMultipleValue() != null && !event.getMultipleValue().isEmpty()) {
            try {
                if (new JSONObject(event.getMultipleValue()).toString().length() >= 1048576) {
                    p.b().w(a, String.format(Locale.CHINA, "事件的多参值过大, %s", event.getBasicInfo()));
                    return true;
                }
            } catch (Exception e) {
                p.b().w(a, e, String.format(Locale.CHINA, "事件的多参值存在错误, %s", event.getBasicInfo()));
            }
        }
        return false;
    }
}
