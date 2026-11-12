package com.xiaomi.infra.galaxy.fds.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ReplicationConfig {
    private String a;
    private String b;
    private List<String> c = new ArrayList();

    public void addResource(String str) {
        this.c.add(str);
    }

    public List<String> getResources() {
        return this.c;
    }

    public String getTargetBucket() {
        return this.a;
    }

    public String getTargetEndpiont() {
        return this.b;
    }

    public boolean isValid(String str) {
        if (this.a == null || this.b == null) {
            return false;
        }
        if (this.c.isEmpty()) {
            return true;
        }
        Iterator<String> it2 = this.c.iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public void setResources(List<String> list) {
        this.c = list;
    }

    public void setTargetBucket(String str) {
        this.a = str;
    }

    public void setTargetEndpiont(String str) {
        this.b = str;
    }
}
