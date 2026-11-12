package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class sny {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f48445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("resultCode")
    private String f48446c;

    @SerializedName("audioWorkoutList")
    private List<snk> d;

    public String e() {
        return this.f48446c;
    }

    public String b() {
        return this.f48445b;
    }

    public List<snk> a() {
        return this.d;
    }

    public String toString() {
        return "UserPlayRecordRsp{resultCode='" + this.f48446c + "', resultDesc='" + this.f48445b + "', audioWorkoutList=" + this.d + '}';
    }
}
