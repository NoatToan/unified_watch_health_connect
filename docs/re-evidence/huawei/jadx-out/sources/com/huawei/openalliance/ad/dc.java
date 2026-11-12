package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes41.dex */
public abstract class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dc f18375a = null;

    public abstract boolean a();

    protected boolean b() {
        dc dcVar = this.f18375a;
        if (dcVar != null) {
            return dcVar.a();
        }
        return false;
    }

    public void a(dc dcVar) {
        this.f18375a = dcVar;
    }
}
