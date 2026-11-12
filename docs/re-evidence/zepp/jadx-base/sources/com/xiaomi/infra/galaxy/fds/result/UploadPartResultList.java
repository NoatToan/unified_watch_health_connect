package com.xiaomi.infra.galaxy.fds.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/* JADX INFO: loaded from: classes22.dex */
@XmlRootElement
public class UploadPartResultList {
    private List<UploadPartResult> a;

    public UploadPartResultList() {
        this.a = new ArrayList();
    }

    public void addUploadPartResult(UploadPartResult uploadPartResult) {
        this.a.add(uploadPartResult);
    }

    public List<UploadPartResult> getUploadPartResultList() {
        return this.a;
    }

    public void setUploadPartResultList(List<UploadPartResult> list) {
        this.a = list;
    }

    public UploadPartResultList(List<UploadPartResult> list) {
        this.a = new ArrayList();
        this.a = list;
    }
}
