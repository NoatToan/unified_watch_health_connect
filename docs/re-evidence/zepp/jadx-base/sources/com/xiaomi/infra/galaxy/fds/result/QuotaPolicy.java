package com.xiaomi.infra.galaxy.fds.result;

import com.xiaomi.infra.galaxy.fds.bean.Quota;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class QuotaPolicy {
    private List<Quota> a = new ArrayList();

    public void addQuota(Quota quota) {
        this.a.add(quota);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<Quota> list = this.a;
        List<Quota> list2 = ((QuotaPolicy) obj).a;
        return list == null ? list2 == null : list.equals(list2);
    }

    public List<Quota> getQuotas() {
        return this.a;
    }

    public int hashCode() {
        List<Quota> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public void setQuotas(List<Quota> list) {
        this.a = list;
    }
}
