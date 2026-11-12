package defpackage;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes15.dex */
public class pxd {
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    public void a(IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        ArrayList arrayList;
        FileInputStream fileInputStream;
        ArrayList arrayList2;
        FileInputStream fileInputStream2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        fileInputStream2 = null;
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                fileInputStream = new FileInputStream(new File(pxk.b("simInfo_mapping.xml")));
                try {
                    try {
                        xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
                        arrayList2 = null;
                        pxj pxjVar = null;
                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                            if (eventType != 2) {
                                if (eventType != 3) {
                                    try {
                                        LogUtil.d("SimInfoXmlParse", "parseXmlFile default event type");
                                    } catch (IOException unused) {
                                        arrayList3 = arrayList2;
                                        arrayList = arrayList3;
                                        fileInputStream2 = fileInputStream;
                                        LogUtil.e("SimInfoXmlParse", "parseXmlFile IOException");
                                        arrayList2 = arrayList;
                                        b(fileInputStream2);
                                        if (iBaseResponseCallback == null) {
                                            LogUtil.j("SimInfoXmlParse", "parseXmlFile callback is null.");
                                        } else {
                                            iBaseResponseCallback.a(0, arrayList2);
                                        }
                                    } catch (XmlPullParserException unused2) {
                                        arrayList4 = arrayList2;
                                        arrayList = arrayList4;
                                        fileInputStream2 = fileInputStream;
                                        LogUtil.e("SimInfoXmlParse", "parseXmlFile XmlPullParserException!");
                                        arrayList2 = arrayList;
                                        b(fileInputStream2);
                                        if (iBaseResponseCallback == null) {
                                            LogUtil.j("SimInfoXmlParse", "parseXmlFile callback is null.");
                                        } else {
                                            iBaseResponseCallback.a(0, arrayList2);
                                        }
                                    }
                                } else if ("dict".equals(xmlPullParserNewPullParser.getName()) && arrayList2 != null && pxjVar != null) {
                                    arrayList2.add(pxjVar);
                                    pxjVar = null;
                                }
                            } else if (!"array".equals(xmlPullParserNewPullParser.getName())) {
                                if ("dict".equals(xmlPullParserNewPullParser.getName())) {
                                    pxjVar = new pxj();
                                } else if (!"string".equals(xmlPullParserNewPullParser.getName())) {
                                    LogUtil.d("SimInfoXmlParse", "parseXmlFile else branch");
                                } else {
                                    d(xmlPullParserNewPullParser, pxjVar);
                                }
                            } else {
                                arrayList2 = new ArrayList(16);
                            }
                        }
                        b(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        b(fileInputStream);
                        throw th;
                    }
                } catch (IOException unused3) {
                } catch (XmlPullParserException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException unused5) {
            arrayList = null;
        } catch (XmlPullParserException unused6) {
            arrayList = null;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.j("SimInfoXmlParse", "parseXmlFile callback is null.");
        } else {
            iBaseResponseCallback.a(0, arrayList2);
        }
    }

    private void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("SimInfoXmlParse", "closeStream inputStream close IOException");
            }
        }
    }

    private void d(XmlPullParser xmlPullParser, pxj pxjVar) {
        if (pxjVar == null) {
            LogUtil.j("SimInfoXmlParse", "processXmlTag simRuleInfo is null");
            return;
        }
        try {
            if ("mcc_mnc".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText)) {
                    return;
                }
                pxjVar.d(strNextText);
                return;
            }
            if ("operator_key".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText2 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText2)) {
                    return;
                }
                pxjVar.j(strNextText2);
                return;
            }
            if ("operator_name".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText3 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText3)) {
                    return;
                }
                pxjVar.g(strNextText3);
                return;
            }
            if ("rule_id".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText4 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText4)) {
                    return;
                }
                pxjVar.a(a(strNextText4));
                return;
            }
            e(xmlPullParser, pxjVar);
        } catch (IOException unused) {
            LogUtil.e("SimInfoXmlParse", "processXmlTag IOException");
        } catch (XmlPullParserException unused2) {
            LogUtil.e("SimInfoXmlParse", "processXmlTag XmlPullParserException");
        }
    }

    private void e(XmlPullParser xmlPullParser, pxj pxjVar) {
        try {
            if ("gid1".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText)) {
                    return;
                }
                pxjVar.c(strNextText);
                return;
            }
            if ("gid1_mask".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText2 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText2)) {
                    return;
                }
                pxjVar.e(strNextText2);
                return;
            }
            if ("spn".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText3 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText3)) {
                    return;
                }
                pxjVar.f(strNextText3);
                return;
            }
            if ("imsi".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText4 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText4)) {
                    return;
                }
                pxjVar.b(strNextText4);
                return;
            }
            if (!"iccid".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                LogUtil.d("SimInfoXmlParse", "processXmlOtherTag else branch");
                return;
            }
            String strNextText5 = xmlPullParser.nextText();
            if (TextUtils.isEmpty(strNextText5)) {
                return;
            }
            pxjVar.a(strNextText5);
        } catch (IOException unused) {
            LogUtil.e("SimInfoXmlParse", "processXmlOtherTag IOException");
        } catch (XmlPullParserException unused2) {
            LogUtil.e("SimInfoXmlParse", "processXmlOtherTag XmlPullParserException");
        }
    }

    private int a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SimInfoXmlParse", "hexStringToInt hexString is empty");
            return 0;
        }
        if (str.startsWith("0X") || str.startsWith("0x")) {
            str = str.substring(2);
        }
        if (!str.matches("[0-9a-fA-F]+")) {
            LogUtil.j("SimInfoXmlParse", "hexStringToInt hexString is not matches");
            return 0;
        }
        try {
            return new BigInteger(str, 16).intValue();
        } catch (NumberFormatException unused) {
            LogUtil.e("SimInfoXmlParse", "hexStringToInt NumberFormatException");
            return 0;
        }
    }
}
