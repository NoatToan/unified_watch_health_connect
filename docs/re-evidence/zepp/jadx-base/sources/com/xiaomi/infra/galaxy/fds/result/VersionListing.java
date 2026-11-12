package com.xiaomi.infra.galaxy.fds.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class VersionListing {
    private List<VersionSummary> a = new ArrayList();
    private List<String> b = new ArrayList();
    private String c;
    private String d;
    private String e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private int j;
    private String k;

    public String getBucketName() {
        return this.c;
    }

    public List<String> getCommonPrefixes() {
        return this.b;
    }

    public String getDelimiter() {
        return this.k;
    }

    public String getKeyMarker() {
        return this.h;
    }

    public int getMaxKeys() {
        return this.j;
    }

    public String getNextKeyMarker() {
        return this.d;
    }

    public String getNextVersionIdMarker() {
        return this.e;
    }

    public String getPrefix() {
        return this.g;
    }

    public String getVersionIdMarker() {
        return this.i;
    }

    public List<VersionSummary> getVersionSummaries() {
        return this.a;
    }

    public boolean isTruncated() {
        return this.f;
    }

    public void setBucketName(String str) {
        this.c = str;
    }

    public void setCommonPrefixes(List<String> list) {
        this.b = list;
    }

    public void setDelimiter(String str) {
        this.k = str;
    }

    public void setKeyMarker(String str) {
        this.h = str;
    }

    public void setMaxKeys(int i) {
        this.j = i;
    }

    public void setNextKeyMarker(String str) {
        this.d = str;
    }

    public void setNextVersionIdMarker(String str) {
        this.e = str;
    }

    public void setPrefix(String str) {
        this.g = str;
    }

    public void setTruncated(boolean z) {
        this.f = z;
    }

    public void setVersionIdMarker(String str) {
        this.i = str;
    }

    public void setVersionSummaries(List<VersionSummary> list) {
        this.a = list;
    }
}
