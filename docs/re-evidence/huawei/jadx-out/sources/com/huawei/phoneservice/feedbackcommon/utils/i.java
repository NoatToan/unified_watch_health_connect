package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.huawei.hms.framework.common.Logger;
import com.huawei.phoneservice.faq.base.util.FaqRefectUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes13.dex */
public class i {
    public static String e(Context context, String str, String str2) {
        String str3;
        XmlResourceParser xml = context.getResources().getXml(e(context, FaqRefectUtils.ResType.RES_TYPE_XML, str2));
        try {
            if (xml == null) {
                return "";
            }
            try {
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        if (str.equals(xml.getAttributeName(0)) && "string".equals(name)) {
                            return xml.getAttributeValue(0);
                        }
                    }
                }
            } catch (IOException unused) {
                str3 = "getValueByAttributeName IOException";
                Logger.e("XmlUtil", str3);
            } catch (XmlPullParserException unused2) {
                str3 = "getValueByAttributeName XmlPullParserException ";
                Logger.e("XmlUtil", str3);
            } catch (Exception unused3) {
                str3 = "getValueByAttributeName Exception";
                Logger.e("XmlUtil", str3);
            }
            return "";
        } finally {
            xml.close();
        }
    }

    public static int e(Context context, FaqRefectUtils.ResType resType, String str) {
        try {
            return context.getResources().getIdentifier(str, resType.toString(), context.getPackageName());
        } catch (Exception e) {
            Logger.e("XmlUtil", e);
            return 0;
        }
    }
}
