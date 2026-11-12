package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.webview.WebViewActivity;
import com.huawei.ui.homewear21.home.bean.WearHomeXmlParseBean;
import com.huawei.ui.homewear21.home.legal.EnterprisePrivacyActivity;
import com.huawei.ui.homewear21.home.legal.WearHomeOpenBaseServiceActivity;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.io.FileUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes18.dex */
public class tpd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f49486c;
    private static List<rbq> d = new ArrayList(10);
    private static List<rbg> e;

    public static void b(String str, String str2, Context context) {
        if (TextUtils.isEmpty(str) || str2 == null || context == null) {
            LogUtil.j("LegalInformationUtils", " title : context is null:");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", "file:" + str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 7);
        intent.putExtra("WebViewActivity.TITLE", str2);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("LegalInformationUtils", "jumpWebView ActivityNotFoundException");
        }
    }

    public static void e(Context context, String str, String str2, String str3, int i, String str4) {
        if (context == null || str == null) {
            LogUtil.j("LegalInformationUtils", "context and url is null");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) ServiceItemActivity.class);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("device_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("device_name", str3);
        }
        intent.putExtra("Agreement_key", str);
        intent.putExtra("product_type", i);
        if (!TextUtils.isEmpty(str4)) {
            intent.putExtra("wear_legal_come_from", str4);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("LegalInformationUtils", "goServiceItemActivity ActivityNotFoundException");
        }
    }

    public static void d(Context context, int i, int i2) {
        if (context == null) {
            LogUtil.j("LegalInformationUtils", "context is null");
            return;
        }
        if (i == 3) {
            Intent intent = new Intent(context, (Class<?>) WearHomeOpenBaseServiceActivity.class);
            try {
                intent.putExtra("device_version_type", i2);
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("LegalInformationUtils", "goServiceStatement ActivityNotFoundException");
                return;
            }
        }
        if (i != 10) {
            LogUtil.j("LegalInformationUtils", "jumpType is ", Integer.valueOf(i));
            return;
        }
        try {
            context.startActivity(new Intent(context, (Class<?>) EnterprisePrivacyActivity.class));
        } catch (ActivityNotFoundException unused2) {
            LogUtil.e("LegalInformationUtils", "goServiceStatement ActivityNotFoundException");
        }
    }

    public static List<rbg> e(String str, int i, String str2) {
        qug.e(i, str2);
        d.clear();
        String[] strArrA = qug.a();
        f49486c = strArrA;
        for (String str3 : strArrA) {
            e(str3, str);
        }
        List<rbg> listE = new rbf().e(d);
        e = listE;
        return listE;
    }

    private static void e(String str, String str2) {
        rbq rbqVarA = qug.a(str, str2);
        if (!TextUtils.isEmpty(rbqVarA.a())) {
            d.add(rbqVarA);
        } else {
            LogUtil.j("LegalInformationUtils", "featureId", str);
        }
    }

    public static ArrayList<WearHomeXmlParseBean> d(String str) {
        File[] fileArrListFiles = new File(str).listFiles();
        ArrayList<WearHomeXmlParseBean> arrayList = new ArrayList<>(16);
        if (fileArrListFiles == null) {
            LogUtil.j("LegalInformationUtils", "mFiles is null");
            return arrayList;
        }
        for (File file : fileArrListFiles) {
            if (!file.isFile()) {
                LogUtil.a("LegalInformationUtils", 0, "is not File");
            } else {
                String strC = CommonUtil.c(file.getPath());
                if (!TextUtils.isEmpty(strC) && file.getName().endsWith(WatchFaceConstant.XML_SUFFIX)) {
                    return e(strC);
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<WearHomeXmlParseBean> e(String str) {
        ArrayList<WearHomeXmlParseBean> arrayList = new ArrayList<>(16);
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBuilderFactoryNewInstance.setValidating(true);
        } catch (ParserConfigurationException unused) {
            LogUtil.e("LegalInformationUtils", "ParserConfigurationException");
        }
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
            String strC = CommonUtil.c(str);
            if (strC != null) {
                fileInputStreamOpenInputStream = FileUtils.openInputStream(FileUtils.getFile(strC));
                d(arrayList, documentBuilderNewDocumentBuilder.parse(fileInputStreamOpenInputStream).getDocumentElement().getElementsByTagName("app"));
            }
        } catch (SAXException unused2) {
            LogUtil.e("LegalInformationUtils", "SAXException");
        } catch (IOException unused3) {
            LogUtil.e("LegalInformationUtils", "IOException");
        } catch (ParserConfigurationException unused4) {
            LogUtil.e("LegalInformationUtils", "ParserConfigurationException");
        } finally {
            if (fileInputStreamOpenInputStream != null) {
                try {
                    fileInputStreamOpenInputStream.close();
                } catch (IOException unused5) {
                    LogUtil.e("LegalInformationUtils", "close IOException");
                }
            }
        }
        return arrayList;
    }

    private static void d(ArrayList<WearHomeXmlParseBean> arrayList, NodeList nodeList) {
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            WearHomeXmlParseBean wearHomeXmlParseBean = new WearHomeXmlParseBean();
            if (nodeList.item(i) instanceof Element) {
                e(nodeList, wearHomeXmlParseBean, i);
            }
            arrayList.add(wearHomeXmlParseBean);
        }
    }

    private static void e(NodeList nodeList, WearHomeXmlParseBean wearHomeXmlParseBean, int i) {
        NodeList childNodes = ((Element) nodeList.item(i)).getChildNodes();
        int length = childNodes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            Node nodeItem = childNodes.item(i2);
            String nodeName = nodeItem.getNodeName();
            nodeName.hashCode();
            if (nodeName.equals("file-name")) {
                wearHomeXmlParseBean.setValueName(nodeItem.getTextContent());
            } else if (nodeName.equals("name")) {
                wearHomeXmlParseBean.setXmlName(nodeItem.getTextContent());
            } else {
                LogUtil.j("LegalInformationUtils", "xml is default");
            }
        }
    }
}
