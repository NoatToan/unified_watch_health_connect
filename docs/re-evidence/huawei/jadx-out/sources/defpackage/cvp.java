package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;

/* JADX INFO: loaded from: classes.dex */
public class cvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("examinationId")
    private int f31413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("recordName")
    private String f31414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("isUpdateHealthReport")
    private boolean f31415c;

    @SerializedName("examinationInstitution")
    private String d;

    @SerializedName("examinationDate")
    private long e;

    @SerializedName(JsbMapKeyNames.H5_USER_ID)
    private String g;

    @SerializedName("remarks")
    private String h;

    @SerializedName("reminderTime")
    private long j;

    public long e() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public String a() {
        return this.f31414b;
    }

    public long f() {
        return this.j;
    }

    public String d() {
        return this.h;
    }

    public int b() {
        return this.f31413a;
    }

    public String j() {
        return this.g;
    }

    public boolean g() {
        return this.f31415c;
    }
}
