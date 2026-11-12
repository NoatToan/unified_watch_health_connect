package vm2;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f178827a = LoggerFactory.getLogger("PAIR#DeviceXmlUtil");

    private e() {
    }

    public static int a(byte[] bArr) {
        Node nodeItem;
        String nodeValue;
        int length = bArr.length;
        Logger logger = f178827a;
        int i14 = -1;
        if (length > 0) {
            try {
                NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(new String(bArr)))).getElementsByTagName("SoftwareVersion");
                if (elementsByTagName != null && (nodeItem = elementsByTagName.item(0)) != null && (nodeValue = nodeItem.getFirstChild().getNodeValue()) != null && !nodeValue.isEmpty()) {
                    i14 = Integer.parseInt(nodeValue);
                }
            } catch (IOException | ParserConfigurationException | SAXException e4) {
                logger.error("extractSoftwareVersion", e4);
            }
        }
        com.airbnb.lottie.animation.keyframe.a.r("extractSoftwareVersion (from deviceXMLBytes) - version [", i14, "]", logger);
        return i14;
    }

    public static boolean b(byte[] bArr, int i14, long j8) {
        int iA = a(bArr);
        StringBuilder sbW = v.h.w(i14, "hasNewDeviceFirmware: Unit ID [", "] firmware version is [", j8);
        sbW.append("], cached device XML version is [");
        sbW.append(iA);
        sbW.append("].");
        f178827a.debug(sbW.toString());
        return i14 > iA;
    }

    public static boolean c(bm2.d dVar, byte[] bArr) {
        String strF = dVar.f();
        sk2.c.f159932o.getClass();
        if (sk2.c.a.a(strF)) {
            return false;
        }
        return bArr == null || bArr.length == 0 || b(bArr, dVar.getF92745i(), dVar.getF92746j());
    }
}
