package com.huami.watch.ota;

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
public class ProductInfoHelper {
    private static final String a = "product";
    private static final String b = "model";
    private static final String c = "url";
    private static ProductInfoHelper d;

    public class a extends DefaultHandler {
        private List<ProductInfo> a;
        private ProductInfo b;
        private String c;

        public a(List<ProductInfo> list) {
            this.a = new ArrayList();
            this.a = list;
        }

        public List<ProductInfo> a() {
            return this.a;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            if (this.b == null) {
                return;
            }
            String str = new String(cArr, i, i2);
            if ("model".equals(this.c)) {
                this.b.model = str;
            } else if ("url".equals(this.c)) {
                this.b.url = str;
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            if (ProductInfoHelper.a.equals(str2)) {
                this.a.add(this.b);
            }
            this.c = null;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (ProductInfoHelper.a.equals(str2)) {
                this.b = new ProductInfo();
            }
            this.c = str2;
        }
    }

    private ProductInfoHelper() {
    }

    public static ProductInfoHelper getInstance() {
        if (d == null) {
            d = new ProductInfoHelper();
        }
        return d;
    }

    public List<ProductInfo> getProductList(String str) {
        return getProductList(new ByteArrayInputStream(str.getBytes()));
    }

    public List<ProductInfo> getProductList(InputStream inputStream) {
        List<ProductInfo> arrayList = new ArrayList<>();
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            a aVar = new a(arrayList);
            xMLReader.setContentHandler(aVar);
            xMLReader.parse(new InputSource(inputStream));
            arrayList = aVar.a();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e2) {
            e2.printStackTrace();
        } catch (SAXException e3) {
            e3.printStackTrace();
        }
        Iterator<ProductInfo> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().dump();
        }
        return arrayList;
    }
}
