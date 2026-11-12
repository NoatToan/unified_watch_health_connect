package com.huawei.hihealth;

import android.content.ContentValues;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public class HiRelationInformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mRelationType")
    private int f12004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mValueHolder")
    private ContentValues f12005c;

    @SerializedName("mRelationId")
    private int d;

    public int b() {
        return this.d;
    }

    public void a(int i) {
        this.d = i;
    }

    public int a() {
        return this.f12004b;
    }

    public void c(int i) {
        this.f12004b = i;
    }
}
