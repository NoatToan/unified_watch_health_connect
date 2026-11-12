package com.huami.watch.ota;

import com.huami.watch.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateInfoHelper {
    private static final String c = "UpdateInfoHelper";
    private static final String d = "update_list_version";
    private static final String e = "version_list";
    private static final String f = "version";
    private static final String g = "update";
    private static final String h = "index";
    private static final String i = "version_from";
    private static final String j = "version_to";
    private static final String k = "description";
    private static final String l = "url";
    private static final String m = "size";
    private static final String n = "md5";
    private static final String o = "force_update";
    private static final String p = "alert_interval";
    private List<UpdateInfo> a;
    private List<String> b;

    public class b extends DefaultHandler {
        private List<UpdateInfo> a;
        private List<String> b;
        private UpdateInfo c;
        private String d;
        private String e;

        private b() {
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            String str = new String(cArr, i, i2);
            if ("version".equals(this.e)) {
                this.d = str;
                return;
            }
            if (this.c != null) {
                if ("index".equals(this.e)) {
                    this.c.index = str;
                    return;
                }
                if (UpdateInfoHelper.i.equals(this.e)) {
                    this.c.version_from = str;
                    return;
                }
                if (UpdateInfoHelper.j.equals(this.e)) {
                    this.c.version_to = str;
                    return;
                }
                if ("description".equals(this.e)) {
                    this.c.description = str;
                    return;
                }
                if ("url".equals(this.e)) {
                    this.c.url = str;
                    return;
                }
                if ("size".equals(this.e)) {
                    this.c.size = str;
                    return;
                }
                if ("md5".equals(this.e)) {
                    this.c.md5 = str;
                } else if ("force_update".equals(this.e)) {
                    this.c.force_update = str;
                } else if ("alert_interval".equals(this.e)) {
                    this.c.alert_interval = str;
                }
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if ("update".equals(str2)) {
                this.a.add(this.c);
            } else if ("version".equals(str2)) {
                this.b.add(this.d);
            }
            this.e = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if ("update".equals(str2)) {
                this.c = new UpdateInfo();
            }
            this.e = str2;
        }
    }

    public UpdateInfoHelper(String str) {
        b(str);
    }

    private boolean a(InputStream inputStream) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            b bVar = new b();
            xMLReader.setContentHandler(bVar);
            xMLReader.parse(new InputSource(inputStream));
            this.a = bVar.a;
            this.b = bVar.b;
            Log.i(c, "=========version list===========", new Object[0]);
            Iterator<String> it2 = this.b.iterator();
            while (it2.hasNext()) {
                Log.i(c, it2.next(), new Object[0]);
            }
            Iterator<UpdateInfo> it3 = this.a.iterator();
            while (it3.hasNext()) {
                it3.next().dump();
            }
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        } catch (ParserConfigurationException e3) {
            e3.printStackTrace();
            return false;
        } catch (SAXException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private boolean b(String str) {
        return a(new ByteArrayInputStream(str.getBytes()));
    }

    public List<UpdateInfo> getUpdateList() {
        return this.a;
    }

    public List<String> getVersionList() {
        return this.b;
    }

    public UpdateInfoHelper(InputStream inputStream) {
        a(inputStream);
    }
}
