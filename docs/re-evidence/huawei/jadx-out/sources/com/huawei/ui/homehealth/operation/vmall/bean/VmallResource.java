package com.huawei.ui.homehealth.operation.vmall.bean;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import defpackage.sru;

/* JADX INFO: loaded from: classes17.dex */
public class VmallResource extends sru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mVmallUrl")
    private String f25667a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mVmallTitle")
    private String f25668c;

    @SerializedName("mIsNameVisibility")
    private boolean e;

    public VmallResource() {
    }

    public VmallResource(String str, boolean z, String str2) {
        this.f25668c = str;
        this.e = z;
        this.f25667a = str2;
    }

    public String c() {
        return this.f25668c;
    }

    public boolean a() {
        return this.e;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public String b() {
        return this.f25667a;
    }

    @Override // defpackage.sru
    public boolean d() {
        String str;
        return (this.f25668c == null || (str = this.f25667a) == null || !str.startsWith("http")) ? false : true;
    }

    public boolean e(VmallResource vmallResource) {
        return vmallResource != null && TextUtils.equals(this.f25667a, vmallResource.b()) && TextUtils.equals(this.f25668c, vmallResource.c()) && this.e == vmallResource.a();
    }
}
