package com.xiaomi.infra.galaxy.fds.xml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeleteResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class MultiDeleteResponse {

    @XmlElement(name = "Deleted")
    private List<DeletedObject> a;

    @XmlElement(name = "Error")
    private List<Error> b;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Deleted", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
    public static class DeletedObject {

        @XmlElement(name = "Key")
        private String a;
        private String b;

        public DeletedObject() {
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

        public DeletedObject(String str) {
            this.a = str;
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "Error", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
    public static class Error {

        @XmlElement(name = "Key")
        private String a;

        @XmlElement(name = "Code")
        private String b;

        @XmlElement(name = "Message")
        private String c;

        public Error() {
        }

        public String getCode() {
            return this.b;
        }

        public String getKey() {
            return this.a;
        }

        public String getMessage() {
            return this.c;
        }

        public void setCode(String str) {
            this.b = str;
        }

        public void setKey(String str) {
            this.a = str;
        }

        public void setMessage(String str) {
            this.c = str;
        }

        public Error(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    public MultiDeleteResponse() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public void addDeleted(DeletedObject deletedObject) {
        this.a.add(deletedObject);
    }

    public void addError(Error error) {
        this.b.add(error);
    }

    public List<DeletedObject> getDeletedObjects() {
        return this.a;
    }

    public List<Error> getErrors() {
        return this.b;
    }

    public void setDeletedObjects(List<DeletedObject> list) {
        this.a = list;
    }

    public void setErrors(List<Error> list) {
        this.b = list;
    }

    public MultiDeleteResponse(List<Map<String, Object>> list) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.b = new ArrayList();
        for (Map<String, Object> map : list) {
            Error error = new Error();
            error.setCode(String.valueOf(map.get("error_code")));
            error.setKey((String) map.get("object_name"));
            error.setMessage((String) map.get("error_description"));
            this.b.add(error);
        }
    }
}
