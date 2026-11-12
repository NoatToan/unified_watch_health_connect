package bj2;

import com.garmin.connectiq.common.devices.DeviceException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static /* synthetic */ int[] f18372e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18373a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18374b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18375c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18376d = new ArrayList();

    public enum a {
        device("device"),
        orientation(ModelSourceWrapper.ORIENTATION),
        bpp("bpp"),
        palette("palette"),
        languages("languages"),
        color(TtmlNode.ATTR_TTS_COLOR),
        language("language"),
        resolution("resolution"),
        image("image"),
        launcher_icon("launcher_icon"),
        datafieldlayouts("datafieldlayouts"),
        layout(TtmlNode.TAG_LAYOUT),
        field("field"),
        fonts("fonts"),
        part_numbers("part_numbers"),
        part_number("part_number"),
        picker_layout("picker_layout"),
        watchdog_count("watchdog_count"),
        connect_iq_version("connect_iq_version"),
        app_types("app_types"),
        app("app"),
        device_families("device_families"),
        device_family("device_family");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18400a;

        a(String str) {
            this.f18400a = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public static c a(Node node) throws DeviceException {
        String attribute = ((Element) node).getAttribute(TtmlNode.ATTR_ID);
        if (attribute == null || attribute.length() == 0) {
            throw new DeviceException("Missing or empty id attribute in device_family tag!");
        }
        c cVar = new c(attribute);
        if (!node.hasChildNodes()) {
            return cVar;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i14 = 0; i14 < childNodes.getLength(); i14++) {
            Node nodeItem = childNodes.item(i14);
            if (nodeItem.getNodeType() == 1 && nodeItem.getNodeName().equals(a.device_family.toString())) {
                arrayList.add(new c(cVar.f18369a + '-' + a(childNodes.item(i14)).f18369a, cVar));
            }
        }
        cVar.f18371c = arrayList;
        return cVar;
    }

    public final ArrayList<String> b(Node node) {
        NodeList childNodes = node.getChildNodes();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i14 = 0; i14 < childNodes.getLength(); i14++) {
            Node nodeItem = childNodes.item(i14);
            if (nodeItem.getNodeType() == 1 && nodeItem.getNodeName().equals(a.language.toString())) {
                String lowerCase = nodeItem.getFirstChild().getNodeValue().toLowerCase();
                arrayList.add(lowerCase);
                ArrayList arrayList2 = this.f18376d;
                if (!arrayList2.contains(lowerCase)) {
                    arrayList2.add(lowerCase);
                }
            }
        }
        return arrayList;
    }

    public final void c(FileInputStream fileInputStream) throws DeviceException {
        int i14;
        NodeList nodeList;
        HashMap map;
        a aVar;
        Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream).getDocumentElement();
        NodeList elementsByTagName = documentElement.getElementsByTagName(a.device.toString());
        NodeList elementsByTagName2 = documentElement.getElementsByTagName(a.device_families.toString());
        HashMap map2 = this.f18375c;
        short s8 = 1;
        int i15 = 0;
        if (elementsByTagName2 != null && elementsByTagName2.getLength() > 0) {
            Node nodeItem = elementsByTagName2.item(0);
            ArrayList arrayList = new ArrayList();
            NodeList childNodes = nodeItem.getChildNodes();
            for (int i16 = 0; i16 < childNodes.getLength(); i16++) {
                Node nodeItem2 = childNodes.item(i16);
                if (nodeItem2.getNodeType() == 1 && nodeItem2.getNodeName().equals(a.device_family.toString())) {
                    try {
                        arrayList.add(a(nodeItem2));
                    } catch (DeviceException unused) {
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                for (c cVar : ((c) it.next()).a()) {
                    map2.put(cVar.f18369a, cVar);
                }
            }
        }
        int i17 = 0;
        while (i17 < elementsByTagName.getLength()) {
            Node nodeItem3 = elementsByTagName.item(i17);
            NodeList childNodes2 = nodeItem3.getChildNodes();
            String nodeValue = nodeItem3.getAttributes().getNamedItem(TtmlNode.ATTR_ID).getNodeValue();
            String nodeValue2 = nodeItem3.getAttributes().getNamedItem("name") != null ? nodeItem3.getAttributes().getNamedItem("name").getNodeValue() : null;
            int i18 = i15;
            int i19 = i18;
            HashMap map3 = null;
            b.d dVarValueOf = null;
            ArrayList arrayList2 = null;
            ArrayList<String> arrayListB = null;
            b.c cVar2 = null;
            ArrayList arrayList3 = null;
            b.f fVar = null;
            while (i18 < childNodes2.getLength()) {
                Node nodeItem4 = childNodes2.item(i18);
                if (nodeItem4.getNodeType() == s8) {
                    String nodeName = nodeItem4.getNodeName();
                    short s14 = s8;
                    a[] aVarArrValuesCustom = a.valuesCustom();
                    i14 = i17;
                    int length = aVarArrValuesCustom.length;
                    nodeList = elementsByTagName;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= length) {
                            aVar = null;
                            break;
                        }
                        int i25 = length;
                        aVar = aVarArrValuesCustom[i24];
                        int i26 = i24;
                        if (aVar.f18400a.equals(nodeName)) {
                            break;
                        }
                        i24 = i26 + 1;
                        length = i25;
                        s14 = 1;
                    }
                    if (aVar != null) {
                        int[] iArr = f18372e;
                        if (iArr == null) {
                            iArr = new int[a.valuesCustom().length];
                            try {
                                iArr[a.app.ordinal()] = 21;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[a.app_types.ordinal()] = 20;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[a.bpp.ordinal()] = 3;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[a.color.ordinal()] = 6;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[a.connect_iq_version.ordinal()] = 19;
                            } catch (NoSuchFieldError unused6) {
                            }
                            try {
                                iArr[a.datafieldlayouts.ordinal()] = 11;
                            } catch (NoSuchFieldError unused7) {
                            }
                            try {
                                iArr[a.device.ordinal()] = s14;
                            } catch (NoSuchFieldError unused8) {
                            }
                            try {
                                iArr[a.device_families.ordinal()] = 22;
                            } catch (NoSuchFieldError unused9) {
                            }
                            try {
                                iArr[a.device_family.ordinal()] = 23;
                            } catch (NoSuchFieldError unused10) {
                            }
                            try {
                                iArr[a.field.ordinal()] = 13;
                            } catch (NoSuchFieldError unused11) {
                            }
                            try {
                                iArr[a.fonts.ordinal()] = 14;
                            } catch (NoSuchFieldError unused12) {
                            }
                            try {
                                iArr[a.image.ordinal()] = 9;
                            } catch (NoSuchFieldError unused13) {
                            }
                            try {
                                iArr[a.language.ordinal()] = 7;
                            } catch (NoSuchFieldError unused14) {
                            }
                            try {
                                iArr[a.languages.ordinal()] = 5;
                            } catch (NoSuchFieldError unused15) {
                            }
                            try {
                                iArr[a.launcher_icon.ordinal()] = 10;
                            } catch (NoSuchFieldError unused16) {
                            }
                            try {
                                iArr[a.layout.ordinal()] = 12;
                            } catch (NoSuchFieldError unused17) {
                            }
                            try {
                                iArr[a.orientation.ordinal()] = 2;
                            } catch (NoSuchFieldError unused18) {
                            }
                            try {
                                iArr[a.palette.ordinal()] = 4;
                            } catch (NoSuchFieldError unused19) {
                            }
                            try {
                                iArr[a.part_number.ordinal()] = 16;
                            } catch (NoSuchFieldError unused20) {
                            }
                            try {
                                iArr[a.part_numbers.ordinal()] = 15;
                            } catch (NoSuchFieldError unused21) {
                            }
                            try {
                                iArr[a.picker_layout.ordinal()] = 17;
                            } catch (NoSuchFieldError unused22) {
                            }
                            try {
                                iArr[a.resolution.ordinal()] = 8;
                            } catch (NoSuchFieldError unused23) {
                            }
                            try {
                                iArr[a.watchdog_count.ordinal()] = 18;
                            } catch (NoSuchFieldError unused24) {
                            }
                            f18372e = iArr;
                        }
                        int i27 = iArr[aVar.ordinal()];
                        if (i27 == 2) {
                            map = map2;
                            dVarValueOf = b.d.valueOf(nodeItem4.getFirstChild().getNodeValue());
                        } else if (i27 == 3) {
                            map = map2;
                            i19 = Integer.parseInt(nodeItem4.getFirstChild().getNodeValue());
                        } else if (i27 == 4) {
                            map = map2;
                            NodeList childNodes3 = nodeItem4.getChildNodes();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i28 = 0; i28 < childNodes3.getLength(); i28++) {
                                Node nodeItem5 = childNodes3.item(i28);
                                if (nodeItem5.getNodeType() == 1 && nodeItem5.getNodeName().equals(a.color.toString())) {
                                    String nodeValue3 = nodeItem5.getFirstChild().getNodeValue();
                                    if (nodeValue3.equals("TRANSPARENT")) {
                                        arrayList4.add(new b.C0267b(0));
                                    } else {
                                        if (nodeValue3.length() == 8) {
                                            throw new DeviceException("Alpha values in color palettes not supported.");
                                        }
                                        arrayList4.add(new b.C0267b(nodeValue3));
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                        } else if (i27 == 5) {
                            map = map2;
                            arrayListB = b(nodeItem4);
                        } else if (i27 == 8) {
                            map = map2;
                            Element element = (Element) nodeItem4;
                            String attribute = element.getAttribute("width");
                            String attribute2 = element.getAttribute("height");
                            if (attribute == null || attribute.isEmpty() || attribute2 == null || attribute2.isEmpty()) {
                                throw new DeviceException("Invalid width or height attribute encountered parsing resolution");
                            }
                            fVar = new b.f(Integer.parseInt(attribute), Integer.parseInt(attribute2));
                        } else if (i27 == 10) {
                            map = map2;
                            if (nodeItem4.getNodeType() != 1) {
                                cVar2 = null;
                            } else {
                                Element element2 = (Element) nodeItem4;
                                cVar2 = new b.c(Integer.parseInt(element2.getAttribute("width")), Integer.parseInt(element2.getAttribute("height")));
                            }
                        } else if (i27 == 15) {
                            map3 = new HashMap();
                            short s15 = 1;
                            if (nodeItem4.getNodeType() == 1) {
                                NodeList elementsByTagName3 = ((Element) nodeItem4).getElementsByTagName(a.part_number.f18400a);
                                int i29 = 0;
                                while (i29 < elementsByTagName3.getLength()) {
                                    if (elementsByTagName3.item(i29).getNodeType() == s15) {
                                        Element element3 = (Element) elementsByTagName3.item(i29);
                                        String attribute3 = element3.getAttribute("number");
                                        map3.put(attribute3, new b.e(attribute3, b(element3.getElementsByTagName(a.languages.f18400a).item(0)), element3.hasAttribute("firmwareVersion") ? Short.valueOf(Short.parseShort(element3.getAttribute("firmwareVersion"))) : null, element3.hasAttribute("connectIQVersion") ? new bj2.a(element3.getAttribute("connectIQVersion")) : null));
                                    }
                                    i29++;
                                    elementsByTagName3 = elementsByTagName3;
                                    map2 = map2;
                                    s15 = 1;
                                }
                            }
                        } else if (i27 == 20) {
                            ArrayList arrayList5 = new ArrayList();
                            NodeList childNodes4 = nodeItem4.getChildNodes();
                            int i30 = 0;
                            while (i30 < childNodes4.getLength()) {
                                Node nodeItem6 = childNodes4.item(i30);
                                NodeList nodeList2 = childNodes4;
                                if (nodeItem6.getNodeType() == s14 && nodeItem6.getNodeName().equals(a.app.toString())) {
                                    Element element4 = (Element) nodeItem6;
                                    String attribute4 = element4.getAttribute(TtmlNode.ATTR_ID);
                                    String attribute5 = element4.getAttribute("prg_limit");
                                    Integer numValueOf = -1;
                                    if (attribute5 != null && !attribute5.isEmpty()) {
                                        numValueOf = Integer.valueOf(Integer.parseInt(attribute5));
                                    }
                                    arrayList5.add(new b.a(attribute4, numValueOf.intValue()));
                                }
                                i30++;
                                childNodes4 = nodeList2;
                                s14 = 1;
                            }
                            arrayList3 = arrayList5;
                        }
                    }
                    i18++;
                    i17 = i14;
                    elementsByTagName = nodeList;
                    map2 = map;
                    s8 = 1;
                    i15 = 0;
                } else {
                    i14 = i17;
                    nodeList = elementsByTagName;
                }
                map = map2;
                i18++;
                i17 = i14;
                elementsByTagName = nodeList;
                map2 = map;
                s8 = 1;
                i15 = 0;
            }
            String nodeValue4 = nodeItem3.getAttributes().getNamedItem("part_number").getNodeValue();
            Node namedItem = nodeItem3.getAttributes().getNamedItem("family");
            c cVar3 = (c) map2.get(namedItem != null ? namedItem.getNodeValue() : null);
            Iterator it3 = map3.keySet().iterator();
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((String) it3.next()).split("-")[s8].substring(s8));
                numValueOf2.getClass();
                this.f18374b.put(numValueOf2, nodeValue);
            }
            b bVar = new b(nodeValue, nodeValue2, map3, dVarValueOf, i19, arrayList2, arrayListB, cVar2, arrayList3, cVar3 != null ? cVar3.f18369a : null, fVar, nodeValue4);
            if (cVar3 != null) {
                cVar3.f18370b.put(bVar.f18352a, bVar);
            }
            this.f18373a.put(nodeValue, bVar);
            i17++;
        }
    }
}
