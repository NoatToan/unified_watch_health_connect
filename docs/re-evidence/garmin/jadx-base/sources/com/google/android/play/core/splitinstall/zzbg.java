package com.google.android.play.core.splitinstall;

import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes14.dex */
final class zzbg {
    public static final zzk zza(XmlPullParser xmlPullParser, zzi zziVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String strZzb = zzb("name", xmlPullParser, zziVar);
                                    if (strZzb != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String strZzb2 = zzb(Action.KEY_ATTRIBUTE, xmlPullParser, zziVar);
                                                                String strZzb3 = zzb("split", xmlPullParser, zziVar);
                                                                zzc(xmlPullParser, zziVar);
                                                                if (strZzb2 != null && strZzb3 != null) {
                                                                    zziVar.zza(strZzb, strZzb2, strZzb3);
                                                                }
                                                            } else {
                                                                zzc(xmlPullParser, zziVar);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zzc(xmlPullParser, zziVar);
                                                }
                                            }
                                        }
                                    } else {
                                        zzc(xmlPullParser, zziVar);
                                    }
                                } else {
                                    zzc(xmlPullParser, zziVar);
                                }
                            }
                        }
                    } else {
                        zzc(xmlPullParser, zziVar);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return zziVar.zzb();
    }

    private static final String zzb(String str, XmlPullParser xmlPullParser, zzi zziVar) {
        for (int i14 = 0; i14 < xmlPullParser.getAttributeCount(); i14++) {
            if (xmlPullParser.getAttributeName(i14).equals(str)) {
                return xmlPullParser.getAttributeValue(i14);
            }
        }
        return null;
    }

    private static final void zzc(XmlPullParser xmlPullParser, zzi zziVar) throws XmlPullParserException, IOException {
        int i14 = 1;
        while (i14 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i14++;
            } else if (next == 3) {
                i14--;
            }
        }
    }
}
