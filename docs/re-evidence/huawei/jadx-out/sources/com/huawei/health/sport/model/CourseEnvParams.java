package com.huawei.health.sport.model;

import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import defpackage.gzf;

/* JADX INFO: loaded from: classes8.dex */
public class CourseEnvParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HeartZoneConf f8802a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f8803c = false;
    protected OnInitCompleteListener d;
    protected boolean e;
    protected gzf i;

    public interface OnInitCompleteListener {
        void onInitComplete();
    }

    public HeartZoneConf a() {
        return this.f8802a;
    }

    public gzf f() {
        return this.i;
    }

    public boolean j() {
        return this.f8803c;
    }

    public void b(OnInitCompleteListener onInitCompleteListener) {
        this.d = onInitCompleteListener;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public boolean g() {
        return this.e;
    }
}
