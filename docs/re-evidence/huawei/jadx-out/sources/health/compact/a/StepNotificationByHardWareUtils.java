package health.compact.a;

import android.os.Build;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class StepNotificationByHardWareUtils {
    private static final String e = File.separator + "odm" + File.separator + "etc" + File.separator + "permissions" + File.separator + "huawei.sensor.features.unavailable.xml";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList<String> f36646c = new ArrayList(16) { // from class: health.compact.a.StepNotificationByHardWareUtils.2
        {
            add("MT6873");
            add("MT6853");
            add("MT6768");
        }
    };

    private StepNotificationByHardWareUtils() {
    }

    private static boolean b(String str) {
        if (str != null) {
            return str.toUpperCase(Locale.ENGLISH).startsWith("MT") || str.toUpperCase(Locale.ENGLISH).startsWith("HELIO");
        }
        com.huawei.hwlogsmodel.LogUtil.j("Step_StepNotificationByHardW", "hardware is null");
        return false;
    }

    public static boolean d() {
        if (CommonUtil.bg() && CommonUtil.ch()) {
            return a("sensor.ext_stepcounter");
        }
        if (CommonUtil.bg() && CommonUtil.av()) {
            return true;
        }
        String str = Build.HARDWARE;
        if (CommonUtil.bg() && CommonUtil.bf() && b(str)) {
            return f36646c.contains(str.toUpperCase(Locale.ENGLISH));
        }
        return (CommonUtil.bg() && !CommonUtil.ax() && b(str)) ? false : true;
    }

    public static boolean a(String str) {
        File file = new File(e);
        if (!file.exists()) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_StepNotificationByHardW", "isSupportByParseXmlFile configFile is null.");
            return true;
        }
        try {
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement();
            if (documentElement == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_StepNotificationByHardW", "isSupportByParseXmlFile root is null.");
                return true;
            }
            NodeList childNodes = documentElement.getChildNodes();
            if (childNodes == null) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_StepNotificationByHardW", "isSupportByParseXmlFile motions is null.");
                return true;
            }
            return d(childNodes, str);
        } catch (FileNotFoundException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_StepNotificationByHardW", "isSupportByParseXmlFile fileNotFoundException");
            return true;
        } catch (IOException unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_StepNotificationByHardW", "isSupportByParseXmlFile Exception");
            return true;
        } catch (ParserConfigurationException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_StepNotificationByHardW", "isSupportByParseXmlFile Exception", e2.getMessage());
            return true;
        } catch (SAXException e3) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_StepNotificationByHardW", "isSupportByParseXmlFile sAXException", e3.getMessage());
            return true;
        }
    }

    private static boolean d(NodeList nodeList, String str) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            try {
                Node nodeItem = nodeList.item(i);
                if (nodeItem != null && nodeItem.getNodeType() == 1 && nodeItem.getAttributes().getNamedItem(TrackConstants$Events.FEATURE) != null && str.equals(nodeItem.getAttributes().getNamedItem(TrackConstants$Events.FEATURE).getNodeValue())) {
                    return false;
                }
            } catch (NumberFormatException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_StepNotificationByHardW", ExceptionUtils.c(e2));
                return false;
            }
        }
        return true;
    }
}
