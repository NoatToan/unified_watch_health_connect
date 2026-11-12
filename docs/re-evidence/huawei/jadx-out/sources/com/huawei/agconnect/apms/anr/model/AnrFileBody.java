package com.huawei.agconnect.apms.anr.model;

import com.google.gson.Gson;
import com.huawei.agconnect.apms.collect.model.event.anr.AnrEvent;
import com.huawei.agconnect.apms.hgf;

/* JADX INFO: loaded from: classes22.dex */
public class AnrFileBody extends hgf {
    private AnrEvent anrInfo;

    public AnrFileBody(AnrInfo anrInfo) {
        this.anrInfo = new AnrEvent(anrInfo);
    }

    public AnrEvent getAnrInfo() {
        return this.anrInfo;
    }

    @Override // com.huawei.agconnect.apms.hgf
    public String toJsonString() {
        return new Gson().toJson(this);
    }
}
