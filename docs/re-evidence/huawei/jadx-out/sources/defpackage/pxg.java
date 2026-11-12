package defpackage;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes15.dex */
public class pxg {
    /* JADX WARN: Code duplicated, block: B:44:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    public void e(IBaseResponseCallback iBaseResponseCallback) throws Throwable {
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
                fileInputStream = new FileInputStream(new File(pxk.b("esim_open_method.xml")));
                try {
                    try {
                        xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
                        arrayList2 = null;
                        pxe pxeVar = null;
                        for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                            if (eventType != 2) {
                                if (eventType != 3) {
                                    try {
                                        LogUtil.d("EsimOpenMethodXmlParse", "parseXmlFile default event type");
                                    } catch (IOException unused) {
                                        arrayList3 = arrayList2;
                                        arrayList = arrayList3;
                                        fileInputStream2 = fileInputStream;
                                        LogUtil.e("EsimOpenMethodXmlParse", "parseXmlFile IOException");
                                        arrayList2 = arrayList;
                                        a(fileInputStream2);
                                        if (iBaseResponseCallback == null) {
                                            LogUtil.j("EsimOpenMethodXmlParse", "parseXmlFile callback is null");
                                        } else {
                                            iBaseResponseCallback.a(0, arrayList2);
                                        }
                                    } catch (XmlPullParserException unused2) {
                                        arrayList4 = arrayList2;
                                        arrayList = arrayList4;
                                        fileInputStream2 = fileInputStream;
                                        LogUtil.e("EsimOpenMethodXmlParse", "parseXmlFile XmlPullParserException!");
                                        arrayList2 = arrayList;
                                        a(fileInputStream2);
                                        if (iBaseResponseCallback == null) {
                                            LogUtil.j("EsimOpenMethodXmlParse", "parseXmlFile callback is null");
                                        } else {
                                            iBaseResponseCallback.a(0, arrayList2);
                                        }
                                    }
                                } else if ("dict".equals(xmlPullParserNewPullParser.getName()) && arrayList2 != null && pxeVar != null) {
                                    arrayList2.add(pxeVar);
                                    pxeVar = null;
                                }
                            } else if (!"array".equals(xmlPullParserNewPullParser.getName())) {
                                if ("dict".equals(xmlPullParserNewPullParser.getName())) {
                                    pxeVar = new pxe();
                                } else if (!"string".equals(xmlPullParserNewPullParser.getName())) {
                                    LogUtil.d("EsimOpenMethodXmlParse", "parseXmlFile else branch");
                                } else {
                                    e(xmlPullParserNewPullParser, pxeVar);
                                }
                            } else {
                                arrayList2 = new ArrayList(16);
                            }
                        }
                        a(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        a(fileInputStream);
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
            LogUtil.j("EsimOpenMethodXmlParse", "parseXmlFile callback is null");
        } else {
            iBaseResponseCallback.a(0, arrayList2);
        }
    }

    private void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("EsimOpenMethodXmlParse", "closeInputStream inputStream close IOException");
            }
        }
    }

    private void e(XmlPullParser xmlPullParser, pxe pxeVar) {
        if (pxeVar == null) {
            LogUtil.j("EsimOpenMethodXmlParse", "processXmlTag esimOpenMethod is null");
            return;
        }
        try {
            if ("open_method".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText)) {
                    return;
                }
                pxeVar.a(strNextText);
                return;
            }
            if ("operator_key".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText2 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText2)) {
                    return;
                }
                pxeVar.c(strNextText2);
                return;
            }
            if ("operator_name".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText3 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText3)) {
                    return;
                }
                pxeVar.b(strNextText3);
                return;
            }
            if ("open_url".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText4 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText4)) {
                    return;
                }
                pxeVar.d(strNextText4);
                return;
            }
            if ("query_url".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText5 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText5)) {
                    return;
                }
                pxeVar.i(strNextText5);
                return;
            }
            a(xmlPullParser, pxeVar);
        } catch (IOException unused) {
            LogUtil.e("EsimOpenMethodXmlParse", "processXmlTag IOException");
        } catch (XmlPullParserException unused2) {
            LogUtil.e("EsimOpenMethodXmlParse", "processXmlTag XmlPullParserException");
        }
    }

    private void a(XmlPullParser xmlPullParser, pxe pxeVar) {
        try {
            if ("default_url".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText)) {
                    return;
                }
                pxeVar.e(strNextText);
                return;
            }
            if ("auth_method".equals(xmlPullParser.getAttributeValue(null, MedalConstants.EVENT_KEY))) {
                String strNextText2 = xmlPullParser.nextText();
                if (TextUtils.isEmpty(strNextText2)) {
                    return;
                }
                pxeVar.c(Integer.parseInt(strNextText2));
                return;
            }
            LogUtil.d("EsimOpenMethodXmlParse", "processOtherXmlTag else branch");
        } catch (IOException unused) {
            LogUtil.e("EsimOpenMethodXmlParse", "processOtherXmlTag IOException");
        } catch (NumberFormatException unused2) {
            LogUtil.e("EsimOpenMethodXmlParse", "processOtherXmlTag NumberFormatException");
        } catch (XmlPullParserException unused3) {
            LogUtil.e("EsimOpenMethodXmlParse", "processOtherXmlTag XmlPullParserException");
        }
    }
}
