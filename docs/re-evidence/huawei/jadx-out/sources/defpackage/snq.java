package defpackage;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;

/* JADX INFO: loaded from: classes17.dex */
public class snq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("lectureId")
    private String f48432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("headPhoto")
    private String f48433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("label")
    private String f48434c;

    @SerializedName("name")
    private String d;

    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String e;

    @SerializedName("qualification")
    private String h;

    public String b() {
        return this.d;
    }

    public String d() {
        return this.f48434c;
    }

    public String toString() {
        return "LecturerDaoBean{lectureId='" + this.f48432a + "', name='" + this.d + "', headPhoto='" + this.f48433b + "', label='" + this.f48434c + "', desc='" + this.e + "', qualification='" + this.h + "'}";
    }
}
