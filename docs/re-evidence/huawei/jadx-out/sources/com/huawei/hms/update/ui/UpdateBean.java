package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class UpdateBean implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16860c;
    private int d;
    private String e;
    private String f;
    private ArrayList g;
    private boolean h = true;

    private static <T> T a(T t) {
        return t;
    }

    public String getClientAppId() {
        return (String) a(this.e);
    }

    public String getClientAppName() {
        return (String) a(this.f);
    }

    public String getClientPackageName() {
        return (String) a(this.f16860c);
    }

    public int getClientVersionCode() {
        return ((Integer) a(Integer.valueOf(this.d))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f16859b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.g);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) a(Boolean.valueOf(this.f16858a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.h))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.e = str;
    }

    public void setClientAppName(String str) {
        this.f = str;
    }

    public void setClientPackageName(String str) {
        this.f16860c = str;
    }

    public void setClientVersionCode(int i) {
        this.d = i;
    }

    public void setHmsOrApkUpgrade(boolean z) {
        this.f16858a = z;
    }

    public void setNeedConfirm(boolean z) {
        this.h = z;
    }

    public void setResolutionInstallHMS(boolean z) {
        this.f16859b = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.g = arrayList;
    }
}
