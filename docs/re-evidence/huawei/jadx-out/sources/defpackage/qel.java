package defpackage;

import android.content.Context;
import android.util.Log;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.slf4j.Marker;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes15.dex */
public class qel {
    public HashMap<String, String> e(String str, Context context) {
        HashMap<String, String> map = new HashMap<>();
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                    b(documentBuilderFactoryNewInstance);
                    DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
                    String strD = d(str);
                    if (context.getAssets().list(strD).length != 0) {
                        inputStreamOpen = context.getAssets().open(strD + "/taboo-data.xml");
                        d(map, documentBuilderNewDocumentBuilder, inputStreamOpen);
                    }
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                        return map;
                    }
                } catch (IOException unused) {
                    Log.e("AarParseXml", "close inputstream error");
                }
            } catch (IOException | ParserConfigurationException | SAXException unused2) {
                Log.e("AarParseXml", "parse error");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            }
            return map;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused3) {
                    Log.e("AarParseXml", "close inputstream error");
                }
            }
            throw th;
        }
    }

    private static void b(DocumentBuilderFactory documentBuilderFactory) {
        if (documentBuilderFactory == null) {
            Log.e("AarParseXml", "setXmlEntityPolicy failed,builderFactory is null.");
            return;
        }
        c(documentBuilderFactory, "http://apache.org/xml/features/disallow-doctype-decl", true);
        c(documentBuilderFactory, "http://xml.org/sax/features/external-general-entities", false);
        c(documentBuilderFactory, "http://xml.org/sax/features/external-parameter-entities", false);
        c(documentBuilderFactory, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        documentBuilderFactory.setExpandEntityReferences(false);
    }

    private static void c(DocumentBuilderFactory documentBuilderFactory, String str, boolean z) {
        if (documentBuilderFactory == null || str == null) {
            Log.e("AarParseXml", "setXmlSecurityFeature failed, builderFactory = " + documentBuilderFactory + ", featureName = " + str);
            return;
        }
        try {
            documentBuilderFactory.setFeature(str, z);
        } catch (ParserConfigurationException unused) {
            Log.e("AarParseXml", "setXmlSecurityFeature occur ParserConfigurationException: set " + str + " to " + z + " failed.");
        }
    }

    public static ArrayList<String> c(Context context) {
        String strSubstring;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (String str : context.getAssets().list("tabooxml")) {
                if (str.startsWith("xml")) {
                    int iIndexOf = str.indexOf(Constants.LINK);
                    if (iIndexOf != -1) {
                        strSubstring = str.substring(iIndexOf + 1);
                        if (strSubstring.contains(Marker.ANY_NON_NULL_MARKER)) {
                            strSubstring = strSubstring.replace("b+", "").replace(Marker.ANY_NON_NULL_MARKER, Constants.LINK);
                        } else if (strSubstring.contains(Constants.LINK)) {
                            strSubstring = strSubstring.replace("-r", Constants.LINK);
                        }
                    } else {
                        strSubstring = "en";
                    }
                    arrayList.add(strSubstring);
                }
            }
        } catch (IOException unused) {
            Log.e("AarParseXml", "getXmlLanguageList error");
        }
        return arrayList;
    }

    private static String d(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String script = localeForLanguageTag.getScript();
        String language = localeForLanguageTag.getLanguage();
        String country = localeForLanguageTag.getCountry();
        String strReplaceAll = str.replaceAll(Constants.LINK, Marker.ANY_NON_NULL_MARKER);
        if ("".equals(language)) {
            return "";
        }
        if (!script.isEmpty() || country.length() > 2) {
            return "tabooxml/xml-b+" + strReplaceAll;
        }
        if (script.isEmpty() && country.isEmpty() && language.equals("en")) {
            return "tabooxml/xml";
        }
        String str2 = "tabooxml/xml-" + language;
        if (country.isEmpty()) {
            return str2;
        }
        return str2 + "-r" + country;
    }

    private static void d(HashMap<String, String> map, DocumentBuilder documentBuilder, InputStream inputStream) throws SAXException, IOException {
        NodeList elementsByTagName;
        Document document = documentBuilder.parse(inputStream);
        if (document == null || (elementsByTagName = document.getElementsByTagName("item")) == null) {
            return;
        }
        int length = elementsByTagName.getLength();
        for (int i = 0; i < length; i++) {
            NamedNodeMap attributes = elementsByTagName.item(i).getAttributes();
            map.put(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("value").getNodeValue());
        }
    }

    public static HashMap<String, String> b(Context context) {
        HashMap<String, String> map = new HashMap<>();
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                    b(documentBuilderFactoryNewInstance);
                    DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
                    inputStreamOpen = context.getAssets().open("tabooxml/taboo-config.xml");
                    d(map, documentBuilderNewDocumentBuilder, inputStreamOpen);
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                        return map;
                    }
                } catch (IOException | ParserConfigurationException | SAXException unused) {
                    Log.e("AarParseXml", "parseConfigXml: error");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                }
            } catch (IOException unused2) {
                Log.e("AarParseXml", "close inputstream error");
            }
            return map;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused3) {
                    Log.e("AarParseXml", "close inputstream error");
                }
            }
            throw th;
        }
    }

    public static HashMap<String, String> a(Context context) {
        HashMap<String, String> map = new HashMap<>();
        InputStream inputStreamOpen = null;
        try {
            try {
                try {
                    DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                    b(documentBuilderFactoryNewInstance);
                    DocumentBuilder documentBuilderNewDocumentBuilder = documentBuilderFactoryNewInstance.newDocumentBuilder();
                    inputStreamOpen = context.getAssets().open("tabooxml/taboo-region.xml");
                    d(map, documentBuilderNewDocumentBuilder, inputStreamOpen);
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                        return map;
                    }
                } catch (IOException | ParserConfigurationException | SAXException unused) {
                    Log.e("AarParseXml", "parseConfigXml error");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                }
            } catch (IOException unused2) {
                Log.e("AarParseXml", "close inputstream error");
            }
            return map;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused3) {
                    Log.e("AarParseXml", "close inputstream error");
                }
            }
            throw th;
        }
    }
}
