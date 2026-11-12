package defpackage;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class snl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private long f48418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(SocialConstants.PARAM_APP_DESC)
    private String f48419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lecturerId")
    private String f48420c;

    @SerializedName("label")
    private String d;

    @SerializedName("headPhoto")
    private String e;

    @SerializedName("lecturerWorks")
    private List<snk> f;

    @SerializedName("qualification")
    private String g;

    @SerializedName("resultCode")
    private String h;

    @SerializedName("name")
    private String i;

    @SerializedName("resultDesc")
    private String j;

    public String b() {
        return this.h;
    }

    public String a() {
        return this.j;
    }

    public String e() {
        return this.i;
    }

    public String d() {
        return this.d;
    }

    public List<snk> c() {
        return this.f;
    }

    public String toString() {
        return "AudioWorkoutLecturerInfoRsp{resultCode='" + this.h + "', resultDesc='" + this.j + "', id=" + this.f48418a + ", lecturerId='" + this.f48420c + "', name='" + this.i + "', headPhoto='" + this.e + "', label='" + this.d + "', qualification='" + this.g + "', desc='" + this.f48419b + "', lecturerWorks=" + this.f + '}';
    }
}
