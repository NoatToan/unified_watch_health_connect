package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class ffk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("doctorDepartment")
    private String f33995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("doctorLevel")
    private String f33996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("doctorHeadIcon")
    private String f33997c;

    @SerializedName("doctorId")
    private String d;

    @SerializedName("doctorHospital")
    private String e;

    @SerializedName("doctorName")
    private String f;

    @SerializedName("resultDesc")
    private String h;

    @SerializedName("resultCode")
    private int i;

    public int f() {
        return this.i;
    }

    public String b() {
        return this.d;
    }

    public String e() {
        return this.f;
    }

    public String c() {
        return this.f33997c;
    }

    public String d() {
        return this.f33995a;
    }

    public String a() {
        return this.f33996b;
    }

    public String toString() {
        return "DoctorBasicInfoResponse{mResultCode=" + this.i + ", mResultDescription=" + this.h + ", mDoctorId=" + this.d + ", mDoctorName=" + this.f + ", mDoctorHeadIcon=" + this.f33997c + ", mDoctorDepartment=" + this.f33995a + ", mDoctorLevel=" + this.f33996b + ", mDoctorHospital=" + this.e + "}";
    }
}
