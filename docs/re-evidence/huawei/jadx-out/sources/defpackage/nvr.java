package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes11.dex */
public class nvr {
    public static num a(InputStream inputStream, num numVar) {
        if (inputStream != null && numVar != null) {
            ArrayList arrayList = new ArrayList();
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(inputStream, "UTF-8");
                num numVar2 = null;
                String strNextText = "";
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("file".equalsIgnoreCase(name)) {
                            LogUtil.d("BuildFileListXmlUtil", "enter file!!!");
                            num numVar3 = new num();
                            numVar3.i(strNextText);
                            numVar2 = numVar3;
                        } else if ("name".equalsIgnoreCase(name)) {
                            strNextText = xmlPullParserNewPullParser.nextText();
                        } else {
                            e(name, xmlPullParserNewPullParser, numVar2);
                        }
                    } else if (eventType == 3 && "file".equalsIgnoreCase(name) && numVar2 != null) {
                        arrayList.add(numVar2);
                    }
                }
            } catch (IOException e) {
                LogUtil.e("BuildFileListXmlUtil", "buildFileListXml, IOException", e.getMessage());
            } catch (XmlPullParserException e2) {
                LogUtil.e("BuildFileListXmlUtil", "buildFileListXml, XmlPullParserException", e2.getMessage());
            } catch (Exception unused) {
                LogUtil.e("BuildFileListXmlUtil", "buildFileListXml, Exception");
            }
            b(numVar, arrayList);
            LogUtil.a("BuildFileListXmlUtil", "buildFileListXml end newVersionInfo=", numVar.toString());
        }
        return numVar;
    }

    private static void e(String str, XmlPullParser xmlPullParser, num numVar) throws XmlPullParserException, IOException {
        a(str, xmlPullParser, numVar);
        d(str, xmlPullParser, numVar);
    }

    private static void d(String str, XmlPullParser xmlPullParser, num numVar) throws XmlPullParserException, IOException {
        if (numVar != null) {
            b(str, xmlPullParser, numVar);
            c(str, xmlPullParser, numVar);
        }
    }

    private static void b(String str, XmlPullParser xmlPullParser, num numVar) throws XmlPullParserException, IOException {
        if ("packageName".equalsIgnoreCase(str)) {
            numVar.n(xmlPullParser.nextText());
            return;
        }
        if ("versionName".equalsIgnoreCase(str)) {
            numVar.q(xmlPullParser.nextText());
        } else if ("versionCode".equalsIgnoreCase(str)) {
            numVar.t(xmlPullParser.nextText());
        } else {
            LogUtil.j("BuildFileListXmlUtil", "setPackageAndVersion unknown node: ", str);
        }
    }

    private static void c(String str, XmlPullParser xmlPullParser, num numVar) throws XmlPullParserException, IOException {
        if ("versionType".equalsIgnoreCase(str)) {
            numVar.u(xmlPullParser.nextText());
        } else if ("osVersion".equalsIgnoreCase(str)) {
            numVar.m(xmlPullParser.nextText());
        } else {
            LogUtil.j("BuildFileListXmlUtil", "setPartApplicationInfo unknown node: ", str);
        }
    }

    private static void a(String str, XmlPullParser xmlPullParser, num numVar) throws XmlPullParserException, IOException {
        if (numVar != null) {
            if ("spath".equalsIgnoreCase(str)) {
                numVar.k(xmlPullParser.nextText());
                return;
            }
            if ("dpath".equalsIgnoreCase(str)) {
                numVar.b(xmlPullParser.nextText());
                return;
            }
            if ("md5".equalsIgnoreCase(str)) {
                numVar.j(xmlPullParser.nextText());
                return;
            }
            if ("newmd5".equalsIgnoreCase(str)) {
                numVar.f(xmlPullParser.nextText());
                return;
            }
            if ("sha256".equalsIgnoreCase(str)) {
                numVar.l(xmlPullParser.nextText());
            } else if ("newsize".equalsIgnoreCase(str)) {
                numVar.a(Long.parseLong(xmlPullParser.nextText()));
            } else if ("size".equalsIgnoreCase(str)) {
                numVar.b(Long.parseLong(xmlPullParser.nextText()));
            }
        }
    }

    private static void b(num numVar, ArrayList<num> arrayList) {
        int size = arrayList.size();
        LogUtil.a("BuildFileListXmlUtil", "makeList size=", Integer.valueOf(size));
        for (int i = 0; i < size; i++) {
            num numVar2 = arrayList.get(i);
            if (numVar2 != null && !TextUtils.isEmpty(numVar2.t())) {
                LogUtil.a("BuildFileListXmlUtil", "makeList appInfo = ", numVar2);
                if (numVar2.t().endsWith(".apk") || numVar2.t().endsWith(".delta") || numVar2.t().endsWith(".zip")) {
                    numVar.i(numVar2.k());
                    numVar.k(numVar2.t());
                    numVar.b(numVar2.i());
                    numVar.j(numVar2.h());
                    numVar.f(numVar2.o());
                    numVar.l(numVar2.r());
                    numVar.b(numVar2.b());
                    numVar.a(numVar2.m());
                    numVar.n(numVar2.q());
                    numVar.q(numVar2.y());
                    numVar.t(numVar2.v());
                    numVar.p(numVar2.u());
                    numVar.u(numVar2.aa());
                    numVar.m(numVar2.n());
                    LogUtil.a("BuildFileListXmlUtil", "makeList find apk! ", numVar.toString());
                    return;
                }
            }
        }
    }
}
