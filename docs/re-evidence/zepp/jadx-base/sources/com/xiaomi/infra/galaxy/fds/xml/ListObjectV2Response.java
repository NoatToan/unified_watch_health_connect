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
public class ListObjectV2Response {

    @XmlElement(name = MAPCookie.KEY_NAME)
    private String a;

    @XmlElement(name = "Prefix")
    private String b;

    @XmlElement(name = "MaxKeys")
    private int c;

    @XmlElement(name = "KeyCount")
    private int d;

    @XmlElement(name = "Delimiter")
    private String e;

    @XmlElement(name = "EncodingType")
    private String f;

    @XmlElement(name = "IsTruncated")
    private boolean g;

    @XmlElement(name = "NextContinuationToken")
    private String h;

    @XmlElement(name = "ContinuationToken")
    private String i;

    @XmlElement(name = "StartAfter")
    private String j;

    @XmlElement(name = "Contents")
    private List<KeyMetadata> k;

    @XmlElement(name = "CommonPrefixes")
    private List<CommonPrefix> l;

    public ListObjectV2Response() {
        this.e = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        this.f = "url";
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public void addKey(KeyMetadata keyMetadata) {
        this.k.add(keyMetadata);
    }

    public void addPrefix(String str) {
        this.l.add(new CommonPrefix(str));
    }

    public List<CommonPrefix> getCommonPrefixes() {
        return this.l;
    }

    public List<KeyMetadata> getContents() {
        return this.k;
    }

    public String getContinueToken() {
        return this.i;
    }

    public String getDelimiter() {
        return this.e;
    }

    public String getEncodingType() {
        return this.f;
    }

    public int getKeyCount() {
        return this.d;
    }

    public int getMaxKeys() {
        return this.c;
    }

    public String getName() {
        return this.a;
    }

    public String getNextToken() {
        return this.h;
    }

    public String getPrefix() {
        return this.b;
    }

    public String getStartAfter() {
        return this.j;
    }

    public boolean isTruncated() {
        return this.g;
    }

    public void setCommonPrefixes(List<CommonPrefix> list) {
        this.l = list;
    }

    public void setContents(List<KeyMetadata> list) {
        this.k = list;
    }

    public void setContinueToken(String str) {
        this.i = str;
    }

    public void setDelimiter(String str) {
        this.e = str;
    }

    public void setEncodingType(String str) {
        this.f = str;
    }

    public void setKeyCount(int i) {
        this.d = i;
    }

    public void setMaxKeys(int i) {
        this.c = i;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setNextToken(String str) {
        this.h = str;
    }

    public void setPrefix(String str) {
        this.b = str;
    }

    public void setStartAfter(String str) {
        this.j = str;
    }

    public void setTruncated(boolean z) {
        this.g = z;
    }

    public ListObjectV2Response(ListObjectsResult listObjectsResult) {
        this.e = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        this.f = "url";
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.a = listObjectsResult.getName();
        this.b = listObjectsResult.getPrefix();
        this.c = listObjectsResult.getMaxKeys();
        this.g = listObjectsResult.isTruncated();
        this.e = listObjectsResult.getDelimiter();
        List<ObjectBean> objects = listObjectsResult.getObjects();
        this.k = new LinkedList();
        for (ObjectBean objectBean : objects) {
            KeyMetadata keyMetadata = new KeyMetadata();
            keyMetadata.setKey(objectBean.getName());
            keyMetadata.setETag(objectBean.getEtag());
            keyMetadata.setSize(objectBean.getSize());
            if (objectBean.getUploadTime() != 0) {
                keyMetadata.setLastModified(new Date(objectBean.getUploadTime()));
            }
            this.k.add(keyMetadata);
        }
        this.d = this.k.size();
        List<String> commonPrefixes = listObjectsResult.getCommonPrefixes();
        this.l = new LinkedList();
        Iterator<String> it2 = commonPrefixes.iterator();
        while (it2.hasNext()) {
            this.l.add(new CommonPrefix(it2.next()));
        }
    }
}
