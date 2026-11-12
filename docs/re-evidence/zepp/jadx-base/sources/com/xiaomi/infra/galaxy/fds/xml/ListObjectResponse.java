package com.xiaomi.infra.galaxy.fds.xml;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.xiaomi.infra.galaxy.fds.bean.ObjectBean;
import com.xiaomi.infra.galaxy.fds.result.ListObjectsResult;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ListBucketResult", namespace = "http://s3.amazonaws.com/doc/2006-03-01/")
public class ListObjectResponse {

    @XmlElement(name = MAPCookie.KEY_NAME)
    private String a;

    @XmlElement(name = "Prefix")
    private String b;

    @XmlElement(name = "Marker")
    private String c;

    @XmlElement(name = "MaxKeys")
    private int d;

    @XmlElement(name = "Delimiter")
    private String e;

    @XmlElement(name = "EncodingType")
    private String f;

    @XmlElement(name = "IsTruncated")
    private boolean g;

    @XmlElement(name = "NextMarker")
    private String h;

    @XmlElement(name = "Contents")
    private List<KeyMetadata> i;

    @XmlElement(name = "CommonPrefixes")
    private List<CommonPrefix> j;

    public ListObjectResponse(ListObjectsResult listObjectsResult) {
        this.e = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        this.f = "url";
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.a = listObjectsResult.getName();
        this.b = listObjectsResult.getPrefix();
        this.d = listObjectsResult.getMaxKeys();
        this.c = listObjectsResult.getMarker();
        this.g = listObjectsResult.isTruncated();
        String delimiter = listObjectsResult.getDelimiter();
        this.e = delimiter;
        if (delimiter != null && !delimiter.isEmpty() && listObjectsResult.getNextMarker() != null) {
            this.h = listObjectsResult.getNextMarker().substring(this.a.length() + 1);
        }
        List<ObjectBean> objects = listObjectsResult.getObjects();
        this.i = new LinkedList();
        for (ObjectBean objectBean : objects) {
            KeyMetadata keyMetadata = new KeyMetadata();
            keyMetadata.setKey(objectBean.getName());
            keyMetadata.setETag(objectBean.getEtag());
            keyMetadata.setSize(objectBean.getSize());
            if (objectBean.getUploadTime() != 0) {
                keyMetadata.setLastModified(new Date(objectBean.getUploadTime()));
            }
            this.i.add(keyMetadata);
        }
        List<String> commonPrefixes = listObjectsResult.getCommonPrefixes();
        this.j = new LinkedList();
        Iterator<String> it2 = commonPrefixes.iterator();
        while (it2.hasNext()) {
            this.j.add(new CommonPrefix(it2.next()));
        }
    }

    public void addKey(KeyMetadata keyMetadata) {
        this.i.add(keyMetadata);
    }

    public void addPrefix(String str) {
        this.j.add(new CommonPrefix(str));
    }

    public List<CommonPrefix> getCommonPrefixes() {
        return this.j;
    }

    public List<KeyMetadata> getContents() {
        return this.i;
    }

    public String getDelimiter() {
        return this.e;
    }

    public String getEncodingType() {
        return this.f;
    }

    public String getMarker() {
        return this.c;
    }

    public int getMaxKeys() {
        return this.d;
    }

    public String getName() {
        return this.a;
    }

    public String getNextMaker() {
        return this.h;
    }

    public String getPrefix() {
        return this.b;
    }

    public boolean isTruncated() {
        return this.g;
    }

    public void setCommonPrefixes(List<CommonPrefix> list) {
        this.j = list;
    }

    public void setContents(List<KeyMetadata> list) {
        this.i = list;
    }

    public void setDelimiter(String str) {
        this.e = str;
    }

    public void setEncodingType(String str) {
        this.f = str;
    }

    public void setMarker(String str) {
        this.c = str;
    }

    public void setMaxKeys(int i) {
        this.d = i;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setNextMaker(String str) {
        this.h = str;
    }

    public void setPrefix(String str) {
        this.b = str;
    }

    public void setTruncated(boolean z) {
        this.g = z;
    }

    public ListObjectResponse() {
        this.e = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        this.f = "url";
        this.i = new ArrayList();
        this.j = new ArrayList();
    }
}
