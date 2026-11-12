package com.xiaomi.infra.galaxy.fds.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Delete")
public class MultiDeleteRequest {

    @XmlElement(name = "Quiet")
    private Boolean a = Boolean.FALSE;

    @XmlElement(name = "Object")
    private List<DeleteObject> b = new ArrayList();

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Object", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
    public static class DeleteObject {

        @XmlElement(name = "Key")
        private String a;

        @XmlElement(name = "VersionId")
        private String b;

        public DeleteObject() {
        }

        public String getKey() {
            return this.a;
        }

        public String getVersionId() {
            return this.b;
        }

        public void setKey(String str) {
            this.a = str;
        }

        public void setVersionId(String str) {
            this.b = str;
        }

        public String toString() {
            return "DeleteObject{key='" + this.a + "', versionId='" + this.b + "'}";
        }

        public DeleteObject(String str) {
            this.a = str;
        }
    }

    public static MultiDeleteRequest from(InputStream inputStream) throws Exception {
        JAXBContext jAXBContextNewInstance = JAXBContext.newInstance(new Class[]{MultiDeleteRequest.class});
        NamespaceFilter namespaceFilter = new NamespaceFilter();
        namespaceFilter.setParent(SAXParserFactory.newInstance().newSAXParser().getXMLReader());
        UnmarshallerHandler unmarshallerHandler = jAXBContextNewInstance.createUnmarshaller().getUnmarshallerHandler();
        namespaceFilter.setContentHandler(unmarshallerHandler);
        namespaceFilter.parse(new InputSource(inputStream));
        return (MultiDeleteRequest) unmarshallerHandler.getResult();
    }

    public String[] getDeleteObjectNameArray() {
        String[] strArr = new String[this.b.size()];
        Iterator<DeleteObject> it2 = this.b.iterator();
        int i = 0;
        while (it2.hasNext()) {
            strArr[i] = it2.next().getKey();
            i++;
        }
        return strArr;
    }

    public List<DeleteObject> getObjects() {
        return this.b;
    }

    public boolean isQuiet() {
        return this.a.booleanValue();
    }

    public void setObjects(List<DeleteObject> list) {
        this.b = list;
    }

    public void setQuiet(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public String toString() {
        return "MultiDeleteRequest{quiet=" + this.a + ", objects=" + this.b + '}';
    }
}
