package com.garmin.android.gfdi.configuration;

import android.content.Context;
import android.util.Xml;
import ch.qos.logback.classic.Logger;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.gms.stats.CodePackage;
import da2.e;
import ds.e0;
import gt2.b;
import gt2.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import ma2.h;
import ma2.l;
import na2.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class GdiClientConfigurationUtil {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Deprecated
    public static e fromClientConfig(Context context) throws Throwable {
        int i14 = c.f79010a;
        Logger loggerI = b.f79005a.i("GDI#ClientConfiguration");
        HashSet hashSet = new HashSet();
        InputStream inputStream = null;
        UUID uuidFromString = null;
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open("client_config.xml");
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(inputStreamOpen, null);
                    xmlPullParserNewPullParser.nextTag();
                    xmlPullParserNewPullParser.require(2, null, "config");
                    boolean z14 = true;
                    int i15 = 25;
                    long j8 = Long.MIN_VALUE;
                    Set<l> supportedServiceTypes = null;
                    while (xmlPullParserNewPullParser.next() != 3) {
                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                            String name = xmlPullParserNewPullParser.getName();
                            switch (name.hashCode()) {
                                case -1496977095:
                                    if (!name.equals("bluetooth_classic_uuid")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        uuidFromString = UUID.fromString(XmlUtil.readText(xmlPullParserNewPullParser));
                                    }
                                    break;
                                case -453166095:
                                    if (!name.equals("keep_alive_interval")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        i15 = XmlUtil.readInt(xmlPullParserNewPullParser);
                                    }
                                    break;
                                case -173645905:
                                    if (!name.equals("client_uuid")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        j8 = XmlUtil.readLong(xmlPullParserNewPullParser);
                                    }
                                    break;
                                case 26259306:
                                    if (!name.equals("dedicated_gfdi_service")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        parseDedicatedGfdiService(loggerI, xmlPullParserNewPullParser, hashSet);
                                    }
                                    break;
                                case 228417286:
                                    if (!name.equals("supports_bluetooth_classic")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        loggerI.warn("\"supports_bluetooth_classic\" is deprecated. Use bluetooth_classic_uuid instead");
                                        if (XmlUtil.readBoolean(xmlPullParserNewPullParser)) {
                                            uuidFromString = d.f125224h;
                                        }
                                    }
                                    break;
                                case 570157463:
                                    if (!name.equals("should_auto_overwrite_customer_guid_during_pairing")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        z14 = XmlUtil.readBoolean(xmlPullParserNewPullParser);
                                    }
                                    break;
                                case 1859503262:
                                    if (!name.equals("supported_service_types")) {
                                        XmlUtil.skip(xmlPullParserNewPullParser);
                                    } else {
                                        supportedServiceTypes = parseSupportedServiceTypes(loggerI, xmlPullParserNewPullParser, hashSet);
                                    }
                                    break;
                                default:
                                    XmlUtil.skip(xmlPullParserNewPullParser);
                                    break;
                            }
                        }
                    }
                    if (supportedServiceTypes == null) {
                        throw new IllegalStateException("'supported_service_types' missing from client_config.xml");
                    }
                    if (j8 == Long.MIN_VALUE) {
                        throw new IllegalStateException("'client_uuid' missing from client_config.xml");
                    }
                    e eVar = new e(supportedServiceTypes, j8, hashSet, i15, uuidFromString, z14);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                        }
                    }
                    return eVar;
                } catch (IOException e4) {
                    e = e4;
                    loggerI.error("failed to parse client_config.xml", e);
                    throw new RuntimeException(e);
                } catch (XmlPullParserException e14) {
                    e = e14;
                    loggerI.error("failed to parse client_config.xml", e);
                    throw new RuntimeException(e);
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e15) {
            e = e15;
        } catch (XmlPullParserException e16) {
            e = e16;
        }
    }

    private static void parseDedicatedGfdiService(org.slf4j.Logger logger, XmlPullParser xmlPullParser, Set<UUID> set) throws XmlPullParserException, IOException {
        String text = XmlUtil.readText(xmlPullParser);
        text.getClass();
        switch (text) {
            case "MARINE":
                set.add(h.f117673a);
                break;
            case "GOLF":
                set.add(h.f117681i);
                break;
            case "VIVOFIT_JR":
                set.add(h.f117680h);
                break;
            case "CONNECT_MOBILE":
                set.add(h.f117674b);
                set.add(h.f117675c);
                break;
            default:
                UUID uuidFromString = UUID.fromString(text);
                logger.trace("custom GFDI UUID: " + uuidFromString);
                set.add(uuidFromString);
                break;
        }
    }

    private static Set<l> parseSupportedServiceTypes(org.slf4j.Logger logger, XmlPullParser xmlPullParser, Set<UUID> set) throws XmlPullParserException, IOException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(l.class);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("value")) {
                    String text = XmlUtil.readText(xmlPullParser);
                    if (CodePackage.FITNESS.equals(text)) {
                        a.A("deprecated GFDI type found: ", text, logger);
                        enumSetNoneOf.add(l.GFDI);
                        set.add(h.f117674b);
                        set.add(h.f117675c);
                    } else if ("VIVO_JR".equals(text)) {
                        a.A("deprecated GFDI type found: ", text, logger);
                        enumSetNoneOf.add(l.GFDI);
                        set.add(h.f117680h);
                    } else if ("GOLF".equals(text)) {
                        a.A("deprecated GFDI type found: ", text, logger);
                        enumSetNoneOf.add(l.GFDI);
                        set.add(h.f117681i);
                    } else if ("MARINE".equals(text)) {
                        a.A("deprecated GFDI type found: ", text, logger);
                        enumSetNoneOf.add(l.GFDI);
                        set.add(h.f117673a);
                    } else if ("GFDI".equals(text)) {
                        set.add(h.f117688p);
                        enumSetNoneOf.add(l.GFDI);
                    } else if ("REAL_TIME".equals(text)) {
                        enumSetNoneOf.addAll(l.b());
                    } else {
                        try {
                            enumSetNoneOf.add((l) Enum.valueOf(l.class, text));
                        } catch (IllegalArgumentException unused) {
                            e0.v("unknown service type: ", text, logger);
                        }
                    }
                } else {
                    XmlUtil.skip(xmlPullParser);
                }
            }
        }
        return enumSetNoneOf;
    }
}
