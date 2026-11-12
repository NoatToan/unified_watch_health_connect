package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.beans.TitleBean;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes7.dex */
public class eky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f33091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f33092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f33093c = new Object();
    private static ArrayList<elj> d = new ArrayList<>();
    private ArrayList<elk> e = new ArrayList<>();

    public ArrayList<elk> c() {
        return (ArrayList) dym.d(this.e);
    }

    public static void b() {
        if (e() > 0) {
            LogUtil.a("PluginDevice_GroupFileParser", "parseSupportDevice supportDevice size is ", Integer.valueOf(e()));
            return;
        }
        ArrayList<elj> arrayList = new ArrayList<>();
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            emm.d(documentBuilderFactoryNewInstance);
            NodeList childNodes = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(dxw.d().getAssets().open("SupportDevices.xml")).getDocumentElement().getChildNodes();
            if (childNodes != null) {
                LogUtil.a("PluginDevice_GroupFileParser", "parseSupportDevice groups size is ", Integer.valueOf(childNodes.getLength()));
                for (int i = 0; i < childNodes.getLength(); i++) {
                    Node nodeItem = childNodes.item(i);
                    if (nodeItem.getNodeType() == 1) {
                        NamedNodeMap attributes = nodeItem.getAttributes();
                        Node namedItem = attributes.getNamedItem(RecommendConstants.FILE_ID);
                        elj eljVar = new elj(b(attributes, "id"), b(attributes, RecommendConstants.VER), b(attributes, "hash"), namedItem == null ? null : namedItem.getNodeValue());
                        LogUtil.a("PluginDevice_GroupFileParser", "parseSupportDevice ProductFileInfo id:", eljVar.a());
                        arrayList.add(eljVar);
                    }
                }
            } else {
                LogUtil.j("PluginDevice_GroupFileParser", "parseSupportDevice NodeList is null");
            }
            LogUtil.a("PluginDevice_GroupFileParser", "parseSupportDevice supportDevice size is ", Integer.valueOf(e()));
        } catch (IOException | ParserConfigurationException | SAXException e) {
            LogUtil.e("PluginDevice_GroupFileParser", "parseSupportDevice ex = ", e.getMessage());
        }
        synchronized (f33093c) {
            d = arrayList;
        }
    }

    private static int e() {
        int size;
        synchronized (f33093c) {
            size = d.size();
        }
        return size;
    }

    public static ArrayList<elk> a(String str) {
        FileInputStream fileInputStream;
        Document document;
        LogUtil.a("PluginDevice_GroupFileParser", "Enter parseGroup");
        b();
        ArrayList<elk> arrayList = new ArrayList<>();
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        try {
            emm.d(documentBuilderFactoryNewInstance);
        } catch (ParserConfigurationException e) {
            LogUtil.e("PluginDevice_GroupFileParser", "parseGroup e:", e.getClass().getSimpleName());
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
                if (ResourceManager.c().h(dxc.e + str)) {
                    LogUtil.a("PluginDevice_GroupFileParser", "parseGroup from sdcard");
                    fileInputStream = new FileInputStream(dxc.e + str);
                    try {
                        document = documentBuilderNewDocumentBuilder.parse(fileInputStream);
                        fileInputStream2 = fileInputStream;
                    } catch (IOException e2) {
                        e = e2;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("PluginDevice_GroupFileParser", "parseGroup ex = ", e.getMessage());
                        IoUtils.c(fileInputStream2);
                        LogUtil.a("PluginDevice_GroupFileParser", "parseGroup finally groupListTemp size is ", Integer.valueOf(arrayList.size()));
                    } catch (ParserConfigurationException e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("PluginDevice_GroupFileParser", "parseGroup ex = ", e.getMessage());
                        IoUtils.c(fileInputStream2);
                        LogUtil.a("PluginDevice_GroupFileParser", "parseGroup finally groupListTemp size is ", Integer.valueOf(arrayList.size()));
                    } catch (SAXException e4) {
                        e = e4;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("PluginDevice_GroupFileParser", "parseGroup ex = ", e.getMessage());
                        IoUtils.c(fileInputStream2);
                        LogUtil.a("PluginDevice_GroupFileParser", "parseGroup finally groupListTemp size is ", Integer.valueOf(arrayList.size()));
                    } catch (Throwable th) {
                        th = th;
                        IoUtils.c(fileInputStream);
                        LogUtil.a("PluginDevice_GroupFileParser", "parseGroup finally groupListTemp size is ", Integer.valueOf(arrayList.size()));
                        throw th;
                    }
                } else {
                    LogUtil.a("PluginDevice_GroupFileParser", "parseGroup from assets");
                    document = documentBuilderNewDocumentBuilder.parse(dxw.d().getAssets().open(str));
                }
                Element documentElement = document.getDocumentElement();
                f33091a = b(documentElement.getAttributes(), RecommendConstants.VER);
                String strB = b(documentElement.getAttributes(), "time");
                f33092b = strB;
                LogUtil.a("PluginDevice_GroupFileParser", "parseGroup version = ", f33091a, " time=", strB);
                if (!TextUtils.isEmpty(f33091a) && !TextUtils.isEmpty(f33092b)) {
                    NodeList childNodes = documentElement.getChildNodes();
                    if (childNodes != null) {
                        LogUtil.a("PluginDevice_GroupFileParser", "parseGroup groups size is ", Integer.valueOf(childNodes.getLength()));
                        for (int i = 0; i < childNodes.getLength(); i++) {
                            Node nodeItem = childNodes.item(i);
                            if (nodeItem.getNodeType() == 1) {
                                a(arrayList, nodeItem);
                            }
                        }
                    }
                    IoUtils.c(fileInputStream2);
                    LogUtil.a("PluginDevice_GroupFileParser", "parseGroup finally groupListTemp size is ", Integer.valueOf(arrayList.size()));
                    return arrayList;
                }
                IoUtils.c(fileInputStream2);
                LogUtil.a("PluginDevice_GroupFileParser", "parseGroup finally groupListTemp size is ", Integer.valueOf(arrayList.size()));
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
        } catch (ParserConfigurationException e6) {
            e = e6;
        } catch (SAXException e7) {
            e = e7;
        }
    }

    private static String b(NamedNodeMap namedNodeMap, String str) {
        Node namedItem;
        if (namedNodeMap != null && (namedItem = namedNodeMap.getNamedItem(str)) != null) {
            return namedItem.getNodeValue();
        }
        return "";
    }

    public static String a() {
        return f33091a;
    }

    public String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (elk elkVar : this.e) {
            for (elj eljVar : elkVar.b()) {
                if (str.equals(eljVar.a())) {
                    return eljVar.c();
                }
            }
            for (elj eljVar2 : elkVar.a()) {
                if (str.equals(eljVar2.a())) {
                    return eljVar2.c();
                }
            }
        }
        return null;
    }

    public ArrayList<elj> e(ArrayList<elk> arrayList) {
        ArrayList<elj> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            LogUtil.d("PluginDevice_GroupFileParser", "removeDuplicate groups is null");
            return arrayList2;
        }
        LogUtil.a("PluginDevice_GroupFileParser", "removeDuplicate groups size=", Integer.valueOf(arrayList.size()));
        for (elk elkVar : this.e) {
            for (elk elkVar2 : arrayList) {
                if (elkVar.e() == elkVar2.e()) {
                    b(elkVar2, elkVar, arrayList2);
                }
            }
        }
        this.e = arrayList;
        return arrayList2;
    }

    private void b(elk elkVar, elk elkVar2, ArrayList<elj> arrayList) {
        for (elj eljVar : elkVar.b()) {
            String strA = eljVar.a();
            if ((!elkVar2.b().contains(eljVar) && !elkVar2.a().contains(eljVar)) || !ekn.b(strA)) {
                if (e(strA, eljVar.b(), true)) {
                    a(strA, arrayList, eljVar);
                }
            }
        }
    }

    private void a(String str, ArrayList<elj> arrayList, elj eljVar) {
        if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
            if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).getUserSureDownload()) {
                arrayList.add(eljVar);
                return;
            }
            return;
        }
        arrayList.add(eljVar);
    }

    public ArrayList<elk> d() {
        LogUtil.a("PluginDevice_GroupFileParser", "getGroupList groupList size is ", Integer.valueOf(this.e.size()));
        if (this.e.size() <= 0) {
            if (!Utils.o()) {
                LogUtil.a("PluginDevice_GroupFileParser", "getGroupList groups.xml");
                this.e = a("groups.xml");
            } else {
                LogUtil.a("PluginDevice_GroupFileParser", "getGroupList groups_abroad.xml");
                if (CommonUtil.cj()) {
                    this.e = a("groups.xml");
                } else {
                    this.e = a("groups_abroad.xml");
                }
            }
        }
        return this.e;
    }

    public elk e(HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (healthDeviceKind == null) {
            LogUtil.d("PluginDevice_GroupFileParser", "getProductGroup kind is null");
            return null;
        }
        LogUtil.a("PluginDevice_GroupFileParser", "getProductGroup kind = ", healthDeviceKind.name());
        d();
        for (elk elkVar : this.e) {
            if (elkVar.e() == healthDeviceKind) {
                int size = elkVar.b().size();
                LogUtil.a("PluginDevice_GroupFileParser", "getProductGroup homeProducts size is ", Integer.valueOf(size));
                if (size <= 0) {
                    if (!Utils.o()) {
                        LogUtil.a("PluginDevice_GroupFileParser", "getProductGroup parse groups.xml");
                        a("groups.xml");
                        return elkVar;
                    }
                    LogUtil.a("PluginDevice_GroupFileParser", "getProductGroup parse groups_abroad.xml");
                    if (CommonUtil.cj()) {
                        a("groups.xml");
                        return elkVar;
                    }
                    a("groups_abroad.xml");
                }
                return elkVar;
            }
        }
        return null;
    }

    public void b(HealthDevice.HealthDeviceKind healthDeviceKind, String str, elj eljVar) {
        if (healthDeviceKind == null || TextUtils.isEmpty(str) || eljVar == null) {
            LogUtil.d("PluginDevice_GroupFileParser", "addProduct param is invalid");
            return;
        }
        for (elk elkVar : this.e) {
            if (elkVar.e() == healthDeviceKind) {
                b(eljVar.a());
                if ("home".equals(str)) {
                    elkVar.e(eljVar);
                    LogUtil.a("PluginDevice_GroupFileParser", "addProduct homeProducts size = ", Integer.valueOf(elkVar.b().size()));
                    return;
                } else {
                    if (TitleBean.RIGHT_BTN_TYPE_MORE.equals(str)) {
                        elkVar.c(eljVar);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private void b(String str) {
        for (elk elkVar : this.e) {
            ArrayList<elj> arrayListB = elkVar.b();
            for (elj eljVar : arrayListB) {
                String strA = eljVar.a();
                if (strA != null && strA.equals(str)) {
                    arrayListB.remove(eljVar);
                    break;
                }
            }
            ArrayList<elj> arrayListA = elkVar.a();
            for (elj eljVar2 : arrayListA) {
                String strA2 = eljVar2.a();
                if (strA2 != null && strA2.equals(str)) {
                    arrayListA.remove(eljVar2);
                    break;
                }
            }
        }
    }

    public elj e(String str) {
        for (elk elkVar : this.e) {
            for (elj eljVar : elkVar.b()) {
                String strA = eljVar.a();
                if (strA != null && strA.equals(str)) {
                    return eljVar;
                }
            }
            for (elj eljVar2 : elkVar.a()) {
                String strA2 = eljVar2.a();
                if (strA2 != null && strA2.equals(str)) {
                    return eljVar2;
                }
            }
        }
        return null;
    }

    private elj j(String str) {
        for (elk elkVar : this.e) {
            for (elj eljVar : elkVar.b()) {
                String strC = eljVar.c();
                if (strC != null && strC.equals(str)) {
                    return eljVar;
                }
            }
            for (elj eljVar2 : elkVar.a()) {
                String strC2 = eljVar2.c();
                if (strC2 != null && strC2.equals(str)) {
                    return eljVar2;
                }
            }
        }
        return null;
    }

    public String d(String str) {
        elj eljVarJ;
        if (str == null || (eljVarJ = j(str)) == null) {
            return "";
        }
        return eljVarJ.d();
    }

    private static void a(ArrayList<elk> arrayList, Node node) {
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null) {
            return;
        }
        String strB = b(node.getAttributes(), "kind");
        LogUtil.a("PluginDevice_GroupFileParser", "getGroupNodeList kind =", strB);
        elk elkVar = new elk(etn.a(strB), b(node.getAttributes(), "name"), b(node.getAttributes(), "icon"));
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() == 1) {
                String strB2 = b(nodeItem.getAttributes(), "view");
                if ("home".equals(strB2)) {
                    a(nodeItem, elkVar);
                } else if (TitleBean.RIGHT_BTN_TYPE_MORE.equals(strB2)) {
                    e(nodeItem, elkVar);
                }
            }
        }
        arrayList.add(elkVar);
    }

    private static void e(Node node, elk elkVar) {
        LogUtil.a("PluginDevice_GroupFileParser", "Enter doMoreCase");
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            if (firstChild.getNodeType() != 1) {
                firstChild = firstChild.getNextSibling();
            } else {
                NamedNodeMap attributes = firstChild.getAttributes();
                Node namedItem = attributes.getNamedItem(RecommendConstants.FILE_ID);
                elkVar.c(new elj(b(attributes, "id"), b(attributes, RecommendConstants.VER), b(attributes, "hash"), namedItem == null ? null : namedItem.getNodeValue()));
                firstChild = firstChild.getNextSibling();
            }
        }
    }

    private static void a(Node node, elk elkVar) {
        LogUtil.a("PluginDevice_GroupFileParser", "Enter doHomeCase");
        Node firstChild = node.getFirstChild();
        while (firstChild != null) {
            if (firstChild.getNodeType() != 1) {
                firstChild = firstChild.getNextSibling();
            } else {
                NamedNodeMap attributes = firstChild.getAttributes();
                Node namedItem = attributes.getNamedItem(RecommendConstants.FILE_ID);
                Node namedItem2 = attributes.getNamedItem("isCheck");
                elj eljVar = new elj(b(attributes, "id"), b(attributes, RecommendConstants.VER), b(attributes, "hash"), namedItem == null ? null : namedItem.getNodeValue());
                if (namedItem2 != null) {
                    LogUtil.a("PluginDevice_GroupFileParser", "getGroupNodeList isCheck ", namedItem2, eljVar.a());
                    eljVar.a("true".equals(namedItem2.getNodeValue().trim()));
                }
                if (e(eljVar.a(), eljVar.b(), false)) {
                    elkVar.e(eljVar);
                }
                firstChild = firstChild.getNextSibling();
            }
        }
    }

    private static boolean e(String str, boolean z, boolean z2) {
        HonourDeviceConstantsApi honourDeviceConstantsApi = (HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class);
        if ((z2 && !honourDeviceConstantsApi.isHonourDevice(str)) || TextUtils.isEmpty(str) || !honourDeviceConstantsApi.isShowWiFiDevice(str)) {
            return false;
        }
        if (!z) {
            LogUtil.a("PluginDevice_GroupFileParser", "isAddProduct true");
            return true;
        }
        synchronized (f33093c) {
            Iterator<elj> it = d.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().a())) {
                    LogUtil.a("PluginDevice_GroupFileParser", "isAddProduct true");
                    return true;
                }
            }
            LogUtil.a("PluginDevice_GroupFileParser", "isAddProduct false");
            return false;
        }
    }
}
