package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes7.dex */
public class emm {
    public static void d(DocumentBuilderFactory documentBuilderFactory) throws ParserConfigurationException {
        if (documentBuilderFactory == null) {
            LogUtil.a("XmlUtil", "setFeature builderFactory is null");
            return;
        }
        documentBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        documentBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        documentBuilderFactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        documentBuilderFactory.setValidating(true);
    }

    public static String a(String str, String str2, String str3, String str4) throws Throwable {
        File file = new File(str2);
        String strC = null;
        File[] fileArrListFiles = (file.exists() && file.isDirectory()) ? file.listFiles() : null;
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            String strReplace = file2.getName().replace("strings", "").replace(WatchFaceConstant.XML_SUFFIX, "");
            if (strReplace.contains(str4)) {
                if (strReplace.contains(str3)) {
                    return c(d(file2), str);
                }
                if (strC == null) {
                    strC = c(d(file2), str);
                }
            }
        }
        return strC == null ? c(d(fileArrListFiles[fileArrListFiles.length - 1]), str) : strC;
    }

    private static String d(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            LogUtil.e("XmlUtil", "IOException");
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x004a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:18:0x004a */
    public static String c(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                xmlPullParserFactoryNewInstance.setNamespaceAware(true);
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                fileInputStream = new FileInputStream(str);
                try {
                    xmlPullParserNewPullParser.setInput(fileInputStream, "UTF-8");
                    String strD = d(xmlPullParserNewPullParser, str2);
                    FileUtils.a(fileInputStream);
                    return strD;
                } catch (FileNotFoundException unused) {
                    LogUtil.e("XmlUtil", "not find xml file");
                    FileUtils.a(fileInputStream);
                    return null;
                } catch (IOException unused2) {
                    LogUtil.e("XmlUtil", "not read text");
                    FileUtils.a(fileInputStream);
                    return null;
                } catch (XmlPullParserException unused3) {
                    LogUtil.e("XmlUtil", "xml pull error");
                    FileUtils.a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                FileUtils.a(closeable2);
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            fileInputStream = null;
        } catch (IOException unused5) {
            fileInputStream = null;
        } catch (XmlPullParserException unused6) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            FileUtils.a(closeable2);
            throw th;
        }
    }

    private static String d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String strA = null;
        while (eventType != 1) {
            strA = a(xmlPullParser, str, eventType);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            eventType = xmlPullParser.next();
        }
        return strA;
    }

    private static String a(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        if (i == 2 && "string".equals(xmlPullParser.getName())) {
            return c(str, xmlPullParser, xmlPullParser.getAttributeCount());
        }
        return null;
    }

    private static String c(String str, XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        if (i == 1 && str.equals(xmlPullParser.getAttributeValue(0))) {
            return xmlPullParser.nextText();
        }
        return null;
    }
}
