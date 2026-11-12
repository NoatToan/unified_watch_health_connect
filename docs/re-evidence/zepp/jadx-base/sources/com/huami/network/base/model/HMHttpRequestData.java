package com.huami.network.base.model;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class HMHttpRequestData {
    private final int a;
    private final int b;
    private final int c;
    private int d;
    private String e;
    private Map<String, Object> f;
    private Set<Object> g;
    private String h;
    private Support.RequestSupport i;
    private File j;

    private HMHttpRequestData(String str, Support.RequestSupport requestSupport) {
        this.a = 0;
        this.b = 1;
        this.c = 2;
        this.e = str;
        this.i = requestSupport;
        this.h = UUID.randomUUID().toString();
    }

    public File getDownloadFile() {
        return this.j;
    }

    public Set<Object> getEntity() {
        return this.g;
    }

    public Map<String, Object> getParams() {
        return this.f;
    }

    public Support.RequestSupport getSupport() {
        return this.i;
    }

    public String getTag() {
        return this.h;
    }

    public String getUrl() {
        return this.e;
    }

    public boolean isUseDownload() {
        return this.d == 2;
    }

    public boolean isUseEntity() {
        return this.d == 1;
    }

    public boolean isUseParams() {
        return this.d == 0;
    }

    public void setUrl(String str) {
        this.e = str;
    }

    public HMHttpRequestData(String str, Map<String, Object> map, Support.RequestSupport requestSupport) {
        this(str, requestSupport);
        this.f = map;
        this.d = 0;
    }

    public HMHttpRequestData(String str, Set<Object> set, Support.RequestSupport requestSupport) {
        this(str, requestSupport);
        this.g = set;
        this.d = 1;
    }

    public HMHttpRequestData(String str, File file, Support.RequestSupport requestSupport) {
        this(str, requestSupport);
        this.j = file;
        this.d = 2;
    }
}
