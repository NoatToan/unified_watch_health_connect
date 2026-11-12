package org.cybergarage.upnp;

import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import okhttp3.internal.ws.WebSocketProtocol;
import org.cybergarage.net.HostInterface;
import org.cybergarage.soap.SOAP;
import org.cybergarage.upnp.ssdp.SSDP;
import org.cybergarage.util.Debug;
import org.cybergarage.xml.Parser;

/* JADX INFO: loaded from: classes23.dex */
public class UPnP {
    public static final int CONFIGID_UPNP_ORG_MAX = 16777215;
    public static final int DEFAULT_EXPIRED_DEVICE_EXTRA_TIME = 60;
    public static final int DEFAULT_TTL = 4;
    public static final String INMPR03 = "INMPR03";
    public static final int INMPR03_DISCOVERY_OVER_WIRELESS_COUNT = 4;
    public static final String INMPR03_VERSION = "1.0";
    public static final String NAME = "CyberLinkJava";
    public static final int SERVER_RETRY_COUNT = 100;
    public static final int USE_IPV6_ADMINISTRATIVE_SCOPE = 5;
    public static final int USE_IPV6_GLOBAL_SCOPE = 7;
    public static final int USE_IPV6_LINK_LOCAL_SCOPE = 3;
    public static final int USE_IPV6_SITE_LOCAL_SCOPE = 6;
    public static final int USE_IPV6_SUBNET_SCOPE = 4;
    public static final int USE_LOOPBACK_ADDR = 2;
    public static final int USE_ONLY_IPV4_ADDR = 9;
    public static final int USE_ONLY_IPV6_ADDR = 1;
    public static final int USE_SSDP_SEARCHRESPONSE_MULTIPLE_INTERFACES = 8;
    public static final String VERSION = "3.0";
    public static final String XML_CLASS_PROPERTTY = "cyberlink.upnp.xml.parser";
    public static final String XML_DECLARATION = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
    private static int timeToLive = 4;
    private static Parser xmlParser;

    static {
        setTimeToLive(4);
    }

    public static final int caluculateConfigId(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int iCodePointAt = 0;
        for (int i = 0; i < length; i++) {
            iCodePointAt += str.codePointAt(i);
            if (iCodePointAt >= 16777215) {
                iCodePointAt %= 16777215;
            }
        }
        return iCodePointAt;
    }

    public static final int createBootId() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static final String createUUID() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = (long) (System.currentTimeMillis() * Math.random());
        return toUUID((int) (jCurrentTimeMillis & WebSocketProtocol.s)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + toUUID(((int) ((jCurrentTimeMillis >> 32) | 40960)) & 65535) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + toUUID((int) (WebSocketProtocol.s & jCurrentTimeMillis2)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + toUUID(65535 & ((int) ((jCurrentTimeMillis2 >> 32) | 57344)));
    }

    public static final String getServerName() {
        return System.getProperty("os.name") + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + System.getProperty("os.version") + " UPnP/1.0 " + NAME + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + VERSION;
    }

    public static final int getTimeToLive() {
        return timeToLive;
    }

    public static final Parser getXMLParser() {
        if (xmlParser == null) {
            Parser parserLoadDefaultXMLParser = loadDefaultXMLParser();
            xmlParser = parserLoadDefaultXMLParser;
            if (parserLoadDefaultXMLParser == null) {
                throw new RuntimeException("No XML parser defined. And unable to laod any. \nTry to invoke UPnP.setXMLParser before UPnP.getXMLParser");
            }
            SOAP.setXMLParser(parserLoadDefaultXMLParser);
        }
        return xmlParser;
    }

    public static final void initialize() {
    }

    public static final boolean isEnabled(int i) {
        if (i == 1) {
            return HostInterface.USE_ONLY_IPV6_ADDR;
        }
        if (i == 2) {
            return HostInterface.USE_LOOPBACK_ADDR;
        }
        if (i != 9) {
            return false;
        }
        return HostInterface.USE_ONLY_IPV4_ADDR;
    }

    private static Parser loadDefaultXMLParser() {
        String[] strArr = {System.getProperty(XML_CLASS_PROPERTTY), "org.cybergarage.xml.parser.XmlPullParser", "org.cybergarage.xml.parser.JaxpParser", "org.cybergarage.xml.parser.kXML2Parser", "org.cybergarage.xml.parser.XercesParser"};
        for (int i = 0; i < 5; i++) {
            if (strArr[i] != null) {
                try {
                    return (Parser) Class.forName(strArr[i]).newInstance();
                } catch (Throwable th) {
                    Debug.warning("Unable to load " + strArr[i] + " as XMLParser due to " + th);
                }
            }
        }
        return null;
    }

    public static final void setDisable(int i) {
        if (i == 1) {
            HostInterface.USE_ONLY_IPV6_ADDR = false;
        } else if (i == 2) {
            HostInterface.USE_LOOPBACK_ADDR = false;
        } else {
            if (i != 9) {
                return;
            }
            HostInterface.USE_ONLY_IPV4_ADDR = false;
        }
    }

    public static final void setEnable(int i) {
        switch (i) {
            case 1:
                HostInterface.USE_ONLY_IPV6_ADDR = true;
                break;
            case 2:
                HostInterface.USE_LOOPBACK_ADDR = true;
                break;
            case 3:
                SSDP.setIPv6Address(SSDP.IPV6_LINK_LOCAL_ADDRESS);
                break;
            case 4:
                SSDP.setIPv6Address(SSDP.IPV6_SUBNET_ADDRESS);
                break;
            case 5:
                SSDP.setIPv6Address(SSDP.IPV6_ADMINISTRATIVE_ADDRESS);
                break;
            case 6:
                SSDP.setIPv6Address(SSDP.IPV6_SITE_LOCAL_ADDRESS);
                break;
            case 7:
                SSDP.setIPv6Address(SSDP.IPV6_GLOBAL_ADDRESS);
                break;
            case 9:
                HostInterface.USE_ONLY_IPV4_ADDR = true;
                break;
        }
    }

    public static final void setTimeToLive(int i) {
        timeToLive = i;
    }

    public static final void setXMLParser(Parser parser) {
        xmlParser = parser;
        SOAP.setXMLParser(parser);
    }

    private static final String toUUID(int i) {
        String string = Integer.toString(i & 65535, 16);
        String str = "";
        for (int i2 = 0; i2 < 4 - string.length(); i2++) {
            str = str + "0";
        }
        return str + string;
    }
}
