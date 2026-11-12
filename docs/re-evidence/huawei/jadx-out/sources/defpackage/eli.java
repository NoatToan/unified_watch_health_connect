package defpackage;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.common.base.Ascii;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.watchface.videoedit.gles.Constant;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import ohos.ace.plugin.wifimanager.WifiDeviceUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes7.dex */
public class eli {
    private static Map<String, Integer> e = new HashMap<String, Integer>(16) { // from class: eli.1
        {
            put(ScanFilter.MatchRule.STRICT.toString(), 1);
            put(ScanFilter.MatchRule.INCLUSIVE.toString(), 4);
            put(ScanFilter.MatchRule.FRONT.toString(), 2);
            put(ScanFilter.MatchRule.REAR.toString(), 3);
        }
    };

    public static elh c(String str) {
        FileInputStream fileInputStream;
        String strC = CommonUtil.c(str);
        FileInputStream fileInputStream2 = null;
        if (strC == null) {
            LogUtil.j("ProductFileParser", "ProductFileParser loadProductList tempPathList == null");
            return null;
        }
        if (!new File(strC).exists()) {
            LogUtil.j("ProductFileParser", "ProductFileParser loadProductList file not exists");
            return null;
        }
        elh elhVar = new elh();
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            emm.d(documentBuilderFactoryNewInstance);
        } catch (ParserConfigurationException e2) {
            LogUtil.e("ProductFileParser", "ProductFileParser loadProductList e:", e2.getMessage());
        }
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
                fileInputStream = new FileInputStream(strC);
                try {
                    try {
                        Element documentElement = documentBuilderNewDocumentBuilder.parse(fileInputStream).getDocumentElement();
                        if (documentElement == null) {
                            LogUtil.j("ProductFileParser", "ProductFileParser loadProductList: element is null.");
                            IoUtils.c(fileInputStream);
                            IoUtils.c(fileInputStream);
                            return elhVar;
                        }
                        c(elhVar, documentElement);
                        NodeList childNodes = documentElement.getChildNodes();
                        if (childNodes != null) {
                            e(elhVar, childNodes);
                        }
                        IoUtils.c(fileInputStream);
                        return elhVar;
                    } catch (IOException | ParserConfigurationException | SAXException unused) {
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("ProductFileParser", "ProductFileParser loadProductList: ParserConfigurationException | IOException | SAXException.");
                        IoUtils.c(fileInputStream2);
                    }
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (IOException | ParserConfigurationException | SAXException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    private static void c(elh elhVar, Element element) {
        NamedNodeMap attributes = element.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            b(elhVar, attributes, i);
        }
    }

    private static void b(elh elhVar, NamedNodeMap namedNodeMap, int i) {
        String nodeName = namedNodeMap.item(i).getNodeName();
        String nodeValue = namedNodeMap.item(i).getNodeValue();
        if ("uuid".equals(nodeName)) {
            elhVar.l(nodeValue);
            return;
        }
        if ("kind".equals(nodeName)) {
            elhVar.a(etn.a(nodeValue));
            return;
        }
        if (RecommendConstants.VER.equals(nodeName)) {
            elhVar.o(nodeValue);
            return;
        }
        if ("h5Type".equals(nodeName)) {
            elhVar.i(nodeValue);
        } else if (x2.PROTOCOL.equals(nodeName)) {
            elhVar.k(nodeValue);
        } else {
            LogUtil.j("ProductFileParser", "ProductFileParser loadProductList: can not equals getNodeName ", nodeName);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    private static void e(elh elhVar, NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nodeItem = nodeList.item(i);
            if (nodeItem.getNodeType() == 1) {
                String nodeName = nodeItem.getNodeName();
                nodeName.hashCode();
                switch (nodeName) {
                    case "description":
                        d(elhVar, nodeItem);
                        break;
                    case "resolution":
                        i(elhVar, nodeItem);
                        break;
                    case "bind":
                        e(elhVar, nodeItem);
                        break;
                    case "scan":
                        j(elhVar, nodeItem);
                        break;
                    case "extra":
                        a(elhVar, nodeItem);
                        break;
                    case "guide":
                        b(elhVar, nodeItem);
                        break;
                    case "match":
                        h(elhVar, nodeItem);
                        break;
                    case "manifest":
                        g(elhVar, nodeItem);
                        break;
                    case "measure":
                        f(elhVar, nodeItem);
                        break;
                    case "introduction":
                        c(elhVar, nodeItem);
                        break;
                }
            }
        }
    }

    private static void h(elh elhVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        if (childNodes != null) {
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if ("content".equals(nodeItem.getNodeName())) {
                    elhVar.e(nodeItem.getAttributes().getNamedItem("kind").getNodeValue(), nodeItem.getAttributes().getNamedItem("uuid").getNodeValue());
                }
            }
        }
    }

    private static void g(elh elhVar, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        String nodeValue = attributes.getNamedItem("name").getNodeValue();
        c(nodeValue, attributes);
        String nodeValue2 = attributes.getNamedItem("summary").getNodeValue();
        d(nodeValue2, attributes);
        elhVar.b(attributes.getNamedItem("image").getNodeValue(), nodeValue, nodeValue2);
        if (attributes.getNamedItem("company") != null) {
            String nodeValue3 = attributes.getNamedItem("company").getNodeValue();
            LogUtil.a("ProductFileParser", "ProductFileParser company = ", nodeValue3);
            elhVar.l().b(nodeValue3);
        }
    }

    private static void d(elh elhVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        if (childNodes != null) {
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if ("content".equals(nodeItem.getNodeName())) {
                    String nodeValue = nodeItem.getAttributes().getNamedItem("text").getNodeValue();
                    elhVar.a(nodeValue, nodeItem.getAttributes().getNamedItem("img").getNodeValue());
                    d(nodeValue, nodeItem.getAttributes());
                }
            }
        }
    }

