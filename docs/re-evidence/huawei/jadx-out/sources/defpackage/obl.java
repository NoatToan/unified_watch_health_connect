package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes12.dex */
public class obl {
    public static obg a(Context context, String str) {
        return b(context, str, -1);
    }

    public static obg b(Context context, String str, int i) {
        if (context == null) {
            ocq.e("CarrierConfigResolveXml", "Get carrier config info from XML failed, context is null");
            return null;
        }
        if (str == null) {
            str = oco.d(context, i);
        }
        if (ocq.f44154c.booleanValue()) {
            ocq.e("CarrierConfigResolveXml", "CarrierConfigInfo resolveXML simoperator:" + str);
        }
        if (TextUtils.isEmpty(str)) {
            ocq.c("CarrierConfigResolveXml", "SimOperator is empty , card is missing or the context is null...");
            return null;
        }
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            StringBuffer stringBufferAppend = new StringBuffer("carrier_config_").append(str).append(WatchFaceConstant.XML_SUFFIX);
            if (xmlPullParserNewPullParser != null) {
                xmlPullParserNewPullParser.setInput(context.getAssets().open(stringBufferAppend.toString()), "utf-8");
            }
            return e(xmlPullParserNewPullParser);
        } catch (IOException | XmlPullParserException unused) {
            ocq.e("CarrierConfigResolveXml", "Get carrier config info from XML failed, an exception occured, maybe the card is not support multi-sim");
            return null;
        }
    }

    private static obg e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser != null) {
            obg obgVar = new obg();
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2 && !"carrier_config".equals(xmlPullParser.getName())) {
                    if ("BindDevicesAndCardState".equals(xmlPullParser.getName())) {
                        obgVar.c(xmlPullParser.nextText());
                    } else if ("SignTimes".equals(xmlPullParser.getName())) {
                        obgVar.f(xmlPullParser.nextText());
                    } else if ("CDMURL".equals(xmlPullParser.getName())) {
                        obgVar.e(xmlPullParser.nextText());
                    } else if ("ESURL".equals(xmlPullParser.getName())) {
                        obgVar.j(xmlPullParser.nextText());
                    } else if ("BSFURL".equals(xmlPullParser.getName())) {
                        obgVar.b(xmlPullParser.nextText());
                    } else if ("DeleteProfile".equals(xmlPullParser.getName())) {
                        obgVar.a(xmlPullParser.nextText());
                    } else if ("AuthenType".equals(xmlPullParser.getName())) {
                        obgVar.d(xmlPullParser.nextText());
                    } else if ("SMDPURL".equals(xmlPullParser.getName())) {
                        obgVar.h(xmlPullParser.nextText());
                    } else if ("SupportedProtocol".equals(xmlPullParser.getName())) {
                        obgVar.i(xmlPullParser.nextText());
                    } else if ("NeedImsi".equals(xmlPullParser.getName())) {
                        obgVar.g(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            }
            return obgVar;
        }
        ocq.c("CarrierConfigResolveXml", "parser or config message is null");
        return null;
    }

    public static Map e(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (context == null) {
            ocq.e("CarrierConfigResolveXml", "Get carrier config HashMap from XML failed, context is null");
            return concurrentHashMap;
        }
        if (ocq.f44154c.booleanValue()) {
            ocq.e("CarrierConfigResolveXml", "resolveXMLToHashMap simOperator:" + str);
        }
        if (!TextUtils.isEmpty(str)) {
            InputStream inputStreamOpen = null;
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                inputStreamOpen = context.getAssets().open("hwcarrierconfig_" + str + WatchFaceConstant.XML_SUFFIX);
                if (xmlPullParserNewPullParser != null) {
                    xmlPullParserNewPullParser.setInput(inputStreamOpen, "utf-8");
                }
                return d(xmlPullParserNewPullParser);
            } catch (IOException | XmlPullParserException unused) {
                ocq.c("CarrierConfigResolveXml", "Get carrier config HashMap from XML failed");
                return concurrentHashMap;
            } finally {
                b(inputStreamOpen);
            }
        }
        return concurrentHashMap;
    }

    private static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                ocq.c("CarrierConfigResolveXml", "IOException in closing inputStream");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Map d(XmlPullParser xmlPullParser) {
        byte b2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (xmlPullParser != null) {
            try {
                int next = xmlPullParser.next();
                while (next != 1) {
                    if (next != 2) {
                        next = xmlPullParser.next();
                    } else if (NetworkService.Constants.CONFIG_SERVICE.equalsIgnoreCase(xmlPullParser.getName())) {
                        next = xmlPullParser.next();
                    } else if ("dict".equalsIgnoreCase(xmlPullParser.getName())) {
                        next = xmlPullParser.next();
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -1325958191:
                                if (!name.equals(SequenceDetailFieldConfig.DOUBLE)) {
                                    b2 = -1;
                                } else {
                                    b2 = 3;
                                }
                                break;
                            case -891985903:
                                if (!name.equals("string")) {
                                    b2 = -1;
                                } else {
                                    b2 = 0;
                                }
                                break;
                            case 104431:
                                if (!name.equals("int")) {
                                    b2 = -1;
                                } else {
                                    b2 = 1;
                                }
                                break;
                            case 3029738:
                                if (!name.equals("bool")) {
                                    b2 = -1;
                                } else {
                                    b2 = 2;
                                }
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            concurrentHashMap.put(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY), xmlPullParser.nextText());
                        } else if (b2 == 1) {
                            concurrentHashMap.put(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY), Integer.valueOf(Integer.parseInt(xmlPullParser.nextText().trim())));
                        } else if (b2 == 2) {
                            concurrentHashMap.put(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY), Boolean.valueOf(xmlPullParser.nextText().trim()));
                        } else if (b2 != 3) {
                            ocq.c("CarrierConfigResolveXml", "No unknown type for parse <" + xmlPullParser.getName() + HiDataFilter.DataFilterExpression.BIGGER_THAN);
                        } else {
                            concurrentHashMap.put(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY), Double.valueOf(xmlPullParser.nextText().trim()));
                        }
                        next = xmlPullParser.next();
                    }
                }
            } catch (Exception unused) {
                ocq.c("CarrierConfigResolveXml", "Get carrier config info from XML failed, an exception occured");
            }
        }
        return concurrentHashMap;
    }
}
