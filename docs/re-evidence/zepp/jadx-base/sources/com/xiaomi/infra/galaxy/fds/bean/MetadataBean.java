package com.xiaomi.infra.galaxy.fds.bean;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class MetadataBean {
    public Map<String, String> a;

    public MetadataBean() {
        this.a = new HashMap();
    }

    public void addMeta(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, str2);
    }

    public Map<String, String> getRawMeta() {
        return this.a;
    }

    public void setRawMeta(Map<String, String> map) {
        this.a = map;
    }

    public MetadataBean(Map<String, String> map) {
        this.a = map;
    }
}
