package com.xiaomi.infra.galaxy.fds.xml;

import com.xiaomi.infra.galaxy.fds.result.UploadPartResult;
import com.xiaomi.infra.galaxy.fds.result.UploadPartResultList;
import java.io.StringReader;
import java.util.ArrayList;
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
@XmlRootElement(name = "CompleteMultipartUpload")
public class CompleteMultipartUploadRequest {

    @XmlElement(name = "Part")
    private List<Part> a = new ArrayList();

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Part")
    public static class Part {

        @XmlElement(name = "PartNumber")
        private int a;

        @XmlElement(name = "ETag")
        private String b;

        public int getPartNumber() {
            return this.a;
        }

        public String geteTag() {
            return this.b;
        }

        public void setPartNumber(int i) {
            this.a = i;
        }

        public void seteTag(String str) {
            this.b = str;
        }
    }

    public static CompleteMultipartUploadRequest from(String str) throws Exception {
        JAXBContext jAXBContextNewInstance = JAXBContext.newInstance(new Class[]{CompleteMultipartUploadRequest.class});
        NamespaceFilter namespaceFilter = new NamespaceFilter();
        namespaceFilter.setParent(SAXParserFactory.newInstance().newSAXParser().getXMLReader());
        UnmarshallerHandler unmarshallerHandler = jAXBContextNewInstance.createUnmarshaller().getUnmarshallerHandler();
        namespaceFilter.setContentHandler(unmarshallerHandler);
        namespaceFilter.parse(new InputSource(new StringReader(str)));
        return (CompleteMultipartUploadRequest) unmarshallerHandler.getResult();
    }

    public List<Part> getPartList() {
        return this.a;
    }

    public UploadPartResultList getUploadPartResult() {
        UploadPartResultList uploadPartResultList = new UploadPartResultList();
        for (Part part : this.a) {
            UploadPartResult uploadPartResult = new UploadPartResult();
            uploadPartResult.setPartNumber(part.getPartNumber());
            uploadPartResult.setEtag(part.geteTag());
            uploadPartResultList.addUploadPartResult(uploadPartResult);
        }
        return uploadPartResultList;
    }

    public void setPartList(List<Part> list) {
        this.a = list;
    }
}
