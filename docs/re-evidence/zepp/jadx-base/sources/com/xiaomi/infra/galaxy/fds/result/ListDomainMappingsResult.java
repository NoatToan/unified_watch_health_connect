package com.xiaomi.infra.galaxy.fds.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class ListDomainMappingsResult {
    private List<String> a = new ArrayList();

    public List<String> getDomainMappings() {
        return this.a;
    }

    public void setDomainMappings(List<String> list) {
        this.a = list;
    }
}
