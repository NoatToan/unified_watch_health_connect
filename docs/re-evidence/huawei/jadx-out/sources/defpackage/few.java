package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class few {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("doctorHeadIcon")
    private String f33968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("doctorId")
    private String f33969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("doctorHospital")
    private String f33970c;

    @SerializedName("doctorDepartment")
    private String d;

    @SerializedName("doctorLevel")
    private String e;

    @SerializedName("doctorName")
    private String h;

    public String toString() {
        return "DoctorBasicInfoMap{mDoctorId=" + this.f33969b + ", mDoctorName=" + this.h + ", mDoctorHeadIcon=" + this.f33968a + ", mDoctorDepartment=" + this.d + ", mDoctorLevel=" + this.e + ", mDoctorHospital=" + this.f33970c + "}";
    }
}