    private static void d(String str, NamedNodeMap namedNodeMap) {
        if (namedNodeMap == null) {
            return;
        }
        LogUtil.d("ProductFileParser", "handleDefaultChar textId = ", str);
        Node namedItem = namedNodeMap.getNamedItem("defaultchartype");
        Node namedItem2 = namedNodeMap.getNamedItem("defaultcharvalue");
        if (namedItem == null || namedItem2 == null) {
            return;
        }
        d(str, namedItem.getNodeValue(), namedItem2.getNodeValue());
    }

    private static void c(String str, NamedNodeMap namedNodeMap) {
        if (namedNodeMap == null) {
            return;
        }
        LogUtil.d("ProductFileParser", "handleMainChar textId = ", str);
        Node namedItem = namedNodeMap.getNamedItem("mainchartype");
        Node namedItem2 = namedNodeMap.getNamedItem("maincharvalue");
        if (namedItem == null || namedItem2 == null) {
            return;
        }
        d(str, namedItem.getNodeValue(), namedItem2.getNodeValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    private static void d(String str, String str2, String str3) {
        byte b2;
        str2.hashCode();
        switch (str2) {
            case "doublearray":
                b2 = 0;
                break;
            case "stringarray":
                b2 = 1;
                break;
            case "double":
                b2 = 2;
                break;
            case "string":
                b2 = 3;
                break;
            case "int":
                b2 = 4;
                break;
            case "intarray":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            a(str, str3);
            return;
        }
        if (b2 == 1) {
            h(str, str3);
            return;
        }
        if (b2 == 2) {
            c(str, str3);
            return;
        }
        if (b2 == 3) {
            b(str, str3);
        } else if (b2 == 4) {
            e(str, str3);
        } else {
            if (b2 != 5) {
                return;
            }
            d(str, str3);
        }
    }

    private static void e(String str, String str2) {
        LogUtil.d("ProductFileParser", "handleIntString textId = ", str);
        LogUtil.d("ProductFileParser", "handleIntString charValue = ", str2);
        try {
            elo.a(str, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            LogUtil.e("ProductFileParser", "handleIntString NumberFormatException.");
        }
    }

    private static void d(String str, String str2) {
        LogUtil.d("ProductFileParser", "handleIntArrayString textId = ", str);
        LogUtil.d("ProductFileParser", "handleIntArrayString charValue = ", str2);
        if (str2.length() > 2) {
            if (str2.startsWith("[") || str2.endsWith("]")) {
                elo.e(str, d(str2.substring(str2.indexOf("[") + 1, str2.indexOf("]")).split(",")));
            }
        }
    }

    private static int[] d(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException unused) {
                LogUtil.e("ProductFileParser", "tranStringArrayToIntArray NumberFormatException.");
                return new int[0];
            }
        }
        return iArr;
    }

    private static void c(String str, String str2) {
        LogUtil.d("ProductFileParser", "handleDoubleString textId = ", str);
        LogUtil.d("ProductFileParser", "handleDoubleString charValue = ", str2);
        try {
            elo.a(str, Double.parseDouble(str2));
        } catch (NumberFormatException unused) {
            LogUtil.e("ProductFileParser", "handleDoubleString NumberFormatException.");
        }
    }

    private static void a(String str, String str2) {
        LogUtil.d("ProductFileParser", "handleDoubleArrayString textId = ", str);
        LogUtil.d("ProductFileParser", "handleDoubleArrayString charValue = ", str2);
        if (str2.length() > 2) {
            if (str2.startsWith("[") || str2.endsWith("]")) {
                elo.c(str, b(str2.substring(str2.indexOf("[") + 1, str2.indexOf("]")).split(",")));
            }
        }
    }

    private static double[] b(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new double[0];
        }
        double[] dArr = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                dArr[i] = Double.parseDouble(strArr[i]);
            } catch (NumberFormatException unused) {
                LogUtil.e("ProductFileParser", "tranStringArrayToDoubleArray NumberFormatException.");
                return new double[0];
            }
        }
        return dArr;
    }

    private static void b(String str, String str2) {
        LogUtil.d("ProductFileParser", "handleString textId = ", str, ", handleString charValue = ", str2);
        try {
            elo.e(str, str2);
        } catch (NumberFormatException unused) {
            LogUtil.e("ProductFileParser", "handleString NumberFormatException.");
        }
    }

    private static void h(String str, String str2) {
        LogUtil.d("ProductFileParser", "handleStringArray textId = ", str, ", handleStringArray charValue = ", str2);
        if (str2.length() > 2) {
            if (str2.startsWith("[") || str2.endsWith("]")) {
                elo.a(str, str2.substring(str2.indexOf("[") + 1, str2.indexOf("]")).split(","));
            }
        }
    }

    private static void b(elh elhVar, Node node) {
        LogUtil.a("ProductFileParser", "nodeNameEqualsGuide---");
        String nodeValue = node.getAttributes().getNamedItem("type").getNodeValue();
        if ("measure".equals(nodeValue)) {
            n(elhVar, node);
            return;
        }
        if ("bind".equals(nodeValue)) {
            k(elhVar, node);
            return;
        }
        if (NotificationCompat.GROUP_KEY_SILENT.equals(nodeValue)) {
            l(elhVar, node);
        } else if ("use_guide".equals(nodeValue)) {
            o(elhVar, node);
        } else {
            LogUtil.j("ProductFileParser", "nodeNameEqualsGuide nodeValue is not support");
        }
    }

    private static void l(elh elhVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null) {
            return;
        }
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("content".equals(nodeItem.getNodeName())) {
                String nodeValue = nodeItem.getAttributes().getNamedItem("text").getNodeValue();
                elhVar.d(nodeValue, nodeItem.getAttributes().getNamedItem("img").getNodeValue());
                d(nodeValue, nodeItem.getAttributes());
            }
        }
    }

    private static void o(elh elhVar, Node node) {
        String nodeValue;
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null) {
            return;
        }
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("content".equals(nodeItem.getNodeName())) {
                if (nodeItem.getAttributes().getNamedItem("title") == null) {
                    nodeValue = "";
                } else {
                    nodeValue = nodeItem.getAttributes().getNamedItem("title").getNodeValue();
                }
                String nodeValue2 = nodeItem.getAttributes().getNamedItem("text").getNodeValue();
                elhVar.a(nodeValue, nodeValue2, nodeItem.getAttributes().getNamedItem("img").getNodeValue());
                d(nodeValue2, nodeItem.getAttributes());
            }
        }
    }

    private static void k(elh elhVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null) {
            return;
        }
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("content".equals(nodeItem.getNodeName())) {
                String nodeValue = nodeItem.getAttributes().getNamedItem("text").getNodeValue();
                elhVar.c(nodeValue, nodeItem.getAttributes().getNamedItem("img").getNodeValue());
                d(nodeValue, nodeItem.getAttributes());
            }
        }
    }

    private static void n(elh elhVar, Node node) {
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null) {
            return;
        }
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ("content".equals(nodeItem.getNodeName())) {
                String nodeValue = nodeItem.getAttributes().getNamedItem("text").getNodeValue();
                elhVar.b(nodeValue, nodeItem.getAttributes().getNamedItem("img").getNodeValue());
                d(nodeValue, nodeItem.getAttributes());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:120:0x0198  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void a(elh elhVar, Node node) {
        byte b2;
        NamedNodeMap attributes = node.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            String nodeName = attributes.item(i).getNodeName();
            String nodeValue = attributes.item(i).getNodeValue();
            nodeName.hashCode();
            switch (nodeName.hashCode()) {
                case -2054444593:
                    if (nodeName.equals("isSupportAutoPauseSuprression")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -2052799751:
                    if (nodeName.equals("is_support_weight_data_claiming")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1725405834:
                    if (nodeName.equals("app_oversea_version")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1691944104:
                    if (nodeName.equals("marketing_position_id")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1543071020:
                    if (nodeName.equals("device_name")) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1485638852:
                    if (nodeName.equals("is_support_sync_while_connected")) {
                        b2 = 5;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -1074076728:
                    if (nodeName.equals("device_manager_img")) {
                        b2 = 6;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -814800055:
                    if (nodeName.equals("pageVersion")) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -610886354:
                    if (nodeName.equals("is_support_other_activity_connect")) {
                        b2 = 8;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -545996111:
                    if (nodeName.equals("is_dual_mode")) {
                        b2 = 9;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -486433098:
                    if (nodeName.equals("is_support_multi_user")) {
                        b2 = 10;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -446443396:
                    if (nodeName.equals("is_huawei_wsp_scale")) {
                        b2 = 11;
                    } else {
                        b2 = -1;
                    }
                    break;
                case -279310820:
                    if (nodeName.equals("otaVersion")) {
                        b2 = 12;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 110364:
                    if (nodeName.equals("ota")) {
                        b2 = 13;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 245350454:
                    if (nodeName.equals("buy_url")) {
                        b2 = 14;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 478205205:
                    if (nodeName.equals("app_domestic_version")) {
                        b2 = 15;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 712563297:
                    if (nodeName.equals("isSupportIntermit")) {
                        b2 = 16;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 826513207:
                    if (nodeName.equals("device_ota_img")) {
                        b2 = 17;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 896325356:
                    if (nodeName.equals("is_support_nps")) {
                        b2 = 18;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 896331711:
                    if (nodeName.equals("is_support_uds")) {
                        b2 = 19;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 913803662:
                    if (nodeName.equals("miaomall_url")) {
                        b2 = Ascii.DC4;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1045360705:
                    if (nodeName.equals("is_support_keep_connected_when_back")) {
                        b2 = Ascii.NAK;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1094676056:
                    if (nodeName.equals("isSupportControl")) {
                        b2 = Ascii.SYN;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1109191185:
                    if (nodeName.equals("deviceId")) {
                        b2 = Ascii.ETB;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1224176480:
                    if (nodeName.equals("is_support_question_and_suggestion")) {
                        b2 = Ascii.CAN;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1249881585:
                    if (nodeName.equals("manger_support_info_invisible")) {
                        b2 = Ascii.EM;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1291234845:
                    if (nodeName.equals("isSupportWeight")) {
                        b2 = Ascii.SUB;
                    } else {
                        b2 = -1;
                    }
                    break;
                case 1977567821:
                    if (nodeName.equals("isSupportScore")) {
                        b2 = Ascii.ESC;
                    } else {
                        b2 = -1;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 24:
                case 25:
                case 26:
                case 27:
                    elhVar.h(nodeName, nodeValue);
                    break;
                case 2:
                    elhVar.e(nodeValue);
                    break;
                case 15:
                    elhVar.d(nodeValue);
                    break;
                case 23:
                    elhVar.a(nodeValue);
                    break;
                default:
                    LogUtil.d("ProductFileParser", "resource is not exist");
                    break;
            }
        }
    }

    private static void j(elh elhVar, Node node) {
        elhVar.b(d(node.getAttributes()));
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        boolean z = false;
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (Constant.FILTER.equals(nodeItem.getNodeName())) {
                String[] strArrB = b(nodeItem.getAttributes());
                if (!z) {
                    elhVar.c(c(strArrB));
                    z = true;
                }
                arrayList.addAll(a(strArrB));
            }
        }
        elhVar.c(arrayList);
    }

    private static dmm d(NamedNodeMap namedNodeMap) {
        dmm.e eVar = new dmm.e();
        Node namedItem = namedNodeMap.getNamedItem(Wpt.MODE);
        if (namedItem != null) {
            eVar.e(d(namedItem.getNodeValue()));
        }
        Node namedItem2 = namedNodeMap.getNamedItem("duration");
        if (namedItem2 != null) {
            eVar.b(CommonUtil.j(namedItem2.getNodeValue()), TimeUnit.SECONDS);
        }
        Node namedItem3 = namedNodeMap.getNamedItem("pair");
        if (namedItem3 != null) {
            eVar.e(namedItem3.getNodeValue());
        }
        return eVar.b();
    }

    private static int d(String str) {
        if ("BLE".equals(str)) {
            return 1;
        }
        if ("CLASSIC".equals(str)) {
            return 2;
        }
        if ("AUDIO".equals(str)) {
            return 4;
        }
        if ("NO_BLE".equals(str)) {
            return 32;
        }
        return WifiDeviceUtils.NETWORKINFO_TYPE_NAME.equals(str) ? 8 : 0;
    }

    private static String[] b(NamedNodeMap namedNodeMap) {
        String[] strArr = {"", "", ""};
        if (namedNodeMap != null) {
            Node namedItem = namedNodeMap.getNamedItem("name");
            if (namedItem != null) {
                strArr[0] = namedItem.getNodeValue();
            }
            Node namedItem2 = namedNodeMap.getNamedItem("match");
            if (namedItem2 != null) {
                strArr[1] = namedItem2.getNodeValue();
            }
            Node namedItem3 = namedNodeMap.getNamedItem("address");
            if (namedItem3 != null) {
                strArr[2] = namedItem3.getNodeValue();
            }
        }
        return strArr;
    }

    private static ScanFilter c(String[] strArr) {
        ScanFilter.MatchRule matchRuleValueOf = ScanFilter.MatchRule.FRONT;
        if (!TextUtils.isEmpty(strArr[1])) {
            matchRuleValueOf = ScanFilter.MatchRule.valueOf(strArr[1]);
        }
        return ScanFilter.c(strArr[0], strArr[2], matchRuleValueOf);
    }

    private static List<cmy> a(String[] strArr) {
        ArrayList arrayList = new ArrayList(16);
        cmy.a aVar = new cmy.a();
        aVar.b(!TextUtils.isEmpty(strArr[1]) ? e.get(strArr[1]).intValue() : 0);
        for (String str : strArr[0].split(";")) {
            aVar.a(str);
            arrayList.add(aVar.c());
        }
        return arrayList;
    }

    private static void f(elh elhVar, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        elhVar.f(attributes.getNamedItem("kit").getNodeValue());
        elhVar.h(attributes.getNamedItem(Wpt.MODE).getNodeValue());
        LogUtil.d("ProductFileParser", "content--entry:", attributes.getNamedItem("entry"));
        elhVar.j(attributes.getNamedItem("entry") != null ? attributes.getNamedItem("entry").getNodeValue() : null);
        elhVar.n(attributes.getNamedItem("type") != null ? attributes.getNamedItem("type").getNodeValue() : null);
    }

    private static void e(elh elhVar, Node node) {
        if (elhVar != null) {
            NamedNodeMap attributes = node.getAttributes();
            LogUtil.a("ProductFileParser", "content--entry:", attributes.getNamedItem("entry"));
            elhVar.b(attributes.getNamedItem("type") != null ? attributes.getNamedItem("type").getNodeValue() : null);
        }
    }

    private static void c(elh elhVar, Node node) {
        String nodeValue;
        NamedNodeMap attributes = node.getAttributes();
        if (attributes.getNamedItem("type") == null) {
            nodeValue = "";
        } else {
            nodeValue = attributes.getNamedItem("type").getNodeValue();
        }
        elhVar.n().a(nodeValue);
    }

    private static void i(elh elhVar, Node node) {
        NamedNodeMap attributes = node.getAttributes();
        if (attributes.getNamedItem("resolution") != null) {
            elhVar.y().b(attributes.getNamedItem("resolution").getNodeValue());
            LogUtil.d("ProductFileParser", "resolution is ", attributes.getNamedItem("resolution").getNodeValue());
        } else {
            elhVar.y().b("0");
        }
    }
}
