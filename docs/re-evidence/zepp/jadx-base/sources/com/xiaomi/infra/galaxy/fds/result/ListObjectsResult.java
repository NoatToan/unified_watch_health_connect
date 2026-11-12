package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.bean.ObjectBean;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class ListObjectsResult {
    private String a;
    private String b;
    private int c;
    private String d;
    private boolean e;
    private String f;
    private List<ObjectBean> g;
    private List<String> h;
    private String i;
    private boolean j;
    private boolean k;

    public List<String> getCommonPrefixes() {
        return this.h;
    }

    public String getDelimiter() {
        return this.i;
    }

    public String getMarker() {
        return this.d;
    }

    public int getMaxKeys() {
        return this.c;
    }

    public String getName() {
        return this.a;
    }

    public String getNextMarker() {
        return this.f;
    }

    public List<ObjectBean> getObjects() {
        return this.g;
    }

    public String getPrefix() {
        return this.b;
    }

    public boolean isReverse() {
        return this.j;
    }

    public boolean isTruncated() {
        return this.e;
    }

    public boolean isWithMetaData() {
        return this.k;
    }

    public void setCommonPrefixes(List<String> list) {
        this.h = list;
    }

    public void setDelimiter(String str) {
        this.i = str;
    }

    public void setMarker(String str) {
        this.d = str;
    }

    public void setMaxKeys(int i) {
        this.c = i;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setNextMarker(String str) {
        this.f = str;
    }

    public void setObjects(List<ObjectBean> list) {
        this.g = list;
    }

    public void setPrefix(String str) {
        this.b = str;
    }

    public void setReverse(boolean z) {
        this.j = z;
    }

    public void setTruncated(boolean z) {
        this.e = z;
    }

    public void setWithMetaData(boolean z) {
        this.k = z;
    }
}
